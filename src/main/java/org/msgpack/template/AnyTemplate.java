package org.msgpack.template;

import java.io.IOException;
import org.msgpack.c;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class AnyTemplate<T> extends AbstractTemplate<T> {
    private TemplateRegistry registry;

    public AnyTemplate(TemplateRegistry templateRegistry) {
        this.registry = templateRegistry;
    }

    public void write(Packer packer, T t, boolean z) throws IOException {
        if (t != null) {
            this.registry.lookup(t.getClass()).write(packer, t);
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new c("Attempted to write null");
        }
    }

    public T read(Unpacker unpacker, T t, boolean z) throws IOException, c {
        if (!z && unpacker.trySkipNil()) {
            return null;
        }
        if (t != null) {
            T read = unpacker.read(t);
            if (!z || read != null) {
                return read;
            }
            throw new c("Unexpected nil value");
        }
        throw new c("convert into unknown type is invalid");
    }
}
