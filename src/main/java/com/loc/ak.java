package com.loc;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.loc.ah;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;

public final class ak {

    /* renamed from: a  reason: collision with root package name */
    long f25462a;

    /* renamed from: b  reason: collision with root package name */
    long f25463b;

    /* renamed from: c  reason: collision with root package name */
    private int f25464c;

    /* renamed from: d  reason: collision with root package name */
    private int f25465d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f25466e;

    /* renamed from: f  reason: collision with root package name */
    private SSLContext f25467f;
    private Proxy g;
    private volatile boolean h;
    private String i;
    private ah.a j;
    private a k;

    static class a implements HostnameVerifier {

        /* renamed from: a  reason: collision with root package name */
        private String f25468a;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f25468a = str;
            }
        }

        public final boolean verify(String str, SSLSession sSLSession) {
            HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
            if (!TextUtils.isEmpty(this.f25468a)) {
                String str2 = this.f25468a;
                this.f25468a = null;
                if (str2.equals(str)) {
                    return true;
                }
            }
            return defaultHostnameVerifier.verify(str, sSLSession) || defaultHostnameVerifier.verify(str, sSLSession);
        }
    }

    ak(int i2, int i3, Proxy proxy) {
        this(i2, i3, proxy, false);
    }

    ak(int i2, int i3, Proxy proxy, boolean z) {
        this(i2, i3, proxy, z, (byte) 0);
    }

    private ak(int i2, int i3, Proxy proxy, boolean z, byte b2) {
        this.f25462a = -1;
        this.k = new a((byte) 0);
        this.f25464c = i2;
        this.f25465d = i3;
        this.g = proxy;
        this.f25466e = z;
        this.j = null;
        try {
            this.i = UUID.randomUUID().toString().replaceAll("-", "").toLowerCase();
        } catch (Throwable th) {
            f.a(th, "ht", "ic");
        }
        if (z) {
            try {
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init(null, null, null);
                this.f25467f = instance;
            } catch (Throwable th2) {
                f.a(th2, "ht", "ne");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x0112 A[SYNTHETIC, Splitter:B:74:0x0112] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0120 A[SYNTHETIC, Splitter:B:79:0x0120] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x012e A[SYNTHETIC, Splitter:B:84:0x012e] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x013c A[SYNTHETIC, Splitter:B:89:0x013c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.loc.am a(java.net.HttpURLConnection r11) throws com.loc.cx, java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = ""
            r1 = 0
            r11.connect()     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            java.util.Map r2 = r11.getHeaderFields()     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            int r3 = r11.getResponseCode()     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            r4 = 0
            if (r2 == 0) goto L_0x0028
            java.lang.String r5 = "gsid"
            java.lang.Object r5 = r2.get(r5)     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            java.util.List r5 = (java.util.List) r5     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            if (r5 == 0) goto L_0x0028
            int r6 = r5.size()     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            if (r6 <= 0) goto L_0x0028
            java.lang.Object r5 = r5.get(r4)     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            r0 = r5
        L_0x0028:
            r5 = 200(0xc8, float:2.8E-43)
            if (r3 != r5) goto L_0x00c7
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            r3.<init>()     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            java.io.InputStream r11 = r11.getInputStream()     // Catch:{ IOException -> 0x00c2, all -> 0x00bc }
            java.io.PushbackInputStream r5 = new java.io.PushbackInputStream     // Catch:{ IOException -> 0x00ba, all -> 0x00b5 }
            r6 = 2
            r5.<init>(r11, r6)     // Catch:{ IOException -> 0x00ba, all -> 0x00b5 }
            byte[] r6 = new byte[r6]     // Catch:{ IOException -> 0x00b3, all -> 0x00b0 }
            r5.read(r6)     // Catch:{ IOException -> 0x00b3, all -> 0x00b0 }
            r5.unread(r6)     // Catch:{ IOException -> 0x00b3, all -> 0x00b0 }
            byte r7 = r6[r4]     // Catch:{ IOException -> 0x00b3, all -> 0x00b0 }
            r8 = 31
            if (r7 != r8) goto L_0x0057
            r7 = 1
            byte r6 = r6[r7]     // Catch:{ IOException -> 0x00b3, all -> 0x00b0 }
            r7 = -117(0xffffffffffffff8b, float:NaN)
            if (r6 != r7) goto L_0x0057
            java.util.zip.GZIPInputStream r6 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x00b3, all -> 0x00b0 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x00b3, all -> 0x00b0 }
            r1 = r6
            goto L_0x0058
        L_0x0057:
            r1 = r5
        L_0x0058:
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ IOException -> 0x00b3, all -> 0x00b0 }
        L_0x005c:
            int r7 = r1.read(r6)     // Catch:{ IOException -> 0x00b3, all -> 0x00b0 }
            r8 = -1
            if (r7 == r8) goto L_0x0067
            r3.write(r6, r4, r7)     // Catch:{ IOException -> 0x00b3, all -> 0x00b0 }
            goto L_0x005c
        L_0x0067:
            com.loc.i.c()     // Catch:{ IOException -> 0x00b3, all -> 0x00b0 }
            com.loc.am r4 = new com.loc.am     // Catch:{ IOException -> 0x00b3, all -> 0x00b0 }
            r4.<init>()     // Catch:{ IOException -> 0x00b3, all -> 0x00b0 }
            byte[] r6 = r3.toByteArray()     // Catch:{ IOException -> 0x00b3, all -> 0x00b0 }
            r4.f25472a = r6     // Catch:{ IOException -> 0x00b3, all -> 0x00b0 }
            r4.f25473b = r2     // Catch:{ IOException -> 0x00b3, all -> 0x00b0 }
            java.lang.String r2 = r10.i     // Catch:{ IOException -> 0x00b3, all -> 0x00b0 }
            r4.f25474c = r2     // Catch:{ IOException -> 0x00b3, all -> 0x00b0 }
            r4.f25475d = r0     // Catch:{ IOException -> 0x00b3, all -> 0x00b0 }
            r3.close()     // Catch:{ Throwable -> 0x0081 }
            goto L_0x0089
        L_0x0081:
            r0 = move-exception
            java.lang.String r2 = "ht"
            java.lang.String r3 = "par"
            com.loc.f.a((java.lang.Throwable) r0, (java.lang.String) r2, (java.lang.String) r3)
        L_0x0089:
            if (r11 == 0) goto L_0x0097
            r11.close()     // Catch:{ Throwable -> 0x008f }
            goto L_0x0097
        L_0x008f:
            r11 = move-exception
            java.lang.String r0 = "ht"
            java.lang.String r2 = "par"
            com.loc.f.a((java.lang.Throwable) r11, (java.lang.String) r0, (java.lang.String) r2)
        L_0x0097:
            r5.close()     // Catch:{ Throwable -> 0x009b }
            goto L_0x00a3
        L_0x009b:
            r11 = move-exception
            java.lang.String r0 = "ht"
            java.lang.String r2 = "par"
            com.loc.f.a((java.lang.Throwable) r11, (java.lang.String) r0, (java.lang.String) r2)
        L_0x00a3:
            r1.close()     // Catch:{ Throwable -> 0x00a7 }
            goto L_0x00af
        L_0x00a7:
            r11 = move-exception
            java.lang.String r0 = "ht"
            java.lang.String r1 = "par"
            com.loc.f.a((java.lang.Throwable) r11, (java.lang.String) r0, (java.lang.String) r1)
        L_0x00af:
            return r4
        L_0x00b0:
            r0 = move-exception
            r2 = r1
            goto L_0x00b8
        L_0x00b3:
            r2 = r1
            goto L_0x00c5
        L_0x00b5:
            r0 = move-exception
            r2 = r1
            r5 = r2
        L_0x00b8:
            r1 = r3
            goto L_0x010d
        L_0x00ba:
            r2 = r1
            goto L_0x00c4
        L_0x00bc:
            r11 = move-exception
            r0 = r1
            r2 = r0
            r5 = r2
            r1 = r3
            goto L_0x0110
        L_0x00c2:
            r11 = r1
            r2 = r11
        L_0x00c4:
            r5 = r2
        L_0x00c5:
            r1 = r3
            goto L_0x0104
        L_0x00c7:
            com.loc.cx r2 = new com.loc.cx     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            java.lang.String r5 = "网络异常原因："
            r4.<init>(r5)     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            java.lang.String r11 = r11.getResponseMessage()     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            r4.append(r11)     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            java.lang.String r11 = " 网络异常状态码："
            r4.append(r11)     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            r4.append(r3)     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            java.lang.String r11 = "  "
            r4.append(r11)     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            r4.append(r0)     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            java.lang.String r11 = " "
            r4.append(r11)     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            java.lang.String r11 = r10.i     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            r4.append(r11)     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            java.lang.String r11 = r4.toString()     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            r2.<init>(r11, r0)     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            r2.a(r3)     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
            throw r2     // Catch:{ IOException -> 0x0101, all -> 0x00fc }
        L_0x00fc:
            r11 = move-exception
            r0 = r1
            r2 = r0
            r5 = r2
            goto L_0x0110
        L_0x0101:
            r11 = r1
            r2 = r11
            r5 = r2
        L_0x0104:
            com.loc.cx r3 = new com.loc.cx     // Catch:{ all -> 0x010c }
            java.lang.String r4 = "IO 操作异常 - IOException"
            r3.<init>(r4, r0)     // Catch:{ all -> 0x010c }
            throw r3     // Catch:{ all -> 0x010c }
        L_0x010c:
            r0 = move-exception
        L_0x010d:
            r9 = r0
            r0 = r11
            r11 = r9
        L_0x0110:
            if (r1 == 0) goto L_0x011e
            r1.close()     // Catch:{ Throwable -> 0x0116 }
            goto L_0x011e
        L_0x0116:
            r1 = move-exception
            java.lang.String r3 = "ht"
            java.lang.String r4 = "par"
            com.loc.f.a((java.lang.Throwable) r1, (java.lang.String) r3, (java.lang.String) r4)
        L_0x011e:
            if (r0 == 0) goto L_0x012c
            r0.close()     // Catch:{ Throwable -> 0x0124 }
            goto L_0x012c
        L_0x0124:
            r0 = move-exception
            java.lang.String r1 = "ht"
            java.lang.String r3 = "par"
            com.loc.f.a((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r3)
        L_0x012c:
            if (r5 == 0) goto L_0x013a
            r5.close()     // Catch:{ Throwable -> 0x0132 }
            goto L_0x013a
        L_0x0132:
            r0 = move-exception
            java.lang.String r1 = "ht"
            java.lang.String r3 = "par"
            com.loc.f.a((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r3)
        L_0x013a:
            if (r2 == 0) goto L_0x0148
            r2.close()     // Catch:{ Throwable -> 0x0140 }
            goto L_0x0148
        L_0x0140:
            r0 = move-exception
            java.lang.String r1 = "ht"
            java.lang.String r2 = "par"
            com.loc.f.a((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r2)
        L_0x0148:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.ak.a(java.net.HttpURLConnection):com.loc.am");
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

    private HttpURLConnection a(String str, Map<String, String> map, boolean z) throws IOException {
        HttpURLConnection httpURLConnection;
        dc.b();
        if (map == null) {
            map = new HashMap<>();
        }
        String str2 = "";
        if (ah.f25455a == 1) {
            str2 = ah.f25456b;
        }
        if (!TextUtils.isEmpty(str2)) {
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            str = parse.buildUpon().encodedAuthority(str2).build().toString();
            if (map != null) {
                map.put("targetHost", host);
            }
            if (this.f25466e && this.k != null) {
                this.k.a(str2);
            }
        }
        URL url = new URL(str);
        URLConnection a2 = this.j != null ? this.j.a() : null;
        if (a2 == null) {
            a2 = this.g != null ? url.openConnection(this.g) : url.openConnection();
        }
        if (this.f25466e) {
            httpURLConnection = (HttpsURLConnection) a2;
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setSSLSocketFactory(this.f25467f.getSocketFactory());
            httpsURLConnection.setHostnameVerifier(this.k);
        } else {
            httpURLConnection = (HttpURLConnection) a2;
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

    private void a(Map<String, String> map, HttpURLConnection httpURLConnection) {
        if (map != null) {
            for (String next : map.keySet()) {
                httpURLConnection.addRequestProperty(next, map.get(next));
            }
        }
        try {
            httpURLConnection.addRequestProperty("csid", this.i);
        } catch (Throwable th) {
            f.a(th, "ht", "adh");
        }
        httpURLConnection.setConnectTimeout(this.f25464c);
        httpURLConnection.setReadTimeout(this.f25465d);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ba A[SYNTHETIC, Splitter:B:66:0x00ba] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.loc.am a(java.lang.String r3, java.util.Map<java.lang.String, java.lang.String> r4, byte[] r5) throws com.loc.cx {
        /*
            r2 = this;
            r0 = 1
            r1 = 0
            java.net.HttpURLConnection r3 = r2.a((java.lang.String) r3, (java.util.Map<java.lang.String, java.lang.String>) r4, (boolean) r0)     // Catch:{ ConnectException -> 0x00ac, MalformedURLException -> 0x00a0, UnknownHostException -> 0x0094, SocketException -> 0x0088, SocketTimeoutException -> 0x007c, InterruptedIOException -> 0x0074, IOException -> 0x0068, cx -> 0x005f, Throwable -> 0x004f }
            if (r5 == 0) goto L_0x0038
            int r4 = r5.length     // Catch:{ ConnectException -> 0x0034, MalformedURLException -> 0x0031, UnknownHostException -> 0x002e, SocketException -> 0x002b, SocketTimeoutException -> 0x0028, InterruptedIOException -> 0x004b, IOException -> 0x0025, cx -> 0x0022, Throwable -> 0x001f, all -> 0x001b }
            if (r4 <= 0) goto L_0x0038
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ ConnectException -> 0x0034, MalformedURLException -> 0x0031, UnknownHostException -> 0x002e, SocketException -> 0x002b, SocketTimeoutException -> 0x0028, InterruptedIOException -> 0x004b, IOException -> 0x0025, cx -> 0x0022, Throwable -> 0x001f, all -> 0x001b }
            java.io.OutputStream r0 = r3.getOutputStream()     // Catch:{ ConnectException -> 0x0034, MalformedURLException -> 0x0031, UnknownHostException -> 0x002e, SocketException -> 0x002b, SocketTimeoutException -> 0x0028, InterruptedIOException -> 0x004b, IOException -> 0x0025, cx -> 0x0022, Throwable -> 0x001f, all -> 0x001b }
            r4.<init>(r0)     // Catch:{ ConnectException -> 0x0034, MalformedURLException -> 0x0031, UnknownHostException -> 0x002e, SocketException -> 0x002b, SocketTimeoutException -> 0x0028, InterruptedIOException -> 0x004b, IOException -> 0x0025, cx -> 0x0022, Throwable -> 0x001f, all -> 0x001b }
            r4.write(r5)     // Catch:{ ConnectException -> 0x0034, MalformedURLException -> 0x0031, UnknownHostException -> 0x002e, SocketException -> 0x002b, SocketTimeoutException -> 0x0028, InterruptedIOException -> 0x004b, IOException -> 0x0025, cx -> 0x0022, Throwable -> 0x001f, all -> 0x001b }
            r4.close()     // Catch:{ ConnectException -> 0x0034, MalformedURLException -> 0x0031, UnknownHostException -> 0x002e, SocketException -> 0x002b, SocketTimeoutException -> 0x0028, InterruptedIOException -> 0x004b, IOException -> 0x0025, cx -> 0x0022, Throwable -> 0x001f, all -> 0x001b }
            goto L_0x0038
        L_0x001b:
            r4 = move-exception
            r1 = r3
            goto L_0x00b8
        L_0x001f:
            r4 = move-exception
            r1 = r3
            goto L_0x0050
        L_0x0022:
            r4 = move-exception
            r1 = r3
            goto L_0x0060
        L_0x0025:
            r4 = move-exception
            r1 = r3
            goto L_0x0069
        L_0x0028:
            r4 = move-exception
            r1 = r3
            goto L_0x007d
        L_0x002b:
            r4 = move-exception
            r1 = r3
            goto L_0x0089
        L_0x002e:
            r4 = move-exception
            r1 = r3
            goto L_0x0095
        L_0x0031:
            r4 = move-exception
            r1 = r3
            goto L_0x00a1
        L_0x0034:
            r4 = move-exception
            r1 = r3
            goto L_0x00ad
        L_0x0038:
            com.loc.am r4 = r2.a((java.net.HttpURLConnection) r3)     // Catch:{ ConnectException -> 0x0034, MalformedURLException -> 0x0031, UnknownHostException -> 0x002e, SocketException -> 0x002b, SocketTimeoutException -> 0x0028, InterruptedIOException -> 0x004b, IOException -> 0x0025, cx -> 0x0022, Throwable -> 0x001f, all -> 0x001b }
            if (r3 == 0) goto L_0x004a
            r3.disconnect()     // Catch:{ Throwable -> 0x0042 }
            goto L_0x004a
        L_0x0042:
            r3 = move-exception
            java.lang.String r5 = "ht"
            java.lang.String r0 = "mPt"
            com.loc.f.a((java.lang.Throwable) r3, (java.lang.String) r5, (java.lang.String) r0)
        L_0x004a:
            return r4
        L_0x004b:
            r1 = r3
            goto L_0x0074
        L_0x004d:
            r4 = move-exception
            goto L_0x00b8
        L_0x004f:
            r4 = move-exception
        L_0x0050:
            java.lang.String r3 = "ht"
            java.lang.String r5 = "mPt"
            com.loc.f.a((java.lang.Throwable) r4, (java.lang.String) r3, (java.lang.String) r5)     // Catch:{ all -> 0x004d }
            com.loc.cx r3 = new com.loc.cx     // Catch:{ all -> 0x004d }
            java.lang.String r4 = "未知的错误"
            r3.<init>(r4)     // Catch:{ all -> 0x004d }
            throw r3     // Catch:{ all -> 0x004d }
        L_0x005f:
            r4 = move-exception
        L_0x0060:
            java.lang.String r3 = "ht"
            java.lang.String r5 = "mPt"
            com.loc.f.a((java.lang.Throwable) r4, (java.lang.String) r3, (java.lang.String) r5)     // Catch:{ all -> 0x004d }
            throw r4     // Catch:{ all -> 0x004d }
        L_0x0068:
            r4 = move-exception
        L_0x0069:
            com.google.a.a.a.a.a.a.b(r4)     // Catch:{ all -> 0x004d }
            com.loc.cx r3 = new com.loc.cx     // Catch:{ all -> 0x004d }
            java.lang.String r4 = "IO 操作异常 - IOException"
            r3.<init>(r4)     // Catch:{ all -> 0x004d }
            throw r3     // Catch:{ all -> 0x004d }
        L_0x0074:
            com.loc.cx r3 = new com.loc.cx     // Catch:{ all -> 0x004d }
            java.lang.String r4 = "未知的错误"
            r3.<init>(r4)     // Catch:{ all -> 0x004d }
            throw r3     // Catch:{ all -> 0x004d }
        L_0x007c:
            r4 = move-exception
        L_0x007d:
            com.google.a.a.a.a.a.a.b(r4)     // Catch:{ all -> 0x004d }
            com.loc.cx r3 = new com.loc.cx     // Catch:{ all -> 0x004d }
            java.lang.String r4 = "socket 连接超时 - SocketTimeoutException"
            r3.<init>(r4)     // Catch:{ all -> 0x004d }
            throw r3     // Catch:{ all -> 0x004d }
        L_0x0088:
            r4 = move-exception
        L_0x0089:
            com.google.a.a.a.a.a.a.b(r4)     // Catch:{ all -> 0x004d }
            com.loc.cx r3 = new com.loc.cx     // Catch:{ all -> 0x004d }
            java.lang.String r4 = "socket 连接异常 - SocketException"
            r3.<init>(r4)     // Catch:{ all -> 0x004d }
            throw r3     // Catch:{ all -> 0x004d }
        L_0x0094:
            r4 = move-exception
        L_0x0095:
            com.google.a.a.a.a.a.a.b(r4)     // Catch:{ all -> 0x004d }
            com.loc.cx r3 = new com.loc.cx     // Catch:{ all -> 0x004d }
            java.lang.String r4 = "未知主机 - UnKnowHostException"
            r3.<init>(r4)     // Catch:{ all -> 0x004d }
            throw r3     // Catch:{ all -> 0x004d }
        L_0x00a0:
            r4 = move-exception
        L_0x00a1:
            com.google.a.a.a.a.a.a.b(r4)     // Catch:{ all -> 0x004d }
            com.loc.cx r3 = new com.loc.cx     // Catch:{ all -> 0x004d }
            java.lang.String r4 = "url异常 - MalformedURLException"
            r3.<init>(r4)     // Catch:{ all -> 0x004d }
            throw r3     // Catch:{ all -> 0x004d }
        L_0x00ac:
            r4 = move-exception
        L_0x00ad:
            com.google.a.a.a.a.a.a.b(r4)     // Catch:{ all -> 0x004d }
            com.loc.cx r3 = new com.loc.cx     // Catch:{ all -> 0x004d }
            java.lang.String r4 = "http连接失败 - ConnectionException"
            r3.<init>(r4)     // Catch:{ all -> 0x004d }
            throw r3     // Catch:{ all -> 0x004d }
        L_0x00b8:
            if (r1 == 0) goto L_0x00c6
            r1.disconnect()     // Catch:{ Throwable -> 0x00be }
            goto L_0x00c6
        L_0x00be:
            r3 = move-exception
            java.lang.String r5 = "ht"
            java.lang.String r0 = "mPt"
            com.loc.f.a((java.lang.Throwable) r3, (java.lang.String) r5, (java.lang.String) r0)
        L_0x00c6:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.ak.a(java.lang.String, java.util.Map, byte[]):com.loc.am");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:57|56|62|63|(2:65|66)|(2:70|71)|72) */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0102, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0109, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x010a, code lost:
        com.loc.f.a(r11, "ht", "mdr");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r9.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0117, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0118, code lost:
        com.loc.f.a(r9, "ht", "mdr");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x00eb */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f0 A[SYNTHETIC, Splitter:B:65:0x00f0] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00fe A[SYNTHETIC, Splitter:B:70:0x00fe] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0105 A[SYNTHETIC, Splitter:B:75:0x0105] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0113 A[SYNTHETIC, Splitter:B:80:0x0113] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10, java.util.Map<java.lang.String, java.lang.String> r11, com.loc.aj.a r12) {
        /*
            r8 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = 0
            java.lang.String r11 = a((java.util.Map<java.lang.String, java.lang.String>) r11)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e6 }
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x00ea, all -> 0x00e6 }
            r1.<init>()     // Catch:{ Throwable -> 0x00ea, all -> 0x00e6 }
            r1.append(r9)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e6 }
            if (r11 == 0) goto L_0x001a
            java.lang.String r9 = "?"
            r1.append(r9)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e6 }
            r1.append(r11)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e6 }
        L_0x001a:
            java.lang.String r9 = r1.toString()     // Catch:{ Throwable -> 0x00ea, all -> 0x00e6 }
            r11 = 0
            java.net.HttpURLConnection r9 = r8.a((java.lang.String) r9, (java.util.Map<java.lang.String, java.lang.String>) r10, (boolean) r11)     // Catch:{ Throwable -> 0x00ea, all -> 0x00e6 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00eb }
            java.lang.String r1 = "bytes="
            r10.<init>(r1)     // Catch:{ Throwable -> 0x00eb }
            long r1 = r8.f25463b     // Catch:{ Throwable -> 0x00eb }
            r10.append(r1)     // Catch:{ Throwable -> 0x00eb }
            java.lang.String r1 = "-"
            r10.append(r1)     // Catch:{ Throwable -> 0x00eb }
            java.lang.String r10 = r10.toString()     // Catch:{ Throwable -> 0x00eb }
            java.lang.String r1 = "RANGE"
            r9.setRequestProperty(r1, r10)     // Catch:{ Throwable -> 0x00eb }
            r9.connect()     // Catch:{ Throwable -> 0x00eb }
            int r10 = r9.getResponseCode()     // Catch:{ Throwable -> 0x00eb }
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
            com.loc.cx r1 = new com.loc.cx     // Catch:{ Throwable -> 0x00eb }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00eb }
            java.lang.String r3 = "网络异常原因："
            r2.<init>(r3)     // Catch:{ Throwable -> 0x00eb }
            java.lang.String r3 = r9.getResponseMessage()     // Catch:{ Throwable -> 0x00eb }
            r2.append(r3)     // Catch:{ Throwable -> 0x00eb }
            java.lang.String r3 = " 网络异常状态码："
            r2.append(r3)     // Catch:{ Throwable -> 0x00eb }
            r2.append(r10)     // Catch:{ Throwable -> 0x00eb }
            java.lang.String r10 = r2.toString()     // Catch:{ Throwable -> 0x00eb }
            r1.<init>(r10)     // Catch:{ Throwable -> 0x00eb }
            r12.c()     // Catch:{ Throwable -> 0x00eb }
        L_0x0077:
            java.io.InputStream r10 = r9.getInputStream()     // Catch:{ Throwable -> 0x00eb }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r0]     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
        L_0x007f:
            boolean r2 = java.lang.Thread.interrupted()     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            if (r2 != 0) goto L_0x00b8
            boolean r2 = r8.h     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            if (r2 != 0) goto L_0x00b8
            int r2 = r10.read(r1, r11, r0)     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            if (r2 <= 0) goto L_0x00b8
            long r3 = r8.f25462a     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x009f
            long r3 = r8.f25463b     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            long r5 = r8.f25462a     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x00b8
        L_0x009f:
            if (r2 != r0) goto L_0x00a7
            long r3 = r8.f25463b     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            r12.a(r1, r3)     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            goto L_0x00b1
        L_0x00a7:
            byte[] r3 = new byte[r2]     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            java.lang.System.arraycopy(r1, r11, r3, r11, r2)     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            long r4 = r8.f25463b     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            r12.a(r3, r4)     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
        L_0x00b1:
            long r3 = r8.f25463b     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            long r5 = (long) r2     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            long r3 = r3 + r5
            r8.f25463b = r3     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            goto L_0x007f
        L_0x00b8:
            boolean r11 = r8.h     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            if (r11 == 0) goto L_0x00c0
            r12.e()     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            goto L_0x00c3
        L_0x00c0:
            r12.d()     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
        L_0x00c3:
            if (r10 == 0) goto L_0x00d1
            r10.close()     // Catch:{ IOException | Throwable -> 0x00c9 }
            goto L_0x00d1
        L_0x00c9:
            r10 = move-exception
            java.lang.String r11 = "ht"
            java.lang.String r12 = "mdr"
            com.loc.f.a((java.lang.Throwable) r10, (java.lang.String) r11, (java.lang.String) r12)
        L_0x00d1:
            if (r9 == 0) goto L_0x0101
            r9.disconnect()     // Catch:{ Throwable -> 0x00d7 }
            return
        L_0x00d7:
            r9 = move-exception
            java.lang.String r10 = "ht"
            java.lang.String r11 = "mdr"
            com.loc.f.a((java.lang.Throwable) r9, (java.lang.String) r10, (java.lang.String) r11)
            return
        L_0x00e0:
            r11 = move-exception
            r0 = r10
            r10 = r11
            goto L_0x0103
        L_0x00e4:
            r0 = r10
            goto L_0x00eb
        L_0x00e6:
            r9 = move-exception
            r10 = r9
            r9 = r0
            goto L_0x0103
        L_0x00ea:
            r9 = r0
        L_0x00eb:
            r12.c()     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x00fc
            r0.close()     // Catch:{ IOException | Throwable -> 0x00f4 }
            goto L_0x00fc
        L_0x00f4:
            r10 = move-exception
            java.lang.String r11 = "ht"
            java.lang.String r12 = "mdr"
            com.loc.f.a((java.lang.Throwable) r10, (java.lang.String) r11, (java.lang.String) r12)
        L_0x00fc:
            if (r9 == 0) goto L_0x0101
            r9.disconnect()     // Catch:{ Throwable -> 0x00d7 }
        L_0x0101:
            return
        L_0x0102:
            r10 = move-exception
        L_0x0103:
            if (r0 == 0) goto L_0x0111
            r0.close()     // Catch:{ IOException | Throwable -> 0x0109 }
            goto L_0x0111
        L_0x0109:
            r11 = move-exception
            java.lang.String r12 = "ht"
            java.lang.String r0 = "mdr"
            com.loc.f.a((java.lang.Throwable) r11, (java.lang.String) r12, (java.lang.String) r0)
        L_0x0111:
            if (r9 == 0) goto L_0x011f
            r9.disconnect()     // Catch:{ Throwable -> 0x0117 }
            goto L_0x011f
        L_0x0117:
            r9 = move-exception
            java.lang.String r11 = "ht"
            java.lang.String r12 = "mdr"
            com.loc.f.a((java.lang.Throwable) r9, (java.lang.String) r11, (java.lang.String) r12)
        L_0x011f:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.ak.a(java.lang.String, java.util.Map, java.util.Map, com.loc.aj$a):void");
    }
}
