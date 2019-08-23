package com.ss.android.linkselector.b;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f29289a;

    /* renamed from: b  reason: collision with root package name */
    protected int f29290b;

    /* renamed from: c  reason: collision with root package name */
    protected long f29291c;

    public final void c() {
        this.f29289a = false;
    }

    public abstract String g();

    public final boolean a() {
        return this.f29289a;
    }

    public final long d() {
        return this.f29291c;
    }

    public final int e() {
        return this.f29290b;
    }

    public final void f() {
        this.f29289a = false;
        this.f29290b = 0;
    }

    public final boolean b() {
        if (a()) {
            return false;
        }
        this.f29289a = true;
        this.f29290b++;
        this.f29291c = System.currentTimeMillis();
        return true;
    }

    public String toString() {
        return "BlackRoomItem{name=" + g() + "lockedCount=" + this.f29290b + ", inBlackRoom=" + this.f29289a + '}';
    }
}
