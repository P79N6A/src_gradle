package com.bytedance.crash.i;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final CharSequence f19478a = "amigo";

    /* renamed from: b  reason: collision with root package name */
    public static final CharSequence f19479b = "funtouch";

    /* renamed from: c  reason: collision with root package name */
    private static final CharSequence f19480c = "sony";

    public static boolean a() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase(Locale.getDefault()).contains("oppo");
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0029] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r5) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            java.lang.String r4 = "getprop "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            r3.append(r5)     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            java.lang.String r5 = r3.toString()     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            java.lang.Process r5 = r2.exec(r5)     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            java.io.InputStream r4 = r5.getInputStream()     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            r4 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            java.lang.String r1 = r2.readLine()     // Catch:{ Throwable -> 0x003f, all -> 0x0036 }
            r5.destroy()     // Catch:{ Throwable -> 0x0034, all -> 0x0036 }
            com.bytedance.crash.i.f.a((java.io.Closeable) r2)
            return r1
        L_0x0034:
            r0 = r1
            goto L_0x003f
        L_0x0036:
            r5 = move-exception
            r1 = r2
            goto L_0x003a
        L_0x0039:
            r5 = move-exception
        L_0x003a:
            com.bytedance.crash.i.f.a((java.io.Closeable) r1)
            throw r5
        L_0x003e:
            r2 = r1
        L_0x003f:
            com.bytedance.crash.i.f.a((java.io.Closeable) r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.i.l.a(java.lang.String):java.lang.String");
    }
}
