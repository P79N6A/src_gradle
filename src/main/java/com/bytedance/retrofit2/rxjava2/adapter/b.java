package com.bytedance.retrofit2.rxjava2.adapter;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.c;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

public final class b<T> extends Observable<SsResponse<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final Call<T> f21946a;

    static final class a<T> implements c<T>, Disposable {

        /* renamed from: a  reason: collision with root package name */
        boolean f21947a;

        /* renamed from: b  reason: collision with root package name */
        private final Call<?> f21948b;

        /* renamed from: c  reason: collision with root package name */
        private final Observer<? super SsResponse<T>> f21949c;

        public final void dispose() {
            this.f21948b.cancel();
        }

        public final boolean isDisposed() {
            return this.f21948b.isCanceled();
        }

        a(Call<?> call, Observer<? super SsResponse<T>> observer) {
            this.f21948b = call;
            this.f21949c = observer;
        }

        public final void a(Call<T> call, Throwable th) {
            if (!call.isCanceled()) {
                try {
                    this.f21949c.onError(th);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(new CompositeException(th, th2));
                }
            }
        }

        public final void a(Call<T> call, SsResponse<T> ssResponse) {
            if (!call.isCanceled()) {
                try {
                    this.f21949c.onNext(ssResponse);
                    if (!call.isCanceled()) {
                        this.f21947a = true;
                        this.f21949c.onComplete();
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    RxJavaPlugins.onError(new CompositeException(th, th));
                }
            }
        }
    }

    b(Call<T> call) {
        this.f21946a = call;
    }

    public final void subscribeActual(Observer<? super SsResponse<T>> observer) {
        Call clone = this.f21946a.clone();
        a aVar = new a(clone, observer);
        observer.onSubscribe(aVar);
        clone.enqueue(aVar);
    }
}
