package com.jfinance.proto.example.v1;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler",
    comments = "Source: example/v1/style.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.CLIENT,
    idlClass = GreetingService.class)
public final class GreetingServiceClient implements GreetingService {
  private final io.rsocket.RSocket rSocket;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<com.jfinance.proto.example.v1.GreetingResponse>, ? extends org.reactivestreams.Publisher<com.jfinance.proto.example.v1.GreetingResponse>> greeting;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<com.jfinance.proto.example.v1.GreetingResponse>, ? extends org.reactivestreams.Publisher<com.jfinance.proto.example.v1.GreetingResponse>>> greetingTrace;

  public GreetingServiceClient(io.rsocket.RSocket rSocket) {
    this.rSocket = rSocket;
    this.greeting = java.util.function.Function.identity();
    this.greetingTrace = io.rsocket.rpc.tracing.Tracing.trace();
  }

  public GreetingServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry) {
    this.rSocket = rSocket;
    this.greeting = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", GreetingService.SERVICE, "method", GreetingService.METHOD_GREETING);
    this.greetingTrace = io.rsocket.rpc.tracing.Tracing.trace();
  }


  public GreetingServiceClient(io.rsocket.RSocket rSocket, io.opentracing.Tracer tracer) {
    this.rSocket = rSocket;
    this.greeting = java.util.function.Function.identity();
    this.greetingTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, GreetingService.METHOD_GREETING, io.rsocket.rpc.tracing.Tag.of("rsocket.service", GreetingService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
  }


  public GreetingServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry, io.opentracing.Tracer tracer) {
    this.rSocket = rSocket;
    this.greeting = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", GreetingService.SERVICE, "method", GreetingService.METHOD_GREETING);
    this.greetingTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, GreetingService.METHOD_GREETING, io.rsocket.rpc.tracing.Tag.of("rsocket.service", GreetingService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.jfinance.proto.example.v1.GreetingResponse.class)
  public reactor.core.publisher.Mono<com.jfinance.proto.example.v1.GreetingResponse> greeting(com.jfinance.proto.example.v1.GreetingRequest message) {
    return greeting(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.jfinance.proto.example.v1.GreetingResponse.class)
  public reactor.core.publisher.Mono<com.jfinance.proto.example.v1.GreetingResponse> greeting(com.jfinance.proto.example.v1.GreetingRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Mono.defer(new java.util.function.Supplier<reactor.core.publisher.Mono<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Mono<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf data = serialize(message);
        final io.netty.buffer.ByteBuf tracing = io.rsocket.rpc.tracing.Tracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.rsocket.rpc.frames.Metadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, GreetingService.SERVICE, GreetingService.METHOD_GREETING, tracing, metadata);
        tracing.release();
        metadata.release();
        return rSocket.requestResponse(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(com.jfinance.proto.example.v1.GreetingResponse.parser())).transform(greeting).transform(greetingTrace.apply(map));
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
