package com.bytedance.android.livesdk.feed.tab.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.ObservableEmitter;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class g implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14417a;

    /* renamed from: b  reason: collision with root package name */
    private final ObservableEmitter f14418b;

    g(ObservableEmitter observableEmitter) {
        this.f14418b = observableEmitter;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14417a, false, 8921, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14417a, false, 8921, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14418b.onComplete();
    }
}
