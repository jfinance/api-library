package com.jfinance.proto.example.v1;

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
 * HelloService is the hello service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.28.1)",
    comments = "Source: example/v1/style.proto")
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final String SERVICE_NAME = "jfinance.proto.example.v1.HelloService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jfinance.proto.example.v1.SendFooRequest,
      com.jfinance.proto.example.v1.SendFooResponse> getSendFooMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendFoo",
      requestType = com.jfinance.proto.example.v1.SendFooRequest.class,
      responseType = com.jfinance.proto.example.v1.SendFooResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jfinance.proto.example.v1.SendFooRequest,
      com.jfinance.proto.example.v1.SendFooResponse> getSendFooMethod() {
    io.grpc.MethodDescriptor<com.jfinance.proto.example.v1.SendFooRequest, com.jfinance.proto.example.v1.SendFooResponse> getSendFooMethod;
    if ((getSendFooMethod = HelloServiceGrpc.getSendFooMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getSendFooMethod = HelloServiceGrpc.getSendFooMethod) == null) {
          HelloServiceGrpc.getSendFooMethod = getSendFooMethod =
              io.grpc.MethodDescriptor.<com.jfinance.proto.example.v1.SendFooRequest, com.jfinance.proto.example.v1.SendFooResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendFoo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jfinance.proto.example.v1.SendFooRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jfinance.proto.example.v1.SendFooResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("SendFoo"))
              .build();
        }
      }
    }
    return getSendFooMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jfinance.proto.example.v1.GetPlanetRequest,
      com.jfinance.proto.example.v1.GetPlanetResponse> getGetPlanetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlanet",
      requestType = com.jfinance.proto.example.v1.GetPlanetRequest.class,
      responseType = com.jfinance.proto.example.v1.GetPlanetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jfinance.proto.example.v1.GetPlanetRequest,
      com.jfinance.proto.example.v1.GetPlanetResponse> getGetPlanetMethod() {
    io.grpc.MethodDescriptor<com.jfinance.proto.example.v1.GetPlanetRequest, com.jfinance.proto.example.v1.GetPlanetResponse> getGetPlanetMethod;
    if ((getGetPlanetMethod = HelloServiceGrpc.getGetPlanetMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getGetPlanetMethod = HelloServiceGrpc.getGetPlanetMethod) == null) {
          HelloServiceGrpc.getGetPlanetMethod = getGetPlanetMethod =
              io.grpc.MethodDescriptor.<com.jfinance.proto.example.v1.GetPlanetRequest, com.jfinance.proto.example.v1.GetPlanetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlanet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jfinance.proto.example.v1.GetPlanetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jfinance.proto.example.v1.GetPlanetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("GetPlanet"))
              .build();
        }
      }
    }
    return getGetPlanetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jfinance.proto.example.v1.StreamGalaxiesRequest,
      com.jfinance.proto.example.v1.StreamGalaxiesResponse> getStreamGalaxiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamGalaxies",
      requestType = com.jfinance.proto.example.v1.StreamGalaxiesRequest.class,
      responseType = com.jfinance.proto.example.v1.StreamGalaxiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jfinance.proto.example.v1.StreamGalaxiesRequest,
      com.jfinance.proto.example.v1.StreamGalaxiesResponse> getStreamGalaxiesMethod() {
    io.grpc.MethodDescriptor<com.jfinance.proto.example.v1.StreamGalaxiesRequest, com.jfinance.proto.example.v1.StreamGalaxiesResponse> getStreamGalaxiesMethod;
    if ((getStreamGalaxiesMethod = HelloServiceGrpc.getStreamGalaxiesMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getStreamGalaxiesMethod = HelloServiceGrpc.getStreamGalaxiesMethod) == null) {
          HelloServiceGrpc.getStreamGalaxiesMethod = getStreamGalaxiesMethod =
              io.grpc.MethodDescriptor.<com.jfinance.proto.example.v1.StreamGalaxiesRequest, com.jfinance.proto.example.v1.StreamGalaxiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamGalaxies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jfinance.proto.example.v1.StreamGalaxiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jfinance.proto.example.v1.StreamGalaxiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("StreamGalaxies"))
              .build();
        }
      }
    }
    return getStreamGalaxiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jfinance.proto.example.v1.StreamQuasarsRequest,
      com.jfinance.proto.example.v1.StreamQuasarsResponse> getStreamQuasarsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamQuasars",
      requestType = com.jfinance.proto.example.v1.StreamQuasarsRequest.class,
      responseType = com.jfinance.proto.example.v1.StreamQuasarsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.jfinance.proto.example.v1.StreamQuasarsRequest,
      com.jfinance.proto.example.v1.StreamQuasarsResponse> getStreamQuasarsMethod() {
    io.grpc.MethodDescriptor<com.jfinance.proto.example.v1.StreamQuasarsRequest, com.jfinance.proto.example.v1.StreamQuasarsResponse> getStreamQuasarsMethod;
    if ((getStreamQuasarsMethod = HelloServiceGrpc.getStreamQuasarsMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getStreamQuasarsMethod = HelloServiceGrpc.getStreamQuasarsMethod) == null) {
          HelloServiceGrpc.getStreamQuasarsMethod = getStreamQuasarsMethod =
              io.grpc.MethodDescriptor.<com.jfinance.proto.example.v1.StreamQuasarsRequest, com.jfinance.proto.example.v1.StreamQuasarsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamQuasars"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jfinance.proto.example.v1.StreamQuasarsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jfinance.proto.example.v1.StreamQuasarsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("StreamQuasars"))
              .build();
        }
      }
    }
    return getStreamQuasarsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub>() {
        @java.lang.Override
        public HelloServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceStub(channel, callOptions);
        }
      };
    return HelloServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub>() {
        @java.lang.Override
        public HelloServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceBlockingStub(channel, callOptions);
        }
      };
    return HelloServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub>() {
        @java.lang.Override
        public HelloServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceFutureStub(channel, callOptions);
        }
      };
    return HelloServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * HelloService is the hello service.
   * </pre>
   */
  public static abstract class HelloServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * SendFoo sends a foo.
     * </pre>
     */
    public void sendFoo(com.jfinance.proto.example.v1.SendFooRequest request,
        io.grpc.stub.StreamObserver<com.jfinance.proto.example.v1.SendFooResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendFooMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPlanet gets a planet.
     * </pre>
     */
    public void getPlanet(com.jfinance.proto.example.v1.GetPlanetRequest request,
        io.grpc.stub.StreamObserver<com.jfinance.proto.example.v1.GetPlanetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlanetMethod(), responseObserver);
    }

    /**
     * <pre>
     * StreamGalaxies streams galaxies.
     * </pre>
     */
    public void streamGalaxies(com.jfinance.proto.example.v1.StreamGalaxiesRequest request,
        io.grpc.stub.StreamObserver<com.jfinance.proto.example.v1.StreamGalaxiesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamGalaxiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * StreamQuasars streams quasars.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.jfinance.proto.example.v1.StreamQuasarsRequest> streamQuasars(
        io.grpc.stub.StreamObserver<com.jfinance.proto.example.v1.StreamQuasarsResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamQuasarsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendFooMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jfinance.proto.example.v1.SendFooRequest,
                com.jfinance.proto.example.v1.SendFooResponse>(
                  this, METHODID_SEND_FOO)))
          .addMethod(
            getGetPlanetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jfinance.proto.example.v1.GetPlanetRequest,
                com.jfinance.proto.example.v1.GetPlanetResponse>(
                  this, METHODID_GET_PLANET)))
          .addMethod(
            getStreamGalaxiesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jfinance.proto.example.v1.StreamGalaxiesRequest,
                com.jfinance.proto.example.v1.StreamGalaxiesResponse>(
                  this, METHODID_STREAM_GALAXIES)))
          .addMethod(
            getStreamQuasarsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.jfinance.proto.example.v1.StreamQuasarsRequest,
                com.jfinance.proto.example.v1.StreamQuasarsResponse>(
                  this, METHODID_STREAM_QUASARS)))
          .build();
    }
  }

  /**
   * <pre>
   * HelloService is the hello service.
   * </pre>
   */
  public static final class HelloServiceStub extends io.grpc.stub.AbstractAsyncStub<HelloServiceStub> {
    private HelloServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * SendFoo sends a foo.
     * </pre>
     */
    public void sendFoo(com.jfinance.proto.example.v1.SendFooRequest request,
        io.grpc.stub.StreamObserver<com.jfinance.proto.example.v1.SendFooResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendFooMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPlanet gets a planet.
     * </pre>
     */
    public void getPlanet(com.jfinance.proto.example.v1.GetPlanetRequest request,
        io.grpc.stub.StreamObserver<com.jfinance.proto.example.v1.GetPlanetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlanetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StreamGalaxies streams galaxies.
     * </pre>
     */
    public void streamGalaxies(com.jfinance.proto.example.v1.StreamGalaxiesRequest request,
        io.grpc.stub.StreamObserver<com.jfinance.proto.example.v1.StreamGalaxiesResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamGalaxiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StreamQuasars streams quasars.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.jfinance.proto.example.v1.StreamQuasarsRequest> streamQuasars(
        io.grpc.stub.StreamObserver<com.jfinance.proto.example.v1.StreamQuasarsResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getStreamQuasarsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * HelloService is the hello service.
   * </pre>
   */
  public static final class HelloServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * SendFoo sends a foo.
     * </pre>
     */
    public com.jfinance.proto.example.v1.SendFooResponse sendFoo(com.jfinance.proto.example.v1.SendFooRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendFooMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPlanet gets a planet.
     * </pre>
     */
    public com.jfinance.proto.example.v1.GetPlanetResponse getPlanet(com.jfinance.proto.example.v1.GetPlanetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPlanetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StreamGalaxies streams galaxies.
     * </pre>
     */
    public java.util.Iterator<com.jfinance.proto.example.v1.StreamGalaxiesResponse> streamGalaxies(
        com.jfinance.proto.example.v1.StreamGalaxiesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamGalaxiesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * HelloService is the hello service.
   * </pre>
   */
  public static final class HelloServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * SendFoo sends a foo.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jfinance.proto.example.v1.SendFooResponse> sendFoo(
        com.jfinance.proto.example.v1.SendFooRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendFooMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetPlanet gets a planet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jfinance.proto.example.v1.GetPlanetResponse> getPlanet(
        com.jfinance.proto.example.v1.GetPlanetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlanetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_FOO = 0;
  private static final int METHODID_GET_PLANET = 1;
  private static final int METHODID_STREAM_GALAXIES = 2;
  private static final int METHODID_STREAM_QUASARS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_FOO:
          serviceImpl.sendFoo((com.jfinance.proto.example.v1.SendFooRequest) request,
              (io.grpc.stub.StreamObserver<com.jfinance.proto.example.v1.SendFooResponse>) responseObserver);
          break;
        case METHODID_GET_PLANET:
          serviceImpl.getPlanet((com.jfinance.proto.example.v1.GetPlanetRequest) request,
              (io.grpc.stub.StreamObserver<com.jfinance.proto.example.v1.GetPlanetResponse>) responseObserver);
          break;
        case METHODID_STREAM_GALAXIES:
          serviceImpl.streamGalaxies((com.jfinance.proto.example.v1.StreamGalaxiesRequest) request,
              (io.grpc.stub.StreamObserver<com.jfinance.proto.example.v1.StreamGalaxiesResponse>) responseObserver);
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
        case METHODID_STREAM_QUASARS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamQuasars(
              (io.grpc.stub.StreamObserver<com.jfinance.proto.example.v1.StreamQuasarsResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jfinance.proto.example.v1.Uber1Proto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloService");
    }
  }

  private static final class HelloServiceFileDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier {
    HelloServiceFileDescriptorSupplier() {}
  }

  private static final class HelloServiceMethodDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceFileDescriptorSupplier())
              .addMethod(getSendFooMethod())
              .addMethod(getGetPlanetMethod())
              .addMethod(getStreamGalaxiesMethod())
              .addMethod(getStreamQuasarsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
