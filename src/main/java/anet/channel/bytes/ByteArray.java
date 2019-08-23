package anet.channel.bytes;

import anet.channel.bytes.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteArray implements Comparable<ByteArray> {
    final byte[] buffer;
    int bufferLength;
    int dataLength;

    public byte[] getBuffer() {
        return this.buffer;
    }

    public int getBufferLength() {
        return this.bufferLength;
    }

    public int getDataLength() {
        return this.dataLength;
    }

    public void recycle() {
        if (this.bufferLength != 0) {
            a.C0000a.f1176a.a(this);
        }
    }

    public void setDataLength(int i) {
        this.dataLength = i;
    }

    public static ByteArray create(int i) {
        return new ByteArray(null, i);
    }

    public static ByteArray wrap(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return wrap(bArr, bArr.length);
    }

    public int readFrom(InputStream inputStream) throws IOException {
        int i = 0;
        int read = inputStream.read(this.buffer, 0, this.bufferLength);
        if (read != -1) {
            i = read;
        }
        this.dataLength = i;
        return read;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.buffer, 0, this.dataLength);
    }

    public int compareTo(ByteArray byteArray) {
        if (this.bufferLength != byteArray.bufferLength) {
            return this.bufferLength - byteArray.bufferLength;
        }
        if (this.buffer == null) {
            return -1;
        }
        if (byteArray.buffer == null) {
            return 1;
        }
        return hashCode() - byteArray.hashCode();
    }

    private ByteArray(byte[] bArr, int i) {
        this.buffer = bArr == null ? new byte[i] : bArr;
        this.bufferLength = this.buffer.length;
        this.dataLength = i;
    }

    public static ByteArray wrap(byte[] bArr, int i) {
        if (bArr == null || i < 0 || i > bArr.length) {
            return null;
        }
        return new ByteArray(bArr, i);
    }
}