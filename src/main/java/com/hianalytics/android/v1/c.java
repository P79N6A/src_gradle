package com.hianalytics.android.v1;

import android.content.Context;
import android.util.Base64;
import com.hianalytics.android.a.a.a;
import com.hianalytics.android.a.a.b;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import org.json.JSONObject;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    boolean f24917a;

    /* renamed from: b  reason: collision with root package name */
    private Context f24918b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f24919c;

    public c(Context context, JSONObject jSONObject, boolean z) {
        this.f24918b = context;
        this.f24919c = jSONObject;
        this.f24917a = z;
    }

    private String a(byte[] bArr) {
        new SecureRandom();
        String valueOf = String.valueOf(System.currentTimeMillis());
        int length = valueOf.length();
        if (length < 13) {
            StringBuffer stringBuffer = new StringBuffer(valueOf);
            for (int i = 0; i < 13 - length; i++) {
                stringBuffer.append(PushConstants.PUSH_TYPE_NOTIFY);
            }
            valueOf = stringBuffer.toString();
        } else if (length > 13) {
            valueOf = valueOf.substring(0, 13);
        }
        String str = String.valueOf(valueOf) + String.format("%03d", new Object[]{Integer.valueOf(r0.nextInt(999))});
        try {
            byte[] a2 = b.a(str, bArr);
            byte[] bytes = str.getBytes("UTF-8");
            byte[] decode = Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDf5raDExuuXbsVNCWl48yuB89W\rfNOuuhPuS2Mptii/0UorpzypBkNTTGt11E7aorCc1lFwlB+4KDMIpFyQsdChSk+A\rt9UfhFKa95uiDpMe5rMfU+DAhoXGER6WQ2qGtrHmBWVv33i3lc76u9IgEfYuLwC6\r1mhQDHzAKPiViY6oeQIDAQAB\r", 0);
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode)));
            byte[] doFinal = instance.doFinal(bytes);
            String e2 = a.e(this.f24918b);
            return "{\"vs\":\"" + e2 + "\",\"ed\":\"" + a.b(a2) + "\",\"ek\":\"" + a.b(doFinal) + "\"}";
        } catch (Exception e3) {
            com.google.a.a.a.a.a.a.b(e3);
            return null;
        }
    }

    private boolean a(JSONObject jSONObject, String str) {
        StringBuilder sb;
        String lowerCase = str.toLowerCase();
        try {
            byte[] a2 = a.a(jSONObject.toString().getBytes("UTF-8"));
            if (a2 == null) {
                return false;
            }
            String a3 = a(a2);
            if (a3 == null) {
                return false;
            }
            try {
                byte[] bytes = a3.getBytes("UTF-8");
                if (lowerCase.indexOf("https") >= 0) {
                    return false;
                }
                a.h();
                return b.a(str, bytes);
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                sb = new StringBuilder("UnsupportedEncodingException:");
                sb.append(e.getMessage());
                a.h();
                return false;
            }
        } catch (UnsupportedEncodingException e3) {
            e = e3;
            sb = new StringBuilder("UnsupportedEncodingException:");
            sb.append(e.getMessage());
            a.h();
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01eb, code lost:
        if ((((java.lang.System.currentTimeMillis() / 1000) - com.hianalytics.android.a.a.a.a(r12[1])) - java.lang.Long.parseLong(r12[2])) < com.hianalytics.android.a.a.a.b().longValue()) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01f1, code lost:
        com.hianalytics.android.a.a.a.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0234, code lost:
        if (((java.lang.System.currentTimeMillis() / 1000) - com.hianalytics.android.a.a.a.a(r12.getString(r12.length() - 1).split(",")[2])) < com.hianalytics.android.a.a.a.b().longValue()) goto L_0x01ed;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012b A[Catch:{ JSONException -> 0x023b }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0141 A[Catch:{ JSONException -> 0x023b }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0145 A[Catch:{ JSONException -> 0x023b }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x019c A[SYNTHETIC, Splitter:B:63:0x019c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r1 = r19
            org.json.JSONObject r0 = r1.f24919c     // Catch:{ Exception -> 0x0245 }
            java.lang.String r2 = "type"
            java.lang.String r0 = r0.getString(r2)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            android.content.Context r2 = r1.f24918b     // Catch:{ Exception -> 0x0245 }
            org.json.JSONObject r0 = r1.f24919c     // Catch:{ Exception -> 0x0245 }
            boolean r3 = r1.f24917a     // Catch:{ Exception -> 0x0245 }
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x0245 }
            java.lang.String r5 = "1.0"
            r4.<init>(r5)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r5 = com.hianalytics.android.a.a.a.a((android.content.Context) r2)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r6 = "phone"
            java.lang.Object r6 = r2.getSystemService(r6)     // Catch:{ Exception -> 0x0245 }
            android.telephony.TelephonyManager r6 = (android.telephony.TelephonyManager) r6     // Catch:{ Exception -> 0x0245 }
            if (r6 != 0) goto L_0x002e
            com.hianalytics.android.a.a.a.h()     // Catch:{ Exception -> 0x0245 }
            r4 = 0
            goto L_0x00de
        L_0x002e:
            android.content.res.Resources r7 = r2.getResources()     // Catch:{ Exception -> 0x0245 }
            android.content.res.Configuration r7 = r7.getConfiguration()     // Catch:{ Exception -> 0x0245 }
            java.lang.String r8 = ""
            if (r7 == 0) goto L_0x0044
            java.util.Locale r9 = r7.locale     // Catch:{ Exception -> 0x0245 }
            if (r9 == 0) goto L_0x0044
            java.util.Locale r7 = r7.locale     // Catch:{ Exception -> 0x0245 }
            java.lang.String r8 = r7.toString()     // Catch:{ Exception -> 0x0245 }
        L_0x0044:
            java.lang.String r7 = ""
            java.lang.String r9 = "android.permission.READ_PHONE_STATE"
            boolean r9 = com.hianalytics.android.a.a.a.a(r2, r9)     // Catch:{ Exception -> 0x0245 }
            if (r9 == 0) goto L_0x0056
            java.lang.String r6 = r6.getDeviceId()     // Catch:{ Exception -> 0x0245 }
            java.lang.String r7 = com.hianalytics.android.a.a.a.b((java.lang.String) r6)     // Catch:{ Exception -> 0x0245 }
        L_0x0056:
            java.lang.String r6 = com.hianalytics.android.a.a.a.e(r2)     // Catch:{ Exception -> 0x0245 }
            boolean r9 = com.hianalytics.android.a.a.a.f(r2)     // Catch:{ Exception -> 0x0245 }
            if (r9 != 0) goto L_0x0081
            java.lang.String r8 = ",,,,,"
            r4.append(r8)     // Catch:{ Exception -> 0x0245 }
            r4.append(r6)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r6 = ","
            r4.append(r6)     // Catch:{ Exception -> 0x0245 }
            r4.append(r7)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r6 = ","
            r4.append(r6)     // Catch:{ Exception -> 0x0245 }
            r4.append(r5)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r5 = ","
            r4.append(r5)     // Catch:{ Exception -> 0x0245 }
        L_0x007d:
            com.hianalytics.android.a.a.a.h()     // Catch:{ Exception -> 0x0245 }
            goto L_0x00da
        L_0x0081:
            java.lang.String r9 = ","
            r4.append(r9)     // Catch:{ Exception -> 0x0245 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0245 }
            java.lang.String r10 = "Android"
            r9.<init>(r10)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r10 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x0245 }
            r9.append(r10)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0245 }
            r4.append(r9)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r9 = ","
            r4.append(r9)     // Catch:{ Exception -> 0x0245 }
            r4.append(r8)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r8 = ","
            r4.append(r8)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r8 = android.os.Build.MODEL     // Catch:{ Exception -> 0x0245 }
            r4.append(r8)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r8 = ","
            r4.append(r8)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r8 = android.os.Build.DISPLAY     // Catch:{ Exception -> 0x0245 }
            r4.append(r8)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r8 = ","
            r4.append(r8)     // Catch:{ Exception -> 0x0245 }
            r4.append(r6)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r6 = ","
            r4.append(r6)     // Catch:{ Exception -> 0x0245 }
            r4.append(r7)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r6 = ","
            r4.append(r6)     // Catch:{ Exception -> 0x0245 }
            r4.append(r5)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r5 = ","
            r4.append(r5)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r5 = com.hianalytics.android.a.a.a.b((android.content.Context) r2)     // Catch:{ Exception -> 0x0245 }
            r4.append(r5)     // Catch:{ Exception -> 0x0245 }
            goto L_0x007d
        L_0x00da:
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0245 }
        L_0x00de:
            if (r4 != 0) goto L_0x00e4
            com.hianalytics.android.a.a.a.h()     // Catch:{ Exception -> 0x0245 }
            return
        L_0x00e4:
            java.lang.String r5 = "cached"
            org.json.JSONObject r5 = com.hianalytics.android.a.a.c.b(r2, r5)     // Catch:{ Exception -> 0x0245 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x0245 }
            r6.<init>()     // Catch:{ Exception -> 0x0245 }
            java.lang.String r7 = "type"
            java.lang.String r7 = r0.getString(r7)     // Catch:{ JSONException -> 0x023b }
            if (r7 != 0) goto L_0x00f8
            return
        L_0x00f8:
            java.lang.String r8 = "type"
            r0.remove(r8)     // Catch:{ JSONException -> 0x023b }
            r8 = 0
            r9 = 1
            if (r5 == 0) goto L_0x0116
            boolean r10 = r5.isNull(r7)     // Catch:{ JSONException -> 0x023b }
            if (r10 == 0) goto L_0x010f
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x023b }
            r10.<init>()     // Catch:{ JSONException -> 0x023b }
        L_0x010c:
            r11 = r5
            r5 = 1
            goto L_0x0121
        L_0x010f:
            org.json.JSONArray r10 = r5.getJSONArray(r7)     // Catch:{ JSONException -> 0x023b }
            r11 = r5
            r5 = 0
            goto L_0x0121
        L_0x0116:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x023b }
            r5.<init>()     // Catch:{ JSONException -> 0x023b }
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x023b }
            r10.<init>()     // Catch:{ JSONException -> 0x023b }
            goto L_0x010c
        L_0x0121:
            if (r3 == 0) goto L_0x0129
            if (r5 == 0) goto L_0x0129
            com.hianalytics.android.a.a.a.h()     // Catch:{ JSONException -> 0x023b }
            return
        L_0x0129:
            if (r3 != 0) goto L_0x012e
            r10.put(r0)     // Catch:{ JSONException -> 0x023b }
        L_0x012e:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x023b }
            r0.<init>()     // Catch:{ JSONException -> 0x023b }
            int r3 = r10.length()     // Catch:{ JSONException -> 0x023b }
        L_0x0137:
            int r5 = r3 + -1
            if (r8 <= r5) goto L_0x019c
            int r3 = r0.length()     // Catch:{ JSONException -> 0x023b }
            if (r3 > 0) goto L_0x0145
            com.hianalytics.android.a.a.a.h()     // Catch:{ JSONException -> 0x023b }
            return
        L_0x0145:
            r11.remove(r7)     // Catch:{ JSONException -> 0x023b }
            r11.put(r7, r0)     // Catch:{ JSONException -> 0x023b }
            java.lang.String r3 = "g"
            r6.put(r3, r4)     // Catch:{ JSONException -> 0x023b }
            java.lang.String r3 = "s"
            r6.put(r3, r0)     // Catch:{ JSONException -> 0x023b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0245 }
            java.lang.String r3 = "message="
            r0.<init>(r3)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r3 = r6.toString()     // Catch:{ Exception -> 0x0245 }
            r0.append(r3)     // Catch:{ Exception -> 0x0245 }
            com.hianalytics.android.a.a.a.h()     // Catch:{ Exception -> 0x0245 }
            java.lang.String r0 = com.hianalytics.android.a.a.a.i()     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r1.a(r6, r0)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0193
            java.lang.String r0 = "flag"
            android.content.SharedPreferences r0 = com.hianalytics.android.a.a.c.a(r2, r0)     // Catch:{ Exception -> 0x0245 }
            boolean r3 = com.hianalytics.android.a.a.a.f(r2)     // Catch:{ Exception -> 0x0245 }
            if (r3 == 0) goto L_0x018a
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x0245 }
            java.lang.String r3 = "rom_version"
            java.lang.String r4 = android.os.Build.DISPLAY     // Catch:{ Exception -> 0x0245 }
            r0.putString(r3, r4)     // Catch:{ Exception -> 0x0245 }
            r0.commit()     // Catch:{ Exception -> 0x0245 }
        L_0x018a:
            java.lang.String r0 = "cached"
            com.hianalytics.android.a.a.c.c(r2, r0)     // Catch:{ Exception -> 0x0245 }
            com.hianalytics.android.a.a.a.h()     // Catch:{ Exception -> 0x0245 }
            return
        L_0x0193:
            java.lang.String r0 = "cached"
            com.hianalytics.android.a.a.c.a(r2, r11, r0)     // Catch:{ Exception -> 0x0245 }
            com.hianalytics.android.a.a.a.h()     // Catch:{ Exception -> 0x0245 }
            return
        L_0x019c:
            org.json.JSONObject r5 = r10.getJSONObject(r8)     // Catch:{ JSONException -> 0x023b }
            java.lang.String r12 = "b"
            boolean r12 = r5.has(r12)     // Catch:{ JSONException -> 0x023b }
            r14 = 1000(0x3e8, double:4.94E-321)
            if (r12 == 0) goto L_0x01f5
            java.lang.String r12 = "b"
            org.json.JSONArray r12 = r5.getJSONArray(r12)     // Catch:{ JSONException -> 0x023b }
            if (r12 == 0) goto L_0x0237
            int r16 = r12.length()     // Catch:{ JSONException -> 0x023b }
            if (r16 <= 0) goto L_0x0237
            int r16 = r12.length()     // Catch:{ JSONException -> 0x023b }
            int r13 = r16 + -1
            java.lang.String r12 = r12.getString(r13)     // Catch:{ JSONException -> 0x023b }
            java.lang.String r13 = ","
            java.lang.String[] r12 = r12.split(r13)     // Catch:{ JSONException -> 0x023b }
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x023b }
            long r17 = r17 / r14
            r13 = r12[r9]     // Catch:{ JSONException -> 0x023b }
            long r13 = com.hianalytics.android.a.a.a.a((java.lang.String) r13)     // Catch:{ JSONException -> 0x023b }
            r15 = 0
            long r17 = r17 - r13
            r13 = 2
            r12 = r12[r13]     // Catch:{ JSONException -> 0x023b }
            long r12 = java.lang.Long.parseLong(r12)     // Catch:{ JSONException -> 0x023b }
            r14 = 0
            long r17 = r17 - r12
            java.lang.Long r12 = com.hianalytics.android.a.a.a.b()     // Catch:{ JSONException -> 0x023b }
            long r12 = r12.longValue()     // Catch:{ JSONException -> 0x023b }
            int r14 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x01f1
        L_0x01ed:
            r0.put(r5)     // Catch:{ JSONException -> 0x023b }
            goto L_0x0237
        L_0x01f1:
            com.hianalytics.android.a.a.a.h()     // Catch:{ JSONException -> 0x023b }
            goto L_0x0237
        L_0x01f5:
            java.lang.String r12 = "e"
            boolean r12 = r5.has(r12)     // Catch:{ JSONException -> 0x023b }
            if (r12 == 0) goto L_0x0237
            java.lang.String r12 = "e"
            org.json.JSONArray r12 = r5.getJSONArray(r12)     // Catch:{ JSONException -> 0x023b }
            if (r12 == 0) goto L_0x0237
            int r13 = r12.length()     // Catch:{ JSONException -> 0x023b }
            if (r13 <= 0) goto L_0x0237
            int r13 = r12.length()     // Catch:{ JSONException -> 0x023b }
            int r13 = r13 - r9
            java.lang.String r12 = r12.getString(r13)     // Catch:{ JSONException -> 0x023b }
            java.lang.String r13 = ","
            java.lang.String[] r12 = r12.split(r13)     // Catch:{ JSONException -> 0x023b }
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x023b }
            long r17 = r17 / r14
            r13 = 2
            r12 = r12[r13]     // Catch:{ JSONException -> 0x023b }
            long r12 = com.hianalytics.android.a.a.a.a((java.lang.String) r12)     // Catch:{ JSONException -> 0x023b }
            r14 = 0
            long r17 = r17 - r12
            java.lang.Long r12 = com.hianalytics.android.a.a.a.b()     // Catch:{ JSONException -> 0x023b }
            long r12 = r12.longValue()     // Catch:{ JSONException -> 0x023b }
            int r14 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x01f1
            goto L_0x01ed
        L_0x0237:
            int r8 = r8 + 1
            goto L_0x0137
        L_0x023b:
            r0 = move-exception
            com.google.a.a.a.a.a.a.b(r0)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r0 = "cached"
            com.hianalytics.android.a.a.c.c(r2, r0)     // Catch:{ Exception -> 0x0245 }
            return
        L_0x0245:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "MessageThread.run() throw exception:"
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            com.hianalytics.android.a.a.a.h()
            android.content.Context r0 = r1.f24918b
            java.lang.String r2 = "cached"
            com.hianalytics.android.a.a.c.c(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hianalytics.android.v1.c.run():void");
    }
}
