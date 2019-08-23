package com.bytedance.android.live.core.rxutils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8093a;

    /* renamed from: b  reason: collision with root package name */
    private final a f8094b;

    c(a aVar) {
        this.f8094b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f8093a, false, 618, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f8093a, false, 618, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f8094b.f7993b.add((Disposable) obj);
    }
}
