package com.amap.api.mapcore2d;

@dn(a = "e")
public class dy {
    @Cdo(a = "c1", b = 2)

    /* renamed from: a  reason: collision with root package name */
    private int f5985a;
    @Cdo(a = "c2", b = 2)

    /* renamed from: b  reason: collision with root package name */
    private int f5986b;
    @Cdo(a = "c3", b = 2)

    /* renamed from: c  reason: collision with root package name */
    private int f5987c;

    public boolean a() {
        if (this.f5985a == 1) {
            return true;
        }
        return false;
    }

    public boolean b() {
        if (this.f5986b == 1) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (this.f5987c == 1) {
            return true;
        }
        return false;
    }

    public void a(boolean z) {
        this.f5985a = z ? 1 : 0;
    }

    public void b(boolean z) {
        this.f5986b = z ? 1 : 0;
    }

    public void c(boolean z) {
        this.f5987c = z ? 1 : 0;
    }
}
