package com.bytedance.android.live.core.utils;

import android.os.Debug;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8229a;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f8230b = {0, 192, 290, 512, 1024, 1536, 2048};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f8231c = {0, 528, 620, 1020, 1220, 1520, 2020};

    public static long a() {
        if (PatchProxy.isSupport(new Object[0], null, f8229a, true, 1217, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, f8229a, true, 1217, new Class[0], Long.TYPE)).longValue();
        }
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        return (long) memoryInfo.getTotalPss();
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ba A[SYNTHETIC, Splitter:B:45:0x00ba] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c1 A[SYNTHETIC, Splitter:B:49:0x00c1] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c8 A[SYNTHETIC, Splitter:B:56:0x00c8] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00cf A[SYNTHETIC, Splitter:B:60:0x00cf] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f8229a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 1218(0x4c2, float:1.707E-42)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f8229a
            r13 = 1
            r14 = 1218(0x4c2, float:1.707E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0035:
            r2 = 3
            r3 = 0
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Throwable -> 0x00c5, all -> 0x00b6 }
            java.lang.String r4 = "sh"
            r2[r9] = r4     // Catch:{ Throwable -> 0x00c5, all -> 0x00b6 }
            java.lang.String r4 = "-c"
            r2[r1] = r4     // Catch:{ Throwable -> 0x00c5, all -> 0x00b6 }
            r1 = 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00c5, all -> 0x00b6 }
            java.lang.String r5 = "top -n 1 | grep "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x00c5, all -> 0x00b6 }
            r4.append(r0)     // Catch:{ Throwable -> 0x00c5, all -> 0x00b6 }
            java.lang.String r0 = "$"
            r4.append(r0)     // Catch:{ Throwable -> 0x00c5, all -> 0x00b6 }
            java.lang.String r0 = r4.toString()     // Catch:{ Throwable -> 0x00c5, all -> 0x00b6 }
            r2[r1] = r0     // Catch:{ Throwable -> 0x00c5, all -> 0x00b6 }
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x00c5, all -> 0x00b6 }
            java.lang.Process r1 = r0.exec(r2)     // Catch:{ Throwable -> 0x00c5, all -> 0x00b6 }
            java.io.InputStream r2 = r1.getInputStream()     // Catch:{ Throwable -> 0x00b4, all -> 0x00b2 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x00b0, all -> 0x00ad }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x00b0, all -> 0x00ad }
            r3.<init>(r2)     // Catch:{ Throwable -> 0x00b0, all -> 0x00ad }
            r0.<init>(r3)     // Catch:{ Throwable -> 0x00b0, all -> 0x00ad }
            java.lang.String r0 = r0.readLine()     // Catch:{ Throwable -> 0x00b0, all -> 0x00ad }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x00b0, all -> 0x00ad }
            if (r3 != 0) goto L_0x009e
            java.lang.String r0 = r0.trim()     // Catch:{ Throwable -> 0x00b0, all -> 0x00ad }
            java.lang.String r3 = " +"
            java.lang.String[] r0 = r0.split(r3)     // Catch:{ Throwable -> 0x00b0, all -> 0x00ad }
            int r3 = r0.length     // Catch:{ Throwable -> 0x00b0, all -> 0x00ad }
        L_0x0082:
            if (r9 >= r3) goto L_0x009e
            r4 = r0[r9]     // Catch:{ Throwable -> 0x00b0, all -> 0x00ad }
            java.lang.String r5 = "%"
            boolean r5 = r4.endsWith(r5)     // Catch:{ Throwable -> 0x00b0, all -> 0x00ad }
            if (r5 == 0) goto L_0x009b
            if (r2 == 0) goto L_0x0095
            r2.close()     // Catch:{ IOException -> 0x0094 }
            goto L_0x0095
        L_0x0094:
        L_0x0095:
            if (r1 == 0) goto L_0x009a
            r1.destroy()     // Catch:{ Throwable -> 0x009a }
        L_0x009a:
            return r4
        L_0x009b:
            int r9 = r9 + 1
            goto L_0x0082
        L_0x009e:
            java.lang.String r0 = ""
            if (r2 == 0) goto L_0x00a7
            r2.close()     // Catch:{ IOException -> 0x00a6 }
            goto L_0x00a7
        L_0x00a6:
        L_0x00a7:
            if (r1 == 0) goto L_0x00ac
            r1.destroy()     // Catch:{ Throwable -> 0x00ac }
        L_0x00ac:
            return r0
        L_0x00ad:
            r0 = move-exception
            r3 = r2
            goto L_0x00b8
        L_0x00b0:
            r3 = r2
            goto L_0x00c6
        L_0x00b2:
            r0 = move-exception
            goto L_0x00b8
        L_0x00b4:
            goto L_0x00c6
        L_0x00b6:
            r0 = move-exception
            r1 = r3
        L_0x00b8:
            if (r3 == 0) goto L_0x00bf
            r3.close()     // Catch:{ IOException -> 0x00be }
            goto L_0x00bf
        L_0x00be:
        L_0x00bf:
            if (r1 == 0) goto L_0x00c4
            r1.destroy()     // Catch:{ Throwable -> 0x00c4 }
        L_0x00c4:
            throw r0
        L_0x00c5:
            r1 = r3
        L_0x00c6:
            if (r3 == 0) goto L_0x00cd
            r3.close()     // Catch:{ IOException -> 0x00cc }
            goto L_0x00cd
        L_0x00cc:
        L_0x00cd:
            if (r1 == 0) goto L_0x00d2
            r1.destroy()     // Catch:{ Throwable -> 0x00d2 }
        L_0x00d2:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.utils.aa.a(java.lang.String):java.lang.String");
    }
}
