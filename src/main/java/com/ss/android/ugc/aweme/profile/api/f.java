package com.ss.android.ugc.aweme.profile.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61338a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61339b;

    f(String str) {
        this.f61339b = str;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f61338a, false, 67463, new Class[0], Object.class)) {
            return d.a(this.f61339b, true, null);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f61338a, false, 67463, new Class[0], Object.class);
    }
}
