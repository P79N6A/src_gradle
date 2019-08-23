package org.msgpack.template;

import java.io.IOException;
import org.msgpack.c;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class FloatTemplate extends AbstractTemplate<Float> {
    static final FloatTemplate instance = new FloatTemplate();

    private FloatTemplate() {
    }

    public static FloatTemplate getInstance() {
        return instance;
    }

    public Float read(Unpacker unpacker, Float f2, boolean z) throws IOException {
        if (z || !unpacker.trySkipNil()) {
            return Float.valueOf(unpacker.readFloat());
        }
        return null;
    }

    public void write(Packer packer, Float f2, boolean z) throws IOException {
        if (f2 != null) {
            packer.write(f2.floatValue());
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new c("Attempted to write null");
        }
    }
}
