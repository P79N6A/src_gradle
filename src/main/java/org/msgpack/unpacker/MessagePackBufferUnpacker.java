package org.msgpack.unpacker;

import java.nio.ByteBuffer;
import org.msgpack.a;
import org.msgpack.a.f;

public class MessagePackBufferUnpacker extends MessagePackUnpacker implements BufferUnpacker {
    public MessagePackBufferUnpacker(a aVar) {
        this(aVar, 512);
    }

    public MessagePackBufferUnpacker wrap(byte[] bArr) {
        return wrap(bArr, 0, bArr.length);
    }

    public MessagePackBufferUnpacker(a aVar, int i) {
        super(aVar, new f(i));
    }

    public MessagePackBufferUnpacker wrap(byte[] bArr, int i, int i2) {
        f fVar = (f) this.in;
        if (fVar.f84187c >= 0) {
            ByteBuffer last = fVar.f84186b.getLast();
            fVar.f84186b.clear();
            last.position(0);
            last.limit(0);
            fVar.f84186b.addLast(last);
            fVar.f84187c = last.capacity();
        } else {
            fVar.f84186b.clear();
            fVar.f84187c = -1;
        }
        f fVar2 = (f) this.in;
        if (fVar2.f84187c <= 0 || fVar2.f84186b.getLast().remaining() != 0) {
            fVar2.f84186b.addLast(ByteBuffer.wrap(bArr, i, i2));
            fVar2.f84187c = -1;
        } else {
            fVar2.f84186b.add(fVar2.f84186b.size() - 1, ByteBuffer.wrap(bArr, i, i2));
        }
        return this;
    }
}
