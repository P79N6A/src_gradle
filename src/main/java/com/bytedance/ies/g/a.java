package com.bytedance.ies.g;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f20692a;

    /* renamed from: b  reason: collision with root package name */
    private List<Pattern> f20693b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20694c = true;

    /* renamed from: d  reason: collision with root package name */
    private b f20695d = new b() {
        public final boolean a(String str) {
            return true;
        }
    };

    private a() {
    }

    public final a a(b bVar) {
        this.f20695d = bVar;
        return this;
    }

    public final a a(List<Pattern> list) {
        this.f20693b = list;
        return this;
    }

    public final a a(boolean z) {
        this.f20694c = z;
        return this;
    }

    public static a a(String str) {
        a aVar = new a();
        aVar.f20692a = str;
        if (!aVar.f20692a.endsWith("/")) {
            aVar.f20692a += "/";
        }
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.webkit.WebResourceResponse b(java.lang.String r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.List<java.util.regex.Pattern> r0 = r9.f20693b     // Catch:{ all -> 0x009f }
            r1 = 0
            if (r0 == 0) goto L_0x009d
            boolean r0 = r9.f20694c     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x009d
            java.util.List<java.util.regex.Pattern> r0 = r9.f20693b     // Catch:{ all -> 0x009f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x009f }
            if (r0 != 0) goto L_0x009d
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x001a
            goto L_0x009d
        L_0x001a:
            r0 = 0
            r2 = 0
        L_0x001c:
            java.util.List<java.util.regex.Pattern> r3 = r9.f20693b     // Catch:{ all -> 0x009f }
            int r3 = r3.size()     // Catch:{ all -> 0x009f }
            if (r2 >= r3) goto L_0x009b
            java.util.List<java.util.regex.Pattern> r3 = r9.f20693b     // Catch:{ all -> 0x009f }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x009f }
            java.util.regex.Pattern r3 = (java.util.regex.Pattern) r3     // Catch:{ all -> 0x009f }
            if (r3 == 0) goto L_0x0098
            java.util.regex.Matcher r4 = r3.matcher(r10)     // Catch:{ all -> 0x009f }
            boolean r5 = r4.find()     // Catch:{ all -> 0x009f }
            if (r5 == 0) goto L_0x0098
            java.lang.String r5 = "?"
            int r5 = r10.indexOf(r5)     // Catch:{ all -> 0x009f }
            java.lang.String r6 = "#"
            int r6 = r10.indexOf(r6)     // Catch:{ all -> 0x009f }
            int r7 = java.lang.Math.min(r5, r6)     // Catch:{ all -> 0x009f }
            r8 = -1
            if (r7 != r8) goto L_0x004f
            int r7 = java.lang.Math.max(r5, r6)     // Catch:{ all -> 0x009f }
        L_0x004f:
            if (r7 == r8) goto L_0x005a
            int r4 = r4.end()     // Catch:{ all -> 0x009f }
            java.lang.String r4 = r10.substring(r4, r7)     // Catch:{ all -> 0x009f }
            goto L_0x0062
        L_0x005a:
            int r4 = r4.end()     // Catch:{ all -> 0x009f }
            java.lang.String r4 = r10.substring(r4)     // Catch:{ all -> 0x009f }
        L_0x0062:
            java.lang.String r5 = "/"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x009f }
            if (r5 == 0) goto L_0x0074
            int r5 = r4.length()     // Catch:{ all -> 0x009f }
            int r5 = r5 + -1
            java.lang.String r4 = r4.substring(r0, r5)     // Catch:{ all -> 0x009f }
        L_0x0074:
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x009f }
            if (r5 != 0) goto L_0x0098
            com.bytedance.ies.g.c r0 = com.bytedance.ies.g.c.a()     // Catch:{ all -> 0x009f }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x009f }
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f20698a     // Catch:{ all -> 0x009f }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x009f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x009f }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x009f }
            if (r1 == 0) goto L_0x0092
            java.lang.String r0 = r9.f20692a     // Catch:{ all -> 0x009f }
        L_0x0092:
            android.webkit.WebResourceResponse r10 = r9.a(r10, r4, r0)     // Catch:{ all -> 0x009f }
            monitor-exit(r9)
            return r10
        L_0x0098:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x009b:
            monitor-exit(r9)
            return r1
        L_0x009d:
            monitor-exit(r9)
            return r1
        L_0x009f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.g.a.b(java.lang.String):android.webkit.WebResourceResponse");
    }

    private boolean a(String str, String str2) {
        if (this.f20695d == null) {
            return true;
        }
        try {
            return this.f20695d.a(str + str2.split("/")[0]);
        } catch (Exception unused) {
            return false;
        }
    }

    private synchronized WebResourceResponse a(String str, String str2, String str3) {
        String str4;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && this.f20694c) {
            if (str3 != null) {
                if (str2.endsWith(".js")) {
                    str4 = "application/x-javascript";
                } else if (str2.endsWith(".css")) {
                    str4 = "text/css";
                } else if (str2.endsWith(".html")) {
                    str4 = "text/html";
                } else if (str2.endsWith(".ico")) {
                    str4 = "image/x-icon";
                } else {
                    if (!str2.endsWith(".jpeg")) {
                        if (!str2.endsWith(".jpg")) {
                            if (str2.endsWith(".png")) {
                                str4 = "image/png";
                            } else if (str2.endsWith(".gif")) {
                                str4 = "image/gif";
                            } else if (str2.endsWith(".woff")) {
                                str4 = "font/woff";
                            } else if (str2.endsWith(".svg")) {
                                str4 = "image/svg+xml";
                            } else if (str2.endsWith(".ttf")) {
                                str4 = "font/ttf";
                            } else {
                                str4 = "";
                            }
                        }
                    }
                    str4 = "image/jpeg";
                }
                return a(str4, "", str2, str3);
            }
        }
        return null;
    }

    private WebResourceResponse a(String str, String str2, String str3, String str4) {
        WebResourceResponse webResourceResponse;
        String str5 = str4 + str3;
        if (!a(str4, str3)) {
            return null;
        }
        File file = new File(str5);
        if (file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                HashMap hashMap = new HashMap();
                hashMap.put("Access-Control-Allow-Origin", "*");
                if (Build.VERSION.SDK_INT < 21 || !"font/ttf".equals(str)) {
                    webResourceResponse = new WebResourceResponse(str, str2, fileInputStream);
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
                    webResourceResponse = new WebResourceResponse(str, str2, 200, "OK", hashMap, fileInputStream);
                }
                return webResourceResponse;
            } catch (Exception unused2) {
            }
        }
        return null;
    }
}
