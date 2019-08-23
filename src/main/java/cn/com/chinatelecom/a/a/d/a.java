package cn.com.chinatelecom.a.a.d;

import android.content.Context;
import android.os.Build;
import cn.com.chinatelecom.a.a.a.e;
import cn.com.chinatelecom.a.a.c.g;
import cn.com.chinatelecom.a.a.c.h;
import cn.com.chinatelecom.a.a.e.b;
import java.util.HashMap;

public final class a {
    public static String a(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        String str8;
        HashMap hashMap = new HashMap();
        hashMap.put("model", Build.MODEL);
        hashMap.put("system", "A:" + Build.VERSION.RELEASE);
        hashMap.put("version", "SDK-v1.3");
        hashMap.put("networkType", str3);
        hashMap.put("onlineType", str4);
        hashMap.put("timeStamp", e.a(context));
        hashMap.put("bussinessType", str5);
        try {
            str7 = h.a(str6, b.a());
            try {
                str8 = cn.com.chinatelecom.a.a.c.a.b(g.a(hashMap), str6);
            } catch (Exception unused) {
                str8 = "";
                HashMap hashMap2 = new HashMap();
                hashMap2.put("paramKey", str7);
                hashMap2.put("paramStr", str8);
                return g.b("30021", "json", "v1.46", str, str2, hashMap2);
            }
        } catch (Exception unused2) {
            str7 = "";
            str8 = "";
            HashMap hashMap22 = new HashMap();
            hashMap22.put("paramKey", str7);
            hashMap22.put("paramStr", str8);
            return g.b("30021", "json", "v1.46", str, str2, hashMap22);
        }
        HashMap hashMap222 = new HashMap();
        hashMap222.put("paramKey", str7);
        hashMap222.put("paramStr", str8);
        return g.b("30021", "json", "v1.46", str, str2, hashMap222);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00e0 A[Catch:{ Exception -> 0x015b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, org.json.JSONObject r12) {
        /*
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            if (r12 == 0) goto L_0x0048
            java.lang.String r2 = "userId"
            java.lang.String r3 = "userId"
            java.lang.String r3 = r12.optString(r3)     // Catch:{ Exception -> 0x015b }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x015b }
            java.lang.String r2 = "username"
            java.lang.String r3 = "userName"
            java.lang.String r3 = r12.optString(r3)     // Catch:{ Exception -> 0x015b }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x015b }
            java.lang.String r2 = "openId"
            java.lang.String r3 = "openId"
            java.lang.String r3 = r12.optString(r3)     // Catch:{ Exception -> 0x015b }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x015b }
            java.lang.String r2 = "bindedMobile"
            java.lang.String r3 = "mobileName"
            java.lang.String r3 = r12.optString(r3)     // Catch:{ Exception -> 0x015b }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x015b }
            java.lang.String r2 = "bindedEmail"
            java.lang.String r3 = "emailName"
            java.lang.String r12 = r12.optString(r3)     // Catch:{ Exception -> 0x015b }
            r1.put(r2, r12)     // Catch:{ Exception -> 0x015b }
        L_0x0048:
            java.lang.String r12 = ""
            java.lang.String r2 = "key_ooid"
            java.lang.String r3 = ""
            java.lang.String r2 = cn.com.chinatelecom.a.a.e.c.b((android.content.Context) r6, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x015b }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x015b }
            if (r3 != 0) goto L_0x005c
            java.lang.String r12 = cn.com.chinatelecom.a.a.c.g.b((java.lang.String) r2, (java.lang.String) r8)     // Catch:{ Exception -> 0x015b }
        L_0x005c:
            java.lang.String r2 = "openId"
            r1.put(r2, r12)     // Catch:{ Exception -> 0x015b }
            java.lang.String r12 = "longitude"
            java.lang.String r2 = ""
            r1.put(r12, r2)     // Catch:{ Exception -> 0x015b }
            java.lang.String r12 = "latitude"
            java.lang.String r2 = ""
            r1.put(r12, r2)     // Catch:{ Exception -> 0x015b }
            java.lang.String r12 = "city"
            java.lang.String r2 = ""
            r1.put(r12, r2)     // Catch:{ Exception -> 0x015b }
            java.lang.String r12 = "suiteType"
            r2 = 2
            r1.put(r12, r2)     // Catch:{ Exception -> 0x015b }
            java.lang.String r12 = "imei"
            java.lang.String r2 = cn.com.chinatelecom.a.a.e.d.a((android.content.Context) r6)     // Catch:{ Exception -> 0x015b }
            r1.put(r12, r2)     // Catch:{ Exception -> 0x015b }
            java.lang.String r12 = "imsi"
            java.lang.String r2 = cn.com.chinatelecom.a.a.e.d.b(r6)     // Catch:{ Exception -> 0x015b }
            r1.put(r12, r2)     // Catch:{ Exception -> 0x015b }
            java.lang.String r12 = "phoneModels"
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ Exception -> 0x015b }
            r1.put(r12, r2)     // Catch:{ Exception -> 0x015b }
            java.lang.String r12 = "sysVersion"
            java.lang.String r2 = cn.com.chinatelecom.a.a.e.d.a()     // Catch:{ Exception -> 0x015b }
            r1.put(r12, r2)     // Catch:{ Exception -> 0x015b }
            java.lang.String r12 = "currentVersion"
            java.lang.String r2 = "SDK_CTv1.3"
            r1.put(r12, r2)     // Catch:{ Exception -> 0x015b }
            java.lang.String r12 = "channelId"
            java.lang.String r2 = ""
            r1.put(r12, r2)     // Catch:{ Exception -> 0x015b }
            java.lang.String r12 = "thirdId"
            r1.put(r12, r7)     // Catch:{ Exception -> 0x015b }
            java.lang.String r12 = "appName"
            java.lang.String r2 = cn.com.chinatelecom.a.a.e.d.d(r6)     // Catch:{ Exception -> 0x015b }
            r1.put(r12, r2)     // Catch:{ Exception -> 0x015b }
            java.lang.String r12 = "appVersion"
            java.lang.String r2 = r6.getPackageName()     // Catch:{ Exception -> 0x015b }
            android.content.pm.PackageInfo r2 = cn.com.chinatelecom.a.a.e.d.a(r6, r2)     // Catch:{ Exception -> 0x015b }
            if (r2 == 0) goto L_0x00cf
            java.lang.String r2 = r2.versionName     // Catch:{ Exception -> 0x015b }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x015b }
            if (r3 != 0) goto L_0x00cf
            goto L_0x00d1
        L_0x00cf:
            java.lang.String r2 = ""
        L_0x00d1:
            r1.put(r12, r2)     // Catch:{ Exception -> 0x015b }
            java.lang.String r12 = "networkType"
            java.lang.String r2 = "connectivity"
            java.lang.Object r6 = r6.getSystemService(r2)     // Catch:{ Exception -> 0x015b }
            android.net.ConnectivityManager r6 = (android.net.ConnectivityManager) r6     // Catch:{ Exception -> 0x015b }
            if (r6 == 0) goto L_0x00f7
            android.net.NetworkInfo r6 = r6.getActiveNetworkInfo()     // Catch:{ Exception -> 0x015b }
            if (r6 == 0) goto L_0x00f7
            r2 = 1
            int r3 = r6.getType()     // Catch:{ Exception -> 0x015b }
            if (r2 != r3) goto L_0x00f2
            java.lang.String r6 = r6.getTypeName()     // Catch:{ Exception -> 0x015b }
            goto L_0x00f9
        L_0x00f2:
            java.lang.String r6 = r6.getSubtypeName()     // Catch:{ Exception -> 0x015b }
            goto L_0x00f9
        L_0x00f7:
            java.lang.String r6 = ""
        L_0x00f9:
            r1.put(r12, r6)     // Catch:{ Exception -> 0x015b }
            java.lang.String r6 = "ipAddress"
            java.lang.String r12 = cn.com.chinatelecom.a.a.e.d.b()     // Catch:{ Exception -> 0x015b }
            r1.put(r6, r12)     // Catch:{ Exception -> 0x015b }
            java.lang.String r6 = "responseCode"
            r1.put(r6, r10)     // Catch:{ Exception -> 0x015b }
            java.lang.String r6 = "responseDesc"
            r1.put(r6, r11)     // Catch:{ Exception -> 0x015b }
            java.lang.String r6 = "deviceBrand"
            java.lang.String r10 = android.os.Build.BRAND     // Catch:{ Exception -> 0x015b }
            r1.put(r6, r10)     // Catch:{ Exception -> 0x015b }
            java.lang.String r6 = "apps"
            java.lang.String r10 = ""
            r1.put(r6, r10)     // Catch:{ Exception -> 0x015b }
            java.lang.String r6 = "timeStamp"
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x015b }
            r1.put(r6, r10)     // Catch:{ Exception -> 0x015b }
            r0.put(r1)     // Catch:{ Exception -> 0x015b }
            java.lang.String r6 = "optionAction"
            r5.put(r6, r9)     // Catch:{ Exception -> 0x015b }
            java.lang.String r6 = "itemSize"
            int r9 = r0.length()     // Catch:{ Exception -> 0x015b }
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch:{ Exception -> 0x015b }
            r5.put(r6, r9)     // Catch:{ Exception -> 0x015b }
            java.lang.String r6 = "items"
            java.lang.String r9 = r0.toString()     // Catch:{ Exception -> 0x015b }
            r5.put(r6, r9)     // Catch:{ Exception -> 0x015b }
            java.lang.String r6 = "isCompress"
            r9 = 0
            java.lang.String r9 = java.lang.Boolean.toString(r9)     // Catch:{ Exception -> 0x015b }
            r5.put(r6, r9)     // Catch:{ Exception -> 0x015b }
            java.lang.String r6 = "timeStamp"
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x015b }
            java.lang.String r9 = java.lang.Long.toString(r9)     // Catch:{ Exception -> 0x015b }
            r5.put(r6, r9)     // Catch:{ Exception -> 0x015b }
        L_0x015b:
            java.lang.String r0 = "30021"
            java.lang.String r1 = "json"
            java.lang.String r2 = "v1.46"
            r3 = r7
            r4 = r8
            java.lang.String r6 = cn.com.chinatelecom.a.a.c.g.a(r0, r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.a.a.d.a.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject):java.lang.String");
    }
}
