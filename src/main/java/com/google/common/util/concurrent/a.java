package com.google.common.util.concurrent;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.b;
import com.google.errorprone.annotations.ForOverride;
import java.lang.Throwable;
import java.util.concurrent.Future;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class a<V, X extends Throwable, F, T> extends b.h<V> implements Runnable {
    @NullableDecl

    /* renamed from: a  reason: collision with root package name */
    q<? extends V> f24842a;
    @NullableDecl

    /* renamed from: b  reason: collision with root package name */
    Class<X> f24843b;
    @NullableDecl

    /* renamed from: c  reason: collision with root package name */
    F f24844c;

    /* renamed from: com.google.common.util.concurrent.a$a  reason: collision with other inner class name */
    static final class C0285a<V, X extends Throwable> extends a<V, X, e<? super X, ? extends V>, q<? extends V>> {
        /* access modifiers changed from: package-private */
        public final /* bridge */ /* synthetic */ void a(Object obj) {
            a((q) obj);
        }

        /* access modifiers changed from: package-private */
        public final /* bridge */ /* synthetic */ Object a(Object obj, Throwable th) throws Exception {
            q a2 = ((e) obj).a(th);
            m.a(a2, (Object) "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)?");
            return a2;
        }

        C0285a(q<? extends V> qVar, Class<X> cls, e<? super X, ? extends V> eVar) {
            super(qVar, cls, eVar);
        }
    }

    /* access modifiers changed from: package-private */
    @ForOverride
    @NullableDecl
    public abstract T a(F f2, X x) throws Exception;

    /* access modifiers changed from: package-private */
    @ForOverride
    public abstract void a(@NullableDecl T t);

    /* access modifiers changed from: protected */
    public final void b() {
        a((Future<?>) this.f24842a);
        this.f24842a = null;
        this.f24843b = null;
        this.f24844c = null;
    }

    /* access modifiers changed from: protected */
    public final String a() {
        q<? extends V> qVar = this.f24842a;
        Class<X> cls = this.f24843b;
        F f2 = this.f24844c;
        String a2 = super.a();
        String str = "";
        if (qVar != null) {
            str = "inputFuture=[" + qVar + "], ";
        }
        if (cls != null && f2 != null) {
            return str + "exceptionType=[" + cls + "], fallback=[" + f2 + "]";
        } else if (a2 == null) {
            return null;
        } else {
            return str + a2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.common.util.concurrent.q<? extends V> r0 = r7.f24842a
            java.lang.Class<X> r1 = r7.f24843b
            F r2 = r7.f24844c
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x000c
            r5 = 1
            goto L_0x000d
        L_0x000c:
            r5 = 0
        L_0x000d:
            if (r1 != 0) goto L_0x0011
            r6 = 1
            goto L_0x0012
        L_0x0011:
            r6 = 0
        L_0x0012:
            r5 = r5 | r6
            if (r2 != 0) goto L_0x0016
            r3 = 1
        L_0x0016:
            r3 = r3 | r5
            boolean r4 = r7.isCancelled()
            r3 = r3 | r4
            if (r3 == 0) goto L_0x001f
            return
        L_0x001f:
            r3 = 0
            r7.f24842a = r3
            java.lang.Object r0 = com.google.common.util.concurrent.l.a((java.util.concurrent.Future<V>) r0)     // Catch:{ ExecutionException -> 0x002b, Throwable -> 0x0029 }
            r4 = r0
            r0 = r3
            goto L_0x0037
        L_0x0029:
            r0 = move-exception
            goto L_0x0036
        L_0x002b:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Object r0 = com.google.common.a.m.a(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L_0x0036:
            r4 = r3
        L_0x0037:
            if (r0 != 0) goto L_0x003d
            r7.b(r4)
            return
        L_0x003d:
            boolean r1 = r1.isInstance(r0)
            if (r1 != 0) goto L_0x0047
            r7.a((java.lang.Throwable) r0)
            return
        L_0x0047:
            java.lang.Object r0 = r7.a(r2, r0)     // Catch:{ Throwable -> 0x0055 }
            r7.f24843b = r3
            r7.f24844c = r3
            r7.a(r0)
            return
        L_0x0053:
            r0 = move-exception
            goto L_0x005e
        L_0x0055:
            r0 = move-exception
            r7.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0053 }
            r7.f24843b = r3
            r7.f24844c = r3
            return
        L_0x005e:
            r7.f24843b = r3
            r7.f24844c = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.a.run():void");
    }

    a(q<? extends V> qVar, Class<X> cls, F f2) {
        this.f24842a = (q) m.a(qVar);
        this.f24843b = (Class) m.a(cls);
        this.f24844c = m.a(f2);
    }
}
