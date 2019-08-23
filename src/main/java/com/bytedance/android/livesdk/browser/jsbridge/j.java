package com.bytedance.android.livesdk.browser.jsbridge;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.o;
import com.bytedance.ies.f.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9486a;

    /* renamed from: b  reason: collision with root package name */
    static final c.b f9487b = new j();

    private j() {
    }

    public final c a() {
        Object oVar;
        if (PatchProxy.isSupport(new Object[0], this, f9486a, false, 3610, new Class[0], c.class)) {
            oVar = PatchProxy.accessDispatch(new Object[0], this, f9486a, false, 3610, new Class[0], c.class);
        } else {
            oVar = new o();
        }
        return (c) oVar;
    }
}
