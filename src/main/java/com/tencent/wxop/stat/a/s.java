package com.tencent.wxop.stat.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import org.json.JSONObject;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    private static String f79826a = "";

    public static String a(Context context) {
        try {
            if (a(context, "android.permission.READ_PHONE_STATE")) {
                String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
                if (deviceId != null) {
                    return deviceId;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        if (str2 != null) {
            try {
                if (str2.length() > 0) {
                    jSONObject.put(str, str2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean a(Context context, String str) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String b(Context context) {
        if (!a(context, "android.permission.ACCESS_WIFI_STATE")) {
            return "";
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            return wifiManager == null ? "" : wifiManager.getConnectionInfo().getMacAddress();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c(Context context) {
        try {
            WifiInfo f2 = f(context);
            if (f2 != null) {
                return f2.getBSSID();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String d(Context context) {
        try {
            WifiInfo f2 = f(context);
            if (f2 != null) {
                return f2.getSSID();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean e(Context context) {
        try {
            if (a(context, "android.permission.INTERNET") && a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static WifiInfo f(Context context) {
        if (a(context, "android.permission.ACCESS_WIFI_STATE")) {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager != null) {
                return wifiManager.getConnectionInfo();
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        r2.f79811c = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00db, code lost:
        r10 = (r10 << 6) | r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00de, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ed, code lost:
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010b, code lost:
        r2.f79811c = r7;
        r2.f79809b = r11;
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r15) {
        /*
            if (r15 != 0) goto L_0x0004
            r15 = 0
            return r15
        L_0x0004:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 8
            if (r0 >= r1) goto L_0x000b
            return r15
        L_0x000b:
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r15.getBytes(r0)     // Catch:{ Throwable -> 0x013b }
            int r1 = r0.length     // Catch:{ Throwable -> 0x013b }
            com.tencent.wxop.stat.a.l r2 = new com.tencent.wxop.stat.a.l     // Catch:{ Throwable -> 0x013b }
            int r3 = r1 * 3
            r4 = 4
            int r3 = r3 / r4
            byte[] r3 = new byte[r3]     // Catch:{ Throwable -> 0x013b }
            r5 = 0
            r2.<init>(r5, r3)     // Catch:{ Throwable -> 0x013b }
            int r3 = r2.f79811c     // Catch:{ Throwable -> 0x013b }
            r6 = 6
            if (r3 != r6) goto L_0x0026
        L_0x0023:
            r0 = 0
            goto L_0x0110
        L_0x0026:
            int r1 = r1 + r5
            int r3 = r2.f79811c     // Catch:{ Throwable -> 0x013b }
            int r7 = r2.f79812d     // Catch:{ Throwable -> 0x013b }
            byte[] r8 = r2.f79808a     // Catch:{ Throwable -> 0x013b }
            int[] r9 = r2.f79813e     // Catch:{ Throwable -> 0x013b }
            r10 = r7
            r11 = 0
            r7 = r3
            r3 = 0
        L_0x0033:
            if (r3 >= r1) goto L_0x00f0
            if (r7 != 0) goto L_0x007a
        L_0x0037:
            int r12 = r3 + 4
            if (r12 > r1) goto L_0x0078
            byte r10 = r0[r3]     // Catch:{ Throwable -> 0x013b }
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r9[r10]     // Catch:{ Throwable -> 0x013b }
            int r10 = r10 << 18
            int r13 = r3 + 1
            byte r13 = r0[r13]     // Catch:{ Throwable -> 0x013b }
            r13 = r13 & 255(0xff, float:3.57E-43)
            r13 = r9[r13]     // Catch:{ Throwable -> 0x013b }
            int r13 = r13 << 12
            r10 = r10 | r13
            int r13 = r3 + 2
            byte r13 = r0[r13]     // Catch:{ Throwable -> 0x013b }
            r13 = r13 & 255(0xff, float:3.57E-43)
            r13 = r9[r13]     // Catch:{ Throwable -> 0x013b }
            int r13 = r13 << r6
            r10 = r10 | r13
            int r13 = r3 + 3
            byte r13 = r0[r13]     // Catch:{ Throwable -> 0x013b }
            r13 = r13 & 255(0xff, float:3.57E-43)
            r13 = r9[r13]     // Catch:{ Throwable -> 0x013b }
            r10 = r10 | r13
            if (r10 < 0) goto L_0x0078
            int r3 = r11 + 2
            byte r13 = (byte) r10     // Catch:{ Throwable -> 0x013b }
            r8[r3] = r13     // Catch:{ Throwable -> 0x013b }
            int r3 = r11 + 1
            int r13 = r10 >> 8
            byte r13 = (byte) r13     // Catch:{ Throwable -> 0x013b }
            r8[r3] = r13     // Catch:{ Throwable -> 0x013b }
            int r3 = r10 >> 16
            byte r3 = (byte) r3     // Catch:{ Throwable -> 0x013b }
            r8[r11] = r3     // Catch:{ Throwable -> 0x013b }
            int r11 = r11 + 3
            r3 = r12
            goto L_0x0037
        L_0x0078:
            if (r3 >= r1) goto L_0x00f0
        L_0x007a:
            int r12 = r3 + 1
            byte r3 = r0[r3]     // Catch:{ Throwable -> 0x013b }
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r9[r3]     // Catch:{ Throwable -> 0x013b }
            r13 = -2
            r14 = -1
            switch(r7) {
                case 0: goto L_0x00e4;
                case 1: goto L_0x00d9;
                case 2: goto L_0x00c5;
                case 3: goto L_0x0094;
                case 4: goto L_0x008e;
                case 5: goto L_0x0089;
                default: goto L_0x0087;
            }     // Catch:{ Throwable -> 0x013b }
        L_0x0087:
            goto L_0x00ed
        L_0x0089:
            if (r3 == r14) goto L_0x00ed
        L_0x008b:
            r2.f79811c = r6     // Catch:{ Throwable -> 0x013b }
            goto L_0x0023
        L_0x008e:
            if (r3 != r13) goto L_0x0091
            goto L_0x00de
        L_0x0091:
            if (r3 == r14) goto L_0x00ed
            goto L_0x008b
        L_0x0094:
            if (r3 < 0) goto L_0x00b0
            int r7 = r10 << 6
            r10 = r7 | r3
            int r3 = r11 + 2
            byte r7 = (byte) r10     // Catch:{ Throwable -> 0x013b }
            r8[r3] = r7     // Catch:{ Throwable -> 0x013b }
            int r3 = r11 + 1
            int r7 = r10 >> 8
            byte r7 = (byte) r7     // Catch:{ Throwable -> 0x013b }
            r8[r3] = r7     // Catch:{ Throwable -> 0x013b }
            int r3 = r10 >> 16
            byte r3 = (byte) r3     // Catch:{ Throwable -> 0x013b }
            r8[r11] = r3     // Catch:{ Throwable -> 0x013b }
            int r11 = r11 + 3
            r3 = r12
            r7 = 0
            goto L_0x0033
        L_0x00b0:
            if (r3 != r13) goto L_0x00c2
            int r3 = r11 + 1
            int r7 = r10 >> 2
            byte r7 = (byte) r7     // Catch:{ Throwable -> 0x013b }
            r8[r3] = r7     // Catch:{ Throwable -> 0x013b }
            int r3 = r10 >> 10
            byte r3 = (byte) r3     // Catch:{ Throwable -> 0x013b }
            r8[r11] = r3     // Catch:{ Throwable -> 0x013b }
            int r11 = r11 + 2
            r7 = 5
            goto L_0x00ed
        L_0x00c2:
            if (r3 == r14) goto L_0x00ed
            goto L_0x008b
        L_0x00c5:
            if (r3 < 0) goto L_0x00c8
            goto L_0x00db
        L_0x00c8:
            if (r3 != r13) goto L_0x00d6
            int r3 = r11 + 1
            int r7 = r10 >> 4
            byte r7 = (byte) r7     // Catch:{ Throwable -> 0x013b }
            r8[r11] = r7     // Catch:{ Throwable -> 0x013b }
            r11 = r3
            r3 = r12
            r7 = 4
            goto L_0x0033
        L_0x00d6:
            if (r3 == r14) goto L_0x00ed
            goto L_0x008b
        L_0x00d9:
            if (r3 < 0) goto L_0x00e1
        L_0x00db:
            int r10 = r10 << 6
            r10 = r10 | r3
        L_0x00de:
            int r7 = r7 + 1
            goto L_0x00ed
        L_0x00e1:
            if (r3 == r14) goto L_0x00ed
            goto L_0x008b
        L_0x00e4:
            if (r3 < 0) goto L_0x00ea
            int r7 = r7 + 1
            r10 = r3
            goto L_0x00ed
        L_0x00ea:
            if (r3 == r14) goto L_0x00ed
            goto L_0x008b
        L_0x00ed:
            r3 = r12
            goto L_0x0033
        L_0x00f0:
            switch(r7) {
                case 0: goto L_0x010b;
                case 1: goto L_0x008b;
                case 2: goto L_0x0103;
                case 3: goto L_0x00f4;
                case 4: goto L_0x008b;
                default: goto L_0x00f3;
            }     // Catch:{ Throwable -> 0x013b }
        L_0x00f3:
            goto L_0x010b
        L_0x00f4:
            int r0 = r11 + 1
            int r1 = r10 >> 10
            byte r1 = (byte) r1     // Catch:{ Throwable -> 0x013b }
            r8[r11] = r1     // Catch:{ Throwable -> 0x013b }
            int r11 = r0 + 1
            int r1 = r10 >> 2
            byte r1 = (byte) r1     // Catch:{ Throwable -> 0x013b }
            r8[r0] = r1     // Catch:{ Throwable -> 0x013b }
            goto L_0x010b
        L_0x0103:
            int r0 = r11 + 1
            int r1 = r10 >> 4
            byte r1 = (byte) r1     // Catch:{ Throwable -> 0x013b }
            r8[r11] = r1     // Catch:{ Throwable -> 0x013b }
            r11 = r0
        L_0x010b:
            r2.f79811c = r7     // Catch:{ Throwable -> 0x013b }
            r2.f79809b = r11     // Catch:{ Throwable -> 0x013b }
            r0 = 1
        L_0x0110:
            if (r0 == 0) goto L_0x0133
            int r0 = r2.f79809b     // Catch:{ Throwable -> 0x013b }
            byte[] r1 = r2.f79808a     // Catch:{ Throwable -> 0x013b }
            int r1 = r1.length     // Catch:{ Throwable -> 0x013b }
            if (r0 != r1) goto L_0x011c
            byte[] r0 = r2.f79808a     // Catch:{ Throwable -> 0x013b }
            goto L_0x0127
        L_0x011c:
            int r0 = r2.f79809b     // Catch:{ Throwable -> 0x013b }
            byte[] r0 = new byte[r0]     // Catch:{ Throwable -> 0x013b }
            byte[] r1 = r2.f79808a     // Catch:{ Throwable -> 0x013b }
            int r2 = r2.f79809b     // Catch:{ Throwable -> 0x013b }
            java.lang.System.arraycopy(r1, r5, r0, r5, r2)     // Catch:{ Throwable -> 0x013b }
        L_0x0127:
            byte[] r0 = com.tencent.wxop.stat.a.h.b(r0)     // Catch:{ Throwable -> 0x013b }
            java.lang.String r1 = new java.lang.String     // Catch:{ Throwable -> 0x013b }
            java.lang.String r2 = "UTF-8"
            r1.<init>(r0, r2)     // Catch:{ Throwable -> 0x013b }
            return r1
        L_0x0133:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x013b }
            java.lang.String r1 = "bad base-64"
            r0.<init>(r1)     // Catch:{ Throwable -> 0x013b }
            throw r0     // Catch:{ Throwable -> 0x013b }
        L_0x013b:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.a.s.a(java.lang.String):java.lang.String");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0217 A[Catch:{ Throwable -> 0x024c }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0226 A[Catch:{ Throwable -> 0x024c }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0237 A[Catch:{ Throwable -> 0x024c }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x012f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d9 A[Catch:{ Throwable -> 0x024c }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0137 A[Catch:{ Throwable -> 0x024c }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0188 A[Catch:{ Throwable -> 0x024c }] */
    public static java.lang.String b(java.lang.String r20) {
        /*
            r0 = r20
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 8
            if (r1 >= r2) goto L_0x000d
            return r0
        L_0x000d:
            java.lang.String r1 = "UTF-8"
            byte[] r1 = r0.getBytes(r1)     // Catch:{ Throwable -> 0x024c }
            byte[] r1 = com.tencent.wxop.stat.a.h.a(r1)     // Catch:{ Throwable -> 0x024c }
            int r3 = r1.length     // Catch:{ Throwable -> 0x024c }
            com.tencent.wxop.stat.a.m r4 = new com.tencent.wxop.stat.a.m     // Catch:{ Throwable -> 0x024c }
            r5 = 0
            r6 = 0
            r4.<init>(r6, r5)     // Catch:{ Throwable -> 0x024c }
            int r5 = r3 / 3
            r7 = 4
            int r5 = r5 * 4
            boolean r8 = r4.f79817f     // Catch:{ Throwable -> 0x024c }
            if (r8 == 0) goto L_0x002f
            int r8 = r3 % 3
            if (r8 <= 0) goto L_0x003a
            int r5 = r5 + 4
            goto L_0x003a
        L_0x002f:
            int r8 = r3 % 3
            switch(r8) {
                case 0: goto L_0x003a;
                case 1: goto L_0x0038;
                case 2: goto L_0x0035;
                default: goto L_0x0034;
            }     // Catch:{ Throwable -> 0x024c }
        L_0x0034:
            goto L_0x003a
        L_0x0035:
            int r5 = r5 + 3
            goto L_0x003a
        L_0x0038:
            int r5 = r5 + 2
        L_0x003a:
            boolean r8 = r4.g     // Catch:{ Throwable -> 0x024c }
            r9 = 2
            r10 = 1
            if (r8 == 0) goto L_0x0051
            if (r3 <= 0) goto L_0x0051
            int r8 = r3 + -1
            int r8 = r8 / 57
            int r8 = r8 + r10
            boolean r11 = r4.h     // Catch:{ Throwable -> 0x024c }
            if (r11 == 0) goto L_0x004d
            r11 = 2
            goto L_0x004e
        L_0x004d:
            r11 = 1
        L_0x004e:
            int r8 = r8 * r11
            int r5 = r5 + r8
        L_0x0051:
            byte[] r8 = new byte[r5]     // Catch:{ Throwable -> 0x024c }
            r4.f79808a = r8     // Catch:{ Throwable -> 0x024c }
            byte[] r8 = r4.i     // Catch:{ Throwable -> 0x024c }
            byte[] r11 = r4.f79808a     // Catch:{ Throwable -> 0x024c }
            int r12 = r4.f79816e     // Catch:{ Throwable -> 0x024c }
            int r3 = r3 + r6
            int r13 = r4.f79815d     // Catch:{ Throwable -> 0x024c }
            r14 = -1
            switch(r13) {
                case 0: goto L_0x0097;
                case 1: goto L_0x007e;
                case 2: goto L_0x0063;
                default: goto L_0x0062;
            }     // Catch:{ Throwable -> 0x024c }
        L_0x0062:
            goto L_0x0097
        L_0x0063:
            if (r10 > r3) goto L_0x0097
            byte[] r13 = r4.f79814c     // Catch:{ Throwable -> 0x024c }
            byte r13 = r13[r6]     // Catch:{ Throwable -> 0x024c }
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 16
            byte[] r15 = r4.f79814c     // Catch:{ Throwable -> 0x024c }
            byte r15 = r15[r10]     // Catch:{ Throwable -> 0x024c }
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r15 = r15 << r2
            r13 = r13 | r15
            byte r15 = r1[r6]     // Catch:{ Throwable -> 0x024c }
            r15 = r15 & 255(0xff, float:3.57E-43)
            r13 = r13 | r15
            r4.f79815d = r6     // Catch:{ Throwable -> 0x024c }
            r15 = 1
            goto L_0x0099
        L_0x007e:
            if (r9 > r3) goto L_0x0097
            byte[] r13 = r4.f79814c     // Catch:{ Throwable -> 0x024c }
            byte r13 = r13[r6]     // Catch:{ Throwable -> 0x024c }
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 16
            byte r15 = r1[r6]     // Catch:{ Throwable -> 0x024c }
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r15 = r15 << r2
            r13 = r13 | r15
            byte r15 = r1[r10]     // Catch:{ Throwable -> 0x024c }
            r15 = r15 & 255(0xff, float:3.57E-43)
            r13 = r13 | r15
            r4.f79815d = r6     // Catch:{ Throwable -> 0x024c }
            r15 = 2
            goto L_0x0099
        L_0x0097:
            r13 = -1
            r15 = 0
        L_0x0099:
            r17 = 13
            r18 = 10
            if (r13 == r14) goto L_0x00d4
            int r14 = r13 >> 18
            r14 = r14 & 63
            byte r14 = r8[r14]     // Catch:{ Throwable -> 0x024c }
            r11[r6] = r14     // Catch:{ Throwable -> 0x024c }
            int r14 = r13 >> 12
            r14 = r14 & 63
            byte r14 = r8[r14]     // Catch:{ Throwable -> 0x024c }
            r11[r10] = r14     // Catch:{ Throwable -> 0x024c }
            int r14 = r13 >> 6
            r14 = r14 & 63
            byte r14 = r8[r14]     // Catch:{ Throwable -> 0x024c }
            r11[r9] = r14     // Catch:{ Throwable -> 0x024c }
            r13 = r13 & 63
            byte r13 = r8[r13]     // Catch:{ Throwable -> 0x024c }
            r14 = 3
            r11[r14] = r13     // Catch:{ Throwable -> 0x024c }
            int r12 = r12 + -1
            if (r12 != 0) goto L_0x00d2
            boolean r12 = r4.h     // Catch:{ Throwable -> 0x024c }
            if (r12 == 0) goto L_0x00ca
            r12 = 5
            r11[r7] = r17     // Catch:{ Throwable -> 0x024c }
            goto L_0x00cb
        L_0x00ca:
            r12 = 4
        L_0x00cb:
            int r13 = r12 + 1
            r11[r12] = r18     // Catch:{ Throwable -> 0x024c }
        L_0x00cf:
            r12 = 19
            goto L_0x00d5
        L_0x00d2:
            r13 = 4
            goto L_0x00d5
        L_0x00d4:
            r13 = 0
        L_0x00d5:
            int r14 = r15 + 3
            if (r14 > r3) goto L_0x012f
            byte r2 = r1[r15]     // Catch:{ Throwable -> 0x024c }
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            int r19 = r15 + 1
            byte r9 = r1[r19]     // Catch:{ Throwable -> 0x024c }
            r9 = r9 & 255(0xff, float:3.57E-43)
            r16 = 8
            int r9 = r9 << 8
            r2 = r2 | r9
            int r15 = r15 + 2
            byte r9 = r1[r15]     // Catch:{ Throwable -> 0x024c }
            r9 = r9 & 255(0xff, float:3.57E-43)
            r2 = r2 | r9
            int r9 = r2 >> 18
            r9 = r9 & 63
            byte r9 = r8[r9]     // Catch:{ Throwable -> 0x024c }
            r11[r13] = r9     // Catch:{ Throwable -> 0x024c }
            int r9 = r13 + 1
            int r15 = r2 >> 12
            r15 = r15 & 63
            byte r15 = r8[r15]     // Catch:{ Throwable -> 0x024c }
            r11[r9] = r15     // Catch:{ Throwable -> 0x024c }
            int r9 = r13 + 2
            int r15 = r2 >> 6
            r15 = r15 & 63
            byte r15 = r8[r15]     // Catch:{ Throwable -> 0x024c }
            r11[r9] = r15     // Catch:{ Throwable -> 0x024c }
            int r9 = r13 + 3
            r2 = r2 & 63
            byte r2 = r8[r2]     // Catch:{ Throwable -> 0x024c }
            r11[r9] = r2     // Catch:{ Throwable -> 0x024c }
            int r13 = r13 + 4
            int r12 = r12 + -1
            if (r12 != 0) goto L_0x012c
            boolean r2 = r4.h     // Catch:{ Throwable -> 0x024c }
            if (r2 == 0) goto L_0x0124
            int r2 = r13 + 1
            r11[r13] = r17     // Catch:{ Throwable -> 0x024c }
            goto L_0x0125
        L_0x0124:
            r2 = r13
        L_0x0125:
            int r13 = r2 + 1
            r11[r2] = r18     // Catch:{ Throwable -> 0x024c }
            r15 = r14
            r9 = 2
            goto L_0x00cf
        L_0x012c:
            r15 = r14
            r9 = 2
            goto L_0x00d5
        L_0x012f:
            int r2 = r4.f79815d     // Catch:{ Throwable -> 0x024c }
            int r2 = r15 - r2
            int r9 = r3 + -1
            if (r2 != r9) goto L_0x0188
            int r2 = r4.f79815d     // Catch:{ Throwable -> 0x024c }
            if (r2 <= 0) goto L_0x0141
            byte[] r1 = r4.f79814c     // Catch:{ Throwable -> 0x024c }
            byte r1 = r1[r6]     // Catch:{ Throwable -> 0x024c }
            r6 = 1
            goto L_0x0146
        L_0x0141:
            int r2 = r15 + 1
            byte r1 = r1[r15]     // Catch:{ Throwable -> 0x024c }
            r15 = r2
        L_0x0146:
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r7
            int r2 = r4.f79815d     // Catch:{ Throwable -> 0x024c }
            int r2 = r2 - r6
            r4.f79815d = r2     // Catch:{ Throwable -> 0x024c }
            int r2 = r13 + 1
            int r6 = r1 >> 6
            r6 = r6 & 63
            byte r6 = r8[r6]     // Catch:{ Throwable -> 0x024c }
            r11[r13] = r6     // Catch:{ Throwable -> 0x024c }
            int r6 = r2 + 1
            r1 = r1 & 63
            byte r1 = r8[r1]     // Catch:{ Throwable -> 0x024c }
            r11[r2] = r1     // Catch:{ Throwable -> 0x024c }
            boolean r1 = r4.f79817f     // Catch:{ Throwable -> 0x024c }
            if (r1 == 0) goto L_0x0170
            int r1 = r6 + 1
            r2 = 61
            r11[r6] = r2     // Catch:{ Throwable -> 0x024c }
            int r6 = r1 + 1
            r2 = 61
            r11[r1] = r2     // Catch:{ Throwable -> 0x024c }
        L_0x0170:
            boolean r1 = r4.g     // Catch:{ Throwable -> 0x024c }
            if (r1 == 0) goto L_0x0185
            boolean r1 = r4.h     // Catch:{ Throwable -> 0x024c }
            if (r1 == 0) goto L_0x017d
            int r1 = r6 + 1
            r11[r6] = r17     // Catch:{ Throwable -> 0x024c }
            goto L_0x017e
        L_0x017d:
            r1 = r6
        L_0x017e:
            int r2 = r1 + 1
            r11[r1] = r18     // Catch:{ Throwable -> 0x024c }
        L_0x0182:
            r13 = r2
            goto L_0x0213
        L_0x0185:
            r13 = r6
            goto L_0x0213
        L_0x0188:
            int r2 = r4.f79815d     // Catch:{ Throwable -> 0x024c }
            int r2 = r15 - r2
            int r7 = r3 + -2
            if (r2 != r7) goto L_0x01fb
            int r2 = r4.f79815d     // Catch:{ Throwable -> 0x024c }
            if (r2 <= r10) goto L_0x019a
            byte[] r2 = r4.f79814c     // Catch:{ Throwable -> 0x024c }
            byte r2 = r2[r6]     // Catch:{ Throwable -> 0x024c }
            r6 = 1
            goto L_0x01a0
        L_0x019a:
            int r2 = r15 + 1
            byte r7 = r1[r15]     // Catch:{ Throwable -> 0x024c }
            r15 = r2
            r2 = r7
        L_0x01a0:
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 10
            int r7 = r4.f79815d     // Catch:{ Throwable -> 0x024c }
            if (r7 <= 0) goto L_0x01b0
            byte[] r1 = r4.f79814c     // Catch:{ Throwable -> 0x024c }
            int r7 = r6 + 1
            byte r1 = r1[r6]     // Catch:{ Throwable -> 0x024c }
            r6 = r7
            goto L_0x01b5
        L_0x01b0:
            int r7 = r15 + 1
            byte r1 = r1[r15]     // Catch:{ Throwable -> 0x024c }
            r15 = r7
        L_0x01b5:
            r1 = r1 & 255(0xff, float:3.57E-43)
            r7 = 2
            int r1 = r1 << r7
            r1 = r1 | r2
            int r2 = r4.f79815d     // Catch:{ Throwable -> 0x024c }
            int r2 = r2 - r6
            r4.f79815d = r2     // Catch:{ Throwable -> 0x024c }
            int r2 = r13 + 1
            int r6 = r1 >> 12
            r6 = r6 & 63
            byte r6 = r8[r6]     // Catch:{ Throwable -> 0x024c }
            r11[r13] = r6     // Catch:{ Throwable -> 0x024c }
            int r6 = r2 + 1
            int r7 = r1 >> 6
            r7 = r7 & 63
            byte r7 = r8[r7]     // Catch:{ Throwable -> 0x024c }
            r11[r2] = r7     // Catch:{ Throwable -> 0x024c }
            int r2 = r6 + 1
            r1 = r1 & 63
            byte r1 = r8[r1]     // Catch:{ Throwable -> 0x024c }
            r11[r6] = r1     // Catch:{ Throwable -> 0x024c }
            boolean r1 = r4.f79817f     // Catch:{ Throwable -> 0x024c }
            if (r1 == 0) goto L_0x01e6
            int r1 = r2 + 1
            r6 = 61
            r11[r2] = r6     // Catch:{ Throwable -> 0x024c }
            goto L_0x01e7
        L_0x01e6:
            r1 = r2
        L_0x01e7:
            boolean r2 = r4.g     // Catch:{ Throwable -> 0x024c }
            if (r2 == 0) goto L_0x01f9
            boolean r2 = r4.h     // Catch:{ Throwable -> 0x024c }
            if (r2 == 0) goto L_0x01f4
            int r2 = r1 + 1
            r11[r1] = r17     // Catch:{ Throwable -> 0x024c }
            r1 = r2
        L_0x01f4:
            int r2 = r1 + 1
            r11[r1] = r18     // Catch:{ Throwable -> 0x024c }
            goto L_0x0182
        L_0x01f9:
            r13 = r1
            goto L_0x0213
        L_0x01fb:
            boolean r1 = r4.g     // Catch:{ Throwable -> 0x024c }
            if (r1 == 0) goto L_0x0213
            if (r13 <= 0) goto L_0x0213
            r1 = 19
            if (r12 == r1) goto L_0x0213
            boolean r1 = r4.h     // Catch:{ Throwable -> 0x024c }
            if (r1 == 0) goto L_0x020e
            int r1 = r13 + 1
            r11[r13] = r17     // Catch:{ Throwable -> 0x024c }
            goto L_0x020f
        L_0x020e:
            r1 = r13
        L_0x020f:
            int r13 = r1 + 1
            r11[r1] = r18     // Catch:{ Throwable -> 0x024c }
        L_0x0213:
            boolean r1 = com.tencent.wxop.stat.a.m.j     // Catch:{ Throwable -> 0x024c }
            if (r1 != 0) goto L_0x0222
            int r1 = r4.f79815d     // Catch:{ Throwable -> 0x024c }
            if (r1 != 0) goto L_0x021c
            goto L_0x0222
        L_0x021c:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ Throwable -> 0x024c }
            r1.<init>()     // Catch:{ Throwable -> 0x024c }
            throw r1     // Catch:{ Throwable -> 0x024c }
        L_0x0222:
            boolean r1 = com.tencent.wxop.stat.a.m.j     // Catch:{ Throwable -> 0x024c }
            if (r1 != 0) goto L_0x022f
            if (r15 != r3) goto L_0x0229
            goto L_0x022f
        L_0x0229:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ Throwable -> 0x024c }
            r1.<init>()     // Catch:{ Throwable -> 0x024c }
            throw r1     // Catch:{ Throwable -> 0x024c }
        L_0x022f:
            r4.f79809b = r13     // Catch:{ Throwable -> 0x024c }
            r4.f79816e = r12     // Catch:{ Throwable -> 0x024c }
            boolean r1 = com.tencent.wxop.stat.a.j.f79807a     // Catch:{ Throwable -> 0x024c }
            if (r1 != 0) goto L_0x0242
            int r1 = r4.f79809b     // Catch:{ Throwable -> 0x024c }
            if (r1 != r5) goto L_0x023c
            goto L_0x0242
        L_0x023c:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ Throwable -> 0x024c }
            r1.<init>()     // Catch:{ Throwable -> 0x024c }
            throw r1     // Catch:{ Throwable -> 0x024c }
        L_0x0242:
            byte[] r1 = r4.f79808a     // Catch:{ Throwable -> 0x024c }
            java.lang.String r2 = new java.lang.String     // Catch:{ Throwable -> 0x024c }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch:{ Throwable -> 0x024c }
            return r2
        L_0x024c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.a.s.b(java.lang.String):java.lang.String");
    }
}
