package com.ss.android.ugc.aweme.account.util;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class u implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33118a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f33119b;

    u(Bundle bundle) {
        this.f33119b = bundle;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f33118a, false, 21452, new Class[0], Object.class)) {
            return r.c(this.f33119b);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f33118a, false, 21452, new Class[0], Object.class);
    }
}
