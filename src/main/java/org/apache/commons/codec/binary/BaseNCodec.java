package org.apache.commons.codec.binary;

import java.util.Arrays;

public abstract class BaseNCodec {
    protected final byte PAD = 61;
    private final int chunkSeparatorLength;
    private final int encodedBlockSize;
    protected final int lineLength;
    private final int unencodedBlockSize;

    static class Context {
        byte[] buffer;
        int currentLinePos;
        boolean eof;
        int ibitWorkArea;
        long lbitWorkArea;
        int modulus;
        int pos;
        int readPos;

        Context() {
        }

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", new Object[]{getClass().getSimpleName(), Arrays.toString(this.buffer), Integer.valueOf(this.currentLinePos), Boolean.valueOf(this.eof), Integer.valueOf(this.ibitWorkArea), Long.valueOf(this.lbitWorkArea), Integer.valueOf(this.modulus), Integer.valueOf(this.pos), Integer.valueOf(this.readPos)});
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void encode(byte[] bArr, int i, int i2, Context context);

    /* access modifiers changed from: protected */
    public int getDefaultBufferSize() {
        return 8192;
    }

    /* access modifiers changed from: protected */
    public abstract boolean isInAlphabet(byte b2);

    /* access modifiers changed from: package-private */
    public int available(Context context) {
        if (context.buffer != null) {
            return context.pos - context.readPos;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b2 : bArr) {
            if (61 == b2 || isInAlphabet(b2)) {
                return true;
            }
        }
        return false;
    }

    private byte[] resizeBuffer(Context context) {
        if (context.buffer == null) {
            context.buffer = new byte[getDefaultBufferSize()];
            context.pos = 0;
            context.readPos = 0;
        } else {
            byte[] bArr = new byte[(context.buffer.length * 2)];
            System.arraycopy(context.buffer, 0, bArr, 0, context.buffer.length);
            context.buffer = bArr;
        }
        return context.buffer;
    }

    public byte[] encode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Context context = new Context();
        encode(bArr, 0, bArr.length, context);
        encode(bArr, 0, -1, context);
        byte[] bArr2 = new byte[(context.pos - context.readPos)];
        readResults(bArr2, 0, bArr2.length, context);
        return bArr2;
    }

    public long getEncodedLength(byte[] bArr) {
        long length = ((long) (((bArr.length + this.unencodedBlockSize) - 1) / this.unencodedBlockSize)) * ((long) this.encodedBlockSize);
        if (this.lineLength > 0) {
            return length + ((((((long) this.lineLength) + length) - 1) / ((long) this.lineLength)) * ((long) this.chunkSeparatorLength));
        }
        return length;
    }

    /* access modifiers changed from: protected */
    public byte[] ensureBufferSize(int i, Context context) {
        if (context.buffer == null || context.buffer.length < context.pos + i) {
            return resizeBuffer(context);
        }
        return context.buffer;
    }

    protected BaseNCodec(int i, int i2, int i3, int i4) {
        boolean z;
        this.unencodedBlockSize = i;
        this.encodedBlockSize = i2;
        int i5 = 0;
        if (i3 <= 0 || i4 <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.lineLength = z ? (i3 / i2) * i2 : i5;
        this.chunkSeparatorLength = i4;
    }

    /* access modifiers changed from: package-private */
    public int readResults(byte[] bArr, int i, int i2, Context context) {
        if (context.buffer != null) {
            int min = Math.min(available(context), i2);
            System.arraycopy(context.buffer, context.readPos, bArr, i, min);
            context.readPos += min;
            if (context.readPos >= context.pos) {
                context.buffer = null;
            }
            return min;
        } else if (context.eof) {
            return -1;
        } else {
            return 0;
        }
    }
}
