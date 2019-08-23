package com.bytedance.android.livesdk.feed.tab.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.ObservableEmitter;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class i implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14421a;

    /* renamed from: b  reason: collision with root package name */
    private final ObservableEmitter f14422b;

    i(ObservableEmitter observableEmitter) {
        this.f14422b = observableEmitter;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14421a, false, 8923, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14421a, false, 8923, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14422b.onComplete();
    }
}
