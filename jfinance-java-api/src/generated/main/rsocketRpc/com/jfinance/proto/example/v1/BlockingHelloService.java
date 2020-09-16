package com.jfinance.proto.example.v1;

/**
 * <pre>
 * HelloService is the hello service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler (version 0.2.18)",
    comments = "Source: example/v1/style.proto")
public interface BlockingHelloService {
  String SERVICE_ID = "jfinance.proto.example.v1.HelloService";
  String METHOD_SEND_FOO = "SendFoo";
  String METHOD_GET_PLANET = "GetPlanet";
  String METHOD_STREAM_GALAXIES = "StreamGalaxies";
  String METHOD_STREAM_QUASARS = "StreamQuasars";

  /**
   * <pre>
   * SendFoo sends a foo.
   * </pre>
   */
  com.jfinance.proto.example.v1.SendFooResponse sendFoo(com.jfinance.proto.example.v1.SendFooRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   * <pre>
   * GetPlanet gets a planet.
   * </pre>
   */
  com.jfinance.proto.example.v1.GetPlanetResponse getPlanet(com.jfinance.proto.example.v1.GetPlanetRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   * <pre>
   * StreamGalaxies streams galaxies.
   * </pre>
   */
  Iterable<com.jfinance.proto.example.v1.StreamGalaxiesResponse> streamGalaxies(com.jfinance.proto.example.v1.StreamGalaxiesRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   * <pre>
   * StreamQuasars streams quasars.
   * </pre>
   */
  com.jfinance.proto.example.v1.StreamQuasarsResponse streamQuasars(Iterable<com.jfinance.proto.example.v1.StreamQuasarsRequest> messages, io.netty.buffer.ByteBuf metadata);
}
