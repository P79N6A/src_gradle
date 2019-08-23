package com.bytedance.android.live.core.rxutils.autodispose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;

public final class r<T> extends Single<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8068a;

    /* renamed from: b  reason: collision with root package name */
    private final SingleSource<T> f8069b;

    /* renamed from: c  reason: collision with root package name */
    private final CompletableSource f8070c;

    public final void subscribeActual(SingleObserver<? super T> singleObserver) {
        if (PatchProxy.isSupport(new Object[]{singleObserver}, this, f8068a, false, 746, new Class[]{SingleObserver.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{singleObserver}, this, f8068a, false, 746, new Class[]{SingleObserver.class}, Void.TYPE);
            return;
        }
        this.f8069b.subscribe(new v(this.f8070c, singleObserver));
    }

    r(SingleSource<T> singleSource, CompletableSource completableSource) {
        this.f8069b = singleSource;
        this.f8070c = completableSource;
    }
}
