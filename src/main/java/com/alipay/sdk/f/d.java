package com.alipay.sdk.f;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.sdk.c.c;
import com.alipay.sdk.e.a;
import com.alipay.sdk.h.b;
import com.alipay.sdk.j.h;
import com.alipay.sdk.j.i;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.message.BasicHeader;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class d {

    /* renamed from: c  reason: collision with root package name */
    private static a f5493c;

    /* renamed from: a  reason: collision with root package name */
    protected boolean f5494a = true;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f5495b = true;

    public abstract JSONObject a() throws JSONException;

    public String b() {
        return "4.9.0";
    }

    public String c() throws JSONException {
        HashMap hashMap = new HashMap();
        hashMap.put("device", Build.MODEL);
        hashMap.put("namespace", "com.alipay.mobilecashier");
        hashMap.put("api_name", "com.alipay.mcpay");
        hashMap.put("api_version", b());
        return a(hashMap, new HashMap<>());
    }

    private static boolean a(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
            if (!jSONObject.has("params")) {
                return false;
            }
            String optString = jSONObject.getJSONObject("params").optString("public_key", null);
            if (!TextUtils.isEmpty(optString)) {
                b.a();
                c.a().a(optString);
                z = true;
            }
            return z;
        } catch (JSONException unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:3|4|(3:5|6|(1:8)(1:31))|9|(2:11|12)|13|14|15) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0034 A[SYNTHETIC, Splitter:B:23:0x0034] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003b A[SYNTHETIC, Splitter:B:27:0x003b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] a(org.apache.http.HttpResponse r4) throws java.lang.IllegalStateException, java.io.IOException {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
            r1 = 0
            org.apache.http.HttpEntity r4 = r4.getEntity()     // Catch:{ all -> 0x0030 }
            java.io.InputStream r4 = r4.getContent()     // Catch:{ all -> 0x0030 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x002e }
            r2.<init>()     // Catch:{ all -> 0x002e }
        L_0x0012:
            int r1 = r4.read(r0)     // Catch:{ all -> 0x002b }
            r3 = -1
            if (r1 == r3) goto L_0x001e
            r3 = 0
            r2.write(r0, r3, r1)     // Catch:{ all -> 0x002b }
            goto L_0x0012
        L_0x001e:
            byte[] r0 = r2.toByteArray()     // Catch:{ all -> 0x002b }
            if (r4 == 0) goto L_0x0027
            r4.close()     // Catch:{ Exception -> 0x0027 }
        L_0x0027:
            r2.close()     // Catch:{ Exception -> 0x002a }
        L_0x002a:
            return r0
        L_0x002b:
            r0 = move-exception
            r1 = r2
            goto L_0x0032
        L_0x002e:
            r0 = move-exception
            goto L_0x0032
        L_0x0030:
            r0 = move-exception
            r4 = r1
        L_0x0032:
            if (r4 == 0) goto L_0x0039
            r4.close()     // Catch:{ Exception -> 0x0038 }
            goto L_0x0039
        L_0x0038:
        L_0x0039:
            if (r1 == 0) goto L_0x003e
            r1.close()     // Catch:{ Exception -> 0x003e }
        L_0x003e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.f.d.a(org.apache.http.HttpResponse):byte[]");
    }

    public b a(Context context, String str) throws Throwable {
        return a(context, str, h.a(context), true);
    }

    public static JSONObject a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", str);
        jSONObject2.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, str2);
        jSONObject.put("action", jSONObject2);
        return jSONObject;
    }

    public static String a(HashMap<String, String> hashMap, HashMap<String, String> hashMap2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry next : hashMap.entrySet()) {
            jSONObject2.put((String) next.getKey(), next.getValue());
        }
        JSONObject jSONObject3 = new JSONObject();
        for (Map.Entry next2 : hashMap2.entrySet()) {
            jSONObject3.put((String) next2.getKey(), next2.getValue());
        }
        jSONObject2.put("params", jSONObject3);
        jSONObject.put("data", jSONObject2);
        return jSONObject.toString();
    }

    public String a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str2;
        String str3;
        com.alipay.sdk.i.b bVar;
        String str4;
        b a2 = b.a();
        com.alipay.sdk.i.b a3 = com.alipay.sdk.i.b.a();
        JSONObject a4 = com.alipay.sdk.j.b.a(new JSONObject(), jSONObject);
        try {
            a4.put("tid", a3.f5513a);
            c a5 = c.a();
            Context context = b.a().f5510a;
            com.alipay.sdk.j.a a6 = com.alipay.sdk.j.a.a(context);
            if (TextUtils.isEmpty(a5.f5476a)) {
                String a7 = i.a();
                String b2 = i.b();
                String e2 = i.e(context);
                String a8 = h.a(context);
                String substring = a8.substring(0, a8.indexOf("://"));
                String f2 = i.f(context);
                String f3 = Float.toString(new TextView(context).getTextSize());
                a5.f5476a = "Msp/15.2.0" + " (" + a7 + ";" + b2 + ";" + e2 + ";" + substring + ";" + f2 + ";" + f3;
            }
            String str5 = com.alipay.sdk.j.a.b(context).p;
            String a9 = a6.a();
            String b3 = a6.b();
            Context context2 = b.a().f5510a;
            SharedPreferences a10 = com.ss.android.ugc.aweme.q.c.a(context2, "virtualImeiAndImsi", 0);
            String string = a10.getString("virtual_imsi", null);
            if (TextUtils.isEmpty(string)) {
                if (TextUtils.isEmpty(com.alipay.sdk.i.b.a().f5513a)) {
                    String c2 = b.a().c();
                    if (TextUtils.isEmpty(c2)) {
                        string = c.b();
                        a10.edit().putString("virtual_imsi", string).commit();
                    } else {
                        str4 = c2.substring(3, 18);
                    }
                } else {
                    str4 = com.alipay.sdk.j.a.a(context2).a();
                }
                string = str4;
                a10.edit().putString("virtual_imsi", string).commit();
            }
            Context context3 = b.a().f5510a;
            SharedPreferences a11 = com.ss.android.ugc.aweme.q.c.a(context3, "virtualImeiAndImsi", 0);
            b bVar2 = a2;
            String string2 = a11.getString("virtual_imei", null);
            if (TextUtils.isEmpty(string2)) {
                if (TextUtils.isEmpty(com.alipay.sdk.i.b.a().f5513a)) {
                    string2 = c.b();
                } else {
                    string2 = com.alipay.sdk.j.a.a(context3).b();
                }
                a11.edit().putString("virtual_imei", string2).commit();
            }
            if (a3 != null) {
                a5.f5478c = a3.f5514b;
            }
            String replace = Build.MANUFACTURER.replace(";", " ");
            JSONObject jSONObject3 = a4;
            try {
                String replace2 = Build.MODEL.replace(";", " ");
                boolean b4 = b.b();
                String str6 = a6.f5516a;
                WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
                if (connectionInfo != null) {
                    str2 = connectionInfo.getSSID();
                } else {
                    str2 = "-1";
                }
                String str7 = "user_agent";
                WifiInfo connectionInfo2 = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
                if (connectionInfo2 != null) {
                    str3 = connectionInfo2.getBSSID();
                } else {
                    str3 = "00";
                }
                Context context4 = context;
                StringBuilder sb = new StringBuilder();
                com.alipay.sdk.i.b bVar3 = a3;
                sb.append(a5.f5476a);
                sb.append(";");
                sb.append(str5);
                sb.append(";");
                sb.append("-1;-1");
                sb.append(";");
                sb.append(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                sb.append(";");
                sb.append(a9);
                sb.append(";");
                sb.append(b3);
                sb.append(";");
                sb.append(a5.f5478c);
                sb.append(";");
                sb.append(replace);
                sb.append(";");
                sb.append(replace2);
                sb.append(";");
                sb.append(b4);
                sb.append(";");
                sb.append(str6);
                sb.append(";-1;-1;");
                sb.append(a5.f5477b);
                sb.append(";");
                sb.append(string);
                sb.append(";");
                sb.append(string2);
                sb.append(";");
                sb.append(str2);
                sb.append(";");
                sb.append(str3);
                if (bVar3 != null) {
                    HashMap hashMap = new HashMap();
                    bVar = bVar3;
                    hashMap.put("tid", bVar.f5513a);
                    hashMap.put("utdid", b.a().c());
                    String b5 = a5.b(context4, hashMap);
                    if (!TextUtils.isEmpty(b5)) {
                        sb.append(";");
                        sb.append(b5);
                    }
                } else {
                    bVar = bVar3;
                }
                sb.append(")");
                jSONObject2 = jSONObject3;
                try {
                    jSONObject2.put(str7, sb.toString());
                    b bVar4 = bVar2;
                    jSONObject2.put("has_alipay", i.b(bVar4.f5510a));
                    jSONObject2.put("has_msp_app", i.a(bVar4.f5510a));
                    jSONObject2.put("external_info", str);
                    jSONObject2.put("app_key", "2014052600006128");
                    jSONObject2.put("utdid", bVar4.c());
                    jSONObject2.put("new_client_key", bVar.f5514b);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                jSONObject2 = jSONObject3;
            }
        } catch (Throwable unused3) {
            jSONObject2 = a4;
        }
        return jSONObject2.toString();
    }

    public List<Header> a(boolean z, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicHeader("msp-gzip", String.valueOf(z)));
        arrayList.add(new BasicHeader("Operation-Type", "alipay.msp.cashier.dispatch.bytes"));
        arrayList.add(new BasicHeader("content-type", "application/octet-stream"));
        arrayList.add(new BasicHeader("Version", "2.0"));
        arrayList.add(new BasicHeader("AppId", "TAOBAO"));
        arrayList.add(new BasicHeader("Msp-Param", a.a(str)));
        arrayList.add(new BasicHeader("des-mode", "CBC"));
        return arrayList;
    }

    public final b a(Context context, String str, String str2, boolean z) throws Throwable {
        e eVar = new e(this.f5495b);
        c a2 = eVar.a(new b(c(), a(str, a())), this.f5494a);
        if (f5493c == null) {
            f5493c = new a(context, str2);
        } else if (!TextUtils.equals(str2, f5493c.f5485a)) {
            f5493c.f5485a = str2;
        }
        HttpResponse a3 = f5493c.a(a2.f5492b, a(a2.f5491a, str));
        String str3 = null;
        if (a3 != null) {
            Header[] allHeaders = a3.getAllHeaders();
            if (allHeaders != null && allHeaders.length > 0) {
                int length = allHeaders.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Header header = allHeaders[i];
                    if (header != null) {
                        String name = header.getName();
                        if (name != null && name.equalsIgnoreCase("msp-gzip")) {
                            str3 = header.getValue();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        b a4 = eVar.a(new c(Boolean.valueOf(str3).booleanValue(), a(a3)));
        if (a4 == null || !a(a4.f5489a) || !z) {
            return a4;
        }
        return a(context, str, str2, false);
    }
}
