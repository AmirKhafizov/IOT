package ru.kpfu.grpc.generated;

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
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: math/math.proto")
public final class MathServiceGrpc {

  private MathServiceGrpc() {}

  public static final String SERVICE_NAME = "math.MathService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.kpfu.grpc.generated.MathRequest,
      ru.kpfu.grpc.generated.MathResponse> getSqrtMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sqrt",
      requestType = ru.kpfu.grpc.generated.MathRequest.class,
      responseType = ru.kpfu.grpc.generated.MathResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.kpfu.grpc.generated.MathRequest,
      ru.kpfu.grpc.generated.MathResponse> getSqrtMethod() {
    io.grpc.MethodDescriptor<ru.kpfu.grpc.generated.MathRequest, ru.kpfu.grpc.generated.MathResponse> getSqrtMethod;
    if ((getSqrtMethod = MathServiceGrpc.getSqrtMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getSqrtMethod = MathServiceGrpc.getSqrtMethod) == null) {
          MathServiceGrpc.getSqrtMethod = getSqrtMethod = 
              io.grpc.MethodDescriptor.<ru.kpfu.grpc.generated.MathRequest, ru.kpfu.grpc.generated.MathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "math.MathService", "sqrt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.kpfu.grpc.generated.MathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.kpfu.grpc.generated.MathResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("sqrt"))
                  .build();
          }
        }
     }
     return getSqrtMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.kpfu.grpc.generated.MathRequest,
      ru.kpfu.grpc.generated.MathResponse> getStdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "std",
      requestType = ru.kpfu.grpc.generated.MathRequest.class,
      responseType = ru.kpfu.grpc.generated.MathResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ru.kpfu.grpc.generated.MathRequest,
      ru.kpfu.grpc.generated.MathResponse> getStdMethod() {
    io.grpc.MethodDescriptor<ru.kpfu.grpc.generated.MathRequest, ru.kpfu.grpc.generated.MathResponse> getStdMethod;
    if ((getStdMethod = MathServiceGrpc.getStdMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getStdMethod = MathServiceGrpc.getStdMethod) == null) {
          MathServiceGrpc.getStdMethod = getStdMethod = 
              io.grpc.MethodDescriptor.<ru.kpfu.grpc.generated.MathRequest, ru.kpfu.grpc.generated.MathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "math.MathService", "std"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.kpfu.grpc.generated.MathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.kpfu.grpc.generated.MathResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("std"))
                  .build();
          }
        }
     }
     return getStdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.kpfu.grpc.generated.MathRequest,
      ru.kpfu.grpc.generated.MathResponse> getSimpleFactorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "simpleFactors",
      requestType = ru.kpfu.grpc.generated.MathRequest.class,
      responseType = ru.kpfu.grpc.generated.MathResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ru.kpfu.grpc.generated.MathRequest,
      ru.kpfu.grpc.generated.MathResponse> getSimpleFactorsMethod() {
    io.grpc.MethodDescriptor<ru.kpfu.grpc.generated.MathRequest, ru.kpfu.grpc.generated.MathResponse> getSimpleFactorsMethod;
    if ((getSimpleFactorsMethod = MathServiceGrpc.getSimpleFactorsMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getSimpleFactorsMethod = MathServiceGrpc.getSimpleFactorsMethod) == null) {
          MathServiceGrpc.getSimpleFactorsMethod = getSimpleFactorsMethod = 
              io.grpc.MethodDescriptor.<ru.kpfu.grpc.generated.MathRequest, ru.kpfu.grpc.generated.MathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "math.MathService", "simpleFactors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.kpfu.grpc.generated.MathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.kpfu.grpc.generated.MathResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("simpleFactors"))
                  .build();
          }
        }
     }
     return getSimpleFactorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.kpfu.grpc.generated.MathRequest,
      ru.kpfu.grpc.generated.MathResponse> getMaxNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "maxNum",
      requestType = ru.kpfu.grpc.generated.MathRequest.class,
      responseType = ru.kpfu.grpc.generated.MathResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ru.kpfu.grpc.generated.MathRequest,
      ru.kpfu.grpc.generated.MathResponse> getMaxNumMethod() {
    io.grpc.MethodDescriptor<ru.kpfu.grpc.generated.MathRequest, ru.kpfu.grpc.generated.MathResponse> getMaxNumMethod;
    if ((getMaxNumMethod = MathServiceGrpc.getMaxNumMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getMaxNumMethod = MathServiceGrpc.getMaxNumMethod) == null) {
          MathServiceGrpc.getMaxNumMethod = getMaxNumMethod = 
              io.grpc.MethodDescriptor.<ru.kpfu.grpc.generated.MathRequest, ru.kpfu.grpc.generated.MathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "math.MathService", "maxNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.kpfu.grpc.generated.MathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.kpfu.grpc.generated.MathResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("maxNum"))
                  .build();
          }
        }
     }
     return getMaxNumMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MathServiceStub newStub(io.grpc.Channel channel) {
    return new MathServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MathServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MathServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MathServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MathServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MathServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sqrt(ru.kpfu.grpc.generated.MathRequest request,
        io.grpc.stub.StreamObserver<ru.kpfu.grpc.generated.MathResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSqrtMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ru.kpfu.grpc.generated.MathRequest> std(
        io.grpc.stub.StreamObserver<ru.kpfu.grpc.generated.MathResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getStdMethod(), responseObserver);
    }

    /**
     */
    public void simpleFactors(ru.kpfu.grpc.generated.MathRequest request,
        io.grpc.stub.StreamObserver<ru.kpfu.grpc.generated.MathResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSimpleFactorsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ru.kpfu.grpc.generated.MathRequest> maxNum(
        io.grpc.stub.StreamObserver<ru.kpfu.grpc.generated.MathResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getMaxNumMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSqrtMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.kpfu.grpc.generated.MathRequest,
                ru.kpfu.grpc.generated.MathResponse>(
                  this, METHODID_SQRT)))
          .addMethod(
            getStdMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ru.kpfu.grpc.generated.MathRequest,
                ru.kpfu.grpc.generated.MathResponse>(
                  this, METHODID_STD)))
          .addMethod(
            getSimpleFactorsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ru.kpfu.grpc.generated.MathRequest,
                ru.kpfu.grpc.generated.MathResponse>(
                  this, METHODID_SIMPLE_FACTORS)))
          .addMethod(
            getMaxNumMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ru.kpfu.grpc.generated.MathRequest,
                ru.kpfu.grpc.generated.MathResponse>(
                  this, METHODID_MAX_NUM)))
          .build();
    }
  }

  /**
   */
  public static final class MathServiceStub extends io.grpc.stub.AbstractStub<MathServiceStub> {
    private MathServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceStub(channel, callOptions);
    }

    /**
     */
    public void sqrt(ru.kpfu.grpc.generated.MathRequest request,
        io.grpc.stub.StreamObserver<ru.kpfu.grpc.generated.MathResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSqrtMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ru.kpfu.grpc.generated.MathRequest> std(
        io.grpc.stub.StreamObserver<ru.kpfu.grpc.generated.MathResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getStdMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void simpleFactors(ru.kpfu.grpc.generated.MathRequest request,
        io.grpc.stub.StreamObserver<ru.kpfu.grpc.generated.MathResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSimpleFactorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ru.kpfu.grpc.generated.MathRequest> maxNum(
        io.grpc.stub.StreamObserver<ru.kpfu.grpc.generated.MathResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMaxNumMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class MathServiceBlockingStub extends io.grpc.stub.AbstractStub<MathServiceBlockingStub> {
    private MathServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.kpfu.grpc.generated.MathResponse sqrt(ru.kpfu.grpc.generated.MathRequest request) {
      return blockingUnaryCall(
          getChannel(), getSqrtMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ru.kpfu.grpc.generated.MathResponse> simpleFactors(
        ru.kpfu.grpc.generated.MathRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSimpleFactorsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MathServiceFutureStub extends io.grpc.stub.AbstractStub<MathServiceFutureStub> {
    private MathServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.kpfu.grpc.generated.MathResponse> sqrt(
        ru.kpfu.grpc.generated.MathRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSqrtMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SQRT = 0;
  private static final int METHODID_SIMPLE_FACTORS = 1;
  private static final int METHODID_STD = 2;
  private static final int METHODID_MAX_NUM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MathServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MathServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SQRT:
          serviceImpl.sqrt((ru.kpfu.grpc.generated.MathRequest) request,
              (io.grpc.stub.StreamObserver<ru.kpfu.grpc.generated.MathResponse>) responseObserver);
          break;
        case METHODID_SIMPLE_FACTORS:
          serviceImpl.simpleFactors((ru.kpfu.grpc.generated.MathRequest) request,
              (io.grpc.stub.StreamObserver<ru.kpfu.grpc.generated.MathResponse>) responseObserver);
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
        case METHODID_STD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.std(
              (io.grpc.stub.StreamObserver<ru.kpfu.grpc.generated.MathResponse>) responseObserver);
        case METHODID_MAX_NUM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.maxNum(
              (io.grpc.stub.StreamObserver<ru.kpfu.grpc.generated.MathResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MathServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MathServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.kpfu.grpc.generated.Math.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MathService");
    }
  }

  private static final class MathServiceFileDescriptorSupplier
      extends MathServiceBaseDescriptorSupplier {
    MathServiceFileDescriptorSupplier() {}
  }

  private static final class MathServiceMethodDescriptorSupplier
      extends MathServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MathServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MathServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MathServiceFileDescriptorSupplier())
              .addMethod(getSqrtMethod())
              .addMethod(getStdMethod())
              .addMethod(getSimpleFactorsMethod())
              .addMethod(getMaxNumMethod())
              .build();
        }
      }
    }
    return result;
  }
}
