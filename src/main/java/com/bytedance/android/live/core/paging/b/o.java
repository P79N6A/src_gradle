package com.bytedance.android.live.core.paging.b;

import android.arch.paging.PageKeyedDataSource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7964a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7965b;

    /* renamed from: c  reason: collision with root package name */
    private final PageKeyedDataSource.LoadParams f7966c;

    /* renamed from: d  reason: collision with root package name */
    private final PageKeyedDataSource.LoadCallback f7967d;

    o(c cVar, PageKeyedDataSource.LoadParams loadParams, PageKeyedDataSource.LoadCallback loadCallback) {
        this.f7965b = cVar;
        this.f7966c = loadParams;
        this.f7967d = loadCallback;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f7964a, false, 578, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f7964a, false, 578, new Class[0], Void.TYPE);
            return;
        }
        this.f7965b.loadAfter(this.f7966c, this.f7967d);
    }
}
