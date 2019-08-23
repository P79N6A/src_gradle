package com.ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.pushmanager.client.e;
import com.ss.android.ugc.awemepushlib.manager.a;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77012a;

    /* renamed from: b  reason: collision with root package name */
    private final b f77013b;

    d(b bVar) {
        this.f77013b = bVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f77012a, false, 90206, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77012a, false, 90206, new Class[0], Void.TYPE);
            return;
        }
        b bVar = this.f77013b;
        a a2 = a.a();
        Context context = bVar.f77009b;
        if (PatchProxy.isSupport(new Object[]{context}, a2, a.f77064a, false, 90294, new Class[]{Context.class}, Void.TYPE)) {
            a aVar = a2;
            PatchProxy.accessDispatch(new Object[]{context}, aVar, a.f77064a, false, 90294, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        e.a().a(context, a.a().c());
        e.a().b(context, a.a().a(context));
    }
}
