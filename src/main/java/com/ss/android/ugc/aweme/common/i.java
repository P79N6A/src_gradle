package com.ss.android.ugc.aweme.common;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.login.LoginUtils;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40228a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f40229b;

    i(Bundle bundle) {
        this.f40229b = bundle;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40228a, false, 33270, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40228a, false, 33270, new Class[0], Void.TYPE);
            return;
        }
        LoginUtils.b(this.f40229b);
    }
}
