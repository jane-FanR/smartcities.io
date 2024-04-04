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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: smartcities.proto")
public final class smartcitiesGrpc {

  private smartcitiesGrpc() {}

  public static final String SERVICE_NAME = "smartcities";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.ruojiefan.smartcities.Smartcities.TrafficRequest,
      org.ruojiefan.smartcities.Smartcities.TrafficResponse> getAutoTrafficMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "auto_traffic",
      requestType = org.ruojiefan.smartcities.Smartcities.TrafficRequest.class,
      responseType = org.ruojiefan.smartcities.Smartcities.TrafficResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.ruojiefan.smartcities.Smartcities.TrafficRequest,
      org.ruojiefan.smartcities.Smartcities.TrafficResponse> getAutoTrafficMethod() {
    io.grpc.MethodDescriptor<org.ruojiefan.smartcities.Smartcities.TrafficRequest, org.ruojiefan.smartcities.Smartcities.TrafficResponse> getAutoTrafficMethod;
    if ((getAutoTrafficMethod = smartcitiesGrpc.getAutoTrafficMethod) == null) {
      synchronized (smartcitiesGrpc.class) {
        if ((getAutoTrafficMethod = smartcitiesGrpc.getAutoTrafficMethod) == null) {
          smartcitiesGrpc.getAutoTrafficMethod = getAutoTrafficMethod = 
              io.grpc.MethodDescriptor.<org.ruojiefan.smartcities.Smartcities.TrafficRequest, org.ruojiefan.smartcities.Smartcities.TrafficResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartcities", "auto_traffic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.Smartcities.TrafficRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.Smartcities.TrafficResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new smartcitiesMethodDescriptorSupplier("auto_traffic"))
                  .build();
          }
        }
     }
     return getAutoTrafficMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.ruojiefan.smartcities.Smartcities.LightRequest,
      org.ruojiefan.smartcities.Smartcities.LightResponse> getLightingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "lighting",
      requestType = org.ruojiefan.smartcities.Smartcities.LightRequest.class,
      responseType = org.ruojiefan.smartcities.Smartcities.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.ruojiefan.smartcities.Smartcities.LightRequest,
      org.ruojiefan.smartcities.Smartcities.LightResponse> getLightingMethod() {
    io.grpc.MethodDescriptor<org.ruojiefan.smartcities.Smartcities.LightRequest, org.ruojiefan.smartcities.Smartcities.LightResponse> getLightingMethod;
    if ((getLightingMethod = smartcitiesGrpc.getLightingMethod) == null) {
      synchronized (smartcitiesGrpc.class) {
        if ((getLightingMethod = smartcitiesGrpc.getLightingMethod) == null) {
          smartcitiesGrpc.getLightingMethod = getLightingMethod = 
              io.grpc.MethodDescriptor.<org.ruojiefan.smartcities.Smartcities.LightRequest, org.ruojiefan.smartcities.Smartcities.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartcities", "lighting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.Smartcities.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ruojiefan.smartcities.Smartcities.LightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new smartcitiesMethodDescriptorSupplier("lighting"))
                  .build();
          }
        }
     }
     return getLightingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static smartcitiesStub newStub(io.grpc.Channel channel) {
    return new smartcitiesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static smartcitiesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new smartcitiesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static smartcitiesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new smartcitiesFutureStub(channel);
  }

  /**
   */
  public static abstract class smartcitiesImplBase implements io.grpc.BindableService {

    /**
     */
    public void autoTraffic(org.ruojiefan.smartcities.Smartcities.TrafficRequest request,
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.Smartcities.TrafficResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAutoTrafficMethod(), responseObserver);
    }

    /**
     */
    public void lighting(org.ruojiefan.smartcities.Smartcities.LightRequest request,
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.Smartcities.LightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLightingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAutoTrafficMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.ruojiefan.smartcities.Smartcities.TrafficRequest,
                org.ruojiefan.smartcities.Smartcities.TrafficResponse>(
                  this, METHODID_AUTO_TRAFFIC)))
          .addMethod(
            getLightingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.ruojiefan.smartcities.Smartcities.LightRequest,
                org.ruojiefan.smartcities.Smartcities.LightResponse>(
                  this, METHODID_LIGHTING)))
          .build();
    }
  }

  /**
   */
  public static final class smartcitiesStub extends io.grpc.stub.AbstractStub<smartcitiesStub> {
    private smartcitiesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartcitiesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartcitiesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartcitiesStub(channel, callOptions);
    }

    /**
     */
    public void autoTraffic(org.ruojiefan.smartcities.Smartcities.TrafficRequest request,
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.Smartcities.TrafficResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAutoTrafficMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lighting(org.ruojiefan.smartcities.Smartcities.LightRequest request,
        io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.Smartcities.LightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLightingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class smartcitiesBlockingStub extends io.grpc.stub.AbstractStub<smartcitiesBlockingStub> {
    private smartcitiesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartcitiesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartcitiesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartcitiesBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.ruojiefan.smartcities.Smartcities.TrafficResponse autoTraffic(org.ruojiefan.smartcities.Smartcities.TrafficRequest request) {
      return blockingUnaryCall(
          getChannel(), getAutoTrafficMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.ruojiefan.smartcities.Smartcities.LightResponse lighting(org.ruojiefan.smartcities.Smartcities.LightRequest request) {
      return blockingUnaryCall(
          getChannel(), getLightingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class smartcitiesFutureStub extends io.grpc.stub.AbstractStub<smartcitiesFutureStub> {
    private smartcitiesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartcitiesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartcitiesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartcitiesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.ruojiefan.smartcities.Smartcities.TrafficResponse> autoTraffic(
        org.ruojiefan.smartcities.Smartcities.TrafficRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAutoTrafficMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.ruojiefan.smartcities.Smartcities.LightResponse> lighting(
        org.ruojiefan.smartcities.Smartcities.LightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLightingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTO_TRAFFIC = 0;
  private static final int METHODID_LIGHTING = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final smartcitiesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(smartcitiesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTO_TRAFFIC:
          serviceImpl.autoTraffic((org.ruojiefan.smartcities.Smartcities.TrafficRequest) request,
              (io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.Smartcities.TrafficResponse>) responseObserver);
          break;
        case METHODID_LIGHTING:
          serviceImpl.lighting((org.ruojiefan.smartcities.Smartcities.LightRequest) request,
              (io.grpc.stub.StreamObserver<org.ruojiefan.smartcities.Smartcities.LightResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class smartcitiesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    smartcitiesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.ruojiefan.smartcities.Smartcities.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("smartcities");
    }
  }

  private static final class smartcitiesFileDescriptorSupplier
      extends smartcitiesBaseDescriptorSupplier {
    smartcitiesFileDescriptorSupplier() {}
  }

  private static final class smartcitiesMethodDescriptorSupplier
      extends smartcitiesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    smartcitiesMethodDescriptorSupplier(String methodName) {
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
      synchronized (smartcitiesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new smartcitiesFileDescriptorSupplier())
              .addMethod(getAutoTrafficMethod())
              .addMethod(getLightingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
