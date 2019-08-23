package com.bytedance.retrofit2.rxjava2.adapter;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.SsResponse;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

public final class c<T> extends Observable<SsResponse<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final Call<T> f21950a;

    static final class a implements Disposable {

        /* renamed from: a  reason: collision with root package name */
        private final Call<?> f21951a;

        public final void dispose() {
            this.f21951a.cancel();
        }

        public final boolean isDisposed() {
            return this.f21951a.isCanceled();
        }

        a(Call<?> call) {
            this.f21951a = call;
        }
    }

    c(Call<T> call) {
        this.f21950a = call;
    }

    public final void subscribeActual(Observer<? super SsResponse<T>> observer) {
        boolean z;
        Call clone = this.f21950a.clone();
        observer.onSubscribe(new a(clone));
        try {
            SsResponse execute = clone.execute();
            if (!clone.isCanceled()) {
                observer.onNext(execute);
            }
            if (!clone.isCanceled()) {
                try {
                    observer.onComplete();
                } catch (Throwable th) {
                    th = th;
                    z = true;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            Exceptions.throwIfFatal(th);
            if (z) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!clone.isCanceled()) {
                try {
                    observer.onError(th);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    RxJavaPlugins.onError(new CompositeException(th, th3));
                }
            }
        }
    }
}
