package com.bytedance.android.live.core.paging.b;

import android.arch.paging.PageKeyedDataSource;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class m implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7957a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7958b;

    /* renamed from: c  reason: collision with root package name */
    private final PageKeyedDataSource.LoadCallback f7959c;

    m(c cVar, PageKeyedDataSource.LoadCallback loadCallback) {
        this.f7958b = cVar;
        this.f7959c = loadCallback;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f7957a, false, 576, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f7957a, false, 576, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f7958b.a(this.f7959c, (Pair) obj);
    }
}
