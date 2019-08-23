package com.facebook.common.memory;

import java.io.IOException;
import java.io.InputStream;

public interface f {
    e newByteBuffer(InputStream inputStream) throws IOException;

    e newByteBuffer(InputStream inputStream, int i) throws IOException;

    e newByteBuffer(byte[] bArr);

    h newOutputStream();

    h newOutputStream(int i);
}
