// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: example/dep/v1/dep.proto

package com.jfinance.proto.example.dep.v1;

public final class DepProto {
  private DepProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_jfinance_proto_example_dep_v1_Dep_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_jfinance_proto_example_dep_v1_Dep_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030example/dep/v1/dep.proto\022\035jfinance.pro" +
      "to.example.dep.v1\"$\n\003Dep\022\r\n\005value\030\001 \001(\t\022" +
      "\016\n\006value2\030\002 \001(\005B6\n!com.jfinance.proto.ex" +
      "ample.dep.v1B\010DepProtoP\001Z\005deppbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_jfinance_proto_example_dep_v1_Dep_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_jfinance_proto_example_dep_v1_Dep_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_jfinance_proto_example_dep_v1_Dep_descriptor,
        new java.lang.String[] { "Value", "Value2", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
