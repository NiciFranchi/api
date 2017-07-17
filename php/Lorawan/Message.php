<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

namespace Lorawan;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>lorawan.Message</code>
 */
class Message extends \Google\Protobuf\Internal\Message
{
    /**
     * <code>.lorawan.MHDR m_hdr = 1 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    private $m_hdr = null;
    /**
     * <code>bytes mic = 2 [(.gogoproto.customname) = "MIC"];</code>
     */
    private $mic = '';
    protected $Payload;

    public function __construct() {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Protocol\Lorawan\Lorawan::initOnce();
        parent::__construct();
    }

    /**
     * <code>.lorawan.MHDR m_hdr = 1 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    public function getMHdr()
    {
        return $this->m_hdr;
    }

    /**
     * <code>.lorawan.MHDR m_hdr = 1 [(.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    public function setMHdr(&$var)
    {
        GPBUtil::checkMessage($var, \Lorawan\MHDR::class);
        $this->m_hdr = $var;
    }

    /**
     * <code>bytes mic = 2 [(.gogoproto.customname) = "MIC"];</code>
     */
    public function getMic()
    {
        return $this->mic;
    }

    /**
     * <code>bytes mic = 2 [(.gogoproto.customname) = "MIC"];</code>
     */
    public function setMic($var)
    {
        GPBUtil::checkString($var, False);
        $this->mic = $var;
    }

    /**
     * <code>.lorawan.MACPayload mac_payload = 3 [(.gogoproto.customname) = "MACPayload"];</code>
     */
    public function getMacPayload()
    {
        return $this->readOneof(3);
    }

    /**
     * <code>.lorawan.MACPayload mac_payload = 3 [(.gogoproto.customname) = "MACPayload"];</code>
     */
    public function setMacPayload(&$var)
    {
        GPBUtil::checkMessage($var, \Lorawan\MACPayload::class);
        $this->writeOneof(3, $var);
    }

    /**
     * <code>.lorawan.JoinRequestPayload join_request_payload = 4;</code>
     */
    public function getJoinRequestPayload()
    {
        return $this->readOneof(4);
    }

    /**
     * <code>.lorawan.JoinRequestPayload join_request_payload = 4;</code>
     */
    public function setJoinRequestPayload(&$var)
    {
        GPBUtil::checkMessage($var, \Lorawan\JoinRequestPayload::class);
        $this->writeOneof(4, $var);
    }

    /**
     * <code>.lorawan.JoinAcceptPayload join_accept_payload = 5;</code>
     */
    public function getJoinAcceptPayload()
    {
        return $this->readOneof(5);
    }

    /**
     * <code>.lorawan.JoinAcceptPayload join_accept_payload = 5;</code>
     */
    public function setJoinAcceptPayload(&$var)
    {
        GPBUtil::checkMessage($var, \Lorawan\JoinAcceptPayload::class);
        $this->writeOneof(5, $var);
    }

    public function getPayload()
    {
        return $this->whichOneof("Payload");
    }

}

