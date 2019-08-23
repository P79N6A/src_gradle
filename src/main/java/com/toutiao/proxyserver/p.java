package com.toutiao.proxyserver;

import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.toutiao.proxyserver.b.c;
import com.toutiao.proxyserver.i;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80167a;
    public static final o h = new o();
    private static volatile p m;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<Map<String, i>> f80168b = new SparseArray<>(2);

    /* renamed from: c  reason: collision with root package name */
    public final BlockingQueue<Runnable> f80169c;

    /* renamed from: d  reason: collision with root package name */
    public volatile c f80170d;

    /* renamed from: e  reason: collision with root package name */
    public volatile h f80171e;

    /* renamed from: f  reason: collision with root package name */
    public volatile g f80172f;
    public List<Object> g;
    public volatile long i = 10000;
    public volatile long j = 10000;
    public volatile long k = 10000;
    private final ExecutorService l;
    private final i.b n = new i.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f80173a;

        public final void a(final i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f80173a, false, 91686, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f80173a, false, 91686, new Class[]{i.class}, Void.TYPE);
                return;
            }
            final int g = iVar.g();
            synchronized (p.this.f80168b) {
                Map map = p.this.f80168b.get(g);
                if (map != null) {
                    map.remove(iVar.i);
                }
            }
            if (p.this.d()) {
                p.this.e();
            }
            final n nVar = Proxy.g;
            if (nVar != null) {
                com.toutiao.proxyserver.f.c.b((Runnable) new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f80175a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f80175a, false, 91687, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f80175a, false, 91687, new Class[0], Void.TYPE);
                            return;
                        }
                        nVar.a(com.toutiao.proxyserver.b.b.a(g), "preloader", iVar.f79963d.get(), 0, iVar.f79964e.get());
                    }
                });
            }
            com.toutiao.proxyserver.d.c.a("TAG_PROXY_Preloader", "afterExecute, key: " + iVar.i);
        }
    };

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f80195a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f80196b;

        /* renamed from: c  reason: collision with root package name */
        public int f80197c = p.h.f80165b;

        /* renamed from: d  reason: collision with root package name */
        public String f80198d;

        /* renamed from: e  reason: collision with root package name */
        public List<com.toutiao.proxyserver.net.c> f80199e;

        /* renamed from: f  reason: collision with root package name */
        public String[] f80200f;

        public a() {
        }
    }

    static final class b<T> extends LinkedBlockingDeque<T> {
        public static ChangeQuickRedirect changeQuickRedirect;
        private ThreadPoolExecutor executor;

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x005e, code lost:
            return offerFirst(r11);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean offer(T r11) {
            /*
                r10 = this;
                r8 = 1
                java.lang.Object[] r1 = new java.lang.Object[r8]
                r9 = 0
                r1[r9] = r11
                com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                java.lang.Class[] r6 = new java.lang.Class[r8]
                java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                r6[r9] = r2
                java.lang.Class r7 = java.lang.Boolean.TYPE
                r4 = 0
                r5 = 91697(0x16631, float:1.28495E-40)
                r2 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0039
                java.lang.Object[] r1 = new java.lang.Object[r8]
                r1[r9] = r11
                com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                r4 = 0
                r5 = 91697(0x16631, float:1.28495E-40)
                java.lang.Class[] r6 = new java.lang.Class[r8]
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                r6[r9] = r0
                java.lang.Class r7 = java.lang.Boolean.TYPE
                r2 = r10
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
            L_0x0039:
                monitor-enter(r10)
                java.util.concurrent.ThreadPoolExecutor r1 = r10.executor     // Catch:{ all -> 0x005f }
                int r1 = r1.getPoolSize()     // Catch:{ all -> 0x005f }
                java.util.concurrent.ThreadPoolExecutor r2 = r10.executor     // Catch:{ all -> 0x005f }
                int r2 = r2.getActiveCount()     // Catch:{ all -> 0x005f }
                java.util.concurrent.ThreadPoolExecutor r3 = r10.executor     // Catch:{ all -> 0x005f }
                int r3 = r3.getMaximumPoolSize()     // Catch:{ all -> 0x005f }
                if (r2 < r1) goto L_0x0059
                if (r1 >= r3) goto L_0x0059
                java.lang.String r0 = "TAG_PROXY_TT"
                java.lang.String r1 = "create new preloader thread"
                com.toutiao.proxyserver.d.c.b(r0, r1)     // Catch:{ all -> 0x005f }
                monitor-exit(r10)     // Catch:{ all -> 0x005f }
                return r9
            L_0x0059:
                monitor-exit(r10)     // Catch:{ all -> 0x005f }
                boolean r0 = r10.offerFirst(r11)
                return r0
            L_0x005f:
                r0 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x005f }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.p.b.offer(java.lang.Object):boolean");
        }

        public final void setExecutor(ThreadPoolExecutor threadPoolExecutor) {
            if (PatchProxy.isSupport(new Object[]{threadPoolExecutor}, this, changeQuickRedirect, false, 91696, new Class[]{ThreadPoolExecutor.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{threadPoolExecutor}, this, changeQuickRedirect, false, 91696, new Class[]{ThreadPoolExecutor.class}, Void.TYPE);
                return;
            }
            synchronized (this) {
                if (this.executor != null) {
                    throw new IllegalStateException("You can only call setExecutor() once!");
                } else if (threadPoolExecutor != null) {
                    this.executor = threadPoolExecutor;
                } else {
                    throw new NullPointerException("executor argument can't be null!");
                }
            }
        }
    }

    public static int f() {
        return o.f80164a;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f80167a, false, 91678, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f80167a, false, 91678, new Class[0], Void.TYPE);
            return;
        }
        com.toutiao.proxyserver.f.c.a((Runnable) new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f80184a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f80184a, false, 91689, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f80184a, false, 91689, new Class[0], Void.TYPE);
                    return;
                }
                ArrayList<i> arrayList = new ArrayList<>();
                synchronized (p.this.f80168b) {
                    int size = p.this.f80168b.size();
                    for (int i = 0; i < size; i++) {
                        Map map = p.this.f80168b.get(p.this.f80168b.keyAt(i));
                        if (map != null) {
                            arrayList.addAll(map.values());
                            map.clear();
                        }
                    }
                    p.this.f80169c.clear();
                }
                p.this.e();
                for (i iVar : arrayList) {
                    iVar.a();
                    com.toutiao.proxyserver.d.c.c("TAG_PROXY_Preloader", "PreloadTask: " + iVar + ", canceled!!!");
                }
            }
        });
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f80167a, false, 91679, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f80167a, false, 91679, new Class[0], Void.TYPE);
            return;
        }
        com.toutiao.proxyserver.f.c.a((Runnable) new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f80186a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f80186a, false, 91690, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f80186a, false, 91690, new Class[0], Void.TYPE);
                    return;
                }
                ArrayList<i> arrayList = new ArrayList<>();
                synchronized (p.this.f80168b) {
                    int size = p.this.f80168b.size();
                    for (int i = 0; i < size; i++) {
                        Map map = p.this.f80168b.get(p.this.f80168b.keyAt(i));
                        if (map != null) {
                            arrayList.addAll(map.values());
                        }
                    }
                    for (i iVar : arrayList) {
                        iVar.a();
                        com.toutiao.proxyserver.d.c.c("TAG_PROXY_Preloader", "PreloadTask: " + iVar + ", canceled!!!");
                    }
                    int size2 = p.this.f80168b.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Map map2 = p.this.f80168b.get(p.this.f80168b.keyAt(i2));
                        if (map2 != null) {
                            map2.clear();
                        }
                    }
                    p.this.f80169c.clear();
                }
                p.this.e();
            }
        });
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f80167a, false, 91681, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f80167a, false, 91681, new Class[0], Void.TYPE);
            return;
        }
        com.toutiao.proxyserver.f.c.b((Runnable) new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f80188a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f80188a, false, 91691, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f80188a, false, 91691, new Class[0], Void.TYPE);
                    return;
                }
                Iterator<Object> it2 = p.this.g.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        });
    }

    public static p a() {
        if (PatchProxy.isSupport(new Object[0], null, f80167a, true, 91670, new Class[0], p.class)) {
            return (p) PatchProxy.accessDispatch(new Object[0], null, f80167a, true, 91670, new Class[0], p.class);
        }
        if (m == null) {
            synchronized (p.class) {
                if (m == null) {
                    m = new p();
                }
            }
        }
        return m;
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f80167a, false, 91680, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f80167a, false, 91680, new Class[0], Boolean.TYPE)).booleanValue();
        }
        synchronized (this.f80168b) {
            for (int i2 = 0; i2 < this.f80168b.size(); i2++) {
                Map map = this.f80168b.get(this.f80168b.keyAt(i2));
                if (map != null && map.size() > 0) {
                    return false;
                }
            }
            return true;
        }
    }

    private p() {
        ThreadPoolExecutor threadPoolExecutor;
        int i2;
        if (h.f80166c == null) {
            h.f80166c = new b((byte) 0);
        }
        this.f80169c = h.f80166c;
        final BlockingQueue<Runnable> blockingQueue = this.f80169c;
        if (PatchProxy.isSupport(new Object[]{blockingQueue}, null, f80167a, true, 91684, new Class[]{BlockingQueue.class}, ExecutorService.class)) {
            threadPoolExecutor = (ExecutorService) PatchProxy.accessDispatch(new Object[]{blockingQueue}, null, f80167a, true, 91684, new Class[]{BlockingQueue.class}, ExecutorService.class);
        } else {
            int a2 = com.toutiao.proxyserver.f.c.a();
            if (a2 <= 0) {
                a2 = 1;
            } else if (a2 > 4) {
                a2 = 4;
            }
            if (o.f80164a == 1) {
                i2 = 1;
            } else {
                i2 = a2;
            }
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(i2, i2, 60, TimeUnit.SECONDS, blockingQueue, new ThreadFactory() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f80190a;

                public final Thread newThread(Runnable runnable) {
                    Runnable runnable2 = runnable;
                    if (PatchProxy.isSupport(new Object[]{runnable2}, this, f80190a, false, 91692, new Class[]{Runnable.class}, Thread.class)) {
                        return (Thread) PatchProxy.accessDispatch(new Object[]{runnable2}, this, f80190a, false, 91692, new Class[]{Runnable.class}, Thread.class);
                    }
                    AnonymousClass1 r2 = new Thread(runnable2) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f80191a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f80191a, false, 91693, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f80191a, false, 91693, new Class[0], Void.TYPE);
                                return;
                            }
                            try {
                                Process.setThreadPriority(10);
                            } catch (Throwable unused) {
                            }
                            super.run();
                        }
                    };
                    r2.setName("video-preload-" + r2.getId());
                    r2.setDaemon(true);
                    com.toutiao.proxyserver.d.c.b("TAG_PROXY_Preloader", "new preload thead: " + r2.getName());
                    return r2;
                }
            }, new RejectedExecutionHandler() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f80193a;

                public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                    Runnable runnable2 = runnable;
                    if (PatchProxy.isSupport(new Object[]{runnable2, threadPoolExecutor}, this, f80193a, false, 91694, new Class[]{Runnable.class, ThreadPoolExecutor.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{runnable2, threadPoolExecutor}, this, f80193a, false, 91694, new Class[]{Runnable.class, ThreadPoolExecutor.class}, Void.TYPE);
                        return;
                    }
                    try {
                        blockingQueue.offer(runnable2);
                        com.toutiao.proxyserver.d.c.b("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                    } catch (Throwable unused) {
                    }
                }
            });
            threadPoolExecutor = threadPoolExecutor2;
        }
        this.l = threadPoolExecutor;
        if (this.f80169c instanceof b) {
            ((b) this.f80169c).setExecutor((ThreadPoolExecutor) this.l);
        }
        this.g = new ArrayList();
        this.f80168b.put(0, new HashMap());
        this.f80168b.put(1, new HashMap());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.toutiao.proxyserver.i} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r12, java.lang.String r13) {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r9 = 0
            r1[r9] = r2
            r10 = 1
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = f80167a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r9] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 91677(0x1661d, float:1.28467E-40)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0047
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r1[r9] = r2
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = f80167a
            r4 = 0
            r5 = 91677(0x1661d, float:1.28467E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r9] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0047:
            r1 = 0
            android.util.SparseArray<java.util.Map<java.lang.String, com.toutiao.proxyserver.i>> r2 = r11.f80168b
            monitor-enter(r2)
            android.util.SparseArray<java.util.Map<java.lang.String, com.toutiao.proxyserver.i>> r3 = r11.f80168b     // Catch:{ all -> 0x006c }
            java.lang.Object r3 = r3.get(r12)     // Catch:{ all -> 0x006c }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x006c }
            if (r3 == 0) goto L_0x005c
            java.lang.Object r0 = r3.remove(r13)     // Catch:{ all -> 0x006c }
            r1 = r0
            com.toutiao.proxyserver.i r1 = (com.toutiao.proxyserver.i) r1     // Catch:{ all -> 0x006c }
        L_0x005c:
            monitor-exit(r2)     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x0062
            r1.a()
        L_0x0062:
            boolean r0 = r11.d()
            if (r0 == 0) goto L_0x006b
            r11.e()
        L_0x006b:
            return
        L_0x006c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.p.a(int, java.lang.String):void");
    }

    public final void a(boolean z, String str) {
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{(byte) 0, str2}, this, f80167a, false, 91676, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0, str2}, this, f80167a, false, 91676, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            com.toutiao.proxyserver.f.c.a((Runnable) new Runnable(false) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f80180a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f80180a, false, 91688, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f80180a, false, 91688, new Class[0], Void.TYPE);
                        return;
                    }
                    p.this.a(com.toutiao.proxyserver.b.b.a(false), com.toutiao.proxyserver.f.a.a(str2));
                }
            });
        }
    }

    @Deprecated
    public final void a(boolean z, int i2, String str, List<com.toutiao.proxyserver.net.c> list, String... strArr) {
        c cVar;
        i a2;
        if (z) {
            cVar = this.f80172f;
        } else {
            cVar = this.f80171e;
        }
        c cVar2 = this.f80170d;
        if (cVar == null || cVar2 == null) {
            com.toutiao.proxyserver.d.c.d("TAG_PROXY_Preloader", "cache or videoProxyDB null in Preloader!!!");
        } else if (!TextUtils.isEmpty(str) && strArr != null && strArr.length > 0) {
            if (i2 <= 0) {
                i2 = h.f80165b;
            }
            String a3 = com.toutiao.proxyserver.f.a.a(str);
            File e2 = cVar.e(a3);
            if (e2 != null && e2.length() >= ((long) i2)) {
                com.toutiao.proxyserver.d.c.b("TAG_PROXY_Preloader", "no need preload, file size: " + e2.length() + ", need preload size: " + i2);
            } else if (q.a().a(com.toutiao.proxyserver.b.b.a(z), a3)) {
                com.toutiao.proxyserver.d.c.c("TAG_PROXY_Preloader", "has pending proxy task, skip preload for key: " + str);
            } else {
                synchronized (this.f80168b) {
                    com.toutiao.proxyserver.f.c.a(list);
                    a2 = new i.a().a(cVar).a(cVar2).a(str).b(a3).a(new y(com.toutiao.proxyserver.f.c.a(strArr))).a(list).a(i2).a(this.n).a(true).a();
                    this.f80168b.get(z ? 1 : 0).put(a3, a2);
                }
                this.l.execute(a2);
            }
        }
    }
}
