// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

package org.thethingsnetwork.api.protocol.lorawan;

public interface MACCommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lorawan.MACCommand)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 cid = 1 [(.gogoproto.customname) = "CID"];</code>
   */
  int getCid();

  /**
   * <code>bytes payload = 2;</code>
   */
  com.google.protobuf.ByteString getPayload();
}
