package com.xiaomi.push;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class bf {
    public static String a() {
        return Build.VERSION.RELEASE + "-" + Build.VERSION.INCREMENTAL;
    }

    public static String a(Context context) {
        String a2 = bi.a(context).a("sp_client_report_status", "sp_client_report_key", "");
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        String a3 = az.a(20);
        bi.a(context).a("sp_client_report_status", "sp_client_report_key", a3);
        return a3;
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.xmsf.push.XMSF_UPLOAD_ACTIVE");
        intent.putExtra("pkgname", context.getPackageName());
        intent.putExtra("category", "category_client_report_data");
        intent.putExtra("name", "quality_support");
        intent.putExtra("data", str);
        context.sendBroadcast(intent, "com.xiaomi.xmsf.permission.USE_XMSF_UPLOAD");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:27|28|29|30|31|32|33|(2:37|38)|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ed, code lost:
        if (r7 != null) goto L_0x00b9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x009d */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            java.io.File r13 = r11.getExternalFilesDir(r13)
            if (r13 == 0) goto L_0x012b
            boolean r0 = r13.exists()
            if (r0 != 0) goto L_0x000f
            r13.mkdirs()
        L_0x000f:
            java.io.File r11 = r11.getExternalFilesDir(r12)
            if (r11 == 0) goto L_0x012b
            boolean r12 = r11.exists()
            if (r12 != 0) goto L_0x0020
            r11.mkdirs()
            goto L_0x012b
        L_0x0020:
            com.xiaomi.push.bg r12 = new com.xiaomi.push.bg
            r12.<init>()
            java.io.File[] r11 = r11.listFiles(r12)
            if (r11 == 0) goto L_0x012b
            int r12 = r11.length
            if (r12 <= 0) goto L_0x012b
            long r0 = java.lang.System.currentTimeMillis()
            int r12 = r11.length
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x0037:
            if (r2 >= r12) goto L_0x012b
            r6 = r11[r2]
            if (r6 == 0) goto L_0x010f
            java.lang.String r7 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x00d2, all -> 0x00ce }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x00d2, all -> 0x00ce }
            if (r7 == 0) goto L_0x0049
            goto L_0x010f
        L_0x0049:
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x00d2, all -> 0x00ce }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d2, all -> 0x00ce }
            r8.<init>()     // Catch:{ Exception -> 0x00d2, all -> 0x00ce }
            java.lang.String r9 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x00d2, all -> 0x00ce }
            r8.append(r9)     // Catch:{ Exception -> 0x00d2, all -> 0x00ce }
            java.lang.String r9 = ".lock"
            r8.append(r9)     // Catch:{ Exception -> 0x00d2, all -> 0x00ce }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00d2, all -> 0x00ce }
            r7.<init>(r8)     // Catch:{ Exception -> 0x00d2, all -> 0x00ce }
            com.xiaomi.push.z.a((java.io.File) r7)     // Catch:{ Exception -> 0x00c8, all -> 0x00c6 }
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00c8, all -> 0x00c6 }
            java.lang.String r8 = "rw"
            r5.<init>(r7, r8)     // Catch:{ Exception -> 0x00c8, all -> 0x00c6 }
            java.nio.channels.FileChannel r4 = r5.getChannel()     // Catch:{ Exception -> 0x00c1, all -> 0x00bf }
            java.nio.channels.FileLock r4 = r4.lock()     // Catch:{ Exception -> 0x00c1, all -> 0x00bf }
            java.lang.String r3 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x00bd }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bd }
            r8.<init>()     // Catch:{ Exception -> 0x00bd }
            r8.append(r3)     // Catch:{ Exception -> 0x00bd }
            java.lang.String r3 = java.io.File.separator     // Catch:{ Exception -> 0x00bd }
            r8.append(r3)     // Catch:{ Exception -> 0x00bd }
            java.lang.String r3 = r6.getName()     // Catch:{ Exception -> 0x00bd }
            r8.append(r3)     // Catch:{ Exception -> 0x00bd }
            r8.append(r0)     // Catch:{ Exception -> 0x00bd }
            java.lang.String r3 = r8.toString()     // Catch:{ Exception -> 0x00bd }
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x00bd }
            r8.<init>(r3)     // Catch:{ Exception -> 0x00bd }
            com.xiaomi.push.z.b(r6, r8)     // Catch:{ IOException -> 0x009d }
            goto L_0x00a3
        L_0x009d:
            r6.delete()     // Catch:{ Exception -> 0x00bd }
            r8.delete()     // Catch:{ Exception -> 0x00bd }
        L_0x00a3:
            r6.delete()     // Catch:{ Exception -> 0x00bd }
            if (r4 == 0) goto L_0x00b6
            boolean r3 = r4.isValid()
            if (r3 == 0) goto L_0x00b6
            r4.release()     // Catch:{ IOException -> 0x00b2 }
            goto L_0x00b6
        L_0x00b2:
            r3 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r3)
        L_0x00b6:
            com.xiaomi.push.z.a((java.io.Closeable) r5)
        L_0x00b9:
            r7.delete()
            goto L_0x00f0
        L_0x00bd:
            r3 = move-exception
            goto L_0x00d7
        L_0x00bf:
            r11 = move-exception
            goto L_0x00f6
        L_0x00c1:
            r4 = move-exception
            r10 = r4
            r4 = r3
            r3 = r10
            goto L_0x00d7
        L_0x00c6:
            r11 = move-exception
            goto L_0x00d0
        L_0x00c8:
            r5 = move-exception
            r10 = r4
            r4 = r3
            r3 = r5
            r5 = r10
            goto L_0x00d7
        L_0x00ce:
            r11 = move-exception
            r7 = r5
        L_0x00d0:
            r5 = r4
            goto L_0x00f6
        L_0x00d2:
            r6 = move-exception
            r7 = r5
            r5 = r4
            r4 = r3
            r3 = r6
        L_0x00d7:
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r3)     // Catch:{ all -> 0x00f4 }
            if (r4 == 0) goto L_0x00ea
            boolean r3 = r4.isValid()
            if (r3 == 0) goto L_0x00ea
            r4.release()     // Catch:{ IOException -> 0x00e6 }
            goto L_0x00ea
        L_0x00e6:
            r3 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r3)
        L_0x00ea:
            com.xiaomi.push.z.a((java.io.Closeable) r5)
            if (r7 == 0) goto L_0x00f0
            goto L_0x00b9
        L_0x00f0:
            r3 = r4
            r4 = r5
            r5 = r7
            goto L_0x0127
        L_0x00f4:
            r11 = move-exception
            r3 = r4
        L_0x00f6:
            if (r3 == 0) goto L_0x0106
            boolean r12 = r3.isValid()
            if (r12 == 0) goto L_0x0106
            r3.release()     // Catch:{ IOException -> 0x0102 }
            goto L_0x0106
        L_0x0102:
            r12 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r12)
        L_0x0106:
            com.xiaomi.push.z.a((java.io.Closeable) r5)
            if (r7 == 0) goto L_0x010e
            r7.delete()
        L_0x010e:
            throw r11
        L_0x010f:
            if (r3 == 0) goto L_0x011f
            boolean r6 = r3.isValid()
            if (r6 == 0) goto L_0x011f
            r3.release()     // Catch:{ IOException -> 0x011b }
            goto L_0x011f
        L_0x011b:
            r6 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r6)
        L_0x011f:
            com.xiaomi.push.z.a((java.io.Closeable) r4)
            if (r5 == 0) goto L_0x0127
            r5.delete()
        L_0x0127:
            int r2 = r2 + 1
            goto L_0x0037
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.bf.a(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static void a(Context context, List<String> list) {
        if (list != null && list.size() > 0 && a(context)) {
            for (String next : list) {
                if (!TextUtils.isEmpty(next)) {
                    a(context, next);
                }
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m113a(Context context) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode >= 108;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r0.length() > r3) goto L_0x0024;
     */
    /* renamed from: a  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m114a(android.content.Context r3, java.lang.String r4) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            com.xiaomi.clientreport.manager.a r3 = com.xiaomi.clientreport.manager.a.a((android.content.Context) r3)
            com.xiaomi.clientreport.data.Config r3 = r3.a()
            long r3 = r3.getMaxFileLength()
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0026
            long r0 = r0.length()     // Catch:{ Exception -> 0x0020 }
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0029
            goto L_0x0024
        L_0x0020:
            r3 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r3)
        L_0x0024:
            r3 = 0
            goto L_0x002a
        L_0x0026:
            com.xiaomi.push.z.a((java.io.File) r0)
        L_0x0029:
            r3 = 1
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.bf.m114a(android.content.Context, java.lang.String):boolean");
    }

    @TargetApi(9)
    public static byte[] a(String str) {
        byte[] copyOf = Arrays.copyOf(aw.a(str), 16);
        copyOf[0] = 68;
        copyOf[15] = 84;
        return copyOf;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static File[] m115a(Context context, String str) {
        File externalFilesDir = context.getExternalFilesDir(str);
        if (externalFilesDir != null) {
            return externalFilesDir.listFiles(new bh());
        }
        return null;
    }
}
