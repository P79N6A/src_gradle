package com.bytedance.android.livesdk.browser.jsbridge;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.y;
import com.bytedance.ies.f.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9488a;

    /* renamed from: b  reason: collision with root package name */
    static final c.b f9489b = new k();

    private k() {
    }

    public final c a() {
        Object yVar;
        if (PatchProxy.isSupport(new Object[0], this, f9488a, false, 3611, new Class[0], c.class)) {
            yVar = PatchProxy.accessDispatch(new Object[0], this, f9488a, false, 3611, new Class[0], c.class);
        } else {
            yVar = new y();
        }
        return (c) yVar;
    }
}
