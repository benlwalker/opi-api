// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface UpdateNVMeControllerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.UpdateNVMeControllerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.storage.v1.NVMeController controller = 1;</code>
   * @return Whether the controller field is set.
   */
  boolean hasController();
  /**
   * <code>.opi_api.storage.v1.NVMeController controller = 1;</code>
   * @return The controller.
   */
  opi_api.storage.v1.NVMeController getController();
  /**
   * <code>.opi_api.storage.v1.NVMeController controller = 1;</code>
   */
  opi_api.storage.v1.NVMeControllerOrBuilder getControllerOrBuilder();

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
