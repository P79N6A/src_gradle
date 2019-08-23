package com.ss.android.ugc.aweme.share.c;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.c.c.i;
import com.ss.android.ugc.aweme.share.c.c.j;
import java.io.File;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64890a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f64891b;

    /* renamed from: c  reason: collision with root package name */
    private g f64892c;

    /* renamed from: d  reason: collision with root package name */
    private d f64893d;

    /* renamed from: e  reason: collision with root package name */
    private e f64894e;

    /* renamed from: f  reason: collision with root package name */
    private a f64895f;
    private b g;
    private c h;
    private g i;
    private f j;
    private com.ss.android.ugc.aweme.share.c.a.c k;
    private com.ss.android.ugc.aweme.share.c.a.a l;
    private int m = -1;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f64896a;

        /* renamed from: b  reason: collision with root package name */
        public String f64897b;

        /* renamed from: c  reason: collision with root package name */
        public String f64898c;
    }

    public static class b {
    }

    public static class c {
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public String f64899a;
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public String f64900a;

        /* renamed from: b  reason: collision with root package name */
        public String f64901b;

        /* renamed from: c  reason: collision with root package name */
        public String f64902c;

        /* renamed from: d  reason: collision with root package name */
        public String f64903d;

        /* renamed from: e  reason: collision with root package name */
        public String f64904e;

        /* renamed from: f  reason: collision with root package name */
        public String f64905f;
    }

    public static class f {
    }

    public static class g {
    }

    private void i() {
        this.f64894e = null;
        this.f64895f = null;
        this.f64893d = null;
    }

    private void d() {
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
    }

    private h e() {
        if (PatchProxy.isSupport(new Object[0], this, f64890a, false, 73758, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f64890a, false, 73758, new Class[0], h.class);
        }
        d();
        this.g = new b();
        return this;
    }

    private h f() {
        if (PatchProxy.isSupport(new Object[0], this, f64890a, false, 73759, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f64890a, false, 73759, new Class[0], h.class);
        }
        d();
        this.h = new c();
        return this;
    }

    private h g() {
        if (PatchProxy.isSupport(new Object[0], this, f64890a, false, 73760, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f64890a, false, 73760, new Class[0], h.class);
        }
        d();
        this.i = new g();
        return this;
    }

    private h h() {
        if (PatchProxy.isSupport(new Object[0], this, f64890a, false, 73761, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f64890a, false, 73761, new Class[0], h.class);
        }
        d();
        this.j = new f();
        return this;
    }

    public final h a() {
        if (PatchProxy.isSupport(new Object[0], this, f64890a, false, 73763, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f64890a, false, 73763, new Class[0], h.class);
        }
        i();
        this.f64893d = new d();
        return this;
    }

    public final h b() {
        if (PatchProxy.isSupport(new Object[0], this, f64890a, false, 73764, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f64890a, false, 73764, new Class[0], h.class);
        }
        i();
        this.f64895f = new a();
        return this;
    }

    public final g c() {
        if (PatchProxy.isSupport(new Object[0], this, f64890a, false, 73765, new Class[0], g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[0], this, f64890a, false, 73765, new Class[0], g.class);
        }
        if (this.f64895f != null) {
            if (this.g != null) {
                this.l = new com.ss.android.ugc.aweme.share.c.b.a(this.f64891b, new File(this.f64895f.f64896a));
                this.f64892c = new com.ss.android.ugc.aweme.share.c.b.b(this.f64891b, this.l, new File(this.f64895f.f64896a), this.f64895f.f64897b);
            } else if (this.h != null) {
                this.l = new com.ss.android.ugc.aweme.share.c.b.f(this.f64891b, new File(this.f64895f.f64896a));
                com.ss.android.ugc.aweme.share.c.b.g gVar = new com.ss.android.ugc.aweme.share.c.b.g(this.f64891b, this.l, new File(this.f64895f.f64896a), this.f64895f.f64897b, this.f64895f.f64898c);
                this.f64892c = gVar;
            } else if (this.i != null) {
                if (!TextUtils.isEmpty(this.f64895f.f64896a)) {
                    this.l = new com.ss.android.ugc.aweme.share.c.c.a(this.f64891b, new File(this.f64895f.f64896a));
                    this.f64892c = new com.ss.android.ugc.aweme.share.c.c.b(this.f64891b, this.l, new File(this.f64895f.f64896a), this.f64895f.f64897b);
                } else {
                    this.f64892c = new com.ss.android.ugc.aweme.share.c.c.b(this.f64891b, null, null, this.f64895f.f64897b);
                }
            } else if (this.j != null) {
                this.l = new com.ss.android.ugc.aweme.share.c.c.c(this.f64891b, new File(this.f64895f.f64896a));
                this.f64892c = new com.ss.android.ugc.aweme.share.c.c.d(this.f64891b, this.l, new File(this.f64895f.f64896a), this.f64895f.f64897b);
            }
        } else if (this.f64893d != null) {
            if (this.g != null) {
                this.k = new com.ss.android.ugc.aweme.share.c.b.c(this.f64891b);
                this.f64892c = new com.ss.android.ugc.aweme.share.c.b.d(this.f64891b, this.k, this.f64893d.f64899a);
            } else if (this.h != null) {
                this.k = new com.ss.android.ugc.aweme.share.c.b.c(this.f64891b);
                this.f64892c = new com.ss.android.ugc.aweme.share.c.b.h(this.f64891b, this.k, this.f64893d.f64899a);
            } else if (this.i != null) {
                this.k = new com.ss.android.ugc.aweme.share.c.c.h(this.f64891b);
                this.f64892c = new i(this.f64891b, this.k, this.f64893d.f64899a);
            } else if (this.j != null) {
                this.k = new com.ss.android.ugc.aweme.share.c.c.e(this.f64891b);
                this.f64892c = new com.ss.android.ugc.aweme.share.c.c.f(this.f64891b, this.k, this.f64893d.f64899a);
            }
        } else if (this.f64894e != null) {
            if (this.g != null) {
                com.ss.android.ugc.aweme.share.c.b.e eVar = new com.ss.android.ugc.aweme.share.c.b.e(this.f64891b, this.f64894e.f64900a, this.f64894e.f64901b, this.f64894e.f64902c, this.f64894e.f64903d, this.f64894e.f64904e);
                this.f64892c = eVar;
            } else if (this.h != null) {
                com.ss.android.ugc.aweme.share.c.b.i iVar = new com.ss.android.ugc.aweme.share.c.b.i(this.f64891b, this.f64894e.f64900a, this.f64894e.f64901b, this.f64894e.f64902c, this.f64894e.f64903d, this.f64894e.f64904e);
                this.f64892c = iVar;
            } else if (this.i != null) {
                j jVar = new j(this.f64891b, this.f64894e.f64900a, this.f64894e.f64901b, this.f64894e.f64902c, this.f64894e.f64903d, this.f64894e.f64904e, this.f64894e.f64905f);
                this.f64892c = jVar;
            } else if (this.j != null) {
                com.ss.android.ugc.aweme.share.c.c.g gVar2 = new com.ss.android.ugc.aweme.share.c.c.g(this.f64891b, this.f64894e.f64900a, this.f64894e.f64901b, this.f64894e.f64902c, this.f64894e.f64903d, this.f64894e.f64904e);
                this.f64892c = gVar2;
            }
        }
        if (this.f64892c == null) {
            this.f64892c = new g(this.f64891b, "");
        }
        if (this.m != -1) {
            this.f64892c.a(this.m);
        }
        return this.f64892c;
    }

    public h(Activity activity) {
        this.f64891b = activity;
    }

    public final h a(String str) {
        if (this.f64893d != null) {
            this.f64893d.f64899a = str;
        }
        return this;
    }

    public final h b(String str) {
        if (this.f64895f != null) {
            this.f64895f.f64896a = str;
        }
        return this;
    }

    public final h a(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f64890a, false, 73757, new Class[]{Integer.TYPE}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f64890a, false, 73757, new Class[]{Integer.TYPE}, h.class);
        }
        if (i3 == 0) {
            g();
        } else if (i3 == 1) {
            e();
        } else if (i3 == 2) {
            h();
        } else if (i3 == 3) {
            f();
        }
        return this;
    }
}
