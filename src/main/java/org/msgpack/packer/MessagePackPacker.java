package org.msgpack.packer;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.msgpack.a;
import org.msgpack.a.h;
import org.msgpack.c;

public class MessagePackPacker extends AbstractPacker {
    protected final h out;
    private PackerStack stack = new PackerStack();

    public void close() throws IOException {
        this.out.close();
    }

    public void flush() throws IOException {
        this.out.flush();
    }

    public Packer writeNil() throws IOException {
        this.out.a((byte) -64);
        this.stack.reduceCount();
        return this;
    }

    /* access modifiers changed from: protected */
    public void writeDouble(double d2) throws IOException {
        this.out.a((byte) -53, d2);
        this.stack.reduceCount();
    }

    /* access modifiers changed from: protected */
    public void writeFloat(float f2) throws IOException {
        this.out.a((byte) -54, f2);
        this.stack.reduceCount();
    }

    /* access modifiers changed from: protected */
    public void writeBoolean(boolean z) throws IOException {
        if (z) {
            this.out.a((byte) -61);
        } else {
            this.out.a((byte) -62);
        }
        this.stack.reduceCount();
    }

    /* access modifiers changed from: protected */
    public void writeByte(byte b2) throws IOException {
        if (b2 < -32) {
            this.out.a((byte) -48, b2);
        } else {
            this.out.a(b2);
        }
        this.stack.reduceCount();
    }

    /* access modifiers changed from: protected */
    public void writeString(String str) throws IOException {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            writeByteArray(bytes, 0, bytes.length);
            this.stack.reduceCount();
        } catch (UnsupportedEncodingException e2) {
            throw new c((Throwable) e2);
        }
    }

    public Packer writeArrayBegin(int i) throws IOException {
        if (i < 16) {
            this.out.a((byte) (i | SearchJediMixFeedAdapter.g));
        } else if (i < 65536) {
            this.out.a((byte) -36, (short) i);
        } else {
            this.out.a((byte) -35, i);
        }
        this.stack.reduceCount();
        this.stack.pushArray(i);
        return this;
    }

    public Packer writeArrayEnd(boolean z) throws IOException {
        if (this.stack.topIsArray()) {
            int topCount = this.stack.getTopCount();
            if (topCount > 0) {
                if (!z) {
                    for (int i = 0; i < topCount; i++) {
                        writeNil();
                    }
                } else {
                    throw new c("writeArrayEnd(check=true) is called but the array is not end: " + topCount);
                }
            }
            this.stack.pop();
            return this;
        }
        throw new c("writeArrayEnd() is called but writeArrayBegin() is not called");
    }

    /* access modifiers changed from: protected */
    public void writeBigInteger(BigInteger bigInteger) throws IOException {
        if (bigInteger.bitLength() <= 63) {
            writeLong(bigInteger.longValue());
            this.stack.reduceCount();
        } else if (bigInteger.bitLength() == 64 && bigInteger.signum() == 1) {
            this.out.a((byte) -49, bigInteger.longValue());
            this.stack.reduceCount();
        } else {
            throw new c("MessagePack can't serialize BigInteger larger than (2^64)-1");
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public void writeByteBuffer(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        if (remaining < 32) {
            this.out.a((byte) (remaining | 160));
        } else if (remaining < 65536) {
            this.out.a((byte) -38, (short) remaining);
        } else {
            this.out.a((byte) -37, remaining);
        }
        int position = byteBuffer.position();
        try {
            this.out.a(byteBuffer);
            byteBuffer.position(position);
            this.stack.reduceCount();
        } catch (Throwable th) {
            byteBuffer.position(position);
            throw th;
        }
    }

    public Packer writeMapBegin(int i) throws IOException {
        if (i < 16) {
            this.out.a((byte) (i | SearchJediMixFeedAdapter.f42517f));
        } else if (i < 65536) {
            this.out.a((byte) -34, (short) i);
        } else {
            this.out.a((byte) -33, i);
        }
        this.stack.reduceCount();
        this.stack.pushMap(i);
        return this;
    }

    public Packer writeMapEnd(boolean z) throws IOException {
        if (this.stack.topIsMap()) {
            int topCount = this.stack.getTopCount();
            if (topCount > 0) {
                if (!z) {
                    for (int i = 0; i < topCount; i++) {
                        writeNil();
                    }
                } else {
                    throw new c("writeMapEnd(check=true) is called but the map is not end: " + topCount);
                }
            }
            this.stack.pop();
            return this;
        }
        throw new c("writeMapEnd() is called but writeMapBegin() is not called");
    }

    /* access modifiers changed from: protected */
    public void writeShort(short s) throws IOException {
        if (s < -32) {
            if (s < -128) {
                this.out.a((byte) -47, s);
            } else {
                this.out.a((byte) -48, (byte) s);
            }
        } else if (s < 128) {
            this.out.a((byte) s);
        } else if (s < 256) {
            this.out.a((byte) -52, (byte) s);
        } else {
            this.out.a((byte) -51, s);
        }
        this.stack.reduceCount();
    }

    /* access modifiers changed from: protected */
    public void writeInt(int i) throws IOException {
        if (i < -32) {
            if (i < -32768) {
                this.out.a((byte) -46, i);
            } else if (i < -128) {
                this.out.a((byte) -47, (short) i);
            } else {
                this.out.a((byte) -48, (byte) i);
            }
        } else if (i < 128) {
            this.out.a((byte) i);
        } else if (i < 256) {
            this.out.a((byte) -52, (byte) i);
        } else if (i < 65536) {
            this.out.a((byte) -51, (short) i);
        } else {
            this.out.a((byte) -50, i);
        }
        this.stack.reduceCount();
    }

    /* access modifiers changed from: protected */
    public void writeLong(long j) throws IOException {
        if (j < -32) {
            if (j < -32768) {
                if (j < -2147483648L) {
                    this.out.a((byte) -45, j);
                } else {
                    this.out.a((byte) -46, (int) j);
                }
            } else if (j < -128) {
                this.out.a((byte) -47, (short) ((int) j));
            } else {
                this.out.a((byte) -48, (byte) ((int) j));
            }
        } else if (j < 128) {
            this.out.a((byte) ((int) j));
        } else if (j < 65536) {
            if (j < 256) {
                this.out.a((byte) -52, (byte) ((int) j));
            } else {
                this.out.a((byte) -51, (short) ((int) j));
            }
        } else if (j < 4294967296L) {
            this.out.a((byte) -50, (int) j);
        } else {
            this.out.a((byte) -49, j);
        }
        this.stack.reduceCount();
    }

    protected MessagePackPacker(a aVar, h hVar) {
        super(aVar);
        this.out = hVar;
    }

    /* access modifiers changed from: protected */
    public void writeByteArray(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 32) {
            this.out.a((byte) (i2 | 160));
        } else if (i2 < 65536) {
            this.out.a((byte) -38, (short) i2);
        } else {
            this.out.a((byte) -37, i2);
        }
        this.out.a(bArr, i, i2);
        this.stack.reduceCount();
    }
}
