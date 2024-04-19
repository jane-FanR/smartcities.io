import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import org.ruojiefan.smartcities.*;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SmartCitiesClient {

    private static final Logger logger = Logger.getLogger(SmartCitiesClient.class.getName());

    private final ManagedChannel channel;
    private final TrafficManagementGrpc.TrafficManagementStub trafficManagementStub;
    private final LightingAutomationGrpc.LightingAutomationStub lightingAutomationStub;
    private final EnvironmentalMonitoringGrpc.EnvironmentalMonitoringStub environmentalMonitoringStub;

    public SmartCitiesClient(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        this.trafficManagementStub = TrafficManagementGrpc.newStub(channel);
        this.lightingAutomationStub = LightingAutomationGrpc.newStub(channel);
        this.environmentalMonitoringStub = EnvironmentalMonitoringGrpc.newStub(channel);
    }

    public void monitorTrafficFlow(String location, String startTime, String endTime) {
        TrafficManagementOuterClass.TrafficFlowRequest request = TrafficManagementOuterClass.TrafficFlowRequest.newBuilder()
                .setLocation(location)
                .setStartTime(startTime)
                .setEndTime(endTime)
                .build();

        trafficManagementStub.monitorTrafficFlow(request, new StreamObserver<TrafficManagementOuterClass.TrafficFlowResponse>() {
            @Override
            public void onNext(TrafficManagementOuterClass.TrafficFlowResponse response) {
                System.out.println("Received traffic flow response: " + response);
            }

            @Override
            public void onError(Throwable t) {
                logger.log(Level.SEVERE, "Error in monitoring traffic flow: " + t.getMessage(), t);
            }

            @Override
            public void onCompleted() {
                System.out.println("Traffic flow monitoring completed");
            }
        });
    }

    public void adjustLightIntensity(float intensityPercentage) {
        LightingAutomationOuterClass.LightIntensityAdjustmentRequest request = LightingAutomationOuterClass.LightIntensityAdjustmentRequest.newBuilder()
                .setIntensityPercentage(intensityPercentage)
                .build();

        lightingAutomationStub.adjustLightIntensity(request, new StreamObserver<LightingAutomationOuterClass.LightIntensityAdjustmentResponse>() {
            @Override
            public void onNext(LightingAutomationOuterClass.LightIntensityAdjustmentResponse response) {
                System.out.println("Received light intensity adjustment response: " + response);
            }

            @Override
            public void onError(Throwable t) {
                logger.log(Level.SEVERE, "Error in adjusting light intensity: " + t.getMessage(), t);
            }

            @Override
            public void onCompleted() {
                System.out.println("Light intensity adjustment completed");
            }
        });
    }

    public void monitorEnvironmentalConditions(String location) {
        EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest request = EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest.newBuilder()
                .setLocation(location)
                .build();

        environmentalMonitoringStub.monitorEnvironmentalConditions(request, new StreamObserver<EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse>() {
            @Override
            public void onNext(EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse response) {
                System.out.println("Received environmental conditions response: " + response);
            }

            @Override
            public void onError(Throwable t) {
                logger.log(Level.SEVERE, "Error in monitoring environmental conditions: " + t.getMessage(), t);
            }

            @Override
            public void onCompleted() {
                System.out.println("Environmental conditions monitoring completed");
            }
        });
    }

    public static void main(String[] args) {
        SmartCitiesClient client = new SmartCitiesClient("localhost", 50051);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Monitor Traffic Flow");
            System.out.println("2. Adjust Light Intensity");
            System.out.println("3. Monitor Environmental Conditions");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter location: ");
                    String location = scanner.nextLine();
                    System.out.print("Enter start time: ");
                    String startTime = scanner.nextLine();
                    System.out.print("Enter end time: ");
                    String endTime = scanner.nextLine();
                    client.monitorTrafficFlow(location, startTime, endTime);
                    break;
                case 2:
                    System.out.print("Enter intensity percentage: ");
                    float intensity = scanner.nextFloat();
                    client.adjustLightIntensity(intensity);
                    break;
                case 3:
                    System.out.print("Enter location: ");
                    location = scanner.nextLine();
                    client.monitorEnvironmentalConditions(location);
                    break;
                case 4:
                    client.shutdown();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void shutdown() {
        try {
            channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            logger.log(Level.SEVERE, "Error while shutting down client: " + e.getMessage(), e);
            Thread.currentThread().interrupt();
        }
    }
}
