package com.ss.android.downloadlib.core.download;

import android.annotation.TargetApi;
import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.download.api.a.a;
import com.ss.android.downloadlib.c.k;
import com.ss.android.downloadlib.core.download.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;

public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f29016a;

    /* renamed from: b  reason: collision with root package name */
    private final c f29017b;

    /* renamed from: c  reason: collision with root package name */
    private final q f29018c;

    /* renamed from: d  reason: collision with root package name */
    private final p f29019d;

    /* renamed from: e  reason: collision with root package name */
    private final e f29020e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f29021f;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f29022a;

        /* renamed from: b  reason: collision with root package name */
        public String f29023b;

        /* renamed from: c  reason: collision with root package name */
        public int f29024c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f29025d;

        /* renamed from: e  reason: collision with root package name */
        public String f29026e;

        /* renamed from: f  reason: collision with root package name */
        public long f29027f = -1;
        public long g;
        public String h;
        public boolean i;
        public long j;
        public long k;
        public int l = -1;
        public long m;
        public long n;
        public long o;
        public long p;
        public long q = -1;
        public String r;
        public String s;
        public int t;
        public URL u;

        public a(c cVar) {
            this.f29023b = cVar.f28947f;
            this.f29026e = cVar.f28943b;
            this.f29022a = cVar.f28946e;
            this.f29027f = cVar.s;
            this.g = cVar.t;
            this.m = cVar.D;
        }
    }

    private void a(a aVar, byte[] bArr, int i, OutputStream outputStream) throws o {
        p pVar = this.f29019d;
        int i2 = this.f29017b.g;
        String str = aVar.f29022a;
        long j = (long) i;
        if (pVar.a(j) >= 1048576) {
            pVar.a(i2, str, j);
        }
        boolean z = false;
        while (true) {
            try {
                outputStream.write(bArr, 0, i);
                return;
            } catch (IOException e2) {
                if (!z) {
                    this.f29019d.a(this.f29017b.g, aVar.f29022a, j);
                    z = true;
                } else {
                    throw new o(492, "Failed to write data: " + e2);
                }
            }
        }
    }

    private void a() throws o {
        this.f29021f = false;
        c.a a2 = this.f29017b.a();
        if (a2 != c.a.OK) {
            int i = 196;
            if (a2 == c.a.UNUSABLE_DUE_TO_SIZE) {
                this.f29017b.a(true);
            } else if (a2 == c.a.RECOMMENDED_UNUSABLE_DUE_TO_SIZE) {
                this.f29017b.a(false);
            } else if (a2 == c.a.NO_CONNECTION) {
                this.f29017b.c();
            } else {
                i = 195;
            }
            throw new o(i, a2.name());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r12 != null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        if (r12 != null) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01a0 A[Catch:{ all -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0136 A[SYNTHETIC, Splitter:B:77:0x0136] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0174 A[Catch:{ all -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x017c A[SYNTHETIC, Splitter:B:98:0x017c] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:93:0x0161=Splitter:B:93:0x0161, B:107:0x018d=Splitter:B:107:0x018d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            r2 = 0
            android.content.Context r0 = r1.f29016a     // Catch:{ all -> 0x01ae }
            com.ss.android.downloadlib.core.download.g r0 = com.ss.android.downloadlib.core.download.g.a((android.content.Context) r0)     // Catch:{ all -> 0x01ae }
            com.ss.android.downloadlib.core.download.c r4 = r1.f29017b     // Catch:{ all -> 0x01ae }
            long r4 = r4.f28942a     // Catch:{ all -> 0x01ae }
            int r0 = com.ss.android.downloadlib.core.download.c.a((com.ss.android.downloadlib.core.download.g) r0, (long) r4)     // Catch:{ all -> 0x01ae }
            r4 = 200(0xc8, float:2.8E-43)
            if (r0 == r4) goto L_0x01a4
            com.ss.android.downloadlib.core.download.i$a r5 = new com.ss.android.downloadlib.core.download.i$a     // Catch:{ all -> 0x01ae }
            com.ss.android.downloadlib.core.download.c r0 = r1.f29017b     // Catch:{ all -> 0x01ae }
            r5.<init>(r0)     // Catch:{ all -> 0x01ae }
            com.ss.android.downloadlib.core.download.c r0 = r1.f29017b     // Catch:{ all -> 0x01ae }
            int r6 = r0.k     // Catch:{ all -> 0x01ae }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ae }
            android.content.Context r0 = r1.f29016a     // Catch:{ all -> 0x01ae }
            java.lang.String r9 = "power"
            java.lang.Object r0 = r0.getSystemService(r9)     // Catch:{ all -> 0x01ae }
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch:{ all -> 0x01ae }
            r9 = 0
            r10 = 1
            r11 = 491(0x1eb, float:6.88E-43)
            java.lang.String r12 = "SsDownloadManager"
            android.os.PowerManager$WakeLock r12 = r0.newWakeLock(r10, r12)     // Catch:{ o -> 0x00c0, Throwable -> 0x0088, all -> 0x0083 }
            r12.acquire()     // Catch:{ o -> 0x0081, Throwable -> 0x007f }
            com.ss.android.downloadlib.core.download.q r0 = r1.f29018c     // Catch:{ o -> 0x0081, Throwable -> 0x007f }
            android.net.NetworkInfo r0 = r0.b()     // Catch:{ o -> 0x0081, Throwable -> 0x007f }
            if (r0 == 0) goto L_0x004f
            int r0 = r0.getType()     // Catch:{ o -> 0x0081, Throwable -> 0x007f }
            r5.l = r0     // Catch:{ o -> 0x0081, Throwable -> 0x007f }
        L_0x004f:
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x0076 }
            java.lang.String r13 = r5.f29026e     // Catch:{ Exception -> 0x0076 }
            r0.<init>(r13)     // Catch:{ Exception -> 0x0076 }
            r5.u = r0     // Catch:{ Exception -> 0x0076 }
            r1.a(r5)     // Catch:{ o -> 0x0081, Throwable -> 0x007f }
            b(r5)     // Catch:{ o -> 0x0081, Throwable -> 0x007f }
            long r10 = r5.m     // Catch:{ all -> 0x01ae }
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ae }
            r0 = 0
            long r13 = r13 - r7
            long r10 = r10 + r13
            r5.m = r10     // Catch:{ all -> 0x01ae }
            a((com.ss.android.downloadlib.core.download.i.a) r5, (int) r4)     // Catch:{ all -> 0x01ae }
            r1.a((com.ss.android.downloadlib.core.download.i.a) r5, (int) r4, (java.lang.String) r9, (int) r6)     // Catch:{ all -> 0x01ae }
            if (r12 == 0) goto L_0x0176
        L_0x0071:
            r12.release()     // Catch:{ all -> 0x01ae }
            goto L_0x0176
        L_0x0076:
            r0 = move-exception
            com.ss.android.downloadlib.core.download.o r13 = new com.ss.android.downloadlib.core.download.o     // Catch:{ o -> 0x0081, Throwable -> 0x007f }
            r14 = 400(0x190, float:5.6E-43)
            r13.<init>((int) r14, (java.lang.Throwable) r0)     // Catch:{ o -> 0x0081, Throwable -> 0x007f }
            throw r13     // Catch:{ o -> 0x0081, Throwable -> 0x007f }
        L_0x007f:
            r0 = move-exception
            goto L_0x008a
        L_0x0081:
            r0 = move-exception
            goto L_0x00c2
        L_0x0083:
            r0 = move-exception
            r12 = r9
            r13 = r12
            goto L_0x018d
        L_0x0088:
            r0 = move-exception
            r12 = r9
        L_0x008a:
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x00bc }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Exception for id "
            r0.<init>(r9)     // Catch:{ all -> 0x00b8 }
            com.ss.android.downloadlib.core.download.c r9 = r1.f29017b     // Catch:{ all -> 0x00b8 }
            long r9 = r9.f28942a     // Catch:{ all -> 0x00b8 }
            r0.append(r9)     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = ": "
            r0.append(r9)     // Catch:{ all -> 0x00b8 }
            r0.append(r4)     // Catch:{ all -> 0x00b8 }
            long r9 = r5.m     // Catch:{ all -> 0x01ae }
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ae }
            r0 = 0
            long r13 = r13 - r7
            long r9 = r9 + r13
            r5.m = r9     // Catch:{ all -> 0x01ae }
            a((com.ss.android.downloadlib.core.download.i.a) r5, (int) r11)     // Catch:{ all -> 0x01ae }
            r1.a((com.ss.android.downloadlib.core.download.i.a) r5, (int) r11, (java.lang.String) r4, (int) r6)     // Catch:{ all -> 0x01ae }
            if (r12 == 0) goto L_0x0176
            goto L_0x0071
        L_0x00b8:
            r0 = move-exception
            r13 = r4
            goto L_0x018d
        L_0x00bc:
            r0 = move-exception
            r13 = r9
            goto L_0x018d
        L_0x00c0:
            r0 = move-exception
            r12 = r9
        L_0x00c2:
            java.lang.String r13 = r0.getMessage()     // Catch:{ all -> 0x0189 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r14 = "Aborting request for download "
            r9.<init>(r14)     // Catch:{ all -> 0x0187 }
            com.ss.android.downloadlib.core.download.c r14 = r1.f29017b     // Catch:{ all -> 0x0187 }
            long r14 = r14.f28942a     // Catch:{ all -> 0x0187 }
            r9.append(r14)     // Catch:{ all -> 0x0187 }
            java.lang.String r14 = ": "
            r9.append(r14)     // Catch:{ all -> 0x0187 }
            r9.append(r13)     // Catch:{ all -> 0x0187 }
            int r9 = r0.getFinalStatus()     // Catch:{ all -> 0x0187 }
            r14 = 194(0xc2, float:2.72E-43)
            if (r9 == r14) goto L_0x017c
            r0 = 499(0x1f3, float:6.99E-43)
            if (r9 != r0) goto L_0x0125
            java.lang.String r0 = r5.f29026e     // Catch:{ all -> 0x0184 }
            boolean r15 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0184 }
            if (r15 != 0) goto L_0x0125
            java.lang.String r15 = "https"
            boolean r15 = r0.startsWith(r15)     // Catch:{ all -> 0x0184 }
            if (r15 == 0) goto L_0x0125
            com.ss.android.downloadlib.core.download.c r15 = r1.f29017b     // Catch:{ all -> 0x0184 }
            long r10 = r5.m     // Catch:{ all -> 0x0184 }
            r15.a((int) r9, (long) r10)     // Catch:{ all -> 0x0184 }
            java.lang.String r10 = "https"
            java.lang.String r11 = "http"
            java.lang.String r0 = r0.replaceFirst(r10, r11)     // Catch:{ MalformedURLException -> 0x0125, o -> 0x011e, Throwable -> 0x011b }
            r5.f29026e = r0     // Catch:{ MalformedURLException -> 0x0125, o -> 0x011e, Throwable -> 0x011b }
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0125, o -> 0x011e, Throwable -> 0x011b }
            java.lang.String r10 = r5.f29026e     // Catch:{ MalformedURLException -> 0x0125, o -> 0x011e, Throwable -> 0x011b }
            r0.<init>(r10)     // Catch:{ MalformedURLException -> 0x0125, o -> 0x011e, Throwable -> 0x011b }
            r5.u = r0     // Catch:{ MalformedURLException -> 0x0125, o -> 0x011e, Throwable -> 0x011b }
            r1.a(r5)     // Catch:{ MalformedURLException -> 0x0125, o -> 0x011e, Throwable -> 0x011b }
            b(r5)     // Catch:{ MalformedURLException -> 0x0125, o -> 0x011e, Throwable -> 0x011b }
            r11 = 200(0xc8, float:2.8E-43)
            goto L_0x0126
        L_0x011b:
            r11 = 491(0x1eb, float:6.88E-43)
            goto L_0x0126
        L_0x011e:
            r0 = move-exception
            int r4 = r0.getFinalStatus()     // Catch:{ all -> 0x0184 }
            r11 = r4
            goto L_0x0126
        L_0x0125:
            r11 = r9
        L_0x0126:
            r0 = 495(0x1ef, float:6.94E-43)
            if (r11 == r0) goto L_0x0133
            r0 = 503(0x1f7, float:7.05E-43)
            if (r11 == r0) goto L_0x0133
            switch(r11) {
                case 499: goto L_0x0133;
                case 500: goto L_0x0133;
                default: goto L_0x0131;
            }
        L_0x0131:
            r10 = 0
            goto L_0x0134
        L_0x0133:
            r10 = 1
        L_0x0134:
            if (r10 == 0) goto L_0x0161
            boolean r0 = r5.f29025d     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x013c
            r6 = 1
            goto L_0x013e
        L_0x013c:
            int r6 = r6 + 1
        L_0x013e:
            r0 = 5
            if (r6 >= r0) goto L_0x0161
            com.ss.android.downloadlib.core.download.q r0 = r1.f29018c     // Catch:{ all -> 0x015f }
            android.net.NetworkInfo r0 = r0.b()     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x015a
            int r4 = r0.getType()     // Catch:{ all -> 0x015f }
            int r9 = r5.l     // Catch:{ all -> 0x015f }
            if (r4 != r9) goto L_0x015a
            boolean r0 = r0.isConnected()     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x015a
            r11 = 194(0xc2, float:2.72E-43)
            goto L_0x0161
        L_0x015a:
            r14 = 195(0xc3, float:2.73E-43)
            r11 = 195(0xc3, float:2.73E-43)
            goto L_0x0161
        L_0x015f:
            r0 = move-exception
            goto L_0x018d
        L_0x0161:
            long r9 = r5.m     // Catch:{ all -> 0x01ae }
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ae }
            r0 = 0
            long r14 = r14 - r7
            long r9 = r9 + r14
            r5.m = r9     // Catch:{ all -> 0x01ae }
            a((com.ss.android.downloadlib.core.download.i.a) r5, (int) r11)     // Catch:{ all -> 0x01ae }
            r1.a((com.ss.android.downloadlib.core.download.i.a) r5, (int) r11, (java.lang.String) r13, (int) r6)     // Catch:{ all -> 0x01ae }
            if (r12 == 0) goto L_0x0176
            goto L_0x0071
        L_0x0176:
            com.ss.android.downloadlib.core.download.p r0 = r1.f29019d     // Catch:{ all -> 0x01ae }
            r0.a()     // Catch:{ all -> 0x01ae }
            goto L_0x01a4
        L_0x017c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0184 }
            java.lang.String r4 = "Execution should always throw final error codes"
            r0.<init>(r4)     // Catch:{ all -> 0x0184 }
            throw r0     // Catch:{ all -> 0x0184 }
        L_0x0184:
            r0 = move-exception
            r11 = r9
            goto L_0x018d
        L_0x0187:
            r0 = move-exception
            goto L_0x018b
        L_0x0189:
            r0 = move-exception
            r13 = r9
        L_0x018b:
            r11 = 491(0x1eb, float:6.88E-43)
        L_0x018d:
            long r9 = r5.m     // Catch:{ all -> 0x01ae }
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ae }
            r4 = 0
            long r14 = r14 - r7
            long r9 = r9 + r14
            r5.m = r9     // Catch:{ all -> 0x01ae }
            a((com.ss.android.downloadlib.core.download.i.a) r5, (int) r11)     // Catch:{ all -> 0x01ae }
            r1.a((com.ss.android.downloadlib.core.download.i.a) r5, (int) r11, (java.lang.String) r13, (int) r6)     // Catch:{ all -> 0x01ae }
            if (r12 == 0) goto L_0x01a3
            r12.release()     // Catch:{ all -> 0x01ae }
        L_0x01a3:
            throw r0     // Catch:{ all -> 0x01ae }
        L_0x01a4:
            com.ss.android.downloadlib.core.download.e r0 = r1.f29020e
            com.ss.android.downloadlib.core.download.c r4 = r1.f29017b
            long r4 = r4.f28942a
            r0.a((long) r4, (long) r2)
            return
        L_0x01ae:
            r0 = move-exception
            com.ss.android.downloadlib.core.download.e r4 = r1.f29020e
            com.ss.android.downloadlib.core.download.c r5 = r1.f29017b
            long r5 = r5.f28942a
            r4.a((long) r5, (long) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.i.run():void");
    }

    private static void b(a aVar) {
        if (aVar.f29022a != null) {
            k.a(aVar.f29022a, 420);
        }
    }

    private boolean c(a aVar) {
        if (aVar.g <= 0 || this.f29017b.f28944c || aVar.h != null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x023d A[Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x03dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.ss.android.downloadlib.core.download.i.a r22) throws com.ss.android.downloadlib.core.download.o {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r3 = -1
            r2.q = r3
            r5 = 0
            r2.r = r5
            r2.s = r5
            r6 = 0
            r2.t = r6
            java.lang.String r7 = r2.f29022a
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r8 = 492(0x1ec, float:6.9E-43)
            r9 = 0
            r11 = 489(0x1e9, float:6.85E-43)
            r12 = 1
            if (r7 != 0) goto L_0x0083
            java.lang.String r7 = r2.f29022a
            com.ss.android.downloadlib.core.download.p r13 = r1.f29019d
            java.io.File r13 = r13.f29041b
            boolean r7 = com.ss.android.downloadlib.core.download.k.a((java.lang.String) r7, (java.io.File) r13)
            if (r7 == 0) goto L_0x007b
            java.io.File r7 = new java.io.File
            java.lang.String r13 = r2.f29022a
            r7.<init>(r13)
            boolean r13 = r7.exists()
            if (r13 == 0) goto L_0x0083
            long r13 = r7.length()
            int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r15 != 0) goto L_0x0048
            r7.delete()
            r2.f29022a = r5
            boolean r7 = com.ss.android.downloadlib.core.download.b.f28940c
            goto L_0x0083
        L_0x0048:
            com.ss.android.downloadlib.core.download.c r15 = r1.f29017b
            java.lang.String r15 = r15.u
            if (r15 != 0) goto L_0x0060
            com.ss.android.downloadlib.core.download.c r15 = r1.f29017b
            boolean r15 = r15.f28944c
            if (r15 == 0) goto L_0x0055
            goto L_0x0060
        L_0x0055:
            r7.delete()
            com.ss.android.downloadlib.core.download.o r2 = new com.ss.android.downloadlib.core.download.o
            java.lang.String r3 = "Trying to resume a download that can't be resumed"
            r2.<init>((int) r11, (java.lang.String) r3)
            throw r2
        L_0x0060:
            int r7 = (int) r13
            long r13 = (long) r7
            r2.g = r13
            com.ss.android.downloadlib.core.download.c r7 = r1.f29017b
            long r13 = r7.s
            int r7 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0072
            com.ss.android.downloadlib.core.download.c r7 = r1.f29017b
            long r13 = r7.s
            r2.q = r13
        L_0x0072:
            com.ss.android.downloadlib.core.download.c r7 = r1.f29017b
            java.lang.String r7 = r7.u
            r2.h = r7
            r2.i = r12
            goto L_0x0083
        L_0x007b:
            com.ss.android.downloadlib.core.download.o r2 = new com.ss.android.downloadlib.core.download.o
            java.lang.String r3 = "found invalid internal destination filename"
            r2.<init>((int) r8, (java.lang.String) r3)
            throw r2
        L_0x0083:
            long r13 = r2.g
            long r8 = r2.f29027f
            int r7 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x008c
            return
        L_0x008c:
            int r7 = r2.t
            int r8 = r7 + 1
            r2.t = r8
            r8 = 5
            if (r7 >= r8) goto L_0x03e1
            r21.a()     // Catch:{ SSLHandshakeException -> 0x03cd, IOException -> 0x03c2, all -> 0x03bd }
            java.net.URL r7 = r2.u     // Catch:{ SSLHandshakeException -> 0x03cd, IOException -> 0x03c2, all -> 0x03bd }
            java.net.URLConnection r7 = r7.openConnection()     // Catch:{ SSLHandshakeException -> 0x03cd, IOException -> 0x03c2, all -> 0x03bd }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ SSLHandshakeException -> 0x03cd, IOException -> 0x03c2, all -> 0x03bd }
            r7.setInstanceFollowRedirects(r6)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r8 = 20000(0x4e20, float:2.8026E-41)
            r7.setConnectTimeout(r8)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r7.setReadTimeout(r8)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r1.b(r2, r7)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            int r8 = r7.getResponseCode()     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 == r9) goto L_0x015e
            r9 = 206(0xce, float:2.89E-43)
            if (r8 == r9) goto L_0x0149
            r9 = 307(0x133, float:4.3E-43)
            if (r8 == r9) goto L_0x012b
            r9 = 416(0x1a0, float:5.83E-43)
            if (r8 == r9) goto L_0x0123
            r9 = 500(0x1f4, float:7.0E-43)
            if (r8 == r9) goto L_0x0119
            r9 = 503(0x1f7, float:7.05E-43)
            if (r8 == r9) goto L_0x00da
            switch(r8) {
                case 301: goto L_0x012b;
                case 302: goto L_0x012b;
                case 303: goto L_0x012b;
                default: goto L_0x00cd;
            }     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
        L_0x00cd:
            java.lang.String r9 = r7.getResponseMessage()     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            com.ss.android.downloadlib.core.download.o.throwUnhandledHttpError(r8, r9)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            if (r7 == 0) goto L_0x008c
        L_0x00d6:
            r7.disconnect()
            goto L_0x008c
        L_0x00da:
            java.lang.String r3 = "Retry-After"
            r4 = -1
            int r3 = r7.getHeaderFieldInt(r3, r4)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r2.f29024c = r3     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            int r3 = r2.f29024c     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            if (r3 < 0) goto L_0x010d
            int r3 = r2.f29024c     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r4 = 30
            if (r3 < r4) goto L_0x00f7
            int r3 = r2.f29024c     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r4 = 86400(0x15180, float:1.21072E-40)
            if (r3 <= r4) goto L_0x00f9
            r2.f29024c = r4     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            goto L_0x00f9
        L_0x00f7:
            r2.f29024c = r4     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
        L_0x00f9:
            int r3 = r2.f29024c     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.util.Random r4 = com.ss.android.downloadlib.core.download.k.f29030a     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r5 = 31
            int r4 = r4.nextInt(r5)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            int r3 = r3 + r4
            r2.f29024c = r3     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            int r3 = r2.f29024c     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            int r3 = r3 * 1000
            r2.f29024c = r3     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            goto L_0x010f
        L_0x010d:
            r2.f29024c = r6     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
        L_0x010f:
            com.ss.android.downloadlib.core.download.o r2 = new com.ss.android.downloadlib.core.download.o     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.lang.String r3 = r7.getResponseMessage()     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r2.<init>((int) r9, (java.lang.String) r3)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            throw r2     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
        L_0x0119:
            com.ss.android.downloadlib.core.download.o r2 = new com.ss.android.downloadlib.core.download.o     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.lang.String r3 = r7.getResponseMessage()     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r2.<init>((int) r9, (java.lang.String) r3)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            throw r2     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
        L_0x0123:
            com.ss.android.downloadlib.core.download.o r2 = new com.ss.android.downloadlib.core.download.o     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.lang.String r3 = "Requested range not satisfiable"
            r2.<init>((int) r11, (java.lang.String) r3)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            throw r2     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
        L_0x012b:
            java.lang.String r9 = "Location"
            java.lang.String r9 = r7.getHeaderField(r9)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.net.URL r10 = new java.net.URL     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.net.URL r13 = r2.u     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r10.<init>(r13, r9)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r2.u = r10     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r9 = 301(0x12d, float:4.22E-43)
            if (r8 != r9) goto L_0x0146
            java.net.URL r8 = r2.u     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.lang.String r8 = r8.toString()     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r2.f29026e = r8     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
        L_0x0146:
            if (r7 == 0) goto L_0x008c
            goto L_0x00d6
        L_0x0149:
            boolean r3 = r2.i     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            if (r3 == 0) goto L_0x0156
            r1.a((com.ss.android.downloadlib.core.download.i.a) r2, (java.net.HttpURLConnection) r7)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            if (r7 == 0) goto L_0x0155
            r7.disconnect()
        L_0x0155:
            return
        L_0x0156:
            com.ss.android.downloadlib.core.download.o r2 = new com.ss.android.downloadlib.core.download.o     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.lang.String r3 = "Expected OK, but received partial"
            r2.<init>((int) r11, (java.lang.String) r3)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            throw r2     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
        L_0x015e:
            boolean r8 = r2.i     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            if (r8 != 0) goto L_0x03aa
            java.lang.String r8 = "Content-Disposition"
            java.lang.String r8 = r7.getHeaderField(r8)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r2.r = r8     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.lang.String r8 = "Content-Location"
            java.lang.String r8 = r7.getHeaderField(r8)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r2.s = r8     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.lang.String r8 = r2.f29023b     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            if (r8 != 0) goto L_0x017c
            java.lang.String r8 = r7.getContentType()     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r2.f29023b = r8     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
        L_0x017c:
            java.lang.String r8 = "ETag"
            java.lang.String r8 = r7.getHeaderField(r8)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r2.h = r8     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.lang.String r8 = "Transfer-Encoding"
            java.lang.String r8 = r7.getHeaderField(r8)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            if (r8 != 0) goto L_0x0195
            java.lang.String r9 = "Content-Length"
            long r9 = a((java.net.URLConnection) r7, (java.lang.String) r9, (long) r3)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r2.q = r9     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            goto L_0x0197
        L_0x0195:
            r2.q = r3     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
        L_0x0197:
            long r9 = r2.q     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r2.f29027f = r9     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            com.ss.android.downloadlib.core.download.c r9 = r1.f29017b     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            long r13 = r2.q     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r9.s = r13     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            long r9 = r2.q     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            int r13 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x01b2
            if (r8 == 0) goto L_0x01b1
            java.lang.String r3 = "chunked"
            boolean r3 = r8.equalsIgnoreCase(r3)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            if (r3 != 0) goto L_0x01b2
        L_0x01b1:
            r6 = 1
        L_0x01b2:
            com.ss.android.downloadlib.core.download.c r3 = r1.f29017b     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            boolean r3 = r3.f28944c     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            if (r3 != 0) goto L_0x01c3
            if (r6 != 0) goto L_0x01bb
            goto L_0x01c3
        L_0x01bb:
            com.ss.android.downloadlib.core.download.o r2 = new com.ss.android.downloadlib.core.download.o     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.lang.String r3 = "can't know size of download, giving up"
            r2.<init>((int) r11, (java.lang.String) r3)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            throw r2     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
        L_0x01c3:
            android.content.Context r3 = r1.f29016a     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            com.ss.android.downloadlib.core.download.c r4 = r1.f29017b     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.lang.String r4 = r4.f28943b     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            com.ss.android.downloadlib.core.download.c r6 = r1.f29017b     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.lang.String r6 = r6.f28945d     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.net.URL r8 = r2.u     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.lang.String r8 = r8.toString()     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.lang.String r9 = r2.r     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.lang.String r10 = r2.s     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.lang.String r11 = r2.f29023b     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            com.ss.android.downloadlib.core.download.c r13 = r1.f29017b     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            int r13 = r13.g     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            long r14 = r2.q     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            com.ss.android.downloadlib.core.download.c r12 = r1.f29017b     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            android.net.Uri r12 = r12.b()     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            com.ss.android.downloadlib.core.download.p r5 = r1.f29019d     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r16 = 0
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L_0x01ef
            r14 = r16
        L_0x01ef:
            boolean r8 = com.ss.android.downloadlib.core.download.k.b(r8)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            if (r8 == 0) goto L_0x0238
            java.lang.String r8 = ".apk"
            boolean r8 = r6.endsWith(r8)     // Catch:{ SSLHandshakeException -> 0x0230, IOException -> 0x0228, all -> 0x0223 }
            if (r8 != 0) goto L_0x0238
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SSLHandshakeException -> 0x0230, IOException -> 0x0228, all -> 0x0223 }
            r8.<init>()     // Catch:{ SSLHandshakeException -> 0x0230, IOException -> 0x0228, all -> 0x0223 }
            r8.append(r6)     // Catch:{ SSLHandshakeException -> 0x0230, IOException -> 0x0228, all -> 0x0223 }
            java.lang.String r6 = ".apk"
            r8.append(r6)     // Catch:{ SSLHandshakeException -> 0x0230, IOException -> 0x0228, all -> 0x0223 }
            java.lang.String r6 = r8.toString()     // Catch:{ SSLHandshakeException -> 0x0230, IOException -> 0x0228, all -> 0x0223 }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ SSLHandshakeException -> 0x0230, IOException -> 0x0228, all -> 0x0223 }
            r8.<init>()     // Catch:{ SSLHandshakeException -> 0x0230, IOException -> 0x0228, all -> 0x0223 }
            r19 = r7
            java.lang.String r7 = "hint"
            r8.put(r7, r6)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            com.ss.android.downloadlib.core.download.g r3 = com.ss.android.downloadlib.core.download.g.a((android.content.Context) r3)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            r7 = 0
            r3.a((android.net.Uri) r12, (android.content.ContentValues) r8, (java.lang.String) r7, (java.lang.String[]) r7)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            goto L_0x023a
        L_0x0223:
            r0 = move-exception
            r19 = r7
            goto L_0x03b3
        L_0x0228:
            r0 = move-exception
            r19 = r7
        L_0x022b:
            r2 = r0
            r5 = r19
            goto L_0x03c5
        L_0x0230:
            r0 = move-exception
            r19 = r7
        L_0x0233:
            r2 = r0
            r5 = r19
            goto L_0x03d0
        L_0x0238:
            r19 = r7
        L_0x023a:
            r3 = 1
            if (r13 != r3) goto L_0x0252
            android.net.Uri r3 = android.net.Uri.parse(r6)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            java.lang.String r3 = r3.getPath()     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            r4 = 0
            goto L_0x0324
        L_0x0248:
            r0 = move-exception
            r2 = r0
            r7 = r19
            goto L_0x03db
        L_0x024e:
            r0 = move-exception
            goto L_0x022b
        L_0x0250:
            r0 = move-exception
            goto L_0x0233
        L_0x0252:
            if (r13 != 0) goto L_0x0394
            java.io.File r3 = r5.f29040a     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            if (r3 != 0) goto L_0x025a
            r3 = 0
            goto L_0x029d
        L_0x025a:
            java.io.File r3 = new java.io.File     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            r7.<init>()     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            java.io.File r8 = r5.f29040a     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            java.lang.String r8 = r8.getPath()     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            r7.append(r8)     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            java.lang.String r8 = com.ss.android.downloadlib.core.download.b.f28938a     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            r7.append(r8)     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            java.lang.String r7 = r7.toString()     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            r3.<init>(r7)     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            boolean r7 = r3.isDirectory()     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            if (r7 != 0) goto L_0x029d
            boolean r7 = r3.mkdir()     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            if (r7 == 0) goto L_0x0283
            goto L_0x029d
        L_0x0283:
            com.ss.android.downloadlib.core.download.o r2 = new com.ss.android.downloadlib.core.download.o     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            java.lang.String r5 = "unable to create external downloads directory "
            r4.<init>(r5)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            java.lang.String r3 = r3.getPath()     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            r4.append(r3)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            java.lang.String r3 = r4.toString()     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            r4 = 492(0x1ec, float:6.9E-43)
            r2.<init>((int) r4, (java.lang.String) r3)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            throw r2     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
        L_0x029d:
            r7 = 47
            if (r6 == 0) goto L_0x02b6
            java.lang.String r8 = "/"
            boolean r8 = r6.endsWith(r8)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            if (r8 != 0) goto L_0x02b6
            int r8 = r6.lastIndexOf(r7)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            r12 = 1
            int r8 = r8 + r12
            if (r8 <= 0) goto L_0x02b7
            java.lang.String r6 = r6.substring(r8)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            goto L_0x02b7
        L_0x02b6:
            r6 = 0
        L_0x02b7:
            if (r6 != 0) goto L_0x02cd
            if (r9 == 0) goto L_0x02cd
            java.lang.String r6 = com.ss.android.downloadlib.core.download.k.a((java.lang.String) r9)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            if (r6 == 0) goto L_0x02cd
            int r8 = r6.lastIndexOf(r7)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            r9 = 1
            int r8 = r8 + r9
            if (r8 <= 0) goto L_0x02cd
            java.lang.String r6 = r6.substring(r8)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
        L_0x02cd:
            r8 = 63
            if (r6 != 0) goto L_0x02f5
            if (r10 == 0) goto L_0x02f5
            java.lang.String r9 = android.net.Uri.decode(r10)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            if (r9 == 0) goto L_0x02f5
            java.lang.String r10 = "/"
            boolean r10 = r9.endsWith(r10)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            if (r10 != 0) goto L_0x02f5
            int r10 = r9.indexOf(r8)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            if (r10 >= 0) goto L_0x02f5
            int r6 = r9.lastIndexOf(r7)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            r10 = 1
            int r6 = r6 + r10
            if (r6 <= 0) goto L_0x02f4
            java.lang.String r6 = r9.substring(r6)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            goto L_0x02f5
        L_0x02f4:
            r6 = r9
        L_0x02f5:
            if (r6 != 0) goto L_0x0317
            java.lang.String r4 = android.net.Uri.decode(r4)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            if (r4 == 0) goto L_0x0317
            java.lang.String r9 = "/"
            boolean r9 = r4.endsWith(r9)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            if (r9 != 0) goto L_0x0317
            int r8 = r4.indexOf(r8)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            if (r8 >= 0) goto L_0x0317
            int r7 = r4.lastIndexOf(r7)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            r8 = 1
            int r7 = r7 + r8
            if (r7 <= 0) goto L_0x0317
            java.lang.String r6 = r4.substring(r7)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
        L_0x0317:
            if (r6 != 0) goto L_0x031b
            java.lang.String r6 = "downloadfile"
        L_0x031b:
            java.lang.String r4 = com.ss.android.downloadlib.core.download.k.c(r6)     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            r20 = r4
            r4 = r3
            r3 = r20
        L_0x0324:
            r5.a((int) r13, (java.lang.String) r3, (long) r14)     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            java.lang.String r3 = com.ss.android.downloadlib.core.download.k.a(r3, r11, r13, r4)     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            r2.f29022a = r3     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            java.net.URL r3 = r2.u     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            java.lang.String r3 = r3.toString()     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            boolean r3 = com.ss.android.downloadlib.core.download.k.b(r3)     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            if (r3 == 0) goto L_0x033d
            java.lang.String r3 = "application/vnd.android.package-archive"
            r2.f29023b = r3     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
        L_0x033d:
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            r3.<init>()     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            java.lang.String r4 = "_data"
            java.lang.String r5 = r2.f29022a     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            r3.put(r4, r5)     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            java.lang.String r4 = r2.h     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            if (r4 == 0) goto L_0x0354
            java.lang.String r4 = "etag"
            java.lang.String r5 = r2.h     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            r3.put(r4, r5)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
        L_0x0354:
            java.lang.String r4 = r2.f29023b     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            if (r4 == 0) goto L_0x035f
            java.lang.String r4 = "mimetype"
            java.lang.String r5 = r2.f29023b     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
            r3.put(r4, r5)     // Catch:{ SSLHandshakeException -> 0x0250, IOException -> 0x024e, all -> 0x0248 }
        L_0x035f:
            java.lang.String r4 = "total_bytes"
            long r5 = r2.f29027f     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            r3.put(r4, r5)     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            android.content.Context r4 = r1.f29016a     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            com.ss.android.downloadlib.core.download.g r4 = com.ss.android.downloadlib.core.download.g.a((android.content.Context) r4)     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            com.ss.android.downloadlib.core.download.c r5 = r1.f29017b     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            android.net.Uri r5 = r5.b()     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            r6 = 0
            r4.a((android.net.Uri) r5, (android.content.ContentValues) r3, (java.lang.String) r6, (java.lang.String[]) r6)     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            r21.a()     // Catch:{ SSLHandshakeException -> 0x0390, IOException -> 0x038c, all -> 0x0388 }
            r7 = r19
            r1.a((com.ss.android.downloadlib.core.download.i.a) r2, (java.net.HttpURLConnection) r7)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            if (r7 == 0) goto L_0x0387
            r7.disconnect()
        L_0x0387:
            return
        L_0x0388:
            r0 = move-exception
            r7 = r19
            goto L_0x03b3
        L_0x038c:
            r0 = move-exception
            r7 = r19
            goto L_0x03b6
        L_0x0390:
            r0 = move-exception
            r7 = r19
            goto L_0x03ba
        L_0x0394:
            r7 = r19
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.lang.String r4 = "unexpected value for destination: "
            r3.<init>(r4)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r3.append(r13)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.lang.String r3 = r3.toString()     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            r2.<init>(r3)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            throw r2     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
        L_0x03aa:
            com.ss.android.downloadlib.core.download.o r2 = new com.ss.android.downloadlib.core.download.o     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            java.lang.String r3 = "Expected partial, but received OK"
            r2.<init>((int) r11, (java.lang.String) r3)     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
            throw r2     // Catch:{ SSLHandshakeException -> 0x03b9, IOException -> 0x03b5, all -> 0x03b2 }
        L_0x03b2:
            r0 = move-exception
        L_0x03b3:
            r2 = r0
            goto L_0x03db
        L_0x03b5:
            r0 = move-exception
        L_0x03b6:
            r2 = r0
            r5 = r7
            goto L_0x03c5
        L_0x03b9:
            r0 = move-exception
        L_0x03ba:
            r2 = r0
            r5 = r7
            goto L_0x03d0
        L_0x03bd:
            r0 = move-exception
            r6 = r5
            r2 = r0
            r7 = r6
            goto L_0x03db
        L_0x03c2:
            r0 = move-exception
            r6 = r5
            r2 = r0
        L_0x03c5:
            com.ss.android.downloadlib.core.download.o r3 = new com.ss.android.downloadlib.core.download.o     // Catch:{ all -> 0x03d8 }
            r4 = 495(0x1ef, float:6.94E-43)
            r3.<init>((int) r4, (java.lang.Throwable) r2)     // Catch:{ all -> 0x03d8 }
            throw r3     // Catch:{ all -> 0x03d8 }
        L_0x03cd:
            r0 = move-exception
            r6 = r5
            r2 = r0
        L_0x03d0:
            com.ss.android.downloadlib.core.download.o r3 = new com.ss.android.downloadlib.core.download.o     // Catch:{ all -> 0x03d8 }
            r4 = 499(0x1f3, float:6.99E-43)
            r3.<init>((int) r4, (java.lang.Throwable) r2)     // Catch:{ all -> 0x03d8 }
            throw r3     // Catch:{ all -> 0x03d8 }
        L_0x03d8:
            r0 = move-exception
            r2 = r0
            r7 = r5
        L_0x03db:
            if (r7 == 0) goto L_0x03e0
            r7.disconnect()
        L_0x03e0:
            throw r2
        L_0x03e1:
            com.ss.android.downloadlib.core.download.o r2 = new com.ss.android.downloadlib.core.download.o
            r3 = 497(0x1f1, float:6.96E-43)
            java.lang.String r4 = "Too many redirects"
            r2.<init>((int) r3, (java.lang.String) r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.i.a(com.ss.android.downloadlib.core.download.i$a):void");
    }

    private static void a(a aVar, int i) {
        if (aVar.f29022a != null && a.C0337a.b(i)) {
            new File(aVar.f29022a).delete();
            aVar.f29022a = null;
        }
    }

    @TargetApi(5)
    private void b(a aVar, HttpURLConnection httpURLConnection) {
        for (T t : Collections.unmodifiableList(this.f29017b.F)) {
            httpURLConnection.addRequestProperty((String) t.first, (String) t.second);
        }
        if (httpURLConnection.getRequestProperty("User-Agent") == null) {
            String str = this.f29017b.q;
            if (str == null) {
                str = b.f28939b;
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
    private void a(com.ss.android.downloadlib.core.download.i.a r5, java.net.HttpURLConnection r6) throws com.ss.android.downloadlib.core.download.o {
        /*
            r4 = this;
            r0 = 0
            java.io.InputStream r6 = r6.getInputStream()     // Catch:{ IOException -> 0x0047 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            java.lang.String r2 = r5.f29022a     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            r3 = 1
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            r2 = r1
            java.io.FileOutputStream r2 = (java.io.FileOutputStream) r2     // Catch:{ IOException -> 0x0030 }
            java.io.FileDescriptor r2 = r2.getFD()     // Catch:{ IOException -> 0x0030 }
            r4.a((com.ss.android.downloadlib.core.download.i.a) r5, (java.io.InputStream) r6, (java.io.OutputStream) r1)     // Catch:{ all -> 0x002e }
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
            com.ss.android.downloadlib.core.download.o r2 = new com.ss.android.downloadlib.core.download.o     // Catch:{ all -> 0x003f }
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
            com.ss.android.downloadlib.core.download.o r6 = new com.ss.android.downloadlib.core.download.o     // Catch:{ all -> 0x0043 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.i.a(com.ss.android.downloadlib.core.download.i$a, java.net.HttpURLConnection):void");
    }

    private static long a(URLConnection uRLConnection, String str, long j) {
        try {
            return Long.parseLong(uRLConnection.getHeaderField(str));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private int a(a aVar, byte[] bArr, InputStream inputStream) throws o {
        try {
            return inputStream.read(bArr);
        } catch (IOException e2) {
            if ("unexpected end of stream".equals(e2.getMessage())) {
                return -1;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_bytes", Long.valueOf(aVar.g));
            g.a(this.f29016a).a(this.f29017b.b(), contentValues, (String) null, (String[]) null);
            if (c(aVar)) {
                throw new o(489, "Failed reading response: " + e2 + "; unable to resume", e2);
            }
            throw new o(495, "Failed reading response: " + e2, e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0127, code lost:
        throw new com.ss.android.downloadlib.core.download.o(490, "download canceled");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.ss.android.downloadlib.core.download.i.a r19, java.io.InputStream r20, java.io.OutputStream r21) throws com.ss.android.downloadlib.core.download.o {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]
            r3 = r20
        L_0x000a:
            int r4 = r1.a((com.ss.android.downloadlib.core.download.i.a) r0, (byte[]) r2, (java.io.InputStream) r3)
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
            long r3 = r0.q
            r8 = -1
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x0036
            java.lang.String r3 = "total_bytes"
            long r4 = r0.g
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.put(r3, r4)
        L_0x0036:
            android.content.Context r3 = r1.f29016a
            com.ss.android.downloadlib.core.download.g r3 = com.ss.android.downloadlib.core.download.g.a((android.content.Context) r3)
            com.ss.android.downloadlib.core.download.c r4 = r1.f29017b
            android.net.Uri r4 = r4.b()
            r3.a((android.net.Uri) r4, (android.content.ContentValues) r2, (java.lang.String) r7, (java.lang.String[]) r7)
            long r2 = r0.q
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0054
            long r2 = r0.g
            long r4 = r0.q
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r6 = 0
        L_0x0055:
            if (r6 == 0) goto L_0x0071
            boolean r0 = r18.c(r19)
            if (r0 == 0) goto L_0x0067
            com.ss.android.downloadlib.core.download.o r0 = new com.ss.android.downloadlib.core.download.o
            r2 = 489(0x1e9, float:6.85E-43)
            java.lang.String r3 = "mismatched content length; unable to resume"
            r0.<init>((int) r2, (java.lang.String) r3)
            throw r0
        L_0x0067:
            com.ss.android.downloadlib.core.download.o r0 = new com.ss.android.downloadlib.core.download.o
            r2 = 495(0x1ef, float:6.94E-43)
            java.lang.String r3 = "closed socket before end of file"
            r0.<init>((int) r2, (java.lang.String) r3)
            throw r0
        L_0x0071:
            return
        L_0x0072:
            r0.f29025d = r6
            r5 = r21
            r1.a((com.ss.android.downloadlib.core.download.i.a) r0, (byte[]) r2, (int) r4, (java.io.OutputStream) r5)
            long r8 = r0.g
            long r10 = (long) r4
            long r8 = r8 + r10
            r0.g = r8
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r10 = r0.o
            long r10 = r8 - r10
            r12 = 500(0x1f4, double:2.47E-321)
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c5
            long r12 = r0.g
            long r14 = r0.p
            long r12 = r12 - r14
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r14
            long r12 = r12 / r10
            long r10 = r0.n
            r14 = 0
            int r4 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x00a2
            r0.n = r12
            goto L_0x00ae
        L_0x00a2:
            long r10 = r0.n
            r16 = 3
            long r10 = r10 * r16
            long r10 = r10 + r12
            r12 = 4
            long r10 = r10 / r12
            r0.n = r10
        L_0x00ae:
            long r10 = r0.o
            int r4 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x00bf
            com.ss.android.downloadlib.core.download.e r4 = r1.f29020e
            com.ss.android.downloadlib.core.download.c r10 = r1.f29017b
            long r10 = r10.f28942a
            long r12 = r0.n
            r4.a((long) r10, (long) r12)
        L_0x00bf:
            r0.o = r8
            long r10 = r0.g
            r0.p = r10
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
            android.content.Context r10 = r1.f29016a
            com.ss.android.downloadlib.core.download.g r10 = com.ss.android.downloadlib.core.download.g.a((android.content.Context) r10)
            com.ss.android.downloadlib.core.download.c r11 = r1.f29017b
            android.net.Uri r11 = r11.b()
            r10.a((android.net.Uri) r11, (android.content.ContentValues) r4, (java.lang.String) r7, (java.lang.String[]) r7)
            long r10 = r0.g
            r0.j = r10
            r0.k = r8
        L_0x00ff:
            com.ss.android.downloadlib.core.download.c r4 = r1.f29017b
            monitor-enter(r4)
            com.ss.android.downloadlib.core.download.c r7 = r1.f29017b     // Catch:{ all -> 0x0132 }
            int r7 = r7.i     // Catch:{ all -> 0x0132 }
            if (r7 == r6) goto L_0x0128
            com.ss.android.downloadlib.core.download.c r6 = r1.f29017b     // Catch:{ all -> 0x0132 }
            int r6 = r6.j     // Catch:{ all -> 0x0132 }
            r7 = 490(0x1ea, float:6.87E-43)
            if (r6 == r7) goto L_0x0120
            com.ss.android.downloadlib.core.download.c r6 = r1.f29017b     // Catch:{ all -> 0x0132 }
            boolean r6 = r6.w     // Catch:{ all -> 0x0132 }
            if (r6 != 0) goto L_0x0120
            monitor-exit(r4)     // Catch:{ all -> 0x0132 }
            boolean r4 = r1.f29021f
            if (r4 == 0) goto L_0x000a
            r18.a()
            goto L_0x000a
        L_0x0120:
            com.ss.android.downloadlib.core.download.o r0 = new com.ss.android.downloadlib.core.download.o     // Catch:{ all -> 0x0132 }
            java.lang.String r2 = "download canceled"
            r0.<init>((int) r7, (java.lang.String) r2)     // Catch:{ all -> 0x0132 }
            throw r0     // Catch:{ all -> 0x0132 }
        L_0x0128:
            com.ss.android.downloadlib.core.download.o r0 = new com.ss.android.downloadlib.core.download.o     // Catch:{ all -> 0x0132 }
            r2 = 193(0xc1, float:2.7E-43)
            java.lang.String r3 = "download paused by owner"
            r0.<init>((int) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0132 }
            throw r0     // Catch:{ all -> 0x0132 }
        L_0x0132:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0132 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.i.a(com.ss.android.downloadlib.core.download.i$a, java.io.InputStream, java.io.OutputStream):void");
    }

    private void b(a aVar, int i, String str, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(i));
        contentValues.put("_data", aVar.f29022a);
        contentValues.put("mimetype", aVar.f29023b);
        contentValues.put("lastmod", Long.valueOf(this.f29018c.a()));
        contentValues.put("numfailed", Integer.valueOf(i2));
        contentValues.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, Integer.valueOf(aVar.f29024c));
        contentValues.put("time_cost", Long.valueOf(aVar.m));
        if (!TextUtils.isEmpty(str)) {
            contentValues.put("errorMsg", str);
        }
        g.a(this.f29016a).a(this.f29017b.b(), contentValues, (String) null, (String[]) null);
    }

    private void a(a aVar, int i, String str, int i2) {
        b(aVar, i, str, i2);
        if (a.C0337a.c(i)) {
            this.f29017b.a(i, aVar.m);
        }
    }

    public i(Context context, q qVar, c cVar, p pVar, e eVar) {
        this.f29016a = context;
        this.f29018c = qVar;
        this.f29017b = cVar;
        this.f29019d = pVar;
        this.f29020e = eVar;
    }
}
