package org.msgpack.template;

import java.io.IOException;
import org.msgpack.b;
import org.msgpack.c;
import org.msgpack.packer.Packer;

public class MessagePackableTemplate extends AbstractTemplate<b> {
    private Class<?> targetClass;

    MessagePackableTemplate(Class<?> cls) {
        this.targetClass = cls;
    }

    public void write(Packer packer, b bVar, boolean z) throws IOException {
        if (bVar != null) {
            return;
        }
        if (!z) {
            packer.writeNil();
            return;
        }
        throw new c("Attempted to write null");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: org.msgpack.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.msgpack.b read(org.msgpack.unpacker.Unpacker r1, org.msgpack.b r2, boolean r3) throws java.io.IOException {
        /*
            r0 = this;
            if (r3 != 0) goto L_0x000a
            boolean r1 = r1.trySkipNil()
            if (r1 == 0) goto L_0x000a
            r1 = 0
            return r1
        L_0x000a:
            if (r2 != 0) goto L_0x0024
            java.lang.Class<?> r1 = r0.targetClass     // Catch:{ InstantiationException -> 0x001d, IllegalAccessException -> 0x0016 }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ InstantiationException -> 0x001d, IllegalAccessException -> 0x0016 }
            r2 = r1
            org.msgpack.b r2 = (org.msgpack.b) r2     // Catch:{ InstantiationException -> 0x001d, IllegalAccessException -> 0x0016 }
            goto L_0x0024
        L_0x0016:
            r1 = move-exception
            org.msgpack.c r2 = new org.msgpack.c
            r2.<init>((java.lang.Throwable) r1)
            throw r2
        L_0x001d:
            r1 = move-exception
            org.msgpack.c r2 = new org.msgpack.c
            r2.<init>((java.lang.Throwable) r1)
            throw r2
        L_0x0024:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.MessagePackableTemplate.read(org.msgpack.unpacker.Unpacker, org.msgpack.b, boolean):org.msgpack.b");
    }
}
