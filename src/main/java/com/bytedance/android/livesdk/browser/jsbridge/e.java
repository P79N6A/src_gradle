package com.bytedance.android.livesdk.browser.jsbridge;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.h;
import com.bytedance.ies.f.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9476a;

    /* renamed from: b  reason: collision with root package name */
    static final c.b f9477b = new e();

    private e() {
    }

    public final c a() {
        Object hVar;
        if (PatchProxy.isSupport(new Object[0], this, f9476a, false, 3605, new Class[0], c.class)) {
            hVar = PatchProxy.accessDispatch(new Object[0], this, f9476a, false, 3605, new Class[0], c.class);
        } else {
            hVar = new h();
        }
        return (c) hVar;
    }
}
