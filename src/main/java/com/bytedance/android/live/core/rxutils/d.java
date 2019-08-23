package com.bytedance.android.live.core.rxutils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8095a;

    /* renamed from: b  reason: collision with root package name */
    private final a f8096b;

    d(a aVar) {
        this.f8096b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f8095a, false, 619, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f8095a, false, 619, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f8096b.f7993b.add((Disposable) obj);
    }
}
