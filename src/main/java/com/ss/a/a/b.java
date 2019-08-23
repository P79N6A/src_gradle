package com.ss.a.a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import javax.net.ssl.HostnameVerifier;

public abstract class b {
    private static HostnameVerifier p = new c();

    /* renamed from: a  reason: collision with root package name */
    public String f2371a = "";

    /* renamed from: b  reason: collision with root package name */
    int f2372b = 10000;

    /* renamed from: c  reason: collision with root package name */
    int f2373c = 1;
    /* access modifiers changed from: package-private */

    /* renamed from: d  reason: collision with root package name */
    public int f2374d;

    /* renamed from: e  reason: collision with root package name */
    Handler f2375e;

    /* renamed from: f  reason: collision with root package name */
    private Context f2376f;
    private String g;
    private int h;
    private int i;
    private byte[] j;
    private int k = -1;
    private byte[] l;
    /* access modifiers changed from: private */
    public boolean m;
    /* access modifiers changed from: private */
    public HandlerThread n;
    private boolean o;
    private HttpURLConnection q;

    public b(Context context, String str) {
        str = (str == null || str.length() <= 0) ? "" : "";
        this.f2376f = context;
        this.g = str;
    }

    private static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public abstract boolean a(int i2, byte[] bArr);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:34|35|(1:39)|40|41|42|43|44) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0077, code lost:
        r3 = "GET";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007c, code lost:
        r8.q.setRequestMethod(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0083, code lost:
        switch(r8.i) {
            case 1: goto L_0x008c;
            case 2: goto L_0x0089;
            default: goto L_0x0086;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0086, code lost:
        r3 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        r3 = "application/octet-stream";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008c, code lost:
        r3 = "application/json; charset=utf-8";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
        if (r3.length() <= 0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        r8.q.addRequestProperty("Content-Type", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009b, code lost:
        r8.q.addRequestProperty("Cookie", "sessionid=" + r8.g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c0, code lost:
        if (java.util.Locale.getDefault().getLanguage().equalsIgnoreCase("zh") == false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c2, code lost:
        r4 = r8.q;
        r5 = "Accept-Language";
        r3 = java.util.Locale.getDefault().toString() + "," + r3 + ";q=0.9";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e7, code lost:
        r4.addRequestProperty(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00eb, code lost:
        r4 = r8.q;
        r5 = "Accept-Language";
        r3 = java.util.Locale.getDefault().toString() + "," + r3 + ";q=0.9,en-US;q=0.6,en;q=0.4";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011a, code lost:
        r8.q.setDoOutput(true);
        r3 = r8.q.getOutputStream();
        r3.write(r8.j);
        r3.flush();
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0130, code lost:
        r8.q.connect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r8.k = r8.q.getResponseCode();
        r3 = r8.q.getInputStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r8.l = a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0149, code lost:
        if (r3 == null) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014f, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0151, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0152, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0153, code lost:
        if (r3 != null) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0155, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0158, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0159, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015a, code lost:
        if (r3 != null) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015f, code lost:
        if (r8.q == null) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0161, code lost:
        r8.q.disconnect();
        r8.q = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0168, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x016d, code lost:
        if (r8.q != null) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x016f, code lost:
        r8.q.disconnect();
        r8.q = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0176, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0183, code lost:
        if (r0 == false) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0185, code lost:
        a(r8.k, r8.l);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018c, code lost:
        return r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0111 */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0155 A[Catch:{ Throwable -> 0x0177, all -> 0x016a }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016a A[ExcHandler: all (r0v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:34:0x0111] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a() {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            java.lang.String r4 = r8.f2371a     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            boolean r4 = r8.o     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            if (r4 == 0) goto L_0x0037
            javax.net.ssl.TrustManager[] r4 = new javax.net.ssl.TrustManager[r1]     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            com.ss.a.a.d r5 = new com.ss.a.a.d     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            r5.<init>()     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            r4[r0] = r5     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            java.lang.String r5 = "TLS"
            javax.net.ssl.SSLContext r5 = javax.net.ssl.SSLContext.getInstance(r5)     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            java.security.SecureRandom r6 = new java.security.SecureRandom     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            r6.<init>()     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            r5.init(r2, r4, r6)     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            javax.net.ssl.SSLSocketFactory r4 = r5.getSocketFactory()     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(r4)     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            java.net.Proxy r4 = java.net.Proxy.NO_PROXY     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            java.net.URLConnection r4 = r3.openConnection(r4)     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
        L_0x0034:
            r8.q = r4     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            goto L_0x003e
        L_0x0037:
            java.net.URLConnection r4 = r3.openConnection()     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            goto L_0x0034
        L_0x003e:
            java.lang.String r4 = "https"
            java.lang.String r3 = r3.getProtocol()     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            boolean r3 = r4.equals(r3)     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            if (r3 == 0) goto L_0x0057
            java.net.HttpURLConnection r3 = r8.q     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            javax.net.ssl.HostnameVerifier r4 = p     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            r3.setHostnameVerifier(r4)     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
        L_0x0057:
            java.net.HttpURLConnection r3 = r8.q     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            int r4 = r8.f2372b     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            r3.setConnectTimeout(r4)     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            java.net.HttpURLConnection r3 = r8.q     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            int r4 = r8.f2372b     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            r3.setReadTimeout(r4)     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            int r3 = r8.h     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            switch(r3) {
                case 1: goto L_0x007a;
                case 2: goto L_0x0077;
                case 3: goto L_0x0074;
                case 4: goto L_0x0071;
                case 5: goto L_0x006e;
                case 6: goto L_0x006b;
                default: goto L_0x006a;
            }     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
        L_0x006a:
            goto L_0x0077
        L_0x006b:
            java.lang.String r3 = "TRACE"
            goto L_0x007c
        L_0x006e:
            java.lang.String r3 = "HEAD"
            goto L_0x007c
        L_0x0071:
            java.lang.String r3 = "DELETE"
            goto L_0x007c
        L_0x0074:
            java.lang.String r3 = "PUT"
            goto L_0x007c
        L_0x0077:
            java.lang.String r3 = "GET"
            goto L_0x007c
        L_0x007a:
            java.lang.String r3 = "POST"
        L_0x007c:
            java.net.HttpURLConnection r4 = r8.q     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            r4.setRequestMethod(r3)     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            int r3 = r8.i     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            switch(r3) {
                case 1: goto L_0x008c;
                case 2: goto L_0x0089;
                default: goto L_0x0086;
            }     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
        L_0x0086:
            java.lang.String r3 = ""
            goto L_0x008e
        L_0x0089:
            java.lang.String r3 = "application/octet-stream"
            goto L_0x008e
        L_0x008c:
            java.lang.String r3 = "application/json; charset=utf-8"
        L_0x008e:
            int r4 = r3.length()     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            if (r4 <= 0) goto L_0x009b
            java.net.HttpURLConnection r4 = r8.q     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            java.lang.String r5 = "Content-Type"
            r4.addRequestProperty(r5, r3)     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
        L_0x009b:
            java.net.HttpURLConnection r3 = r8.q     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            java.lang.String r4 = "Cookie"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            java.lang.String r6 = "sessionid="
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            java.lang.String r6 = r8.g     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            r5.append(r6)     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            r3.addRequestProperty(r4, r5)     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            java.lang.String r3 = r3.getLanguage()     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            java.lang.String r4 = "zh"
            boolean r4 = r3.equalsIgnoreCase(r4)     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            if (r4 == 0) goto L_0x00eb
            java.net.HttpURLConnection r4 = r8.q     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            java.lang.String r5 = "Accept-Language"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            r6.<init>()     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            java.util.Locale r7 = java.util.Locale.getDefault()     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            r6.append(r7)     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            java.lang.String r7 = ","
            r6.append(r7)     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            r6.append(r3)     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            java.lang.String r3 = ";q=0.9"
            r6.append(r3)     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            java.lang.String r3 = r6.toString()     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
        L_0x00e7:
            r4.addRequestProperty(r5, r3)     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            goto L_0x0111
        L_0x00eb:
            java.net.HttpURLConnection r4 = r8.q     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            java.lang.String r5 = "Accept-Language"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            r6.<init>()     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            java.util.Locale r7 = java.util.Locale.getDefault()     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            r6.append(r7)     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            java.lang.String r7 = ","
            r6.append(r7)     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            r6.append(r3)     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            java.lang.String r3 = ";q=0.9,en-US;q=0.6,en;q=0.4"
            r6.append(r3)     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            java.lang.String r3 = r6.toString()     // Catch:{ Throwable -> 0x0111, all -> 0x016a }
            goto L_0x00e7
        L_0x0111:
            byte[] r3 = r8.j     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            if (r3 == 0) goto L_0x0130
            byte[] r3 = r8.j     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            int r3 = r3.length     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            if (r3 <= 0) goto L_0x0130
            java.net.HttpURLConnection r3 = r8.q     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            r3.setDoOutput(r1)     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            java.net.HttpURLConnection r3 = r8.q     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            java.io.OutputStream r3 = r3.getOutputStream()     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            byte[] r4 = r8.j     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            r3.write(r4)     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            r3.flush()     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            r3.close()     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
        L_0x0130:
            java.net.HttpURLConnection r3 = r8.q     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            r3.connect()     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            java.net.HttpURLConnection r3 = r8.q     // Catch:{ Throwable -> 0x0159, all -> 0x0151 }
            int r3 = r3.getResponseCode()     // Catch:{ Throwable -> 0x0159, all -> 0x0151 }
            r8.k = r3     // Catch:{ Throwable -> 0x0159, all -> 0x0151 }
            java.net.HttpURLConnection r3 = r8.q     // Catch:{ Throwable -> 0x0159, all -> 0x0151 }
            java.io.InputStream r3 = r3.getInputStream()     // Catch:{ Throwable -> 0x0159, all -> 0x0151 }
            byte[] r4 = a((java.io.InputStream) r3)     // Catch:{ Throwable -> 0x015a, all -> 0x014f }
            r8.l = r4     // Catch:{ Throwable -> 0x015a, all -> 0x014f }
            if (r3 == 0) goto L_0x015d
        L_0x014b:
            r3.close()     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
            goto L_0x015d
        L_0x014f:
            r1 = move-exception
            goto L_0x0153
        L_0x0151:
            r1 = move-exception
            r3 = r2
        L_0x0153:
            if (r3 == 0) goto L_0x0158
            r3.close()     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
        L_0x0158:
            throw r1     // Catch:{ Throwable -> 0x0177, all -> 0x016a }
        L_0x0159:
            r3 = r2
        L_0x015a:
            if (r3 == 0) goto L_0x015d
            goto L_0x014b
        L_0x015d:
            java.net.HttpURLConnection r0 = r8.q
            if (r0 == 0) goto L_0x0168
            java.net.HttpURLConnection r0 = r8.q
            r0.disconnect()
            r8.q = r2
        L_0x0168:
            r0 = 1
            goto L_0x0183
        L_0x016a:
            r0 = move-exception
            java.net.HttpURLConnection r1 = r8.q
            if (r1 == 0) goto L_0x0176
            java.net.HttpURLConnection r1 = r8.q
            r1.disconnect()
            r8.q = r2
        L_0x0176:
            throw r0
        L_0x0177:
            java.net.HttpURLConnection r1 = r8.q
            if (r1 == 0) goto L_0x0183
            java.net.HttpURLConnection r1 = r8.q
            r1.disconnect()
            r8.q = r2
        L_0x0183:
            if (r0 == 0) goto L_0x018c
            int r1 = r8.k
            byte[] r2 = r8.l
            r8.a((int) r1, (byte[]) r2)
        L_0x018c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.a.a.b.a():boolean");
    }

    public final synchronized void a(int i2, int i3, byte[] bArr) {
        if (!this.m) {
            this.f2373c = 1;
            this.h = i2;
            this.i = i3;
            this.j = bArr;
            this.m = true;
            this.f2374d = 0;
            this.n = new HandlerThread("request");
            this.n.start();
            this.f2375e = new Handler(this.n.getLooper(), new Handler.Callback() {
                public final boolean handleMessage(Message message) {
                    if (b.this.f2374d >= b.this.f2373c) {
                        boolean unused = b.this.m = false;
                        int unused2 = b.this.f2374d = 0;
                        b.this.n.quit();
                        return false;
                    } else if (b.this.a()) {
                        boolean unused3 = b.this.m = false;
                        int unused4 = b.this.f2374d = 0;
                        b.this.n.quit();
                        return true;
                    } else {
                        b.this.f2375e.sendEmptyMessageDelayed(1, (long) (b.this.f2372b * 1));
                        b.this.f2374d++;
                        return false;
                    }
                }
            });
            this.f2375e.sendEmptyMessage(1);
        }
    }
}
