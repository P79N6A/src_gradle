package com.google.common.util.concurrent;

import com.google.common.a.m;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.ForOverride;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;

@GwtCompatible
@ReflectionSupport
@DoNotMock
public abstract class b<V> extends h<V> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f24845a = Logger.getLogger(b.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final Object f24846b = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f24847d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    public static final a f24848e;
    @NullableDecl

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f24849f;
    @NullableDecl
    public volatile d g;
    @NullableDecl
    public volatile j h;

    static abstract class a {
        /* access modifiers changed from: package-private */
        public abstract void a(j jVar, j jVar2);

        /* access modifiers changed from: package-private */
        public abstract void a(j jVar, Thread thread);

        /* access modifiers changed from: package-private */
        public abstract boolean a(b<?> bVar, d dVar, d dVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean a(b<?> bVar, j jVar, j jVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean a(b<?> bVar, Object obj, Object obj2);

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.google.common.util.concurrent.b$b  reason: collision with other inner class name */
    static final class C0286b {

        /* renamed from: a  reason: collision with root package name */
        static final C0286b f24850a;

        /* renamed from: b  reason: collision with root package name */
        static final C0286b f24851b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f24852c;
        @NullableDecl

        /* renamed from: d  reason: collision with root package name */
        final Throwable f24853d;

        static {
            if (b.f24847d) {
                f24851b = null;
                f24850a = null;
                return;
            }
            f24851b = new C0286b(false, null);
            f24850a = new C0286b(true, null);
        }

        C0286b(boolean z, @NullableDecl Throwable th) {
            this.f24852c = z;
            this.f24853d = th;
        }
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final c f24854a = new c(new Throwable("Failure occurred while trying to finish a future.") {
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: b  reason: collision with root package name */
        final Throwable f24855b;

        c(Throwable th) {
            this.f24855b = (Throwable) m.a(th);
        }
    }

    static final class d {

        /* renamed from: a  reason: collision with root package name */
        static final d f24856a = new d(null, null);

        /* renamed from: b  reason: collision with root package name */
        final Runnable f24857b;

        /* renamed from: c  reason: collision with root package name */
        final Executor f24858c;
        @NullableDecl

        /* renamed from: d  reason: collision with root package name */
        d f24859d;

        d(Runnable runnable, Executor executor) {
            this.f24857b = runnable;
            this.f24858c = executor;
        }
    }

    static final class e extends a {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<j, Thread> f24860a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<j, j> f24861b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<b, j> f24862c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<b, d> f24863d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<b, Object> f24864e;

        /* access modifiers changed from: package-private */
        public final void a(j jVar, j jVar2) {
            this.f24861b.lazySet(jVar, jVar2);
        }

        /* access modifiers changed from: package-private */
        public final void a(j jVar, Thread thread) {
            this.f24860a.lazySet(jVar, thread);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(b<?> bVar, d dVar, d dVar2) {
            return this.f24863d.compareAndSet(bVar, dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(b<?> bVar, j jVar, j jVar2) {
            return this.f24862c.compareAndSet(bVar, jVar, jVar2);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(b<?> bVar, Object obj, Object obj2) {
            return this.f24864e.compareAndSet(bVar, obj, obj2);
        }

        e(AtomicReferenceFieldUpdater<j, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<j, j> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<b, j> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<b, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<b, Object> atomicReferenceFieldUpdater5) {
            super((byte) 0);
            this.f24860a = atomicReferenceFieldUpdater;
            this.f24861b = atomicReferenceFieldUpdater2;
            this.f24862c = atomicReferenceFieldUpdater3;
            this.f24863d = atomicReferenceFieldUpdater4;
            this.f24864e = atomicReferenceFieldUpdater5;
        }
    }

    static final class f<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final b<V> f24865a;

        /* renamed from: b  reason: collision with root package name */
        final q<? extends V> f24866b;

        public final void run() {
            if (this.f24865a.f24849f == this) {
                if (b.f24848e.a(this.f24865a, (Object) this, b.b(this.f24866b))) {
                    b.a(this.f24865a);
                }
            }
        }

        f(b<V> bVar, q<? extends V> qVar) {
            this.f24865a = bVar;
            this.f24866b = qVar;
        }
    }

    static final class g extends a {
        private g() {
            super((byte) 0);
        }

        /* synthetic */ g(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final void a(j jVar, j jVar2) {
            jVar.f24875c = jVar2;
        }

        /* access modifiers changed from: package-private */
        public final void a(j jVar, Thread thread) {
            jVar.f24874b = thread;
        }

        /* access modifiers changed from: package-private */
        public final boolean a(b<?> bVar, d dVar, d dVar2) {
            synchronized (bVar) {
                if (bVar.g != dVar) {
                    return false;
                }
                bVar.g = dVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean a(b<?> bVar, j jVar, j jVar2) {
            synchronized (bVar) {
                if (bVar.h != jVar) {
                    return false;
                }
                bVar.h = jVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean a(b<?> bVar, Object obj, Object obj2) {
            synchronized (bVar) {
                if (bVar.f24849f != obj) {
                    return false;
                }
                bVar.f24849f = obj2;
                return true;
            }
        }
    }

    static abstract class h<V> extends b<V> {
        h() {
        }

        @CanIgnoreReturnValue
        public final V get() throws InterruptedException, ExecutionException {
            return b.super.get();
        }

        public final boolean isCancelled() {
            return b.super.isCancelled();
        }

        public final boolean isDone() {
            return b.super.isDone();
        }

        @CanIgnoreReturnValue
        public final boolean cancel(boolean z) {
            return b.super.cancel(z);
        }

        public final void a(Runnable runnable, Executor executor) {
            b.super.a(runnable, executor);
        }

        @CanIgnoreReturnValue
        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return b.super.get(j, timeUnit);
        }
    }

    static final class i extends a {

        /* renamed from: a  reason: collision with root package name */
        static final Unsafe f24867a;

        /* renamed from: b  reason: collision with root package name */
        static final long f24868b;

        /* renamed from: c  reason: collision with root package name */
        static final long f24869c;

        /* renamed from: d  reason: collision with root package name */
        static final long f24870d;

        /* renamed from: e  reason: collision with root package name */
        static final long f24871e;

        /* renamed from: f  reason: collision with root package name */
        static final long f24872f;

        private i() {
            super((byte) 0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x005f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:?, code lost:
            r0 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.util.concurrent.b.i.AnonymousClass1());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
        static {
            /*
                sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
                goto L_0x0010
            L_0x0005:
                com.google.common.util.concurrent.b$i$1 r0 = new com.google.common.util.concurrent.b$i$1     // Catch:{ PrivilegedActionException -> 0x005f }
                r0.<init>()     // Catch:{ PrivilegedActionException -> 0x005f }
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x005f }
                sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x005f }
            L_0x0010:
                java.lang.Class<com.google.common.util.concurrent.b> r1 = com.google.common.util.concurrent.b.class
                java.lang.String r2 = "waiters"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r2 = r0.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0055 }
                f24869c = r2     // Catch:{ Exception -> 0x0055 }
                java.lang.String r2 = "listeners"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r2 = r0.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0055 }
                f24868b = r2     // Catch:{ Exception -> 0x0055 }
                java.lang.String r2 = "value"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
                f24870d = r1     // Catch:{ Exception -> 0x0055 }
                java.lang.Class<com.google.common.util.concurrent.b$j> r1 = com.google.common.util.concurrent.b.j.class
                java.lang.String r2 = "b"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
                f24871e = r1     // Catch:{ Exception -> 0x0055 }
                java.lang.Class<com.google.common.util.concurrent.b$j> r1 = com.google.common.util.concurrent.b.j.class
                java.lang.String r2 = "c"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
                f24872f = r1     // Catch:{ Exception -> 0x0055 }
                f24867a = r0     // Catch:{ Exception -> 0x0055 }
                return
            L_0x0055:
                r0 = move-exception
                com.google.common.a.u.a(r0)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005f:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.b.i.<clinit>():void");
        }

        /* synthetic */ i(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final void a(j jVar, j jVar2) {
            f24867a.putObject(jVar, f24872f, jVar2);
        }

        /* access modifiers changed from: package-private */
        public final void a(j jVar, Thread thread) {
            f24867a.putObject(jVar, f24871e, thread);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(b<?> bVar, d dVar, d dVar2) {
            return f24867a.compareAndSwapObject(bVar, f24868b, dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(b<?> bVar, j jVar, j jVar2) {
            return f24867a.compareAndSwapObject(bVar, f24869c, jVar, jVar2);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(b<?> bVar, Object obj, Object obj2) {
            return f24867a.compareAndSwapObject(bVar, f24870d, obj, obj2);
        }
    }

    static final class j {

        /* renamed from: a  reason: collision with root package name */
        static final j f24873a = new j();
        @NullableDecl

        /* renamed from: b  reason: collision with root package name */
        volatile Thread f24874b;
        @NullableDecl

        /* renamed from: c  reason: collision with root package name */
        volatile j f24875c;

        j() {
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            Thread thread = this.f24874b;
            if (thread != null) {
                this.f24874b = null;
                LockSupport.unpark(thread);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(j jVar) {
            b.f24848e.a(this, jVar);
        }

        j(byte b2) {
            b.f24848e.a(this, Thread.currentThread());
        }
    }

    /* access modifiers changed from: protected */
    @ForOverride
    @Beta
    public void b() {
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    protected b() {
    }

    @CanIgnoreReturnValue
    public boolean a(Throwable th) {
        if (!f24848e.a(this, (Object) null, (Object) new c((Throwable) m.a(th)))) {
            return false;
        }
        a(this);
        return true;
    }

    /* access modifiers changed from: protected */
    @CanIgnoreReturnValue
    @Beta
    public boolean a(q<? extends V> qVar) {
        f fVar;
        c cVar;
        m.a(qVar);
        Object obj = this.f24849f;
        if (obj == null) {
            if (qVar.isDone()) {
                if (!f24848e.a(this, (Object) null, b(qVar))) {
                    return false;
                }
                a(this);
                return true;
            }
            fVar = new f(this, qVar);
            if (f24848e.a(this, (Object) null, (Object) fVar)) {
                try {
                    qVar.a(fVar, v.a());
                } catch (Throwable unused) {
                    cVar = c.f24854a;
                }
                return true;
            }
            obj = this.f24849f;
        }
        if (obj instanceof C0286b) {
            qVar.cancel(((C0286b) obj).f24852c);
        }
        return false;
        f24848e.a(this, (Object) fVar, (Object) cVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(@NullableDecl Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(d());
        }
    }

    public boolean isCancelled() {
        return this.f24849f instanceof C0286b;
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        Object obj = this.f24849f;
        if (!(obj instanceof C0286b) || !((C0286b) obj).f24852c) {
            return false;
        }
        return true;
    }

    private void e() {
        j jVar;
        do {
            jVar = this.h;
        } while (!f24848e.a(this, jVar, j.f24873a));
        while (jVar != null) {
            jVar.a();
            jVar = jVar.f24875c;
        }
    }

    public boolean isDone() {
        boolean z;
        Object obj = this.f24849f;
        boolean z2 = false;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (!(obj instanceof f)) {
            z2 = true;
        }
        return z & z2;
    }

    @CanIgnoreReturnValue
    public V get() throws InterruptedException, ExecutionException {
        boolean z;
        boolean z2;
        Object obj;
        boolean z3;
        boolean z4;
        if (!Thread.interrupted()) {
            Object obj2 = this.f24849f;
            if (obj2 != null) {
                z = true;
            } else {
                z = false;
            }
            if (!(obj2 instanceof f)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                return a(obj2);
            }
            j jVar = this.h;
            if (jVar != j.f24873a) {
                j jVar2 = new j((byte) 0);
                do {
                    jVar2.a(jVar);
                    if (f24848e.a(this, jVar, jVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f24849f;
                                if (obj != null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!(obj instanceof f)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            } else {
                                a(jVar2);
                                throw new InterruptedException();
                            }
                        } while (!(z3 & z4));
                        return a(obj);
                    }
                    jVar = this.h;
                } while (jVar != j.f24873a);
            }
            return a(this.f24849f);
        }
        throw new InterruptedException();
    }

    public String toString() {
        String str;
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = a();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str == null || str.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    static {
        a aVar;
        Throwable th;
        Throwable th2 = null;
        try {
            aVar = new i((byte) 0);
            th = null;
        } catch (Throwable th3) {
            th2 = th3;
            th = th;
            aVar = new g((byte) 0);
        }
        f24848e = aVar;
        if (th2 != null) {
            f24845a.log(Level.SEVERE, "UnsafeAtomicHelper is broken!", th);
            f24845a.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }

    /* access modifiers changed from: protected */
    @NullableDecl
    public String a() {
        Object obj = this.f24849f;
        if (obj instanceof f) {
            return "setFuture=[" + c(((f) obj).f24866b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    private String c(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    private d a(d dVar) {
        d dVar2;
        do {
            dVar2 = this.g;
        } while (!f24848e.a(this, dVar2, d.f24856a));
        d dVar3 = dVar2;
        d dVar4 = dVar;
        d dVar5 = dVar3;
        while (dVar5 != null) {
            d dVar6 = dVar5.f24859d;
            dVar5.f24859d = dVar4;
            dVar4 = dVar5;
            dVar5 = dVar6;
        }
        return dVar4;
    }

    @CanIgnoreReturnValue
    public boolean b(@NullableDecl V v) {
        if (v == null) {
            v = f24846b;
        }
        if (!f24848e.a(this, (Object) null, (Object) v)) {
            return false;
        }
        a(this);
        return true;
    }

    private static V a(Object obj) throws ExecutionException {
        if (obj instanceof C0286b) {
            throw a("Task was cancelled.", ((C0286b) obj).f24853d);
        } else if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f24855b);
        } else if (obj == f24846b) {
            return null;
        } else {
            return obj;
        }
    }

    private void a(j jVar) {
        jVar.f24874b = null;
        while (true) {
            j jVar2 = this.h;
            if (jVar2 != j.f24873a) {
                j jVar3 = null;
                while (jVar2 != null) {
                    j jVar4 = jVar2.f24875c;
                    if (jVar2.f24874b != null) {
                        jVar3 = jVar2;
                    } else if (jVar3 != null) {
                        jVar3.f24875c = jVar4;
                        if (jVar3.f24874b == null) {
                        }
                    } else if (f24848e.a(this, jVar2, jVar4)) {
                    }
                    jVar2 = jVar4;
                }
                return;
            }
            return;
        }
    }

    public static Object b(q<?> qVar) {
        Object obj;
        if (qVar instanceof h) {
            Object obj2 = ((b) qVar).f24849f;
            if (obj2 instanceof C0286b) {
                C0286b bVar = (C0286b) obj2;
                if (bVar.f24852c) {
                    obj2 = bVar.f24853d != null ? new C0286b(false, bVar.f24853d) : C0286b.f24851b;
                }
            }
            return obj2;
        }
        try {
            Object a2 = l.a((Future<V>) qVar);
            if (a2 == null) {
                a2 = f24846b;
            }
            obj = a2;
        } catch (ExecutionException e2) {
            obj = new c(e2.getCause());
        } catch (CancellationException e3) {
            obj = new C0286b(false, e3);
        } catch (Throwable th) {
            obj = new c(th);
        }
        return obj;
    }

    @CanIgnoreReturnValue
    public boolean cancel(boolean z) {
        boolean z2;
        C0286b bVar;
        boolean z3;
        Object obj = this.f24849f;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !(obj instanceof f)) {
            return false;
        }
        if (f24847d) {
            bVar = new C0286b(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            bVar = C0286b.f24850a;
        } else {
            bVar = C0286b.f24851b;
        }
        boolean z4 = false;
        Object obj2 = obj;
        b bVar2 = this;
        while (true) {
            if (f24848e.a(bVar2, obj2, (Object) bVar)) {
                if (z) {
                    bVar2.c();
                }
                a(bVar2);
                if (!(obj2 instanceof f)) {
                    return true;
                }
                q<? extends V> qVar = ((f) obj2).f24866b;
                if (qVar instanceof h) {
                    bVar2 = (b) qVar;
                    obj2 = bVar2.f24849f;
                    if (obj2 == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj2 instanceof f)) {
                        return true;
                    }
                    z4 = true;
                } else {
                    qVar.cancel(z);
                    return true;
                }
            } else {
                obj2 = bVar2.f24849f;
                if (!(obj2 instanceof f)) {
                    return z4;
                }
            }
        }
    }

    public static void a(b<?> bVar) {
        d dVar = null;
        b<V> bVar2 = bVar;
        while (true) {
            bVar2.e();
            bVar2.b();
            d a2 = bVar2.a(dVar);
            while (true) {
                if (a2 != null) {
                    dVar = a2.f24859d;
                    Runnable runnable = a2.f24857b;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        b<V> bVar3 = fVar.f24865a;
                        if (bVar3.f24849f == fVar) {
                            if (f24848e.a(bVar3, (Object) fVar, b(fVar.f24866b))) {
                                bVar2 = bVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        b(runnable, a2.f24858c);
                    }
                    a2 = dVar;
                } else {
                    return;
                }
            }
        }
    }

    private void a(StringBuilder sb) {
        try {
            Object a2 = l.a((Future<V>) this);
            sb.append("SUCCESS, result=[");
            sb.append(c(a2));
            sb.append("]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private static CancellationException a(@NullableDecl String str, @NullableDecl Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f24845a;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e2);
        }
    }

    @CanIgnoreReturnValue
    public V get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        boolean z;
        boolean z2;
        long j3;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f24849f;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (!(obj instanceof f)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                return a(obj);
            }
            if (nanos > 0) {
                j3 = System.nanoTime() + nanos;
            } else {
                j3 = 0;
            }
            if (nanos >= 1000) {
                j jVar = this.h;
                if (jVar != j.f24873a) {
                    j jVar2 = new j((byte) 0);
                    do {
                        jVar2.a(jVar);
                        if (f24848e.a(this, jVar, jVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f24849f;
                                    if (obj2 != null) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (!(obj2 instanceof f)) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z5 && z6) {
                                        return a(obj2);
                                    }
                                    nanos = j3 - System.nanoTime();
                                } else {
                                    a(jVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            a(jVar2);
                        } else {
                            jVar = this.h;
                        }
                    } while (jVar != j.f24873a);
                }
                return a(this.f24849f);
            }
            while (nanos > 0) {
                Object obj3 = this.f24849f;
                if (obj3 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!(obj3 instanceof f)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 && z4) {
                    return a(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j3 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String bVar = toString();
            if (isDone()) {
                throw new TimeoutException("Waited " + r1 + " " + com.google.common.a.c.a(timeUnit.toString()) + " but future completed as timeout expired");
            }
            throw new TimeoutException("Waited " + r1 + " " + com.google.common.a.c.a(timeUnit.toString()) + " for " + bVar);
        }
        throw new InterruptedException();
    }

    public void a(Runnable runnable, Executor executor) {
        m.a(runnable, (Object) "Runnable was null.");
        m.a(executor, (Object) "Executor was null.");
        d dVar = this.g;
        if (dVar != d.f24856a) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f24859d = dVar;
                if (!f24848e.a(this, dVar, dVar2)) {
                    dVar = this.g;
                } else {
                    return;
                }
            } while (dVar != d.f24856a);
        }
        b(runnable, executor);
    }
}
