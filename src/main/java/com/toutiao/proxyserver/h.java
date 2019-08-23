package com.toutiao.proxyserver;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class h extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80085a;

    /* renamed from: b  reason: collision with root package name */
    public final File f80086b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap<String, File> f80087c = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: d  reason: collision with root package name */
    public final ReentrantReadWriteLock.WriteLock f80088d = this.k.writeLock();

    /* renamed from: e  reason: collision with root package name */
    public final Set<a> f80089e = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: f  reason: collision with root package name */
    public volatile long f80090f = 104857600;
    public final b g = new b(this, (byte) 0);
    public final Executor h;
    public final Runnable i;
    public final Handler j;
    private final ReentrantReadWriteLock k = new ReentrantReadWriteLock();
    private final ReentrantReadWriteLock.ReadLock l = this.k.readLock();
    private volatile float m = 0.5f;

    public interface a {
        void a(String str);

        void a(Set<String> set);
    }

    final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f80111a;

        /* renamed from: c  reason: collision with root package name */
        private final Map<String, Integer> f80113c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<String, String> f80114d;

        private b() {
            this.f80113c = new HashMap();
            this.f80114d = new HashMap();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void a(java.lang.String r11) throws com.toutiao.proxyserver.c.a {
            /*
                r10 = this;
                monitor-enter(r10)
                r8 = 1
                java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x006e }
                r9 = 0
                r1[r9] = r11     // Catch:{ all -> 0x006e }
                com.meituan.robust.ChangeQuickRedirect r3 = f80111a     // Catch:{ all -> 0x006e }
                r4 = 0
                r5 = 91654(0x16606, float:1.28435E-40)
                java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x006e }
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r6[r9] = r2     // Catch:{ all -> 0x006e }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x006e }
                r2 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x006e }
                if (r1 == 0) goto L_0x0034
                java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x006e }
                r1[r9] = r11     // Catch:{ all -> 0x006e }
                com.meituan.robust.ChangeQuickRedirect r3 = f80111a     // Catch:{ all -> 0x006e }
                r4 = 0
                r5 = 91654(0x16606, float:1.28435E-40)
                java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x006e }
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                r6[r9] = r0     // Catch:{ all -> 0x006e }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x006e }
                r2 = r10
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x006e }
                monitor-exit(r10)
                return
            L_0x0034:
                boolean r1 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x006e }
                if (r1 != 0) goto L_0x006c
                java.util.Map<java.lang.String, java.lang.String> r1 = r10.f80114d     // Catch:{ all -> 0x006e }
                boolean r1 = r1.containsKey(r11)     // Catch:{ all -> 0x006e }
                if (r1 != 0) goto L_0x0066
                java.util.Map<java.lang.String, java.lang.Integer> r1 = r10.f80113c     // Catch:{ all -> 0x006e }
                java.lang.Object r1 = r1.get(r11)     // Catch:{ all -> 0x006e }
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x006e }
                if (r1 != 0) goto L_0x0057
                java.util.Map<java.lang.String, java.lang.Integer> r1 = r10.f80113c     // Catch:{ all -> 0x006e }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x006e }
                r1.put(r11, r2)     // Catch:{ all -> 0x006e }
                monitor-exit(r10)
                return
            L_0x0057:
                java.util.Map<java.lang.String, java.lang.Integer> r2 = r10.f80113c     // Catch:{ all -> 0x006e }
                int r1 = r1.intValue()     // Catch:{ all -> 0x006e }
                int r1 = r1 + r8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x006e }
                r2.put(r11, r1)     // Catch:{ all -> 0x006e }
                goto L_0x006c
            L_0x0066:
                com.toutiao.proxyserver.c.a r0 = new com.toutiao.proxyserver.c.a     // Catch:{ all -> 0x006e }
                r0.<init>()     // Catch:{ all -> 0x006e }
                throw r0     // Catch:{ all -> 0x006e }
            L_0x006c:
                monitor-exit(r10)
                return
            L_0x006e:
                r0 = move-exception
                monitor-exit(r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.h.b.a(java.lang.String):void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void b(java.lang.String r11) {
            /*
                r10 = this;
                monitor-enter(r10)
                r8 = 1
                java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0070 }
                r9 = 0
                r1[r9] = r11     // Catch:{ all -> 0x0070 }
                com.meituan.robust.ChangeQuickRedirect r3 = f80111a     // Catch:{ all -> 0x0070 }
                r4 = 0
                r5 = 91655(0x16607, float:1.28436E-40)
                java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0070 }
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r6[r9] = r2     // Catch:{ all -> 0x0070 }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0070 }
                r2 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0070 }
                if (r1 == 0) goto L_0x0034
                java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0070 }
                r1[r9] = r11     // Catch:{ all -> 0x0070 }
                com.meituan.robust.ChangeQuickRedirect r3 = f80111a     // Catch:{ all -> 0x0070 }
                r4 = 0
                r5 = 91655(0x16607, float:1.28436E-40)
                java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0070 }
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                r6[r9] = r0     // Catch:{ all -> 0x0070 }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0070 }
                r2 = r10
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0070 }
                monitor-exit(r10)
                return
            L_0x0034:
                boolean r1 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0070 }
                if (r1 != 0) goto L_0x006e
                java.util.Map<java.lang.String, java.lang.Integer> r1 = r10.f80113c     // Catch:{ all -> 0x0070 }
                java.lang.Object r1 = r1.get(r11)     // Catch:{ all -> 0x0070 }
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0070 }
                if (r1 == 0) goto L_0x006e
                int r2 = r1.intValue()     // Catch:{ all -> 0x0070 }
                if (r2 != r8) goto L_0x0060
                java.util.Map<java.lang.String, java.lang.Integer> r1 = r10.f80113c     // Catch:{ all -> 0x0070 }
                r1.remove(r11)     // Catch:{ all -> 0x0070 }
                java.util.Map<java.lang.String, java.lang.String> r1 = r10.f80114d     // Catch:{ all -> 0x0070 }
                java.lang.Object r0 = r1.get(r11)     // Catch:{ all -> 0x0070 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0070 }
                if (r0 == 0) goto L_0x005e
                com.toutiao.proxyserver.h r1 = com.toutiao.proxyserver.h.this     // Catch:{ all -> 0x0070 }
                r1.f(r0)     // Catch:{ all -> 0x0070 }
            L_0x005e:
                monitor-exit(r10)
                return
            L_0x0060:
                java.util.Map<java.lang.String, java.lang.Integer> r2 = r10.f80113c     // Catch:{ all -> 0x0070 }
                int r1 = r1.intValue()     // Catch:{ all -> 0x0070 }
                int r1 = r1 - r8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0070 }
                r2.put(r11, r1)     // Catch:{ all -> 0x0070 }
            L_0x006e:
                monitor-exit(r10)
                return
            L_0x0070:
                r0 = move-exception
                monitor-exit(r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.h.b.b(java.lang.String):void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void c(java.lang.String r11) {
            /*
                r10 = this;
                monitor-enter(r10)
                r8 = 1
                java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0041 }
                r9 = 0
                r1[r9] = r11     // Catch:{ all -> 0x0041 }
                com.meituan.robust.ChangeQuickRedirect r3 = f80111a     // Catch:{ all -> 0x0041 }
                r4 = 0
                r5 = 91657(0x16609, float:1.28439E-40)
                java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0041 }
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r6[r9] = r2     // Catch:{ all -> 0x0041 }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0041 }
                r2 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0041 }
                if (r1 == 0) goto L_0x0034
                java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0041 }
                r1[r9] = r11     // Catch:{ all -> 0x0041 }
                com.meituan.robust.ChangeQuickRedirect r3 = f80111a     // Catch:{ all -> 0x0041 }
                r4 = 0
                r5 = 91657(0x16609, float:1.28439E-40)
                java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0041 }
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                r6[r9] = r0     // Catch:{ all -> 0x0041 }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0041 }
                r2 = r10
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0041 }
                monitor-exit(r10)
                return
            L_0x0034:
                boolean r1 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0041 }
                if (r1 != 0) goto L_0x003f
                java.util.Map<java.lang.String, java.lang.String> r1 = r10.f80114d     // Catch:{ all -> 0x0041 }
                r1.remove(r11)     // Catch:{ all -> 0x0041 }
            L_0x003f:
                monitor-exit(r10)
                return
            L_0x0041:
                r0 = move-exception
                monitor-exit(r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.h.b.c(java.lang.String):void");
        }

        /* access modifiers changed from: package-private */
        public final synchronized boolean d(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f80111a, false, 91658, new Class[]{String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f80111a, false, 91658, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            } else if (TextUtils.isEmpty(str)) {
                return false;
            } else {
                return this.f80113c.containsKey(str);
            }
        }

        /* synthetic */ b(h hVar, byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void a(java.lang.String r12, java.lang.String r13) {
            /*
                r11 = this;
                monitor-enter(r11)
                r8 = 2
                java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0068 }
                r9 = 0
                r1[r9] = r12     // Catch:{ all -> 0x0068 }
                r10 = 1
                r1[r10] = r13     // Catch:{ all -> 0x0068 }
                com.meituan.robust.ChangeQuickRedirect r3 = f80111a     // Catch:{ all -> 0x0068 }
                r4 = 0
                r5 = 91656(0x16608, float:1.28437E-40)
                java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0068 }
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r6[r9] = r2     // Catch:{ all -> 0x0068 }
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r6[r10] = r2     // Catch:{ all -> 0x0068 }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0068 }
                r2 = r11
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0068 }
                if (r1 == 0) goto L_0x0041
                java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0068 }
                r1[r9] = r12     // Catch:{ all -> 0x0068 }
                r1[r10] = r13     // Catch:{ all -> 0x0068 }
                com.meituan.robust.ChangeQuickRedirect r3 = f80111a     // Catch:{ all -> 0x0068 }
                r4 = 0
                r5 = 91656(0x16608, float:1.28437E-40)
                java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0068 }
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                r6[r9] = r0     // Catch:{ all -> 0x0068 }
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                r6[r10] = r0     // Catch:{ all -> 0x0068 }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0068 }
                r2 = r11
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0068 }
                monitor-exit(r11)
                return
            L_0x0041:
                boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0068 }
                if (r1 != 0) goto L_0x0066
                java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0068 }
                r1.<init>(r12)     // Catch:{ all -> 0x0068 }
                java.util.Map<java.lang.String, java.lang.Integer> r2 = r11.f80113c     // Catch:{ all -> 0x0068 }
                boolean r2 = r2.containsKey(r12)     // Catch:{ all -> 0x0068 }
                if (r2 == 0) goto L_0x0061
                boolean r1 = r1.exists()     // Catch:{ all -> 0x0068 }
                if (r1 == 0) goto L_0x0061
                java.util.Map<java.lang.String, java.lang.String> r1 = r11.f80114d     // Catch:{ all -> 0x0068 }
                r1.put(r12, r13)     // Catch:{ all -> 0x0068 }
                monitor-exit(r11)
                return
            L_0x0061:
                com.toutiao.proxyserver.h r0 = com.toutiao.proxyserver.h.this     // Catch:{ all -> 0x0068 }
                r0.f(r13)     // Catch:{ all -> 0x0068 }
            L_0x0066:
                monitor-exit(r11)
                return
            L_0x0068:
                r0 = move-exception
                monitor-exit(r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.h.b.a(java.lang.String, java.lang.String):void");
        }
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f80085a, false, 91634, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f80085a, false, 91634, new Class[0], Void.TYPE);
            return;
        }
        this.j.removeCallbacks(this.i);
        this.j.postDelayed(this.i, 10000);
    }

    public final String a(File file) {
        if (!PatchProxy.isSupport(new Object[]{file}, this, f80085a, false, 91645, new Class[]{File.class}, String.class)) {
            return file.getName();
        }
        return (String) PatchProxy.accessDispatch(new Object[]{file}, this, f80085a, false, 91645, new Class[]{File.class}, String.class);
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f80085a, false, 91638, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f80085a, false, 91638, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.g.b(str2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f80085a, false, 91639, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f80085a, false, 91639, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.g.a(com.toutiao.proxyserver.f.a.a(str), str2);
        }
    }

    /* access modifiers changed from: package-private */
    public final File d(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f80085a, false, 91641, new Class[]{String.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{str}, this, f80085a, false, 91641, new Class[]{String.class}, File.class);
        }
        this.l.lock();
        File file = this.f80087c.get(str);
        this.l.unlock();
        if (file != null) {
            return file;
        }
        File file2 = new File(this.f80086b, str);
        this.f80088d.lock();
        this.f80087c.put(str, file2);
        this.f80088d.unlock();
        for (a a2 : this.f80089e) {
            a2.a(str);
        }
        a();
        return file2;
    }

    /* access modifiers changed from: package-private */
    public final File e(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f80085a, false, 91642, new Class[]{String.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{str}, this, f80085a, false, 91642, new Class[]{String.class}, File.class);
        } else if (!this.l.tryLock()) {
            return null;
        } else {
            File file = this.f80087c.get(str);
            this.l.unlock();
            return file;
        }
    }

    public final void f(final String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f80085a, false, 91636, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f80085a, false, 91636, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            p.a().a(false, str);
            this.j.removeCallbacks(this.i);
            this.h.execute(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f80105a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f80105a, false, 91652, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f80105a, false, 91652, new Class[0], Void.TYPE);
                        return;
                    }
                    HashSet hashSet = null;
                    String a2 = com.toutiao.proxyserver.f.a.a(str);
                    h.this.f80088d.lock();
                    try {
                        File file = h.this.f80087c.get(a2);
                        if (file != null && !h.this.g.d(h.this.a(file)) && file.delete()) {
                            hashSet = new HashSet(1);
                            hashSet.add(a2);
                            h.this.f80087c.remove(a2);
                            h.this.g.c(a2);
                        }
                        if (hashSet != null) {
                            for (a a3 : h.this.f80089e) {
                                a3.a((Set<String>) hashSet);
                            }
                        }
                    } finally {
                        h.this.f80088d.unlock();
                    }
                }
            });
        }
    }

    public h(File file) throws IOException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new ArrayBlockingQueue(4), new ThreadFactory() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f80091a;

            public final Thread newThread(Runnable runnable) {
                Runnable runnable2 = runnable;
                if (PatchProxy.isSupport(new Object[]{runnable2}, this, f80091a, false, 91646, new Class[]{Runnable.class}, Thread.class)) {
                    return (Thread) PatchProxy.accessDispatch(new Object[]{runnable2}, this, f80091a, false, 91646, new Class[]{Runnable.class}, Thread.class);
                }
                Thread thread = new Thread(runnable2);
                thread.setName("DiskLruCache-cleanup-" + thread.getId());
                thread.setDaemon(true);
                return thread;
            }
        }, new RejectedExecutionHandler() {
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        });
        this.h = threadPoolExecutor;
        this.i = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f80094a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f80094a, false, 91647, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f80094a, false, 91647, new Class[0], Void.TYPE);
                    return;
                }
                h.this.h.execute(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f80096a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f80096a, false, 91648, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f80096a, false, 91648, new Class[0], Void.TYPE);
                            return;
                        }
                        h.this.a(h.this.f80090f);
                    }
                });
            }
        };
        this.j = new Handler(Looper.getMainLooper());
        if (!file.exists() || !file.isDirectory() || !file.canRead() || !file.canWrite()) {
            String str = "exists: " + file.exists() + ", isDirectory: " + file.isDirectory() + ", canRead: " + file.canRead() + ", canWrite: " + file.canWrite();
            throw new IOException("dir error!  " + str);
        }
        this.f80086b = file;
        this.h.execute(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f80098a;

            /* JADX INFO: finally extract failed */
            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f80098a, false, 91649, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f80098a, false, 91649, new Class[0], Void.TYPE);
                    return;
                }
                h hVar = h.this;
                if (PatchProxy.isSupport(new Object[0], hVar, h.f80085a, false, 91632, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], hVar, h.f80085a, false, 91632, new Class[0], Void.TYPE);
                    return;
                }
                hVar.f80088d.lock();
                try {
                    File[] listFiles = hVar.f80086b.listFiles();
                    if (listFiles != null && listFiles.length > 0) {
                        HashMap hashMap = new HashMap(listFiles.length);
                        ArrayList arrayList = new ArrayList(listFiles.length);
                        for (File file : listFiles) {
                            if (file.isFile()) {
                                arrayList.add(file);
                                hashMap.put(file, Long.valueOf(file.lastModified()));
                            }
                        }
                        Collections.sort(arrayList, new Comparator<File>(hashMap) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f80100a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ HashMap f80101b;

                            {
                                this.f80101b = r2;
                            }

                            public final /* synthetic */ int compare(Object obj, Object obj2) {
                                File file = (File) obj;
                                File file2 = (File) obj2;
                                if (PatchProxy.isSupport(new Object[]{file, file2}, this, f80100a, false, 91650, new Class[]{File.class, File.class}, Integer.TYPE)) {
                                    return ((Integer) PatchProxy.accessDispatch(new Object[]{file, file2}, this, f80100a, false, 91650, new Class[]{File.class, File.class}, Integer.TYPE)).intValue();
                                }
                                long longValue = ((Long) this.f80101b.get(file)).longValue() - ((Long) this.f80101b.get(file2)).longValue();
                                if (longValue < 0) {
                                    return -1;
                                }
                                if (longValue > 0) {
                                    return 1;
                                }
                                return 0;
                            }
                        });
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            File file2 = (File) it2.next();
                            hVar.f80087c.put(hVar.a(file2), file2);
                        }
                    }
                    hVar.f80088d.unlock();
                    hVar.a();
                } catch (Throwable th) {
                    hVar.f80088d.unlock();
                    throw th;
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) throws com.toutiao.proxyserver.c.a {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f80085a, false, 91637, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f80085a, false, 91637, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.g.a(str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0107, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0108, code lost:
        r8.f80088d.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010e, code lost:
        r6 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0107 A[ExcHandler: all (r0v6 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:5:0x004c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r16) {
        /*
            r15 = this;
            r8 = r15
            r9 = r16
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r9)
            r11 = 0
            r1[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f80085a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r2 = java.lang.Long.TYPE
            r6[r11] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 91644(0x165fc, float:1.2842E-40)
            r2 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x003f
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r9)
            r1[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f80085a
            r4 = 0
            r5 = 91644(0x165fc, float:1.2842E-40)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Long.TYPE
            r6[r11] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x003f:
            r0 = 0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r8.f80088d
            r2.lock()
            r2 = 0
            java.util.LinkedHashMap<java.lang.String, java.io.File> r4 = r8.f80087c     // Catch:{ Throwable -> 0x010e, all -> 0x0107 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ Throwable -> 0x010e, all -> 0x0107 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Throwable -> 0x010e, all -> 0x0107 }
        L_0x0056:
            boolean r5 = r4.hasNext()     // Catch:{ Throwable -> 0x010e, all -> 0x0107 }
            if (r5 == 0) goto L_0x006f
            java.lang.Object r5 = r4.next()     // Catch:{ Throwable -> 0x010e, all -> 0x0107 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ Throwable -> 0x010e, all -> 0x0107 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ Throwable -> 0x010e, all -> 0x0107 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ Throwable -> 0x010e, all -> 0x0107 }
            long r5 = r5.length()     // Catch:{ Throwable -> 0x010e, all -> 0x0107 }
            r7 = 0
            long r2 = r2 + r5
            goto L_0x0056
        L_0x006f:
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x0079
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r8.f80088d
            r0.unlock()
            return
        L_0x0079:
            float r4 = (float) r9
            float r5 = r8.m     // Catch:{ Throwable -> 0x010e, all -> 0x0107 }
            float r4 = r4 * r5
            long r4 = (long) r4     // Catch:{ Throwable -> 0x010e, all -> 0x0107 }
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ Throwable -> 0x010e, all -> 0x0107 }
            r6.<init>()     // Catch:{ Throwable -> 0x010e, all -> 0x0107 }
            java.util.LinkedHashMap<java.lang.String, java.io.File> r0 = r8.f80087c     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
        L_0x008e:
            boolean r7 = r0.hasNext()     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            if (r7 == 0) goto L_0x00f1
            java.lang.Object r7 = r0.next()     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            java.lang.Object r9 = r7.getValue()     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            java.io.File r9 = (java.io.File) r9     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            if (r9 == 0) goto L_0x00e5
            boolean r10 = r9.exists()     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            if (r10 == 0) goto L_0x00e5
            com.toutiao.proxyserver.h$b r10 = r8.g     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            java.lang.String r11 = r15.a((java.io.File) r9)     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            boolean r10 = r10.d(r11)     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            if (r10 != 0) goto L_0x00ec
            long r10 = r9.length()     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            java.io.File r12 = new java.io.File     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            r13.<init>()     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            java.lang.String r14 = r9.getAbsolutePath()     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            r13.append(r14)     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            java.lang.String r14 = "-tmp"
            r13.append(r14)     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            java.lang.String r13 = r13.toString()     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            r12.<init>(r13)     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            boolean r9 = r9.renameTo(r12)     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            if (r9 == 0) goto L_0x00ec
            r1.add(r12)     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            r9 = 0
            long r2 = r2 - r10
            java.lang.Object r7 = r7.getKey()     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            r6.add(r7)     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            goto L_0x00ec
        L_0x00e5:
            java.lang.Object r7 = r7.getKey()     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            r6.add(r7)     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
        L_0x00ec:
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x00f1
            goto L_0x008e
        L_0x00f1:
            java.util.Iterator r0 = r6.iterator()     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
        L_0x00f5:
            boolean r2 = r0.hasNext()     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            if (r2 == 0) goto L_0x010f
            java.lang.Object r2 = r0.next()     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            java.util.LinkedHashMap<java.lang.String, java.io.File> r3 = r8.f80087c     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            r3.remove(r2)     // Catch:{ Throwable -> 0x010f, all -> 0x0107 }
            goto L_0x00f5
        L_0x0107:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r8.f80088d
            r1.unlock()
            throw r0
        L_0x010e:
            r6 = r0
        L_0x010f:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r8.f80088d
            r0.unlock()
            java.util.Set<com.toutiao.proxyserver.h$a> r0 = r8.f80089e
            java.util.Iterator r0 = r0.iterator()
        L_0x011a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x012a
            java.lang.Object r2 = r0.next()
            com.toutiao.proxyserver.h$a r2 = (com.toutiao.proxyserver.h.a) r2
            r2.a((java.util.Set<java.lang.String>) r6)
            goto L_0x011a
        L_0x012a:
            java.util.concurrent.Executor r0 = r8.h
            com.toutiao.proxyserver.h$8 r2 = new com.toutiao.proxyserver.h$8
            r2.<init>(r1)
            r0.execute(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.h.a(long):void");
    }
}
