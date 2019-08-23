package com.bytedance.android.live.core.paging.b;

import android.arch.paging.PageKeyedDataSource;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class k implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7950a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7951b;

    /* renamed from: c  reason: collision with root package name */
    private final PageKeyedDataSource.LoadInitialCallback f7952c;

    k(c cVar, PageKeyedDataSource.LoadInitialCallback loadInitialCallback) {
        this.f7951b = cVar;
        this.f7952c = loadInitialCallback;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7950a, false, 574, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f7950a, false, 574, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f7951b.a(this.f7952c, (Pair) obj);
    }
}
