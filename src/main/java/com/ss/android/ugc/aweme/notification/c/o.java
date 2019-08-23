package com.ss.android.ugc.aweme.notification.c;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.service.session.IAction;
import com.ss.android.ugc.aweme.im.service.session.a;

public final /* synthetic */ class o implements IAction {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58072a;

    /* renamed from: b  reason: collision with root package name */
    private final n f58073b;

    o(n nVar) {
        this.f58073b = nVar;
    }

    public final void a(Context context, a aVar, int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, aVar, Integer.valueOf(i)}, this, f58072a, false, 63229, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aVar, Integer.valueOf(i)}, this, f58072a, false, 63229, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f58073b.a(context2, i);
    }
}
