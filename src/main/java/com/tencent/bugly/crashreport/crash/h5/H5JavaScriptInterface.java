package com.tencent.bugly.crashreport.crash.h5;

import android.webkit.JavascriptInterface;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.inner.InnerApi;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public class H5JavaScriptInterface {

    /* renamed from: a  reason: collision with root package name */
    private static HashSet<Integer> f79375a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private String f79376b;

    /* renamed from: c  reason: collision with root package name */
    private Thread f79377c;

    /* renamed from: d  reason: collision with root package name */
    private String f79378d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f79379e;

    private H5JavaScriptInterface() {
    }

    @JavascriptInterface
    public void printLog(String str) {
        x.d("Log from js: %s", str);
    }

    public static H5JavaScriptInterface getInstance(CrashReport.WebViewInterface webViewInterface) {
        String str = null;
        if (webViewInterface == null || f79375a.contains(Integer.valueOf(webViewInterface.hashCode()))) {
            return null;
        }
        H5JavaScriptInterface h5JavaScriptInterface = new H5JavaScriptInterface();
        f79375a.add(Integer.valueOf(webViewInterface.hashCode()));
        h5JavaScriptInterface.f79377c = Thread.currentThread();
        Thread thread = h5JavaScriptInterface.f79377c;
        if (thread != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("\n");
            for (int i = 2; i < thread.getStackTrace().length; i++) {
                StackTraceElement stackTraceElement = thread.getStackTrace()[i];
                if (!stackTraceElement.toString().contains("crashreport")) {
                    sb.append(stackTraceElement.toString());
                    sb.append("\n");
                }
            }
            str = sb.toString();
        }
        h5JavaScriptInterface.f79378d = str;
        HashMap hashMap = new HashMap();
        hashMap.put("[WebView] ContentDescription", webViewInterface.getContentDescription());
        h5JavaScriptInterface.f79379e = hashMap;
        return h5JavaScriptInterface;
    }

    @JavascriptInterface
    public void reportJSException(String str) {
        if (str == null) {
            x.d("Payload from JS is null.", new Object[0]);
            return;
        }
        String b2 = z.b(str.getBytes());
        if (this.f79376b == null || !this.f79376b.equals(b2)) {
            this.f79376b = b2;
            x.d("Handling JS exception ...", new Object[0]);
            a a2 = a(str);
            if (a2 == null) {
                x.d("Failed to parse payload.", new Object[0]);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (a2.f79380a != null) {
                linkedHashMap2.put("[JS] projectRoot", a2.f79380a);
            }
            if (a2.f79381b != null) {
                linkedHashMap2.put("[JS] context", a2.f79381b);
            }
            if (a2.f79382c != null) {
                linkedHashMap2.put("[JS] url", a2.f79382c);
            }
            if (a2.f79383d != null) {
                linkedHashMap2.put("[JS] userAgent", a2.f79383d);
            }
            if (a2.i != null) {
                linkedHashMap2.put("[JS] file", a2.i);
            }
            if (a2.j != 0) {
                linkedHashMap2.put("[JS] lineNumber", Long.toString(a2.j));
            }
            linkedHashMap.putAll(linkedHashMap2);
            linkedHashMap.putAll(this.f79379e);
            linkedHashMap.put("Java Stack", this.f79378d);
            Thread thread = this.f79377c;
            if (a2 != null) {
                InnerApi.postH5CrashAsync(thread, a2.f79385f, a2.g, a2.h, linkedHashMap);
            }
            return;
        }
        x.d("Same payload from js. Please check whether you've injected bugly.js more than one times.", new Object[0]);
    }

    private static a a(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            a aVar = new a();
            aVar.f79380a = jSONObject.getString("projectRoot");
            if (aVar.f79380a == null) {
                return null;
            }
            aVar.f79381b = jSONObject.getString("context");
            if (aVar.f79381b == null) {
                return null;
            }
            aVar.f79382c = jSONObject.getString(PushConstants.WEB_URL);
            if (aVar.f79382c == null) {
                return null;
            }
            aVar.f79383d = jSONObject.getString("userAgent");
            if (aVar.f79383d == null) {
                return null;
            }
            aVar.f79384e = jSONObject.getString("language");
            if (aVar.f79384e == null) {
                return null;
            }
            aVar.f79385f = jSONObject.getString("name");
            if (aVar.f79385f != null) {
                if (!aVar.f79385f.equals("null")) {
                    String string = jSONObject.getString("stacktrace");
                    if (string == null) {
                        return null;
                    }
                    int indexOf = string.indexOf("\n");
                    if (indexOf < 0) {
                        x.d("H5 crash stack's format is wrong!", new Object[0]);
                        return null;
                    }
                    aVar.h = string.substring(indexOf + 1);
                    aVar.g = string.substring(0, indexOf);
                    int indexOf2 = aVar.g.indexOf(":");
                    if (indexOf2 > 0) {
                        aVar.g = aVar.g.substring(indexOf2 + 1);
                    }
                    aVar.i = jSONObject.getString("file");
                    if (aVar.f79385f == null) {
                        return null;
                    }
                    aVar.j = jSONObject.getLong("lineNumber");
                    if (aVar.j < 0) {
                        return null;
                    }
                    aVar.k = jSONObject.getLong("columnNumber");
                    if (aVar.k < 0) {
                        return null;
                    }
                    x.a("H5 crash information is following: ", new Object[0]);
                    x.a("[projectRoot]: " + aVar.f79380a, new Object[0]);
                    x.a("[context]: " + aVar.f79381b, new Object[0]);
                    x.a("[url]: " + aVar.f79382c, new Object[0]);
                    x.a("[userAgent]: " + aVar.f79383d, new Object[0]);
                    x.a("[language]: " + aVar.f79384e, new Object[0]);
                    x.a("[name]: " + aVar.f79385f, new Object[0]);
                    x.a("[message]: " + aVar.g, new Object[0]);
                    x.a("[stacktrace]: \n" + aVar.h, new Object[0]);
                    x.a("[file]: " + aVar.i, new Object[0]);
                    x.a("[lineNumber]: " + aVar.j, new Object[0]);
                    x.a("[columnNumber]: " + aVar.k, new Object[0]);
                    return aVar;
                }
            }
            return null;
        } catch (Throwable th) {
            x.a(th);
            return null;
        }
    }
}
