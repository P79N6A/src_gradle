package com.umeng.message.proguard;

public abstract class e {

    /* renamed from: f  reason: collision with root package name */
    protected final byte f81265f = 61;
    protected final int g;
    protected byte[] h;
    protected int i;
    protected boolean j;
    protected int k;
    protected int l;
    private final int n;
    private final int o;
    private final int p;
    private int q;

    protected static boolean c(byte b2) {
        if (!(b2 == 13 || b2 == 32)) {
            switch (b2) {
                case 9:
                case 10:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public abstract void a(byte[] bArr, int i2, int i3);

    /* access modifiers changed from: package-private */
    public abstract void b(byte[] bArr, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract boolean b(byte b2);

    /* access modifiers changed from: protected */
    public int d() {
        return 8192;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        if (this.h != null) {
            return true;
        }
        return false;
    }

    private void e() {
        this.h = null;
        this.i = 0;
        this.q = 0;
        this.k = 0;
        this.l = 0;
        this.j = false;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        if (this.h != null) {
            return this.i - this.q;
        }
        return 0;
    }

    private void a() {
        if (this.h == null) {
            this.h = new byte[d()];
            this.i = 0;
            this.q = 0;
            return;
        }
        byte[] bArr = new byte[(this.h.length * 2)];
        System.arraycopy(this.h, 0, bArr, 0, this.h.length);
        this.h = bArr;
    }

    /* access modifiers changed from: protected */
    public void a(int i2) {
        if (this.h == null || this.h.length < this.i + i2) {
            a();
        }
    }

    public boolean d(String str) {
        return b(b.f(str), true);
    }

    public String j(byte[] bArr) {
        return b.f(l(bArr));
    }

    public String m(byte[] bArr) {
        return b.f(l(bArr));
    }

    public Object a(Object obj) throws Exception {
        if (obj instanceof byte[]) {
            return l((byte[]) obj);
        }
        throw new Exception("Parameter supplied to Base-N encode is not a byte[]");
    }

    public Object b(Object obj) throws Exception {
        if (obj instanceof byte[]) {
            return k((byte[]) obj);
        }
        if (obj instanceof String) {
            return c((String) obj);
        }
        throw new Exception("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    public byte[] k(byte[] bArr) {
        e();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        b(bArr, 0, bArr.length);
        b(bArr, 0, -1);
        byte[] bArr2 = new byte[this.i];
        c(bArr2, 0, bArr2.length);
        return bArr2;
    }

    public byte[] l(byte[] bArr) {
        e();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a(bArr, 0, bArr.length);
        a(bArr, 0, -1);
        byte[] bArr2 = new byte[(this.i - this.q)];
        c(bArr2, 0, bArr2.length);
        return bArr2;
    }

    /* access modifiers changed from: protected */
    public boolean n(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (61 == bArr[i2] || b(bArr[i2])) {
                return true;
            }
        }
        return false;
    }

    public long o(byte[] bArr) {
        long length = ((long) (((bArr.length + this.n) - 1) / this.n)) * ((long) this.o);
        if (this.g > 0) {
            return length + ((((((long) this.g) + length) - 1) / ((long) this.g)) * ((long) this.p));
        }
        return length;
    }

    public byte[] c(String str) {
        return k(b.f(str));
    }

    public boolean b(byte[] bArr, boolean z) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (!b(bArr[i2]) && (!z || (bArr[i2] != 61 && !c(bArr[i2])))) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public int c(byte[] bArr, int i2, int i3) {
        if (this.h != null) {
            int min = Math.min(c(), i3);
            System.arraycopy(this.h, this.q, bArr, i2, min);
            this.q += min;
            if (this.q >= this.i) {
                this.h = null;
            }
            return min;
        } else if (this.j) {
            return -1;
        } else {
            return 0;
        }
    }

    protected e(int i2, int i3, int i4, int i5) {
        int i6;
        this.n = i2;
        this.o = i3;
        if (i4 <= 0 || i5 <= 0) {
            i6 = 0;
        } else {
            i6 = (i4 / i3) * i3;
        }
        this.g = i6;
        this.p = i5;
    }
}
