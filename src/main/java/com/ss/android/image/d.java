package com.ss.android.image;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.c;
import com.ss.android.common.util.h;
import java.util.List;
import org.apache.http.client.RedirectHandler;

public final class d {
    public static boolean a(Context context, int i, String str, String str2, String str3, String str4, String str5, c<String> cVar, h hVar) throws Throwable {
        return a(context, i, str, str2, str3, str4, str5, cVar, str5, hVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00c6 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(android.content.Context r18, int r19, java.util.List<com.ss.android.image.i> r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, com.ss.android.common.util.c<java.lang.String> r24, java.lang.String r25, com.ss.android.common.util.h r26) throws java.lang.Throwable {
        /*
            if (r19 > 0) goto L_0x0007
            r0 = 20971520(0x1400000, float:3.526483E-38)
            r12 = 20971520(0x1400000, float:3.526483E-38)
            goto L_0x0009
        L_0x0007:
            r12 = r19
        L_0x0009:
            r13 = 0
            if (r20 == 0) goto L_0x00ce
            boolean r1 = r20.isEmpty()
            if (r1 == 0) goto L_0x0014
            goto L_0x00ce
        L_0x0014:
            java.util.Iterator r14 = r20.iterator()
            r0 = 0
        L_0x0019:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x00cd
            java.lang.Object r1 = r14.next()
            com.ss.android.image.i r1 = (com.ss.android.image.i) r1
            if (r1 == 0) goto L_0x00c7
            java.lang.String r2 = r1.f29264a
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x00c7
            int r11 = r0 + 1
            r0 = 3
            if (r11 <= r0) goto L_0x0035
            return r13
        L_0x0035:
            com.bytedance.common.utility.Logger.debug()
            r10 = 1
            java.lang.String[] r0 = new java.lang.String[r10]
            int[] r9 = new int[r10]
            if (r18 == 0) goto L_0x004f
            boolean r3 = com.ss.android.common.util.NetworkUtils.isNetworkAvailable(r18)     // Catch:{ Throwable -> 0x0046 }
            if (r3 != 0) goto L_0x004f
            return r13
        L_0x0046:
            r0 = move-exception
            r2 = r21
            r3 = r23
            r17 = r11
            r15 = 1
            goto L_0x00a4
        L_0x004f:
            java.util.List<com.ss.android.http.a.b.e> r8 = r1.f29265b     // Catch:{ Throwable -> 0x0046 }
            r1 = r12
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r15 = r8
            r8 = r26
            r16 = r9
            r9 = r15
            r15 = 1
            r10 = r0
            r17 = r11
            r11 = r16
            boolean r0 = com.ss.android.common.util.NetworkUtils.downloadFile(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Throwable -> 0x009f }
            if (r0 != 0) goto L_0x006f
            return r0
        L_0x006f:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x009e }
            r2 = r21
            r3 = r23
            r1.<init>(r2, r3)     // Catch:{ Throwable -> 0x009c }
            boolean r4 = r1.isFile()     // Catch:{ Throwable -> 0x009c }
            if (r4 == 0) goto L_0x009e
            long r4 = r1.length()     // Catch:{ Throwable -> 0x009c }
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x009e
            java.util.concurrent.atomic.AtomicLong r1 = com.ss.android.image.h.f29256c     // Catch:{ Throwable -> 0x009c }
            r1.addAndGet(r4)     // Catch:{ Throwable -> 0x009c }
            r1 = r16[r13]     // Catch:{ Throwable -> 0x009c }
            if (r1 > 0) goto L_0x009e
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x009e
            int r1 = (int) r4     // Catch:{ Throwable -> 0x009c }
            r16[r13] = r1     // Catch:{ Throwable -> 0x009c }
            goto L_0x009e
        L_0x009c:
            r0 = move-exception
            goto L_0x00a4
        L_0x009e:
            return r0
        L_0x009f:
            r0 = move-exception
            r2 = r21
            r3 = r23
        L_0x00a4:
            boolean r1 = r0 instanceof java.net.SocketException
            if (r1 != 0) goto L_0x00b6
            boolean r1 = r0 instanceof java.io.IOException
            if (r1 != 0) goto L_0x00b6
            boolean r1 = r0 instanceof java.net.SocketTimeoutException
            if (r1 != 0) goto L_0x00b6
            boolean r1 = r0 instanceof com.ss.android.http.a.a.b
            if (r1 == 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r15 = 0
        L_0x00b6:
            if (r15 == 0) goto L_0x00c6
            if (r18 != 0) goto L_0x00bb
            return r13
        L_0x00bb:
            boolean r0 = com.ss.android.common.util.NetworkUtils.isNetworkAvailable(r18)
            if (r0 != 0) goto L_0x00c2
            return r13
        L_0x00c2:
            r0 = r17
            goto L_0x0019
        L_0x00c6:
            throw r0
        L_0x00c7:
            r2 = r21
            r3 = r23
            goto L_0x0019
        L_0x00cd:
            return r13
        L_0x00ce:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.image.d.a(android.content.Context, int, java.util.List, java.lang.String, java.lang.String, java.lang.String, com.ss.android.common.util.c, java.lang.String, com.ss.android.common.util.h):boolean");
    }

    public static boolean a(Context context, int i, String str, String str2, String str3, String str4, String str5, c<String> cVar, String str6, h hVar) throws Throwable {
        return a(context, i, (List) f.extractImageUrlList(str, str2), str3, str4, str5, (c) cVar, str6, hVar);
    }

    public static boolean a(Context context, int i, List<i> list, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, c<String> cVar, String str, h hVar, RedirectHandler redirectHandler) throws Throwable {
        int i2;
        if (i <= 0) {
            i2 = 20971520;
        } else {
            i2 = i;
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        int i3 = 0;
        for (i next : list) {
            if (next != null) {
                String str2 = next.f29264a;
                if (!StringUtils.isEmpty(str2)) {
                    int i4 = i3 + 1;
                    if (i4 > 3) {
                        return false;
                    }
                    Logger.debug();
                    String[] strArr = new String[1];
                    int[] iArr = new int[1];
                    if (context != null) {
                        try {
                            if (!NetworkUtils.isNetworkAvailable(context)) {
                                return false;
                            }
                        } catch (Throwable unused) {
                            i3 = i4;
                        }
                    }
                    return NetworkUtils.downloadVideo(i2, str2, stringBuffer, stringBuffer2, stringBuffer3, cVar, str, hVar, next.f29265b, strArr, iArr, redirectHandler);
                }
                continue;
            }
        }
        return false;
    }
}
