package com.ss.android.ugc.aweme.login;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53767a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f53768b;

    i(Bundle bundle) {
        this.f53768b = bundle;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f53767a, false, 56373, new Class[0], Object.class)) {
            return LoginUtils.c(this.f53768b);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f53767a, false, 56373, new Class[0], Object.class);
    }
}
