package com.xiaomi.mipush.sdk;

public class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x f81811a;

    y(x xVar) {
        this.f81811a = xVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fe A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
            r0 = 0
            com.xiaomi.mipush.sdk.x r1 = r9.f81811a     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            android.content.Context r1 = com.xiaomi.mipush.sdk.x.a((com.xiaomi.mipush.sdk.x) r1)     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            com.xiaomi.mipush.sdk.u r1 = com.xiaomi.mipush.sdk.u.a((android.content.Context) r1)     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            java.util.ArrayList r1 = r1.a()     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            if (r1 == 0) goto L_0x00dd
            int r2 = r1.size()     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            if (r2 > 0) goto L_0x0019
            goto L_0x00dd
        L_0x0019:
            com.xiaomi.mipush.sdk.x r2 = r9.f81811a     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            android.content.Context r2 = com.xiaomi.mipush.sdk.x.a((com.xiaomi.mipush.sdk.x) r2)     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            java.lang.String r3 = "C100000"
            java.util.HashMap r2 = com.xiaomi.mipush.sdk.ak.a(r2, r3)     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            r3 = 0
        L_0x0026:
            int r4 = r1.size()     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            if (r3 >= r4) goto L_0x00e6
            java.lang.Object r4 = r1.get(r3)     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            java.io.File r4 = (java.io.File) r4     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            com.xiaomi.mipush.sdk.x r5 = r9.f81811a     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            android.content.Context r5 = com.xiaomi.mipush.sdk.x.a((com.xiaomi.mipush.sdk.x) r5)     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            com.xiaomi.mipush.sdk.u r5 = com.xiaomi.mipush.sdk.u.a((android.content.Context) r5)     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            java.lang.String r5 = r5.a((java.io.File) r4)     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            r6.<init>()     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            com.xiaomi.mipush.sdk.x r8 = r9.f81811a     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            android.content.Context r8 = com.xiaomi.mipush.sdk.x.a((com.xiaomi.mipush.sdk.x) r8)     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            java.io.File r8 = r8.getFilesDir()     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            r6.append(r8)     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            java.lang.String r8 = "/crash/"
            r6.append(r8)     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            java.lang.String r8 = r4.getName()     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            r6.append(r8)     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            java.lang.String r8 = ".zip"
            r6.append(r8)     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            r7.<init>(r6)     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            com.xiaomi.push.z.a((java.io.File) r7, (java.io.File) r4)     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            boolean r0 = r7.exists()     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            if (r0 == 0) goto L_0x00c9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            r0.<init>()     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            java.lang.String r6 = "https://api.xmpush.xiaomi.com/upload/crash_log?file="
            r0.append(r6)     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            java.lang.String r6 = r7.getName()     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            r0.append(r6)     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            java.lang.String r6 = "file"
            com.xiaomi.push.at.a(r0, r2, r7, r6)     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            r6.<init>()     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            com.xiaomi.mipush.sdk.x r8 = r9.f81811a     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            android.content.Context r8 = com.xiaomi.mipush.sdk.x.a((com.xiaomi.mipush.sdk.x) r8)     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            java.io.File r8 = r8.getFilesDir()     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            r6.append(r8)     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            java.lang.String r8 = "/crash"
            r6.append(r8)     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            r8.<init>()     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            r8.append(r5)     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            java.lang.String r5 = ":0"
            r8.append(r5)     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            java.lang.String r5 = r8.toString()     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            r0.<init>(r6, r5)     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            r4.renameTo(r0)     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            com.xiaomi.mipush.sdk.x r0 = r9.f81811a     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            com.xiaomi.mipush.sdk.x.a((com.xiaomi.mipush.sdk.x) r0)     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
            goto L_0x00ce
        L_0x00c9:
            java.lang.String r0 = "zip crash file failed"
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r0)     // Catch:{ IOException -> 0x00d5, Throwable -> 0x00d3 }
        L_0x00ce:
            int r3 = r3 + 1
            r0 = r7
            goto L_0x0026
        L_0x00d3:
            r0 = r7
            goto L_0x00e6
        L_0x00d5:
            r0 = move-exception
            r1 = r0
            r0 = r7
            goto L_0x00e3
        L_0x00d9:
            goto L_0x00e6
        L_0x00db:
            r1 = move-exception
            goto L_0x00e3
        L_0x00dd:
            java.lang.String r1 = "no crash file to upload"
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r1)     // Catch:{ IOException -> 0x00db, Throwable -> 0x00d9 }
            return
        L_0x00e3:
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r1)
        L_0x00e6:
            if (r0 == 0) goto L_0x00f9
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x00f9
            boolean r0 = r0.delete()
            if (r0 != 0) goto L_0x00f9
            java.lang.String r0 = "delete zip crash file failed"
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r0)
        L_0x00f9:
            java.lang.Object r0 = com.xiaomi.mipush.sdk.x.a()
            monitor-enter(r0)
            java.lang.Object r1 = com.xiaomi.mipush.sdk.x.a()     // Catch:{ all -> 0x0107 }
            r1.notifyAll()     // Catch:{ all -> 0x0107 }
            monitor-exit(r0)     // Catch:{ all -> 0x0107 }
            return
        L_0x0107:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0107 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.y.run():void");
    }
}
