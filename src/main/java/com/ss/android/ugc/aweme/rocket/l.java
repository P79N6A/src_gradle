package com.ss.android.ugc.aweme.rocket;

import android.content.Context;
import com.bytedance.frameworks.plugin.pm.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.rocket.android.api.FusionFuelSdk;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings;
import com.ss.android.ugc.aweme.plugin.a;
import com.ss.android.ugc.aweme.plugin.g.b;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63665a = null;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f63666b = true;

    public static void b() {
        if (PatchProxy.isSupport(new Object[0], null, f63665a, true, 70907, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f63665a, true, 70907, new Class[0], Void.TYPE);
            return;
        }
        c.e("com.ss.android.ugc.aweme.fusionfuelplugin");
        FusionFuelSdk.isFusionFuelAvailable();
    }

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f63665a, true, 70906, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f63665a, true, 70906, new Class[0], Void.TYPE);
            return;
        }
        if (!a.a()) {
            try {
                FlipChatSettings av = g.b().av();
                if (!(av == null || av.getMainSwitch() == null)) {
                    if (av.getMainSwitch().booleanValue()) {
                        if (f63666b) {
                            if (c.b("com.ss.android.ugc.aweme.fusionfuelplugin")) {
                                b();
                            }
                            f63666b = false;
                        }
                        if (!b.a("com.ss.android.ugc.aweme.fusionfuelplugin")) {
                            Context context = i.a().getContext();
                            if (context != null) {
                                com.ss.android.ugc.aweme.plugin.a.a().a(context, "start_fusion", false, new a.C0663a() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f63667a;

                                    public final void a() {
                                        if (PatchProxy.isSupport(new Object[0], this, f63667a, false, 70908, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f63667a, false, 70908, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        l.b();
                                    }
                                });
                            }
                        }
                    }
                }
            } catch (com.bytedance.ies.a unused) {
            }
        }
    }
}
