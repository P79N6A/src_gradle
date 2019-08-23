package com.ss.android.ugc.aweme.common;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.util.a;

public final /* synthetic */ class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40207a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f40208b;

    e(Bundle bundle) {
        this.f40208b = bundle;
    }

    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f40207a, false, 33266, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f40207a, false, 33266, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        BridgeService.lambda$getAfterLoginActions$2$BridgeService(this.f40208b, bundle2);
    }
}
