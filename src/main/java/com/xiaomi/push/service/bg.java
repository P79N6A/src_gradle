package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.io;

public final class bg implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f82544a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ io f976a;

    bg(Context context, io ioVar) {
        this.f82544a = context;
        this.f976a = ioVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0057 A[SYNTHETIC, Splitter:B:32:0x0057] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            java.lang.Object r0 = com.xiaomi.push.service.bf.f82543a
            monitor-enter(r0)
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            android.content.Context r3 = r6.f82544a     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            java.io.File r3 = r3.getFilesDir()     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            java.lang.String r4 = "tiny_data.lock"
            r2.<init>(r3, r4)     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            com.xiaomi.push.z.a((java.io.File) r2)     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            java.lang.String r4 = "rw"
            r3.<init>(r2, r4)     // Catch:{ Exception -> 0x0050, all -> 0x004d }
            java.nio.channels.FileChannel r2 = r3.getChannel()     // Catch:{ Exception -> 0x0045 }
            java.nio.channels.FileLock r2 = r2.lock()     // Catch:{ Exception -> 0x0045 }
            android.content.Context r1 = r6.f82544a     // Catch:{ Exception -> 0x0043, all -> 0x003e }
            com.xiaomi.push.io r4 = r6.f976a     // Catch:{ Exception -> 0x0043, all -> 0x003e }
            com.xiaomi.push.service.bf.c(r1, r4)     // Catch:{ Exception -> 0x0043, all -> 0x003e }
            if (r2 == 0) goto L_0x003a
            boolean r1 = r2.isValid()     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x003a
            r2.release()     // Catch:{ IOException -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r1 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r1)     // Catch:{ all -> 0x007a }
        L_0x003a:
            com.xiaomi.push.z.a((java.io.Closeable) r3)     // Catch:{ all -> 0x007a }
            goto L_0x0066
        L_0x003e:
            r1 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x0069
        L_0x0043:
            r1 = move-exception
            goto L_0x0049
        L_0x0045:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L_0x0049:
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x0052
        L_0x004d:
            r2 = move-exception
            r3 = r1
            goto L_0x0069
        L_0x0050:
            r2 = move-exception
            r3 = r1
        L_0x0052:
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r2)     // Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x003a
            boolean r2 = r1.isValid()     // Catch:{ all -> 0x007a }
            if (r2 == 0) goto L_0x003a
            r1.release()     // Catch:{ IOException -> 0x0061 }
            goto L_0x003a
        L_0x0061:
            r1 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r1)     // Catch:{ all -> 0x007a }
            goto L_0x003a
        L_0x0066:
            monitor-exit(r0)     // Catch:{ all -> 0x007a }
            return
        L_0x0068:
            r2 = move-exception
        L_0x0069:
            if (r1 == 0) goto L_0x007c
            boolean r4 = r1.isValid()     // Catch:{ all -> 0x007a }
            if (r4 == 0) goto L_0x007c
            r1.release()     // Catch:{ IOException -> 0x0075 }
            goto L_0x007c
        L_0x0075:
            r1 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r1)     // Catch:{ all -> 0x007a }
            goto L_0x007c
        L_0x007a:
            r1 = move-exception
            goto L_0x0080
        L_0x007c:
            com.xiaomi.push.z.a((java.io.Closeable) r3)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x0080:
            monitor-exit(r0)     // Catch:{ all -> 0x007a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.bg.run():void");
    }
}
