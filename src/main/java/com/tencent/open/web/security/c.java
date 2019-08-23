package com.tencent.open.web.security;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.tencent.open.a.f;
import com.tencent.open.d;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class c extends d {
    public final boolean a(WebView webView, String str) {
        f.a("openSDK_LOG.SecureJsBridge", "-->canHandleUrl---url = " + str);
        if (str == null || !Uri.parse(str).getScheme().equals("jsbridge")) {
            return false;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList((str + "/#").split("/")));
        if (arrayList.size() < 7) {
            return false;
        }
        String str2 = (String) arrayList.get(2);
        String str3 = (String) arrayList.get(3);
        String str4 = (String) arrayList.get(4);
        String str5 = (String) arrayList.get(5);
        f.a("openSDK_LOG.SecureJsBridge", "-->canHandleUrl, objectName: " + str2 + " | methodName: " + str3 + " | snStr: " + str4);
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            return false;
        }
        try {
            d dVar = new d(webView, Long.parseLong(str4), str, str5);
            a(str2, str3, arrayList.subList(6, arrayList.size() - 1), dVar);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void a(String str, String str2, List<String> list, d.a aVar) {
        f.a("openSDK_LOG.SecureJsBridge", "-->getResult, objectName: " + str + " | methodName: " + str2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.set(i, URLDecoder.decode(list.get(i), "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        d.b bVar = (d.b) this.f79716a.get(str);
        if (bVar != null) {
            f.b("openSDK_LOG.SecureJsBridge", "-->handler != null");
            bVar.a(str2, list, aVar);
            return;
        }
        f.b("openSDK_LOG.SecureJsBridge", "-->handler == null");
        aVar.a();
    }
}
