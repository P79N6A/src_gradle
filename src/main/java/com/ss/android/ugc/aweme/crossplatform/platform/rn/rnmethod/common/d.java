package com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40946a;

    /* renamed from: b  reason: collision with root package name */
    private final String f40947b;

    d(String str) {
        this.f40947b = str;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40946a, false, 34395, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40946a, false, 34395, new Class[0], Void.TYPE);
            return;
        }
        ReactCommonModule.lambda$componentDidMount$3$ReactCommonModule(this.f40947b);
    }
}
