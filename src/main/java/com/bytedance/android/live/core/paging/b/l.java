package com.bytedance.android.live.core.paging.b;

import android.arch.paging.PageKeyedDataSource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class l implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7953a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7954b;

    /* renamed from: c  reason: collision with root package name */
    private final PageKeyedDataSource.LoadInitialParams f7955c;

    /* renamed from: d  reason: collision with root package name */
    private final PageKeyedDataSource.LoadInitialCallback f7956d;

    l(c cVar, PageKeyedDataSource.LoadInitialParams loadInitialParams, PageKeyedDataSource.LoadInitialCallback loadInitialCallback) {
        this.f7954b = cVar;
        this.f7955c = loadInitialParams;
        this.f7956d = loadInitialCallback;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7953a, false, 575, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f7953a, false, 575, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f7954b.a(this.f7955c, this.f7956d, (Throwable) obj);
    }
}
