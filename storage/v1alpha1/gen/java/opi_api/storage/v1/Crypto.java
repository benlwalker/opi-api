// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.Crypto}
 */
public final class Crypto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.Crypto)
    CryptoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Crypto.newBuilder() to construct.
  private Crypto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Crypto() {
    key_ = com.google.protobuf.ByteString.EMPTY;
    cipher_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Crypto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Crypto(
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
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (id_ != null) {
              subBuilder = id_.toBuilder();
            }
            id_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(id_);
              id_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (volumeId_ != null) {
              subBuilder = volumeId_.toBuilder();
            }
            volumeId_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(volumeId_);
              volumeId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {

            key_ = input.readBytes();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            cipher_ = rawValue;
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
    return opi_api.storage.v1.MiddleendProto.internal_static_opi_api_storage_v1_Crypto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.MiddleendProto.internal_static_opi_api_storage_v1_Crypto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.Crypto.class, opi_api.storage.v1.Crypto.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private opi_api.common.v1.ObjectKey id_;
  /**
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return id_ != null;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getId() {
    return id_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : id_;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getIdOrBuilder() {
    return getId();
  }

  public static final int VOLUME_ID_FIELD_NUMBER = 2;
  private opi_api.common.v1.ObjectKey volumeId_;
  /**
   * <pre>
   * The back/middle-end volume to back this volume
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
   * @return Whether the volumeId field is set.
   */
  @java.lang.Override
  public boolean hasVolumeId() {
    return volumeId_ != null;
  }
  /**
   * <pre>
   * The back/middle-end volume to back this volume
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
   * @return The volumeId.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getVolumeId() {
    return volumeId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : volumeId_;
  }
  /**
   * <pre>
   * The back/middle-end volume to back this volume
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getVolumeIdOrBuilder() {
    return getVolumeId();
  }

  public static final int KEY_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString key_;
  /**
   * <pre>
   * Key to be used for encryption
   * </pre>
   *
   * <code>bytes key = 3;</code>
   * @return The key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int CIPHER_FIELD_NUMBER = 4;
  private int cipher_;
  /**
   * <pre>
   * Cipher to use
   * </pre>
   *
   * <code>.opi_api.storage.v1.CryptoType cipher = 4;</code>
   * @return The enum numeric value on the wire for cipher.
   */
  @java.lang.Override public int getCipherValue() {
    return cipher_;
  }
  /**
   * <pre>
   * Cipher to use
   * </pre>
   *
   * <code>.opi_api.storage.v1.CryptoType cipher = 4;</code>
   * @return The cipher.
   */
  @java.lang.Override public opi_api.storage.v1.CryptoType getCipher() {
    @SuppressWarnings("deprecation")
    opi_api.storage.v1.CryptoType result = opi_api.storage.v1.CryptoType.valueOf(cipher_);
    return result == null ? opi_api.storage.v1.CryptoType.UNRECOGNIZED : result;
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
    if (id_ != null) {
      output.writeMessage(1, getId());
    }
    if (volumeId_ != null) {
      output.writeMessage(2, getVolumeId());
    }
    if (!key_.isEmpty()) {
      output.writeBytes(3, key_);
    }
    if (cipher_ != opi_api.storage.v1.CryptoType.CRYPTO_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(4, cipher_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getId());
    }
    if (volumeId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVolumeId());
    }
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, key_);
    }
    if (cipher_ != opi_api.storage.v1.CryptoType.CRYPTO_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, cipher_);
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
    if (!(obj instanceof opi_api.storage.v1.Crypto)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.Crypto other = (opi_api.storage.v1.Crypto) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (hasVolumeId() != other.hasVolumeId()) return false;
    if (hasVolumeId()) {
      if (!getVolumeId()
          .equals(other.getVolumeId())) return false;
    }
    if (!getKey()
        .equals(other.getKey())) return false;
    if (cipher_ != other.cipher_) return false;
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
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
    }
    if (hasVolumeId()) {
      hash = (37 * hash) + VOLUME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getVolumeId().hashCode();
    }
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + CIPHER_FIELD_NUMBER;
    hash = (53 * hash) + cipher_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.Crypto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.Crypto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.Crypto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.Crypto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.Crypto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.Crypto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.Crypto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.Crypto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.Crypto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.Crypto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.Crypto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.Crypto parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.Crypto prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.Crypto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.Crypto)
      opi_api.storage.v1.CryptoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.MiddleendProto.internal_static_opi_api_storage_v1_Crypto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.MiddleendProto.internal_static_opi_api_storage_v1_Crypto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.Crypto.class, opi_api.storage.v1.Crypto.Builder.class);
    }

    // Construct using opi_api.storage.v1.Crypto.newBuilder()
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
      if (idBuilder_ == null) {
        id_ = null;
      } else {
        id_ = null;
        idBuilder_ = null;
      }
      if (volumeIdBuilder_ == null) {
        volumeId_ = null;
      } else {
        volumeId_ = null;
        volumeIdBuilder_ = null;
      }
      key_ = com.google.protobuf.ByteString.EMPTY;

      cipher_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.MiddleendProto.internal_static_opi_api_storage_v1_Crypto_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.Crypto getDefaultInstanceForType() {
      return opi_api.storage.v1.Crypto.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.Crypto build() {
      opi_api.storage.v1.Crypto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.Crypto buildPartial() {
      opi_api.storage.v1.Crypto result = new opi_api.storage.v1.Crypto(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (volumeIdBuilder_ == null) {
        result.volumeId_ = volumeId_;
      } else {
        result.volumeId_ = volumeIdBuilder_.build();
      }
      result.key_ = key_;
      result.cipher_ = cipher_;
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
      if (other instanceof opi_api.storage.v1.Crypto) {
        return mergeFrom((opi_api.storage.v1.Crypto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.Crypto other) {
      if (other == opi_api.storage.v1.Crypto.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasVolumeId()) {
        mergeVolumeId(other.getVolumeId());
      }
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.cipher_ != 0) {
        setCipherValue(other.getCipherValue());
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
      opi_api.storage.v1.Crypto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.Crypto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.common.v1.ObjectKey id_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> idBuilder_;
    /**
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return idBuilder_ != null || id_ != null;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     * @return The id.
     */
    public opi_api.common.v1.ObjectKey getId() {
      if (idBuilder_ == null) {
        return id_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : id_;
      } else {
        return idBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public Builder setId(opi_api.common.v1.ObjectKey value) {
      if (idBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        id_ = value;
        onChanged();
      } else {
        idBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public Builder setId(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (idBuilder_ == null) {
        id_ = builderForValue.build();
        onChanged();
      } else {
        idBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public Builder mergeId(opi_api.common.v1.ObjectKey value) {
      if (idBuilder_ == null) {
        if (id_ != null) {
          id_ =
            opi_api.common.v1.ObjectKey.newBuilder(id_).mergeFrom(value).buildPartial();
        } else {
          id_ = value;
        }
        onChanged();
      } else {
        idBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public Builder clearId() {
      if (idBuilder_ == null) {
        id_ = null;
        onChanged();
      } else {
        id_ = null;
        idBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getIdBuilder() {
      
      onChanged();
      return getIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getIdOrBuilder() {
      if (idBuilder_ != null) {
        return idBuilder_.getMessageOrBuilder();
      } else {
        return id_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : id_;
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        idBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getId(),
                getParentForChildren(),
                isClean());
        id_ = null;
      }
      return idBuilder_;
    }

    private opi_api.common.v1.ObjectKey volumeId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> volumeIdBuilder_;
    /**
     * <pre>
     * The back/middle-end volume to back this volume
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
     * @return Whether the volumeId field is set.
     */
    public boolean hasVolumeId() {
      return volumeIdBuilder_ != null || volumeId_ != null;
    }
    /**
     * <pre>
     * The back/middle-end volume to back this volume
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
     * @return The volumeId.
     */
    public opi_api.common.v1.ObjectKey getVolumeId() {
      if (volumeIdBuilder_ == null) {
        return volumeId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : volumeId_;
      } else {
        return volumeIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The back/middle-end volume to back this volume
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
     */
    public Builder setVolumeId(opi_api.common.v1.ObjectKey value) {
      if (volumeIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        volumeId_ = value;
        onChanged();
      } else {
        volumeIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The back/middle-end volume to back this volume
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
     */
    public Builder setVolumeId(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (volumeIdBuilder_ == null) {
        volumeId_ = builderForValue.build();
        onChanged();
      } else {
        volumeIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The back/middle-end volume to back this volume
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
     */
    public Builder mergeVolumeId(opi_api.common.v1.ObjectKey value) {
      if (volumeIdBuilder_ == null) {
        if (volumeId_ != null) {
          volumeId_ =
            opi_api.common.v1.ObjectKey.newBuilder(volumeId_).mergeFrom(value).buildPartial();
        } else {
          volumeId_ = value;
        }
        onChanged();
      } else {
        volumeIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The back/middle-end volume to back this volume
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
     */
    public Builder clearVolumeId() {
      if (volumeIdBuilder_ == null) {
        volumeId_ = null;
        onChanged();
      } else {
        volumeId_ = null;
        volumeIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The back/middle-end volume to back this volume
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getVolumeIdBuilder() {
      
      onChanged();
      return getVolumeIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The back/middle-end volume to back this volume
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getVolumeIdOrBuilder() {
      if (volumeIdBuilder_ != null) {
        return volumeIdBuilder_.getMessageOrBuilder();
      } else {
        return volumeId_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : volumeId_;
      }
    }
    /**
     * <pre>
     * The back/middle-end volume to back this volume
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey volume_id = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getVolumeIdFieldBuilder() {
      if (volumeIdBuilder_ == null) {
        volumeIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getVolumeId(),
                getParentForChildren(),
                isClean());
        volumeId_ = null;
      }
      return volumeIdBuilder_;
    }

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Key to be used for encryption
     * </pre>
     *
     * <code>bytes key = 3;</code>
     * @return The key.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
     * <pre>
     * Key to be used for encryption
     * </pre>
     *
     * <code>bytes key = 3;</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Key to be used for encryption
     * </pre>
     *
     * <code>bytes key = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }

    private int cipher_ = 0;
    /**
     * <pre>
     * Cipher to use
     * </pre>
     *
     * <code>.opi_api.storage.v1.CryptoType cipher = 4;</code>
     * @return The enum numeric value on the wire for cipher.
     */
    @java.lang.Override public int getCipherValue() {
      return cipher_;
    }
    /**
     * <pre>
     * Cipher to use
     * </pre>
     *
     * <code>.opi_api.storage.v1.CryptoType cipher = 4;</code>
     * @param value The enum numeric value on the wire for cipher to set.
     * @return This builder for chaining.
     */
    public Builder setCipherValue(int value) {
      
      cipher_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Cipher to use
     * </pre>
     *
     * <code>.opi_api.storage.v1.CryptoType cipher = 4;</code>
     * @return The cipher.
     */
    @java.lang.Override
    public opi_api.storage.v1.CryptoType getCipher() {
      @SuppressWarnings("deprecation")
      opi_api.storage.v1.CryptoType result = opi_api.storage.v1.CryptoType.valueOf(cipher_);
      return result == null ? opi_api.storage.v1.CryptoType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Cipher to use
     * </pre>
     *
     * <code>.opi_api.storage.v1.CryptoType cipher = 4;</code>
     * @param value The cipher to set.
     * @return This builder for chaining.
     */
    public Builder setCipher(opi_api.storage.v1.CryptoType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      cipher_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Cipher to use
     * </pre>
     *
     * <code>.opi_api.storage.v1.CryptoType cipher = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCipher() {
      
      cipher_ = 0;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.Crypto)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.Crypto)
  private static final opi_api.storage.v1.Crypto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.Crypto();
  }

  public static opi_api.storage.v1.Crypto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Crypto>
      PARSER = new com.google.protobuf.AbstractParser<Crypto>() {
    @java.lang.Override
    public Crypto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Crypto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Crypto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Crypto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.Crypto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

