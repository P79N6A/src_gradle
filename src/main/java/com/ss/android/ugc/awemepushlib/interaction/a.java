package com.ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.awemepushlib.manager.f;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77007a;

    public static int a() {
        Context context;
        if (PatchProxy.isSupport(new Object[0], null, f77007a, true, 90195, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f77007a, true, 90195, new Class[0], Integer.TYPE)).intValue();
        }
        if (j.a().getScreenOnPushMaxSize() > 0) {
            f a2 = f.a();
            if (PatchProxy.isSupport(new Object[0], null, o.f35041a, true, 25260, new Class[0], Context.class)) {
                context = (Context) PatchProxy.accessDispatch(new Object[0], null, o.f35041a, true, 25260, new Class[0], Context.class);
            } else {
                context = GlobalContext.getContext();
            }
            a2.e(context);
        }
        return j.a().getScreenOnPushMaxSize();
    }
}
