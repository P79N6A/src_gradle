package com.ss.android.ugc.aweme.commerce.e;

import android.content.Context;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36893a;

    public static void a(Context context, String str) {
        if (PatchProxy.isSupport(new Object[]{context, str}, null, f36893a, true, 30131, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str}, null, f36893a, true, 30131, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        a.c(context, str).a();
    }
}
