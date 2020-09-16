package com.jfinance.proto.example.v1;

/**
 */
@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler (version 0.2.18)",
    comments = "Source: example/v1/style.proto")
public interface BlockingGreetingService {
  String SERVICE_ID = "jfinance.proto.example.v1.GreetingService";
  String METHOD_GREETING = "Greeting";

  /**
   */
  com.jfinance.proto.example.v1.GreetingResponse greeting(com.jfinance.proto.example.v1.GreetingRequest message, io.netty.buffer.ByteBuf metadata);
}
