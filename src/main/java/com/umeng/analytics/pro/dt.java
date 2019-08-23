package com.umeng.analytics.pro;

public abstract class dt {
    public abstract int a(byte[] bArr, int i, int i2) throws du;

    public void a(int i) {
    }

    public abstract boolean a();

    public abstract void b() throws du;

    public abstract void b(byte[] bArr, int i, int i2) throws du;

    public abstract void c();

    public void d() throws du {
    }

    public byte[] f() {
        return null;
    }

    public int g() {
        return 0;
    }

    public int h() {
        return -1;
    }

    public boolean i() {
        return a();
    }

    public void b(byte[] bArr) throws du {
        b(bArr, 0, bArr.length);
    }

    public int d(byte[] bArr, int i, int i2) throws du {
        int i3 = 0;
        while (i3 < i2) {
            int a2 = a(bArr, i + i3, i2 - i3);
            if (a2 > 0) {
                i3 += a2;
            } else {
                throw new du("Cannot read. Remote side has closed. Tried to read " + i2 + " bytes, but only got " + i3 + " bytes. (This is often indicative of an internal error on the server side. Please check your server logs.)");
            }
        }
        return i3;
    }
}
