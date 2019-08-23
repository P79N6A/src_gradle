package com.bytedance.android.livesdk.browser.jsbridge;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ab;
import com.bytedance.ies.f.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9474a;

    /* renamed from: b  reason: collision with root package name */
    static final c.b f9475b = new d();

    private d() {
    }

    public final c a() {
        Object abVar;
        if (PatchProxy.isSupport(new Object[0], this, f9474a, false, 3604, new Class[0], c.class)) {
            abVar = PatchProxy.accessDispatch(new Object[0], this, f9474a, false, 3604, new Class[0], c.class);
        } else {
            abVar = new ab();
        }
        return (c) abVar;
    }
}
