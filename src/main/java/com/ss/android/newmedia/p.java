package com.ss.android.newmedia;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30260a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f30261b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f30262c;

    private static String d() {
        if (PatchProxy.isSupport(new Object[0], null, f30260a, true, 18442, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f30260a, true, 18442, new Class[0], String.class);
        }
        return a("ro.build.version.emui");
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f30260a, true, 18444, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f30260a, true, 18444, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!f30262c) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f30261b = true;
                    f30262c = true;
                    return f30261b;
                }
            } catch (Exception unused) {
            }
            f30262c = true;
        }
        return f30261b;
    }

    public static boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f30260a, true, 18440, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f30260a, true, 18440, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            if ((!StringUtils.isEmpty(Build.BRAND) && Build.BRAND.toLowerCase().startsWith("huawei")) || (!StringUtils.isEmpty(Build.MANUFACTURER) && Build.MANUFACTURER.toLowerCase().startsWith("huawei"))) {
                z = true;
            }
        } catch (Throwable unused) {
        }
        return z;
    }

    public static String c() {
        boolean z;
        String str;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], null, f30260a, true, 18445, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f30260a, true, 18445, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        try {
            if (b()) {
                sb.append("MIUI-");
            } else if (ToolUtils.isFlyme()) {
                sb.append("FLYME-");
            } else {
                String d2 = d();
                if (PatchProxy.isSupport(new Object[]{d2}, null, f30260a, true, 18441, new Class[]{String.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{d2}, null, f30260a, true, 18441, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                } else {
                    if (TextUtils.isEmpty(d2)) {
                        str = d();
                    } else {
                        str = d2;
                    }
                    if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("emotionui")) {
                        if (!a()) {
                            z = false;
                        }
                    }
                    z = true;
                }
                if (z) {
                    if (PatchProxy.isSupport(new Object[0], null, f30260a, true, 18446, new Class[0], Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f30260a, true, 18446, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if ("angler".equals(Build.BOARD) && Build.MODEL != null && Build.MODEL.toLowerCase().contains("nexus") && Build.MODEL.toLowerCase().contains("6p")) {
                        z2 = true;
                    }
                    if (!z2) {
                        sb.append("EMUI-");
                    }
                }
                if (!TextUtils.isEmpty(d2)) {
                    sb.append(d2);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071 A[SYNTHETIC, Splitter:B:22:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078 A[SYNTHETIC, Splitter:B:29:0x0078] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f30260a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 18443(0x480b, float:2.5844E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f30260a
            r13 = 1
            r14 = 18443(0x480b, float:2.5844E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0035:
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            java.lang.String r4 = "getprop "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            r3.append(r0)     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            java.lang.String r0 = r3.toString()     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            java.lang.Process r0 = r2.exec(r0)     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            r3.<init>(r0)     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            r0 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r0)     // Catch:{ Throwable -> 0x0075, all -> 0x006e }
            java.lang.String r0 = r2.readLine()     // Catch:{ Throwable -> 0x006c, all -> 0x0069 }
            r2.close()     // Catch:{ Throwable -> 0x0067, all -> 0x0069 }
            r2.close()     // Catch:{ IOException -> 0x0066 }
        L_0x0066:
            return r0
        L_0x0067:
            r1 = r0
            goto L_0x0076
        L_0x0069:
            r0 = move-exception
            r1 = r2
            goto L_0x006f
        L_0x006c:
            goto L_0x0076
        L_0x006e:
            r0 = move-exception
        L_0x006f:
            if (r1 == 0) goto L_0x0074
            r1.close()     // Catch:{ IOException -> 0x0074 }
        L_0x0074:
            throw r0
        L_0x0075:
            r2 = r1
        L_0x0076:
            if (r2 == 0) goto L_0x007b
            r2.close()     // Catch:{ IOException -> 0x007b }
        L_0x007b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.p.a(java.lang.String):java.lang.String");
    }
}
