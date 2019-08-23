package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class i<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f1051a = c.a();

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f1052b = b.f1030a.f1034b;

    /* renamed from: c  reason: collision with root package name */
    private static final Executor f1053c = c.f1035a.f1036b;

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f1054d;
    private static i<?> m = new i<>((TResult) null);
    private static i<Boolean> n = new i<>((TResult) Boolean.TRUE);
    private static i<Boolean> o = new i<>((TResult) Boolean.FALSE);
    private static i<?> p = new i<>(true);

    /* renamed from: e  reason: collision with root package name */
    private final Object f1055e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private boolean f1056f;
    private boolean g;
    private TResult h;
    private Exception i;
    private boolean j;
    private k k;
    private List<g<TResult, Void>> l = new ArrayList();

    public interface a {
    }

    public static a a() {
        return f1054d;
    }

    public static <TResult> i<TResult> h() {
        return p;
    }

    public final boolean a(long j2, TimeUnit timeUnit) throws InterruptedException {
        boolean b2;
        synchronized (this.f1055e) {
            if (!b()) {
                this.f1055e.wait(timeUnit.toMillis(j2));
            }
            b2 = b();
        }
        return b2;
    }

    public final <TContinuationResult> i<TContinuationResult> a(g<TResult, TContinuationResult> gVar, Executor executor) {
        return a(gVar, executor, (d) null);
    }

    public final <TContinuationResult> i<TContinuationResult> a(g<TResult, TContinuationResult> gVar, Executor executor, d dVar) {
        boolean b2;
        j jVar = new j();
        synchronized (this.f1055e) {
            b2 = b();
            if (!b2) {
                List<g<TResult, Void>> list = this.l;
                final j jVar2 = jVar;
                final g<TResult, TContinuationResult> gVar2 = gVar;
                final Executor executor2 = executor;
                final d dVar2 = dVar;
                AnonymousClass2 r0 = new g<TResult, Void>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void then(i<TResult> iVar) {
                        i.a(jVar2, gVar2, iVar, executor2, dVar2);
                        return null;
                    }
                };
                list.add(r0);
            }
        }
        if (b2) {
            a(jVar, gVar, this, executor, dVar);
        }
        return jVar.f1091a;
    }

    public final TResult e() {
        TResult tresult;
        synchronized (this.f1055e) {
            tresult = this.h;
        }
        return tresult;
    }

    i() {
    }

    public final boolean d() {
        boolean z;
        synchronized (this.f1055e) {
            if (f() != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final Exception f() {
        Exception exc;
        synchronized (this.f1055e) {
            if (this.i != null) {
                this.j = true;
                if (this.k != null) {
                    this.k.f1092a = null;
                    this.k = null;
                }
            }
            exc = this.i;
        }
        return exc;
    }

    public final void g() throws InterruptedException {
        synchronized (this.f1055e) {
            if (!b()) {
                this.f1055e.wait();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        synchronized (this.f1055e) {
            if (this.f1056f) {
                return false;
            }
            this.f1056f = true;
            this.g = true;
            this.f1055e.notifyAll();
            j();
            return true;
        }
    }

    private void j() {
        synchronized (this.f1055e) {
            for (g then : this.l) {
                try {
                    then.then(this);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            }
            this.l = null;
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.f1055e) {
            z = this.g;
        }
        return z;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.f1055e) {
            z = this.f1056f;
        }
        return z;
    }

    public static <TResult> i<TResult> a(Callable<TResult> callable) {
        return a(callable, (Executor) f1051a, (d) null);
    }

    public static <TResult> i<TResult> b(Callable<TResult> callable) {
        return a(callable, f1053c, (d) null);
    }

    public final <TContinuationResult> i<TContinuationResult> c(g<TResult, TContinuationResult> gVar) {
        return c(gVar, f1053c, null);
    }

    public static <TResult> i<TResult> a(Exception exc) {
        j jVar = new j();
        jVar.b(exc);
        return jVar.f1091a;
    }

    public final <TContinuationResult> i<TContinuationResult> b(g<TResult, i<TContinuationResult>> gVar) {
        return b(gVar, f1053c, null);
    }

    public static <TResult> i<List<TResult>> a(final Collection<? extends i<TResult>> collection) {
        return b(collection).c(new g<Void, List<TResult>>() {
            public final /* synthetic */ Object then(i iVar) throws Exception {
                if (collection.size() == 0) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (i e2 : collection) {
                    arrayList.add(e2.e());
                }
                return arrayList;
            }
        });
    }

    private i(TResult tresult) {
        b(tresult);
    }

    public static i<Void> a(long j2) {
        ScheduledExecutorService b2 = c.b();
        if (j2 <= 0) {
            return a((TResult) null);
        }
        final j jVar = new j();
        b2.schedule(new Runnable() {
            public final void run() {
                jVar.a(null);
            }
        }, j2, TimeUnit.MILLISECONDS);
        return jVar.f1091a;
    }

    private i(boolean z) {
        i();
    }

    public static <TResult> i<TResult> a(TResult tresult) {
        if (tresult == null) {
            return m;
        }
        if (!(tresult instanceof Boolean)) {
            j jVar = new j();
            jVar.b(tresult);
            return jVar.f1091a;
        } else if (((Boolean) tresult).booleanValue()) {
            return n;
        } else {
            return o;
        }
    }

    public static i<Void> b(Collection<? extends i<?>> collection) {
        if (collection.size() == 0) {
            return a((TResult) null);
        }
        j jVar = new j();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (i a2 : collection) {
            final Object obj2 = obj;
            final ArrayList arrayList2 = arrayList;
            final AtomicBoolean atomicBoolean2 = atomicBoolean;
            final AtomicInteger atomicInteger2 = atomicInteger;
            final j jVar2 = jVar;
            AnonymousClass10 r0 = new g<Object, Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void then(i<Object> iVar) {
                    if (iVar.d()) {
                        synchronized (obj2) {
                            arrayList2.add(iVar.f());
                        }
                    }
                    if (iVar.c()) {
                        atomicBoolean2.set(true);
                    }
                    if (atomicInteger2.decrementAndGet() == 0) {
                        if (arrayList2.size() != 0) {
                            if (arrayList2.size() == 1) {
                                jVar2.b((Exception) arrayList2.get(0));
                            } else {
                                jVar2.b((Exception) new a(String.format("There were %d exceptions.", new Object[]{Integer.valueOf(arrayList2.size())}), (List) arrayList2));
                            }
                        } else if (atomicBoolean2.get()) {
                            jVar2.b();
                        } else {
                            jVar2.b(null);
                        }
                    }
                    return null;
                }
            };
            a2.a((g<TResult, TContinuationResult>) r0);
        }
        return jVar.f1091a;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(java.lang.Exception r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1055e
            monitor-enter(r0)
            boolean r1 = r3.f1056f     // Catch:{ all -> 0x002c }
            r2 = 0
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r2
        L_0x000a:
            r1 = 1
            r3.f1056f = r1     // Catch:{ all -> 0x002c }
            r3.i = r4     // Catch:{ all -> 0x002c }
            r3.j = r2     // Catch:{ all -> 0x002c }
            java.lang.Object r4 = r3.f1055e     // Catch:{ all -> 0x002c }
            r4.notifyAll()     // Catch:{ all -> 0x002c }
            r3.j()     // Catch:{ all -> 0x002c }
            boolean r4 = r3.j     // Catch:{ all -> 0x002c }
            if (r4 != 0) goto L_0x002a
            a.i$a r4 = a()     // Catch:{ all -> 0x002c }
            if (r4 == 0) goto L_0x002a
            a.k r4 = new a.k     // Catch:{ all -> 0x002c }
            r4.<init>(r3)     // Catch:{ all -> 0x002c }
            r3.k = r4     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r1
        L_0x002c:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.b(java.lang.Exception):boolean");
    }

    /* access modifiers changed from: package-private */
    public final boolean b(TResult tresult) {
        synchronized (this.f1055e) {
            if (this.f1056f) {
                return false;
            }
            this.f1056f = true;
            this.h = tresult;
            this.f1055e.notifyAll();
            j();
            return true;
        }
    }

    public final <TContinuationResult> i<TContinuationResult> a(g<TResult, TContinuationResult> gVar) {
        return a(gVar, f1053c, (d) null);
    }

    public final <TContinuationResult> i<TContinuationResult> c(g<TResult, TContinuationResult> gVar, Executor executor) {
        return c(gVar, executor, null);
    }

    public static <TResult> i<TResult> a(Callable<TResult> callable, d dVar) {
        return a(callable, (Executor) f1051a, dVar);
    }

    public final <TContinuationResult> i<TContinuationResult> b(g<TResult, i<TContinuationResult>> gVar, Executor executor) {
        return b(gVar, executor, null);
    }

    public static <TResult> i<TResult> a(Callable<TResult> callable, Executor executor) {
        return a(callable, executor, (d) null);
    }

    private <TContinuationResult> i<TContinuationResult> c(final g<TResult, TContinuationResult> gVar, Executor executor, d dVar) {
        return b(new g<TResult, i<TContinuationResult>>(null) {
            public final /* synthetic */ Object then(i iVar) throws Exception {
                if (null != null && null.a()) {
                    return i.h();
                }
                if (iVar.d()) {
                    return i.a(iVar.f());
                }
                if (iVar.c()) {
                    return i.h();
                }
                return iVar.a(gVar);
            }
        }, executor);
    }

    private <TContinuationResult> i<TContinuationResult> b(g<TResult, i<TContinuationResult>> gVar, Executor executor, d dVar) {
        boolean b2;
        j jVar = new j();
        synchronized (this.f1055e) {
            b2 = b();
            if (!b2) {
                List<g<TResult, Void>> list = this.l;
                final j jVar2 = jVar;
                final g<TResult, i<TContinuationResult>> gVar2 = gVar;
                final Executor executor2 = executor;
                AnonymousClass3 r0 = new g<TResult, Void>(null) {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void then(i<TResult> iVar) {
                        i.b(jVar2, gVar2, iVar, executor2, null);
                        return null;
                    }
                };
                list.add(r0);
            }
        }
        if (b2) {
            b(jVar, gVar, this, executor, null);
        }
        return jVar.f1091a;
    }

    private static <TResult> i<TResult> a(final Callable<TResult> callable, Executor executor, final d dVar) {
        final j jVar = new j();
        try {
            executor.execute(new Runnable() {
                public final void run() {
                    if (dVar == null || !dVar.a()) {
                        try {
                            jVar.b(callable.call());
                        } catch (CancellationException unused) {
                            jVar.b();
                        } catch (Exception e2) {
                            jVar.b(e2);
                        }
                    } else {
                        jVar.b();
                    }
                }
            });
        } catch (Exception e2) {
            jVar.b((Exception) new h(e2));
        }
        return jVar.f1091a;
    }

    public static <TContinuationResult, TResult> void b(final j<TContinuationResult> jVar, final g<TResult, i<TContinuationResult>> gVar, final i<TResult> iVar, Executor executor, final d dVar) {
        try {
            executor.execute(new Runnable() {
                public final void run() {
                    if (dVar == null || !dVar.a()) {
                        try {
                            i iVar = (i) gVar.then(iVar);
                            if (iVar == null) {
                                jVar.b(null);
                            } else {
                                iVar.a((g<TResult, TContinuationResult>) new g<TContinuationResult, Void>() {
                                    public final /* synthetic */ Object then(i iVar) throws Exception {
                                        if (dVar != null && dVar.a()) {
                                            jVar.b();
                                        } else if (iVar.c()) {
                                            jVar.b();
                                        } else if (iVar.d()) {
                                            jVar.b(iVar.f());
                                        } else {
                                            jVar.b(iVar.e());
                                        }
                                        return null;
                                    }
                                });
                            }
                        } catch (CancellationException unused) {
                            jVar.b();
                        } catch (Exception e2) {
                            jVar.b(e2);
                        }
                    } else {
                        jVar.b();
                    }
                }
            });
        } catch (Exception e2) {
            jVar.b((Exception) new h(e2));
        }
    }

    public static <TContinuationResult, TResult> void a(final j<TContinuationResult> jVar, final g<TResult, TContinuationResult> gVar, final i<TResult> iVar, Executor executor, final d dVar) {
        try {
            executor.execute(new Runnable() {
                public final void run() {
                    if (dVar == null || !dVar.a()) {
                        try {
                            jVar.b(gVar.then(iVar));
                        } catch (CancellationException unused) {
                            jVar.b();
                        } catch (Exception e2) {
                            jVar.b(e2);
                        }
                    } else {
                        jVar.b();
                    }
                }
            });
        } catch (Exception e2) {
            jVar.b((Exception) new h(e2));
        }
    }
}
