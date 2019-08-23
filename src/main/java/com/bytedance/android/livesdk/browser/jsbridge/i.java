package com.bytedance.android.livesdk.browser.jsbridge;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.a;
import com.bytedance.ies.f.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9484a;

    /* renamed from: b  reason: collision with root package name */
    static final c.b f9485b = new i();

    private i() {
    }

    public final c a() {
        Object aVar;
        if (PatchProxy.isSupport(new Object[0], this, f9484a, false, 3609, new Class[0], c.class)) {
            aVar = PatchProxy.accessDispatch(new Object[0], this, f9484a, false, 3609, new Class[0], c.class);
        } else {
            aVar = new a();
        }
        return (c) aVar;
    }
}
