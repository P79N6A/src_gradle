package com.meizu.cloud.pushsdk.b.g;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    final byte[] f27018a;

    /* renamed from: b  reason: collision with root package name */
    int f27019b;

    /* renamed from: c  reason: collision with root package name */
    int f27020c;

    /* renamed from: d  reason: collision with root package name */
    boolean f27021d;

    /* renamed from: e  reason: collision with root package name */
    boolean f27022e;

    /* renamed from: f  reason: collision with root package name */
    i f27023f;
    i g;

    i() {
        this.f27018a = new byte[2048];
        this.f27022e = true;
    }

    i(i iVar) {
        this(iVar.f27018a, iVar.f27019b, iVar.f27020c);
        iVar.f27021d = true;
    }

    i(byte[] bArr, int i, int i2) {
        this.f27018a = bArr;
        this.f27019b = i;
        this.f27020c = i2;
        this.f27021d = true;
    }

    public final i a() {
        i iVar = this.f27023f != this ? this.f27023f : null;
        this.g.f27023f = this.f27023f;
        this.f27023f.g = this.g;
        this.f27023f = null;
        this.g = null;
        return iVar;
    }

    public final i a(int i) {
        if (i <= 0 || i > this.f27020c - this.f27019b) {
            throw new IllegalArgumentException();
        }
        i iVar = new i(this);
        iVar.f27020c = iVar.f27019b + i;
        this.f27019b += i;
        this.g.a(iVar);
        return iVar;
    }

    public final i a(i iVar) {
        iVar.g = this;
        iVar.f27023f = this.f27023f;
        this.f27023f.g = iVar;
        this.f27023f = iVar;
        return iVar;
    }

    public final void a(i iVar, int i) {
        if (iVar.f27022e) {
            if (iVar.f27020c + i > 2048) {
                if (iVar.f27021d) {
                    throw new IllegalArgumentException();
                } else if ((iVar.f27020c + i) - iVar.f27019b <= 2048) {
                    System.arraycopy(iVar.f27018a, iVar.f27019b, iVar.f27018a, 0, iVar.f27020c - iVar.f27019b);
                    iVar.f27020c -= iVar.f27019b;
                    iVar.f27019b = 0;
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f27018a, this.f27019b, iVar.f27018a, iVar.f27020c, i);
            iVar.f27020c += i;
            this.f27019b += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void b() {
        if (this.g == this) {
            throw new IllegalStateException();
        } else if (this.g.f27022e) {
            int i = this.f27020c - this.f27019b;
            if (i <= (2048 - this.g.f27020c) + (this.g.f27021d ? 0 : this.g.f27019b)) {
                a(this.g, i);
                a();
                j.a(this);
            }
        }
    }
}
