package com.bytedance.android.live.core;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Deprecated
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7824a;

    /* renamed from: b  reason: collision with root package name */
    private static a f7825b;

    public static Context a() {
        if (PatchProxy.isSupport(new Object[0], null, f7824a, true, 132, new Class[0], Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[0], null, f7824a, true, 132, new Class[0], Context.class);
        }
        if (f7825b == null) {
            return null;
        }
        return f7825b.a();
    }

    public static void a(a aVar) {
        f7825b = aVar;
    }
}
