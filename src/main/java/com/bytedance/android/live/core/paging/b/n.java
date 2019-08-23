package com.bytedance.android.live.core.paging.b;

import android.arch.paging.PageKeyedDataSource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class n implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7960a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7961b;

    /* renamed from: c  reason: collision with root package name */
    private final PageKeyedDataSource.LoadParams f7962c;

    /* renamed from: d  reason: collision with root package name */
    private final PageKeyedDataSource.LoadCallback f7963d;

    n(c cVar, PageKeyedDataSource.LoadParams loadParams, PageKeyedDataSource.LoadCallback loadCallback) {
        this.f7961b = cVar;
        this.f7962c = loadParams;
        this.f7963d = loadCallback;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7960a, false, 577, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f7960a, false, 577, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f7961b.a(this.f7962c, this.f7963d, (Throwable) obj);
    }
}
