package org.msgpack.type;

import java.io.IOException;
import org.msgpack.packer.Packer;

public class TrueValueImpl extends AbstractBooleanValue {
    private static TrueValueImpl instance = new TrueValueImpl();

    public boolean getBoolean() {
        return true;
    }

    public int hashCode() {
        return 1231;
    }

    public String toString() {
        return "true";
    }

    private TrueValueImpl() {
    }

    static TrueValueImpl getInstance() {
        return instance;
    }

    public StringBuilder toString(StringBuilder sb) {
        sb.append("true");
        return sb;
    }

    public void writeTo(Packer packer) throws IOException {
        packer.write(true);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        if (value.isBooleanValue() && value.asBooleanValue().getBoolean()) {
            return true;
        }
        return false;
    }
}
