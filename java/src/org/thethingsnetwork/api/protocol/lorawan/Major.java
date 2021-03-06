// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

package org.thethingsnetwork.api.protocol.lorawan;

/**
 * Protobuf enum {@code lorawan.Major}
 */
public enum Major
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LORAWAN_R1 = 0;</code>
   */
  LORAWAN_R1(0),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LORAWAN_R1 = 0;</code>
   */
  public static final int LORAWAN_R1_VALUE = 0;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Major valueOf(int value) {
    return forNumber(value);
  }

  public static Major forNumber(int value) {
    switch (value) {
      case 0: return LORAWAN_R1;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Major>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Major> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Major>() {
          public Major findValueByNumber(int number) {
            return Major.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.thethingsnetwork.api.protocol.lorawan.LoRaWANProtocolProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final Major[] VALUES = values();

  public static Major valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Major(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:lorawan.Major)
}

