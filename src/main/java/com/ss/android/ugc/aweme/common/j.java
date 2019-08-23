package com.ss.android.ugc.aweme.common;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;

public final /* synthetic */ class j implements IAccountService.h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40230a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f40231b;

    j(Bundle bundle) {
        this.f40231b = bundle;
    }

    public final void a(int i, int i2, Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, f40230a, false, 33271, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, f40230a, false, 33271, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        BridgeService.lambda$null$1$BridgeService(this.f40231b, i, i2, obj2);
    }
}
