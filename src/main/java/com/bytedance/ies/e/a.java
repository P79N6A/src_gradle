package com.bytedance.ies.e;

import android.annotation.SuppressLint;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f20600a = "notify.log";
    @SuppressLint({"SimpleDateFormat"})

    /* renamed from: b  reason: collision with root package name */
    public static SimpleDateFormat f20601b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: c  reason: collision with root package name */
    private static ExecutorService f20602c;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0012, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a() {
        /*
            java.lang.Class<com.bytedance.ies.e.a> r0 = com.bytedance.ies.e.a.class
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = f20602c     // Catch:{ Exception -> 0x0011, all -> 0x000e }
            if (r1 == 0) goto L_0x000c
            java.util.concurrent.ExecutorService r1 = f20602c     // Catch:{ Exception -> 0x0011, all -> 0x000e }
            r1.shutdown()     // Catch:{ Exception -> 0x0011, all -> 0x000e }
        L_0x000c:
            monitor-exit(r0)
            return
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0011:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.e.a.a():void");
    }
}
