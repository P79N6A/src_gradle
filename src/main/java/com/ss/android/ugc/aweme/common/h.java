package com.ss.android.ugc.aweme.common;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40218a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f40219b;

    h(Context context) {
        this.f40219b = context;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f40218a, false, 33269, new Class[0], Object.class)) {
            return BridgeService.lambda$initMiniAppInDeeplink$6$BridgeService(this.f40219b);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f40218a, false, 33269, new Class[0], Object.class);
    }
}
