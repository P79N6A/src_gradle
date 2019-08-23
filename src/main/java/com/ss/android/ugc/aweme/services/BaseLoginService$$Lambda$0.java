package com.ss.android.ugc.aweme.services;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class BaseLoginService$$Lambda$0 implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final BaseLoginService arg$1;
    private final boolean arg$2;

    BaseLoginService$$Lambda$0(BaseLoginService baseLoginService, boolean z) {
        this.arg$1 = baseLoginService;
        this.arg$2 = z;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71353, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71353, new Class[0], Void.TYPE);
            return;
        }
        this.arg$1.lambda$retryLogin$0$BaseLoginService(this.arg$2);
    }
}
