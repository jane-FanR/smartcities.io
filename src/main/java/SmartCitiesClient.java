import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.ruojiefan.smartcities.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SmartCitiesClient {

    private final ManagedChannel trafficChannel;
    private final ManagedChannel lightingChannel;
    private final ManagedChannel environmentalChannel;
    private final TrafficManagementGrpc.TrafficManagementStub trafficManagementStub;
    private final LightingAutomationGrpc.LightingAutomationStub lightingAutomationStub;
    private final EnvironmentalMonitoringGrpc.EnvironmentalMonitoringStub environmentalMonitoringStub;

    //Traffic Management
    public SmartCitiesClient(String host, int trafficPort, int lightingPort, int environmentalPort) {
        this.trafficChannel = ManagedChannelBuilder.forAddress(host, trafficPort)
                .usePlaintext()
                .build();
        this.trafficManagementStub = TrafficManagementGrpc.newStub(trafficChannel);

        this.lightingChannel = ManagedChannelBuilder.forAddress(host, lightingPort)
                .usePlaintext()
                .build();
        this.lightingAutomationStub = LightingAutomationGrpc.newStub(lightingChannel);

        this.environmentalChannel = ManagedChannelBuilder.forAddress(host, environmentalPort)
                .usePlaintext()
                .build();
        this.environmentalMonitoringStub = EnvironmentalMonitoringGrpc.newStub(environmentalChannel);
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
                System.err.println("Error in monitoring traffic flow: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Monitoring traffic flow completed");
            }
        });
    }

    public void controlTrafficSignals(String signalId, int newTiming) {
        TrafficManagementOuterClass.TrafficSignalControlRequest request = TrafficManagementOuterClass.TrafficSignalControlRequest.newBuilder()
                .setSignalId(signalId)
                .setNewTiming(newTiming)
                .build();

        trafficManagementStub.controlTrafficSignals(request, new StreamObserver<TrafficManagementOuterClass.TrafficSignalControlResponse>() {
            @Override
            public void onNext(TrafficManagementOuterClass.TrafficSignalControlResponse response) {
                System.out.println("Received traffic signal control response: " + response);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in controlling traffic signals: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Control traffic signals completed");
            }
        });
    }


    public void optimizeTrafficRoutes(String origin, String destination) {
        TrafficManagementOuterClass.TrafficRouteOptimizationRequest request = TrafficManagementOuterClass.TrafficRouteOptimizationRequest.newBuilder()
                .setOrigin(origin)
                .setDestination(destination)
                .build();

        trafficManagementStub.optimizeTrafficRoutes(request, new StreamObserver<TrafficManagementOuterClass.TrafficRouteOptimizationResponse>() {
            @Override
            public void onNext(TrafficManagementOuterClass.TrafficRouteOptimizationResponse response) {
                System.out.println("Received traffic route optimization response: " + response);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in optimizing traffic routes: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Optimize traffic routes completed");
            }
        });
    }
    

    //Lighting
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
                System.err.println("Error in adjusting light intensity: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Adjusting light intensity completed");
            }
        });
    }

    public void continuousAdjustment(float initialIntensityPercentage) {
        LightingAutomationOuterClass.ContinuousAdjustmentRequest request = LightingAutomationOuterClass.ContinuousAdjustmentRequest.newBuilder()
                .setInitialIntensityPercentage(initialIntensityPercentage)
                .build();

        lightingAutomationStub.continuousAdjustment(request, new StreamObserver<LightingAutomationOuterClass.LightIntensityAdjustmentResponse>() {
            @Override
            public void onNext(LightingAutomationOuterClass.LightIntensityAdjustmentResponse response) {
                System.out.println("Received continuous light intensity adjustment response: " + response);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in continuous light intensity adjustment: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Continuous light intensity adjustment completed");
            }
        });
    }


    public void streamAdjustments(List<Float> intensityPercentages) {
        StreamObserver<LightingAutomationOuterClass.LightIntensityAdjustmentRequest> requestStreamObserver = lightingAutomationStub.streamAdjustments(new StreamObserver<LightingAutomationOuterClass.LightIntensityAdjustmentResponse>() {
            @Override
            public void onNext(LightingAutomationOuterClass.LightIntensityAdjustmentResponse response) {
                System.out.println("Received light intensity adjustment response: " + response);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in streaming light intensity adjustments: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Streaming light intensity adjustments completed");
            }
        });

        for (Float intensityPercentage : intensityPercentages) {
            requestStreamObserver.onNext(LightingAutomationOuterClass.LightIntensityAdjustmentRequest.newBuilder()
                    .setIntensityPercentage(intensityPercentage)
                    .build());
        }

        requestStreamObserver.onCompleted();
    }

    public void interactiveAdjustment(List<Float> intensityPercentages) {
        StreamObserver<LightingAutomationOuterClass.InteractiveAdjustmentRequest> requestStreamObserver = lightingAutomationStub.interactiveAdjustment(new StreamObserver<LightingAutomationOuterClass.InteractiveAdjustmentResponse>() {
            @Override
            public void onNext(LightingAutomationOuterClass.InteractiveAdjustmentResponse response) {
                System.out.println("Received interactive light intensity adjustment response: " + response);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in interactive light intensity adjustment: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Interactive light intensity adjustment completed");
            }
        });

        for (Float intensityPercentage : intensityPercentages) {
            requestStreamObserver.onNext(LightingAutomationOuterClass.InteractiveAdjustmentRequest.newBuilder()
                    .setIntensityPercentage(intensityPercentage)
                    .build());
        }

        requestStreamObserver.onCompleted();
    }


    //Environment
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
                System.err.println("Error in monitoring environmental conditions: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Monitoring environmental conditions completed");
            }
        });
    }

    public void continuousEnvironmentalMonitoring(String location) {
        EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest request = EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest.newBuilder()
                .setLocation(location)
                .build();

        environmentalMonitoringStub.continuousEnvironmentalMonitoring(request, new StreamObserver<EnvironmentalMonitoringOuterClass.EnvironmentalCondition>() {
            @Override
            public void onNext(EnvironmentalMonitoringOuterClass.EnvironmentalCondition condition) {
                System.out.println("Received environmental condition: " + condition);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in continuous environmental monitoring: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Continuous environmental monitoring completed");
            }
        });
    }

    public void streamEnvironmentalConditions(List<EnvironmentalMonitoringOuterClass.EnvironmentalCondition> conditions) {
        StreamObserver<EnvironmentalMonitoringOuterClass.EnvironmentalCondition> requestStreamObserver = environmentalMonitoringStub.streamEnvironmentalConditions(new StreamObserver<EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse>() {
            @Override
            public void onNext(EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse response) {
                System.out.println("Received environmental conditions response: " + response);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in streaming environmental conditions: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Streaming environmental conditions completed");
            }
        });

        for (EnvironmentalMonitoringOuterClass.EnvironmentalCondition condition : conditions) {
            requestStreamObserver.onNext(condition);
        }

        requestStreamObserver.onCompleted();
    }

    public void interactiveEnvironmentalMonitoring(String location) {
        StreamObserver<EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest> requestStreamObserver = environmentalMonitoringStub.interactiveEnvironmentalMonitoring(new StreamObserver<EnvironmentalMonitoringOuterClass.EnvironmentalCondition>() {
            @Override
            public void onNext(EnvironmentalMonitoringOuterClass.EnvironmentalCondition condition) {
                System.out.println("Received environmental condition: " + condition);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in interactive environmental monitoring: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Interactive environmental monitoring completed");
            }
        });

        requestStreamObserver.onNext(EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest.newBuilder()
                .setLocation(location)
                .build());

        requestStreamObserver.onCompleted();
    }




    public static void main(String[] args) {
        SmartCitiesClient smartCitiesClient = new SmartCitiesClient("localhost", 50051, 50052, 50053);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Smart Cities Client Menu:");
            System.out.println("1. Monitor Traffic Flow");
            System.out.println("2. Control Traffic Signals");
            System.out.println("3. Optimize Traffic Routes");
            System.out.println("4. Adjust Light Intensity");
            System.out.println("5. Continuous Adjustment of Light Intensity");
            System.out.println("6. Stream Light Intensity Adjustments");
            System.out.println("7. Interactive Light Intensity Adjustment");
            System.out.println("8. Monitor Environmental Conditions");
            System.out.println("9. Continuous Environmental Monitoring");
            System.out.println("10. Stream Environmental Conditions");
            System.out.println("11. Interactive Environmental Monitoring");
            System.out.println("12. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter location: ");
                    String location = scanner.nextLine();
                    System.out.print("Enter start time: ");
                    String startTime = scanner.nextLine();
                    System.out.print("Enter end time: ");
                    String endTime = scanner.nextLine();
                    smartCitiesClient.monitorTrafficFlow(location, startTime, endTime);
                    break;
                case 2:
                    System.out.print("Enter signal ID: ");
                    String signalId = scanner.nextLine();
                    System.out.print("Enter new timing: ");
                    int newTiming = scanner.nextInt();
                    smartCitiesClient.controlTrafficSignals(signalId, newTiming);
                    break;
                case 3:
                    System.out.print("Enter origin: ");
                    String origin = scanner.nextLine();
                    System.out.print("Enter destination: ");
                    String destination = scanner.nextLine();
                    smartCitiesClient.optimizeTrafficRoutes(origin, destination);
                    break;
                case 4:
                    System.out.print("Enter light intensity percentage: ");
                    float intensityPercentage = scanner.nextFloat();
                    smartCitiesClient.adjustLightIntensity(intensityPercentage);
                    break;
                case 5:
                    System.out.print("Enter initial intensity percentage: ");
                    float initialIntensityPercentage = scanner.nextFloat();
                    smartCitiesClient.continuousAdjustment(initialIntensityPercentage);
                    break;
                case 6:
                    System.out.print("Enter number of intensity percentages to stream: ");
                    int count = scanner.nextInt();
                    List<Float> intensityPercentages = new ArrayList<>();
                    for (int i = 0; i < count; i++) {
                        System.out.print("Enter intensity percentage " + (i + 1) + ": ");
                        intensityPercentages.add(scanner.nextFloat());
                    }
                    smartCitiesClient.streamAdjustments(intensityPercentages);
                    break;
                case 7:
                    System.out.print("Enter number of intensity percentages for interactive adjustment: ");
                    int interactiveCount = scanner.nextInt();
                    List<Float> interactiveIntensities = new ArrayList<>();
                    for (int i = 0; i < interactiveCount; i++) {
                        System.out.print("Enter intensity percentage " + (i + 1) + ": ");
                        interactiveIntensities.add(scanner.nextFloat());
                    }
                    smartCitiesClient.interactiveAdjustment(interactiveIntensities);
                    break;
                case 8:
                    System.out.print("Enter location to monitor environmental conditions: ");
                    String environmentalLocation = scanner.nextLine();
                    smartCitiesClient.monitorEnvironmentalConditions(environmentalLocation);
                    break;
                case 9:
                    System.out.print("Enter location for continuous environmental monitoring: ");
                    String continuousEnvironmentalLocation = scanner.nextLine();
                    smartCitiesClient.continuousEnvironmentalMonitoring(continuousEnvironmentalLocation);
                    break;
                case 10:
                    System.out.print("Enter number of environmental conditions to stream: ");
                    int environmentalCount = scanner.nextInt();
                    List<EnvironmentalMonitoringOuterClass.EnvironmentalCondition> environmentalConditions = new ArrayList<>();
                    scanner.nextLine(); // Consume newline
                    for (int i = 0; i < environmentalCount; i++) {
                        System.out.print("Enter timestamp for condition " + (i + 1) + ": ");
                        String timestamp = scanner.nextLine();
                        System.out.print("Enter type for condition " + (i + 1) + ": ");
                        String type = scanner.nextLine();
                        System.out.print("Enter value for condition " + (i + 1) + ": ");
                        float value = scanner.nextFloat();
                        scanner.nextLine(); // Consume newline
                        EnvironmentalMonitoringOuterClass.EnvironmentalCondition condition = EnvironmentalMonitoringOuterClass.EnvironmentalCondition.newBuilder()
                                .setTimestamp(timestamp)
                                .setType(type)
                                .setValue(value)
                                .build();
                        environmentalConditions.add(condition);
                    }
                    smartCitiesClient.streamEnvironmentalConditions(environmentalConditions);
                    break;
                case 11:
                    System.out.print("Enter location for interactive environmental monitoring: ");
                    String interactiveEnvironmentalLocation = scanner.nextLine();
                    smartCitiesClient.interactiveEnvironmentalMonitoring(interactiveEnvironmentalLocation);
                    break;
                case 12:
                    smartCitiesClient.shutdown();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 12.");
                    break;
            }
        }
    }
    
    public void shutdown() {
        trafficChannel.shutdown();
        lightingChannel.shutdown();
        environmentalChannel.shutdown();

    }
}
