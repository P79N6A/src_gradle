package com.ss.android.ugc.aweme.notification.c;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.service.session.IAction;
import com.ss.android.ugc.aweme.im.service.session.a;

public final /* synthetic */ class j implements IAction {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58057a;

    /* renamed from: b  reason: collision with root package name */
    private final i f58058b;

    j(i iVar) {
        this.f58058b = iVar;
    }

    public final void a(Context context, a aVar, int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, aVar, Integer.valueOf(i)}, this, f58057a, false, 63214, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aVar, Integer.valueOf(i)}, this, f58057a, false, 63214, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f58058b.a(context2, i);
    }
}
