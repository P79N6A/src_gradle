package com.google.common.util.concurrent;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.b;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class x<V> extends b.h<V> implements RunnableFuture<V> {

    /* renamed from: a  reason: collision with root package name */
    private volatile p<?> f24902a;

    final class a extends p<V> {
        private final Callable<V> callable;

        /* access modifiers changed from: package-private */
        public final boolean a() {
            return x.this.isDone();
        }

        /* access modifiers changed from: package-private */
        public final V b() throws Exception {
            return this.callable.call();
        }

        /* access modifiers changed from: package-private */
        public final String c() {
            return this.callable.toString();
        }

        a(Callable<V> callable2) {
            this.callable = (Callable) m.a(callable2);
        }

        /* access modifiers changed from: package-private */
        public final void a(V v, Throwable th) {
            if (th == null) {
                x.this.b(v);
            } else {
                x.this.a(th);
            }
        }
    }

    public final void run() {
        p<?> pVar = this.f24902a;
        if (pVar != null) {
            pVar.run();
        }
        this.f24902a = null;
    }

    /* access modifiers changed from: protected */
    public final String a() {
        p<?> pVar = this.f24902a;
        if (pVar == null) {
            return super.a();
        }
        return "task=[" + pVar + "]";
    }

    /* access modifiers changed from: protected */
    public final void b() {
        super.b();
        if (d()) {
            p<?> pVar = this.f24902a;
            if (pVar != null) {
                Runnable runnable = (Runnable) pVar.get();
                if ((runnable instanceof Thread) && pVar.compareAndSet(runnable, p.f24891b)) {
                    ((Thread) runnable).interrupt();
                    pVar.set(p.f24890a);
                }
            }
        }
        this.f24902a = null;
    }

    static <V> x<V> a(Callable<V> callable) {
        return new x<>(callable);
    }

    private x(Callable<V> callable) {
        this.f24902a = new a(callable);
    }

    static <V> x<V> a(Runnable runnable, @NullableDecl V v) {
        return new x<>(Executors.callable(runnable, v));
    }
}
