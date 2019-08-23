package com.google.common.d;

import com.google.common.a.m;
import com.google.common.a.u;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
@Beta
public final class d implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    static final c f24824a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    final c f24825b;
    @MonotonicNonNullDecl

    /* renamed from: c  reason: collision with root package name */
    Throwable f24826c;

    /* renamed from: d  reason: collision with root package name */
    private final Deque<Closeable> f24827d = new ArrayDeque(4);

    @VisibleForTesting
    static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        static final a f24828a = new a();

        a() {
        }

        public final void a(Closeable closeable, Throwable th, Throwable th2) {
            Logger logger = c.f24823a;
            Level level = Level.WARNING;
            logger.log(level, "Suppressing exception thrown when closing " + closeable, th2);
        }
    }

    @VisibleForTesting
    static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        static final b f24829a = new b();

        /* renamed from: b  reason: collision with root package name */
        static final Method f24830b = a();

        b() {
        }

        private static Method a() {
            try {
                return Throwable.class.getMethod("addSuppressed", new Class[]{Throwable.class});
            } catch (Throwable unused) {
                return null;
            }
        }

        public final void a(Closeable closeable, Throwable th, Throwable th2) {
            if (th != th2) {
                try {
                    f24830b.invoke(th, new Object[]{th2});
                } catch (Throwable unused) {
                    a.f24828a.a(closeable, th, th2);
                }
            }
        }
    }

    @VisibleForTesting
    interface c {
        void a(Closeable closeable, Throwable th, Throwable th2);
    }

    static {
        boolean z;
        c cVar;
        if (b.f24830b != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cVar = b.f24829a;
        } else {
            cVar = a.f24828a;
        }
        f24824a = cVar;
    }

    public final void close() throws IOException {
        Throwable th = this.f24826c;
        while (!this.f24827d.isEmpty()) {
            Closeable removeFirst = this.f24827d.removeFirst();
            try {
                removeFirst.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f24825b.a(removeFirst, th, th2);
                }
            }
        }
        if (this.f24826c == null && th != null) {
            u.a(th, IOException.class);
            throw new AssertionError(th);
        }
    }

    @CanIgnoreReturnValue
    public final <C extends Closeable> C a(@NullableDecl C c2) {
        if (c2 != null) {
            this.f24827d.addFirst(c2);
        }
        return c2;
    }

    @VisibleForTesting
    d(c cVar) {
        this.f24825b = (c) m.a(cVar);
    }
}
