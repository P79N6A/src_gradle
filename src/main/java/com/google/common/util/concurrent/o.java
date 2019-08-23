package com.google.common.util.concurrent;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class o<V> extends h<V> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f24887a = Logger.getLogger(o.class.getName());

    static final class a<V> extends b.h<V> {
        a(Throwable th) {
            a(th);
        }
    }

    static class b<V> extends o<V> {

        /* renamed from: a  reason: collision with root package name */
        static final b<Object> f24888a = new b<>(null);
        @NullableDecl

        /* renamed from: b  reason: collision with root package name */
        private final V f24889b;

        public final V get() {
            return this.f24889b;
        }

        public final String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f24889b + "]]";
        }

        b(@NullableDecl V v) {
            this.f24889b = v;
        }
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public abstract V get() throws ExecutionException;

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }

    o() {
    }

    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        m.a(timeUnit);
        return get();
    }

    public final void a(Runnable runnable, Executor executor) {
        m.a(runnable, (Object) "Runnable was null.");
        m.a(executor, (Object) "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f24887a;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e2);
        }
    }
}
