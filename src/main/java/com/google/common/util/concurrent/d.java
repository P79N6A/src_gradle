package com.google.common.util.concurrent;

import com.google.common.a.f;
import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.b;
import com.google.errorprone.annotations.ForOverride;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class d<I, O, F, T> extends b.h<O> implements Runnable {
    @NullableDecl

    /* renamed from: a  reason: collision with root package name */
    q<? extends I> f24876a;
    @NullableDecl

    /* renamed from: b  reason: collision with root package name */
    F f24877b;

    public static final class a<I, O> extends d<I, O, f<? super I, ? extends O>, O> {
        /* access modifiers changed from: package-private */
        public final void a(@NullableDecl O o) {
            b(o);
        }

        public a(q<? extends I> qVar, f<? super I, ? extends O> fVar) {
            super(qVar, fVar);
        }

        /* access modifiers changed from: package-private */
        @NullableDecl
        public final /* synthetic */ Object a(Object obj, @NullableDecl Object obj2) throws Exception {
            return ((f) obj).apply(obj2);
        }
    }

    /* access modifiers changed from: package-private */
    @ForOverride
    @NullableDecl
    public abstract T a(F f2, @NullableDecl I i) throws Exception;

    /* access modifiers changed from: package-private */
    @ForOverride
    public abstract void a(@NullableDecl T t);

    /* access modifiers changed from: protected */
    public final void b() {
        a((Future<?>) this.f24876a);
        this.f24876a = null;
        this.f24877b = null;
    }

    /* access modifiers changed from: protected */
    public final String a() {
        q<? extends I> qVar = this.f24876a;
        F f2 = this.f24877b;
        String a2 = super.a();
        String str = "";
        if (qVar != null) {
            str = "inputFuture=[" + qVar + "], ";
        }
        if (f2 != null) {
            return str + "function=[" + f2 + "]";
        } else if (a2 == null) {
            return null;
        } else {
            return str + a2;
        }
    }

    public final void run() {
        boolean z;
        q<? extends I> qVar = this.f24876a;
        F f2 = this.f24877b;
        boolean isCancelled = isCancelled();
        boolean z2 = true;
        if (qVar == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = isCancelled | z;
        if (f2 != null) {
            z2 = false;
        }
        if (!z3 && !z2) {
            this.f24876a = null;
            try {
                try {
                    Object a2 = a(f2, l.a((Future<V>) qVar));
                    this.f24877b = null;
                    a(a2);
                } catch (UndeclaredThrowableException e2) {
                    a(e2.getCause());
                    this.f24877b = null;
                } catch (Throwable th) {
                    this.f24877b = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                a(e3.getCause());
            } catch (RuntimeException e4) {
                a((Throwable) e4);
            } catch (Error e5) {
                a((Throwable) e5);
            }
        }
    }

    d(q<? extends I> qVar, F f2) {
        this.f24876a = (q) m.a(qVar);
        this.f24877b = m.a(f2);
    }
}
