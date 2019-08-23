package com.bytedance.android.live.utility;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8738a;

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap<Class, Object> f8739b = new ConcurrentHashMap<>();

    public static <T extends com.bytedance.android.live.base.b> T a(Class<T> cls) {
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{cls2}, null, f8738a, true, 2498, new Class[]{Class.class}, com.bytedance.android.live.base.b.class)) {
            return (com.bytedance.android.live.base.b) f8739b.get(cls2);
        }
        return (com.bytedance.android.live.base.b) PatchProxy.accessDispatch(new Object[]{cls2}, null, f8738a, true, 2498, new Class[]{Class.class}, com.bytedance.android.live.base.b.class);
    }

    public static <T extends com.bytedance.android.live.base.b> void a(Class<T> cls, T t) {
        Class<T> cls2 = cls;
        T t2 = t;
        if (PatchProxy.isSupport(new Object[]{cls2, t2}, null, f8738a, true, 2499, new Class[]{Class.class, com.bytedance.android.live.base.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls2, t2}, null, f8738a, true, 2499, new Class[]{Class.class, com.bytedance.android.live.base.b.class}, Void.TYPE);
            return;
        }
        f8739b.put(cls2, t2);
    }
}
