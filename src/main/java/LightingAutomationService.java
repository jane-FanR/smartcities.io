import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.ruojiefan.smartcities.LightingAutomationOuterClass;
import org.ruojiefan.smartcities.LightingAutomationGrpc;


import java.io.IOException;

public class LightingAutomationService extends LightingAutomationGrpc.LightingAutomationImplBase {


    public void adjustLightIntensity(LightingAutomationOuterClass.LightIntensityAdjustmentRequest request, StreamObserver<LightingAutomationOuterClass.LightIntensityAdjustmentResponse> responseObserver) {
        // Implement Simple RPC to adjust light intensity
        // Implementation: returning static response
        LightingAutomationOuterClass.LightIntensityAdjustmentResponse response = LightingAutomationOuterClass.LightIntensityAdjustmentResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Light intensity adjusted successfully")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    public void continuousAdjustment(LightingAutomationOuterClass.ContinuousAdjustmentRequest request, StreamObserver<LightingAutomationOuterClass.LightIntensityAdjustmentResponse> responseObserver) {
        // Implement Server-side Streaming RPC for continuous adjustment of light intensity
        // Implementation: sending static data periodically
        float currentIntensity = request.getInitialIntensityPercentage();
        while (currentIntensity <= 100) {
            LightingAutomationOuterClass.LightIntensityAdjustmentResponse response = LightingAutomationOuterClass.LightIntensityAdjustmentResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("Light intensity adjusted to: " + currentIntensity)
                    .build();

            responseObserver.onNext(response);
            currentIntensity += 10; // Increment intensity
            try {
                Thread.sleep(1000); // Simulate adjustment delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        responseObserver.onCompleted();
    }


    public StreamObserver<LightingAutomationOuterClass.LightIntensityAdjustmentRequest> streamAdjustments(StreamObserver<LightingAutomationOuterClass.LightIntensityAdjustmentResponse> responseObserver) {
        // Implement Client-side Streaming RPC to receive and respond to multiple light intensity adjustments
        return new StreamObserver<LightingAutomationOuterClass.LightIntensityAdjustmentRequest>() {
            boolean adjustmentsReceived = false;

            @Override
            public void onNext(LightingAutomationOuterClass.LightIntensityAdjustmentRequest request) {
                // Process each request
                System.out.println("Received light intensity adjustment request: " + request);
                adjustmentsReceived = true; // Set flag to indicate adjustments received
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in receiving light intensity adjustments: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                // Respond with a single response indicating the success of the adjustments
                if (adjustmentsReceived) {
                    LightingAutomationOuterClass.LightIntensityAdjustmentResponse response = LightingAutomationOuterClass.LightIntensityAdjustmentResponse.newBuilder()
                            .setSuccess(true)
                            .setMessage("Light intensity adjustments completed successfully")
                            .build();
                    responseObserver.onNext(response);
                } else {
                    System.err.println("No adjustments received.");
                }
                responseObserver.onCompleted();
            }
        };
    }

    public StreamObserver<LightingAutomationOuterClass.InteractiveAdjustmentRequest> interactiveAdjustment(StreamObserver<LightingAutomationOuterClass.InteractiveAdjustmentResponse> responseObserver) {
        // Implement Bidirectional Streaming RPC for interactive adjustment of light intensity
        return new StreamObserver<LightingAutomationOuterClass.InteractiveAdjustmentRequest>() {
            @Override
            public void onNext(LightingAutomationOuterClass.InteractiveAdjustmentRequest request) {
                // Process each request and send back a response
                System.out.println("Received interactive adjustment request: " + request);
                // Response
                LightingAutomationOuterClass.InteractiveAdjustmentResponse response = LightingAutomationOuterClass.InteractiveAdjustmentResponse.newBuilder()
                        .setSuccess(true)
                        .setMessage("Interactive adjustment successful")
                        .build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in interactive light intensity adjustment: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }


    public static void main(String[] args) throws IOException, InterruptedException {
        LightingAutomationService lightingAutomationService = new LightingAutomationService();
        Server server = ServerBuilder.forPort(50052).addService(lightingAutomationService).build();
        server.start();
        System.out.println("Lighting Automation Service started");
        server.awaitTermination();
    }

}
