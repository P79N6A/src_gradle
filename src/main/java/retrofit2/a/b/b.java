package retrofit2.a.b;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.d;
import retrofit2.m;

public final class b<T> extends Observable<m<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final retrofit2.b<T> f84226a;

    static final class a<T> implements Disposable, d<T> {

        /* renamed from: a  reason: collision with root package name */
        boolean f84227a;

        /* renamed from: b  reason: collision with root package name */
        private final retrofit2.b<?> f84228b;

        /* renamed from: c  reason: collision with root package name */
        private final Observer<? super m<T>> f84229c;

        public final void dispose() {
            this.f84228b.b();
        }

        public final boolean isDisposed() {
            return this.f84228b.c();
        }

        a(retrofit2.b<?> bVar, Observer<? super m<T>> observer) {
            this.f84228b = bVar;
            this.f84229c = observer;
        }

        public final void a(retrofit2.b<T> bVar, Throwable th) {
            if (!bVar.c()) {
                try {
                    this.f84229c.onError(th);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(new CompositeException(th, th2));
                }
            }
        }

        public final void a(retrofit2.b<T> bVar, m<T> mVar) {
            if (!bVar.c()) {
                try {
                    this.f84229c.onNext(mVar);
                    if (!bVar.c()) {
                        this.f84227a = true;
                        this.f84229c.onComplete();
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    RxJavaPlugins.onError(new CompositeException(th, th));
                }
            }
        }
    }

    b(retrofit2.b<T> bVar) {
        this.f84226a = bVar;
    }

    public final void subscribeActual(Observer<? super m<T>> observer) {
        retrofit2.b d2 = this.f84226a.d();
        a aVar = new a(d2, observer);
        observer.onSubscribe(aVar);
        d2.a(aVar);
    }
}
