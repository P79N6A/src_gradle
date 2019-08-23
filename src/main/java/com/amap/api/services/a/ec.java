package com.amap.api.services.a;

public abstract class ec {

    /* renamed from: a  reason: collision with root package name */
    ec f6863a;

    /* access modifiers changed from: protected */
    public abstract boolean a();

    public ec() {
    }

    private boolean c() {
        if (this.f6863a != null) {
            return this.f6863a.b();
        }
        return true;
    }

    public boolean b() {
        if (!c()) {
            return false;
        }
        return a();
    }

    public ec(ec ecVar) {
        this.f6863a = ecVar;
    }

    public void a(boolean z) {
        if (this.f6863a != null) {
            this.f6863a.a(z);
        }
    }
}
