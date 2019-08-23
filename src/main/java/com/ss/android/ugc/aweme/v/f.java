package com.ss.android.ugc.aweme.v;

import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ttnet.org.chromium.base.ContextUtils;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75996a;

    /* renamed from: b  reason: collision with root package name */
    private final String f75997b;

    f(String str) {
        this.f75997b = str;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f75996a, false, 59767, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75996a, false, 59767, new Class[0], Void.TYPE);
            return;
        }
        a.b(ContextUtils.getApplicationContext(), this.f75997b).a();
    }
}
