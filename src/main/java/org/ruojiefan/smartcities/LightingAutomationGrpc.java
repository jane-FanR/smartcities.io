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
 * Lighting Service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: LightingAutomation.proto")
public final class LightingAutomationGrpc {

  private LightingAutomationGrpc() {}

  public static final String SERVICE_NAME = "LightingAutomation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest,
      org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse> getAdjustLightIntensityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdjustLightIntensity",
      requestType = org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest.class,
      responseType = org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest,
      org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse> getAdjustLightIntensityMethod() {
    io.grpc.MethodDescriptor<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest, org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse> getAdjustLightIntensityMethod;
    if ((getAdjustLightIntensityMethod = LightingAutomationGrpc.getAdjustLightIntensityMethod) == null) {
      synchronized (LightingAutomationGrpc.class) {
        if ((getAdjustLightIntensityMethod = LightingAutomationGrpc.getAdjustLightIntensityMethod) == null) {
          LightingAutomationGrpc.getAdjustLightIntensityMethod = getAdjustLightIntensityMethod = 
              io.grpc.MethodDescriptor.<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest, org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LightingAutomation", "AdjustLightIntensity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightingAutomationMethodDescriptorSupplier("AdjustLightIntensity"))
                  .build();
          }
        }
     }
     return getAdjustLightIntensityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.ruojiefan.smartcities.LightingAutomationOuterClass.ContinuousAdjustmentRequest,
      org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse> getContinuousAdjustmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContinuousAdjustment",
      requestType = org.ruojiefan.smartcities.LightingAutomationOuterClass.ContinuousAdjustmentRequest.class,
      responseType = org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.ruojiefan.smartcities.LightingAutomationOuterClass.ContinuousAdjustmentRequest,
      org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse> getContinuousAdjustmentMethod() {
    io.grpc.MethodDescriptor<org.ruojiefan.smartcities.LightingAutomationOuterClass.ContinuousAdjustmentRequest, org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse> getContinuousAdjustmentMethod;
    if ((getContinuousAdjustmentMethod = LightingAutomationGrpc.getContinuousAdjustmentMethod) == null) {
      synchronized (LightingAutomationGrpc.class) {
        if ((getContinuousAdjustmentMethod = LightingAutomationGrpc.getContinuousAdjustmentMethod) == null) {
          LightingAutomationGrpc.getContinuousAdjustmentMethod = getContinuousAdjustmentMethod = 
              io.grpc.MethodDescriptor.<org.ruojiefan.smartcities.LightingAutomationOuterClass.ContinuousAdjustmentRequest, org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "LightingAutomation", "ContinuousAdjustment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.LightingAutomationOuterClass.ContinuousAdjustmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightingAutomationMethodDescriptorSupplier("ContinuousAdjustment"))
                  .build();
          }
        }
     }
     return getContinuousAdjustmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest,
      org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse> getStreamAdjustmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamAdjustments",
      requestType = org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest.class,
      responseType = org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest,
      org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse> getStreamAdjustmentsMethod() {
    io.grpc.MethodDescriptor<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest, org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse> getStreamAdjustmentsMethod;
    if ((getStreamAdjustmentsMethod = LightingAutomationGrpc.getStreamAdjustmentsMethod) == null) {
      synchronized (LightingAutomationGrpc.class) {
        if ((getStreamAdjustmentsMethod = LightingAutomationGrpc.getStreamAdjustmentsMethod) == null) {
          LightingAutomationGrpc.getStreamAdjustmentsMethod = getStreamAdjustmentsMethod = 
              io.grpc.MethodDescriptor.<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest, org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "LightingAutomation", "StreamAdjustments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightingAutomationMethodDescriptorSupplier("StreamAdjustments"))
                  .build();
          }
        }
     }
     return getStreamAdjustmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.ruojiefan.smartcities.LightingAutomationOuterClass.InteractiveAdjustmentRequest,
      org.ruojiefan.smartcities.LightingAutomationOuterClass.InteractiveAdjustmentResponse> getInteractiveAdjustmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InteractiveAdjustment",
      requestType = org.ruojiefan.smartcities.LightingAutomationOuterClass.InteractiveAdjustmentRequest.class,
      responseType = org.ruojiefan.smartcities.LightingAutomationOuterClass.InteractiveAdjustmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.ruojiefan.smartcities.LightingAutomationOuterClass.InteractiveAdjustmentRequest,
      org.ruojiefan.smartcities.LightingAutomationOuterClass.InteractiveAdjustmentResponse> getInteractiveAdjustmentMethod() {
    io.grpc.MethodDescriptor<org.ruojiefan.smartcities.LightingAutomationOuterClass.InteractiveAdjustmentRequest, org.ruojiefan.smartcities.LightingAutomationOuterClass.InteractiveAdjustmentResponse> getInteractiveAdjustmentMethod;
    if ((getInteractiveAdjustmentMethod = LightingAutomationGrpc.getInteractiveAdjustmentMethod) == null) {
      synchronized (LightingAutomationGrpc.class) {
        if ((getInteractiveAdjustmentMethod = LightingAutomationGrpc.getInteractiveAdjustmentMethod) == null) {
          LightingAutomationGrpc.getInteractiveAdjustmentMethod = getInteractiveAdjustmentMethod = 
              io.grpc.MethodDescriptor.<org.ruojiefan.smartcities.LightingAutomationOuterClass.InteractiveAdjustmentRequest, org.ruojiefan.smartcities.LightingAutomationOuterClass.InteractiveAdjustmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "LightingAutomation", "InteractiveAdjustment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.LightingAutomationOuterClass.InteractiveAdjustmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.LightingAutomationOuterClass.InteractiveAdjustmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightingAutomationMethodDescriptorSupplier("InteractiveAdjustment"))
                  .build();
          }
        }
     }
     return getInteractiveAdjustmentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LightingAutomationStub newStub(io.grpc.Channel channel) {
    return new LightingAutomationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LightingAutomationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LightingAutomationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LightingAutomationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LightingAutomationFutureStub(channel);
  }

  /**
   * <pre>
   * Lighting Service definition
   * </pre>
   */
  public static abstract class LightingAutomationImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Simple RPC method to adjust light intensity
     * </pre>
     */
    public void adjustLightIntensity(org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest request,
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAdjustLightIntensityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server-side Streaming RPC method to continuously adjust light intensity
     * </pre>
     */
    public void continuousAdjustment(org.ruojiefan.smartcities.LightingAutomationOuterClass.ContinuousAdjustmentRequest request,
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getContinuousAdjustmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client-side Streaming RPC method to send multiple light intensity adjustments
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest> streamAdjustments(
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamAdjustmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming RPC method for interactive adjustment of light intensity
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.LightingAutomationOuterClass.InteractiveAdjustmentRequest> interactiveAdjustment(
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.LightingAutomationOuterClass.InteractiveAdjustmentResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getInteractiveAdjustmentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAdjustLightIntensityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest,
                org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse>(
                  this, METHODID_ADJUST_LIGHT_INTENSITY)))
          .addMethod(
            getContinuousAdjustmentMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.ruojiefan.smartcities.LightingAutomationOuterClass.ContinuousAdjustmentRequest,
                org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse>(
                  this, METHODID_CONTINUOUS_ADJUSTMENT)))
          .addMethod(
            getStreamAdjustmentsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest,
                org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse>(
                  this, METHODID_STREAM_ADJUSTMENTS)))
          .addMethod(
            getInteractiveAdjustmentMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.ruojiefan.smartcities.LightingAutomationOuterClass.InteractiveAdjustmentRequest,
                org.ruojiefan.smartcities.LightingAutomationOuterClass.InteractiveAdjustmentResponse>(
                  this, METHODID_INTERACTIVE_ADJUSTMENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Lighting Service definition
   * </pre>
   */
  public static final class LightingAutomationStub extends io.grpc.stub.AbstractStub<LightingAutomationStub> {
    private LightingAutomationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightingAutomationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightingAutomationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightingAutomationStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC method to adjust light intensity
     * </pre>
     */
    public void adjustLightIntensity(org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest request,
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAdjustLightIntensityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server-side Streaming RPC method to continuously adjust light intensity
     * </pre>
     */
    public void continuousAdjustment(org.ruojiefan.smartcities.LightingAutomationOuterClass.ContinuousAdjustmentRequest request,
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getContinuousAdjustmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client-side Streaming RPC method to send multiple light intensity adjustments
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest> streamAdjustments(
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getStreamAdjustmentsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming RPC method for interactive adjustment of light intensity
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.LightingAutomationOuterClass.InteractiveAdjustmentRequest> interactiveAdjustment(
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.LightingAutomationOuterClass.InteractiveAdjustmentResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getInteractiveAdjustmentMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Lighting Service definition
   * </pre>
   */
  public static final class LightingAutomationBlockingStub extends io.grpc.stub.AbstractStub<LightingAutomationBlockingStub> {
    private LightingAutomationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightingAutomationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightingAutomationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightingAutomationBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC method to adjust light intensity
     * </pre>
     */
    public org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse adjustLightIntensity(org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getAdjustLightIntensityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server-side Streaming RPC method to continuously adjust light intensity
     * </pre>
     */
    public java.util.Iterator<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse> continuousAdjustment(
        org.ruojiefan.smartcities.LightingAutomationOuterClass.ContinuousAdjustmentRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getContinuousAdjustmentMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Lighting Service definition
   * </pre>
   */
  public static final class LightingAutomationFutureStub extends io.grpc.stub.AbstractStub<LightingAutomationFutureStub> {
    private LightingAutomationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightingAutomationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightingAutomationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightingAutomationFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC method to adjust light intensity
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse> adjustLightIntensity(
        org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAdjustLightIntensityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADJUST_LIGHT_INTENSITY = 0;
  private static final int METHODID_CONTINUOUS_ADJUSTMENT = 1;
  private static final int METHODID_STREAM_ADJUSTMENTS = 2;
  private static final int METHODID_INTERACTIVE_ADJUSTMENT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LightingAutomationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LightingAutomationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADJUST_LIGHT_INTENSITY:
          serviceImpl.adjustLightIntensity((org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentRequest) request,
              (io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse>) responseObserver);
          break;
        case METHODID_CONTINUOUS_ADJUSTMENT:
          serviceImpl.continuousAdjustment((org.ruojiefan.smartcities.LightingAutomationOuterClass.ContinuousAdjustmentRequest) request,
              (io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse>) responseObserver);
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
        case METHODID_STREAM_ADJUSTMENTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamAdjustments(
              (io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.LightingAutomationOuterClass.LightIntensityAdjustmentResponse>) responseObserver);
        case METHODID_INTERACTIVE_ADJUSTMENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.interactiveAdjustment(
              (io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.LightingAutomationOuterClass.InteractiveAdjustmentResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LightingAutomationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LightingAutomationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.ruojiefan.smartcities.LightingAutomationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LightingAutomation");
    }
  }

  private static final class LightingAutomationFileDescriptorSupplier
      extends LightingAutomationBaseDescriptorSupplier {
    LightingAutomationFileDescriptorSupplier() {}
  }

  private static final class LightingAutomationMethodDescriptorSupplier
      extends LightingAutomationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LightingAutomationMethodDescriptorSupplier(String methodName) {
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
      synchronized (LightingAutomationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LightingAutomationFileDescriptorSupplier())
              .addMethod(getAdjustLightIntensityMethod())
              .addMethod(getContinuousAdjustmentMethod())
              .addMethod(getStreamAdjustmentsMethod())
              .addMethod(getInteractiveAdjustmentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
