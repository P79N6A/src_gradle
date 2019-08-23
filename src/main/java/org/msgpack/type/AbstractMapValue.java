package org.msgpack.type;

import java.util.AbstractMap;
import org.msgpack.c;

public abstract class AbstractMapValue extends AbstractMap<Value, Value> implements MapValue {
    public MapValue asMapValue() {
        return this;
    }

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
        return true;
    }

    public boolean isNilValue() {
        return false;
    }

    public boolean isRawValue() {
        return false;
    }

    AbstractMapValue() {
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

    public RawValue asRawValue() {
        throw new c();
    }
}
