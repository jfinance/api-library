package com.jfinance.proto.example.v1;

import static com.jfinance.proto.example.v1.HelloServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by ReactorGrpc generator",
comments = "Source: example/v1/style.proto")
public final class ReactorHelloServiceGrpc {
    private ReactorHelloServiceGrpc() {}

    public static ReactorHelloServiceStub newReactorStub(io.grpc.Channel channel) {
        return new ReactorHelloServiceStub(channel);
    }

    /**
     * <pre>
     *  HelloService is the hello service.
     * </pre>
     */
    public static final class ReactorHelloServiceStub extends io.grpc.stub.AbstractStub<ReactorHelloServiceStub> {
        private HelloServiceGrpc.HelloServiceStub delegateStub;

        private ReactorHelloServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = HelloServiceGrpc.newStub(channel);
        }

        private ReactorHelloServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = HelloServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected ReactorHelloServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ReactorHelloServiceStub(channel, callOptions);
        }

        /**
         * <pre>
         *  SendFoo sends a foo.
         * </pre>
         */
        public reactor.core.publisher.Mono<com.jfinance.proto.example.v1.SendFooResponse> sendFoo(reactor.core.publisher.Mono<com.jfinance.proto.example.v1.SendFooRequest> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactorRequest, delegateStub::sendFoo);
        }

        /**
         * <pre>
         *  GetPlanet gets a planet.
         * </pre>
         */
        public reactor.core.publisher.Mono<com.jfinance.proto.example.v1.GetPlanetResponse> getPlanet(reactor.core.publisher.Mono<com.jfinance.proto.example.v1.GetPlanetRequest> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactorRequest, delegateStub::getPlanet);
        }

        /**
         * <pre>
         *  StreamGalaxies streams galaxies.
         * </pre>
         */
        public reactor.core.publisher.Flux<com.jfinance.proto.example.v1.StreamGalaxiesResponse> streamGalaxies(reactor.core.publisher.Mono<com.jfinance.proto.example.v1.StreamGalaxiesRequest> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.oneToMany(reactorRequest, delegateStub::streamGalaxies);
        }

        /**
         * <pre>
         *  StreamQuasars streams quasars.
         * </pre>
         */
        public reactor.core.publisher.Mono<com.jfinance.proto.example.v1.StreamQuasarsResponse> streamQuasars(reactor.core.publisher.Flux<com.jfinance.proto.example.v1.StreamQuasarsRequest> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.manyToOne(reactorRequest, delegateStub::streamQuasars);
        }

        /**
         * <pre>
         *  SendFoo sends a foo.
         * </pre>
         */
        public reactor.core.publisher.Mono<com.jfinance.proto.example.v1.SendFooResponse> sendFoo(com.jfinance.proto.example.v1.SendFooRequest reactorRequest) {
           return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactor.core.publisher.Mono.just(reactorRequest), delegateStub::sendFoo);
        }

        /**
         * <pre>
         *  GetPlanet gets a planet.
         * </pre>
         */
        public reactor.core.publisher.Mono<com.jfinance.proto.example.v1.GetPlanetResponse> getPlanet(com.jfinance.proto.example.v1.GetPlanetRequest reactorRequest) {
           return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactor.core.publisher.Mono.just(reactorRequest), delegateStub::getPlanet);
        }

        /**
         * <pre>
         *  StreamGalaxies streams galaxies.
         * </pre>
         */
        public reactor.core.publisher.Flux<com.jfinance.proto.example.v1.StreamGalaxiesResponse> streamGalaxies(com.jfinance.proto.example.v1.StreamGalaxiesRequest reactorRequest) {
           return com.salesforce.reactorgrpc.stub.ClientCalls.oneToMany(reactor.core.publisher.Mono.just(reactorRequest), delegateStub::streamGalaxies);
        }

    }

    /**
     * <pre>
     *  HelloService is the hello service.
     * </pre>
     */
    public static abstract class HelloServiceImplBase implements io.grpc.BindableService {

        /**
         * <pre>
         *  SendFoo sends a foo.
         * </pre>
         */
        public reactor.core.publisher.Mono<com.jfinance.proto.example.v1.SendFooResponse> sendFoo(reactor.core.publisher.Mono<com.jfinance.proto.example.v1.SendFooRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  GetPlanet gets a planet.
         * </pre>
         */
        public reactor.core.publisher.Mono<com.jfinance.proto.example.v1.GetPlanetResponse> getPlanet(reactor.core.publisher.Mono<com.jfinance.proto.example.v1.GetPlanetRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  StreamGalaxies streams galaxies.
         * </pre>
         */
        public reactor.core.publisher.Flux<com.jfinance.proto.example.v1.StreamGalaxiesResponse> streamGalaxies(reactor.core.publisher.Mono<com.jfinance.proto.example.v1.StreamGalaxiesRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  StreamQuasars streams quasars.
         * </pre>
         */
        public reactor.core.publisher.Mono<com.jfinance.proto.example.v1.StreamQuasarsResponse> streamQuasars(reactor.core.publisher.Flux<com.jfinance.proto.example.v1.StreamQuasarsRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            com.jfinance.proto.example.v1.HelloServiceGrpc.getSendFooMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.jfinance.proto.example.v1.SendFooRequest,
                                            com.jfinance.proto.example.v1.SendFooResponse>(
                                            this, METHODID_SEND_FOO)))
                    .addMethod(
                            com.jfinance.proto.example.v1.HelloServiceGrpc.getGetPlanetMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.jfinance.proto.example.v1.GetPlanetRequest,
                                            com.jfinance.proto.example.v1.GetPlanetResponse>(
                                            this, METHODID_GET_PLANET)))
                    .addMethod(
                            com.jfinance.proto.example.v1.HelloServiceGrpc.getStreamGalaxiesMethod(),
                            asyncServerStreamingCall(
                                    new MethodHandlers<
                                            com.jfinance.proto.example.v1.StreamGalaxiesRequest,
                                            com.jfinance.proto.example.v1.StreamGalaxiesResponse>(
                                            this, METHODID_STREAM_GALAXIES)))
                    .addMethod(
                            com.jfinance.proto.example.v1.HelloServiceGrpc.getStreamQuasarsMethod(),
                            asyncClientStreamingCall(
                                    new MethodHandlers<
                                            com.jfinance.proto.example.v1.StreamQuasarsRequest,
                                            com.jfinance.proto.example.v1.StreamQuasarsResponse>(
                                            this, METHODID_STREAM_QUASARS)))
                    .build();
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
                    com.salesforce.reactorgrpc.stub.ServerCalls.oneToOne((com.jfinance.proto.example.v1.SendFooRequest) request,
                            (io.grpc.stub.StreamObserver<com.jfinance.proto.example.v1.SendFooResponse>) responseObserver,
                            serviceImpl::sendFoo);
                    break;
                case METHODID_GET_PLANET:
                    com.salesforce.reactorgrpc.stub.ServerCalls.oneToOne((com.jfinance.proto.example.v1.GetPlanetRequest) request,
                            (io.grpc.stub.StreamObserver<com.jfinance.proto.example.v1.GetPlanetResponse>) responseObserver,
                            serviceImpl::getPlanet);
                    break;
                case METHODID_STREAM_GALAXIES:
                    com.salesforce.reactorgrpc.stub.ServerCalls.oneToMany((com.jfinance.proto.example.v1.StreamGalaxiesRequest) request,
                            (io.grpc.stub.StreamObserver<com.jfinance.proto.example.v1.StreamGalaxiesResponse>) responseObserver,
                            serviceImpl::streamGalaxies);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_STREAM_QUASARS:
                    return (io.grpc.stub.StreamObserver<Req>) com.salesforce.reactorgrpc.stub.ServerCalls.manyToOne(
                            (io.grpc.stub.StreamObserver<com.jfinance.proto.example.v1.StreamQuasarsResponse>) responseObserver,
                            serviceImpl::streamQuasars);
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}
