package org.ruojiefan.smartcities;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Traffic Management Service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: TrafficManagement.proto")
public final class TrafficManagementGrpc {

  private TrafficManagementGrpc() {}

  public static final String SERVICE_NAME = "TrafficManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowRequest,
      org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowResponse> getMonitorTrafficFlowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorTrafficFlow",
      requestType = org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowRequest.class,
      responseType = org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowRequest,
      org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowResponse> getMonitorTrafficFlowMethod() {
    io.grpc.MethodDescriptor<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowRequest, org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowResponse> getMonitorTrafficFlowMethod;
    if ((getMonitorTrafficFlowMethod = TrafficManagementGrpc.getMonitorTrafficFlowMethod) == null) {
      synchronized (TrafficManagementGrpc.class) {
        if ((getMonitorTrafficFlowMethod = TrafficManagementGrpc.getMonitorTrafficFlowMethod) == null) {
          TrafficManagementGrpc.getMonitorTrafficFlowMethod = getMonitorTrafficFlowMethod = 
              io.grpc.MethodDescriptor.<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowRequest, org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TrafficManagement", "MonitorTrafficFlow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TrafficManagementMethodDescriptorSupplier("MonitorTrafficFlow"))
                  .build();
          }
        }
     }
     return getMonitorTrafficFlowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlRequest,
      org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlResponse> getControlTrafficSignalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ControlTrafficSignals",
      requestType = org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlRequest.class,
      responseType = org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlRequest,
      org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlResponse> getControlTrafficSignalsMethod() {
    io.grpc.MethodDescriptor<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlRequest, org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlResponse> getControlTrafficSignalsMethod;
    if ((getControlTrafficSignalsMethod = TrafficManagementGrpc.getControlTrafficSignalsMethod) == null) {
      synchronized (TrafficManagementGrpc.class) {
        if ((getControlTrafficSignalsMethod = TrafficManagementGrpc.getControlTrafficSignalsMethod) == null) {
          TrafficManagementGrpc.getControlTrafficSignalsMethod = getControlTrafficSignalsMethod = 
              io.grpc.MethodDescriptor.<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlRequest, org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TrafficManagement", "ControlTrafficSignals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TrafficManagementMethodDescriptorSupplier("ControlTrafficSignals"))
                  .build();
          }
        }
     }
     return getControlTrafficSignalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationRequest,
      org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationResponse> getOptimizeTrafficRoutesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OptimizeTrafficRoutes",
      requestType = org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationRequest.class,
      responseType = org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationRequest,
      org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationResponse> getOptimizeTrafficRoutesMethod() {
    io.grpc.MethodDescriptor<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationRequest, org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationResponse> getOptimizeTrafficRoutesMethod;
    if ((getOptimizeTrafficRoutesMethod = TrafficManagementGrpc.getOptimizeTrafficRoutesMethod) == null) {
      synchronized (TrafficManagementGrpc.class) {
        if ((getOptimizeTrafficRoutesMethod = TrafficManagementGrpc.getOptimizeTrafficRoutesMethod) == null) {
          TrafficManagementGrpc.getOptimizeTrafficRoutesMethod = getOptimizeTrafficRoutesMethod = 
              io.grpc.MethodDescriptor.<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationRequest, org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TrafficManagement", "OptimizeTrafficRoutes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TrafficManagementMethodDescriptorSupplier("OptimizeTrafficRoutes"))
                  .build();
          }
        }
     }
     return getOptimizeTrafficRoutesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficPattern,
      org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficPatternUpdateResponse> getUpdateTrafficPatternsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTrafficPatterns",
      requestType = org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficPattern.class,
      responseType = org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficPatternUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficPattern,
      org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficPatternUpdateResponse> getUpdateTrafficPatternsMethod() {
    io.grpc.MethodDescriptor<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficPattern, org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficPatternUpdateResponse> getUpdateTrafficPatternsMethod;
    if ((getUpdateTrafficPatternsMethod = TrafficManagementGrpc.getUpdateTrafficPatternsMethod) == null) {
      synchronized (TrafficManagementGrpc.class) {
        if ((getUpdateTrafficPatternsMethod = TrafficManagementGrpc.getUpdateTrafficPatternsMethod) == null) {
          TrafficManagementGrpc.getUpdateTrafficPatternsMethod = getUpdateTrafficPatternsMethod = 
              io.grpc.MethodDescriptor.<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficPattern, org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficPatternUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "TrafficManagement", "UpdateTrafficPatterns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficPattern.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficPatternUpdateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TrafficManagementMethodDescriptorSupplier("UpdateTrafficPatterns"))
                  .build();
          }
        }
     }
     return getUpdateTrafficPatternsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.ruojiefan.smartcities.TrafficManagementOuterClass.RealTimeTrafficUpdate,
      org.ruojiefan.smartcities.TrafficManagementOuterClass.RealTimeTrafficUpdate> getRealTimeTrafficUpdatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RealTimeTrafficUpdates",
      requestType = org.ruojiefan.smartcities.TrafficManagementOuterClass.RealTimeTrafficUpdate.class,
      responseType = org.ruojiefan.smartcities.TrafficManagementOuterClass.RealTimeTrafficUpdate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.ruojiefan.smartcities.TrafficManagementOuterClass.RealTimeTrafficUpdate,
      org.ruojiefan.smartcities.TrafficManagementOuterClass.RealTimeTrafficUpdate> getRealTimeTrafficUpdatesMethod() {
    io.grpc.MethodDescriptor<org.ruojiefan.smartcities.TrafficManagementOuterClass.RealTimeTrafficUpdate, org.ruojiefan.smartcities.TrafficManagementOuterClass.RealTimeTrafficUpdate> getRealTimeTrafficUpdatesMethod;
    if ((getRealTimeTrafficUpdatesMethod = TrafficManagementGrpc.getRealTimeTrafficUpdatesMethod) == null) {
      synchronized (TrafficManagementGrpc.class) {
        if ((getRealTimeTrafficUpdatesMethod = TrafficManagementGrpc.getRealTimeTrafficUpdatesMethod) == null) {
          TrafficManagementGrpc.getRealTimeTrafficUpdatesMethod = getRealTimeTrafficUpdatesMethod = 
              io.grpc.MethodDescriptor.<org.ruojiefan.smartcities.TrafficManagementOuterClass.RealTimeTrafficUpdate, org.ruojiefan.smartcities.TrafficManagementOuterClass.RealTimeTrafficUpdate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "TrafficManagement", "RealTimeTrafficUpdates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.TrafficManagementOuterClass.RealTimeTrafficUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.TrafficManagementOuterClass.RealTimeTrafficUpdate.getDefaultInstance()))
                  .setSchemaDescriptor(new TrafficManagementMethodDescriptorSupplier("RealTimeTrafficUpdates"))
                  .build();
          }
        }
     }
     return getRealTimeTrafficUpdatesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrafficManagementStub newStub(io.grpc.Channel channel) {
    return new TrafficManagementStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrafficManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TrafficManagementBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrafficManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TrafficManagementFutureStub(channel);
  }

  /**
   * <pre>
   * Traffic Management Service definition
   * </pre>
   */
  public static abstract class TrafficManagementImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC method to monitor traffic flow
     * </pre>
     */
    public void monitorTrafficFlow(org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowRequest request,
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMonitorTrafficFlowMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC method to control traffic signals
     * </pre>
     */
    public void controlTrafficSignals(org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlRequest request,
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getControlTrafficSignalsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC method to optimize traffic routes
     * </pre>
     */
    public void optimizeTrafficRoutes(org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationRequest request,
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOptimizeTrafficRoutesMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC method for updating traffic patterns (Client-side Streaming)
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficPattern> updateTrafficPatterns(
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficPatternUpdateResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getUpdateTrafficPatternsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC method for real-time traffic updates (Bidirectional Streaming)
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.TrafficManagementOuterClass.RealTimeTrafficUpdate> realTimeTrafficUpdates(
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.TrafficManagementOuterClass.RealTimeTrafficUpdate> responseObserver) {
      return asyncUnimplementedStreamingCall(getRealTimeTrafficUpdatesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMonitorTrafficFlowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowRequest,
                org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowResponse>(
                  this, METHODID_MONITOR_TRAFFIC_FLOW)))
          .addMethod(
            getControlTrafficSignalsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlRequest,
                org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlResponse>(
                  this, METHODID_CONTROL_TRAFFIC_SIGNALS)))
          .addMethod(
            getOptimizeTrafficRoutesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationRequest,
                org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationResponse>(
                  this, METHODID_OPTIMIZE_TRAFFIC_ROUTES)))
          .addMethod(
            getUpdateTrafficPatternsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficPattern,
                org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficPatternUpdateResponse>(
                  this, METHODID_UPDATE_TRAFFIC_PATTERNS)))
          .addMethod(
            getRealTimeTrafficUpdatesMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.ruojiefan.smartcities.TrafficManagementOuterClass.RealTimeTrafficUpdate,
                org.ruojiefan.smartcities.TrafficManagementOuterClass.RealTimeTrafficUpdate>(
                  this, METHODID_REAL_TIME_TRAFFIC_UPDATES)))
          .build();
    }
  }

  /**
   * <pre>
   * Traffic Management Service definition
   * </pre>
   */
  public static final class TrafficManagementStub extends io.grpc.stub.AbstractStub<TrafficManagementStub> {
    private TrafficManagementStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrafficManagementStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrafficManagementStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrafficManagementStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to monitor traffic flow
     * </pre>
     */
    public void monitorTrafficFlow(org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowRequest request,
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMonitorTrafficFlowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC method to control traffic signals
     * </pre>
     */
    public void controlTrafficSignals(org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlRequest request,
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getControlTrafficSignalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC method to optimize traffic routes
     * </pre>
     */
    public void optimizeTrafficRoutes(org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationRequest request,
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOptimizeTrafficRoutesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC method for updating traffic patterns (Client-side Streaming)
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficPattern> updateTrafficPatterns(
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficPatternUpdateResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getUpdateTrafficPatternsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * RPC method for real-time traffic updates (Bidirectional Streaming)
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.TrafficManagementOuterClass.RealTimeTrafficUpdate> realTimeTrafficUpdates(
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.TrafficManagementOuterClass.RealTimeTrafficUpdate> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getRealTimeTrafficUpdatesMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Traffic Management Service definition
   * </pre>
   */
  public static final class TrafficManagementBlockingStub extends io.grpc.stub.AbstractStub<TrafficManagementBlockingStub> {
    private TrafficManagementBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrafficManagementBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrafficManagementBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrafficManagementBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to monitor traffic flow
     * </pre>
     */
    public org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowResponse monitorTrafficFlow(org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowRequest request) {
      return blockingUnaryCall(
          getChannel(), getMonitorTrafficFlowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC method to control traffic signals
     * </pre>
     */
    public org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlResponse controlTrafficSignals(org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlRequest request) {
      return blockingUnaryCall(
          getChannel(), getControlTrafficSignalsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC method to optimize traffic routes
     * </pre>
     */
    public org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationResponse optimizeTrafficRoutes(org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationRequest request) {
      return blockingUnaryCall(
          getChannel(), getOptimizeTrafficRoutesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Traffic Management Service definition
   * </pre>
   */
  public static final class TrafficManagementFutureStub extends io.grpc.stub.AbstractStub<TrafficManagementFutureStub> {
    private TrafficManagementFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrafficManagementFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrafficManagementFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrafficManagementFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to monitor traffic flow
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowResponse> monitorTrafficFlow(
        org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMonitorTrafficFlowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC method to control traffic signals
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlResponse> controlTrafficSignals(
        org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getControlTrafficSignalsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC method to optimize traffic routes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationResponse> optimizeTrafficRoutes(
        org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOptimizeTrafficRoutesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MONITOR_TRAFFIC_FLOW = 0;
  private static final int METHODID_CONTROL_TRAFFIC_SIGNALS = 1;
  private static final int METHODID_OPTIMIZE_TRAFFIC_ROUTES = 2;
  private static final int METHODID_UPDATE_TRAFFIC_PATTERNS = 3;
  private static final int METHODID_REAL_TIME_TRAFFIC_UPDATES = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrafficManagementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrafficManagementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MONITOR_TRAFFIC_FLOW:
          serviceImpl.monitorTrafficFlow((org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowRequest) request,
              (io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficFlowResponse>) responseObserver);
          break;
        case METHODID_CONTROL_TRAFFIC_SIGNALS:
          serviceImpl.controlTrafficSignals((org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlRequest) request,
              (io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficSignalControlResponse>) responseObserver);
          break;
        case METHODID_OPTIMIZE_TRAFFIC_ROUTES:
          serviceImpl.optimizeTrafficRoutes((org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationRequest) request,
              (io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficRouteOptimizationResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_TRAFFIC_PATTERNS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.updateTrafficPatterns(
              (io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.TrafficManagementOuterClass.TrafficPatternUpdateResponse>) responseObserver);
        case METHODID_REAL_TIME_TRAFFIC_UPDATES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.realTimeTrafficUpdates(
              (io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.TrafficManagementOuterClass.RealTimeTrafficUpdate>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TrafficManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrafficManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.ruojiefan.smartcities.TrafficManagementOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrafficManagement");
    }
  }

  private static final class TrafficManagementFileDescriptorSupplier
      extends TrafficManagementBaseDescriptorSupplier {
    TrafficManagementFileDescriptorSupplier() {}
  }

  private static final class TrafficManagementMethodDescriptorSupplier
      extends TrafficManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrafficManagementMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TrafficManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrafficManagementFileDescriptorSupplier())
              .addMethod(getMonitorTrafficFlowMethod())
              .addMethod(getControlTrafficSignalsMethod())
              .addMethod(getOptimizeTrafficRoutesMethod())
              .addMethod(getUpdateTrafficPatternsMethod())
              .addMethod(getRealTimeTrafficUpdatesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
