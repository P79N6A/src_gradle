package com.toutiao.proxyserver;

import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.toutiao.proxyserver.b.c;
import java.util.List;

public class i extends a {
    public static ChangeQuickRedirect n;
    final Object o = this;
    public Exception p;
    private int q;
    private final b r;
    private final boolean s;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f80117a;

        /* renamed from: b  reason: collision with root package name */
        String f80118b;

        /* renamed from: c  reason: collision with root package name */
        String f80119c;

        /* renamed from: d  reason: collision with root package name */
        y f80120d;

        /* renamed from: e  reason: collision with root package name */
        c f80121e;

        /* renamed from: f  reason: collision with root package name */
        c f80122f;
        List<com.toutiao.proxyserver.net.c> g;
        int h;
        t i;
        b j;
        boolean k;

        a() {
        }

        /* access modifiers changed from: package-private */
        public final i a() {
            if (PatchProxy.isSupport(new Object[0], this, f80117a, false, 91668, new Class[0], i.class)) {
                return (i) PatchProxy.accessDispatch(new Object[0], this, f80117a, false, 91668, new Class[0], i.class);
            } else if (this.f80121e != null && this.f80122f != null && !TextUtils.isEmpty(this.f80118b) && !TextUtils.isEmpty(this.f80119c) && this.f80120d != null) {
                return new i(this);
            } else {
                throw new IllegalArgumentException();
            }
        }

        /* access modifiers changed from: package-private */
        public final a a(int i2) {
            this.h = i2;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final a a(b bVar) {
            this.j = bVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final a a(List<com.toutiao.proxyserver.net.c> list) {
            this.g = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final a a(boolean z) {
            this.k = true;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final a a(y yVar) {
            if (PatchProxy.isSupport(new Object[]{yVar}, this, f80117a, false, 91665, new Class[]{y.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{yVar}, this, f80117a, false, 91665, new Class[]{y.class}, a.class);
            }
            this.f80120d = yVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final a a(c cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f80117a, false, 91667, new Class[]{c.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{cVar}, this, f80117a, false, 91667, new Class[]{c.class}, a.class);
            } else if (cVar != null) {
                this.f80122f = cVar;
                return this;
            } else {
                throw new IllegalArgumentException("db == null");
            }
        }

        /* access modifiers changed from: package-private */
        public final a b(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f80117a, false, 91664, new Class[]{String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str}, this, f80117a, false, 91664, new Class[]{String.class}, a.class);
            } else if (!TextUtils.isEmpty(str)) {
                this.f80119c = str;
                return this;
            } else {
                throw new IllegalArgumentException("key == null");
            }
        }

        /* access modifiers changed from: package-private */
        public final a a(c cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f80117a, false, 91666, new Class[]{c.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{cVar}, this, f80117a, false, 91666, new Class[]{c.class}, a.class);
            } else if (cVar != null) {
                this.f80121e = cVar;
                return this;
            } else {
                throw new IllegalArgumentException("cache == null");
            }
        }

        /* access modifiers changed from: package-private */
        public final a a(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f80117a, false, 91663, new Class[]{String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str}, this, f80117a, false, 91663, new Class[]{String.class}, a.class);
            } else if (!TextUtils.isEmpty(str)) {
                this.f80118b = str;
                return this;
            } else {
                throw new IllegalArgumentException("rawKey == null");
            }
        }
    }

    public interface b {
        void a(i iVar);
    }

    public void run() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 91659, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 91659, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.f79961b.a(this.i);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                k();
            } catch (e e2) {
                com.toutiao.proxyserver.d.c.c("TAG_PROXY_DownloadTask", com.toutiao.proxyserver.d.c.a(e2), this.h);
            }
            this.f79964e.set(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f79961b.b(this.i);
            if (this.r != null) {
                this.r.a(this);
            }
        } catch (com.toutiao.proxyserver.c.a unused) {
            if (this.r != null) {
                this.r.a(this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        com.toutiao.proxyserver.d.c.d("TAG_PROXY_DownloadTask", "CancelException: " + com.toutiao.proxyserver.d.c.a(r0), r9.h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0097, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0098, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0099, code lost:
        com.toutiao.proxyserver.d.c.d("TAG_PROXY_DownloadTask", "ContentLengthNotMatchException: " + com.toutiao.proxyserver.d.c.a(r1), r9.h);
        r9.p = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b4, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e5, code lost:
        com.toutiao.proxyserver.d.c.d("TAG_PROXY_DownloadTask", "IOException: " + com.toutiao.proxyserver.d.c.a(r2), r9.h);
        r1 = r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d A[ExcHandler: e (r0v1 'e' com.toutiao.proxyserver.e A[CUSTOM_DECLARE]), Splitter:B:8:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0098 A[ExcHandler: f (r1v12 'e' com.toutiao.proxyserver.f A[CUSTOM_DECLARE]), Splitter:B:8:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean k() throws com.toutiao.proxyserver.e {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = n
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 91660(0x1660c, float:1.28443E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = n
            r5 = 0
            r6 = 91660(0x1660c, float:1.28443E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002c:
            r1 = 0
            r2 = r1
        L_0x002e:
            com.toutiao.proxyserver.y r3 = r9.k
            boolean r3 = r3.a()
            r4 = 1
            if (r3 == 0) goto L_0x012b
            r9.f()
            com.toutiao.proxyserver.y r3 = r9.k
            com.toutiao.proxyserver.y$a r3 = r3.b()
            java.lang.String r5 = r3.f80276b     // Catch:{ u -> 0x0107, IOException -> 0x00d6, a -> 0x00b5, f -> 0x0098, e -> 0x007d, Exception -> 0x005d }
            r9.j()     // Catch:{ u -> 0x0059, IOException -> 0x0056, a -> 0x0053, f -> 0x0098, e -> 0x007d, Exception -> 0x0050 }
            java.lang.String r2 = r3.f80276b     // Catch:{ u -> 0x0059, IOException -> 0x0056, a -> 0x0053, f -> 0x0098, e -> 0x007d, Exception -> 0x0050 }
            r9.b(r2)     // Catch:{ u -> 0x0059, IOException -> 0x0056, a -> 0x0053, f -> 0x0098, e -> 0x007d, Exception -> 0x0050 }
            java.lang.String r2 = r3.f80276b     // Catch:{ u -> 0x0059, IOException -> 0x0056, a -> 0x0053, f -> 0x0098, e -> 0x007d, Exception -> 0x0050 }
            com.toutiao.proxyserver.Proxy.a(r0, r2)     // Catch:{ u -> 0x0059, IOException -> 0x0056, a -> 0x0053, f -> 0x0098, e -> 0x007d, Exception -> 0x0050 }
            return r4
        L_0x0050:
            r1 = move-exception
            r2 = r5
            goto L_0x005e
        L_0x0053:
            r1 = move-exception
            r2 = r5
            goto L_0x00b6
        L_0x0056:
            r2 = move-exception
            goto L_0x00d9
        L_0x0059:
            r1 = move-exception
            r2 = r5
            goto L_0x0108
        L_0x005d:
            r1 = move-exception
        L_0x005e:
            java.lang.String r3 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "OtherException: "
            r5.<init>(r6)
            java.lang.String r6 = com.toutiao.proxyserver.d.c.a(r1)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = r9.h
            com.toutiao.proxyserver.d.c.d(r3, r5, r6)
            int r3 = r9.l
            int r3 = r3 + r4
            r9.l = r3
            goto L_0x002e
        L_0x007d:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "CancelException: "
            r1.<init>(r2)
            java.lang.String r2 = com.toutiao.proxyserver.d.c.a(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r9.h
            java.lang.String r3 = "TAG_PROXY_DownloadTask"
            com.toutiao.proxyserver.d.c.d(r3, r1, r2)
            throw r0
        L_0x0098:
            r1 = move-exception
            java.lang.String r2 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ContentLengthNotMatchException: "
            r3.<init>(r4)
            java.lang.String r4 = com.toutiao.proxyserver.d.c.a(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r9.h
            com.toutiao.proxyserver.d.c.d(r2, r3, r4)
            r9.p = r1
            return r0
        L_0x00b5:
            r1 = move-exception
        L_0x00b6:
            java.lang.String r3 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "RandomAccessFileWrapper"
            r5.<init>(r6)
            java.lang.String r6 = com.toutiao.proxyserver.d.c.a(r1)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = r9.h
            com.toutiao.proxyserver.d.c.d(r3, r5, r6)
            int r3 = r9.l
            int r3 = r3 + r4
            r9.l = r3
            goto L_0x002e
        L_0x00d6:
            r3 = move-exception
            r5 = r2
            r2 = r3
        L_0x00d9:
            java.lang.String r3 = "Canceled"
            java.lang.String r6 = r2.getMessage()
            boolean r3 = r3.equalsIgnoreCase(r6)
            if (r3 != 0) goto L_0x00ff
            java.lang.String r1 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "IOException: "
            r3.<init>(r6)
            java.lang.String r6 = com.toutiao.proxyserver.d.c.a(r2)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = r9.h
            com.toutiao.proxyserver.d.c.d(r1, r3, r6)
            r1 = r2
        L_0x00ff:
            int r2 = r9.l
            int r2 = r2 + r4
            r9.l = r2
            r2 = r5
            goto L_0x002e
        L_0x0107:
            r1 = move-exception
        L_0x0108:
            r3.a()
            java.lang.String r3 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "RequestException: "
            r5.<init>(r6)
            java.lang.String r6 = com.toutiao.proxyserver.d.c.a(r1)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = r9.h
            com.toutiao.proxyserver.d.c.d(r3, r5, r6)
            int r3 = r9.l
            int r3 = r3 + r4
            r9.l = r3
            goto L_0x002e
        L_0x012b:
            r9.p = r1
            com.toutiao.proxyserver.Proxy.a(r4, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.i.k():boolean");
    }

    i(a aVar) {
        super(aVar.f80121e, aVar.f80122f);
        this.q = aVar.h;
        this.r = aVar.j;
        this.h = aVar.f80118b;
        this.i = aVar.f80119c;
        this.f79965f = aVar.g;
        this.k = aVar.f80120d;
        this.j = aVar.i;
        this.s = aVar.k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03dc, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03dd, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0413, code lost:
        r15.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0418, code lost:
        a();
        com.toutiao.proxyserver.d.c.c("TAG_PROXY_DownloadTask", "cancel call, rawKey: " + r8.h + ", key: " + r8.i, r8.h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0440, code lost:
        r1 = "preloader";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0443, code lost:
        r1 = "proxy";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        r16.get();
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03c3 A[SYNTHETIC, Splitter:B:115:0x03c3] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03c7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03dc A[ExcHandler: all (th java.lang.Throwable), Splitter:B:36:0x0171] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03f4 A[Catch:{ all -> 0x03fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0452 A[SYNTHETIC, Splitter:B:157:0x0452] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x017a A[SYNTHETIC, Splitter:B:39:0x017a] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0216 A[Catch:{ IOException -> 0x03e3, all -> 0x03dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0218 A[Catch:{ IOException -> 0x03e3, all -> 0x03dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0261 A[Catch:{ IOException -> 0x03d2, all -> 0x03d0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.lang.String r21) throws java.io.IOException, com.toutiao.proxyserver.s.a, com.toutiao.proxyserver.e, com.toutiao.proxyserver.f {
        /*
            r20 = this;
            r8 = r20
            r0 = r21
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r10 = 0
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = n
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 91661(0x1660d, float:1.28444E-40)
            r2 = r20
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0038
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = n
            r4 = 0
            r5 = 91661(0x1660d, float:1.28444E-40)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0038:
            java.lang.String r1 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "process() called with: url = ["
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = "]， rawKey："
            r2.append(r3)
            java.lang.String r3 = r8.h
            r2.append(r3)
            java.lang.String r3 = "， key："
            r2.append(r3)
            java.lang.String r3 = r8.i
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r8.h
            com.toutiao.proxyserver.d.c.a(r1, r2, r3)
            com.toutiao.proxyserver.c r1 = r8.f79961b
            java.lang.String r2 = r8.i
            java.io.File r1 = r1.d(r2)
            long r2 = r1.length()
            int r4 = r8.q
            if (r4 <= 0) goto L_0x00ac
            int r4 = r8.q
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x00ac
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "no necessary to download for "
            r1.<init>(r4)
            java.lang.String r4 = r8.i
            r1.append(r4)
            java.lang.String r4 = ", rawKey: "
            r1.append(r4)
            java.lang.String r4 = r8.h
            r1.append(r4)
            java.lang.String r4 = ", cache file size: "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r2 = ", max: "
            r1.append(r2)
            int r2 = r8.q
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r8.h
            com.toutiao.proxyserver.d.c.b(r0, r1, r2)
            return
        L_0x00ac:
            int r4 = r20.g()
            com.toutiao.proxyserver.b.c r5 = r8.f79962c
            java.lang.String r6 = r8.i
            com.toutiao.proxyserver.b.a r11 = r5.a(r6, r4)
            if (r11 == 0) goto L_0x00e3
            int r5 = r11.f80012d
            long r5 = (long) r5
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x00e3
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "file download complete, key: "
            r1.<init>(r2)
            java.lang.String r2 = r8.i
            r1.append(r2)
            java.lang.String r2 = ", rawKey: "
            r1.append(r2)
            java.lang.String r2 = r8.h
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r8.h
            com.toutiao.proxyserver.d.c.b(r0, r1, r2)
            return
        L_0x00e3:
            boolean r5 = com.toutiao.proxyserver.Proxy.p
            if (r5 == 0) goto L_0x00f3
            if (r11 == 0) goto L_0x00f3
            int r5 = r8.q
            int r6 = r11.f80012d
            if (r5 <= r6) goto L_0x00f3
            int r5 = r11.f80012d
            r8.q = r5
        L_0x00f3:
            java.lang.String r5 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "process() before request, max:"
            r6.<init>(r7)
            int r7 = r8.q
            r6.append(r7)
            java.lang.String r7 = ", contentLength:"
            r6.append(r7)
            if (r11 == 0) goto L_0x010f
            int r7 = r11.f80012d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0111
        L_0x010f:
            java.lang.String r7 = "null"
        L_0x0111:
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.toutiao.proxyserver.d.c.a(r5, r6)
            r20.f()
            r20.i()
            int r5 = (int) r2
            int r6 = r8.q
            java.lang.String r7 = "GET"
            com.toutiao.proxyserver.net.e r12 = r8.a((java.lang.String) r0, (int) r5, (int) r6, (java.lang.String) r7)
            java.lang.String r5 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "process() after request statuscode:"
            r6.<init>(r7)
            int r7 = r12.f80159c
            r6.append(r7)
            java.lang.String r7 = ", contentlength:"
            r6.append(r7)
            int r7 = com.toutiao.proxyserver.f.c.a((com.toutiao.proxyserver.net.e) r12)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.toutiao.proxyserver.d.c.a(r5, r6)
            r20.h()
            com.toutiao.proxyserver.e.d r7 = new com.toutiao.proxyserver.e.d
            r7.<init>(r2)
            com.toutiao.proxyserver.e.c r5 = com.toutiao.proxyserver.e.c.a()
            r5.f80054b = r7
            com.toutiao.proxyserver.e.c r5 = com.toutiao.proxyserver.e.c.a()     // Catch:{ IOException -> 0x03e3, all -> 0x03dc }
            r5.b()     // Catch:{ IOException -> 0x03e3, all -> 0x03dc }
            r20.f()     // Catch:{ IOException -> 0x03e3, all -> 0x03dc }
            com.toutiao.proxyserver.t r5 = r8.j     // Catch:{ IOException -> 0x03e3, all -> 0x03dc }
            if (r5 != 0) goto L_0x0170
            boolean r5 = com.toutiao.proxyserver.Proxy.l     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            if (r5 == 0) goto L_0x0170
            r5 = 1
            goto L_0x0171
        L_0x016d:
            r0 = move-exception
            goto L_0x03e5
        L_0x0170:
            r5 = 0
        L_0x0171:
            com.toutiao.proxyserver.f.c.a((com.toutiao.proxyserver.net.e) r12, (boolean) r5, (boolean) r9)     // Catch:{ IOException -> 0x03e3, all -> 0x03dc }
            int r14 = com.toutiao.proxyserver.f.c.a((com.toutiao.proxyserver.net.e) r12)     // Catch:{ IOException -> 0x03e3, all -> 0x03dc }
            if (r11 == 0) goto L_0x0205
            int r5 = r11.f80012d     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            if (r5 == r14) goto L_0x0205
            com.toutiao.proxyserver.n r1 = com.toutiao.proxyserver.Proxy.g     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            if (r1 == 0) goto L_0x0198
            int r1 = r20.g()     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            boolean r2 = com.toutiao.proxyserver.b.b.a((int) r1)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            java.lang.String r3 = r8.h     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            int r4 = r11.f80012d     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            java.lang.String r7 = r11.f80014f     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            r1 = r20
            r5 = r14
            r6 = r21
            r1.a(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
        L_0x0198:
            java.lang.String r1 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            java.lang.String r3 = "Content-Length not match, old: "
            r2.<init>(r3)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            int r3 = r11.f80012d     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            r2.append(r3)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            java.lang.String r3 = ", "
            r2.append(r3)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            r2.append(r14)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            java.lang.String r3 = ", key: "
            r2.append(r3)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            java.lang.String r3 = r8.i     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            r2.append(r3)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            java.lang.String r3 = ", rawKey: "
            r2.append(r3)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            java.lang.String r3 = r8.h     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            r2.append(r3)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            java.lang.String r3 = r8.h     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            com.toutiao.proxyserver.d.c.d(r1, r2, r3)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            com.toutiao.proxyserver.f r1 = new com.toutiao.proxyserver.f     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            java.lang.String r3 = "Content-Length not match, old length: "
            r2.<init>(r3)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            int r3 = r11.f80012d     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            r2.append(r3)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            java.lang.String r3 = ", new length: "
            r2.append(r3)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            r2.append(r14)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            java.lang.String r3 = ", rawKey: "
            r2.append(r3)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            java.lang.String r3 = r8.h     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            r2.append(r3)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            java.lang.String r3 = ", currentUrl: "
            r2.append(r3)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            r2.append(r0)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            java.lang.String r0 = ", previousInfo: "
            r2.append(r0)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            java.lang.String r0 = r11.f80014f     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            r2.append(r0)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            r1.<init>(r0)     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
            throw r1     // Catch:{ IOException -> 0x016d, all -> 0x03dc }
        L_0x0205:
            com.toutiao.proxyserver.b.c r5 = r8.f79962c     // Catch:{ IOException -> 0x03e3, all -> 0x03dc }
            java.lang.String r6 = r8.i     // Catch:{ IOException -> 0x03e3, all -> 0x03dc }
            com.toutiao.proxyserver.f.c.a(r12, r5, r6, r4)     // Catch:{ IOException -> 0x03e3, all -> 0x03dc }
            com.toutiao.proxyserver.b.c r5 = r8.f79962c     // Catch:{ IOException -> 0x03e3, all -> 0x03dc }
            java.lang.String r6 = r8.i     // Catch:{ IOException -> 0x03e3, all -> 0x03dc }
            com.toutiao.proxyserver.b.a r4 = r5.a(r6, r4)     // Catch:{ IOException -> 0x03e3, all -> 0x03dc }
            if (r4 != 0) goto L_0x0218
            r11 = 0
            goto L_0x021b
        L_0x0218:
            int r4 = r4.f80012d     // Catch:{ IOException -> 0x03e3, all -> 0x03dc }
            r11 = r4
        L_0x021b:
            java.io.InputStream r14 = r12.d()     // Catch:{ IOException -> 0x03e3, all -> 0x03dc }
            com.toutiao.proxyserver.s r4 = new com.toutiao.proxyserver.s     // Catch:{ IOException -> 0x03e3, all -> 0x03dc }
            java.lang.String r5 = "rwd"
            r4.<init>(r1, r5)     // Catch:{ IOException -> 0x03e3, all -> 0x03dc }
            r4.a((long) r2)     // Catch:{ IOException -> 0x03e3, all -> 0x03dc }
            com.toutiao.proxyserver.d r15 = new com.toutiao.proxyserver.d     // Catch:{ IOException -> 0x03e3, all -> 0x03dc }
            r15.<init>(r4)     // Catch:{ IOException -> 0x03e3, all -> 0x03dc }
            java.util.concurrent.Future r16 = r15.b()     // Catch:{ IOException -> 0x03d8, all -> 0x03d6 }
            java.lang.String r1 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            java.lang.String r5 = "preload start from: "
            r4.<init>(r5)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            r4.append(r2)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            java.lang.String r2 = ", rawKey: "
            r4.append(r2)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            java.lang.String r2 = r8.h     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            r4.append(r2)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            java.lang.String r2 = ", key: "
            r4.append(r2)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            java.lang.String r2 = r8.i     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            r4.append(r2)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            java.lang.String r2 = r4.toString()     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            java.lang.String r3 = r8.h     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            com.toutiao.proxyserver.d.c.b(r1, r2, r3)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            int r1 = com.toutiao.proxyserver.Proxy.m     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            byte[] r5 = new byte[r1]     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
        L_0x025f:
            if (r14 == 0) goto L_0x0358
            r20.f()     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            r20.i()     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            int r6 = r14.read(r5)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            boolean r3 = r8.s     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            if (r3 != 0) goto L_0x028e
            com.toutiao.proxyserver.n r3 = com.toutiao.proxyserver.Proxy.g     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            if (r3 == 0) goto L_0x028e
            java.lang.String r3 = r8.h     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            r4 = 0
            long r17 = r17 - r1
            r1 = r20
            r2 = r3
            r3 = r21
            r4 = r6
            r9 = r5
            r13 = r6
            r5 = r17
            r1.a((java.lang.String) r2, (java.lang.String) r3, (int) r4, (long) r5)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            goto L_0x0290
        L_0x028e:
            r9 = r5
            r13 = r6
        L_0x0290:
            r20.h()     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            if (r13 < 0) goto L_0x0358
            if (r13 <= 0) goto L_0x02bc
            r15.a(r9, r10, r13)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            long r1 = (long) r13     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            r7.a(r1)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            com.toutiao.proxyserver.t r1 = r8.j     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            if (r1 == 0) goto L_0x02af
            java.lang.Object r1 = r8.o     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            java.lang.Object r2 = r8.o     // Catch:{ all -> 0x02ac }
            r2.notifyAll()     // Catch:{ all -> 0x02ac }
            monitor-exit(r1)     // Catch:{ all -> 0x02ac }
            goto L_0x02af
        L_0x02ac:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02ac }
            throw r0     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
        L_0x02af:
            java.util.concurrent.atomic.AtomicInteger r1 = r8.f79963d     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            r1.addAndGet(r13)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            long r1 = r7.a()     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            int r1 = (int) r1     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            r8.a(r11, r1)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
        L_0x02bc:
            int r1 = r8.q     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            if (r1 <= 0) goto L_0x0351
            long r1 = r7.a()     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            int r3 = r8.q     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            long r3 = (long) r3     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0351
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            java.lang.String r2 = "download, more data received, currentCacheFileSize: "
            r1.<init>(r2)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            r1.append(r7)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            java.lang.String r2 = ", max: "
            r1.append(r2)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            int r2 = r8.q     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            r1.append(r2)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            java.lang.String r2 = ", rawKey: "
            r1.append(r2)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            java.lang.String r2 = r8.h     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            r1.append(r2)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            java.lang.String r2 = ", key: "
            r1.append(r2)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            java.lang.String r2 = r8.i     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            r1.append(r2)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            java.lang.String r2 = r8.h     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            com.toutiao.proxyserver.d.c.c(r0, r1, r2)     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            com.toutiao.proxyserver.e.c r0 = com.toutiao.proxyserver.e.c.a()
            r0.c()
            com.toutiao.proxyserver.e.c r0 = com.toutiao.proxyserver.e.c.a()
            r0.e()
            com.toutiao.proxyserver.f.c.a((java.io.Closeable) r12)
            r15.a()
            r20.a()
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "cancel call, rawKey: "
            r1.<init>(r2)
            java.lang.String r2 = r8.h
            r1.append(r2)
            java.lang.String r2 = ", key: "
            r1.append(r2)
            java.lang.String r2 = r8.i
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r8.h
            com.toutiao.proxyserver.d.c.c(r0, r1, r2)
            boolean r0 = r8.s
            if (r0 == 0) goto L_0x033d
            java.lang.String r0 = "preloader"
            goto L_0x033f
        L_0x033d:
            java.lang.String r0 = "proxy"
        L_0x033f:
            r8.a(r0)
            java.lang.String r0 = "finally"
            int r1 = r8.l
            r2 = 0
            r8.a(r2, r0, r1)
            if (r16 == 0) goto L_0x0350
            r16.get()     // Catch:{ InterruptedException -> 0x034f, ExecutionException -> 0x0350 }
        L_0x034f:
            return
        L_0x0350:
            return
        L_0x0351:
            r20.f()     // Catch:{ IOException -> 0x03d2, all -> 0x03d0 }
            r5 = r9
            r9 = 1
            goto L_0x025f
        L_0x0358:
            java.lang.String r0 = "complete"
            int r1 = r8.l     // Catch:{ IOException -> 0x03cc, all -> 0x03c8 }
            r2 = 0
            r8.a(r2, r0, r1)     // Catch:{ IOException -> 0x03cc, all -> 0x03c8 }
            r20.d()     // Catch:{ IOException -> 0x03cc, all -> 0x03c8 }
            com.toutiao.proxyserver.n r0 = com.toutiao.proxyserver.Proxy.g     // Catch:{ IOException -> 0x03cc, all -> 0x03c8 }
            if (r0 == 0) goto L_0x0378
            long r0 = r7.a()     // Catch:{ IOException -> 0x03cc, all -> 0x03c8 }
            long r2 = (long) r11     // Catch:{ IOException -> 0x03cc, all -> 0x03c8 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0378
            com.toutiao.proxyserver.i$1 r0 = new com.toutiao.proxyserver.i$1     // Catch:{ IOException -> 0x03cc, all -> 0x03c8 }
            r0.<init>()     // Catch:{ IOException -> 0x03cc, all -> 0x03c8 }
            com.toutiao.proxyserver.f.c.b((java.lang.Runnable) r0)     // Catch:{ IOException -> 0x03cc, all -> 0x03c8 }
        L_0x0378:
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03cc, all -> 0x03c8 }
            java.lang.String r2 = "download succeed, no need to cancel call, rawKey: "
            r1.<init>(r2)     // Catch:{ IOException -> 0x03cc, all -> 0x03c8 }
            java.lang.String r2 = r8.h     // Catch:{ IOException -> 0x03cc, all -> 0x03c8 }
            r1.append(r2)     // Catch:{ IOException -> 0x03cc, all -> 0x03c8 }
            java.lang.String r2 = ", key: "
            r1.append(r2)     // Catch:{ IOException -> 0x03cc, all -> 0x03c8 }
            java.lang.String r2 = r8.i     // Catch:{ IOException -> 0x03cc, all -> 0x03c8 }
            r1.append(r2)     // Catch:{ IOException -> 0x03cc, all -> 0x03c8 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x03cc, all -> 0x03c8 }
            java.lang.String r2 = r8.h     // Catch:{ IOException -> 0x03cc, all -> 0x03c8 }
            com.toutiao.proxyserver.d.c.b(r0, r1, r2)     // Catch:{ IOException -> 0x03cc, all -> 0x03c8 }
            com.toutiao.proxyserver.e.c r0 = com.toutiao.proxyserver.e.c.a()
            r0.c()
            com.toutiao.proxyserver.e.c r0 = com.toutiao.proxyserver.e.c.a()
            r0.e()
            com.toutiao.proxyserver.f.c.a((java.io.Closeable) r12)
            r15.a()
            boolean r0 = r8.s
            if (r0 == 0) goto L_0x03b4
            java.lang.String r0 = "preloader"
            goto L_0x03b6
        L_0x03b4:
            java.lang.String r0 = "proxy"
        L_0x03b6:
            r8.a(r0)
            java.lang.String r0 = "finally"
            int r1 = r8.l
            r2 = 0
            r8.a(r2, r0, r1)
            if (r16 == 0) goto L_0x03c7
            r16.get()     // Catch:{ InterruptedException | ExecutionException -> 0x03c6 }
        L_0x03c6:
            return
        L_0x03c7:
            return
        L_0x03c8:
            r0 = move-exception
            r19 = 0
            goto L_0x0400
        L_0x03cc:
            r0 = move-exception
            r13 = r15
            r9 = 0
            goto L_0x03e8
        L_0x03d0:
            r0 = move-exception
            goto L_0x03e0
        L_0x03d2:
            r0 = move-exception
            r13 = r15
            r9 = 1
            goto L_0x03e8
        L_0x03d6:
            r0 = move-exception
            goto L_0x03de
        L_0x03d8:
            r0 = move-exception
            r13 = r15
            r9 = 1
            goto L_0x03e6
        L_0x03dc:
            r0 = move-exception
            r15 = 0
        L_0x03de:
            r16 = 0
        L_0x03e0:
            r19 = 1
            goto L_0x0400
        L_0x03e3:
            r0 = move-exception
            r9 = 1
        L_0x03e5:
            r13 = 0
        L_0x03e6:
            r16 = 0
        L_0x03e8:
            java.lang.String r1 = "Canceled"
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x03fc }
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch:{ all -> 0x03fc }
            if (r1 != 0) goto L_0x03fb
            java.lang.String r1 = "exception"
            int r2 = r8.l     // Catch:{ all -> 0x03fc }
            r8.a(r0, r1, r2)     // Catch:{ all -> 0x03fc }
        L_0x03fb:
            throw r0     // Catch:{ all -> 0x03fc }
        L_0x03fc:
            r0 = move-exception
            r19 = r9
            r15 = r13
        L_0x0400:
            com.toutiao.proxyserver.e.c r1 = com.toutiao.proxyserver.e.c.a()
            r1.c()
            com.toutiao.proxyserver.e.c r1 = com.toutiao.proxyserver.e.c.a()
            r1.e()
            com.toutiao.proxyserver.f.c.a((java.io.Closeable) r12)
            if (r15 == 0) goto L_0x0416
            r15.a()
        L_0x0416:
            if (r19 == 0) goto L_0x043c
            r20.a()
            java.lang.String r1 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "cancel call, rawKey: "
            r2.<init>(r3)
            java.lang.String r3 = r8.h
            r2.append(r3)
            java.lang.String r3 = ", key: "
            r2.append(r3)
            java.lang.String r3 = r8.i
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r8.h
            com.toutiao.proxyserver.d.c.c(r1, r2, r3)
        L_0x043c:
            boolean r1 = r8.s
            if (r1 == 0) goto L_0x0443
            java.lang.String r1 = "preloader"
            goto L_0x0445
        L_0x0443:
            java.lang.String r1 = "proxy"
        L_0x0445:
            r8.a(r1)
            java.lang.String r1 = "finally"
            int r2 = r8.l
            r3 = 0
            r8.a(r3, r1, r2)
            if (r16 == 0) goto L_0x0455
            r16.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0455 }
        L_0x0455:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.i.b(java.lang.String):void");
    }
}
