package com.jfinance.proto.example.v1;

import static com.jfinance.proto.example.v1.GreetingServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by ReactorGrpc generator",
comments = "Source: example/v1/style.proto")
public final class ReactorGreetingServiceGrpc {
    private ReactorGreetingServiceGrpc() {}

    public static ReactorGreetingServiceStub newReactorStub(io.grpc.Channel channel) {
        return new ReactorGreetingServiceStub(channel);
    }

    public static final class ReactorGreetingServiceStub extends io.grpc.stub.AbstractStub<ReactorGreetingServiceStub> {
        private GreetingServiceGrpc.GreetingServiceStub delegateStub;

        private ReactorGreetingServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = GreetingServiceGrpc.newStub(channel);
        }

        private ReactorGreetingServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = GreetingServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected ReactorGreetingServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ReactorGreetingServiceStub(channel, callOptions);
        }

        public reactor.core.publisher.Mono<com.jfinance.proto.example.v1.GreetingResponse> greeting(reactor.core.publisher.Mono<com.jfinance.proto.example.v1.GreetingRequest> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactorRequest, delegateStub::greeting);
        }

        public reactor.core.publisher.Mono<com.jfinance.proto.example.v1.GreetingResponse> greeting(com.jfinance.proto.example.v1.GreetingRequest reactorRequest) {
           return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactor.core.publisher.Mono.just(reactorRequest), delegateStub::greeting);
        }

    }

    public static abstract class GreetingServiceImplBase implements io.grpc.BindableService {

        public reactor.core.publisher.Mono<com.jfinance.proto.example.v1.GreetingResponse> greeting(reactor.core.publisher.Mono<com.jfinance.proto.example.v1.GreetingRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            com.jfinance.proto.example.v1.GreetingServiceGrpc.getGreetingMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.jfinance.proto.example.v1.GreetingRequest,
                                            com.jfinance.proto.example.v1.GreetingResponse>(
                                            this, METHODID_GREETING)))
                    .build();
        }
    }

    private static final int METHODID_GREETING = 0;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final GreetingServiceImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(GreetingServiceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_GREETING:
                    com.salesforce.reactorgrpc.stub.ServerCalls.oneToOne((com.jfinance.proto.example.v1.GreetingRequest) request,
                            (io.grpc.stub.StreamObserver<com.jfinance.proto.example.v1.GreetingResponse>) responseObserver,
                            serviceImpl::greeting);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}
