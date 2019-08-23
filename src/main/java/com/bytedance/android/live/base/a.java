package com.bytedance.android.live.base;

import com.bytedance.android.live.base.b.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7682a;

    /* renamed from: b  reason: collision with root package name */
    private static b f7683b;

    public static synchronized void a(b bVar) {
        synchronized (a.class) {
            f7683b = bVar;
        }
    }

    public static <T> T a(Class<T> cls) {
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{cls2}, null, f7682a, true, 9, new Class[]{Class.class}, Object.class)) {
            return f7683b.a(cls2);
        }
        return PatchProxy.accessDispatch(new Object[]{cls2}, null, f7682a, true, 9, new Class[]{Class.class}, Object.class);
    }
}
