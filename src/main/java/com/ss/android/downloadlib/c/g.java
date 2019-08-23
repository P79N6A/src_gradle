package com.ss.android.downloadlib.c;

public final class g implements Cloneable {

    /* renamed from: d  reason: collision with root package name */
    static final long[] f28889d = new long[0];

    /* renamed from: a  reason: collision with root package name */
    public long[] f28890a;

    /* renamed from: b  reason: collision with root package name */
    public long[] f28891b;

    /* renamed from: c  reason: collision with root package name */
    public int f28892c;

    private static int c(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    public g() {
        this(10);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public g clone() {
        try {
            g gVar = (g) super.clone();
            try {
                gVar.f28890a = (long[]) this.f28890a.clone();
                gVar.f28891b = (long[]) this.f28891b.clone();
                return gVar;
            } catch (Exception unused) {
                return gVar;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String toString() {
        if (this.f28892c <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f28892c * 28);
        sb.append('{');
        for (int i = 0; i < this.f28892c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.f28890a[i]);
            sb.append('=');
            sb.append(this.f28891b[i]);
        }
        sb.append('}');
        return sb.toString();
    }

    private static int d(int i) {
        return c(i * 8) / 8;
    }

    public final void a(long j) {
        int a2 = a(this.f28890a, this.f28892c, j);
        if (a2 >= 0) {
            a(a2);
        }
    }

    private g(int i) {
        int d2 = d(10);
        this.f28890a = new long[d2];
        this.f28891b = new long[d2];
        this.f28892c = 0;
    }

    private void b(int i) {
        int d2 = d(i);
        long[] jArr = new long[d2];
        long[] jArr2 = new long[d2];
        System.arraycopy(this.f28890a, 0, jArr, 0, this.f28890a.length);
        System.arraycopy(this.f28891b, 0, jArr2, 0, this.f28891b.length);
        this.f28890a = jArr;
        this.f28891b = jArr2;
    }

    private void a(int i) {
        int i2 = i + 1;
        System.arraycopy(this.f28890a, i2, this.f28890a, i, this.f28892c - i2);
        System.arraycopy(this.f28891b, i2, this.f28891b, i, this.f28892c - i2);
        this.f28892c--;
    }

    public final void a(long j, long j2) {
        int a2 = a(this.f28890a, this.f28892c, j);
        if (a2 >= 0) {
            this.f28891b[a2] = j2;
            return;
        }
        int i = a2 ^ -1;
        if (this.f28892c >= this.f28890a.length) {
            b(this.f28892c + 1);
        }
        if (this.f28892c - i != 0) {
            long[] jArr = this.f28890a;
            int i2 = i + 1;
            System.arraycopy(jArr, i, jArr, i2, this.f28892c - i);
            long[] jArr2 = this.f28891b;
            System.arraycopy(jArr2, i, jArr2, i2, this.f28892c - i);
        }
        this.f28890a[i] = j;
        this.f28891b[i] = j2;
        this.f28892c++;
    }

    public static int a(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else if (j2 <= j) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }
}
