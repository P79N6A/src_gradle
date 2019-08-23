package com.loc;

import android.content.Context;
import com.google.a.a.a.a.a.a;
import java.lang.ref.WeakReference;

public final class aw {
    public static an a(WeakReference<an> weakReference) {
        if (weakReference == null || weakReference.get() == null) {
            weakReference = new WeakReference<>(new an());
        }
        return (an) weakReference.get();
    }

    public static String a(Context context, dh dhVar) {
        StringBuilder sb = new StringBuilder();
        try {
            String g = dc.g(context);
            sb.append("\"sim\":\"");
            sb.append(g);
            sb.append("\",\"sdkversion\":\"");
            sb.append(dhVar.b());
            sb.append("\",\"product\":\"");
            sb.append(dhVar.a());
            sb.append("\",\"ed\":\"");
            sb.append(dhVar.c());
            sb.append("\",\"nt\":\"");
            sb.append(dc.e(context));
            sb.append("\",\"np\":\"");
            sb.append(dc.c(context));
            sb.append("\",\"mnc\":\"");
            sb.append(dc.d(context));
            sb.append("\",\"ant\":\"");
            sb.append(dc.f(context));
            sb.append("\"");
        } catch (Throwable th) {
            a.b(th);
        }
        return sb.toString();
    }

    public static void a(Context context, an anVar, String str, int i, int i2, String str2) {
        anVar.f25476a = g.c(context, str);
        anVar.f25479d = i;
        anVar.f25477b = (long) i2;
        anVar.f25478c = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x004e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x004f, code lost:
        r2 = r5;
        r5 = r1;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0053, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0054, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x006f, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0070, code lost:
        com.google.a.a.a.a.a.a.b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0079, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x007a, code lost:
        com.google.a.a.a.a.a.a.b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0085, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0086, code lost:
        com.google.a.a.a.a.a.a.b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x008f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0090, code lost:
        com.google.a.a.a.a.a.a.b(r4);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0053 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:24:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x006b A[SYNTHETIC, Splitter:B:54:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0075 A[SYNTHETIC, Splitter:B:59:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0081 A[SYNTHETIC, Splitter:B:66:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x008b A[SYNTHETIC, Splitter:B:71:0x008b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static byte[] a(com.loc.ad r4, java.lang.String r5) {
        /*
            r0 = 0
            byte[] r1 = new byte[r0]
            r2 = 0
            com.loc.ad$b r4 = r4.a((java.lang.String) r5)     // Catch:{ Throwable -> 0x005f, all -> 0x005c }
            if (r4 != 0) goto L_0x0015
            if (r4 == 0) goto L_0x0014
            r4.close()     // Catch:{ Throwable -> 0x0010 }
            goto L_0x0014
        L_0x0010:
            r4 = move-exception
            com.google.a.a.a.a.a.a.b(r4)
        L_0x0014:
            return r1
        L_0x0015:
            java.io.InputStream[] r5 = r4.f25434a     // Catch:{ Throwable -> 0x005a }
            r5 = r5[r0]     // Catch:{ Throwable -> 0x005a }
            if (r5 != 0) goto L_0x0030
            if (r5 == 0) goto L_0x0025
            r5.close()     // Catch:{ Throwable -> 0x0021 }
            goto L_0x0025
        L_0x0021:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x0025:
            if (r4 == 0) goto L_0x002f
            r4.close()     // Catch:{ Throwable -> 0x002b }
            goto L_0x002f
        L_0x002b:
            r4 = move-exception
            com.google.a.a.a.a.a.a.b(r4)
        L_0x002f:
            return r1
        L_0x0030:
            int r0 = r5.available()     // Catch:{ Throwable -> 0x0056, all -> 0x0053 }
            byte[] r0 = new byte[r0]     // Catch:{ Throwable -> 0x0056, all -> 0x0053 }
            r5.read(r0)     // Catch:{ Throwable -> 0x004e, all -> 0x0053 }
            if (r5 == 0) goto L_0x0043
            r5.close()     // Catch:{ Throwable -> 0x003f }
            goto L_0x0043
        L_0x003f:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x0043:
            if (r4 == 0) goto L_0x004d
            r4.close()     // Catch:{ Throwable -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            r4 = move-exception
            com.google.a.a.a.a.a.a.b(r4)
        L_0x004d:
            return r0
        L_0x004e:
            r1 = move-exception
            r2 = r5
            r5 = r1
            r1 = r0
            goto L_0x0062
        L_0x0053:
            r0 = move-exception
            r2 = r5
            goto L_0x007f
        L_0x0056:
            r0 = move-exception
            r2 = r5
            r5 = r0
            goto L_0x0062
        L_0x005a:
            r5 = move-exception
            goto L_0x0062
        L_0x005c:
            r0 = move-exception
            r4 = r2
            goto L_0x007f
        L_0x005f:
            r4 = move-exception
            r5 = r4
            r4 = r2
        L_0x0062:
            java.lang.String r0 = "sui"
            java.lang.String r3 = "rdS"
            com.loc.i.b((java.lang.Throwable) r5, (java.lang.String) r0, (java.lang.String) r3)     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x0073
            r2.close()     // Catch:{ Throwable -> 0x006f }
            goto L_0x0073
        L_0x006f:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x0073:
            if (r4 == 0) goto L_0x007d
            r4.close()     // Catch:{ Throwable -> 0x0079 }
            goto L_0x007d
        L_0x0079:
            r4 = move-exception
            com.google.a.a.a.a.a.a.b(r4)
        L_0x007d:
            return r1
        L_0x007e:
            r0 = move-exception
        L_0x007f:
            if (r2 == 0) goto L_0x0089
            r2.close()     // Catch:{ Throwable -> 0x0085 }
            goto L_0x0089
        L_0x0085:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x0089:
            if (r4 == 0) goto L_0x0093
            r4.close()     // Catch:{ Throwable -> 0x008f }
            goto L_0x0093
        L_0x008f:
            r4 = move-exception
            com.google.a.a.a.a.a.a.b(r4)
        L_0x0093:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.aw.a(com.loc.ad, java.lang.String):byte[]");
    }
}
