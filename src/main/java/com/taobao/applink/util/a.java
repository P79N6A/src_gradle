package com.taobao.applink.util;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.lancet.c;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class a {

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(WebView webView, String str) {
            c.a(str);
            webView.loadUrl(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a A[SYNTHETIC, Splitter:B:24:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0051 A[SYNTHETIC, Splitter:B:32:0x0051] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x0054
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L_0x000a
            goto L_0x0054
        L_0x000a:
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ Throwable -> 0x004e, all -> 0x0046 }
            java.io.InputStream r4 = r4.open(r5)     // Catch:{ Throwable -> 0x004e, all -> 0x0046 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x004f, all -> 0x0044 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x004f, all -> 0x0044 }
            r1.<init>(r4)     // Catch:{ Throwable -> 0x004f, all -> 0x0044 }
            r5.<init>(r1)     // Catch:{ Throwable -> 0x004f, all -> 0x0044 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x004f, all -> 0x0044 }
            r1.<init>()     // Catch:{ Throwable -> 0x004f, all -> 0x0044 }
        L_0x0021:
            java.lang.String r2 = r5.readLine()     // Catch:{ Throwable -> 0x004f, all -> 0x0044 }
            if (r2 == 0) goto L_0x0032
            java.lang.String r3 = "^\\s*\\/\\/.*"
            boolean r3 = r2.matches(r3)     // Catch:{ Throwable -> 0x004f, all -> 0x0044 }
            if (r3 != 0) goto L_0x0032
            r1.append(r2)     // Catch:{ Throwable -> 0x004f, all -> 0x0044 }
        L_0x0032:
            if (r2 != 0) goto L_0x0021
            r5.close()     // Catch:{ Throwable -> 0x004f, all -> 0x0044 }
            r4.close()     // Catch:{ Throwable -> 0x004f, all -> 0x0044 }
            java.lang.String r5 = r1.toString()     // Catch:{ Throwable -> 0x004f, all -> 0x0044 }
            if (r4 == 0) goto L_0x0043
            r4.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            return r5
        L_0x0044:
            r5 = move-exception
            goto L_0x0048
        L_0x0046:
            r5 = move-exception
            r4 = r0
        L_0x0048:
            if (r4 == 0) goto L_0x004d
            r4.close()     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            throw r5
        L_0x004e:
            r4 = r0
        L_0x004f:
            if (r4 == 0) goto L_0x0054
            r4.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.applink.util.a.a(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.replace("tblink://return/", "").split("/");
        if (split.length > 0) {
            return split[0];
        }
        return null;
    }

    public static void a(WebView webView) {
        if (webView != null && !TextUtils.isEmpty("TBAppLinkJsBridge.js")) {
            String a2 = a(webView.getContext(), "TBAppLinkJsBridge.js");
            _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(webView, "javascript:" + a2);
        }
    }

    public static void a(WebView webView, com.taobao.applink.i.a aVar) {
        if (!(webView == null || aVar == null)) {
            com.taobao.applink.f.a.a a2 = aVar.a();
            if (a2 != null) {
                a2.a(webView, "TBAppLink", new b(webView));
            }
        }
    }

    public static void a(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(webView, "javascript:" + str);
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.replace("javascript:TBAppLinkJsBridge.", "").replaceAll("\\(.*\\);", "");
    }

    public static void b(WebView webView) {
        try {
            a(webView, String.format("window.applinkInfo ={sdkVersion:\"%s\",system:\"%s\",device:\"%s\",taoVersion:\"%s\"};", new Object[]{"2.0.0", String.valueOf("ANDROID " + Build.VERSION.SDK_INT), String.valueOf(Build.MODEL), com.taobao.applink.b.a.c(webView.getContext())}));
        } catch (Throwable unused) {
        }
    }

    public static String c(String str) {
        if (str.startsWith("tblink://return/_fetchQueue/")) {
            return str.replace("tblink://return/_fetchQueue/", "");
        }
        String[] split = str.replace("tblink://return/", "").split("/");
        if (split.length < 2) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < split.length; i++) {
            sb.append(split[i]);
        }
        return sb.toString();
    }
}
