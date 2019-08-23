package com.bytedance.android.live.core.rxutils.autodispose;

import com.bytedance.android.live.core.rxutils.autodispose.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.CompletableSource;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableCompletableObserver;
import java.util.concurrent.atomic.AtomicReference;

public final class t<T> implements a<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8072a;

    /* renamed from: b  reason: collision with root package name */
    final AtomicReference<Disposable> f8073b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<Disposable> f8074c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private final CompletableSource f8075d;

    /* renamed from: e  reason: collision with root package name */
    private final MaybeObserver<? super T> f8076e;

    public final void dispose() {
        if (PatchProxy.isSupport(new Object[0], this, f8072a, false, 757, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8072a, false, 757, new Class[0], Void.TYPE);
            return;
        }
        d.dispose(this.f8074c);
        d.dispose(this.f8073b);
    }

    public final boolean isDisposed() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f8072a, false, 756, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f8072a, false, 756, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f8073b.get() == d.DISPOSED) {
            z = true;
        }
        return z;
    }

    public final void onComplete() {
        if (PatchProxy.isSupport(new Object[0], this, f8072a, false, 760, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8072a, false, 760, new Class[0], Void.TYPE);
            return;
        }
        if (!isDisposed()) {
            this.f8073b.lazySet(d.DISPOSED);
            d.dispose(this.f8074c);
            this.f8076e.onComplete();
        }
    }

    public final void onError(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f8072a, false, 759, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f8072a, false, 759, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        if (!isDisposed()) {
            this.f8073b.lazySet(d.DISPOSED);
            d.dispose(this.f8074c);
            this.f8076e.onError(th);
        }
    }

    public final void onSubscribe(Disposable disposable) {
        if (PatchProxy.isSupport(new Object[]{disposable}, this, f8072a, false, 755, new Class[]{Disposable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{disposable}, this, f8072a, false, 755, new Class[]{Disposable.class}, Void.TYPE);
            return;
        }
        AnonymousClass1 r0 = new DisposableCompletableObserver() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8077a;

            public final void onComplete() {
                if (PatchProxy.isSupport(new Object[0], this, f8077a, false, 762, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f8077a, false, 762, new Class[0], Void.TYPE);
                    return;
                }
                t.this.f8074c.lazySet(d.DISPOSED);
                d.dispose(t.this.f8073b);
            }

            public final void onError(Throwable th) {
                if (PatchProxy.isSupport(new Object[]{th}, this, f8077a, false, 761, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th}, this, f8077a, false, 761, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                t.this.f8074c.lazySet(d.DISPOSED);
                t.this.onError(th);
            }
        };
        if (n.a(this.f8074c, r0, getClass())) {
            this.f8076e.onSubscribe(this);
            this.f8075d.subscribe(r0);
            n.a(this.f8073b, disposable, getClass());
        }
    }

    public final void onSuccess(T t) {
        if (PatchProxy.isSupport(new Object[]{t}, this, f8072a, false, 758, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t}, this, f8072a, false, 758, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        if (!isDisposed()) {
            this.f8073b.lazySet(d.DISPOSED);
            d.dispose(this.f8074c);
            this.f8076e.onSuccess(t);
        }
    }

    t(CompletableSource completableSource, MaybeObserver<? super T> maybeObserver) {
        this.f8075d = completableSource;
        this.f8076e = maybeObserver;
    }
}
