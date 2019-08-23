package com.toutiao.proxyserver;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.toutiao.proxyserver.d.c;
import com.toutiao.proxyserver.s;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class d implements Runnable, Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80028a;

    /* renamed from: e  reason: collision with root package name */
    private static final ExecutorService f80029e;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f80030b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f80031c = Proxy.u;

    /* renamed from: d  reason: collision with root package name */
    private BlockingQueue<a> f80032d;

    /* renamed from: f  reason: collision with root package name */
    private s f80033f;
    private s.a g;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f80035a;
        static final Queue<a> g = new LinkedBlockingQueue(16);

        /* renamed from: b  reason: collision with root package name */
        s f80036b;

        /* renamed from: c  reason: collision with root package name */
        byte[] f80037c;

        /* renamed from: d  reason: collision with root package name */
        int f80038d;

        /* renamed from: e  reason: collision with root package name */
        int f80039e;

        /* renamed from: f  reason: collision with root package name */
        public int f80040f;

        private a() {
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f80035a, false, 91613, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f80035a, false, 91613, new Class[0], Void.TYPE);
                return;
            }
            if (this.f80036b != null) {
                this.f80036b.a();
            }
        }

        public final s a() throws s.a {
            if (PatchProxy.isSupport(new Object[0], this, f80035a, false, 91612, new Class[0], s.class)) {
                return (s) PatchProxy.accessDispatch(new Object[0], this, f80035a, false, 91612, new Class[0], s.class);
            }
            if (this.f80036b != null) {
                try {
                    this.f80036b.a(this.f80037c, this.f80038d, this.f80039e);
                } catch (s.a e2) {
                    this.f80036b.a();
                    throw e2;
                }
            }
            return this.f80036b;
        }

        static a a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f80035a, true, 91614, new Class[]{Integer.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f80035a, true, 91614, new Class[]{Integer.TYPE}, a.class);
            }
            a poll = g.poll();
            if (poll == null) {
                poll = new a();
            }
            a aVar = poll;
            aVar.f80040f = i;
            return aVar;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 10, 60, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f80034a;

            public final Thread newThread(Runnable runnable) {
                Runnable runnable2 = runnable;
                if (PatchProxy.isSupport(new Object[]{runnable2}, this, f80034a, false, 91611, new Class[]{Runnable.class}, Thread.class)) {
                    return (Thread) PatchProxy.accessDispatch(new Object[]{runnable2}, this, f80034a, false, 91611, new Class[]{Runnable.class}, Thread.class);
                }
                Thread thread = new Thread(runnable2);
                thread.setName("video-cache-writer-" + thread.getId());
                return thread;
            }
        });
        f80029e = threadPoolExecutor;
    }

    public final Future<Void> b() {
        if (PatchProxy.isSupport(new Object[0], this, f80028a, false, 91608, new Class[0], Future.class)) {
            return (Future) PatchProxy.accessDispatch(new Object[0], this, f80028a, false, 91608, new Class[0], Future.class);
        } else if (!this.f80031c || this.f80030b) {
            return null;
        } else {
            this.f80030b = true;
            try {
                return f80029e.submit(this);
            } catch (Exception unused) {
                this.f80031c = false;
                return null;
            }
        }
    }

    public final /* synthetic */ Object call() throws Exception {
        if (PatchProxy.isSupport(new Object[0], this, f80028a, false, 91610, new Class[0], Void.class)) {
            return (Void) PatchProxy.accessDispatch(new Object[0], this, f80028a, false, 91610, new Class[0], Void.class);
        }
        run();
        return null;
    }

    public final void a() {
        a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f80028a, false, 91606, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f80028a, false, 91606, new Class[0], Void.TYPE);
        } else if (!this.f80031c || this.f80032d == null || !this.f80030b) {
            if (this.f80033f != null) {
                this.f80033f.a();
            }
        } else {
            this.f80032d.clear();
            BlockingQueue<a> blockingQueue = this.f80032d;
            s sVar = this.f80033f;
            if (PatchProxy.isSupport(new Object[]{sVar}, null, a.f80035a, true, 91618, new Class[]{s.class}, a.class)) {
                aVar = (a) PatchProxy.accessDispatch(new Object[]{sVar}, null, a.f80035a, true, 91618, new Class[]{s.class}, a.class);
            } else {
                aVar = a.a(2);
                aVar.f80036b = sVar;
            }
            blockingQueue.offer(aVar);
        }
    }

    public final void run() {
        a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f80028a, false, 91609, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f80028a, false, 91609, new Class[0], Void.TYPE);
            return;
        }
        while (this.f80030b) {
            try {
                aVar = this.f80032d.poll(1000, TimeUnit.MILLISECONDS);
            } catch (Exception e2) {
                c.d("CacheWriter", c.a(e2));
                aVar = null;
            }
            if (aVar != null) {
                switch (aVar.f80040f) {
                    case 1:
                        try {
                            aVar.a();
                            break;
                        } catch (s.a e3) {
                            c.d("CacheWriter", "append to cache file error in network task!!! " + c.a(e3));
                            this.f80030b = false;
                            this.g = e3;
                            this.f80032d.clear();
                            aVar.b();
                            return;
                        }
                    case 2:
                        aVar.b();
                        break;
                    case 3:
                        break;
                }
                this.f80030b = false;
                if (PatchProxy.isSupport(new Object[0], aVar, a.f80035a, false, 91616, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, a.f80035a, false, 91616, new Class[0], Void.TYPE);
                    continue;
                } else {
                    aVar.f80036b = null;
                    aVar.f80040f = 0;
                    aVar.f80038d = 0;
                    aVar.f80039e = 0;
                    a.g.offer(aVar);
                }
            }
        }
    }

    public d(s sVar) {
        if (this.f80031c) {
            this.f80032d = new LinkedBlockingQueue();
        }
        this.f80033f = sVar;
        this.f80030b = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(byte[] r22, int r23, int r24) throws com.toutiao.proxyserver.s.a {
        /*
            r21 = this;
            r7 = r21
            r8 = r22
            r9 = r24
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r12 = 1
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            r13 = 2
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f80028a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<byte[]> r1 = byte[].class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 91604(0x165d4, float:1.28365E-40)
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0064
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f80028a
            r3 = 0
            r4 = 91604(0x165d4, float:1.28365E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<byte[]> r1 = byte[].class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0064:
            boolean r0 = r7.f80031c
            if (r0 == 0) goto L_0x014b
            com.toutiao.proxyserver.s$a r0 = r7.g
            if (r0 != 0) goto L_0x013c
            boolean r0 = r7.f80030b
            if (r0 == 0) goto L_0x013c
            java.util.concurrent.BlockingQueue<com.toutiao.proxyserver.d$a> r0 = r7.f80032d
            com.toutiao.proxyserver.s r1 = r7.f80033f
            r2 = 4
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r11] = r1
            r14[r12] = r8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r14[r13] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r24)
            r14[r10] = r3
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.toutiao.proxyserver.d.a.f80035a
            r17 = 1
            r18 = 91617(0x165e1, float:1.28383E-40)
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.Class<com.toutiao.proxyserver.s> r4 = com.toutiao.proxyserver.s.class
            r3[r11] = r4
            java.lang.Class<byte[]> r4 = byte[].class
            r3[r12] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r13] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r10] = r4
            java.lang.Class<com.toutiao.proxyserver.d$a> r20 = com.toutiao.proxyserver.d.a.class
            r19 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r3 == 0) goto L_0x00e2
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r11] = r1
            r14[r12] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r14[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            r14[r10] = r1
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.toutiao.proxyserver.d.a.f80035a
            r17 = 1
            r18 = 91617(0x165e1, float:1.28383E-40)
            java.lang.Class[] r1 = new java.lang.Class[r2]
            java.lang.Class<com.toutiao.proxyserver.s> r2 = com.toutiao.proxyserver.s.class
            r1[r11] = r2
            java.lang.Class<byte[]> r2 = byte[].class
            r1[r12] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r13] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r10] = r2
            java.lang.Class<com.toutiao.proxyserver.d$a> r20 = com.toutiao.proxyserver.d.a.class
            r19 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            com.toutiao.proxyserver.d$a r1 = (com.toutiao.proxyserver.d.a) r1
            goto L_0x0138
        L_0x00e2:
            com.toutiao.proxyserver.d$a r2 = com.toutiao.proxyserver.d.a.a(r12)
            r2.f80036b = r1
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r15 = com.toutiao.proxyserver.d.a.f80035a
            r16 = 0
            r17 = 91615(0x165df, float:1.2838E-40)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class<byte[]> r3 = byte[].class
            r1[r11] = r3
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r2
            r18 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r1 == 0) goto L_0x011e
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r14 = com.toutiao.proxyserver.d.a.f80035a
            r15 = 0
            r16 = 91615(0x165df, float:1.2838E-40)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class<byte[]> r4 = byte[].class
            r3[r11] = r4
            java.lang.Class r18 = java.lang.Void.TYPE
            r12 = r1
            r13 = r2
            r17 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0133
        L_0x011e:
            byte[] r1 = r2.f80037c
            if (r1 == 0) goto L_0x0128
            byte[] r1 = r2.f80037c
            int r1 = r1.length
            int r3 = r8.length
            if (r1 == r3) goto L_0x012d
        L_0x0128:
            int r1 = r8.length
            byte[] r1 = new byte[r1]
            r2.f80037c = r1
        L_0x012d:
            byte[] r1 = r2.f80037c
            int r3 = r8.length
            java.lang.System.arraycopy(r8, r11, r1, r11, r3)
        L_0x0133:
            r2.f80038d = r11
            r2.f80039e = r9
            r1 = r2
        L_0x0138:
            r0.offer(r1)
            return
        L_0x013c:
            com.toutiao.proxyserver.s$a r0 = r7.g
            if (r0 == 0) goto L_0x0154
            com.toutiao.proxyserver.s r0 = r7.f80033f
            if (r0 != 0) goto L_0x0145
            goto L_0x0154
        L_0x0145:
            r0 = 0
            r7.f80033f = r0
            com.toutiao.proxyserver.s$a r0 = r7.g
            throw r0
        L_0x014b:
            com.toutiao.proxyserver.s r0 = r7.f80033f
            if (r0 == 0) goto L_0x0154
            com.toutiao.proxyserver.s r0 = r7.f80033f
            r0.a(r8, r11, r9)
        L_0x0154:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.d.a(byte[], int, int):void");
    }
}
