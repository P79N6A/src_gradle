package com.bytedance.android.livesdk.browser.jsbridge;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.j;
import com.bytedance.ies.f.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9482a;

    /* renamed from: b  reason: collision with root package name */
    static final c.b f9483b = new h();

    private h() {
    }

    public final c a() {
        Object jVar;
        if (PatchProxy.isSupport(new Object[0], this, f9482a, false, 3608, new Class[0], c.class)) {
            jVar = PatchProxy.accessDispatch(new Object[0], this, f9482a, false, 3608, new Class[0], c.class);
        } else {
            jVar = new j();
        }
        return (c) jVar;
    }
}
