package com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40940a;

    /* renamed from: b  reason: collision with root package name */
    private final ReadableMap f40941b;

    /* renamed from: c  reason: collision with root package name */
    private final Callback f40942c;

    b(ReadableMap readableMap, Callback callback) {
        this.f40941b = readableMap;
        this.f40942c = callback;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40940a, false, 34393, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40940a, false, 34393, new Class[0], Void.TYPE);
            return;
        }
        ReactCommonModule.lambda$share$1$ReactCommonModule(this.f40941b, this.f40942c);
    }
}
