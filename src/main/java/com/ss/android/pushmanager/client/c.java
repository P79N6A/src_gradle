package com.ss.android.pushmanager.client;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.b.k;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30541a;

    public static void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f30541a, true, 19067, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, f30541a, true, 19067, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (k.d(context)) {
            if (PatchProxy.isSupport(new Object[]{context}, null, b.f30533a, true, 19058, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, null, b.f30533a, true, 19058, new Class[]{Context.class}, Void.TYPE);
            } else if (!(context == null || b.f30534c == null)) {
                b.f30534c.a();
            }
        }
    }
}
