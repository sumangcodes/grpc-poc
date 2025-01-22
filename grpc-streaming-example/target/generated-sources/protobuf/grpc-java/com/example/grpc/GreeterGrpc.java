package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: greeter.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final java.lang.String SERVICE_NAME = "example.Greeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.GreeterProto.HelloRequest,
      com.example.grpc.GreeterProto.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.example.grpc.GreeterProto.HelloRequest.class,
      responseType = com.example.grpc.GreeterProto.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.GreeterProto.HelloRequest,
      com.example.grpc.GreeterProto.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.GreeterProto.HelloRequest, com.example.grpc.GreeterProto.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
          GreeterGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.GreeterProto.HelloRequest, com.example.grpc.GreeterProto.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GreeterProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GreeterProto.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.GreeterProto.HelloRequest,
      com.example.grpc.GreeterProto.HelloReply> getSayMultiHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayMultiHello",
      requestType = com.example.grpc.GreeterProto.HelloRequest.class,
      responseType = com.example.grpc.GreeterProto.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.GreeterProto.HelloRequest,
      com.example.grpc.GreeterProto.HelloReply> getSayMultiHelloMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.GreeterProto.HelloRequest, com.example.grpc.GreeterProto.HelloReply> getSayMultiHelloMethod;
    if ((getSayMultiHelloMethod = GreeterGrpc.getSayMultiHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayMultiHelloMethod = GreeterGrpc.getSayMultiHelloMethod) == null) {
          GreeterGrpc.getSayMultiHelloMethod = getSayMultiHelloMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.GreeterProto.HelloRequest, com.example.grpc.GreeterProto.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayMultiHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GreeterProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GreeterProto.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayMultiHello"))
              .build();
        }
      }
    }
    return getSayMultiHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.GreeterProto.HelloRequest,
      com.example.grpc.GreeterProto.HelloReply> getSayStreamHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayStreamHello",
      requestType = com.example.grpc.GreeterProto.HelloRequest.class,
      responseType = com.example.grpc.GreeterProto.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.GreeterProto.HelloRequest,
      com.example.grpc.GreeterProto.HelloReply> getSayStreamHelloMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.GreeterProto.HelloRequest, com.example.grpc.GreeterProto.HelloReply> getSayStreamHelloMethod;
    if ((getSayStreamHelloMethod = GreeterGrpc.getSayStreamHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayStreamHelloMethod = GreeterGrpc.getSayStreamHelloMethod) == null) {
          GreeterGrpc.getSayStreamHelloMethod = getSayStreamHelloMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.GreeterProto.HelloRequest, com.example.grpc.GreeterProto.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayStreamHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GreeterProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.GreeterProto.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayStreamHello"))
              .build();
        }
      }
    }
    return getSayStreamHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterStub>() {
        @java.lang.Override
        public GreeterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterStub(channel, callOptions);
        }
      };
    return GreeterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub>() {
        @java.lang.Override
        public GreeterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterBlockingStub(channel, callOptions);
        }
      };
    return GreeterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub>() {
        @java.lang.Override
        public GreeterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterFutureStub(channel, callOptions);
        }
      };
    return GreeterFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void sayHello(com.example.grpc.GreeterProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreeterProto.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    default void sayMultiHello(com.example.grpc.GreeterProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreeterProto.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayMultiHelloMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.example.grpc.GreeterProto.HelloRequest> sayStreamHello(
        io.grpc.stub.StreamObserver<com.example.grpc.GreeterProto.HelloReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSayStreamHelloMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Greeter.
   */
  public static abstract class GreeterImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GreeterGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Greeter.
   */
  public static final class GreeterStub
      extends io.grpc.stub.AbstractAsyncStub<GreeterStub> {
    private GreeterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.example.grpc.GreeterProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreeterProto.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sayMultiHello(com.example.grpc.GreeterProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreeterProto.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSayMultiHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.GreeterProto.HelloRequest> sayStreamHello(
        io.grpc.stub.StreamObserver<com.example.grpc.GreeterProto.HelloReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSayStreamHelloMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Greeter.
   */
  public static final class GreeterBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GreeterBlockingStub> {
    private GreeterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.GreeterProto.HelloReply sayHello(com.example.grpc.GreeterProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.grpc.GreeterProto.HelloReply> sayMultiHello(
        com.example.grpc.GreeterProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSayMultiHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Greeter.
   */
  public static final class GreeterFutureStub
      extends io.grpc.stub.AbstractFutureStub<GreeterFutureStub> {
    private GreeterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.GreeterProto.HelloReply> sayHello(
        com.example.grpc.GreeterProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_MULTI_HELLO = 1;
  private static final int METHODID_SAY_STREAM_HELLO = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.example.grpc.GreeterProto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.GreeterProto.HelloReply>) responseObserver);
          break;
        case METHODID_SAY_MULTI_HELLO:
          serviceImpl.sayMultiHello((com.example.grpc.GreeterProto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.GreeterProto.HelloReply>) responseObserver);
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
        case METHODID_SAY_STREAM_HELLO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayStreamHello(
              (io.grpc.stub.StreamObserver<com.example.grpc.GreeterProto.HelloReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSayHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.GreeterProto.HelloRequest,
              com.example.grpc.GreeterProto.HelloReply>(
                service, METHODID_SAY_HELLO)))
        .addMethod(
          getSayMultiHelloMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.example.grpc.GreeterProto.HelloRequest,
              com.example.grpc.GreeterProto.HelloReply>(
                service, METHODID_SAY_MULTI_HELLO)))
        .addMethod(
          getSayStreamHelloMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.example.grpc.GreeterProto.HelloRequest,
              com.example.grpc.GreeterProto.HelloReply>(
                service, METHODID_SAY_STREAM_HELLO)))
        .build();
  }

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.GreeterProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GreeterMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getSayMultiHelloMethod())
              .addMethod(getSayStreamHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
