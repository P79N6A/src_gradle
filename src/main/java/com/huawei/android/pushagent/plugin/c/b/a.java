package com.huawei.android.pushagent.plugin.c.b;

import android.content.Context;
import com.huawei.android.pushagent.plugin.a.c;
import com.huawei.android.pushagent.utils.a.g;
import com.huawei.android.pushagent.utils.a.i;
import com.taobao.android.dexposed.ClassUtils;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public class a {

    /* renamed from: com.huawei.android.pushagent.plugin.c.b.a$a  reason: collision with other inner class name */
    static class C0291a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static String f25151a = "http://";
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static String f25152b = "pushaix.hicloud.com";
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static String f25153c = "80";
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static String f25154d = "/report";
    }

    static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static String f25155a = "https://";
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static String f25156b = "pushaix.hicloud.com";
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static String f25157c = "443";
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static String f25158d = "/getSalt";
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0114 A[SYNTHETIC, Splitter:B:76:0x0114] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0132 A[SYNTHETIC, Splitter:B:81:0x0132] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0140 A[SYNTHETIC, Splitter:B:91:0x0140] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x015e A[SYNTHETIC, Splitter:B:96:0x015e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(android.content.Context r9, int r10, java.lang.String r11, int r12) {
        /*
            java.lang.String r0 = "PushLogSC2815"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "httpRequest requestType is "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.huawei.android.pushagent.utils.a.e.a(r0, r1)
            r4 = 0
            r5 = 1
            r0 = 0
            r2 = r9
            r3 = r10
            r6 = r11
            r7 = r12
            java.net.HttpURLConnection r1 = a(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x00f6, all -> 0x00f1 }
            if (r1 != 0) goto L_0x0037
            r4 = 0
            r5 = 0
            r2 = r9
            r3 = r10
            r6 = r11
            r7 = r12
            java.net.HttpURLConnection r2 = a(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x0031, all -> 0x002c }
            r1 = r2
            goto L_0x0037
        L_0x002c:
            r9 = move-exception
            r10 = r9
            r11 = r0
            goto L_0x013d
        L_0x0031:
            r9 = move-exception
            r10 = r9
        L_0x0033:
            r9 = r0
            r11 = r9
            goto L_0x00fb
        L_0x0037:
            if (r1 != 0) goto L_0x0044
            r4 = 1
            r5 = 0
            r2 = r9
            r3 = r10
            r6 = r11
            r7 = r12
            java.net.HttpURLConnection r2 = a(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x0031, all -> 0x002c }
            r1 = r2
        L_0x0044:
            if (r1 != 0) goto L_0x0051
            r4 = 1
            r5 = 1
            r2 = r9
            r3 = r10
            r6 = r11
            r7 = r12
            java.net.HttpURLConnection r9 = a(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x0031, all -> 0x002c }
            goto L_0x0052
        L_0x0051:
            r9 = r1
        L_0x0052:
            if (r9 != 0) goto L_0x0068
            java.lang.String r10 = "PushLogSC2815"
            java.lang.String r11 = "get conn failed"
            com.huawei.android.pushagent.utils.a.e.b(r10, r11)     // Catch:{ IOException -> 0x0065, all -> 0x0061 }
            if (r9 == 0) goto L_0x0060
            r9.disconnect()
        L_0x0060:
            return r0
        L_0x0061:
            r10 = move-exception
            r11 = r0
            goto L_0x013e
        L_0x0065:
            r10 = move-exception
            r1 = r9
            goto L_0x0033
        L_0x0068:
            java.lang.String r10 = "PushLogSC2815"
            java.lang.String r11 = "get conn success"
            com.huawei.android.pushagent.utils.a.e.b(r10, r11)     // Catch:{ IOException -> 0x0065, all -> 0x0061 }
            java.io.InputStream r10 = r9.getInputStream()     // Catch:{ IOException -> 0x0065, all -> 0x0061 }
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00eb, all -> 0x00e5 }
            java.io.InputStreamReader r12 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00eb, all -> 0x00e5 }
            java.lang.String r1 = "UTF-8"
            r12.<init>(r10, r1)     // Catch:{ IOException -> 0x00eb, all -> 0x00e5 }
            r11.<init>(r12)     // Catch:{ IOException -> 0x00eb, all -> 0x00e5 }
            java.lang.String r12 = r11.readLine()     // Catch:{ IOException -> 0x00e0, all -> 0x00db }
            if (r12 == 0) goto L_0x00ac
            if (r10 == 0) goto L_0x00a3
            r10.close()     // Catch:{ IOException -> 0x008b }
            goto L_0x00a3
        L_0x008b:
            r10 = move-exception
            java.lang.String r0 = "PushLogSC2815"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "close is err:"
            r1.<init>(r2)
            java.lang.String r2 = r10.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.android.pushagent.utils.a.e.a((java.lang.String) r0, (java.lang.String) r1, (java.lang.Throwable) r10)
        L_0x00a3:
            r11.close()     // Catch:{ IOException -> 0x00a6 }
        L_0x00a6:
            if (r9 == 0) goto L_0x00ab
            r9.disconnect()
        L_0x00ab:
            return r12
        L_0x00ac:
            java.lang.String r12 = "PushLogSC2815"
            java.lang.String r1 = "response is null"
            com.huawei.android.pushagent.utils.a.e.b(r12, r1)     // Catch:{ IOException -> 0x00e0, all -> 0x00db }
            if (r10 == 0) goto L_0x00d1
            r10.close()     // Catch:{ IOException -> 0x00b9 }
            goto L_0x00d1
        L_0x00b9:
            r10 = move-exception
            java.lang.String r12 = "PushLogSC2815"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "close is err:"
            r1.<init>(r2)
            java.lang.String r2 = r10.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.android.pushagent.utils.a.e.a((java.lang.String) r12, (java.lang.String) r1, (java.lang.Throwable) r10)
        L_0x00d1:
            r11.close()     // Catch:{ IOException -> 0x00d4 }
        L_0x00d4:
            if (r9 == 0) goto L_0x013a
            r9.disconnect()
            goto L_0x013a
        L_0x00db:
            r12 = move-exception
            r0 = r10
            r10 = r12
            goto L_0x013e
        L_0x00e0:
            r12 = move-exception
            r1 = r9
            r9 = r10
            r10 = r12
            goto L_0x00fb
        L_0x00e5:
            r11 = move-exception
            r8 = r0
            r0 = r10
            r10 = r11
            r11 = r8
            goto L_0x013e
        L_0x00eb:
            r11 = move-exception
            r1 = r9
            r9 = r10
            r10 = r11
            r11 = r0
            goto L_0x00fb
        L_0x00f1:
            r9 = move-exception
            r10 = r9
            r9 = r0
            r11 = r9
            goto L_0x013e
        L_0x00f6:
            r9 = move-exception
            r10 = r9
            r9 = r0
            r11 = r9
            r1 = r11
        L_0x00fb:
            java.lang.String r12 = "PushLogSC2815"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x013b }
            java.lang.String r3 = "connect url err:"
            r2.<init>(r3)     // Catch:{ all -> 0x013b }
            java.lang.String r3 = r10.toString()     // Catch:{ all -> 0x013b }
            r2.append(r3)     // Catch:{ all -> 0x013b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x013b }
            com.huawei.android.pushagent.utils.a.e.a((java.lang.String) r12, (java.lang.String) r2, (java.lang.Throwable) r10)     // Catch:{ all -> 0x013b }
            if (r9 == 0) goto L_0x0130
            r9.close()     // Catch:{ IOException -> 0x0118 }
            goto L_0x0130
        L_0x0118:
            r9 = move-exception
            java.lang.String r10 = "PushLogSC2815"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r2 = "close is err:"
            r12.<init>(r2)
            java.lang.String r2 = r9.toString()
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            com.huawei.android.pushagent.utils.a.e.a((java.lang.String) r10, (java.lang.String) r12, (java.lang.Throwable) r9)
        L_0x0130:
            if (r11 == 0) goto L_0x0135
            r11.close()     // Catch:{ IOException -> 0x0135 }
        L_0x0135:
            if (r1 == 0) goto L_0x013a
            r1.disconnect()
        L_0x013a:
            return r0
        L_0x013b:
            r10 = move-exception
            r0 = r9
        L_0x013d:
            r9 = r1
        L_0x013e:
            if (r0 == 0) goto L_0x015c
            r0.close()     // Catch:{ IOException -> 0x0144 }
            goto L_0x015c
        L_0x0144:
            r12 = move-exception
            java.lang.String r0 = "PushLogSC2815"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "close is err:"
            r1.<init>(r2)
            java.lang.String r2 = r12.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.android.pushagent.utils.a.e.a((java.lang.String) r0, (java.lang.String) r1, (java.lang.Throwable) r12)
        L_0x015c:
            if (r11 == 0) goto L_0x0161
            r11.close()     // Catch:{ IOException -> 0x0161 }
        L_0x0161:
            if (r9 == 0) goto L_0x0166
            r9.disconnect()
        L_0x0166:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.plugin.c.b.a.a(android.content.Context, int, java.lang.String, int):java.lang.String");
    }

    public static String a(Context context, c cVar, int i) {
        return a(context, 2, cVar.a(context), i);
    }

    public static String a(Context context, String str, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("token=");
        stringBuffer.append(str);
        stringBuffer.append("&securityAlg");
        stringBuffer.append("=2");
        return a(context, 1, stringBuffer.toString(), i);
    }

    private static String a(Context context, boolean z) {
        String a2 = b.f25156b;
        String b2 = b.f25157c;
        String c2 = b.f25158d;
        StringBuffer stringBuffer = new StringBuffer();
        if (z) {
            stringBuffer.append(b.f25155a);
            stringBuffer.append(a2);
            stringBuffer.append(":");
            stringBuffer.append(b2);
        } else {
            stringBuffer.append(b.f25155a);
            stringBuffer.append(a2);
        }
        stringBuffer.append(c2);
        return stringBuffer.toString();
    }

    private static String a(Context context, boolean z, int i) {
        String a2 = C0291a.f25152b;
        String b2 = C0291a.f25153c;
        String c2 = C0291a.f25154d;
        StringBuffer stringBuffer = new StringBuffer();
        if (i > 0 && a2.contains("pushaix")) {
            int indexOf = C0291a.f25152b.indexOf(ClassUtils.PACKAGE_SEPARATOR);
            a2 = C0291a.f25152b.substring(0, indexOf) + i + C0291a.f25152b.substring(indexOf);
        }
        if (z) {
            stringBuffer.append(C0291a.f25151a);
            stringBuffer.append(a2);
            stringBuffer.append(":");
            stringBuffer.append(b2);
        } else {
            stringBuffer.append(C0291a.f25151a);
            stringBuffer.append(a2);
        }
        stringBuffer.append(c2);
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0207 A[SYNTHETIC, Splitter:B:102:0x0207] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e0 A[Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fa A[Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x014c A[SYNTHETIC, Splitter:B:79:0x014c] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0168 A[SYNTHETIC, Splitter:B:86:0x0168] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.net.HttpURLConnection a(android.content.Context r4, int r5, boolean r6, boolean r7, java.lang.String r8, int r9) {
        /*
            r0 = 0
            r1 = 1
            if (r1 != r5) goto L_0x0025
            a(r4)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            java.lang.String r5 = a(r4, r7)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            goto L_0x0029
        L_0x000c:
            r4 = move-exception
            r5 = r4
            r4 = r0
            goto L_0x01ac
        L_0x0011:
            r4 = move-exception
            r5 = r4
            r4 = r0
            goto L_0x01ba
        L_0x0016:
            r4 = move-exception
            r5 = r4
            r4 = r0
            goto L_0x01c8
        L_0x001b:
            r4 = move-exception
            r5 = r4
            r4 = r0
            goto L_0x01d6
        L_0x0020:
            r4 = move-exception
            r5 = r4
            r4 = r0
            goto L_0x01ee
        L_0x0025:
            java.lang.String r5 = a((android.content.Context) r4, (boolean) r7, (int) r9)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
        L_0x0029:
            if (r6 == 0) goto L_0x00aa
            int r6 = com.huawei.android.pushagent.utils.a.b.a((android.content.Context) r4)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            if (r1 == r6) goto L_0x00aa
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            r7 = 11
            if (r6 < r7) goto L_0x0039
            r6 = 1
            goto L_0x003a
        L_0x0039:
            r6 = 0
        L_0x003a:
            if (r6 == 0) goto L_0x0052
            java.lang.String r4 = "http.proxyHost"
            java.lang.String r4 = java.lang.System.getProperty(r4)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            java.lang.String r6 = "http.proxyPort"
            java.lang.String r6 = java.lang.System.getProperty(r6)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            if (r6 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            java.lang.String r6 = "-1"
        L_0x004d:
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            goto L_0x005d
        L_0x0052:
            java.lang.String r6 = android.net.Proxy.getHost(r4)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            int r4 = android.net.Proxy.getPort(r4)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            r3 = r6
            r6 = r4
            r4 = r3
        L_0x005d:
            if (r4 == 0) goto L_0x00a3
            int r7 = r4.length()     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            if (r7 <= 0) goto L_0x00a3
            r7 = -1
            if (r6 == r7) goto L_0x00a3
            java.lang.String r7 = "PushLogSC2815"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            java.lang.String r2 = "use Proxy "
            r9.<init>(r2)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            r9.append(r4)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            java.lang.String r2 = ":"
            r9.append(r2)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            r9.append(r6)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            java.lang.String r2 = " to open:"
            r9.append(r2)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            r9.append(r5)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            java.lang.String r9 = r9.toString()     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            com.huawei.android.pushagent.utils.a.e.b(r7, r9)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            java.net.Proxy r7 = new java.net.Proxy     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            java.net.Proxy$Type r9 = java.net.Proxy.Type.HTTP     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            java.net.InetSocketAddress r2 = new java.net.InetSocketAddress     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            r2.<init>(r4, r6)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            r7.<init>(r9, r2)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            r4.<init>(r5)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            java.net.URLConnection r4 = r4.openConnection(r7)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
            goto L_0x00ab
        L_0x00a3:
            java.lang.String r4 = "PushLogSC2815"
            java.lang.String r6 = "proxy param invalid"
            com.huawei.android.pushagent.utils.a.e.b(r4, r6)     // Catch:{ MalformedURLException -> 0x0020, IOException -> 0x001b, NullPointerException -> 0x0016, IllegalArgumentException -> 0x0011, UnsupportedOperationException -> 0x000c }
        L_0x00aa:
            r4 = r0
        L_0x00ab:
            if (r4 != 0) goto L_0x00dc
            java.lang.String r6 = "PushLogSC2815"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            java.lang.String r9 = "direct to open "
            r7.<init>(r9)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            r7.append(r5)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            java.lang.String r7 = r7.toString()     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            com.huawei.android.pushagent.utils.a.e.a(r6, r7)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            java.net.URL r6 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            r6.<init>(r5)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            java.net.URLConnection r5 = r6.openConnection()     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            r4 = r5
            goto L_0x00dc
        L_0x00cd:
            r5 = move-exception
            goto L_0x01ac
        L_0x00d0:
            r5 = move-exception
            goto L_0x01ba
        L_0x00d3:
            r5 = move-exception
            goto L_0x01c8
        L_0x00d6:
            r5 = move-exception
            goto L_0x01d6
        L_0x00d9:
            r5 = move-exception
            goto L_0x01ee
        L_0x00dc:
            boolean r5 = r4 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            if (r5 == 0) goto L_0x00e4
            r5 = r4
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            r4 = r5
        L_0x00e4:
            r5 = 30000(0x7530, float:4.2039E-41)
            r4.setConnectTimeout(r5)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            r5 = 20000(0x4e20, float:2.8026E-41)
            r4.setReadTimeout(r5)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            r4.setDoOutput(r1)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            r4.setDoInput(r1)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            boolean r5 = android.text.TextUtils.isEmpty(r8)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            if (r5 != 0) goto L_0x0185
            java.lang.String r5 = "UTF-8"
            byte[] r5 = r8.getBytes(r5)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            java.io.OutputStream r6 = r4.getOutputStream()     // Catch:{ Exception -> 0x0131, all -> 0x012e }
            r6.write(r5)     // Catch:{ Exception -> 0x012c }
            r6.flush()     // Catch:{ Exception -> 0x012c }
            if (r6 == 0) goto L_0x0185
            r6.close()     // Catch:{ Exception -> 0x0111 }
            goto L_0x0185
        L_0x0111:
            r5 = move-exception
            java.lang.String r6 = "PushLogSC2815"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            java.lang.String r8 = "connect to srv cause IOException:"
            r7.<init>(r8)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            java.lang.String r8 = r5.toString()     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            r7.append(r8)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            java.lang.String r7 = r7.toString()     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
        L_0x0126:
            com.huawei.android.pushagent.utils.a.e.c(r6, r7, r5)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            goto L_0x0185
        L_0x012a:
            r5 = move-exception
            goto L_0x0166
        L_0x012c:
            r5 = move-exception
            goto L_0x0133
        L_0x012e:
            r5 = move-exception
            r6 = r0
            goto L_0x0166
        L_0x0131:
            r5 = move-exception
            r6 = r0
        L_0x0133:
            java.lang.String r7 = "PushLogSC2815"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x012a }
            java.lang.String r9 = "connect to srv cause IOException:"
            r8.<init>(r9)     // Catch:{ all -> 0x012a }
            java.lang.String r9 = r5.toString()     // Catch:{ all -> 0x012a }
            r8.append(r9)     // Catch:{ all -> 0x012a }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x012a }
            com.huawei.android.pushagent.utils.a.e.c(r7, r8, r5)     // Catch:{ all -> 0x012a }
            if (r6 == 0) goto L_0x0185
            r6.close()     // Catch:{ Exception -> 0x0150 }
            goto L_0x0185
        L_0x0150:
            r5 = move-exception
            java.lang.String r6 = "PushLogSC2815"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            java.lang.String r8 = "connect to srv cause IOException:"
            r7.<init>(r8)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            java.lang.String r8 = r5.toString()     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            r7.append(r8)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            java.lang.String r7 = r7.toString()     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            goto L_0x0126
        L_0x0166:
            if (r6 == 0) goto L_0x0184
            r6.close()     // Catch:{ Exception -> 0x016c }
            goto L_0x0184
        L_0x016c:
            r6 = move-exception
            java.lang.String r7 = "PushLogSC2815"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            java.lang.String r9 = "connect to srv cause IOException:"
            r8.<init>(r9)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            java.lang.String r9 = r6.toString()     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            java.lang.String r8 = r8.toString()     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            com.huawei.android.pushagent.utils.a.e.c(r7, r8, r6)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
        L_0x0184:
            throw r5     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
        L_0x0185:
            r4.connect()     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            int r5 = r4.getResponseCode()     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            java.lang.String r6 = r4.getResponseMessage()     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            java.lang.String r7 = "PushLogSC2815"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            java.lang.String r9 = "httpRequest responseCode is "
            r8.<init>(r9)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            r8.append(r5)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            java.lang.String r5 = "/"
            r8.append(r5)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            r8.append(r6)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            java.lang.String r5 = r8.toString()     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            com.huawei.android.pushagent.utils.a.e.a(r7, r5)     // Catch:{ MalformedURLException -> 0x00d9, IOException -> 0x00d6, NullPointerException -> 0x00d3, IllegalArgumentException -> 0x00d0, UnsupportedOperationException -> 0x00cd }
            return r4
        L_0x01ac:
            java.lang.String r6 = "PushLogSC2815"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "connect to srv cause IOException:"
            r7.<init>(r8)
            java.lang.String r8 = r5.toString()
            goto L_0x01e3
        L_0x01ba:
            java.lang.String r6 = "PushLogSC2815"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "connect to srv cause IOException:"
            r7.<init>(r8)
            java.lang.String r8 = r5.toString()
            goto L_0x01e3
        L_0x01c8:
            java.lang.String r6 = "PushLogSC2815"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "connect to srv cause IOException:"
            r7.<init>(r8)
            java.lang.String r8 = r5.toString()
            goto L_0x01e3
        L_0x01d6:
            java.lang.String r6 = "PushLogSC2815"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "connect to srv cause IOException:"
            r7.<init>(r8)
            java.lang.String r8 = r5.toString()
        L_0x01e3:
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.huawei.android.pushagent.utils.a.e.c(r6, r7, r5)
            goto L_0x0205
        L_0x01ee:
            java.lang.String r6 = "PushLogSC2815"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "connect to srv cause MalformedURLException:"
            r7.<init>(r8)
            java.lang.String r5 = r5.toString()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            com.huawei.android.pushagent.utils.a.e.d(r6, r5)
        L_0x0205:
            if (r4 == 0) goto L_0x0223
            r4.disconnect()     // Catch:{ Exception -> 0x020b }
            goto L_0x0223
        L_0x020b:
            r4 = move-exception
            java.lang.String r5 = "PushLogSC2815"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "close connection cause Exception:"
            r6.<init>(r7)
            java.lang.String r7 = r4.toString()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.huawei.android.pushagent.utils.a.e.c(r5, r6, r4)
        L_0x0223:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.plugin.c.b.a.a(android.content.Context, int, boolean, boolean, java.lang.String, int):java.net.HttpURLConnection");
    }

    private static void a(Context context) {
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, new TrustManager[]{new i(context)}, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(new g(instance.getSocketFactory()));
            HttpsURLConnection.setDefaultHostnameVerifier(new b());
        } catch (Exception | KeyManagementException | NoSuchAlgorithmException unused) {
        }
    }
}
