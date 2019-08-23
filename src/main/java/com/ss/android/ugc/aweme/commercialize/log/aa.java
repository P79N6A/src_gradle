package com.ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39286a;

    public interface a {
        long getCreativeId();

        String getLogExtra();
    }

    public static void a(Context context, a aVar) {
        Context context2 = context;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, aVar2}, null, f39286a, true, 31854, new Class[]{Context.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aVar2}, null, f39286a, true, 31854, new Class[]{Context.class, a.class}, Void.TYPE);
            return;
        }
        a(context2, aVar2, "safety_video_show");
    }

    public static void b(Context context, a aVar) {
        Context context2 = context;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, aVar2}, null, f39286a, true, 31857, new Class[]{Context.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aVar2}, null, f39286a, true, 31857, new Class[]{Context.class, a.class}, Void.TYPE);
            return;
        }
        a(context2, aVar2, "safety_video_click_account");
    }

    public static void c(Context context, a aVar) {
        Context context2 = context;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, aVar2}, null, f39286a, true, 31858, new Class[]{Context.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aVar2}, null, f39286a, true, 31858, new Class[]{Context.class, a.class}, Void.TYPE);
            return;
        }
        a(context2, aVar2, "safety_video_like");
    }

    public static void a(Context context, a aVar, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, aVar, str2}, null, f39286a, true, 31862, new Class[]{Context.class, a.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aVar, str2}, null, f39286a, true, 31862, new Class[]{Context.class, a.class, String.class}, Void.TYPE);
        } else if (context2 != null && aVar != null) {
            d.a().a("result_ad").b(str2).a(Long.valueOf(aVar.getCreativeId())).g(aVar.getLogExtra()).a(context2);
        }
    }
}
