package com.ss.android.ugc.aweme;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.k;
import com.ss.android.ugc.aweme.base.apt.sharedpref.d;
import com.ss.android.ugc.aweme.base.apt.sharedpref.g;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50734a;

    public static <T> T a(Context context, Class<T> cls) {
        Context context2 = context;
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{context2, cls2}, null, f50734a, true, 19500, new Class[]{Context.class, Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{context2, cls2}, null, f50734a, true, 19500, new Class[]{Context.class, Class.class}, Object.class);
        }
        if (PatchProxy.isSupport(new Object[]{context2, cls2}, null, d.f34571a, true, 24149, new Class[]{Context.class, Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{context2, cls2}, null, d.f34571a, true, 24149, new Class[]{Context.class, Class.class}, Object.class);
        }
        T t = null;
        if (context2 == null || cls2 == null || !cls.isInterface()) {
            return null;
        }
        if (k.class.equals(cls2)) {
            t = new g(context2);
        }
        return t;
    }
}
