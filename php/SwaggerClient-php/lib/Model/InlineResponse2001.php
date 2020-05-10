<?php
/**
 * InlineResponse2001
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Киноконтент API
 *
 * API биржи описаний к фильмам и сериалам https://kinocontent.club
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 3.0.19
 */
/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
use \Swagger\Client\ObjectSerializer;

/**
 * InlineResponse2001 Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class InlineResponse2001 implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'inline_response_200_1';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'login' => 'string',
'balance' => 'float',
'is_enough_balance' => 'bool',
'symbols_from' => 'int',
'symbols_to' => 'int',
'comment' => 'string',
'private_comment' => 'string',
'express' => 'bool'    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'login' => null,
'balance' => null,
'is_enough_balance' => null,
'symbols_from' => null,
'symbols_to' => null,
'comment' => null,
'private_comment' => null,
'express' => null    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'login' => 'login',
'balance' => 'balance',
'is_enough_balance' => 'is_enough_balance',
'symbols_from' => 'symbols_from',
'symbols_to' => 'symbols_to',
'comment' => 'comment',
'private_comment' => 'private_comment',
'express' => 'express'    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'login' => 'setLogin',
'balance' => 'setBalance',
'is_enough_balance' => 'setIsEnoughBalance',
'symbols_from' => 'setSymbolsFrom',
'symbols_to' => 'setSymbolsTo',
'comment' => 'setComment',
'private_comment' => 'setPrivateComment',
'express' => 'setExpress'    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'login' => 'getLogin',
'balance' => 'getBalance',
'is_enough_balance' => 'getIsEnoughBalance',
'symbols_from' => 'getSymbolsFrom',
'symbols_to' => 'getSymbolsTo',
'comment' => 'getComment',
'private_comment' => 'getPrivateComment',
'express' => 'getExpress'    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$swaggerModelName;
    }

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['login'] = isset($data['login']) ? $data['login'] : null;
        $this->container['balance'] = isset($data['balance']) ? $data['balance'] : null;
        $this->container['is_enough_balance'] = isset($data['is_enough_balance']) ? $data['is_enough_balance'] : null;
        $this->container['symbols_from'] = isset($data['symbols_from']) ? $data['symbols_from'] : null;
        $this->container['symbols_to'] = isset($data['symbols_to']) ? $data['symbols_to'] : null;
        $this->container['comment'] = isset($data['comment']) ? $data['comment'] : null;
        $this->container['private_comment'] = isset($data['private_comment']) ? $data['private_comment'] : null;
        $this->container['express'] = isset($data['express']) ? $data['express'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets login
     *
     * @return string
     */
    public function getLogin()
    {
        return $this->container['login'];
    }

    /**
     * Sets login
     *
     * @param string $login login
     *
     * @return $this
     */
    public function setLogin($login)
    {
        $this->container['login'] = $login;

        return $this;
    }

    /**
     * Gets balance
     *
     * @return float
     */
    public function getBalance()
    {
        return $this->container['balance'];
    }

    /**
     * Sets balance
     *
     * @param float $balance balance
     *
     * @return $this
     */
    public function setBalance($balance)
    {
        $this->container['balance'] = $balance;

        return $this;
    }

    /**
     * Gets is_enough_balance
     *
     * @return bool
     */
    public function getIsEnoughBalance()
    {
        return $this->container['is_enough_balance'];
    }

    /**
     * Sets is_enough_balance
     *
     * @param bool $is_enough_balance Выполняются ли задания из очереди, или выполнение приостановлено из-за недостаточного баланса
     *
     * @return $this
     */
    public function setIsEnoughBalance($is_enough_balance)
    {
        $this->container['is_enough_balance'] = $is_enough_balance;

        return $this;
    }

    /**
     * Gets symbols_from
     *
     * @return int
     */
    public function getSymbolsFrom()
    {
        return $this->container['symbols_from'];
    }

    /**
     * Sets symbols_from
     *
     * @param int $symbols_from symbols_from
     *
     * @return $this
     */
    public function setSymbolsFrom($symbols_from)
    {
        $this->container['symbols_from'] = $symbols_from;

        return $this;
    }

    /**
     * Gets symbols_to
     *
     * @return int
     */
    public function getSymbolsTo()
    {
        return $this->container['symbols_to'];
    }

    /**
     * Sets symbols_to
     *
     * @param int $symbols_to symbols_to
     *
     * @return $this
     */
    public function setSymbolsTo($symbols_to)
    {
        $this->container['symbols_to'] = $symbols_to;

        return $this;
    }

    /**
     * Gets comment
     *
     * @return string
     */
    public function getComment()
    {
        return $this->container['comment'];
    }

    /**
     * Sets comment
     *
     * @param string $comment comment
     *
     * @return $this
     */
    public function setComment($comment)
    {
        $this->container['comment'] = $comment;

        return $this;
    }

    /**
     * Gets private_comment
     *
     * @return string
     */
    public function getPrivateComment()
    {
        return $this->container['private_comment'];
    }

    /**
     * Sets private_comment
     *
     * @param string $private_comment private_comment
     *
     * @return $this
     */
    public function setPrivateComment($private_comment)
    {
        $this->container['private_comment'] = $private_comment;

        return $this;
    }

    /**
     * Gets express
     *
     * @return bool
     */
    public function getExpress()
    {
        return $this->container['express'];
    }

    /**
     * Sets express
     *
     * @param bool $express express
     *
     * @return $this
     */
    public function setExpress($express)
    {
        $this->container['express'] = $express;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}
