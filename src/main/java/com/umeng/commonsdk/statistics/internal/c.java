package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.b;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

public class c {

    /* renamed from: e  reason: collision with root package name */
    private static boolean f80987e;

    /* renamed from: a  reason: collision with root package name */
    private String f80988a = "10.0.0.172";

    /* renamed from: b  reason: collision with root package name */
    private int f80989b = 80;

    /* renamed from: c  reason: collision with root package name */
    private Context f80990c;

    /* renamed from: d  reason: collision with root package name */
    private b f80991d;

    private void a() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f80990c, "domain_p", "");
        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f80990c, "domain_s", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            UMServerURL.DEFAULT_URL = DataHelper.assembleURL(imprintProperty);
        }
        if (!TextUtils.isEmpty(imprintProperty2)) {
            UMServerURL.SECONDARY_URL = DataHelper.assembleURL(imprintProperty2);
        }
        AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
    }

    private boolean c() {
        if (this.f80990c.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f80990c.getPackageName()) != 0) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f80990c.getSystemService("connectivity");
            if (!DeviceConfig.checkPermission(this.f80990c, "android.permission.ACCESS_NETWORK_STATE") || connectivityManager == null) {
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (!(activeNetworkInfo == null || activeNetworkInfo.getType() == 1)) {
                String extraInfo = activeNetworkInfo.getExtraInfo();
                if (extraInfo == null || (!extraInfo.equals("cmwap") && !extraInfo.equals("3gwap") && !extraInfo.equals("uniwap"))) {
                    return false;
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f80990c, th);
        }
    }

    private void b() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f80990c, "domain_p", "");
        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f80990c, "domain_s", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            UMServerURL.DEFAULT_URL = DataHelper.assembleURL(imprintProperty);
        }
        if (!TextUtils.isEmpty(imprintProperty2)) {
            UMServerURL.SECONDARY_URL = DataHelper.assembleURL(imprintProperty2);
        }
        String imprintProperty3 = UMEnvelopeBuild.imprintProperty(this.f80990c, "oversea_domain_p", "");
        String imprintProperty4 = UMEnvelopeBuild.imprintProperty(this.f80990c, "oversea_domain_s", "");
        if (!TextUtils.isEmpty(imprintProperty3)) {
            UMServerURL.OVERSEA_DEFAULT_URL = DataHelper.assembleURL(imprintProperty3);
        }
        if (!TextUtils.isEmpty(imprintProperty4)) {
            UMServerURL.OVERSEA_SECONDARY_URL = DataHelper.assembleURL(imprintProperty4);
        }
        AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.OVERSEA_DEFAULT_URL, UMServerURL.OVERSEA_SECONDARY_URL};
        if (TextUtils.isEmpty(b.f80921b)) {
            return;
        }
        if (b.f80921b.startsWith("460") || b.f80921b.startsWith("461")) {
            AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
        }
    }

    public void a(b bVar) {
        this.f80991d = bVar;
    }

    public c(Context context) {
        this.f80990c = context;
    }

    public byte[] a(byte[] bArr, boolean z) {
        if (SdkVersion.SDK_TYPE == 0) {
            a();
        } else {
            UMServerURL.DEFAULT_URL = UMServerURL.OVERSEA_DEFAULT_URL;
            UMServerURL.SECONDARY_URL = UMServerURL.OVERSEA_SECONDARY_URL;
            b();
        }
        int i = 0;
        byte[] bArr2 = null;
        while (true) {
            if (i >= AnalyticsConstants.APPLOG_URL_LIST.length) {
                break;
            }
            bArr2 = b(bArr, AnalyticsConstants.APPLOG_URL_LIST[i]);
            if (bArr2 == null) {
                if (this.f80991d != null) {
                    this.f80991d.onRequestFailed();
                }
                i++;
            } else if (this.f80991d != null) {
                this.f80991d.onRequestSucceed(z);
            }
        }
        return bArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] a(byte[] r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 0
            com.umeng.commonsdk.statistics.internal.b r1 = r6.f80991d     // Catch:{ Throwable -> 0x011c, all -> 0x0119 }
            if (r1 == 0) goto L_0x000a
            com.umeng.commonsdk.statistics.internal.b r1 = r6.f80991d     // Catch:{ Throwable -> 0x011c, all -> 0x0119 }
            r1.onRequestStart()     // Catch:{ Throwable -> 0x011c, all -> 0x0119 }
        L_0x000a:
            boolean r1 = r6.c()     // Catch:{ Throwable -> 0x011c, all -> 0x0119 }
            if (r1 == 0) goto L_0x002c
            java.net.Proxy r1 = new java.net.Proxy     // Catch:{ Throwable -> 0x011c, all -> 0x0119 }
            java.net.Proxy$Type r2 = java.net.Proxy.Type.HTTP     // Catch:{ Throwable -> 0x011c, all -> 0x0119 }
            java.net.InetSocketAddress r3 = new java.net.InetSocketAddress     // Catch:{ Throwable -> 0x011c, all -> 0x0119 }
            java.lang.String r4 = r6.f80988a     // Catch:{ Throwable -> 0x011c, all -> 0x0119 }
            int r5 = r6.f80989b     // Catch:{ Throwable -> 0x011c, all -> 0x0119 }
            r3.<init>(r4, r5)     // Catch:{ Throwable -> 0x011c, all -> 0x0119 }
            r1.<init>(r2, r3)     // Catch:{ Throwable -> 0x011c, all -> 0x0119 }
            java.net.URL r2 = new java.net.URL     // Catch:{ Throwable -> 0x011c, all -> 0x0119 }
            r2.<init>(r8)     // Catch:{ Throwable -> 0x011c, all -> 0x0119 }
            java.net.URLConnection r1 = r2.openConnection(r1)     // Catch:{ Throwable -> 0x011c, all -> 0x0119 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Throwable -> 0x011c, all -> 0x0119 }
            goto L_0x0037
        L_0x002c:
            java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x011c, all -> 0x0119 }
            r1.<init>(r8)     // Catch:{ Throwable -> 0x011c, all -> 0x0119 }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Throwable -> 0x011c, all -> 0x0119 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Throwable -> 0x011c, all -> 0x0119 }
        L_0x0037:
            java.lang.String r2 = "X-Umeng-UTC"
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0117 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x0117 }
            r1.setRequestProperty(r2, r3)     // Catch:{ Throwable -> 0x0117 }
            java.lang.String r2 = "X-Umeng-Sdk"
            android.content.Context r3 = r6.f80990c     // Catch:{ Throwable -> 0x0117 }
            com.umeng.commonsdk.statistics.internal.a r3 = com.umeng.commonsdk.statistics.internal.a.a((android.content.Context) r3)     // Catch:{ Throwable -> 0x0117 }
            java.lang.String r3 = r3.b()     // Catch:{ Throwable -> 0x0117 }
            r1.setRequestProperty(r2, r3)     // Catch:{ Throwable -> 0x0117 }
            java.lang.String r2 = "Msg-Type"
            java.lang.String r3 = "envelope/json"
            r1.setRequestProperty(r2, r3)     // Catch:{ Throwable -> 0x0117 }
            java.lang.String r2 = "Content-Type"
            android.content.Context r3 = r6.f80990c     // Catch:{ Throwable -> 0x0117 }
            com.umeng.commonsdk.statistics.internal.a r3 = com.umeng.commonsdk.statistics.internal.a.a((android.content.Context) r3)     // Catch:{ Throwable -> 0x0117 }
            java.lang.String r3 = r3.a()     // Catch:{ Throwable -> 0x0117 }
            r1.setRequestProperty(r2, r3)     // Catch:{ Throwable -> 0x0117 }
            java.lang.String r2 = "X-Umeng-Pro-Ver"
            java.lang.String r3 = "1.0.0"
            r1.setRequestProperty(r2, r3)     // Catch:{ Throwable -> 0x0117 }
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setConnectTimeout(r2)     // Catch:{ Throwable -> 0x0117 }
            r2 = 30000(0x7530, float:4.2039E-41)
            r1.setReadTimeout(r2)     // Catch:{ Throwable -> 0x0117 }
            java.lang.String r2 = "POST"
            r1.setRequestMethod(r2)     // Catch:{ Throwable -> 0x0117 }
            r2 = 1
            r1.setDoOutput(r2)     // Catch:{ Throwable -> 0x0117 }
            r1.setDoInput(r2)     // Catch:{ Throwable -> 0x0117 }
            r3 = 0
            r1.setUseCaches(r3)     // Catch:{ Throwable -> 0x0117 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0117 }
            r5 = 8
            if (r4 >= r5) goto L_0x0097
            java.lang.String r4 = "http.keepAlive"
            java.lang.String r5 = "false"
            java.lang.System.setProperty(r4, r5)     // Catch:{ Throwable -> 0x0117 }
        L_0x0097:
            java.io.OutputStream r4 = r1.getOutputStream()     // Catch:{ Throwable -> 0x0117 }
            r4.write(r7)     // Catch:{ Throwable -> 0x0117 }
            r4.flush()     // Catch:{ Throwable -> 0x0117 }
            r4.close()     // Catch:{ Throwable -> 0x0117 }
            com.umeng.commonsdk.statistics.internal.b r7 = r6.f80991d     // Catch:{ Throwable -> 0x0117 }
            if (r7 == 0) goto L_0x00ad
            com.umeng.commonsdk.statistics.internal.b r7 = r6.f80991d     // Catch:{ Throwable -> 0x0117 }
            r7.onRequestEnd()     // Catch:{ Throwable -> 0x0117 }
        L_0x00ad:
            int r7 = r1.getResponseCode()     // Catch:{ Throwable -> 0x0117 }
            java.lang.String r4 = "Content-Type"
            java.lang.String r4 = r1.getHeaderField(r4)     // Catch:{ Throwable -> 0x0117 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x0117 }
            if (r5 != 0) goto L_0x00c6
            java.lang.String r5 = "application/thrift"
            boolean r4 = r4.equalsIgnoreCase(r5)     // Catch:{ Throwable -> 0x0117 }
            if (r4 == 0) goto L_0x00c6
            goto L_0x00c7
        L_0x00c6:
            r2 = 0
        L_0x00c7:
            boolean r3 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch:{ Throwable -> 0x0117 }
            if (r3 == 0) goto L_0x00e4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0117 }
            java.lang.String r4 = "status code : "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0117 }
            r3.append(r7)     // Catch:{ Throwable -> 0x0117 }
            java.lang.String r4 = "; isThrifit:"
            r3.append(r4)     // Catch:{ Throwable -> 0x0117 }
            r3.append(r2)     // Catch:{ Throwable -> 0x0117 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0117 }
            com.umeng.commonsdk.statistics.common.MLog.d((java.lang.String) r3)     // Catch:{ Throwable -> 0x0117 }
        L_0x00e4:
            r3 = 200(0xc8, float:2.8E-43)
            if (r7 != r3) goto L_0x0111
            if (r2 == 0) goto L_0x0111
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0117 }
            java.lang.String r2 = "Send message to "
            r7.<init>(r2)     // Catch:{ Throwable -> 0x0117 }
            r7.append(r8)     // Catch:{ Throwable -> 0x0117 }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x0117 }
            com.umeng.commonsdk.statistics.common.MLog.i((java.lang.String) r7)     // Catch:{ Throwable -> 0x0117 }
            java.io.InputStream r7 = r1.getInputStream()     // Catch:{ Throwable -> 0x0117 }
            byte[] r8 = com.umeng.commonsdk.statistics.common.HelperUtils.readStreamToByteArray(r7)     // Catch:{ all -> 0x010c }
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose((java.io.InputStream) r7)     // Catch:{ Throwable -> 0x0117 }
            if (r1 == 0) goto L_0x010b
            r1.disconnect()
        L_0x010b:
            return r8
        L_0x010c:
            r8 = move-exception
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose((java.io.InputStream) r7)     // Catch:{ Throwable -> 0x0117 }
            throw r8     // Catch:{ Throwable -> 0x0117 }
        L_0x0111:
            if (r1 == 0) goto L_0x0116
            r1.disconnect()
        L_0x0116:
            return r0
        L_0x0117:
            r7 = move-exception
            goto L_0x011e
        L_0x0119:
            r7 = move-exception
            r1 = r0
            goto L_0x012a
        L_0x011c:
            r7 = move-exception
            r1 = r0
        L_0x011e:
            java.lang.String r8 = "IOException,Failed to send message."
            com.umeng.commonsdk.statistics.common.MLog.e((java.lang.String) r8, (java.lang.Throwable) r7)     // Catch:{ all -> 0x0129 }
            if (r1 == 0) goto L_0x0128
            r1.disconnect()
        L_0x0128:
            return r0
        L_0x0129:
            r7 = move-exception
        L_0x012a:
            if (r1 == 0) goto L_0x012f
            r1.disconnect()
        L_0x012f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.internal.c.a(byte[], java.lang.String):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x01bf A[SYNTHETIC, Splitter:B:107:0x01bf] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01cb A[SYNTHETIC, Splitter:B:112:0x01cb] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01da A[SYNTHETIC, Splitter:B:120:0x01da] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01e6 A[SYNTHETIC, Splitter:B:125:0x01e6] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x017b A[SYNTHETIC, Splitter:B:73:0x017b] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0187 A[SYNTHETIC, Splitter:B:78:0x0187] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x019d A[SYNTHETIC, Splitter:B:90:0x019d] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01a9 A[SYNTHETIC, Splitter:B:95:0x01a9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] b(byte[] r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 2
            r1 = 0
            com.umeng.commonsdk.statistics.internal.b r2 = r8.f80991d     // Catch:{ SSLHandshakeException -> 0x01b4, UnknownHostException -> 0x0192, Throwable -> 0x0177, all -> 0x0174 }
            if (r2 == 0) goto L_0x000b
            com.umeng.commonsdk.statistics.internal.b r2 = r8.f80991d     // Catch:{ SSLHandshakeException -> 0x01b4, UnknownHostException -> 0x0192, Throwable -> 0x0177, all -> 0x0174 }
            r2.onRequestStart()     // Catch:{ SSLHandshakeException -> 0x01b4, UnknownHostException -> 0x0192, Throwable -> 0x0177, all -> 0x0174 }
        L_0x000b:
            boolean r2 = r8.c()     // Catch:{ SSLHandshakeException -> 0x01b4, UnknownHostException -> 0x0192, Throwable -> 0x0177, all -> 0x0174 }
            if (r2 == 0) goto L_0x002d
            java.net.Proxy r2 = new java.net.Proxy     // Catch:{ SSLHandshakeException -> 0x01b4, UnknownHostException -> 0x0192, Throwable -> 0x0177, all -> 0x0174 }
            java.net.Proxy$Type r3 = java.net.Proxy.Type.HTTP     // Catch:{ SSLHandshakeException -> 0x01b4, UnknownHostException -> 0x0192, Throwable -> 0x0177, all -> 0x0174 }
            java.net.InetSocketAddress r4 = new java.net.InetSocketAddress     // Catch:{ SSLHandshakeException -> 0x01b4, UnknownHostException -> 0x0192, Throwable -> 0x0177, all -> 0x0174 }
            java.lang.String r5 = r8.f80988a     // Catch:{ SSLHandshakeException -> 0x01b4, UnknownHostException -> 0x0192, Throwable -> 0x0177, all -> 0x0174 }
            int r6 = r8.f80989b     // Catch:{ SSLHandshakeException -> 0x01b4, UnknownHostException -> 0x0192, Throwable -> 0x0177, all -> 0x0174 }
            r4.<init>(r5, r6)     // Catch:{ SSLHandshakeException -> 0x01b4, UnknownHostException -> 0x0192, Throwable -> 0x0177, all -> 0x0174 }
            r2.<init>(r3, r4)     // Catch:{ SSLHandshakeException -> 0x01b4, UnknownHostException -> 0x0192, Throwable -> 0x0177, all -> 0x0174 }
            java.net.URL r3 = new java.net.URL     // Catch:{ SSLHandshakeException -> 0x01b4, UnknownHostException -> 0x0192, Throwable -> 0x0177, all -> 0x0174 }
            r3.<init>(r10)     // Catch:{ SSLHandshakeException -> 0x01b4, UnknownHostException -> 0x0192, Throwable -> 0x0177, all -> 0x0174 }
            java.net.URLConnection r2 = r3.openConnection(r2)     // Catch:{ SSLHandshakeException -> 0x01b4, UnknownHostException -> 0x0192, Throwable -> 0x0177, all -> 0x0174 }
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ SSLHandshakeException -> 0x01b4, UnknownHostException -> 0x0192, Throwable -> 0x0177, all -> 0x0174 }
            goto L_0x0038
        L_0x002d:
            java.net.URL r2 = new java.net.URL     // Catch:{ SSLHandshakeException -> 0x01b4, UnknownHostException -> 0x0192, Throwable -> 0x0177, all -> 0x0174 }
            r2.<init>(r10)     // Catch:{ SSLHandshakeException -> 0x01b4, UnknownHostException -> 0x0192, Throwable -> 0x0177, all -> 0x0174 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ SSLHandshakeException -> 0x01b4, UnknownHostException -> 0x0192, Throwable -> 0x0177, all -> 0x0174 }
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ SSLHandshakeException -> 0x01b4, UnknownHostException -> 0x0192, Throwable -> 0x0177, all -> 0x0174 }
        L_0x0038:
            boolean r3 = f80987e     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            r4 = 1
            if (r3 != 0) goto L_0x0059
            org.apache.http.conn.ssl.X509HostnameVerifier r3 = org.apache.http.conn.ssl.SSLSocketFactory.STRICT_HOSTNAME_VERIFIER     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            r2.setHostnameVerifier(r3)     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            java.lang.String r3 = "TLS"
            javax.net.ssl.SSLContext r3 = javax.net.ssl.SSLContext.getInstance(r3)     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            java.security.SecureRandom r5 = new java.security.SecureRandom     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            r5.<init>()     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            r3.init(r1, r1, r5)     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            javax.net.ssl.SSLSocketFactory r3 = r3.getSocketFactory()     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            r2.setSSLSocketFactory(r3)     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            f80987e = r4     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
        L_0x0059:
            java.lang.String r3 = "X-Umeng-UTC"
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            r2.setRequestProperty(r3, r5)     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            java.lang.String r3 = "X-Umeng-Sdk"
            android.content.Context r5 = r8.f80990c     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            com.umeng.commonsdk.statistics.internal.a r5 = com.umeng.commonsdk.statistics.internal.a.a((android.content.Context) r5)     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            java.lang.String r5 = r5.b()     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            r2.setRequestProperty(r3, r5)     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            java.lang.String r3 = "Content-Type"
            android.content.Context r5 = r8.f80990c     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            com.umeng.commonsdk.statistics.internal.a r5 = com.umeng.commonsdk.statistics.internal.a.a((android.content.Context) r5)     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            java.lang.String r5 = r5.a()     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            r2.setRequestProperty(r3, r5)     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            java.lang.String r3 = "Msg-Type"
            java.lang.String r5 = "envelope/json"
            r2.setRequestProperty(r3, r5)     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            java.lang.String r3 = "X-Umeng-Pro-Ver"
            java.lang.String r5 = "1.0.0"
            r2.setRequestProperty(r3, r5)     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            r3 = 30000(0x7530, float:4.2039E-41)
            r2.setConnectTimeout(r3)     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            r2.setReadTimeout(r3)     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            java.lang.String r3 = "POST"
            r2.setRequestMethod(r3)     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            r2.setDoOutput(r4)     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            r2.setDoInput(r4)     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            r3 = 0
            r2.setUseCaches(r3)     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            java.io.OutputStream r5 = r2.getOutputStream()     // Catch:{ SSLHandshakeException -> 0x0172, UnknownHostException -> 0x0170, Throwable -> 0x016e, all -> 0x016b }
            r5.write(r9)     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            r5.flush()     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            r2.connect()     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            com.umeng.commonsdk.statistics.internal.b r9 = r8.f80991d     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            if (r9 == 0) goto L_0x00bf
            com.umeng.commonsdk.statistics.internal.b r9 = r8.f80991d     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            r9.onRequestEnd()     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
        L_0x00bf:
            int r9 = r2.getResponseCode()     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            java.lang.String r6 = "Content-Type"
            java.lang.String r6 = r2.getHeaderField(r6)     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            if (r7 != 0) goto L_0x00d8
            java.lang.String r7 = "application/thrift"
            boolean r6 = r6.equalsIgnoreCase(r7)     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            if (r6 == 0) goto L_0x00d8
            r3 = 1
        L_0x00d8:
            boolean r4 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            if (r4 == 0) goto L_0x00f5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            java.lang.String r6 = "status code : "
            r4.<init>(r6)     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            r4.append(r9)     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            java.lang.String r6 = "; isThrifit:"
            r4.append(r6)     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            r4.append(r3)     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            java.lang.String r4 = r4.toString()     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            com.umeng.commonsdk.statistics.common.MLog.i((java.lang.String) r4)     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
        L_0x00f5:
            r4 = 200(0xc8, float:2.8E-43)
            if (r9 != r4) goto L_0x0150
            if (r3 == 0) goto L_0x0150
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            java.lang.String r4 = "Send message to server. status code is: "
            r3.<init>(r4)     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            r3.append(r9)     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            java.lang.String r3 = r3.toString()     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            com.umeng.commonsdk.statistics.common.MLog.i((java.lang.String) r3)     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            java.lang.String r3 = "MobclickRT"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            java.lang.String r6 = "Send message to server. status code is: "
            r4.<init>(r6)     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            r4.append(r9)     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            java.lang.String r9 = "; url = "
            r4.append(r9)     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            r4.append(r10)     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            java.lang.String r9 = r4.toString()     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            com.umeng.commonsdk.debug.UMRTLog.i(r3, r9)     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            java.io.InputStream r9 = r2.getInputStream()     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            byte[] r10 = com.umeng.commonsdk.statistics.common.HelperUtils.readStreamToByteArray(r9)     // Catch:{ all -> 0x014b }
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose((java.io.InputStream) r9)     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            if (r5 == 0) goto L_0x013e
            r5.close()     // Catch:{ Exception -> 0x0138 }
            goto L_0x013e
        L_0x0138:
            r9 = move-exception
            android.content.Context r0 = r8.f80990c
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r0, r9)
        L_0x013e:
            if (r2 == 0) goto L_0x014a
            java.io.InputStream r9 = r2.getInputStream()     // Catch:{ IOException -> 0x0147 }
            r9.close()     // Catch:{ IOException -> 0x0147 }
        L_0x0147:
            r2.disconnect()
        L_0x014a:
            return r10
        L_0x014b:
            r10 = move-exception
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose((java.io.InputStream) r9)     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
            throw r10     // Catch:{ SSLHandshakeException -> 0x01b6, UnknownHostException -> 0x0194, Throwable -> 0x0169 }
        L_0x0150:
            if (r5 == 0) goto L_0x015c
            r5.close()     // Catch:{ Exception -> 0x0156 }
            goto L_0x015c
        L_0x0156:
            r9 = move-exception
            android.content.Context r10 = r8.f80990c
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r10, r9)
        L_0x015c:
            if (r2 == 0) goto L_0x0168
            java.io.InputStream r9 = r2.getInputStream()     // Catch:{ IOException -> 0x0165 }
            r9.close()     // Catch:{ IOException -> 0x0165 }
        L_0x0165:
            r2.disconnect()
        L_0x0168:
            return r1
        L_0x0169:
            goto L_0x0179
        L_0x016b:
            r9 = move-exception
            goto L_0x01d8
        L_0x016e:
            r5 = r1
            goto L_0x0179
        L_0x0170:
            r5 = r1
            goto L_0x0194
        L_0x0172:
            r5 = r1
            goto L_0x01b6
        L_0x0174:
            r9 = move-exception
            r2 = r1
            goto L_0x01d8
        L_0x0177:
            r2 = r1
            r5 = r2
        L_0x0179:
            if (r5 == 0) goto L_0x0185
            r5.close()     // Catch:{ Exception -> 0x017f }
            goto L_0x0185
        L_0x017f:
            r9 = move-exception
            android.content.Context r10 = r8.f80990c
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r10, r9)
        L_0x0185:
            if (r2 == 0) goto L_0x0191
            java.io.InputStream r9 = r2.getInputStream()     // Catch:{ IOException -> 0x018e }
            r9.close()     // Catch:{ IOException -> 0x018e }
        L_0x018e:
            r2.disconnect()
        L_0x0191:
            return r1
        L_0x0192:
            r2 = r1
            r5 = r2
        L_0x0194:
            java.lang.String r9 = "A_10200"
            java.lang.String r10 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq((java.lang.String) r9, (int) r0, (java.lang.String) r10)     // Catch:{ all -> 0x01d6 }
            if (r5 == 0) goto L_0x01a7
            r5.close()     // Catch:{ Exception -> 0x01a1 }
            goto L_0x01a7
        L_0x01a1:
            r9 = move-exception
            android.content.Context r10 = r8.f80990c
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r10, r9)
        L_0x01a7:
            if (r2 == 0) goto L_0x01b3
            java.io.InputStream r9 = r2.getInputStream()     // Catch:{ IOException -> 0x01b0 }
            r9.close()     // Catch:{ IOException -> 0x01b0 }
        L_0x01b0:
            r2.disconnect()
        L_0x01b3:
            return r1
        L_0x01b4:
            r2 = r1
            r5 = r2
        L_0x01b6:
            java.lang.String r9 = "A_10201"
            java.lang.String r10 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq((java.lang.String) r9, (int) r0, (java.lang.String) r10)     // Catch:{ all -> 0x01d6 }
            if (r5 == 0) goto L_0x01c9
            r5.close()     // Catch:{ Exception -> 0x01c3 }
            goto L_0x01c9
        L_0x01c3:
            r9 = move-exception
            android.content.Context r10 = r8.f80990c
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r10, r9)
        L_0x01c9:
            if (r2 == 0) goto L_0x01d5
            java.io.InputStream r9 = r2.getInputStream()     // Catch:{ IOException -> 0x01d2 }
            r9.close()     // Catch:{ IOException -> 0x01d2 }
        L_0x01d2:
            r2.disconnect()
        L_0x01d5:
            return r1
        L_0x01d6:
            r9 = move-exception
            r1 = r5
        L_0x01d8:
            if (r1 == 0) goto L_0x01e4
            r1.close()     // Catch:{ Exception -> 0x01de }
            goto L_0x01e4
        L_0x01de:
            r10 = move-exception
            android.content.Context r0 = r8.f80990c
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r0, r10)
        L_0x01e4:
            if (r2 == 0) goto L_0x01f0
            java.io.InputStream r10 = r2.getInputStream()     // Catch:{ IOException -> 0x01ed }
            r10.close()     // Catch:{ IOException -> 0x01ed }
        L_0x01ed:
            r2.disconnect()
        L_0x01f0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.internal.c.b(byte[], java.lang.String):byte[]");
    }
}
