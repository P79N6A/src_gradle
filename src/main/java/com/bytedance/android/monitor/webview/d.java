package com.bytedance.android.monitor.webview;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.e;
import com.bytedance.android.monitor.webview.f;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f18842a;

    private d() {
    }

    public static d a() {
        if (f18842a == null) {
            synchronized (d.class) {
                if (f18842a == null) {
                    f18842a = new d();
                }
            }
        }
        return f18842a;
    }

    public final void a(WebView webView) {
        f.a().a(webView, false);
    }

    public final void a(WebView webView, String str) {
        f a2 = f.a();
        long currentTimeMillis = System.currentTimeMillis();
        String a3 = f.a(webView);
        f.a aVar = new f.a(a2, (byte) 0);
        aVar.f18855b = -1;
        aVar.f18854a = currentTimeMillis;
        aVar.f18856c = false;
        a2.f18853b.put(a3, aVar);
    }

    public final void b(WebView webView, String str, String str2) {
        f a2 = f.a();
        JSONObject a3 = f.a(str2);
        if (!TextUtils.isEmpty(str) && a3 != null) {
            int i = h.a().n;
            String a4 = f.a(webView);
            Map map = a2.f18852a.get(a4);
            if (map == null) {
                map = new HashMap();
            }
            e eVar = (e) map.get(str);
            if (eVar == null) {
                eVar = new e();
                if (map.size() >= i) {
                    a2.b(webView);
                }
            }
            eVar.f18844b = a3;
            map.put(str, eVar);
            a2.f18852a.put(a4, map);
        }
    }

    public final void d(WebView webView, String str, String str2) {
        f a2 = f.a();
        long b2 = f.b(str2);
        String a3 = f.a(webView);
        f.a aVar = a2.f18853b.get(a3);
        if (aVar != null && aVar.f18854a != -1 && !aVar.f18856c && aVar.f18855b == -1) {
            aVar.f18855b = (System.currentTimeMillis() - aVar.f18854a) - b2;
            long j = 0;
            if (aVar.f18855b > 0) {
                j = aVar.f18855b;
            }
            aVar.f18855b = j;
            a2.f18853b.put(a3, aVar);
        }
    }

    public final void a(WebView webView, String str, String str2) {
        JSONObject jSONObject;
        f a2 = f.a();
        JSONObject a3 = f.a(str2);
        if (!TextUtils.isEmpty(str) && a3 != null) {
            int i = h.a().n;
            String a4 = f.a(webView);
            Map map = a2.f18852a.get(a4);
            if (map == null) {
                map = new HashMap();
            }
            e eVar = (e) map.get(str);
            if (eVar == null) {
                jSONObject = null;
            } else {
                jSONObject = eVar.f18843a;
            }
            if (eVar == null) {
                eVar = new e();
                eVar.f18843a = a3;
                if (map.size() >= i) {
                    a2.b(webView);
                }
            } else if (jSONObject == null || (f.a(jSONObject, "step").equals("DOMContentLoaded") && f.a(a3, "step").equals("load"))) {
                long j = 0;
                if (!(jSONObject == null || jSONObject == null)) {
                    j = jSONObject.optLong("initTime", 0);
                }
                f.a(a3, "initTime", j);
                eVar.f18843a = a3;
            } else {
                map.remove(str);
                f.a(a2.a(eVar));
                eVar = new e();
                eVar.f18843a = a3;
            }
            f.a aVar = a2.f18853b.get(a4);
            if (!(aVar == null || aVar.f18856c || aVar.f18854a == -1 || aVar.f18855b == -1)) {
                aVar.f18856c = true;
                f.a(eVar.f18843a, "initTime", aVar.f18855b);
            }
            a2.f18853b.put(a4, aVar);
            map.put(str, eVar);
            a2.f18852a.put(a4, map);
        }
    }

    public final void c(WebView webView, String str, String str2) {
        f a2 = f.a();
        JSONObject a3 = f.a(str2);
        int i = h.a().n;
        if (!TextUtils.isEmpty(str) && a3 != null) {
            String a4 = f.a(webView);
            Map map = a2.f18852a.get(a4);
            if (map == null) {
                map = new HashMap();
            }
            e eVar = (e) map.get(str);
            if (eVar == null) {
                eVar = new e();
                if (map.size() >= i) {
                    a2.b(webView);
                }
            }
            e.a aVar = eVar.f18847e;
            if (aVar == null) {
                aVar = new e.a();
            }
            Map<String, JSONObject> map2 = eVar.f18845c;
            if (map2 == null) {
                map2 = new HashMap<>();
            }
            Map<String, JSONObject> map3 = eVar.f18846d;
            if (map3 == null) {
                map3 = new HashMap<>();
            }
            String a5 = f.a(a3, "category");
            char c2 = 65535;
            int hashCode = a5.hashCode();
            if (hashCode != -1349273025) {
                if (hashCode != 155774560) {
                    if (hashCode == 955545242 && a5.equals("resourceError")) {
                        c2 = 2;
                    }
                } else if (a5.equals("httpError")) {
                    c2 = 0;
                }
            } else if (a5.equals("jsError")) {
                c2 = 1;
            }
            switch (c2) {
                case 0:
                    aVar.f18848a++;
                    map2.put(f.a(a3, "requestUrl"), a3);
                    break;
                case 1:
                    aVar.f18849b++;
                    break;
                case 2:
                    aVar.f18850c++;
                    map3.put(f.a(a3, "requestUrl"), a3);
                    break;
            }
            eVar.f18845c = map2;
            eVar.f18846d = map3;
            eVar.f18847e = aVar;
            map.put(str, eVar);
            a2.f18852a.put(a4, map);
        }
    }
}
