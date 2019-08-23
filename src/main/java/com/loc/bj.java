package com.loc;

public abstract class bj {

    /* renamed from: a  reason: collision with root package name */
    bj f25530a;

    public bj() {
    }

    public bj(bj bjVar) {
        this.f25530a = bjVar;
    }

    public void a(int i) {
        if (this.f25530a != null) {
            this.f25530a.a(i);
        }
    }

    public void a(boolean z) {
        if (this.f25530a != null) {
            this.f25530a.a(z);
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean a();

    public int b() {
        return Math.min(Integer.MAX_VALUE, this.f25530a != null ? this.f25530a.b() : Integer.MAX_VALUE);
    }

    public final boolean c() {
        if (!(this.f25530a != null ? this.f25530a.c() : true)) {
            return false;
        }
        return a();
    }
}
