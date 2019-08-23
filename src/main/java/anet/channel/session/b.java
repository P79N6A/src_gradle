package anet.channel.session;

import android.os.Build;
import android.util.Pair;
import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.request.Request;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.StringUtils;
import anet.channel.util.g;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

public class b {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1290a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f1291b;

        /* renamed from: c  reason: collision with root package name */
        public Map<String, List<String>> f1292c;

        /* renamed from: d  reason: collision with root package name */
        public int f1293d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1294e;
    }

    private b() {
    }

    private static HttpURLConnection a(Request request) throws IOException {
        Proxy proxy;
        HttpURLConnection httpURLConnection;
        String str;
        Pair<String, Integer> wifiProxy = NetworkStatusHelper.getWifiProxy();
        if (wifiProxy != null) {
            proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress((String) wifiProxy.first, ((Integer) wifiProxy.second).intValue()));
        } else {
            proxy = null;
        }
        g a2 = g.a();
        if (NetworkStatusHelper.getStatus().isMobile() && a2 != null) {
            proxy = a2.b();
        }
        URL url = request.getUrl();
        if (proxy != null) {
            httpURLConnection = (HttpURLConnection) url.openConnection(proxy);
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        httpURLConnection.setConnectTimeout(request.getConnectTimeout());
        httpURLConnection.setReadTimeout(request.getReadTimeout());
        httpURLConnection.setRequestMethod(request.getMethod());
        if (request.containsBody()) {
            httpURLConnection.setDoOutput(true);
        }
        Map<String, String> headers = request.getHeaders();
        for (Map.Entry next : headers.entrySet()) {
            httpURLConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
        }
        String str2 = headers.get("Host");
        if (str2 == null) {
            str2 = request.getHost();
        }
        if (request.getHttpUrl().containsNonDefaultPort()) {
            str = StringUtils.concatString(str2, ":", String.valueOf(request.getHttpUrl().getPort()));
        } else {
            str = str2;
        }
        httpURLConnection.setRequestProperty("Host", str);
        if (NetworkStatusHelper.getApn().equals("cmwap")) {
            httpURLConnection.setRequestProperty("x-online-host", str);
        }
        if (!headers.containsKey("Accept-Encoding")) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        }
        if (a2 != null) {
            httpURLConnection.setRequestProperty("Authorization", a2.c());
        }
        if (url.getProtocol().equalsIgnoreCase("https")) {
            a(httpURLConnection, request, str2);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045 A[SYNTHETIC, Splitter:B:23:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006a A[SYNTHETIC, Splitter:B:29:0x006a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(java.net.HttpURLConnection r7, anet.channel.request.Request r8) {
        /*
            boolean r0 = r8.containsBody()
            r1 = 0
            if (r0 == 0) goto L_0x0080
            r0 = 0
            java.io.OutputStream r7 = r7.getOutputStream()     // Catch:{ Exception -> 0x0035 }
            int r0 = r8.postBody(r7)     // Catch:{ Exception -> 0x002e, all -> 0x0029 }
            if (r7 == 0) goto L_0x0027
            r7.flush()     // Catch:{ IOException -> 0x0019 }
            r7.close()     // Catch:{ IOException -> 0x0019 }
            goto L_0x0027
        L_0x0019:
            r7 = move-exception
            java.lang.String r2 = "awcn.HttpConnector"
            java.lang.String r3 = "postData"
            java.lang.String r4 = r8.getSeq()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            anet.channel.util.ALog.e(r2, r3, r4, r7, r1)
        L_0x0027:
            r1 = r0
            goto L_0x005a
        L_0x0029:
            r0 = move-exception
            r6 = r0
            r0 = r7
            r7 = r6
            goto L_0x0068
        L_0x002e:
            r0 = move-exception
            r6 = r0
            r0 = r7
            r7 = r6
            goto L_0x0036
        L_0x0033:
            r7 = move-exception
            goto L_0x0068
        L_0x0035:
            r7 = move-exception
        L_0x0036:
            java.lang.String r2 = "awcn.HttpConnector"
            java.lang.String r3 = "postData error"
            java.lang.String r4 = r8.getSeq()     // Catch:{ all -> 0x0033 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x0033 }
            anet.channel.util.ALog.e(r2, r3, r4, r7, r5)     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x005a
            r0.flush()     // Catch:{ IOException -> 0x004c }
            r0.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x005a
        L_0x004c:
            r7 = move-exception
            java.lang.String r0 = "awcn.HttpConnector"
            java.lang.String r2 = "postData"
            java.lang.String r3 = r8.getSeq()
            java.lang.Object[] r4 = new java.lang.Object[r1]
            anet.channel.util.ALog.e(r0, r2, r3, r7, r4)
        L_0x005a:
            anet.channel.statist.RequestStatistic r7 = r8.f1262a
            long r2 = (long) r1
            r7.reqBodyInflateSize = r2
            anet.channel.statist.RequestStatistic r7 = r8.f1262a
            r7.reqBodyDeflateSize = r2
            anet.channel.statist.RequestStatistic r7 = r8.f1262a
            r7.sendDataSize = r2
            goto L_0x0080
        L_0x0068:
            if (r0 == 0) goto L_0x007f
            r0.flush()     // Catch:{ IOException -> 0x0071 }
            r0.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x007f
        L_0x0071:
            r0 = move-exception
            java.lang.String r8 = r8.getSeq()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "awcn.HttpConnector"
            java.lang.String r3 = "postData"
            anet.channel.util.ALog.e(r2, r3, r8, r0, r1)
        L_0x007f:
            throw r7
        L_0x0080:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.b.a(java.net.HttpURLConnection, anet.channel.request.Request):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        anet.channel.util.ALog.e("awcn.HttpConnector", "redirect url is invalid!", r4.getSeq(), "redirect url", r5);
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02f2 A[SYNTHETIC, Splitter:B:107:0x02f2] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x030f A[SYNTHETIC, Splitter:B:116:0x030f] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x034c A[SYNTHETIC, Splitter:B:127:0x034c] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x037c A[SYNTHETIC, Splitter:B:136:0x037c] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x039c A[SYNTHETIC, Splitter:B:145:0x039c] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03bc A[SYNTHETIC, Splitter:B:154:0x03bc] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03db A[SYNTHETIC, Splitter:B:163:0x03db] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0406 A[SYNTHETIC, Splitter:B:172:0x0406] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x040c A[SYNTHETIC, Splitter:B:176:0x040c] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x023e A[Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0258 A[Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0263 A[SYNTHETIC, Splitter:B:68:0x0263] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0294 A[Catch:{ all -> 0x0268 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0299 A[Catch:{ all -> 0x0268 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02a3 A[Catch:{ all -> 0x0268 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02b2 A[Catch:{ all -> 0x0268 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02c6 A[SYNTHETIC, Splitter:B:98:0x02c6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static anet.channel.session.b.a a(anet.channel.request.Request r17, anet.channel.RequestCb r18) {
        /*
            r1 = r18
            anet.channel.session.b$a r2 = new anet.channel.session.b$a
            r2.<init>()
            r3 = 0
            if (r17 == 0) goto L_0x041c
            java.net.URL r5 = r17.getUrl()
            if (r5 != 0) goto L_0x0012
            goto L_0x041c
        L_0x0012:
            r4 = r17
            r5 = r3
        L_0x0015:
            boolean r6 = anet.channel.status.NetworkStatusHelper.isConnected()
            if (r6 != 0) goto L_0x0022
            r5 = -200(0xffffffffffffff38, float:NaN)
            a(r4, r2, r1, r5, r3)
            goto L_0x0409
        L_0x0022:
            r6 = -402(0xfffffffffffffe6e, float:NaN)
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            java.net.HttpURLConnection r11 = a(r4)     // Catch:{ UnknownHostException -> 0x03df, SocketTimeoutException -> 0x03c0, ConnectTimeoutException -> 0x03a1, ConnectException -> 0x0381, SSLHandshakeException -> 0x0351, SSLException -> 0x0321, CancellationException -> 0x02f7, IOException -> 0x02cb, Exception -> 0x028a, all -> 0x0285 }
            boolean r5 = anet.channel.util.ALog.isPrintLog(r8)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            if (r5 == 0) goto L_0x007f
            java.lang.String r5 = "awcn.HttpConnector"
            java.lang.String r12 = ""
            java.lang.String r13 = r4.getSeq()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.Object[] r14 = new java.lang.Object[r8]     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r15 = "request URL"
            r14[r10] = r15     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.net.URL r15 = r11.getURL()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r15 = r15.toString()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r14[r9] = r15     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.util.ALog.i(r5, r12, r13, r14)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r5 = "awcn.HttpConnector"
            java.lang.String r12 = ""
            java.lang.String r13 = r4.getSeq()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.Object[] r14 = new java.lang.Object[r8]     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r15 = "request Method"
            r14[r10] = r15     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r15 = r11.getRequestMethod()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r14[r9] = r15     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.util.ALog.i(r5, r12, r13, r14)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r5 = "awcn.HttpConnector"
            java.lang.String r12 = ""
            java.lang.String r13 = r4.getSeq()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.Object[] r14 = new java.lang.Object[r8]     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r15 = "request headers"
            r14[r10] = r15     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.util.Map r15 = r11.getRequestProperties()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r15 = r15.toString()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r14[r9] = r15     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.util.ALog.i(r5, r12, r13, r14)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
        L_0x007f:
            anet.channel.statist.RequestStatistic r5 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r5.sendStart = r12     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.statist.RequestStatistic r5 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.statist.RequestStatistic r12 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            long r12 = r12.sendStart     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.statist.RequestStatistic r14 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            long r14 = r14.start     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r16 = 0
            long r12 = r12 - r14
            r5.processTime = r12     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r11.connect()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            a((java.net.HttpURLConnection) r11, (anet.channel.request.Request) r4)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.statist.RequestStatistic r5 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r5.sendEnd = r12     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.statist.RequestStatistic r5 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.statist.RequestStatistic r12 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            long r12 = r12.sendEnd     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.statist.RequestStatistic r14 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            long r14 = r14.sendStart     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r16 = 0
            long r12 = r12 - r14
            r5.sendDataTime = r12     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            int r5 = r11.getResponseCode()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r2.f1290a = r5     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.util.Map r5 = r11.getHeaderFields()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.util.Map r5 = anet.channel.util.HttpHelper.cloneMap(r5)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r2.f1292c = r5     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r5 = "awcn.HttpConnector"
            java.lang.String r12 = ""
            java.lang.String r13 = r4.getSeq()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.Object[] r14 = new java.lang.Object[r8]     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r15 = "response code"
            r14[r10] = r15     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            int r15 = r2.f1290a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r14[r9] = r15     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.util.ALog.i(r5, r12, r13, r14)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r5 = "awcn.HttpConnector"
            java.lang.String r12 = ""
            java.lang.String r13 = r4.getSeq()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.Object[] r14 = new java.lang.Object[r8]     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r15 = "response headers"
            r14[r10] = r15     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r15 = r2.f1292c     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r14[r9] = r15     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.util.ALog.i(r5, r12, r13, r14)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            int r5 = r2.f1290a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            boolean r5 = anet.channel.util.HttpHelper.checkRedirect(r4, r5)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            if (r5 == 0) goto L_0x0195
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r5 = r2.f1292c     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r12 = "Location"
            java.lang.String r5 = anet.channel.util.HttpHelper.getSingleHeaderFieldByKey(r5, r12)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            if (r5 == 0) goto L_0x0195
            anet.channel.util.HttpUrl r12 = anet.channel.util.HttpUrl.parse(r5)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            if (r12 == 0) goto L_0x0182
            java.lang.String r5 = "awcn.HttpConnector"
            java.lang.String r13 = "redirect"
            java.lang.String r14 = r4.getSeq()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.Object[] r15 = new java.lang.Object[r8]     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r16 = "to url"
            r15[r10] = r16     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r16 = r12.toString()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r15[r9] = r16     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.util.ALog.i(r5, r13, r14, r15)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.request.Request$Builder r5 = r4.newBuilder()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r13 = "GET"
            anet.channel.request.Request$Builder r5 = r5.setMethod(r13)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.request.Request$Builder r5 = r5.setBody(r3)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.request.Request$Builder r5 = r5.setUrl((anet.channel.util.HttpUrl) r12)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            int r13 = r4.getRedirectTimes()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            int r13 = r13 + r9
            anet.channel.request.Request$Builder r5 = r5.setRedirectTimes(r13)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.request.Request$Builder r5 = r5.setSslSocketFactory(r3)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.request.Request$Builder r5 = r5.setHostnameVerifier(r3)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.request.Request r5 = r5.build()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.statist.RequestStatistic r4 = r5.f1262a     // Catch:{ UnknownHostException -> 0x017f, SocketTimeoutException -> 0x017c, ConnectTimeoutException -> 0x0179, ConnectException -> 0x0176, SSLHandshakeException -> 0x0173, SSLException -> 0x0170, CancellationException -> 0x016d, IOException -> 0x016a, Exception -> 0x0167 }
            int r13 = r2.f1290a     // Catch:{ UnknownHostException -> 0x017f, SocketTimeoutException -> 0x017c, ConnectTimeoutException -> 0x0179, ConnectException -> 0x0176, SSLHandshakeException -> 0x0173, SSLException -> 0x0170, CancellationException -> 0x016d, IOException -> 0x016a, Exception -> 0x0167 }
            java.lang.String r12 = r12.simpleUrlString()     // Catch:{ UnknownHostException -> 0x017f, SocketTimeoutException -> 0x017c, ConnectTimeoutException -> 0x0179, ConnectException -> 0x0176, SSLHandshakeException -> 0x0173, SSLException -> 0x0170, CancellationException -> 0x016d, IOException -> 0x016a, Exception -> 0x0167 }
            r4.recordRedirect(r13, r12)     // Catch:{ UnknownHostException -> 0x017f, SocketTimeoutException -> 0x017c, ConnectTimeoutException -> 0x0179, ConnectException -> 0x0176, SSLHandshakeException -> 0x0173, SSLException -> 0x0170, CancellationException -> 0x016d, IOException -> 0x016a, Exception -> 0x0167 }
            if (r11 == 0) goto L_0x0163
            r11.disconnect()     // Catch:{ Exception -> 0x0158 }
            goto L_0x0163
        L_0x0158:
            r0 = move-exception
            r4 = r0
            java.lang.String r6 = "awcn.HttpConnector"
            java.lang.String r7 = "http disconnect"
            java.lang.Object[] r8 = new java.lang.Object[r10]
            anet.channel.util.ALog.e(r6, r7, r3, r4, r8)
        L_0x0163:
            r4 = r5
            r5 = r11
            goto L_0x0015
        L_0x0167:
            r0 = move-exception
            goto L_0x028d
        L_0x016a:
            r0 = move-exception
            goto L_0x02ce
        L_0x016d:
            r0 = move-exception
            goto L_0x02fa
        L_0x0170:
            r0 = move-exception
            goto L_0x0324
        L_0x0173:
            r0 = move-exception
            goto L_0x0354
        L_0x0176:
            r0 = move-exception
            goto L_0x0384
        L_0x0179:
            r0 = move-exception
            goto L_0x03a4
        L_0x017c:
            r0 = move-exception
            goto L_0x03c3
        L_0x017f:
            r0 = move-exception
            goto L_0x03e2
        L_0x0182:
            java.lang.String r12 = "awcn.HttpConnector"
            java.lang.String r13 = "redirect url is invalid!"
            java.lang.String r14 = r4.getSeq()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.Object[] r15 = new java.lang.Object[r8]     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r16 = "redirect url"
            r15[r10] = r16     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r15[r9] = r5     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.util.ALog.e(r12, r13, r14, r15)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
        L_0x0195:
            anet.channel.statist.RequestStatistic r5 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12 = r2.f1292c     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r13 = "Content-Encoding"
            java.lang.String r12 = anet.channel.util.HttpHelper.getSingleHeaderFieldByKey(r12, r13)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r5.contentEncoding = r12     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.statist.RequestStatistic r5 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12 = r2.f1292c     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r13 = "Content-Type"
            java.lang.String r12 = anet.channel.util.HttpHelper.getSingleHeaderFieldByKey(r12, r13)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r5.contentType = r12     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r5 = "HEAD"
            java.lang.String r12 = r4.getMethod()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            boolean r5 = r5.equals(r12)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            if (r5 != 0) goto L_0x0214
            int r5 = r2.f1290a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r12 = 304(0x130, float:4.26E-43)
            if (r5 == r12) goto L_0x0214
            int r5 = r2.f1290a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r12 = 204(0xcc, float:2.86E-43)
            if (r5 == r12) goto L_0x0214
            int r5 = r2.f1290a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r12 = 100
            if (r5 < r12) goto L_0x01d2
            int r5 = r2.f1290a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r12 = 200(0xc8, float:2.8E-43)
            if (r5 >= r12) goto L_0x01d2
            goto L_0x0214
        L_0x01d2:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r5 = r2.f1292c     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            int r5 = anet.channel.util.HttpHelper.parseContentLength(r5)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r2.f1293d = r5     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.statist.RequestStatistic r5 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            int r12 = r2.f1293d     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            long r12 = (long) r12     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r5.contentLength = r12     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r5 = "gzip"
            anet.channel.statist.RequestStatistic r12 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r12 = r12.contentEncoding     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            boolean r5 = r5.equalsIgnoreCase(r12)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r2.f1294e = r5     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            boolean r5 = r2.f1294e     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            if (r5 == 0) goto L_0x01ff
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r5 = r2.f1292c     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r12 = "Content-Encoding"
            r5.remove(r12)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r5 = r2.f1292c     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r12 = "Content-Length"
            r5.remove(r12)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
        L_0x01ff:
            if (r1 == 0) goto L_0x0208
            int r5 = r2.f1290a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12 = r2.f1292c     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r1.onResponseCode(r5, r12)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
        L_0x0208:
            anet.channel.statist.RequestStatistic r5 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r5.rspStart = r12     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            a(r11, r4, r2, r1)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            goto L_0x0225
        L_0x0214:
            if (r1 == 0) goto L_0x021d
            int r5 = r2.f1290a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12 = r2.f1292c     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r1.onResponseCode(r5, r12)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
        L_0x021d:
            anet.channel.statist.RequestStatistic r5 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r5.rspStart = r12     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
        L_0x0225:
            anet.channel.statist.RequestStatistic r5 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.statist.RequestStatistic r12 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            long r12 = r12.rspStart     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.statist.RequestStatistic r14 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            long r14 = r14.sendEnd     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r16 = 0
            long r12 = r12 - r14
            r5.firstDataTime = r12     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.statist.RequestStatistic r5 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.isDone     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            boolean r5 = r5.get()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            if (r5 != 0) goto L_0x0256
            anet.channel.statist.RequestStatistic r5 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r5.ret = r9     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.statist.RequestStatistic r5 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            int r12 = r2.f1290a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r5.statusCode = r12     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.statist.RequestStatistic r5 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r12 = "SUCCESS"
            r5.msg = r12     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            anet.channel.statist.RequestStatistic r5 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r5.rspEnd = r12     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
        L_0x0256:
            if (r1 == 0) goto L_0x0261
            int r5 = r2.f1290a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            java.lang.String r12 = "SUCCESS"
            anet.channel.statist.RequestStatistic r13 = r4.f1262a     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
            r1.onFinish(r5, r12, r13)     // Catch:{ UnknownHostException -> 0x0282, SocketTimeoutException -> 0x027f, ConnectTimeoutException -> 0x027c, ConnectException -> 0x0279, SSLHandshakeException -> 0x0276, SSLException -> 0x0273, CancellationException -> 0x0270, IOException -> 0x026e, Exception -> 0x026c }
        L_0x0261:
            if (r11 == 0) goto L_0x0409
            r11.disconnect()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0409
        L_0x0268:
            r0 = move-exception
            r1 = r0
            goto L_0x040a
        L_0x026c:
            r0 = move-exception
            goto L_0x028c
        L_0x026e:
            r0 = move-exception
            goto L_0x02cd
        L_0x0270:
            r0 = move-exception
            goto L_0x02f9
        L_0x0273:
            r0 = move-exception
            goto L_0x0323
        L_0x0276:
            r0 = move-exception
            goto L_0x0353
        L_0x0279:
            r0 = move-exception
            goto L_0x0383
        L_0x027c:
            r0 = move-exception
            goto L_0x03a3
        L_0x027f:
            r0 = move-exception
            goto L_0x03c2
        L_0x0282:
            r0 = move-exception
            goto L_0x03e1
        L_0x0285:
            r0 = move-exception
            r1 = r0
            r11 = r5
            goto L_0x040a
        L_0x028a:
            r0 = move-exception
            r11 = r5
        L_0x028c:
            r5 = r4
        L_0x028d:
            r4 = r0
            java.lang.String r6 = r4.getMessage()     // Catch:{ all -> 0x0268 }
            if (r6 == 0) goto L_0x0299
            java.lang.String r6 = r4.getMessage()     // Catch:{ all -> 0x0268 }
            goto L_0x029b
        L_0x0299:
            java.lang.String r6 = ""
        L_0x029b:
            java.lang.String r7 = "not verified"
            boolean r6 = r6.contains(r7)     // Catch:{ all -> 0x0268 }
            if (r6 == 0) goto L_0x02b2
            anet.channel.strategy.c r6 = anet.channel.strategy.c.a.f1353a     // Catch:{ all -> 0x0268 }
            java.lang.String r7 = r5.getHost()     // Catch:{ all -> 0x0268 }
            r6.b(r7)     // Catch:{ all -> 0x0268 }
            r6 = -403(0xfffffffffffffe6d, float:NaN)
            a(r5, r2, r1, r6, r4)     // Catch:{ all -> 0x0268 }
            goto L_0x02b7
        L_0x02b2:
            r6 = -101(0xffffffffffffff9b, float:NaN)
            a(r5, r2, r1, r6, r4)     // Catch:{ all -> 0x0268 }
        L_0x02b7:
            java.lang.String r1 = "awcn.HttpConnector"
            java.lang.String r6 = "HTTP Exception"
            java.lang.String r5 = r5.getSeq()     // Catch:{ all -> 0x0268 }
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ all -> 0x0268 }
            anet.channel.util.ALog.e(r1, r6, r5, r4, r7)     // Catch:{ all -> 0x0268 }
            if (r11 == 0) goto L_0x0409
            r11.disconnect()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0409
        L_0x02cb:
            r0 = move-exception
            r11 = r5
        L_0x02cd:
            r5 = r4
        L_0x02ce:
            r4 = r0
            r6 = -404(0xfffffffffffffe6c, float:NaN)
            a(r5, r2, r1, r6, r4)     // Catch:{ all -> 0x0268 }
            java.lang.String r1 = "awcn.HttpConnector"
            java.lang.String r6 = "IO Exception"
            java.lang.String r12 = r5.getSeq()     // Catch:{ all -> 0x0268 }
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0268 }
            java.lang.String r13 = "host"
            r7[r10] = r13     // Catch:{ all -> 0x0268 }
            java.lang.String r5 = r5.getHost()     // Catch:{ all -> 0x0268 }
            r7[r9] = r5     // Catch:{ all -> 0x0268 }
            r7[r8] = r4     // Catch:{ all -> 0x0268 }
            anet.channel.util.ALog.e(r1, r6, r12, r7)     // Catch:{ all -> 0x0268 }
            anet.channel.status.NetworkStatusHelper.printNetworkDetail()     // Catch:{ all -> 0x0268 }
            if (r11 == 0) goto L_0x0409
            r11.disconnect()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0409
        L_0x02f7:
            r0 = move-exception
            r11 = r5
        L_0x02f9:
            r5 = r4
        L_0x02fa:
            r4 = r0
            r6 = -204(0xffffffffffffff34, float:NaN)
            a(r5, r2, r1, r6, r4)     // Catch:{ all -> 0x0268 }
            java.lang.String r1 = "awcn.HttpConnector"
            java.lang.String r6 = "HTTP Request Cancel"
            java.lang.String r5 = r5.getSeq()     // Catch:{ all -> 0x0268 }
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ all -> 0x0268 }
            anet.channel.util.ALog.e(r1, r6, r5, r4, r7)     // Catch:{ all -> 0x0268 }
            if (r11 == 0) goto L_0x0409
            r11.disconnect()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0409
        L_0x0314:
            r0 = move-exception
            r1 = r0
            java.lang.String r4 = "awcn.HttpConnector"
            java.lang.String r5 = "http disconnect"
            java.lang.Object[] r6 = new java.lang.Object[r10]
            anet.channel.util.ALog.e(r4, r5, r3, r1, r6)
            goto L_0x0409
        L_0x0321:
            r0 = move-exception
            r11 = r5
        L_0x0323:
            r5 = r4
        L_0x0324:
            r4 = r0
            anet.channel.strategy.c r12 = anet.channel.strategy.c.a.f1353a     // Catch:{ all -> 0x0268 }
            java.lang.String r13 = r5.getHost()     // Catch:{ all -> 0x0268 }
            r12.b(r13)     // Catch:{ all -> 0x0268 }
            a(r5, r2, r1, r6, r4)     // Catch:{ all -> 0x0268 }
            java.lang.String r1 = "awcn.HttpConnector"
            java.lang.String r6 = "connect SSLException"
            java.lang.String r12 = r5.getSeq()     // Catch:{ all -> 0x0268 }
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0268 }
            java.lang.String r13 = "host"
            r7[r10] = r13     // Catch:{ all -> 0x0268 }
            java.lang.String r5 = r5.getHost()     // Catch:{ all -> 0x0268 }
            r7[r9] = r5     // Catch:{ all -> 0x0268 }
            r7[r8] = r4     // Catch:{ all -> 0x0268 }
            anet.channel.util.ALog.e(r1, r6, r12, r7)     // Catch:{ all -> 0x0268 }
            if (r11 == 0) goto L_0x0409
            r11.disconnect()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0409
        L_0x0351:
            r0 = move-exception
            r11 = r5
        L_0x0353:
            r5 = r4
        L_0x0354:
            r4 = r0
            anet.channel.strategy.c r12 = anet.channel.strategy.c.a.f1353a     // Catch:{ all -> 0x0268 }
            java.lang.String r13 = r5.getHost()     // Catch:{ all -> 0x0268 }
            r12.b(r13)     // Catch:{ all -> 0x0268 }
            a(r5, r2, r1, r6, r4)     // Catch:{ all -> 0x0268 }
            java.lang.String r1 = "awcn.HttpConnector"
            java.lang.String r6 = "HTTP Connect SSLHandshakeException"
            java.lang.String r12 = r5.getSeq()     // Catch:{ all -> 0x0268 }
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0268 }
            java.lang.String r13 = "host"
            r7[r10] = r13     // Catch:{ all -> 0x0268 }
            java.lang.String r5 = r5.getHost()     // Catch:{ all -> 0x0268 }
            r7[r9] = r5     // Catch:{ all -> 0x0268 }
            r7[r8] = r4     // Catch:{ all -> 0x0268 }
            anet.channel.util.ALog.e(r1, r6, r12, r7)     // Catch:{ all -> 0x0268 }
            if (r11 == 0) goto L_0x0409
            r11.disconnect()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0409
        L_0x0381:
            r0 = move-exception
            r11 = r5
        L_0x0383:
            r5 = r4
        L_0x0384:
            r4 = r0
            r6 = -406(0xfffffffffffffe6a, float:NaN)
            a(r5, r2, r1, r6, r4)     // Catch:{ all -> 0x0268 }
            java.lang.String r1 = "awcn.HttpConnector"
            java.lang.String r6 = "HTTP Connect Exception"
            java.lang.String r5 = r5.getSeq()     // Catch:{ all -> 0x0268 }
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ all -> 0x0268 }
            anet.channel.util.ALog.e(r1, r6, r5, r4, r7)     // Catch:{ all -> 0x0268 }
            anet.channel.status.NetworkStatusHelper.printNetworkDetail()     // Catch:{ all -> 0x0268 }
            if (r11 == 0) goto L_0x0409
            r11.disconnect()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0409
        L_0x03a1:
            r0 = move-exception
            r11 = r5
        L_0x03a3:
            r5 = r4
        L_0x03a4:
            r4 = r0
            r6 = -400(0xfffffffffffffe70, float:NaN)
            a(r5, r2, r1, r6, r4)     // Catch:{ all -> 0x0268 }
            java.lang.String r1 = "awcn.HttpConnector"
            java.lang.String r6 = "HTTP Connect Timeout"
            java.lang.String r5 = r5.getSeq()     // Catch:{ all -> 0x0268 }
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ all -> 0x0268 }
            anet.channel.util.ALog.e(r1, r6, r5, r4, r7)     // Catch:{ all -> 0x0268 }
            anet.channel.status.NetworkStatusHelper.printNetworkDetail()     // Catch:{ all -> 0x0268 }
            if (r11 == 0) goto L_0x0409
            r11.disconnect()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0409
        L_0x03c0:
            r0 = move-exception
            r11 = r5
        L_0x03c2:
            r5 = r4
        L_0x03c3:
            r4 = r0
            r6 = -401(0xfffffffffffffe6f, float:NaN)
            a(r5, r2, r1, r6, r4)     // Catch:{ all -> 0x0268 }
            java.lang.String r1 = "awcn.HttpConnector"
            java.lang.String r6 = "HTTP Socket Timeout"
            java.lang.String r5 = r5.getSeq()     // Catch:{ all -> 0x0268 }
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ all -> 0x0268 }
            anet.channel.util.ALog.e(r1, r6, r5, r4, r7)     // Catch:{ all -> 0x0268 }
            anet.channel.status.NetworkStatusHelper.printNetworkDetail()     // Catch:{ all -> 0x0268 }
            if (r11 == 0) goto L_0x0409
            r11.disconnect()     // Catch:{ Exception -> 0x0314 }
            goto L_0x0409
        L_0x03df:
            r0 = move-exception
            r11 = r5
        L_0x03e1:
            r5 = r4
        L_0x03e2:
            r4 = r0
            r6 = -405(0xfffffffffffffe6b, float:NaN)
            a(r5, r2, r1, r6, r4)     // Catch:{ all -> 0x0268 }
            java.lang.String r1 = "awcn.HttpConnector"
            java.lang.String r6 = "Unknown Host Exception"
            java.lang.String r12 = r5.getSeq()     // Catch:{ all -> 0x0268 }
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0268 }
            java.lang.String r13 = "host"
            r7[r10] = r13     // Catch:{ all -> 0x0268 }
            java.lang.String r5 = r5.getHost()     // Catch:{ all -> 0x0268 }
            r7[r9] = r5     // Catch:{ all -> 0x0268 }
            r7[r8] = r4     // Catch:{ all -> 0x0268 }
            anet.channel.util.ALog.e(r1, r6, r12, r7)     // Catch:{ all -> 0x0268 }
            anet.channel.status.NetworkStatusHelper.printNetworkDetail()     // Catch:{ all -> 0x0268 }
            if (r11 == 0) goto L_0x0409
            r11.disconnect()     // Catch:{ Exception -> 0x0314 }
        L_0x0409:
            return r2
        L_0x040a:
            if (r11 == 0) goto L_0x041b
            r11.disconnect()     // Catch:{ Exception -> 0x0410 }
            goto L_0x041b
        L_0x0410:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.lang.String r5 = "awcn.HttpConnector"
            java.lang.String r6 = "http disconnect"
            anet.channel.util.ALog.e(r5, r6, r3, r2, r4)
        L_0x041b:
            throw r1
        L_0x041c:
            if (r1 == 0) goto L_0x042c
            r4 = -102(0xffffffffffffff9a, float:NaN)
            java.lang.String r5 = anet.channel.util.ErrorConstant.getErrMsg(r4)
            anet.channel.statist.RequestStatistic r6 = new anet.channel.statist.RequestStatistic
            r6.<init>(r3, r3)
            r1.onFinish(r4, r5, r6)
        L_0x042c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.b.a(anet.channel.request.Request, anet.channel.RequestCb):anet.channel.session.b$a");
    }

    private static void a(HttpURLConnection httpURLConnection, Request request, String str) {
        if (Integer.parseInt(Build.VERSION.SDK) < 8) {
            ALog.e("awcn.HttpConnector", "supportHttps", "[supportHttps]Froyo 以下版本不支持https", new Object[0]);
            return;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
        if (request.getSslSocketFactory() != null) {
            httpsURLConnection.setSSLSocketFactory(request.getSslSocketFactory());
        } else if (anet.channel.util.b.a() != null) {
            httpsURLConnection.setSSLSocketFactory(anet.channel.util.b.a());
        }
        if (request.getHostnameVerifier() != null) {
            httpsURLConnection.setHostnameVerifier(request.getHostnameVerifier());
        } else if (anet.channel.util.b.b() != null) {
            httpsURLConnection.setHostnameVerifier(anet.channel.util.b.b());
        } else {
            httpsURLConnection.setHostnameVerifier(new c(str));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f6 A[SYNTHETIC, Splitter:B:62:0x00f6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.net.HttpURLConnection r12, anet.channel.request.Request r13, anet.channel.session.b.a r14, anet.channel.RequestCb r15) throws java.io.IOException, java.util.concurrent.CancellationException {
        /*
            r12.getURL()
            r0 = 1
            r1 = 2
            r2 = 0
            r3 = 0
            java.io.InputStream r4 = r12.getInputStream()     // Catch:{ IOException -> 0x000d }
            r12 = r4
            goto L_0x003d
        L_0x000d:
            r4 = move-exception
            boolean r4 = r4 instanceof java.io.FileNotFoundException
            if (r4 == 0) goto L_0x0029
            java.lang.String r4 = "awcn.HttpConnector"
            java.lang.String r5 = "File not found"
            java.lang.String r6 = r13.getSeq()
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r8 = "url"
            r7[r2] = r8
            java.lang.String r8 = r13.getUrlString()
            r7[r0] = r8
            anet.channel.util.ALog.w(r4, r5, r6, r7)
        L_0x0029:
            java.io.InputStream r12 = r12.getErrorStream()     // Catch:{ Exception -> 0x002e }
            goto L_0x003d
        L_0x002e:
            r12 = move-exception
            java.lang.String r4 = "awcn.HttpConnector"
            java.lang.String r5 = "get error stream failed."
            java.lang.String r6 = r13.getSeq()
            java.lang.Object[] r7 = new java.lang.Object[r2]
            anet.channel.util.ALog.e(r4, r5, r6, r12, r7)
            r12 = r3
        L_0x003d:
            if (r12 != 0) goto L_0x0045
            r12 = -404(0xfffffffffffffe6c, float:NaN)
            a(r13, r14, r15, r12, r3)
            return
        L_0x0045:
            if (r15 != 0) goto L_0x005f
            int r4 = r14.f1293d
            if (r4 > 0) goto L_0x004e
            r1 = 1024(0x400, float:1.435E-42)
            goto L_0x0059
        L_0x004e:
            boolean r4 = r14.f1294e
            if (r4 == 0) goto L_0x0057
            int r4 = r14.f1293d
            int r1 = r4 * 2
            goto L_0x0059
        L_0x0057:
            int r1 = r14.f1293d
        L_0x0059:
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>(r1)
            goto L_0x0060
        L_0x005f:
            r4 = r3
        L_0x0060:
            anet.channel.util.a r1 = new anet.channel.util.a     // Catch:{ all -> 0x00dd }
            r1.<init>(r12)     // Catch:{ all -> 0x00dd }
            boolean r5 = r14.f1294e     // Catch:{ all -> 0x00db }
            if (r5 == 0) goto L_0x0070
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x00db }
            r5.<init>(r1)     // Catch:{ all -> 0x00db }
            r12 = r5
            goto L_0x0071
        L_0x0070:
            r12 = r1
        L_0x0071:
            r5 = r3
        L_0x0072:
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00db }
            boolean r6 = r6.isInterrupted()     // Catch:{ all -> 0x00db }
            if (r6 != 0) goto L_0x00d3
            if (r5 != 0) goto L_0x0086
            anet.channel.bytes.a r5 = anet.channel.bytes.a.C0000a.f1176a     // Catch:{ all -> 0x00db }
            r6 = 2048(0x800, float:2.87E-42)
            anet.channel.bytes.ByteArray r5 = r5.a((int) r6)     // Catch:{ all -> 0x00db }
        L_0x0086:
            int r6 = r5.readFrom(r12)     // Catch:{ all -> 0x00db }
            r7 = -1
            if (r6 == r7) goto L_0x00a8
            if (r4 == 0) goto L_0x0093
            r5.writeTo(r4)     // Catch:{ all -> 0x00db }
            goto L_0x0097
        L_0x0093:
            r15.onDataReceive(r5, r2)     // Catch:{ all -> 0x00db }
            r5 = r3
        L_0x0097:
            anet.channel.statist.RequestStatistic r7 = r13.f1262a     // Catch:{ all -> 0x00db }
            long r8 = r7.recDataSize     // Catch:{ all -> 0x00db }
            long r10 = (long) r6     // Catch:{ all -> 0x00db }
            long r8 = r8 + r10
            r7.recDataSize = r8     // Catch:{ all -> 0x00db }
            anet.channel.statist.RequestStatistic r6 = r13.f1262a     // Catch:{ all -> 0x00db }
            long r7 = r6.rspBodyInflateSize     // Catch:{ all -> 0x00db }
            r9 = 0
            long r7 = r7 + r10
            r6.rspBodyInflateSize = r7     // Catch:{ all -> 0x00db }
            goto L_0x0072
        L_0x00a8:
            if (r4 == 0) goto L_0x00ae
            r5.recycle()     // Catch:{ all -> 0x00db }
            goto L_0x00b1
        L_0x00ae:
            r15.onDataReceive(r5, r0)     // Catch:{ all -> 0x00db }
        L_0x00b1:
            if (r4 == 0) goto L_0x00b9
            byte[] r15 = r4.toByteArray()     // Catch:{ all -> 0x00db }
            r14.f1291b = r15     // Catch:{ all -> 0x00db }
        L_0x00b9:
            anet.channel.statist.RequestStatistic r14 = r13.f1262a
            long r2 = java.lang.System.currentTimeMillis()
            anet.channel.statist.RequestStatistic r15 = r13.f1262a
            long r4 = r15.rspStart
            long r2 = r2 - r4
            r14.recDataTime = r2
            anet.channel.statist.RequestStatistic r13 = r13.f1262a
            long r14 = r1.a()
            r13.rspBodyDeflateSize = r14
            r12.close()     // Catch:{ IOException -> 0x00d2 }
            return
        L_0x00d2:
            return
        L_0x00d3:
            java.util.concurrent.CancellationException r14 = new java.util.concurrent.CancellationException     // Catch:{ all -> 0x00db }
            java.lang.String r15 = "task cancelled"
            r14.<init>(r15)     // Catch:{ all -> 0x00db }
            throw r14     // Catch:{ all -> 0x00db }
        L_0x00db:
            r14 = move-exception
            goto L_0x00df
        L_0x00dd:
            r14 = move-exception
            r1 = r3
        L_0x00df:
            anet.channel.statist.RequestStatistic r15 = r13.f1262a
            long r2 = java.lang.System.currentTimeMillis()
            anet.channel.statist.RequestStatistic r0 = r13.f1262a
            long r4 = r0.rspStart
            long r2 = r2 - r4
            r15.recDataTime = r2
            anet.channel.statist.RequestStatistic r13 = r13.f1262a
            long r0 = r1.a()
            r13.rspBodyDeflateSize = r0
            if (r12 == 0) goto L_0x00f9
            r12.close()     // Catch:{ IOException -> 0x00f9 }
        L_0x00f9:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.b.a(java.net.HttpURLConnection, anet.channel.request.Request, anet.channel.session.b$a, anet.channel.RequestCb):void");
    }

    private static void a(Request request, a aVar, RequestCb requestCb, int i, Throwable th) {
        String errMsg = ErrorConstant.getErrMsg(i);
        ALog.e("awcn.HttpConnector", "onException", request.getSeq(), "errorCode", Integer.valueOf(i), "errMsg", errMsg, PushConstants.WEB_URL, request.getUrlString(), "host", request.getHost());
        if (aVar != null) {
            aVar.f1290a = i;
        }
        if (!request.f1262a.isDone.get()) {
            request.f1262a.statusCode = i;
            request.f1262a.msg = errMsg;
            request.f1262a.rspEnd = System.currentTimeMillis();
            if (i != -204) {
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(i, errMsg, request.f1262a, th));
            }
        }
        if (requestCb != null) {
            requestCb.onFinish(i, errMsg, request.f1262a);
        }
    }
}
