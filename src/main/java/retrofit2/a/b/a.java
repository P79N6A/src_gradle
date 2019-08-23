package retrofit2.a.b;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.m;

public final class a<T> extends Observable<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Observable<m<T>> f84223a;

    /* renamed from: retrofit2.a.b.a$a  reason: collision with other inner class name */
    static class C0903a<R> implements Observer<m<R>> {

        /* renamed from: a  reason: collision with root package name */
        private final Observer<? super R> f84224a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f84225b;

        public final void onComplete() {
            if (!this.f84225b) {
                this.f84224a.onComplete();
            }
        }

        C0903a(Observer<? super R> observer) {
            this.f84224a = observer;
        }

        public final void onSubscribe(Disposable disposable) {
            this.f84224a.onSubscribe(disposable);
        }

        public final void onError(Throwable th) {
            if (!this.f84225b) {
                this.f84224a.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            RxJavaPlugins.onError(assertionError);
        }

        public final /* synthetic */ void onNext(Object obj) {
            m mVar = (m) obj;
            if (mVar.d()) {
                this.f84224a.onNext(mVar.f84319b);
                return;
            }
            this.f84225b = true;
            d dVar = new d(mVar);
            try {
                this.f84224a.onError(dVar);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(new CompositeException(dVar, th));
            }
        }
    }

    a(Observable<m<T>> observable) {
        this.f84223a = observable;
    }

    public final void subscribeActual(Observer<? super T> observer) {
        this.f84223a.subscribe((Observer<? super T>) new C0903a<Object>(observer));
    }
}
