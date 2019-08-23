package com.xiaomi.push;

import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.XMPushService;
import java.io.IOException;
import java.net.Socket;

public abstract class gx extends gq {

    /* renamed from: a  reason: collision with root package name */
    protected Exception f82132a;

    /* renamed from: a  reason: collision with other field name */
    protected Socket f472a;

    /* renamed from: b  reason: collision with root package name */
    protected XMPushService f82133b;

    /* renamed from: c  reason: collision with root package name */
    private int f82134c;

    /* renamed from: c  reason: collision with other field name */
    String f473c;

    /* renamed from: d  reason: collision with root package name */
    private String f82135d;

    /* renamed from: e  reason: collision with root package name */
    protected volatile long f82136e;

    /* renamed from: f  reason: collision with root package name */
    protected volatile long f82137f;
    protected volatile long g;

    public gx(XMPushService xMPushService, gr grVar) {
        super(xMPushService, grVar);
        this.f82133b = xMPushService;
    }

    private void a(gr grVar) {
        a(grVar.c(), grVar.a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x022e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01bb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01bb A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r19, int r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            r3 = 0
            r1.f82132a = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "get bucket for host : "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.Integer r4 = com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r4)
            int r4 = r4.intValue()
            com.xiaomi.push.dp r12 = r18.a((java.lang.String) r19)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Integer) r4)
            r4 = 1
            if (r12 == 0) goto L_0x0036
            java.util.ArrayList r3 = r12.a((boolean) r4)
        L_0x0036:
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x003f
            r3.add(r0)
        L_0x003f:
            r5 = 0
            r1.g = r5
            com.xiaomi.push.service.XMPushService r0 = r1.f82133b
            java.lang.String r13 = com.xiaomi.push.at.a((android.content.Context) r0)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
            r5 = 0
        L_0x0054:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0223
            java.lang.Object r0 = r3.next()
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            long r15 = java.lang.System.currentTimeMillis()
            int r0 = r1.f453a
            int r0 = r0 + r4
            r1.f453a = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0159, Throwable -> 0x00eb, all -> 0x00e7 }
            r0.<init>()     // Catch:{ Exception -> 0x0159, Throwable -> 0x00eb, all -> 0x00e7 }
            java.lang.String r6 = "begin to connect to "
            r0.append(r6)     // Catch:{ Exception -> 0x0159, Throwable -> 0x00eb, all -> 0x00e7 }
            r0.append(r11)     // Catch:{ Exception -> 0x0159, Throwable -> 0x00eb, all -> 0x00e7 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0159, Throwable -> 0x00eb, all -> 0x00e7 }
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r0)     // Catch:{ Exception -> 0x0159, Throwable -> 0x00eb, all -> 0x00e7 }
            java.net.Socket r0 = r18.a()     // Catch:{ Exception -> 0x0159, Throwable -> 0x00eb, all -> 0x00e7 }
            r1.f472a = r0     // Catch:{ Exception -> 0x0159, Throwable -> 0x00eb, all -> 0x00e7 }
            java.net.InetSocketAddress r0 = com.xiaomi.push.dr.a((java.lang.String) r11, (int) r2)     // Catch:{ Exception -> 0x0159, Throwable -> 0x00eb, all -> 0x00e7 }
            java.net.Socket r6 = r1.f472a     // Catch:{ Exception -> 0x0159, Throwable -> 0x00eb, all -> 0x00e7 }
            r7 = 8000(0x1f40, float:1.121E-41)
            r6.connect(r0, r7)     // Catch:{ Exception -> 0x0159, Throwable -> 0x00eb, all -> 0x00e7 }
            java.lang.String r0 = "tcp connected"
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r0)     // Catch:{ Exception -> 0x0159, Throwable -> 0x00eb, all -> 0x00e7 }
            java.net.Socket r0 = r1.f472a     // Catch:{ Exception -> 0x0159, Throwable -> 0x00eb, all -> 0x00e7 }
            r0.setTcpNoDelay(r4)     // Catch:{ Exception -> 0x0159, Throwable -> 0x00eb, all -> 0x00e7 }
            r1.f82135d = r11     // Catch:{ Exception -> 0x0159, Throwable -> 0x00eb, all -> 0x00e7 }
            r18.a()     // Catch:{ Exception -> 0x0159, Throwable -> 0x00eb, all -> 0x00e7 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00e2, Throwable -> 0x00de, all -> 0x00db }
            r0 = 0
            long r5 = r5 - r15
            r1.f454a = r5     // Catch:{ Exception -> 0x00e2, Throwable -> 0x00de, all -> 0x00db }
            r1.f463b = r13     // Catch:{ Exception -> 0x00e2, Throwable -> 0x00de, all -> 0x00db }
            if (r12 == 0) goto L_0x00b3
            long r7 = r1.f454a     // Catch:{ Exception -> 0x00e2, Throwable -> 0x00de, all -> 0x00db }
            r9 = 0
            r5 = r12
            r6 = r11
            r5.b(r6, r7, r9)     // Catch:{ Exception -> 0x00e2, Throwable -> 0x00de, all -> 0x00db }
        L_0x00b3:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x00e2, Throwable -> 0x00de, all -> 0x00db }
            r1.g = r5     // Catch:{ Exception -> 0x00e2, Throwable -> 0x00de, all -> 0x00db }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e2, Throwable -> 0x00de, all -> 0x00db }
            r0.<init>()     // Catch:{ Exception -> 0x00e2, Throwable -> 0x00de, all -> 0x00db }
            java.lang.String r5 = "connected to "
            r0.append(r5)     // Catch:{ Exception -> 0x00e2, Throwable -> 0x00de, all -> 0x00db }
            r0.append(r11)     // Catch:{ Exception -> 0x00e2, Throwable -> 0x00de, all -> 0x00db }
            java.lang.String r5 = " in "
            r0.append(r5)     // Catch:{ Exception -> 0x00e2, Throwable -> 0x00de, all -> 0x00db }
            long r5 = r1.f454a     // Catch:{ Exception -> 0x00e2, Throwable -> 0x00de, all -> 0x00db }
            r0.append(r5)     // Catch:{ Exception -> 0x00e2, Throwable -> 0x00de, all -> 0x00db }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00e2, Throwable -> 0x00de, all -> 0x00db }
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r0)     // Catch:{ Exception -> 0x00e2, Throwable -> 0x00de, all -> 0x00db }
            r17 = 1
            goto L_0x0225
        L_0x00db:
            r0 = move-exception
            goto L_0x01c2
        L_0x00de:
            r0 = move-exception
            r17 = 1
            goto L_0x00ee
        L_0x00e2:
            r0 = move-exception
            r17 = 1
            goto L_0x015c
        L_0x00e7:
            r0 = move-exception
            r4 = r5
            goto L_0x01c2
        L_0x00eb:
            r0 = move-exception
            r17 = r5
        L_0x00ee:
            java.lang.Exception r5 = new java.lang.Exception     // Catch:{ all -> 0x01bf }
            java.lang.String r6 = "abnormal exception"
            r5.<init>(r6, r0)     // Catch:{ all -> 0x01bf }
            r1.f82132a = r5     // Catch:{ all -> 0x01bf }
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x01bf }
            if (r17 != 0) goto L_0x01bb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "SMACK: Could not connect to:"
            r0.<init>(r5)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r0)
            java.lang.String r0 = "SMACK: Could not connect to "
            r14.append(r0)
            r14.append(r11)
            java.lang.String r0 = " port:"
            r14.append(r0)
            r14.append(r2)
            java.lang.String r0 = " err:"
            r14.append(r0)
            java.lang.Exception r0 = r1.f82132a
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r14.append(r0)
            java.lang.String r0 = "\n"
            r14.append(r0)
            java.lang.Exception r0 = r1.f82132a
            com.xiaomi.push.ie.a((java.lang.String) r11, (java.lang.Exception) r0)
            if (r12 == 0) goto L_0x014b
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r5 - r15
            r9 = 0
            java.lang.Exception r0 = r1.f82132a
            r5 = r12
            r6 = r11
            r11 = r0
            r5.b(r6, r7, r9, r11)
        L_0x014b:
            com.xiaomi.push.service.XMPushService r0 = r1.f82133b
            java.lang.String r0 = com.xiaomi.push.at.a((android.content.Context) r0)
            boolean r0 = android.text.TextUtils.equals(r13, r0)
            if (r0 != 0) goto L_0x01bb
            goto L_0x0225
        L_0x0159:
            r0 = move-exception
            r17 = r5
        L_0x015c:
            r1.f82132a = r0     // Catch:{ all -> 0x01bf }
            if (r17 != 0) goto L_0x01bb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "SMACK: Could not connect to:"
            r0.<init>(r5)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r0)
            java.lang.String r0 = "SMACK: Could not connect to "
            r14.append(r0)
            r14.append(r11)
            java.lang.String r0 = " port:"
            r14.append(r0)
            r14.append(r2)
            java.lang.String r0 = " err:"
            r14.append(r0)
            java.lang.Exception r0 = r1.f82132a
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r14.append(r0)
            java.lang.String r0 = "\n"
            r14.append(r0)
            java.lang.Exception r0 = r1.f82132a
            com.xiaomi.push.ie.a((java.lang.String) r11, (java.lang.Exception) r0)
            if (r12 == 0) goto L_0x01af
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r5 - r15
            r9 = 0
            java.lang.Exception r0 = r1.f82132a
            r5 = r12
            r6 = r11
            r11 = r0
            r5.b(r6, r7, r9, r11)
        L_0x01af:
            com.xiaomi.push.service.XMPushService r0 = r1.f82133b
            java.lang.String r0 = com.xiaomi.push.at.a((android.content.Context) r0)
            boolean r0 = android.text.TextUtils.equals(r13, r0)
            if (r0 == 0) goto L_0x0225
        L_0x01bb:
            r5 = r17
            goto L_0x0054
        L_0x01bf:
            r0 = move-exception
            r4 = r17
        L_0x01c2:
            if (r4 != 0) goto L_0x0222
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "SMACK: Could not connect to:"
            r3.<init>(r5)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r3)
            java.lang.String r3 = "SMACK: Could not connect to "
            r14.append(r3)
            r14.append(r11)
            java.lang.String r3 = " port:"
            r14.append(r3)
            r14.append(r2)
            java.lang.String r2 = " err:"
            r14.append(r2)
            java.lang.Exception r2 = r1.f82132a
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r14.append(r2)
            java.lang.String r2 = "\n"
            r14.append(r2)
            java.lang.Exception r2 = r1.f82132a
            com.xiaomi.push.ie.a((java.lang.String) r11, (java.lang.Exception) r2)
            if (r12 == 0) goto L_0x0213
            long r2 = java.lang.System.currentTimeMillis()
            long r7 = r2 - r15
            r9 = 0
            java.lang.Exception r2 = r1.f82132a
            r5 = r12
            r6 = r11
            r11 = r2
            r5.b(r6, r7, r9, r11)
        L_0x0213:
            com.xiaomi.push.service.XMPushService r2 = r1.f82133b
            java.lang.String r2 = com.xiaomi.push.at.a((android.content.Context) r2)
            boolean r2 = android.text.TextUtils.equals(r13, r2)
            if (r2 != 0) goto L_0x0222
            r17 = r4
            goto L_0x0225
        L_0x0222:
            throw r0
        L_0x0223:
            r17 = r5
        L_0x0225:
            com.xiaomi.push.dt r0 = com.xiaomi.push.dt.a()
            r0.c()
            if (r17 == 0) goto L_0x022f
            return
        L_0x022f:
            com.xiaomi.push.hb r0 = new com.xiaomi.push.hb
            java.lang.String r2 = r14.toString()
            r0.<init>((java.lang.String) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gx.a(java.lang.String, int):void");
    }

    /* access modifiers changed from: package-private */
    public dp a(String str) {
        dp a2 = dt.a().a(str, false);
        if (!a2.b()) {
            ht.a((Runnable) new ha(this, str));
        }
        return a2;
    }

    public String a() {
        return this.f82135d;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Socket m355a() {
        return new Socket();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: collision with other method in class */
    public void m356a() {
        synchronized (this) {
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i, Exception exc) {
        synchronized (this) {
            if (b() != 2) {
                a(2, i, exc);
                this.f458a = "";
                try {
                    this.f472a.close();
                } catch (Throwable unused) {
                }
                this.f82136e = 0;
                this.f82137f = 0;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(Exception exc) {
        String a2;
        if (SystemClock.elapsedRealtime() - this.g < 300000) {
            if (at.b(this.f82133b)) {
                this.f82134c++;
                if (this.f82134c >= 2) {
                    b.a("max short conn time reached, sink down current host:" + a2);
                    a(a2, 0, exc);
                    this.f82134c = 0;
                }
            }
            return;
        }
        this.f82134c = 0;
    }

    /* access modifiers changed from: protected */
    public void a(String str, long j, Exception exc) {
        dp a2 = dt.a().a(gr.a(), false);
        if (a2 != null) {
            a2.b(str, j, 0, exc);
            dt.a().c();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(boolean z);

    public void a(gj[] gjVarArr) {
        throw new hb("Don't support send Blob");
    }

    public void b(int i, Exception exc) {
        a(i, exc);
        if ((exc != null || i == 18) && this.g != 0) {
            a(exc);
        }
    }

    public void b(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        a(z);
        if (!z) {
            this.f82133b.a((XMPushService.i) new gy(this, 13, currentTimeMillis), 10000);
        }
    }

    public String c() {
        return this.f458a;
    }

    public void c(int i, Exception exc) {
        this.f82133b.a((XMPushService.i) new gz(this, 2, i, exc));
    }

    public void e() {
        synchronized (this) {
            try {
                if (!c()) {
                    if (!b()) {
                        a(0, 0, null);
                        a(this.f455a);
                    }
                }
                b.a("WARNING: current xmpp has connected");
            } catch (IOException e2) {
                throw new hb((Throwable) e2);
            }
        }
    }

    public void f() {
        this.f82136e = SystemClock.elapsedRealtime();
    }

    public void g() {
        this.f82137f = SystemClock.elapsedRealtime();
    }
}
