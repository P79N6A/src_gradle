package com.bytedance.android.live.core.rxutils.autodispose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;

public final class o<T> extends Maybe<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8060a;

    /* renamed from: b  reason: collision with root package name */
    private final MaybeSource<T> f8061b;

    /* renamed from: c  reason: collision with root package name */
    private final CompletableSource f8062c;

    public final void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        if (PatchProxy.isSupport(new Object[]{maybeObserver}, this, f8060a, false, 739, new Class[]{MaybeObserver.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{maybeObserver}, this, f8060a, false, 739, new Class[]{MaybeObserver.class}, Void.TYPE);
            return;
        }
        this.f8061b.subscribe(new t(this.f8062c, maybeObserver));
    }

    o(MaybeSource<T> maybeSource, CompletableSource completableSource) {
        this.f8061b = maybeSource;
        this.f8062c = completableSource;
    }
}
