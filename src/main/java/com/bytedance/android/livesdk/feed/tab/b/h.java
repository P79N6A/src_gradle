package com.bytedance.android.livesdk.feed.tab.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.ObservableEmitter;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14419a;

    /* renamed from: b  reason: collision with root package name */
    private final ObservableEmitter f14420b;

    h(ObservableEmitter observableEmitter) {
        this.f14420b = observableEmitter;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14419a, false, 8922, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14419a, false, 8922, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ObservableEmitter observableEmitter = this.f14420b;
        observableEmitter.onNext((List) obj);
        observableEmitter.onComplete();
    }
}
