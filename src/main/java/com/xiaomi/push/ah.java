package com.xiaomi.push;

import android.content.Context;
import android.os.Environment;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

public class ah {

    /* renamed from: a  reason: collision with root package name */
    private static final String f81823a = (Environment.getExternalStorageDirectory().getPath() + "/mipush/");

    /* renamed from: b  reason: collision with root package name */
    private static final String f81824b = (f81823a + "lcfp");

    /* renamed from: c  reason: collision with root package name */
    private static final String f81825c = (f81823a + "lcfp.lock");

    public static boolean a(Context context, String str, long j) {
        RandomAccessFile randomAccessFile;
        FileLock fileLock = null;
        try {
            File file = new File(f81825c);
            z.a(file);
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                FileLock lock = randomAccessFile.getChannel().lock();
                try {
                    boolean b2 = b(context, str, j);
                    if (lock != null && lock.isValid()) {
                        try {
                            lock.release();
                        } catch (IOException unused) {
                        }
                    }
                    z.a((Closeable) randomAccessFile);
                    return b2;
                } catch (IOException unused2) {
                    fileLock = lock;
                    try {
                        fileLock.release();
                    } catch (IOException unused3) {
                    }
                    z.a((Closeable) randomAccessFile);
                    return true;
                } catch (Throwable th) {
                    th = th;
                    fileLock = lock;
                    try {
                        fileLock.release();
                    } catch (IOException unused4) {
                    }
                    z.a((Closeable) randomAccessFile);
                    throw th;
                }
            } catch (IOException unused5) {
                fileLock.release();
                z.a((Closeable) randomAccessFile);
                return true;
            } catch (Throwable th2) {
                th = th2;
                fileLock.release();
                z.a((Closeable) randomAccessFile);
                throw th;
            }
        } catch (IOException unused6) {
            randomAccessFile = null;
            if (fileLock != null && fileLock.isValid()) {
                fileLock.release();
            }
            z.a((Closeable) randomAccessFile);
            return true;
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
            if (fileLock != null && fileLock.isValid()) {
                fileLock.release();
            }
            z.a((Closeable) randomAccessFile);
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:24|25|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r4.clear();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(android.content.Context r16, java.lang.String r17, long r18) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1
            r3 = 23
            if (r0 < r3) goto L_0x0014
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            r3 = r16
            boolean r0 = com.xiaomi.push.g.c((android.content.Context) r3, (java.lang.String) r0)
            if (r0 != 0) goto L_0x0016
            goto L_0x00ff
        L_0x0014:
            r3 = r16
        L_0x0016:
            java.io.File r0 = new java.io.File
            java.lang.String r4 = f81824b
            r0.<init>(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = r17
            r7.append(r8)
            java.lang.String r9 = ":"
            r7.append(r9)
            java.lang.String r9 = r16.getPackageName()
            r7.append(r9)
            java.lang.String r9 = ","
            r7.append(r9)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            boolean r9 = r0.exists()
            r10 = 0
            if (r9 == 0) goto L_0x00c1
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.io.FileReader r11 = new java.io.FileReader     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            r9.<init>(r11)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
        L_0x0059:
            java.lang.String r11 = r9.readLine()     // Catch:{ Exception -> 0x00b6 }
            if (r11 == 0) goto L_0x00b9
            java.lang.String r12 = ":"
            java.lang.String[] r12 = r11.split(r12)     // Catch:{ Exception -> 0x00b6 }
            int r13 = r12.length     // Catch:{ Exception -> 0x00b6 }
            r14 = 2
            if (r13 != r14) goto L_0x0059
            r13 = r12[r1]     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r15 = java.lang.String.valueOf(r17)     // Catch:{ Exception -> 0x00b6 }
            boolean r13 = android.text.TextUtils.equals(r13, r15)     // Catch:{ Exception -> 0x00b6 }
            if (r13 == 0) goto L_0x00ac
            r11 = r12[r2]     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r12 = ","
            java.lang.String[] r11 = r11.split(r12)     // Catch:{ Exception -> 0x00b6 }
            int r12 = r11.length     // Catch:{ Exception -> 0x00b6 }
            if (r12 != r14) goto L_0x0059
            r12 = r11[r2]     // Catch:{ Exception -> 0x00b6 }
            long r12 = java.lang.Long.parseLong(r12)     // Catch:{ Exception -> 0x00b6 }
            r11 = r11[r1]     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r14 = r16.getPackageName()     // Catch:{ Exception -> 0x00b6 }
            boolean r11 = android.text.TextUtils.equals(r11, r14)     // Catch:{ Exception -> 0x00b6 }
            if (r11 != 0) goto L_0x0059
            long r12 = r5 - r12
            long r11 = java.lang.Math.abs(r12)     // Catch:{ Exception -> 0x00b6 }
            float r11 = (float) r11
            r12 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r18
            float r12 = (float) r12
            r13 = 1063675494(0x3f666666, float:0.9)
            float r12 = r12 * r13
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x0059
            com.xiaomi.push.z.a((java.io.Closeable) r9)
            r2 = 0
            goto L_0x00ff
        L_0x00ac:
            r4.add(r11)     // Catch:{ Exception -> 0x00b6 }
            goto L_0x0059
        L_0x00b0:
            r0 = move-exception
            goto L_0x00bd
        L_0x00b2:
            r0 = move-exception
            r9 = r10
            goto L_0x00bd
        L_0x00b5:
            r9 = r10
        L_0x00b6:
            r4.clear()     // Catch:{ all -> 0x00b0 }
        L_0x00b9:
            com.xiaomi.push.z.a((java.io.Closeable) r9)
            goto L_0x00c8
        L_0x00bd:
            com.xiaomi.push.z.a((java.io.Closeable) r9)
            throw r0
        L_0x00c1:
            boolean r1 = com.xiaomi.push.z.a((java.io.File) r0)
            if (r1 != 0) goto L_0x00c8
            goto L_0x00ff
        L_0x00c8:
            r4.add(r7)
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x00f3, all -> 0x00f1 }
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch:{ IOException -> 0x00f3, all -> 0x00f1 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x00f3, all -> 0x00f1 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x00f3, all -> 0x00f1 }
            java.util.Iterator r0 = r4.iterator()     // Catch:{ IOException -> 0x00ef }
        L_0x00d9:
            boolean r3 = r0.hasNext()     // Catch:{ IOException -> 0x00ef }
            if (r3 == 0) goto L_0x00fc
            java.lang.Object r3 = r0.next()     // Catch:{ IOException -> 0x00ef }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x00ef }
            r1.write(r3)     // Catch:{ IOException -> 0x00ef }
            r1.newLine()     // Catch:{ IOException -> 0x00ef }
            r1.flush()     // Catch:{ IOException -> 0x00ef }
            goto L_0x00d9
        L_0x00ef:
            r0 = move-exception
            goto L_0x00f5
        L_0x00f1:
            r0 = move-exception
            goto L_0x0102
        L_0x00f3:
            r0 = move-exception
            r1 = r10
        L_0x00f5:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0100 }
            com.xiaomi.channel.commonutils.logger.b.d(r0)     // Catch:{ all -> 0x0100 }
        L_0x00fc:
            com.xiaomi.push.z.a((java.io.Closeable) r1)
        L_0x00ff:
            return r2
        L_0x0100:
            r0 = move-exception
            r10 = r1
        L_0x0102:
            com.xiaomi.push.z.a((java.io.Closeable) r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ah.b(android.content.Context, java.lang.String, long):boolean");
    }
}
