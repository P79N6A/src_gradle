package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public final class k<T> {

    /* renamed from: a  reason: collision with root package name */
    public Executor f4884a;

    /* renamed from: b  reason: collision with root package name */
    final Set<h<T>> f4885b;

    /* renamed from: c  reason: collision with root package name */
    public final FutureTask<j<T>> f4886c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public volatile j<T> f4887d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private Thread f4888e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<h<Throwable>> f4889f;
    private final Handler g;

    private boolean c() {
        if (this.f4888e == null || !this.f4888e.isAlive()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void b() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.c()     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001c
            com.airbnb.lottie.j<T> r0 = r2.f4887d     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x000c
            goto L_0x001c
        L_0x000c:
            com.airbnb.lottie.k$2 r0 = new com.airbnb.lottie.k$2     // Catch:{ all -> 0x001e }
            java.lang.String r1 = "LottieTaskObserver"
            r0.<init>(r1)     // Catch:{ all -> 0x001e }
            r2.f4888e = r0     // Catch:{ all -> 0x001e }
            java.lang.Thread r0 = r2.f4888e     // Catch:{ all -> 0x001e }
            r0.start()     // Catch:{ all -> 0x001e }
            monitor-exit(r2)
            return
        L_0x001c:
            monitor-exit(r2)
            return
        L_0x001e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.k.b():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.c()     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r1)
            return
        L_0x0009:
            java.util.Set<com.airbnb.lottie.h<T>> r0 = r1.f4885b     // Catch:{ all -> 0x001f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x0015
            com.airbnb.lottie.j<T> r0 = r1.f4887d     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x001d
        L_0x0015:
            java.lang.Thread r0 = r1.f4888e     // Catch:{ all -> 0x001f }
            r0.interrupt()     // Catch:{ all -> 0x001f }
            r0 = 0
            r1.f4888e = r0     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r1)
            return
        L_0x001f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.k.a():void");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public k(Callable<j<T>> callable) {
        this(callable, false);
    }

    public final synchronized k<T> b(h<T> hVar) {
        this.f4885b.remove(hVar);
        a();
        return this;
    }

    public final synchronized k<T> d(h<T> hVar) {
        this.f4889f.remove(hVar);
        a();
        return this;
    }

    public final synchronized k<T> a(h<T> hVar) {
        if (!(this.f4887d == null || this.f4887d.f4882a == null)) {
            hVar.a(this.f4887d.f4882a);
        }
        this.f4885b.add(hVar);
        b();
        return this;
    }

    public final synchronized k<T> c(h<Throwable> hVar) {
        if (!(this.f4887d == null || this.f4887d.f4883b == null)) {
            hVar.a(this.f4887d.f4883b);
        }
        this.f4889f.add(hVar);
        b();
        return this;
    }

    public final void a(@Nullable j<T> jVar) {
        if (this.f4887d == null) {
            this.f4887d = jVar;
            this.g.post(new Runnable() {
                public final void run() {
                    if (k.this.f4887d != null && !k.this.f4886c.isCancelled()) {
                        j<T> jVar = k.this.f4887d;
                        if (jVar.f4882a != null) {
                            k kVar = k.this;
                            V v = jVar.f4882a;
                            for (h a2 : new ArrayList(kVar.f4885b)) {
                                a2.a(v);
                            }
                            return;
                        }
                        k.this.a(jVar.f4883b);
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public final void a(Throwable th) {
        ArrayList<h> arrayList = new ArrayList<>(this.f4889f);
        if (!arrayList.isEmpty()) {
            for (h a2 : arrayList) {
                a2.a(th);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    private k(Callable<j<T>> callable, boolean z) {
        this.f4884a = Executors.newCachedThreadPool();
        this.f4885b = new LinkedHashSet(1);
        this.f4889f = new LinkedHashSet(1);
        this.g = new Handler(Looper.getMainLooper());
        this.f4887d = null;
        this.f4886c = new FutureTask<>(callable);
        this.f4884a.execute(this.f4886c);
        b();
    }
}
