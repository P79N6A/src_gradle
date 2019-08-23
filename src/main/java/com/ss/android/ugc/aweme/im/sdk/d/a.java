package com.ss.android.ugc.aweme.im.sdk.d;

import android.support.annotation.MainThread;
import com.bytedance.im.core.b.e.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.im.sdk.d.j;
import com.ss.android.ugc.aweme.im.sdk.j.d;
import com.ss.android.ugc.aweme.im.sdk.providedservices.DefaultMainProxy;
import com.ss.android.ugc.aweme.im.sdk.providedservices.IImplService;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.ba;
import com.ss.android.ugc.aweme.im.sdk.utils.o;
import com.ss.android.ugc.aweme.im.service.c;
import com.ss.android.websocket.b.b;
import org.greenrobot.eventbus.Subscribe;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3370a;

    /* renamed from: e  reason: collision with root package name */
    private static a f3371e;

    /* renamed from: b  reason: collision with root package name */
    public c f3372b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.service.a f3373c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.im.core.a.a f3374d = new d();

    private a() {
    }

    public static IImplService b() {
        if (PatchProxy.isSupport(new Object[0], null, f3370a, true, 51691, new Class[0], IImplService.class)) {
            return (IImplService) PatchProxy.accessDispatch(new Object[0], null, f3370a, true, 51691, new Class[0], IImplService.class);
        }
        return (IImplService) com.ss.android.ugc.aweme.im.sdk.g.a.a(IImplService.class);
    }

    public final c e() {
        if (PatchProxy.isSupport(new Object[0], this, f3370a, false, 51697, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, f3370a, false, 51697, new Class[0], c.class);
        } else if (this.f3372b == null) {
            return new DefaultMainProxy();
        } else {
            return this.f3372b;
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3370a, false, 51698, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3370a, false, 51698, new Class[0], Void.TYPE);
            return;
        }
        if (com.bytedance.im.core.a.c.a().f20879c == null) {
            com.bytedance.im.core.a.c.a().a(this.f3374d);
        }
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f3370a, true, 51689, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f3370a, true, 51689, new Class[0], a.class);
        }
        if (f3371e == null) {
            synchronized (a.class) {
                if (f3371e == null) {
                    f3371e = new a();
                }
            }
        }
        return f3371e;
    }

    @MainThread
    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3370a, false, 51692, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3370a, false, 51692, new Class[0], Void.TYPE);
            return;
        }
        if (!com.bytedance.im.core.a.c.a().f20881e) {
            j jVar = j.f51270d;
            if (PatchProxy.isSupport(new Object[0], jVar, j.f51267a, false, 51778, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], jVar, j.f51267a, false, 51778, new Class[0], Void.TYPE);
            } else {
                if (j.f51268b == null) {
                    j.f51268b = j.a.f51272b;
                }
                g.a().f21193c = j.f51268b;
            }
            k a2 = k.a();
            if (PatchProxy.isSupport(new Object[0], a2, k.f51273a, false, 51794, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], a2, k.f51273a, false, 51794, new Class[0], Void.TYPE);
            } else {
                com.bytedance.im.core.d.d.a().a(a2.k);
            }
            com.bytedance.im.core.a.c.a().c();
        }
    }

    @MainThread
    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3370a, false, 51693, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3370a, false, 51693, new Class[0], Void.TYPE);
            return;
        }
        ba a2 = ba.a();
        if (PatchProxy.isSupport(new Object[0], a2, ba.f52536a, false, 53753, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, ba.f52536a, false, 53753, new Class[0], Void.TYPE);
        } else {
            a2.f52538b.clear();
            a2.f52539c.clear();
        }
        com.bytedance.im.core.a.c.a().d();
        k a3 = k.a();
        if (PatchProxy.isSupport(new Object[0], a3, k.f51273a, false, 51795, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a3, k.f51273a, false, 51795, new Class[0], Void.TYPE);
        } else {
            com.bytedance.im.core.d.d.a().b(a3.k);
            if (PatchProxy.isSupport(new Object[0], a3, k.f51273a, false, 51793, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], a3, k.f51273a, false, 51793, new Class[0], Void.TYPE);
            } else {
                a3.i.removeMessages(2);
                if (a3.h != null && !a3.h.a()) {
                    a3.h.c();
                }
                a3.h = null;
                a3.f51275c.clear();
                a3.f51276d.clear();
                a3.g = false;
                a3.f51278f = 0;
                a3.f51277e = 0;
                a3.e();
            }
        }
        j jVar = j.f51270d;
        if (PatchProxy.isSupport(new Object[0], jVar, j.f51267a, false, 51779, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], jVar, j.f51267a, false, 51779, new Class[0], Void.TYPE);
        } else if (j.f51268b != null) {
            g.a().f21193c = null;
            j.f51268b = null;
        }
        o a4 = o.a();
        if (PatchProxy.isSupport(new Object[0], a4, o.f52605a, false, 53437, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a4, o.f52605a, false, 53437, new Class[0], Void.TYPE);
        } else {
            a4.f52609c.edit().remove("userid").remove("token").commit();
        }
        com.ss.android.ugc.aweme.im.sdk.j.c a5 = com.ss.android.ugc.aweme.im.sdk.j.c.a();
        if (PatchProxy.isSupport(new Object[0], a5, com.ss.android.ugc.aweme.im.sdk.j.c.f3379a, false, 54001, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a5, com.ss.android.ugc.aweme.im.sdk.j.c.f3379a, false, 54001, new Class[0], Void.TYPE);
        } else if (a5.f3384d != b.a.CLOSED && a5.f3384d != b.a.CLOSING) {
            String str = a5.f3383c;
            if (PatchProxy.isSupport(new Object[]{str}, a5, com.ss.android.ugc.aweme.im.sdk.j.c.f3379a, false, 54004, new Class[]{String.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.im.sdk.j.c cVar = a5;
                PatchProxy.accessDispatch(new Object[]{str}, cVar, com.ss.android.ugc.aweme.im.sdk.j.c.f3379a, false, 54004, new Class[]{String.class}, Void.TYPE);
                return;
            }
            if (NetworkUtils.isNetworkAvailable(a5.f3382b)) {
                org.greenrobot.eventbus.c.a().d(new com.ss.android.websocket.b.a.a(str));
            }
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.common.net.a aVar) {
        com.ss.android.ugc.aweme.common.net.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3370a, false, 51696, new Class[]{com.ss.android.ugc.aweme.common.net.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3370a, false, 51696, new Class[]{com.ss.android.ugc.aweme.common.net.a.class}, Void.TYPE);
            return;
        }
        if (aVar2.f40269d != com.ss.android.ugc.aweme.common.net.a.f40266a && com.ss.android.ugc.aweme.im.sdk.utils.d.a()) {
            ad.c();
        }
    }
}
