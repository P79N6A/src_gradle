package com.bytedance.android.live.core.rxutils.autodispose;

import com.bytedance.android.live.core.rxutils.autodispose.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.CompletableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableCompletableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class u<T> extends AtomicInteger implements b<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Observer<? super T> delegate;
    private final c error = new c();
    final AtomicReference<Disposable> mainDisposable = new AtomicReference<>();
    private final CompletableSource scope;
    final AtomicReference<Disposable> scopeDisposable = new AtomicReference<>();

    public final Observer<? super T> delegateObserver() {
        return this.delegate;
    }

    public final void dispose() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 765, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 765, new Class[0], Void.TYPE);
            return;
        }
        d.dispose(this.scopeDisposable);
        d.dispose(this.mainDisposable);
    }

    public final boolean isDisposed() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 764, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 764, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mainDisposable.get() == d.DISPOSED) {
            z = true;
        }
        return z;
    }

    public final void onComplete() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 768, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 768, new Class[0], Void.TYPE);
            return;
        }
        if (!isDisposed()) {
            this.mainDisposable.lazySet(d.DISPOSED);
            d.dispose(this.scopeDisposable);
            Observer<? super T> observer = this.delegate;
            c cVar = this.error;
            if (PatchProxy.isSupport(new Object[]{observer, this, cVar}, null, z.f8090a, true, 808, new Class[]{Observer.class, AtomicInteger.class, c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{observer, this, cVar}, null, z.f8090a, true, 808, new Class[]{Observer.class, AtomicInteger.class, c.class}, Void.TYPE);
            } else if (getAndIncrement() == 0) {
                Throwable terminate = cVar.terminate();
                if (terminate != null) {
                    observer.onError(terminate);
                    return;
                }
                observer.onComplete();
            }
        }
    }

    public final void onSubscribe(Disposable disposable) {
        if (PatchProxy.isSupport(new Object[]{disposable}, this, changeQuickRedirect, false, 763, new Class[]{Disposable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{disposable}, this, changeQuickRedirect, false, 763, new Class[]{Disposable.class}, Void.TYPE);
            return;
        }
        AnonymousClass1 r0 = new DisposableCompletableObserver() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8079a;

            public final void onComplete() {
                if (PatchProxy.isSupport(new Object[0], this, f8079a, false, 770, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f8079a, false, 770, new Class[0], Void.TYPE);
                    return;
                }
                u.this.scopeDisposable.lazySet(d.DISPOSED);
                d.dispose(u.this.mainDisposable);
            }

            public final void onError(Throwable th) {
                if (PatchProxy.isSupport(new Object[]{th}, this, f8079a, false, 769, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th}, this, f8079a, false, 769, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                u.this.scopeDisposable.lazySet(d.DISPOSED);
                u.this.onError(th);
            }
        };
        if (n.a(this.scopeDisposable, r0, getClass())) {
            this.delegate.onSubscribe(this);
            this.scope.subscribe(r0);
            n.a(this.mainDisposable, disposable, getClass());
        }
    }

    public final void onError(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, changeQuickRedirect, false, 767, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, changeQuickRedirect, false, 767, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        if (!isDisposed()) {
            this.mainDisposable.lazySet(d.DISPOSED);
            d.dispose(this.scopeDisposable);
            Observer<? super T> observer = this.delegate;
            c cVar = this.error;
            if (PatchProxy.isSupport(new Object[]{observer, th2, this, cVar}, null, z.f8090a, true, 807, new Class[]{Observer.class, Throwable.class, AtomicInteger.class, c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{observer, th2, this, cVar}, null, z.f8090a, true, 807, new Class[]{Observer.class, Throwable.class, AtomicInteger.class, c.class}, Void.TYPE);
            } else if (!cVar.addThrowable(th2)) {
                RxJavaPlugins.onError(th);
            } else if (getAndIncrement() == 0) {
                observer.onError(cVar.terminate());
            }
        }
    }

    public final void onNext(T t) {
        T t2 = t;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{t2}, this, changeQuickRedirect, false, 766, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t2}, this, changeQuickRedirect, false, 766, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        if (!isDisposed()) {
            Observer<? super T> observer = this.delegate;
            c cVar = this.error;
            if (PatchProxy.isSupport(new Object[]{observer, t2, this, cVar}, null, z.f8090a, true, 806, new Class[]{Observer.class, Object.class, AtomicInteger.class, c.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{observer, t2, this, cVar}, null, z.f8090a, true, 806, new Class[]{Observer.class, Object.class, AtomicInteger.class, c.class}, Boolean.TYPE)).booleanValue();
            } else {
                if (get() == 0 && compareAndSet(0, 1)) {
                    observer.onNext(t2);
                    if (decrementAndGet() != 0) {
                        Throwable terminate = cVar.terminate();
                        if (terminate != null) {
                            observer.onError(terminate);
                        } else {
                            observer.onComplete();
                        }
                    }
                }
                z = false;
            }
            if (z) {
                this.mainDisposable.lazySet(d.DISPOSED);
                d.dispose(this.scopeDisposable);
            }
        }
    }

    u(CompletableSource completableSource, Observer<? super T> observer) {
        this.scope = completableSource;
        this.delegate = observer;
    }
}
