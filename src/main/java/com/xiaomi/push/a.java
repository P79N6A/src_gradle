package com.xiaomi.push;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f81814a = new a(new byte[0]);

    /* renamed from: a  reason: collision with other field name */
    private volatile int f142a;

    /* renamed from: a  reason: collision with other field name */
    private final byte[] f143a;

    private a(byte[] bArr) {
        this.f143a = bArr;
    }

    public static a a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static a a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new a(bArr2);
    }

    public final int a() {
        return this.f143a.length;
    }

    /* renamed from: a  reason: collision with other method in class */
    public final byte[] m80a() {
        int length = this.f143a.length;
        byte[] bArr = new byte[length];
        System.arraycopy(this.f143a, 0, bArr, 0, length);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            int length = this.f143a.length;
            if (length != aVar.f143a.length) {
                return false;
            }
            byte[] bArr = this.f143a;
            byte[] bArr2 = aVar.f143a;
            for (int i = 0; i < length; i++) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f142a;
        if (i == 0) {
            byte[] bArr = this.f143a;
            int length = this.f143a.length;
            int i2 = 0;
            int i3 = length;
            while (i2 < length) {
                byte b2 = bArr[i2];
                i2++;
                i3 = (i3 * 31) + b2;
            }
            i = i3 == 0 ? 1 : i3;
            this.f142a = i;
        }
        return i;
    }
}
