package org.msgpack.packer;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.msgpack.a;
import org.msgpack.c;
import org.msgpack.type.Value;
import org.msgpack.type.ValueFactory;

public class Unconverter extends AbstractPacker {
    public Value result;
    private PackerStack stack;
    private Object[] values;

    public void close() throws IOException {
    }

    public void flush() throws IOException {
    }

    public void resetResult() {
        this.result = null;
    }

    public Packer writeNil() throws IOException {
        put(ValueFactory.createNilValue());
        return this;
    }

    public Unconverter() {
        this(new a());
    }

    public Packer write(Value value) throws IOException {
        put(value);
        return this;
    }

    public void writeBigInteger(BigInteger bigInteger) throws IOException {
        put(ValueFactory.createIntegerValue(bigInteger));
    }

    public void writeBoolean(boolean z) throws IOException {
        put(ValueFactory.createBooleanValue(z));
    }

    public void writeByte(byte b2) throws IOException {
        put(ValueFactory.createIntegerValue(b2));
    }

    public void writeByteBuffer(ByteBuffer byteBuffer) throws IOException {
        put(ValueFactory.createRawValue(byteBuffer));
    }

    public void writeDouble(double d2) throws IOException {
        put(ValueFactory.createFloatValue(d2));
    }

    public void writeFloat(float f2) throws IOException {
        put(ValueFactory.createFloatValue(f2));
    }

    public void writeInt(int i) throws IOException {
        put(ValueFactory.createIntegerValue(i));
    }

    public void writeLong(long j) throws IOException {
        put(ValueFactory.createIntegerValue(j));
    }

    public void writeShort(short s) throws IOException {
        put(ValueFactory.createIntegerValue(s));
    }

    public void writeString(String str) throws IOException {
        put(ValueFactory.createRawValue(str));
    }

    public Unconverter(a aVar) {
        super(aVar);
        this.stack = new PackerStack();
        this.values = new Object[SearchJediMixFeedAdapter.f42517f];
    }

    private void put(Value value) {
        if (this.stack.top <= 0) {
            this.result = value;
            return;
        }
        this.stack.checkCount();
        Value[] valueArr = (Value[]) this.values[this.stack.top];
        valueArr[valueArr.length - this.stack.getTopCount()] = value;
        this.stack.reduceCount();
    }

    private void putContainer(Value value) {
        if (this.stack.top <= 0) {
            this.values[0] = value;
            return;
        }
        this.stack.checkCount();
        Value[] valueArr = (Value[]) this.values[this.stack.top];
        valueArr[valueArr.length - this.stack.getTopCount()] = value;
        this.stack.reduceCount();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.msgpack.packer.Packer writeArrayBegin(int r3) throws java.io.IOException {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0019
            org.msgpack.type.ArrayValue r3 = org.msgpack.type.ValueFactory.createArrayValue()
            r2.putContainer(r3)
            org.msgpack.packer.PackerStack r3 = r2.stack
            r0 = 0
            r3.pushArray(r0)
            java.lang.Object[] r3 = r2.values
            org.msgpack.packer.PackerStack r0 = r2.stack
            int r0 = r0.top
            r1 = 0
            r3[r0] = r1
            goto L_0x0030
        L_0x0019:
            org.msgpack.type.Value[] r0 = new org.msgpack.type.Value[r3]
            r1 = 1
            org.msgpack.type.ArrayValue r1 = org.msgpack.type.ValueFactory.createArrayValue(r0, r1)
            r2.putContainer(r1)
            org.msgpack.packer.PackerStack r1 = r2.stack
            r1.pushArray(r3)
            java.lang.Object[] r3 = r2.values
            org.msgpack.packer.PackerStack r1 = r2.stack
            int r1 = r1.top
            r3[r1] = r0
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.packer.Unconverter.writeArrayBegin(int):org.msgpack.packer.Packer");
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
                    throw new c("writeArrayEnd(check=true) is called but the array is not end");
                }
            }
            this.stack.pop();
            if (this.stack.top <= 0) {
                this.result = (Value) this.values[0];
            }
            return this;
        }
        throw new c("writeArrayEnd() is called but writeArrayBegin() is not called");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.msgpack.packer.Packer writeMapBegin(int r3) throws java.io.IOException {
        /*
            r2 = this;
            org.msgpack.packer.PackerStack r0 = r2.stack
            r0.checkCount()
            if (r3 != 0) goto L_0x001e
            org.msgpack.type.MapValue r3 = org.msgpack.type.ValueFactory.createMapValue()
            r2.putContainer(r3)
            org.msgpack.packer.PackerStack r3 = r2.stack
            r0 = 0
            r3.pushMap(r0)
            java.lang.Object[] r3 = r2.values
            org.msgpack.packer.PackerStack r0 = r2.stack
            int r0 = r0.top
            r1 = 0
            r3[r0] = r1
            goto L_0x0037
        L_0x001e:
            int r0 = r3 * 2
            org.msgpack.type.Value[] r0 = new org.msgpack.type.Value[r0]
            r1 = 1
            org.msgpack.type.MapValue r1 = org.msgpack.type.ValueFactory.createMapValue(r0, r1)
            r2.putContainer(r1)
            org.msgpack.packer.PackerStack r1 = r2.stack
            r1.pushMap(r3)
            java.lang.Object[] r3 = r2.values
            org.msgpack.packer.PackerStack r1 = r2.stack
            int r1 = r1.top
            r3[r1] = r0
        L_0x0037:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.packer.Unconverter.writeMapBegin(int):org.msgpack.packer.Packer");
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
                    throw new c("writeMapEnd(check=true) is called but the map is not end");
                }
            }
            this.stack.pop();
            if (this.stack.top <= 0) {
                this.result = (Value) this.values[0];
            }
            return this;
        }
        throw new c("writeMapEnd() is called but writeMapBegin() is not called");
    }

    public void writeByteArray(byte[] bArr, int i, int i2) throws IOException {
        put(ValueFactory.createRawValue(bArr, i, i2));
    }
}
