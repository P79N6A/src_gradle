package com.ss.android.common.http;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28291a;

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f28291a, true, 15758, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f28291a, true, 15758, new Class[0], b.class);
        }
        return com.bytedance.ies.net.a.a.a();
    }

    public static c b() {
        if (PatchProxy.isSupport(new Object[0], null, f28291a, true, 15759, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f28291a, true, 15759, new Class[0], c.class);
        }
        return com.bytedance.ies.net.a.a.f20846b;
    }
}
