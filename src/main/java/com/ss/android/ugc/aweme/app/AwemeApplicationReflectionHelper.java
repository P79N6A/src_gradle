package com.ss.android.ugc.aweme.app;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.ugc.aweme.app.application.b;
import com.ss.android.ugc.aweme.app.application.i;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.a.a;
import com.ss.android.ugc.aweme.lego.a.d;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.shortvideo.ea;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

@Keep
public class AwemeApplicationReflectionHelper {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void attachBaseContextAfterMultiDex(k kVar) {
        BaseAppData baseAppData;
        k kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{kVar2}, null, changeQuickRedirect, true, 22317, new Class[]{k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVar2}, null, changeQuickRedirect, true, 22317, new Class[]{k.class}, Void.TYPE);
            return;
        }
        kVar.i();
        a aVar = a.i;
        if (PatchProxy.isSupport(new Object[]{kVar2}, aVar, a.f3404a, false, 55075, new Class[]{Application.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVar2}, aVar, a.f3404a, false, 55075, new Class[]{Application.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(kVar2, "context");
            Context context = kVar2;
            a.f3409f = context;
            a.c cVar = new a.c();
            a.g = cVar;
            cVar.a(1205, ea.f66827f);
            d dVar = a.f3405b;
            if (PatchProxy.isSupport(new Object[]{context}, dVar, d.f53031a, false, 55168, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, dVar, d.f53031a, false, 55168, new Class[]{Context.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(context, "context");
                dVar.f53032b = context;
                for (f fVar : f.values()) {
                    dVar.f53033c.put(fVar, new ArrayList());
                    dVar.f53034d.put(fVar, new ArrayList());
                }
            }
            a.f3406c.a(context);
            a.f3407d.a(context);
            com.ss.android.ugc.aweme.lego.a.a aVar2 = a.f3408e;
            if (PatchProxy.isSupport(new Object[]{context}, aVar2, com.ss.android.ugc.aweme.lego.a.a.f53009a, false, 55144, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, aVar2, com.ss.android.ugc.aweme.lego.a.a.f53009a, false, 55144, new Class[]{Context.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(context, "context");
                aVar2.f53010b = context;
                ((Application) context).registerActivityLifecycleCallbacks(new a.C0612a());
            }
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.lego.a.f3404a, false, 55087, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.lego.a.f3404a, false, 55087, new Class[0], Void.TYPE);
            } else {
                Looper.myQueue().addIdleHandler(new a.o());
            }
        }
        if (kVar2.g) {
            kVar2.f2660b = new b(kVar2);
        } else {
            kVar2.f2660b = new i(kVar2);
        }
        if (PatchProxy.isSupport(new Object[0], kVar, k.f2659a, false, 22293, new Class[0], BaseAppData.class)) {
            baseAppData = (BaseAppData) PatchProxy.accessDispatch(new Object[0], kVar, k.f2659a, false, 22293, new Class[0], BaseAppData.class);
        } else {
            baseAppData = new AwemeAppData(i.a(), "/aweme", "wx76fdd06dde311af3");
        }
        BaseAppData.a(baseAppData);
        kVar2.f2660b.a((Context) kVar2);
        if (kVar2.g) {
            ag i = ag.i();
            if (PatchProxy.isSupport(new Object[0], i, ag.f3141a, false, 40155, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], i, ag.f3141a, false, 40155, new Class[0], Void.TYPE);
            } else if (i.f3144d > 0) {
                i.h();
            } else {
                i.f3144d = SystemClock.uptimeMillis();
            }
        }
    }
}
