package com.jfinance.proto.example.v1;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler (version 0.2.18)",
    comments = "Source: example/v1/style.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.CLIENT,
    idlClass = BlockingGreetingService.class)
public final class BlockingGreetingServiceClient implements BlockingGreetingService {
  private final com.jfinance.proto.example.v1.GreetingServiceClient delegate;

  public BlockingGreetingServiceClient(io.rsocket.RSocket rSocket) {
    this.delegate = new com.jfinance.proto.example.v1.GreetingServiceClient(rSocket);
  }

  public BlockingGreetingServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry) {
    this.delegate = new com.jfinance.proto.example.v1.GreetingServiceClient(rSocket, registry);
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.jfinance.proto.example.v1.GreetingResponse.class)
  public com.jfinance.proto.example.v1.GreetingResponse greeting(com.jfinance.proto.example.v1.GreetingRequest message) {
    return greeting(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.jfinance.proto.example.v1.GreetingResponse.class)
  public com.jfinance.proto.example.v1.GreetingResponse greeting(com.jfinance.proto.example.v1.GreetingRequest message, io.netty.buffer.ByteBuf metadata) {
    return delegate.greeting(message, metadata).block();
  }

}

