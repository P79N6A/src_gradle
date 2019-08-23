package com.bytedance.retrofit2.rxjava2.adapter;

import com.bytedance.retrofit2.SsResponse;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

public final class a<T> extends Observable<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Observable<SsResponse<T>> f21943a;

    /* renamed from: com.bytedance.retrofit2.rxjava2.adapter.a$a  reason: collision with other inner class name */
    static class C0226a<R> implements Observer<SsResponse<R>> {

        /* renamed from: a  reason: collision with root package name */
        private final Observer<? super R> f21944a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f21945b;

        public final void onComplete() {
            if (!this.f21945b) {
                this.f21944a.onComplete();
            }
        }

        C0226a(Observer<? super R> observer) {
            this.f21944a = observer;
        }

        public final void onSubscribe(Disposable disposable) {
            this.f21944a.onSubscribe(disposable);
        }

        public final void onError(Throwable th) {
            if (!this.f21945b) {
                this.f21944a.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            RxJavaPlugins.onError(assertionError);
        }

        public final /* synthetic */ void onNext(Object obj) {
            SsResponse ssResponse = (SsResponse) obj;
            if (ssResponse.isSuccessful()) {
                this.f21944a.onNext(ssResponse.body());
                return;
            }
            this.f21945b = true;
            d dVar = new d(ssResponse);
            try {
                this.f21944a.onError(dVar);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(new CompositeException(dVar, th));
            }
        }
    }

    a(Observable<SsResponse<T>> observable) {
        this.f21943a = observable;
    }

    public final void subscribeActual(Observer<? super T> observer) {
        this.f21943a.subscribe((Observer<? super T>) new C0226a<Object>(observer));
    }
}
