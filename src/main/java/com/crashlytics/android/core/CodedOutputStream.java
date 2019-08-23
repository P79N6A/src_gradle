package com.crashlytics.android.core;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public final class CodedOutputStream implements Flushable {
    private final byte[] buffer;
    private final int limit;
    private final OutputStream output;
    private int position;

    static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public static int computeBoolSizeNoTag(boolean z) {
        return 1;
    }

    public static int computeDoubleSizeNoTag(double d2) {
        return 8;
    }

    public static int computeFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeFloatSizeNoTag(float f2) {
        return 4;
    }

    static int computePreferredBufferSize(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int computeRawVarint32Size(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeSFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long encodeZigZag64(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public final void flush() throws IOException {
        if (this.output != null) {
            refreshBuffer();
        }
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    private void refreshBuffer() throws IOException {
        if (this.output != null) {
            this.output.write(this.buffer, 0, this.position);
            this.position = 0;
            return;
        }
        throw new OutOfSpaceException();
    }

    public final int spaceLeft() {
        if (this.output == null) {
            return this.limit - this.position;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    public final void writeBoolNoTag(boolean z) throws IOException {
        writeRawByte(z ? 1 : 0);
    }

    public final void writeEnumNoTag(int i) throws IOException {
        writeInt32NoTag(i);
    }

    public final void writeFixed32NoTag(int i) throws IOException {
        writeRawLittleEndian32(i);
    }

    public final void writeFixed64NoTag(long j) throws IOException {
        writeRawLittleEndian64(j);
    }

    public final void writeInt64NoTag(long j) throws IOException {
        writeRawVarint64(j);
    }

    public final void writeSFixed32NoTag(int i) throws IOException {
        writeRawLittleEndian32(i);
    }

    public final void writeSFixed64NoTag(long j) throws IOException {
        writeRawLittleEndian64(j);
    }

    public final void writeUInt32NoTag(int i) throws IOException {
        writeRawVarint32(i);
    }

    public final void writeUInt64NoTag(long j) throws IOException {
        writeRawVarint64(j);
    }

    public static int computeEnumSizeNoTag(int i) {
        return computeInt32SizeNoTag(i);
    }

    public static int computeInt64SizeNoTag(long j) {
        return computeRawVarint64Size(j);
    }

    public static int computeUInt32SizeNoTag(int i) {
        return computeRawVarint32Size(i);
    }

    public static int computeUInt64SizeNoTag(long j) {
        return computeRawVarint64Size(j);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public final void writeDoubleNoTag(double d2) throws IOException {
        writeRawLittleEndian64(Double.doubleToRawLongBits(d2));
    }

    public final void writeFloatNoTag(float f2) throws IOException {
        writeRawLittleEndian32(Float.floatToRawIntBits(f2));
    }

    public final void writeRawByte(int i) throws IOException {
        writeRawByte((byte) i);
    }

    public final void writeRawBytes(byte[] bArr) throws IOException {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public final void writeSInt32NoTag(int i) throws IOException {
        writeRawVarint32(encodeZigZag32(i));
    }

    public final void writeSInt64NoTag(long j) throws IOException {
        writeRawVarint64(encodeZigZag64(j));
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeRawVarint32Size(byteString.size()) + byteString.size();
    }

    public static int computeInt32SizeNoTag(int i) {
        if (i >= 0) {
            return computeRawVarint32Size(i);
        }
        return 10;
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeRawVarint32Size(encodeZigZag32(i));
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeRawVarint64Size(encodeZigZag64(j));
    }

    public static int computeTagSize(int i) {
        return computeRawVarint32Size(WireFormat.makeTag(i, 0));
    }

    public final void writeBytesNoTag(ByteString byteString) throws IOException {
        writeRawVarint32(byteString.size());
        writeRawBytes(byteString);
    }

    public final void writeInt32NoTag(int i) throws IOException {
        if (i >= 0) {
            writeRawVarint32(i);
        } else {
            writeRawVarint64((long) i);
        }
    }

    public final void writeRawBytes(ByteString byteString) throws IOException {
        writeRawBytes(byteString, 0, byteString.size());
    }

    public final void writeStringNoTag(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        writeRawVarint32(bytes.length);
        writeRawBytes(bytes);
    }

    public static int computeStringSizeNoTag(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return computeRawVarint32Size(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported.", e2);
        }
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawByte(byte b2) throws IOException {
        if (this.position == this.limit) {
            refreshBuffer();
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        bArr[i] = b2;
    }

    public final void writeRawLittleEndian32(int i) throws IOException {
        writeRawByte(i & 255);
        writeRawByte((i >> 8) & 255);
        writeRawByte((i >> 16) & 255);
        writeRawByte((i >> 24) & 255);
    }

    public final void writeRawVarint32(int i) throws IOException {
        while ((i & -128) != 0) {
            writeRawByte((i & 127) | SearchJediMixFeedAdapter.f42517f);
            i >>>= 7;
        }
        writeRawByte(i);
    }

    public final void writeRawVarint64(long j) throws IOException {
        while ((-128 & j) != 0) {
            writeRawByte((((int) j) & 127) | SearchJediMixFeedAdapter.f42517f);
            j >>>= 7;
        }
        writeRawByte((int) j);
    }

    public final void writeRawLittleEndian64(long j) throws IOException {
        writeRawByte(((int) j) & 255);
        writeRawByte(((int) (j >> 8)) & 255);
        writeRawByte(((int) (j >> 16)) & 255);
        writeRawByte(((int) (j >> 24)) & 255);
        writeRawByte(((int) (j >> 32)) & 255);
        writeRawByte(((int) (j >> 40)) & 255);
        writeRawByte(((int) (j >> 48)) & 255);
        writeRawByte(((int) (j >> 56)) & 255);
    }

    public final void writeBool(int i, boolean z) throws IOException {
        writeTag(i, 0);
        writeBoolNoTag(z);
    }

    public final void writeBytes(int i, ByteString byteString) throws IOException {
        writeTag(i, 2);
        writeBytesNoTag(byteString);
    }

    public final void writeDouble(int i, double d2) throws IOException {
        writeTag(i, 1);
        writeDoubleNoTag(d2);
    }

    public final void writeEnum(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeEnumNoTag(i2);
    }

    public final void writeFixed32(int i, int i2) throws IOException {
        writeTag(i, 5);
        writeFixed32NoTag(i2);
    }

    public final void writeFixed64(int i, long j) throws IOException {
        writeTag(i, 1);
        writeFixed64NoTag(j);
    }

    public final void writeFloat(int i, float f2) throws IOException {
        writeTag(i, 5);
        writeFloatNoTag(f2);
    }

    public final void writeInt32(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeInt32NoTag(i2);
    }

    public final void writeInt64(int i, long j) throws IOException {
        writeTag(i, 0);
        writeInt64NoTag(j);
    }

    public final void writeSFixed32(int i, int i2) throws IOException {
        writeTag(i, 5);
        writeSFixed32NoTag(i2);
    }

    public final void writeSFixed64(int i, long j) throws IOException {
        writeTag(i, 1);
        writeSFixed64NoTag(j);
    }

    public final void writeSInt32(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeSInt32NoTag(i2);
    }

    public final void writeSInt64(int i, long j) throws IOException {
        writeTag(i, 0);
        writeSInt64NoTag(j);
    }

    public final void writeString(int i, String str) throws IOException {
        writeTag(i, 2);
        writeStringNoTag(str);
    }

    public final void writeTag(int i, int i2) throws IOException {
        writeRawVarint32(WireFormat.makeTag(i, i2));
    }

    public final void writeUInt32(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeUInt32NoTag(i2);
    }

    public final void writeUInt64(int i, long j) throws IOException {
        writeTag(i, 0);
        writeUInt64NoTag(j);
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.output = outputStream;
        this.buffer = bArr;
        this.limit = bArr.length;
    }

    public static int computeBoolSize(int i, boolean z) {
        return computeTagSize(i) + computeBoolSizeNoTag(z);
    }

    public static int computeBytesSize(int i, ByteString byteString) {
        return computeTagSize(i) + computeBytesSizeNoTag(byteString);
    }

    public static int computeDoubleSize(int i, double d2) {
        return computeTagSize(i) + computeDoubleSizeNoTag(d2);
    }

    public static int computeEnumSize(int i, int i2) {
        return computeTagSize(i) + computeEnumSizeNoTag(i2);
    }

    public static int computeFixed32Size(int i, int i2) {
        return computeTagSize(i) + computeFixed32SizeNoTag(i2);
    }

    public static int computeFixed64Size(int i, long j) {
        return computeTagSize(i) + computeFixed64SizeNoTag(j);
    }

    public static int computeFloatSize(int i, float f2) {
        return computeTagSize(i) + computeFloatSizeNoTag(f2);
    }

    public static int computeInt32Size(int i, int i2) {
        return computeTagSize(i) + computeInt32SizeNoTag(i2);
    }

    public static int computeInt64Size(int i, long j) {
        return computeTagSize(i) + computeInt64SizeNoTag(j);
    }

    public static int computeSFixed32Size(int i, int i2) {
        return computeTagSize(i) + computeSFixed32SizeNoTag(i2);
    }

    public static int computeSFixed64Size(int i, long j) {
        return computeTagSize(i) + computeSFixed64SizeNoTag(j);
    }

    public static int computeSInt32Size(int i, int i2) {
        return computeTagSize(i) + computeSInt32SizeNoTag(i2);
    }

    public static int computeSInt64Size(int i, long j) {
        return computeTagSize(i) + computeSInt64SizeNoTag(j);
    }

    public static int computeStringSize(int i, String str) {
        return computeTagSize(i) + computeStringSizeNoTag(str);
    }

    public static int computeUInt32Size(int i, int i2) {
        return computeTagSize(i) + computeUInt32SizeNoTag(i2);
    }

    public static int computeUInt64Size(int i, long j) {
        return computeTagSize(i) + computeUInt64SizeNoTag(j);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i) {
        return new CodedOutputStream(outputStream, new byte[i]);
    }

    public static int computeRawMessageSetExtensionSize(int i, ByteString byteString) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i) + computeBytesSize(3, byteString);
    }

    public final void writeRawMessageSetExtension(int i, ByteString byteString) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeBytes(3, byteString);
        writeTag(1, 4);
    }

    private CodedOutputStream(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.position = i;
        this.limit = i + i2;
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i, int i2) {
        return new CodedOutputStream(bArr, i, i2);
    }

    public final void writeRawBytes(byte[] bArr, int i, int i2) throws IOException {
        if (this.limit - this.position >= i2) {
            System.arraycopy(bArr, i, this.buffer, this.position, i2);
            this.position += i2;
            return;
        }
        int i3 = this.limit - this.position;
        System.arraycopy(bArr, i, this.buffer, this.position, i3);
        int i4 = i + i3;
        int i5 = i2 - i3;
        this.position = this.limit;
        refreshBuffer();
        if (i5 <= this.limit) {
            System.arraycopy(bArr, i4, this.buffer, 0, i5);
            this.position = i5;
            return;
        }
        this.output.write(bArr, i4, i5);
    }

    public final void writeRawBytes(ByteString byteString, int i, int i2) throws IOException {
        if (this.limit - this.position >= i2) {
            byteString.copyTo(this.buffer, i, this.position, i2);
            this.position += i2;
            return;
        }
        int i3 = this.limit - this.position;
        byteString.copyTo(this.buffer, i, this.position, i3);
        int i4 = i + i3;
        int i5 = i2 - i3;
        this.position = this.limit;
        refreshBuffer();
        if (i5 <= this.limit) {
            byteString.copyTo(this.buffer, i4, 0, i5);
            this.position = i5;
            return;
        }
        InputStream newInput = byteString.newInput();
        long j = (long) i4;
        if (j == newInput.skip(j)) {
            while (i5 > 0) {
                int min = Math.min(i5, this.limit);
                int read = newInput.read(this.buffer, 0, min);
                if (read == min) {
                    this.output.write(this.buffer, 0, read);
                    i5 -= read;
                } else {
                    throw new IllegalStateException("Read failed.");
                }
            }
            return;
        }
        throw new IllegalStateException("Skip failed.");
    }
}