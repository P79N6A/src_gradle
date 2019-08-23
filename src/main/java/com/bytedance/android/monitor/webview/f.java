package com.bytedance.android.monitor.webview;

import android.webkit.WebView;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class f {

    /* renamed from: c  reason: collision with root package name */
    private static volatile f f18851c;

    /* renamed from: a  reason: collision with root package name */
    Map<String, Map<String, e>> f18852a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    Map<String, a> f18853b = new HashMap();

    class a {

        /* renamed from: a  reason: collision with root package name */
        public long f18854a;

        /* renamed from: b  reason: collision with root package name */
        public long f18855b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f18856c;

        private a() {
            this.f18854a = -1;
            this.f18855b = -1;
        }

        /* synthetic */ a(f fVar, byte b2) {
            this();
        }
    }

    private f() {
    }

    public static f a() {
        if (f18851c == null) {
            synchronized (f.class) {
                if (f18851c == null) {
                    f18851c = new f();
                }
            }
        }
        return f18851c;
    }

    static JSONObject a(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    static long b(String str) {
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public void b(WebView webView) {
        a(webView, true);
    }

    public static String a(WebView webView) {
        if (webView == null) {
            return "";
        }
        return webView.hashCode();
    }

    static void a(JSONObject jSONObject) {
        h.a().h.a("ttlive_webview_timing_monitor_service", 0, null, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public JSONObject a(e eVar) {
        if (eVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        try {
            if (eVar.f18843a != null) {
                jSONObject2 = eVar.f18843a;
            }
            if (eVar.f18847e != null) {
                jSONObject2.put("jsError", eVar.f18847e.f18849b);
                jSONObject2.put("httpError", eVar.f18847e.f18848a);
                jSONObject2.put("resourceError", eVar.f18847e.f18850c);
            }
            if (eVar.f18844b != null) {
                jSONObject2.put("resources", eVar.f18844b);
            }
            if (eVar.f18846d != null && !eVar.f18846d.isEmpty()) {
                for (String str : eVar.f18846d.keySet()) {
                    JSONObject jSONObject5 = eVar.f18846d.get(str);
                    if (jSONObject5 != null) {
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("msg", a(jSONObject5, "msg"));
                        jSONObject3.put(a(jSONObject5, "requestUrl"), jSONObject6);
                    }
                }
                jSONObject2.put("resourceErrorMsg", jSONObject3);
            }
            if (eVar.f18845c != null && !eVar.f18845c.isEmpty()) {
                for (String str2 : eVar.f18845c.keySet()) {
                    JSONObject jSONObject7 = eVar.f18845c.get(str2);
                    if (jSONObject7 != null) {
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put("msg", a(jSONObject7, "msg"));
                        jSONObject4.put(a(jSONObject7, "requestUrl"), jSONObject8);
                    }
                }
                jSONObject2.put("httpErrorMsg", jSONObject4);
            }
            h.a();
            jSONObject2.put("sdkVer", "2.0");
            jSONObject.put("tag", "ttlive_sdk");
            jSONObject.put(PushConstants.EXTRA, jSONObject2);
            jSONObject2.put("tag", "ttlive_sdk");
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    static String a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.optString(str, "");
    }

    /* access modifiers changed from: package-private */
    public void a(WebView webView, boolean z) {
        String a2 = a(webView);
        Map map = this.f18852a.get(a2);
        if (!z) {
            this.f18853b.remove(a2);
            this.f18852a.remove(a2);
        }
        if (map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                JSONObject a3 = a((e) map.get(str));
                if (a3 != null) {
                    a(a3);
                }
            }
            map.clear();
        }
    }

    static void a(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
        } catch (Exception unused) {
        }
    }
}
