package com.bytedance.ies.f.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.lancet.c;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public WebView f20630a;

    /* renamed from: b  reason: collision with root package name */
    Set<String> f20631b;

    /* renamed from: c  reason: collision with root package name */
    public Context f20632c;

    /* renamed from: d  reason: collision with root package name */
    Set<String> f20633d;

    /* renamed from: e  reason: collision with root package name */
    public g f20634e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f20635f = false;
    private String g;
    private Handler h = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f20630a.removeJavascriptInterface(this.g);
        this.h.removeCallbacksAndMessages(null);
        this.f20634e = null;
        this.f20630a = null;
        this.f20632c = null;
        this.f20635f = true;
    }

    /* access modifiers changed from: package-private */
    public final void a(final JSONObject jSONObject) {
        if (!this.f20635f) {
            this.h.post(new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:32:0x00b1  */
                /* JADX WARNING: Removed duplicated region for block: B:36:0x00d2  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r11 = this;
                        com.bytedance.ies.f.b.e r0 = com.bytedance.ies.f.b.e.this
                        boolean r0 = r0.f20635f
                        if (r0 == 0) goto L_0x0007
                        return
                    L_0x0007:
                        com.bytedance.ies.f.b.e r0 = com.bytedance.ies.f.b.e.this
                        org.json.JSONObject r1 = r3
                        boolean r2 = r0.f20635f
                        r3 = 0
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L_0x0015
                    L_0x0012:
                        r0 = r3
                        goto L_0x0095
                    L_0x0015:
                        java.lang.String r2 = "__callback_id"
                        java.lang.String r2 = r1.optString(r2)
                        android.webkit.WebView r6 = r0.f20630a
                        java.lang.String r6 = r6.getUrl()
                        if (r6 != 0) goto L_0x0024
                        goto L_0x0012
                    L_0x0024:
                        android.webkit.WebView r6 = r0.f20630a
                        java.lang.String r6 = r6.getUrl()
                        android.net.Uri r6 = android.net.Uri.parse(r6)
                        java.lang.String r6 = r6.getHost()
                        java.lang.String r7 = "func"
                        java.lang.String r7 = r1.optString(r7)
                        java.util.Set<java.lang.String> r8 = r0.f20633d
                        boolean r8 = r8.contains(r7)
                        if (r8 != 0) goto L_0x0062
                        if (r6 == 0) goto L_0x0062
                        java.util.Set<java.lang.String> r0 = r0.f20631b
                        java.util.Iterator r0 = r0.iterator()
                    L_0x0048:
                        boolean r9 = r0.hasNext()
                        if (r9 == 0) goto L_0x0062
                        java.lang.Object r9 = r0.next()
                        java.lang.String r9 = (java.lang.String) r9
                        boolean r10 = r6.equals(r9)
                        if (r10 != 0) goto L_0x0060
                        boolean r9 = r6.endsWith(r9)
                        if (r9 == 0) goto L_0x0048
                    L_0x0060:
                        r8 = 1
                        goto L_0x0048
                    L_0x0062:
                        if (r8 == 0) goto L_0x008b
                        java.lang.String r0 = "__msg_type"
                        java.lang.String r0 = r1.optString(r0)
                        java.lang.String r6 = "params"
                        java.lang.String r6 = r1.optString(r6)
                        java.lang.String r8 = "JSSDK"
                        int r1 = r1.optInt(r8)
                        com.bytedance.ies.f.b.n$a r8 = new com.bytedance.ies.f.b.n$a
                        r8.<init>(r5)
                        r8.f20671a = r1
                        r8.f20672b = r0
                        r8.f20673c = r7
                        r8.f20674d = r6
                        r8.f20675e = r2
                        com.bytedance.ies.f.b.n r0 = new com.bytedance.ies.f.b.n
                        r0.<init>(r8, r5)
                        goto L_0x0095
                    L_0x008b:
                        com.bytedance.ies.f.b.n r0 = new com.bytedance.ies.f.b.n
                        r0.<init>()
                        r1 = -1
                        r0.f20665a = r1
                        r0.f20670f = r2
                    L_0x0095:
                        if (r0 == 0) goto L_0x00ae
                        int r1 = r0.f20665a
                        if (r1 != r4) goto L_0x00ae
                        java.lang.String r1 = r0.f20668d
                        boolean r1 = android.text.TextUtils.isEmpty(r1)
                        if (r1 != 0) goto L_0x00ae
                        java.lang.String r1 = r0.f20669e
                        boolean r1 = android.text.TextUtils.isEmpty(r1)
                        if (r1 == 0) goto L_0x00ac
                        goto L_0x00ae
                    L_0x00ac:
                        r1 = 0
                        goto L_0x00af
                    L_0x00ae:
                        r1 = 1
                    L_0x00af:
                        if (r1 == 0) goto L_0x00d2
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "By pass invalid call: "
                        r1.<init>(r2)
                        r1.append(r0)
                        if (r0 == 0) goto L_0x00d1
                        com.bytedance.ies.f.b.e r1 = com.bytedance.ies.f.b.e.this
                        java.lang.String r2 = r0.f20670f
                        com.bytedance.ies.f.b.q r3 = new com.bytedance.ies.f.b.q
                        int r0 = r0.f20665a
                        java.lang.String r4 = "Failed to parse invocation."
                        r3.<init>(r0, r4)
                        java.lang.String r0 = com.bytedance.ies.f.b.t.a((java.lang.Throwable) r3)
                        r1.a(r2, r0)
                    L_0x00d1:
                        return
                    L_0x00d2:
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "Created call: "
                        r1.<init>(r2)
                        r1.append(r0)
                        com.bytedance.ies.f.b.f r1 = new com.bytedance.ies.f.b.f
                        r1.<init>()
                        com.bytedance.ies.f.b.e r2 = com.bytedance.ies.f.b.e.this
                        android.webkit.WebView r2 = r2.f20630a
                        java.lang.String r2 = r2.getUrl()
                        r1.f20641b = r2
                        com.bytedance.ies.f.b.f$a r2 = com.bytedance.ies.f.b.f.a.PUBLIC
                        r1.f20642c = r2
                        com.bytedance.ies.f.b.e r2 = com.bytedance.ies.f.b.e.this
                        android.content.Context r2 = r2.f20632c
                        r1.f20640a = r2
                        com.bytedance.ies.f.b.e r2 = com.bytedance.ies.f.b.e.this
                        com.bytedance.ies.f.b.g r2 = r2.f20634e
                        r1.f20643d = r2
                        com.bytedance.ies.f.b.e r2 = com.bytedance.ies.f.b.e.this     // Catch:{ Exception -> 0x01e3 }
                        com.bytedance.ies.f.b.g r2 = r2.f20634e     // Catch:{ Exception -> 0x01e3 }
                        java.util.Map<java.lang.String, com.bytedance.ies.f.b.a> r6 = r2.f20646c     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r7 = r0.f20668d     // Catch:{ Exception -> 0x01e3 }
                        java.lang.Object r6 = r6.get(r7)     // Catch:{ Exception -> 0x01e3 }
                        com.bytedance.ies.f.b.a r6 = (com.bytedance.ies.f.b.a) r6     // Catch:{ Exception -> 0x01e3 }
                        boolean r7 = r6 instanceof com.bytedance.ies.f.b.d     // Catch:{ Exception -> 0x01e3 }
                        if (r7 == 0) goto L_0x0133
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r7 = "Received stateless call: "
                        r3.<init>(r7)     // Catch:{ Exception -> 0x01e3 }
                        r3.append(r0)     // Catch:{ Exception -> 0x01e3 }
                        com.bytedance.ies.f.b.d r6 = (com.bytedance.ies.f.b.d) r6     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r3 = r0.f20669e     // Catch:{ Exception -> 0x01e3 }
                        java.lang.Object r3 = r2.a((java.lang.String) r3, (com.bytedance.ies.f.b.a) r6)     // Catch:{ Exception -> 0x01e3 }
                        java.lang.Object r1 = r6.invoke(r3, r1)     // Catch:{ Exception -> 0x01e3 }
                        com.bytedance.ies.f.b.g$a r3 = new com.bytedance.ies.f.b.g$a     // Catch:{ Exception -> 0x01e3 }
                        com.bytedance.ies.f.b.h r2 = r2.f20645b     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r1 = r2.a(r1)     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r1 = com.bytedance.ies.f.b.t.a((java.lang.String) r1)     // Catch:{ Exception -> 0x01e3 }
                        r3.<init>(r4, r1, r5)     // Catch:{ Exception -> 0x01e3 }
                        goto L_0x01a2
                    L_0x0133:
                        boolean r4 = r6 instanceof com.bytedance.ies.f.b.b     // Catch:{ Exception -> 0x01e3 }
                        if (r4 == 0) goto L_0x015c
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r3 = "Received c call: "
                        r1.<init>(r3)     // Catch:{ Exception -> 0x01e3 }
                        r1.append(r0)     // Catch:{ Exception -> 0x01e3 }
                        com.bytedance.ies.f.b.b r6 = (com.bytedance.ies.f.b.b) r6     // Catch:{ Exception -> 0x01e3 }
                        com.bytedance.ies.f.b.s r1 = new com.bytedance.ies.f.b.s     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r3 = r0.f20668d     // Catch:{ Exception -> 0x01e3 }
                        com.bytedance.ies.f.b.g$2 r4 = new com.bytedance.ies.f.b.g$2     // Catch:{ Exception -> 0x01e3 }
                        r4.<init>(r0)     // Catch:{ Exception -> 0x01e3 }
                        r1.<init>(r3, r4)     // Catch:{ Exception -> 0x01e3 }
                        r6.a(r0, r1)     // Catch:{ Exception -> 0x01e3 }
                        com.bytedance.ies.f.b.g$a r3 = new com.bytedance.ies.f.b.g$a     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r1 = com.bytedance.ies.f.b.t.a()     // Catch:{ Exception -> 0x01e3 }
                        r3.<init>(r5, r1, r5)     // Catch:{ Exception -> 0x01e3 }
                        goto L_0x01a2
                    L_0x015c:
                        java.util.Map<java.lang.String, com.bytedance.ies.f.b.c$b> r4 = r2.f20647d     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r6 = r0.f20668d     // Catch:{ Exception -> 0x01e3 }
                        java.lang.Object r4 = r4.get(r6)     // Catch:{ Exception -> 0x01e3 }
                        com.bytedance.ies.f.b.c$b r4 = (com.bytedance.ies.f.b.c.b) r4     // Catch:{ Exception -> 0x01e3 }
                        if (r4 == 0) goto L_0x0193
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r6 = "Received stateful call: "
                        r3.<init>(r6)     // Catch:{ Exception -> 0x01e3 }
                        r3.append(r0)     // Catch:{ Exception -> 0x01e3 }
                        com.bytedance.ies.f.b.c r3 = r4.a()     // Catch:{ Exception -> 0x01e3 }
                        java.util.Set<com.bytedance.ies.f.b.c> r4 = r2.f20648e     // Catch:{ Exception -> 0x01e3 }
                        r4.add(r3)     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r4 = r0.f20669e     // Catch:{ Exception -> 0x01e3 }
                        java.lang.Object r4 = r2.a((java.lang.String) r4, (com.bytedance.ies.f.b.a) r3)     // Catch:{ Exception -> 0x01e3 }
                        com.bytedance.ies.f.b.g$1 r6 = new com.bytedance.ies.f.b.g$1     // Catch:{ Exception -> 0x01e3 }
                        r6.<init>(r0, r3)     // Catch:{ Exception -> 0x01e3 }
                        r3.a(r4, r1, r6)     // Catch:{ Exception -> 0x01e3 }
                        com.bytedance.ies.f.b.g$a r3 = new com.bytedance.ies.f.b.g$a     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r1 = com.bytedance.ies.f.b.t.a()     // Catch:{ Exception -> 0x01e3 }
                        r3.<init>(r5, r1, r5)     // Catch:{ Exception -> 0x01e3 }
                        goto L_0x01a2
                    L_0x0193:
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r2 = "Received call: "
                        r1.<init>(r2)     // Catch:{ Exception -> 0x01e3 }
                        r1.append(r0)     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r2 = ", but not registered."
                        r1.append(r2)     // Catch:{ Exception -> 0x01e3 }
                    L_0x01a2:
                        if (r3 != 0) goto L_0x01d5
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r2 = "Received call but not registered, "
                        r1.<init>(r2)     // Catch:{ Exception -> 0x01e3 }
                        r1.append(r0)     // Catch:{ Exception -> 0x01e3 }
                        com.bytedance.ies.f.b.e r1 = com.bytedance.ies.f.b.e.this     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r2 = r0.f20670f     // Catch:{ Exception -> 0x01e3 }
                        com.bytedance.ies.f.b.q r3 = new com.bytedance.ies.f.b.q     // Catch:{ Exception -> 0x01e3 }
                        r4 = -2
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r6 = "Function "
                        r5.<init>(r6)     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r6 = r0.f20668d     // Catch:{ Exception -> 0x01e3 }
                        r5.append(r6)     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r6 = "is not registered."
                        r5.append(r6)     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01e3 }
                        r3.<init>(r4, r5)     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r3 = com.bytedance.ies.f.b.t.a((java.lang.Throwable) r3)     // Catch:{ Exception -> 0x01e3 }
                        r1.a(r2, r3)     // Catch:{ Exception -> 0x01e3 }
                        return
                    L_0x01d5:
                        boolean r1 = r3.f20654a     // Catch:{ Exception -> 0x01e3 }
                        if (r1 == 0) goto L_0x01e2
                        com.bytedance.ies.f.b.e r1 = com.bytedance.ies.f.b.e.this     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r2 = r0.f20670f     // Catch:{ Exception -> 0x01e3 }
                        java.lang.String r3 = r3.f20655b     // Catch:{ Exception -> 0x01e3 }
                        r1.a(r2, r3)     // Catch:{ Exception -> 0x01e3 }
                    L_0x01e2:
                        return
                    L_0x01e3:
                        r1 = move-exception
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        java.lang.String r3 = "call finished with error, "
                        r2.<init>(r3)
                        r2.append(r0)
                        com.bytedance.ies.f.b.e r2 = com.bytedance.ies.f.b.e.this
                        java.lang.String r0 = r0.f20670f
                        java.lang.String r1 = com.bytedance.ies.f.b.t.a((java.lang.Throwable) r1)
                        r2.a(r0, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.f.b.e.AnonymousClass1.run():void");
                }
            });
        }
    }

    @JavascriptInterface
    public final void invokeMethod(String str) {
        if (!this.f20635f) {
            new StringBuilder("Received call: ").append(str);
            try {
                a(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }
    }

    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    e(j jVar) {
        this.f20630a = jVar.f20658a;
        this.f20631b = jVar.f20660c;
        this.f20633d = jVar.f20661d;
        this.g = jVar.f20659b;
        if (jVar.f20663f != null) {
            this.f20632c = jVar.f20663f;
        } else {
            this.f20632c = this.f20630a.getContext();
        }
        if (Build.VERSION.SDK_INT >= 17) {
            this.f20630a.addJavascriptInterface(this, this.g);
        }
    }

    private void a(String str) {
        if (!this.f20635f) {
            if (str == null) {
                str = "";
            }
            final String str2 = "javascript:" + this.g + "._handleMessageFromToutiao(" + str + ")";
            AnonymousClass2 r0 = new Runnable() {
                public final void run() {
                    if (!e.this.f20635f) {
                        if (Build.VERSION.SDK_INT >= 19) {
                            new StringBuilder("Invoking Jsb using evaluateJavascript: ").append(str2);
                            e.this.f20630a.evaluateJavascript(str2, null);
                            return;
                        }
                        new StringBuilder("Invoking Jsb using loadUrl: ").append(str2);
                        WebView webView = e.this.f20630a;
                        String str = str2;
                        c.a(str);
                        webView.loadUrl(str);
                    }
                }
            };
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new StringBuilder("Received call on sub-thread, posting to main thread: ").append(str2);
                this.h.post(r0);
                return;
            }
            r0.run();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, String str2) {
        if (!this.f20635f) {
            new StringBuilder("Sending js event: ").append(str);
            a("{\"__msg_type\":\"event\",\"__event_id\":\"" + str + "\",\"__params\":" + str2 + "}");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        if (!this.f20635f) {
            if (TextUtils.isEmpty(str)) {
                new StringBuilder("By passing js callback due to empty callback: ").append(str2);
                return;
            }
            if (!str2.startsWith("{") || !str2.endsWith("}")) {
                i.a(new IllegalArgumentException("Illegal callback data: " + str2));
            }
            new StringBuilder("Invoking js callback: ").append(str);
            a("{\"__msg_type\":\"callback\",\"__callback_id\":\"" + str + "\",\"__params\":" + str2 + "}");
        }
    }
}
