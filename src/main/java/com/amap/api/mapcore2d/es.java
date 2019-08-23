package com.amap.api.mapcore2d;

import android.os.Build;
import com.amap.api.mapcore2d.ep;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;

public class es {

    /* renamed from: a  reason: collision with root package name */
    private static et f6078a;

    /* renamed from: b  reason: collision with root package name */
    private int f6079b;

    /* renamed from: c  reason: collision with root package name */
    private int f6080c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6081d;

    /* renamed from: e  reason: collision with root package name */
    private SSLContext f6082e;

    /* renamed from: f  reason: collision with root package name */
    private Proxy f6083f;
    private volatile boolean g;
    private long h;
    private long i;
    private String j;
    private ep.a k;
    private HostnameVerifier l;

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ff A[SYNTHETIC, Splitter:B:68:0x00ff] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0116 A[SYNTHETIC, Splitter:B:75:0x0116] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x011e A[SYNTHETIC, Splitter:B:81:0x011e] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0135 A[SYNTHETIC, Splitter:B:88:0x0135] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10, java.util.Map<java.lang.String, java.lang.String> r11, com.amap.api.mapcore2d.er.a r12) {
        /*
            r8 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = 0
            java.lang.String r11 = a((java.util.Map<java.lang.String, java.lang.String>) r11)     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            r1.<init>()     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            r1.append(r9)     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            if (r11 == 0) goto L_0x001a
            java.lang.String r9 = "?"
            r1.append(r9)     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            r1.append(r11)     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
        L_0x001a:
            java.lang.String r9 = r1.toString()     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            r11 = 0
            java.net.HttpURLConnection r9 = r8.a((java.lang.String) r9, (java.util.Map<java.lang.String, java.lang.String>) r10, (boolean) r11)     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00f1 }
            java.lang.String r1 = "bytes="
            r10.<init>(r1)     // Catch:{ Throwable -> 0x00f1 }
            long r1 = r8.i     // Catch:{ Throwable -> 0x00f1 }
            r10.append(r1)     // Catch:{ Throwable -> 0x00f1 }
            java.lang.String r1 = "-"
            r10.append(r1)     // Catch:{ Throwable -> 0x00f1 }
            java.lang.String r10 = r10.toString()     // Catch:{ Throwable -> 0x00f1 }
            java.lang.String r1 = "RANGE"
            r9.setRequestProperty(r1, r10)     // Catch:{ Throwable -> 0x00f1 }
            r9.connect()     // Catch:{ Throwable -> 0x00f1 }
            int r10 = r9.getResponseCode()     // Catch:{ Throwable -> 0x00f1 }
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 1
            if (r10 == r1) goto L_0x004b
            r1 = 1
            goto L_0x004c
        L_0x004b:
            r1 = 0
        L_0x004c:
            r3 = 206(0xce, float:2.89E-43)
            if (r10 == r3) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r2 = 0
        L_0x0052:
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0077
            com.amap.api.mapcore2d.co r1 = new com.amap.api.mapcore2d.co     // Catch:{ Throwable -> 0x00f1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00f1 }
            java.lang.String r3 = "网络异常原因："
            r2.<init>(r3)     // Catch:{ Throwable -> 0x00f1 }
            java.lang.String r3 = r9.getResponseMessage()     // Catch:{ Throwable -> 0x00f1 }
            r2.append(r3)     // Catch:{ Throwable -> 0x00f1 }
            java.lang.String r3 = " 网络异常状态码："
            r2.append(r3)     // Catch:{ Throwable -> 0x00f1 }
            r2.append(r10)     // Catch:{ Throwable -> 0x00f1 }
            java.lang.String r10 = r2.toString()     // Catch:{ Throwable -> 0x00f1 }
            r1.<init>(r10)     // Catch:{ Throwable -> 0x00f1 }
            r12.a(r1)     // Catch:{ Throwable -> 0x00f1 }
        L_0x0077:
            java.io.InputStream r10 = r9.getInputStream()     // Catch:{ Throwable -> 0x00f1 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r0]     // Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
        L_0x007f:
            boolean r2 = java.lang.Thread.interrupted()     // Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
            if (r2 != 0) goto L_0x00b8
            boolean r2 = r8.g     // Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
            if (r2 != 0) goto L_0x00b8
            int r2 = r10.read(r1, r11, r0)     // Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
            if (r2 <= 0) goto L_0x00b8
            long r3 = r8.h     // Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x009f
            long r3 = r8.i     // Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
            long r5 = r8.h     // Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x00b8
        L_0x009f:
            if (r2 != r0) goto L_0x00a7
            long r3 = r8.i     // Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
            r12.a(r1, r3)     // Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
            goto L_0x00b1
        L_0x00a7:
            byte[] r3 = new byte[r2]     // Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
            java.lang.System.arraycopy(r1, r11, r3, r11, r2)     // Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
            long r4 = r8.i     // Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
            r12.a(r3, r4)     // Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
        L_0x00b1:
            long r3 = r8.i     // Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
            long r5 = (long) r2     // Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
            long r3 = r3 + r5
            r8.i = r3     // Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
            goto L_0x007f
        L_0x00b8:
            boolean r11 = r8.g     // Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
            if (r11 == 0) goto L_0x00c0
            r12.b()     // Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
            goto L_0x00c3
        L_0x00c0:
            r12.c()     // Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
        L_0x00c3:
            if (r10 == 0) goto L_0x00da
            r10.close()     // Catch:{ IOException -> 0x00d2, Throwable -> 0x00c9 }
            goto L_0x00da
        L_0x00c9:
            r10 = move-exception
            java.lang.String r11 = "HttpUrlUtil"
            java.lang.String r12 = "makeDownloadGetRequest"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r10, (java.lang.String) r11, (java.lang.String) r12)
            goto L_0x00da
        L_0x00d2:
            r10 = move-exception
            java.lang.String r11 = "HttpUrlUtil"
            java.lang.String r12 = "makeDownloadGetRequest"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r10, (java.lang.String) r11, (java.lang.String) r12)
        L_0x00da:
            if (r9 == 0) goto L_0x011a
            r9.disconnect()     // Catch:{ Throwable -> 0x00e0 }
            return
        L_0x00e0:
            r9 = move-exception
            java.lang.String r10 = "HttpUrlUtil"
            java.lang.String r11 = "makeDownloadGetRequest"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r9, (java.lang.String) r10, (java.lang.String) r11)
            return
        L_0x00e9:
            r11 = move-exception
            r0 = r10
            r10 = r11
            goto L_0x011c
        L_0x00ed:
            r11 = move-exception
            r0 = r10
            r10 = r11
            goto L_0x00fa
        L_0x00f1:
            r10 = move-exception
            goto L_0x00fa
        L_0x00f3:
            r9 = move-exception
            r10 = r9
            r9 = r0
            goto L_0x011c
        L_0x00f7:
            r9 = move-exception
            r10 = r9
            r9 = r0
        L_0x00fa:
            r12.a(r10)     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x0114
            r0.close()     // Catch:{ IOException -> 0x010c, Throwable -> 0x0103 }
            goto L_0x0114
        L_0x0103:
            r10 = move-exception
            java.lang.String r11 = "HttpUrlUtil"
            java.lang.String r12 = "makeDownloadGetRequest"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r10, (java.lang.String) r11, (java.lang.String) r12)
            goto L_0x0114
        L_0x010c:
            r10 = move-exception
            java.lang.String r11 = "HttpUrlUtil"
            java.lang.String r12 = "makeDownloadGetRequest"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r10, (java.lang.String) r11, (java.lang.String) r12)
        L_0x0114:
            if (r9 == 0) goto L_0x011a
            r9.disconnect()     // Catch:{ Throwable -> 0x00e0 }
            return
        L_0x011a:
            return
        L_0x011b:
            r10 = move-exception
        L_0x011c:
            if (r0 == 0) goto L_0x0133
            r0.close()     // Catch:{ IOException -> 0x012b, Throwable -> 0x0122 }
            goto L_0x0133
        L_0x0122:
            r11 = move-exception
            java.lang.String r12 = "HttpUrlUtil"
            java.lang.String r0 = "makeDownloadGetRequest"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r11, (java.lang.String) r12, (java.lang.String) r0)
            goto L_0x0133
        L_0x012b:
            r11 = move-exception
            java.lang.String r12 = "HttpUrlUtil"
            java.lang.String r0 = "makeDownloadGetRequest"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r11, (java.lang.String) r12, (java.lang.String) r0)
        L_0x0133:
            if (r9 == 0) goto L_0x0141
            r9.disconnect()     // Catch:{ Throwable -> 0x0139 }
            goto L_0x0141
        L_0x0139:
            r9 = move-exception
            java.lang.String r11 = "HttpUrlUtil"
            java.lang.String r12 = "makeDownloadGetRequest"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r9, (java.lang.String) r11, (java.lang.String) r12)
        L_0x0141:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.es.a(java.lang.String, java.util.Map, java.util.Map, com.amap.api.mapcore2d.er$a):void");
    }

    private void a() {
        try {
            this.j = UUID.randomUUID().toString().replaceAll("-", "").toLowerCase();
        } catch (Throwable th) {
            dd.a(th, "HttpUrlUtil", "initCSID");
        }
    }

    public static void a(et etVar) {
        f6078a = etVar;
    }

    /* access modifiers changed from: package-private */
    public void b(long j2) {
        this.h = j2;
    }

    /* access modifiers changed from: package-private */
    public void a(long j2) {
        this.i = j2;
    }

    static String a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            if (str2 == null) {
                str2 = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(URLEncoder.encode(str));
            sb.append("=");
            sb.append(URLEncoder.encode(str2));
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x0115 A[SYNTHETIC, Splitter:B:77:0x0115] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0123 A[SYNTHETIC, Splitter:B:82:0x0123] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0131 A[SYNTHETIC, Splitter:B:87:0x0131] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x013f A[SYNTHETIC, Splitter:B:92:0x013f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.amap.api.mapcore2d.ex a(java.net.HttpURLConnection r11) throws com.amap.api.mapcore2d.co, java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = ""
            r1 = 0
            r11.connect()     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            java.util.Map r2 = r11.getHeaderFields()     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            int r3 = r11.getResponseCode()     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            r4 = 0
            if (r2 == 0) goto L_0x0028
            java.lang.String r5 = "gsid"
            java.lang.Object r5 = r2.get(r5)     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            java.util.List r5 = (java.util.List) r5     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            if (r5 == 0) goto L_0x0028
            int r6 = r5.size()     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            if (r6 <= 0) goto L_0x0028
            java.lang.Object r5 = r5.get(r4)     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            r0 = r5
        L_0x0028:
            r5 = 200(0xc8, float:2.8E-43)
            if (r3 != r5) goto L_0x00cd
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            r3.<init>()     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            java.io.InputStream r11 = r11.getInputStream()     // Catch:{ IOException -> 0x00c8, all -> 0x00c2 }
            java.io.PushbackInputStream r5 = new java.io.PushbackInputStream     // Catch:{ IOException -> 0x00c0, all -> 0x00bb }
            r6 = 2
            r5.<init>(r11, r6)     // Catch:{ IOException -> 0x00c0, all -> 0x00bb }
            byte[] r6 = new byte[r6]     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r5.read(r6)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r5.unread(r6)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            byte r7 = r6[r4]     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r8 = 31
            if (r7 != r8) goto L_0x0057
            r7 = 1
            byte r6 = r6[r7]     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r7 = -117(0xffffffffffffff8b, float:NaN)
            if (r6 != r7) goto L_0x0057
            java.util.zip.GZIPInputStream r6 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r1 = r6
            goto L_0x0058
        L_0x0057:
            r1 = r5
        L_0x0058:
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
        L_0x005c:
            int r7 = r1.read(r6)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r8 = -1
            if (r7 == r8) goto L_0x0067
            r3.write(r6, r4, r7)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            goto L_0x005c
        L_0x0067:
            com.amap.api.mapcore2d.et r4 = f6078a     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            if (r4 == 0) goto L_0x0070
            com.amap.api.mapcore2d.et r4 = f6078a     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r4.a()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
        L_0x0070:
            com.amap.api.mapcore2d.ex r4 = new com.amap.api.mapcore2d.ex     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r4.<init>()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            byte[] r6 = r3.toByteArray()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r4.f6094a = r6     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r4.f6095b = r2     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r2 = r10.j     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r4.f6096c = r2     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r4.f6097d = r0     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r3.close()     // Catch:{ Throwable -> 0x0087 }
            goto L_0x008f
        L_0x0087:
            r0 = move-exception
            java.lang.String r2 = "HttpUrlUtil"
            java.lang.String r3 = "parseResult"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r0, (java.lang.String) r2, (java.lang.String) r3)
        L_0x008f:
            if (r11 == 0) goto L_0x009d
            r11.close()     // Catch:{ Throwable -> 0x0095 }
            goto L_0x009d
        L_0x0095:
            r11 = move-exception
            java.lang.String r0 = "HttpUrlUtil"
            java.lang.String r2 = "parseResult"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r11, (java.lang.String) r0, (java.lang.String) r2)
        L_0x009d:
            r5.close()     // Catch:{ Throwable -> 0x00a1 }
            goto L_0x00a9
        L_0x00a1:
            r11 = move-exception
            java.lang.String r0 = "HttpUrlUtil"
            java.lang.String r2 = "parseResult"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r11, (java.lang.String) r0, (java.lang.String) r2)
        L_0x00a9:
            r1.close()     // Catch:{ Throwable -> 0x00ad }
            goto L_0x00b5
        L_0x00ad:
            r11 = move-exception
            java.lang.String r0 = "HttpUrlUtil"
            java.lang.String r1 = "parseResult"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r11, (java.lang.String) r0, (java.lang.String) r1)
        L_0x00b5:
            return r4
        L_0x00b6:
            r0 = move-exception
            r2 = r1
            goto L_0x00be
        L_0x00b9:
            r2 = r1
            goto L_0x00cb
        L_0x00bb:
            r0 = move-exception
            r2 = r1
            r5 = r2
        L_0x00be:
            r1 = r3
            goto L_0x0110
        L_0x00c0:
            r2 = r1
            goto L_0x00ca
        L_0x00c2:
            r11 = move-exception
            r0 = r1
            r2 = r0
            r5 = r2
            r1 = r3
            goto L_0x0113
        L_0x00c8:
            r11 = r1
            r2 = r11
        L_0x00ca:
            r5 = r2
        L_0x00cb:
            r1 = r3
            goto L_0x0107
        L_0x00cd:
            com.amap.api.mapcore2d.co r2 = new com.amap.api.mapcore2d.co     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            java.lang.String r5 = "网络异常原因："
            r4.<init>(r5)     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            java.lang.String r11 = r11.getResponseMessage()     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            r4.append(r11)     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            java.lang.String r11 = " 网络异常状态码："
            r4.append(r11)     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            r4.append(r3)     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            java.lang.String r11 = "  "
            r4.append(r11)     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            r4.append(r0)     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            java.lang.String r11 = " "
            r4.append(r11)     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            java.lang.String r11 = r10.j     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            r4.append(r11)     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            java.lang.String r11 = r4.toString()     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            r2.<init>(r11, r0)     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
            throw r2     // Catch:{ IOException -> 0x0104, all -> 0x00ff }
        L_0x00ff:
            r11 = move-exception
            r0 = r1
            r2 = r0
            r5 = r2
            goto L_0x0113
        L_0x0104:
            r11 = r1
            r2 = r11
            r5 = r2
        L_0x0107:
            com.amap.api.mapcore2d.co r3 = new com.amap.api.mapcore2d.co     // Catch:{ all -> 0x010f }
            java.lang.String r4 = "IO 操作异常 - IOException"
            r3.<init>(r4, r0)     // Catch:{ all -> 0x010f }
            throw r3     // Catch:{ all -> 0x010f }
        L_0x010f:
            r0 = move-exception
        L_0x0110:
            r9 = r0
            r0 = r11
            r11 = r9
        L_0x0113:
            if (r1 == 0) goto L_0x0121
            r1.close()     // Catch:{ Throwable -> 0x0119 }
            goto L_0x0121
        L_0x0119:
            r1 = move-exception
            java.lang.String r3 = "HttpUrlUtil"
            java.lang.String r4 = "parseResult"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r1, (java.lang.String) r3, (java.lang.String) r4)
        L_0x0121:
            if (r0 == 0) goto L_0x012f
            r0.close()     // Catch:{ Throwable -> 0x0127 }
            goto L_0x012f
        L_0x0127:
            r0 = move-exception
            java.lang.String r1 = "HttpUrlUtil"
            java.lang.String r3 = "parseResult"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r3)
        L_0x012f:
            if (r5 == 0) goto L_0x013d
            r5.close()     // Catch:{ Throwable -> 0x0135 }
            goto L_0x013d
        L_0x0135:
            r0 = move-exception
            java.lang.String r1 = "HttpUrlUtil"
            java.lang.String r3 = "parseResult"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r3)
        L_0x013d:
            if (r2 == 0) goto L_0x014b
            r2.close()     // Catch:{ Throwable -> 0x0143 }
            goto L_0x014b
        L_0x0143:
            r0 = move-exception
            java.lang.String r1 = "HttpUrlUtil"
            java.lang.String r2 = "parseResult"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r2)
        L_0x014b:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.es.a(java.net.HttpURLConnection):com.amap.api.mapcore2d.ex");
    }

    private void a(Map<String, String> map, HttpURLConnection httpURLConnection) {
        if (map != null) {
            for (String next : map.keySet()) {
                httpURLConnection.addRequestProperty(next, map.get(next));
            }
        }
        try {
            httpURLConnection.addRequestProperty("csid", this.j);
        } catch (Throwable th) {
            dd.a(th, "HttpUrlUtil", "addHeaders");
        }
        httpURLConnection.setConnectTimeout(this.f6079b);
        httpURLConnection.setReadTimeout(this.f6080c);
    }

    es(int i2, int i3, Proxy proxy) {
        this(i2, i3, proxy, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x004e */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0092 A[SYNTHETIC, Splitter:B:62:0x0092] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amap.api.mapcore2d.ex a(java.lang.String r3, java.util.Map<java.lang.String, java.lang.String> r4, java.util.Map<java.lang.String, java.lang.String> r5) throws com.amap.api.mapcore2d.co {
        /*
            r2 = this;
            r0 = 0
            java.lang.String r5 = a((java.util.Map<java.lang.String, java.lang.String>) r5)     // Catch:{ ConnectException -> 0x0088, MalformedURLException -> 0x0080, UnknownHostException -> 0x0078, SocketException -> 0x0070, SocketTimeoutException -> 0x0068, InterruptedIOException -> 0x0060, IOException -> 0x0058, co -> 0x0056, Throwable -> 0x004e }
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ ConnectException -> 0x0088, MalformedURLException -> 0x0080, UnknownHostException -> 0x0078, SocketException -> 0x0070, SocketTimeoutException -> 0x0068, InterruptedIOException -> 0x0060, IOException -> 0x0058, co -> 0x0056, Throwable -> 0x004e }
            r1.<init>()     // Catch:{ ConnectException -> 0x0088, MalformedURLException -> 0x0080, UnknownHostException -> 0x0078, SocketException -> 0x0070, SocketTimeoutException -> 0x0068, InterruptedIOException -> 0x0060, IOException -> 0x0058, co -> 0x0056, Throwable -> 0x004e }
            r1.append(r3)     // Catch:{ ConnectException -> 0x0088, MalformedURLException -> 0x0080, UnknownHostException -> 0x0078, SocketException -> 0x0070, SocketTimeoutException -> 0x0068, InterruptedIOException -> 0x0060, IOException -> 0x0058, co -> 0x0056, Throwable -> 0x004e }
            if (r5 == 0) goto L_0x0017
            java.lang.String r3 = "?"
            r1.append(r3)     // Catch:{ ConnectException -> 0x0088, MalformedURLException -> 0x0080, UnknownHostException -> 0x0078, SocketException -> 0x0070, SocketTimeoutException -> 0x0068, InterruptedIOException -> 0x0060, IOException -> 0x0058, co -> 0x0056, Throwable -> 0x004e }
            r1.append(r5)     // Catch:{ ConnectException -> 0x0088, MalformedURLException -> 0x0080, UnknownHostException -> 0x0078, SocketException -> 0x0070, SocketTimeoutException -> 0x0068, InterruptedIOException -> 0x0060, IOException -> 0x0058, co -> 0x0056, Throwable -> 0x004e }
        L_0x0017:
            java.lang.String r3 = r1.toString()     // Catch:{ ConnectException -> 0x0088, MalformedURLException -> 0x0080, UnknownHostException -> 0x0078, SocketException -> 0x0070, SocketTimeoutException -> 0x0068, InterruptedIOException -> 0x0060, IOException -> 0x0058, co -> 0x0056, Throwable -> 0x004e }
            r5 = 0
            java.net.HttpURLConnection r3 = r2.a((java.lang.String) r3, (java.util.Map<java.lang.String, java.lang.String>) r4, (boolean) r5)     // Catch:{ ConnectException -> 0x0088, MalformedURLException -> 0x0080, UnknownHostException -> 0x0078, SocketException -> 0x0070, SocketTimeoutException -> 0x0068, InterruptedIOException -> 0x0060, IOException -> 0x0058, co -> 0x0056, Throwable -> 0x004e }
            com.amap.api.mapcore2d.ex r4 = r2.a((java.net.HttpURLConnection) r3)     // Catch:{ ConnectException -> 0x004a, MalformedURLException -> 0x0048, UnknownHostException -> 0x0046, SocketException -> 0x0044, SocketTimeoutException -> 0x0042, InterruptedIOException -> 0x0040, IOException -> 0x003e, co -> 0x003a, Throwable -> 0x0038, all -> 0x0033 }
            if (r3 == 0) goto L_0x0032
            r3.disconnect()     // Catch:{ Throwable -> 0x002a }
            goto L_0x0032
        L_0x002a:
            r3 = move-exception
            java.lang.String r5 = "HttpUrlUtil"
            java.lang.String r0 = "makeGetRequest"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r3, (java.lang.String) r5, (java.lang.String) r0)
        L_0x0032:
            return r4
        L_0x0033:
            r4 = move-exception
            r0 = r3
            r3 = r4
            goto L_0x0090
        L_0x0038:
            r0 = r3
            goto L_0x004e
        L_0x003a:
            r4 = move-exception
            r0 = r3
            r3 = r4
            goto L_0x0057
        L_0x003e:
            r0 = r3
            goto L_0x0058
        L_0x0040:
            r0 = r3
            goto L_0x0060
        L_0x0042:
            r0 = r3
            goto L_0x0068
        L_0x0044:
            r0 = r3
            goto L_0x0070
        L_0x0046:
            r0 = r3
            goto L_0x0078
        L_0x0048:
            r0 = r3
            goto L_0x0080
        L_0x004a:
            r0 = r3
            goto L_0x0088
        L_0x004c:
            r3 = move-exception
            goto L_0x0090
        L_0x004e:
            com.amap.api.mapcore2d.co r3 = new com.amap.api.mapcore2d.co     // Catch:{ all -> 0x004c }
            java.lang.String r4 = "未知的错误"
            r3.<init>(r4)     // Catch:{ all -> 0x004c }
            throw r3     // Catch:{ all -> 0x004c }
        L_0x0056:
            r3 = move-exception
        L_0x0057:
            throw r3     // Catch:{ all -> 0x004c }
        L_0x0058:
            com.amap.api.mapcore2d.co r3 = new com.amap.api.mapcore2d.co     // Catch:{ all -> 0x004c }
            java.lang.String r4 = "IO 操作异常 - IOException"
            r3.<init>(r4)     // Catch:{ all -> 0x004c }
            throw r3     // Catch:{ all -> 0x004c }
        L_0x0060:
            com.amap.api.mapcore2d.co r3 = new com.amap.api.mapcore2d.co     // Catch:{ all -> 0x004c }
            java.lang.String r4 = "未知的错误"
            r3.<init>(r4)     // Catch:{ all -> 0x004c }
            throw r3     // Catch:{ all -> 0x004c }
        L_0x0068:
            com.amap.api.mapcore2d.co r3 = new com.amap.api.mapcore2d.co     // Catch:{ all -> 0x004c }
            java.lang.String r4 = "socket 连接超时 - SocketTimeoutException"
            r3.<init>(r4)     // Catch:{ all -> 0x004c }
            throw r3     // Catch:{ all -> 0x004c }
        L_0x0070:
            com.amap.api.mapcore2d.co r3 = new com.amap.api.mapcore2d.co     // Catch:{ all -> 0x004c }
            java.lang.String r4 = "socket 连接异常 - SocketException"
            r3.<init>(r4)     // Catch:{ all -> 0x004c }
            throw r3     // Catch:{ all -> 0x004c }
        L_0x0078:
            com.amap.api.mapcore2d.co r3 = new com.amap.api.mapcore2d.co     // Catch:{ all -> 0x004c }
            java.lang.String r4 = "未知主机 - UnKnowHostException"
            r3.<init>(r4)     // Catch:{ all -> 0x004c }
            throw r3     // Catch:{ all -> 0x004c }
        L_0x0080:
            com.amap.api.mapcore2d.co r3 = new com.amap.api.mapcore2d.co     // Catch:{ all -> 0x004c }
            java.lang.String r4 = "url异常 - MalformedURLException"
            r3.<init>(r4)     // Catch:{ all -> 0x004c }
            throw r3     // Catch:{ all -> 0x004c }
        L_0x0088:
            com.amap.api.mapcore2d.co r3 = new com.amap.api.mapcore2d.co     // Catch:{ all -> 0x004c }
            java.lang.String r4 = "http连接失败 - ConnectionException"
            r3.<init>(r4)     // Catch:{ all -> 0x004c }
            throw r3     // Catch:{ all -> 0x004c }
        L_0x0090:
            if (r0 == 0) goto L_0x009e
            r0.disconnect()     // Catch:{ Throwable -> 0x0096 }
            goto L_0x009e
        L_0x0096:
            r4 = move-exception
            java.lang.String r5 = "HttpUrlUtil"
            java.lang.String r0 = "makeGetRequest"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r4, (java.lang.String) r5, (java.lang.String) r0)
        L_0x009e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.es.a(java.lang.String, java.util.Map, java.util.Map):com.amap.api.mapcore2d.ex");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x009b A[SYNTHETIC, Splitter:B:66:0x009b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amap.api.mapcore2d.ex a(java.lang.String r3, java.util.Map<java.lang.String, java.lang.String> r4, byte[] r5) throws com.amap.api.mapcore2d.co {
        /*
            r2 = this;
            r0 = 1
            r1 = 0
            java.net.HttpURLConnection r3 = r2.a((java.lang.String) r3, (java.util.Map<java.lang.String, java.lang.String>) r4, (boolean) r0)     // Catch:{ ConnectException -> 0x0091, MalformedURLException -> 0x0089, UnknownHostException -> 0x0081, SocketException -> 0x0079, SocketTimeoutException -> 0x0071, InterruptedIOException -> 0x0069, IOException -> 0x0061, co -> 0x0058, Throwable -> 0x0048 }
            if (r5 == 0) goto L_0x0025
            int r4 = r5.length     // Catch:{ ConnectException -> 0x0044, MalformedURLException -> 0x0042, UnknownHostException -> 0x0040, SocketException -> 0x003e, SocketTimeoutException -> 0x003c, InterruptedIOException -> 0x003a, IOException -> 0x0038, co -> 0x0022, Throwable -> 0x001f, all -> 0x001b }
            if (r4 <= 0) goto L_0x0025
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ ConnectException -> 0x0044, MalformedURLException -> 0x0042, UnknownHostException -> 0x0040, SocketException -> 0x003e, SocketTimeoutException -> 0x003c, InterruptedIOException -> 0x003a, IOException -> 0x0038, co -> 0x0022, Throwable -> 0x001f, all -> 0x001b }
            java.io.OutputStream r0 = r3.getOutputStream()     // Catch:{ ConnectException -> 0x0044, MalformedURLException -> 0x0042, UnknownHostException -> 0x0040, SocketException -> 0x003e, SocketTimeoutException -> 0x003c, InterruptedIOException -> 0x003a, IOException -> 0x0038, co -> 0x0022, Throwable -> 0x001f, all -> 0x001b }
            r4.<init>(r0)     // Catch:{ ConnectException -> 0x0044, MalformedURLException -> 0x0042, UnknownHostException -> 0x0040, SocketException -> 0x003e, SocketTimeoutException -> 0x003c, InterruptedIOException -> 0x003a, IOException -> 0x0038, co -> 0x0022, Throwable -> 0x001f, all -> 0x001b }
            r4.write(r5)     // Catch:{ ConnectException -> 0x0044, MalformedURLException -> 0x0042, UnknownHostException -> 0x0040, SocketException -> 0x003e, SocketTimeoutException -> 0x003c, InterruptedIOException -> 0x003a, IOException -> 0x0038, co -> 0x0022, Throwable -> 0x001f, all -> 0x001b }
            r4.close()     // Catch:{ ConnectException -> 0x0044, MalformedURLException -> 0x0042, UnknownHostException -> 0x0040, SocketException -> 0x003e, SocketTimeoutException -> 0x003c, InterruptedIOException -> 0x003a, IOException -> 0x0038, co -> 0x0022, Throwable -> 0x001f, all -> 0x001b }
            goto L_0x0025
        L_0x001b:
            r4 = move-exception
            r1 = r3
            goto L_0x0099
        L_0x001f:
            r4 = move-exception
            r1 = r3
            goto L_0x0049
        L_0x0022:
            r4 = move-exception
            r1 = r3
            goto L_0x0059
        L_0x0025:
            com.amap.api.mapcore2d.ex r4 = r2.a((java.net.HttpURLConnection) r3)     // Catch:{ ConnectException -> 0x0044, MalformedURLException -> 0x0042, UnknownHostException -> 0x0040, SocketException -> 0x003e, SocketTimeoutException -> 0x003c, InterruptedIOException -> 0x003a, IOException -> 0x0038, co -> 0x0022, Throwable -> 0x001f, all -> 0x001b }
            if (r3 == 0) goto L_0x0037
            r3.disconnect()     // Catch:{ Throwable -> 0x002f }
            goto L_0x0037
        L_0x002f:
            r3 = move-exception
            java.lang.String r5 = "HttpUrlUtil"
            java.lang.String r0 = "makePostReqeust"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r3, (java.lang.String) r5, (java.lang.String) r0)
        L_0x0037:
            return r4
        L_0x0038:
            r1 = r3
            goto L_0x0061
        L_0x003a:
            r1 = r3
            goto L_0x0069
        L_0x003c:
            r1 = r3
            goto L_0x0071
        L_0x003e:
            r1 = r3
            goto L_0x0079
        L_0x0040:
            r1 = r3
            goto L_0x0081
        L_0x0042:
            r1 = r3
            goto L_0x0089
        L_0x0044:
            r1 = r3
            goto L_0x0091
        L_0x0046:
            r4 = move-exception
            goto L_0x0099
        L_0x0048:
            r4 = move-exception
        L_0x0049:
            java.lang.String r3 = "HttpUrlUtil"
            java.lang.String r5 = "makePostReqeust"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r4, (java.lang.String) r3, (java.lang.String) r5)     // Catch:{ all -> 0x0046 }
            com.amap.api.mapcore2d.co r3 = new com.amap.api.mapcore2d.co     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "未知的错误"
            r3.<init>(r4)     // Catch:{ all -> 0x0046 }
            throw r3     // Catch:{ all -> 0x0046 }
        L_0x0058:
            r4 = move-exception
        L_0x0059:
            java.lang.String r3 = "HttpUrlUtil"
            java.lang.String r5 = "makePostReqeust"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r4, (java.lang.String) r3, (java.lang.String) r5)     // Catch:{ all -> 0x0046 }
            throw r4     // Catch:{ all -> 0x0046 }
        L_0x0061:
            com.amap.api.mapcore2d.co r3 = new com.amap.api.mapcore2d.co     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "IO 操作异常 - IOException"
            r3.<init>(r4)     // Catch:{ all -> 0x0046 }
            throw r3     // Catch:{ all -> 0x0046 }
        L_0x0069:
            com.amap.api.mapcore2d.co r3 = new com.amap.api.mapcore2d.co     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "未知的错误"
            r3.<init>(r4)     // Catch:{ all -> 0x0046 }
            throw r3     // Catch:{ all -> 0x0046 }
        L_0x0071:
            com.amap.api.mapcore2d.co r3 = new com.amap.api.mapcore2d.co     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "socket 连接超时 - SocketTimeoutException"
            r3.<init>(r4)     // Catch:{ all -> 0x0046 }
            throw r3     // Catch:{ all -> 0x0046 }
        L_0x0079:
            com.amap.api.mapcore2d.co r3 = new com.amap.api.mapcore2d.co     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "socket 连接异常 - SocketException"
            r3.<init>(r4)     // Catch:{ all -> 0x0046 }
            throw r3     // Catch:{ all -> 0x0046 }
        L_0x0081:
            com.amap.api.mapcore2d.co r3 = new com.amap.api.mapcore2d.co     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "未知主机 - UnKnowHostException"
            r3.<init>(r4)     // Catch:{ all -> 0x0046 }
            throw r3     // Catch:{ all -> 0x0046 }
        L_0x0089:
            com.amap.api.mapcore2d.co r3 = new com.amap.api.mapcore2d.co     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "url异常 - MalformedURLException"
            r3.<init>(r4)     // Catch:{ all -> 0x0046 }
            throw r3     // Catch:{ all -> 0x0046 }
        L_0x0091:
            com.amap.api.mapcore2d.co r3 = new com.amap.api.mapcore2d.co     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "http连接失败 - ConnectionException"
            r3.<init>(r4)     // Catch:{ all -> 0x0046 }
            throw r3     // Catch:{ all -> 0x0046 }
        L_0x0099:
            if (r1 == 0) goto L_0x00a7
            r1.disconnect()     // Catch:{ Throwable -> 0x009f }
            goto L_0x00a7
        L_0x009f:
            r3 = move-exception
            java.lang.String r5 = "HttpUrlUtil"
            java.lang.String r0 = "makePostReqeust"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r3, (java.lang.String) r5, (java.lang.String) r0)
        L_0x00a7:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.es.a(java.lang.String, java.util.Map, byte[]):com.amap.api.mapcore2d.ex");
    }

    /* access modifiers changed from: package-private */
    public HttpURLConnection a(String str, Map<String, String> map, boolean z) throws IOException {
        URLConnection uRLConnection;
        HttpURLConnection httpURLConnection;
        ct.b();
        URL url = new URL(str);
        if (this.k != null) {
            uRLConnection = this.k.a(this.f6083f, url);
        } else {
            uRLConnection = null;
        }
        if (uRLConnection == null) {
            if (this.f6083f != null) {
                uRLConnection = url.openConnection(this.f6083f);
            } else {
                uRLConnection = url.openConnection();
            }
        }
        if (this.f6081d) {
            httpURLConnection = (HttpsURLConnection) uRLConnection;
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setSSLSocketFactory(this.f6082e.getSocketFactory());
            httpsURLConnection.setHostnameVerifier(this.l);
        } else {
            httpURLConnection = (HttpURLConnection) uRLConnection;
        }
        if (Build.VERSION.SDK != null && Build.VERSION.SDK_INT > 13) {
            httpURLConnection.setRequestProperty("Connection", "close");
        }
        a(map, httpURLConnection);
        if (z) {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
        } else {
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
        }
        return httpURLConnection;
    }

    es(int i2, int i3, Proxy proxy, boolean z) {
        this(i2, i3, proxy, z, null);
    }

    es(int i2, int i3, Proxy proxy, boolean z, ep.a aVar) {
        this.h = -1;
        this.l = new HostnameVerifier() {
            public boolean verify(String str, SSLSession sSLSession) {
                HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
                if (defaultHostnameVerifier.verify("*.amap.com", sSLSession) || defaultHostnameVerifier.verify("*.apilocate.amap.com", sSLSession)) {
                    return true;
                }
                return false;
            }
        };
        this.f6079b = i2;
        this.f6080c = i3;
        this.f6083f = proxy;
        this.f6081d = z;
        this.k = aVar;
        a();
        if (z) {
            try {
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init(null, null, null);
                this.f6082e = instance;
            } catch (Throwable th) {
                dd.a(th, "HttpUtil", "HttpUtil");
            }
        }
    }
}
