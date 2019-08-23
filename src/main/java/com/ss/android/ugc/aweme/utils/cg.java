package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import com.bytedance.ies.a;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.keva.Keva;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.utils.permission.a;
import java.util.Map;

public final class cg {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75679a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f75680b;

    public static boolean a() {
        return f75680b;
    }

    public static void b() {
        if (PatchProxy.isSupport(new Object[0], null, f75679a, true, 88369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f75679a, true, 88369, new Class[0], Void.TYPE);
        } else {
            b(false);
        }
    }

    private static void c() {
        if (PatchProxy.isSupport(new Object[0], null, f75679a, true, 88371, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f75679a, true, 88371, new Class[0], Void.TYPE);
        } else {
            af.a(d.a()).b();
        }
    }

    private static void d() {
        if (PatchProxy.isSupport(new Object[0], null, f75679a, true, 88372, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f75679a, true, 88372, new Class[0], Void.TYPE);
            return;
        }
        Keva repo = Keva.getRepo("poi_repo");
        if (repo != null) {
            repo.storeLong("show_location_dialog_time", System.currentTimeMillis());
        }
    }

    private static boolean e() {
        if (PatchProxy.isSupport(new Object[0], null, f75679a, true, 88373, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f75679a, true, 88373, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            int intValue = g.b().aq().getNearbyLocationPromptInterval().intValue();
            if (intValue == 0) {
                return true;
            }
            Keva repo = Keva.getRepo("poi_repo");
            if (repo == null) {
                return true;
            }
            long j = repo.getLong("show_location_dialog_time", 0);
            if (j != 0 && System.currentTimeMillis() - j <= ((long) intValue) * 86400000) {
                return false;
            }
            return true;
        } catch (a unused) {
            return true;
        }
    }

    public static void a(boolean z) {
        f75680b = true;
    }

    public static void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f75679a, true, 88368, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f75679a, true, 88368, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            final boolean z2 = z;
            com.ss.android.b.a.a.a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f75681a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f75681a, false, 88376, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f75681a, false, 88376, new Class[0], Void.TYPE);
                        return;
                    }
                    try {
                        af a2 = af.a((Context) k.a());
                        boolean z = z2;
                        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, a2, af.f2624a, false, 22537, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                            af afVar = a2;
                            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, afVar, af.f2624a, false, 22537, new Class[]{Boolean.TYPE}, Void.TYPE);
                            return;
                        }
                        a2.f2627d.a(z);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public static void a(Activity activity, a.C0792a aVar) {
        Activity activity2 = activity;
        a.C0792a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, aVar2}, null, f75679a, true, 88370, new Class[]{Activity.class, a.C0792a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, aVar2}, null, f75679a, true, 88370, new Class[]{Activity.class, a.C0792a.class}, Void.TYPE);
        } else if (activity2 == null || !e()) {
        } else {
            if (Build.VERSION.SDK_INT < 23) {
                c();
            } else if (!com.ss.android.ugc.aweme.utils.permission.a.a((Context) activity2, af.f2626c)) {
                r.onEvent(MobClick.obtain().setEventName("location_notify").setLabelName("click_nearby"));
                r.a("location_permission_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "homepage_fresh").f34114b);
                new a.C0185a(activity2).c(2130840183).a((int) C0906R.string.b7j).b((int) C0906R.string.b7i).a((int) C0906R.string.b7f, (DialogInterface.OnClickListener) new ch(activity2, aVar2)).b((int) C0906R.string.b4l, ci.f75687b).a().b();
                d();
            } else {
                c();
            }
        }
    }
}
