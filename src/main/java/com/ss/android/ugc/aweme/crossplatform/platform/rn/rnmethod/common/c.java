package com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40943a;

    /* renamed from: b  reason: collision with root package name */
    private final String f40944b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f40945c;

    c(String str, Boolean bool) {
        this.f40944b = str;
        this.f40945c = bool;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40943a, false, 34394, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40943a, false, 34394, new Class[0], Void.TYPE);
            return;
        }
        ReactCommonModule.lambda$darkMode$2$ReactCommonModule(this.f40944b, this.f40945c);
    }
}
