package com.ss.sys.ck;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static Map<String, HashMap<String, Method>> f78574a = new HashMap();

    public static boolean a(WebView webView, String str) {
        String str2 = "";
        String str3 = "";
        String str4 = "{}";
        String str5 = "";
        if (!TextUtils.isEmpty(str) && str.startsWith("jsbridge")) {
            try {
                Uri parse = Uri.parse(str);
                str3 = parse.getHost();
                str4 = parse.getQuery();
                str5 = parse.getPort();
                String path = parse.getPath();
                if (!TextUtils.isEmpty(path)) {
                    str2 = path.replace("/", "");
                }
            } catch (Throwable unused) {
                return false;
            }
        }
        if (f78574a.containsKey(str3)) {
            HashMap hashMap = f78574a.get(str3);
            if (!(hashMap == null || hashMap.size() == 0 || !hashMap.containsKey(str2))) {
                Method method = (Method) hashMap.get(str2);
                if (!(method == null || webView == null)) {
                    try {
                        method.invoke(null, new Object[]{webView, new JSONObject(str4), new d(webView, str5)});
                        return true;
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
        return false;
    }
}
