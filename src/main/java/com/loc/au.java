package com.loc;

import android.content.Context;
import android.text.TextUtils;

public final class au {

    /* renamed from: a  reason: collision with root package name */
    private Context f25495a;

    /* renamed from: b  reason: collision with root package name */
    private String f25496b;

    /* renamed from: c  reason: collision with root package name */
    private String f25497c;

    /* renamed from: d  reason: collision with root package name */
    private String f25498d;

    /* renamed from: e  reason: collision with root package name */
    private String f25499e;

    public au(Context context, String str, String str2, String str3) throws cx {
        if (TextUtils.isEmpty(str3) || str3.length() > 256) {
            throw new cx("无效的参数 - IllegalArgumentException");
        }
        this.f25495a = context.getApplicationContext();
        this.f25497c = str;
        this.f25498d = str2;
        this.f25496b = str3;
    }

    public final void a(String str) throws cx {
        if (TextUtils.isEmpty(str) || str.length() > 65536) {
            throw new cx("无效的参数 - IllegalArgumentException");
        }
        this.f25499e = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008d, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a1, code lost:
        com.google.a.a.a.a.a.a.b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ac, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ad, code lost:
        com.google.a.a.a.a.a.a.b(r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008a A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0009] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c A[SYNTHETIC, Splitter:B:31:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a8 A[SYNTHETIC, Splitter:B:37:0x00a8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] a() {
        /*
            r8 = this;
            r0 = 0
            byte[] r1 = new byte[r0]
            r2 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x0092 }
            r3.<init>()     // Catch:{ Throwable -> 0x0092 }
            java.lang.String r2 = r8.f25497c     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            com.loc.di.a((java.io.ByteArrayOutputStream) r3, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            java.lang.String r2 = r8.f25498d     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            com.loc.di.a((java.io.ByteArrayOutputStream) r3, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            java.lang.String r2 = r8.f25496b     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            com.loc.di.a((java.io.ByteArrayOutputStream) r3, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            android.content.Context r2 = r8.f25495a     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            int r2 = com.loc.dc.q(r2)     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            com.loc.di.a((java.io.ByteArrayOutputStream) r3, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x002e, all -> 0x008a }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            int r2 = (int) r4
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            r4 = 4
            byte[] r4 = new byte[r4]     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            int r5 = r2 >> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            r4[r0] = r5     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            int r5 = r2 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            r6 = 1
            r4[r6] = r5     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            int r5 = r2 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            r7 = 2
            r4[r7] = r5     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            r5 = 3
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            r4[r5] = r2     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            r3.write(r4)     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            java.lang.String r2 = r8.f25499e     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            if (r4 == 0) goto L_0x0060
            byte[] r0 = new byte[r7]     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            r0 = {0, 0} // fill-array     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            goto L_0x0071
        L_0x0060:
            int r2 = r2.length()     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            int r4 = r2 / 256
            byte r4 = (byte) r4     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            int r2 = r2 % 256
            byte r2 = (byte) r2     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            byte[] r5 = new byte[r7]     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            r5[r0] = r4     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            r5[r6] = r2     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            r0 = r5
        L_0x0071:
            r3.write(r0)     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            java.lang.String r0 = r8.f25499e     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            byte[] r0 = com.loc.di.a((java.lang.String) r0)     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            r3.write(r0)     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            byte[] r0 = r3.toByteArray()     // Catch:{ Throwable -> 0x008c, all -> 0x008a }
            r3.close()     // Catch:{ Throwable -> 0x0085 }
            goto L_0x00a5
        L_0x0085:
            r1 = move-exception
            com.google.a.a.a.a.a.a.b(r1)
            goto L_0x00a5
        L_0x008a:
            r0 = move-exception
            goto L_0x00a6
        L_0x008c:
            r0 = move-exception
            r2 = r3
            goto L_0x0093
        L_0x008f:
            r0 = move-exception
            r3 = r2
            goto L_0x00a6
        L_0x0092:
            r0 = move-exception
        L_0x0093:
            java.lang.String r3 = "se"
            java.lang.String r4 = "tds"
            com.loc.i.b((java.lang.Throwable) r0, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x00a4
            r2.close()     // Catch:{ Throwable -> 0x00a0 }
            goto L_0x00a4
        L_0x00a0:
            r0 = move-exception
            com.google.a.a.a.a.a.a.b(r0)
        L_0x00a4:
            r0 = r1
        L_0x00a5:
            return r0
        L_0x00a6:
            if (r3 == 0) goto L_0x00b0
            r3.close()     // Catch:{ Throwable -> 0x00ac }
            goto L_0x00b0
        L_0x00ac:
            r1 = move-exception
            com.google.a.a.a.a.a.a.b(r1)
        L_0x00b0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.au.a():byte[]");
    }
}
