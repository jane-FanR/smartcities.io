import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.ruojiefan.smartcities.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EnvironmentalMonitoringService extends EnvironmentalMonitoringGrpc.EnvironmentalMonitoringImplBase {

    @Override
    public void monitorEnvironmentalConditions(EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest request, StreamObserver<EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse> responseObserver) {
        // Implement Simple RPC to monitor environmental conditions
        // Dummy implementation: returning static data
        List<EnvironmentalMonitoringOuterClass.EnvironmentalCondition> conditionList = new ArrayList<>();
        conditionList.add(
                EnvironmentalMonitoringOuterClass.EnvironmentalCondition.newBuilder()
                        .setTimestamp("2024-04-21 12:00:00")
                        .setType("Temperature")
                        .setValue(25.5f)
                        .build()
        );
        conditionList.add(
                EnvironmentalMonitoringOuterClass.EnvironmentalCondition.newBuilder()
                        .setTimestamp("2024-04-21 12:15:00")
                        .setType("Humidity")
                        .setValue(60.0f)
                        .build()
        );

        EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse response = EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse.newBuilder()
                .addAllConditionData(conditionList)
                .setStatus("OK")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void continuousEnvironmentalMonitoring(EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest request, StreamObserver<EnvironmentalMonitoringOuterClass.EnvironmentalCondition> responseObserver) {
        // Implement Server-side Streaming RPC for continuous monitoring of environmental conditions
        // Dummy implementation: sending static data every second
        float temperature = 25.5f;
        float humidity = 60.0f;

        while (true) {
            EnvironmentalMonitoringOuterClass.EnvironmentalCondition condition1 = EnvironmentalMonitoringOuterClass.EnvironmentalCondition.newBuilder()
                    .setTimestamp("2024-04-21 12:00:00")
                    .setType("Temperature")
                    .setValue(temperature)
                    .build();

            EnvironmentalMonitoringOuterClass.EnvironmentalCondition condition2 = EnvironmentalMonitoringOuterClass.EnvironmentalCondition.newBuilder()
                    .setTimestamp("2024-04-21 12:00:00")
                    .setType("Humidity")
                    .setValue(humidity)
                    .build();

            responseObserver.onNext(condition1);
            responseObserver.onNext(condition2);

            temperature += 0.1f; // Increment temperature
            humidity -= 0.2f;    // Decrement humidity

            try {
                Thread.sleep(1000); // Simulate data streaming every second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public StreamObserver<EnvironmentalMonitoringOuterClass.EnvironmentalCondition> streamEnvironmentalConditions(StreamObserver<EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse> responseObserver) {
        // Implement Client-side Streaming RPC to receive multiple environmental conditions for monitoring
        return new StreamObserver<EnvironmentalMonitoringOuterClass.EnvironmentalCondition>() {
            List<EnvironmentalMonitoringOuterClass.EnvironmentalCondition> conditionList = new ArrayList<>();

            @Override
            public void onNext(EnvironmentalMonitoringOuterClass.EnvironmentalCondition condition) {
                conditionList.add(condition);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in receiving environmental conditions: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse response = EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse.newBuilder()
                        .addAllConditionData(conditionList)
                        .setStatus("OK")
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest> interactiveEnvironmentalMonitoring(StreamObserver<EnvironmentalMonitoringOuterClass.EnvironmentalCondition> responseObserver) {
        // Implement Bidirectional Streaming RPC for interactive monitoring of environmental conditions
        return new StreamObserver<EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest>() {
            @Override
            public void onNext(EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest request) {
                // Dummy implementation: send static data as response
                EnvironmentalMonitoringOuterClass.EnvironmentalCondition condition1 = EnvironmentalMonitoringOuterClass.EnvironmentalCondition.newBuilder()
                        .setTimestamp("2024-04-21 12:00:00")
                        .setType("Temperature")
                        .setValue(25.5f)
                        .build();
                EnvironmentalMonitoringOuterClass.EnvironmentalCondition condition2 = EnvironmentalMonitoringOuterClass.EnvironmentalCondition.newBuilder()
                        .setTimestamp("2024-04-21 12:00:00")
                        .setType("Humidity")
                        .setValue(60.0f)
                        .build();

                responseObserver.onNext(condition1);
                responseObserver.onNext(condition2);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in interactive environmental monitoring: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        EnvironmentalMonitoringService environmentalMonitoringService = new EnvironmentalMonitoringService();
        Server server = ServerBuilder.forPort(50053).addService(environmentalMonitoringService).build();
        server.start();
        System.out.println("Environmental Monitoring Service started");
        server.awaitTermination();
    }
}
