// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.ListNVMfRemoteNamespacesResponse}
 */
public final class ListNVMfRemoteNamespacesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.ListNVMfRemoteNamespacesResponse)
    ListNVMfRemoteNamespacesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListNVMfRemoteNamespacesResponse.newBuilder() to construct.
  private ListNVMfRemoteNamespacesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListNVMfRemoteNamespacesResponse() {
    nvMfRemoteNamespaces_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListNVMfRemoteNamespacesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListNVMfRemoteNamespacesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              nvMfRemoteNamespaces_ = new java.util.ArrayList<opi_api.storage.v1.NVMfRemoteNamespace>();
              mutable_bitField0_ |= 0x00000001;
            }
            nvMfRemoteNamespaces_.add(
                input.readMessage(opi_api.storage.v1.NVMfRemoteNamespace.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        nvMfRemoteNamespaces_ = java.util.Collections.unmodifiableList(nvMfRemoteNamespaces_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_ListNVMfRemoteNamespacesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_ListNVMfRemoteNamespacesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.ListNVMfRemoteNamespacesResponse.class, opi_api.storage.v1.ListNVMfRemoteNamespacesResponse.Builder.class);
  }

  public static final int NV_MF_REMOTE_NAMESPACES_FIELD_NUMBER = 1;
  private java.util.List<opi_api.storage.v1.NVMfRemoteNamespace> nvMfRemoteNamespaces_;
  /**
   * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.storage.v1.NVMfRemoteNamespace> getNvMfRemoteNamespacesList() {
    return nvMfRemoteNamespaces_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.storage.v1.NVMfRemoteNamespaceOrBuilder> 
      getNvMfRemoteNamespacesOrBuilderList() {
    return nvMfRemoteNamespaces_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
   */
  @java.lang.Override
  public int getNvMfRemoteNamespacesCount() {
    return nvMfRemoteNamespaces_.size();
  }
  /**
   * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMfRemoteNamespace getNvMfRemoteNamespaces(int index) {
    return nvMfRemoteNamespaces_.get(index);
  }
  /**
   * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMfRemoteNamespaceOrBuilder getNvMfRemoteNamespacesOrBuilder(
      int index) {
    return nvMfRemoteNamespaces_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < nvMfRemoteNamespaces_.size(); i++) {
      output.writeMessage(1, nvMfRemoteNamespaces_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < nvMfRemoteNamespaces_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, nvMfRemoteNamespaces_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof opi_api.storage.v1.ListNVMfRemoteNamespacesResponse)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.ListNVMfRemoteNamespacesResponse other = (opi_api.storage.v1.ListNVMfRemoteNamespacesResponse) obj;

    if (!getNvMfRemoteNamespacesList()
        .equals(other.getNvMfRemoteNamespacesList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getNvMfRemoteNamespacesCount() > 0) {
      hash = (37 * hash) + NV_MF_REMOTE_NAMESPACES_FIELD_NUMBER;
      hash = (53 * hash) + getNvMfRemoteNamespacesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.ListNVMfRemoteNamespacesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNVMfRemoteNamespacesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNVMfRemoteNamespacesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNVMfRemoteNamespacesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNVMfRemoteNamespacesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListNVMfRemoteNamespacesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNVMfRemoteNamespacesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNVMfRemoteNamespacesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNVMfRemoteNamespacesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNVMfRemoteNamespacesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListNVMfRemoteNamespacesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListNVMfRemoteNamespacesResponse parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.ListNVMfRemoteNamespacesResponse prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.ListNVMfRemoteNamespacesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.ListNVMfRemoteNamespacesResponse)
      opi_api.storage.v1.ListNVMfRemoteNamespacesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_ListNVMfRemoteNamespacesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_ListNVMfRemoteNamespacesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.ListNVMfRemoteNamespacesResponse.class, opi_api.storage.v1.ListNVMfRemoteNamespacesResponse.Builder.class);
    }

    // Construct using opi_api.storage.v1.ListNVMfRemoteNamespacesResponse.newBuilder()
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
        getNvMfRemoteNamespacesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (nvMfRemoteNamespacesBuilder_ == null) {
        nvMfRemoteNamespaces_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        nvMfRemoteNamespacesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_ListNVMfRemoteNamespacesResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNVMfRemoteNamespacesResponse getDefaultInstanceForType() {
      return opi_api.storage.v1.ListNVMfRemoteNamespacesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNVMfRemoteNamespacesResponse build() {
      opi_api.storage.v1.ListNVMfRemoteNamespacesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListNVMfRemoteNamespacesResponse buildPartial() {
      opi_api.storage.v1.ListNVMfRemoteNamespacesResponse result = new opi_api.storage.v1.ListNVMfRemoteNamespacesResponse(this);
      int from_bitField0_ = bitField0_;
      if (nvMfRemoteNamespacesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          nvMfRemoteNamespaces_ = java.util.Collections.unmodifiableList(nvMfRemoteNamespaces_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nvMfRemoteNamespaces_ = nvMfRemoteNamespaces_;
      } else {
        result.nvMfRemoteNamespaces_ = nvMfRemoteNamespacesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof opi_api.storage.v1.ListNVMfRemoteNamespacesResponse) {
        return mergeFrom((opi_api.storage.v1.ListNVMfRemoteNamespacesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.ListNVMfRemoteNamespacesResponse other) {
      if (other == opi_api.storage.v1.ListNVMfRemoteNamespacesResponse.getDefaultInstance()) return this;
      if (nvMfRemoteNamespacesBuilder_ == null) {
        if (!other.nvMfRemoteNamespaces_.isEmpty()) {
          if (nvMfRemoteNamespaces_.isEmpty()) {
            nvMfRemoteNamespaces_ = other.nvMfRemoteNamespaces_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNvMfRemoteNamespacesIsMutable();
            nvMfRemoteNamespaces_.addAll(other.nvMfRemoteNamespaces_);
          }
          onChanged();
        }
      } else {
        if (!other.nvMfRemoteNamespaces_.isEmpty()) {
          if (nvMfRemoteNamespacesBuilder_.isEmpty()) {
            nvMfRemoteNamespacesBuilder_.dispose();
            nvMfRemoteNamespacesBuilder_ = null;
            nvMfRemoteNamespaces_ = other.nvMfRemoteNamespaces_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nvMfRemoteNamespacesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNvMfRemoteNamespacesFieldBuilder() : null;
          } else {
            nvMfRemoteNamespacesBuilder_.addAllMessages(other.nvMfRemoteNamespaces_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      opi_api.storage.v1.ListNVMfRemoteNamespacesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.ListNVMfRemoteNamespacesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.storage.v1.NVMfRemoteNamespace> nvMfRemoteNamespaces_ =
      java.util.Collections.emptyList();
    private void ensureNvMfRemoteNamespacesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nvMfRemoteNamespaces_ = new java.util.ArrayList<opi_api.storage.v1.NVMfRemoteNamespace>(nvMfRemoteNamespaces_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.NVMfRemoteNamespace, opi_api.storage.v1.NVMfRemoteNamespace.Builder, opi_api.storage.v1.NVMfRemoteNamespaceOrBuilder> nvMfRemoteNamespacesBuilder_;

    /**
     * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.NVMfRemoteNamespace> getNvMfRemoteNamespacesList() {
      if (nvMfRemoteNamespacesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(nvMfRemoteNamespaces_);
      } else {
        return nvMfRemoteNamespacesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
     */
    public int getNvMfRemoteNamespacesCount() {
      if (nvMfRemoteNamespacesBuilder_ == null) {
        return nvMfRemoteNamespaces_.size();
      } else {
        return nvMfRemoteNamespacesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
     */
    public opi_api.storage.v1.NVMfRemoteNamespace getNvMfRemoteNamespaces(int index) {
      if (nvMfRemoteNamespacesBuilder_ == null) {
        return nvMfRemoteNamespaces_.get(index);
      } else {
        return nvMfRemoteNamespacesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
     */
    public Builder setNvMfRemoteNamespaces(
        int index, opi_api.storage.v1.NVMfRemoteNamespace value) {
      if (nvMfRemoteNamespacesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNvMfRemoteNamespacesIsMutable();
        nvMfRemoteNamespaces_.set(index, value);
        onChanged();
      } else {
        nvMfRemoteNamespacesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
     */
    public Builder setNvMfRemoteNamespaces(
        int index, opi_api.storage.v1.NVMfRemoteNamespace.Builder builderForValue) {
      if (nvMfRemoteNamespacesBuilder_ == null) {
        ensureNvMfRemoteNamespacesIsMutable();
        nvMfRemoteNamespaces_.set(index, builderForValue.build());
        onChanged();
      } else {
        nvMfRemoteNamespacesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
     */
    public Builder addNvMfRemoteNamespaces(opi_api.storage.v1.NVMfRemoteNamespace value) {
      if (nvMfRemoteNamespacesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNvMfRemoteNamespacesIsMutable();
        nvMfRemoteNamespaces_.add(value);
        onChanged();
      } else {
        nvMfRemoteNamespacesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
     */
    public Builder addNvMfRemoteNamespaces(
        int index, opi_api.storage.v1.NVMfRemoteNamespace value) {
      if (nvMfRemoteNamespacesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNvMfRemoteNamespacesIsMutable();
        nvMfRemoteNamespaces_.add(index, value);
        onChanged();
      } else {
        nvMfRemoteNamespacesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
     */
    public Builder addNvMfRemoteNamespaces(
        opi_api.storage.v1.NVMfRemoteNamespace.Builder builderForValue) {
      if (nvMfRemoteNamespacesBuilder_ == null) {
        ensureNvMfRemoteNamespacesIsMutable();
        nvMfRemoteNamespaces_.add(builderForValue.build());
        onChanged();
      } else {
        nvMfRemoteNamespacesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
     */
    public Builder addNvMfRemoteNamespaces(
        int index, opi_api.storage.v1.NVMfRemoteNamespace.Builder builderForValue) {
      if (nvMfRemoteNamespacesBuilder_ == null) {
        ensureNvMfRemoteNamespacesIsMutable();
        nvMfRemoteNamespaces_.add(index, builderForValue.build());
        onChanged();
      } else {
        nvMfRemoteNamespacesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
     */
    public Builder addAllNvMfRemoteNamespaces(
        java.lang.Iterable<? extends opi_api.storage.v1.NVMfRemoteNamespace> values) {
      if (nvMfRemoteNamespacesBuilder_ == null) {
        ensureNvMfRemoteNamespacesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nvMfRemoteNamespaces_);
        onChanged();
      } else {
        nvMfRemoteNamespacesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
     */
    public Builder clearNvMfRemoteNamespaces() {
      if (nvMfRemoteNamespacesBuilder_ == null) {
        nvMfRemoteNamespaces_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nvMfRemoteNamespacesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
     */
    public Builder removeNvMfRemoteNamespaces(int index) {
      if (nvMfRemoteNamespacesBuilder_ == null) {
        ensureNvMfRemoteNamespacesIsMutable();
        nvMfRemoteNamespaces_.remove(index);
        onChanged();
      } else {
        nvMfRemoteNamespacesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
     */
    public opi_api.storage.v1.NVMfRemoteNamespace.Builder getNvMfRemoteNamespacesBuilder(
        int index) {
      return getNvMfRemoteNamespacesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
     */
    public opi_api.storage.v1.NVMfRemoteNamespaceOrBuilder getNvMfRemoteNamespacesOrBuilder(
        int index) {
      if (nvMfRemoteNamespacesBuilder_ == null) {
        return nvMfRemoteNamespaces_.get(index);  } else {
        return nvMfRemoteNamespacesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
     */
    public java.util.List<? extends opi_api.storage.v1.NVMfRemoteNamespaceOrBuilder> 
         getNvMfRemoteNamespacesOrBuilderList() {
      if (nvMfRemoteNamespacesBuilder_ != null) {
        return nvMfRemoteNamespacesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(nvMfRemoteNamespaces_);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
     */
    public opi_api.storage.v1.NVMfRemoteNamespace.Builder addNvMfRemoteNamespacesBuilder() {
      return getNvMfRemoteNamespacesFieldBuilder().addBuilder(
          opi_api.storage.v1.NVMfRemoteNamespace.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
     */
    public opi_api.storage.v1.NVMfRemoteNamespace.Builder addNvMfRemoteNamespacesBuilder(
        int index) {
      return getNvMfRemoteNamespacesFieldBuilder().addBuilder(
          index, opi_api.storage.v1.NVMfRemoteNamespace.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.NVMfRemoteNamespace nv_mf_remote_namespaces = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.NVMfRemoteNamespace.Builder> 
         getNvMfRemoteNamespacesBuilderList() {
      return getNvMfRemoteNamespacesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.NVMfRemoteNamespace, opi_api.storage.v1.NVMfRemoteNamespace.Builder, opi_api.storage.v1.NVMfRemoteNamespaceOrBuilder> 
        getNvMfRemoteNamespacesFieldBuilder() {
      if (nvMfRemoteNamespacesBuilder_ == null) {
        nvMfRemoteNamespacesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.storage.v1.NVMfRemoteNamespace, opi_api.storage.v1.NVMfRemoteNamespace.Builder, opi_api.storage.v1.NVMfRemoteNamespaceOrBuilder>(
                nvMfRemoteNamespaces_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        nvMfRemoteNamespaces_ = null;
      }
      return nvMfRemoteNamespacesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.ListNVMfRemoteNamespacesResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNVMfRemoteNamespacesResponse)
  private static final opi_api.storage.v1.ListNVMfRemoteNamespacesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.ListNVMfRemoteNamespacesResponse();
  }

  public static opi_api.storage.v1.ListNVMfRemoteNamespacesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNVMfRemoteNamespacesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListNVMfRemoteNamespacesResponse>() {
    @java.lang.Override
    public ListNVMfRemoteNamespacesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListNVMfRemoteNamespacesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListNVMfRemoteNamespacesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNVMfRemoteNamespacesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.ListNVMfRemoteNamespacesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

