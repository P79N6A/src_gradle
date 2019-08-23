package org.msgpack.type;

import java.math.BigInteger;

public abstract class IntegerValue extends NumberValue {
    public IntegerValue asIntegerValue() {
        return this;
    }

    public abstract byte getByte();

    public abstract int getInt();

    public abstract long getLong();

    public abstract short getShort();

    public boolean isIntegerValue() {
        return true;
    }

    public ValueType getType() {
        return ValueType.INTEGER;
    }

    public BigInteger getBigInteger() {
        return bigIntegerValue();
    }
}
