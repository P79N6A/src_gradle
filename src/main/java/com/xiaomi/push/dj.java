package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.dh;

public class dj implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f81940a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ dh.a f267a;

    dj(dh.a aVar, Context context) {
        this.f267a = aVar;
        this.f81940a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e A[SYNTHETIC, Splitter:B:27:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005a A[Catch:{ Exception -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0065 A[SYNTHETIC, Splitter:B:36:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0071 A[Catch:{ Exception -> 0x0069 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            r0 = 0
            com.xiaomi.push.dh$a r1 = r4.f267a     // Catch:{ Exception -> 0x0045, all -> 0x0040 }
            android.database.sqlite.SQLiteDatabase r1 = r1.a()     // Catch:{ Exception -> 0x0045, all -> 0x0040 }
            if (r1 == 0) goto L_0x001f
            boolean r0 = r1.isOpen()     // Catch:{ Exception -> 0x001d }
            if (r0 == 0) goto L_0x001f
            r1.beginTransaction()     // Catch:{ Exception -> 0x001d }
            com.xiaomi.push.dh$a r0 = r4.f267a     // Catch:{ Exception -> 0x001d }
            android.content.Context r2 = r4.f81940a     // Catch:{ Exception -> 0x001d }
            r0.a((android.content.Context) r2, (android.database.sqlite.SQLiteDatabase) r1)     // Catch:{ Exception -> 0x001d }
            r1.setTransactionSuccessful()     // Catch:{ Exception -> 0x001d }
            goto L_0x001f
        L_0x001d:
            r0 = move-exception
            goto L_0x0049
        L_0x001f:
            if (r1 == 0) goto L_0x0027
            r1.endTransaction()     // Catch:{ Exception -> 0x0025 }
            goto L_0x0027
        L_0x0025:
            r0 = move-exception
            goto L_0x0035
        L_0x0027:
            com.xiaomi.push.dh$a r0 = r4.f267a     // Catch:{ Exception -> 0x0025 }
            com.xiaomi.push.df r0 = r0.f258a     // Catch:{ Exception -> 0x0025 }
            if (r0 == 0) goto L_0x0038
            com.xiaomi.push.dh$a r0 = r4.f267a     // Catch:{ Exception -> 0x0025 }
            com.xiaomi.push.df r0 = r0.f258a     // Catch:{ Exception -> 0x0025 }
            r0.close()     // Catch:{ Exception -> 0x0025 }
            goto L_0x0038
        L_0x0035:
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r0)
        L_0x0038:
            com.xiaomi.push.dh$a r0 = r4.f267a
            android.content.Context r1 = r4.f81940a
            r0.a((android.content.Context) r1)
            return
        L_0x0040:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L_0x0063
        L_0x0045:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
        L_0x0049:
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0054
            r1.endTransaction()     // Catch:{ Exception -> 0x0052 }
            goto L_0x0054
        L_0x0052:
            r0 = move-exception
            goto L_0x0035
        L_0x0054:
            com.xiaomi.push.dh$a r0 = r4.f267a     // Catch:{ Exception -> 0x0052 }
            com.xiaomi.push.df r0 = r0.f258a     // Catch:{ Exception -> 0x0052 }
            if (r0 == 0) goto L_0x0038
            com.xiaomi.push.dh$a r0 = r4.f267a     // Catch:{ Exception -> 0x0052 }
            com.xiaomi.push.df r0 = r0.f258a     // Catch:{ Exception -> 0x0052 }
            r0.close()     // Catch:{ Exception -> 0x0052 }
            goto L_0x0038
        L_0x0062:
            r0 = move-exception
        L_0x0063:
            if (r1 == 0) goto L_0x006b
            r1.endTransaction()     // Catch:{ Exception -> 0x0069 }
            goto L_0x006b
        L_0x0069:
            r1 = move-exception
            goto L_0x0079
        L_0x006b:
            com.xiaomi.push.dh$a r1 = r4.f267a     // Catch:{ Exception -> 0x0069 }
            com.xiaomi.push.df r1 = r1.f258a     // Catch:{ Exception -> 0x0069 }
            if (r1 == 0) goto L_0x007c
            com.xiaomi.push.dh$a r1 = r4.f267a     // Catch:{ Exception -> 0x0069 }
            com.xiaomi.push.df r1 = r1.f258a     // Catch:{ Exception -> 0x0069 }
            r1.close()     // Catch:{ Exception -> 0x0069 }
            goto L_0x007c
        L_0x0079:
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r1)
        L_0x007c:
            com.xiaomi.push.dh$a r1 = r4.f267a
            android.content.Context r2 = r4.f81940a
            r1.a((android.content.Context) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.dj.run():void");
    }
}
