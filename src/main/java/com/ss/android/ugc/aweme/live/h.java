package com.ss.android.ugc.aweme.live;

import com.bytedance.android.live.base.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53408a;

    public static <T extends b> T a(Class<T> cls) {
        if (!PatchProxy.isSupport(new Object[]{cls}, null, f53408a, true, 55427, new Class[]{Class.class}, b.class)) {
            return com.bytedance.android.live.utility.b.a(cls);
        }
        return (b) PatchProxy.accessDispatch(new Object[]{cls}, null, f53408a, true, 55427, new Class[]{Class.class}, b.class);
    }
}
