# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: networkserver/networkserver.proto for package 'networkserver'
# Original file comments:
# Copyright © 2017 The Things Network
# Use of this source code is governed by the MIT license that can be found in the LICENSE file.
#

require 'grpc'
require 'networkserver/networkserver_pb'

module Networkserver
  module NetworkServer
    class Service

      include GRPC::GenericService

      self.marshal_class_method = :encode
      self.unmarshal_class_method = :decode
      self.service_name = 'networkserver.NetworkServer'

      # Broker requests devices with DevAddr and matching FCnt (or disabled FCnt check)
      rpc :GetDevices, DevicesRequest, DevicesResponse
      # Broker requests device activation "template" from Network Server
      rpc :PrepareActivation, Broker::DeduplicatedDeviceActivationRequest, Broker::DeduplicatedDeviceActivationRequest
      # Broker confirms device activation (after response from Handler)
      rpc :Activate, Handler::DeviceActivationResponse, Handler::DeviceActivationResponse
      # Broker informs Network Server about Uplink
      rpc :Uplink, Broker::DeduplicatedUplinkMessage, Broker::DeduplicatedUplinkMessage
      # Broker informs Network Server about Downlink, NetworkServer may add MAC commands and re-set MIC
      rpc :Downlink, Broker::DownlinkMessage, Broker::DownlinkMessage
    end

    Stub = Service.rpc_stub_class
  end
  module NetworkServerManager
    # The NetworkServerManager service provides configuration and monitoring
    # functionality
    class Service

      include GRPC::GenericService

      self.marshal_class_method = :encode
      self.unmarshal_class_method = :decode
      self.service_name = 'networkserver.NetworkServerManager'

      rpc :GetStatus, StatusRequest, Status
    end

    Stub = Service.rpc_stub_class
  end
end
