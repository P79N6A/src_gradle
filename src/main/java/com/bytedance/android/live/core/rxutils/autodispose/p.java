package com.bytedance.android.live.core.rxutils.autodispose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;

public final class p<T> extends Observable<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8063a;

    /* renamed from: b  reason: collision with root package name */
    private final ObservableSource<T> f8064b;

    /* renamed from: c  reason: collision with root package name */
    private final CompletableSource f8065c;

    public final void subscribeActual(Observer<? super T> observer) {
        if (PatchProxy.isSupport(new Object[]{observer}, this, f8063a, false, 740, new Class[]{Observer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observer}, this, f8063a, false, 740, new Class[]{Observer.class}, Void.TYPE);
            return;
        }
        this.f8064b.subscribe(new u(this.f8065c, observer));
    }

    p(ObservableSource<T> observableSource, CompletableSource completableSource) {
        this.f8064b = observableSource;
        this.f8065c = completableSource;
    }
}
