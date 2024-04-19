import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.ruojiefan.smartcities.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TrafficManagementService extends TrafficManagementGrpc.TrafficManagementImplBase {
    //Server-side streaming RPC
    @Override
    public void monitorTrafficFlow(TrafficManagementOuterClass.TrafficFlowRequest request, StreamObserver<TrafficManagementOuterClass.TrafficFlowResponse> responseObserver) {
        // Implement server-side streaming RPC for monitoring traffic flow
        List<TrafficManagementOuterClass.TrafficFlowData> flowDataList = new ArrayList<>();
        // Simulated traffic flow data
        TrafficManagementOuterClass.TrafficFlowData trafficFlowData1 = TrafficManagementOuterClass.TrafficFlowData.newBuilder()
                .setTimestamp("2024-04-21 12:00:00")
                .setVehicleCount(100)
                .setAverageSpeed(50.0f)
                .build();
        TrafficManagementOuterClass.TrafficFlowData trafficFlowData2 = TrafficManagementOuterClass.TrafficFlowData.newBuilder()
                .setTimestamp("2024-04-21 12:15:00")
                .setVehicleCount(120)
                .setAverageSpeed(55.0f)
                .build();
        flowDataList.add(trafficFlowData1);
        flowDataList.add(trafficFlowData2);

        TrafficManagementOuterClass.TrafficFlowResponse.Builder responseBuilder = TrafficManagementOuterClass.TrafficFlowResponse.newBuilder();
        for (TrafficManagementOuterClass.TrafficFlowData trafficFlowData : flowDataList) {
            responseBuilder.addFlowData(trafficFlowData);
        }
        responseBuilder.setStatus("OK");

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    //Simple RPC
    @Override
    public void controlTrafficSignals(TrafficManagementOuterClass.TrafficSignalControlRequest request, StreamObserver<TrafficManagementOuterClass.TrafficSignalControlResponse> responseObserver) {
        // Implement server-side logic for controlling traffic signals
        TrafficManagementOuterClass.TrafficSignalControlResponse response = TrafficManagementOuterClass.TrafficSignalControlResponse.newBuilder()
                .setStatus("OK")
                .setMessage("Traffic signals controlled successfully")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    //Simple RPC
    @Override
    public void optimizeTrafficRoutes(TrafficManagementOuterClass.TrafficRouteOptimizationRequest request, StreamObserver<TrafficManagementOuterClass.TrafficRouteOptimizationResponse> responseObserver) {
        // Implement server-side logic for optimizing traffic routes
        List<TrafficManagementOuterClass.RouteOptimizationData> routesList = new ArrayList<>();
        // Simulated route optimization data
        TrafficManagementOuterClass.RouteOptimizationData routeOptimizationData = TrafficManagementOuterClass.RouteOptimizationData.newBuilder()
                .setOrigin(request.getOrigin())
                .setDestination(request.getDestination())
                .addPath("Waypoint1")
                .addPath("Waypoint2")
                .setEstimatedTravelTime("45 minutes")
                .build();
        routesList.add(routeOptimizationData);

        TrafficManagementOuterClass.TrafficRouteOptimizationResponse response = TrafficManagementOuterClass.TrafficRouteOptimizationResponse.newBuilder()
                .addAllRoutes(routesList)
                .setStatus("OK")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    //Client-side streaming RPC
    @Override
    public StreamObserver<TrafficManagementOuterClass.TrafficPattern> updateTrafficPatterns(StreamObserver<TrafficManagementOuterClass.TrafficPatternUpdateResponse> responseObserver) {
        // Implement client-side streaming RPC for updating traffic patterns
        return new StreamObserver<TrafficManagementOuterClass.TrafficPattern>() {
            @Override
            public void onNext(TrafficManagementOuterClass.TrafficPattern trafficPattern) {
                // Process the received traffic pattern
                System.out.println("Received traffic pattern: " + trafficPattern);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in receiving traffic patterns: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                // Respond with a single response indicating the success of the update
                TrafficManagementOuterClass.TrafficPatternUpdateResponse response = TrafficManagementOuterClass.TrafficPatternUpdateResponse.newBuilder()
                        .setStatus("OK")
                        .setMessage("Traffic patterns updated successfully")
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }

    //Bidirectional streaming RPC
    @Override
    public StreamObserver<TrafficManagementOuterClass.RealTimeTrafficUpdate> realTimeTrafficUpdates(StreamObserver<TrafficManagementOuterClass.RealTimeTrafficUpdate> responseObserver) {
        // Implement bidirectional streaming RPC for real-time traffic updates
        return new StreamObserver<TrafficManagementOuterClass.RealTimeTrafficUpdate>() {
            @Override
            public void onNext(TrafficManagementOuterClass.RealTimeTrafficUpdate realTimeTrafficUpdate) {
                // Process the received real-time traffic update
                System.out.println("Received real-time traffic update: " + realTimeTrafficUpdate);

                // Send a response back to the client
                TrafficManagementOuterClass.RealTimeTrafficUpdate response = TrafficManagementOuterClass.RealTimeTrafficUpdate.newBuilder()
                        .setUpdateId("id")
                        .setUpdateDescription("description")
                        .setStatus("OK")
                        .setMessage("Received real-time traffic update")
                        .build();

                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in receiving real-time traffic updates: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                // Handle completion if needed
            }
        };
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        TrafficManagementService trafficManagementService = new TrafficManagementService();
        Server server = ServerBuilder.forPort(50051).addService(trafficManagementService).build();
        server.start();
        System.out.println("Traffic Management Service started");
        server.awaitTermination();
    }
}
