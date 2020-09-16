package com.jfinance.proto.example.v1;

/**
 */
@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler",
    comments = "Source: example/v1/style.proto")
public interface GreetingService {
  String SERVICE = "jfinance.proto.example.v1.GreetingService";
  String METHOD_GREETING = "Greeting";

  /**
   */
  reactor.core.publisher.Mono<com.jfinance.proto.example.v1.GreetingResponse> greeting(com.jfinance.proto.example.v1.GreetingRequest message, io.netty.buffer.ByteBuf metadata);
}
