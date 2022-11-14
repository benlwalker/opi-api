# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: frontend_nvme_pcie.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import opicommon_pb2 as opicommon__pb2
import object_key_pb2 as object__key__pb2
import uuid_pb2 as uuid__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x18\x66rontend_nvme_pcie.proto\x12\x12opi_api.storage.v1\x1a\x0fopicommon.proto\x1a\x10object_key.proto\x1a\nuuid.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/api/annotations.proto\"}\n\rNVMeSubsystem\x12\x33\n\x04spec\x18\x01 \x01(\x0b\x32%.opi_api.storage.v1.NVMeSubsystemSpec\x12\x37\n\x06status\x18\x02 \x01(\x0b\x32\'.opi_api.storage.v1.NVMeSubsystemStatus\"\x8f\x01\n\x11NVMeSubsystemSpec\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x0b\n\x03nqn\x18\x02 \x01(\t\x12\x15\n\rserial_number\x18\x03 \x01(\t\x12\x14\n\x0cmodel_number\x18\x04 \x01(\t\x12\x16\n\x0emax_namespaces\x18\x05 \x01(\x03\"B\n\x13NVMeSubsystemStatus\x12\x19\n\x11\x66irmware_revision\x18\x01 \x01(\t\x12\x10\n\x08\x66ru_guid\x18\x02 \x01(\x0c\"\x80\x01\n\x0eNVMeController\x12\x34\n\x04spec\x18\x01 \x01(\x0b\x32&.opi_api.storage.v1.NVMeControllerSpec\x12\x38\n\x06status\x18\x02 \x01(\x0b\x32(.opi_api.storage.v1.NVMeControllerStatus\"\x96\x02\n\x12NVMeControllerSpec\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x1a\n\x12nvme_controller_id\x18\x02 \x01(\x05\x12\x32\n\x0csubsystem_id\x18\x03 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x30\n\x07pcie_id\x18\x04 \x01(\x0b\x32\x1f.opi_api.storage.v1.PciEndpoint\x12\x0f\n\x07max_nsq\x18\x05 \x01(\x05\x12\x0f\n\x07max_ncq\x18\x06 \x01(\x05\x12\x0c\n\x04sqes\x18\x07 \x01(\x05\x12\x0c\n\x04\x63qes\x18\x08 \x01(\x05\x12\x16\n\x0emax_namespaces\x18\t \x01(\x05\"&\n\x14NVMeControllerStatus\x12\x0e\n\x06\x61\x63tive\x18\x01 \x01(\x08\"}\n\rNVMeNamespace\x12\x33\n\x04spec\x18\x01 \x01(\x0b\x32%.opi_api.storage.v1.NVMeNamespaceSpec\x12\x37\n\x06status\x18\x02 \x01(\x0b\x32\'.opi_api.storage.v1.NVMeNamespaceStatus\"\xfa\x01\n\x11NVMeNamespaceSpec\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x32\n\x0csubsystem_id\x18\x02 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x11\n\thost_nsid\x18\x04 \x01(\x05\x12\r\n\x05nguid\x18\x07 \x01(\t\x12\r\n\x05\x65ui64\x18\x08 \x01(\x03\x12%\n\x04uuid\x18\t \x01(\x0b\x32\x17.opi_api.common.v1.Uuid\x12/\n\tvolume_id\x18\n \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"\x9a\x01\n\x13NVMeNamespaceStatus\x12<\n\tpci_state\x18\x01 \x01(\x0e\x32).opi_api.storage.v1.NVMeNamespacePciState\x12\x45\n\x0epci_oper_state\x18\x02 \x01(\x0e\x32-.opi_api.storage.v1.NVMeNamespacePciOperState\"R\n\x1a\x43reateNVMeSubsystemRequest\x12\x34\n\tsubsystem\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.NVMeSubsystem\"P\n\x1a\x44\x65leteNVMeSubsystemRequest\x12\x32\n\x0csubsystem_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"R\n\x1aUpdateNVMeSubsystemRequest\x12\x34\n\tsubsystem\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.NVMeSubsystem\"A\n\x18ListNVMeSubsystemRequest\x12\x11\n\tpage_size\x18\x01 \x01(\x05\x12\x12\n\npage_token\x18\x02 \x01(\t\"k\n\x19ListNVMeSubsystemResponse\x12\x35\n\nsubsystems\x18\x01 \x03(\x0b\x32!.opi_api.storage.v1.NVMeSubsystem\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"M\n\x17GetNVMeSubsystemRequest\x12\x32\n\x0csubsystem_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"O\n\x19NVMeSubsystemStatsRequest\x12\x32\n\x0csubsystem_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"+\n\x1aNVMeSubsystemStatsResponse\x12\r\n\x05stats\x18\x01 \x01(\t\"U\n\x1b\x43reateNVMeControllerRequest\x12\x36\n\ncontroller\x18\x01 \x01(\x0b\x32\".opi_api.storage.v1.NVMeController\"R\n\x1b\x44\x65leteNVMeControllerRequest\x12\x33\n\rcontroller_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"U\n\x1bUpdateNVMeControllerRequest\x12\x36\n\ncontroller\x18\x01 \x01(\x0b\x32\".opi_api.storage.v1.NVMeController\"v\n\x19ListNVMeControllerRequest\x12\x32\n\x0csubsystem_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"n\n\x1aListNVMeControllerResponse\x12\x37\n\x0b\x63ontrollers\x18\x01 \x03(\x0b\x32\".opi_api.storage.v1.NVMeController\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"O\n\x18GetNVMeControllerRequest\x12\x33\n\rcontroller_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"F\n\x1aNVMeControllerStatsRequest\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"V\n\x1bNVMeControllerStatsResponse\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\r\n\x05stats\x18\x02 \x01(\t\"R\n\x1a\x43reateNVMeNamespaceRequest\x12\x34\n\tnamespace\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.NVMeNamespace\"P\n\x1a\x44\x65leteNVMeNamespaceRequest\x12\x32\n\x0cnamespace_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"R\n\x1aUpdateNVMeNamespaceRequest\x12\x34\n\tnamespace\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.NVMeNamespace\"u\n\x18ListNVMeNamespaceRequest\x12\x32\n\x0csubsystem_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"k\n\x19ListNVMeNamespaceResponse\x12\x35\n\nnamespaces\x18\x01 \x03(\x0b\x32!.opi_api.storage.v1.NVMeNamespace\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"M\n\x17GetNVMeNamespaceRequest\x12\x32\n\x0cnamespace_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"O\n\x19NVMeNamespaceStatsRequest\x12\x32\n\x0cnamespace_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"U\n\x1aNVMeNamespaceStatsResponse\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\r\n\x05stats\x18\x02 \x01(\t*\xb6\x01\n\x15NVMeNamespacePciState\x12)\n%NV_ME_NAMESPACE_PCI_STATE_UNSPECIFIED\x10\x00\x12%\n!NVME_NAMESPACE_PCI_STATE_DISABLED\x10\x01\x12$\n NVME_NAMESPACE_PCI_STATE_ENABLED\x10\x02\x12%\n!NVME_NAMESPACE_PCI_STATE_DELETING\x10\x03*\xa0\x01\n\x19NVMeNamespacePciOperState\x12.\n*NV_ME_NAMESPACE_PCI_OPER_STATE_UNSPECIFIED\x10\x00\x12(\n$NVME_NAMESPACE_PCI_OPER_STATE_ONLINE\x10\x01\x12)\n%NVME_NAMESPACE_PCI_OPER_STATE_OFFLINE\x10\x02\x32\xb0\x13\n\x13\x46rontendNvmeService\x12\x8b\x01\n\x13\x43reateNVMeSubsystem\x12..opi_api.storage.v1.CreateNVMeSubsystemRequest\x1a!.opi_api.storage.v1.NVMeSubsystem\"!\x82\xd3\xe4\x93\x02\x1b\"\x0e/v1/subsystems:\tsubsystem\x12\x81\x01\n\x13\x44\x65leteNVMeSubsystem\x12..opi_api.storage.v1.DeleteNVMeSubsystemRequest\x1a\x16.google.protobuf.Empty\"\"\x82\xd3\xe4\x93\x02\x1c*\x1a/v1/subsystems/{subsystem}\x12\x8b\x01\n\x13UpdateNVMeSubsystem\x12..opi_api.storage.v1.UpdateNVMeSubsystemRequest\x1a!.opi_api.storage.v1.NVMeSubsystem\"!\x82\xd3\xe4\x93\x02\x1b\x32\x0e/v1/subsystems:\tsubsystem\x12\x88\x01\n\x11ListNVMeSubsystem\x12,.opi_api.storage.v1.ListNVMeSubsystemRequest\x1a-.opi_api.storage.v1.ListNVMeSubsystemResponse\"\x16\x82\xd3\xe4\x93\x02\x10\x12\x0e/v1/subsystems\x12\x86\x01\n\x10GetNVMeSubsystem\x12+.opi_api.storage.v1.GetNVMeSubsystemRequest\x1a!.opi_api.storage.v1.NVMeSubsystem\"\"\x82\xd3\xe4\x93\x02\x1c\x12\x1a/v1/subsystems/{subsystem}\x12u\n\x12NVMeSubsystemStats\x12-.opi_api.storage.v1.NVMeSubsystemStatsRequest\x1a..opi_api.storage.v1.NVMeSubsystemStatsResponse\"\x00\x12\x90\x01\n\x14\x43reateNVMeController\x12/.opi_api.storage.v1.CreateNVMeControllerRequest\x1a\".opi_api.storage.v1.NVMeController\"#\x82\xd3\xe4\x93\x02\x1d\"\x0f/v1/controllers:\ncontroller\x12\x85\x01\n\x14\x44\x65leteNVMeController\x12/.opi_api.storage.v1.DeleteNVMeControllerRequest\x1a\x16.google.protobuf.Empty\"$\x82\xd3\xe4\x93\x02\x1e*\x1c/v1/controllers/{controller}\x12\x90\x01\n\x14UpdateNVMeController\x12/.opi_api.storage.v1.UpdateNVMeControllerRequest\x1a\".opi_api.storage.v1.NVMeController\"#\x82\xd3\xe4\x93\x02\x1d\x32\x0f/v1/controllers:\ncontroller\x12\x8c\x01\n\x12ListNVMeController\x12-.opi_api.storage.v1.ListNVMeControllerRequest\x1a..opi_api.storage.v1.ListNVMeControllerResponse\"\x17\x82\xd3\xe4\x93\x02\x11\x12\x0f/v1/controllers\x12\x8b\x01\n\x11GetNVMeController\x12,.opi_api.storage.v1.GetNVMeControllerRequest\x1a\".opi_api.storage.v1.NVMeController\"$\x82\xd3\xe4\x93\x02\x1e\x12\x1c/v1/controllers/{controller}\x12x\n\x13NVMeControllerStats\x12..opi_api.storage.v1.NVMeControllerStatsRequest\x1a/.opi_api.storage.v1.NVMeControllerStatsResponse\"\x00\x12\x8b\x01\n\x13\x43reateNVMeNamespace\x12..opi_api.storage.v1.CreateNVMeNamespaceRequest\x1a!.opi_api.storage.v1.NVMeNamespace\"!\x82\xd3\xe4\x93\x02\x1b\"\x0e/v1/namespaces:\tnamespace\x12\x81\x01\n\x13\x44\x65leteNVMeNamespace\x12..opi_api.storage.v1.DeleteNVMeNamespaceRequest\x1a\x16.google.protobuf.Empty\"\"\x82\xd3\xe4\x93\x02\x1c*\x1a/v1/namespaces/{namespace}\x12\x8b\x01\n\x13UpdateNVMeNamespace\x12..opi_api.storage.v1.UpdateNVMeNamespaceRequest\x1a!.opi_api.storage.v1.NVMeNamespace\"!\x82\xd3\xe4\x93\x02\x1b\x32\x0e/v1/namespaces:\tnamespace\x12\x88\x01\n\x11ListNVMeNamespace\x12,.opi_api.storage.v1.ListNVMeNamespaceRequest\x1a-.opi_api.storage.v1.ListNVMeNamespaceResponse\"\x16\x82\xd3\xe4\x93\x02\x10\x12\x0e/v1/namespaces\x12\x86\x01\n\x10GetNVMeNamespace\x12+.opi_api.storage.v1.GetNVMeNamespaceRequest\x1a!.opi_api.storage.v1.NVMeNamespace\"\"\x82\xd3\xe4\x93\x02\x1c\x12\x1a/v1/namespaces/{namespace}\x12u\n\x12NVMeNamespaceStats\x12-.opi_api.storage.v1.NVMeNamespaceStatsRequest\x1a..opi_api.storage.v1.NVMeNamespaceStatsResponse\"\x00\x42\x64\n\x12opi_api.storage.v1B\x15\x46rontendNvmePcieProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')

_NVMENAMESPACEPCISTATE = DESCRIPTOR.enum_types_by_name['NVMeNamespacePciState']
NVMeNamespacePciState = enum_type_wrapper.EnumTypeWrapper(_NVMENAMESPACEPCISTATE)
_NVMENAMESPACEPCIOPERSTATE = DESCRIPTOR.enum_types_by_name['NVMeNamespacePciOperState']
NVMeNamespacePciOperState = enum_type_wrapper.EnumTypeWrapper(_NVMENAMESPACEPCIOPERSTATE)
NV_ME_NAMESPACE_PCI_STATE_UNSPECIFIED = 0
NVME_NAMESPACE_PCI_STATE_DISABLED = 1
NVME_NAMESPACE_PCI_STATE_ENABLED = 2
NVME_NAMESPACE_PCI_STATE_DELETING = 3
NV_ME_NAMESPACE_PCI_OPER_STATE_UNSPECIFIED = 0
NVME_NAMESPACE_PCI_OPER_STATE_ONLINE = 1
NVME_NAMESPACE_PCI_OPER_STATE_OFFLINE = 2


_NVMESUBSYSTEM = DESCRIPTOR.message_types_by_name['NVMeSubsystem']
_NVMESUBSYSTEMSPEC = DESCRIPTOR.message_types_by_name['NVMeSubsystemSpec']
_NVMESUBSYSTEMSTATUS = DESCRIPTOR.message_types_by_name['NVMeSubsystemStatus']
_NVMECONTROLLER = DESCRIPTOR.message_types_by_name['NVMeController']
_NVMECONTROLLERSPEC = DESCRIPTOR.message_types_by_name['NVMeControllerSpec']
_NVMECONTROLLERSTATUS = DESCRIPTOR.message_types_by_name['NVMeControllerStatus']
_NVMENAMESPACE = DESCRIPTOR.message_types_by_name['NVMeNamespace']
_NVMENAMESPACESPEC = DESCRIPTOR.message_types_by_name['NVMeNamespaceSpec']
_NVMENAMESPACESTATUS = DESCRIPTOR.message_types_by_name['NVMeNamespaceStatus']
_CREATENVMESUBSYSTEMREQUEST = DESCRIPTOR.message_types_by_name['CreateNVMeSubsystemRequest']
_DELETENVMESUBSYSTEMREQUEST = DESCRIPTOR.message_types_by_name['DeleteNVMeSubsystemRequest']
_UPDATENVMESUBSYSTEMREQUEST = DESCRIPTOR.message_types_by_name['UpdateNVMeSubsystemRequest']
_LISTNVMESUBSYSTEMREQUEST = DESCRIPTOR.message_types_by_name['ListNVMeSubsystemRequest']
_LISTNVMESUBSYSTEMRESPONSE = DESCRIPTOR.message_types_by_name['ListNVMeSubsystemResponse']
_GETNVMESUBSYSTEMREQUEST = DESCRIPTOR.message_types_by_name['GetNVMeSubsystemRequest']
_NVMESUBSYSTEMSTATSREQUEST = DESCRIPTOR.message_types_by_name['NVMeSubsystemStatsRequest']
_NVMESUBSYSTEMSTATSRESPONSE = DESCRIPTOR.message_types_by_name['NVMeSubsystemStatsResponse']
_CREATENVMECONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['CreateNVMeControllerRequest']
_DELETENVMECONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['DeleteNVMeControllerRequest']
_UPDATENVMECONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['UpdateNVMeControllerRequest']
_LISTNVMECONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['ListNVMeControllerRequest']
_LISTNVMECONTROLLERRESPONSE = DESCRIPTOR.message_types_by_name['ListNVMeControllerResponse']
_GETNVMECONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['GetNVMeControllerRequest']
_NVMECONTROLLERSTATSREQUEST = DESCRIPTOR.message_types_by_name['NVMeControllerStatsRequest']
_NVMECONTROLLERSTATSRESPONSE = DESCRIPTOR.message_types_by_name['NVMeControllerStatsResponse']
_CREATENVMENAMESPACEREQUEST = DESCRIPTOR.message_types_by_name['CreateNVMeNamespaceRequest']
_DELETENVMENAMESPACEREQUEST = DESCRIPTOR.message_types_by_name['DeleteNVMeNamespaceRequest']
_UPDATENVMENAMESPACEREQUEST = DESCRIPTOR.message_types_by_name['UpdateNVMeNamespaceRequest']
_LISTNVMENAMESPACEREQUEST = DESCRIPTOR.message_types_by_name['ListNVMeNamespaceRequest']
_LISTNVMENAMESPACERESPONSE = DESCRIPTOR.message_types_by_name['ListNVMeNamespaceResponse']
_GETNVMENAMESPACEREQUEST = DESCRIPTOR.message_types_by_name['GetNVMeNamespaceRequest']
_NVMENAMESPACESTATSREQUEST = DESCRIPTOR.message_types_by_name['NVMeNamespaceStatsRequest']
_NVMENAMESPACESTATSRESPONSE = DESCRIPTOR.message_types_by_name['NVMeNamespaceStatsResponse']
NVMeSubsystem = _reflection.GeneratedProtocolMessageType('NVMeSubsystem', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEM,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystem)
  })
_sym_db.RegisterMessage(NVMeSubsystem)

NVMeSubsystemSpec = _reflection.GeneratedProtocolMessageType('NVMeSubsystemSpec', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMSPEC,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemSpec)
  })
_sym_db.RegisterMessage(NVMeSubsystemSpec)

NVMeSubsystemStatus = _reflection.GeneratedProtocolMessageType('NVMeSubsystemStatus', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMSTATUS,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemStatus)
  })
_sym_db.RegisterMessage(NVMeSubsystemStatus)

NVMeController = _reflection.GeneratedProtocolMessageType('NVMeController', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLER,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeController)
  })
_sym_db.RegisterMessage(NVMeController)

NVMeControllerSpec = _reflection.GeneratedProtocolMessageType('NVMeControllerSpec', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERSPEC,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerSpec)
  })
_sym_db.RegisterMessage(NVMeControllerSpec)

NVMeControllerStatus = _reflection.GeneratedProtocolMessageType('NVMeControllerStatus', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERSTATUS,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerStatus)
  })
_sym_db.RegisterMessage(NVMeControllerStatus)

NVMeNamespace = _reflection.GeneratedProtocolMessageType('NVMeNamespace', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespace)
  })
_sym_db.RegisterMessage(NVMeNamespace)

NVMeNamespaceSpec = _reflection.GeneratedProtocolMessageType('NVMeNamespaceSpec', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACESPEC,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceSpec)
  })
_sym_db.RegisterMessage(NVMeNamespaceSpec)

NVMeNamespaceStatus = _reflection.GeneratedProtocolMessageType('NVMeNamespaceStatus', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACESTATUS,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceStatus)
  })
_sym_db.RegisterMessage(NVMeNamespaceStatus)

CreateNVMeSubsystemRequest = _reflection.GeneratedProtocolMessageType('CreateNVMeSubsystemRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATENVMESUBSYSTEMREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateNVMeSubsystemRequest)
  })
_sym_db.RegisterMessage(CreateNVMeSubsystemRequest)

DeleteNVMeSubsystemRequest = _reflection.GeneratedProtocolMessageType('DeleteNVMeSubsystemRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETENVMESUBSYSTEMREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.DeleteNVMeSubsystemRequest)
  })
_sym_db.RegisterMessage(DeleteNVMeSubsystemRequest)

UpdateNVMeSubsystemRequest = _reflection.GeneratedProtocolMessageType('UpdateNVMeSubsystemRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATENVMESUBSYSTEMREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.UpdateNVMeSubsystemRequest)
  })
_sym_db.RegisterMessage(UpdateNVMeSubsystemRequest)

ListNVMeSubsystemRequest = _reflection.GeneratedProtocolMessageType('ListNVMeSubsystemRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTNVMESUBSYSTEMREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNVMeSubsystemRequest)
  })
_sym_db.RegisterMessage(ListNVMeSubsystemRequest)

ListNVMeSubsystemResponse = _reflection.GeneratedProtocolMessageType('ListNVMeSubsystemResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTNVMESUBSYSTEMRESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNVMeSubsystemResponse)
  })
_sym_db.RegisterMessage(ListNVMeSubsystemResponse)

GetNVMeSubsystemRequest = _reflection.GeneratedProtocolMessageType('GetNVMeSubsystemRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETNVMESUBSYSTEMREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.GetNVMeSubsystemRequest)
  })
_sym_db.RegisterMessage(GetNVMeSubsystemRequest)

NVMeSubsystemStatsRequest = _reflection.GeneratedProtocolMessageType('NVMeSubsystemStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMSTATSREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemStatsRequest)
  })
_sym_db.RegisterMessage(NVMeSubsystemStatsRequest)

NVMeSubsystemStatsResponse = _reflection.GeneratedProtocolMessageType('NVMeSubsystemStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMESUBSYSTEMSTATSRESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeSubsystemStatsResponse)
  })
_sym_db.RegisterMessage(NVMeSubsystemStatsResponse)

CreateNVMeControllerRequest = _reflection.GeneratedProtocolMessageType('CreateNVMeControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATENVMECONTROLLERREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateNVMeControllerRequest)
  })
_sym_db.RegisterMessage(CreateNVMeControllerRequest)

DeleteNVMeControllerRequest = _reflection.GeneratedProtocolMessageType('DeleteNVMeControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETENVMECONTROLLERREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.DeleteNVMeControllerRequest)
  })
_sym_db.RegisterMessage(DeleteNVMeControllerRequest)

UpdateNVMeControllerRequest = _reflection.GeneratedProtocolMessageType('UpdateNVMeControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATENVMECONTROLLERREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.UpdateNVMeControllerRequest)
  })
_sym_db.RegisterMessage(UpdateNVMeControllerRequest)

ListNVMeControllerRequest = _reflection.GeneratedProtocolMessageType('ListNVMeControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTNVMECONTROLLERREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNVMeControllerRequest)
  })
_sym_db.RegisterMessage(ListNVMeControllerRequest)

ListNVMeControllerResponse = _reflection.GeneratedProtocolMessageType('ListNVMeControllerResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTNVMECONTROLLERRESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNVMeControllerResponse)
  })
_sym_db.RegisterMessage(ListNVMeControllerResponse)

GetNVMeControllerRequest = _reflection.GeneratedProtocolMessageType('GetNVMeControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETNVMECONTROLLERREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.GetNVMeControllerRequest)
  })
_sym_db.RegisterMessage(GetNVMeControllerRequest)

NVMeControllerStatsRequest = _reflection.GeneratedProtocolMessageType('NVMeControllerStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERSTATSREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerStatsRequest)
  })
_sym_db.RegisterMessage(NVMeControllerStatsRequest)

NVMeControllerStatsResponse = _reflection.GeneratedProtocolMessageType('NVMeControllerStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMECONTROLLERSTATSRESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeControllerStatsResponse)
  })
_sym_db.RegisterMessage(NVMeControllerStatsResponse)

CreateNVMeNamespaceRequest = _reflection.GeneratedProtocolMessageType('CreateNVMeNamespaceRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATENVMENAMESPACEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateNVMeNamespaceRequest)
  })
_sym_db.RegisterMessage(CreateNVMeNamespaceRequest)

DeleteNVMeNamespaceRequest = _reflection.GeneratedProtocolMessageType('DeleteNVMeNamespaceRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETENVMENAMESPACEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.DeleteNVMeNamespaceRequest)
  })
_sym_db.RegisterMessage(DeleteNVMeNamespaceRequest)

UpdateNVMeNamespaceRequest = _reflection.GeneratedProtocolMessageType('UpdateNVMeNamespaceRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATENVMENAMESPACEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.UpdateNVMeNamespaceRequest)
  })
_sym_db.RegisterMessage(UpdateNVMeNamespaceRequest)

ListNVMeNamespaceRequest = _reflection.GeneratedProtocolMessageType('ListNVMeNamespaceRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTNVMENAMESPACEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNVMeNamespaceRequest)
  })
_sym_db.RegisterMessage(ListNVMeNamespaceRequest)

ListNVMeNamespaceResponse = _reflection.GeneratedProtocolMessageType('ListNVMeNamespaceResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTNVMENAMESPACERESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListNVMeNamespaceResponse)
  })
_sym_db.RegisterMessage(ListNVMeNamespaceResponse)

GetNVMeNamespaceRequest = _reflection.GeneratedProtocolMessageType('GetNVMeNamespaceRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETNVMENAMESPACEREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.GetNVMeNamespaceRequest)
  })
_sym_db.RegisterMessage(GetNVMeNamespaceRequest)

NVMeNamespaceStatsRequest = _reflection.GeneratedProtocolMessageType('NVMeNamespaceStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACESTATSREQUEST,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceStatsRequest)
  })
_sym_db.RegisterMessage(NVMeNamespaceStatsRequest)

NVMeNamespaceStatsResponse = _reflection.GeneratedProtocolMessageType('NVMeNamespaceStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _NVMENAMESPACESTATSRESPONSE,
  '__module__' : 'frontend_nvme_pcie_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.NVMeNamespaceStatsResponse)
  })
_sym_db.RegisterMessage(NVMeNamespaceStatsResponse)

_FRONTENDNVMESERVICE = DESCRIPTOR.services_by_name['FrontendNvmeService']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022opi_api.storage.v1B\025FrontendNvmePcieProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _FRONTENDNVMESERVICE.methods_by_name['CreateNVMeSubsystem']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['CreateNVMeSubsystem']._serialized_options = b'\202\323\344\223\002\033\"\016/v1/subsystems:\tsubsystem'
  _FRONTENDNVMESERVICE.methods_by_name['DeleteNVMeSubsystem']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['DeleteNVMeSubsystem']._serialized_options = b'\202\323\344\223\002\034*\032/v1/subsystems/{subsystem}'
  _FRONTENDNVMESERVICE.methods_by_name['UpdateNVMeSubsystem']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['UpdateNVMeSubsystem']._serialized_options = b'\202\323\344\223\002\0332\016/v1/subsystems:\tsubsystem'
  _FRONTENDNVMESERVICE.methods_by_name['ListNVMeSubsystem']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['ListNVMeSubsystem']._serialized_options = b'\202\323\344\223\002\020\022\016/v1/subsystems'
  _FRONTENDNVMESERVICE.methods_by_name['GetNVMeSubsystem']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['GetNVMeSubsystem']._serialized_options = b'\202\323\344\223\002\034\022\032/v1/subsystems/{subsystem}'
  _FRONTENDNVMESERVICE.methods_by_name['CreateNVMeController']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['CreateNVMeController']._serialized_options = b'\202\323\344\223\002\035\"\017/v1/controllers:\ncontroller'
  _FRONTENDNVMESERVICE.methods_by_name['DeleteNVMeController']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['DeleteNVMeController']._serialized_options = b'\202\323\344\223\002\036*\034/v1/controllers/{controller}'
  _FRONTENDNVMESERVICE.methods_by_name['UpdateNVMeController']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['UpdateNVMeController']._serialized_options = b'\202\323\344\223\002\0352\017/v1/controllers:\ncontroller'
  _FRONTENDNVMESERVICE.methods_by_name['ListNVMeController']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['ListNVMeController']._serialized_options = b'\202\323\344\223\002\021\022\017/v1/controllers'
  _FRONTENDNVMESERVICE.methods_by_name['GetNVMeController']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['GetNVMeController']._serialized_options = b'\202\323\344\223\002\036\022\034/v1/controllers/{controller}'
  _FRONTENDNVMESERVICE.methods_by_name['CreateNVMeNamespace']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['CreateNVMeNamespace']._serialized_options = b'\202\323\344\223\002\033\"\016/v1/namespaces:\tnamespace'
  _FRONTENDNVMESERVICE.methods_by_name['DeleteNVMeNamespace']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['DeleteNVMeNamespace']._serialized_options = b'\202\323\344\223\002\034*\032/v1/namespaces/{namespace}'
  _FRONTENDNVMESERVICE.methods_by_name['UpdateNVMeNamespace']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['UpdateNVMeNamespace']._serialized_options = b'\202\323\344\223\002\0332\016/v1/namespaces:\tnamespace'
  _FRONTENDNVMESERVICE.methods_by_name['ListNVMeNamespace']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['ListNVMeNamespace']._serialized_options = b'\202\323\344\223\002\020\022\016/v1/namespaces'
  _FRONTENDNVMESERVICE.methods_by_name['GetNVMeNamespace']._options = None
  _FRONTENDNVMESERVICE.methods_by_name['GetNVMeNamespace']._serialized_options = b'\202\323\344\223\002\034\022\032/v1/namespaces/{namespace}'
  _NVMENAMESPACEPCISTATE._serialized_start=3572
  _NVMENAMESPACEPCISTATE._serialized_end=3754
  _NVMENAMESPACEPCIOPERSTATE._serialized_start=3757
  _NVMENAMESPACEPCIOPERSTATE._serialized_end=3917
  _NVMESUBSYSTEM._serialized_start=154
  _NVMESUBSYSTEM._serialized_end=279
  _NVMESUBSYSTEMSPEC._serialized_start=282
  _NVMESUBSYSTEMSPEC._serialized_end=425
  _NVMESUBSYSTEMSTATUS._serialized_start=427
  _NVMESUBSYSTEMSTATUS._serialized_end=493
  _NVMECONTROLLER._serialized_start=496
  _NVMECONTROLLER._serialized_end=624
  _NVMECONTROLLERSPEC._serialized_start=627
  _NVMECONTROLLERSPEC._serialized_end=905
  _NVMECONTROLLERSTATUS._serialized_start=907
  _NVMECONTROLLERSTATUS._serialized_end=945
  _NVMENAMESPACE._serialized_start=947
  _NVMENAMESPACE._serialized_end=1072
  _NVMENAMESPACESPEC._serialized_start=1075
  _NVMENAMESPACESPEC._serialized_end=1325
  _NVMENAMESPACESTATUS._serialized_start=1328
  _NVMENAMESPACESTATUS._serialized_end=1482
  _CREATENVMESUBSYSTEMREQUEST._serialized_start=1484
  _CREATENVMESUBSYSTEMREQUEST._serialized_end=1566
  _DELETENVMESUBSYSTEMREQUEST._serialized_start=1568
  _DELETENVMESUBSYSTEMREQUEST._serialized_end=1648
  _UPDATENVMESUBSYSTEMREQUEST._serialized_start=1650
  _UPDATENVMESUBSYSTEMREQUEST._serialized_end=1732
  _LISTNVMESUBSYSTEMREQUEST._serialized_start=1734
  _LISTNVMESUBSYSTEMREQUEST._serialized_end=1799
  _LISTNVMESUBSYSTEMRESPONSE._serialized_start=1801
  _LISTNVMESUBSYSTEMRESPONSE._serialized_end=1908
  _GETNVMESUBSYSTEMREQUEST._serialized_start=1910
  _GETNVMESUBSYSTEMREQUEST._serialized_end=1987
  _NVMESUBSYSTEMSTATSREQUEST._serialized_start=1989
  _NVMESUBSYSTEMSTATSREQUEST._serialized_end=2068
  _NVMESUBSYSTEMSTATSRESPONSE._serialized_start=2070
  _NVMESUBSYSTEMSTATSRESPONSE._serialized_end=2113
  _CREATENVMECONTROLLERREQUEST._serialized_start=2115
  _CREATENVMECONTROLLERREQUEST._serialized_end=2200
  _DELETENVMECONTROLLERREQUEST._serialized_start=2202
  _DELETENVMECONTROLLERREQUEST._serialized_end=2284
  _UPDATENVMECONTROLLERREQUEST._serialized_start=2286
  _UPDATENVMECONTROLLERREQUEST._serialized_end=2371
  _LISTNVMECONTROLLERREQUEST._serialized_start=2373
  _LISTNVMECONTROLLERREQUEST._serialized_end=2491
  _LISTNVMECONTROLLERRESPONSE._serialized_start=2493
  _LISTNVMECONTROLLERRESPONSE._serialized_end=2603
  _GETNVMECONTROLLERREQUEST._serialized_start=2605
  _GETNVMECONTROLLERREQUEST._serialized_end=2684
  _NVMECONTROLLERSTATSREQUEST._serialized_start=2686
  _NVMECONTROLLERSTATSREQUEST._serialized_end=2756
  _NVMECONTROLLERSTATSRESPONSE._serialized_start=2758
  _NVMECONTROLLERSTATSRESPONSE._serialized_end=2844
  _CREATENVMENAMESPACEREQUEST._serialized_start=2846
  _CREATENVMENAMESPACEREQUEST._serialized_end=2928
  _DELETENVMENAMESPACEREQUEST._serialized_start=2930
  _DELETENVMENAMESPACEREQUEST._serialized_end=3010
  _UPDATENVMENAMESPACEREQUEST._serialized_start=3012
  _UPDATENVMENAMESPACEREQUEST._serialized_end=3094
  _LISTNVMENAMESPACEREQUEST._serialized_start=3096
  _LISTNVMENAMESPACEREQUEST._serialized_end=3213
  _LISTNVMENAMESPACERESPONSE._serialized_start=3215
  _LISTNVMENAMESPACERESPONSE._serialized_end=3322
  _GETNVMENAMESPACEREQUEST._serialized_start=3324
  _GETNVMENAMESPACEREQUEST._serialized_end=3401
  _NVMENAMESPACESTATSREQUEST._serialized_start=3403
  _NVMENAMESPACESTATSREQUEST._serialized_end=3482
  _NVMENAMESPACESTATSRESPONSE._serialized_start=3484
  _NVMENAMESPACESTATSRESPONSE._serialized_end=3569
  _FRONTENDNVMESERVICE._serialized_start=3920
  _FRONTENDNVMESERVICE._serialized_end=6400
# @@protoc_insertion_point(module_scope)
