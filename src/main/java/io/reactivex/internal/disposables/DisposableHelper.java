package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public enum DisposableHelper implements Disposable {
    DISPOSED;

    public final void dispose() {
    }

    public final boolean isDisposed() {
        return true;
    }

    public static void reportDisposableSet() {
        RxJavaPlugins.onError(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean isDisposed(Disposable disposable) {
        if (disposable == DISPOSED) {
            return true;
        }
        return false;
    }

    public static boolean dispose(AtomicReference<Disposable> atomicReference) {
        Disposable disposable = atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (disposable != disposableHelper) {
            Disposable andSet = atomicReference.getAndSet(disposableHelper);
            if (andSet != disposableHelper) {
                if (andSet != null) {
                    andSet.dispose();
                }
                return true;
            }
        }
        return false;
    }

    public static boolean replace(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = atomicReference.get();
            if (disposable2 == DISPOSED) {
                if (disposable != null) {
                    disposable.dispose();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(disposable2, disposable));
        return true;
    }

    public static boolean set(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = atomicReference.get();
            if (disposable2 == DISPOSED) {
                if (disposable != null) {
                    disposable.dispose();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(disposable2, disposable));
        if (disposable2 != null) {
            disposable2.dispose();
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        ObjectHelper.requireNonNull(disposable, "d is null");
        if (atomicReference.compareAndSet(null, disposable)) {
            return true;
        }
        disposable.dispose();
        if (atomicReference.get() != DISPOSED) {
            reportDisposableSet();
        }
        return false;
    }

    public static boolean trySet(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        if (atomicReference.compareAndSet(null, disposable)) {
            return true;
        }
        if (atomicReference.get() == DISPOSED) {
            disposable.dispose();
        }
        return false;
    }

    public static boolean validate(Disposable disposable, Disposable disposable2) {
        if (disposable2 == null) {
            RxJavaPlugins.onError(new NullPointerException("next is null"));
            return false;
        } else if (disposable == null) {
            return true;
        } else {
            disposable2.dispose();
            reportDisposableSet();
            return false;
        }
    }
}
