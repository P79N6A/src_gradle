package com.xiaomi.mipush.sdk;

import android.content.Context;

public final class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f81809a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f135a;

    w(Context context, boolean z) {
        this.f81809a = context;
        this.f135a = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            r0 = 0
            android.content.Context r1 = r7.f81809a     // Catch:{ Throwable -> 0x008e }
            java.lang.String r2 = ""
            java.util.HashMap r1 = com.xiaomi.mipush.sdk.ak.a(r1, r2)     // Catch:{ Throwable -> 0x008e }
            boolean r2 = r7.f135a     // Catch:{ Throwable -> 0x008e }
            if (r2 == 0) goto L_0x0018
            android.content.Context r2 = r7.f81809a     // Catch:{ Throwable -> 0x008e }
            java.io.File r2 = r2.getFilesDir()     // Catch:{ Throwable -> 0x008e }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Throwable -> 0x008e }
            goto L_0x0033
        L_0x0018:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x008e }
            r2.<init>()     // Catch:{ Throwable -> 0x008e }
            android.content.Context r3 = r7.f81809a     // Catch:{ Throwable -> 0x008e }
            java.io.File r3 = r3.getExternalFilesDir(r0)     // Catch:{ Throwable -> 0x008e }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Throwable -> 0x008e }
            r2.append(r3)     // Catch:{ Throwable -> 0x008e }
            java.lang.String r3 = com.xiaomi.push.eg.f311a     // Catch:{ Throwable -> 0x008e }
            r2.append(r3)     // Catch:{ Throwable -> 0x008e }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x008e }
        L_0x0033:
            java.io.File r3 = com.xiaomi.mipush.sdk.Logger.getLogFile(r2)     // Catch:{ Throwable -> 0x008e }
            if (r3 != 0) goto L_0x003f
            java.lang.String r1 = "log file null"
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r1)     // Catch:{ Throwable -> 0x008e }
            goto L_0x009f
        L_0x003f:
            android.content.Context r4 = r7.f81809a     // Catch:{ Throwable -> 0x008e }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ Throwable -> 0x008e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x008e }
            r5.<init>()     // Catch:{ Throwable -> 0x008e }
            java.io.File r6 = new java.io.File     // Catch:{ Throwable -> 0x008e }
            r5.append(r4)     // Catch:{ Throwable -> 0x008e }
            java.lang.String r4 = ".zip"
            r5.append(r4)     // Catch:{ Throwable -> 0x008e }
            java.lang.String r4 = r5.toString()     // Catch:{ Throwable -> 0x008e }
            r6.<init>(r2, r4)     // Catch:{ Throwable -> 0x008e }
            com.xiaomi.push.z.a((java.io.File) r6, (java.io.File) r3)     // Catch:{ Throwable -> 0x008c }
            boolean r0 = r6.exists()     // Catch:{ Throwable -> 0x008c }
            if (r0 == 0) goto L_0x0086
            boolean r0 = r7.f135a     // Catch:{ Throwable -> 0x008c }
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = "https://api.xmpush.xiaomi.com/upload/xmsf_log?file="
            goto L_0x006d
        L_0x006b:
            java.lang.String r0 = "https://api.xmpush.xiaomi.com/upload/app_log?file="
        L_0x006d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x008c }
            r2.<init>()     // Catch:{ Throwable -> 0x008c }
            r2.append(r0)     // Catch:{ Throwable -> 0x008c }
            java.lang.String r0 = r6.getName()     // Catch:{ Throwable -> 0x008c }
            r2.append(r0)     // Catch:{ Throwable -> 0x008c }
            java.lang.String r0 = r2.toString()     // Catch:{ Throwable -> 0x008c }
            java.lang.String r2 = "file"
            com.xiaomi.push.at.a(r0, r1, r6, r2)     // Catch:{ Throwable -> 0x008c }
            goto L_0x0094
        L_0x0086:
            java.lang.String r0 = "zip log file failed"
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r0)     // Catch:{ Throwable -> 0x008c }
            goto L_0x0094
        L_0x008c:
            r0 = move-exception
            goto L_0x0091
        L_0x008e:
            r1 = move-exception
            r6 = r0
            r0 = r1
        L_0x0091:
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r0)
        L_0x0094:
            if (r6 == 0) goto L_0x009f
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x009f
            r6.delete()
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.w.run():void");
    }
}
