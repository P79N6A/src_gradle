package com.ss.android.socialbase.downloader.downloader;

import com.ss.android.socialbase.downloader.a.c;
import com.ss.android.socialbase.downloader.d.e;
import com.ss.android.socialbase.downloader.impls.k;
import com.ss.android.socialbase.downloader.impls.l;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.b;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import java.util.concurrent.ExecutorService;

public class d {

    /* renamed from: f  reason: collision with root package name */
    private static String f30914f = "d";

    /* renamed from: a  reason: collision with root package name */
    public final IDownloadHttpConnection f30915a;

    /* renamed from: b  reason: collision with root package name */
    public long f30916b;

    /* renamed from: c  reason: collision with root package name */
    public long f30917c;

    /* renamed from: d  reason: collision with root package name */
    public volatile long f30918d;

    /* renamed from: e  reason: collision with root package name */
    public volatile long f30919e;
    private final DownloadInfo g;
    private final b h;
    private i i = b.i();
    private k j;
    private c k;
    private com.ss.android.socialbase.downloader.model.c l;
    private volatile boolean m;
    private volatile boolean n;
    private final e o;
    private int p;
    private volatile long q;
    private volatile long r;

    private boolean d() {
        if (this.m || this.n) {
            return true;
        }
        return false;
    }

    public final void a() {
        if (!this.m) {
            this.m = true;
            e();
        }
    }

    public final void b() {
        if (!this.n) {
            this.n = true;
            e();
        }
    }

    private void e() {
        if (this.f30915a != null) {
            ExecutorService f2 = b.f();
            if (f2 != null) {
                f2.execute(new Runnable() {
                    public final void run() {
                        try {
                            d.this.f30915a.end();
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void f() {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r1 = 1
            com.ss.android.socialbase.downloader.model.c r2 = r4.l     // Catch:{ IOException -> 0x001b }
            java.io.BufferedOutputStream r3 = r2.f31065a     // Catch:{ IOException -> 0x001b }
            if (r3 == 0) goto L_0x000e
            java.io.BufferedOutputStream r3 = r2.f31065a     // Catch:{ IOException -> 0x001b }
            r3.flush()     // Catch:{ IOException -> 0x001b }
        L_0x000e:
            java.io.FileDescriptor r3 = r2.f31066b     // Catch:{ IOException -> 0x001b }
            if (r3 == 0) goto L_0x0017
            java.io.FileDescriptor r2 = r2.f31066b     // Catch:{ IOException -> 0x001b }
            r2.sync()     // Catch:{ IOException -> 0x001b }
        L_0x0017:
            r2 = 1
            goto L_0x001c
        L_0x0019:
            r0 = move-exception
            goto L_0x0067
        L_0x001b:
            r2 = 0
        L_0x001c:
            if (r2 == 0) goto L_0x0069
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r4.g     // Catch:{ all -> 0x0019 }
            int r2 = r2.getChunkCount()     // Catch:{ all -> 0x0019 }
            if (r2 <= r1) goto L_0x0027
            r0 = 1
        L_0x0027:
            boolean r1 = com.ss.android.socialbase.downloader.e.d.b()     // Catch:{ all -> 0x0019 }
            com.ss.android.socialbase.downloader.downloader.l r1 = com.ss.android.socialbase.downloader.impls.l.a(r1)     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0052
            com.ss.android.socialbase.downloader.a.c r0 = r4.k     // Catch:{ all -> 0x0019 }
            r4.a(r0)     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x003f
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r4.g     // Catch:{ all -> 0x0019 }
            r1.c((com.ss.android.socialbase.downloader.model.DownloadInfo) r0)     // Catch:{ all -> 0x0019 }
            monitor-exit(r4)
            return
        L_0x003f:
            com.ss.android.socialbase.downloader.a.c r0 = r4.k     // Catch:{ all -> 0x0019 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r4.g     // Catch:{ all -> 0x0019 }
            int r1 = r1.getId()     // Catch:{ all -> 0x0019 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r4.g     // Catch:{ all -> 0x0019 }
            long r2 = r2.getCurBytes()     // Catch:{ all -> 0x0019 }
            r0.a((int) r1, (long) r2)     // Catch:{ all -> 0x0019 }
            monitor-exit(r4)
            return
        L_0x0052:
            if (r1 == 0) goto L_0x005b
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r4.g     // Catch:{ all -> 0x0019 }
            r1.c((com.ss.android.socialbase.downloader.model.DownloadInfo) r0)     // Catch:{ all -> 0x0019 }
            monitor-exit(r4)
            return
        L_0x005b:
            com.ss.android.socialbase.downloader.a.c r0 = r4.k     // Catch:{ all -> 0x0019 }
            com.ss.android.socialbase.downloader.model.b r1 = r4.h     // Catch:{ all -> 0x0019 }
            int r1 = r1.f31053a     // Catch:{ all -> 0x0019 }
            long r2 = r4.f30916b     // Catch:{ all -> 0x0019 }
            r0.a((int) r1, (long) r2)     // Catch:{ all -> 0x0019 }
            goto L_0x0069
        L_0x0067:
            monitor-exit(r4)
            throw r0
        L_0x0069:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.d.f():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:166|167|168|(2:170|171)|172|173|(1:175)|176|(3:178|179|122)|180|(0)(0)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:(2:146|147)|148|149|(1:151)|152|(3:154|155|156)(1:158)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:(2:14|15)|16|17|(1:19)|20|(3:22|23|24)(1:26)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:226|(2:79|80)|81|82|(1:84)|85|(3:87|88|89)(1:91)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:(13:58|59|(1:228)(7:61|(1:65)|66|(2:68|(1:73)(1:72))|75|76|(7:226|(2:79|80)|81|82|(1:84)|85|(3:87|88|89)(1:91))(3:99|100|(2:102|(1:108)(1:227))(3:225|109|110)))|(2:112|113)|114|115|(1:117)|118|(3:120|121|122)|180|(1:182)(2:183|(1:191)(2:189|190))|35|34)|229|(2:38|39)|40|41|(1:43)|44|(3:46|47|48)(1:50)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:134|(2:203|204)|205|206|(1:208)|209|(2:211|212)|213) */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x01d8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x01db, code lost:
        if (r1.l != null) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:?, code lost:
        r1.l.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x01e2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x026c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x026f, code lost:
        if (r1.l != null) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:?, code lost:
        r1.l.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0276, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0294, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0297, code lost:
        if (r1.l != null) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:?, code lost:
        r1.l.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x029e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r1.l != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r1.l.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0096, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0099, code lost:
        if (r1.l != null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r1.l.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0107, code lost:
        if (r4 != false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0134, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0137, code lost:
        if (r1.l != null) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r1.l.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x013e, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:114:0x0173 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:148:0x01c1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0052 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:172:0x01ed */
    /* JADX WARNING: Missing exception handler attribute for start block: B:205:0x027e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x007f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x011d */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x017c A[Catch:{ all -> 0x018d }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0183 A[SYNTHETIC, Splitter:B:120:0x0183] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01ca A[Catch:{ all -> 0x01d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01d1 A[SYNTHETIC, Splitter:B:154:0x01d1] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01d7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x01f6 A[Catch:{ all -> 0x026c }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x01fd A[SYNTHETIC, Splitter:B:178:0x01fd] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0208 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0287 A[Catch:{ all -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x028e A[SYNTHETIC, Splitter:B:211:0x028e] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062 A[SYNTHETIC, Splitter:B:22:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0088 A[Catch:{ all -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008f A[SYNTHETIC, Splitter:B:46:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0095 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0126 A[Catch:{ all -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x012d A[SYNTHETIC, Splitter:B:87:0x012d] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0133 A[RETURN] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:142:0x01b6=Splitter:B:142:0x01b6, B:200:0x0278=Splitter:B:200:0x0278} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            r17 = this;
            r1 = r17
            boolean r0 = r17.d()
            if (r0 != 0) goto L_0x02a9
            com.ss.android.socialbase.downloader.model.b r0 = r1.h
            if (r0 != 0) goto L_0x000e
            goto L_0x02a9
        L_0x000e:
            com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r0 = r1.f30915a
            long r2 = com.ss.android.socialbase.downloader.e.d.a((com.ss.android.socialbase.downloader.network.c) r0)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x029f
            com.ss.android.socialbase.downloader.model.b r0 = r1.h
            long r6 = r0.f31054b
            r8 = 0
            r10 = 0
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.g     // Catch:{ BaseException -> 0x0277, Throwable -> 0x01b5 }
            java.lang.String r0 = r0.getTempPath()     // Catch:{ BaseException -> 0x0277, Throwable -> 0x01b5 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r11 = r1.g     // Catch:{ BaseException -> 0x0277, Throwable -> 0x01b5 }
            java.lang.String r11 = r11.getTempName()     // Catch:{ BaseException -> 0x0277, Throwable -> 0x01b5 }
            com.ss.android.socialbase.downloader.model.c r0 = com.ss.android.socialbase.downloader.e.d.a((java.lang.String) r0, (java.lang.String) r11)     // Catch:{ BaseException -> 0x0277, Throwable -> 0x01b5 }
            r1.l = r0     // Catch:{ BaseException -> 0x0277, Throwable -> 0x01b5 }
            com.ss.android.socialbase.downloader.model.c r0 = r1.l     // Catch:{ BaseException -> 0x0277, Throwable -> 0x01b5 }
            long r11 = r1.f30916b     // Catch:{ BaseException -> 0x0277, Throwable -> 0x01b5 }
            java.io.RandomAccessFile r0 = r0.f31067c     // Catch:{ BaseException -> 0x0277, Throwable -> 0x01b5 }
            r0.seek(r11)     // Catch:{ BaseException -> 0x0277, Throwable -> 0x01b5 }
            com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r0 = r1.f30915a     // Catch:{ BaseException -> 0x0277, Throwable -> 0x01b5 }
            java.io.InputStream r11 = r0.getInputStream()     // Catch:{ BaseException -> 0x0277, Throwable -> 0x01b5 }
            if (r11 == 0) goto L_0x0198
            int r0 = r1.p     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            byte[] r0 = new byte[r0]     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            boolean r8 = r17.d()     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            if (r8 == 0) goto L_0x0074
            if (r11 == 0) goto L_0x0052
            r11.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            com.ss.android.socialbase.downloader.impls.k r0 = r1.j     // Catch:{ all -> 0x0069 }
            r1.a(r0)     // Catch:{ all -> 0x0069 }
            com.ss.android.socialbase.downloader.model.c r0 = r1.l     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x005e
            r17.f()     // Catch:{ all -> 0x0069 }
        L_0x005e:
            com.ss.android.socialbase.downloader.model.c r0 = r1.l
            if (r0 == 0) goto L_0x0068
            com.ss.android.socialbase.downloader.model.c r0 = r1.l     // Catch:{ IOException -> 0x0067 }
            r0.a()     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            return
        L_0x0068:
            return
        L_0x0069:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.c r2 = r1.l
            if (r2 == 0) goto L_0x0073
            com.ss.android.socialbase.downloader.model.c r2 = r1.l     // Catch:{ IOException -> 0x0073 }
            r2.a()     // Catch:{ IOException -> 0x0073 }
        L_0x0073:
            throw r0
        L_0x0074:
            boolean r8 = r17.d()     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            if (r8 == 0) goto L_0x00a1
            if (r11 == 0) goto L_0x007f
            r11.close()     // Catch:{ IOException -> 0x007f }
        L_0x007f:
            com.ss.android.socialbase.downloader.impls.k r0 = r1.j     // Catch:{ all -> 0x0096 }
            r1.a(r0)     // Catch:{ all -> 0x0096 }
            com.ss.android.socialbase.downloader.model.c r0 = r1.l     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x008b
            r17.f()     // Catch:{ all -> 0x0096 }
        L_0x008b:
            com.ss.android.socialbase.downloader.model.c r0 = r1.l
            if (r0 == 0) goto L_0x0095
            com.ss.android.socialbase.downloader.model.c r0 = r1.l     // Catch:{ IOException -> 0x0094 }
            r0.a()     // Catch:{ IOException -> 0x0094 }
        L_0x0094:
            return
        L_0x0095:
            return
        L_0x0096:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.c r2 = r1.l
            if (r2 == 0) goto L_0x00a0
            com.ss.android.socialbase.downloader.model.c r2 = r1.l     // Catch:{ IOException -> 0x00a0 }
            r2.a()     // Catch:{ IOException -> 0x00a0 }
        L_0x00a0:
            throw r0
        L_0x00a1:
            int r8 = r11.read(r0)     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            r12 = -1
            if (r8 == r12) goto L_0x016e
            long r12 = r1.f30919e     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            long r14 = r1.f30916b     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            long r4 = r1.f30917c     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            r16 = 0
            long r14 = r14 - r4
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ce
            long r4 = r1.f30919e     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            long r12 = r1.f30916b     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            long r14 = r1.f30917c     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            r16 = 0
            long r12 = r12 - r14
            long r14 = (long) r8     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            long r12 = r12 + r14
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x00ce
            long r4 = r1.f30919e     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            long r12 = r1.f30916b     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            long r14 = r1.f30917c     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            r8 = 0
            long r12 = r12 - r14
            long r4 = r4 - r12
            int r8 = (int) r4     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
        L_0x00ce:
            com.ss.android.socialbase.downloader.model.c r4 = r1.l     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            java.io.BufferedOutputStream r4 = r4.f31065a     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            r4.write(r0, r10, r8)     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            long r4 = r1.f30916b     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            long r12 = (long) r8     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            long r4 = r4 + r12
            r1.f30916b = r4     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            com.ss.android.socialbase.downloader.d.e r4 = r1.o     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            boolean r4 = r4.a((long) r12)     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            com.ss.android.socialbase.downloader.impls.k r5 = r1.j     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            r1.a(r5)     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            long r14 = r1.f30916b     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            long r9 = r1.q     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            r5 = 0
            long r14 = r14 - r9
            long r8 = r1.r     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            r5 = 0
            long r8 = r12 - r8
            if (r4 != 0) goto L_0x0109
            r4 = 65536(0x10000, double:3.2379E-319)
            int r10 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0106
            r4 = 500(0x1f4, double:2.47E-321)
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0106
            r4 = 1
            goto L_0x0107
        L_0x0106:
            r4 = 0
        L_0x0107:
            if (r4 == 0) goto L_0x0112
        L_0x0109:
            r17.f()     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            long r4 = r1.f30916b     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            r1.q = r4     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            r1.r = r12     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
        L_0x0112:
            boolean r4 = r17.d()     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            if (r4 == 0) goto L_0x013f
            if (r11 == 0) goto L_0x011d
            r11.close()     // Catch:{ IOException -> 0x011d }
        L_0x011d:
            com.ss.android.socialbase.downloader.impls.k r0 = r1.j     // Catch:{ all -> 0x0134 }
            r1.a(r0)     // Catch:{ all -> 0x0134 }
            com.ss.android.socialbase.downloader.model.c r0 = r1.l     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0129
            r17.f()     // Catch:{ all -> 0x0134 }
        L_0x0129:
            com.ss.android.socialbase.downloader.model.c r0 = r1.l
            if (r0 == 0) goto L_0x0133
            com.ss.android.socialbase.downloader.model.c r0 = r1.l     // Catch:{ IOException -> 0x0132 }
            r0.a()     // Catch:{ IOException -> 0x0132 }
        L_0x0132:
            return
        L_0x0133:
            return
        L_0x0134:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.c r2 = r1.l
            if (r2 == 0) goto L_0x013e
            com.ss.android.socialbase.downloader.model.c r2 = r1.l     // Catch:{ IOException -> 0x013e }
            r2.a()     // Catch:{ IOException -> 0x013e }
        L_0x013e:
            throw r0
        L_0x013f:
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.g     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            boolean r4 = r4.isDownloadWithWifiValid()     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            if (r4 == 0) goto L_0x0168
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.g     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            boolean r4 = r4.isIgnoreDataVerify()     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            if (r4 != 0) goto L_0x0163
            long r4 = r1.f30919e     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            r8 = 0
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0163
            long r4 = r1.f30919e     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            long r8 = r1.f30916b     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            long r12 = r1.f30917c     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            r10 = 0
            long r8 = r8 - r12
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x016e
        L_0x0163:
            r4 = 0
            r10 = 0
            goto L_0x0074
        L_0x0168:
            com.ss.android.socialbase.downloader.exception.c r0 = new com.ss.android.socialbase.downloader.exception.c     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            r0.<init>()     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            throw r0     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
        L_0x016e:
            if (r11 == 0) goto L_0x0173
            r11.close()     // Catch:{ IOException -> 0x0173 }
        L_0x0173:
            com.ss.android.socialbase.downloader.impls.k r0 = r1.j     // Catch:{ all -> 0x018d }
            r1.a(r0)     // Catch:{ all -> 0x018d }
            com.ss.android.socialbase.downloader.model.c r0 = r1.l     // Catch:{ all -> 0x018d }
            if (r0 == 0) goto L_0x017f
            r17.f()     // Catch:{ all -> 0x018d }
        L_0x017f:
            com.ss.android.socialbase.downloader.model.c r0 = r1.l
            if (r0 == 0) goto L_0x0200
            com.ss.android.socialbase.downloader.model.c r0 = r1.l     // Catch:{ IOException -> 0x018a }
        L_0x0185:
            r0.a()     // Catch:{ IOException -> 0x018a }
            goto L_0x0200
        L_0x018a:
            goto L_0x0200
        L_0x018d:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.c r2 = r1.l
            if (r2 == 0) goto L_0x0197
            com.ss.android.socialbase.downloader.model.c r2 = r1.l     // Catch:{ IOException -> 0x0197 }
            r2.a()     // Catch:{ IOException -> 0x0197 }
        L_0x0197:
            throw r0
        L_0x0198:
            com.ss.android.socialbase.downloader.exception.BaseException r0 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            r4 = 1042(0x412, float:1.46E-42)
            java.io.IOException r5 = new java.io.IOException     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            java.lang.String r8 = "inputStream is null"
            r5.<init>(r8)     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            r0.<init>((int) r4, (java.lang.Throwable) r5)     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
            throw r0     // Catch:{ BaseException -> 0x01ad, Throwable -> 0x01aa, all -> 0x01a7 }
        L_0x01a7:
            r0 = move-exception
            goto L_0x0279
        L_0x01aa:
            r0 = move-exception
            r8 = r11
            goto L_0x01b6
        L_0x01ad:
            r0 = move-exception
            r8 = r11
            goto L_0x0278
        L_0x01b1:
            r0 = move-exception
            r11 = r8
            goto L_0x0279
        L_0x01b5:
            r0 = move-exception
        L_0x01b6:
            boolean r4 = r17.d()     // Catch:{ all -> 0x01b1 }
            if (r4 == 0) goto L_0x01e3
            if (r8 == 0) goto L_0x01c1
            r8.close()     // Catch:{ IOException -> 0x01c1 }
        L_0x01c1:
            com.ss.android.socialbase.downloader.impls.k r0 = r1.j     // Catch:{ all -> 0x01d8 }
            r1.a(r0)     // Catch:{ all -> 0x01d8 }
            com.ss.android.socialbase.downloader.model.c r0 = r1.l     // Catch:{ all -> 0x01d8 }
            if (r0 == 0) goto L_0x01cd
            r17.f()     // Catch:{ all -> 0x01d8 }
        L_0x01cd:
            com.ss.android.socialbase.downloader.model.c r0 = r1.l
            if (r0 == 0) goto L_0x01d7
            com.ss.android.socialbase.downloader.model.c r0 = r1.l     // Catch:{ IOException -> 0x01d6 }
            r0.a()     // Catch:{ IOException -> 0x01d6 }
        L_0x01d6:
            return
        L_0x01d7:
            return
        L_0x01d8:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.c r2 = r1.l
            if (r2 == 0) goto L_0x01e2
            com.ss.android.socialbase.downloader.model.c r2 = r1.l     // Catch:{ IOException -> 0x01e2 }
            r2.a()     // Catch:{ IOException -> 0x01e2 }
        L_0x01e2:
            throw r0
        L_0x01e3:
            java.lang.String r4 = "DownloadResponseHandler"
            com.ss.android.socialbase.downloader.e.d.a((java.lang.Throwable) r0, (java.lang.String) r4)     // Catch:{ all -> 0x01b1 }
            if (r8 == 0) goto L_0x01ed
            r8.close()     // Catch:{ IOException -> 0x01ed }
        L_0x01ed:
            com.ss.android.socialbase.downloader.impls.k r0 = r1.j     // Catch:{ all -> 0x026c }
            r1.a(r0)     // Catch:{ all -> 0x026c }
            com.ss.android.socialbase.downloader.model.c r0 = r1.l     // Catch:{ all -> 0x026c }
            if (r0 == 0) goto L_0x01f9
            r17.f()     // Catch:{ all -> 0x026c }
        L_0x01f9:
            com.ss.android.socialbase.downloader.model.c r0 = r1.l
            if (r0 == 0) goto L_0x0200
            com.ss.android.socialbase.downloader.model.c r0 = r1.l     // Catch:{ IOException -> 0x018a }
            goto L_0x0185
        L_0x0200:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.g
            boolean r0 = r0.isIgnoreDataVerify()
            if (r0 == 0) goto L_0x0209
            return
        L_0x0209:
            long r4 = r1.f30916b
            long r8 = r1.f30917c
            long r4 = r4 - r8
            r8 = 0
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x026b
            long r10 = r1.f30919e
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x026b
            long r8 = r1.f30919e
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0221
            goto L_0x026b
        L_0x0221:
            com.ss.android.socialbase.downloader.exception.BaseException r0 = new com.ss.android.socialbase.downloader.exception.BaseException
            r8 = 1051(0x41b, float:1.473E-42)
            r9 = 7
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 0
            r9[r5] = r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 1
            r9[r3] = r2
            r2 = 2
            long r3 = r1.f30919e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r9[r2] = r3
            r2 = 3
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r9[r2] = r3
            r2 = 4
            long r3 = r1.f30918d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r9[r2] = r3
            r2 = 5
            long r3 = r1.f30916b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r9[r2] = r3
            r2 = 6
            long r3 = r1.f30917c
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r9[r2] = r3
            java.lang.String r2 = "handle data length[%d] != content length[%d] downloadChunkContentLen[%d], range[%d, %d) , current offset[%d] , handle start from %d"
            java.lang.String r2 = java.lang.String.format(r2, r9)
            r0.<init>((int) r8, (java.lang.String) r2)
            throw r0
        L_0x026b:
            return
        L_0x026c:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.c r2 = r1.l
            if (r2 == 0) goto L_0x0276
            com.ss.android.socialbase.downloader.model.c r2 = r1.l     // Catch:{ IOException -> 0x0276 }
            r2.a()     // Catch:{ IOException -> 0x0276 }
        L_0x0276:
            throw r0
        L_0x0277:
            r0 = move-exception
        L_0x0278:
            throw r0     // Catch:{ all -> 0x01b1 }
        L_0x0279:
            if (r11 == 0) goto L_0x027e
            r11.close()     // Catch:{ IOException -> 0x027e }
        L_0x027e:
            com.ss.android.socialbase.downloader.impls.k r2 = r1.j     // Catch:{ all -> 0x0294 }
            r1.a(r2)     // Catch:{ all -> 0x0294 }
            com.ss.android.socialbase.downloader.model.c r2 = r1.l     // Catch:{ all -> 0x0294 }
            if (r2 == 0) goto L_0x028a
            r17.f()     // Catch:{ all -> 0x0294 }
        L_0x028a:
            com.ss.android.socialbase.downloader.model.c r2 = r1.l
            if (r2 == 0) goto L_0x0293
            com.ss.android.socialbase.downloader.model.c r2 = r1.l     // Catch:{ IOException -> 0x0293 }
            r2.a()     // Catch:{ IOException -> 0x0293 }
        L_0x0293:
            throw r0
        L_0x0294:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.c r2 = r1.l
            if (r2 == 0) goto L_0x029e
            com.ss.android.socialbase.downloader.model.c r2 = r1.l     // Catch:{ IOException -> 0x029e }
            r2.a()     // Catch:{ IOException -> 0x029e }
        L_0x029e:
            throw r0
        L_0x029f:
            com.ss.android.socialbase.downloader.exception.f r0 = new com.ss.android.socialbase.downloader.exception.f
            r2 = 1004(0x3ec, float:1.407E-42)
            java.lang.String r3 = "the content-length is 0"
            r0.<init>(r2, r3)
            throw r0
        L_0x02a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.d.c():void");
    }

    private void a(i iVar) {
        b bVar;
        b bVar2;
        i iVar2 = iVar;
        if (iVar2 != null) {
            l lVar = null;
            boolean z = iVar2 instanceof c;
            if (z) {
                lVar = l.a(com.ss.android.socialbase.downloader.e.d.b());
                if (lVar == null) {
                    return;
                }
            }
            l lVar2 = lVar;
            if (this.h.b()) {
                bVar = this.h.c();
            } else {
                bVar = this.h;
            }
            b bVar3 = bVar;
            if (bVar3 != null) {
                bVar3.a(this.f30916b);
                if (!z || lVar2 == null) {
                    bVar2 = bVar3;
                    iVar.a(bVar3.f31053a, bVar3.f31057e, bVar3.a(), this.f30916b);
                } else {
                    lVar2.a(bVar3.f31053a, bVar3.f31057e, bVar3.a(), this.f30916b);
                    bVar2 = bVar3;
                }
                if (bVar2.e()) {
                    boolean z2 = false;
                    if (bVar2.f()) {
                        long g2 = bVar2.g();
                        if (g2 > this.f30916b) {
                            if (!z || lVar2 == null) {
                                iVar2.a(bVar2.f31053a, bVar2.a(), g2);
                            } else {
                                lVar2.a(bVar2.f31053a, bVar2.a(), g2);
                            }
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        if (!z || lVar2 == null) {
                            iVar2.a(bVar2.f31053a, bVar2.a(), this.f30916b);
                        } else {
                            lVar2.a(bVar2.f31053a, bVar2.a(), this.f30916b);
                        }
                    }
                }
            } else if (this.h.b()) {
                if (!z || lVar2 == null) {
                    iVar2.a(this.h.f31053a, this.h.f31057e, this.f30916b);
                } else {
                    lVar2.a(this.h.f31053a, this.h.f31057e, this.f30916b);
                }
            }
        }
    }

    public final synchronized void a(long j2, long j3) {
        this.f30918d = j2;
        this.f30919e = j3;
    }

    public d(DownloadInfo downloadInfo, IDownloadHttpConnection iDownloadHttpConnection, b bVar, e eVar) {
        boolean z;
        this.g = downloadInfo;
        if (this.i instanceof com.ss.android.socialbase.downloader.impls.d) {
            com.ss.android.socialbase.downloader.impls.d dVar = (com.ss.android.socialbase.downloader.impls.d) this.i;
            this.j = dVar.f31009a;
            this.k = dVar.f31010b;
        }
        this.f30915a = iDownloadHttpConnection;
        this.h = bVar;
        this.o = eVar;
        this.p = b.g;
        this.f30916b = bVar.i();
        this.f30917c = this.f30916b;
        StringBuilder sb = new StringBuilder("DownloadResponseHandler isHostChunk():");
        sb.append(bVar.b());
        sb.append(" downloadChunk!=null:");
        if (bVar.h != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        if (bVar.b()) {
            this.f30919e = bVar.f31056d;
        } else {
            this.f30919e = bVar.b(false);
        }
        this.f30918d = bVar.f31055c;
    }
}
