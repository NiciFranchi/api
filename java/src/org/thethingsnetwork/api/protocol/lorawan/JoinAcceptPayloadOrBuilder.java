// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

package org.thethingsnetwork.api.protocol.lorawan;

public interface JoinAcceptPayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lorawan.JoinAcceptPayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes encrypted = 1;</code>
   */
  com.google.protobuf.ByteString getEncrypted();

  /**
   * <code>bytes app_nonce = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppNonce"];</code>
   */
  com.google.protobuf.ByteString getAppNonce();

  /**
   * <code>bytes net_id = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.NetID", (.gogoproto.customname) = "NetID"];</code>
   */
  com.google.protobuf.ByteString getNetId();

  /**
   * <code>bytes dev_addr = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
   */
  com.google.protobuf.ByteString getDevAddr();

  /**
   * <code>.lorawan.DLSettings dl_settings = 5 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
   */
  boolean hasDlSettings();
  /**
   * <code>.lorawan.DLSettings dl_settings = 5 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
   */
  org.thethingsnetwork.api.protocol.lorawan.DLSettings getDlSettings();
  /**
   * <code>.lorawan.DLSettings dl_settings = 5 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
   */
  org.thethingsnetwork.api.protocol.lorawan.DLSettingsOrBuilder getDlSettingsOrBuilder();

  /**
   * <code>uint32 rx_delay = 6;</code>
   */
  int getRxDelay();

  /**
   * <code>.lorawan.CFList cf_list = 7 [(.gogoproto.customname) = "CFList"];</code>
   */
  boolean hasCfList();
  /**
   * <code>.lorawan.CFList cf_list = 7 [(.gogoproto.customname) = "CFList"];</code>
   */
  org.thethingsnetwork.api.protocol.lorawan.CFList getCfList();
  /**
   * <code>.lorawan.CFList cf_list = 7 [(.gogoproto.customname) = "CFList"];</code>
   */
  org.thethingsnetwork.api.protocol.lorawan.CFListOrBuilder getCfListOrBuilder();
}
