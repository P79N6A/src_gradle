package com.ali.auth.third.core.cookies;

import android.text.TextUtils;
import com.taobao.android.dexposed.ClassUtils;
import org.json.JSONObject;

public class LoginCookieUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final int f4912a = 6;

    /* renamed from: b  reason: collision with root package name */
    private static final int f4913b = 8;

    public static void expiresCookies(c cVar) {
        cVar.f4923e = 1000;
    }

    public static String getHttpDomin(c cVar) {
        String str = cVar.f4919a;
        if (!TextUtils.isEmpty(str) && str.startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
            str = str.substring(1);
        }
        return "http://" + str;
    }

    public static JSONObject getKeyValues(String str) {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            String cookie = a.a().getCookie(".taobao.com");
            if (!TextUtils.isEmpty(cookie)) {
                for (String str2 : cookie.split(";")) {
                    String[] split = str2.split("=");
                    if (split.length >= 2 && split[0].contains(str)) {
                        if (split.length == 2) {
                            jSONObject.put(split[0].trim(), split[1].trim());
                        } else {
                            jSONObject.put(split[0].trim(), str2.substring(str2.indexOf("=") + 1));
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static String getValue(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String cookie = a.a().getCookie(".taobao.com");
            if (!TextUtils.isEmpty(cookie)) {
                String[] split = cookie.split(";");
                int length = split.length;
                int i = 0;
                while (i < length) {
                    String str2 = split[i];
                    String[] split2 = str2.split("=");
                    if (split2.length < 2 || !str.equals(split2[0].trim())) {
                        i++;
                    } else {
                        return split2.length == 2 ? split2[1].trim() : str2.substring(str2.indexOf("=") + 1);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r0 != -1) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ali.auth.third.core.cookies.c parseCookie(java.lang.String r18) {
        /*
            r1 = r18
            int r2 = r18.length()
            r3 = 0
            r0 = 0
        L_0x0008:
            r4 = 0
            if (r0 < 0) goto L_0x01dd
            if (r0 >= r2) goto L_0x01dd
            char r5 = r1.charAt(r0)
            r6 = 32
            if (r5 != r6) goto L_0x0018
            int r0 = r0 + 1
            goto L_0x0008
        L_0x0018:
            r5 = 59
            int r7 = r1.indexOf(r5, r0)
            r8 = 61
            int r9 = r1.indexOf(r8, r0)
            com.ali.auth.third.core.cookies.c r10 = new com.ali.auth.third.core.cookies.c
            r10.<init>()
            r11 = 34
            r12 = -1
            r13 = 1
            if (r7 == r12) goto L_0x0031
            if (r7 < r9) goto L_0x0033
        L_0x0031:
            if (r9 != r12) goto L_0x0040
        L_0x0033:
            if (r7 != r12) goto L_0x0036
            r7 = r2
        L_0x0036:
            java.lang.String r0 = r1.substring(r0, r7)
            r10.f4921c = r0
            r10.f4922d = r4
            r0 = r7
            goto L_0x0080
        L_0x0040:
            java.lang.String r7 = r1.substring(r0, r9)
            r10.f4921c = r7
            int r7 = r2 + -1
            if (r9 >= r7) goto L_0x005a
            int r7 = r9 + 1
            char r7 = r1.charAt(r7)
            if (r7 != r11) goto L_0x005a
            int r0 = r9 + 2
            int r0 = r1.indexOf(r11, r0)
            if (r0 == r12) goto L_0x01dd
        L_0x005a:
            int r0 = r1.indexOf(r5, r0)
            if (r0 != r12) goto L_0x0061
            r0 = r2
        L_0x0061:
            int r7 = r0 - r9
            r14 = 4096(0x1000, float:5.74E-42)
            if (r7 <= r14) goto L_0x0071
            int r9 = r9 + r13
            int r7 = r9 + 4096
            java.lang.String r7 = r1.substring(r9, r7)
        L_0x006e:
            r10.f4922d = r7
            goto L_0x0080
        L_0x0071:
            int r7 = r9 + 1
            if (r7 == r0) goto L_0x007d
            if (r0 >= r9) goto L_0x0078
            goto L_0x007d
        L_0x0078:
            java.lang.String r7 = r1.substring(r7, r0)
            goto L_0x006e
        L_0x007d:
            java.lang.String r7 = ""
            goto L_0x006e
        L_0x0080:
            if (r0 < 0) goto L_0x01dc
            if (r0 >= r2) goto L_0x01dc
            char r7 = r1.charAt(r0)
            if (r7 == r6) goto L_0x01d4
            char r7 = r1.charAt(r0)
            if (r7 != r5) goto L_0x0092
            goto L_0x01d4
        L_0x0092:
            char r7 = r1.charAt(r0)
            r9 = 44
            if (r7 == r9) goto L_0x01dc
            int r7 = r2 - r0
            int r14 = f4912a
            if (r7 < r14) goto L_0x00bf
            int r14 = f4912a
            int r14 = r14 + r0
            java.lang.String r14 = r1.substring(r0, r14)
            java.lang.String r15 = "secure"
            boolean r14 = r14.equalsIgnoreCase(r15)
            if (r14 == 0) goto L_0x00bf
            int r7 = f4912a
            int r0 = r0 + r7
            r10.f4924f = r13
            if (r0 == r2) goto L_0x01dc
            char r7 = r1.charAt(r0)
            if (r7 != r8) goto L_0x0080
        L_0x00bc:
            int r0 = r0 + 1
            goto L_0x0080
        L_0x00bf:
            int r14 = f4913b
            if (r7 < r14) goto L_0x00e0
            int r7 = f4913b
            int r7 = r7 + r0
            java.lang.String r7 = r1.substring(r0, r7)
            java.lang.String r14 = "httponly"
            boolean r7 = r7.equalsIgnoreCase(r14)
            if (r7 == 0) goto L_0x00e0
            int r7 = f4913b
            int r0 = r0 + r7
            r10.g = r13
            if (r0 == r2) goto L_0x01dc
            char r7 = r1.charAt(r0)
            if (r7 != r8) goto L_0x0080
            goto L_0x00bc
        L_0x00e0:
            int r7 = r1.indexOf(r8, r0)
            if (r7 <= 0) goto L_0x01d1
            java.lang.String r14 = r1.substring(r0, r7)
            java.lang.String r14 = r14.toLowerCase()
            java.lang.String r15 = "expires"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L_0x0104
            int r15 = r1.indexOf(r9, r7)
            if (r15 == r12) goto L_0x0104
            int r6 = r15 - r7
            r8 = 10
            if (r6 > r8) goto L_0x0104
            int r0 = r15 + 1
        L_0x0104:
            int r6 = r1.indexOf(r5, r0)
            int r0 = r1.indexOf(r9, r0)
            if (r6 != r12) goto L_0x0112
            if (r0 != r12) goto L_0x0112
            r6 = r2
            goto L_0x011e
        L_0x0112:
            if (r6 != r12) goto L_0x0116
        L_0x0114:
            r6 = r0
            goto L_0x011e
        L_0x0116:
            if (r0 != r12) goto L_0x0119
            goto L_0x011e
        L_0x0119:
            int r0 = java.lang.Math.min(r6, r0)
            goto L_0x0114
        L_0x011e:
            int r7 = r7 + 1
            java.lang.String r0 = r1.substring(r7, r6)
            int r7 = r0.length()
            r8 = 2
            if (r7 <= r8) goto L_0x013b
            char r7 = r0.charAt(r3)
            if (r7 != r11) goto L_0x013b
            int r7 = r0.indexOf(r11, r13)
            if (r7 <= 0) goto L_0x013b
            java.lang.String r0 = r0.substring(r13, r7)
        L_0x013b:
            r7 = r0
            java.lang.String r0 = "expires"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0162
            long r8 = com.ali.auth.third.core.cookies.b.a(r7)     // Catch:{ IllegalArgumentException -> 0x014c }
            r10.f4923e = r8     // Catch:{ IllegalArgumentException -> 0x014c }
            goto L_0x01cf
        L_0x014c:
            r0 = move-exception
            java.lang.String r8 = "login.LoginCookieUtils"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r14 = "illegal format for expires: "
            r9.<init>(r14)
        L_0x0156:
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            com.ali.auth.third.core.trace.SDKLogger.e(r8, r7, r0)
            goto L_0x01cf
        L_0x0162:
            java.lang.String r0 = "max-age"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0187
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x017c }
            r14 = 1000(0x3e8, double:4.94E-321)
            long r16 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x017c }
            long r16 = r16 * r14
            r0 = 0
            long r8 = r8 + r16
            r10.f4923e = r8     // Catch:{ NumberFormatException -> 0x017c }
            goto L_0x01cf
        L_0x017c:
            r0 = move-exception
            java.lang.String r8 = "login.LoginCookieUtils"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r14 = "illegal format for max-age: "
            r9.<init>(r14)
            goto L_0x0156
        L_0x0187:
            java.lang.String r0 = "path"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0198
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x01cf
            r10.f4920b = r7
            goto L_0x01cf
        L_0x0198:
            java.lang.String r0 = "domain"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x01cf
            r0 = 46
            int r8 = r7.lastIndexOf(r0)
            if (r8 != 0) goto L_0x01ab
            r10.f4919a = r4
            goto L_0x01cf
        L_0x01ab:
            int r8 = r8 + 1
            java.lang.String r8 = r7.substring(r8)     // Catch:{ NumberFormatException -> 0x01b5 }
            java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x01b5 }
            goto L_0x01cf
        L_0x01b5:
            java.lang.String r7 = r7.toLowerCase()
            char r8 = r7.charAt(r3)
            if (r8 == r0) goto L_0x01cd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r8 = "."
            r0.<init>(r8)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L_0x01cd:
            r10.f4919a = r7
        L_0x01cf:
            r0 = r6
            goto L_0x01d6
        L_0x01d1:
            r0 = r2
            goto L_0x0080
        L_0x01d4:
            int r0 = r0 + 1
        L_0x01d6:
            r6 = 32
            r8 = 61
            goto L_0x0080
        L_0x01dc:
            return r10
        L_0x01dd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.auth.third.core.cookies.LoginCookieUtils.parseCookie(java.lang.String):com.ali.auth.third.core.cookies.c");
    }
}
