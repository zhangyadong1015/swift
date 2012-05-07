/*
 * Copyright 2004-present Facebook. All Rights Reserved.
 */
package com.facebook.swift.codec;

import com.facebook.swift.ThriftCodec;
import com.facebook.swift.internal.TProtocolReader;
import com.facebook.swift.internal.TProtocolWriter;
import com.facebook.swift.metadata.ThriftType;
import com.google.common.base.Preconditions;

public class DoubleThriftCodec implements ThriftCodec<Double> {
  @Override
  public ThriftType getType() {
    return ThriftType.DOUBLE;
  }

  @Override
  public Double read(TProtocolReader protocol) throws Exception {
    Preconditions.checkNotNull(protocol, "protocol is null");
    return protocol.readDouble();
  }

  @Override
  public void write(Double value, TProtocolWriter protocol) throws Exception {
    Preconditions.checkNotNull(value, "value is null");
    Preconditions.checkNotNull(protocol, "protocol is null");
    protocol.writeDouble(value);
  }
}
