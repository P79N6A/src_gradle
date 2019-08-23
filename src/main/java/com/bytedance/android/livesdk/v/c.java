package com.bytedance.android.livesdk.v;

import com.bytedance.android.livesdk.schema.a;
import com.bytedance.android.livesdk.user.e;
import com.bytedance.android.livesdk.wallet.l;
import com.bytedance.android.livesdkapi.d.f;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.d;
import com.bytedance.android.livesdkapi.host.g;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.android.livesdkapi.host.i;
import com.bytedance.android.livesdkapi.host.j;
import com.bytedance.android.livesdkapi.host.k;
import com.bytedance.android.livesdkapi.host.m;
import com.bytedance.android.livesdkapi.host.o;
import com.bytedance.android.livesdkapi.service.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class c implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17660a;

    /* renamed from: b  reason: collision with root package name */
    private b f17661b;

    /* renamed from: c  reason: collision with root package name */
    private e f17662c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.android.livesdk.share.b f17663d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.android.livesdk.schema.b f17664e;

    /* renamed from: f  reason: collision with root package name */
    private l f17665f;
    private h g;
    private IHostApp h;

    public final d a() {
        if (!PatchProxy.isSupport(new Object[0], this, f17660a, false, 13196, new Class[0], d.class)) {
            return this.f17661b.a();
        }
        return (d) PatchProxy.accessDispatch(new Object[0], this, f17660a, false, 13196, new Class[0], d.class);
    }

    public final com.bytedance.android.livesdkapi.host.c b() {
        if (!PatchProxy.isSupport(new Object[0], this, f17660a, false, 13197, new Class[0], com.bytedance.android.livesdkapi.host.c.class)) {
            return this.f17661b.b();
        }
        return (com.bytedance.android.livesdkapi.host.c) PatchProxy.accessDispatch(new Object[0], this, f17660a, false, 13197, new Class[0], com.bytedance.android.livesdkapi.host.c.class);
    }

    public final IHostApp c() {
        if (PatchProxy.isSupport(new Object[0], this, f17660a, false, 13198, new Class[0], IHostApp.class)) {
            return (IHostApp) PatchProxy.accessDispatch(new Object[0], this, f17660a, false, 13198, new Class[0], IHostApp.class);
        }
        if (this.h == null) {
            this.h = new com.bytedance.android.livesdk.e(this.f17661b.c());
        }
        return this.h;
    }

    public final g d() {
        if (!PatchProxy.isSupport(new Object[0], this, f17660a, false, 13200, new Class[0], g.class)) {
            return this.f17661b.e();
        }
        return (g) PatchProxy.accessDispatch(new Object[0], this, f17660a, false, 13200, new Class[0], g.class);
    }

    public final i e() {
        if (!PatchProxy.isSupport(new Object[0], this, f17660a, false, 13201, new Class[0], i.class)) {
            return this.f17661b.f();
        }
        return (i) PatchProxy.accessDispatch(new Object[0], this, f17660a, false, 13201, new Class[0], i.class);
    }

    public final l f() {
        if (PatchProxy.isSupport(new Object[0], this, f17660a, false, 13202, new Class[0], l.class)) {
            return (l) PatchProxy.accessDispatch(new Object[0], this, f17660a, false, 13202, new Class[0], l.class);
        }
        if (this.f17665f == null) {
            this.f17665f = new l(this.f17661b.g());
        }
        return this.f17665f;
    }

    public final h h() {
        if (PatchProxy.isSupport(new Object[0], this, f17660a, false, 13204, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f17660a, false, 13204, new Class[0], h.class);
        }
        if (this.g == null) {
            this.g = new com.bytedance.android.livesdk.network.b(this.f17661b.i());
        }
        return this.g;
    }

    public final k j() {
        if (!PatchProxy.isSupport(new Object[0], this, f17660a, false, 13206, new Class[0], k.class)) {
            return this.f17661b.k();
        }
        return (k) PatchProxy.accessDispatch(new Object[0], this, f17660a, false, 13206, new Class[0], k.class);
    }

    public final e k() {
        if (PatchProxy.isSupport(new Object[0], this, f17660a, false, 13207, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], this, f17660a, false, 13207, new Class[0], e.class);
        }
        if (this.f17662c == null) {
            this.f17662c = new com.bytedance.android.livesdk.user.l(this.f17661b.l());
        }
        return this.f17662c;
    }

    public final o l() {
        if (!PatchProxy.isSupport(new Object[0], this, f17660a, false, 13208, new Class[0], o.class)) {
            return this.f17661b.m();
        }
        return (o) PatchProxy.accessDispatch(new Object[0], this, f17660a, false, 13208, new Class[0], o.class);
    }

    public final com.bytedance.android.livesdkapi.host.b m() {
        if (!PatchProxy.isSupport(new Object[0], this, f17660a, false, 13209, new Class[0], com.bytedance.android.livesdkapi.host.b.class)) {
            return this.f17661b.n();
        }
        return (com.bytedance.android.livesdkapi.host.b) PatchProxy.accessDispatch(new Object[0], this, f17660a, false, 13209, new Class[0], com.bytedance.android.livesdkapi.host.b.class);
    }

    public final f n() {
        if (!PatchProxy.isSupport(new Object[0], this, f17660a, false, 13210, new Class[0], f.class)) {
            return this.f17661b.o();
        }
        return (f) PatchProxy.accessDispatch(new Object[0], this, f17660a, false, 13210, new Class[0], f.class);
    }

    public final m o() {
        if (!PatchProxy.isSupport(new Object[0], this, f17660a, false, 13211, new Class[0], m.class)) {
            return this.f17661b.p();
        }
        return (m) PatchProxy.accessDispatch(new Object[0], this, f17660a, false, 13211, new Class[0], m.class);
    }

    public final com.bytedance.android.livesdkapi.host.e p() {
        if (!PatchProxy.isSupport(new Object[0], this, f17660a, false, 13212, new Class[0], com.bytedance.android.livesdkapi.host.e.class)) {
            return this.f17661b.q();
        }
        return (com.bytedance.android.livesdkapi.host.e) PatchProxy.accessDispatch(new Object[0], this, f17660a, false, 13212, new Class[0], com.bytedance.android.livesdkapi.host.e.class);
    }

    public final com.bytedance.android.livesdk.share.b g() {
        com.bytedance.android.livesdk.share.b bVar;
        if (PatchProxy.isSupport(new Object[0], this, f17660a, false, 13203, new Class[0], com.bytedance.android.livesdk.share.b.class)) {
            return (com.bytedance.android.livesdk.share.b) PatchProxy.accessDispatch(new Object[0], this, f17660a, false, 13203, new Class[0], com.bytedance.android.livesdk.share.b.class);
        }
        if (this.f17663d == null) {
            j h2 = this.f17661b.h();
            if (PatchProxy.isSupport(new Object[]{h2}, null, com.bytedance.android.livesdk.share.c.f17210a, true, 13264, new Class[]{j.class}, com.bytedance.android.livesdk.share.b.class)) {
                bVar = (com.bytedance.android.livesdk.share.b) PatchProxy.accessDispatch(new Object[]{h2}, null, com.bytedance.android.livesdk.share.c.f17210a, true, 13264, new Class[]{j.class}, com.bytedance.android.livesdk.share.b.class);
            } else {
                bVar = new com.bytedance.android.livesdk.share.d(h2);
            }
            this.f17663d = bVar;
        }
        return this.f17663d;
    }

    public final com.bytedance.android.livesdk.schema.b i() {
        a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f17660a, false, 13205, new Class[0], com.bytedance.android.livesdk.schema.b.class)) {
            return (com.bytedance.android.livesdk.schema.b) PatchProxy.accessDispatch(new Object[0], this, f17660a, false, 13205, new Class[0], com.bytedance.android.livesdk.schema.b.class);
        }
        if (this.f17664e == null) {
            com.bytedance.android.livesdkapi.host.a j = this.f17661b.j();
            if (PatchProxy.isSupport(new Object[]{j}, null, com.bytedance.android.livesdk.schema.c.f17174a, true, 13150, new Class[]{com.bytedance.android.livesdkapi.host.a.class}, a.class)) {
                aVar = (a) PatchProxy.accessDispatch(new Object[]{j}, null, com.bytedance.android.livesdk.schema.c.f17174a, true, 13150, new Class[]{com.bytedance.android.livesdkapi.host.a.class}, a.class);
            } else {
                aVar = new a(j);
            }
            this.f17664e = aVar;
        }
        return this.f17664e;
    }

    public c(b bVar) {
        this.f17661b = bVar;
        if (this.g == null) {
            this.g = new com.bytedance.android.livesdk.network.b(bVar.i());
        }
        if (this.h == null) {
            this.h = new com.bytedance.android.livesdk.e(bVar.c());
        }
    }
}
