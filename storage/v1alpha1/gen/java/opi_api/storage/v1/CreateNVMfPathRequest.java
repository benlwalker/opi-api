// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.CreateNVMfPathRequest}
 */
public final class CreateNVMfPathRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.CreateNVMfPathRequest)
    CreateNVMfPathRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateNVMfPathRequest.newBuilder() to construct.
  private CreateNVMfPathRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateNVMfPathRequest() {
    nvMfPathId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateNVMfPathRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateNVMfPathRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            opi_api.storage.v1.NVMfPath.Builder subBuilder = null;
            if (nvMfPath_ != null) {
              subBuilder = nvMfPath_.toBuilder();
            }
            nvMfPath_ = input.readMessage(opi_api.storage.v1.NVMfPath.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(nvMfPath_);
              nvMfPath_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nvMfPathId_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_CreateNVMfPathRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_CreateNVMfPathRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.CreateNVMfPathRequest.class, opi_api.storage.v1.CreateNVMfPathRequest.Builder.class);
  }

  public static final int NV_MF_PATH_FIELD_NUMBER = 1;
  private opi_api.storage.v1.NVMfPath nvMfPath_;
  /**
   * <code>.opi_api.storage.v1.NVMfPath nv_mf_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nvMfPath field is set.
   */
  @java.lang.Override
  public boolean hasNvMfPath() {
    return nvMfPath_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.NVMfPath nv_mf_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nvMfPath.
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMfPath getNvMfPath() {
    return nvMfPath_ == null ? opi_api.storage.v1.NVMfPath.getDefaultInstance() : nvMfPath_;
  }
  /**
   * <code>.opi_api.storage.v1.NVMfPath nv_mf_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMfPathOrBuilder getNvMfPathOrBuilder() {
    return getNvMfPath();
  }

  public static final int NV_MF_PATH_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object nvMfPathId_;
  /**
   * <code>string nv_mf_path_id = 2;</code>
   * @return The nvMfPathId.
   */
  @java.lang.Override
  public java.lang.String getNvMfPathId() {
    java.lang.Object ref = nvMfPathId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nvMfPathId_ = s;
      return s;
    }
  }
  /**
   * <code>string nv_mf_path_id = 2;</code>
   * @return The bytes for nvMfPathId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNvMfPathIdBytes() {
    java.lang.Object ref = nvMfPathId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nvMfPathId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (nvMfPath_ != null) {
      output.writeMessage(1, getNvMfPath());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nvMfPathId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nvMfPathId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nvMfPath_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNvMfPath());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nvMfPathId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nvMfPathId_);
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
    if (!(obj instanceof opi_api.storage.v1.CreateNVMfPathRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.CreateNVMfPathRequest other = (opi_api.storage.v1.CreateNVMfPathRequest) obj;

    if (hasNvMfPath() != other.hasNvMfPath()) return false;
    if (hasNvMfPath()) {
      if (!getNvMfPath()
          .equals(other.getNvMfPath())) return false;
    }
    if (!getNvMfPathId()
        .equals(other.getNvMfPathId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasNvMfPath()) {
      hash = (37 * hash) + NV_MF_PATH_FIELD_NUMBER;
      hash = (53 * hash) + getNvMfPath().hashCode();
    }
    hash = (37 * hash) + NV_MF_PATH_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNvMfPathId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.CreateNVMfPathRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNVMfPathRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNVMfPathRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNVMfPathRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNVMfPathRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNVMfPathRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNVMfPathRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNVMfPathRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNVMfPathRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNVMfPathRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNVMfPathRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNVMfPathRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(opi_api.storage.v1.CreateNVMfPathRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code opi_api.storage.v1.CreateNVMfPathRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.CreateNVMfPathRequest)
      opi_api.storage.v1.CreateNVMfPathRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_CreateNVMfPathRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_CreateNVMfPathRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.CreateNVMfPathRequest.class, opi_api.storage.v1.CreateNVMfPathRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.CreateNVMfPathRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (nvMfPathBuilder_ == null) {
        nvMfPath_ = null;
      } else {
        nvMfPath_ = null;
        nvMfPathBuilder_ = null;
      }
      nvMfPathId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_CreateNVMfPathRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNVMfPathRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.CreateNVMfPathRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNVMfPathRequest build() {
      opi_api.storage.v1.CreateNVMfPathRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNVMfPathRequest buildPartial() {
      opi_api.storage.v1.CreateNVMfPathRequest result = new opi_api.storage.v1.CreateNVMfPathRequest(this);
      if (nvMfPathBuilder_ == null) {
        result.nvMfPath_ = nvMfPath_;
      } else {
        result.nvMfPath_ = nvMfPathBuilder_.build();
      }
      result.nvMfPathId_ = nvMfPathId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof opi_api.storage.v1.CreateNVMfPathRequest) {
        return mergeFrom((opi_api.storage.v1.CreateNVMfPathRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.CreateNVMfPathRequest other) {
      if (other == opi_api.storage.v1.CreateNVMfPathRequest.getDefaultInstance()) return this;
      if (other.hasNvMfPath()) {
        mergeNvMfPath(other.getNvMfPath());
      }
      if (!other.getNvMfPathId().isEmpty()) {
        nvMfPathId_ = other.nvMfPathId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      opi_api.storage.v1.CreateNVMfPathRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.CreateNVMfPathRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.storage.v1.NVMfPath nvMfPath_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NVMfPath, opi_api.storage.v1.NVMfPath.Builder, opi_api.storage.v1.NVMfPathOrBuilder> nvMfPathBuilder_;
    /**
     * <code>.opi_api.storage.v1.NVMfPath nv_mf_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the nvMfPath field is set.
     */
    public boolean hasNvMfPath() {
      return nvMfPathBuilder_ != null || nvMfPath_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.NVMfPath nv_mf_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The nvMfPath.
     */
    public opi_api.storage.v1.NVMfPath getNvMfPath() {
      if (nvMfPathBuilder_ == null) {
        return nvMfPath_ == null ? opi_api.storage.v1.NVMfPath.getDefaultInstance() : nvMfPath_;
      } else {
        return nvMfPathBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.storage.v1.NVMfPath nv_mf_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNvMfPath(opi_api.storage.v1.NVMfPath value) {
      if (nvMfPathBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nvMfPath_ = value;
        onChanged();
      } else {
        nvMfPathBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMfPath nv_mf_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNvMfPath(
        opi_api.storage.v1.NVMfPath.Builder builderForValue) {
      if (nvMfPathBuilder_ == null) {
        nvMfPath_ = builderForValue.build();
        onChanged();
      } else {
        nvMfPathBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMfPath nv_mf_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeNvMfPath(opi_api.storage.v1.NVMfPath value) {
      if (nvMfPathBuilder_ == null) {
        if (nvMfPath_ != null) {
          nvMfPath_ =
            opi_api.storage.v1.NVMfPath.newBuilder(nvMfPath_).mergeFrom(value).buildPartial();
        } else {
          nvMfPath_ = value;
        }
        onChanged();
      } else {
        nvMfPathBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMfPath nv_mf_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearNvMfPath() {
      if (nvMfPathBuilder_ == null) {
        nvMfPath_ = null;
        onChanged();
      } else {
        nvMfPath_ = null;
        nvMfPathBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMfPath nv_mf_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.NVMfPath.Builder getNvMfPathBuilder() {
      
      onChanged();
      return getNvMfPathFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.NVMfPath nv_mf_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.NVMfPathOrBuilder getNvMfPathOrBuilder() {
      if (nvMfPathBuilder_ != null) {
        return nvMfPathBuilder_.getMessageOrBuilder();
      } else {
        return nvMfPath_ == null ?
            opi_api.storage.v1.NVMfPath.getDefaultInstance() : nvMfPath_;
      }
    }
    /**
     * <code>.opi_api.storage.v1.NVMfPath nv_mf_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NVMfPath, opi_api.storage.v1.NVMfPath.Builder, opi_api.storage.v1.NVMfPathOrBuilder> 
        getNvMfPathFieldBuilder() {
      if (nvMfPathBuilder_ == null) {
        nvMfPathBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.NVMfPath, opi_api.storage.v1.NVMfPath.Builder, opi_api.storage.v1.NVMfPathOrBuilder>(
                getNvMfPath(),
                getParentForChildren(),
                isClean());
        nvMfPath_ = null;
      }
      return nvMfPathBuilder_;
    }

    private java.lang.Object nvMfPathId_ = "";
    /**
     * <code>string nv_mf_path_id = 2;</code>
     * @return The nvMfPathId.
     */
    public java.lang.String getNvMfPathId() {
      java.lang.Object ref = nvMfPathId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nvMfPathId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nv_mf_path_id = 2;</code>
     * @return The bytes for nvMfPathId.
     */
    public com.google.protobuf.ByteString
        getNvMfPathIdBytes() {
      java.lang.Object ref = nvMfPathId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nvMfPathId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nv_mf_path_id = 2;</code>
     * @param value The nvMfPathId to set.
     * @return This builder for chaining.
     */
    public Builder setNvMfPathId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nvMfPathId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nv_mf_path_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNvMfPathId() {
      
      nvMfPathId_ = getDefaultInstance().getNvMfPathId();
      onChanged();
      return this;
    }
    /**
     * <code>string nv_mf_path_id = 2;</code>
     * @param value The bytes for nvMfPathId to set.
     * @return This builder for chaining.
     */
    public Builder setNvMfPathIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nvMfPathId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.CreateNVMfPathRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateNVMfPathRequest)
  private static final opi_api.storage.v1.CreateNVMfPathRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.CreateNVMfPathRequest();
  }

  public static opi_api.storage.v1.CreateNVMfPathRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateNVMfPathRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateNVMfPathRequest>() {
    @java.lang.Override
    public CreateNVMfPathRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateNVMfPathRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateNVMfPathRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateNVMfPathRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.CreateNVMfPathRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

