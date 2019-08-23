package com.ss.android.ugc.aweme.newfollow.f;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57145a;

    /* renamed from: b  reason: collision with root package name */
    private final g f57146b;

    h(g gVar) {
        this.f57146b = gVar;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f57145a, false, 61310, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f57145a, false, 61310, new Class[0], Object.class);
        }
        g gVar = this.f57146b;
        if (gVar.f57134c != null) {
            return gVar.f57134c.c();
        }
        return null;
    }
}
