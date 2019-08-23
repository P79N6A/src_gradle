package com.alipay.b.b.a.a;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.Time;
import android.webkit.CookieManager;
import com.alipay.b.b.a.a.r;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

public final class x implements Callable<ab> {

    /* renamed from: e  reason: collision with root package name */
    private static final HttpRequestRetryHandler f5304e = new h();

    /* renamed from: a  reason: collision with root package name */
    protected s f5305a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f5306b;

    /* renamed from: c  reason: collision with root package name */
    public v f5307c;

    /* renamed from: d  reason: collision with root package name */
    String f5308d;

    /* renamed from: f  reason: collision with root package name */
    private HttpUriRequest f5309f;
    private HttpContext g = new BasicHttpContext();
    private CookieStore h = new BasicCookieStore();
    private CookieManager i;
    private AbstractHttpEntity j;
    private HttpHost k;
    private URL l;
    private int m = 0;
    private boolean n = false;
    private boolean o = false;
    private String p = null;
    private String q;

    public x(s sVar, v vVar) {
        this.f5305a = sVar;
        this.f5306b = this.f5305a.f5287b;
        this.f5307c = vVar;
    }

    private static long a(String[] strArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if ("max-age".equalsIgnoreCase(strArr[i2])) {
                int i3 = i2 + 1;
                if (strArr[i3] != null) {
                    try {
                        return Long.parseLong(strArr[i3]);
                    } catch (Exception unused) {
                    }
                } else {
                    continue;
                }
            }
        }
        return 0;
    }

    private static b a(HttpResponse httpResponse) {
        b bVar = new b();
        for (Header header : httpResponse.getAllHeaders()) {
            bVar.setHead(header.getName(), header.getValue());
        }
        return bVar;
    }

    private URI a() {
        String str = this.f5307c.f5295a;
        if (this.f5308d != null) {
            str = this.f5308d;
        }
        if (str != null) {
            return new URI(str);
        }
        throw new RuntimeException("url should not be null");
    }

    private static HashMap<String, String> a(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : str.split(";")) {
            String[] split = str2.indexOf(61) == -1 ? new String[]{"Content-Type", str2} : str2.split("=");
            hashMap.put(split[0], split[1]);
        }
        return hashMap;
    }

    private void d() {
        if (this.f5309f != null) {
            this.f5309f.abort();
        }
    }

    private String e() {
        if (!TextUtils.isEmpty(this.q)) {
            return this.q;
        }
        this.q = this.f5307c.a("operationType");
        return this.q;
    }

    private int f() {
        URL g2 = g();
        return g2.getPort() == -1 ? g2.getDefaultPort() : g2.getPort();
    }

    private URL g() {
        if (this.l != null) {
            return this.l;
        }
        this.l = new URL(this.f5307c.f5295a);
        return this.l;
    }

    private CookieManager h() {
        if (this.i != null) {
            return this.i;
        }
        this.i = CookieManager.getInstance();
        return this.i;
    }

    private HttpUriRequest b() {
        ByteArrayEntity byteArrayEntity;
        if (this.f5309f != null) {
            return this.f5309f;
        }
        if (this.j == null) {
            byte[] bArr = this.f5307c.f5296b;
            String a2 = this.f5307c.a("gzip");
            if (bArr != null) {
                if (!TextUtils.equals(a2, "true")) {
                    byteArrayEntity = new ByteArrayEntity(bArr);
                } else if (((long) bArr.length) < i.f5265a) {
                    byteArrayEntity = new ByteArrayEntity(bArr);
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.close();
                    ByteArrayEntity byteArrayEntity2 = new ByteArrayEntity(byteArrayOutputStream.toByteArray());
                    byteArrayEntity2.setContentEncoding("gzip");
                    StringBuilder sb = new StringBuilder("gzip size:");
                    sb.append(bArr.length);
                    sb.append("->");
                    sb.append(byteArrayEntity2.getContentLength());
                    byteArrayEntity = byteArrayEntity2;
                }
                this.j = byteArrayEntity;
                this.j.setContentType(this.f5307c.f5297c);
            }
        }
        AbstractHttpEntity abstractHttpEntity = this.j;
        if (abstractHttpEntity != null) {
            HttpPost httpPost = new HttpPost(a());
            httpPost.setEntity(abstractHttpEntity);
            this.f5309f = httpPost;
        } else {
            this.f5309f = new HttpGet(a());
        }
        return this.f5309f;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0285, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x028a, code lost:
        if (r13.m <= 0) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x028c, code lost:
        r13.m++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0293, code lost:
        new java.lang.StringBuilder().append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02a8, code lost:
        throw new com.alipay.b.b.a.a.a(0, java.lang.String.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02aa, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02b1, code lost:
        if (r13.f5307c.g != null) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02b3, code lost:
        new java.lang.StringBuilder().append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02bb, code lost:
        new java.lang.StringBuilder().append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02d0, code lost:
        throw new com.alipay.b.b.a.a.a(6, java.lang.String.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02d1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02d2, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02d9, code lost:
        if (r13.f5307c.g != null) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02db, code lost:
        new java.lang.StringBuilder().append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02e3, code lost:
        new java.lang.StringBuilder().append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02fa, code lost:
        throw new com.alipay.b.b.a.a.a(9, java.lang.String.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02fb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02fc, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0303, code lost:
        if (r13.f5307c.g != null) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0305, code lost:
        new java.lang.StringBuilder().append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x031c, code lost:
        throw new com.alipay.b.b.a.a.a(8, java.lang.String.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x031d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x031e, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0325, code lost:
        if (r13.f5307c.g != null) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0327, code lost:
        new java.lang.StringBuilder().append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x032f, code lost:
        new java.lang.StringBuilder().append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0345, code lost:
        throw new com.alipay.b.b.a.a.a(5, java.lang.String.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0346, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0347, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x034e, code lost:
        if (r13.f5307c.g != null) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0350, code lost:
        new java.lang.StringBuilder().append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0358, code lost:
        new java.lang.StringBuilder().append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x036e, code lost:
        throw new com.alipay.b.b.a.a.a(4, java.lang.String.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x036f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0370, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0377, code lost:
        if (r13.f5307c.g != null) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0379, code lost:
        new java.lang.StringBuilder().append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0381, code lost:
        new java.lang.StringBuilder().append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0396, code lost:
        throw new com.alipay.b.b.a.a.a(3, java.lang.String.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0397, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0398, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x039f, code lost:
        if (r13.f5307c.g != null) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03a1, code lost:
        new java.lang.StringBuilder().append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03a9, code lost:
        new java.lang.StringBuilder().append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03be, code lost:
        throw new com.alipay.b.b.a.a.a(3, java.lang.String.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03c0, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03c7, code lost:
        if (r13.f5307c.g != null) goto L_0x03c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03c9, code lost:
        new java.lang.StringBuilder().append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03d1, code lost:
        new java.lang.StringBuilder().append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03e6, code lost:
        throw new com.alipay.b.b.a.a.a(6, java.lang.String.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03e7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03e8, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03ef, code lost:
        if (r13.f5307c.g != null) goto L_0x03f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03f1, code lost:
        new java.lang.StringBuilder().append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03f9, code lost:
        new java.lang.StringBuilder().append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x040e, code lost:
        throw new com.alipay.b.b.a.a.a(2, java.lang.String.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x040f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0410, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0417, code lost:
        if (r13.f5307c.g != null) goto L_0x0419;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0419, code lost:
        new java.lang.StringBuilder().append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0421, code lost:
        new java.lang.StringBuilder().append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0436, code lost:
        throw new com.alipay.b.b.a.a.a(2, java.lang.String.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0437, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0443, code lost:
        throw new java.lang.RuntimeException("Url parser error!", r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0444, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0445, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x044c, code lost:
        if (r13.f5307c.g != null) goto L_0x044e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x044e, code lost:
        r0.getCode();
        r0.getMsg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0454, code lost:
        new java.lang.StringBuilder().append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x045c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0284, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x0233 */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02a9 A[ExcHandler: IOException (r0v20 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02d1 A[ExcHandler: UnknownHostException (r0v18 'e' java.net.UnknownHostException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02fb A[ExcHandler: HttpHostConnectException (r0v16 'e' org.apache.http.conn.HttpHostConnectException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x031d A[ExcHandler: NoHttpResponseException (r0v14 'e' org.apache.http.NoHttpResponseException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0346 A[ExcHandler: SocketTimeoutException (r0v12 'e' java.net.SocketTimeoutException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x036f A[ExcHandler: ConnectTimeoutException (r1v18 'e' org.apache.http.conn.ConnectTimeoutException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0397 A[ExcHandler: ConnectionPoolTimeoutException (r1v16 'e' org.apache.http.conn.ConnectionPoolTimeoutException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03bf A[ExcHandler: SSLException (r0v8 'e' javax.net.ssl.SSLException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03e7 A[ExcHandler: SSLPeerUnverifiedException (r0v6 'e' javax.net.ssl.SSLPeerUnverifiedException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x040f A[ExcHandler: SSLHandshakeException (r0v4 'e' javax.net.ssl.SSLHandshakeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0437 A[ExcHandler: URISyntaxException (r0v2 'e' java.net.URISyntaxException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0444 A[ExcHandler: a (r0v1 'e' com.alipay.b.b.a.a.a A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032 A[Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0258 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010f A[Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x012f A[Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0167 A[Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0174 A[Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e7 A[Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0284 A[ExcHandler: NullPointerException (r0v22 'e' java.lang.NullPointerException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alipay.b.b.a.a.ab call() {
        /*
            r13 = this;
        L_0x0000:
            r0 = 3
            r1 = 6
            r2 = 2
            r3 = 1
            r4 = 0
            android.content.Context r5 = r13.f5306b     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r6 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            android.net.NetworkInfo[] r5 = r5.getAllNetworkInfo()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            if (r5 != 0) goto L_0x0017
        L_0x0015:
            r5 = 0
            goto L_0x0030
        L_0x0017:
            int r6 = r5.length     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r7 = 0
        L_0x0019:
            if (r7 >= r6) goto L_0x0015
            r8 = r5[r7]     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            if (r8 == 0) goto L_0x002d
            boolean r9 = r8.isAvailable()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            if (r9 == 0) goto L_0x002d
            boolean r8 = r8.isConnectedOrConnecting()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            if (r8 == 0) goto L_0x002d
            r5 = 1
            goto L_0x0030
        L_0x002d:
            int r7 = r7 + 1
            goto L_0x0019
        L_0x0030:
            if (r5 == 0) goto L_0x0258
            com.alipay.b.b.a.a.v r5 = r13.f5307c     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.util.ArrayList<org.apache.http.Header> r5 = r5.f5298d     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            if (r5 == 0) goto L_0x0056
            boolean r6 = r5.isEmpty()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            if (r6 != 0) goto L_0x0056
            java.util.Iterator r5 = r5.iterator()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
        L_0x0042:
            boolean r6 = r5.hasNext()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            if (r6 == 0) goto L_0x0056
            java.lang.Object r6 = r5.next()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            org.apache.http.Header r6 = (org.apache.http.Header) r6     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            org.apache.http.client.methods.HttpUriRequest r7 = r13.b()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r7.addHeader(r6)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            goto L_0x0042
        L_0x0056:
            org.apache.http.client.methods.HttpUriRequest r5 = r13.b()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r6 = "Accept-Encoding"
            java.lang.String r7 = "gzip"
            r5.addHeader(r6, r7)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            org.apache.http.client.methods.HttpUriRequest r5 = r13.b()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r6 = "Connection"
            java.lang.String r7 = "Keep-Alive"
            r5.addHeader(r6, r7)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            org.apache.http.client.methods.HttpUriRequest r5 = r13.b()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r6 = "cookie"
            android.webkit.CookieManager r7 = r13.h()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            com.alipay.b.b.a.a.v r8 = r13.f5307c     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r8 = r8.f5295a     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r7 = r7.getCookie(r8)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r5.addHeader(r6, r7)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            org.apache.http.protocol.HttpContext r5 = r13.g     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r6 = "http.cookie-store"
            org.apache.http.client.CookieStore r7 = r13.h     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r5.setAttribute(r6, r7)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            com.alipay.b.b.a.a.s r5 = r13.f5305a     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            com.alipay.b.b.a.a.i r5 = r5.f5288c     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            org.apache.http.client.HttpRequestRetryHandler r6 = f5304e     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            org.apache.http.client.HttpClient r5 = r5.f5268c     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            org.apache.http.impl.client.DefaultHttpClient r5 = (org.apache.http.impl.client.DefaultHttpClient) r5     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r5.setHttpRequestRetryHandler(r6)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r8 = "By Http/Https to request. operationType="
            r7.<init>(r8)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r8 = r13.e()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r7.append(r8)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r8 = " url="
            r7.append(r8)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            org.apache.http.client.methods.HttpUriRequest r8 = r13.f5309f     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.net.URI r8 = r8.getURI()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r8 = r8.toString()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r7.append(r8)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            com.alipay.b.b.a.a.s r7 = r13.f5305a     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            com.alipay.b.b.a.a.i r7 = r7.f5288c     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            org.apache.http.params.HttpParams r7 = r7.getParams()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r8 = "http.route.default-proxy"
            android.content.Context r9 = r13.f5306b     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r10 = "connectivity"
            java.lang.Object r9 = r9.getSystemService(r10)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            android.net.ConnectivityManager r9 = (android.net.ConnectivityManager) r9     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            android.net.NetworkInfo r9 = r9.getActiveNetworkInfo()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r10 = 0
            if (r9 == 0) goto L_0x00ec
            boolean r9 = r9.isAvailable()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            if (r9 == 0) goto L_0x00ec
            java.lang.String r9 = android.net.Proxy.getDefaultHost()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            int r11 = android.net.Proxy.getDefaultPort()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            if (r9 == 0) goto L_0x00ec
            org.apache.http.HttpHost r12 = new org.apache.http.HttpHost     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r12.<init>(r9, r11)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            goto L_0x00ed
        L_0x00ec:
            r12 = r10
        L_0x00ed:
            if (r12 == 0) goto L_0x0104
            java.lang.String r9 = r12.getHostName()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r11 = "127.0.0.1"
            boolean r9 = android.text.TextUtils.equals(r9, r11)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            if (r9 == 0) goto L_0x0104
            int r9 = r12.getPort()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r11 = 8087(0x1f97, float:1.1332E-41)
            if (r9 != r11) goto L_0x0104
            goto L_0x0105
        L_0x0104:
            r10 = r12
        L_0x0105:
            r7.setParameter(r8, r10)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            org.apache.http.HttpHost r7 = r13.k     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            if (r7 == 0) goto L_0x010f
        L_0x010c:
            org.apache.http.HttpHost r7 = r13.k     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            goto L_0x0127
        L_0x010f:
            java.net.URL r7 = r13.g()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            org.apache.http.HttpHost r8 = new org.apache.http.HttpHost     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r9 = r7.getHost()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            int r10 = r13.f()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r7 = r7.getProtocol()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r8.<init>(r9, r10, r7)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r13.k = r8     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            goto L_0x010c
        L_0x0127:
            int r8 = r13.f()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r9 = 80
            if (r8 != r9) goto L_0x013c
            org.apache.http.HttpHost r7 = new org.apache.http.HttpHost     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.net.URL r8 = r13.g()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r8 = r8.getHost()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r7.<init>(r8)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
        L_0x013c:
            com.alipay.b.b.a.a.s r8 = r13.f5305a     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            com.alipay.b.b.a.a.i r8 = r8.f5288c     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            org.apache.http.client.methods.HttpUriRequest r9 = r13.f5309f     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            org.apache.http.protocol.HttpContext r10 = r13.g     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            org.apache.http.HttpResponse r7 = r8.execute((org.apache.http.HttpHost) r7, (org.apache.http.HttpRequest) r9, (org.apache.http.protocol.HttpContext) r10)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            com.alipay.b.b.a.a.s r10 = r13.f5305a     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r11 = 0
            long r8 = r8 - r5
            long r5 = r10.f5290e     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r11 = 0
            long r5 = r5 + r8
            r10.f5290e = r5     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            int r5 = r10.g     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            int r5 = r5 + r3
            r10.g = r5     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            org.apache.http.client.CookieStore r5 = r13.h     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.util.List r5 = r5.getCookies()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            com.alipay.b.b.a.a.v r6 = r13.f5307c     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            boolean r6 = r6.f5299e     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            if (r6 == 0) goto L_0x016e
            android.webkit.CookieManager r6 = r13.h()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r6.removeAllCookie()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
        L_0x016e:
            boolean r6 = r5.isEmpty()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            if (r6 != 0) goto L_0x01d3
            java.util.Iterator r5 = r5.iterator()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
        L_0x0178:
            boolean r6 = r5.hasNext()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            if (r6 == 0) goto L_0x01d3
            java.lang.Object r6 = r5.next()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            org.apache.http.cookie.Cookie r6 = (org.apache.http.cookie.Cookie) r6     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r8 = r6.getDomain()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            if (r8 == 0) goto L_0x0178
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r8.<init>()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r9 = r6.getName()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r8.append(r9)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r9 = "="
            r8.append(r9)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r9 = r6.getValue()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r8.append(r9)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r9 = "; domain="
            r8.append(r9)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r9 = r6.getDomain()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r8.append(r9)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            boolean r6 = r6.isSecure()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            if (r6 == 0) goto L_0x01b7
            java.lang.String r6 = "; Secure"
            goto L_0x01b9
        L_0x01b7:
            java.lang.String r6 = ""
        L_0x01b9:
            r8.append(r6)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r6 = r8.toString()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            android.webkit.CookieManager r8 = r13.h()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            com.alipay.b.b.a.a.v r9 = r13.f5307c     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r9 = r9.f5295a     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r8.setCookie(r9, r6)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            android.webkit.CookieSyncManager r6 = android.webkit.CookieSyncManager.getInstance()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r6.sync()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            goto L_0x0178
        L_0x01d3:
            org.apache.http.StatusLine r5 = r7.getStatusLine()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            int r5 = r5.getStatusCode()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            org.apache.http.StatusLine r6 = r7.getStatusLine()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r6 = r6.getReasonPhrase()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r8 = 200(0xc8, float:2.8E-43)
            if (r5 == r8) goto L_0x020b
            r8 = 304(0x130, float:4.26E-43)
            if (r5 != r8) goto L_0x01ed
            r8 = 1
            goto L_0x01ee
        L_0x01ed:
            r8 = 0
        L_0x01ee:
            if (r8 == 0) goto L_0x01f1
            goto L_0x020b
        L_0x01f1:
            com.alipay.b.b.a.a.a r5 = new com.alipay.b.b.a.a.a     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            org.apache.http.StatusLine r6 = r7.getStatusLine()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            int r6 = r6.getStatusCode()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            org.apache.http.StatusLine r7 = r7.getStatusLine()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r7 = r7.getReasonPhrase()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            throw r5     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
        L_0x020b:
            com.alipay.b.b.a.a.ab r5 = r13.a(r7, r5, r6)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r6 = -1
            if (r5 == 0) goto L_0x021c
            byte[] r8 = r5.f5243e     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            if (r8 == 0) goto L_0x021c
            byte[] r8 = r5.f5243e     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            int r8 = r8.length     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            long r8 = (long) r8     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            goto L_0x021d
        L_0x021c:
            r8 = r6
        L_0x021d:
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0233
            boolean r6 = r5 instanceof com.alipay.b.b.a.a.w     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            if (r6 == 0) goto L_0x0233
            r6 = r5
            com.alipay.b.b.a.a.w r6 = (com.alipay.b.b.a.a.w) r6     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            com.alipay.b.b.a.a.b r6 = r6.f5303d     // Catch:{ Exception -> 0x0233, a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284 }
            java.lang.String r7 = "Content-Length"
            java.lang.String r6 = r6.getHead(r7)     // Catch:{ Exception -> 0x0233, a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284 }
            java.lang.Long.parseLong(r6)     // Catch:{ Exception -> 0x0233, a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284 }
        L_0x0233:
            com.alipay.b.b.a.a.v r6 = r13.f5307c     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r6 = r6.f5295a     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            if (r6 == 0) goto L_0x0257
            java.lang.String r7 = r13.e()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            if (r7 != 0) goto L_0x0257
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r7.<init>()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r7.append(r6)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r6 = "#"
            r7.append(r6)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r6 = r13.e()     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            r7.append(r6)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
        L_0x0257:
            return r5
        L_0x0258:
            com.alipay.b.b.a.a.a r5 = new com.alipay.b.b.a.a.a     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            java.lang.String r7 = "The network is not available"
            r5.<init>(r6, r7)     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
            throw r5     // Catch:{ a -> 0x0444, URISyntaxException -> 0x0437, SSLHandshakeException -> 0x040f, SSLPeerUnverifiedException -> 0x03e7, SSLException -> 0x03bf, ConnectionPoolTimeoutException -> 0x0397, ConnectTimeoutException -> 0x036f, SocketTimeoutException -> 0x0346, NoHttpResponseException -> 0x031d, HttpHostConnectException -> 0x02fb, UnknownHostException -> 0x02d1, IOException -> 0x02a9, NullPointerException -> 0x0284, Exception -> 0x0264 }
        L_0x0264:
            r0 = move-exception
            r13.d()
            com.alipay.b.b.a.a.v r1 = r13.f5307c
            com.alipay.b.b.a.a.g r1 = r1.g
            if (r1 == 0) goto L_0x0276
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
        L_0x0276:
            com.alipay.b.b.a.a.a r1 = new com.alipay.b.b.a.a.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r2, r0)
            throw r1
        L_0x0284:
            r0 = move-exception
            r13.d()
            int r1 = r13.m
            if (r1 > 0) goto L_0x0293
            int r0 = r13.m
            int r0 = r0 + r3
            r13.m = r0
            goto L_0x0000
        L_0x0293:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            com.alipay.b.b.a.a.a r1 = new com.alipay.b.b.a.a.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r2, r0)
            throw r1
        L_0x02a9:
            r0 = move-exception
            r13.d()
            com.alipay.b.b.a.a.v r2 = r13.f5307c
            com.alipay.b.b.a.a.g r2 = r2.g
            if (r2 == 0) goto L_0x02bb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
        L_0x02bb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            com.alipay.b.b.a.a.a r2 = new com.alipay.b.b.a.a.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.<init>(r1, r0)
            throw r2
        L_0x02d1:
            r0 = move-exception
            r13.d()
            com.alipay.b.b.a.a.v r1 = r13.f5307c
            com.alipay.b.b.a.a.g r1 = r1.g
            if (r1 == 0) goto L_0x02e3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
        L_0x02e3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            com.alipay.b.b.a.a.a r1 = new com.alipay.b.b.a.a.a
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r2, r0)
            throw r1
        L_0x02fb:
            r0 = move-exception
            r13.d()
            com.alipay.b.b.a.a.v r1 = r13.f5307c
            com.alipay.b.b.a.a.g r1 = r1.g
            if (r1 == 0) goto L_0x030d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
        L_0x030d:
            com.alipay.b.b.a.a.a r1 = new com.alipay.b.b.a.a.a
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r2, r0)
            throw r1
        L_0x031d:
            r0 = move-exception
            r13.d()
            com.alipay.b.b.a.a.v r1 = r13.f5307c
            com.alipay.b.b.a.a.g r1 = r1.g
            if (r1 == 0) goto L_0x032f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
        L_0x032f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            com.alipay.b.b.a.a.a r1 = new com.alipay.b.b.a.a.a
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r2, r0)
            throw r1
        L_0x0346:
            r0 = move-exception
            r13.d()
            com.alipay.b.b.a.a.v r1 = r13.f5307c
            com.alipay.b.b.a.a.g r1 = r1.g
            if (r1 == 0) goto L_0x0358
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
        L_0x0358:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            com.alipay.b.b.a.a.a r1 = new com.alipay.b.b.a.a.a
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r2, r0)
            throw r1
        L_0x036f:
            r1 = move-exception
            r13.d()
            com.alipay.b.b.a.a.v r2 = r13.f5307c
            com.alipay.b.b.a.a.g r2 = r2.g
            if (r2 == 0) goto L_0x0381
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
        L_0x0381:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            com.alipay.b.b.a.a.a r2 = new com.alipay.b.b.a.a.a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.<init>(r0, r1)
            throw r2
        L_0x0397:
            r1 = move-exception
            r13.d()
            com.alipay.b.b.a.a.v r2 = r13.f5307c
            com.alipay.b.b.a.a.g r2 = r2.g
            if (r2 == 0) goto L_0x03a9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
        L_0x03a9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            com.alipay.b.b.a.a.a r2 = new com.alipay.b.b.a.a.a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.<init>(r0, r1)
            throw r2
        L_0x03bf:
            r0 = move-exception
            r13.d()
            com.alipay.b.b.a.a.v r2 = r13.f5307c
            com.alipay.b.b.a.a.g r2 = r2.g
            if (r2 == 0) goto L_0x03d1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
        L_0x03d1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            com.alipay.b.b.a.a.a r2 = new com.alipay.b.b.a.a.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.<init>(r1, r0)
            throw r2
        L_0x03e7:
            r0 = move-exception
            r13.d()
            com.alipay.b.b.a.a.v r1 = r13.f5307c
            com.alipay.b.b.a.a.g r1 = r1.g
            if (r1 == 0) goto L_0x03f9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
        L_0x03f9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            com.alipay.b.b.a.a.a r1 = new com.alipay.b.b.a.a.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r2, r0)
            throw r1
        L_0x040f:
            r0 = move-exception
            r13.d()
            com.alipay.b.b.a.a.v r1 = r13.f5307c
            com.alipay.b.b.a.a.g r1 = r1.g
            if (r1 == 0) goto L_0x0421
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
        L_0x0421:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            com.alipay.b.b.a.a.a r1 = new com.alipay.b.b.a.a.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r2, r0)
            throw r1
        L_0x0437:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r2 = "Url parser error!"
            r1.<init>(r2, r0)
            throw r1
        L_0x0444:
            r0 = move-exception
            r13.d()
            com.alipay.b.b.a.a.v r1 = r13.f5307c
            com.alipay.b.b.a.a.g r1 = r1.g
            if (r1 == 0) goto L_0x0454
            r0.getCode()
            r0.getMsg()
        L_0x0454:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.b.b.a.a.x.call():com.alipay.b.b.a.a.ab");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c3 A[SYNTHETIC, Splitter:B:23:0x00c3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.alipay.b.b.a.a.ab a(org.apache.http.HttpResponse r10, int r11, java.lang.String r12) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "开始handle，handleResponse-1,"
            r0.<init>(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            long r1 = r1.getId()
            r0.append(r1)
            org.apache.http.HttpEntity r0 = r10.getEntity()
            r1 = 0
            if (r0 == 0) goto L_0x00d5
            org.apache.http.StatusLine r2 = r10.getStatusLine()
            int r2 = r2.getStatusCode()
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L_0x00d5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "200，开始处理，handleResponse-2,threadid = "
            r2.<init>(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            long r3 = r3.getId()
            r2.append(r3)
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00bf }
            r2.<init>()     // Catch:{ all -> 0x00bf }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00bd }
            r9.a(r0, r2)     // Catch:{ all -> 0x00bd }
            byte[] r0 = r2.toByteArray()     // Catch:{ all -> 0x00bd }
            r5 = 0
            r9.o = r5     // Catch:{ all -> 0x00bd }
            com.alipay.b.b.a.a.s r5 = r9.f5305a     // Catch:{ all -> 0x00bd }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00bd }
            r8 = 0
            long r6 = r6 - r3
            long r3 = r5.f5291f     // Catch:{ all -> 0x00bd }
            r8 = 0
            long r3 = r3 + r6
            r5.f5291f = r3     // Catch:{ all -> 0x00bd }
            com.alipay.b.b.a.a.s r3 = r9.f5305a     // Catch:{ all -> 0x00bd }
            int r4 = r0.length     // Catch:{ all -> 0x00bd }
            long r4 = (long) r4     // Catch:{ all -> 0x00bd }
            long r6 = r3.f5289d     // Catch:{ all -> 0x00bd }
            r8 = 0
            long r6 = r6 + r4
            r3.f5289d = r6     // Catch:{ all -> 0x00bd }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            java.lang.String r4 = "res:"
            r3.<init>(r4)     // Catch:{ all -> 0x00bd }
            int r4 = r0.length     // Catch:{ all -> 0x00bd }
            r3.append(r4)     // Catch:{ all -> 0x00bd }
            com.alipay.b.b.a.a.w r3 = new com.alipay.b.b.a.a.w     // Catch:{ all -> 0x00bd }
            com.alipay.b.b.a.a.b r4 = a((org.apache.http.HttpResponse) r10)     // Catch:{ all -> 0x00bd }
            r3.<init>(r4, r11, r12, r0)     // Catch:{ all -> 0x00bd }
            long r11 = b(r10)     // Catch:{ all -> 0x00bd }
            org.apache.http.HttpEntity r10 = r10.getEntity()     // Catch:{ all -> 0x00bd }
            org.apache.http.Header r10 = r10.getContentType()     // Catch:{ all -> 0x00bd }
            if (r10 == 0) goto L_0x009e
            java.lang.String r10 = r10.getValue()     // Catch:{ all -> 0x00bd }
            java.util.HashMap r10 = a((java.lang.String) r10)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "charset"
            java.lang.Object r0 = r10.get(r0)     // Catch:{ all -> 0x00bd }
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "Content-Type"
            java.lang.Object r10 = r10.get(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x00bd }
            goto L_0x009f
        L_0x009e:
            r10 = r1
        L_0x009f:
            r3.f5244f = r10     // Catch:{ all -> 0x00bd }
            r3.f5302c = r1     // Catch:{ all -> 0x00bd }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00bd }
            r3.f5300a = r0     // Catch:{ all -> 0x00bd }
            r3.f5301b = r11     // Catch:{ all -> 0x00bd }
            r2.close()     // Catch:{ IOException -> 0x00b0 }
            r1 = r3
            goto L_0x00de
        L_0x00b0:
            r10 = move-exception
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.Throwable r10 = r10.getCause()
            java.lang.String r12 = "ArrayOutputStream close error!"
            r11.<init>(r12, r10)
            throw r11
        L_0x00bd:
            r10 = move-exception
            goto L_0x00c1
        L_0x00bf:
            r10 = move-exception
            r2 = r1
        L_0x00c1:
            if (r2 == 0) goto L_0x00d4
            r2.close()     // Catch:{ IOException -> 0x00c7 }
            goto L_0x00d4
        L_0x00c7:
            r10 = move-exception
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.Throwable r10 = r10.getCause()
            java.lang.String r12 = "ArrayOutputStream close error!"
            r11.<init>(r12, r10)
            throw r11
        L_0x00d4:
            throw r10
        L_0x00d5:
            if (r0 != 0) goto L_0x00de
            org.apache.http.StatusLine r10 = r10.getStatusLine()
            r10.getStatusCode()
        L_0x00de:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.b.b.a.a.x.a(org.apache.http.HttpResponse, int, java.lang.String):com.alipay.b.b.a.a.ab");
    }

    private static long b(HttpResponse httpResponse) {
        long j2;
        int i2;
        int i3;
        int i4;
        r.a aVar;
        int i5;
        int i6;
        int i7;
        Header firstHeader = httpResponse.getFirstHeader("Cache-Control");
        if (firstHeader != null) {
            String[] split = firstHeader.getValue().split("=");
            if (split.length >= 2) {
                try {
                    return a(split);
                } catch (NumberFormatException unused) {
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader("Expires");
        if (firstHeader2 != null) {
            String value = firstHeader2.getValue();
            Matcher matcher = r.f5281a.matcher(value);
            if (matcher.find()) {
                int a2 = r.a(matcher.group(1));
                int b2 = r.b(matcher.group(2));
                int c2 = r.c(matcher.group(3));
                aVar = r.d(matcher.group(4));
                int i8 = b2;
                i4 = a2;
                i2 = c2;
                i3 = i8;
            } else {
                Matcher matcher2 = r.f5282b.matcher(value);
                if (matcher2.find()) {
                    int b3 = r.b(matcher2.group(1));
                    i4 = r.a(matcher2.group(2));
                    r.a d2 = r.d(matcher2.group(3));
                    i2 = r.c(matcher2.group(4));
                    r.a aVar2 = d2;
                    i3 = b3;
                    aVar = aVar2;
                } else {
                    throw new IllegalArgumentException();
                }
            }
            if (i2 >= 2038) {
                i7 = 1;
                i6 = 0;
                i5 = 2038;
            } else {
                i5 = i2;
                i7 = i4;
                i6 = i3;
            }
            Time time = new Time("UTC");
            time.set(aVar.f5285c, aVar.f5284b, aVar.f5283a, i7, i6, i5);
            j2 = time.toMillis(false) - System.currentTimeMillis();
        } else {
            j2 = 0;
        }
        return j2;
    }

    private void a(HttpEntity httpEntity, OutputStream outputStream) {
        InputStream content = httpEntity.getContent();
        if (content != null) {
            Header contentEncoding = httpEntity.getContentEncoding();
            if (contentEncoding != null) {
                String value = contentEncoding.getValue();
                if (value != null && value.contains("gzip")) {
                    content = new GZIPInputStream(content);
                }
            }
        }
        long contentLength = httpEntity.getContentLength();
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int read = content.read(bArr);
                if (read == -1 || this.f5307c.f5242f) {
                    outputStream.flush();
                } else {
                    outputStream.write(bArr, 0, read);
                    if (this.f5307c.g != null) {
                        int i2 = (contentLength > 0 ? 1 : (contentLength == 0 ? 0 : -1));
                    }
                }
            }
            outputStream.flush();
            y.a(content);
        } catch (Exception e2) {
            e2.getCause();
            throw new IOException("HttpWorker Request Error!" + e2.getLocalizedMessage());
        } catch (Throwable th) {
            y.a(content);
            throw th;
        }
    }
}
