package com.toutiao.proxyserver;

import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.toutiao.proxyserver.b.b;
import com.toutiao.proxyserver.b.c;
import com.toutiao.proxyserver.r;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80201a;

    /* renamed from: f  reason: collision with root package name */
    public static volatile q f80202f;

    /* renamed from: b  reason: collision with root package name */
    public volatile ServerSocket f80203b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f80204c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f80205d = new AtomicInteger(0);

    /* renamed from: e  reason: collision with root package name */
    public final ExecutorService f80206e;
    public volatile c g;
    public volatile h h;
    public final SparseArray<Set<r>> i;
    public final r.c j;
    public volatile long k;
    public volatile long l;
    public volatile long m;
    public final Runnable n;
    public final AtomicBoolean o;

    static final class a implements Callable<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f80223a;

        /* renamed from: b  reason: collision with root package name */
        private final String f80224b;

        /* renamed from: c  reason: collision with root package name */
        private final int f80225c;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Boolean call() throws Exception {
            Socket socket;
            Throwable th;
            if (PatchProxy.isSupport(new Object[0], this, f80223a, false, 91727, new Class[0], Boolean.class)) {
                return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f80223a, false, 91727, new Class[0], Boolean.class);
            }
            Socket socket2 = null;
            try {
                socket = new Socket(this.f80224b, this.f80225c);
                try {
                    socket.setSoTimeout(2000);
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write("Ping\n".getBytes(com.toutiao.proxyserver.f.c.f80073b));
                    outputStream.flush();
                    if ("OK".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                        Boolean bool = Boolean.TRUE;
                        com.toutiao.proxyserver.f.c.a(socket);
                        return bool;
                    }
                    com.toutiao.proxyserver.f.c.a(socket);
                    return Boolean.FALSE;
                } catch (Throwable th2) {
                    th = th2;
                    com.toutiao.proxyserver.f.c.a(socket);
                    throw th;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                socket = null;
                th = th4;
                com.toutiao.proxyserver.f.c.a(socket);
                throw th;
            }
        }

        a(String str, int i) {
            this.f80224b = str;
            this.f80225c = i;
        }
    }

    private q() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f80207a;

            public final Thread newThread(Runnable runnable) {
                Runnable runnable2 = runnable;
                if (PatchProxy.isSupport(new Object[]{runnable2}, this, f80207a, false, 91719, new Class[]{Runnable.class}, Thread.class)) {
                    return (Thread) PatchProxy.accessDispatch(new Object[]{runnable2}, this, f80207a, false, 91719, new Class[]{Runnable.class}, Thread.class);
                }
                Thread thread = new Thread(runnable2);
                thread.setName("video-proxyserver-" + thread.getId());
                return thread;
            }
        });
        this.f80206e = threadPoolExecutor;
        this.i = new SparseArray<>(2);
        this.j = new r.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f80209a;

            public final void a(r rVar) {
                if (PatchProxy.isSupport(new Object[]{rVar}, this, f80209a, false, 91720, new Class[]{r.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{rVar}, this, f80209a, false, 91720, new Class[]{r.class}, Void.TYPE);
                    return;
                }
                com.toutiao.proxyserver.d.c.a("TAG_PROXY_ProxyServer", "startExecute, ProxyTask: " + rVar);
                synchronized (q.this.i) {
                    Set set = q.this.i.get(rVar.g());
                    if (set != null) {
                        set.add(rVar);
                    }
                }
            }

            public final void b(final r rVar) {
                if (PatchProxy.isSupport(new Object[]{rVar}, this, f80209a, false, 91721, new Class[]{r.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{rVar}, this, f80209a, false, 91721, new Class[]{r.class}, Void.TYPE);
                    return;
                }
                com.toutiao.proxyserver.d.c.a("TAG_PROXY_ProxyServer", "afterExecute, ProxyTask: " + rVar);
                final int g = rVar.g();
                synchronized (q.this.i) {
                    Set set = q.this.i.get(g);
                    if (set != null) {
                        set.remove(rVar);
                    }
                }
                final n nVar = Proxy.g;
                if (nVar != null) {
                    com.toutiao.proxyserver.f.c.b((Runnable) new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f80211a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f80211a, false, 91722, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f80211a, false, 91722, new Class[0], Void.TYPE);
                                return;
                            }
                            nVar.a(b.a(g), "proxy", rVar.f79963d.get(), 0, rVar.f79964e.get());
                        }
                    });
                }
            }
        };
        this.k = 10000;
        this.l = 10000;
        this.m = 10000;
        this.n = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f80221a;

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: com.toutiao.proxyserver.r$a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: com.toutiao.proxyserver.r$a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: com.toutiao.proxyserver.r$a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r16 = this;
                    r8 = r16
                    r0 = 0
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r3 = f80221a
                    java.lang.Class[] r6 = new java.lang.Class[r0]
                    java.lang.Class r7 = java.lang.Void.TYPE
                    r4 = 0
                    r5 = 91724(0x1664c, float:1.28533E-40)
                    r2 = r16
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                    if (r1 == 0) goto L_0x0029
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r3 = f80221a
                    r4 = 0
                    r5 = 91724(0x1664c, float:1.28533E-40)
                    java.lang.Class[] r6 = new java.lang.Class[r0]
                    java.lang.Class r7 = java.lang.Void.TYPE
                    r2 = r16
                    com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                    return
                L_0x0029:
                    com.toutiao.proxyserver.q r1 = com.toutiao.proxyserver.q.this     // Catch:{ IOException -> 0x022a }
                    java.net.ServerSocket r2 = new java.net.ServerSocket     // Catch:{ IOException -> 0x022a }
                    r3 = 50
                    java.lang.String r4 = "127.0.0.1"
                    java.net.InetAddress r4 = java.net.InetAddress.getByName(r4)     // Catch:{ IOException -> 0x022a }
                    r2.<init>(r0, r3, r4)     // Catch:{ IOException -> 0x022a }
                    r1.f80203b = r2     // Catch:{ IOException -> 0x022a }
                    com.toutiao.proxyserver.q r1 = com.toutiao.proxyserver.q.this
                    com.toutiao.proxyserver.q r2 = com.toutiao.proxyserver.q.this
                    java.net.ServerSocket r2 = r2.f80203b
                    int r2 = r2.getLocalPort()
                    r1.f80204c = r2
                    com.toutiao.proxyserver.q r1 = com.toutiao.proxyserver.q.this
                    int r1 = r1.f80204c
                    r2 = -1
                    if (r1 != r2) goto L_0x0053
                    com.toutiao.proxyserver.q r0 = com.toutiao.proxyserver.q.this
                    r0.b()
                    return
                L_0x0053:
                    java.lang.String r1 = "127.0.0.1"
                    com.toutiao.proxyserver.q r2 = com.toutiao.proxyserver.q.this
                    int r2 = r2.f80204c
                    r3 = 2
                    java.lang.Object[] r9 = new java.lang.Object[r3]
                    r9[r0] = r1
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                    r5 = 1
                    r9[r5] = r4
                    r10 = 0
                    com.meituan.robust.ChangeQuickRedirect r11 = com.toutiao.proxyserver.v.f80266a
                    r12 = 1
                    r13 = 91768(0x16678, float:1.28594E-40)
                    java.lang.Class[] r14 = new java.lang.Class[r3]
                    java.lang.Class<java.lang.String> r4 = java.lang.String.class
                    r14[r0] = r4
                    java.lang.Class r4 = java.lang.Integer.TYPE
                    r14[r5] = r4
                    java.lang.Class r15 = java.lang.Void.TYPE
                    boolean r4 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                    if (r4 == 0) goto L_0x009f
                    java.lang.Object[] r9 = new java.lang.Object[r3]
                    r9[r0] = r1
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                    r9[r5] = r1
                    r10 = 0
                    com.meituan.robust.ChangeQuickRedirect r11 = com.toutiao.proxyserver.v.f80266a
                    r12 = 1
                    r13 = 91768(0x16678, float:1.28594E-40)
                    java.lang.Class[] r14 = new java.lang.Class[r3]
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r14[r0] = r1
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r14[r5] = r1
                    java.lang.Class r15 = java.lang.Void.TYPE
                    com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
                    goto L_0x00a7
                L_0x009f:
                    com.toutiao.proxyserver.v r3 = new com.toutiao.proxyserver.v
                    r3.<init>(r1, r2)
                    java.net.ProxySelector.setDefault(r3)
                L_0x00a7:
                    com.toutiao.proxyserver.q r1 = com.toutiao.proxyserver.q.this
                    boolean r1 = r1.c()
                    if (r1 != 0) goto L_0x00b0
                    return
                L_0x00b0:
                    com.toutiao.proxyserver.q r1 = com.toutiao.proxyserver.q.this
                    java.util.concurrent.atomic.AtomicInteger r1 = r1.f80205d
                    boolean r1 = r1.compareAndSet(r0, r5)
                    if (r1 != 0) goto L_0x00bb
                    return
                L_0x00bb:
                    java.lang.String r1 = "TAG_PROXY_ProxyServer"
                    java.lang.String r2 = "proxy server start!"
                    com.toutiao.proxyserver.d.c.b(r1, r2)
                    r1 = 0
                L_0x00c3:
                    com.toutiao.proxyserver.q r2 = com.toutiao.proxyserver.q.this     // Catch:{ Throwable -> 0x0205 }
                    java.util.concurrent.atomic.AtomicInteger r2 = r2.f80205d     // Catch:{ Throwable -> 0x0205 }
                    int r2 = r2.get()     // Catch:{ Throwable -> 0x0205 }
                    if (r2 != r5) goto L_0x021d
                    com.toutiao.proxyserver.q r2 = com.toutiao.proxyserver.q.this     // Catch:{ IOException -> 0x01fd }
                    java.net.ServerSocket r2 = r2.f80203b     // Catch:{ IOException -> 0x01fd }
                    java.net.Socket r2 = r2.accept()     // Catch:{ IOException -> 0x01fd }
                    java.lang.String r3 = "TAG_PROXY_ProxyServer"
                    java.lang.String r4 = "proxy server new task!"
                    com.toutiao.proxyserver.d.c.b(r3, r4)     // Catch:{ Throwable -> 0x0205 }
                    com.toutiao.proxyserver.q r3 = com.toutiao.proxyserver.q.this     // Catch:{ Throwable -> 0x0205 }
                    com.toutiao.proxyserver.b.c r3 = r3.g     // Catch:{ Throwable -> 0x0205 }
                    if (r3 == 0) goto L_0x01f8
                    com.toutiao.proxyserver.r$a r4 = new com.toutiao.proxyserver.r$a     // Catch:{ Throwable -> 0x0205 }
                    r4.<init>()     // Catch:{ Throwable -> 0x0205 }
                    java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x0205 }
                    r9[r0] = r3     // Catch:{ Throwable -> 0x0205 }
                    com.meituan.robust.ChangeQuickRedirect r11 = com.toutiao.proxyserver.r.a.f80239a     // Catch:{ Throwable -> 0x0205 }
                    r12 = 0
                    r13 = 91746(0x16662, float:1.28564E-40)
                    java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ Throwable -> 0x0205 }
                    java.lang.Class<com.toutiao.proxyserver.b.c> r6 = com.toutiao.proxyserver.b.c.class
                    r14[r0] = r6     // Catch:{ Throwable -> 0x0205 }
                    java.lang.Class<com.toutiao.proxyserver.r$a> r15 = com.toutiao.proxyserver.r.a.class
                    r10 = r4
                    boolean r6 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Throwable -> 0x0205 }
                    if (r6 == 0) goto L_0x011b
                    java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x0205 }
                    r9[r0] = r3     // Catch:{ Throwable -> 0x0205 }
                    com.meituan.robust.ChangeQuickRedirect r11 = com.toutiao.proxyserver.r.a.f80239a     // Catch:{ Throwable -> 0x0205 }
                    r12 = 0
                    r13 = 91746(0x16662, float:1.28564E-40)
                    java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ Throwable -> 0x0205 }
                    java.lang.Class<com.toutiao.proxyserver.b.c> r3 = com.toutiao.proxyserver.b.c.class
                    r14[r0] = r3     // Catch:{ Throwable -> 0x0205 }
                    java.lang.Class<com.toutiao.proxyserver.r$a> r15 = com.toutiao.proxyserver.r.a.class
                    r10 = r4
                    java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Throwable -> 0x0205 }
                    r4 = r3
                    com.toutiao.proxyserver.r$a r4 = (com.toutiao.proxyserver.r.a) r4     // Catch:{ Throwable -> 0x0205 }
                    goto L_0x011f
                L_0x011b:
                    if (r3 == 0) goto L_0x01f0
                    r4.f80241c = r3     // Catch:{ Throwable -> 0x0205 }
                L_0x011f:
                    com.toutiao.proxyserver.q r3 = com.toutiao.proxyserver.q.this     // Catch:{ Throwable -> 0x0205 }
                    java.util.concurrent.ExecutorService r3 = r3.f80206e     // Catch:{ Throwable -> 0x0205 }
                    java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x0205 }
                    r9[r0] = r3     // Catch:{ Throwable -> 0x0205 }
                    com.meituan.robust.ChangeQuickRedirect r11 = com.toutiao.proxyserver.r.a.f80239a     // Catch:{ Throwable -> 0x0205 }
                    r12 = 0
                    r13 = 91747(0x16663, float:1.28565E-40)
                    java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ Throwable -> 0x0205 }
                    java.lang.Class<java.util.concurrent.ExecutorService> r6 = java.util.concurrent.ExecutorService.class
                    r14[r0] = r6     // Catch:{ Throwable -> 0x0205 }
                    java.lang.Class<com.toutiao.proxyserver.r$a> r15 = com.toutiao.proxyserver.r.a.class
                    r10 = r4
                    boolean r6 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Throwable -> 0x0205 }
                    if (r6 == 0) goto L_0x0157
                    java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x0205 }
                    r9[r0] = r3     // Catch:{ Throwable -> 0x0205 }
                    com.meituan.robust.ChangeQuickRedirect r11 = com.toutiao.proxyserver.r.a.f80239a     // Catch:{ Throwable -> 0x0205 }
                    r12 = 0
                    r13 = 91747(0x16663, float:1.28565E-40)
                    java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ Throwable -> 0x0205 }
                    java.lang.Class<java.util.concurrent.ExecutorService> r3 = java.util.concurrent.ExecutorService.class
                    r14[r0] = r3     // Catch:{ Throwable -> 0x0205 }
                    java.lang.Class<com.toutiao.proxyserver.r$a> r15 = com.toutiao.proxyserver.r.a.class
                    r10 = r4
                    java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Throwable -> 0x0205 }
                    r4 = r3
                    com.toutiao.proxyserver.r$a r4 = (com.toutiao.proxyserver.r.a) r4     // Catch:{ Throwable -> 0x0205 }
                    goto L_0x015b
                L_0x0157:
                    if (r3 == 0) goto L_0x01e8
                    r4.f80242d = r3     // Catch:{ Throwable -> 0x0205 }
                L_0x015b:
                    java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x0205 }
                    r9[r0] = r2     // Catch:{ Throwable -> 0x0205 }
                    com.meituan.robust.ChangeQuickRedirect r11 = com.toutiao.proxyserver.r.a.f80239a     // Catch:{ Throwable -> 0x0205 }
                    r12 = 0
                    r13 = 91748(0x16664, float:1.28566E-40)
                    java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ Throwable -> 0x0205 }
                    java.lang.Class<java.net.Socket> r3 = java.net.Socket.class
                    r14[r0] = r3     // Catch:{ Throwable -> 0x0205 }
                    java.lang.Class<com.toutiao.proxyserver.r$a> r15 = com.toutiao.proxyserver.r.a.class
                    r10 = r4
                    boolean r3 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Throwable -> 0x0205 }
                    if (r3 == 0) goto L_0x018f
                    java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x0205 }
                    r9[r0] = r2     // Catch:{ Throwable -> 0x0205 }
                    com.meituan.robust.ChangeQuickRedirect r11 = com.toutiao.proxyserver.r.a.f80239a     // Catch:{ Throwable -> 0x0205 }
                    r12 = 0
                    r13 = 91748(0x16664, float:1.28566E-40)
                    java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ Throwable -> 0x0205 }
                    java.lang.Class<java.net.Socket> r2 = java.net.Socket.class
                    r14[r0] = r2     // Catch:{ Throwable -> 0x0205 }
                    java.lang.Class<com.toutiao.proxyserver.r$a> r15 = com.toutiao.proxyserver.r.a.class
                    r10 = r4
                    java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Throwable -> 0x0205 }
                    r4 = r2
                    com.toutiao.proxyserver.r$a r4 = (com.toutiao.proxyserver.r.a) r4     // Catch:{ Throwable -> 0x0205 }
                    goto L_0x0193
                L_0x018f:
                    if (r2 == 0) goto L_0x01e0
                    r4.f80243e = r2     // Catch:{ Throwable -> 0x0205 }
                L_0x0193:
                    com.toutiao.proxyserver.q r2 = com.toutiao.proxyserver.q.this     // Catch:{ Throwable -> 0x0205 }
                    com.toutiao.proxyserver.r$c r2 = r2.j     // Catch:{ Throwable -> 0x0205 }
                    r4.f80244f = r2     // Catch:{ Throwable -> 0x0205 }
                    java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0205 }
                    com.meituan.robust.ChangeQuickRedirect r11 = com.toutiao.proxyserver.r.a.f80239a     // Catch:{ Throwable -> 0x0205 }
                    r12 = 0
                    r13 = 91749(0x16665, float:1.28568E-40)
                    java.lang.Class[] r14 = new java.lang.Class[r0]     // Catch:{ Throwable -> 0x0205 }
                    java.lang.Class<com.toutiao.proxyserver.r> r15 = com.toutiao.proxyserver.r.class
                    r10 = r4
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Throwable -> 0x0205 }
                    if (r2 == 0) goto L_0x01c0
                    java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0205 }
                    com.meituan.robust.ChangeQuickRedirect r11 = com.toutiao.proxyserver.r.a.f80239a     // Catch:{ Throwable -> 0x0205 }
                    r12 = 0
                    r13 = 91749(0x16665, float:1.28568E-40)
                    java.lang.Class[] r14 = new java.lang.Class[r0]     // Catch:{ Throwable -> 0x0205 }
                    java.lang.Class<com.toutiao.proxyserver.r> r15 = com.toutiao.proxyserver.r.class
                    r10 = r4
                    java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Throwable -> 0x0205 }
                    com.toutiao.proxyserver.r r2 = (com.toutiao.proxyserver.r) r2     // Catch:{ Throwable -> 0x0205 }
                    goto L_0x01d1
                L_0x01c0:
                    com.toutiao.proxyserver.b.c r2 = r4.f80241c     // Catch:{ Throwable -> 0x0205 }
                    if (r2 == 0) goto L_0x01da
                    java.util.concurrent.ExecutorService r2 = r4.f80242d     // Catch:{ Throwable -> 0x0205 }
                    if (r2 == 0) goto L_0x01da
                    java.net.Socket r2 = r4.f80243e     // Catch:{ Throwable -> 0x0205 }
                    if (r2 == 0) goto L_0x01da
                    com.toutiao.proxyserver.r r2 = new com.toutiao.proxyserver.r     // Catch:{ Throwable -> 0x0205 }
                    r2.<init>(r4)     // Catch:{ Throwable -> 0x0205 }
                L_0x01d1:
                    com.toutiao.proxyserver.q r3 = com.toutiao.proxyserver.q.this     // Catch:{ Throwable -> 0x0205 }
                    java.util.concurrent.ExecutorService r3 = r3.f80206e     // Catch:{ Throwable -> 0x0205 }
                    r3.execute(r2)     // Catch:{ Throwable -> 0x0205 }
                    goto L_0x00c3
                L_0x01da:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x0205 }
                    r0.<init>()     // Catch:{ Throwable -> 0x0205 }
                    throw r0     // Catch:{ Throwable -> 0x0205 }
                L_0x01e0:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x0205 }
                    java.lang.String r1 = "socket == null"
                    r0.<init>(r1)     // Catch:{ Throwable -> 0x0205 }
                    throw r0     // Catch:{ Throwable -> 0x0205 }
                L_0x01e8:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x0205 }
                    java.lang.String r1 = "executor == null"
                    r0.<init>(r1)     // Catch:{ Throwable -> 0x0205 }
                    throw r0     // Catch:{ Throwable -> 0x0205 }
                L_0x01f0:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x0205 }
                    java.lang.String r1 = "db == null"
                    r0.<init>(r1)     // Catch:{ Throwable -> 0x0205 }
                    throw r0     // Catch:{ Throwable -> 0x0205 }
                L_0x01f8:
                    com.toutiao.proxyserver.f.c.a((java.net.Socket) r2)     // Catch:{ Throwable -> 0x0205 }
                    goto L_0x00c3
                L_0x01fd:
                    int r1 = r1 + 1
                    r2 = 3
                    if (r1 > r2) goto L_0x021d
                    goto L_0x00c3
                L_0x0205:
                    r0 = move-exception
                    java.lang.String r1 = "TAG_PROXY_ProxyServer"
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    java.lang.String r3 = "proxy server crashed!  "
                    r2.<init>(r3)
                    java.lang.String r0 = com.toutiao.proxyserver.d.c.a(r0)
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    com.toutiao.proxyserver.d.c.d(r1, r0)
                L_0x021d:
                    java.lang.String r0 = "TAG_PROXY_ProxyServer"
                    java.lang.String r1 = "proxy server closed!"
                    com.toutiao.proxyserver.d.c.b(r0, r1)
                    com.toutiao.proxyserver.q r0 = com.toutiao.proxyserver.q.this
                    r0.b()
                    return
                L_0x022a:
                    r0 = move-exception
                    java.lang.String r1 = "TAG_PROXY_ProxyServer"
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    java.lang.String r3 = "create ServerSocket error!  "
                    r2.<init>(r3)
                    java.lang.String r0 = com.toutiao.proxyserver.d.c.a(r0)
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    com.toutiao.proxyserver.d.c.d(r1, r0)
                    com.toutiao.proxyserver.q r0 = com.toutiao.proxyserver.q.this
                    r0.b()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.q.AnonymousClass4.run():void");
            }
        };
        this.o = new AtomicBoolean();
        this.i.put(0, new HashSet());
        this.i.put(1, new HashSet());
    }

    public static q a() {
        if (PatchProxy.isSupport(new Object[0], null, f80201a, true, 91708, new Class[0], q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[0], null, f80201a, true, 91708, new Class[0], q.class);
        }
        if (f80202f == null) {
            synchronized (q.class) {
                if (f80202f == null) {
                    f80202f = new q();
                }
            }
        }
        return f80202f;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f80201a, false, 91713, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f80201a, false, 91713, new Class[0], Void.TYPE);
            return;
        }
        if (this.f80205d.compareAndSet(1, 2) || this.f80205d.compareAndSet(0, 2)) {
            ServerSocket serverSocket = this.f80203b;
            if (PatchProxy.isSupport(new Object[]{serverSocket}, null, com.toutiao.proxyserver.f.c.f80072a, true, 91865, new Class[]{ServerSocket.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{serverSocket}, null, com.toutiao.proxyserver.f.c.f80072a, true, 91865, new Class[]{ServerSocket.class}, Void.TYPE);
            } else if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (Throwable unused) {
                }
            }
            this.f80206e.shutdownNow();
            if (PatchProxy.isSupport(new Object[0], this, f80201a, false, 91716, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f80201a, false, 91716, new Class[0], Void.TYPE);
                return;
            }
            ArrayList arrayList = new ArrayList();
            synchronized (this.i) {
                int size = this.i.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Set set = this.i.get(this.i.keyAt(i2));
                    if (set != null) {
                        arrayList.addAll(set);
                        set.clear();
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((r) it2.next()).a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4 A[Catch:{ Throwable -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bf A[Catch:{ Throwable -> 0x00c8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f80201a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 91717(0x16645, float:1.28523E-40)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f80201a
            r5 = 0
            r6 = 91717(0x16645, float:1.28523E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002c:
            com.toutiao.proxyserver.q$a r1 = new com.toutiao.proxyserver.q$a
            java.lang.String r2 = "127.0.0.1"
            int r3 = r10.f80204c
            r1.<init>(r2, r3)
            java.util.concurrent.ExecutorService r2 = r10.f80206e
            java.util.concurrent.Future r1 = r2.submit(r1)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f80201a
            r5 = 0
            r6 = 91718(0x16646, float:1.28524E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r10
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x005f
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f80201a
            r6 = 0
            r7 = 91718(0x16646, float:1.28524E-40)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00a8
        L_0x005f:
            r2 = 0
            java.net.ServerSocket r3 = r10.f80203b     // Catch:{ IOException -> 0x00a5, all -> 0x009f }
            java.net.Socket r3 = r3.accept()     // Catch:{ IOException -> 0x00a5, all -> 0x009f }
            r2 = 2000(0x7d0, float:2.803E-42)
            r3.setSoTimeout(r2)     // Catch:{ IOException -> 0x009d, all -> 0x009b }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x009d, all -> 0x009b }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x009d, all -> 0x009b }
            java.io.InputStream r5 = r3.getInputStream()     // Catch:{ IOException -> 0x009d, all -> 0x009b }
            r4.<init>(r5)     // Catch:{ IOException -> 0x009d, all -> 0x009b }
            r2.<init>(r4)     // Catch:{ IOException -> 0x009d, all -> 0x009b }
            java.lang.String r4 = "Ping"
            java.lang.String r2 = r2.readLine()     // Catch:{ IOException -> 0x009d, all -> 0x009b }
            boolean r2 = r4.equals(r2)     // Catch:{ IOException -> 0x009d, all -> 0x009b }
            if (r2 == 0) goto L_0x0097
            java.io.OutputStream r2 = r3.getOutputStream()     // Catch:{ IOException -> 0x009d, all -> 0x009b }
            java.lang.String r4 = "OK\n"
            java.nio.charset.Charset r5 = com.toutiao.proxyserver.f.c.f80073b     // Catch:{ IOException -> 0x009d, all -> 0x009b }
            byte[] r4 = r4.getBytes(r5)     // Catch:{ IOException -> 0x009d, all -> 0x009b }
            r2.write(r4)     // Catch:{ IOException -> 0x009d, all -> 0x009b }
            r2.flush()     // Catch:{ IOException -> 0x009d, all -> 0x009b }
        L_0x0097:
            com.toutiao.proxyserver.f.c.a((java.net.Socket) r3)
            goto L_0x00a8
        L_0x009b:
            r0 = move-exception
            goto L_0x00a1
        L_0x009d:
            r2 = r3
            goto L_0x00a5
        L_0x009f:
            r0 = move-exception
            r3 = r2
        L_0x00a1:
            com.toutiao.proxyserver.f.c.a((java.net.Socket) r3)
            throw r0
        L_0x00a5:
            com.toutiao.proxyserver.f.c.a((java.net.Socket) r2)
        L_0x00a8:
            java.lang.Object r1 = r1.get()     // Catch:{ Throwable -> 0x00c8 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Throwable -> 0x00c8 }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x00c8 }
            if (r1 != 0) goto L_0x00bf
            java.lang.String r1 = "TAG_PROXY_ProxyServer"
            java.lang.String r2 = "Ping error"
            com.toutiao.proxyserver.d.c.d(r1, r2)     // Catch:{ Throwable -> 0x00c8 }
            r10.b()     // Catch:{ Throwable -> 0x00c8 }
            return r0
        L_0x00bf:
            java.lang.String r1 = "TAG_PROXY_ProxyServer"
            java.lang.String r2 = "Ping OK!"
            com.toutiao.proxyserver.d.c.b(r1, r2)     // Catch:{ Throwable -> 0x00c8 }
            r0 = 1
            return r0
        L_0x00c8:
            r1 = move-exception
            java.lang.String r2 = "TAG_PROXY_ProxyServer"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Error happen in ping. "
            r3.<init>(r4)
            java.lang.String r1 = com.toutiao.proxyserver.d.c.a(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.toutiao.proxyserver.d.c.d(r2, r1)
            r10.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.q.c():boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r12, java.lang.String r13) {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r9 = 0
            r1[r9] = r2
            r10 = 1
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = f80201a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r9] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 91707(0x1663b, float:1.28509E-40)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x004e
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r1[r9] = r2
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = f80201a
            r4 = 0
            r5 = 91707(0x1663b, float:1.28509E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r9] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x004e:
            if (r13 != 0) goto L_0x0051
            return r9
        L_0x0051:
            android.util.SparseArray<java.util.Set<com.toutiao.proxyserver.r>> r1 = r11.i
            monitor-enter(r1)
            android.util.SparseArray<java.util.Set<com.toutiao.proxyserver.r>> r2 = r11.i     // Catch:{ all -> 0x007c }
            java.lang.Object r2 = r2.get(r12)     // Catch:{ all -> 0x007c }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x007c }
            if (r2 == 0) goto L_0x007a
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x007c }
        L_0x0062:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x007c }
            if (r3 == 0) goto L_0x007a
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x007c }
            com.toutiao.proxyserver.r r3 = (com.toutiao.proxyserver.r) r3     // Catch:{ all -> 0x007c }
            if (r3 == 0) goto L_0x0062
            java.lang.String r3 = r3.i     // Catch:{ all -> 0x007c }
            boolean r3 = r13.equals(r3)     // Catch:{ all -> 0x007c }
            if (r3 == 0) goto L_0x0062
            monitor-exit(r1)     // Catch:{ all -> 0x007c }
            return r10
        L_0x007a:
            monitor-exit(r1)     // Catch:{ all -> 0x007c }
            return r9
        L_0x007c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.q.a(int, java.lang.String):boolean");
    }
}
