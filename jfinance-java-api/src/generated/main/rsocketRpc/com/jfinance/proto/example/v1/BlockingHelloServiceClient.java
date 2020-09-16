package com.jfinance.proto.example.v1;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler (version 0.2.18)",
    comments = "Source: example/v1/style.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.CLIENT,
    idlClass = BlockingHelloService.class)
public final class BlockingHelloServiceClient implements BlockingHelloService {
  private final com.jfinance.proto.example.v1.HelloServiceClient delegate;

  public BlockingHelloServiceClient(io.rsocket.RSocket rSocket) {
    this.delegate = new com.jfinance.proto.example.v1.HelloServiceClient(rSocket);
  }

  public BlockingHelloServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry) {
    this.delegate = new com.jfinance.proto.example.v1.HelloServiceClient(rSocket, registry);
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.jfinance.proto.example.v1.SendFooResponse.class)
  public com.jfinance.proto.example.v1.SendFooResponse sendFoo(com.jfinance.proto.example.v1.SendFooRequest message) {
    return sendFoo(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.jfinance.proto.example.v1.SendFooResponse.class)
  public com.jfinance.proto.example.v1.SendFooResponse sendFoo(com.jfinance.proto.example.v1.SendFooRequest message, io.netty.buffer.ByteBuf metadata) {
    return delegate.sendFoo(message, metadata).block();
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.jfinance.proto.example.v1.GetPlanetResponse.class)
  public com.jfinance.proto.example.v1.GetPlanetResponse getPlanet(com.jfinance.proto.example.v1.GetPlanetRequest message) {
    return getPlanet(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.jfinance.proto.example.v1.GetPlanetResponse.class)
  public com.jfinance.proto.example.v1.GetPlanetResponse getPlanet(com.jfinance.proto.example.v1.GetPlanetRequest message, io.netty.buffer.ByteBuf metadata) {
    return delegate.getPlanet(message, metadata).block();
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.jfinance.proto.example.v1.StreamGalaxiesResponse.class)
  public  io.rsocket.rpc.BlockingIterable<com.jfinance.proto.example.v1.StreamGalaxiesResponse> streamGalaxies(com.jfinance.proto.example.v1.StreamGalaxiesRequest message) {
    return streamGalaxies(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.jfinance.proto.example.v1.StreamGalaxiesResponse.class)
  public  io.rsocket.rpc.BlockingIterable<com.jfinance.proto.example.v1.StreamGalaxiesResponse> streamGalaxies(com.jfinance.proto.example.v1.StreamGalaxiesRequest message, io.netty.buffer.ByteBuf metadata) {
    reactor.core.publisher.Flux stream = delegate.streamGalaxies(message, metadata);
    return new  io.rsocket.rpc.BlockingIterable<>(stream, reactor.util.concurrent.Queues.SMALL_BUFFER_SIZE, reactor.util.concurrent.Queues.small());
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.jfinance.proto.example.v1.StreamQuasarsResponse.class)
  public com.jfinance.proto.example.v1.StreamQuasarsResponse streamQuasars(Iterable<com.jfinance.proto.example.v1.StreamQuasarsRequest> messages) {
    return streamQuasars(messages, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.jfinance.proto.example.v1.StreamQuasarsResponse.class)
  public com.jfinance.proto.example.v1.StreamQuasarsResponse streamQuasars(Iterable<com.jfinance.proto.example.v1.StreamQuasarsRequest> messages, io.netty.buffer.ByteBuf metadata) {
    return delegate.streamQuasars(reactor.core.publisher.Flux.defer(() -> reactor.core.publisher.Flux.fromIterable(messages)), metadata).block();
  }

}

