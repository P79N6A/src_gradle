package retrofit2.a.b;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.m;

public final class f<T> extends Observable<e<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final Observable<m<T>> f84234a;

    static class a<R> implements Observer<m<R>> {

        /* renamed from: a  reason: collision with root package name */
        private final Observer<? super e<R>> f84235a;

        public final void onComplete() {
            this.f84235a.onComplete();
        }

        a(Observer<? super e<R>> observer) {
            this.f84235a = observer;
        }

        public final void onSubscribe(Disposable disposable) {
            this.f84235a.onSubscribe(disposable);
        }

        public final /* synthetic */ void onNext(Object obj) {
            m mVar = (m) obj;
            Observer<? super e<R>> observer = this.f84235a;
            if (mVar != null) {
                observer.onNext(new e(mVar, null));
                return;
            }
            throw new NullPointerException("response == null");
        }

        public final void onError(Throwable th) {
            try {
                Observer<? super e<R>> observer = this.f84235a;
                if (th != null) {
                    observer.onNext(new e(null, th));
                    this.f84235a.onComplete();
                    return;
                }
                throw new NullPointerException("error == null");
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(new CompositeException(th, th2));
            }
        }
    }

    f(Observable<m<T>> observable) {
        this.f84234a = observable;
    }

    public final void subscribeActual(Observer<? super e<T>> observer) {
        this.f84234a.subscribe((Observer<? super T>) new a<Object>(observer));
    }
}
