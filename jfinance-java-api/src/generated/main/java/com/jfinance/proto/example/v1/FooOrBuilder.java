// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: example/v1/style.proto

package com.jfinance.proto.example.v1;

public interface FooOrBuilder extends
    // @@protoc_insertion_point(interface_extends:jfinance.proto.example.v1.Foo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type is the type of Foo.
   * </pre>
   *
   * <code>.jfinance.proto.example.v1.FooType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Type is the type of Foo.
   * </pre>
   *
   * <code>.jfinance.proto.example.v1.FooType type = 1;</code>
   * @return The type.
   */
  com.jfinance.proto.example.v1.FooType getType();

  /**
   * <code>double why_are_we_using_doubles = 2;</code>
   * @return The whyAreWeUsingDoubles.
   */
  double getWhyAreWeUsingDoubles();

  /**
   * <code>sint32 latitude_micros = 3;</code>
   * @return The latitudeMicros.
   */
  int getLatitudeMicros();

  /**
   * <code>sint32 longitude_micros = 4;</code>
   * @return The longitudeMicros.
   */
  int getLongitudeMicros();

  /**
   * <code>string bar_id = 5;</code>
   * @return The barId.
   */
  java.lang.String getBarId();
  /**
   * <code>string bar_id = 5;</code>
   * @return The bytes for barId.
   */
  com.google.protobuf.ByteString
      getBarIdBytes();

  /**
   * <code>.jfinance.proto.example.dep.v1.Dep dep = 6;</code>
   * @return Whether the dep field is set.
   */
  boolean hasDep();
  /**
   * <code>.jfinance.proto.example.dep.v1.Dep dep = 6;</code>
   * @return The dep.
   */
  com.jfinance.proto.example.dep.v1.Dep getDep();
  /**
   * <code>.jfinance.proto.example.dep.v1.Dep dep = 6;</code>
   */
  com.jfinance.proto.example.dep.v1.DepOrBuilder getDepOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp timestamp = 7;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <code>.google.protobuf.Timestamp timestamp = 7;</code>
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <code>.google.protobuf.Timestamp timestamp = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();
}
