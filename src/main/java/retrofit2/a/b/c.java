package retrofit2.a.b;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.b;
import retrofit2.m;

public final class c<T> extends Observable<m<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final b<T> f84230a;

    static final class a implements Disposable {

        /* renamed from: a  reason: collision with root package name */
        private final b<?> f84231a;

        public final void dispose() {
            this.f84231a.b();
        }

        public final boolean isDisposed() {
            return this.f84231a.c();
        }

        a(b<?> bVar) {
            this.f84231a = bVar;
        }
    }

    c(b<T> bVar) {
        this.f84230a = bVar;
    }

    public final void subscribeActual(Observer<? super m<T>> observer) {
        boolean z;
        b d2 = this.f84230a.d();
        observer.onSubscribe(new a(d2));
        try {
            m a2 = d2.a();
            if (!d2.c()) {
                observer.onNext(a2);
            }
            if (!d2.c()) {
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
            if (!d2.c()) {
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
