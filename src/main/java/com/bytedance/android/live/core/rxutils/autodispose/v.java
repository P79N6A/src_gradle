package com.bytedance.android.live.core.rxutils.autodispose;

import com.bytedance.android.live.core.rxutils.autodispose.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.CompletableSource;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableCompletableObserver;
import java.util.concurrent.atomic.AtomicReference;

public final class v<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8081a;

    /* renamed from: b  reason: collision with root package name */
    final AtomicReference<Disposable> f8082b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<Disposable> f8083c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private final CompletableSource f8084d;

    /* renamed from: e  reason: collision with root package name */
    private final SingleObserver<? super T> f8085e;

    public final void dispose() {
        if (PatchProxy.isSupport(new Object[0], this, f8081a, false, 773, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8081a, false, 773, new Class[0], Void.TYPE);
            return;
        }
        d.dispose(this.f8083c);
        d.dispose(this.f8082b);
    }

    public final boolean isDisposed() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f8081a, false, 772, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f8081a, false, 772, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f8082b.get() == d.DISPOSED) {
            z = true;
        }
        return z;
    }

    public final void onError(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f8081a, false, 775, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f8081a, false, 775, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        if (!isDisposed()) {
            this.f8082b.lazySet(d.DISPOSED);
            d.dispose(this.f8083c);
            this.f8085e.onError(th);
        }
    }

    public final void onSubscribe(Disposable disposable) {
        if (PatchProxy.isSupport(new Object[]{disposable}, this, f8081a, false, 771, new Class[]{Disposable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{disposable}, this, f8081a, false, 771, new Class[]{Disposable.class}, Void.TYPE);
            return;
        }
        AnonymousClass1 r0 = new DisposableCompletableObserver() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8086a;

            public final void onComplete() {
                if (PatchProxy.isSupport(new Object[0], this, f8086a, false, 777, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f8086a, false, 777, new Class[0], Void.TYPE);
                    return;
                }
                v.this.f8083c.lazySet(d.DISPOSED);
                d.dispose(v.this.f8082b);
            }

            public final void onError(Throwable th) {
                if (PatchProxy.isSupport(new Object[]{th}, this, f8086a, false, 776, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th}, this, f8086a, false, 776, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                v.this.f8083c.lazySet(d.DISPOSED);
                v.this.onError(th);
            }
        };
        if (n.a(this.f8083c, r0, getClass())) {
            this.f8085e.onSubscribe(this);
            this.f8084d.subscribe(r0);
            n.a(this.f8082b, disposable, getClass());
        }
    }

    public final void onSuccess(T t) {
        if (PatchProxy.isSupport(new Object[]{t}, this, f8081a, false, 774, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t}, this, f8081a, false, 774, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        if (!isDisposed()) {
            this.f8082b.lazySet(d.DISPOSED);
            d.dispose(this.f8083c);
            this.f8085e.onSuccess(t);
        }
    }

    v(CompletableSource completableSource, SingleObserver<? super T> singleObserver) {
        this.f8084d = completableSource;
        this.f8085e = singleObserver;
    }
}
