<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

namespace Lorawan;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>lorawan.ActivationMetadata</code>
 */
class ActivationMetadata extends \Google\Protobuf\Internal\Message
{
    /**
     * <code>bytes app_eui = 1 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     */
    private $app_eui = '';
    /**
     * <code>bytes dev_eui = 2 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
     */
    private $dev_eui = '';
    /**
     * <code>bytes dev_addr = 3 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
     */
    private $dev_addr = '';
    /**
     * <code>bytes nwk_s_key = 4 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.NwkSKey"];</code>
     */
    private $nwk_s_key = '';
    /**
     * <code>uint32 rx1_dr_offset = 11 [(.gogoproto.customname) = "Rx1DROffset"];</code>
     */
    private $rx1_dr_offset = 0;
    /**
     * <code>uint32 rx2_dr = 12 [(.gogoproto.customname) = "Rx2DR"];</code>
     */
    private $rx2_dr = 0;
    /**
     * <code>uint32 rx_delay = 13;</code>
     */
    private $rx_delay = 0;
    /**
     * <code>.lorawan.CFList cf_list = 14 [(.gogoproto.customname) = "CFList"];</code>
     */
    private $cf_list = null;
    /**
     * <code>.lorawan.FrequencyPlan frequency_plan = 15;</code>
     */
    private $frequency_plan = 0;

    public function __construct() {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Protocol\Lorawan\Lorawan::initOnce();
        parent::__construct();
    }

    /**
     * <code>bytes app_eui = 1 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     */
    public function getAppEui()
    {
        return $this->app_eui;
    }

    /**
     * <code>bytes app_eui = 1 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.AppEUI", (.gogoproto.customname) = "AppEUI"];</code>
     */
    public function setAppEui($var)
    {
        GPBUtil::checkString($var, False);
        $this->app_eui = $var;
    }

    /**
     * <code>bytes dev_eui = 2 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
     */
    public function getDevEui()
    {
        return $this->dev_eui;
    }

    /**
     * <code>bytes dev_eui = 2 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevEUI", (.gogoproto.customname) = "DevEUI"];</code>
     */
    public function setDevEui($var)
    {
        GPBUtil::checkString($var, False);
        $this->dev_eui = $var;
    }

    /**
     * <code>bytes dev_addr = 3 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
     */
    public function getDevAddr()
    {
        return $this->dev_addr;
    }

    /**
     * <code>bytes dev_addr = 3 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.DevAddr"];</code>
     */
    public function setDevAddr($var)
    {
        GPBUtil::checkString($var, False);
        $this->dev_addr = $var;
    }

    /**
     * <code>bytes nwk_s_key = 4 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.NwkSKey"];</code>
     */
    public function getNwkSKey()
    {
        return $this->nwk_s_key;
    }

    /**
     * <code>bytes nwk_s_key = 4 [(.gogoproto.customtype) = "github.com/TheThingsNetwork/ttn/core/types.NwkSKey"];</code>
     */
    public function setNwkSKey($var)
    {
        GPBUtil::checkString($var, False);
        $this->nwk_s_key = $var;
    }

    /**
     * <code>uint32 rx1_dr_offset = 11 [(.gogoproto.customname) = "Rx1DROffset"];</code>
     */
    public function getRx1DrOffset()
    {
        return $this->rx1_dr_offset;
    }

    /**
     * <code>uint32 rx1_dr_offset = 11 [(.gogoproto.customname) = "Rx1DROffset"];</code>
     */
    public function setRx1DrOffset($var)
    {
        GPBUtil::checkUint32($var);
        $this->rx1_dr_offset = $var;
    }

    /**
     * <code>uint32 rx2_dr = 12 [(.gogoproto.customname) = "Rx2DR"];</code>
     */
    public function getRx2Dr()
    {
        return $this->rx2_dr;
    }

    /**
     * <code>uint32 rx2_dr = 12 [(.gogoproto.customname) = "Rx2DR"];</code>
     */
    public function setRx2Dr($var)
    {
        GPBUtil::checkUint32($var);
        $this->rx2_dr = $var;
    }

    /**
     * <code>uint32 rx_delay = 13;</code>
     */
    public function getRxDelay()
    {
        return $this->rx_delay;
    }

    /**
     * <code>uint32 rx_delay = 13;</code>
     */
    public function setRxDelay($var)
    {
        GPBUtil::checkUint32($var);
        $this->rx_delay = $var;
    }

    /**
     * <code>.lorawan.CFList cf_list = 14 [(.gogoproto.customname) = "CFList"];</code>
     */
    public function getCfList()
    {
        return $this->cf_list;
    }

    /**
     * <code>.lorawan.CFList cf_list = 14 [(.gogoproto.customname) = "CFList"];</code>
     */
    public function setCfList(&$var)
    {
        GPBUtil::checkMessage($var, \Lorawan\CFList::class);
        $this->cf_list = $var;
    }

    /**
     * <code>.lorawan.FrequencyPlan frequency_plan = 15;</code>
     */
    public function getFrequencyPlan()
    {
        return $this->frequency_plan;
    }

    /**
     * <code>.lorawan.FrequencyPlan frequency_plan = 15;</code>
     */
    public function setFrequencyPlan($var)
    {
        GPBUtil::checkEnum($var, \Lorawan\FrequencyPlan::class);
        $this->frequency_plan = $var;
    }

}

