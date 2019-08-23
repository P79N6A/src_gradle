package com.google.common.util.concurrent;

import com.google.common.a.i;
import com.google.common.a.m;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.Partially;
import com.google.common.util.concurrent.a;
import com.google.common.util.concurrent.o;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
@Beta
public final class l extends n {

    static final class a<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final Future<V> f24885a;

        /* renamed from: b  reason: collision with root package name */
        final k<? super V> f24886b;

        public final String toString() {
            return i.a(this).a(this.f24886b).toString();
        }

        public final void run() {
            try {
                this.f24886b.onSuccess(l.a(this.f24885a));
            } catch (ExecutionException e2) {
                this.f24886b.onFailure(e2.getCause());
            } catch (Error | RuntimeException e3) {
                this.f24886b.onFailure(e3);
            }
        }

        a(Future<V> future, k<? super V> kVar) {
            this.f24885a = future;
            this.f24886b = kVar;
        }
    }

    public static <V> q<V> a(@NullableDecl V v) {
        if (v == null) {
            return o.b.f24888a;
        }
        return new o.b(v);
    }

    public static <V> q<V> a(Throwable th) {
        m.a(th);
        return new o.a(th);
    }

    @CanIgnoreReturnValue
    public static <V> V a(Future<V> future) throws ExecutionException {
        m.a(future.isDone(), "Future was expected to be done: %s", (Object) future);
        return z.a(future);
    }

    @Deprecated
    public static <V> void a(q<V> qVar, k<? super V> kVar) {
        a(qVar, kVar, v.a());
    }

    public static <V> void a(q<V> qVar, k<? super V> kVar, Executor executor) {
        m.a(kVar);
        qVar.a(new a(qVar, kVar), executor);
    }

    @CanIgnoreReturnValue
    @Partially.GwtIncompatible
    public static <V, X extends Throwable> q<V> a(q<? extends V> qVar, Class<X> cls, e<? super X, ? extends V> eVar, Executor executor) {
        a.C0285a aVar = new a.C0285a(qVar, cls, eVar);
        qVar.a(aVar, v.a(executor, aVar));
        return aVar;
    }
}
