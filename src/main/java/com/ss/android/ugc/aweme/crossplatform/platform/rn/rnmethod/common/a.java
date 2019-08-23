package com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common;

import com.facebook.react.bridge.Callback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40932a;

    /* renamed from: b  reason: collision with root package name */
    private final String f40933b;

    /* renamed from: c  reason: collision with root package name */
    private final Callback f40934c;

    a(String str, Callback callback) {
        this.f40933b = str;
        this.f40934c = callback;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40932a, false, 34392, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40932a, false, 34392, new Class[0], Void.TYPE);
            return;
        }
        ReactCommonModule.lambda$close$0$ReactCommonModule(this.f40933b, this.f40934c);
    }
}
