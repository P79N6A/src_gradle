package com.alipay.d.a.a.b;

import java.io.File;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f5360a = new d();

    private d() {
    }

    public static String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{str, str2});
        } catch (Exception unused) {
            return str2;
        }
    }

    public static boolean a() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        int i = 0;
        while (i < 5) {
            try {
                if (new File(strArr[i] + "su").exists()) {
                    return true;
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055 A[Catch:{ Exception -> 0x0066 }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r7) {
        /*
            r0 = 0
            java.lang.String r1 = android.os.Build.HARDWARE     // Catch:{ Exception -> 0x0066 }
            java.lang.String r2 = "goldfish"
            boolean r1 = r1.contains(r2)     // Catch:{ Exception -> 0x0066 }
            r2 = 1
            if (r1 != 0) goto L_0x0065
            java.lang.String r1 = android.os.Build.PRODUCT     // Catch:{ Exception -> 0x0066 }
            java.lang.String r3 = "sdk"
            boolean r1 = r1.contains(r3)     // Catch:{ Exception -> 0x0066 }
            if (r1 != 0) goto L_0x0065
            java.lang.String r1 = android.os.Build.FINGERPRINT     // Catch:{ Exception -> 0x0066 }
            java.lang.String r3 = "generic"
            boolean r1 = r1.contains(r3)     // Catch:{ Exception -> 0x0066 }
            if (r1 == 0) goto L_0x0021
            goto L_0x0065
        L_0x0021:
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r7.getSystemService(r1)     // Catch:{ Exception -> 0x0066 }
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch:{ Exception -> 0x0066 }
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r1.getDeviceId()     // Catch:{ Exception -> 0x0066 }
            if (r1 == 0) goto L_0x0052
            int r3 = r1.length()     // Catch:{ Exception -> 0x0066 }
            if (r3 != 0) goto L_0x0038
            goto L_0x0052
        L_0x0038:
            r4 = 0
        L_0x0039:
            if (r4 >= r3) goto L_0x0052
            char r5 = r1.charAt(r4)     // Catch:{ Exception -> 0x0066 }
            boolean r5 = java.lang.Character.isWhitespace(r5)     // Catch:{ Exception -> 0x0066 }
            if (r5 != 0) goto L_0x004f
            char r5 = r1.charAt(r4)     // Catch:{ Exception -> 0x0066 }
            r6 = 48
            if (r5 == r6) goto L_0x004f
            r1 = 0
            goto L_0x0053
        L_0x004f:
            int r4 = r4 + 1
            goto L_0x0039
        L_0x0052:
            r1 = 1
        L_0x0053:
            if (r1 == 0) goto L_0x0056
            return r2
        L_0x0056:
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r1 = "android_id"
            java.lang.String r7 = android.provider.Settings.Secure.getString(r7, r1)     // Catch:{ Exception -> 0x0066 }
            boolean r7 = com.alipay.d.a.a.a.a.a((java.lang.String) r7)     // Catch:{ Exception -> 0x0066 }
            return r7
        L_0x0065:
            return r2
        L_0x0066:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.d.a.a.b.d.a(android.content.Context):boolean");
    }
}
