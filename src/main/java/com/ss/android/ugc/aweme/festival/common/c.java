package com.ss.android.ugc.aweme.festival.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47299a;

    /* renamed from: b  reason: collision with root package name */
    private final b f47300b;

    c(b bVar) {
        this.f47300b = bVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f47299a, false, 43962, new Class[0], Object.class)) {
            return null;
        }
        return PatchProxy.accessDispatch(new Object[0], this, f47299a, false, 43962, new Class[0], Object.class);
    }
}
