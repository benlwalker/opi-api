// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_scsi.proto

package opi_api.storage.v1;

public interface DeleteVirtioScsiTargetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.DeleteVirtioScsiTargetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.common.v1.ObjectKey target_id = 1;</code>
   * @return Whether the targetId field is set.
   */
  boolean hasTargetId();
  /**
   * <code>.opi_api.common.v1.ObjectKey target_id = 1;</code>
   * @return The targetId.
   */
  opi_api.common.v1.ObjectKey getTargetId();
  /**
   * <code>.opi_api.common.v1.ObjectKey target_id = 1;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getTargetIdOrBuilder();

  /**
   * <code>.opi_api.common.v1.ObjectKey txn_id = 2;</code>
   * @return Whether the txnId field is set.
   */
  boolean hasTxnId();
  /**
   * <code>.opi_api.common.v1.ObjectKey txn_id = 2;</code>
   * @return The txnId.
   */
  opi_api.common.v1.ObjectKey getTxnId();
  /**
   * <code>.opi_api.common.v1.ObjectKey txn_id = 2;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getTxnIdOrBuilder();
}
