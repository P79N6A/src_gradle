package com.bytedance.android.livesdk.feed.tab.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

public final /* synthetic */ class b implements ObservableOnSubscribe {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14407a;

    /* renamed from: b  reason: collision with root package name */
    private final a f14408b;

    b(a aVar) {
        this.f14408b = aVar;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        ObservableEmitter observableEmitter2 = observableEmitter;
        if (PatchProxy.isSupport(new Object[]{observableEmitter2}, this, f14407a, false, 8916, new Class[]{ObservableEmitter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observableEmitter2}, this, f14407a, false, 8916, new Class[]{ObservableEmitter.class}, Void.TYPE);
            return;
        }
        this.f14408b.f14405b.a().subscribe(new h(observableEmitter2), new i(observableEmitter2));
    }
}
