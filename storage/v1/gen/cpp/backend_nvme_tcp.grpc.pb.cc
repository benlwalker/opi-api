// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: backend_nvme_tcp.proto

#include "backend_nvme_tcp.pb.h"
#include "backend_nvme_tcp.grpc.pb.h"

#include <functional>
#include <grpcpp/impl/codegen/async_stream.h>
#include <grpcpp/impl/codegen/async_unary_call.h>
#include <grpcpp/impl/codegen/channel_interface.h>
#include <grpcpp/impl/codegen/client_unary_call.h>
#include <grpcpp/impl/codegen/client_callback.h>
#include <grpcpp/impl/codegen/message_allocator.h>
#include <grpcpp/impl/codegen/method_handler.h>
#include <grpcpp/impl/codegen/rpc_service_method.h>
#include <grpcpp/impl/codegen/server_callback.h>
#include <grpcpp/impl/codegen/server_callback_handlers.h>
#include <grpcpp/impl/codegen/server_context.h>
#include <grpcpp/impl/codegen/service_type.h>
#include <grpcpp/impl/codegen/sync_stream.h>
namespace opi_api {
namespace storage {
namespace v1 {

static const char* NVMfRemoteControllerService_method_names[] = {
  "/opi_api.storage.v1.NVMfRemoteControllerService/NVMfRemoteControllerConnect",
  "/opi_api.storage.v1.NVMfRemoteControllerService/NVMfRemoteControllerDisconnect",
  "/opi_api.storage.v1.NVMfRemoteControllerService/NVMfRemoteControllerReset",
  "/opi_api.storage.v1.NVMfRemoteControllerService/NVMfRemoteControllerList",
  "/opi_api.storage.v1.NVMfRemoteControllerService/NVMfRemoteControllerGet",
  "/opi_api.storage.v1.NVMfRemoteControllerService/NVMfRemoteControllerStats",
};

std::unique_ptr< NVMfRemoteControllerService::Stub> NVMfRemoteControllerService::NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options) {
  (void)options;
  std::unique_ptr< NVMfRemoteControllerService::Stub> stub(new NVMfRemoteControllerService::Stub(channel, options));
  return stub;
}

NVMfRemoteControllerService::Stub::Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options)
  : channel_(channel), rpcmethod_NVMfRemoteControllerConnect_(NVMfRemoteControllerService_method_names[0], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_NVMfRemoteControllerDisconnect_(NVMfRemoteControllerService_method_names[1], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_NVMfRemoteControllerReset_(NVMfRemoteControllerService_method_names[2], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_NVMfRemoteControllerList_(NVMfRemoteControllerService_method_names[3], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_NVMfRemoteControllerGet_(NVMfRemoteControllerService_method_names[4], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_NVMfRemoteControllerStats_(NVMfRemoteControllerService_method_names[5], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  {}

::grpc::Status NVMfRemoteControllerService::Stub::NVMfRemoteControllerConnect(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerConnectRequest& request, ::opi_api::storage::v1::NVMfRemoteControllerConnectResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::NVMfRemoteControllerConnectRequest, ::opi_api::storage::v1::NVMfRemoteControllerConnectResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_NVMfRemoteControllerConnect_, context, request, response);
}

void NVMfRemoteControllerService::Stub::async::NVMfRemoteControllerConnect(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerConnectRequest* request, ::opi_api::storage::v1::NVMfRemoteControllerConnectResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::NVMfRemoteControllerConnectRequest, ::opi_api::storage::v1::NVMfRemoteControllerConnectResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_NVMfRemoteControllerConnect_, context, request, response, std::move(f));
}

void NVMfRemoteControllerService::Stub::async::NVMfRemoteControllerConnect(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerConnectRequest* request, ::opi_api::storage::v1::NVMfRemoteControllerConnectResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_NVMfRemoteControllerConnect_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::NVMfRemoteControllerConnectResponse>* NVMfRemoteControllerService::Stub::PrepareAsyncNVMfRemoteControllerConnectRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerConnectRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::NVMfRemoteControllerConnectResponse, ::opi_api::storage::v1::NVMfRemoteControllerConnectRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_NVMfRemoteControllerConnect_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::NVMfRemoteControllerConnectResponse>* NVMfRemoteControllerService::Stub::AsyncNVMfRemoteControllerConnectRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerConnectRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncNVMfRemoteControllerConnectRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status NVMfRemoteControllerService::Stub::NVMfRemoteControllerDisconnect(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerDisconnectRequest& request, ::opi_api::storage::v1::NVMfRemoteControllerDisconnectResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::NVMfRemoteControllerDisconnectRequest, ::opi_api::storage::v1::NVMfRemoteControllerDisconnectResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_NVMfRemoteControllerDisconnect_, context, request, response);
}

void NVMfRemoteControllerService::Stub::async::NVMfRemoteControllerDisconnect(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerDisconnectRequest* request, ::opi_api::storage::v1::NVMfRemoteControllerDisconnectResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::NVMfRemoteControllerDisconnectRequest, ::opi_api::storage::v1::NVMfRemoteControllerDisconnectResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_NVMfRemoteControllerDisconnect_, context, request, response, std::move(f));
}

void NVMfRemoteControllerService::Stub::async::NVMfRemoteControllerDisconnect(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerDisconnectRequest* request, ::opi_api::storage::v1::NVMfRemoteControllerDisconnectResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_NVMfRemoteControllerDisconnect_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::NVMfRemoteControllerDisconnectResponse>* NVMfRemoteControllerService::Stub::PrepareAsyncNVMfRemoteControllerDisconnectRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerDisconnectRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::NVMfRemoteControllerDisconnectResponse, ::opi_api::storage::v1::NVMfRemoteControllerDisconnectRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_NVMfRemoteControllerDisconnect_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::NVMfRemoteControllerDisconnectResponse>* NVMfRemoteControllerService::Stub::AsyncNVMfRemoteControllerDisconnectRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerDisconnectRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncNVMfRemoteControllerDisconnectRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status NVMfRemoteControllerService::Stub::NVMfRemoteControllerReset(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerResetRequest& request, ::opi_api::storage::v1::NVMfRemoteControllerResetResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::NVMfRemoteControllerResetRequest, ::opi_api::storage::v1::NVMfRemoteControllerResetResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_NVMfRemoteControllerReset_, context, request, response);
}

void NVMfRemoteControllerService::Stub::async::NVMfRemoteControllerReset(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerResetRequest* request, ::opi_api::storage::v1::NVMfRemoteControllerResetResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::NVMfRemoteControllerResetRequest, ::opi_api::storage::v1::NVMfRemoteControllerResetResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_NVMfRemoteControllerReset_, context, request, response, std::move(f));
}

void NVMfRemoteControllerService::Stub::async::NVMfRemoteControllerReset(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerResetRequest* request, ::opi_api::storage::v1::NVMfRemoteControllerResetResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_NVMfRemoteControllerReset_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::NVMfRemoteControllerResetResponse>* NVMfRemoteControllerService::Stub::PrepareAsyncNVMfRemoteControllerResetRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerResetRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::NVMfRemoteControllerResetResponse, ::opi_api::storage::v1::NVMfRemoteControllerResetRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_NVMfRemoteControllerReset_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::NVMfRemoteControllerResetResponse>* NVMfRemoteControllerService::Stub::AsyncNVMfRemoteControllerResetRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerResetRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncNVMfRemoteControllerResetRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status NVMfRemoteControllerService::Stub::NVMfRemoteControllerList(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerListRequest& request, ::opi_api::storage::v1::NVMfRemoteControllerListResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::NVMfRemoteControllerListRequest, ::opi_api::storage::v1::NVMfRemoteControllerListResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_NVMfRemoteControllerList_, context, request, response);
}

void NVMfRemoteControllerService::Stub::async::NVMfRemoteControllerList(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerListRequest* request, ::opi_api::storage::v1::NVMfRemoteControllerListResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::NVMfRemoteControllerListRequest, ::opi_api::storage::v1::NVMfRemoteControllerListResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_NVMfRemoteControllerList_, context, request, response, std::move(f));
}

void NVMfRemoteControllerService::Stub::async::NVMfRemoteControllerList(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerListRequest* request, ::opi_api::storage::v1::NVMfRemoteControllerListResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_NVMfRemoteControllerList_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::NVMfRemoteControllerListResponse>* NVMfRemoteControllerService::Stub::PrepareAsyncNVMfRemoteControllerListRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerListRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::NVMfRemoteControllerListResponse, ::opi_api::storage::v1::NVMfRemoteControllerListRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_NVMfRemoteControllerList_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::NVMfRemoteControllerListResponse>* NVMfRemoteControllerService::Stub::AsyncNVMfRemoteControllerListRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerListRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncNVMfRemoteControllerListRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status NVMfRemoteControllerService::Stub::NVMfRemoteControllerGet(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerGetRequest& request, ::opi_api::storage::v1::NVMfRemoteControllerGetResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::NVMfRemoteControllerGetRequest, ::opi_api::storage::v1::NVMfRemoteControllerGetResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_NVMfRemoteControllerGet_, context, request, response);
}

void NVMfRemoteControllerService::Stub::async::NVMfRemoteControllerGet(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerGetRequest* request, ::opi_api::storage::v1::NVMfRemoteControllerGetResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::NVMfRemoteControllerGetRequest, ::opi_api::storage::v1::NVMfRemoteControllerGetResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_NVMfRemoteControllerGet_, context, request, response, std::move(f));
}

void NVMfRemoteControllerService::Stub::async::NVMfRemoteControllerGet(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerGetRequest* request, ::opi_api::storage::v1::NVMfRemoteControllerGetResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_NVMfRemoteControllerGet_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::NVMfRemoteControllerGetResponse>* NVMfRemoteControllerService::Stub::PrepareAsyncNVMfRemoteControllerGetRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerGetRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::NVMfRemoteControllerGetResponse, ::opi_api::storage::v1::NVMfRemoteControllerGetRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_NVMfRemoteControllerGet_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::NVMfRemoteControllerGetResponse>* NVMfRemoteControllerService::Stub::AsyncNVMfRemoteControllerGetRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerGetRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncNVMfRemoteControllerGetRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status NVMfRemoteControllerService::Stub::NVMfRemoteControllerStats(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerStatsRequest& request, ::opi_api::storage::v1::NVMfRemoteControllerStatsResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::NVMfRemoteControllerStatsRequest, ::opi_api::storage::v1::NVMfRemoteControllerStatsResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_NVMfRemoteControllerStats_, context, request, response);
}

void NVMfRemoteControllerService::Stub::async::NVMfRemoteControllerStats(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerStatsRequest* request, ::opi_api::storage::v1::NVMfRemoteControllerStatsResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::NVMfRemoteControllerStatsRequest, ::opi_api::storage::v1::NVMfRemoteControllerStatsResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_NVMfRemoteControllerStats_, context, request, response, std::move(f));
}

void NVMfRemoteControllerService::Stub::async::NVMfRemoteControllerStats(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerStatsRequest* request, ::opi_api::storage::v1::NVMfRemoteControllerStatsResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_NVMfRemoteControllerStats_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::NVMfRemoteControllerStatsResponse>* NVMfRemoteControllerService::Stub::PrepareAsyncNVMfRemoteControllerStatsRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerStatsRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::NVMfRemoteControllerStatsResponse, ::opi_api::storage::v1::NVMfRemoteControllerStatsRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_NVMfRemoteControllerStats_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::NVMfRemoteControllerStatsResponse>* NVMfRemoteControllerService::Stub::AsyncNVMfRemoteControllerStatsRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerStatsRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncNVMfRemoteControllerStatsRaw(context, request, cq);
  result->StartCall();
  return result;
}

NVMfRemoteControllerService::Service::Service() {
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      NVMfRemoteControllerService_method_names[0],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< NVMfRemoteControllerService::Service, ::opi_api::storage::v1::NVMfRemoteControllerConnectRequest, ::opi_api::storage::v1::NVMfRemoteControllerConnectResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](NVMfRemoteControllerService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::NVMfRemoteControllerConnectRequest* req,
             ::opi_api::storage::v1::NVMfRemoteControllerConnectResponse* resp) {
               return service->NVMfRemoteControllerConnect(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      NVMfRemoteControllerService_method_names[1],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< NVMfRemoteControllerService::Service, ::opi_api::storage::v1::NVMfRemoteControllerDisconnectRequest, ::opi_api::storage::v1::NVMfRemoteControllerDisconnectResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](NVMfRemoteControllerService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::NVMfRemoteControllerDisconnectRequest* req,
             ::opi_api::storage::v1::NVMfRemoteControllerDisconnectResponse* resp) {
               return service->NVMfRemoteControllerDisconnect(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      NVMfRemoteControllerService_method_names[2],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< NVMfRemoteControllerService::Service, ::opi_api::storage::v1::NVMfRemoteControllerResetRequest, ::opi_api::storage::v1::NVMfRemoteControllerResetResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](NVMfRemoteControllerService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::NVMfRemoteControllerResetRequest* req,
             ::opi_api::storage::v1::NVMfRemoteControllerResetResponse* resp) {
               return service->NVMfRemoteControllerReset(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      NVMfRemoteControllerService_method_names[3],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< NVMfRemoteControllerService::Service, ::opi_api::storage::v1::NVMfRemoteControllerListRequest, ::opi_api::storage::v1::NVMfRemoteControllerListResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](NVMfRemoteControllerService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::NVMfRemoteControllerListRequest* req,
             ::opi_api::storage::v1::NVMfRemoteControllerListResponse* resp) {
               return service->NVMfRemoteControllerList(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      NVMfRemoteControllerService_method_names[4],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< NVMfRemoteControllerService::Service, ::opi_api::storage::v1::NVMfRemoteControllerGetRequest, ::opi_api::storage::v1::NVMfRemoteControllerGetResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](NVMfRemoteControllerService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::NVMfRemoteControllerGetRequest* req,
             ::opi_api::storage::v1::NVMfRemoteControllerGetResponse* resp) {
               return service->NVMfRemoteControllerGet(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      NVMfRemoteControllerService_method_names[5],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< NVMfRemoteControllerService::Service, ::opi_api::storage::v1::NVMfRemoteControllerStatsRequest, ::opi_api::storage::v1::NVMfRemoteControllerStatsResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](NVMfRemoteControllerService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::NVMfRemoteControllerStatsRequest* req,
             ::opi_api::storage::v1::NVMfRemoteControllerStatsResponse* resp) {
               return service->NVMfRemoteControllerStats(ctx, req, resp);
             }, this)));
}

NVMfRemoteControllerService::Service::~Service() {
}

::grpc::Status NVMfRemoteControllerService::Service::NVMfRemoteControllerConnect(::grpc::ServerContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerConnectRequest* request, ::opi_api::storage::v1::NVMfRemoteControllerConnectResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status NVMfRemoteControllerService::Service::NVMfRemoteControllerDisconnect(::grpc::ServerContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerDisconnectRequest* request, ::opi_api::storage::v1::NVMfRemoteControllerDisconnectResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status NVMfRemoteControllerService::Service::NVMfRemoteControllerReset(::grpc::ServerContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerResetRequest* request, ::opi_api::storage::v1::NVMfRemoteControllerResetResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status NVMfRemoteControllerService::Service::NVMfRemoteControllerList(::grpc::ServerContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerListRequest* request, ::opi_api::storage::v1::NVMfRemoteControllerListResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status NVMfRemoteControllerService::Service::NVMfRemoteControllerGet(::grpc::ServerContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerGetRequest* request, ::opi_api::storage::v1::NVMfRemoteControllerGetResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status NVMfRemoteControllerService::Service::NVMfRemoteControllerStats(::grpc::ServerContext* context, const ::opi_api::storage::v1::NVMfRemoteControllerStatsRequest* request, ::opi_api::storage::v1::NVMfRemoteControllerStatsResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}


}  // namespace opi_api
}  // namespace storage
}  // namespace v1

