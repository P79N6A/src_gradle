package org.msgpack.template;

import java.io.IOException;
import org.msgpack.c;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class DoubleTemplate extends AbstractTemplate<Double> {
    static final DoubleTemplate instance = new DoubleTemplate();

    private DoubleTemplate() {
    }

    public static DoubleTemplate getInstance() {
        return instance;
    }

    public Double read(Unpacker unpacker, Double d2, boolean z) throws IOException {
        if (z || !unpacker.trySkipNil()) {
            return Double.valueOf(unpacker.readDouble());
        }
        return null;
    }

    public void write(Packer packer, Double d2, boolean z) throws IOException {
        if (d2 != null) {
            packer.write(d2.doubleValue());
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new c("Attempted to write null");
        }
    }
}
