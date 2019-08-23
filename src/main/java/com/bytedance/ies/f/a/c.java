package com.bytedance.ies.f.a;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class c extends WebViewClient {

    /* renamed from: d  reason: collision with root package name */
    public a f20619d;

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (this.f20619d != null) {
            this.f20619d.b(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean shouldOverrideUrlLoading(android.webkit.WebView r5, java.lang.String r6) {
        /*
            r4 = this;
            com.bytedance.ies.f.a.a r5 = r4.f20619d
            r0 = 0
            if (r5 == 0) goto L_0x0037
            com.bytedance.ies.f.a.a r5 = r4.f20619d
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            r2 = 1
            if (r1 != 0) goto L_0x0033
            java.lang.String r1 = r5.f20613e
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0017
            goto L_0x0033
        L_0x0017:
            android.net.Uri r1 = android.net.Uri.parse(r6)
            java.lang.String r1 = r1.getScheme()
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r3 = r5.f20613e
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0033
            boolean r5 = r5.b((java.lang.String) r6)
            if (r5 == 0) goto L_0x0033
            r5 = 1
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            if (r5 == 0) goto L_0x0037
            return r2
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.f.a.c.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }
}
