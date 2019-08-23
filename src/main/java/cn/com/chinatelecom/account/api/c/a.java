package cn.com.chinatelecom.account.api.c;

import android.content.Context;
import android.net.Network;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.b.b;
import cn.com.chinatelecom.account.api.b.c;
import cn.com.chinatelecom.account.api.b.e;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1786a = "a";

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<String, String> f1787b = new HashMap<>();

    public static long a(Context context) {
        return c.b(context, "key_difference_time", 0);
    }

    public static b a(Context context, HttpURLConnection httpURLConnection, boolean z) {
        if (!z) {
            return null;
        }
        b bVar = new b();
        try {
            Map headerFields = httpURLConnection.getHeaderFields();
            List list = (List) headerFields.get("p");
            if (list != null && list.size() > 0) {
                bVar.f1770b = a(context, (String) list.get(0));
            }
            List list2 = (List) headerFields.get("Set-Cookie");
            if (list2 != null && list2.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= list2.size()) {
                        break;
                    }
                    String str = (String) list2.get(0);
                    if (!TextUtils.isEmpty(str) && str.contains("gw_auth")) {
                        bVar.f1769a = b(str, "gw_auth");
                        break;
                    }
                    i++;
                }
            }
            List list3 = (List) headerFields.get("Log-Level");
            if (list3 != null && !list3.isEmpty()) {
                for (int i2 = 0; i2 < list3.size(); i2++) {
                    String str2 = (String) list3.get(0);
                    if (!TextUtils.isEmpty(str2)) {
                        f.b(context, str2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return bVar;
    }

    public static String a(Context context, e eVar, String str, Network network, boolean z, String str2) {
        if (eVar == null || TextUtils.isEmpty(eVar.f1781b)) {
            return "{\"result\":\"-8001\",\"msg\":\"请求网络异常\"}";
        }
        if (eVar.f1780a == -1) {
            return eVar.f1781b;
        }
        try {
            JSONObject jSONObject = new JSONObject(eVar.f1781b);
            int optInt = jSONObject.optInt("result");
            String optString = jSONObject.optString("data");
            if ((optInt == 0 || optInt == 30002) && !TextUtils.isEmpty(optString)) {
                String a2 = h.a(optString, str);
                if (!TextUtils.isEmpty(a2)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(a2);
                        jSONObject.put("data", jSONObject2);
                        a(jSONObject2.optString("accessCode"), eVar.f1783d);
                    } catch (JSONException unused) {
                        jSONObject.put("data", a2);
                    }
                    if (optInt != 30002 || !z) {
                        return jSONObject.toString();
                    }
                    ArrayList arrayList = new ArrayList();
                    JSONArray optJSONArray = ((JSONObject) jSONObject.opt("data")).optJSONArray("urls");
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            arrayList.add(optJSONArray.getString(i));
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return a(context, arrayList, str, network, str2);
                }
                return eVar.f1781b;
            }
            if (optInt == -10009 || optInt == -30001) {
                long optLong = jSONObject.optLong("timeStamp", -1);
                if (optLong == -1) {
                    c(context);
                } else {
                    a(context, optLong);
                }
            }
            return eVar.f1781b;
        } catch (Exception unused2) {
        }
    }

    public static String a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "{\"result\":\"-8001\",\"msg\":\"请求网络异常\"}";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("result");
            String optString = jSONObject.optString("responseData");
            if (optInt != 0 || TextUtils.isEmpty(optString)) {
                if (optInt == -30001) {
                    long optLong = jSONObject.optLong("timeStamp", -1);
                    if (optLong == -1) {
                        c(context);
                    } else {
                        a(context, optLong);
                    }
                }
                return str;
            }
            String b2 = h.b(optString, str2);
            if (!TextUtils.isEmpty(b2)) {
                try {
                    jSONObject.put("responseData", new JSONObject(b2));
                } catch (JSONException unused) {
                    jSONObject.put("responseData", b2);
                }
                return jSONObject.toString();
            }
            return str;
        } catch (Exception unused2) {
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(android.content.Context r10, java.util.List<java.lang.String> r11, java.lang.String r12, android.net.Network r13, java.lang.String r14) {
        /*
            r0 = 0
        L_0x0001:
            int r1 = r11.size()
            if (r0 >= r1) goto L_0x003b
            java.lang.Object r1 = r11.get(r0)     // Catch:{  }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{  }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{  }
            if (r2 == 0) goto L_0x0014
            goto L_0x0038
        L_0x0014:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{  }
            r3 = 21
            if (r2 >= r3) goto L_0x001d
            cn.com.chinatelecom.account.api.b.c.a((android.content.Context) r10, (java.lang.String) r1)     // Catch:{  }
        L_0x001d:
            cn.com.chinatelecom.account.api.b.e r5 = cn.com.chinatelecom.account.api.b.c.a(r10, r1, r13, r14)     // Catch:{  }
            r8 = 0
            r4 = r10
            r6 = r12
            r7 = r13
            r9 = r14
            java.lang.String r1 = a(r4, r5, r6, r7, r8, r9)     // Catch:{  }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0038 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x0038 }
            java.lang.String r3 = "result"
            int r2 = r2.optInt(r3)     // Catch:{ Throwable -> 0x0038 }
            if (r2 != 0) goto L_0x0038
            return r1
        L_0x0038:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x003b:
            r10 = -8001(0xffffffffffffe0bf, float:NaN)
            java.lang.String r11 = "请求网络异常- redirect 30002 "
            java.lang.String r10 = cn.com.chinatelecom.account.api.c.k.a(r10, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.c.a.a(android.content.Context, java.util.List, java.lang.String, android.net.Network, java.lang.String):java.lang.String");
    }

    public static String a(String str) {
        return (TextUtils.isEmpty(str) || !f1787b.containsKey(str)) ? "" : f1787b.get(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x000e, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void a(android.content.Context r2, int r3) {
        /*
            java.lang.Class<cn.com.chinatelecom.account.api.c.a> r0 = cn.com.chinatelecom.account.api.c.a.class
            monitor-enter(r0)
            java.lang.String r1 = "key_p_a_p"
            cn.com.chinatelecom.account.api.c.c.a((android.content.Context) r2, (java.lang.String) r1, (int) r3)     // Catch:{ Exception -> 0x000d, all -> 0x000a }
            monitor-exit(r0)
            return
        L_0x000a:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        L_0x000d:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.c.a.a(android.content.Context, int):void");
    }

    private static void a(Context context, long j) {
        if (j > 0) {
            c.a(context, "key_difference_time", j - System.currentTimeMillis());
        }
    }

    public static void a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            f1787b.put(str, str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004f, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean a(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Class<cn.com.chinatelecom.account.api.c.a> r0 = cn.com.chinatelecom.account.api.c.a.class
            monitor-enter(r0)
            r1 = 0
            if (r6 != 0) goto L_0x0008
            monitor-exit(r0)
            return r1
        L_0x0008:
            java.lang.String r2 = "http"
            java.lang.String r3 = r6.toLowerCase()     // Catch:{ Exception -> 0x004e, all -> 0x004b }
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x004e, all -> 0x004b }
            if (r2 != 0) goto L_0x0022
            java.lang.String r2 = "https"
            java.lang.String r3 = r6.toLowerCase()     // Catch:{ Exception -> 0x004e, all -> 0x004b }
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x004e, all -> 0x004b }
            if (r2 != 0) goto L_0x0022
            monitor-exit(r0)
            return r1
        L_0x0022:
            java.lang.String r2 = "key_p_a_p"
            int r2 = cn.com.chinatelecom.account.api.c.c.b((android.content.Context) r5, (java.lang.String) r2, (int) r1)     // Catch:{ Exception -> 0x004e, all -> 0x004b }
            r3 = 1
            if (r2 != r3) goto L_0x002e
            java.lang.String r2 = "https"
            goto L_0x0030
        L_0x002e:
            java.lang.String r2 = "http"
        L_0x0030:
            java.lang.String r4 = r6.toLowerCase()     // Catch:{ Exception -> 0x004e, all -> 0x004b }
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x004e, all -> 0x004b }
            if (r2 == 0) goto L_0x003c
            monitor-exit(r0)
            return r1
        L_0x003c:
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ Exception -> 0x004e, all -> 0x004b }
            java.lang.String r2 = "https"
            boolean r6 = r6.equals(r2)     // Catch:{ Exception -> 0x004e, all -> 0x004b }
            a((android.content.Context) r5, (int) r6)     // Catch:{ Exception -> 0x004e, all -> 0x004b }
            monitor-exit(r0)
            return r3
        L_0x004b:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L_0x004e:
            monitor-exit(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.c.a.a(android.content.Context, java.lang.String):boolean");
    }

    private static String b(String str, String str2) {
        try {
            String[] split = str.split(";");
            for (int i = 0; i < split.length; i++) {
                if (split[i].contains(str2)) {
                    return split[i].split("=")[1];
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean b(android.content.Context r4) {
        /*
            java.lang.Class<cn.com.chinatelecom.account.api.c.a> r0 = cn.com.chinatelecom.account.api.c.a.class
            monitor-enter(r0)
            r1 = 1
            java.lang.String r2 = "key_p_a_p"
            r3 = 0
            int r4 = cn.com.chinatelecom.account.api.c.c.b((android.content.Context) r4, (java.lang.String) r2, (int) r3)     // Catch:{ Exception -> 0x0012, all -> 0x000f }
            if (r4 != r1) goto L_0x0012
            monitor-exit(r0)
            return r3
        L_0x000f:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L_0x0012:
            monitor-exit(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.c.a.b(android.content.Context):boolean");
    }

    private static void c(Context context) {
        String str = c.a(context, "https://open.e.189.cn/openapi/special/getTimeStamp.do", "", null, null, false, 0, "reqTimestamp", d.a()).f1781b;
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = null;
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
            if (jSONObject != null) {
                a(context, jSONObject.optLong("msg", -1));
            }
        }
    }
}
