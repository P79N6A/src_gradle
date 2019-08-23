package com.ss.android.ugc.aweme.common;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.util.a;

public final /* synthetic */ class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40215a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f40216b;

    g(Bundle bundle) {
        this.f40216b = bundle;
    }

    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f40215a, false, 33268, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f40215a, false, 33268, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        BridgeService.lambda$getAfterLoginActions$5$BridgeService(this.f40216b, bundle2);
    }
}
