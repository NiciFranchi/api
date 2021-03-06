// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/discovery/discovery.proto

package org.thethingsnetwork.api.discovery;

public interface AnnouncementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:discovery.Announcement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the component
   * </pre>
   *
   * <code>string id = 1 [(.gogoproto.customname) = "ID"];</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * The ID of the component
   * </pre>
   *
   * <code>string id = 1 [(.gogoproto.customname) = "ID"];</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The name of the component (router/broker/handler)
   * </pre>
   *
   * <code>string service_name = 2;</code>
   */
  java.lang.String getServiceName();
  /**
   * <pre>
   * The name of the component (router/broker/handler)
   * </pre>
   *
   * <code>string service_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getServiceNameBytes();

  /**
   * <pre>
   * Service version in the form "[version]-[commit] ([build date])"
   * </pre>
   *
   * <code>string service_version = 3;</code>
   */
  java.lang.String getServiceVersion();
  /**
   * <pre>
   * Service version in the form "[version]-[commit] ([build date])"
   * </pre>
   *
   * <code>string service_version = 3;</code>
   */
  com.google.protobuf.ByteString
      getServiceVersionBytes();

  /**
   * <pre>
   * Description of the component
   * </pre>
   *
   * <code>string description = 4;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of the component
   * </pre>
   *
   * <code>string description = 4;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * URL with documentation or more information about this component
   * </pre>
   *
   * <code>string url = 5;</code>
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * URL with documentation or more information about this component
   * </pre>
   *
   * <code>string url = 5;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * Indicates whether this service is part of The Things Network (the public community network)
   * </pre>
   *
   * <code>bool public = 6;</code>
   */
  boolean getPublic();

  /**
   * <pre>
   * Comma-separated network addresses in the form "domain1:port,domain2:port,domain3:port" (currently we only use the first)
   * </pre>
   *
   * <code>string net_address = 11;</code>
   */
  java.lang.String getNetAddress();
  /**
   * <pre>
   * Comma-separated network addresses in the form "domain1:port,domain2:port,domain3:port" (currently we only use the first)
   * </pre>
   *
   * <code>string net_address = 11;</code>
   */
  com.google.protobuf.ByteString
      getNetAddressBytes();

  /**
   * <pre>
   * ECDSA public key of this component
   * </pre>
   *
   * <code>string public_key = 12;</code>
   */
  java.lang.String getPublicKey();
  /**
   * <pre>
   * ECDSA public key of this component
   * </pre>
   *
   * <code>string public_key = 12;</code>
   */
  com.google.protobuf.ByteString
      getPublicKeyBytes();

  /**
   * <pre>
   * TLS Certificate for gRPC on net_address (if TLS is enabled)
   * </pre>
   *
   * <code>string certificate = 13;</code>
   */
  java.lang.String getCertificate();
  /**
   * <pre>
   * TLS Certificate for gRPC on net_address (if TLS is enabled)
   * </pre>
   *
   * <code>string certificate = 13;</code>
   */
  com.google.protobuf.ByteString
      getCertificateBytes();

  /**
   * <pre>
   * Contains the address where the HTTP API is exposed (if there is one).
   * Format of api_address: `http(s)://domain(:port)`
   * default http port is 80, default https port is 443.
   * </pre>
   *
   * <code>string api_address = 14;</code>
   */
  java.lang.String getApiAddress();
  /**
   * <pre>
   * Contains the address where the HTTP API is exposed (if there is one).
   * Format of api_address: `http(s)://domain(:port)`
   * default http port is 80, default https port is 443.
   * </pre>
   *
   * <code>string api_address = 14;</code>
   */
  com.google.protobuf.ByteString
      getApiAddressBytes();

  /**
   * <pre>
   * Contains the address where the MQTT API is exposed (if there is one)
   * Format of mqtt_address: `(mqtt(s)://)host(:port)`
   * default mqtt port is 1883, default mqtts port is 8883.
   * Examples:
   * if `host:port` then `mqtt://host:port`
   * if `host:8883` then `mqtts://host:8883`
   * if `host` then `mqtt://host:1883` and `mqtts://host:8883`
   * if `mqtt://host` then `mqtt://host:1883`
   * if `mqtts://host` then `mqtt://host:1883` and `mqtts://host:8883`
   * </pre>
   *
   * <code>string mqtt_address = 15;</code>
   */
  java.lang.String getMqttAddress();
  /**
   * <pre>
   * Contains the address where the MQTT API is exposed (if there is one)
   * Format of mqtt_address: `(mqtt(s)://)host(:port)`
   * default mqtt port is 1883, default mqtts port is 8883.
   * Examples:
   * if `host:port` then `mqtt://host:port`
   * if `host:8883` then `mqtts://host:8883`
   * if `host` then `mqtt://host:1883` and `mqtts://host:8883`
   * if `mqtt://host` then `mqtt://host:1883`
   * if `mqtts://host` then `mqtt://host:1883` and `mqtts://host:8883`
   * </pre>
   *
   * <code>string mqtt_address = 15;</code>
   */
  com.google.protobuf.ByteString
      getMqttAddressBytes();

  /**
   * <pre>
   * Contains the address where the AMQP API is exposed (if there is one)
   * Format of amqp_address: `(amqp(s)://)host(:port)`
   * default amqp port is 5672, default amqps port is 5671.
   * Examples:
   * if `host:port` then `amqp://host:port`
   * if `host:5671` then `amqps://host:5671`
   * if `host` then `amqp://host:5672` and `amqps://host:5671`
   * if `amqp://host` then `amqp://host:5672`
   * if `amqps://host` then `amqp://host:5672` and `amqps://host:5671`
   * </pre>
   *
   * <code>string amqp_address = 16;</code>
   */
  java.lang.String getAmqpAddress();
  /**
   * <pre>
   * Contains the address where the AMQP API is exposed (if there is one)
   * Format of amqp_address: `(amqp(s)://)host(:port)`
   * default amqp port is 5672, default amqps port is 5671.
   * Examples:
   * if `host:port` then `amqp://host:port`
   * if `host:5671` then `amqps://host:5671`
   * if `host` then `amqp://host:5672` and `amqps://host:5671`
   * if `amqp://host` then `amqp://host:5672`
   * if `amqps://host` then `amqp://host:5672` and `amqps://host:5671`
   * </pre>
   *
   * <code>string amqp_address = 16;</code>
   */
  com.google.protobuf.ByteString
      getAmqpAddressBytes();

  /**
   * <pre>
   * Metadata for this component
   * </pre>
   *
   * <code>repeated .discovery.Metadata metadata = 22;</code>
   */
  java.util.List<org.thethingsnetwork.api.discovery.Metadata> 
      getMetadataList();
  /**
   * <pre>
   * Metadata for this component
   * </pre>
   *
   * <code>repeated .discovery.Metadata metadata = 22;</code>
   */
  org.thethingsnetwork.api.discovery.Metadata getMetadata(int index);
  /**
   * <pre>
   * Metadata for this component
   * </pre>
   *
   * <code>repeated .discovery.Metadata metadata = 22;</code>
   */
  int getMetadataCount();
  /**
   * <pre>
   * Metadata for this component
   * </pre>
   *
   * <code>repeated .discovery.Metadata metadata = 22;</code>
   */
  java.util.List<? extends org.thethingsnetwork.api.discovery.MetadataOrBuilder> 
      getMetadataOrBuilderList();
  /**
   * <pre>
   * Metadata for this component
   * </pre>
   *
   * <code>repeated .discovery.Metadata metadata = 22;</code>
   */
  org.thethingsnetwork.api.discovery.MetadataOrBuilder getMetadataOrBuilder(
      int index);
}
