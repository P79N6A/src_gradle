package com.bytedance.android.livesdk.app.dataholder;

import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.bytedance.android.livesdk.sticker.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class e extends a<Integer> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f9053d;
    private static e p;

    /* renamed from: e  reason: collision with root package name */
    public long f9054e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9055f;
    @IgnoreStyleCheck
    public long g;
    @IgnoreStyleCheck
    public boolean h;
    @IgnoreStyleCheck
    public int i;
    @IgnoreStyleCheck
    public a j;
    @IgnoreStyleCheck
    public String k;
    @IgnoreStyleCheck
    public boolean l;
    @IgnoreStyleCheck
    public int m;
    @IgnoreStyleCheck
    public int n;
    @IgnoreStyleCheck
    public int o;
    private long q;

    private e() {
        this.f9041c = 0;
    }

    public final long b() {
        long j2 = this.q;
        this.f9054e += this.q;
        this.q = 0;
        return j2;
    }

    public static e a() {
        if (PatchProxy.isSupport(new Object[0], null, f9053d, true, 3168, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], null, f9053d, true, 3168, new Class[0], e.class);
        }
        if (p == null) {
            p = new e();
        }
        return p;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f9053d, false, 3170, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9053d, false, 3170, new Class[0], Void.TYPE);
            return;
        }
        this.f9041c = 0;
        this.f9055f = false;
        this.q = 0;
        this.f9054e = 0;
        this.g = 0;
        this.h = false;
        this.i = 0;
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = 0;
        this.n = 0;
    }

    public final void a(long j2) {
        if (j2 > this.q) {
            this.q = j2;
        }
    }

    public final void a(Integer num) {
        if (PatchProxy.isSupport(new Object[]{num}, this, f9053d, false, 3169, new Class[]{Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{num}, this, f9053d, false, 3169, new Class[]{Integer.class}, Void.TYPE);
        } else if (num == null || num.intValue() < 0 || num.intValue() > 2) {
        } else {
            if (2 == num.intValue()) {
                this.f9055f = true;
            }
            super.a(num);
        }
    }
}
