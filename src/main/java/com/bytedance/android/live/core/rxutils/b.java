package com.bytedance.android.live.core.rxutils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8091a;

    /* renamed from: b  reason: collision with root package name */
    private final a f8092b;

    b(a aVar) {
        this.f8092b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f8091a, false, 617, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f8091a, false, 617, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f8092b.f7993b.add((Disposable) obj);
    }
}
