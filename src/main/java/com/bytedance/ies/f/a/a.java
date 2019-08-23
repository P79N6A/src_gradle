package com.bytedance.ies.f.a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public String f20609a = "_fetchQueue";

    /* renamed from: b  reason: collision with root package name */
    public String f20610b = "_handleMessageFromToutiao";

    /* renamed from: c  reason: collision with root package name */
    public String f20611c = "javascript:ToutiaoJSBridge";

    /* renamed from: d  reason: collision with root package name */
    public WebView f20612d;

    /* renamed from: e  reason: collision with root package name */
    String f20613e;

    /* renamed from: f  reason: collision with root package name */
    public List<String> f20614f;
    public List<String> g;
    public List<String> h;
    private Map<String, d> i = new HashMap();
    private f j;
    private Handler k = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            if (message.obj instanceof h) {
                a.this.a((h) message.obj);
            }
        }
    };

    public final void a(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            a(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public final void a(String str, String... strArr) {
        StringBuilder sb = new StringBuilder("javascript:");
        sb.append(str);
        sb.append("(");
        if (strArr != null) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                sb.append(strArr[0]);
                if (i2 < strArr.length - 1) {
                    sb.append(",");
                }
            }
        }
        sb.append(")");
        if (this.f20612d != null) {
            i.a(this.f20612d, sb.toString());
        }
    }

    public final void a(List<String> list, h hVar, JSONObject jSONObject) {
        this.h = list;
        a(hVar.f20621b, jSONObject);
    }

    public final void a() {
        this.f20612d = null;
        if (this.k != null) {
            this.k.removeCallbacksAndMessages(null);
        }
        this.j = null;
        this.i = null;
    }

    public final a a(f fVar) {
        this.j = fVar;
        return this;
    }

    public final a b(List<String> list) {
        this.g = list;
        return this;
    }

    public static a a(WebView webView) {
        return new a(webView);
    }

    public final a a(WebChromeClient webChromeClient) {
        if (this.f20612d != null) {
            this.f20612d.setWebChromeClient(webChromeClient);
        }
        return this;
    }

    public final a a(WebViewClient webViewClient) {
        if (this.f20612d == null) {
            return this;
        }
        if (webViewClient instanceof c) {
            ((c) webViewClient).f20619d = this;
        }
        this.f20612d.setWebViewClient(webViewClient);
        return this;
    }

    private void a(JSONObject jSONObject) {
        WebView webView = this.f20612d;
        if (webView != null) {
            i.a(webView, this.f20611c + ClassUtils.PACKAGE_SEPARATOR + this.f20610b + "(" + jSONObject.toString() + ")");
        }
    }

    private a(WebView webView) {
        this.f20612d = webView;
        if (this.f20612d != null) {
            if ((this.f20612d instanceof b) && !((b) this.f20612d).f20617a) {
                this.f20612d.setWebChromeClient(new WebChromeClient());
            }
            try {
                this.f20612d.getSettings().setJavaScriptEnabled(true);
            } catch (Exception unused) {
            }
        }
    }

    public final a a(String str) {
        this.f20613e = str;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void c(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                h hVar = new h();
                hVar.f20620a = jSONObject.getString("__msg_type");
                String str2 = null;
                hVar.f20621b = jSONObject.optString("__callback_id", null);
                hVar.f20622c = jSONObject.optString("func");
                hVar.f20623d = jSONObject.optJSONObject("params");
                hVar.f20624e = jSONObject.optInt("JSSDK");
                if (!TextUtils.isEmpty(hVar.f20620a) && !TextUtils.isEmpty(hVar.f20622c)) {
                    if (this.j == null || !this.j.a(hVar)) {
                        Message obtain = Message.obtain();
                        obtain.obj = hVar;
                        this.k.sendMessage(obtain);
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        WebView webView = this.f20612d;
                        if (webView != null) {
                            str2 = webView.getUrl();
                        }
                        this.j.a(hVar, jSONObject2, str2, this);
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final boolean b(String str) {
        if (str == null || !str.startsWith(this.f20613e)) {
            return false;
        }
        String str2 = this.f20613e + "://private/setresult/";
        try {
            if (str.equals(this.f20613e + "://dispatch_message/")) {
                WebView webView = this.f20612d;
                if (webView != null) {
                    if (Build.VERSION.SDK_INT >= 19) {
                        webView.evaluateJavascript(this.f20611c + ClassUtils.PACKAGE_SEPARATOR + this.f20609a + "()", new ValueCallback<String>() {
                            public final /* synthetic */ void onReceiveValue(Object obj) {
                                String str = (String) obj;
                                a aVar = a.this;
                                try {
                                    aVar.c(new JSONObject("{a=" + str + "}").optString("a", ""));
                                } catch (JSONException unused) {
                                }
                            }
                        });
                    } else {
                        i.a(webView, this.f20611c + ClassUtils.PACKAGE_SEPARATOR + this.f20609a + "()");
                    }
                }
                return true;
            }
            if (str.startsWith(str2)) {
                if (Build.VERSION.SDK_INT < 19) {
                    int length = str2.length();
                    int indexOf = str.indexOf(38, length);
                    if (indexOf > 0) {
                        String substring = str.substring(length, indexOf);
                        String substring2 = str.substring(indexOf + 1);
                        if (substring.equals("SCENE_FETCHQUEUE") && substring2.length() > 0) {
                            try {
                                c(new String(Base64.decode(substring2, 2)));
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        } catch (Exception unused2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050 A[Catch:{ Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051 A[Catch:{ Exception -> 0x0082 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "http://"
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "https://"
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x001a
        L_0x0018:
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 != 0) goto L_0x001e
            return r2
        L_0x001e:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0082 }
            r3 = 27
            if (r0 >= r3) goto L_0x003a
            r0 = 92
            int r0 = r7.indexOf(r0)     // Catch:{ Exception -> 0x0082 }
            r3 = -1
            if (r0 == r3) goto L_0x003a
            java.lang.String r7 = r7.substring(r2, r0)     // Catch:{ Exception -> 0x0082 }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r7 = r7.getHost()     // Catch:{ Exception -> 0x0082 }
            goto L_0x0042
        L_0x003a:
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r7 = r7.getHost()     // Catch:{ Exception -> 0x0082 }
        L_0x0042:
            if (r7 == 0) goto L_0x0081
            java.util.List<java.lang.String> r0 = r6.f20614f     // Catch:{ Exception -> 0x0082 }
            if (r0 == 0) goto L_0x0081
            java.util.List<java.lang.String> r0 = r6.f20614f     // Catch:{ Exception -> 0x0082 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x0082 }
            if (r0 == 0) goto L_0x0051
            goto L_0x0081
        L_0x0051:
            r0 = 0
        L_0x0052:
            java.util.List<java.lang.String> r3 = r6.f20614f     // Catch:{ Exception -> 0x0082 }
            int r3 = r3.size()     // Catch:{ Exception -> 0x0082 }
            if (r0 >= r3) goto L_0x0082
            java.util.List<java.lang.String> r3 = r6.f20614f     // Catch:{ Exception -> 0x0082 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0082 }
            boolean r4 = r7.equals(r3)     // Catch:{ Exception -> 0x0082 }
            if (r4 != 0) goto L_0x0080
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
            java.lang.String r5 = "."
            r4.<init>(r5)     // Catch:{ Exception -> 0x0082 }
            r4.append(r3)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0082 }
            boolean r3 = r7.endsWith(r3)     // Catch:{ Exception -> 0x0082 }
            if (r3 == 0) goto L_0x007d
            goto L_0x0080
        L_0x007d:
            int r0 = r0 + 1
            goto L_0x0052
        L_0x0080:
            return r1
        L_0x0081:
            return r2
        L_0x0082:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.f.a.a.d(java.lang.String):boolean");
    }

    public final a a(List<String> list) {
        this.f20614f = list;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        if (r0 != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.ies.f.a.h r5) {
        /*
            r4 = this;
            android.webkit.WebView r0 = r4.f20612d
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            if (r5 == 0) goto L_0x0084
            java.lang.String r1 = "call"
            java.lang.String r2 = r5.f20620a
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x0013
            goto L_0x0084
        L_0x0013:
            java.util.Map<java.lang.String, com.bytedance.ies.f.a.d> r1 = r4.i
            if (r1 == 0) goto L_0x0083
            java.util.Map<java.lang.String, com.bytedance.ies.f.a.d> r1 = r4.i
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0083
            java.lang.String r0 = r0.getUrl()
            boolean r0 = r4.d(r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = r5.f20622c
            java.util.List<java.lang.String> r3 = r4.g
            if (r3 == 0) goto L_0x003b
            java.util.List<java.lang.String> r3 = r4.g
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x003b
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = r5.f20622c
            java.util.List<java.lang.String> r3 = r4.h
            if (r3 == 0) goto L_0x004e
            java.util.List<java.lang.String> r3 = r4.h
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x004e
            r0 = 1
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            if (r0 == 0) goto L_0x0052
        L_0x0051:
            r1 = 1
        L_0x0052:
            if (r1 != 0) goto L_0x0066
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "code"
            r2 = -1
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0065 }
            java.lang.String r5 = r5.f20621b     // Catch:{ JSONException -> 0x0065 }
            r4.a((java.lang.String) r5, (org.json.JSONObject) r0)     // Catch:{ JSONException -> 0x0065 }
            return
        L_0x0065:
            return
        L_0x0066:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Map<java.lang.String, com.bytedance.ies.f.a.d> r1 = r4.i     // Catch:{ Exception -> 0x007a }
            java.lang.String r2 = r5.f20622c     // Catch:{ Exception -> 0x007a }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x007a }
            com.bytedance.ies.f.a.d r1 = (com.bytedance.ies.f.a.d) r1     // Catch:{ Exception -> 0x007a }
            if (r1 == 0) goto L_0x007a
            r1.call(r5, r0)     // Catch:{ Exception -> 0x007a }
        L_0x007a:
            boolean r1 = r5.f20625f
            if (r1 == 0) goto L_0x0083
            java.lang.String r5 = r5.f20621b
            r4.a((java.lang.String) r5, (org.json.JSONObject) r0)
        L_0x0083:
            return
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.f.a.a.a(com.bytedance.ies.f.a.h):void");
    }

    public final void b(String str, JSONObject jSONObject) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("__msg_type", "event");
                jSONObject2.put("__event_id", str);
                if (jSONObject != null) {
                    jSONObject2.put("__params", jSONObject);
                }
                a(jSONObject2);
            }
        } catch (Exception unused) {
        }
    }

    public final a a(String str, d dVar) {
        if (TextUtils.isEmpty(str) || dVar == null) {
            return this;
        }
        this.i.put(str, dVar);
        return this;
    }
}
