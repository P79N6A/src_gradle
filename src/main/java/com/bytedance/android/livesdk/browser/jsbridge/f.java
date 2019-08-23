package com.bytedance.android.livesdk.browser.jsbridge;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.s;
import com.bytedance.ies.f.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9478a;

    /* renamed from: b  reason: collision with root package name */
    static final c.b f9479b = new f();

    private f() {
    }

    public final c a() {
        Object sVar;
        if (PatchProxy.isSupport(new Object[0], this, f9478a, false, 3606, new Class[0], c.class)) {
            sVar = PatchProxy.accessDispatch(new Object[0], this, f9478a, false, 3606, new Class[0], c.class);
        } else {
            sVar = new s();
        }
        return (c) sVar;
    }
}
