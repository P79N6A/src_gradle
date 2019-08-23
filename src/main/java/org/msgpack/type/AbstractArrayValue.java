package org.msgpack.type;

import java.util.AbstractList;
import org.msgpack.c;

public abstract class AbstractArrayValue extends AbstractList<Value> implements ArrayValue {
    public ArrayValue asArrayValue() {
        return this;
    }

    public boolean isArrayValue() {
        return true;
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

    AbstractArrayValue() {
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

    public RawValue asRawValue() {
        throw new c();
    }
}
