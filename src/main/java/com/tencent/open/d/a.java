package com.tencent.open.d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.open.a.f;
import com.tencent.open.d.h;
import java.io.ByteArrayOutputStream;
import java.io.CharConversionException;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.NotActiveException;
import java.io.NotSerializableException;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.io.SyncFailedException;
import java.io.UTFDataFormatException;
import java.io.UnsupportedEncodingException;
import java.io.WriteAbortedException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileLockInterruptionException;
import java.nio.charset.MalformedInputException;
import java.nio.charset.UnmappableCharacterException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.InvalidPropertiesFormatException;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.ConnectionClosedException;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.MalformedChunkCodingException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

public final class a {

    /* renamed from: com.tencent.open.d.a$a  reason: collision with other inner class name */
    public static class C0854a extends Exception {
        public C0854a(String str) {
            super(str);
        }
    }

    public static class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public static class c extends SSLSocketFactory {

        /* renamed from: a  reason: collision with root package name */
        private final SSLContext f79726a = SSLContext.getInstance("TLS");

        public final Socket createSocket() throws IOException {
            return this.f79726a.getSocketFactory().createSocket();
        }

        public c(KeyStore keyStore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
            super(keyStore);
            d dVar;
            try {
                dVar = new d();
            } catch (Exception unused) {
                dVar = null;
            }
            this.f79726a.init(null, new TrustManager[]{dVar}, null);
        }

        public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
            return this.f79726a.getSocketFactory().createSocket(socket, str, i, z);
        }
    }

    public static class d implements X509TrustManager {

        /* renamed from: a  reason: collision with root package name */
        X509TrustManager f79727a;

        public final X509Certificate[] getAcceptedIssuers() {
            return this.f79727a.getAcceptedIssuers();
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        d() throws java.lang.Exception {
            /*
                r4 = this;
                r4.<init>()
                r0 = 0
                java.lang.String r1 = "JKS"
                java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)     // Catch:{ Exception -> 0x000b }
                goto L_0x000c
            L_0x000b:
                r1 = r0
            L_0x000c:
                if (r1 == 0) goto L_0x003c
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0033 }
                java.lang.String r3 = "trustedCerts"
                r2.<init>(r3)     // Catch:{ all -> 0x0033 }
                java.lang.String r0 = "passphrase"
                char[] r0 = r0.toCharArray()     // Catch:{ all -> 0x0031 }
                r1.load(r2, r0)     // Catch:{ all -> 0x0031 }
                java.lang.String r0 = "SunX509"
                java.lang.String r3 = "SunJSSE"
                javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0, r3)     // Catch:{ all -> 0x0031 }
                r0.init(r1)     // Catch:{ all -> 0x0031 }
                javax.net.ssl.TrustManager[] r0 = r0.getTrustManagers()     // Catch:{ all -> 0x0031 }
                r2.close()
                goto L_0x004b
            L_0x0031:
                r0 = move-exception
                goto L_0x0036
            L_0x0033:
                r1 = move-exception
                r2 = r0
                r0 = r1
            L_0x0036:
                if (r2 == 0) goto L_0x003b
                r2.close()
            L_0x003b:
                throw r0
            L_0x003c:
                java.lang.String r1 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
                javax.net.ssl.TrustManagerFactory r1 = javax.net.ssl.TrustManagerFactory.getInstance(r1)
                r1.init(r0)
                javax.net.ssl.TrustManager[] r0 = r1.getTrustManagers()
            L_0x004b:
                r1 = 0
            L_0x004c:
                int r2 = r0.length
                if (r1 >= r2) goto L_0x005f
                r2 = r0[r1]
                boolean r2 = r2 instanceof javax.net.ssl.X509TrustManager
                if (r2 == 0) goto L_0x005c
                r0 = r0[r1]
                javax.net.ssl.X509TrustManager r0 = (javax.net.ssl.X509TrustManager) r0
                r4.f79727a = r0
                return
            L_0x005c:
                int r1 = r1 + 1
                goto L_0x004c
            L_0x005f:
                java.lang.Exception r0 = new java.lang.Exception
                java.lang.String r1 = "Couldn't initialize"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.d.a.d.<init>():void");
        }

        public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            this.f79727a.checkClientTrusted(x509CertificateArr, str);
        }

        public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            this.f79727a.checkServerTrusted(x509CertificateArr, str);
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final String f79728a;

        /* renamed from: b  reason: collision with root package name */
        public final int f79729b;

        private e(String str, int i) {
            this.f79728a = str;
            this.f79729b = i;
        }

        /* synthetic */ e(String str, int i, byte b2) {
            this(str, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0122, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0124, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0126, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0128, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0130, code lost:
        r15 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0131, code lost:
        com.tencent.open.b.g.a().a(r6, r15, 0, 0, -4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0140, code lost:
        r15 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0141, code lost:
        com.tencent.open.b.g.a().a(r6, r15, 0, 0, a(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0151, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0152, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0153, code lost:
        r15 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0154, code lost:
        com.tencent.open.b.g.a().a(r6, r15, 0, 0, -3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0161, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0162, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0163, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0164, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0165, code lost:
        r15 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0176, code lost:
        r13 = java.lang.Integer.parseInt(r0.getMessage().replace("http status code error:", ""));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0178, code lost:
        r13 = -9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x017c, code lost:
        com.tencent.open.b.g.a().a(r6, r15, 0, 0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0188, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0189, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018a, code lost:
        r15 = r8;
        r14 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018f, code lost:
        r7 = android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0194, code lost:
        com.tencent.open.b.g.a().a(r6, r15, 0, 0, -8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a3, code lost:
        r15 = r8;
        r14 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01af, code lost:
        r13 = r2;
        r7 = r8;
        r9 = 0;
        r11 = 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013f A[ExcHandler: IOException (e java.io.IOException), Splitter:B:26:0x00fd] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0152 A[ExcHandler: MalformedURLException (e java.net.MalformedURLException), Splitter:B:26:0x00fd] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0162 A[ExcHandler: b (r0v10 'e' com.tencent.open.d.a$b A[CUSTOM_DECLARE]), Splitter:B:26:0x00fd] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0164 A[ExcHandler: a (e com.tencent.open.d.a$a), Splitter:B:26:0x00fd] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01bd A[LOOP:0: B:25:0x00f8->B:90:0x01bd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0194 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01af A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject a(com.tencent.connect.b.d r17, android.content.Context r18, java.lang.String r19, android.os.Bundle r20, java.lang.String r21) throws java.io.IOException, org.json.JSONException, com.tencent.open.d.a.b, com.tencent.open.d.a.C0854a {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "openSDK_LOG.HttpUtils"
            java.lang.String r4 = "OpenApi request"
            com.tencent.open.a.f.a(r3, r4)
            java.lang.String r3 = r19.toLowerCase()
            java.lang.String r4 = "http"
            boolean r3 = r3.startsWith(r4)
            if (r3 != 0) goto L_0x004d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.tencent.open.d.e r4 = com.tencent.open.d.e.a()
            java.lang.String r5 = "https://openmobile.qq.com/"
            java.lang.String r4 = r4.a(r1, r5)
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.tencent.open.d.e r5 = com.tencent.open.d.e.a()
            java.lang.String r6 = "https://openmobile.qq.com/"
            java.lang.String r5 = r5.a(r1, r6)
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r6 = r4
            goto L_0x004f
        L_0x004d:
            r3 = r2
            r6 = r3
        L_0x004f:
            java.lang.String r4 = "add_share"
            int r4 = r2.indexOf(r4)
            r5 = 0
            r7 = 1
            if (r4 >= 0) goto L_0x0091
            java.lang.String r4 = "upload_pic"
            int r4 = r2.indexOf(r4)
            if (r4 >= 0) goto L_0x0091
            java.lang.String r4 = "add_topic"
            int r4 = r2.indexOf(r4)
            if (r4 >= 0) goto L_0x0091
            java.lang.String r4 = "set_user_face"
            int r4 = r2.indexOf(r4)
            if (r4 >= 0) goto L_0x0091
            java.lang.String r4 = "add_t"
            int r4 = r2.indexOf(r4)
            if (r4 >= 0) goto L_0x0091
            java.lang.String r4 = "add_pic_t"
            int r4 = r2.indexOf(r4)
            if (r4 >= 0) goto L_0x0091
            java.lang.String r4 = "add_pic_url"
            int r4 = r2.indexOf(r4)
            if (r4 >= 0) goto L_0x0091
            java.lang.String r4 = "add_video"
            int r4 = r2.indexOf(r4)
            if (r4 < 0) goto L_0x009a
        L_0x0091:
            java.lang.String r4 = "requireApi"
            java.lang.String[] r8 = new java.lang.String[r7]
            r8[r5] = r2
            com.tencent.connect.a.a.a(r1, r0, r4, r8)
        L_0x009a:
            r2 = 0
            long r8 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r4 = r0.f79590a
            com.tencent.open.d.d r4 = com.tencent.open.d.d.a(r1, r4)
            java.lang.String r10 = "Common_HttpRetryCount"
            int r4 = r4.a(r10)
            java.lang.String r10 = "OpenConfig_test"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "config 1:Common_HttpRetryCount            config_value:"
            r11.<init>(r12)
            r11.append(r4)
            java.lang.String r12 = "   appid:"
            r11.append(r12)
            java.lang.String r12 = r0.f79590a
            r11.append(r12)
            java.lang.String r12 = "     url:"
            r11.append(r12)
            r11.append(r6)
            java.lang.String r11 = r11.toString()
            com.tencent.open.a.f.a(r10, r11)
            if (r4 != 0) goto L_0x00d3
            r4 = 3
        L_0x00d3:
            java.lang.String r10 = "OpenConfig_test"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "config 1:Common_HttpRetryCount            result_value:"
            r11.<init>(r12)
            r11.append(r4)
            java.lang.String r12 = "   appid:"
            r11.append(r12)
            java.lang.String r0 = r0.f79590a
            r11.append(r0)
            java.lang.String r0 = "     url:"
            r11.append(r0)
            r11.append(r6)
            java.lang.String r0 = r11.toString()
            com.tencent.open.a.f.a(r10, r0)
        L_0x00f8:
            int r5 = r5 + r7
            r12 = r20
            r13 = r21
            com.tencent.open.d.h$a r0 = a(r1, r3, r13, r12)     // Catch:{ ConnectTimeoutException -> 0x01a2, SocketTimeoutException -> 0x0189, a -> 0x0164, b -> 0x0162, MalformedURLException -> 0x0152, IOException -> 0x013f, JSONException -> 0x012f }
            java.lang.String r14 = r0.f79759a     // Catch:{ ConnectTimeoutException -> 0x01a2, SocketTimeoutException -> 0x0189, a -> 0x0164, b -> 0x0162, MalformedURLException -> 0x0152, IOException -> 0x013f, JSONException -> 0x012f }
            org.json.JSONObject r14 = com.tencent.open.d.h.d((java.lang.String) r14)     // Catch:{ ConnectTimeoutException -> 0x01a2, SocketTimeoutException -> 0x0189, a -> 0x0164, b -> 0x0162, MalformedURLException -> 0x0152, IOException -> 0x013f, JSONException -> 0x012f }
            java.lang.String r2 = "ret"
            int r2 = r14.getInt(r2)     // Catch:{ JSONException -> 0x0116, ConnectTimeoutException -> 0x0112, SocketTimeoutException -> 0x010e, a -> 0x0164, b -> 0x0162, MalformedURLException -> 0x0152, IOException -> 0x013f }
            goto L_0x0117
        L_0x010e:
            r0 = move-exception
            r15 = r8
            goto L_0x018c
        L_0x0112:
            r0 = move-exception
            r15 = r8
            goto L_0x01a5
        L_0x0116:
            r2 = -4
        L_0x0117:
            long r10 = r0.f79760b     // Catch:{ ConnectTimeoutException -> 0x0112, SocketTimeoutException -> 0x010e, a -> 0x0164, b -> 0x0162, MalformedURLException -> 0x0152, IOException -> 0x013f, JSONException -> 0x012f }
            r15 = r8
            long r7 = r0.f79761c     // Catch:{ ConnectTimeoutException -> 0x012c, SocketTimeoutException -> 0x012a, a -> 0x0128, b -> 0x0162, MalformedURLException -> 0x0126, IOException -> 0x0124, JSONException -> 0x0122 }
            r13 = r2
            r9 = r10
            r11 = r7
            r7 = r15
            goto L_0x01b5
        L_0x0122:
            r0 = move-exception
            goto L_0x0131
        L_0x0124:
            r0 = move-exception
            goto L_0x0141
        L_0x0126:
            r0 = move-exception
            goto L_0x0154
        L_0x0128:
            r0 = move-exception
            goto L_0x0166
        L_0x012a:
            r0 = move-exception
            goto L_0x018c
        L_0x012c:
            r0 = move-exception
            goto L_0x01a5
        L_0x012f:
            r0 = move-exception
            r15 = r8
        L_0x0131:
            com.tencent.open.b.g r5 = com.tencent.open.b.g.a()
            r9 = 0
            r11 = 0
            r13 = -4
            r7 = r15
            r5.a(r6, r7, r9, r11, r13)
            throw r0
        L_0x013f:
            r0 = move-exception
            r15 = r8
        L_0x0141:
            int r13 = a((java.io.IOException) r0)
            com.tencent.open.b.g r5 = com.tencent.open.b.g.a()
            r9 = 0
            r11 = 0
            r7 = r15
            r5.a(r6, r7, r9, r11, r13)
            throw r0
        L_0x0152:
            r0 = move-exception
            r15 = r8
        L_0x0154:
            com.tencent.open.b.g r5 = com.tencent.open.b.g.a()
            r9 = 0
            r11 = 0
            r13 = -3
            r7 = r15
            r5.a(r6, r7, r9, r11, r13)
            throw r0
        L_0x0162:
            r0 = move-exception
            throw r0
        L_0x0164:
            r0 = move-exception
            r15 = r8
        L_0x0166:
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "http status code error:"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ Exception -> 0x0178 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x0178 }
            r13 = r1
            goto L_0x017c
        L_0x0178:
            r1 = -9
            r13 = -9
        L_0x017c:
            com.tencent.open.b.g r5 = com.tencent.open.b.g.a()
            r9 = 0
            r11 = 0
            r7 = r15
            r5.a(r6, r7, r9, r11, r13)
            throw r0
        L_0x0189:
            r0 = move-exception
            r15 = r8
            r14 = r2
        L_0x018c:
            r2 = -8
            if (r5 >= r4) goto L_0x0194
            long r7 = android.os.SystemClock.elapsedRealtime()
            goto L_0x01ac
        L_0x0194:
            com.tencent.open.b.g r5 = com.tencent.open.b.g.a()
            r9 = 0
            r11 = 0
            r13 = -8
            r7 = r15
            r5.a(r6, r7, r9, r11, r13)
            throw r0
        L_0x01a2:
            r0 = move-exception
            r15 = r8
            r14 = r2
        L_0x01a5:
            r2 = -7
            if (r5 >= r4) goto L_0x01c1
            long r7 = android.os.SystemClock.elapsedRealtime()
        L_0x01ac:
            r8 = r7
            if (r5 < r4) goto L_0x01bd
            r13 = r2
            r7 = r8
            r9 = 0
            r11 = 0
        L_0x01b5:
            com.tencent.open.b.g r5 = com.tencent.open.b.g.a()
            r5.a(r6, r7, r9, r11, r13)
            return r14
        L_0x01bd:
            r2 = r14
            r7 = 1
            goto L_0x00f8
        L_0x01c1:
            com.tencent.open.b.g r5 = com.tencent.open.b.g.a()
            r9 = 0
            r11 = 0
            r13 = -7
            r7 = r15
            r5.a(r6, r7, r9, r11, r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.d.a.a(com.tencent.connect.b.d, android.content.Context, java.lang.String, android.os.Bundle, java.lang.String):org.json.JSONObject");
    }

    private static int a(Context context) {
        if (Build.VERSION.SDK_INT >= 11) {
            String property = System.getProperty("http.proxyPort");
            if (!TextUtils.isEmpty(property)) {
                try {
                    return Integer.parseInt(property);
                } catch (NumberFormatException unused) {
                }
            }
            return -1;
        } else if (context == null) {
            return Proxy.getDefaultPort();
        } else {
            int port = Proxy.getPort(context);
            if (port < 0) {
                return Proxy.getDefaultPort();
            }
            return port;
        }
    }

    public static String a(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if ((obj instanceof String) || (obj instanceof String[])) {
                if (obj instanceof String[]) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append("&");
                    }
                    sb.append(URLEncoder.encode(str) + "=");
                    String[] stringArray = bundle.getStringArray(str);
                    if (stringArray != null) {
                        for (int i = 0; i < stringArray.length; i++) {
                            if (i == 0) {
                                sb.append(URLEncoder.encode(stringArray[i]));
                            } else {
                                sb.append(URLEncoder.encode("," + stringArray[i]));
                            }
                        }
                    }
                } else {
                    if (z) {
                        z = false;
                    } else {
                        sb.append("&");
                    }
                    sb.append(URLEncoder.encode(str) + "=" + URLEncoder.encode(bundle.getString(str)));
                }
            }
        }
        return sb.toString();
    }

    public static int a(IOException iOException) {
        if (iOException instanceof CharConversionException) {
            return -20;
        }
        if (iOException instanceof MalformedInputException) {
            return -21;
        }
        if (iOException instanceof UnmappableCharacterException) {
            return -22;
        }
        if (iOException instanceof HttpResponseException) {
            return -23;
        }
        if (iOException instanceof ClosedChannelException) {
            return -24;
        }
        if (iOException instanceof ConnectionClosedException) {
            return -25;
        }
        if (iOException instanceof EOFException) {
            return -26;
        }
        if (iOException instanceof FileLockInterruptionException) {
            return -27;
        }
        if (iOException instanceof FileNotFoundException) {
            return -28;
        }
        if (iOException instanceof HttpRetryException) {
            return -29;
        }
        if (iOException instanceof ConnectTimeoutException) {
            return -7;
        }
        if (iOException instanceof SocketTimeoutException) {
            return -8;
        }
        if (iOException instanceof InvalidPropertiesFormatException) {
            return -30;
        }
        if (iOException instanceof MalformedChunkCodingException) {
            return -31;
        }
        if (iOException instanceof MalformedURLException) {
            return -3;
        }
        if (iOException instanceof NoHttpResponseException) {
            return -32;
        }
        if (iOException instanceof InvalidClassException) {
            return -33;
        }
        if (iOException instanceof InvalidObjectException) {
            return -34;
        }
        if (iOException instanceof NotActiveException) {
            return -35;
        }
        if (iOException instanceof NotSerializableException) {
            return -36;
        }
        if (iOException instanceof OptionalDataException) {
            return -37;
        }
        if (iOException instanceof StreamCorruptedException) {
            return -38;
        }
        if (iOException instanceof WriteAbortedException) {
            return -39;
        }
        if (iOException instanceof ProtocolException) {
            return -40;
        }
        if (iOException instanceof SSLHandshakeException) {
            return -41;
        }
        if (iOException instanceof SSLKeyException) {
            return -42;
        }
        if (iOException instanceof SSLPeerUnverifiedException) {
            return -43;
        }
        if (iOException instanceof SSLProtocolException) {
            return -44;
        }
        if (iOException instanceof BindException) {
            return -45;
        }
        if (iOException instanceof ConnectException) {
            return -46;
        }
        if (iOException instanceof NoRouteToHostException) {
            return -47;
        }
        if (iOException instanceof PortUnreachableException) {
            return -48;
        }
        if (iOException instanceof SyncFailedException) {
            return -49;
        }
        if (iOException instanceof UTFDataFormatException) {
            return -50;
        }
        if (iOException instanceof UnknownHostException) {
            return -51;
        }
        if (iOException instanceof UnknownServiceException) {
            return -52;
        }
        if (iOException instanceof UnsupportedEncodingException) {
            return -53;
        }
        if (iOException instanceof ZipException) {
            return -54;
        }
        return -2;
    }

    private static String a(HttpResponse httpResponse) throws IllegalStateException, IOException {
        InputStream inputStream;
        InputStream content = httpResponse.getEntity().getContent();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Header firstHeader = httpResponse.getFirstHeader("Content-Encoding");
        if (firstHeader == null || firstHeader.getValue().toLowerCase().indexOf("gzip") < 0) {
            inputStream = content;
        } else {
            inputStream = new GZIPInputStream(content);
        }
        byte[] bArr = new byte[512];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                String str = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                inputStream.close();
                return str;
            }
        }
    }

    private static String a(Bundle bundle, String str) {
        StringBuilder sb = new StringBuilder();
        int size = bundle.size();
        int i = -1;
        for (String str2 : bundle.keySet()) {
            i++;
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                sb.append("Content-Disposition: form-data; name=\"" + str2 + "\"\r\n" + "\r\n" + ((String) obj));
                if (i < size - 1) {
                    sb.append("\r\n--" + str + "\r\n");
                }
            }
        }
        return sb.toString();
    }

    public static HttpClient a(Context context, String str) {
        d dVar;
        int i;
        int i2;
        String str2;
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        e eVar = null;
        if (Build.VERSION.SDK_INT < 16) {
            try {
                KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
                instance.load(null, null);
                c cVar = new c(instance);
                cVar.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                schemeRegistry.register(new Scheme("https", cVar, 443));
            } catch (Exception unused) {
                schemeRegistry.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
            }
        } else {
            schemeRegistry.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
        }
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        if (context != null) {
            dVar = d.a(context, str);
        } else {
            dVar = null;
        }
        if (dVar != null) {
            i2 = dVar.a("Common_HttpConnectionTimeout");
            i = dVar.a("Common_SocketConnectionTimeout");
        } else {
            i = 0;
            i2 = 0;
        }
        if (i2 == 0) {
            i2 = 15000;
        }
        if (i == 0) {
            i = 30000;
        }
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, i2);
        HttpConnectionParams.setSoTimeout(basicHttpParams, i);
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(basicHttpParams, "UTF-8");
        HttpProtocolParams.setUserAgent(basicHttpParams, "AndroidSDK_" + Build.VERSION.SDK + "_" + Build.DEVICE + "_" + Build.VERSION.RELEASE);
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
        if (context != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.getType() == 0) {
                    if (Build.VERSION.SDK_INT >= 11) {
                        str2 = System.getProperty("http.proxyHost");
                    } else if (context != null) {
                        str2 = Proxy.getHost(context);
                        if (TextUtils.isEmpty(str2)) {
                            str2 = Proxy.getDefaultHost();
                        }
                    } else {
                        str2 = Proxy.getDefaultHost();
                    }
                    int a2 = a(context);
                    if (!TextUtils.isEmpty(str2) && a2 >= 0) {
                        eVar = new e(str2, a2, (byte) 0);
                    }
                }
            }
        }
        if (eVar != null) {
            defaultHttpClient.getParams().setParameter("http.route.default-proxy", new HttpHost(eVar.f79728a, eVar.f79729b));
        }
        return defaultHttpClient;
    }

    public static h.a a(Context context, String str, String str2, Bundle bundle) throws MalformedURLException, IOException, b, C0854a {
        Bundle bundle2;
        String str3;
        String str4;
        if (context != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                    throw new b("network unavailable");
                }
            }
        }
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        String string = bundle2.getString("appid_for_getting_config");
        bundle2.remove("appid_for_getting_config");
        HttpClient a2 = a(context, string);
        HttpGet httpGet = null;
        int i = -1;
        int i2 = 0;
        if (str2.equals("GET")) {
            String a3 = a(bundle2);
            i2 = 0 + a3.length();
            f.a("openSDK_LOG.HttpUtils", "-->openUrl2 before url =" + str);
            if (str.indexOf("?") == -1) {
                str4 = str + "?";
            } else {
                str4 = str + "&";
            }
            f.a("openSDK_LOG.HttpUtils", "-->openUrl2 encodedParam =" + a3 + " -- url = " + str4);
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append(a3);
            httpGet = new HttpGet(sb.toString());
            httpGet.addHeader("Accept-Encoding", "gzip");
        } else if (str2.equals("POST")) {
            httpGet = new HttpPost(str);
            httpGet.addHeader("Accept-Encoding", "gzip");
            Bundle bundle3 = new Bundle();
            for (String str5 : bundle2.keySet()) {
                Object obj = bundle2.get(str5);
                if (obj instanceof byte[]) {
                    bundle3.putByteArray(str5, (byte[]) obj);
                }
            }
            if (!bundle2.containsKey(PushConstants.MZ_PUSH_MESSAGE_METHOD)) {
                bundle2.putString(PushConstants.MZ_PUSH_MESSAGE_METHOD, str2);
            }
            httpGet.setHeader("Content-Type", "multipart/form-data; boundary=3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
            httpGet.setHeader("Connection", "Keep-Alive");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(h.e("--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"));
            byteArrayOutputStream.write(h.e(a(bundle2, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f")));
            if (!bundle3.isEmpty()) {
                int size = bundle3.size();
                byteArrayOutputStream.write(h.e("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"));
                Iterator it2 = bundle3.keySet().iterator();
                while (it2.hasNext()) {
                    i++;
                    byteArrayOutputStream.write(h.e("Content-Disposition: form-data; name=\"" + str3 + "\"; filename=\"" + str3 + "\"\r\n"));
                    byteArrayOutputStream.write(h.e("Content-Type: content/unknown\r\n\r\n"));
                    byte[] byteArray = bundle3.getByteArray(str3);
                    if (byteArray != null) {
                        byteArrayOutputStream.write(byteArray);
                    }
                    if (i < size - 1) {
                        byteArrayOutputStream.write(h.e("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"));
                    }
                }
            }
            byteArrayOutputStream.write(h.e("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f--\r\n"));
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            i2 = 0 + byteArray2.length;
            byteArrayOutputStream.close();
            httpGet.setEntity(new ByteArrayEntity(byteArray2));
        }
        HttpResponse execute = a2.execute(httpGet);
        if (execute.getStatusLine().getStatusCode() == 200) {
            return new h.a(a(execute), i2);
        }
        throw new C0854a("http status code error:" + r8);
    }
}
