package com.jfinance.proto.example.v1;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler",
    comments = "Source: example/v1/style.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.SERVICE,
    idlClass = HelloService.class)
@javax.inject.Named(
    value ="HelloServiceServer")
public final class HelloServiceServer extends io.rsocket.rpc.AbstractRSocketService {
  private final HelloService service;
  private final io.opentracing.Tracer tracer;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> sendFoo;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> getPlanet;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> streamGalaxies;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> streamQuasars;
  private final java.util.function.Function<io.opentracing.SpanContext, java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>>> sendFooTrace;
  private final java.util.function.Function<io.opentracing.SpanContext, java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>>> getPlanetTrace;
  private final java.util.function.Function<io.opentracing.SpanContext, java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>>> streamGalaxiesTrace;
  private final java.util.function.Function<io.opentracing.SpanContext, java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>>> streamQuasarsTrace;
  @javax.inject.Inject
  public HelloServiceServer(HelloService service, java.util.Optional<io.micrometer.core.instrument.MeterRegistry> registry, java.util.Optional<io.opentracing.Tracer> tracer) {
    this.service = service;
    if (!registry.isPresent()) {
      this.sendFoo = java.util.function.Function.identity();
      this.getPlanet = java.util.function.Function.identity();
      this.streamGalaxies = java.util.function.Function.identity();
      this.streamQuasars = java.util.function.Function.identity();
    } else {
      this.sendFoo = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", HelloService.SERVICE, "method", HelloService.METHOD_SEND_FOO);
      this.getPlanet = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", HelloService.SERVICE, "method", HelloService.METHOD_GET_PLANET);
      this.streamGalaxies = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", HelloService.SERVICE, "method", HelloService.METHOD_STREAM_GALAXIES);
      this.streamQuasars = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", HelloService.SERVICE, "method", HelloService.METHOD_STREAM_QUASARS);
    }

    if (!tracer.isPresent()) {
      this.tracer = null;
      this.sendFooTrace = (ignored) -> java.util.function.Function.identity();
      this.getPlanetTrace = (ignored) -> java.util.function.Function.identity();
      this.streamGalaxiesTrace = (ignored) -> java.util.function.Function.identity();
      this.streamQuasarsTrace = (ignored) -> java.util.function.Function.identity();
    } else {
      this.tracer = tracer.get();
      this.sendFooTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild(this.tracer, HelloService.METHOD_SEND_FOO, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HelloService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "server"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
      this.getPlanetTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild(this.tracer, HelloService.METHOD_GET_PLANET, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HelloService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "server"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
      this.streamGalaxiesTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild(this.tracer, HelloService.METHOD_STREAM_GALAXIES, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HelloService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "server"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
      this.streamQuasarsTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild(this.tracer, HelloService.METHOD_STREAM_QUASARS, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HelloService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "server"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    }

  }

  @java.lang.Override
  public String getService() {
    return HelloService.SERVICE;
  }

  @java.lang.Override
  public Class<?> getServiceClass() {
    return service.getClass();
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> fireAndForget(io.rsocket.Payload payload) {
    return reactor.core.publisher.Mono.error(new UnsupportedOperationException("Fire and forget not implemented."));
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<io.rsocket.Payload> requestResponse(io.rsocket.Payload payload) {
    try {
      io.netty.buffer.ByteBuf metadata = payload.sliceMetadata();
      io.opentracing.SpanContext spanContext = io.rsocket.rpc.tracing.Tracing.deserializeTracingMetadata(tracer, metadata);
      switch(io.rsocket.rpc.frames.Metadata.getMethod(metadata)) {
        case HelloService.METHOD_SEND_FOO: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return service.sendFoo(com.jfinance.proto.example.v1.SendFooRequest.parseFrom(is), metadata).map(serializer).transform(sendFoo).transform(sendFooTrace.apply(spanContext));
        }
        case HelloService.METHOD_GET_PLANET: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return service.getPlanet(com.jfinance.proto.example.v1.GetPlanetRequest.parseFrom(is), metadata).map(serializer).transform(getPlanet).transform(getPlanetTrace.apply(spanContext));
        }
        default: {
          return reactor.core.publisher.Mono.error(new UnsupportedOperationException());
        }
      }
    } catch (Throwable t) {
      return reactor.core.publisher.Mono.error(t);
    } finally {
      payload.release();
    }
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<io.rsocket.Payload> requestStream(io.rsocket.Payload payload) {
    try {
      io.netty.buffer.ByteBuf metadata = payload.sliceMetadata();
      io.opentracing.SpanContext spanContext = io.rsocket.rpc.tracing.Tracing.deserializeTracingMetadata(tracer, metadata);
      switch(io.rsocket.rpc.frames.Metadata.getMethod(metadata)) {
        case HelloService.METHOD_STREAM_GALAXIES: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return service.streamGalaxies(com.jfinance.proto.example.v1.StreamGalaxiesRequest.parseFrom(is), metadata).map(serializer).transform(streamGalaxies).transform(streamGalaxiesTrace.apply(spanContext));
        }
        default: {
          return reactor.core.publisher.Flux.error(new UnsupportedOperationException());
        }
      }
    } catch (Throwable t) {
      return reactor.core.publisher.Flux.error(t);
    } finally {
      payload.release();
    }
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<io.rsocket.Payload> requestChannel(io.rsocket.Payload payload, reactor.core.publisher.Flux<io.rsocket.Payload> publisher) {
    try {
      io.netty.buffer.ByteBuf metadata = payload.sliceMetadata();
      io.opentracing.SpanContext spanContext = io.rsocket.rpc.tracing.Tracing.deserializeTracingMetadata(tracer, metadata);
      switch(io.rsocket.rpc.frames.Metadata.getMethod(metadata)) {
        case HelloService.METHOD_STREAM_QUASARS: {
          reactor.core.publisher.Flux<com.jfinance.proto.example.v1.StreamQuasarsRequest> messages =
            publisher.map(deserializer(com.jfinance.proto.example.v1.StreamQuasarsRequest.parser()));
          return service.streamQuasars(messages, metadata).map(serializer).transform(streamQuasars).transform(streamQuasarsTrace.apply(spanContext)).flux();
        }
        default: {
          return reactor.core.publisher.Flux.error(new UnsupportedOperationException());
        }
      }
    } catch (Throwable t) {
      return reactor.core.publisher.Flux.error(t);
    }
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<io.rsocket.Payload> requestChannel(org.reactivestreams.Publisher<io.rsocket.Payload> payloads) {
    return new io.rsocket.internal.SwitchTransformFlux<io.rsocket.Payload, io.rsocket.Payload>(payloads, new java.util.function.BiFunction<io.rsocket.Payload, reactor.core.publisher.Flux<io.rsocket.Payload>, org.reactivestreams.Publisher<? extends io.rsocket.Payload>>() {
      @java.lang.Override
      public org.reactivestreams.Publisher<io.rsocket.Payload> apply(io.rsocket.Payload payload, reactor.core.publisher.Flux<io.rsocket.Payload> publisher) {
        return requestChannel(payload, publisher);
      }
    });
  }

  private static final java.util.function.Function<com.google.protobuf.MessageLite, io.rsocket.Payload> serializer =
    new java.util.function.Function<com.google.protobuf.MessageLite, io.rsocket.Payload>() {
      @java.lang.Override
      public io.rsocket.Payload apply(com.google.protobuf.MessageLite message) {
        int length = message.getSerializedSize();
        io.netty.buffer.ByteBuf byteBuf = io.netty.buffer.ByteBufAllocator.DEFAULT.buffer(length);
        try {
          message.writeTo(com.google.protobuf.CodedOutputStream.newInstance(byteBuf.internalNioBuffer(0, length)));
          byteBuf.writerIndex(length);
          return io.rsocket.util.ByteBufPayload.create(byteBuf);
        } catch (Throwable t) {
          byteBuf.release();
          throw new RuntimeException(t);
        }
      }
    };

  private static <T> java.util.function.Function<io.rsocket.Payload, T> deserializer(final com.google.protobuf.Parser<T> parser) {
    return new java.util.function.Function<io.rsocket.Payload, T>() {
      @java.lang.Override
      public T apply(io.rsocket.Payload payload) {
        try {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return parser.parseFrom(is);
        } catch (Throwable t) {
          throw new RuntimeException(t);
        } finally {
          payload.release();
        }
      }
    };
  }
}
