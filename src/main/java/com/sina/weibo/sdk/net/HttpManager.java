package com.sina.weibo.sdk.net;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.sina.weibo.sdk.exception.WeiboException;
import com.sina.weibo.sdk.exception.WeiboHttpException;
import com.sina.weibo.sdk.utils.LogUtil;
import com.sina.weibo.sdk.utils.NetworkHelper;
import com.sina.weibo.sdk.utils.Utility;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;

public class HttpManager {
    private static final String BOUNDARY = getBoundry();
    private static final String END_MP_BOUNDARY = ("--" + BOUNDARY + "--");
    private static final String MP_BOUNDARY = ("--" + BOUNDARY);
    private static SSLSocketFactory sSSLSocketFactory;

    private static native String calcOauthSignNative(Context context, String str, String str2);

    HttpManager() {
    }

    private static String getTimestamp() {
        return String.valueOf(System.currentTimeMillis() / 1000);
    }

    static {
        System.loadLibrary("weibosdkcore");
    }

    private static String getBoundry() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i < 12; i++) {
            long currentTimeMillis = System.currentTimeMillis() + ((long) i);
            long j = currentTimeMillis % 3;
            if (j == 0) {
                stringBuffer.append(((char) ((int) currentTimeMillis)) % 9);
            } else if (j == 1) {
                stringBuffer.append((char) ((int) ((currentTimeMillis % 26) + 65)));
            } else {
                stringBuffer.append((char) ((int) ((currentTimeMillis % 26) + 97)));
            }
        }
        return stringBuffer.toString();
    }

    private static HttpClient getNewHttpClient() {
        try {
            BasicHttpParams basicHttpParams = new BasicHttpParams();
            HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
            HttpProtocolParams.setContentCharset(basicHttpParams, "UTF-8");
            SchemeRegistry schemeRegistry = new SchemeRegistry();
            schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
            schemeRegistry.register(new Scheme("https", getSSLSocketFactory(), 443));
            ThreadSafeClientConnManager threadSafeClientConnManager = new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry);
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 25000);
            HttpConnectionParams.setSoTimeout(basicHttpParams, 20000);
            return new DefaultHttpClient(threadSafeClientConnManager, basicHttpParams);
        } catch (Exception unused) {
            return new DefaultHttpClient();
        }
    }

    private static SSLSocketFactory getSSLSocketFactory() {
        if (sSSLSocketFactory == null) {
            try {
                KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
                instance.load(null, null);
                Certificate certificate = getCertificate("cacert_cn.cer");
                Certificate certificate2 = getCertificate("cacert_com.cer");
                instance.setCertificateEntry("cnca", certificate);
                instance.setCertificateEntry("comca", certificate2);
                sSSLSocketFactory = new SSLSocketFactory(instance);
                LogUtil.d("HttpManager", "getSSLSocketFactory noraml !!!!!");
            } catch (Exception unused) {
                sSSLSocketFactory = SSLSocketFactory.getSocketFactory();
                LogUtil.d("HttpManager", "getSSLSocketFactory error default !!!!!");
            }
        }
        return sSSLSocketFactory;
    }

    private static void shutdownHttpClient(HttpClient httpClient) {
        if (httpClient != null) {
            try {
                httpClient.getConnectionManager().closeExpiredConnections();
            } catch (Exception unused) {
            }
        }
    }

    private static Certificate getCertificate(String str) throws CertificateException, IOException {
        CertificateFactory instance = CertificateFactory.getInstance("X.509");
        InputStream resourceAsStream = HttpManager.class.getResourceAsStream(str);
        try {
            return instance.generateCertificate(resourceAsStream);
        } finally {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:35|(2:41|42)|43|44|45) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x005b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0078 */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0075 A[SYNTHETIC, Splitter:B:41:0x0075] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String readRsponse(org.apache.http.HttpResponse r5) throws com.sina.weibo.sdk.exception.WeiboException {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            org.apache.http.HttpEntity r1 = r5.getEntity()
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            java.io.InputStream r1 = r1.getContent()     // Catch:{ IOException -> 0x006c }
            java.lang.String r0 = "Content-Encoding"
            org.apache.http.Header r5 = r5.getFirstHeader(r0)     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            if (r5 == 0) goto L_0x0030
            java.lang.String r5 = r5.getValue()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.lang.String r0 = "gzip"
            int r5 = r5.indexOf(r0)     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            if (r5 < 0) goto L_0x0030
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            r5.<init>(r1)     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            r0 = r5
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            r5 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x006c }
        L_0x0035:
            int r1 = r0.read(r5)     // Catch:{ IOException -> 0x006c }
            r3 = -1
            if (r1 != r3) goto L_0x005f
            java.lang.String r5 = new java.lang.String     // Catch:{ IOException -> 0x006c }
            byte[] r1 = r2.toByteArray()     // Catch:{ IOException -> 0x006c }
            java.lang.String r3 = "UTF-8"
            r5.<init>(r1, r3)     // Catch:{ IOException -> 0x006c }
            java.lang.String r1 = "HttpManager"
            java.lang.String r3 = "readRsponse result : "
            java.lang.String r4 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x006c }
            java.lang.String r3 = r3.concat(r4)     // Catch:{ IOException -> 0x006c }
            com.sina.weibo.sdk.utils.LogUtil.d(r1, r3)     // Catch:{ IOException -> 0x006c }
            if (r0 == 0) goto L_0x005b
            r0.close()     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            r2.close()     // Catch:{ IOException -> 0x005e }
        L_0x005e:
            return r5
        L_0x005f:
            r3 = 0
            r2.write(r5, r3, r1)     // Catch:{ IOException -> 0x006c }
            goto L_0x0035
        L_0x0064:
            r5 = move-exception
            r0 = r1
            goto L_0x0073
        L_0x0067:
            r5 = move-exception
            r0 = r1
            goto L_0x006d
        L_0x006a:
            r5 = move-exception
            goto L_0x0073
        L_0x006c:
            r5 = move-exception
        L_0x006d:
            com.sina.weibo.sdk.exception.WeiboException r1 = new com.sina.weibo.sdk.exception.WeiboException     // Catch:{ all -> 0x006a }
            r1.<init>((java.lang.Throwable) r5)     // Catch:{ all -> 0x006a }
            throw r1     // Catch:{ all -> 0x006a }
        L_0x0073:
            if (r0 == 0) goto L_0x0078
            r0.close()     // Catch:{ IOException -> 0x0078 }
        L_0x0078:
            r2.close()     // Catch:{ IOException -> 0x007b }
        L_0x007b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.net.HttpManager.readRsponse(org.apache.http.HttpResponse):java.lang.String");
    }

    private static void setHttpCommonParam(Context context, WeiboParameters weiboParameters) {
        String str = "";
        if (!TextUtils.isEmpty(weiboParameters.getAppKey())) {
            str = Utility.getAid(context, weiboParameters.getAppKey());
            if (!TextUtils.isEmpty(str)) {
                weiboParameters.put("aid", str);
            }
        }
        String timestamp = getTimestamp();
        weiboParameters.put("oauth_timestamp", timestamp);
        String str2 = "";
        Object obj = weiboParameters.get("access_token");
        Object obj2 = weiboParameters.get("refresh_token");
        if (obj != null && (obj instanceof String)) {
            str2 = (String) obj;
        } else if (obj2 != null && (obj2 instanceof String)) {
            str2 = (String) obj2;
        }
        weiboParameters.put("oauth_sign", getOauthSign(context, str, str2, weiboParameters.getAppKey(), timestamp));
    }

    private static void buildParams(OutputStream outputStream, WeiboParameters weiboParameters) throws WeiboException {
        try {
            Set<String> keySet = weiboParameters.keySet();
            for (String next : keySet) {
                if (weiboParameters.get(next) instanceof String) {
                    StringBuilder sb = new StringBuilder(100);
                    sb.setLength(0);
                    sb.append(MP_BOUNDARY);
                    sb.append("\r\n");
                    sb.append("content-disposition: form-data; name=\"");
                    sb.append(next);
                    sb.append("\"\r\n\r\n");
                    sb.append(weiboParameters.get(next));
                    sb.append("\r\n");
                    outputStream.write(sb.toString().getBytes());
                }
            }
            for (String next2 : keySet) {
                Object obj = weiboParameters.get(next2);
                if (obj instanceof Bitmap) {
                    outputStream.write((MP_BOUNDARY + "\r\n" + "content-disposition: form-data; name=\"" + next2 + "\"; filename=\"file\"\r\n" + "Content-Type: application/octet-stream; charset=utf-8\r\n\r\n").getBytes());
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    outputStream.write(byteArrayOutputStream.toByteArray());
                    outputStream.write("\r\n".getBytes());
                } else if (obj instanceof ByteArrayOutputStream) {
                    outputStream.write((MP_BOUNDARY + "\r\n" + "content-disposition: form-data; name=\"" + next2 + "\"; filename=\"file\"\r\n" + "Content-Type: application/octet-stream; charset=utf-8\r\n\r\n").getBytes());
                    ByteArrayOutputStream byteArrayOutputStream2 = (ByteArrayOutputStream) obj;
                    outputStream.write(byteArrayOutputStream2.toByteArray());
                    outputStream.write("\r\n".getBytes());
                    byteArrayOutputStream2.close();
                }
            }
            outputStream.write(("\r\n" + END_MP_BOUNDARY).getBytes());
        } catch (IOException e2) {
            throw new WeiboException((Throwable) e2);
        }
    }

    public static String openUrl(Context context, String str, String str2, WeiboParameters weiboParameters) throws WeiboException {
        String readRsponse = readRsponse(requestHttpExecute(context, str, str2, weiboParameters));
        LogUtil.d("HttpManager", "Response : ".concat(String.valueOf(readRsponse)));
        return readRsponse;
    }

    public static String openRedirectUrl4LocationUri(Context context, String str, String str2, WeiboParameters weiboParameters) {
        HttpGet httpGet = null;
        try {
            AnonymousClass2 r1 = new CustomRedirectHandler() {
                public void onReceivedException() {
                }

                public boolean shouldRedirectUrl(String str) {
                    return true;
                }
            };
            HttpGet httpGet2 = (DefaultHttpClient) getNewHttpClient();
            try {
                httpGet2.setRedirectHandler(r1);
                setHttpCommonParam(context, weiboParameters);
                httpGet2.getParams().setParameter("http.route.default-proxy", NetStateManager.getAPN());
                if (str2.equals("GET")) {
                    httpGet = new HttpGet(String.valueOf(str) + "?" + weiboParameters.encodeUrl());
                } else if (str2.equals("POST")) {
                    httpGet = new HttpPost(str);
                }
                httpGet.setHeader("User-Agent", NetworkHelper.generateUA(context));
                httpGet2.execute(httpGet);
                String redirectUrl = r1.getRedirectUrl();
                shutdownHttpClient(httpGet2);
                return redirectUrl;
            } catch (IOException e2) {
                e = e2;
                httpGet = httpGet2;
                try {
                    throw new WeiboException((Throwable) e);
                } catch (Throwable th) {
                    th = th;
                    httpGet2 = httpGet;
                    shutdownHttpClient(httpGet2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                shutdownHttpClient(httpGet2);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            throw new WeiboException((Throwable) e);
        }
    }

    public static String openUrl4RdirectURL(Context context, String str, String str2, WeiboParameters weiboParameters) throws WeiboException {
        HttpGet httpGet = null;
        try {
            HttpGet httpGet2 = (DefaultHttpClient) getNewHttpClient();
            try {
                httpGet2.setRedirectHandler(new RedirectHandler() {
                    public URI getLocationURI(HttpResponse httpResponse, HttpContext httpContext) throws ProtocolException {
                        LogUtil.d("HttpManager", "openUrl4RdirectURL getLocationURI method");
                        return null;
                    }

                    public boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
                        LogUtil.d("HttpManager", "openUrl4RdirectURL isRedirectRequested method");
                        return false;
                    }
                });
                setHttpCommonParam(context, weiboParameters);
                httpGet2.getParams().setParameter("http.route.default-proxy", NetStateManager.getAPN());
                if (str2.equals("GET")) {
                    String str3 = String.valueOf(str) + "?" + weiboParameters.encodeUrl();
                    LogUtil.d("HttpManager", "openUrl4RdirectURL GET url : ".concat(String.valueOf(str3)));
                    httpGet = new HttpGet(str3);
                } else if (str2.equals("POST")) {
                    httpGet = new HttpPost(str);
                    LogUtil.d("HttpManager", "openUrl4RdirectURL POST url : ".concat(String.valueOf(str)));
                }
                HttpResponse execute = httpGet2.execute(httpGet);
                int statusCode = execute.getStatusLine().getStatusCode();
                if (statusCode != 301) {
                    if (statusCode != 302) {
                        if (statusCode == 200) {
                            String readRsponse = readRsponse(execute);
                            shutdownHttpClient(httpGet2);
                            return readRsponse;
                        }
                        throw new WeiboHttpException(readRsponse(execute), statusCode);
                    }
                }
                String value = execute.getFirstHeader("Location").getValue();
                LogUtil.d("HttpManager", "RedirectURL = ".concat(String.valueOf(value)));
                shutdownHttpClient(httpGet2);
                return value;
            } catch (IOException e2) {
                e = e2;
                httpGet = httpGet2;
                try {
                    throw new WeiboException((Throwable) e);
                } catch (Throwable th) {
                    th = th;
                    httpGet2 = httpGet;
                    shutdownHttpClient(httpGet2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                shutdownHttpClient(httpGet2);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            throw new WeiboException((Throwable) e);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:70|71|(3:73|74|64)) */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0109, code lost:
        r3.close();
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0111, code lost:
        if (r10 == 0) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0119, code lost:
        if (r2.length() >= r10) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011c, code lost:
        r2.renameTo(r1);
        r13 = r1.getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0123, code lost:
        if (r0 == null) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r0.getConnectionManager().closeExpiredConnections();
        r0.getConnectionManager().closeIdleConnections(300, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0136, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r2.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013a, code lost:
        if (r0 == null) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r0.getConnectionManager().closeExpiredConnections();
        r13 = r0.getConnectionManager();
        r0 = java.util.concurrent.TimeUnit.SECONDS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0149, code lost:
        r13.closeIdleConnections(300, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015b, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r2.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0160, code lost:
        if (r0 != null) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r0.getConnectionManager().closeExpiredConnections();
        r13 = r0.getConnectionManager();
        r0 = java.util.concurrent.TimeUnit.SECONDS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0174, code lost:
        if (r0 != null) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r0.getConnectionManager().closeExpiredConnections();
        r0.getConnectionManager().closeIdleConnections(300, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0186, code lost:
        throw r13;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x015d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String downloadFile(android.content.Context r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) throws com.sina.weibo.sdk.exception.WeiboException {
        /*
            java.lang.Class<com.sina.weibo.sdk.net.HttpManager> r12 = com.sina.weibo.sdk.net.HttpManager.class
            monitor-enter(r12)
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0187 }
            r0.<init>(r14)     // Catch:{ all -> 0x0187 }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x0187 }
            if (r1 != 0) goto L_0x0011
            r0.mkdirs()     // Catch:{ all -> 0x0187 }
        L_0x0011:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0187 }
            r1.<init>(r0, r15)     // Catch:{ all -> 0x0187 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0187 }
            if (r0 == 0) goto L_0x0022
            java.lang.String r13 = r1.getPath()     // Catch:{ all -> 0x0187 }
            monitor-exit(r12)
            return r13
        L_0x0022:
            boolean r0 = android.webkit.URLUtil.isValidUrl(r13)     // Catch:{ all -> 0x0187 }
            if (r0 != 0) goto L_0x002c
            java.lang.String r13 = ""
            monitor-exit(r12)
            return r13
        L_0x002c:
            org.apache.http.client.HttpClient r0 = getNewHttpClient()     // Catch:{ all -> 0x0187 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0187 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x0187 }
            r3.<init>(r15)     // Catch:{ all -> 0x0187 }
            java.lang.String r15 = "_temp"
            r3.append(r15)     // Catch:{ all -> 0x0187 }
            java.lang.String r15 = r3.toString()     // Catch:{ all -> 0x0187 }
            r2.<init>(r14, r15)     // Catch:{ all -> 0x0187 }
            r14 = 300(0x12c, double:1.48E-321)
            boolean r3 = r2.exists()     // Catch:{ IOException -> 0x015d }
            r4 = 0
            if (r3 == 0) goto L_0x0056
            long r6 = r2.length()     // Catch:{ IOException -> 0x015d }
            goto L_0x005a
        L_0x0056:
            r2.createNewFile()     // Catch:{ IOException -> 0x015d }
            r6 = r4
        L_0x005a:
            org.apache.http.client.methods.HttpGet r3 = new org.apache.http.client.methods.HttpGet     // Catch:{ IOException -> 0x015d }
            r3.<init>(r13)     // Catch:{ IOException -> 0x015d }
            java.lang.String r13 = "RANGE"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x015d }
            java.lang.String r9 = "bytes="
            r8.<init>(r9)     // Catch:{ IOException -> 0x015d }
            r8.append(r6)     // Catch:{ IOException -> 0x015d }
            java.lang.String r9 = "-"
            r8.append(r9)     // Catch:{ IOException -> 0x015d }
            java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x015d }
            r3.setHeader(r13, r8)     // Catch:{ IOException -> 0x015d }
            org.apache.http.HttpResponse r13 = r0.execute(r3)     // Catch:{ IOException -> 0x015d }
            org.apache.http.StatusLine r3 = r13.getStatusLine()     // Catch:{ IOException -> 0x015d }
            int r3 = r3.getStatusCode()     // Catch:{ IOException -> 0x015d }
            r8 = 206(0xce, float:2.89E-43)
            r9 = 0
            if (r3 != r8) goto L_0x00ac
            java.lang.String r3 = "Content-Range"
            org.apache.http.Header[] r3 = r13.getHeaders(r3)     // Catch:{ IOException -> 0x015d }
            if (r3 == 0) goto L_0x00aa
            int r8 = r3.length     // Catch:{ IOException -> 0x015d }
            if (r8 == 0) goto L_0x00aa
            r3 = r3[r9]     // Catch:{ IOException -> 0x015d }
            java.lang.String r3 = r3.getValue()     // Catch:{ IOException -> 0x015d }
            r8 = 47
            int r8 = r3.indexOf(r8)     // Catch:{ IOException -> 0x015d }
            int r8 = r8 + 1
            java.lang.String r3 = r3.substring(r8)     // Catch:{ IOException -> 0x015d }
            long r10 = java.lang.Long.parseLong(r3)     // Catch:{ IOException -> 0x015d }
            goto L_0x00ca
        L_0x00aa:
            r10 = r4
            goto L_0x00ca
        L_0x00ac:
            r6 = 200(0xc8, float:2.8E-43)
            if (r3 != r6) goto L_0x0151
            java.lang.String r3 = "Content-Length"
            org.apache.http.Header r3 = r13.getFirstHeader(r3)     // Catch:{ IOException -> 0x015d }
            if (r3 == 0) goto L_0x00c8
            java.lang.String r3 = r3.getValue()     // Catch:{ IOException -> 0x015d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x015d }
            int r3 = r3.intValue()     // Catch:{ IOException -> 0x015d }
            long r6 = (long) r3     // Catch:{ IOException -> 0x015d }
            r10 = r6
            r6 = r4
            goto L_0x00ca
        L_0x00c8:
            r6 = r4
            r10 = r6
        L_0x00ca:
            org.apache.http.HttpEntity r3 = r13.getEntity()     // Catch:{ IOException -> 0x015d }
            java.lang.String r8 = "Content-Encoding"
            org.apache.http.Header r13 = r13.getFirstHeader(r8)     // Catch:{ IOException -> 0x015d }
            if (r13 == 0) goto L_0x00f0
            java.lang.String r13 = r13.getValue()     // Catch:{ IOException -> 0x015d }
            java.lang.String r13 = r13.toLowerCase()     // Catch:{ IOException -> 0x015d }
            java.lang.String r8 = "gzip"
            int r13 = r13.indexOf(r8)     // Catch:{ IOException -> 0x015d }
            if (r13 < 0) goto L_0x00f0
            java.util.zip.GZIPInputStream r13 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x015d }
            java.io.InputStream r3 = r3.getContent()     // Catch:{ IOException -> 0x015d }
            r13.<init>(r3)     // Catch:{ IOException -> 0x015d }
            goto L_0x00f4
        L_0x00f0:
            java.io.InputStream r13 = r3.getContent()     // Catch:{ IOException -> 0x015d }
        L_0x00f4:
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x015d }
            java.lang.String r8 = "rw"
            r3.<init>(r2, r8)     // Catch:{ IOException -> 0x015d }
            r3.seek(r6)     // Catch:{ IOException -> 0x015d }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ IOException -> 0x015d }
        L_0x0102:
            int r7 = r13.read(r6)     // Catch:{ IOException -> 0x015d }
            r8 = -1
            if (r7 != r8) goto L_0x014d
            r3.close()     // Catch:{ IOException -> 0x015d }
            r13.close()     // Catch:{ IOException -> 0x015d }
            int r13 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x0137
            long r3 = r2.length()     // Catch:{ IOException -> 0x015d }
            int r13 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x011c
            goto L_0x0137
        L_0x011c:
            r2.renameTo(r1)     // Catch:{ IOException -> 0x015d }
            java.lang.String r13 = r1.getPath()     // Catch:{ IOException -> 0x015d }
            if (r0 == 0) goto L_0x0135
            org.apache.http.conn.ClientConnectionManager r1 = r0.getConnectionManager()     // Catch:{ all -> 0x0187 }
            r1.closeExpiredConnections()     // Catch:{ all -> 0x0187 }
            org.apache.http.conn.ClientConnectionManager r0 = r0.getConnectionManager()     // Catch:{ all -> 0x0187 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0187 }
            r0.closeIdleConnections(r14, r1)     // Catch:{ all -> 0x0187 }
        L_0x0135:
            monitor-exit(r12)
            return r13
        L_0x0137:
            r2.delete()     // Catch:{ IOException -> 0x015d }
            if (r0 == 0) goto L_0x0170
            org.apache.http.conn.ClientConnectionManager r13 = r0.getConnectionManager()     // Catch:{ all -> 0x0187 }
            r13.closeExpiredConnections()     // Catch:{ all -> 0x0187 }
            org.apache.http.conn.ClientConnectionManager r13 = r0.getConnectionManager()     // Catch:{ all -> 0x0187 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0187 }
        L_0x0149:
            r13.closeIdleConnections(r14, r0)     // Catch:{ all -> 0x0187 }
            goto L_0x0170
        L_0x014d:
            r3.write(r6, r9, r7)     // Catch:{ IOException -> 0x015d }
            goto L_0x0102
        L_0x0151:
            java.lang.String r13 = readRsponse(r13)     // Catch:{ IOException -> 0x015d }
            com.sina.weibo.sdk.exception.WeiboHttpException r1 = new com.sina.weibo.sdk.exception.WeiboHttpException     // Catch:{ IOException -> 0x015d }
            r1.<init>(r13, r3)     // Catch:{ IOException -> 0x015d }
            throw r1     // Catch:{ IOException -> 0x015d }
        L_0x015b:
            r13 = move-exception
            goto L_0x0174
        L_0x015d:
            r2.delete()     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x0170
            org.apache.http.conn.ClientConnectionManager r13 = r0.getConnectionManager()     // Catch:{ all -> 0x0187 }
            r13.closeExpiredConnections()     // Catch:{ all -> 0x0187 }
            org.apache.http.conn.ClientConnectionManager r13 = r0.getConnectionManager()     // Catch:{ all -> 0x0187 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0187 }
            goto L_0x0149
        L_0x0170:
            java.lang.String r13 = ""
            monitor-exit(r12)
            return r13
        L_0x0174:
            if (r0 == 0) goto L_0x0186
            org.apache.http.conn.ClientConnectionManager r1 = r0.getConnectionManager()     // Catch:{ all -> 0x0187 }
            r1.closeExpiredConnections()     // Catch:{ all -> 0x0187 }
            org.apache.http.conn.ClientConnectionManager r0 = r0.getConnectionManager()     // Catch:{ all -> 0x0187 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0187 }
            r0.closeIdleConnections(r14, r1)     // Catch:{ all -> 0x0187 }
        L_0x0186:
            throw r13     // Catch:{ all -> 0x0187 }
        L_0x0187:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.net.HttpManager.downloadFile(android.content.Context, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0123 A[SYNTHETIC, Splitter:B:58:0x0123] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.apache.http.HttpResponse requestHttpExecute(android.content.Context r5, java.lang.String r6, java.lang.String r7, com.sina.weibo.sdk.net.WeiboParameters r8) {
        /*
            r0 = 0
            org.apache.http.client.HttpClient r1 = getNewHttpClient()     // Catch:{ IOException -> 0x0116, all -> 0x0113 }
            org.apache.http.params.HttpParams r2 = r1.getParams()     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            java.lang.String r3 = "http.route.default-proxy"
            org.apache.http.HttpHost r4 = com.sina.weibo.sdk.net.NetStateManager.getAPN()     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            r2.setParameter(r3, r4)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            setHttpCommonParam(r5, r8)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            java.lang.String r5 = "GET"
            boolean r5 = r7.equals(r5)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            if (r5 == 0) goto L_0x004d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            r5.<init>(r6)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            java.lang.String r6 = "?"
            r5.append(r6)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            java.lang.String r6 = r8.encodeUrl()     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            r5.append(r6)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            org.apache.http.client.methods.HttpGet r6 = new org.apache.http.client.methods.HttpGet     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            r6.<init>(r5)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            java.lang.String r7 = "HttpManager"
            java.lang.String r8 = "requestHttpExecute GET Url : "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            java.lang.String r5 = r8.concat(r5)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            com.sina.weibo.sdk.utils.LogUtil.d(r7, r5)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            r5 = r6
            goto L_0x00ea
        L_0x004d:
            java.lang.String r5 = "POST"
            boolean r5 = r7.equals(r5)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            if (r5 == 0) goto L_0x00db
            java.lang.String r5 = "HttpManager"
            java.lang.String r7 = "requestHttpExecute POST Url : "
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            java.lang.String r7 = r7.concat(r2)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            com.sina.weibo.sdk.utils.LogUtil.d(r5, r7)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            org.apache.http.client.methods.HttpPost r5 = new org.apache.http.client.methods.HttpPost     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            r5.<init>(r6)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            r6.<init>()     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            boolean r7 = r8.hasBinaryData()     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            if (r7 == 0) goto L_0x008d
            java.lang.String r7 = "Content-Type"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            java.lang.String r2 = "multipart/form-data; boundary="
            r0.<init>(r2)     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            java.lang.String r2 = BOUNDARY     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            r0.append(r2)     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            r5.setHeader(r7, r0)     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            buildParams(r6, r8)     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            goto L_0x00c9
        L_0x008d:
            java.lang.String r7 = "content-type"
            java.lang.Object r7 = r8.get(r7)     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            if (r7 == 0) goto L_0x00a6
            boolean r0 = r7 instanceof java.lang.String     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = "content-type"
            r8.remove(r0)     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            java.lang.String r0 = "Content-Type"
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            r5.setHeader(r0, r7)     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            goto L_0x00ad
        L_0x00a6:
            java.lang.String r7 = "Content-Type"
            java.lang.String r0 = "application/x-www-form-urlencoded"
            r5.setHeader(r7, r0)     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
        L_0x00ad:
            java.lang.String r7 = r8.encodeUrl()     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            java.lang.String r8 = "HttpManager"
            java.lang.String r0 = "requestHttpExecute POST postParam : "
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            java.lang.String r0 = r0.concat(r2)     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            com.sina.weibo.sdk.utils.LogUtil.d(r8, r0)     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            java.lang.String r8 = "UTF-8"
            byte[] r7 = r7.getBytes(r8)     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            r6.write(r7)     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
        L_0x00c9:
            org.apache.http.entity.ByteArrayEntity r7 = new org.apache.http.entity.ByteArrayEntity     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            byte[] r8 = r6.toByteArray()     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            r5.setEntity(r7)     // Catch:{ IOException -> 0x00d9, all -> 0x00d7 }
            r0 = r6
            goto L_0x00ea
        L_0x00d7:
            r5 = move-exception
            goto L_0x0120
        L_0x00d9:
            r5 = move-exception
            goto L_0x0111
        L_0x00db:
            java.lang.String r5 = "DELETE"
            boolean r5 = r7.equals(r5)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            if (r5 == 0) goto L_0x00e9
            org.apache.http.client.methods.HttpDelete r5 = new org.apache.http.client.methods.HttpDelete     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            r5.<init>(r6)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            goto L_0x00ea
        L_0x00e9:
            r5 = r0
        L_0x00ea:
            org.apache.http.HttpResponse r5 = r1.execute(r5)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            org.apache.http.StatusLine r6 = r5.getStatusLine()     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            int r6 = r6.getStatusCode()     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            r7 = 200(0xc8, float:2.8E-43)
            if (r6 != r7) goto L_0x0103
            if (r0 == 0) goto L_0x00ff
            r0.close()     // Catch:{ IOException -> 0x00ff }
        L_0x00ff:
            shutdownHttpClient(r1)
            return r5
        L_0x0103:
            java.lang.String r5 = readRsponse(r5)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            com.sina.weibo.sdk.exception.WeiboHttpException r7 = new com.sina.weibo.sdk.exception.WeiboHttpException     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            r7.<init>(r5, r6)     // Catch:{ IOException -> 0x010f, all -> 0x010d }
            throw r7     // Catch:{ IOException -> 0x010f, all -> 0x010d }
        L_0x010d:
            r5 = move-exception
            goto L_0x0121
        L_0x010f:
            r5 = move-exception
            r6 = r0
        L_0x0111:
            r0 = r1
            goto L_0x0118
        L_0x0113:
            r5 = move-exception
            r1 = r0
            goto L_0x0121
        L_0x0116:
            r5 = move-exception
            r6 = r0
        L_0x0118:
            com.sina.weibo.sdk.exception.WeiboException r7 = new com.sina.weibo.sdk.exception.WeiboException     // Catch:{ all -> 0x011e }
            r7.<init>((java.lang.Throwable) r5)     // Catch:{ all -> 0x011e }
            throw r7     // Catch:{ all -> 0x011e }
        L_0x011e:
            r5 = move-exception
            r1 = r0
        L_0x0120:
            r0 = r6
        L_0x0121:
            if (r0 == 0) goto L_0x0126
            r0.close()     // Catch:{ IOException -> 0x0126 }
        L_0x0126:
            shutdownHttpClient(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.net.HttpManager.requestHttpExecute(android.content.Context, java.lang.String, java.lang.String, com.sina.weibo.sdk.net.WeiboParameters):org.apache.http.HttpResponse");
    }

    private static String getOauthSign(Context context, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder("");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(str3);
        }
        return calcOauthSignNative(context, sb.toString(), str4);
    }
}
