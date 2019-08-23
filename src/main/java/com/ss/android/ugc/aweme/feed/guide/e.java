package com.ss.android.ugc.aweme.feed.guide;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.sharedpref.c;
import com.ss.android.ugc.aweme.feed.guide.a.a;
import com.ss.android.ugc.aweme.feed.guide.a.b;
import com.ss.android.ugc.aweme.main.bm;
import com.ss.android.ugc.aweme.main.bt;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.dd;
import javax.annotation.Nonnull;

public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45400a;

    /* renamed from: b  reason: collision with root package name */
    public static final Long f45401b = 2000L;

    /* renamed from: c  reason: collision with root package name */
    public a f45402c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f45403d;

    /* renamed from: e  reason: collision with root package name */
    public bm f45404e;

    /* renamed from: f  reason: collision with root package name */
    bt f45405f = new bt();
    public long g = -1;
    public Runnable h = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45406a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f45406a, false, 41242, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45406a, false, 41242, new Class[0], Void.TYPE);
            } else if (!d.c() && e.this.f45405f.b(true)) {
                e.this.f45402c.G_();
            }
        }
    };
    private boolean j;
    private Runnable k = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45408a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f45408a, false, 41243, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45408a, false, 41243, new Class[0], Void.TYPE);
                return;
            }
            e.this.f45402c.ak();
            e.this.f45404e.u(false);
        }
    };

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f45400a, false, 41241, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45400a, false, 41241, new Class[0], Void.TYPE);
            return;
        }
        this.f45402c.E();
        this.f45402c.al();
        this.f45402c.am();
        this.f45402c.an();
    }

    public final void H() {
        if (PatchProxy.isSupport(new Object[0], this, f45400a, false, 41234, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45400a, false, 41234, new Class[0], Void.TYPE);
            return;
        }
        b();
    }

    public final void M() {
        if (PatchProxy.isSupport(new Object[0], this, f45400a, false, 41238, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45400a, false, 41238, new Class[0], Void.TYPE);
            return;
        }
        this.f45404e.u(false);
        this.f45403d.removeCallbacks(this.k);
        this.f45402c.al();
    }

    public boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f45400a, false, 41239, new Class[0], Boolean.TYPE)) {
            return this.f45405f.b(true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45400a, false, 41239, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void G() {
        if (PatchProxy.isSupport(new Object[0], this, f45400a, false, 41231, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45400a, false, 41231, new Class[0], Void.TYPE);
            return;
        }
        if (!this.j && a()) {
            this.g = System.currentTimeMillis();
            this.f45403d.removeCallbacks(this.h);
            this.f45403d.postDelayed(this.h, f45401b.longValue());
        }
    }

    public final void I() {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f45400a, false, 41236, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45400a, false, 41236, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], null, d.f45398a, true, 41227, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, d.f45398a, true, 41227, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (AbTestManager.a().br() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (PatchProxy.isSupport(new Object[0], this, f45400a, false, 41233, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45400a, false, 41233, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z2 = this.f45404e.t(true);
            }
            if (z2) {
                this.f45403d.removeCallbacks(this.k);
                this.f45403d.post(this.k);
            }
        }
    }

    public final void h(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f45400a, false, 41235, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f45400a, false, 41235, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j = true;
        if (PatchProxy.isSupport(new Object[0], this, f45400a, false, 41240, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45400a, false, 41240, new Class[0], Void.TYPE);
        } else {
            this.f45403d.removeCallbacks(this.h);
            this.f45402c.E();
            this.f45405f.c(false);
        }
        b();
    }

    @MainThread
    public e(@NonNull a aVar, @Nonnull Context context) {
        Object obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, null, dd.f75734a, true, 88490, new Class[]{Object.class}, Object.class)) {
            obj = PatchProxy.accessDispatch(new Object[]{aVar}, null, dd.f75734a, true, 88490, new Class[]{Object.class}, Object.class);
        } else if (aVar != null) {
            obj = aVar;
        } else {
            throw new NullPointerException();
        }
        this.f45402c = (a) obj;
        this.f45403d = new Handler(Looper.getMainLooper());
        this.f45404e = (bm) c.a(context, bm.class);
    }
}
