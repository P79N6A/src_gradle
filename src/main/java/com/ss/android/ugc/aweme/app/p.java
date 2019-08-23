package com.ss.android.ugc.aweme.app;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.antiaddic.c;
import com.ss.android.ugc.aweme.antiaddic.d;
import com.ss.android.ugc.aweme.antiaddic.e;
import com.ss.android.ugc.aweme.commercialize.log.y;
import com.ss.android.ugc.aweme.g;
import com.ss.android.ugc.aweme.profile.d.ab;
import com.ss.android.ugc.aweme.splash.b;
import com.ss.android.ugc.aweme.utils.ef;
import com.ss.android.ugc.aweme.utils.permission.PermissionStateReporter;

public class p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2668a;

    /* renamed from: c  reason: collision with root package name */
    private static p f2669c;

    /* renamed from: b  reason: collision with root package name */
    public g f2670b;

    public final boolean b() {
        return this.f2670b.f49495c;
    }

    public final boolean c() {
        return this.f2670b.h;
    }

    public final long d() {
        return this.f2670b.f49496d;
    }

    public static p a() {
        if (PatchProxy.isSupport(new Object[0], null, f2668a, true, 22329, new Class[0], p.class)) {
            return (p) PatchProxy.accessDispatch(new Object[0], null, f2668a, true, 22329, new Class[0], p.class);
        }
        if (f2669c == null) {
            synchronized (p.class) {
                if (f2669c == null) {
                    f2669c = new p();
                }
            }
        }
        return f2669c;
    }

    public final Activity e() {
        if (!PatchProxy.isSupport(new Object[0], this, f2668a, false, 22330, new Class[0], Activity.class)) {
            return AwemeAppData.p().f();
        }
        return (Activity) PatchProxy.accessDispatch(new Object[0], this, f2668a, false, 22330, new Class[0], Activity.class);
    }

    private p() {
        k a2 = k.a();
        if (a2 != null) {
            this.f2670b = new g(a2);
            d d2 = d.d();
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], d2, d.f33384a, false, 21697, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], d2, d.f33384a, false, 21697, new Class[0], Void.TYPE);
            } else if (ToolUtils.isMainProcess(GlobalContext.getContext())) {
                d d3 = d.d();
                if (PatchProxy.isSupport(new Object[0], d3, d.f33384a, false, 21700, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], d3, d.f33384a, false, 21700, new Class[0], Void.TYPE);
                } else {
                    synchronized (d.class) {
                        d3.f33386b.clear();
                    }
                }
                c a3 = c.a();
                if (PatchProxy.isSupport(new Object[0], a3, c.f33371a, false, 21687, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a3, c.f33371a, false, 21687, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (!com.ss.android.ugc.aweme.i18n.c.a()) {
                    z = true;
                }
                if (z) {
                    d.d().a(new e());
                }
                d.d().a(new com.ss.android.ugc.aweme.newfollow.util.c());
                d.d().a(new ab());
                if (!a.a()) {
                    d.d().a(new y());
                }
            }
            d.d().a(ef.d());
            d.d().a(PermissionStateReporter.d());
            d.d().a(b.f71588b);
            this.f2670b.f49497e = d.d();
        }
    }
}
