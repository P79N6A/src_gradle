package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import org.a.b;
import org.a.c;

public final class FlowableScalarXMap {

    static final class ScalarXMapFlowable<T, R> extends Flowable<R> {
        final Function<? super T, ? extends b<? extends R>> mapper;
        final T value;

        public final void subscribeActual(c<? super R> cVar) {
            try {
                b bVar = (b) ObjectHelper.requireNonNull(this.mapper.apply(this.value), "The mapper returned a null Publisher");
                if (bVar instanceof Callable) {
                    try {
                        Object call = ((Callable) bVar).call();
                        if (call == null) {
                            EmptySubscription.complete(cVar);
                        } else {
                            cVar.onSubscribe(new ScalarSubscription(cVar, call));
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        EmptySubscription.error(th, cVar);
                    }
                } else {
                    bVar.subscribe(cVar);
                }
            } catch (Throwable th2) {
                EmptySubscription.error(th2, cVar);
            }
        }

        ScalarXMapFlowable(T t, Function<? super T, ? extends b<? extends R>> function) {
            this.value = t;
            this.mapper = function;
        }
    }

    private FlowableScalarXMap() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Flowable<U> scalarXMap(T t, Function<? super T, ? extends b<? extends U>> function) {
        return RxJavaPlugins.onAssembly((Flowable<T>) new ScalarXMapFlowable<T>(t, function));
    }

    public static <T, R> boolean tryScalarXMapSubscribe(b<T> bVar, c<? super R> cVar, Function<? super T, ? extends b<? extends R>> function) {
        if (!(bVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) bVar).call();
            if (call == null) {
                EmptySubscription.complete(cVar);
                return true;
            }
            try {
                b bVar2 = (b) ObjectHelper.requireNonNull(function.apply(call), "The mapper returned a null Publisher");
                if (bVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) bVar2).call();
                        if (call2 == null) {
                            EmptySubscription.complete(cVar);
                            return true;
                        }
                        cVar.onSubscribe(new ScalarSubscription(cVar, call2));
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        EmptySubscription.error(th, cVar);
                        return true;
                    }
                } else {
                    bVar2.subscribe(cVar);
                }
                return true;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptySubscription.error(th2, cVar);
                return true;
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            EmptySubscription.error(th3, cVar);
            return true;
        }
    }
}
