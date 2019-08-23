package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.aj;
import com.xiaomi.push.aw;
import com.xiaomi.push.az;
import com.xiaomi.push.io;
import com.xiaomi.push.q;
import java.util.Arrays;

public class bf {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f82543a = new Object();

    public static void a(Context context, io ioVar) {
        if (be.a(ioVar.e())) {
            b.a("TinyData TinyDataStorage.cacheTinyData cache data to file begin item:" + ioVar.d() + "  ts:" + System.currentTimeMillis());
            aj.a(context).a((Runnable) new bg(context, ioVar));
        }
    }

    public static byte[] a(Context context) {
        String a2 = q.a(context).a("mipush", "td_key", "");
        if (TextUtils.isEmpty(a2)) {
            a2 = az.a(20);
            q.a(context).a("mipush", "td_key", a2);
        }
        return a(a2);
    }

    private static byte[] a(String str) {
        byte[] copyOf = Arrays.copyOf(aw.a(str), 16);
        copyOf[0] = 68;
        copyOf[15] = 84;
        return copyOf;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x00c7=Splitter:B:28:0x00c7, B:34:0x00e8=Splitter:B:34:0x00e8} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(android.content.Context r5, com.xiaomi.push.io r6) {
        /*
            byte[] r0 = a((android.content.Context) r5)
            r1 = 0
            byte[] r2 = com.xiaomi.push.ju.a(r6)     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            byte[] r0 = com.xiaomi.push.i.b(r0, r2)     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            if (r0 == 0) goto L_0x0097
            int r2 = r0.length     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            if (r2 > 0) goto L_0x0014
            goto L_0x0097
        L_0x0014:
            int r2 = r0.length     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            r3 = 10240(0x2800, float:1.4349E-41)
            if (r2 <= r3) goto L_0x0044
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            r5.<init>()     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            java.lang.String r0 = "TinyData write to cache file failed case too much data content item:"
            r5.append(r0)     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            java.lang.String r0 = r6.d()     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            r5.append(r0)     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            java.lang.String r0 = "  ts:"
            r5.append(r0)     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            r5.append(r2)     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r5)     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            com.xiaomi.push.z.a((java.io.Closeable) r1)
            com.xiaomi.push.z.a((java.io.Closeable) r1)
            return
        L_0x0044:
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            java.io.File r5 = r5.getFilesDir()     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            java.lang.String r3 = "tiny_data.data"
            r2.<init>(r5, r3)     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            r3 = 1
            r5.<init>(r2, r3)     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            int r5 = r0.length     // Catch:{ IOException -> 0x0095, Exception -> 0x0093 }
            byte[] r5 = com.xiaomi.push.ad.a((int) r5)     // Catch:{ IOException -> 0x0095, Exception -> 0x0093 }
            r2.write(r5)     // Catch:{ IOException -> 0x0095, Exception -> 0x0093 }
            r2.write(r0)     // Catch:{ IOException -> 0x0095, Exception -> 0x0093 }
            r2.flush()     // Catch:{ IOException -> 0x0095, Exception -> 0x0093 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0095, Exception -> 0x0093 }
            r5.<init>()     // Catch:{ IOException -> 0x0095, Exception -> 0x0093 }
            java.lang.String r0 = "TinyData write to cache file success item:"
            r5.append(r0)     // Catch:{ IOException -> 0x0095, Exception -> 0x0093 }
            java.lang.String r0 = r6.d()     // Catch:{ IOException -> 0x0095, Exception -> 0x0093 }
            r5.append(r0)     // Catch:{ IOException -> 0x0095, Exception -> 0x0093 }
            java.lang.String r0 = "  ts:"
            r5.append(r0)     // Catch:{ IOException -> 0x0095, Exception -> 0x0093 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0095, Exception -> 0x0093 }
            r5.append(r3)     // Catch:{ IOException -> 0x0095, Exception -> 0x0093 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0095, Exception -> 0x0093 }
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r5)     // Catch:{ IOException -> 0x0095, Exception -> 0x0093 }
            com.xiaomi.push.z.a((java.io.Closeable) r1)
            com.xiaomi.push.z.a((java.io.Closeable) r2)
            return
        L_0x0093:
            r5 = move-exception
            goto L_0x00c7
        L_0x0095:
            r5 = move-exception
            goto L_0x00e8
        L_0x0097:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            r5.<init>()     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            java.lang.String r0 = "TinyData write to cache file failed case encryption fail item:"
            r5.append(r0)     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            java.lang.String r0 = r6.d()     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            r5.append(r0)     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            java.lang.String r0 = "  ts:"
            r5.append(r0)     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            r5.append(r2)     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r5)     // Catch:{ IOException -> 0x00e6, Exception -> 0x00c5, all -> 0x00c2 }
            com.xiaomi.push.z.a((java.io.Closeable) r1)
            com.xiaomi.push.z.a((java.io.Closeable) r1)
            return
        L_0x00c2:
            r5 = move-exception
            r2 = r1
            goto L_0x0108
        L_0x00c5:
            r5 = move-exception
            r2 = r1
        L_0x00c7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0107 }
            r0.<init>()     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = "TinyData write to cache file  failed item:"
            r0.append(r3)     // Catch:{ all -> 0x0107 }
            java.lang.String r6 = r6.d()     // Catch:{ all -> 0x0107 }
            r0.append(r6)     // Catch:{ all -> 0x0107 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0107 }
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r6, (java.lang.Throwable) r5)     // Catch:{ all -> 0x0107 }
            com.xiaomi.push.z.a((java.io.Closeable) r1)
            com.xiaomi.push.z.a((java.io.Closeable) r2)
            return
        L_0x00e6:
            r5 = move-exception
            r2 = r1
        L_0x00e8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0107 }
            r0.<init>()     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = "TinyData write to cache file failed cause io exception item:"
            r0.append(r3)     // Catch:{ all -> 0x0107 }
            java.lang.String r6 = r6.d()     // Catch:{ all -> 0x0107 }
            r0.append(r6)     // Catch:{ all -> 0x0107 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0107 }
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r6, (java.lang.Throwable) r5)     // Catch:{ all -> 0x0107 }
            com.xiaomi.push.z.a((java.io.Closeable) r1)
            com.xiaomi.push.z.a((java.io.Closeable) r2)
            return
        L_0x0107:
            r5 = move-exception
        L_0x0108:
            com.xiaomi.push.z.a((java.io.Closeable) r1)
            com.xiaomi.push.z.a((java.io.Closeable) r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.bf.c(android.content.Context, com.xiaomi.push.io):void");
    }
}
