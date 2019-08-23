package io.agora.rtc.internal;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

public class Marshallable {
    private ByteBuffer mBuffer = ByteBuffer.allocate(8192);

    public ByteBuffer getBuffer() {
        return this.mBuffer;
    }

    public void clear() {
        this.mBuffer.position(10);
    }

    public byte popByte() {
        return this.mBuffer.get();
    }

    public int popInt() {
        return this.mBuffer.getInt();
    }

    public long popInt64() {
        return this.mBuffer.getLong();
    }

    public short popShort() {
        return this.mBuffer.getShort();
    }

    public byte[] popAll() {
        byte[] bArr = new byte[this.mBuffer.remaining()];
        this.mBuffer.get(bArr);
        return bArr;
    }

    public Boolean popBool() {
        boolean z = true;
        if (this.mBuffer.get() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public Marshallable() {
        this.mBuffer.order(ByteOrder.LITTLE_ENDIAN);
        this.mBuffer.position(2);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [short, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] marshall() {
        /*
            r3 = this;
            java.nio.ByteBuffer r0 = r3.mBuffer
            int r0 = r0.position()
            short r0 = (short) r0
            java.nio.ByteBuffer r1 = r3.mBuffer
            r2 = 0
            r1.putShort(r2, r0)
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r1 = r3.mBuffer
            r1.position(r2)
            java.nio.ByteBuffer r1 = r3.mBuffer
            r1.get(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.internal.Marshallable.marshall():byte[]");
    }

    public byte[] popBytes() {
        int i = this.mBuffer.getShort();
        byte[] bArr = new byte[0];
        if (i <= 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        this.mBuffer.get(bArr2);
        return bArr2;
    }

    public byte[] popBytes32() {
        int i = this.mBuffer.getInt();
        if (i <= 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.mBuffer.get(bArr);
        return bArr;
    }

    public int[] popIntArray() {
        int popInt = popInt();
        int[] iArr = new int[popInt];
        for (int i = 0; i < popInt; i++) {
            iArr[i] = popInt();
        }
        return iArr;
    }

    public short[] popShortArray() {
        int popInt = popInt();
        short[] sArr = new short[popInt];
        for (int i = 0; i < popInt; i++) {
            sArr[i] = popShort();
        }
        return sArr;
    }

    public String popString16() {
        int i = this.mBuffer.getShort();
        if (i > 0) {
            byte[] bArr = new byte[i];
            this.mBuffer.get(bArr);
            try {
                return new String(bArr, "ISO-8859-1");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return "";
    }

    public String popString16UTF8() {
        int i = this.mBuffer.getShort();
        if (i > 0) {
            byte[] bArr = new byte[i];
            this.mBuffer.get(bArr);
            try {
                return new String(bArr, "utf-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return "";
    }

    public void marshall(ByteBuffer byteBuffer) {
        this.mBuffer = byteBuffer;
    }

    public void unmarshall(ByteBuffer byteBuffer) {
        this.mBuffer = byteBuffer;
    }

    public void pushByte(byte b2) {
        this.mBuffer.put(b2);
    }

    public void pushDouble(double d2) {
        this.mBuffer.putDouble(d2);
    }

    public void pushInt(int i) {
        this.mBuffer.putInt(i);
    }

    public void pushInt64(long j) {
        this.mBuffer.putLong(j);
    }

    public void pushShort(short s) {
        this.mBuffer.putShort(s);
    }

    public void pushBool(Boolean bool) {
        this.mBuffer.put(bool.booleanValue() ? (byte) 1 : 0);
    }

    public void pushBytes(byte[] bArr) {
        this.mBuffer.putShort((short) bArr.length);
        this.mBuffer.put(bArr);
    }

    public void pushBytes32(byte[] bArr) {
        this.mBuffer.putInt(bArr.length);
        this.mBuffer.put(bArr);
    }

    public void pushIntArray(int[] iArr) {
        if (iArr == null) {
            pushInt(0);
            return;
        }
        pushInt(r1);
        for (int pushInt : iArr) {
            pushInt(pushInt);
        }
    }

    public void pushShortArray(short[] sArr) {
        if (sArr == null) {
            pushInt(0);
            return;
        }
        pushInt(r1);
        for (short pushShort : sArr) {
            pushShort(pushShort);
        }
    }

    public void unmarshall(byte[] bArr) {
        this.mBuffer = ByteBuffer.wrap(bArr);
        this.mBuffer.order(ByteOrder.LITTLE_ENDIAN);
        popShort();
    }

    public void pushIntArray(Integer[] numArr) {
        if (numArr == null) {
            pushInt(0);
            return;
        }
        pushInt(r1);
        for (Integer intValue : numArr) {
            pushInt(intValue.intValue());
        }
    }

    public void pushString16(String str) {
        if (str == null) {
            this.mBuffer.putShort(0);
            return;
        }
        this.mBuffer.putShort((short) str.getBytes().length);
        if (str.getBytes().length > 0) {
            this.mBuffer.put(str.getBytes());
        }
    }

    public void pushStringArray(ArrayList<String> arrayList) {
        if (arrayList == null) {
            pushInt(0);
            return;
        }
        int size = arrayList.size();
        pushShort((short) size);
        for (int i = 0; i < size; i++) {
            pushBytes(arrayList.get(i).getBytes());
        }
    }
}
