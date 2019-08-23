package com.bytedance.android.livesdk.feed.tab.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.util.ArrayList;

public final /* synthetic */ class l implements ObservableOnSubscribe {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14430a;

    /* renamed from: b  reason: collision with root package name */
    private final k f14431b;

    l(k kVar) {
        this.f14431b = kVar;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        ObservableEmitter observableEmitter2 = observableEmitter;
        if (PatchProxy.isSupport(new Object[]{observableEmitter2}, this, f14430a, false, 8937, new Class[]{ObservableEmitter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observableEmitter2}, this, f14430a, false, 8937, new Class[]{ObservableEmitter.class}, Void.TYPE);
            return;
        }
        k kVar = this.f14431b;
        kVar.c();
        if (k.b(kVar.f14424b)) {
            observableEmitter2.onNext(new ArrayList(kVar.f14424b));
            observableEmitter.onComplete();
            return;
        }
        observableEmitter2.onError(new IllegalStateException("tab list wrong"));
    }
}
