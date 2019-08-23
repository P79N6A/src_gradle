package com.toutiao.proxyserver;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.toutiao.proxyserver.net.e;
import com.toutiao.proxyserver.t;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.ExecutorService;

public class r extends a {
    public static ChangeQuickRedirect n;
    private final Socket o;
    private final c p;
    private final ExecutorService q;
    private volatile i r;
    private boolean s;
    private volatile boolean t = true;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f80239a;

        /* renamed from: b  reason: collision with root package name */
        c f80240b;

        /* renamed from: c  reason: collision with root package name */
        com.toutiao.proxyserver.b.c f80241c;

        /* renamed from: d  reason: collision with root package name */
        ExecutorService f80242d;

        /* renamed from: e  reason: collision with root package name */
        Socket f80243e;

        /* renamed from: f  reason: collision with root package name */
        c f80244f;

        a() {
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f80245a;

        /* renamed from: b  reason: collision with root package name */
        final OutputStream f80246b;

        /* renamed from: c  reason: collision with root package name */
        final String f80247c;

        /* renamed from: d  reason: collision with root package name */
        public int f80248d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f80249e;

        b(OutputStream outputStream, int i, String str) {
            this.f80246b = outputStream;
            this.f80248d = i;
            this.f80247c = str;
        }

        /* access modifiers changed from: package-private */
        public final void a(byte[] bArr, int i, int i2) throws w {
            Object obj = bArr;
            if (PatchProxy.isSupport(new Object[]{obj, 0, Integer.valueOf(i2)}, this, f80245a, false, 91750, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{obj, 0, Integer.valueOf(i2)}, this, f80245a, false, 91750, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (!this.f80249e) {
                try {
                    this.f80246b.write(bArr, 0, i2);
                    this.f80249e = true;
                } catch (IOException e2) {
                    if (Proxy.i != null) {
                        Proxy.i.a(-1, "Write header to player error.", this.f80247c);
                    }
                    throw new w(e2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void b(byte[] bArr, int i, int i2) throws w {
            Object obj = bArr;
            int i3 = i2;
            if (PatchProxy.isSupport(new Object[]{obj, 0, Integer.valueOf(i2)}, this, f80245a, false, 91751, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{obj, 0, Integer.valueOf(i2)}, this, f80245a, false, 91751, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            try {
                this.f80246b.write(bArr, 0, i3);
                this.f80248d += i3;
            } catch (IOException e2) {
                if (Proxy.i != null) {
                    Proxy.i.a(-1, "Write data to player error.", this.f80247c);
                }
                com.toutiao.proxyserver.d.c.d("TAG_PROXY_ProxyTask", "writeData error" + e2.toString());
                throw new w(e2);
            }
        }
    }

    public interface c {
        void a(r rVar);

        void b(r rVar);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 91739, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 91739, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        m();
    }

    private void l() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 91738, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 91738, new Class[0], Void.TYPE);
            return;
        }
        if (Proxy.v) {
            if (p.f() == 1) {
                p.a().c();
                return;
            }
            p.a().a(g(), this.i);
        }
    }

    private void m() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 91740, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 91740, new Class[0], Void.TYPE);
            return;
        }
        i iVar = this.r;
        this.r = null;
        if (iVar != null) {
            iVar.a();
            com.toutiao.proxyserver.d.c.c("TAG_PROXY_ProxyTask", "cancel fetch task, " + com.toutiao.proxyserver.d.c.a(new RuntimeException()), this.h);
        }
    }

    private b k() {
        c cVar;
        if (PatchProxy.isSupport(new Object[0], this, n, false, 91728, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, n, false, 91728, new Class[0], b.class);
        }
        try {
            this.j = t.a(this.o.getInputStream());
            OutputStream outputStream = this.o.getOutputStream();
            if (this.j.f80255d.f80257b == 1) {
                cVar = Proxy.f79954b;
            } else {
                cVar = Proxy.f79955c;
            }
            if (cVar == null) {
                com.toutiao.proxyserver.d.c.d("TAG_PROXY_ProxyTask", "cache is null", this.h);
                return null;
            }
            this.f79961b = cVar;
            this.h = this.j.f80255d.f80258c;
            this.i = this.j.f80255d.f80259d;
            this.k = new y(this.j.f80255d.h);
            this.f79965f = this.j.f80254c;
            com.toutiao.proxyserver.d.c.b("TAG_PROXY_ProxyTask", "request from MediaPlayer:    " + this.j.toString(), this.h);
            return new b(outputStream, this.j.f80255d.f80260e, this.h);
        } catch (IOException e2) {
            com.toutiao.proxyserver.f.c.a(this.o);
            com.toutiao.proxyserver.d.c.d("TAG_PROXY_ProxyTask", com.toutiao.proxyserver.d.c.a(e2), this.h);
            return null;
        } catch (t.c e3) {
            com.toutiao.proxyserver.f.c.a(this.o);
            com.toutiao.proxyserver.d.c.d("TAG_PROXY_ProxyTask", com.toutiao.proxyserver.d.c.a(e3), this.h);
            return null;
        }
    }

    public void run() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 91729, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 91729, new Class[0], Void.TYPE);
            return;
        }
        b k = k();
        if (k != null) {
            if (this.p != null) {
                this.p.a(this);
            }
            try {
                this.f79961b.a(this.i);
                try {
                    a(k);
                } catch (e e2) {
                    com.toutiao.proxyserver.d.c.d("TAG_PROXY_ProxyTask", com.toutiao.proxyserver.d.c.a(e2), this.h);
                }
                if (this.s) {
                    this.f79961b.c(this.h);
                }
                this.f79961b.b(this.i);
                a();
                com.toutiao.proxyserver.f.c.a(this.o);
                com.toutiao.proxyserver.d.c.d("TAG_PROXY_ProxyTask", "close socket vid: " + this.h + ", " + k.f80248d);
                if (this.p != null) {
                    this.p.b(this);
                }
            } catch (com.toutiao.proxyserver.c.a unused) {
                com.toutiao.proxyserver.f.c.a(this.o);
                if (this.p != null) {
                    this.p.b(this);
                }
            }
        }
    }

    r(a aVar) {
        super(aVar.f80240b, aVar.f80241c);
        this.q = aVar.f80242d;
        this.o = aVar.f80243e;
        this.p = aVar.f80244f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03cd, code lost:
        com.toutiao.proxyserver.d.c.d("TAG_PROXY_ProxyTask", "IOException: " + com.toutiao.proxyserver.d.c.a(r1), r8.h);
        r12 = new com.toutiao.proxyserver.j(2, "IOException", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03f0, code lost:
        r12 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03f9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03fa, code lost:
        r17 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a6, code lost:
        r1 = r0;
        r19 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x027b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x027c, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x027f, code lost:
        if (com.toutiao.proxyserver.Proxy.i != null) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0281, code lost:
        com.toutiao.proxyserver.Proxy.i.a(-1, "flush error.", r9.f80247c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x028b, code lost:
        com.toutiao.proxyserver.d.c.d("TAG_PROXY_ProxyTask", "flush error" + r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02a7, code lost:
        throw new com.toutiao.proxyserver.w(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02a8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02ab, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02ad, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02b0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02b2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02ca, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02cb, code lost:
        r17 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02f7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02f8, code lost:
        com.toutiao.proxyserver.d.c.d("TAG_PROXY_ProxyTask", "CancelException: " + com.toutiao.proxyserver.d.c.a(r0), r8.h);
        com.toutiao.proxyserver.Proxy.a(-1, "Task was cancel.", r8.h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x031a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x031b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x031c, code lost:
        r1 = r0;
        com.toutiao.proxyserver.d.c.d("TAG_PROXY_ProxyTask", "ContentLengthNotMatchException: " + com.toutiao.proxyserver.d.c.a(r1), r8.h);
        r8.s = true;
        com.toutiao.proxyserver.Proxy.a(5, " ContentLengthNotMatchException: " + com.toutiao.proxyserver.d.c.a(r1), r8.h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0352, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0353, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0354, code lost:
        r17 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x039e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x039f, code lost:
        com.toutiao.proxyserver.d.c.d("TAG_PROXY_ProxyTask", "SocketWriteException: " + com.toutiao.proxyserver.d.c.a(r0), r8.h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03ba, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03bb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03bc, code lost:
        r19 = r12;
        r17 = r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0274 A[SYNTHETIC, Splitter:B:56:0x0274] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02ab A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:13:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02ad A[ExcHandler: a (e com.toutiao.proxyserver.s$a), Splitter:B:13:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02b2 A[ExcHandler: u (e com.toutiao.proxyserver.u), Splitter:B:13:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02f7 A[ExcHandler: e (r0v8 'e' com.toutiao.proxyserver.e A[CUSTOM_DECLARE]), Splitter:B:8:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x031b A[ExcHandler: f (r0v7 'e' com.toutiao.proxyserver.f A[CUSTOM_DECLARE]), Splitter:B:8:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x039e A[ExcHandler: w (r0v4 'e' com.toutiao.proxyserver.w A[CUSTOM_DECLARE]), Splitter:B:8:0x0053] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(com.toutiao.proxyserver.r.b r21) throws com.toutiao.proxyserver.e {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            r10 = 1
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r11 = 0
            r1[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r3 = n
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<com.toutiao.proxyserver.r$b> r2 = com.toutiao.proxyserver.r.b.class
            r6[r11] = r2
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 91730(0x16652, float:1.28541E-40)
            r2 = r20
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x003f
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r3 = n
            r4 = 0
            r5 = 91730(0x16652, float:1.28541E-40)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<com.toutiao.proxyserver.r$b> r2 = com.toutiao.proxyserver.r.b.class
            r6[r11] = r2
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r20
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L_0x003f:
            r1 = 0
            r12 = r1
        L_0x0041:
            com.toutiao.proxyserver.y r2 = r8.k
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x0434
            r20.f()
            com.toutiao.proxyserver.y r2 = r8.k
            com.toutiao.proxyserver.y$a r13 = r2.b()
            r15 = 2
            java.lang.String r7 = r13.f80276b     // Catch:{ u -> 0x03f9, IOException -> 0x03bb, w -> 0x039e, a -> 0x0353, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ca }
            r20.j()     // Catch:{ u -> 0x02c5, IOException -> 0x02be, w -> 0x039e, a -> 0x02b9, f -> 0x031b, e -> 0x02f7, Exception -> 0x02b5 }
            java.lang.String r6 = r13.f80276b     // Catch:{ u -> 0x02c5, IOException -> 0x02be, w -> 0x039e, a -> 0x02b9, f -> 0x031b, e -> 0x02f7, Exception -> 0x02b5 }
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ u -> 0x02c5, IOException -> 0x02be, w -> 0x039e, a -> 0x02b9, f -> 0x031b, e -> 0x02f7, Exception -> 0x02b5 }
            r1[r11] = r9     // Catch:{ u -> 0x02c5, IOException -> 0x02be, w -> 0x039e, a -> 0x02b9, f -> 0x031b, e -> 0x02f7, Exception -> 0x02b5 }
            r1[r10] = r6     // Catch:{ u -> 0x02c5, IOException -> 0x02be, w -> 0x039e, a -> 0x02b9, f -> 0x031b, e -> 0x02f7, Exception -> 0x02b5 }
            com.meituan.robust.ChangeQuickRedirect r3 = n     // Catch:{ u -> 0x02c5, IOException -> 0x02be, w -> 0x039e, a -> 0x02b9, f -> 0x031b, e -> 0x02f7, Exception -> 0x02b5 }
            r4 = 0
            r5 = 91731(0x16653, float:1.28543E-40)
            java.lang.Class[] r2 = new java.lang.Class[r15]     // Catch:{ u -> 0x02c5, IOException -> 0x02be, w -> 0x039e, a -> 0x02b9, f -> 0x031b, e -> 0x02f7, Exception -> 0x02b5 }
            java.lang.Class<com.toutiao.proxyserver.r$b> r16 = com.toutiao.proxyserver.r.b.class
            r2[r11] = r16     // Catch:{ u -> 0x02c5, IOException -> 0x02be, w -> 0x039e, a -> 0x02b9, f -> 0x031b, e -> 0x02f7, Exception -> 0x02b5 }
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r2[r10] = r16     // Catch:{ u -> 0x02c5, IOException -> 0x02be, w -> 0x039e, a -> 0x02b9, f -> 0x031b, e -> 0x02f7, Exception -> 0x02b5 }
            java.lang.Class r16 = java.lang.Void.TYPE     // Catch:{ u -> 0x02c5, IOException -> 0x02be, w -> 0x039e, a -> 0x02b9, f -> 0x031b, e -> 0x02f7, Exception -> 0x02b5 }
            r17 = r2
            r2 = r20
            r14 = r6
            r6 = r17
            r17 = r7
            r7 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            if (r1 == 0) goto L_0x00ab
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r1[r11] = r9     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r1[r10] = r14     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.meituan.robust.ChangeQuickRedirect r3 = n     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r4 = 0
            r5 = 91731(0x16653, float:1.28543E-40)
            java.lang.Class[] r6 = new java.lang.Class[r15]     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.Class<com.toutiao.proxyserver.r$b> r2 = com.toutiao.proxyserver.r.b.class
            r6[r11] = r2     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r2 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
        L_0x00a0:
            r19 = r12
        L_0x00a2:
            r1 = 0
            goto L_0x024b
        L_0x00a5:
            r0 = move-exception
            r1 = r0
            r19 = r12
            goto L_0x03c1
        L_0x00ab:
            java.lang.String r1 = "HEAD"
            com.toutiao.proxyserver.t r2 = r8.j     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.toutiao.proxyserver.t$b r2 = r2.f80253b     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r2 = r2.f80263b     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            if (r1 == 0) goto L_0x012f
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r1[r11] = r9     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r1[r10] = r14     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.meituan.robust.ChangeQuickRedirect r3 = n     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r4 = 0
            r5 = 91732(0x16654, float:1.28544E-40)
            java.lang.Class[] r6 = new java.lang.Class[r15]     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.Class<com.toutiao.proxyserver.r$b> r2 = com.toutiao.proxyserver.r.b.class
            r6[r11] = r2     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r2 = r20
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            if (r1 == 0) goto L_0x00f7
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r1[r11] = r9     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r1[r10] = r14     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.meituan.robust.ChangeQuickRedirect r3 = n     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r4 = 0
            r5 = 91732(0x16654, float:1.28544E-40)
            java.lang.Class[] r6 = new java.lang.Class[r15]     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.Class<com.toutiao.proxyserver.r$b> r2 = com.toutiao.proxyserver.r.b.class
            r6[r11] = r2     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r2 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            goto L_0x00a0
        L_0x00f7:
            java.lang.String r1 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r3 = "procHead() called with: mediaPlayerWriter = ["
            r2.<init>(r3)     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r2.append(r9)     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r3 = "], url = ["
            r2.append(r3)     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r2.append(r14)     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r3 = "]"
            r2.append(r3)     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r2 = r2.toString()     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.toutiao.proxyserver.d.c.a(r1, r2)     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.toutiao.proxyserver.b.c r1 = r8.f79962c     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r2 = r8.i     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.toutiao.proxyserver.t r3 = r8.j     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.toutiao.proxyserver.t$a r3 = r3.f80255d     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            int r3 = r3.f80257b     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.toutiao.proxyserver.b.a r1 = r1.a(r2, r3)     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            byte[] r1 = r8.a(r1, r9, r14)     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            int r2 = r1.length     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r9.a(r1, r11, r2)     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            goto L_0x00a0
        L_0x012f:
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r1[r11] = r9     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r1[r10] = r14     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.meituan.robust.ChangeQuickRedirect r3 = n     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r4 = 0
            r5 = 91733(0x16655, float:1.28545E-40)
            java.lang.Class[] r6 = new java.lang.Class[r15]     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.Class<com.toutiao.proxyserver.r$b> r2 = com.toutiao.proxyserver.r.b.class
            r6[r11] = r2     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r2 = r20
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            if (r1 == 0) goto L_0x016e
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r1[r11] = r9     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r1[r10] = r14     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.meituan.robust.ChangeQuickRedirect r3 = n     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r4 = 0
            r5 = 91733(0x16655, float:1.28545E-40)
            java.lang.Class[] r6 = new java.lang.Class[r15]     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.Class<com.toutiao.proxyserver.r$b> r2 = com.toutiao.proxyserver.r.b.class
            r6[r11] = r2     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r2 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ u -> 0x02b2, IOException -> 0x00a5, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            goto L_0x00a0
        L_0x016e:
            java.lang.String r1 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r3 = "procGet() called with, url = ["
            r2.<init>(r3)     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r2.append(r14)     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r3 = "]，rawKey："
            r2.append(r3)     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r3 = r8.h     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r2.append(r3)     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r3 = "， key:"
            r2.append(r3)     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r3 = r8.i     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r2.append(r3)     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r2 = r2.toString()     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r3 = r8.h     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.toutiao.proxyserver.d.c.a(r1, r2, r3)     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            boolean r1 = r8.t     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            if (r1 == 0) goto L_0x0239
            com.toutiao.proxyserver.c r1 = r8.f79961b     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r2 = r8.i     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.io.File r7 = r1.d(r2)     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            long r1 = r7.length()     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.toutiao.proxyserver.b.c r3 = r8.f79962c     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r4 = r8.i     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.toutiao.proxyserver.t r5 = r8.j     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.toutiao.proxyserver.t$a r5 = r5.f80255d     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            int r5 = r5.f80257b     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.toutiao.proxyserver.b.a r6 = r3.a(r4, r5)     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            int r5 = r9.f80248d     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            long r3 = (long) r5     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            long r3 = r1 - r3
            int r15 = (int) r3     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            if (r6 != 0) goto L_0x01bf
            r10 = -1
            goto L_0x01c1
        L_0x01bf:
            int r10 = r6.f80012d     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
        L_0x01c1:
            java.lang.String r11 = "TAG_PROXY_ProxyTask"
            r18 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ u -> 0x02b2, IOException -> 0x02b0, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r19 = r12
            java.lang.String r12 = "procGet() totalLength:"
            r6.<init>(r12)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r6.append(r10)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r12 = ", cacheLength:"
            r6.append(r12)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r6.append(r1)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r12 = ", mpOffset:"
            r6.append(r12)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r6.append(r5)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r6 = r6.toString()     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.toutiao.proxyserver.d.c.a(r11, r6)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            int r6 = r9.f80248d     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            long r11 = (long) r6     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            int r6 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x022c
            java.lang.String r6 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r12 = "cache hit, remainSize: "
            r11.<init>(r12)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r11.append(r3)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r3 = "，rawKey："
            r11.append(r3)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r3 = r8.h     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r11.append(r3)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r3 = "， key:"
            r11.append(r3)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r3 = r8.i     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r11.append(r3)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r3 = r11.toString()     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r4 = r8.h     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.toutiao.proxyserver.d.c.b(r6, r3, r4)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r3 = 1
            int r6 = (int) r1     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r1 = r20
            r2 = r3
            r3 = r15
            r4 = r10
            r11 = r5
            r5 = r6
            r10 = r18
            r6 = r11
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r8.a(r10, r7, r9, r14)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            goto L_0x00a2
        L_0x022c:
            r11 = r5
            r3 = 0
            int r5 = (int) r1     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r1 = r20
            r2 = r3
            r3 = r15
            r4 = r10
            r6 = r11
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            goto L_0x0246
        L_0x0239:
            r19 = r12
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            int r6 = r9.f80248d     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r1 = r20
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
        L_0x0246:
            r8.a(r9, r14)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            goto L_0x00a2
        L_0x024b:
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.meituan.robust.ChangeQuickRedirect r3 = com.toutiao.proxyserver.r.b.f80245a     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r4 = 0
            r5 = 91752(0x16668, float:1.28572E-40)
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r1 = r2
            r2 = r21
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            if (r1 == 0) goto L_0x0274
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.meituan.robust.ChangeQuickRedirect r3 = com.toutiao.proxyserver.r.b.f80245a     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r4 = 0
            r5 = 91752(0x16668, float:1.28572E-40)
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r1 = r2
            r2 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            goto L_0x0279
        L_0x0274:
            java.io.OutputStream r1 = r9.f80246b     // Catch:{ IOException -> 0x027b, u -> 0x02b2, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r1.flush()     // Catch:{ IOException -> 0x027b, u -> 0x02b2, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
        L_0x0279:
            r1 = 1
            return r1
        L_0x027b:
            r0 = move-exception
            r1 = r0
            com.toutiao.proxyserver.l r2 = com.toutiao.proxyserver.Proxy.i     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            if (r2 == 0) goto L_0x028b
            com.toutiao.proxyserver.l r2 = com.toutiao.proxyserver.Proxy.i     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r3 = "flush error."
            java.lang.String r4 = r9.f80247c     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r5 = -1
            r2.a(r5, r3, r4)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
        L_0x028b:
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r4 = "flush error"
            r3.<init>(r4)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r4 = r1.toString()     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r3.append(r4)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            java.lang.String r3 = r3.toString()     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.toutiao.proxyserver.d.c.d(r2, r3)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            com.toutiao.proxyserver.w r2 = new com.toutiao.proxyserver.w     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            r2.<init>(r1)     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
            throw r2     // Catch:{ u -> 0x02b2, IOException -> 0x02a8, w -> 0x039e, a -> 0x02ad, f -> 0x031b, e -> 0x02f7, Exception -> 0x02ab }
        L_0x02a8:
            r0 = move-exception
            goto L_0x03c0
        L_0x02ab:
            r0 = move-exception
            goto L_0x02cd
        L_0x02ad:
            r0 = move-exception
            goto L_0x0356
        L_0x02b0:
            r0 = move-exception
            goto L_0x02c1
        L_0x02b2:
            r0 = move-exception
            goto L_0x03fc
        L_0x02b5:
            r0 = move-exception
            r17 = r7
            goto L_0x02cd
        L_0x02b9:
            r0 = move-exception
            r17 = r7
            goto L_0x0356
        L_0x02be:
            r0 = move-exception
            r17 = r7
        L_0x02c1:
            r19 = r12
            goto L_0x03c0
        L_0x02c5:
            r0 = move-exception
            r17 = r7
            goto L_0x03fc
        L_0x02ca:
            r0 = move-exception
            r17 = r1
        L_0x02cd:
            r1 = r0
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "OtherException: "
            r3.<init>(r4)
            java.lang.String r4 = com.toutiao.proxyserver.d.c.a(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r8.h
            com.toutiao.proxyserver.d.c.d(r2, r3, r4)
            com.toutiao.proxyserver.j r12 = new com.toutiao.proxyserver.j
            java.lang.String r2 = "OtherException"
            r3 = 0
            r12.<init>(r3, r2, r1)
            int r1 = r8.l
            r2 = 1
            int r1 = r1 + r2
            r8.l = r1
            goto L_0x0398
        L_0x02f7:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "CancelException: "
            r2.<init>(r3)
            java.lang.String r3 = com.toutiao.proxyserver.d.c.a(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r8.h
            java.lang.String r4 = "TAG_PROXY_ProxyTask"
            com.toutiao.proxyserver.d.c.d(r4, r2, r3)
            java.lang.String r2 = r8.h
            java.lang.String r3 = "Task was cancel."
            r4 = -1
            com.toutiao.proxyserver.Proxy.a(r4, r3, r2)
            throw r1
        L_0x031b:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ContentLengthNotMatchException: "
            r3.<init>(r4)
            java.lang.String r4 = com.toutiao.proxyserver.d.c.a(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r8.h
            com.toutiao.proxyserver.d.c.d(r2, r3, r4)
            r2 = 1
            r8.s = r2
            r2 = 5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = " ContentLengthNotMatchException: "
            r3.<init>(r4)
            java.lang.String r1 = com.toutiao.proxyserver.d.c.a(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = r8.h
            com.toutiao.proxyserver.Proxy.a(r2, r1, r3)
            r1 = 0
            return r1
        L_0x0353:
            r0 = move-exception
            r17 = r1
        L_0x0356:
            r1 = r0
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "RandomAccessFileWrapper"
            r3.<init>(r4)
            java.lang.String r4 = com.toutiao.proxyserver.d.c.a(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r8.h
            com.toutiao.proxyserver.d.c.d(r2, r3, r4)
            r2 = 0
            r8.t = r2
            com.toutiao.proxyserver.j r12 = new com.toutiao.proxyserver.j
            java.lang.String r2 = "RandomAccessFileWrapper.FileException"
            r3 = 4
            r12.<init>(r3, r2, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = " RandomAccessFileWrapper.FileException："
            r2.<init>(r4)
            java.lang.String r1 = com.toutiao.proxyserver.d.c.a(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = r8.h
            com.toutiao.proxyserver.Proxy.a(r3, r1, r2)
            int r1 = r8.l
            r2 = 1
            int r1 = r1 + r2
            r8.l = r1
        L_0x0398:
            r1 = r17
            r10 = 1
            r11 = 0
            goto L_0x0041
        L_0x039e:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "SocketWriteException: "
            r3.<init>(r4)
            java.lang.String r1 = com.toutiao.proxyserver.d.c.a(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = r8.h
            com.toutiao.proxyserver.d.c.d(r2, r1, r3)
            r1 = 1
            return r1
        L_0x03bb:
            r0 = move-exception
            r19 = r12
            r17 = r1
        L_0x03c0:
            r1 = r0
        L_0x03c1:
            java.lang.String r2 = "Canceled"
            java.lang.String r3 = r1.getMessage()
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 != 0) goto L_0x03f0
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "IOException: "
            r3.<init>(r4)
            java.lang.String r4 = com.toutiao.proxyserver.d.c.a(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r8.h
            com.toutiao.proxyserver.d.c.d(r2, r3, r4)
            com.toutiao.proxyserver.j r2 = new com.toutiao.proxyserver.j
            java.lang.String r3 = "IOException"
            r4 = 2
            r2.<init>(r4, r3, r1)
            r12 = r2
            goto L_0x03f2
        L_0x03f0:
            r12 = r19
        L_0x03f2:
            int r1 = r8.l
            r2 = 1
            int r1 = r1 + r2
            r8.l = r1
            goto L_0x0398
        L_0x03f9:
            r0 = move-exception
            r17 = r1
        L_0x03fc:
            r1 = r0
            r13.a()
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "RequestException: "
            r3.<init>(r4)
            java.lang.String r4 = com.toutiao.proxyserver.d.c.a(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r8.h
            com.toutiao.proxyserver.d.c.d(r2, r3, r4)
            com.toutiao.proxyserver.j r12 = new com.toutiao.proxyserver.j
            int r2 = r1.errorCode
            java.lang.String r3 = "RequestException"
            r12.<init>(r2, r3, r1)
            int r1 = r1.errorCode
            r2 = 416(0x1a0, float:5.83E-43)
            if (r1 != r2) goto L_0x042c
            r1 = 1
            r8.s = r1
            goto L_0x042d
        L_0x042c:
            r1 = 1
        L_0x042d:
            int r2 = r8.l
            int r2 = r2 + r1
            r8.l = r2
            goto L_0x0398
        L_0x0434:
            r19 = r12
            if (r19 == 0) goto L_0x0461
            r12 = r19
            int r2 = r12.f80123a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r12.f80124b
            r3.append(r4)
            java.lang.Exception r4 = r12.f80125c
            java.lang.String r4 = com.toutiao.proxyserver.d.c.a(r4)
            r3.append(r4)
            java.lang.String r4 = ", url:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r8.h
            com.toutiao.proxyserver.Proxy.a(r2, r3, r4)
            goto L_0x0469
        L_0x0461:
            r2 = 6
            java.lang.String r3 = "After retry all url, no exception..."
            java.lang.String r4 = r8.h
            com.toutiao.proxyserver.Proxy.a(r2, r3, r4)
        L_0x0469:
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            java.lang.String r3 = "execute() called and return false"
            java.lang.String r4 = r8.h
            com.toutiao.proxyserver.d.c.d(r2, r3, r4)
            r2 = 1
            com.toutiao.proxyserver.Proxy.a(r2, r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.r.a(com.toutiao.proxyserver.r$b):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: com.toutiao.proxyserver.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: com.toutiao.proxyserver.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.util.concurrent.Future<java.lang.Void>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: com.toutiao.proxyserver.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.util.concurrent.Future<java.lang.Void>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: com.toutiao.proxyserver.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: com.toutiao.proxyserver.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: com.toutiao.proxyserver.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: com.toutiao.proxyserver.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: com.toutiao.proxyserver.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v16, resolved type: com.toutiao.proxyserver.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v17, resolved type: com.toutiao.proxyserver.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v41, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v45, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v46, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v47, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v48, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v50, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v28, resolved type: com.toutiao.proxyserver.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v51, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v29, resolved type: com.toutiao.proxyserver.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v30, resolved type: com.toutiao.proxyserver.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v31, resolved type: java.util.concurrent.Future<java.lang.Void>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v32, resolved type: com.toutiao.proxyserver.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v33, resolved type: com.toutiao.proxyserver.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v34, resolved type: com.toutiao.proxyserver.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v35, resolved type: com.toutiao.proxyserver.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v36, resolved type: com.toutiao.proxyserver.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02d7 A[Catch:{ IOException -> 0x0439, all -> 0x0430 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02e7 A[SYNTHETIC, Splitter:B:104:0x02e7] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x041c A[SYNTHETIC, Splitter:B:168:0x041c] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0420 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0479 A[Catch:{ all -> 0x0481 }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04bb A[SYNTHETIC, Splitter:B:213:0x04bb] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0396 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02d5 A[Catch:{ IOException -> 0x0439, all -> 0x0430 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.toutiao.proxyserver.r.b r25, java.lang.String r26) throws com.toutiao.proxyserver.w, java.io.IOException, com.toutiao.proxyserver.e, com.toutiao.proxyserver.f {
        /*
            r24 = this;
            r8 = r24
            r9 = r25
            r10 = r26
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r11 = 0
            r1[r11] = r9
            r12 = 1
            r1[r12] = r10
            com.meituan.robust.ChangeQuickRedirect r3 = n
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<com.toutiao.proxyserver.r$b> r2 = com.toutiao.proxyserver.r.b.class
            r6[r11] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r12] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 91737(0x16659, float:1.28551E-40)
            r2 = r24
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0047
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r11] = r9
            r1[r12] = r10
            com.meituan.robust.ChangeQuickRedirect r3 = n
            r4 = 0
            r5 = 91737(0x16659, float:1.28551E-40)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<com.toutiao.proxyserver.r$b> r0 = com.toutiao.proxyserver.r.b.class
            r6[r11] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r12] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r24
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0047:
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "processNetworkOnly() called with, url = ["
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r2 = "]，rawKey："
            r1.append(r2)
            java.lang.String r2 = r8.h
            r1.append(r2)
            java.lang.String r2 = "， key:"
            r1.append(r2)
            java.lang.String r2 = r8.i
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r8.h
            com.toutiao.proxyserver.d.c.a(r0, r1, r2)
            r24.l()
            r24.m()
            r24.b()
            long r13 = android.os.SystemClock.elapsedRealtime()
            int r0 = r9.f80248d
            com.toutiao.proxyserver.e.d r15 = new com.toutiao.proxyserver.e.d
            r15.<init>()
            com.toutiao.proxyserver.e.c r1 = com.toutiao.proxyserver.e.c.a()
            r1.f80054b = r15
            r7 = 0
            com.toutiao.proxyserver.e.c r1 = com.toutiao.proxyserver.e.c.a()     // Catch:{ IOException -> 0x0465, all -> 0x045c }
            r1.b()     // Catch:{ IOException -> 0x0465, all -> 0x045c }
            r24.i()     // Catch:{ IOException -> 0x0465, all -> 0x045c }
            com.toutiao.proxyserver.d.b r1 = com.toutiao.proxyserver.Proxy.s     // Catch:{ IOException -> 0x0465, all -> 0x045c }
            if (r1 == 0) goto L_0x00bb
            com.toutiao.proxyserver.d.b r1 = com.toutiao.proxyserver.Proxy.s     // Catch:{ IOException -> 0x00b1, all -> 0x00a7 }
            java.lang.String r2 = "videocache_start_request"
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x00b1, all -> 0x00a7 }
            java.lang.String r5 = r8.h     // Catch:{ IOException -> 0x00b1, all -> 0x00a7 }
            r1.a(r2, r3, r5)     // Catch:{ IOException -> 0x00b1, all -> 0x00a7 }
            goto L_0x00bb
        L_0x00a7:
            r0 = move-exception
            r3 = r7
            r16 = r3
            r21 = r16
            r22 = r13
            goto L_0x0482
        L_0x00b1:
            r0 = move-exception
            r3 = r7
            r16 = r3
            r21 = r16
            r22 = r13
            goto L_0x046d
        L_0x00bb:
            java.lang.String r1 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0465, all -> 0x045c }
            java.lang.String r3 = "processNetworkOnly() before request from:"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0465, all -> 0x045c }
            r2.append(r0)     // Catch:{ IOException -> 0x0465, all -> 0x045c }
            java.lang.String r3 = ", to:"
            r2.append(r3)     // Catch:{ IOException -> 0x0465, all -> 0x045c }
            com.toutiao.proxyserver.t r3 = r8.j     // Catch:{ IOException -> 0x0465, all -> 0x045c }
            com.toutiao.proxyserver.t$a r3 = r3.f80255d     // Catch:{ IOException -> 0x0465, all -> 0x045c }
            int r3 = r3.f80261f     // Catch:{ IOException -> 0x0465, all -> 0x045c }
            r2.append(r3)     // Catch:{ IOException -> 0x0465, all -> 0x045c }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0465, all -> 0x045c }
            com.toutiao.proxyserver.d.c.a(r1, r2)     // Catch:{ IOException -> 0x0465, all -> 0x045c }
            com.toutiao.proxyserver.t r1 = r8.j     // Catch:{ IOException -> 0x0465, all -> 0x045c }
            com.toutiao.proxyserver.t$a r1 = r1.f80255d     // Catch:{ IOException -> 0x0465, all -> 0x045c }
            int r1 = r1.f80261f     // Catch:{ IOException -> 0x0465, all -> 0x045c }
            java.lang.String r2 = "GET"
            com.toutiao.proxyserver.net.e r6 = r8.a((java.lang.String) r10, (int) r0, (int) r1, (java.lang.String) r2)     // Catch:{ IOException -> 0x0465, all -> 0x045c }
            r24.h()     // Catch:{ IOException -> 0x0454, all -> 0x044c }
            com.toutiao.proxyserver.f.c.a((com.toutiao.proxyserver.net.e) r6, (boolean) r11, (boolean) r12)     // Catch:{ IOException -> 0x0454, all -> 0x044c }
            com.toutiao.proxyserver.b.c r1 = r8.f79962c     // Catch:{ IOException -> 0x0454, all -> 0x044c }
            java.lang.String r2 = r8.i     // Catch:{ IOException -> 0x0454, all -> 0x044c }
            int r3 = r24.g()     // Catch:{ IOException -> 0x0454, all -> 0x044c }
            com.toutiao.proxyserver.b.a r12 = r1.a(r2, r3)     // Catch:{ IOException -> 0x0454, all -> 0x044c }
            int r5 = com.toutiao.proxyserver.f.c.a((com.toutiao.proxyserver.net.e) r6)     // Catch:{ IOException -> 0x0454, all -> 0x044c }
            if (r12 == 0) goto L_0x01b2
            int r1 = r12.f80012d     // Catch:{ IOException -> 0x01a7, all -> 0x019c }
            if (r1 == r5) goto L_0x01b2
            com.toutiao.proxyserver.n r0 = com.toutiao.proxyserver.Proxy.g     // Catch:{ IOException -> 0x0198, all -> 0x0194 }
            if (r0 == 0) goto L_0x0121
            int r0 = r24.g()     // Catch:{ IOException -> 0x0198, all -> 0x0194 }
            boolean r2 = com.toutiao.proxyserver.b.b.a((int) r0)     // Catch:{ IOException -> 0x0198, all -> 0x0194 }
            java.lang.String r3 = r8.h     // Catch:{ IOException -> 0x0198, all -> 0x0194 }
            int r4 = r12.f80012d     // Catch:{ IOException -> 0x0198, all -> 0x0194 }
            java.lang.String r0 = r12.f80014f     // Catch:{ IOException -> 0x0198, all -> 0x0194 }
            r1 = r24
            r9 = r5
            r11 = r6
            r6 = r26
            r7 = r0
            r1.a(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            goto L_0x0123
        L_0x0121:
            r9 = r5
            r11 = r6
        L_0x0123:
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            java.lang.String r2 = "Content-Length not match, old: "
            r1.<init>(r2)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            int r2 = r12.f80012d     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            r1.append(r2)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            java.lang.String r2 = ", "
            r1.append(r2)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            r1.append(r9)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            java.lang.String r2 = ", key: "
            r1.append(r2)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            java.lang.String r2 = r8.i     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            r1.append(r2)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            java.lang.String r2 = "，rawKey："
            r1.append(r2)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            java.lang.String r2 = r8.h     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            r1.append(r2)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            java.lang.String r2 = r8.h     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            com.toutiao.proxyserver.d.c.d(r0, r1, r2)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            com.toutiao.proxyserver.f r0 = new com.toutiao.proxyserver.f     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            java.lang.String r2 = "Content-Length not match, old length: "
            r1.<init>(r2)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            int r2 = r12.f80012d     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            r1.append(r2)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            java.lang.String r2 = ", new length: "
            r1.append(r2)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            r1.append(r9)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            java.lang.String r2 = ", rawKey: "
            r1.append(r2)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            java.lang.String r2 = r8.h     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            r1.append(r2)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            java.lang.String r2 = ", currentUrl: "
            r1.append(r2)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            r1.append(r10)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            java.lang.String r2 = ", previousInfo: "
            r1.append(r2)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            java.lang.String r2 = r12.f80014f     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            r1.append(r2)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
            throw r0     // Catch:{ IOException -> 0x0192, all -> 0x0190 }
        L_0x0190:
            r0 = move-exception
            goto L_0x0196
        L_0x0192:
            r0 = move-exception
            goto L_0x019a
        L_0x0194:
            r0 = move-exception
            r11 = r6
        L_0x0196:
            r7 = r11
            goto L_0x019e
        L_0x0198:
            r0 = move-exception
            r11 = r6
        L_0x019a:
            r7 = r11
            goto L_0x01a9
        L_0x019c:
            r0 = move-exception
            r7 = r6
        L_0x019e:
            r22 = r13
            r3 = 0
            r16 = 0
        L_0x01a3:
            r21 = 0
            goto L_0x0482
        L_0x01a7:
            r0 = move-exception
            r7 = r6
        L_0x01a9:
            r22 = r13
            r3 = 0
            r16 = 0
        L_0x01ae:
            r21 = 0
            goto L_0x046d
        L_0x01b2:
            r7 = r6
            boolean r1 = r9.f80249e     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            if (r1 != 0) goto L_0x01de
            java.lang.String r0 = com.toutiao.proxyserver.f.c.a((com.toutiao.proxyserver.net.e) r7, (int) r0)     // Catch:{ IOException -> 0x01dc, all -> 0x01da }
            r24.f()     // Catch:{ IOException -> 0x01dc, all -> 0x01da }
            java.nio.charset.Charset r1 = com.toutiao.proxyserver.f.c.f80073b     // Catch:{ IOException -> 0x01dc, all -> 0x01da }
            byte[] r0 = r0.getBytes(r1)     // Catch:{ IOException -> 0x01dc, all -> 0x01da }
            int r1 = r0.length     // Catch:{ IOException -> 0x01dc, all -> 0x01da }
            r9.a(r0, r11, r1)     // Catch:{ IOException -> 0x01dc, all -> 0x01da }
            com.toutiao.proxyserver.d.b r0 = com.toutiao.proxyserver.Proxy.s     // Catch:{ IOException -> 0x01dc, all -> 0x01da }
            if (r0 == 0) goto L_0x01de
            com.toutiao.proxyserver.d.b r0 = com.toutiao.proxyserver.Proxy.s     // Catch:{ IOException -> 0x01dc, all -> 0x01da }
            java.lang.String r1 = "videocache_write_header"
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x01dc, all -> 0x01da }
            java.lang.String r4 = r8.h     // Catch:{ IOException -> 0x01dc, all -> 0x01da }
            r0.a(r1, r2, r4)     // Catch:{ IOException -> 0x01dc, all -> 0x01da }
            goto L_0x01de
        L_0x01da:
            r0 = move-exception
            goto L_0x019e
        L_0x01dc:
            r0 = move-exception
            goto L_0x01a9
        L_0x01de:
            r24.f()     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            com.toutiao.proxyserver.c r0 = r8.f79961b     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            java.lang.String r1 = r8.i     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            java.io.File r1 = r0.e(r1)     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            boolean r0 = r8.t     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            if (r0 == 0) goto L_0x028d
            if (r1 == 0) goto L_0x028d
            long r2 = r1.length()     // Catch:{ IOException -> 0x01dc, all -> 0x01da }
            int r0 = r9.f80248d     // Catch:{ IOException -> 0x01dc, all -> 0x01da }
            long r4 = (long) r0     // Catch:{ IOException -> 0x01dc, all -> 0x01da }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x028d
            com.toutiao.proxyserver.b.c r0 = r8.f79962c     // Catch:{ IOException -> 0x01dc, all -> 0x01da }
            java.lang.String r2 = r8.i     // Catch:{ IOException -> 0x01dc, all -> 0x01da }
            com.toutiao.proxyserver.t r3 = r8.j     // Catch:{ IOException -> 0x01dc, all -> 0x01da }
            com.toutiao.proxyserver.t$a r3 = r3.f80255d     // Catch:{ IOException -> 0x01dc, all -> 0x01da }
            int r3 = r3.f80257b     // Catch:{ IOException -> 0x01dc, all -> 0x01da }
            com.toutiao.proxyserver.f.c.a(r7, r0, r2, r3)     // Catch:{ IOException -> 0x01dc, all -> 0x01da }
            com.toutiao.proxyserver.s r0 = new com.toutiao.proxyserver.s     // Catch:{ a -> 0x0220 }
            java.lang.String r2 = "rwd"
            r0.<init>(r1, r2)     // Catch:{ a -> 0x0220 }
            int r2 = r9.f80248d     // Catch:{ a -> 0x0220 }
            long r2 = (long) r2     // Catch:{ a -> 0x0220 }
            r0.a((long) r2)     // Catch:{ a -> 0x0220 }
            com.toutiao.proxyserver.d r2 = new com.toutiao.proxyserver.d     // Catch:{ a -> 0x0220 }
            r2.<init>(r0)     // Catch:{ a -> 0x0220 }
            java.util.concurrent.Future r3 = r2.b()     // Catch:{ a -> 0x021e }
            goto L_0x0230
        L_0x021e:
            r0 = move-exception
            goto L_0x0222
        L_0x0220:
            r0 = move-exception
            r2 = 0
        L_0x0222:
            java.lang.String r3 = "TAG_PROXY_ProxyTask"
            java.lang.String r0 = com.toutiao.proxyserver.d.c.a(r0)     // Catch:{ IOException -> 0x0285, all -> 0x027d }
            java.lang.String r4 = r8.h     // Catch:{ IOException -> 0x0285, all -> 0x027d }
            com.toutiao.proxyserver.d.c.d(r3, r0, r4)     // Catch:{ IOException -> 0x0285, all -> 0x027d }
            r0 = 0
            r2 = 0
            r3 = 0
        L_0x0230:
            java.lang.String r4 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0273, all -> 0x0269 }
            java.lang.String r6 = "can write to cache file in network task, cache file size: "
            r5.<init>(r6)     // Catch:{ IOException -> 0x0273, all -> 0x0269 }
            long r11 = r1.length()     // Catch:{ IOException -> 0x0273, all -> 0x0269 }
            r5.append(r11)     // Catch:{ IOException -> 0x0273, all -> 0x0269 }
            java.lang.String r1 = ", from: "
            r5.append(r1)     // Catch:{ IOException -> 0x0273, all -> 0x0269 }
            int r1 = r9.f80248d     // Catch:{ IOException -> 0x0273, all -> 0x0269 }
            r5.append(r1)     // Catch:{ IOException -> 0x0273, all -> 0x0269 }
            java.lang.String r1 = "，rawKey："
            r5.append(r1)     // Catch:{ IOException -> 0x0273, all -> 0x0269 }
            java.lang.String r1 = r8.h     // Catch:{ IOException -> 0x0273, all -> 0x0269 }
            r5.append(r1)     // Catch:{ IOException -> 0x0273, all -> 0x0269 }
            java.lang.String r1 = "， key:"
            r5.append(r1)     // Catch:{ IOException -> 0x0273, all -> 0x0269 }
            java.lang.String r1 = r8.i     // Catch:{ IOException -> 0x0273, all -> 0x0269 }
            r5.append(r1)     // Catch:{ IOException -> 0x0273, all -> 0x0269 }
            java.lang.String r1 = r5.toString()     // Catch:{ IOException -> 0x0273, all -> 0x0269 }
            java.lang.String r5 = r8.h     // Catch:{ IOException -> 0x0273, all -> 0x0269 }
            com.toutiao.proxyserver.d.c.b(r4, r1, r5)     // Catch:{ IOException -> 0x0273, all -> 0x0269 }
            r11 = r3
            goto L_0x02c7
        L_0x0269:
            r0 = move-exception
            r16 = r2
            r21 = r3
            r22 = r13
        L_0x0270:
            r3 = 0
            goto L_0x0482
        L_0x0273:
            r0 = move-exception
            r16 = r2
            r21 = r3
            r22 = r13
        L_0x027a:
            r3 = 0
            goto L_0x046d
        L_0x027d:
            r0 = move-exception
            r16 = r2
            r22 = r13
            r3 = 0
            goto L_0x01a3
        L_0x0285:
            r0 = move-exception
            r16 = r2
            r22 = r13
            r3 = 0
            goto L_0x01ae
        L_0x028d:
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            java.lang.String r3 = "can't write to cache file in network task, cache file size: "
            r2.<init>(r3)     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            long r3 = r1.length()     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            r2.append(r3)     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            java.lang.String r1 = ", from: "
            r2.append(r1)     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            int r1 = r9.f80248d     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            r2.append(r1)     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            java.lang.String r1 = "，rawKey："
            r2.append(r1)     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            java.lang.String r1 = r8.h     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            r2.append(r1)     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            java.lang.String r1 = "， key:"
            r2.append(r1)     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            java.lang.String r1 = r8.i     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            r2.append(r1)     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            java.lang.String r2 = r8.h     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            com.toutiao.proxyserver.d.c.c(r0, r1, r2)     // Catch:{ IOException -> 0x0447, all -> 0x0442 }
            r0 = 0
            r2 = 0
            r11 = 0
        L_0x02c7:
            com.toutiao.proxyserver.b.c r1 = r8.f79962c     // Catch:{ IOException -> 0x0439, all -> 0x0430 }
            java.lang.String r3 = r8.i     // Catch:{ IOException -> 0x0439, all -> 0x0430 }
            int r4 = r24.g()     // Catch:{ IOException -> 0x0439, all -> 0x0430 }
            com.toutiao.proxyserver.b.a r1 = r1.a(r3, r4)     // Catch:{ IOException -> 0x0439, all -> 0x0430 }
            if (r1 != 0) goto L_0x02d7
            r12 = 0
            goto L_0x02da
        L_0x02d7:
            int r1 = r1.f80012d     // Catch:{ IOException -> 0x0439, all -> 0x0430 }
            r12 = r1
        L_0x02da:
            int r1 = com.toutiao.proxyserver.Proxy.m     // Catch:{ IOException -> 0x0439, all -> 0x0430 }
            byte[] r5 = new byte[r1]     // Catch:{ IOException -> 0x0439, all -> 0x0430 }
            java.io.InputStream r6 = r7.d()     // Catch:{ IOException -> 0x0439, all -> 0x0430 }
            r17 = r0
            r4 = r2
        L_0x02e5:
            if (r6 == 0) goto L_0x0396
            r24.f()     // Catch:{ IOException -> 0x038c, all -> 0x0382 }
            r24.i()     // Catch:{ IOException -> 0x038c, all -> 0x0382 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x038c, all -> 0x0382 }
            int r3 = r6.read(r5)     // Catch:{ IOException -> 0x038c, all -> 0x0382 }
            com.toutiao.proxyserver.n r2 = com.toutiao.proxyserver.Proxy.g     // Catch:{ IOException -> 0x038c, all -> 0x0382 }
            if (r2 == 0) goto L_0x0316
            java.lang.String r2 = r8.h     // Catch:{ IOException -> 0x038c, all -> 0x0382 }
            long r18 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x038c, all -> 0x0382 }
            r20 = 0
            long r18 = r18 - r0
            r1 = r24
            r0 = r3
            r3 = r26
            r21 = r11
            r11 = r4
            r4 = r0
            r22 = r13
            r13 = r5
            r14 = r6
            r5 = r18
            r1.a((java.lang.String) r2, (java.lang.String) r3, (int) r4, (long) r5)     // Catch:{ IOException -> 0x0380, all -> 0x037e }
            goto L_0x031e
        L_0x0316:
            r0 = r3
            r21 = r11
            r22 = r13
            r11 = r4
            r13 = r5
            r14 = r6
        L_0x031e:
            r24.h()     // Catch:{ IOException -> 0x0380, all -> 0x037e }
            if (r0 < 0) goto L_0x039b
            if (r0 <= 0) goto L_0x0368
            r1 = 0
            r9.b(r13, r1, r0)     // Catch:{ IOException -> 0x0380, all -> 0x037e }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0380, all -> 0x037e }
            r15.a(r2)     // Catch:{ IOException -> 0x0380, all -> 0x037e }
            if (r11 == 0) goto L_0x0363
            r11.a(r13, r1, r0)     // Catch:{ Throwable -> 0x0333 }
            goto L_0x0363
        L_0x0333:
            r0 = move-exception
            r1 = r0
            if (r17 == 0) goto L_0x033c
            r17.a()     // Catch:{ IOException -> 0x0380, all -> 0x037e }
            r17 = 0
        L_0x033c:
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x035d, all -> 0x0357 }
            java.lang.String r3 = "append to cache file error in network task!!! "
            r2.<init>(r3)     // Catch:{ IOException -> 0x035d, all -> 0x0357 }
            java.lang.String r1 = com.toutiao.proxyserver.d.c.a(r1)     // Catch:{ IOException -> 0x035d, all -> 0x0357 }
            r2.append(r1)     // Catch:{ IOException -> 0x035d, all -> 0x0357 }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x035d, all -> 0x0357 }
            java.lang.String r2 = r8.h     // Catch:{ IOException -> 0x035d, all -> 0x0357 }
            com.toutiao.proxyserver.d.c.d(r0, r1, r2)     // Catch:{ IOException -> 0x035d, all -> 0x0357 }
            r11 = 0
            goto L_0x0363
        L_0x0357:
            r0 = move-exception
            r3 = 0
            r16 = 0
            goto L_0x0482
        L_0x035d:
            r0 = move-exception
            r3 = 0
            r16 = 0
            goto L_0x046d
        L_0x0363:
            int r0 = r9.f80248d     // Catch:{ IOException -> 0x0380, all -> 0x037e }
            r8.a(r12, r0)     // Catch:{ IOException -> 0x0380, all -> 0x037e }
        L_0x0368:
            r4 = r11
            r24.f()     // Catch:{ IOException -> 0x0379, all -> 0x0374 }
            r5 = r13
            r6 = r14
            r11 = r21
            r13 = r22
            goto L_0x02e5
        L_0x0374:
            r0 = move-exception
            r16 = r4
            goto L_0x0270
        L_0x0379:
            r0 = move-exception
            r16 = r4
            goto L_0x027a
        L_0x037e:
            r0 = move-exception
            goto L_0x0388
        L_0x0380:
            r0 = move-exception
            goto L_0x0392
        L_0x0382:
            r0 = move-exception
            r21 = r11
            r22 = r13
            r11 = r4
        L_0x0388:
            r16 = r11
            goto L_0x0270
        L_0x038c:
            r0 = move-exception
            r21 = r11
            r22 = r13
            r11 = r4
        L_0x0392:
            r16 = r11
            goto L_0x027a
        L_0x0396:
            r21 = r11
            r22 = r13
            r11 = r4
        L_0x039b:
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x042b, all -> 0x0425 }
            java.lang.String r2 = "read from net complete!，rawKey："
            r1.<init>(r2)     // Catch:{ IOException -> 0x042b, all -> 0x0425 }
            java.lang.String r2 = r8.h     // Catch:{ IOException -> 0x042b, all -> 0x0425 }
            r1.append(r2)     // Catch:{ IOException -> 0x042b, all -> 0x0425 }
            java.lang.String r2 = "， key:"
            r1.append(r2)     // Catch:{ IOException -> 0x042b, all -> 0x0425 }
            java.lang.String r2 = r8.i     // Catch:{ IOException -> 0x042b, all -> 0x0425 }
            r1.append(r2)     // Catch:{ IOException -> 0x042b, all -> 0x0425 }
            java.lang.String r2 = ", url:"
            r1.append(r2)     // Catch:{ IOException -> 0x042b, all -> 0x0425 }
            r1.append(r10)     // Catch:{ IOException -> 0x042b, all -> 0x0425 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x042b, all -> 0x0425 }
            java.lang.String r2 = r8.h     // Catch:{ IOException -> 0x042b, all -> 0x0425 }
            com.toutiao.proxyserver.d.c.b(r0, r1, r2)     // Catch:{ IOException -> 0x042b, all -> 0x0425 }
            java.lang.String r0 = "complete"
            int r1 = r8.l     // Catch:{ IOException -> 0x042b, all -> 0x0425 }
            r3 = 0
            r8.a(r3, r0, r1)     // Catch:{ IOException -> 0x0423, all -> 0x0421 }
            r24.d()     // Catch:{ IOException -> 0x0423, all -> 0x0421 }
            com.toutiao.proxyserver.n r0 = com.toutiao.proxyserver.Proxy.g     // Catch:{ IOException -> 0x0423, all -> 0x0421 }
            if (r0 == 0) goto L_0x03df
            int r0 = r9.f80248d     // Catch:{ IOException -> 0x0423, all -> 0x0421 }
            if (r0 < r12) goto L_0x03df
            com.toutiao.proxyserver.r$4 r0 = new com.toutiao.proxyserver.r$4     // Catch:{ IOException -> 0x0423, all -> 0x0421 }
            r0.<init>()     // Catch:{ IOException -> 0x0423, all -> 0x0421 }
            com.toutiao.proxyserver.f.c.b((java.lang.Runnable) r0)     // Catch:{ IOException -> 0x0423, all -> 0x0421 }
        L_0x03df:
            r1 = 0
            com.toutiao.proxyserver.Proxy.a(r1, r10)     // Catch:{ IOException -> 0x0423, all -> 0x0421 }
            com.toutiao.proxyserver.e.c r0 = com.toutiao.proxyserver.e.c.a()
            r0.c()
            com.toutiao.proxyserver.e.c r0 = com.toutiao.proxyserver.e.c.a()
            r0.e()
            com.toutiao.proxyserver.f.c.a((java.io.Closeable) r7)
            if (r11 == 0) goto L_0x03f9
            r11.a()
        L_0x03f9:
            java.util.concurrent.atomic.AtomicInteger r0 = r8.f79963d
            long r1 = r15.a()
            int r1 = (int) r1
            r0.addAndGet(r1)
            java.util.concurrent.atomic.AtomicLong r0 = r8.f79964e
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r22
            r0.addAndGet(r1)
            java.lang.String r0 = "proxy"
            r8.a(r0)
            java.lang.String r0 = "finally"
            int r1 = r8.l
            r8.a(r3, r0, r1)
            if (r21 == 0) goto L_0x0420
            r21.get()     // Catch:{ InterruptedException | ExecutionException -> 0x041f }
        L_0x041f:
            return
        L_0x0420:
            return
        L_0x0421:
            r0 = move-exception
            goto L_0x0427
        L_0x0423:
            r0 = move-exception
            goto L_0x042d
        L_0x0425:
            r0 = move-exception
            r3 = 0
        L_0x0427:
            r16 = r11
            goto L_0x0482
        L_0x042b:
            r0 = move-exception
            r3 = 0
        L_0x042d:
            r16 = r11
            goto L_0x046d
        L_0x0430:
            r0 = move-exception
            r21 = r11
            r22 = r13
            r3 = 0
            r16 = r2
            goto L_0x0482
        L_0x0439:
            r0 = move-exception
            r21 = r11
            r22 = r13
            r3 = 0
            r16 = r2
            goto L_0x046d
        L_0x0442:
            r0 = move-exception
            r22 = r13
            r3 = 0
            goto L_0x0451
        L_0x0447:
            r0 = move-exception
            r22 = r13
            r3 = 0
            goto L_0x0459
        L_0x044c:
            r0 = move-exception
            r3 = r7
            r22 = r13
            r7 = r6
        L_0x0451:
            r16 = r3
            goto L_0x0462
        L_0x0454:
            r0 = move-exception
            r3 = r7
            r22 = r13
            r7 = r6
        L_0x0459:
            r16 = r3
            goto L_0x046b
        L_0x045c:
            r0 = move-exception
            r3 = r7
            r22 = r13
            r16 = r7
        L_0x0462:
            r21 = r16
            goto L_0x0482
        L_0x0465:
            r0 = move-exception
            r3 = r7
            r22 = r13
            r16 = r7
        L_0x046b:
            r21 = r16
        L_0x046d:
            java.lang.String r1 = "Canceled"
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x0481 }
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch:{ all -> 0x0481 }
            if (r1 != 0) goto L_0x0480
            java.lang.String r1 = "exception"
            int r2 = r8.l     // Catch:{ all -> 0x0481 }
            r8.a(r0, r1, r2)     // Catch:{ all -> 0x0481 }
        L_0x0480:
            throw r0     // Catch:{ all -> 0x0481 }
        L_0x0481:
            r0 = move-exception
        L_0x0482:
            com.toutiao.proxyserver.e.c r1 = com.toutiao.proxyserver.e.c.a()
            r1.c()
            com.toutiao.proxyserver.e.c r1 = com.toutiao.proxyserver.e.c.a()
            r1.e()
            com.toutiao.proxyserver.f.c.a((java.io.Closeable) r7)
            if (r16 == 0) goto L_0x0498
            r16.a()
        L_0x0498:
            java.util.concurrent.atomic.AtomicInteger r1 = r8.f79963d
            long r4 = r15.a()
            int r2 = (int) r4
            r1.addAndGet(r2)
            java.util.concurrent.atomic.AtomicLong r1 = r8.f79964e
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r22
            r1.addAndGet(r4)
            java.lang.String r1 = "proxy"
            r8.a(r1)
            java.lang.String r1 = "finally"
            int r2 = r8.l
            r8.a(r3, r1, r2)
            if (r21 == 0) goto L_0x04be
            r21.get()     // Catch:{ InterruptedException | ExecutionException -> 0x04be }
        L_0x04be:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.r.a(com.toutiao.proxyserver.r$b, java.lang.String):void");
    }

    private byte[] a(com.toutiao.proxyserver.b.a aVar, b bVar, String str) throws IOException {
        com.toutiao.proxyserver.b.a aVar2 = aVar;
        b bVar2 = bVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aVar2, bVar2, str2}, this, n, false, 91735, new Class[]{com.toutiao.proxyserver.b.a.class, b.class, String.class}, byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[]{aVar2, bVar2, str2}, this, n, false, 91735, new Class[]{com.toutiao.proxyserver.b.a.class, b.class, String.class}, byte[].class);
        } else if (aVar2 != null) {
            com.toutiao.proxyserver.d.c.b("TAG_PROXY_ProxyTask", "get header from db", this.h);
            return com.toutiao.proxyserver.f.c.a(aVar2, bVar2.f80248d).getBytes(com.toutiao.proxyserver.f.c.f80073b);
        } else {
            e a2 = a(str2, 0, -1, "HEAD");
            com.toutiao.proxyserver.f.c.a(a2, false, false);
            com.toutiao.proxyserver.b.a a3 = com.toutiao.proxyserver.f.c.a(a2, this.f79962c, this.i, this.j.f80255d.f80257b);
            com.toutiao.proxyserver.d.c.c("TAG_PROXY_ProxyTask", "get header from network", this.h);
            return com.toutiao.proxyserver.f.c.a(a3, bVar2.f80248d).getBytes(com.toutiao.proxyserver.f.c.f80073b);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03f0 A[SYNTHETIC, Splitter:B:118:0x03f0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.toutiao.proxyserver.b.a r28, java.io.File r29, com.toutiao.proxyserver.r.b r30, java.lang.String r31) throws java.lang.Exception {
        /*
            r27 = this;
            r9 = r27
            r0 = r28
            r8 = r29
            r10 = r30
            r11 = r31
            r12 = 4
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r13 = 0
            r1[r13] = r0
            r14 = 1
            r1[r14] = r8
            r15 = 2
            r1[r15] = r10
            r16 = 3
            r1[r16] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = n
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class<com.toutiao.proxyserver.b.a> r2 = com.toutiao.proxyserver.b.a.class
            r6[r13] = r2
            java.lang.Class<java.io.File> r2 = java.io.File.class
            r6[r14] = r2
            java.lang.Class<com.toutiao.proxyserver.r$b> r2 = com.toutiao.proxyserver.r.b.class
            r6[r15] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r16] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 91736(0x16658, float:1.2855E-40)
            r2 = r27
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0066
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r13] = r0
            r1[r14] = r8
            r1[r15] = r10
            r1[r16] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = n
            r4 = 0
            r5 = 91736(0x16658, float:1.2855E-40)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class<com.toutiao.proxyserver.b.a> r0 = com.toutiao.proxyserver.b.a.class
            r6[r13] = r0
            java.lang.Class<java.io.File> r0 = java.io.File.class
            r6[r14] = r0
            java.lang.Class<com.toutiao.proxyserver.r$b> r0 = com.toutiao.proxyserver.r.b.class
            r6[r15] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r16] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0066:
            java.lang.String r1 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "processCacheNetWorkConcurrent() called with: headerInfo = ["
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = "], url = ["
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r9.h
            com.toutiao.proxyserver.d.c.a(r1, r2, r3)
            boolean r1 = r10.f80249e
            if (r1 != 0) goto L_0x00b9
            com.toutiao.proxyserver.d.b r1 = com.toutiao.proxyserver.Proxy.s
            if (r1 == 0) goto L_0x009d
            com.toutiao.proxyserver.d.b r1 = com.toutiao.proxyserver.Proxy.s
            java.lang.String r2 = "videocache_start_request"
            long r3 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r5 = r9.h
            r1.a(r2, r3, r5)
        L_0x009d:
            byte[] r1 = r9.a(r0, r10, r11)
            r27.f()
            int r2 = r1.length
            r10.a(r1, r13, r2)
            com.toutiao.proxyserver.d.b r1 = com.toutiao.proxyserver.Proxy.s
            if (r1 == 0) goto L_0x00b9
            com.toutiao.proxyserver.d.b r1 = com.toutiao.proxyserver.Proxy.s
            java.lang.String r2 = "videocache_write_header"
            long r3 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r5 = r9.h
            r1.a(r2, r3, r5)
        L_0x00b9:
            if (r0 != 0) goto L_0x00eb
            com.toutiao.proxyserver.b.c r0 = r9.f79962c
            java.lang.String r1 = r9.i
            com.toutiao.proxyserver.t r2 = r9.j
            com.toutiao.proxyserver.t$a r2 = r2.f80255d
            int r2 = r2.f80257b
            com.toutiao.proxyserver.b.a r0 = r0.a(r1, r2)
            if (r0 == 0) goto L_0x00cc
            goto L_0x00eb
        L_0x00cc:
            java.lang.String r0 = r9.h
            java.lang.String r1 = "TAG_PROXY_ProxyTask"
            java.lang.String r2 = "failed to get video header info"
            com.toutiao.proxyserver.d.c.d(r1, r2, r0)
            com.toutiao.proxyserver.u r0 = new com.toutiao.proxyserver.u
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "failed to get video header info. key = "
            r1.<init>(r2)
            java.lang.String r2 = r9.h
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00eb:
            int r0 = r0.f80012d
            long r1 = r29.length()
            long r3 = (long) r0
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x0183
            java.lang.String r1 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[processCacheNetWorkConcurrent] need to download. ，rawKey："
            r2.<init>(r3)
            java.lang.String r3 = r9.h
            r2.append(r3)
            java.lang.String r3 = "， key:"
            r2.append(r3)
            java.lang.String r3 = r9.i
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r9.h
            com.toutiao.proxyserver.d.c.b(r1, r2, r3)
            com.toutiao.proxyserver.i r1 = r9.r
            if (r1 == 0) goto L_0x012b
            boolean r2 = r1.c()
            if (r2 != 0) goto L_0x012b
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0129
            goto L_0x012b
        L_0x0129:
            r1 = r5
            goto L_0x0180
        L_0x012b:
            r27.l()
            com.toutiao.proxyserver.i$a r1 = new com.toutiao.proxyserver.i$a
            r1.<init>()
            com.toutiao.proxyserver.c r2 = r9.f79961b
            com.toutiao.proxyserver.i$a r1 = r1.a((com.toutiao.proxyserver.c) r2)
            com.toutiao.proxyserver.b.c r2 = r9.f79962c
            com.toutiao.proxyserver.i$a r1 = r1.a((com.toutiao.proxyserver.b.c) r2)
            java.lang.String r2 = r9.h
            com.toutiao.proxyserver.i$a r1 = r1.a((java.lang.String) r2)
            java.lang.String r2 = r9.i
            com.toutiao.proxyserver.i$a r1 = r1.b(r2)
            com.toutiao.proxyserver.y r2 = new com.toutiao.proxyserver.y
            com.toutiao.proxyserver.y r3 = r9.k
            java.util.List<java.lang.String> r3 = r3.f80272b
            r2.<init>(r3)
            com.toutiao.proxyserver.i$a r1 = r1.a((com.toutiao.proxyserver.y) r2)
            java.util.List r2 = r9.f79965f
            com.toutiao.proxyserver.i$a r1 = r1.a((java.util.List<com.toutiao.proxyserver.net.c>) r2)
            com.toutiao.proxyserver.t r2 = r9.j
            r1.i = r2
            com.toutiao.proxyserver.r$2 r2 = new com.toutiao.proxyserver.r$2
            r2.<init>()
            com.toutiao.proxyserver.i$a r1 = r1.a((com.toutiao.proxyserver.i.b) r2)
            com.toutiao.proxyserver.i r1 = r1.a()
            r9.r = r1
            java.util.concurrent.ExecutorService r2 = r9.q
            java.util.concurrent.Future r1 = r2.submit(r1)
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            java.lang.String r3 = "fire download in process cache task"
            java.lang.String r4 = r9.h
            com.toutiao.proxyserver.d.c.d(r2, r3, r4)
        L_0x0180:
            r17 = r1
            goto L_0x01b2
        L_0x0183:
            java.lang.String r1 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[processCacheNetWorkConcurrent] This video has been totally downloaded ，rawKey："
            r2.<init>(r3)
            java.lang.String r3 = r9.h
            r2.append(r3)
            java.lang.String r3 = "， key:"
            r2.append(r3)
            java.lang.String r3 = r9.i
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r9.h
            com.toutiao.proxyserver.d.c.b(r1, r2, r3)
            com.toutiao.proxyserver.n r1 = com.toutiao.proxyserver.Proxy.g
            if (r1 == 0) goto L_0x01b0
            com.toutiao.proxyserver.r$3 r1 = new com.toutiao.proxyserver.r$3
            r1.<init>(r0)
            com.toutiao.proxyserver.f.c.b((java.lang.Runnable) r1)
        L_0x01b0:
            r17 = r5
        L_0x01b2:
            r1 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = new byte[r1]
            com.toutiao.proxyserver.s r7 = new com.toutiao.proxyserver.s     // Catch:{ all -> 0x03e4 }
            java.lang.String r2 = "r"
            r7.<init>(r8, r2)     // Catch:{ all -> 0x03e4 }
            int r2 = r10.f80248d     // Catch:{ all -> 0x03e1 }
            long r2 = (long) r2     // Catch:{ all -> 0x03e1 }
            r7.a((long) r2)     // Catch:{ all -> 0x03e1 }
            com.toutiao.proxyserver.t r2 = r9.j     // Catch:{ all -> 0x03e1 }
            com.toutiao.proxyserver.t$a r2 = r2.f80255d     // Catch:{ all -> 0x03e1 }
            int r2 = r2.f80261f     // Catch:{ all -> 0x03e1 }
            if (r2 <= 0) goto L_0x01d5
            com.toutiao.proxyserver.t r2 = r9.j     // Catch:{ all -> 0x03e1 }
            com.toutiao.proxyserver.t$a r2 = r2.f80255d     // Catch:{ all -> 0x03e1 }
            int r2 = r2.f80261f     // Catch:{ all -> 0x03e1 }
            int r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x03e1 }
        L_0x01d5:
            r2 = r0
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x03e1 }
            java.lang.String r4 = "read cache file start getCurrentOffset:"
            r3.<init>(r4)     // Catch:{ all -> 0x03e1 }
            int r4 = r10.f80248d     // Catch:{ all -> 0x03e1 }
            r3.append(r4)     // Catch:{ all -> 0x03e1 }
            java.lang.String r4 = ", maxLen:"
            r3.append(r4)     // Catch:{ all -> 0x03e1 }
            r3.append(r2)     // Catch:{ all -> 0x03e1 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x03e1 }
            com.toutiao.proxyserver.d.c.b(r0, r3)     // Catch:{ all -> 0x03e1 }
            r0 = 0
            r5 = 0
            r12 = 0
            r18 = 0
        L_0x01fa:
            int r8 = r10.f80248d     // Catch:{ all -> 0x03e1 }
            if (r8 >= r2) goto L_0x02ff
            r27.f()     // Catch:{ all -> 0x03e1 }
            long r20 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x03e1 }
            int r8 = r7.a((byte[]) r1)     // Catch:{ all -> 0x03e1 }
            long r22 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x03e1 }
            r24 = 0
            long r22 = r22 - r20
            long r5 = r5 + r22
            long r3 = (long) r8     // Catch:{ all -> 0x03e1 }
            long r12 = r12 + r3
            if (r8 > 0) goto L_0x02f1
            com.toutiao.proxyserver.i r3 = r9.r     // Catch:{ all -> 0x03e1 }
            if (r3 == 0) goto L_0x0221
            java.lang.Exception r4 = r3.p     // Catch:{ all -> 0x03e1 }
            if (r4 != 0) goto L_0x0220
            goto L_0x0221
        L_0x0220:
            throw r4     // Catch:{ all -> 0x03e1 }
        L_0x0221:
            if (r3 == 0) goto L_0x02ba
            boolean r4 = r3.c()     // Catch:{ all -> 0x03e1 }
            if (r4 != 0) goto L_0x02ba
            boolean r4 = r3.e()     // Catch:{ all -> 0x03e1 }
            if (r4 != 0) goto L_0x02ba
            int r4 = r0 + 1
            r0 = 15
            if (r4 <= r0) goto L_0x0273
            r20 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r0 >= 0) goto L_0x023c
            goto L_0x0273
        L_0x023c:
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03e1 }
            java.lang.String r2 = "wait data too long!!!，rawKey："
            r1.<init>(r2)     // Catch:{ all -> 0x03e1 }
            java.lang.String r2 = r9.h     // Catch:{ all -> 0x03e1 }
            r1.append(r2)     // Catch:{ all -> 0x03e1 }
            java.lang.String r2 = "， key:"
            r1.append(r2)     // Catch:{ all -> 0x03e1 }
            java.lang.String r2 = r9.i     // Catch:{ all -> 0x03e1 }
            r1.append(r2)     // Catch:{ all -> 0x03e1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x03e1 }
            java.lang.String r2 = r9.h     // Catch:{ all -> 0x03e1 }
            com.toutiao.proxyserver.d.c.d(r0, r1, r2)     // Catch:{ all -> 0x03e1 }
            com.toutiao.proxyserver.u r0 = new com.toutiao.proxyserver.u     // Catch:{ all -> 0x03e1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03e1 }
            java.lang.String r2 = "wait data too long!!! key = "
            r1.<init>(r2)     // Catch:{ all -> 0x03e1 }
            java.lang.String r2 = r9.h     // Catch:{ all -> 0x03e1 }
            r1.append(r2)     // Catch:{ all -> 0x03e1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x03e1 }
            r0.<init>(r1)     // Catch:{ all -> 0x03e1 }
            throw r0     // Catch:{ all -> 0x03e1 }
        L_0x0273:
            r27.f()     // Catch:{ all -> 0x03e1 }
            java.lang.Object r8 = r3.o     // Catch:{ all -> 0x03e1 }
            monitor-enter(r8)     // Catch:{ all -> 0x03e1 }
            long r20 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02b7 }
            java.lang.Object r0 = r3.o     // Catch:{ InterruptedException -> 0x0290 }
            r14 = 1000(0x3e8, double:4.94E-321)
            r0.wait(r14)     // Catch:{ InterruptedException -> 0x0290 }
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02b7 }
            r0 = 0
        L_0x0289:
            long r14 = r14 - r20
            long r18 = r18 + r14
            goto L_0x02b0
        L_0x028e:
            r0 = move-exception
            goto L_0x02b3
        L_0x0290:
            r0 = move-exception
            java.lang.String r3 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x028e }
            java.lang.String r15 = "InterruptedException: "
            r14.<init>(r15)     // Catch:{ all -> 0x028e }
            java.lang.String r0 = com.toutiao.proxyserver.d.c.a(r0)     // Catch:{ all -> 0x028e }
            r14.append(r0)     // Catch:{ all -> 0x028e }
            java.lang.String r0 = r14.toString()     // Catch:{ all -> 0x028e }
            java.lang.String r14 = r9.h     // Catch:{ all -> 0x028e }
            com.toutiao.proxyserver.d.c.d(r3, r0, r14)     // Catch:{ all -> 0x028e }
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02b7 }
            r0 = 0
            goto L_0x0289
        L_0x02b0:
            monitor-exit(r8)     // Catch:{ all -> 0x02b7 }
            r0 = r4
            goto L_0x02f8
        L_0x02b3:
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02b7 }
            throw r0     // Catch:{ all -> 0x02b7 }
        L_0x02b7:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x02b7 }
            throw r0     // Catch:{ all -> 0x03e1 }
        L_0x02ba:
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03e1 }
            java.lang.String r2 = "download task has finished!!!，rawKey："
            r1.<init>(r2)     // Catch:{ all -> 0x03e1 }
            java.lang.String r2 = r9.h     // Catch:{ all -> 0x03e1 }
            r1.append(r2)     // Catch:{ all -> 0x03e1 }
            java.lang.String r2 = "， key:"
            r1.append(r2)     // Catch:{ all -> 0x03e1 }
            java.lang.String r2 = r9.i     // Catch:{ all -> 0x03e1 }
            r1.append(r2)     // Catch:{ all -> 0x03e1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x03e1 }
            java.lang.String r2 = r9.h     // Catch:{ all -> 0x03e1 }
            com.toutiao.proxyserver.d.c.d(r0, r1, r2)     // Catch:{ all -> 0x03e1 }
            com.toutiao.proxyserver.u r0 = new com.toutiao.proxyserver.u     // Catch:{ all -> 0x03e1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03e1 }
            java.lang.String r2 = "download task has finished!!! key = "
            r1.<init>(r2)     // Catch:{ all -> 0x03e1 }
            java.lang.String r2 = r9.h     // Catch:{ all -> 0x03e1 }
            r1.append(r2)     // Catch:{ all -> 0x03e1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x03e1 }
            r0.<init>(r1)     // Catch:{ all -> 0x03e1 }
            throw r0     // Catch:{ all -> 0x03e1 }
        L_0x02f1:
            r3 = 0
            r10.b(r1, r3, r8)     // Catch:{ all -> 0x03e1 }
            r0 = 0
            r18 = 0
        L_0x02f8:
            r27.f()     // Catch:{ all -> 0x03e1 }
            r14 = 1
            r15 = 2
            goto L_0x01fa
        L_0x02ff:
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03e1 }
            java.lang.String r3 = "read cache file complete: "
            r1.<init>(r3)     // Catch:{ all -> 0x03e1 }
            int r3 = r10.f80248d     // Catch:{ all -> 0x03e1 }
            r1.append(r3)     // Catch:{ all -> 0x03e1 }
            java.lang.String r3 = ", "
            r1.append(r3)     // Catch:{ all -> 0x03e1 }
            r1.append(r2)     // Catch:{ all -> 0x03e1 }
            java.lang.String r2 = "，rawKey："
            r1.append(r2)     // Catch:{ all -> 0x03e1 }
            java.lang.String r2 = r9.h     // Catch:{ all -> 0x03e1 }
            r1.append(r2)     // Catch:{ all -> 0x03e1 }
            java.lang.String r2 = "， key:"
            r1.append(r2)     // Catch:{ all -> 0x03e1 }
            java.lang.String r2 = r9.i     // Catch:{ all -> 0x03e1 }
            r1.append(r2)     // Catch:{ all -> 0x03e1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x03e1 }
            java.lang.String r2 = r9.h     // Catch:{ all -> 0x03e1 }
            com.toutiao.proxyserver.d.c.b(r0, r1, r2)     // Catch:{ all -> 0x03e1 }
            com.toutiao.proxyserver.m r0 = com.toutiao.proxyserver.Proxy.h     // Catch:{ all -> 0x03e1 }
            if (r0 == 0) goto L_0x03ce
            java.lang.String r0 = r9.h     // Catch:{ all -> 0x03e1 }
            r1 = 4
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x03e1 }
            r1 = 0
            r2[r1] = r0     // Catch:{ all -> 0x03e1 }
            r1 = 1
            r2[r1] = r11     // Catch:{ all -> 0x03e1 }
            java.lang.Long r1 = new java.lang.Long     // Catch:{ all -> 0x03e1 }
            r1.<init>(r12)     // Catch:{ all -> 0x03e1 }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x03e1 }
            java.lang.Long r1 = new java.lang.Long     // Catch:{ all -> 0x03e1 }
            r1.<init>(r5)     // Catch:{ all -> 0x03e1 }
            r2[r16] = r1     // Catch:{ all -> 0x03e1 }
            com.meituan.robust.ChangeQuickRedirect r3 = com.toutiao.proxyserver.a.f79960a     // Catch:{ all -> 0x03e1 }
            r4 = 0
            r8 = 91597(0x165cd, float:1.28355E-40)
            r1 = 4
            java.lang.Class[] r10 = new java.lang.Class[r1]     // Catch:{ all -> 0x03e1 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r14 = 0
            r10[r14] = r1     // Catch:{ all -> 0x03e1 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r14 = 1
            r10[r14] = r1     // Catch:{ all -> 0x03e1 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x03e1 }
            r14 = 2
            r10[r14] = r1     // Catch:{ all -> 0x03e1 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x03e1 }
            r10[r16] = r1     // Catch:{ all -> 0x03e1 }
            java.lang.Class r14 = java.lang.Void.TYPE     // Catch:{ all -> 0x03e1 }
            r1 = r2
            r2 = r27
            r25 = r5
            r5 = r8
            r6 = r10
            r10 = r7
            r7 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x03df }
            if (r1 == 0) goto L_0x03bc
            r1 = 4
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x03df }
            r1 = 0
            r2[r1] = r0     // Catch:{ all -> 0x03df }
            r1 = 1
            r2[r1] = r11     // Catch:{ all -> 0x03df }
            java.lang.Long r0 = new java.lang.Long     // Catch:{ all -> 0x03df }
            r0.<init>(r12)     // Catch:{ all -> 0x03df }
            r1 = 2
            r2[r1] = r0     // Catch:{ all -> 0x03df }
            java.lang.Long r0 = new java.lang.Long     // Catch:{ all -> 0x03df }
            r5 = r25
            r0.<init>(r5)     // Catch:{ all -> 0x03df }
            r2[r16] = r0     // Catch:{ all -> 0x03df }
            com.meituan.robust.ChangeQuickRedirect r3 = com.toutiao.proxyserver.a.f79960a     // Catch:{ all -> 0x03df }
            r4 = 0
            r5 = 91597(0x165cd, float:1.28355E-40)
            r1 = 4
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ all -> 0x03df }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 0
            r6[r1] = r0     // Catch:{ all -> 0x03df }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 1
            r6[r1] = r0     // Catch:{ all -> 0x03df }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x03df }
            r1 = 2
            r6[r1] = r0     // Catch:{ all -> 0x03df }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x03df }
            r6[r16] = r0     // Catch:{ all -> 0x03df }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x03df }
            r1 = r2
            r2 = r27
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x03df }
            goto L_0x03cf
        L_0x03bc:
            r5 = r25
            com.toutiao.proxyserver.a$5 r14 = new com.toutiao.proxyserver.a$5     // Catch:{ all -> 0x03df }
            r1 = r14
            r2 = r27
            r3 = r12
            r7 = r0
            r8 = r31
            r1.<init>(r3, r5, r7, r8)     // Catch:{ all -> 0x03df }
            com.toutiao.proxyserver.f.c.b((java.lang.Runnable) r14)     // Catch:{ all -> 0x03df }
            goto L_0x03cf
        L_0x03ce:
            r10 = r7
        L_0x03cf:
            r27.d()     // Catch:{ all -> 0x03df }
            r10.a()
            r27.m()
            if (r17 == 0) goto L_0x03de
            r17.get()     // Catch:{ Throwable -> 0x03dd }
        L_0x03dd:
            return
        L_0x03de:
            return
        L_0x03df:
            r0 = move-exception
            goto L_0x03e6
        L_0x03e1:
            r0 = move-exception
            r10 = r7
            goto L_0x03e6
        L_0x03e4:
            r0 = move-exception
            r10 = r5
        L_0x03e6:
            if (r10 == 0) goto L_0x03eb
            r10.a()
        L_0x03eb:
            r27.m()
            if (r17 == 0) goto L_0x03f3
            r17.get()     // Catch:{ Throwable -> 0x03f3 }
        L_0x03f3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.r.a(com.toutiao.proxyserver.b.a, java.io.File, com.toutiao.proxyserver.r$b, java.lang.String):void");
    }

    private void a(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, n, false, 91734, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, n, false, 91734, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        final n nVar = Proxy.g;
        if (nVar != null) {
            final boolean z2 = z;
            final int i5 = i;
            final int i6 = i2;
            final int i7 = i3;
            final int i8 = i4;
            AnonymousClass1 r1 = new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f80226a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f80226a, false, 91741, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f80226a, false, 91741, new Class[0], Void.TYPE);
                        return;
                    }
                    nVar.a(com.toutiao.proxyserver.b.b.a(r.this.g()), r.this.j.f80255d.f80258c, z2, i5, i6, i7, i8, r.this.j.f80255d.g);
                }
            };
            com.toutiao.proxyserver.f.c.b((Runnable) r1);
        }
    }
}
