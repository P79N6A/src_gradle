package org.msgpack.template;

import java.io.IOException;
import java.util.HashMap;
import org.msgpack.annotation.OrdinalEnum;
import org.msgpack.c;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class OrdinalEnumTemplate<T> extends AbstractTemplate<T> {
    protected T[] entries;
    protected HashMap<T, Integer> reverse = new HashMap<>();
    protected boolean strict;

    public OrdinalEnumTemplate(Class<T> cls) {
        this.entries = cls.getEnumConstants();
        boolean z = false;
        for (int i = 0; i < this.entries.length; i++) {
            this.reverse.put(this.entries[i], Integer.valueOf(i));
        }
        this.strict = (!cls.isAnnotationPresent(OrdinalEnum.class) || ((OrdinalEnum) cls.getAnnotation(OrdinalEnum.class)).a()) ? true : z;
    }

    public T read(Unpacker unpacker, T t, boolean z) throws IOException, c {
        if (!z && unpacker.trySkipNil()) {
            return null;
        }
        int readInt = unpacker.readInt();
        if (readInt < this.entries.length) {
            return this.entries[readInt];
        }
        if (!this.strict) {
            return null;
        }
        throw new c((Throwable) new IllegalArgumentException("ordinal: " + readInt));
    }

    public void write(Packer packer, T t, boolean z) throws IOException {
        if (t != null) {
            Integer num = this.reverse.get(t);
            if (num != null) {
                packer.write(num.intValue());
                return;
            }
            throw new c((Throwable) new IllegalArgumentException("ordinal: " + num));
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new c("Attempted to write null");
        }
    }
}
