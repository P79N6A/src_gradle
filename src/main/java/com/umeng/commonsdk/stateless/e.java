package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.b;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private String f80910a = "10.0.0.172";

    /* renamed from: b  reason: collision with root package name */
    private int f80911b = 80;

    /* renamed from: c  reason: collision with root package name */
    private Context f80912c;

    private void a() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f80912c, "sl_domain_p", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            a.g = DataHelper.assembleStatelessURL(imprintProperty);
        }
    }

    private void b() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f80912c, "sl_domain_p", "");
        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f80912c, "oversea_sl_domain_p", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            a.f80886f = DataHelper.assembleStatelessURL(imprintProperty);
        }
        if (!TextUtils.isEmpty(imprintProperty2)) {
            a.h = DataHelper.assembleStatelessURL(imprintProperty2);
        }
        a.g = a.h;
        if (TextUtils.isEmpty(b.f80921b)) {
            return;
        }
        if (b.f80921b.startsWith("460") || b.f80921b.startsWith("461")) {
            a.g = a.f80886f;
        }
    }

    private boolean c() {
        if (this.f80912c == null || this.f80912c.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f80912c.getPackageName()) != 0) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f80912c.getSystemService("connectivity");
            if (!DeviceConfig.checkPermission(this.f80912c, "android.permission.ACCESS_NETWORK_STATE") || connectivityManager == null) {
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
            UMCrashManager.reportCrash(this.f80912c, th);
        }
    }

    public e(Context context) {
        this.f80912c = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a9, code lost:
        if (r9 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ab, code lost:
        r9.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c8, code lost:
        if (r9 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cb, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c3 A[SYNTHETIC, Splitter:B:35:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cf A[SYNTHETIC, Splitter:B:42:0x00cf] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(byte[] r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x00da
            if (r9 != 0) goto L_0x0007
            goto L_0x00da
        L_0x0007:
            r1 = 0
            boolean r2 = r7.c()     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            if (r2 == 0) goto L_0x0040
            java.net.Proxy r2 = new java.net.Proxy     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            java.net.Proxy$Type r3 = java.net.Proxy.Type.HTTP     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            java.net.InetSocketAddress r4 = new java.net.InetSocketAddress     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            java.lang.String r5 = r7.f80910a     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            int r6 = r7.f80911b     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            r4.<init>(r5, r6)     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            java.net.URL r3 = new java.net.URL     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            r4.<init>()     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            java.lang.String r5 = com.umeng.commonsdk.stateless.a.g     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            r4.append(r5)     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            java.lang.String r5 = "/"
            r4.append(r5)     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            r4.append(r9)     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            java.lang.String r9 = r4.toString()     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            r3.<init>(r9)     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            java.net.URLConnection r9 = r3.openConnection(r2)     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            goto L_0x0061
        L_0x0040:
            java.net.URL r2 = new java.net.URL     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            r3.<init>()     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            java.lang.String r4 = com.umeng.commonsdk.stateless.a.g     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            r3.append(r4)     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            r3.append(r9)     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            java.lang.String r9 = r3.toString()     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            r2.<init>(r9)     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            java.net.URLConnection r9 = r2.openConnection()     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
        L_0x0061:
            java.lang.String r2 = "X-Umeng-UTC"
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00b5 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x00b5 }
            r9.setRequestProperty(r2, r3)     // Catch:{ Throwable -> 0x00b5 }
            java.lang.String r2 = "Msg-Type"
            java.lang.String r3 = "envelope/json"
            r9.setRequestProperty(r2, r3)     // Catch:{ Throwable -> 0x00b5 }
            r2 = 30000(0x7530, float:4.2039E-41)
            r9.setConnectTimeout(r2)     // Catch:{ Throwable -> 0x00b5 }
            r9.setReadTimeout(r2)     // Catch:{ Throwable -> 0x00b5 }
            java.lang.String r2 = "POST"
            r9.setRequestMethod(r2)     // Catch:{ Throwable -> 0x00b5 }
            r2 = 1
            r9.setDoOutput(r2)     // Catch:{ Throwable -> 0x00b5 }
            r9.setDoInput(r2)     // Catch:{ Throwable -> 0x00b5 }
            r9.setUseCaches(r0)     // Catch:{ Throwable -> 0x00b5 }
            java.io.OutputStream r3 = r9.getOutputStream()     // Catch:{ Throwable -> 0x00b5 }
            r3.write(r8)     // Catch:{ Throwable -> 0x00b2, all -> 0x00af }
            r3.flush()     // Catch:{ Throwable -> 0x00b2, all -> 0x00af }
            r9.connect()     // Catch:{ Throwable -> 0x00b2, all -> 0x00af }
            int r8 = r9.getResponseCode()     // Catch:{ Throwable -> 0x00b2, all -> 0x00af }
            r1 = 200(0xc8, float:2.8E-43)
            if (r8 != r1) goto L_0x00a2
            r0 = 1
        L_0x00a2:
            if (r3 == 0) goto L_0x00a9
            r3.close()     // Catch:{ Exception -> 0x00a8 }
            goto L_0x00a9
        L_0x00a8:
        L_0x00a9:
            if (r9 == 0) goto L_0x00cb
        L_0x00ab:
            r9.disconnect()
            goto L_0x00cb
        L_0x00af:
            r8 = move-exception
            r1 = r3
            goto L_0x00cd
        L_0x00b2:
            r8 = move-exception
            r1 = r3
            goto L_0x00bc
        L_0x00b5:
            r8 = move-exception
            goto L_0x00bc
        L_0x00b7:
            r8 = move-exception
            r9 = r1
            goto L_0x00cd
        L_0x00ba:
            r8 = move-exception
            r9 = r1
        L_0x00bc:
            android.content.Context r2 = r7.f80912c     // Catch:{ all -> 0x00cc }
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r2, r8)     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x00c8
            r1.close()     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00c8
        L_0x00c7:
        L_0x00c8:
            if (r9 == 0) goto L_0x00cb
            goto L_0x00ab
        L_0x00cb:
            return r0
        L_0x00cc:
            r8 = move-exception
        L_0x00cd:
            if (r1 == 0) goto L_0x00d4
            r1.close()     // Catch:{ Exception -> 0x00d3 }
            goto L_0x00d4
        L_0x00d3:
        L_0x00d4:
            if (r9 == 0) goto L_0x00d9
            r9.disconnect()
        L_0x00d9:
            throw r8
        L_0x00da:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.e.b(byte[], java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115 A[SYNTHETIC, Splitter:B:46:0x0115] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011c A[SYNTHETIC, Splitter:B:50:0x011c] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012a A[SYNTHETIC, Splitter:B:58:0x012a] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0131 A[SYNTHETIC, Splitter:B:62:0x0131] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013a A[SYNTHETIC, Splitter:B:67:0x013a] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0141 A[SYNTHETIC, Splitter:B:71:0x0141] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(byte[] r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            if (r9 == 0) goto L_0x014c
            if (r10 != 0) goto L_0x0008
            goto L_0x014c
        L_0x0008:
            int r2 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE
            if (r2 != 0) goto L_0x0010
            r8.a()
            goto L_0x0017
        L_0x0010:
            java.lang.String r2 = com.umeng.commonsdk.stateless.a.h
            com.umeng.commonsdk.stateless.a.f80886f = r2
            r8.b()
        L_0x0017:
            r2 = 0
            boolean r3 = r8.c()     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            if (r3 == 0) goto L_0x0050
            java.net.Proxy r3 = new java.net.Proxy     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            java.net.Proxy$Type r4 = java.net.Proxy.Type.HTTP     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            java.net.InetSocketAddress r5 = new java.net.InetSocketAddress     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            java.lang.String r6 = r8.f80910a     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            int r7 = r8.f80911b     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            r5.<init>(r6, r7)     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            r3.<init>(r4, r5)     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            java.net.URL r4 = new java.net.URL     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            r5.<init>()     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            java.lang.String r6 = com.umeng.commonsdk.stateless.a.g     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            r5.append(r6)     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            java.lang.String r6 = "/"
            r5.append(r6)     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            r5.append(r10)     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            java.lang.String r5 = r5.toString()     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            r4.<init>(r5)     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            java.net.URLConnection r3 = r4.openConnection(r3)     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            goto L_0x0071
        L_0x0050:
            java.net.URL r3 = new java.net.URL     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            r4.<init>()     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            java.lang.String r5 = com.umeng.commonsdk.stateless.a.g     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            r4.append(r5)     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            java.lang.String r5 = "/"
            r4.append(r5)     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            r4.append(r10)     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            java.lang.String r4 = r4.toString()     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            r3.<init>(r4)     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch:{ SSLHandshakeException -> 0x0121, Throwable -> 0x010c, all -> 0x0109 }
        L_0x0071:
            org.apache.http.conn.ssl.X509HostnameVerifier r4 = org.apache.http.conn.ssl.SSLSocketFactory.STRICT_HOSTNAME_VERIFIER     // Catch:{ SSLHandshakeException -> 0x0107, Throwable -> 0x0105 }
            r3.setHostnameVerifier(r4)     // Catch:{ SSLHandshakeException -> 0x0107, Throwable -> 0x0105 }
            java.lang.String r4 = "TLS"
            javax.net.ssl.SSLContext r4 = javax.net.ssl.SSLContext.getInstance(r4)     // Catch:{ SSLHandshakeException -> 0x0107, Throwable -> 0x0105 }
            java.security.SecureRandom r5 = new java.security.SecureRandom     // Catch:{ SSLHandshakeException -> 0x0107, Throwable -> 0x0105 }
            r5.<init>()     // Catch:{ SSLHandshakeException -> 0x0107, Throwable -> 0x0105 }
            r4.init(r2, r2, r5)     // Catch:{ SSLHandshakeException -> 0x0107, Throwable -> 0x0105 }
            javax.net.ssl.SSLSocketFactory r4 = r4.getSocketFactory()     // Catch:{ SSLHandshakeException -> 0x0107, Throwable -> 0x0105 }
            r3.setSSLSocketFactory(r4)     // Catch:{ SSLHandshakeException -> 0x0107, Throwable -> 0x0105 }
            java.lang.String r4 = "X-Umeng-UTC"
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ SSLHandshakeException -> 0x0107, Throwable -> 0x0105 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SSLHandshakeException -> 0x0107, Throwable -> 0x0105 }
            r3.setRequestProperty(r4, r5)     // Catch:{ SSLHandshakeException -> 0x0107, Throwable -> 0x0105 }
            java.lang.String r4 = "Msg-Type"
            java.lang.String r5 = "envelope/json"
            r3.setRequestProperty(r4, r5)     // Catch:{ SSLHandshakeException -> 0x0107, Throwable -> 0x0105 }
            r4 = 30000(0x7530, float:4.2039E-41)
            r3.setConnectTimeout(r4)     // Catch:{ SSLHandshakeException -> 0x0107, Throwable -> 0x0105 }
            r3.setReadTimeout(r4)     // Catch:{ SSLHandshakeException -> 0x0107, Throwable -> 0x0105 }
            java.lang.String r4 = "POST"
            r3.setRequestMethod(r4)     // Catch:{ SSLHandshakeException -> 0x0107, Throwable -> 0x0105 }
            r3.setDoOutput(r1)     // Catch:{ SSLHandshakeException -> 0x0107, Throwable -> 0x0105 }
            r3.setDoInput(r1)     // Catch:{ SSLHandshakeException -> 0x0107, Throwable -> 0x0105 }
            r3.setUseCaches(r0)     // Catch:{ SSLHandshakeException -> 0x0107, Throwable -> 0x0105 }
            java.io.OutputStream r4 = r3.getOutputStream()     // Catch:{ SSLHandshakeException -> 0x0107, Throwable -> 0x0105 }
            r4.write(r9)     // Catch:{ SSLHandshakeException -> 0x0102, Throwable -> 0x00ff, all -> 0x00fc }
            r4.flush()     // Catch:{ SSLHandshakeException -> 0x0102, Throwable -> 0x00ff, all -> 0x00fc }
            r3.connect()     // Catch:{ SSLHandshakeException -> 0x0102, Throwable -> 0x00ff, all -> 0x00fc }
            int r9 = r3.getResponseCode()     // Catch:{ SSLHandshakeException -> 0x0102, Throwable -> 0x00ff, all -> 0x00fc }
            r2 = 200(0xc8, float:2.8E-43)
            if (r9 != r2) goto L_0x00e8
            java.lang.String r9 = "MobclickRT"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SSLHandshakeException -> 0x0102, Throwable -> 0x00ff, all -> 0x00fc }
            java.lang.String r5 = "--->>> send stateless message success : "
            r2.<init>(r5)     // Catch:{ SSLHandshakeException -> 0x0102, Throwable -> 0x00ff, all -> 0x00fc }
            java.lang.String r5 = com.umeng.commonsdk.stateless.a.g     // Catch:{ SSLHandshakeException -> 0x0102, Throwable -> 0x00ff, all -> 0x00fc }
            r2.append(r5)     // Catch:{ SSLHandshakeException -> 0x0102, Throwable -> 0x00ff, all -> 0x00fc }
            java.lang.String r5 = "/"
            r2.append(r5)     // Catch:{ SSLHandshakeException -> 0x0102, Throwable -> 0x00ff, all -> 0x00fc }
            r2.append(r10)     // Catch:{ SSLHandshakeException -> 0x0102, Throwable -> 0x00ff, all -> 0x00fc }
            java.lang.String r10 = r2.toString()     // Catch:{ SSLHandshakeException -> 0x0102, Throwable -> 0x00ff, all -> 0x00fc }
            com.umeng.commonsdk.debug.UMRTLog.i(r9, r10)     // Catch:{ SSLHandshakeException -> 0x0102, Throwable -> 0x00ff, all -> 0x00fc }
            r0 = 1
        L_0x00e8:
            if (r4 == 0) goto L_0x00ef
            r4.close()     // Catch:{ Exception -> 0x00ee }
            goto L_0x00ef
        L_0x00ee:
        L_0x00ef:
            if (r3 == 0) goto L_0x0136
            java.io.InputStream r9 = r3.getInputStream()     // Catch:{ IOException -> 0x00f8 }
        L_0x00f5:
            r9.close()     // Catch:{ IOException -> 0x00f8 }
        L_0x00f8:
            r3.disconnect()
            goto L_0x0136
        L_0x00fc:
            r9 = move-exception
            r2 = r4
            goto L_0x0138
        L_0x00ff:
            r9 = move-exception
            r2 = r4
            goto L_0x010e
        L_0x0102:
            r9 = move-exception
            r2 = r4
            goto L_0x0123
        L_0x0105:
            r9 = move-exception
            goto L_0x010e
        L_0x0107:
            r9 = move-exception
            goto L_0x0123
        L_0x0109:
            r9 = move-exception
            r3 = r2
            goto L_0x0138
        L_0x010c:
            r9 = move-exception
            r3 = r2
        L_0x010e:
            java.lang.String r10 = "Exception,Failed to send message."
            com.umeng.commonsdk.statistics.common.MLog.e((java.lang.String) r10, (java.lang.Throwable) r9)     // Catch:{ all -> 0x0137 }
            if (r2 == 0) goto L_0x011a
            r2.close()     // Catch:{ Exception -> 0x0119 }
            goto L_0x011a
        L_0x0119:
        L_0x011a:
            if (r3 == 0) goto L_0x0136
            java.io.InputStream r9 = r3.getInputStream()     // Catch:{ IOException -> 0x00f8 }
            goto L_0x00f5
        L_0x0121:
            r9 = move-exception
            r3 = r2
        L_0x0123:
            java.lang.String r10 = "SSLHandshakeException, Failed to send message."
            com.umeng.commonsdk.statistics.common.MLog.e((java.lang.String) r10, (java.lang.Throwable) r9)     // Catch:{ all -> 0x0137 }
            if (r2 == 0) goto L_0x012f
            r2.close()     // Catch:{ Exception -> 0x012e }
            goto L_0x012f
        L_0x012e:
        L_0x012f:
            if (r3 == 0) goto L_0x0136
            java.io.InputStream r9 = r3.getInputStream()     // Catch:{ IOException -> 0x00f8 }
            goto L_0x00f5
        L_0x0136:
            return r0
        L_0x0137:
            r9 = move-exception
        L_0x0138:
            if (r2 == 0) goto L_0x013f
            r2.close()     // Catch:{ Exception -> 0x013e }
            goto L_0x013f
        L_0x013e:
        L_0x013f:
            if (r3 == 0) goto L_0x014b
            java.io.InputStream r10 = r3.getInputStream()     // Catch:{ IOException -> 0x0148 }
            r10.close()     // Catch:{ IOException -> 0x0148 }
        L_0x0148:
            r3.disconnect()
        L_0x014b:
            throw r9
        L_0x014c:
            java.lang.String r9 = "walle"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r1 = "[stateless] sendMessage, envelopeByte == null || path == null "
            r10[r0] = r1
            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r9, (java.lang.Object[]) r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.e.a(byte[], java.lang.String):boolean");
    }
}
