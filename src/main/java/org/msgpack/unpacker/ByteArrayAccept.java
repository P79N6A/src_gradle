package org.msgpack.unpacker;

import java.io.IOException;
import java.nio.ByteBuffer;

public final class ByteArrayAccept extends Accept {
    byte[] value;

    ByteArrayAccept() {
        super("raw value");
    }

    /* access modifiers changed from: package-private */
    public final void acceptEmptyRaw() {
        this.value = new byte[0];
    }

    /* access modifiers changed from: package-private */
    public final void acceptRaw(byte[] bArr) {
        this.value = bArr;
    }

    public final void refer(ByteBuffer byteBuffer, boolean z) throws IOException {
        this.value = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.value);
    }
}
