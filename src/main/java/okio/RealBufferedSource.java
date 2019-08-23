package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

public final class RealBufferedSource implements BufferedSource {
    public final Buffer buffer = new Buffer();
    boolean closed;
    public final Source source;

    public final Buffer buffer() {
        return this.buffer;
    }

    public final InputStream inputStream() {
        return new InputStream() {
            public void close() throws IOException {
                RealBufferedSource.this.close();
            }

            public int available() throws IOException {
                if (!RealBufferedSource.this.closed) {
                    return (int) Math.min(RealBufferedSource.this.buffer.size, 2147483647L);
                }
                throw new IOException("closed");
            }

            public String toString() {
                return RealBufferedSource.this + ".inputStream()";
            }

            public int read() throws IOException {
                if (RealBufferedSource.this.closed) {
                    throw new IOException("closed");
                } else if (RealBufferedSource.this.buffer.size == 0 && RealBufferedSource.this.source.read(RealBufferedSource.this.buffer, 8192) == -1) {
                    return -1;
                } else {
                    return RealBufferedSource.this.buffer.readByte() & 255;
                }
            }

            public int read(byte[] bArr, int i, int i2) throws IOException {
                if (!RealBufferedSource.this.closed) {
                    Util.checkOffsetAndCount((long) bArr.length, (long) i, (long) i2);
                    if (RealBufferedSource.this.buffer.size == 0 && RealBufferedSource.this.source.read(RealBufferedSource.this.buffer, 8192) == -1) {
                        return -1;
                    }
                    return RealBufferedSource.this.buffer.read(bArr, i, i2);
                }
                throw new IOException("closed");
            }
        };
    }

    public final boolean isOpen() {
        if (!this.closed) {
            return true;
        }
        return false;
    }

    public final Timeout timeout() {
        return this.source.timeout();
    }

    public final byte readByte() throws IOException {
        require(1);
        return this.buffer.readByte();
    }

    public final byte[] readByteArray() throws IOException {
        this.buffer.writeAll(this.source);
        return this.buffer.readByteArray();
    }

    public final ByteString readByteString() throws IOException {
        this.buffer.writeAll(this.source);
        return this.buffer.readByteString();
    }

    public final int readInt() throws IOException {
        require(4);
        return this.buffer.readInt();
    }

    public final int readIntLe() throws IOException {
        require(4);
        return this.buffer.readIntLe();
    }

    public final long readLong() throws IOException {
        require(8);
        return this.buffer.readLong();
    }

    public final long readLongLe() throws IOException {
        require(8);
        return this.buffer.readLongLe();
    }

    public final short readShort() throws IOException {
        require(2);
        return this.buffer.readShort();
    }

    public final short readShortLe() throws IOException {
        require(2);
        return this.buffer.readShortLe();
    }

    public final String readUtf8() throws IOException {
        this.buffer.writeAll(this.source);
        return this.buffer.readUtf8();
    }

    public final String readUtf8LineStrict() throws IOException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    public final void close() throws IOException {
        if (!this.closed) {
            this.closed = true;
            this.source.close();
            this.buffer.clear();
        }
    }

    public final String toString() {
        return "buffer(" + this.source + ")";
    }

    public final boolean exhausted() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        } else if (!this.buffer.exhausted() || this.source.read(this.buffer, 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    public final int readUtf8CodePoint() throws IOException {
        require(1);
        byte b2 = this.buffer.getByte(0);
        if ((b2 & 224) == 192) {
            require(2);
        } else if ((b2 & 240) == 224) {
            require(3);
        } else if ((b2 & 248) == 240) {
            require(4);
        }
        return this.buffer.readUtf8CodePoint();
    }

    @Nullable
    public final String readUtf8Line() throws IOException {
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return this.buffer.readUtf8Line(indexOf);
        }
        if (this.buffer.size != 0) {
            return readUtf8(this.buffer.size);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long readDecimalLong() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            r6.require(r0)
            r0 = 0
            r1 = 0
        L_0x0007:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.request(r3)
            if (r3 == 0) goto L_0x0040
            okio.Buffer r3 = r6.buffer
            long r4 = (long) r1
            byte r3 = r3.getByte(r4)
            r4 = 48
            if (r3 < r4) goto L_0x001f
            r4 = 57
            if (r3 <= r4) goto L_0x0026
        L_0x001f:
            if (r1 != 0) goto L_0x0028
            r4 = 45
            if (r3 == r4) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = r2
            goto L_0x0007
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x0040
        L_0x002b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x0040:
            okio.Buffer r0 = r6.buffer
            long r0 = r0.readDecimalLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.RealBufferedSource.readDecimalLong():long");
    }

    public final long readHexadecimalUnsignedLong() throws IOException {
        require(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!request((long) i2)) {
                break;
            }
            byte b2 = this.buffer.getByte((long) i);
            if ((b2 >= 48 && b2 <= 57) || ((b2 >= 97 && b2 <= 102) || (b2 >= 65 && b2 <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(b2)}));
            }
        }
        return this.buffer.readHexadecimalUnsignedLong();
    }

    public final long indexOf(ByteString byteString) throws IOException {
        return indexOf(byteString, 0);
    }

    public final long indexOfElement(ByteString byteString) throws IOException {
        return indexOfElement(byteString, 0);
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final long indexOf(byte b2) throws IOException {
        return indexOf(b2, 0, Long.MAX_VALUE);
    }

    public final void require(long j) throws IOException {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    RealBufferedSource(Source source2) {
        if (source2 != null) {
            this.source = source2;
            return;
        }
        throw new NullPointerException("source == null");
    }

    public final byte[] readByteArray(long j) throws IOException {
        require(j);
        return this.buffer.readByteArray(j);
    }

    public final ByteString readByteString(long j) throws IOException {
        require(j);
        return this.buffer.readByteString(j);
    }

    public final String readUtf8(long j) throws IOException {
        require(j);
        return this.buffer.readUtf8(j);
    }

    public final int read(ByteBuffer byteBuffer) throws IOException {
        if (this.buffer.size == 0 && this.source.read(this.buffer, 8192) == -1) {
            return -1;
        }
        return this.buffer.read(byteBuffer);
    }

    public final void readFully(byte[] bArr) throws IOException {
        try {
            require((long) bArr.length);
            this.buffer.readFully(bArr);
        } catch (EOFException e2) {
            int i = 0;
            while (this.buffer.size > 0) {
                int read = this.buffer.read(bArr, i, (int) this.buffer.size);
                if (read != -1) {
                    i += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e2;
        }
    }

    public final String readString(Charset charset) throws IOException {
        if (charset != null) {
            this.buffer.writeAll(this.source);
            return this.buffer.readString(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public final int select(Options options) throws IOException {
        if (!this.closed) {
            do {
                int selectPrefix = this.buffer.selectPrefix(options);
                if (selectPrefix == -1) {
                    return -1;
                }
                long size = (long) options.byteStrings[selectPrefix].size();
                if (size <= this.buffer.size) {
                    this.buffer.skip(size);
                    return selectPrefix;
                }
            } while (this.source.read(this.buffer, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    public final long readAll(Sink sink) throws IOException {
        if (sink != null) {
            long j = 0;
            while (this.source.read(this.buffer, 8192) != -1) {
                long completeSegmentByteCount = this.buffer.completeSegmentByteCount();
                if (completeSegmentByteCount > 0) {
                    j += completeSegmentByteCount;
                    sink.write(this.buffer, completeSegmentByteCount);
                }
            }
            if (this.buffer.size() <= 0) {
                return j;
            }
            long size = j + this.buffer.size();
            sink.write(this.buffer, this.buffer.size());
            return size;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public final boolean request(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.closed) {
            while (this.buffer.size < j) {
                if (this.source.read(this.buffer, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final void skip(long j) throws IOException {
        if (!this.closed) {
            while (j > 0) {
                if (this.buffer.size == 0 && this.source.read(this.buffer, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.buffer.size());
                this.buffer.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final String readUtf8LineStrict(long j) throws IOException {
        long j2;
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long indexOf = indexOf((byte) 10, 0, j2);
            if (indexOf != -1) {
                return this.buffer.readUtf8Line(indexOf);
            }
            if (j2 < Long.MAX_VALUE && request(j2) && this.buffer.getByte(j2 - 1) == 13 && request(1 + j2) && this.buffer.getByte(j2) == 10) {
                return this.buffer.readUtf8Line(j2);
            }
            this.buffer.copyTo(new Buffer(), 0, Math.min(32, this.buffer.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.buffer.size(), j) + " content=" + r6.readByteString().hex() + 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    public final boolean rangeEquals(long j, ByteString byteString) throws IOException {
        return rangeEquals(j, byteString, 0, byteString.size());
    }

    public final void readFully(Buffer buffer2, long j) throws IOException {
        try {
            require(j);
            this.buffer.readFully(buffer2, j);
        } catch (EOFException e2) {
            buffer2.writeAll(this.buffer);
            throw e2;
        }
    }

    public final long indexOf(byte b2, long j) throws IOException {
        return indexOf(b2, j, Long.MAX_VALUE);
    }

    public final String readString(long j, Charset charset) throws IOException {
        require(j);
        if (charset != null) {
            return this.buffer.readString(j, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public final long indexOf(ByteString byteString, long j) throws IOException {
        if (!this.closed) {
            while (true) {
                long indexOf = this.buffer.indexOf(byteString, j);
                if (indexOf != -1) {
                    return indexOf;
                }
                long j2 = this.buffer.size;
                if (this.source.read(this.buffer, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (j2 - ((long) byteString.size())) + 1);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final long indexOfElement(ByteString byteString, long j) throws IOException {
        if (!this.closed) {
            while (true) {
                long indexOfElement = this.buffer.indexOfElement(byteString, j);
                if (indexOfElement != -1) {
                    return indexOfElement;
                }
                long j2 = this.buffer.size;
                if (this.source.read(this.buffer, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final long read(Buffer buffer2, long j) throws IOException {
        if (buffer2 == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.closed) {
            throw new IllegalStateException("closed");
        } else if (this.buffer.size == 0 && this.source.read(this.buffer, 8192) == -1) {
            return -1;
        } else {
            return this.buffer.read(buffer2, Math.min(j, this.buffer.size));
        }
    }

    public final long indexOf(byte b2, long j, long j2) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        } else {
            while (j < j2) {
                long indexOf = this.buffer.indexOf(b2, j, j2);
                if (indexOf != -1) {
                    return indexOf;
                }
                long j3 = this.buffer.size;
                if (j3 >= j2 || this.source.read(this.buffer, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j3);
            }
            return -1;
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = (long) i2;
        Util.checkOffsetAndCount((long) bArr.length, (long) i, j);
        if (this.buffer.size == 0 && this.source.read(this.buffer, 8192) == -1) {
            return -1;
        }
        return this.buffer.read(bArr, i, (int) Math.min(j, this.buffer.size));
    }

    public final boolean rangeEquals(long j, ByteString byteString, int i, int i2) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || i < 0 || i2 < 0 || byteString.size() - i < i2) {
            return false;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!request(1 + j2) || this.buffer.getByte(j2) != byteString.getByte(i + i3)) {
                    return false;
                }
            }
            return true;
        }
    }
}
