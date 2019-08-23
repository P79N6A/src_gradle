package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.h.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34569a;

    /* renamed from: b  reason: collision with root package name */
    public static Map<Class, Object> f34570b = new ConcurrentHashMap();

    public static <T> T a(Context context, Class<T> cls) {
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{context, cls2}, null, f34569a, true, 24148, new Class[]{Context.class, Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{context, cls2}, null, f34569a, true, 24148, new Class[]{Context.class, Class.class}, Object.class);
        } else if (context == null) {
            return null;
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null || !cls.isInterface() || !a.class.equals(cls2)) {
                return null;
            }
            T t = f34570b.get(cls2);
            if (t == null || !(t instanceof k)) {
                t = new k(applicationContext);
                f34570b.put(cls2, t);
            }
            return t;
        }
    }
}
