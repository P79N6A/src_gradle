package com.bytedance.android.live.core.paging.b;

import android.arch.paging.PageKeyedDataSource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7940a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7941b;

    /* renamed from: c  reason: collision with root package name */
    private final PageKeyedDataSource.LoadInitialParams f7942c;

    /* renamed from: d  reason: collision with root package name */
    private final PageKeyedDataSource.LoadInitialCallback f7943d;

    g(c cVar, PageKeyedDataSource.LoadInitialParams loadInitialParams, PageKeyedDataSource.LoadInitialCallback loadInitialCallback) {
        this.f7941b = cVar;
        this.f7942c = loadInitialParams;
        this.f7943d = loadInitialCallback;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f7940a, false, 571, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f7940a, false, 571, new Class[0], Void.TYPE);
            return;
        }
        this.f7941b.loadInitial(this.f7942c, this.f7943d);
    }
}
