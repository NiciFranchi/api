<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/protocol/protocol.proto

namespace Protocol;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>protocol.TxConfiguration</code>
 */
class TxConfiguration extends \Google\Protobuf\Internal\Message
{
    protected $protocol;

    public function __construct() {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Protocol\Protocol::initOnce();
        parent::__construct();
    }

    /**
     * Generated from protobuf field <code>.lorawan.TxConfiguration lorawan = 1 [(.gogoproto.customname) = "LoRaWAN"];</code>
     * @return \Lorawan\TxConfiguration
     */
    public function getLorawan()
    {
        return $this->readOneof(1);
    }

    /**
     * Generated from protobuf field <code>.lorawan.TxConfiguration lorawan = 1 [(.gogoproto.customname) = "LoRaWAN"];</code>
     * @param \Lorawan\TxConfiguration $var
     * @return $this
     */
    public function setLorawan($var)
    {
        GPBUtil::checkMessage($var, \Lorawan\TxConfiguration::class);
        $this->writeOneof(1, $var);

        return $this;
    }

    /**
     * @return string
     */
    public function getProtocol()
    {
        return $this->whichOneof("protocol");
    }

}

