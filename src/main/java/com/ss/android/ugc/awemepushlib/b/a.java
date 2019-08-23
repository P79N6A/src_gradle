package com.ss.android.ugc.awemepushlib.b;

import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.common.push.a.a;
import com.bytedance.ies.uikit.base.AppHooks;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.awemepushlib.di.ies.MessageHandler;

public final class a implements a.C0180a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76963a;

    public final void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f76963a, false, 90363, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f76963a, false, 90363, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        try {
            AppHooks.InitHook initHook = AppHooks.getInitHook();
            if (initHook != null) {
                initHook.tryInit(context2);
            } else {
                context2.startService(new Intent(context2, MessageHandler.class));
            }
        } catch (Throwable unused) {
        }
    }
}
