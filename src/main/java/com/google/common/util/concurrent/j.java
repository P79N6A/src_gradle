package com.google.common.util.concurrent;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;

@GwtCompatible
@CanIgnoreReturnValue
public abstract class j<V> extends i<V> implements q<V> {

    public static abstract class a<V> extends j<V> {

        /* renamed from: a  reason: collision with root package name */
        private final q<V> f24884a;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final q<V> delegate() {
            return this.f24884a;
        }

        protected a(q<V> qVar) {
            this.f24884a = (q) m.a(qVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract q<? extends V> delegate();

    protected j() {
    }

    public final void a(Runnable runnable, Executor executor) {
        delegate().a(runnable, executor);
    }
}
