/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

var jspb = require('google-protobuf');
var goog = jspb;
var global = Function('return this')();

goog.exportSymbol('proto.lorawan.DevAddrRequest', null, global);
goog.exportSymbol('proto.lorawan.DevAddrResponse', null, global);
goog.exportSymbol('proto.lorawan.PrefixesRequest', null, global);
goog.exportSymbol('proto.lorawan.PrefixesResponse', null, global);
goog.exportSymbol('proto.lorawan.PrefixesResponse.PrefixMapping', null, global);

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.lorawan.PrefixesRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.lorawan.PrefixesRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.lorawan.PrefixesRequest.displayName = 'proto.lorawan.PrefixesRequest';
}


if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.lorawan.PrefixesRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.lorawan.PrefixesRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lorawan.PrefixesRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lorawan.PrefixesRequest.toObject = function(includeInstance, msg) {
  var f, obj = {

  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.lorawan.PrefixesRequest}
 */
proto.lorawan.PrefixesRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lorawan.PrefixesRequest;
  return proto.lorawan.PrefixesRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lorawan.PrefixesRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lorawan.PrefixesRequest}
 */
proto.lorawan.PrefixesRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.lorawan.PrefixesRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lorawan.PrefixesRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lorawan.PrefixesRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lorawan.PrefixesRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
};



/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.lorawan.PrefixesResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.lorawan.PrefixesResponse.repeatedFields_, null);
};
goog.inherits(proto.lorawan.PrefixesResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.lorawan.PrefixesResponse.displayName = 'proto.lorawan.PrefixesResponse';
}
/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.lorawan.PrefixesResponse.repeatedFields_ = [1];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.lorawan.PrefixesResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.lorawan.PrefixesResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lorawan.PrefixesResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lorawan.PrefixesResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    prefixesList: jspb.Message.toObjectList(msg.getPrefixesList(),
    proto.lorawan.PrefixesResponse.PrefixMapping.toObject, includeInstance)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.lorawan.PrefixesResponse}
 */
proto.lorawan.PrefixesResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lorawan.PrefixesResponse;
  return proto.lorawan.PrefixesResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lorawan.PrefixesResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lorawan.PrefixesResponse}
 */
proto.lorawan.PrefixesResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.lorawan.PrefixesResponse.PrefixMapping;
      reader.readMessage(value,proto.lorawan.PrefixesResponse.PrefixMapping.deserializeBinaryFromReader);
      msg.addPrefixes(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.lorawan.PrefixesResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lorawan.PrefixesResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lorawan.PrefixesResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lorawan.PrefixesResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPrefixesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.lorawan.PrefixesResponse.PrefixMapping.serializeBinaryToWriter
    );
  }
};



/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.lorawan.PrefixesResponse.PrefixMapping = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.lorawan.PrefixesResponse.PrefixMapping.repeatedFields_, null);
};
goog.inherits(proto.lorawan.PrefixesResponse.PrefixMapping, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.lorawan.PrefixesResponse.PrefixMapping.displayName = 'proto.lorawan.PrefixesResponse.PrefixMapping';
}
/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.lorawan.PrefixesResponse.PrefixMapping.repeatedFields_ = [2];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.lorawan.PrefixesResponse.PrefixMapping.prototype.toObject = function(opt_includeInstance) {
  return proto.lorawan.PrefixesResponse.PrefixMapping.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lorawan.PrefixesResponse.PrefixMapping} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lorawan.PrefixesResponse.PrefixMapping.toObject = function(includeInstance, msg) {
  var f, obj = {
    prefix: jspb.Message.getFieldWithDefault(msg, 1, ""),
    usageList: jspb.Message.getRepeatedField(msg, 2)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.lorawan.PrefixesResponse.PrefixMapping}
 */
proto.lorawan.PrefixesResponse.PrefixMapping.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lorawan.PrefixesResponse.PrefixMapping;
  return proto.lorawan.PrefixesResponse.PrefixMapping.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lorawan.PrefixesResponse.PrefixMapping} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lorawan.PrefixesResponse.PrefixMapping}
 */
proto.lorawan.PrefixesResponse.PrefixMapping.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setPrefix(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.addUsage(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.lorawan.PrefixesResponse.PrefixMapping.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lorawan.PrefixesResponse.PrefixMapping.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lorawan.PrefixesResponse.PrefixMapping} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lorawan.PrefixesResponse.PrefixMapping.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPrefix();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getUsageList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      2,
      f
    );
  }
};


/**
 * optional string prefix = 1;
 * @return {string}
 */
proto.lorawan.PrefixesResponse.PrefixMapping.prototype.getPrefix = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.lorawan.PrefixesResponse.PrefixMapping.prototype.setPrefix = function(value) {
  jspb.Message.setField(this, 1, value);
};


/**
 * repeated string usage = 2;
 * @return {!Array.<string>}
 */
proto.lorawan.PrefixesResponse.PrefixMapping.prototype.getUsageList = function() {
  return /** @type {!Array.<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/** @param {!Array.<string>} value */
proto.lorawan.PrefixesResponse.PrefixMapping.prototype.setUsageList = function(value) {
  jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {!string} value
 * @param {number=} opt_index
 */
proto.lorawan.PrefixesResponse.PrefixMapping.prototype.addUsage = function(value, opt_index) {
  jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


proto.lorawan.PrefixesResponse.PrefixMapping.prototype.clearUsageList = function() {
  this.setUsageList([]);
};


/**
 * repeated PrefixMapping prefixes = 1;
 * @return {!Array.<!proto.lorawan.PrefixesResponse.PrefixMapping>}
 */
proto.lorawan.PrefixesResponse.prototype.getPrefixesList = function() {
  return /** @type{!Array.<!proto.lorawan.PrefixesResponse.PrefixMapping>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.lorawan.PrefixesResponse.PrefixMapping, 1));
};


/** @param {!Array.<!proto.lorawan.PrefixesResponse.PrefixMapping>} value */
proto.lorawan.PrefixesResponse.prototype.setPrefixesList = function(value) {
  jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.lorawan.PrefixesResponse.PrefixMapping=} opt_value
 * @param {number=} opt_index
 * @return {!proto.lorawan.PrefixesResponse.PrefixMapping}
 */
proto.lorawan.PrefixesResponse.prototype.addPrefixes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.lorawan.PrefixesResponse.PrefixMapping, opt_index);
};


proto.lorawan.PrefixesResponse.prototype.clearPrefixesList = function() {
  this.setPrefixesList([]);
};



/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.lorawan.DevAddrRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.lorawan.DevAddrRequest.repeatedFields_, null);
};
goog.inherits(proto.lorawan.DevAddrRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.lorawan.DevAddrRequest.displayName = 'proto.lorawan.DevAddrRequest';
}
/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.lorawan.DevAddrRequest.repeatedFields_ = [1];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.lorawan.DevAddrRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.lorawan.DevAddrRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lorawan.DevAddrRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lorawan.DevAddrRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    usageList: jspb.Message.getRepeatedField(msg, 1)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.lorawan.DevAddrRequest}
 */
proto.lorawan.DevAddrRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lorawan.DevAddrRequest;
  return proto.lorawan.DevAddrRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lorawan.DevAddrRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lorawan.DevAddrRequest}
 */
proto.lorawan.DevAddrRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.addUsage(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.lorawan.DevAddrRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lorawan.DevAddrRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lorawan.DevAddrRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lorawan.DevAddrRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getUsageList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      1,
      f
    );
  }
};


/**
 * repeated string usage = 1;
 * @return {!Array.<string>}
 */
proto.lorawan.DevAddrRequest.prototype.getUsageList = function() {
  return /** @type {!Array.<string>} */ (jspb.Message.getRepeatedField(this, 1));
};


/** @param {!Array.<string>} value */
proto.lorawan.DevAddrRequest.prototype.setUsageList = function(value) {
  jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {!string} value
 * @param {number=} opt_index
 */
proto.lorawan.DevAddrRequest.prototype.addUsage = function(value, opt_index) {
  jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


proto.lorawan.DevAddrRequest.prototype.clearUsageList = function() {
  this.setUsageList([]);
};



/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.lorawan.DevAddrResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.lorawan.DevAddrResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.lorawan.DevAddrResponse.displayName = 'proto.lorawan.DevAddrResponse';
}


if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.lorawan.DevAddrResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.lorawan.DevAddrResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lorawan.DevAddrResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lorawan.DevAddrResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    devAddr: msg.getDevAddr_asB64()
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.lorawan.DevAddrResponse}
 */
proto.lorawan.DevAddrResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lorawan.DevAddrResponse;
  return proto.lorawan.DevAddrResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lorawan.DevAddrResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lorawan.DevAddrResponse}
 */
proto.lorawan.DevAddrResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setDevAddr(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.lorawan.DevAddrResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lorawan.DevAddrResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lorawan.DevAddrResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lorawan.DevAddrResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDevAddr_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
};


/**
 * optional bytes dev_addr = 1;
 * @return {!(string|Uint8Array)}
 */
proto.lorawan.DevAddrResponse.prototype.getDevAddr = function() {
  return /** @type {!(string|Uint8Array)} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes dev_addr = 1;
 * This is a type-conversion wrapper around `getDevAddr()`
 * @return {string}
 */
proto.lorawan.DevAddrResponse.prototype.getDevAddr_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getDevAddr()));
};


/**
 * optional bytes dev_addr = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getDevAddr()`
 * @return {!Uint8Array}
 */
proto.lorawan.DevAddrResponse.prototype.getDevAddr_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getDevAddr()));
};


/** @param {!(string|Uint8Array)} value */
proto.lorawan.DevAddrResponse.prototype.setDevAddr = function(value) {
  jspb.Message.setField(this, 1, value);
};


goog.object.extend(exports, proto.lorawan);
