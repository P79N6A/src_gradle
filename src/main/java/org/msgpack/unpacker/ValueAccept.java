package org.msgpack.unpacker;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.msgpack.packer.Unconverter;
import org.msgpack.type.ValueFactory;

public final class ValueAccept extends Accept {
    public Unconverter uc;

    ValueAccept() {
        super(null);
    }

    /* access modifiers changed from: package-private */
    public final void acceptEmptyRaw() throws IOException {
        this.uc.write(ValueFactory.createRawValue());
    }

    /* access modifiers changed from: package-private */
    public final void acceptNil() throws IOException {
        this.uc.write(ValueFactory.createNilValue());
    }

    /* access modifiers changed from: package-private */
    public final void acceptArray(int i) throws IOException {
        this.uc.writeArrayBegin(i);
    }

    /* access modifiers changed from: package-private */
    public final void acceptMap(int i) throws IOException {
        this.uc.writeMapBegin(i);
    }

    /* access modifiers changed from: package-private */
    public final void acceptBoolean(boolean z) throws IOException {
        this.uc.write(ValueFactory.createBooleanValue(z));
    }

    /* access modifiers changed from: package-private */
    public final void acceptDouble(double d2) throws IOException {
        this.uc.write(ValueFactory.createFloatValue(d2));
    }

    /* access modifiers changed from: package-private */
    public final void acceptFloat(float f2) throws IOException {
        this.uc.write(ValueFactory.createFloatValue(f2));
    }

    /* access modifiers changed from: package-private */
    public final void acceptInteger(byte b2) throws IOException {
        this.uc.write(ValueFactory.createIntegerValue(b2));
    }

    /* access modifiers changed from: package-private */
    public final void acceptRaw(byte[] bArr) throws IOException {
        this.uc.write(ValueFactory.createRawValue(bArr));
    }

    /* access modifiers changed from: package-private */
    public final void acceptUnsignedInteger(byte b2) throws IOException {
        this.uc.write(ValueFactory.createIntegerValue((int) b2 & 255));
    }

    /* access modifiers changed from: package-private */
    public final void acceptInteger(int i) throws IOException {
        this.uc.write(ValueFactory.createIntegerValue(i));
    }

    /* access modifiers changed from: package-private */
    public final void acceptUnsignedInteger(short s) throws IOException {
        this.uc.write(ValueFactory.createIntegerValue((int) s & 65535));
    }

    /* access modifiers changed from: package-private */
    public final void acceptInteger(long j) throws IOException {
        this.uc.write(ValueFactory.createIntegerValue(j));
    }

    /* access modifiers changed from: package-private */
    public final void acceptUnsignedInteger(int i) throws IOException {
        if (i < 0) {
            this.uc.write(ValueFactory.createIntegerValue(((long) (i & Integer.MAX_VALUE)) + 2147483648L));
        } else {
            this.uc.write(ValueFactory.createIntegerValue(i));
        }
    }

    /* access modifiers changed from: package-private */
    public final void acceptInteger(short s) throws IOException {
        this.uc.write(ValueFactory.createIntegerValue(s));
    }

    /* access modifiers changed from: package-private */
    public final void acceptUnsignedInteger(long j) throws IOException {
        if (j < 0) {
            this.uc.write(ValueFactory.createIntegerValue(BigInteger.valueOf(j + Long.MAX_VALUE + 1).setBit(63)));
            return;
        }
        this.uc.write(ValueFactory.createIntegerValue(j));
    }

    public final void refer(ByteBuffer byteBuffer, boolean z) throws IOException {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        this.uc.write(ValueFactory.createRawValue(bArr, true));
    }
}
