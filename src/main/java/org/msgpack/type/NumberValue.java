package org.msgpack.type;

import java.math.BigInteger;
import org.msgpack.c;

public abstract class NumberValue extends Number implements Value {
    public abstract BigInteger bigIntegerValue();

    public boolean isArrayValue() {
        return false;
    }

    public boolean isBooleanValue() {
        return false;
    }

    public boolean isFloatValue() {
        return false;
    }

    public boolean isIntegerValue() {
        return false;
    }

    public boolean isMapValue() {
        return false;
    }

    public boolean isNilValue() {
        return false;
    }

    public boolean isRawValue() {
        return false;
    }

    public ArrayValue asArrayValue() {
        throw new c();
    }

    public BooleanValue asBooleanValue() {
        throw new c();
    }

    public FloatValue asFloatValue() {
        throw new c();
    }

    public IntegerValue asIntegerValue() {
        throw new c();
    }

    public MapValue asMapValue() {
        throw new c();
    }

    public NilValue asNilValue() {
        throw new c();
    }

    public RawValue asRawValue() {
        throw new c();
    }
}
