package com.ss.android.ugc.aweme.store;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.store.e;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71764a;

    /* renamed from: b  reason: collision with root package name */
    private final e.a f71765b;

    f(e.a aVar) {
        this.f71765b = aVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f71764a, false, 82135, new Class[0], Object.class)) {
            return this.f71765b.a();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f71764a, false, 82135, new Class[0], Object.class);
    }
}
