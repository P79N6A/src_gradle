package com.amap.api.services.a;

import android.content.Context;
import java.lang.ref.WeakReference;

public class dq {
    public static String a() {
        return bo.a(System.currentTimeMillis());
    }

    public static dk a(WeakReference<dk> weakReference) {
        if (weakReference == null || weakReference.get() == null) {
            weakReference = new WeakReference<>(new dk());
        }
        return (dk) weakReference.get();
    }

    public static String a(Context context, bn bnVar) {
        StringBuilder sb = new StringBuilder();
        try {
            String g = bj.g(context);
            sb.append("\"sim\":\"");
            sb.append(g);
            sb.append("\",\"sdkversion\":\"");
            sb.append(bnVar.c());
            sb.append("\",\"product\":\"");
            sb.append(bnVar.a());
            sb.append("\",\"ed\":\"");
            sb.append(bnVar.d());
            sb.append("\",\"nt\":\"");
            sb.append(bj.e(context));
            sb.append("\",\"np\":\"");
            sb.append(bj.c(context));
            sb.append("\",\"mnc\":\"");
            sb.append(bj.d(context));
            sb.append("\",\"ant\":\"");
            sb.append(bj.f(context));
            sb.append("\"");
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x003a, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x003b, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x003d, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x003e, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x003d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:21:0x0021] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0053 A[SYNTHETIC, Splitter:B:51:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0058 A[SYNTHETIC, Splitter:B:55:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x005f A[SYNTHETIC, Splitter:B:61:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0064 A[SYNTHETIC, Splitter:B:65:0x0064] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static byte[] a(com.amap.api.services.a.cw r4, java.lang.String r5, boolean r6) {
        /*
            r0 = 0
            byte[] r1 = new byte[r0]
            r2 = 0
            com.amap.api.services.a.cw$b r3 = r4.a((java.lang.String) r5)     // Catch:{ Throwable -> 0x0048, all -> 0x0045 }
            if (r3 != 0) goto L_0x0010
            if (r3 == 0) goto L_0x000f
            r3.close()     // Catch:{ Throwable -> 0x000f }
        L_0x000f:
            return r1
        L_0x0010:
            java.io.InputStream r0 = r3.a(r0)     // Catch:{ Throwable -> 0x0043 }
            if (r0 != 0) goto L_0x0021
            if (r0 == 0) goto L_0x001b
            r0.close()     // Catch:{ Throwable -> 0x001b }
        L_0x001b:
            if (r3 == 0) goto L_0x0020
            r3.close()     // Catch:{ Throwable -> 0x0020 }
        L_0x0020:
            return r1
        L_0x0021:
            int r2 = r0.available()     // Catch:{ Throwable -> 0x0040, all -> 0x003d }
            byte[] r2 = new byte[r2]     // Catch:{ Throwable -> 0x0040, all -> 0x003d }
            r0.read(r2)     // Catch:{ Throwable -> 0x003a, all -> 0x003d }
            if (r6 == 0) goto L_0x002f
            r4.c((java.lang.String) r5)     // Catch:{ Throwable -> 0x003a, all -> 0x003d }
        L_0x002f:
            if (r0 == 0) goto L_0x0034
            r0.close()     // Catch:{ Throwable -> 0x0034 }
        L_0x0034:
            if (r3 == 0) goto L_0x0039
            r3.close()     // Catch:{ Throwable -> 0x0039 }
        L_0x0039:
            return r2
        L_0x003a:
            r4 = move-exception
            r1 = r2
            goto L_0x0041
        L_0x003d:
            r4 = move-exception
            r2 = r0
            goto L_0x005d
        L_0x0040:
            r4 = move-exception
        L_0x0041:
            r2 = r0
            goto L_0x004a
        L_0x0043:
            r4 = move-exception
            goto L_0x004a
        L_0x0045:
            r4 = move-exception
            r3 = r2
            goto L_0x005d
        L_0x0048:
            r4 = move-exception
            r3 = r2
        L_0x004a:
            java.lang.String r5 = "sui"
            java.lang.String r6 = "rdS"
            com.amap.api.services.a.ca.c(r4, r5, r6)     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0056
            r2.close()     // Catch:{ Throwable -> 0x0056 }
        L_0x0056:
            if (r3 == 0) goto L_0x005b
            r3.close()     // Catch:{ Throwable -> 0x005b }
        L_0x005b:
            return r1
        L_0x005c:
            r4 = move-exception
        L_0x005d:
            if (r2 == 0) goto L_0x0062
            r2.close()     // Catch:{ Throwable -> 0x0062 }
        L_0x0062:
            if (r3 == 0) goto L_0x0067
            r3.close()     // Catch:{ Throwable -> 0x0067 }
        L_0x0067:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.dq.a(com.amap.api.services.a.cw, java.lang.String, boolean):byte[]");
    }

    public static String a(String str, String str2, String str3, int i, String str4, String str5) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str2);
        stringBuffer.append(",\"timestamp\":\"");
        stringBuffer.append(str3);
        stringBuffer.append("\",\"et\":\"");
        stringBuffer.append(i);
        stringBuffer.append("\",\"classname\":\"");
        stringBuffer.append(str4);
        stringBuffer.append("\",");
        stringBuffer.append("\"detail\":\"");
        stringBuffer.append(str5);
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }

    public static void a(Context context, dk dkVar, String str, int i, int i2, String str2) {
        dkVar.f6823a = by.a(context, str);
        dkVar.f6826d = i;
        dkVar.f6824b = (long) i2;
        dkVar.f6825c = str2;
    }
}
