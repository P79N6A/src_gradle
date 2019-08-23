package org.msgpack.type;

public abstract class AbstractBooleanValue extends AbstractValue implements BooleanValue {
    public BooleanValue asBooleanValue() {
        return this;
    }

    public boolean isBooleanValue() {
        return true;
    }

    AbstractBooleanValue() {
    }
}
