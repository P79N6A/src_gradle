package com.ss.android.downloadlib.c;

import android.os.Build;
import android.text.TextUtils;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static String f28894a;

    /* renamed from: b  reason: collision with root package name */
    private static String f28895b;

    /* renamed from: c  reason: collision with root package name */
    private static String f28896c;

    private static String a() {
        if (Build.MANUFACTURER == null) {
            return "";
        }
        return Build.MANUFACTURER.trim();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038 A[SYNTHETIC, Splitter:B:13:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f A[SYNTHETIC, Splitter:B:21:0x003f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b(java.lang.String r4) {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.String r3 = "getprop "
            r2.<init>(r3)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            r2.append(r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.String r4 = r2.toString()     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.Process r4 = r1.exec(r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.String r4 = r1.readLine()     // Catch:{ IOException -> 0x003d, all -> 0x0032 }
            r1.close()     // Catch:{ IOException -> 0x003d, all -> 0x0032 }
            r1.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            return r4
        L_0x0032:
            r4 = move-exception
            r0 = r1
            goto L_0x0036
        L_0x0035:
            r4 = move-exception
        L_0x0036:
            if (r0 == 0) goto L_0x003b
            r0.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            throw r4
        L_0x003c:
            r1 = r0
        L_0x003d:
            if (r1 == 0) goto L_0x0042
            r1.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.c.i.b(java.lang.String):java.lang.String");
    }

    public static boolean a(String str) {
        if (f28895b != null) {
            return f28895b.equals(str);
        }
        String b2 = b("ro.miui.ui.version.name");
        f28896c = b2;
        if (!TextUtils.isEmpty(b2)) {
            f28895b = "MIUI";
            f28894a = "com.xiaomi.market";
        } else {
            String b3 = b("ro.build.version.emui");
            f28896c = b3;
            if (!TextUtils.isEmpty(b3)) {
                f28895b = "EMUI";
                f28894a = "com.huawei.appmarket";
            } else {
                String b4 = b("ro.build.version.opporom");
                f28896c = b4;
                if (!TextUtils.isEmpty(b4)) {
                    f28895b = "OPPO";
                    f28894a = "com.oppo.market";
                } else {
                    String b5 = b("ro.vivo.os.version");
                    f28896c = b5;
                    if (!TextUtils.isEmpty(b5)) {
                        f28895b = "VIVO";
                        f28894a = "com.bbk.appstore";
                    } else {
                        String b6 = b("ro.smartisan.version");
                        f28896c = b6;
                        if (!TextUtils.isEmpty(b6)) {
                            f28895b = "SMARTISAN";
                            f28894a = "com.smartisanos.appstore";
                        } else {
                            String b7 = b("ro.gn.sv.version");
                            f28896c = b7;
                            if (!TextUtils.isEmpty(b7)) {
                                f28895b = "QIONEE";
                            } else {
                                String b8 = b("ro.lenovo.lvp.version");
                                f28896c = b8;
                                if (!TextUtils.isEmpty(b8)) {
                                    f28895b = "LENOVO";
                                    f28894a = "com.lenovo.leos.appstore";
                                } else if (a().toLowerCase().contains("samsung")) {
                                    f28895b = "samsung";
                                    f28894a = "com.smartisanos.appstore";
                                } else if (a().toLowerCase().contains("zte")) {
                                    f28895b = "zte";
                                    f28894a = "cn.nubia.neostore";
                                } else {
                                    String str2 = Build.DISPLAY;
                                    f28896c = str2;
                                    if (str2.toUpperCase().contains("FLYME")) {
                                        f28895b = "FLYME";
                                        f28894a = "";
                                    } else {
                                        f28896c = "unknown";
                                        f28895b = Build.MANUFACTURER.toUpperCase();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return f28895b.equals(str);
    }
}
