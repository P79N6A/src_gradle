package com.taobao.applink.util;

import android.annotation.TargetApi;
import android.os.Build;
import java.util.Random;

@TargetApi(9)
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static String f79210a = "";

    /* renamed from: b  reason: collision with root package name */
    private static String f79211b = "";

    /* renamed from: c  reason: collision with root package name */
    private static String f79212c = "";

    private static String a() {
        StringBuffer stringBuffer = new StringBuffer();
        long currentTimeMillis = System.currentTimeMillis();
        String l = Long.toString(currentTimeMillis);
        stringBuffer.append(l.substring(l.length() - 5));
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(Build.MODEL.replaceAll(" ", ""));
        while (stringBuffer2.length() < 6) {
            stringBuffer2.append('0');
        }
        stringBuffer.append(stringBuffer2.substring(0, 6));
        Random random = new Random(currentTimeMillis);
        long j = 0;
        while (j < 4096) {
            j = random.nextLong();
        }
        stringBuffer.append(Long.toHexString(j).substring(0, 4));
        return stringBuffer.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r3.length() == 0) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r3) {
        /*
            java.lang.String r0 = f79210a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "unknow"
            java.lang.String r1 = f79210a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0015
            java.lang.String r3 = f79210a
            return r3
        L_0x0015:
            java.lang.String r0 = "imei"
            r1 = 0
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.q.c.a(r3, r0, r1)
            java.lang.String r1 = "imei"
            r2 = 0
            java.lang.String r1 = r0.getString(r1, r2)
            if (r1 == 0) goto L_0x002b
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0082
        L_0x002b:
            java.lang.String r2 = "phone"
            java.lang.Object r3 = r3.getSystemService(r2)     // Catch:{ Throwable -> 0x007f }
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch:{ Throwable -> 0x007f }
            java.lang.String r3 = r3.getDeviceId()     // Catch:{ Throwable -> 0x007f }
            if (r3 == 0) goto L_0x003f
            int r1 = r3.length()     // Catch:{ Throwable -> 0x0081 }
            if (r1 != 0) goto L_0x0044
        L_0x003f:
            java.lang.String r1 = a()     // Catch:{ Throwable -> 0x0081 }
            r3 = r1
        L_0x0044:
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r1 = r3.replaceAll(r1, r2)     // Catch:{ Throwable -> 0x0081 }
            java.lang.String r1 = r1.trim()     // Catch:{ Throwable -> 0x0081 }
        L_0x0050:
            int r3 = r1.length()     // Catch:{ Throwable -> 0x007f }
            r2 = 15
            if (r3 >= r2) goto L_0x0068
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x007f }
            java.lang.String r2 = "0"
            r3.<init>(r2)     // Catch:{ Throwable -> 0x007f }
            r3.append(r1)     // Catch:{ Throwable -> 0x007f }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x007f }
            r1 = r3
            goto L_0x0050
        L_0x0068:
            android.content.SharedPreferences$Editor r3 = r0.edit()     // Catch:{ Throwable -> 0x007f }
            java.lang.String r0 = "imei"
            r3.putString(r0, r1)     // Catch:{ Throwable -> 0x007f }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x007f }
            r2 = 9
            if (r0 < r2) goto L_0x007b
            r3.apply()     // Catch:{ Throwable -> 0x007f }
            goto L_0x0082
        L_0x007b:
            r3.commit()     // Catch:{ Throwable -> 0x007f }
            goto L_0x0082
        L_0x007f:
            goto L_0x0082
        L_0x0081:
            r1 = r3
        L_0x0082:
            if (r1 != 0) goto L_0x0086
            java.lang.String r1 = "unknow"
        L_0x0086:
            java.lang.String r3 = r1.trim()
            f79210a = r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.applink.util.d.a(android.content.Context):java.lang.String");
    }
}
