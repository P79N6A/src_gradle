package com.xiaomi.push;

import java.io.IOException;

public abstract class e {
    public abstract int a();

    public abstract e a(b bVar);

    public e a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public e a(byte[] bArr, int i, int i2) {
        try {
            b a2 = b.a(bArr, i, i2);
            a(a2);
            a2.a(0);
            return this;
        } catch (d e2) {
            throw e2;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public abstract void a(c cVar);

    /* renamed from: a  reason: collision with other method in class */
    public void m197a(byte[] bArr, int i, int i2) {
        try {
            c a2 = c.a(bArr, i, i2);
            a(a2);
            a2.b();
        } catch (IOException unused) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).");
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(b bVar, int i) {
        return bVar.a(i);
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m198a() {
        byte[] bArr = new byte[b()];
        a(bArr, 0, bArr.length);
        return bArr;
    }

    public abstract int b();
}
