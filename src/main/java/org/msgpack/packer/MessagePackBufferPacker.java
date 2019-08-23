package org.msgpack.packer;

import org.msgpack.a;
import org.msgpack.a.g;

public class MessagePackBufferPacker extends MessagePackPacker implements BufferPacker {
    public byte[] toByteArray() {
        return ((g) this.out).a();
    }

    public MessagePackBufferPacker(a aVar) {
        this(aVar, 512);
    }

    public MessagePackBufferPacker(a aVar, int i) {
        super(aVar, new g(i));
    }
}
