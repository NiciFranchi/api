// Automatically generated by MockGen. DO NOT EDIT!
// Source: ./discovery/discoveryclient/client.go

package discoveryclient

import (
	discovery "github.com/TheThingsNetwork/api/discovery"
	types "github.com/TheThingsNetwork/ttn/core/types"
	gomock "github.com/golang/mock/gomock"
)

// Mock of Client interface
type MockClient struct {
	ctrl     *gomock.Controller
	recorder *_MockClientRecorder
}

// Recorder for MockClient (not exported)
type _MockClientRecorder struct {
	mock *MockClient
}

func NewMockClient(ctrl *gomock.Controller) *MockClient {
	mock := &MockClient{ctrl: ctrl}
	mock.recorder = &_MockClientRecorder{mock}
	return mock
}

func (_m *MockClient) EXPECT() *_MockClientRecorder {
	return _m.recorder
}

func (_m *MockClient) Announce(token string) error {
	ret := _m.ctrl.Call(_m, "Announce", token)
	ret0, _ := ret[0].(error)
	return ret0
}

func (_mr *_MockClientRecorder) Announce(arg0 interface{}) *gomock.Call {
	return _mr.mock.ctrl.RecordCall(_mr.mock, "Announce", arg0)
}

func (_m *MockClient) GetAll(serviceName string) ([]*discovery.Announcement, error) {
	ret := _m.ctrl.Call(_m, "GetAll", serviceName)
	ret0, _ := ret[0].([]*discovery.Announcement)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

func (_mr *_MockClientRecorder) GetAll(arg0 interface{}) *gomock.Call {
	return _mr.mock.ctrl.RecordCall(_mr.mock, "GetAll", arg0)
}

func (_m *MockClient) Get(serviceName string, id string) (*discovery.Announcement, error) {
	ret := _m.ctrl.Call(_m, "Get", serviceName, id)
	ret0, _ := ret[0].(*discovery.Announcement)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

func (_mr *_MockClientRecorder) Get(arg0, arg1 interface{}) *gomock.Call {
	return _mr.mock.ctrl.RecordCall(_mr.mock, "Get", arg0, arg1)
}

func (_m *MockClient) AddDevAddrPrefix(prefix types.DevAddrPrefix) error {
	ret := _m.ctrl.Call(_m, "AddDevAddrPrefix", prefix)
	ret0, _ := ret[0].(error)
	return ret0
}

func (_mr *_MockClientRecorder) AddDevAddrPrefix(arg0 interface{}) *gomock.Call {
	return _mr.mock.ctrl.RecordCall(_mr.mock, "AddDevAddrPrefix", arg0)
}

func (_m *MockClient) AddAppID(appID string, token string) error {
	ret := _m.ctrl.Call(_m, "AddAppID", appID, token)
	ret0, _ := ret[0].(error)
	return ret0
}

func (_mr *_MockClientRecorder) AddAppID(arg0, arg1 interface{}) *gomock.Call {
	return _mr.mock.ctrl.RecordCall(_mr.mock, "AddAppID", arg0, arg1)
}

func (_m *MockClient) AddGatewayID(gatewayID string, token string) error {
	ret := _m.ctrl.Call(_m, "AddGatewayID", gatewayID, token)
	ret0, _ := ret[0].(error)
	return ret0
}

func (_mr *_MockClientRecorder) AddGatewayID(arg0, arg1 interface{}) *gomock.Call {
	return _mr.mock.ctrl.RecordCall(_mr.mock, "AddGatewayID", arg0, arg1)
}

func (_m *MockClient) RemoveDevAddrPrefix(prefix types.DevAddrPrefix) error {
	ret := _m.ctrl.Call(_m, "RemoveDevAddrPrefix", prefix)
	ret0, _ := ret[0].(error)
	return ret0
}

func (_mr *_MockClientRecorder) RemoveDevAddrPrefix(arg0 interface{}) *gomock.Call {
	return _mr.mock.ctrl.RecordCall(_mr.mock, "RemoveDevAddrPrefix", arg0)
}

func (_m *MockClient) RemoveAppID(appID string, token string) error {
	ret := _m.ctrl.Call(_m, "RemoveAppID", appID, token)
	ret0, _ := ret[0].(error)
	return ret0
}

func (_mr *_MockClientRecorder) RemoveAppID(arg0, arg1 interface{}) *gomock.Call {
	return _mr.mock.ctrl.RecordCall(_mr.mock, "RemoveAppID", arg0, arg1)
}

func (_m *MockClient) RemoveGatewayID(gatewayID string, token string) error {
	ret := _m.ctrl.Call(_m, "RemoveGatewayID", gatewayID, token)
	ret0, _ := ret[0].(error)
	return ret0
}

func (_mr *_MockClientRecorder) RemoveGatewayID(arg0, arg1 interface{}) *gomock.Call {
	return _mr.mock.ctrl.RecordCall(_mr.mock, "RemoveGatewayID", arg0, arg1)
}

func (_m *MockClient) GetAllBrokersForDevAddr(devAddr types.DevAddr) ([]*discovery.Announcement, error) {
	ret := _m.ctrl.Call(_m, "GetAllBrokersForDevAddr", devAddr)
	ret0, _ := ret[0].([]*discovery.Announcement)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

func (_mr *_MockClientRecorder) GetAllBrokersForDevAddr(arg0 interface{}) *gomock.Call {
	return _mr.mock.ctrl.RecordCall(_mr.mock, "GetAllBrokersForDevAddr", arg0)
}

func (_m *MockClient) GetAllHandlersForAppID(appID string) ([]*discovery.Announcement, error) {
	ret := _m.ctrl.Call(_m, "GetAllHandlersForAppID", appID)
	ret0, _ := ret[0].([]*discovery.Announcement)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

func (_mr *_MockClientRecorder) GetAllHandlersForAppID(arg0 interface{}) *gomock.Call {
	return _mr.mock.ctrl.RecordCall(_mr.mock, "GetAllHandlersForAppID", arg0)
}

func (_m *MockClient) GetAllRoutersForGatewayID(gatewayID string) ([]*discovery.Announcement, error) {
	ret := _m.ctrl.Call(_m, "GetAllRoutersForGatewayID", gatewayID)
	ret0, _ := ret[0].([]*discovery.Announcement)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

func (_mr *_MockClientRecorder) GetAllRoutersForGatewayID(arg0 interface{}) *gomock.Call {
	return _mr.mock.ctrl.RecordCall(_mr.mock, "GetAllRoutersForGatewayID", arg0)
}

func (_m *MockClient) Close() error {
	ret := _m.ctrl.Call(_m, "Close")
	ret0, _ := ret[0].(error)
	return ret0
}

func (_mr *_MockClientRecorder) Close() *gomock.Call {
	return _mr.mock.ctrl.RecordCall(_mr.mock, "Close")
}
