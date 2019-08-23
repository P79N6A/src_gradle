package com.facebook.common.memory;

import java.io.Closeable;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

public interface e extends Closeable {

    public static class a extends RuntimeException {
        public a() {
            super("Invalid bytebuf. Already closed");
        }
    }

    @Nullable
    ByteBuffer getByteBuffer();

    long getNativePtr();

    boolean isClosed();

    byte read(int i);

    int read(int i, byte[] bArr, int i2, int i3);

    int size();
}
