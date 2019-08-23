package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.FileProvider;
import android.webkit.WebView;
import com.bytedance.common.util.JellyBeanMR1V17Compat;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.http.a.a.b;
import com.ss.android.ugc.aweme.app.f;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.conn.ConnectTimeoutException;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75917a;

    /* renamed from: b  reason: collision with root package name */
    static final AtomicLong f75918b = new AtomicLong();

    /* renamed from: c  reason: collision with root package name */
    private static String f75919c = null;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f75920d = false;

    public static Uri a(Context context, File file) {
        Uri uri;
        Context context2 = context;
        File file2 = file;
        if (PatchProxy.isSupport(new Object[]{context2, file2}, null, f75917a, true, 87947, new Class[]{Context.class, File.class}, Uri.class)) {
            return (Uri) PatchProxy.accessDispatch(new Object[]{context2, file2}, null, f75917a, true, 87947, new Class[]{Context.class, File.class}, Uri.class);
        }
        if (context2 == null || Build.VERSION.SDK_INT < 24 || context.getApplicationInfo().targetSdkVersion < 24) {
            uri = Uri.fromFile(file);
        } else {
            uri = FileProvider.getUriForFile(context2, context.getPackageName() + ".fileprovider", file2);
        }
        return uri;
    }

    public static int a(Context context, Throwable th) {
        int i;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{context, th2}, null, f75917a, true, 87920, new Class[]{Context.class, Throwable.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, th2}, null, f75917a, true, 87920, new Class[]{Context.class, Throwable.class}, Integer.TYPE)).intValue();
        }
        if (th2 instanceof ConnectTimeoutException) {
            i = 13;
        } else if (th2 instanceof SocketTimeoutException) {
            i = 14;
        } else {
            if (!(th2 instanceof SocketException)) {
                if (th2 instanceof SSLPeerUnverifiedException) {
                    i = 21;
                } else if (th2 instanceof b) {
                    if (((b) th2).getStatusCode() == 503) {
                        i = 19;
                    } else {
                        i = 16;
                    }
                } else if (!(th2 instanceof IOException)) {
                    i = 18;
                }
            }
            i = 15;
        }
        if (context != null && ((i == 15 || i == 14) && !NetworkUtils.isNetworkAvailable(context))) {
            i = 12;
        }
        return i;
    }

    public static String a(Context context, WebView webView) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, null}, null, f75917a, true, 87941, new Class[]{Context.class, WebView.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2, null}, null, f75917a, true, 87941, new Class[]{Context.class, WebView.class}, String.class);
        } else if (!StringUtils.isEmpty(f75919c)) {
            return f75919c;
        } else {
            String webViewDefaultUserAgent = JellyBeanMR1V17Compat.getWebViewDefaultUserAgent(context);
            f75919c = webViewDefaultUserAgent;
            if (!StringUtils.isEmpty(webViewDefaultUserAgent)) {
                return f75919c;
            }
            if (!f75920d && context2 != null && (context2 instanceof Activity)) {
                f75920d = true;
                try {
                    WebView webView2 = new WebView(context2);
                    f75919c = webView2.getSettings().getUserAgentString();
                    webView2.destroy();
                } catch (Throwable unused) {
                }
            }
            return f75919c;
        }
    }

    public static boolean a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{context2, str2}, null, f75917a, true, 87958, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return f.f34171e.a(context2, str2, "");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f75917a, true, 87958, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long a(java.lang.String r26, java.lang.String r27, android.content.Context r28, boolean r29, java.lang.String r30, java.util.List<com.ss.android.http.a.a> r31, boolean r32, boolean r33, boolean r34, boolean r35, org.json.JSONObject r36) {
        /*
            r6 = r28
            r0 = r36
            r2 = 11
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r3 = 0
            r8[r3] = r26
            r4 = 1
            r8[r4] = r27
            r5 = 2
            r8[r5] = r6
            java.lang.Byte r9 = java.lang.Byte.valueOf(r29)
            r15 = 3
            r8[r15] = r9
            r16 = 0
            r17 = 4
            r8[r17] = r16
            r18 = 5
            r8[r18] = r16
            java.lang.Byte r9 = java.lang.Byte.valueOf(r32)
            r19 = 6
            r8[r19] = r9
            java.lang.Byte r9 = java.lang.Byte.valueOf(r33)
            r20 = 7
            r8[r20] = r9
            java.lang.Byte r9 = java.lang.Byte.valueOf(r34)
            r21 = 8
            r8[r21] = r9
            java.lang.Byte r9 = java.lang.Byte.valueOf(r3)
            r14 = 9
            r8[r14] = r9
            r22 = 10
            r8[r22] = r0
            com.meituan.robust.ChangeQuickRedirect r10 = f75917a
            java.lang.Class[] r13 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r13[r3] = r9
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r13[r4] = r9
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r13[r5] = r9
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r13[r15] = r9
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r13[r17] = r9
            java.lang.Class<java.util.List> r9 = java.util.List.class
            r13[r18] = r9
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r13[r19] = r9
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r13[r20] = r9
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r13[r21] = r9
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r13[r14] = r9
            java.lang.Class<org.json.JSONObject> r9 = org.json.JSONObject.class
            r13[r22] = r9
            java.lang.Class r23 = java.lang.Long.TYPE
            r9 = 0
            r11 = 1
            r12 = 87934(0x1577e, float:1.23222E-40)
            r14 = r23
            boolean r8 = com.meituan.robust.PatchProxy.isSupport(r8, r9, r10, r11, r12, r13, r14)
            if (r8 == 0) goto L_0x0103
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r3] = r26
            r8[r4] = r27
            r8[r5] = r6
            java.lang.Byte r1 = java.lang.Byte.valueOf(r29)
            r8[r15] = r1
            r8[r17] = r16
            r8[r18] = r16
            java.lang.Byte r1 = java.lang.Byte.valueOf(r32)
            r8[r19] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r33)
            r8[r20] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r34)
            r8[r21] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r3)
            r14 = 9
            r8[r14] = r1
            r8[r22] = r0
            r0 = 0
            com.meituan.robust.ChangeQuickRedirect r1 = f75917a
            r6 = 1
            r7 = 87934(0x1577e, float:1.23222E-40)
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r2[r3] = r9
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r4] = r3
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r5] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r15] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r17] = r3
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r2[r18] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r19] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r20] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r21] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r14] = r3
            java.lang.Class<org.json.JSONObject> r3 = org.json.JSONObject.class
            r2[r22] = r3
            java.lang.Class r3 = java.lang.Long.TYPE
            r26 = r8
            r27 = r0
            r28 = r1
            r29 = r6
            r30 = r7
            r31 = r2
            r32 = r3
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r26, r27, r28, r29, r30, r31, r32)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L_0x0103:
            r14 = 9
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r26)
            r17 = -1
            if (r2 != 0) goto L_0x01d4
            if (r6 != 0) goto L_0x0111
            goto L_0x01d4
        L_0x0111:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r3] = r6
            r2[r4] = r0
            r20 = 0
            com.meituan.robust.ChangeQuickRedirect r21 = f75917a
            r22 = 1
            r23 = 87967(0x1579f, float:1.23268E-40)
            java.lang.Class[] r8 = new java.lang.Class[r5]
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r8[r3] = r9
            java.lang.Class<org.json.JSONObject> r9 = org.json.JSONObject.class
            r8[r4] = r9
            java.lang.Class r25 = java.lang.Void.TYPE
            r19 = r2
            r24 = r8
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r19, r20, r21, r22, r23, r24, r25)
            if (r2 == 0) goto L_0x015b
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r3] = r6
            r2[r4] = r0
            r20 = 0
            com.meituan.robust.ChangeQuickRedirect r21 = f75917a
            r22 = 1
            r23 = 87967(0x1579f, float:1.23268E-40)
            java.lang.Class[] r0 = new java.lang.Class[r5]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r0[r3] = r5
            java.lang.Class<org.json.JSONObject> r3 = org.json.JSONObject.class
            r0[r4] = r3
            java.lang.Class r25 = java.lang.Void.TYPE
            r19 = r2
            r24 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r19, r20, r21, r22, r23, r24, r25)
        L_0x0158:
            r0 = 9
            goto L_0x0185
        L_0x015b:
            if (r6 == 0) goto L_0x0158
            if (r0 != 0) goto L_0x0160
            goto L_0x0172
        L_0x0160:
            java.lang.String r2 = "label"
            java.lang.String r11 = r0.optString(r2)     // Catch:{ Exception -> 0x0158 }
            java.lang.String r2 = "ext_json"
            org.json.JSONObject r16 = r0.optJSONObject(r2)     // Catch:{ Exception -> 0x0158 }
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r11)     // Catch:{ Exception -> 0x0158 }
            if (r0 == 0) goto L_0x0173
        L_0x0172:
            goto L_0x0158
        L_0x0173:
            java.lang.String r9 = "wap_stat"
            java.lang.String r10 = "app_download"
            r12 = 0
            r2 = 0
            r8 = r28
            r0 = 9
            r14 = r2
            com.ss.android.common.lib.a.a(r8, r9, r10, r11, r12, r14, r16)     // Catch:{ Exception -> 0x0184 }
            goto L_0x0185
        L_0x0184:
        L_0x0185:
            com.ss.android.newmedia.BaseAppData r2 = com.ss.android.newmedia.BaseAppData.a()
            boolean r2 = r2.m()
            r9 = 0
            if (r2 == 0) goto L_0x01aa
            r4 = 0
            r5 = 0
            r0 = r26
            r1 = r27
            r2 = r29
            r3 = r28
            r6 = r32
            r7 = r33
            r8 = r34
            long r0 = com.ss.android.newmedia.app.c.a(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 < 0) goto L_0x01d3
            return r0
        L_0x01aa:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r0) goto L_0x01c4
            r4 = 0
            r5 = 0
            r0 = r26
            r1 = r27
            r2 = r29
            r3 = r28
            r8 = r6
            r6 = r32
            long r0 = com.ss.android.newmedia.app.d.a(r0, r1, r2, r3, r4, r5, r6)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 < 0) goto L_0x01c5
            return r0
        L_0x01c4:
            r8 = r6
        L_0x01c5:
            android.net.Uri r0 = android.net.Uri.parse(r26)     // Catch:{ Exception -> 0x01d3 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x01d3 }
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x01d3 }
            r8.startActivity(r1)     // Catch:{ Exception -> 0x01d3 }
        L_0x01d3:
            return r17
        L_0x01d4:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.p.a(java.lang.String, java.lang.String, android.content.Context, boolean, java.lang.String, java.util.List, boolean, boolean, boolean, boolean, org.json.JSONObject):long");
    }
}
