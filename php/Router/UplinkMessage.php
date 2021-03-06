<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/router/router.proto

namespace Router;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>router.UplinkMessage</code>
 */
class UplinkMessage extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>bytes payload = 1;</code>
     */
    private $payload = '';
    /**
     * Generated from protobuf field <code>.protocol.Message message = 2;</code>
     */
    private $message = null;
    /**
     * Generated from protobuf field <code>.protocol.RxMetadata protocol_metadata = 11 [(.gogoproto.nullable) = false];</code>
     */
    private $protocol_metadata = null;
    /**
     * Generated from protobuf field <code>.gateway.RxMetadata gateway_metadata = 12 [(.gogoproto.nullable) = false];</code>
     */
    private $gateway_metadata = null;
    /**
     * Generated from protobuf field <code>.trace.Trace trace = 21;</code>
     */
    private $trace = null;

    public function __construct() {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Router\Router::initOnce();
        parent::__construct();
    }

    /**
     * Generated from protobuf field <code>bytes payload = 1;</code>
     * @return string
     */
    public function getPayload()
    {
        return $this->payload;
    }

    /**
     * Generated from protobuf field <code>bytes payload = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setPayload($var)
    {
        GPBUtil::checkString($var, False);
        $this->payload = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.protocol.Message message = 2;</code>
     * @return \Protocol\Message
     */
    public function getMessage()
    {
        return $this->message;
    }

    /**
     * Generated from protobuf field <code>.protocol.Message message = 2;</code>
     * @param \Protocol\Message $var
     * @return $this
     */
    public function setMessage($var)
    {
        GPBUtil::checkMessage($var, \Protocol\Message::class);
        $this->message = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.protocol.RxMetadata protocol_metadata = 11 [(.gogoproto.nullable) = false];</code>
     * @return \Protocol\RxMetadata
     */
    public function getProtocolMetadata()
    {
        return $this->protocol_metadata;
    }

    /**
     * Generated from protobuf field <code>.protocol.RxMetadata protocol_metadata = 11 [(.gogoproto.nullable) = false];</code>
     * @param \Protocol\RxMetadata $var
     * @return $this
     */
    public function setProtocolMetadata($var)
    {
        GPBUtil::checkMessage($var, \Protocol\RxMetadata::class);
        $this->protocol_metadata = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gateway.RxMetadata gateway_metadata = 12 [(.gogoproto.nullable) = false];</code>
     * @return \Gateway\RxMetadata
     */
    public function getGatewayMetadata()
    {
        return $this->gateway_metadata;
    }

    /**
     * Generated from protobuf field <code>.gateway.RxMetadata gateway_metadata = 12 [(.gogoproto.nullable) = false];</code>
     * @param \Gateway\RxMetadata $var
     * @return $this
     */
    public function setGatewayMetadata($var)
    {
        GPBUtil::checkMessage($var, \Gateway\RxMetadata::class);
        $this->gateway_metadata = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.trace.Trace trace = 21;</code>
     * @return \Trace\Trace
     */
    public function getTrace()
    {
        return $this->trace;
    }

    /**
     * Generated from protobuf field <code>.trace.Trace trace = 21;</code>
     * @param \Trace\Trace $var
     * @return $this
     */
    public function setTrace($var)
    {
        GPBUtil::checkMessage($var, \Trace\Trace::class);
        $this->trace = $var;

        return $this;
    }

}

