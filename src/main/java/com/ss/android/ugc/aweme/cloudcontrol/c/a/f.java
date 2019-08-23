package com.ss.android.ugc.aweme.cloudcontrol.c.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36242a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f36243b = new f();

    private f() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f36242a, false, 27073, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36242a, false, 27073, new Class[0], Void.TYPE);
            return;
        }
        h.a().a("aweme://test_setting");
    }
}
