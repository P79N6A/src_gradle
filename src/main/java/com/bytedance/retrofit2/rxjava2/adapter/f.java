package com.bytedance.retrofit2.rxjava2.adapter;

import com.bytedance.retrofit2.SsResponse;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

public final class f<T> extends Observable<e<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final Observable<SsResponse<T>> f21955a;

    static class a<R> implements Observer<SsResponse<R>> {

        /* renamed from: a  reason: collision with root package name */
        private final Observer<? super e<R>> f21956a;

        public final void onComplete() {
            this.f21956a.onComplete();
        }

        a(Observer<? super e<R>> observer) {
            this.f21956a = observer;
        }

        public final void onSubscribe(Disposable disposable) {
            this.f21956a.onSubscribe(disposable);
        }

        public final /* synthetic */ void onNext(Object obj) {
            SsResponse ssResponse = (SsResponse) obj;
            Observer<? super e<R>> observer = this.f21956a;
            if (ssResponse != null) {
                observer.onNext(new e(ssResponse, null));
                return;
            }
            throw new NullPointerException("response == null");
        }

        public final void onError(Throwable th) {
            try {
                Observer<? super e<R>> observer = this.f21956a;
                if (th != null) {
                    observer.onNext(new e(null, th));
                    this.f21956a.onComplete();
                    return;
                }
                throw new NullPointerException("error == null");
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(new CompositeException(th, th2));
            }
        }
    }

    f(Observable<SsResponse<T>> observable) {
        this.f21955a = observable;
    }

    public final void subscribeActual(Observer<? super e<T>> observer) {
        this.f21955a.subscribe((Observer<? super T>) new a<Object>(observer));
    }
}
