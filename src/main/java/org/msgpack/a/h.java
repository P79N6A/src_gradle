package org.msgpack.a;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.nio.ByteBuffer;

public interface h extends Closeable, Flushable {
    void a(byte b2) throws IOException;

    void a(byte b2, byte b3) throws IOException;

    void a(byte b2, double d2) throws IOException;

    void a(byte b2, float f2) throws IOException;

    void a(byte b2, int i) throws IOException;

    void a(byte b2, long j) throws IOException;

    void a(byte b2, short s) throws IOException;

    void a(ByteBuffer byteBuffer) throws IOException;

    void a(byte[] bArr, int i, int i2) throws IOException;
}
