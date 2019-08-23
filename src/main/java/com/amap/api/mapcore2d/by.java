package com.amap.api.mapcore2d;

public class by extends e {

    /* renamed from: c  reason: collision with root package name */
    private w f5799c;

    /* renamed from: d  reason: collision with root package name */
    private w f5800d;

    /* renamed from: e  reason: collision with root package name */
    private int f5801e = ((int) this.f5799c.e());

    /* renamed from: f  reason: collision with root package name */
    private int f5802f = ((int) this.f5799c.f());
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private bz l;
    private long m;
    private int n;

    /* access modifiers changed from: protected */
    public void g() {
        bm.a().b();
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.l.c();
        n.a().b();
    }

    /* access modifiers changed from: protected */
    public void c() {
        this.l.c();
        l.a().b();
    }

    /* access modifiers changed from: protected */
    public void a() {
        b(this.n);
        int e2 = (int) this.f5800d.e();
        int f2 = (int) this.f5800d.f();
        if (!f()) {
            this.f5801e = e2;
            this.f5802f = f2;
            bz bzVar = this.l;
            w wVar = new w((double) this.f5802f, (double) this.f5801e, false);
            bzVar.a(wVar);
            return;
        }
        this.k++;
        this.f5801e = a(this.f5801e, e2, this.g);
        this.f5802f = a(this.f5802f, f2, this.h);
        bz bzVar2 = this.l;
        w wVar2 = new w((double) this.f5802f, (double) this.f5801e, false);
        bzVar2.a(wVar2);
        if (this.f5801e == e2 && this.f5802f == f2) {
            a(false);
            b(true);
            g();
        }
    }

    private void b(int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        this.m = currentTimeMillis;
        float f2 = ((float) ((int) (currentTimeMillis - this.m))) / ((float) i2);
        this.g = (int) (((float) this.i) * f2);
        this.h = (int) (((float) this.j) * f2);
    }

    private int a(int i2, int i3, int i4) {
        if (i3 > i2) {
            int i5 = i2 + i4;
            if (i5 < i3) {
                return i5;
            }
            this.k = 0;
        } else {
            int i6 = i2 - i4;
            if (i6 > i3) {
                return i6;
            }
            this.k = 0;
        }
        return i3;
    }

    public by(int i2, int i3, w wVar, w wVar2, int i4, bz bzVar) {
        super(i2, i3);
        this.f5799c = wVar;
        this.f5800d = wVar2;
        this.l = bzVar;
        this.i = (int) Math.abs(wVar2.e() - this.f5799c.e());
        this.j = (int) Math.abs(wVar2.f() - this.f5799c.f());
        this.m = System.currentTimeMillis();
        this.n = i2;
    }
}
