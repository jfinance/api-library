package com.jfinance.proto.example.v1;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler",
    comments = "Source: example/v1/style.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.CLIENT,
    idlClass = HelloService.class)
public final class HelloServiceClient implements HelloService {
  private final io.rsocket.RSocket rSocket;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<com.jfinance.proto.example.v1.SendFooResponse>, ? extends org.reactivestreams.Publisher<com.jfinance.proto.example.v1.SendFooResponse>> sendFoo;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<com.jfinance.proto.example.v1.GetPlanetResponse>, ? extends org.reactivestreams.Publisher<com.jfinance.proto.example.v1.GetPlanetResponse>> getPlanet;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<com.jfinance.proto.example.v1.StreamGalaxiesResponse>, ? extends org.reactivestreams.Publisher<com.jfinance.proto.example.v1.StreamGalaxiesResponse>> streamGalaxies;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<com.jfinance.proto.example.v1.StreamQuasarsResponse>, ? extends org.reactivestreams.Publisher<com.jfinance.proto.example.v1.StreamQuasarsResponse>> streamQuasars;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<com.jfinance.proto.example.v1.SendFooResponse>, ? extends org.reactivestreams.Publisher<com.jfinance.proto.example.v1.SendFooResponse>>> sendFooTrace;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<com.jfinance.proto.example.v1.GetPlanetResponse>, ? extends org.reactivestreams.Publisher<com.jfinance.proto.example.v1.GetPlanetResponse>>> getPlanetTrace;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<com.jfinance.proto.example.v1.StreamGalaxiesResponse>, ? extends org.reactivestreams.Publisher<com.jfinance.proto.example.v1.StreamGalaxiesResponse>>> streamGalaxiesTrace;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<com.jfinance.proto.example.v1.StreamQuasarsResponse>, ? extends org.reactivestreams.Publisher<com.jfinance.proto.example.v1.StreamQuasarsResponse>>> streamQuasarsTrace;

  public HelloServiceClient(io.rsocket.RSocket rSocket) {
    this.rSocket = rSocket;
    this.sendFoo = java.util.function.Function.identity();
    this.getPlanet = java.util.function.Function.identity();
    this.streamGalaxies = java.util.function.Function.identity();
    this.streamQuasars = java.util.function.Function.identity();
    this.sendFooTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.getPlanetTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.streamGalaxiesTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.streamQuasarsTrace = io.rsocket.rpc.tracing.Tracing.trace();
  }

  public HelloServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry) {
    this.rSocket = rSocket;
    this.sendFoo = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HelloService.SERVICE, "method", HelloService.METHOD_SEND_FOO);
    this.getPlanet = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HelloService.SERVICE, "method", HelloService.METHOD_GET_PLANET);
    this.streamGalaxies = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HelloService.SERVICE, "method", HelloService.METHOD_STREAM_GALAXIES);
    this.streamQuasars = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HelloService.SERVICE, "method", HelloService.METHOD_STREAM_QUASARS);
    this.sendFooTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.getPlanetTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.streamGalaxiesTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.streamQuasarsTrace = io.rsocket.rpc.tracing.Tracing.trace();
  }


  public HelloServiceClient(io.rsocket.RSocket rSocket, io.opentracing.Tracer tracer) {
    this.rSocket = rSocket;
    this.sendFoo = java.util.function.Function.identity();
    this.getPlanet = java.util.function.Function.identity();
    this.streamGalaxies = java.util.function.Function.identity();
    this.streamQuasars = java.util.function.Function.identity();
    this.sendFooTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HelloService.METHOD_SEND_FOO, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HelloService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.getPlanetTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HelloService.METHOD_GET_PLANET, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HelloService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.streamGalaxiesTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HelloService.METHOD_STREAM_GALAXIES, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HelloService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.streamQuasarsTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HelloService.METHOD_STREAM_QUASARS, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HelloService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
  }


  public HelloServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry, io.opentracing.Tracer tracer) {
    this.rSocket = rSocket;
    this.sendFoo = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HelloService.SERVICE, "method", HelloService.METHOD_SEND_FOO);
    this.getPlanet = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HelloService.SERVICE, "method", HelloService.METHOD_GET_PLANET);
    this.streamGalaxies = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HelloService.SERVICE, "method", HelloService.METHOD_STREAM_GALAXIES);
    this.streamQuasars = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HelloService.SERVICE, "method", HelloService.METHOD_STREAM_QUASARS);
    this.sendFooTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HelloService.METHOD_SEND_FOO, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HelloService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.getPlanetTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HelloService.METHOD_GET_PLANET, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HelloService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.streamGalaxiesTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HelloService.METHOD_STREAM_GALAXIES, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HelloService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.streamQuasarsTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HelloService.METHOD_STREAM_QUASARS, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HelloService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.jfinance.proto.example.v1.SendFooResponse.class)
  public reactor.core.publisher.Mono<com.jfinance.proto.example.v1.SendFooResponse> sendFoo(com.jfinance.proto.example.v1.SendFooRequest message) {
    return sendFoo(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.jfinance.proto.example.v1.SendFooResponse.class)
  public reactor.core.publisher.Mono<com.jfinance.proto.example.v1.SendFooResponse> sendFoo(com.jfinance.proto.example.v1.SendFooRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Mono.defer(new java.util.function.Supplier<reactor.core.publisher.Mono<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Mono<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf data = serialize(message);
        final io.netty.buffer.ByteBuf tracing = io.rsocket.rpc.tracing.Tracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.rsocket.rpc.frames.Metadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, HelloService.SERVICE, HelloService.METHOD_SEND_FOO, tracing, metadata);
        tracing.release();
        metadata.release();
        return rSocket.requestResponse(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(com.jfinance.proto.example.v1.SendFooResponse.parser())).transform(sendFoo).transform(sendFooTrace.apply(map));
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.jfinance.proto.example.v1.GetPlanetResponse.class)
  public reactor.core.publisher.Mono<com.jfinance.proto.example.v1.GetPlanetResponse> getPlanet(com.jfinance.proto.example.v1.GetPlanetRequest message) {
    return getPlanet(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.jfinance.proto.example.v1.GetPlanetResponse.class)
  public reactor.core.publisher.Mono<com.jfinance.proto.example.v1.GetPlanetResponse> getPlanet(com.jfinance.proto.example.v1.GetPlanetRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Mono.defer(new java.util.function.Supplier<reactor.core.publisher.Mono<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Mono<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf data = serialize(message);
        final io.netty.buffer.ByteBuf tracing = io.rsocket.rpc.tracing.Tracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.rsocket.rpc.frames.Metadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, HelloService.SERVICE, HelloService.METHOD_GET_PLANET, tracing, metadata);
        tracing.release();
        metadata.release();
        return rSocket.requestResponse(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(com.jfinance.proto.example.v1.GetPlanetResponse.parser())).transform(getPlanet).transform(getPlanetTrace.apply(map));
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.jfinance.proto.example.v1.StreamGalaxiesResponse.class)
  public reactor.core.publisher.Flux<com.jfinance.proto.example.v1.StreamGalaxiesResponse> streamGalaxies(com.jfinance.proto.example.v1.StreamGalaxiesRequest message) {
    return streamGalaxies(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.jfinance.proto.example.v1.StreamGalaxiesResponse.class)
  public reactor.core.publisher.Flux<com.jfinance.proto.example.v1.StreamGalaxiesResponse> streamGalaxies(com.jfinance.proto.example.v1.StreamGalaxiesRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Flux.defer(new java.util.function.Supplier<reactor.core.publisher.Flux<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Flux<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf data = serialize(message);
        final io.netty.buffer.ByteBuf tracing = io.rsocket.rpc.tracing.Tracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.rsocket.rpc.frames.Metadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, HelloService.SERVICE, HelloService.METHOD_STREAM_GALAXIES, tracing, metadata);
        tracing.release();
        metadata.release();
        return rSocket.requestStream(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(com.jfinance.proto.example.v1.StreamGalaxiesResponse.parser())).transform(streamGalaxies).transform(streamGalaxiesTrace.apply(map));
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.jfinance.proto.example.v1.StreamQuasarsResponse.class)
  public reactor.core.publisher.Mono<com.jfinance.proto.example.v1.StreamQuasarsResponse> streamQuasars(org.reactivestreams.Publisher<com.jfinance.proto.example.v1.StreamQuasarsRequest> messages) {
    return streamQuasars(messages, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.jfinance.proto.example.v1.StreamQuasarsResponse.class)
  public reactor.core.publisher.Mono<com.jfinance.proto.example.v1.StreamQuasarsResponse> streamQuasars(org.reactivestreams.Publisher<com.jfinance.proto.example.v1.StreamQuasarsRequest> messages, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return rSocket.requestChannel(reactor.core.publisher.Flux.from(messages).map(
      new java.util.function.Function<com.google.protobuf.MessageLite, io.rsocket.Payload>() {
        private final java.util.concurrent.atomic.AtomicBoolean once = new java.util.concurrent.atomic.AtomicBoolean(false);

        @java.lang.Override
        public io.rsocket.Payload apply(com.google.protobuf.MessageLite message) {
          io.netty.buffer.ByteBuf data = serialize(message);
          if (once.compareAndSet(false, true)) {
            final io.netty.buffer.ByteBuf metadataBuf = io.rsocket.rpc.frames.Metadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, HelloService.SERVICE, HelloService.METHOD_STREAM_QUASARS, metadata);
            return io.rsocket.util.ByteBufPayload.create(data, metadataBuf);
          } else {
            return io.rsocket.util.ByteBufPayload.create(data);
          }
        }
      })).map(deserializer(com.jfinance.proto.example.v1.StreamQuasarsResponse.parser())).single().transform(streamQuasars).transform(streamQuasarsTrace.apply(map));
  }

  private static io.netty.buffer.ByteBuf serialize(final com.google.protobuf.MessageLite message) {
    int length = message.getSerializedSize();
    io.netty.buffer.ByteBuf byteBuf = io.netty.buffer.ByteBufAllocator.DEFAULT.buffer(length);
    try {
      message.writeTo(com.google.protobuf.CodedOutputStream.newInstance(byteBuf.internalNioBuffer(0, length)));
      byteBuf.writerIndex(length);
      return byteBuf;
    } catch (Throwable t) {
      byteBuf.release();
      throw new RuntimeException(t);
    }
  }

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
