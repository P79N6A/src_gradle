package com.ss.android.ugc.aweme.feed.h;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45497a;

    /* renamed from: b  reason: collision with root package name */
    private final g f45498b;

    i(g gVar) {
        this.f45498b = gVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f45497a, false, 42036, new Class[0], Object.class)) {
            return this.f45498b.b();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f45497a, false, 42036, new Class[0], Object.class);
    }
}
