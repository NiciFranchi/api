<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/api.proto

namespace Api;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>api.SystemStats.MemoryStats</code>
 */
class SystemStats_MemoryStats extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>uint64 total = 1;</code>
     */
    private $total = 0;
    /**
     * Generated from protobuf field <code>uint64 available = 2;</code>
     */
    private $available = 0;
    /**
     * Generated from protobuf field <code>uint64 used = 3;</code>
     */
    private $used = 0;

    public function __construct() {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Api::initOnce();
        parent::__construct();
    }

    /**
     * Generated from protobuf field <code>uint64 total = 1;</code>
     * @return int|string
     */
    public function getTotal()
    {
        return $this->total;
    }

    /**
     * Generated from protobuf field <code>uint64 total = 1;</code>
     * @param int|string $var
     * @return $this
     */
    public function setTotal($var)
    {
        GPBUtil::checkUint64($var);
        $this->total = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint64 available = 2;</code>
     * @return int|string
     */
    public function getAvailable()
    {
        return $this->available;
    }

    /**
     * Generated from protobuf field <code>uint64 available = 2;</code>
     * @param int|string $var
     * @return $this
     */
    public function setAvailable($var)
    {
        GPBUtil::checkUint64($var);
        $this->available = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint64 used = 3;</code>
     * @return int|string
     */
    public function getUsed()
    {
        return $this->used;
    }

    /**
     * Generated from protobuf field <code>uint64 used = 3;</code>
     * @param int|string $var
     * @return $this
     */
    public function setUsed($var)
    {
        GPBUtil::checkUint64($var);
        $this->used = $var;

        return $this;
    }

}

