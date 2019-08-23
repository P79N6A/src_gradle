package com.ss.android.download.b;

public final class e implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public int f28520a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f28521b;

    /* renamed from: c  reason: collision with root package name */
    private long[] f28522c;

    public e() {
        this(10);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public e clone() {
        try {
            e eVar = (e) super.clone();
            try {
                eVar.f28521b = (long[]) this.f28521b.clone();
                eVar.f28522c = (long[]) this.f28522c.clone();
                return eVar;
            } catch (CloneNotSupportedException unused) {
                return eVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    public final String toString() {
        if (this.f28520a <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f28520a * 28);
        sb.append('{');
        for (int i = 0; i < this.f28520a; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.f28521b[i]);
            sb.append('=');
            sb.append(this.f28522c[i]);
        }
        sb.append('}');
        return sb.toString();
    }

    public final long a(long j) {
        return b(j, 0);
    }

    public final void b(long j) {
        int a2 = b.a(this.f28521b, this.f28520a, j);
        if (a2 >= 0) {
            a(a2);
        }
    }

    public e(int i) {
        int a2 = a.a(10);
        this.f28521b = new long[a2];
        this.f28522c = new long[a2];
        this.f28520a = 0;
    }

    private void a(int i) {
        int i2 = i + 1;
        System.arraycopy(this.f28521b, i2, this.f28521b, i, this.f28520a - i2);
        System.arraycopy(this.f28522c, i2, this.f28522c, i, this.f28520a - i2);
        this.f28520a--;
    }

    private void b(int i) {
        int a2 = a.a(i);
        long[] jArr = new long[a2];
        long[] jArr2 = new long[a2];
        System.arraycopy(this.f28521b, 0, jArr, 0, this.f28521b.length);
        System.arraycopy(this.f28522c, 0, jArr2, 0, this.f28522c.length);
        this.f28521b = jArr;
        this.f28522c = jArr2;
    }

    private long b(long j, long j2) {
        int a2 = b.a(this.f28521b, this.f28520a, j);
        if (a2 < 0) {
            return 0;
        }
        return this.f28522c[a2];
    }

    public final void a(long j, long j2) {
        int a2 = b.a(this.f28521b, this.f28520a, j);
        if (a2 >= 0) {
            this.f28522c[a2] = j2;
            return;
        }
        int i = a2 ^ -1;
        if (this.f28520a >= this.f28521b.length) {
            b(this.f28520a + 1);
        }
        if (this.f28520a - i != 0) {
            long[] jArr = this.f28521b;
            int i2 = i + 1;
            System.arraycopy(jArr, i, jArr, i2, this.f28520a - i);
            long[] jArr2 = this.f28522c;
            System.arraycopy(jArr2, i, jArr2, i2, this.f28520a - i);
        }
        this.f28521b[i] = j;
        this.f28522c[i] = j2;
        this.f28520a++;
    }
}
