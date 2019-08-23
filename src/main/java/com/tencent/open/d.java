package com.tencent.open;

import android.net.Uri;
import android.webkit.WebView;
import com.tencent.open.a.f;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    protected HashMap<String, b> f79716a = new HashMap<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        protected WeakReference<WebView> f79717a;

        /* renamed from: b  reason: collision with root package name */
        protected long f79718b;

        /* renamed from: c  reason: collision with root package name */
        protected String f79719c;

        public void a() {
            WebView webView = (WebView) this.f79717a.get();
            if (webView != null) {
                e.a(webView, "javascript:window.JsBridge&&JsBridge.callback(" + this.f79718b + ",{'r':1,'result':'no such method'})");
            }
        }

        public void a(String str) {
            WebView webView = (WebView) this.f79717a.get();
            if (webView != null) {
                e.a(webView, "javascript:" + str);
            }
        }

        public void a(Object obj) {
            WebView webView = (WebView) this.f79717a.get();
            if (webView != null) {
                e.a(webView, "javascript:window.JsBridge&&JsBridge.callback(" + this.f79718b + ",{'r':0,'result':" + "'undefined'" + "});");
            }
        }

        public a(WebView webView, long j, String str) {
            this.f79717a = new WeakReference<>(webView);
            this.f79718b = j;
            this.f79719c = str;
        }
    }

    public static class b {
        public boolean a() {
            return false;
        }

        public final void a(String str, List<String> list, a aVar) {
            String str2;
            Method method;
            Object obj;
            Method[] declaredMethods = getClass().getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                str2 = null;
                if (i >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i];
                if (method.getName().equals(str) && method.getParameterTypes().length == list.size()) {
                    break;
                }
                i++;
            }
            if (method != null) {
                try {
                    switch (list.size()) {
                        case 0:
                            obj = method.invoke(this, new Object[0]);
                            break;
                        case 1:
                            obj = method.invoke(this, new Object[]{list.get(0)});
                            break;
                        case 2:
                            obj = method.invoke(this, new Object[]{list.get(0), list.get(1)});
                            break;
                        case 3:
                            obj = method.invoke(this, new Object[]{list.get(0), list.get(1), list.get(2)});
                            break;
                        case 4:
                            obj = method.invoke(this, new Object[]{list.get(0), list.get(1), list.get(2), list.get(3)});
                            break;
                        case 5:
                            obj = method.invoke(this, new Object[]{list.get(0), list.get(1), list.get(2), list.get(3), list.get(4)});
                            break;
                        default:
                            Object[] objArr = new Object[6];
                            objArr[0] = list.get(0);
                            objArr[1] = list.get(1);
                            objArr[2] = list.get(2);
                            objArr[3] = list.get(3);
                            objArr[4] = list.get(4);
                            objArr[5] = list.get(5);
                            obj = method.invoke(this, objArr);
                            break;
                    }
                    Class<?> returnType = method.getReturnType();
                    f.b("openSDK_LOG.JsBridge", "-->call, result: " + obj + " | ReturnType: " + returnType.getName());
                    if (!"void".equals(returnType.getName())) {
                        if (returnType != Void.class) {
                            if (aVar != null && a()) {
                                if (obj != null) {
                                    str2 = obj.toString();
                                }
                                aVar.a(str2);
                            }
                        }
                    }
                    if (aVar != null) {
                        aVar.a((Object) null);
                    }
                } catch (Exception e2) {
                    f.b("openSDK_LOG.JsBridge", "-->handler call mehtod ex. targetMethod: " + method, e2);
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            } else {
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    public final void a(b bVar, String str) {
        this.f79716a.put(str, bVar);
    }

    public boolean a(WebView webView, String str) {
        f.a("openSDK_LOG.JsBridge", "-->canHandleUrl---url = " + str);
        if (str == null || !Uri.parse(str).getScheme().equals("jsbridge")) {
            return false;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList((str + "/#").split("/")));
        if (arrayList.size() < 6) {
            return false;
        }
        List subList = arrayList.subList(4, arrayList.size() - 1);
        a aVar = new a(webView, 4, str);
        webView.getUrl();
        a((String) arrayList.get(2), (String) arrayList.get(3), subList, aVar);
        return true;
    }

    public void a(String str, String str2, List<String> list, a aVar) {
        f.a("openSDK_LOG.JsBridge", "getResult---objName = " + str + " methodName = " + str2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.set(i, URLDecoder.decode(list.get(i), "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        b bVar = this.f79716a.get(str);
        if (bVar != null) {
            f.b("openSDK_LOG.JsBridge", "call----");
            bVar.a(str2, list, aVar);
            return;
        }
        f.b("openSDK_LOG.JsBridge", "not call----objName NOT FIND");
        aVar.a();
    }
}
