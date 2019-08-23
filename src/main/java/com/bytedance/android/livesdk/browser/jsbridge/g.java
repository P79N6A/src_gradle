package com.bytedance.android.livesdk.browser.jsbridge;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.af;
import com.bytedance.ies.f.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9480a;

    /* renamed from: b  reason: collision with root package name */
    static final c.b f9481b = new g();

    private g() {
    }

    public final c a() {
        Object afVar;
        if (PatchProxy.isSupport(new Object[0], this, f9480a, false, 3607, new Class[0], c.class)) {
            afVar = PatchProxy.accessDispatch(new Object[0], this, f9480a, false, 3607, new Class[0], c.class);
        } else {
            afVar = new af();
        }
        return (c) afVar;
    }
}
