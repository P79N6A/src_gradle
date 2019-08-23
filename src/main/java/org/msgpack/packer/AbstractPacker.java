package org.msgpack.packer;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.msgpack.a;
import org.msgpack.type.Value;

public abstract class AbstractPacker implements Packer {
    protected a msgpack;

    public void close() throws IOException {
    }

    /* access modifiers changed from: protected */
    public abstract void writeBigInteger(BigInteger bigInteger) throws IOException;

    /* access modifiers changed from: protected */
    public abstract void writeBoolean(boolean z) throws IOException;

    /* access modifiers changed from: protected */
    public abstract void writeByte(byte b2) throws IOException;

    /* access modifiers changed from: protected */
    public abstract void writeByteArray(byte[] bArr, int i, int i2) throws IOException;

    /* access modifiers changed from: protected */
    public abstract void writeByteBuffer(ByteBuffer byteBuffer) throws IOException;

    /* access modifiers changed from: protected */
    public abstract void writeDouble(double d2) throws IOException;

    /* access modifiers changed from: protected */
    public abstract void writeFloat(float f2) throws IOException;

    /* access modifiers changed from: protected */
    public abstract void writeInt(int i) throws IOException;

    /* access modifiers changed from: protected */
    public abstract void writeLong(long j) throws IOException;

    /* access modifiers changed from: protected */
    public abstract void writeShort(short s) throws IOException;

    /* access modifiers changed from: protected */
    public abstract void writeString(String str) throws IOException;

    public Packer write(boolean z) throws IOException {
        writeBoolean(z);
        return this;
    }

    public Packer write(short s) throws IOException {
        writeShort(s);
        return this;
    }

    public Packer write(byte[] bArr) throws IOException {
        if (bArr == null) {
            writeNil();
        } else {
            writeByteArray(bArr);
        }
        return this;
    }

    public Packer write(Value value) throws IOException {
        if (value == null) {
            writeNil();
        } else {
            value.writeTo(this);
        }
        return this;
    }

    public Packer writeArrayEnd() throws IOException {
        writeArrayEnd(true);
        return this;
    }

    public Packer writeMapEnd() throws IOException {
        writeMapEnd(true);
        return this;
    }

    public Packer write(byte b2) throws IOException {
        writeByte(b2);
        return this;
    }

    protected AbstractPacker(a aVar) {
        this.msgpack = aVar;
    }

    public Packer write(double d2) throws IOException {
        writeDouble(d2);
        return this;
    }

    /* access modifiers changed from: protected */
    public void writeByteArray(byte[] bArr) throws IOException {
        writeByteArray(bArr, 0, bArr.length);
    }

    public Packer write(float f2) throws IOException {
        writeFloat(f2);
        return this;
    }

    public Packer write(int i) throws IOException {
        writeInt(i);
        return this;
    }

    public Packer write(long j) throws IOException {
        writeLong(j);
        return this;
    }

    public Packer write(Object obj) throws IOException {
        if (obj == null) {
            writeNil();
        } else {
            this.msgpack.a(obj.getClass()).write(this, obj);
        }
        return this;
    }

    public Packer write(Short sh) throws IOException {
        if (sh == null) {
            writeNil();
        } else {
            writeShort(sh.shortValue());
        }
        return this;
    }

    public Packer write(String str) throws IOException {
        if (str == null) {
            writeNil();
        } else {
            writeString(str);
        }
        return this;
    }

    public Packer write(BigInteger bigInteger) throws IOException {
        if (bigInteger == null) {
            writeNil();
        } else {
            writeBigInteger(bigInteger);
        }
        return this;
    }

    public Packer write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            writeNil();
        } else {
            writeByteBuffer(byteBuffer);
        }
        return this;
    }
}
