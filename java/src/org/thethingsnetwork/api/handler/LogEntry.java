// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/TheThingsNetwork/api/handler/handler.proto

package org.thethingsnetwork.api.handler;

/**
 * Protobuf type {@code handler.LogEntry}
 */
public  final class LogEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:handler.LogEntry)
    LogEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogEntry.newBuilder() to construct.
  private LogEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogEntry() {
    function_ = "";
    fields_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LogEntry(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            function_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              fields_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            fields_.add(s);
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        fields_ = fields_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_LogEntry_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_LogEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.thethingsnetwork.api.handler.LogEntry.class, org.thethingsnetwork.api.handler.LogEntry.Builder.class);
  }

  private int bitField0_;
  public static final int FUNCTION_FIELD_NUMBER = 1;
  private volatile java.lang.Object function_;
  /**
   * <pre>
   * The location where the log was created (what payload function)
   * </pre>
   *
   * <code>string function = 1;</code>
   */
  public java.lang.String getFunction() {
    java.lang.Object ref = function_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      function_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The location where the log was created (what payload function)
   * </pre>
   *
   * <code>string function = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFunctionBytes() {
    java.lang.Object ref = function_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      function_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIELDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList fields_;
  /**
   * <pre>
   * A list of JSON-encoded fields that were logged
   * </pre>
   *
   * <code>repeated string fields = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getFieldsList() {
    return fields_;
  }
  /**
   * <pre>
   * A list of JSON-encoded fields that were logged
   * </pre>
   *
   * <code>repeated string fields = 2;</code>
   */
  public int getFieldsCount() {
    return fields_.size();
  }
  /**
   * <pre>
   * A list of JSON-encoded fields that were logged
   * </pre>
   *
   * <code>repeated string fields = 2;</code>
   */
  public java.lang.String getFields(int index) {
    return fields_.get(index);
  }
  /**
   * <pre>
   * A list of JSON-encoded fields that were logged
   * </pre>
   *
   * <code>repeated string fields = 2;</code>
   */
  public com.google.protobuf.ByteString
      getFieldsBytes(int index) {
    return fields_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getFunctionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, function_);
    }
    for (int i = 0; i < fields_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fields_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFunctionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, function_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < fields_.size(); i++) {
        dataSize += computeStringSizeNoTag(fields_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFieldsList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.thethingsnetwork.api.handler.LogEntry)) {
      return super.equals(obj);
    }
    org.thethingsnetwork.api.handler.LogEntry other = (org.thethingsnetwork.api.handler.LogEntry) obj;

    boolean result = true;
    result = result && getFunction()
        .equals(other.getFunction());
    result = result && getFieldsList()
        .equals(other.getFieldsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FUNCTION_FIELD_NUMBER;
    hash = (53 * hash) + getFunction().hashCode();
    if (getFieldsCount() > 0) {
      hash = (37 * hash) + FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + getFieldsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.thethingsnetwork.api.handler.LogEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.handler.LogEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.LogEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.handler.LogEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.LogEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.thethingsnetwork.api.handler.LogEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.LogEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.handler.LogEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.LogEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.handler.LogEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.thethingsnetwork.api.handler.LogEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.thethingsnetwork.api.handler.LogEntry parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.thethingsnetwork.api.handler.LogEntry prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code handler.LogEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:handler.LogEntry)
      org.thethingsnetwork.api.handler.LogEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_LogEntry_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_LogEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.thethingsnetwork.api.handler.LogEntry.class, org.thethingsnetwork.api.handler.LogEntry.Builder.class);
    }

    // Construct using org.thethingsnetwork.api.handler.LogEntry.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      function_ = "";

      fields_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.thethingsnetwork.api.handler.HandlerProto.internal_static_handler_LogEntry_descriptor;
    }

    public org.thethingsnetwork.api.handler.LogEntry getDefaultInstanceForType() {
      return org.thethingsnetwork.api.handler.LogEntry.getDefaultInstance();
    }

    public org.thethingsnetwork.api.handler.LogEntry build() {
      org.thethingsnetwork.api.handler.LogEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.thethingsnetwork.api.handler.LogEntry buildPartial() {
      org.thethingsnetwork.api.handler.LogEntry result = new org.thethingsnetwork.api.handler.LogEntry(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.function_ = function_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        fields_ = fields_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.fields_ = fields_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.thethingsnetwork.api.handler.LogEntry) {
        return mergeFrom((org.thethingsnetwork.api.handler.LogEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.thethingsnetwork.api.handler.LogEntry other) {
      if (other == org.thethingsnetwork.api.handler.LogEntry.getDefaultInstance()) return this;
      if (!other.getFunction().isEmpty()) {
        function_ = other.function_;
        onChanged();
      }
      if (!other.fields_.isEmpty()) {
        if (fields_.isEmpty()) {
          fields_ = other.fields_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureFieldsIsMutable();
          fields_.addAll(other.fields_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.thethingsnetwork.api.handler.LogEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.thethingsnetwork.api.handler.LogEntry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object function_ = "";
    /**
     * <pre>
     * The location where the log was created (what payload function)
     * </pre>
     *
     * <code>string function = 1;</code>
     */
    public java.lang.String getFunction() {
      java.lang.Object ref = function_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        function_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The location where the log was created (what payload function)
     * </pre>
     *
     * <code>string function = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFunctionBytes() {
      java.lang.Object ref = function_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        function_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The location where the log was created (what payload function)
     * </pre>
     *
     * <code>string function = 1;</code>
     */
    public Builder setFunction(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      function_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The location where the log was created (what payload function)
     * </pre>
     *
     * <code>string function = 1;</code>
     */
    public Builder clearFunction() {
      
      function_ = getDefaultInstance().getFunction();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The location where the log was created (what payload function)
     * </pre>
     *
     * <code>string function = 1;</code>
     */
    public Builder setFunctionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      function_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList fields_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureFieldsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        fields_ = new com.google.protobuf.LazyStringArrayList(fields_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * A list of JSON-encoded fields that were logged
     * </pre>
     *
     * <code>repeated string fields = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getFieldsList() {
      return fields_.getUnmodifiableView();
    }
    /**
     * <pre>
     * A list of JSON-encoded fields that were logged
     * </pre>
     *
     * <code>repeated string fields = 2;</code>
     */
    public int getFieldsCount() {
      return fields_.size();
    }
    /**
     * <pre>
     * A list of JSON-encoded fields that were logged
     * </pre>
     *
     * <code>repeated string fields = 2;</code>
     */
    public java.lang.String getFields(int index) {
      return fields_.get(index);
    }
    /**
     * <pre>
     * A list of JSON-encoded fields that were logged
     * </pre>
     *
     * <code>repeated string fields = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFieldsBytes(int index) {
      return fields_.getByteString(index);
    }
    /**
     * <pre>
     * A list of JSON-encoded fields that were logged
     * </pre>
     *
     * <code>repeated string fields = 2;</code>
     */
    public Builder setFields(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureFieldsIsMutable();
      fields_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of JSON-encoded fields that were logged
     * </pre>
     *
     * <code>repeated string fields = 2;</code>
     */
    public Builder addFields(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureFieldsIsMutable();
      fields_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of JSON-encoded fields that were logged
     * </pre>
     *
     * <code>repeated string fields = 2;</code>
     */
    public Builder addAllFields(
        java.lang.Iterable<java.lang.String> values) {
      ensureFieldsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, fields_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of JSON-encoded fields that were logged
     * </pre>
     *
     * <code>repeated string fields = 2;</code>
     */
    public Builder clearFields() {
      fields_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of JSON-encoded fields that were logged
     * </pre>
     *
     * <code>repeated string fields = 2;</code>
     */
    public Builder addFieldsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureFieldsIsMutable();
      fields_.add(value);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:handler.LogEntry)
  }

  // @@protoc_insertion_point(class_scope:handler.LogEntry)
  private static final org.thethingsnetwork.api.handler.LogEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.thethingsnetwork.api.handler.LogEntry();
  }

  public static org.thethingsnetwork.api.handler.LogEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogEntry>
      PARSER = new com.google.protobuf.AbstractParser<LogEntry>() {
    public LogEntry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new LogEntry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LogEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogEntry> getParserForType() {
    return PARSER;
  }

  public org.thethingsnetwork.api.handler.LogEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

