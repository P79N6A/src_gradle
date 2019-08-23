package com.ss.android.socialbase.downloader.d;

import android.annotation.SuppressLint;
import android.os.Process;
import com.ss.android.socialbase.downloader.downloader.d;
import com.ss.android.socialbase.downloader.downloader.i;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;

public class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private static final String f30858b = "b";

    /* renamed from: a  reason: collision with root package name */
    public d f30859a;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.model.b f30860c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.model.b f30861d;

    /* renamed from: e  reason: collision with root package name */
    private final DownloadTask f30862e;

    /* renamed from: f  reason: collision with root package name */
    private DownloadInfo f30863f;
    private final e g;
    private IDownloadHttpConnection h;
    private i i;
    private volatile boolean j;
    private volatile boolean k;
    private boolean l;

    private void c() {
        if (this.h != null) {
            this.h.end();
            this.h = null;
        }
    }

    private boolean d() {
        if (this.j || this.k) {
            return true;
        }
        return false;
    }

    public final void a() {
        this.j = true;
        if (this.f30859a != null) {
            this.f30859a.a();
        }
    }

    public final void b() {
        this.k = true;
        if (this.f30859a != null) {
            this.f30859a.b();
        }
    }

    /* JADX INFO: finally extract failed */
    @SuppressLint({"DefaultLocale"})
    public void run() {
        Process.setThreadPriority(10);
        this.f30860c = this.f30861d;
        while (true) {
            try {
                this.f30860c.a(this);
                if (a(this.f30860c)) {
                    this.f30860c.a(false);
                    if (d()) {
                        break;
                    }
                    this.f30860c = this.g.a(this.f30860c.f31057e);
                    if (d() || this.f30860c == null) {
                        break;
                    }
                    try {
                        Thread.sleep(50);
                    } catch (Throwable unused) {
                    }
                } else {
                    this.f30860c.a(false);
                    break;
                }
            } catch (Throwable th) {
                if (this.f30860c != null) {
                    this.f30860c.a(false);
                }
                c();
                this.g.a(this);
                throw th;
            }
        }
        if (this.f30860c != null) {
            this.f30860c.a(false);
        }
        c();
        this.g.a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01a4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x01a9, code lost:
        if (d() == false) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x01ab, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x01af, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        com.ss.android.socialbase.downloader.e.d.a(r0, "downloadChunkInner");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x01c0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x01c1, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x01c9, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x01cd, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x01d2, code lost:
        if (com.ss.android.socialbase.downloader.e.d.b(r0) != false) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x01d4, code lost:
        r1.g.a(r0, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x01d9, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x01dc, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x01e3, code lost:
        if (r1.g.a(r0) != false) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x01e9, code lost:
        if (com.ss.android.socialbase.downloader.e.d.a(r0) != false) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x01eb, code lost:
        r1.g.a(r0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x01f1, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x01f4, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x01f5, code lost:
        if (r19 != false) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x01f9, code lost:
        if (r1.f30859a != null) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x01fb, code lost:
        r17 = r1.f30859a.f30916b - r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0206, code lost:
        if (r21.b() != false) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0208, code lost:
        r3 = r21.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x020d, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x020e, code lost:
        if (r3 != null) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0214, code lost:
        if (r3.e() != false) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0216, code lost:
        r1.i.a(r3.f31053a, r3.a(), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0221, code lost:
        r3.a(r9);
        r1.i.a(r3.f31053a, r3.f31057e, r3.a(), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0236, code lost:
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x023b, code lost:
        if (r21.b() != false) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x023d, code lost:
        r1.i.a(r2.f31053a, r2.f31057e, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0247, code lost:
        r1.g.b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x024c, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x024f, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x025a, code lost:
        if (r1.g.a(r0, r17) == com.ss.android.socialbase.downloader.exception.g.RETURN) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x025c, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x025f, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
        r2.j = r15;
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:?, code lost:
        r1.g.b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x026f, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0272, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ba, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00bd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00be, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r3.f31057e == r2.f31057e) goto L_0x001f;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:139:0x01a0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x00e9 */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01a4 A[ExcHandler: Throwable (th java.lang.Throwable), PHI: r15 
      PHI: (r15v5 boolean) = (r15v0 boolean), (r15v0 boolean), (r15v6 boolean), (r15v6 boolean), (r15v6 boolean), (r15v10 boolean), (r15v10 boolean), (r15v10 boolean), (r15v10 boolean), (r15v10 boolean), (r15v10 boolean) binds: [B:19:0x0042, B:24:0x004c, B:129:0x0187, B:139:0x01a0, B:140:?, B:83:0x00f5, B:119:0x016e, B:113:0x0160, B:114:?, B:88:0x00fd, B:101:0x012a] A[DONT_GENERATE, DONT_INLINE], Splitter:B:113:0x0160] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01c0 A[ExcHandler: BaseException (e com.ss.android.socialbase.downloader.exception.BaseException), PHI: r15 
      PHI: (r15v3 boolean) = (r15v0 boolean), (r15v0 boolean), (r15v6 boolean), (r15v6 boolean), (r15v6 boolean), (r15v6 boolean), (r15v10 boolean), (r15v10 boolean), (r15v10 boolean), (r15v10 boolean) binds: [B:19:0x0042, B:24:0x004c, B:129:0x0187, B:139:0x01a0, B:140:?, B:134:0x018f, B:83:0x00f5, B:119:0x016e, B:88:0x00fd, B:101:0x012a] A[DONT_GENERATE, DONT_INLINE], Splitter:B:19:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x01ce A[SYNTHETIC, Splitter:B:163:0x01ce] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0110 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x01c9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x00ef A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00bd A[ExcHandler: BaseException (e com.ss.android.socialbase.downloader.exception.BaseException), Splitter:B:44:0x009d] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x010f A[Catch:{ BaseException -> 0x012e, Throwable -> 0x0127, BaseException -> 0x01c0, Throwable -> 0x01a4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(com.ss.android.socialbase.downloader.model.b r21) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
        L_0x0004:
            r0 = 0
            boolean r3 = r21.b()
            if (r3 == 0) goto L_0x001e
            boolean r3 = r21.d()
            if (r3 == 0) goto L_0x001e
            com.ss.android.socialbase.downloader.model.b r3 = r21.c()
            if (r3 == 0) goto L_0x001e
            int r4 = r3.f31057e
            int r5 = r2.f31057e
            if (r4 != r5) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r3 = r0
        L_0x001f:
            r4 = 1
            if (r3 == 0) goto L_0x0029
            boolean r0 = r3.f()
            if (r0 == 0) goto L_0x0029
            return r4
        L_0x0029:
            long r5 = r21.i()
            long r7 = r2.f31055c
            long r9 = r21.i()
            if (r3 == 0) goto L_0x003f
            long r9 = r3.i()
            long r5 = r3.i()
            long r7 = r3.f31055c
        L_0x003f:
            r17 = 0
            r15 = 0
            boolean r0 = r20.d()     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            if (r0 == 0) goto L_0x004c
            r20.c()
            return r15
        L_0x004c:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f30863f     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            java.lang.String r0 = r0.getConnectionUrl()     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r11 = r1.h     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            if (r11 == 0) goto L_0x0058
            r11 = 1
            goto L_0x0059
        L_0x0058:
            r11 = 0
        L_0x0059:
            r1.l = r11     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            boolean r11 = r1.l     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            r2.j = r11     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            r13 = 300(0x12c, float:4.2E-43)
            r14 = 200(0xc8, float:2.8E-43)
            boolean r11 = r1.l     // Catch:{ BaseException -> 0x0180, Throwable -> 0x00c8, all -> 0x00c1 }
            if (r11 != 0) goto L_0x009b
            com.ss.android.socialbase.downloader.model.DownloadInfo r11 = r1.f30863f     // Catch:{ BaseException -> 0x0180, Throwable -> 0x00c8, all -> 0x00c1 }
            java.util.List r11 = r11.getExtraHeaders()     // Catch:{ BaseException -> 0x0180, Throwable -> 0x00c8, all -> 0x00c1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r12 = r1.f30863f     // Catch:{ BaseException -> 0x0180, Throwable -> 0x00c8, all -> 0x00c1 }
            java.lang.String r12 = r12.geteTag()     // Catch:{ BaseException -> 0x0180, Throwable -> 0x00c8, all -> 0x00c1 }
            r4 = 200(0xc8, float:2.8E-43)
            r13 = r5
            r15 = r7
            java.util.List r11 = com.ss.android.socialbase.downloader.e.d.a(r11, r12, r13, r15)     // Catch:{ BaseException -> 0x0095, Throwable -> 0x0093, all -> 0x008e }
            com.ss.android.socialbase.downloader.model.DownloadInfo r12 = r1.f30863f     // Catch:{ BaseException -> 0x0095, Throwable -> 0x0093, all -> 0x008e }
            boolean r12 = r12.isNeedDefaultHttpServiceBackUp()     // Catch:{ BaseException -> 0x0095, Throwable -> 0x0093, all -> 0x008e }
            com.ss.android.socialbase.downloader.model.DownloadInfo r13 = r1.f30863f     // Catch:{ BaseException -> 0x0095, Throwable -> 0x0093, all -> 0x008e }
            int r13 = r13.getMaxBytes()     // Catch:{ BaseException -> 0x0095, Throwable -> 0x0093, all -> 0x008e }
            com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r0 = com.ss.android.socialbase.downloader.downloader.b.a(r12, r13, r0, r11)     // Catch:{ BaseException -> 0x0095, Throwable -> 0x0093, all -> 0x008e }
            r1.h = r0     // Catch:{ BaseException -> 0x0095, Throwable -> 0x0093, all -> 0x008e }
            goto L_0x009d
        L_0x008e:
            r0 = move-exception
            r11 = 300(0x12c, float:4.2E-43)
            goto L_0x017e
        L_0x0093:
            r0 = move-exception
            goto L_0x00cb
        L_0x0095:
            r0 = move-exception
            r11 = 300(0x12c, float:4.2E-43)
            r15 = 0
            goto L_0x0185
        L_0x009b:
            r4 = 200(0xc8, float:2.8E-43)
        L_0x009d:
            com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r0 = r1.h     // Catch:{ BaseException -> 0x00bd, Throwable -> 0x00b9 }
            if (r0 == 0) goto L_0x00e9
            com.ss.android.socialbase.downloader.d.e r0 = r1.g     // Catch:{ BaseException -> 0x00bd, Throwable -> 0x00b9 }
            if (r0 == 0) goto L_0x00e9
            com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r0 = r1.h     // Catch:{ Throwable -> 0x00e9, BaseException -> 0x00bd }
            int r0 = r0.a()     // Catch:{ Throwable -> 0x00e9, BaseException -> 0x00bd }
            if (r0 < r4) goto L_0x00b1
            r11 = 300(0x12c, float:4.2E-43)
            if (r0 < r11) goto L_0x00e9
        L_0x00b1:
            com.ss.android.socialbase.downloader.d.e r0 = r1.g     // Catch:{ Throwable -> 0x00e9, BaseException -> 0x00bd }
            com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r11 = r1.h     // Catch:{ Throwable -> 0x00e9, BaseException -> 0x00bd }
        L_0x00b5:
            r0.a((com.ss.android.socialbase.downloader.network.c) r11)     // Catch:{ Throwable -> 0x00e9, BaseException -> 0x00bd }
            goto L_0x00e9
        L_0x00b9:
            r0 = move-exception
            r15 = 0
            goto L_0x01a5
        L_0x00bd:
            r0 = move-exception
            r15 = 0
            goto L_0x01c1
        L_0x00c1:
            r0 = move-exception
            r4 = 200(0xc8, float:2.8E-43)
            r11 = 300(0x12c, float:4.2E-43)
            goto L_0x0187
        L_0x00c8:
            r0 = move-exception
            r4 = 200(0xc8, float:2.8E-43)
        L_0x00cb:
            r11 = 300(0x12c, float:4.2E-43)
            java.lang.String r12 = "ChunkRunnableConnection"
            com.ss.android.socialbase.downloader.e.d.a((java.lang.Throwable) r0, (java.lang.String) r12)     // Catch:{ all -> 0x017d }
            com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r0 = r1.h     // Catch:{ BaseException -> 0x00bd, Throwable -> 0x00b9 }
            if (r0 == 0) goto L_0x00e9
            com.ss.android.socialbase.downloader.d.e r0 = r1.g     // Catch:{ BaseException -> 0x00bd, Throwable -> 0x00b9 }
            if (r0 == 0) goto L_0x00e9
            com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r0 = r1.h     // Catch:{ Throwable -> 0x00e9, BaseException -> 0x00bd }
            int r0 = r0.a()     // Catch:{ Throwable -> 0x00e9, BaseException -> 0x00bd }
            if (r0 < r4) goto L_0x00e4
            if (r0 < r11) goto L_0x00e9
        L_0x00e4:
            com.ss.android.socialbase.downloader.d.e r0 = r1.g     // Catch:{ Throwable -> 0x00e9, BaseException -> 0x00bd }
            com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r11 = r1.h     // Catch:{ Throwable -> 0x00e9, BaseException -> 0x00bd }
            goto L_0x00b5
        L_0x00e9:
            boolean r0 = r20.d()     // Catch:{ BaseException -> 0x00bd, Throwable -> 0x00b9 }
            if (r0 == 0) goto L_0x00f4
            r20.c()
            r15 = 0
            return r15
        L_0x00f4:
            r15 = 0
            com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r0 = r1.h     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            if (r0 == 0) goto L_0x016e
            boolean r0 = r1.l     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            if (r0 != 0) goto L_0x0130
            com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r0 = r1.h     // Catch:{ BaseException -> 0x012e, Throwable -> 0x0127 }
            int r0 = r0.a()     // Catch:{ BaseException -> 0x012e, Throwable -> 0x0127 }
            r11 = 206(0xce, float:2.89E-43)
            if (r0 == r11) goto L_0x010c
            if (r0 != r4) goto L_0x010a
            goto L_0x010c
        L_0x010a:
            r4 = 0
            goto L_0x010d
        L_0x010c:
            r4 = 1
        L_0x010d:
            if (r4 == 0) goto L_0x0110
            goto L_0x0130
        L_0x0110:
            com.ss.android.socialbase.downloader.exception.BaseException r4 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x012e, Throwable -> 0x0127 }
            r11 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r12 = "Http response error , code is : %s "
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ BaseException -> 0x012e, Throwable -> 0x0127 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ BaseException -> 0x012e, Throwable -> 0x0127 }
            r14[r15] = r0     // Catch:{ BaseException -> 0x012e, Throwable -> 0x0127 }
            java.lang.String r0 = java.lang.String.format(r12, r14)     // Catch:{ BaseException -> 0x012e, Throwable -> 0x0127 }
            r4.<init>((int) r11, (java.lang.String) r0)     // Catch:{ BaseException -> 0x012e, Throwable -> 0x0127 }
            throw r4     // Catch:{ BaseException -> 0x012e, Throwable -> 0x0127 }
        L_0x0127:
            r0 = move-exception
            java.lang.String r4 = "ChunkRunnableGetResponseCode"
            com.ss.android.socialbase.downloader.e.d.a((java.lang.Throwable) r0, (java.lang.String) r4)     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            goto L_0x0130
        L_0x012e:
            r0 = move-exception
            throw r0     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
        L_0x0130:
            com.ss.android.socialbase.downloader.downloader.d r0 = new com.ss.android.socialbase.downloader.downloader.d     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f30863f     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r11 = r1.h     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            com.ss.android.socialbase.downloader.d.e r12 = r1.g     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            r0.<init>(r4, r11, r2, r12)     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            r1.f30859a = r0     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            if (r3 == 0) goto L_0x0160
            long r11 = r3.b(r15)     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            int r0 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0150
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0150
            long r7 = r7 - r5
            r4 = 1
            long r11 = r7 + r4
        L_0x0150:
            com.ss.android.socialbase.downloader.downloader.d r0 = r1.f30859a     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            long r4 = r3.i()     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            long r6 = r3.f31055c     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            r0.f30916b = r4     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            r0.f30917c = r4     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            r0.f30918d = r6     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            r0.f30919e = r11     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
        L_0x0160:
            com.ss.android.socialbase.downloader.downloader.d r0 = r1.f30859a     // Catch:{ BaseException -> 0x016a, Throwable -> 0x01a4 }
            r0.c()     // Catch:{ BaseException -> 0x016a, Throwable -> 0x01a4 }
            r20.c()
            r2 = 1
            return r2
        L_0x016a:
            r0 = move-exception
            r19 = 1
            goto L_0x01c3
        L_0x016e:
            com.ss.android.socialbase.downloader.exception.BaseException r0 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            r3 = 1022(0x3fe, float:1.432E-42)
            java.io.IOException r4 = new java.io.IOException     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            java.lang.String r5 = "download can't continue, chunk connection is null"
            r4.<init>(r5)     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            r0.<init>((int) r3, (java.lang.Throwable) r4)     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            throw r0     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
        L_0x017d:
            r0 = move-exception
        L_0x017e:
            r15 = 0
            goto L_0x0187
        L_0x0180:
            r0 = move-exception
            r4 = 200(0xc8, float:2.8E-43)
            r11 = 300(0x12c, float:4.2E-43)
        L_0x0185:
            throw r0     // Catch:{ all -> 0x0186 }
        L_0x0186:
            r0 = move-exception
        L_0x0187:
            com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r3 = r1.h     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            if (r3 == 0) goto L_0x01a0
            com.ss.android.socialbase.downloader.d.e r3 = r1.g     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
            if (r3 == 0) goto L_0x01a0
            com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r3 = r1.h     // Catch:{ Throwable -> 0x01a0, BaseException -> 0x01c0 }
            int r3 = r3.a()     // Catch:{ Throwable -> 0x01a0, BaseException -> 0x01c0 }
            if (r3 < r4) goto L_0x0199
            if (r3 < r11) goto L_0x01a0
        L_0x0199:
            com.ss.android.socialbase.downloader.d.e r3 = r1.g     // Catch:{ Throwable -> 0x01a0, BaseException -> 0x01c0 }
            com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r4 = r1.h     // Catch:{ Throwable -> 0x01a0, BaseException -> 0x01c0 }
            r3.a((com.ss.android.socialbase.downloader.network.c) r4)     // Catch:{ Throwable -> 0x01a0, BaseException -> 0x01c0 }
        L_0x01a0:
            throw r0     // Catch:{ BaseException -> 0x01c0, Throwable -> 0x01a4 }
        L_0x01a1:
            r0 = move-exception
            goto L_0x0273
        L_0x01a4:
            r0 = move-exception
        L_0x01a5:
            boolean r2 = r20.d()     // Catch:{ all -> 0x01a1 }
            if (r2 == 0) goto L_0x01b0
            r20.c()
            r2 = 1
            return r2
        L_0x01b0:
            java.lang.String r2 = "downloadChunkInner"
            com.ss.android.socialbase.downloader.e.d.a((java.lang.Throwable) r0, (java.lang.String) r2)     // Catch:{ BaseException -> 0x01b6 }
            goto L_0x01bc
        L_0x01b6:
            r0 = move-exception
            com.ss.android.socialbase.downloader.d.e r2 = r1.g     // Catch:{ all -> 0x01a1 }
            r2.b(r0)     // Catch:{ all -> 0x01a1 }
        L_0x01bc:
            r20.c()
            return r15
        L_0x01c0:
            r0 = move-exception
        L_0x01c1:
            r19 = 0
        L_0x01c3:
            boolean r3 = r20.d()     // Catch:{ all -> 0x01a1 }
            if (r3 == 0) goto L_0x01ce
            r20.c()
            r2 = 1
            return r2
        L_0x01ce:
            boolean r3 = com.ss.android.socialbase.downloader.e.d.b((com.ss.android.socialbase.downloader.exception.BaseException) r0)     // Catch:{ all -> 0x01a1 }
            if (r3 == 0) goto L_0x01dd
            com.ss.android.socialbase.downloader.d.e r2 = r1.g     // Catch:{ all -> 0x01a1 }
            r2.a((com.ss.android.socialbase.downloader.exception.BaseException) r0, (boolean) r15)     // Catch:{ all -> 0x01a1 }
            r20.c()
            return r15
        L_0x01dd:
            com.ss.android.socialbase.downloader.d.e r3 = r1.g     // Catch:{ all -> 0x01a1 }
            boolean r3 = r3.a((com.ss.android.socialbase.downloader.exception.BaseException) r0)     // Catch:{ all -> 0x01a1 }
            if (r3 == 0) goto L_0x026a
            boolean r3 = com.ss.android.socialbase.downloader.e.d.a((com.ss.android.socialbase.downloader.exception.BaseException) r0)     // Catch:{ all -> 0x01a1 }
            if (r3 == 0) goto L_0x01f5
            com.ss.android.socialbase.downloader.d.e r2 = r1.g     // Catch:{ all -> 0x01a1 }
            r3 = 1
            r2.a((com.ss.android.socialbase.downloader.exception.BaseException) r0, (boolean) r3)     // Catch:{ all -> 0x01a1 }
            r20.c()
            return r15
        L_0x01f5:
            if (r19 == 0) goto L_0x0250
            com.ss.android.socialbase.downloader.downloader.d r3 = r1.f30859a     // Catch:{ all -> 0x01a1 }
            if (r3 == 0) goto L_0x0247
            com.ss.android.socialbase.downloader.downloader.d r3 = r1.f30859a     // Catch:{ all -> 0x01a1 }
            long r3 = r3.f30916b     // Catch:{ all -> 0x01a1 }
            r5 = 0
            long r17 = r3 - r9
            boolean r3 = r21.b()     // Catch:{ all -> 0x01a1 }
            if (r3 == 0) goto L_0x020d
            com.ss.android.socialbase.downloader.model.b r3 = r21.c()     // Catch:{ all -> 0x01a1 }
            goto L_0x020e
        L_0x020d:
            r3 = r2
        L_0x020e:
            if (r3 == 0) goto L_0x0236
            boolean r4 = r3.e()     // Catch:{ all -> 0x01a1 }
            if (r4 == 0) goto L_0x0221
            com.ss.android.socialbase.downloader.downloader.i r4 = r1.i     // Catch:{ all -> 0x01a1 }
            int r5 = r3.f31053a     // Catch:{ all -> 0x01a1 }
            int r6 = r3.a()     // Catch:{ all -> 0x01a1 }
            r4.a(r5, r6, r9)     // Catch:{ all -> 0x01a1 }
        L_0x0221:
            r3.a((long) r9)     // Catch:{ all -> 0x01a1 }
            com.ss.android.socialbase.downloader.downloader.i r4 = r1.i     // Catch:{ all -> 0x01a1 }
            int r5 = r3.f31053a     // Catch:{ all -> 0x01a1 }
            int r11 = r3.f31057e     // Catch:{ all -> 0x01a1 }
            int r12 = r3.a()     // Catch:{ all -> 0x01a1 }
            r6 = r9
            r9 = r4
            r10 = r5
            r13 = r6
            r9.a((int) r10, (int) r11, (int) r12, (long) r13)     // Catch:{ all -> 0x01a1 }
            goto L_0x0250
        L_0x0236:
            r6 = r9
            boolean r3 = r21.b()     // Catch:{ all -> 0x01a1 }
            if (r3 == 0) goto L_0x0250
            com.ss.android.socialbase.downloader.downloader.i r3 = r1.i     // Catch:{ all -> 0x01a1 }
            int r4 = r2.f31053a     // Catch:{ all -> 0x01a1 }
            int r5 = r2.f31057e     // Catch:{ all -> 0x01a1 }
            r3.a(r4, r5, r6)     // Catch:{ all -> 0x01a1 }
            goto L_0x0250
        L_0x0247:
            com.ss.android.socialbase.downloader.d.e r2 = r1.g     // Catch:{ all -> 0x01a1 }
            r2.b(r0)     // Catch:{ all -> 0x01a1 }
            r20.c()
            return r15
        L_0x0250:
            r3 = r17
            com.ss.android.socialbase.downloader.d.e r5 = r1.g     // Catch:{ all -> 0x01a1 }
            com.ss.android.socialbase.downloader.exception.g r0 = r5.a((com.ss.android.socialbase.downloader.exception.BaseException) r0, (long) r3)     // Catch:{ all -> 0x01a1 }
            com.ss.android.socialbase.downloader.exception.g r3 = com.ss.android.socialbase.downloader.exception.g.RETURN     // Catch:{ all -> 0x01a1 }
            if (r0 != r3) goto L_0x0260
            r20.c()
            return r15
        L_0x0260:
            r2.j = r15     // Catch:{ all -> 0x01a1 }
            r20.c()     // Catch:{ all -> 0x01a1 }
            r20.c()
            goto L_0x0004
        L_0x026a:
            com.ss.android.socialbase.downloader.d.e r2 = r1.g     // Catch:{ all -> 0x01a1 }
            r2.b(r0)     // Catch:{ all -> 0x01a1 }
            r20.c()
            return r15
        L_0x0273:
            r20.c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.d.b.a(com.ss.android.socialbase.downloader.model.b):boolean");
    }

    public b(com.ss.android.socialbase.downloader.model.b bVar, DownloadTask downloadTask, e eVar) {
        this.f30861d = bVar;
        this.f30862e = downloadTask;
        if (downloadTask != null) {
            this.f30863f = downloadTask.getDownloadInfo();
        }
        this.g = eVar;
        this.i = com.ss.android.socialbase.downloader.downloader.b.i();
        this.f30861d.a(this);
    }

    public b(com.ss.android.socialbase.downloader.model.b bVar, DownloadTask downloadTask, IDownloadHttpConnection iDownloadHttpConnection, e eVar) {
        this(bVar, downloadTask, eVar);
        this.h = iDownloadHttpConnection;
    }
}
