package com.ss.android.ugc.aweme.login;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53765a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f53766b;

    h(Bundle bundle) {
        this.f53766b = bundle;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f53765a, false, 56372, new Class[0], Object.class)) {
            return LoginUtils.d(this.f53766b);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f53765a, false, 56372, new Class[0], Object.class);
    }
}
