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
 * Environmental Monitoring Service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: EnvironmentalMonitoring.proto")
public final class EnvironmentalMonitoringGrpc {

  private EnvironmentalMonitoringGrpc() {}

  public static final String SERVICE_NAME = "EnvironmentalMonitoring";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest,
      org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse> getMonitorEnvironmentalConditionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorEnvironmentalConditions",
      requestType = org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest.class,
      responseType = org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest,
      org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse> getMonitorEnvironmentalConditionsMethod() {
    io.grpc.MethodDescriptor<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest, org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse> getMonitorEnvironmentalConditionsMethod;
    if ((getMonitorEnvironmentalConditionsMethod = EnvironmentalMonitoringGrpc.getMonitorEnvironmentalConditionsMethod) == null) {
      synchronized (EnvironmentalMonitoringGrpc.class) {
        if ((getMonitorEnvironmentalConditionsMethod = EnvironmentalMonitoringGrpc.getMonitorEnvironmentalConditionsMethod) == null) {
          EnvironmentalMonitoringGrpc.getMonitorEnvironmentalConditionsMethod = getMonitorEnvironmentalConditionsMethod = 
              io.grpc.MethodDescriptor.<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest, org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EnvironmentalMonitoring", "MonitorEnvironmentalConditions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EnvironmentalMonitoringMethodDescriptorSupplier("MonitorEnvironmentalConditions"))
                  .build();
          }
        }
     }
     return getMonitorEnvironmentalConditionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest,
      org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition> getContinuousEnvironmentalMonitoringMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContinuousEnvironmentalMonitoring",
      requestType = org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest.class,
      responseType = org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest,
      org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition> getContinuousEnvironmentalMonitoringMethod() {
    io.grpc.MethodDescriptor<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest, org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition> getContinuousEnvironmentalMonitoringMethod;
    if ((getContinuousEnvironmentalMonitoringMethod = EnvironmentalMonitoringGrpc.getContinuousEnvironmentalMonitoringMethod) == null) {
      synchronized (EnvironmentalMonitoringGrpc.class) {
        if ((getContinuousEnvironmentalMonitoringMethod = EnvironmentalMonitoringGrpc.getContinuousEnvironmentalMonitoringMethod) == null) {
          EnvironmentalMonitoringGrpc.getContinuousEnvironmentalMonitoringMethod = getContinuousEnvironmentalMonitoringMethod = 
              io.grpc.MethodDescriptor.<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest, org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "EnvironmentalMonitoring", "ContinuousEnvironmentalMonitoring"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition.getDefaultInstance()))
                  .setSchemaDescriptor(new EnvironmentalMonitoringMethodDescriptorSupplier("ContinuousEnvironmentalMonitoring"))
                  .build();
          }
        }
     }
     return getContinuousEnvironmentalMonitoringMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition,
      org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse> getStreamEnvironmentalConditionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamEnvironmentalConditions",
      requestType = org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition.class,
      responseType = org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition,
      org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse> getStreamEnvironmentalConditionsMethod() {
    io.grpc.MethodDescriptor<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition, org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse> getStreamEnvironmentalConditionsMethod;
    if ((getStreamEnvironmentalConditionsMethod = EnvironmentalMonitoringGrpc.getStreamEnvironmentalConditionsMethod) == null) {
      synchronized (EnvironmentalMonitoringGrpc.class) {
        if ((getStreamEnvironmentalConditionsMethod = EnvironmentalMonitoringGrpc.getStreamEnvironmentalConditionsMethod) == null) {
          EnvironmentalMonitoringGrpc.getStreamEnvironmentalConditionsMethod = getStreamEnvironmentalConditionsMethod = 
              io.grpc.MethodDescriptor.<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition, org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "EnvironmentalMonitoring", "StreamEnvironmentalConditions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EnvironmentalMonitoringMethodDescriptorSupplier("StreamEnvironmentalConditions"))
                  .build();
          }
        }
     }
     return getStreamEnvironmentalConditionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest,
      org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition> getInteractiveEnvironmentalMonitoringMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InteractiveEnvironmentalMonitoring",
      requestType = org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest.class,
      responseType = org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest,
      org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition> getInteractiveEnvironmentalMonitoringMethod() {
    io.grpc.MethodDescriptor<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest, org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition> getInteractiveEnvironmentalMonitoringMethod;
    if ((getInteractiveEnvironmentalMonitoringMethod = EnvironmentalMonitoringGrpc.getInteractiveEnvironmentalMonitoringMethod) == null) {
      synchronized (EnvironmentalMonitoringGrpc.class) {
        if ((getInteractiveEnvironmentalMonitoringMethod = EnvironmentalMonitoringGrpc.getInteractiveEnvironmentalMonitoringMethod) == null) {
          EnvironmentalMonitoringGrpc.getInteractiveEnvironmentalMonitoringMethod = getInteractiveEnvironmentalMonitoringMethod = 
              io.grpc.MethodDescriptor.<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest, org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "EnvironmentalMonitoring", "InteractiveEnvironmentalMonitoring"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition.getDefaultInstance()))
                  .setSchemaDescriptor(new EnvironmentalMonitoringMethodDescriptorSupplier("InteractiveEnvironmentalMonitoring"))
                  .build();
          }
        }
     }
     return getInteractiveEnvironmentalMonitoringMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EnvironmentalMonitoringStub newStub(io.grpc.Channel channel) {
    return new EnvironmentalMonitoringStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EnvironmentalMonitoringBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EnvironmentalMonitoringBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EnvironmentalMonitoringFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EnvironmentalMonitoringFutureStub(channel);
  }

  /**
   * <pre>
   * Environmental Monitoring Service definition
   * </pre>
   */
  public static abstract class EnvironmentalMonitoringImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC method to monitor environmental conditions (Simple RPC)
     * </pre>
     */
    public void monitorEnvironmentalConditions(org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest request,
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMonitorEnvironmentalConditionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server-side Streaming RPC method to continuously monitor environmental conditions
     * </pre>
     */
    public void continuousEnvironmentalMonitoring(org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest request,
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition> responseObserver) {
      asyncUnimplementedUnaryCall(getContinuousEnvironmentalMonitoringMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client-side Streaming RPC method to send multiple environmental conditions for monitoring
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition> streamEnvironmentalConditions(
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamEnvironmentalConditionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming RPC method for interactive monitoring of environmental conditions
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest> interactiveEnvironmentalMonitoring(
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition> responseObserver) {
      return asyncUnimplementedStreamingCall(getInteractiveEnvironmentalMonitoringMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMonitorEnvironmentalConditionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest,
                org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse>(
                  this, METHODID_MONITOR_ENVIRONMENTAL_CONDITIONS)))
          .addMethod(
            getContinuousEnvironmentalMonitoringMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest,
                org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition>(
                  this, METHODID_CONTINUOUS_ENVIRONMENTAL_MONITORING)))
          .addMethod(
            getStreamEnvironmentalConditionsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition,
                org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse>(
                  this, METHODID_STREAM_ENVIRONMENTAL_CONDITIONS)))
          .addMethod(
            getInteractiveEnvironmentalMonitoringMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest,
                org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition>(
                  this, METHODID_INTERACTIVE_ENVIRONMENTAL_MONITORING)))
          .build();
    }
  }

  /**
   * <pre>
   * Environmental Monitoring Service definition
   * </pre>
   */
  public static final class EnvironmentalMonitoringStub extends io.grpc.stub.AbstractStub<EnvironmentalMonitoringStub> {
    private EnvironmentalMonitoringStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EnvironmentalMonitoringStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentalMonitoringStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EnvironmentalMonitoringStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to monitor environmental conditions (Simple RPC)
     * </pre>
     */
    public void monitorEnvironmentalConditions(org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest request,
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMonitorEnvironmentalConditionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server-side Streaming RPC method to continuously monitor environmental conditions
     * </pre>
     */
    public void continuousEnvironmentalMonitoring(org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest request,
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getContinuousEnvironmentalMonitoringMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client-side Streaming RPC method to send multiple environmental conditions for monitoring
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition> streamEnvironmentalConditions(
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getStreamEnvironmentalConditionsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming RPC method for interactive monitoring of environmental conditions
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest> interactiveEnvironmentalMonitoring(
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getInteractiveEnvironmentalMonitoringMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Environmental Monitoring Service definition
   * </pre>
   */
  public static final class EnvironmentalMonitoringBlockingStub extends io.grpc.stub.AbstractStub<EnvironmentalMonitoringBlockingStub> {
    private EnvironmentalMonitoringBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EnvironmentalMonitoringBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentalMonitoringBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EnvironmentalMonitoringBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to monitor environmental conditions (Simple RPC)
     * </pre>
     */
    public org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse monitorEnvironmentalConditions(org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMonitorEnvironmentalConditionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server-side Streaming RPC method to continuously monitor environmental conditions
     * </pre>
     */
    public java.util.Iterator<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition> continuousEnvironmentalMonitoring(
        org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getContinuousEnvironmentalMonitoringMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Environmental Monitoring Service definition
   * </pre>
   */
  public static final class EnvironmentalMonitoringFutureStub extends io.grpc.stub.AbstractStub<EnvironmentalMonitoringFutureStub> {
    private EnvironmentalMonitoringFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EnvironmentalMonitoringFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentalMonitoringFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EnvironmentalMonitoringFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to monitor environmental conditions (Simple RPC)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse> monitorEnvironmentalConditions(
        org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMonitorEnvironmentalConditionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MONITOR_ENVIRONMENTAL_CONDITIONS = 0;
  private static final int METHODID_CONTINUOUS_ENVIRONMENTAL_MONITORING = 1;
  private static final int METHODID_STREAM_ENVIRONMENTAL_CONDITIONS = 2;
  private static final int METHODID_INTERACTIVE_ENVIRONMENTAL_MONITORING = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EnvironmentalMonitoringImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EnvironmentalMonitoringImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MONITOR_ENVIRONMENTAL_CONDITIONS:
          serviceImpl.monitorEnvironmentalConditions((org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest) request,
              (io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse>) responseObserver);
          break;
        case METHODID_CONTINUOUS_ENVIRONMENTAL_MONITORING:
          serviceImpl.continuousEnvironmentalMonitoring((org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsRequest) request,
              (io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition>) responseObserver);
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
        case METHODID_STREAM_ENVIRONMENTAL_CONDITIONS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamEnvironmentalConditions(
              (io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalConditionsResponse>) responseObserver);
        case METHODID_INTERACTIVE_ENVIRONMENTAL_MONITORING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.interactiveEnvironmentalMonitoring(
              (io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.EnvironmentalCondition>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EnvironmentalMonitoringBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EnvironmentalMonitoringBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.ruojiefan.smartcities.EnvironmentalMonitoringOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EnvironmentalMonitoring");
    }
  }

  private static final class EnvironmentalMonitoringFileDescriptorSupplier
      extends EnvironmentalMonitoringBaseDescriptorSupplier {
    EnvironmentalMonitoringFileDescriptorSupplier() {}
  }

  private static final class EnvironmentalMonitoringMethodDescriptorSupplier
      extends EnvironmentalMonitoringBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EnvironmentalMonitoringMethodDescriptorSupplier(String methodName) {
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
      synchronized (EnvironmentalMonitoringGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EnvironmentalMonitoringFileDescriptorSupplier())
              .addMethod(getMonitorEnvironmentalConditionsMethod())
              .addMethod(getContinuousEnvironmentalMonitoringMethod())
              .addMethod(getStreamEnvironmentalConditionsMethod())
              .addMethod(getInteractiveEnvironmentalMonitoringMethod())
              .build();
        }
      }
    }
    return result;
  }
}
