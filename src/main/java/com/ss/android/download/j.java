package com.ss.android.download;

import android.annotation.TargetApi;
import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.download.b.c;
import com.ss.android.download.d;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;

public final class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f28583a;

    /* renamed from: b  reason: collision with root package name */
    private final d f28584b;

    /* renamed from: c  reason: collision with root package name */
    private final s f28585c;

    /* renamed from: d  reason: collision with root package name */
    private final r f28586d;

    /* renamed from: e  reason: collision with root package name */
    private final f f28587e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f28588f;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f28589a;

        /* renamed from: b  reason: collision with root package name */
        public String f28590b;

        /* renamed from: c  reason: collision with root package name */
        public int f28591c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f28592d;

        /* renamed from: e  reason: collision with root package name */
        public String f28593e;

        /* renamed from: f  reason: collision with root package name */
        public long f28594f = -1;
        public long g;
        public String h;
        public boolean i;
        public long j;
        public long k;
        public int l = -1;
        public long m;
        public long n;
        public long o;
        public long p = -1;
        public String q;
        public String r;
        public int s;
        public URL t;

        public a(d dVar) {
            this.f28590b = dVar.f28528f;
            this.f28593e = dVar.f28524b;
            this.f28589a = dVar.f28527e;
            this.f28594f = dVar.s;
            this.g = dVar.t;
        }
    }

    private void a(a aVar, byte[] bArr, int i, OutputStream outputStream) throws q {
        r rVar = this.f28586d;
        int i2 = this.f28584b.g;
        String str = aVar.f28589a;
        long j = (long) i;
        if (rVar.a(j) >= 1048576) {
            rVar.a(i2, str, j);
        }
        boolean z = false;
        while (true) {
            try {
                outputStream.write(bArr, 0, i);
                return;
            } catch (IOException e2) {
                if (!z) {
                    this.f28586d.a(this.f28584b.g, aVar.f28589a, j);
                    z = true;
                } else {
                    throw new q(492, "Failed to write data: " + e2);
                }
            }
        }
    }

    private void a() throws q {
        this.f28588f = false;
        d.a b2 = this.f28584b.b();
        if (b2 != d.a.OK) {
            int i = 196;
            if (b2 == d.a.UNUSABLE_DUE_TO_SIZE) {
                this.f28584b.a(true);
            } else if (b2 == d.a.RECOMMENDED_UNUSABLE_DUE_TO_SIZE) {
                this.f28584b.a(false);
            } else {
                i = 195;
            }
            throw new q(i, b2.name());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (r5 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
        if (r5 != null) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0114 A[SYNTHETIC, Splitter:B:79:0x0114] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x012d A[Catch:{ all -> 0x013b }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0060=Splitter:B:18:0x0060, B:74:0x0104=Splitter:B:74:0x0104, B:87:0x0125=Splitter:B:87:0x0125} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x0080=Splitter:B:32:0x0080, B:44:0x00ab=Splitter:B:44:0x00ab} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            r0 = 0
            android.content.Context r2 = r13.f28583a     // Catch:{ all -> 0x013b }
            com.ss.android.download.h r2 = com.ss.android.download.h.a((android.content.Context) r2)     // Catch:{ all -> 0x013b }
            com.ss.android.download.d r3 = r13.f28584b     // Catch:{ all -> 0x013b }
            long r3 = r3.f28523a     // Catch:{ all -> 0x013b }
            int r2 = com.ss.android.download.d.a(r2, r3)     // Catch:{ all -> 0x013b }
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 == r3) goto L_0x0131
            com.ss.android.download.j$a r2 = new com.ss.android.download.j$a     // Catch:{ all -> 0x013b }
            com.ss.android.download.d r4 = r13.f28584b     // Catch:{ all -> 0x013b }
            r2.<init>(r4)     // Catch:{ all -> 0x013b }
            com.ss.android.download.d r4 = r13.f28584b     // Catch:{ all -> 0x013b }
            int r4 = r4.k     // Catch:{ all -> 0x013b }
            android.content.Context r5 = r13.f28583a     // Catch:{ all -> 0x013b }
            java.lang.String r6 = "power"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch:{ all -> 0x013b }
            android.os.PowerManager r5 = (android.os.PowerManager) r5     // Catch:{ all -> 0x013b }
            r6 = 491(0x1eb, float:6.88E-43)
            r7 = 0
            r8 = 1
            java.lang.String r9 = "SsDownloadManager"
            android.os.PowerManager$WakeLock r5 = r5.newWakeLock(r8, r9)     // Catch:{ q -> 0x00a9, Throwable -> 0x007e, all -> 0x007a }
            r5.acquire()     // Catch:{ q -> 0x0078, Throwable -> 0x0076 }
            com.ss.android.download.s r9 = r13.f28585c     // Catch:{ q -> 0x0078, Throwable -> 0x0076 }
            android.net.NetworkInfo r9 = r9.b()     // Catch:{ q -> 0x0078, Throwable -> 0x0076 }
            if (r9 == 0) goto L_0x0049
            int r9 = r9.getType()     // Catch:{ q -> 0x0078, Throwable -> 0x0076 }
            r2.l = r9     // Catch:{ q -> 0x0078, Throwable -> 0x0076 }
        L_0x0049:
            java.net.URL r9 = new java.net.URL     // Catch:{ MalformedURLException -> 0x006d }
            java.lang.String r10 = r2.f28593e     // Catch:{ MalformedURLException -> 0x006d }
            r9.<init>(r10)     // Catch:{ MalformedURLException -> 0x006d }
            r2.t = r9     // Catch:{ MalformedURLException -> 0x006d }
            r13.a(r2)     // Catch:{ q -> 0x0078, Throwable -> 0x0076 }
            java.lang.String r9 = r2.f28589a     // Catch:{ q -> 0x0078, Throwable -> 0x0076 }
            if (r9 == 0) goto L_0x0060
            java.lang.String r9 = r2.f28589a     // Catch:{ q -> 0x0078, Throwable -> 0x0076 }
            r10 = 420(0x1a4, float:5.89E-43)
            com.bytedance.common.utility.io.FileUtils.chmod(r9, r10)     // Catch:{ q -> 0x0078, Throwable -> 0x0076 }
        L_0x0060:
            a((com.ss.android.download.j.a) r2, (int) r3)     // Catch:{ all -> 0x013b }
            r13.a((com.ss.android.download.j.a) r2, (int) r3, (java.lang.String) r7, (int) r4)     // Catch:{ all -> 0x013b }
            if (r5 == 0) goto L_0x010e
        L_0x0068:
            r5.release()     // Catch:{ all -> 0x013b }
            goto L_0x010e
        L_0x006d:
            r3 = move-exception
            com.ss.android.download.q r9 = new com.ss.android.download.q     // Catch:{ q -> 0x0078, Throwable -> 0x0076 }
            r10 = 400(0x190, float:5.6E-43)
            r9.<init>((int) r10, (java.lang.Throwable) r3)     // Catch:{ q -> 0x0078, Throwable -> 0x0076 }
            throw r9     // Catch:{ q -> 0x0078, Throwable -> 0x0076 }
        L_0x0076:
            r3 = move-exception
            goto L_0x0080
        L_0x0078:
            r3 = move-exception
            goto L_0x00ab
        L_0x007a:
            r3 = move-exception
            r5 = r7
            goto L_0x0125
        L_0x007e:
            r3 = move-exception
            r5 = r7
        L_0x0080:
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0124 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a3 }
            java.lang.String r8 = "Exception for id "
            r7.<init>(r8)     // Catch:{ all -> 0x00a3 }
            com.ss.android.download.d r8 = r13.f28584b     // Catch:{ all -> 0x00a3 }
            long r8 = r8.f28523a     // Catch:{ all -> 0x00a3 }
            r7.append(r8)     // Catch:{ all -> 0x00a3 }
            java.lang.String r8 = ": "
            r7.append(r8)     // Catch:{ all -> 0x00a3 }
            r7.append(r3)     // Catch:{ all -> 0x00a3 }
            a((com.ss.android.download.j.a) r2, (int) r6)     // Catch:{ all -> 0x013b }
            r13.a((com.ss.android.download.j.a) r2, (int) r6, (java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x013b }
            if (r5 == 0) goto L_0x010e
            goto L_0x0068
        L_0x00a3:
            r7 = move-exception
            r12 = r7
            r7 = r3
        L_0x00a6:
            r3 = r12
            goto L_0x0125
        L_0x00a9:
            r3 = move-exception
            r5 = r7
        L_0x00ab:
            java.lang.String r9 = r3.getMessage()     // Catch:{ all -> 0x0124 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0121 }
            java.lang.String r10 = "Aborting request for download "
            r7.<init>(r10)     // Catch:{ all -> 0x0121 }
            com.ss.android.download.d r10 = r13.f28584b     // Catch:{ all -> 0x0121 }
            long r10 = r10.f28523a     // Catch:{ all -> 0x0121 }
            r7.append(r10)     // Catch:{ all -> 0x0121 }
            java.lang.String r10 = ": "
            r7.append(r10)     // Catch:{ all -> 0x0121 }
            r7.append(r9)     // Catch:{ all -> 0x0121 }
            int r3 = r3.getFinalStatus()     // Catch:{ all -> 0x0121 }
            r6 = 194(0xc2, float:2.72E-43)
            if (r3 == r6) goto L_0x0114
            r7 = 495(0x1ef, float:6.94E-43)
            if (r3 == r7) goto L_0x00db
            r7 = 500(0x1f4, float:7.0E-43)
            if (r3 == r7) goto L_0x00db
            r7 = 503(0x1f7, float:7.05E-43)
            if (r3 == r7) goto L_0x00db
            r7 = 0
            goto L_0x00dc
        L_0x00db:
            r7 = 1
        L_0x00dc:
            if (r7 == 0) goto L_0x0104
            boolean r7 = r2.f28592d     // Catch:{ all -> 0x011c }
            if (r7 == 0) goto L_0x00e4
            r4 = 1
            goto L_0x00e6
        L_0x00e4:
            int r4 = r4 + 1
        L_0x00e6:
            r7 = 5
            if (r4 >= r7) goto L_0x0104
            com.ss.android.download.s r7 = r13.f28585c     // Catch:{ all -> 0x011c }
            android.net.NetworkInfo r7 = r7.b()     // Catch:{ all -> 0x011c }
            if (r7 == 0) goto L_0x0102
            int r8 = r7.getType()     // Catch:{ all -> 0x011c }
            int r10 = r2.l     // Catch:{ all -> 0x011c }
            if (r8 != r10) goto L_0x0102
            boolean r7 = r7.isConnected()     // Catch:{ all -> 0x011c }
            if (r7 == 0) goto L_0x0102
            r3 = 194(0xc2, float:2.72E-43)
            goto L_0x0104
        L_0x0102:
            r3 = 195(0xc3, float:2.73E-43)
        L_0x0104:
            a((com.ss.android.download.j.a) r2, (int) r3)     // Catch:{ all -> 0x013b }
            r13.a((com.ss.android.download.j.a) r2, (int) r3, (java.lang.String) r9, (int) r4)     // Catch:{ all -> 0x013b }
            if (r5 == 0) goto L_0x010e
            goto L_0x0068
        L_0x010e:
            com.ss.android.download.r r2 = r13.f28586d     // Catch:{ all -> 0x013b }
            r2.a()     // Catch:{ all -> 0x013b }
            goto L_0x0131
        L_0x0114:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x011c }
            java.lang.String r7 = "Execution should always throw final error codes"
            r6.<init>(r7)     // Catch:{ all -> 0x011c }
            throw r6     // Catch:{ all -> 0x011c }
        L_0x011c:
            r6 = move-exception
            r7 = r9
            r12 = r6
            r6 = r3
            goto L_0x00a6
        L_0x0121:
            r3 = move-exception
            r7 = r9
            goto L_0x0125
        L_0x0124:
            r3 = move-exception
        L_0x0125:
            a((com.ss.android.download.j.a) r2, (int) r6)     // Catch:{ all -> 0x013b }
            r13.a((com.ss.android.download.j.a) r2, (int) r6, (java.lang.String) r7, (int) r4)     // Catch:{ all -> 0x013b }
            if (r5 == 0) goto L_0x0130
            r5.release()     // Catch:{ all -> 0x013b }
        L_0x0130:
            throw r3     // Catch:{ all -> 0x013b }
        L_0x0131:
            com.ss.android.download.f r2 = r13.f28587e
            com.ss.android.download.d r3 = r13.f28584b
            long r3 = r3.f28523a
            r2.a((long) r3, (long) r0)
            return
        L_0x013b:
            r2 = move-exception
            com.ss.android.download.f r3 = r13.f28587e
            com.ss.android.download.d r4 = r13.f28584b
            long r4 = r4.f28523a
            r3.a((long) r4, (long) r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.download.j.run():void");
    }

    private boolean b(a aVar) {
        if (aVar.g <= 0 || this.f28584b.f28525c || aVar.h != null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0337  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.ss.android.download.j.a r18) throws com.ss.android.download.q {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = -1
            r0.p = r2
            r4 = 0
            r0.q = r4
            r0.r = r4
            r5 = 0
            r0.s = r5
            java.lang.String r6 = r0.f28589a
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r7 = 492(0x1ec, float:6.9E-43)
            r8 = 0
            r10 = 489(0x1e9, float:6.85E-43)
            r11 = 1
            if (r6 != 0) goto L_0x0083
            java.lang.String r6 = r0.f28589a
            com.ss.android.download.r r12 = r1.f28586d
            java.io.File r12 = r12.f28608b
            boolean r6 = com.ss.android.download.k.a((java.lang.String) r6, (java.io.File) r12)
            if (r6 == 0) goto L_0x007b
            java.io.File r6 = new java.io.File
            java.lang.String r12 = r0.f28589a
            r6.<init>(r12)
            boolean r12 = r6.exists()
            if (r12 == 0) goto L_0x0083
            long r12 = r6.length()
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 != 0) goto L_0x0048
            r6.delete()
            r0.f28589a = r4
            boolean r6 = com.ss.android.download.a.f28419c
            goto L_0x0083
        L_0x0048:
            com.ss.android.download.d r14 = r1.f28584b
            java.lang.String r14 = r14.u
            if (r14 != 0) goto L_0x0060
            com.ss.android.download.d r14 = r1.f28584b
            boolean r14 = r14.f28525c
            if (r14 == 0) goto L_0x0055
            goto L_0x0060
        L_0x0055:
            r6.delete()
            com.ss.android.download.q r0 = new com.ss.android.download.q
            java.lang.String r2 = "Trying to resume a download that can't be resumed"
            r0.<init>((int) r10, (java.lang.String) r2)
            throw r0
        L_0x0060:
            int r6 = (int) r12
            long r12 = (long) r6
            r0.g = r12
            com.ss.android.download.d r6 = r1.f28584b
            long r12 = r6.s
            int r6 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0072
            com.ss.android.download.d r6 = r1.f28584b
            long r12 = r6.s
            r0.p = r12
        L_0x0072:
            com.ss.android.download.d r6 = r1.f28584b
            java.lang.String r6 = r6.u
            r0.h = r6
            r0.i = r11
            goto L_0x0083
        L_0x007b:
            com.ss.android.download.q r0 = new com.ss.android.download.q
            java.lang.String r2 = "found invalid internal destination filename"
            r0.<init>((int) r7, (java.lang.String) r2)
            throw r0
        L_0x0083:
            long r12 = r0.g
            long r14 = r0.f28594f
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x008c
            return
        L_0x008c:
            int r6 = r0.s
            int r12 = r6 + 1
            r0.s = r12
            r12 = 5
            if (r6 >= r12) goto L_0x033b
            r17.a()     // Catch:{ IOException -> 0x0329, all -> 0x0325 }
            java.net.URL r6 = r0.t     // Catch:{ IOException -> 0x0329, all -> 0x0325 }
            java.net.URLConnection r6 = r6.openConnection()     // Catch:{ IOException -> 0x0329, all -> 0x0325 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x0329, all -> 0x0325 }
            r6.setInstanceFollowRedirects(r5)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r12 = 20000(0x4e20, float:2.8026E-41)
            r6.setConnectTimeout(r12)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r6.setReadTimeout(r12)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r1.b(r0, r6)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            int r12 = r6.getResponseCode()     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r13 = 200(0xc8, float:2.8E-43)
            if (r12 == r13) goto L_0x015e
            r13 = 206(0xce, float:2.89E-43)
            if (r12 == r13) goto L_0x0149
            r13 = 307(0x133, float:4.3E-43)
            if (r12 == r13) goto L_0x012b
            r13 = 416(0x1a0, float:5.83E-43)
            if (r12 == r13) goto L_0x0123
            r13 = 500(0x1f4, float:7.0E-43)
            if (r12 == r13) goto L_0x0119
            r13 = 503(0x1f7, float:7.05E-43)
            if (r12 == r13) goto L_0x00da
            switch(r12) {
                case 301: goto L_0x012b;
                case 302: goto L_0x012b;
                case 303: goto L_0x012b;
                default: goto L_0x00cd;
            }     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
        L_0x00cd:
            java.lang.String r13 = r6.getResponseMessage()     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            com.ss.android.download.q.throwUnhandledHttpError(r12, r13)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r6 == 0) goto L_0x008c
        L_0x00d6:
            r6.disconnect()
            goto L_0x008c
        L_0x00da:
            java.lang.String r2 = "Retry-After"
            r3 = -1
            int r2 = r6.getHeaderFieldInt(r2, r3)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r0.f28591c = r2     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            int r2 = r0.f28591c     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r2 < 0) goto L_0x010d
            int r2 = r0.f28591c     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r3 = 30
            if (r2 < r3) goto L_0x00f7
            int r2 = r0.f28591c     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r3 = 86400(0x15180, float:1.21072E-40)
            if (r2 <= r3) goto L_0x00f9
            r0.f28591c = r3     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            goto L_0x00f9
        L_0x00f7:
            r0.f28591c = r3     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
        L_0x00f9:
            int r2 = r0.f28591c     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.util.Random r3 = com.ss.android.download.k.f28595a     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r4 = 31
            int r3 = r3.nextInt(r4)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            int r2 = r2 + r3
            r0.f28591c = r2     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            int r2 = r0.f28591c     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            int r2 = r2 * 1000
            r0.f28591c = r2     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            goto L_0x010f
        L_0x010d:
            r0.f28591c = r5     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
        L_0x010f:
            com.ss.android.download.q r0 = new com.ss.android.download.q     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r2 = r6.getResponseMessage()     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r0.<init>((int) r13, (java.lang.String) r2)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            throw r0     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
        L_0x0119:
            com.ss.android.download.q r0 = new com.ss.android.download.q     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r2 = r6.getResponseMessage()     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r0.<init>((int) r13, (java.lang.String) r2)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            throw r0     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
        L_0x0123:
            com.ss.android.download.q r0 = new com.ss.android.download.q     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r2 = "Requested range not satisfiable"
            r0.<init>((int) r10, (java.lang.String) r2)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            throw r0     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
        L_0x012b:
            java.lang.String r13 = "Location"
            java.lang.String r13 = r6.getHeaderField(r13)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.net.URL r14 = new java.net.URL     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.net.URL r15 = r0.t     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r14.<init>(r15, r13)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r0.t = r14     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r13 = 301(0x12d, float:4.22E-43)
            if (r12 != r13) goto L_0x0146
            java.net.URL r12 = r0.t     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r0.f28593e = r12     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
        L_0x0146:
            if (r6 == 0) goto L_0x008c
            goto L_0x00d6
        L_0x0149:
            boolean r2 = r0.i     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r2 == 0) goto L_0x0156
            r1.a((com.ss.android.download.j.a) r0, (java.net.HttpURLConnection) r6)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r6 == 0) goto L_0x0155
            r6.disconnect()
        L_0x0155:
            return
        L_0x0156:
            com.ss.android.download.q r0 = new com.ss.android.download.q     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r2 = "Expected OK, but received partial"
            r0.<init>((int) r10, (java.lang.String) r2)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            throw r0     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
        L_0x015e:
            boolean r12 = r0.i     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r12 != 0) goto L_0x0318
            java.lang.String r12 = "Content-Disposition"
            java.lang.String r12 = r6.getHeaderField(r12)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r0.q = r12     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r12 = "Content-Location"
            java.lang.String r12 = r6.getHeaderField(r12)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r0.r = r12     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r12 = r0.f28590b     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r12 != 0) goto L_0x017c
            java.lang.String r12 = r6.getContentType()     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r0.f28590b = r12     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
        L_0x017c:
            java.lang.String r12 = "ETag"
            java.lang.String r12 = r6.getHeaderField(r12)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r0.h = r12     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r12 = "Transfer-Encoding"
            java.lang.String r12 = r6.getHeaderField(r12)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r12 != 0) goto L_0x0195
            java.lang.String r13 = "Content-Length"
            long r13 = a((java.net.URLConnection) r6, (java.lang.String) r13, (long) r2)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r0.p = r13     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            goto L_0x0197
        L_0x0195:
            r0.p = r2     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
        L_0x0197:
            long r13 = r0.p     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r0.f28594f = r13     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            com.ss.android.download.d r13 = r1.f28584b     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            long r14 = r0.p     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r13.s = r14     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            long r13 = r0.p     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            int r15 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r15 != 0) goto L_0x01b2
            if (r12 == 0) goto L_0x01b1
            java.lang.String r2 = "chunked"
            boolean r2 = r12.equalsIgnoreCase(r2)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r2 != 0) goto L_0x01b2
        L_0x01b1:
            r5 = 1
        L_0x01b2:
            com.ss.android.download.d r2 = r1.f28584b     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            boolean r2 = r2.f28525c     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r2 != 0) goto L_0x01c3
            if (r5 != 0) goto L_0x01bb
            goto L_0x01c3
        L_0x01bb:
            com.ss.android.download.q r0 = new com.ss.android.download.q     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r2 = "can't know size of download, giving up"
            r0.<init>((int) r10, (java.lang.String) r2)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            throw r0     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
        L_0x01c3:
            com.ss.android.download.d r2 = r1.f28584b     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r2 = r2.f28524b     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            com.ss.android.download.d r3 = r1.f28584b     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r3 = r3.f28526d     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r5 = r0.q     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r10 = r0.r     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r12 = r0.f28590b     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            com.ss.android.download.d r13 = r1.f28584b     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            int r13 = r13.g     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            long r14 = r0.p     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            com.ss.android.download.r r4 = r1.f28586d     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            int r16 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r16 >= 0) goto L_0x01de
            r14 = r8
        L_0x01de:
            if (r13 != r11) goto L_0x01eb
            android.net.Uri r2 = android.net.Uri.parse(r3)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r2 = r2.getPath()     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r8 = 0
            goto L_0x02b0
        L_0x01eb:
            if (r13 != 0) goto L_0x0304
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r9.<init>()     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.io.File r11 = r4.f28607a     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r11 = r11.getPath()     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r9.append(r11)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r11 = com.ss.android.download.a.f28417a     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r9.append(r11)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r8.<init>(r9)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            boolean r9 = r8.isDirectory()     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r9 != 0) goto L_0x022e
            boolean r9 = r8.mkdir()     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r9 == 0) goto L_0x0216
            goto L_0x022e
        L_0x0216:
            com.ss.android.download.q r0 = new com.ss.android.download.q     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r3 = "unable to create external downloads directory "
            r2.<init>(r3)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r3 = r8.getPath()     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r2.append(r3)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r0.<init>((int) r7, (java.lang.String) r2)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            throw r0     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
        L_0x022e:
            r7 = 47
            if (r3 == 0) goto L_0x0247
            java.lang.String r9 = "/"
            boolean r9 = r3.endsWith(r9)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r9 != 0) goto L_0x0247
            int r9 = r3.lastIndexOf(r7)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r11 = 1
            int r9 = r9 + r11
            if (r9 <= 0) goto L_0x0248
            java.lang.String r3 = r3.substring(r9)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            goto L_0x0248
        L_0x0247:
            r3 = 0
        L_0x0248:
            if (r3 != 0) goto L_0x025e
            if (r5 == 0) goto L_0x025e
            java.lang.String r3 = com.ss.android.download.k.a((java.lang.String) r5)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r3 == 0) goto L_0x025e
            int r5 = r3.lastIndexOf(r7)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r9 = 1
            int r5 = r5 + r9
            if (r5 <= 0) goto L_0x025e
            java.lang.String r3 = r3.substring(r5)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
        L_0x025e:
            r5 = 63
            if (r3 != 0) goto L_0x0286
            if (r10 == 0) goto L_0x0286
            java.lang.String r9 = android.net.Uri.decode(r10)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r9 == 0) goto L_0x0286
            java.lang.String r10 = "/"
            boolean r10 = r9.endsWith(r10)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r10 != 0) goto L_0x0286
            int r10 = r9.indexOf(r5)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r10 >= 0) goto L_0x0286
            int r3 = r9.lastIndexOf(r7)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r10 = 1
            int r3 = r3 + r10
            if (r3 <= 0) goto L_0x0285
            java.lang.String r3 = r9.substring(r3)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            goto L_0x0286
        L_0x0285:
            r3 = r9
        L_0x0286:
            if (r3 != 0) goto L_0x02a8
            java.lang.String r2 = android.net.Uri.decode(r2)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r2 == 0) goto L_0x02a8
            java.lang.String r9 = "/"
            boolean r9 = r2.endsWith(r9)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r9 != 0) goto L_0x02a8
            int r5 = r2.indexOf(r5)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r5 >= 0) goto L_0x02a8
            int r5 = r2.lastIndexOf(r7)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r7 = 1
            int r5 = r5 + r7
            if (r5 <= 0) goto L_0x02a8
            java.lang.String r3 = r2.substring(r5)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
        L_0x02a8:
            if (r3 != 0) goto L_0x02ac
            java.lang.String r3 = "downloadfile"
        L_0x02ac:
            java.lang.String r2 = com.ss.android.download.k.b((java.lang.String) r3)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
        L_0x02b0:
            r4.a((int) r13, (java.lang.String) r2, (long) r14)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r2 = com.ss.android.download.k.a(r2, r12, r13, r8)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r0.f28589a = r2     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r2.<init>()     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r3 = "_data"
            java.lang.String r4 = r0.f28589a     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r2.put(r3, r4)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r3 = r0.h     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r3 == 0) goto L_0x02d0
            java.lang.String r3 = "etag"
            java.lang.String r4 = r0.h     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r2.put(r3, r4)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
        L_0x02d0:
            java.lang.String r3 = r0.f28590b     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r3 == 0) goto L_0x02db
            java.lang.String r3 = "mimetype"
            java.lang.String r4 = r0.f28590b     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r2.put(r3, r4)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
        L_0x02db:
            java.lang.String r3 = "total_bytes"
            com.ss.android.download.d r4 = r1.f28584b     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            long r4 = r4.s     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r2.put(r3, r4)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            android.content.Context r3 = r1.f28583a     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            com.ss.android.download.h r3 = com.ss.android.download.h.a((android.content.Context) r3)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            com.ss.android.download.d r4 = r1.f28584b     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            android.net.Uri r4 = r4.c()     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r5 = 0
            r3.a((android.net.Uri) r4, (android.content.ContentValues) r2, (java.lang.String) r5, (java.lang.String[]) r5)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r17.a()     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r1.a((com.ss.android.download.j.a) r0, (java.net.HttpURLConnection) r6)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            if (r6 == 0) goto L_0x0303
            r6.disconnect()
        L_0x0303:
            return
        L_0x0304:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r3 = "unexpected value for destination: "
            r2.<init>(r3)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r2.append(r13)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            throw r0     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
        L_0x0318:
            com.ss.android.download.q r0 = new com.ss.android.download.q     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            java.lang.String r2 = "Expected partial, but received OK"
            r0.<init>((int) r10, (java.lang.String) r2)     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
            throw r0     // Catch:{ IOException -> 0x0322, all -> 0x0320 }
        L_0x0320:
            r0 = move-exception
            goto L_0x0335
        L_0x0322:
            r0 = move-exception
            r4 = r6
            goto L_0x032b
        L_0x0325:
            r0 = move-exception
            r5 = r4
            r6 = r5
            goto L_0x0335
        L_0x0329:
            r0 = move-exception
            r5 = r4
        L_0x032b:
            com.ss.android.download.q r2 = new com.ss.android.download.q     // Catch:{ all -> 0x0333 }
            r3 = 495(0x1ef, float:6.94E-43)
            r2.<init>((int) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0333 }
            throw r2     // Catch:{ all -> 0x0333 }
        L_0x0333:
            r0 = move-exception
            r6 = r4
        L_0x0335:
            if (r6 == 0) goto L_0x033a
            r6.disconnect()
        L_0x033a:
            throw r0
        L_0x033b:
            com.ss.android.download.q r0 = new com.ss.android.download.q
            r2 = 497(0x1f1, float:6.96E-43)
            java.lang.String r3 = "Too many redirects"
            r0.<init>((int) r2, (java.lang.String) r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.download.j.a(com.ss.android.download.j$a):void");
    }

    private static void a(a aVar, int i) {
        if (aVar.f28589a != null && c.a.b(i)) {
            new File(aVar.f28589a).delete();
            aVar.f28589a = null;
        }
    }

    @TargetApi(5)
    private void b(a aVar, HttpURLConnection httpURLConnection) {
        for (T t : Collections.unmodifiableList(this.f28584b.E)) {
            httpURLConnection.addRequestProperty((String) t.first, (String) t.second);
        }
        if (httpURLConnection.getRequestProperty("User-Agent") == null) {
            String str = this.f28584b.q;
            if (str == null) {
                str = a.f28418b;
            }
            httpURLConnection.addRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        if (aVar.i) {
            if (aVar.h != null) {
                httpURLConnection.addRequestProperty("If-Match", aVar.h);
            }
            httpURLConnection.addRequestProperty("Range", "bytes=" + aVar.g + "-");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x006b, code lost:
        if (r0 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0071, code lost:
        if (r0 == null) goto L_0x0074;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0024 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0021 A[Catch:{ IOException -> 0x0024, all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0052 A[SYNTHETIC, Splitter:B:44:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0059 A[SYNTHETIC, Splitter:B:48:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0061 A[Catch:{ IOException -> 0x006b, all -> 0x005d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.ss.android.download.j.a r5, java.net.HttpURLConnection r6) throws com.ss.android.download.q {
        /*
            r4 = this;
            r0 = 0
            java.io.InputStream r6 = r6.getInputStream()     // Catch:{ IOException -> 0x0047 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            java.lang.String r2 = r5.f28589a     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            r3 = 1
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            r2 = r1
            java.io.FileOutputStream r2 = (java.io.FileOutputStream) r2     // Catch:{ IOException -> 0x0030 }
            java.io.FileDescriptor r2 = r2.getFD()     // Catch:{ IOException -> 0x0030 }
            r4.a((com.ss.android.download.j.a) r5, (java.io.InputStream) r6, (java.io.OutputStream) r1)     // Catch:{ all -> 0x002e }
            if (r6 == 0) goto L_0x001c
            r6.close()     // Catch:{ IOException -> 0x001c }
        L_0x001c:
            r1.flush()     // Catch:{ IOException -> 0x0024, all -> 0x0028 }
            if (r2 == 0) goto L_0x0024
            r2.sync()     // Catch:{ IOException -> 0x0024, all -> 0x0028 }
        L_0x0024:
            r1.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x002d
        L_0x0028:
            r5 = move-exception
            r1.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            throw r5
        L_0x002d:
            return
        L_0x002e:
            r5 = move-exception
            goto L_0x0041
        L_0x0030:
            r5 = move-exception
            goto L_0x0037
        L_0x0032:
            r5 = move-exception
            r2 = r0
            goto L_0x0050
        L_0x0035:
            r5 = move-exception
            r1 = r0
        L_0x0037:
            com.ss.android.download.q r2 = new com.ss.android.download.q     // Catch:{ all -> 0x003f }
            r3 = 492(0x1ec, float:6.9E-43)
            r2.<init>((int) r3, (java.lang.Throwable) r5)     // Catch:{ all -> 0x003f }
            throw r2     // Catch:{ all -> 0x003f }
        L_0x003f:
            r5 = move-exception
            r2 = r0
        L_0x0041:
            r0 = r1
            goto L_0x0050
        L_0x0043:
            r5 = move-exception
            r6 = r0
            r2 = r6
            goto L_0x0050
        L_0x0047:
            r5 = move-exception
            com.ss.android.download.q r6 = new com.ss.android.download.q     // Catch:{ all -> 0x0043 }
            r1 = 495(0x1ef, float:6.94E-43)
            r6.<init>((int) r1, (java.lang.Throwable) r5)     // Catch:{ all -> 0x0043 }
            throw r6     // Catch:{ all -> 0x0043 }
        L_0x0050:
            if (r6 == 0) goto L_0x0057
            r6.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x0057
        L_0x0056:
        L_0x0057:
            if (r0 == 0) goto L_0x005f
            r0.flush()     // Catch:{ IOException -> 0x006b, all -> 0x005d }
            goto L_0x005f
        L_0x005d:
            r5 = move-exception
            goto L_0x0065
        L_0x005f:
            if (r2 == 0) goto L_0x0071
            r2.sync()     // Catch:{ IOException -> 0x006b, all -> 0x005d }
            goto L_0x0071
        L_0x0065:
            if (r0 == 0) goto L_0x006a
            r0.close()     // Catch:{ IOException -> 0x006a }
        L_0x006a:
            throw r5
        L_0x006b:
            if (r0 == 0) goto L_0x0074
        L_0x006d:
            r0.close()     // Catch:{ IOException -> 0x0074 }
            goto L_0x0074
        L_0x0071:
            if (r0 == 0) goto L_0x0074
            goto L_0x006d
        L_0x0074:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.download.j.a(com.ss.android.download.j$a, java.net.HttpURLConnection):void");
    }

    private static long a(URLConnection uRLConnection, String str, long j) {
        try {
            return Long.parseLong(uRLConnection.getHeaderField(str));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private int a(a aVar, byte[] bArr, InputStream inputStream) throws q {
        try {
            return inputStream.read(bArr);
        } catch (IOException e2) {
            if ("unexpected end of stream".equals(e2.getMessage())) {
                return -1;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_bytes", Long.valueOf(aVar.g));
            h.a(this.f28583a).a(this.f28584b.c(), contentValues, (String) null, (String[]) null);
            if (b(aVar)) {
                throw new q(489, "Failed reading response: " + e2 + "; unable to resume", e2);
            }
            throw new q(495, "Failed reading response: " + e2, e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0127, code lost:
        throw new com.ss.android.download.q(490, "download canceled");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.ss.android.download.j.a r19, java.io.InputStream r20, java.io.OutputStream r21) throws com.ss.android.download.q {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]
            r3 = r20
        L_0x000a:
            int r4 = r1.a((com.ss.android.download.j.a) r0, (byte[]) r2, (java.io.InputStream) r3)
            r5 = -1
            r6 = 1
            r7 = 0
            if (r4 != r5) goto L_0x0072
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.String r3 = "current_bytes"
            long r4 = r0.g
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.put(r3, r4)
            long r3 = r0.p
            r8 = -1
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x0036
            java.lang.String r3 = "total_bytes"
            long r4 = r0.g
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.put(r3, r4)
        L_0x0036:
            android.content.Context r3 = r1.f28583a
            com.ss.android.download.h r3 = com.ss.android.download.h.a((android.content.Context) r3)
            com.ss.android.download.d r4 = r1.f28584b
            android.net.Uri r4 = r4.c()
            r3.a((android.net.Uri) r4, (android.content.ContentValues) r2, (java.lang.String) r7, (java.lang.String[]) r7)
            long r2 = r0.p
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0054
            long r2 = r0.g
            long r4 = r0.p
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r6 = 0
        L_0x0055:
            if (r6 == 0) goto L_0x0071
            boolean r0 = r18.b(r19)
            if (r0 == 0) goto L_0x0067
            com.ss.android.download.q r0 = new com.ss.android.download.q
            r2 = 489(0x1e9, float:6.85E-43)
            java.lang.String r3 = "mismatched content length; unable to resume"
            r0.<init>((int) r2, (java.lang.String) r3)
            throw r0
        L_0x0067:
            com.ss.android.download.q r0 = new com.ss.android.download.q
            r2 = 495(0x1ef, float:6.94E-43)
            java.lang.String r3 = "closed socket before end of file"
            r0.<init>((int) r2, (java.lang.String) r3)
            throw r0
        L_0x0071:
            return
        L_0x0072:
            r0.f28592d = r6
            r5 = r21
            r1.a((com.ss.android.download.j.a) r0, (byte[]) r2, (int) r4, (java.io.OutputStream) r5)
            long r8 = r0.g
            long r10 = (long) r4
            long r8 = r8 + r10
            r0.g = r8
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r10 = r0.n
            long r10 = r8 - r10
            r12 = 500(0x1f4, double:2.47E-321)
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c5
            long r12 = r0.g
            long r14 = r0.o
            long r12 = r12 - r14
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r14
            long r12 = r12 / r10
            long r10 = r0.m
            r14 = 0
            int r4 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x00a2
            r0.m = r12
            goto L_0x00ae
        L_0x00a2:
            long r10 = r0.m
            r16 = 3
            long r10 = r10 * r16
            long r10 = r10 + r12
            r12 = 4
            long r10 = r10 / r12
            r0.m = r10
        L_0x00ae:
            long r10 = r0.n
            int r4 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x00bf
            com.ss.android.download.f r4 = r1.f28587e
            com.ss.android.download.d r10 = r1.f28584b
            long r10 = r10.f28523a
            long r12 = r0.m
            r4.a((long) r10, (long) r12)
        L_0x00bf:
            r0.n = r8
            long r10 = r0.g
            r0.o = r10
        L_0x00c5:
            long r10 = r0.g
            long r12 = r0.j
            long r10 = r10 - r12
            r12 = 4096(0x1000, double:2.0237E-320)
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ff
            long r10 = r0.k
            long r10 = r8 - r10
            r12 = 1500(0x5dc, double:7.41E-321)
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ff
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.String r10 = "current_bytes"
            long r11 = r0.g
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r4.put(r10, r11)
            android.content.Context r10 = r1.f28583a
            com.ss.android.download.h r10 = com.ss.android.download.h.a((android.content.Context) r10)
            com.ss.android.download.d r11 = r1.f28584b
            android.net.Uri r11 = r11.c()
            r10.a((android.net.Uri) r11, (android.content.ContentValues) r4, (java.lang.String) r7, (java.lang.String[]) r7)
            long r10 = r0.g
            r0.j = r10
            r0.k = r8
        L_0x00ff:
            com.ss.android.download.d r4 = r1.f28584b
            monitor-enter(r4)
            com.ss.android.download.d r7 = r1.f28584b     // Catch:{ all -> 0x0132 }
            int r7 = r7.i     // Catch:{ all -> 0x0132 }
            if (r7 == r6) goto L_0x0128
            com.ss.android.download.d r6 = r1.f28584b     // Catch:{ all -> 0x0132 }
            int r6 = r6.j     // Catch:{ all -> 0x0132 }
            r7 = 490(0x1ea, float:6.87E-43)
            if (r6 == r7) goto L_0x0120
            com.ss.android.download.d r6 = r1.f28584b     // Catch:{ all -> 0x0132 }
            boolean r6 = r6.w     // Catch:{ all -> 0x0132 }
            if (r6 != 0) goto L_0x0120
            monitor-exit(r4)     // Catch:{ all -> 0x0132 }
            boolean r4 = r1.f28588f
            if (r4 == 0) goto L_0x000a
            r18.a()
            goto L_0x000a
        L_0x0120:
            com.ss.android.download.q r0 = new com.ss.android.download.q     // Catch:{ all -> 0x0132 }
            java.lang.String r2 = "download canceled"
            r0.<init>((int) r7, (java.lang.String) r2)     // Catch:{ all -> 0x0132 }
            throw r0     // Catch:{ all -> 0x0132 }
        L_0x0128:
            com.ss.android.download.q r0 = new com.ss.android.download.q     // Catch:{ all -> 0x0132 }
            r2 = 193(0xc1, float:2.7E-43)
            java.lang.String r3 = "download paused by owner"
            r0.<init>((int) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0132 }
            throw r0     // Catch:{ all -> 0x0132 }
        L_0x0132:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0132 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.download.j.a(com.ss.android.download.j$a, java.io.InputStream, java.io.OutputStream):void");
    }

    private void b(a aVar, int i, String str, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(i));
        contentValues.put("_data", aVar.f28589a);
        contentValues.put("mimetype", aVar.f28590b);
        contentValues.put("lastmod", Long.valueOf(this.f28585c.a()));
        contentValues.put("numfailed", Integer.valueOf(i2));
        contentValues.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, Integer.valueOf(aVar.f28591c));
        if (!TextUtils.equals(this.f28584b.f28524b, aVar.f28593e)) {
            contentValues.put("uri", aVar.f28593e);
        }
        if (!TextUtils.isEmpty(str)) {
            contentValues.put("errorMsg", str);
        }
        h.a(this.f28583a).a(this.f28584b.c(), contentValues, (String) null, (String[]) null);
    }

    private void a(a aVar, int i, String str, int i2) {
        b(aVar, i, str, i2);
        if (c.a.c(i)) {
            this.f28584b.a();
        }
    }

    public j(Context context, s sVar, d dVar, r rVar, f fVar) {
        this.f28583a = context;
        this.f28585c = sVar;
        this.f28584b = dVar;
        this.f28586d = rVar;
        this.f28587e = fVar;
    }
}
