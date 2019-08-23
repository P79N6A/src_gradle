package com.bytedance.android.livesdk.feed.tab.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

public final /* synthetic */ class c implements ObservableOnSubscribe {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14409a;

    /* renamed from: b  reason: collision with root package name */
    private final a f14410b;

    c(a aVar) {
        this.f14410b = aVar;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        ObservableEmitter observableEmitter2 = observableEmitter;
        if (PatchProxy.isSupport(new Object[]{observableEmitter2}, this, f14409a, false, 8917, new Class[]{ObservableEmitter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observableEmitter2}, this, f14409a, false, 8917, new Class[]{ObservableEmitter.class}, Void.TYPE);
            return;
        }
        a aVar = this.f14410b;
        aVar.f14406c.a().map(new e(aVar)).subscribe(new f(observableEmitter2), new g(observableEmitter2));
    }
}
