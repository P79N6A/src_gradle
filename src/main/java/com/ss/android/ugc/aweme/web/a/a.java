package com.ss.android.ugc.aweme.web.a;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.c.c;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.regex.Pattern;

public abstract class a implements c.a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f76616b;

    public WebResourceResponse a(String str) {
        String str2 = str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f76616b, false, 89908, new Class[]{String.class}, WebResourceResponse.class)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(new Object[]{str2}, this, f76616b, false, 89908, new Class[]{String.class}, WebResourceResponse.class);
        }
        WebResourceResponse webResourceResponse = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (PatchProxy.isSupport(new Object[]{str2}, this, f76616b, false, 89909, new Class[]{String.class}, WebResourceResponse.class)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(new Object[]{str2}, this, f76616b, false, 89909, new Class[]{String.class}, WebResourceResponse.class);
        }
        if (PatchProxy.isSupport(new Object[]{str2}, this, f76616b, false, 89910, new Class[]{String.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f76616b, false, 89910, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!TextUtils.isEmpty(null)) {
            z = Pattern.compile(null).matcher(str2).find();
        }
        if (z) {
            webResourceResponse = a(b(str), "", null);
        }
        return webResourceResponse;
    }

    public final String b(String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3}, this, f76616b, false, 89911, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3}, this, f76616b, false, 89911, new Class[]{String.class}, String.class);
        }
        if (str3.endsWith(".js")) {
            str2 = "application/x-javascript";
        } else if (str3.endsWith(".css")) {
            str2 = "text/css";
        } else if (str3.endsWith(".html")) {
            str2 = "text/html";
        } else if (str3.endsWith(".ico")) {
            str2 = "image/x-icon";
        } else if (str3.endsWith(".jpeg") || str3.endsWith(".jpg")) {
            str2 = "image/jpeg";
        } else if (str3.endsWith(".png")) {
            str2 = "image/png";
        } else if (str3.endsWith(".gif")) {
            str2 = "image/gif";
        } else if (str3.endsWith(".woff")) {
            str2 = "font/woff";
        } else if (str3.endsWith(".svg")) {
            str2 = "image/svg+xml";
        } else if (str3.endsWith(".ttf")) {
            str2 = "font/ttf";
        } else {
            str2 = "";
        }
        return str2;
    }

    public final WebResourceResponse a(String str, String str2, InputStream inputStream) {
        WebResourceResponse webResourceResponse;
        String str3 = str;
        String str4 = str2;
        InputStream inputStream2 = inputStream;
        if (PatchProxy.isSupport(new Object[]{str3, str4, inputStream2}, this, f76616b, false, 89912, new Class[]{String.class, String.class, InputStream.class}, WebResourceResponse.class)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(new Object[]{str3, str4, inputStream2}, this, f76616b, false, 89912, new Class[]{String.class, String.class, InputStream.class}, WebResourceResponse.class);
        }
        if (inputStream2 != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("Access-Control-Allow-Origin", "*");
                if (Build.VERSION.SDK_INT < 21 || !"font/ttf".equals(str3)) {
                    webResourceResponse = new WebResourceResponse(str3, str4, inputStream2);
                    if (Build.VERSION.SDK_INT >= 21) {
                        webResourceResponse.setResponseHeaders(hashMap);
                    } else {
                        try {
                            Field field = webResourceResponse.getClass().getField("mResponseHeaders");
                            field.setAccessible(true);
                            field.set(webResourceResponse, hashMap);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    webResourceResponse = new WebResourceResponse(str, str2, 200, "OK", hashMap, inputStream);
                }
                return webResourceResponse;
            } catch (Exception unused2) {
            }
        }
        return null;
    }
}
