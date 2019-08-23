package org.msgpack.template;

import java.io.IOException;
import org.msgpack.c;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class ByteTemplate extends AbstractTemplate<Byte> {
    static final ByteTemplate instance = new ByteTemplate();

    private ByteTemplate() {
    }

    public static ByteTemplate getInstance() {
        return instance;
    }

    public Byte read(Unpacker unpacker, Byte b2, boolean z) throws IOException {
        if (z || !unpacker.trySkipNil()) {
            return Byte.valueOf(unpacker.readByte());
        }
        return null;
    }

    public void write(Packer packer, Byte b2, boolean z) throws IOException {
        if (b2 != null) {
            packer.write(b2.byteValue());
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new c("Attempted to write null");
        }
    }
}
