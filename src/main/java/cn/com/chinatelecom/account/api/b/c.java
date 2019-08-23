package cn.com.chinatelecom.account.api.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.CtAuth;
import java.net.HttpURLConnection;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1771a = "c";

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02b1, code lost:
        if (r11 == null) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0176, code lost:
        if (r11 != null) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0178, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01cb, code lost:
        if (r11 == null) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0217, code lost:
        if (r11 == null) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0264, code lost:
        if (r11 == null) goto L_0x02b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02a9 A[SYNTHETIC, Splitter:B:104:0x02a9] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02ae A[Catch:{ Exception -> 0x02b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02b9 A[SYNTHETIC, Splitter:B:113:0x02b9] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02be A[Catch:{ Exception -> 0x02c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02c3 A[Catch:{ Exception -> 0x02c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c3 A[SYNTHETIC, Splitter:B:74:0x01c3] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c8 A[Catch:{ Exception -> 0x02b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x020f A[SYNTHETIC, Splitter:B:84:0x020f] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0214 A[Catch:{ Exception -> 0x02b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x025c A[SYNTHETIC, Splitter:B:94:0x025c] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0261 A[Catch:{ Exception -> 0x02b5 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:81:0x01d1=Splitter:B:81:0x01d1, B:71:0x0185=Splitter:B:71:0x0185, B:101:0x026b=Splitter:B:101:0x026b, B:91:0x021e=Splitter:B:91:0x021e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static cn.com.chinatelecom.account.api.b.e a(android.content.Context r10, java.lang.String r11, android.net.Network r12, java.lang.String r13) {
        /*
            cn.com.chinatelecom.account.api.b.e r0 = new cn.com.chinatelecom.account.api.b.e
            r0.<init>()
            java.lang.String r1 = ""
            r2 = 0
            int r3 = cn.com.chinatelecom.account.api.CtSetting.getConnTimeout(r2)
            int r4 = cn.com.chinatelecom.account.api.CtSetting.getReadTimeout(r2)
            java.net.URL r5 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r5.<init>(r11)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r11 = 21
            if (r12 == 0) goto L_0x0024
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            if (r6 < r11) goto L_0x0024
            java.net.URLConnection r5 = r12.openConnection(r5)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
        L_0x0021:
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            goto L_0x0029
        L_0x0024:
            java.net.URLConnection r5 = r5.openConnection()     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            goto L_0x0021
        L_0x0029:
            java.lang.String r6 = "accept"
            java.lang.String r7 = "*/*"
            r5.setRequestProperty(r6, r7)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            java.lang.String r6 = "connection"
            java.lang.String r7 = "Keep-Alive"
            r5.setRequestProperty(r6, r7)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            java.lang.String r6 = "GET"
            r5.setRequestMethod(r6)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r6 = 0
            r5.setDoOutput(r6)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r7 = 1
            r5.setDoInput(r7)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r5.setConnectTimeout(r3)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r5.setReadTimeout(r4)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r5.setUseCaches(r6)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            java.lang.String r8 = "Accept-Charset"
            java.lang.String r9 = "UTF-8"
            r5.addRequestProperty(r8, r9)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            a((java.net.HttpURLConnection) r5, (android.content.Context) r10)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r5.connect()     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            int r8 = r5.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r9 = 302(0x12e, float:4.23E-43)
            if (r8 != r9) goto L_0x00ae
            java.lang.String r8 = "Location"
            java.lang.String r5 = r5.getHeaderField(r8)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            java.net.URL r8 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r8.<init>(r5)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            if (r12 == 0) goto L_0x0078
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            if (r5 < r11) goto L_0x0078
            java.net.URLConnection r11 = r12.openConnection(r8)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            goto L_0x007c
        L_0x0078:
            java.net.URLConnection r11 = r8.openConnection()     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
        L_0x007c:
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r5 = r11
            java.lang.String r11 = "accept"
            java.lang.String r12 = "*/*"
            r5.setRequestProperty(r11, r12)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            java.lang.String r11 = "connection"
            java.lang.String r12 = "Keep-Alive"
            r5.setRequestProperty(r11, r12)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            java.lang.String r11 = "GET"
            r5.setRequestMethod(r11)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r5.setDoOutput(r6)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r5.setDoInput(r7)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r5.setConnectTimeout(r3)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r5.setReadTimeout(r4)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r5.setUseCaches(r6)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            java.lang.String r11 = "Accept-Charset"
            java.lang.String r12 = "UTF-8"
            r5.addRequestProperty(r11, r12)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            a((java.net.HttpURLConnection) r5, (android.content.Context) r10)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r5.connect()     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
        L_0x00ae:
            int r11 = r5.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r12 = 200(0xc8, float:2.8E-43)
            if (r11 != r12) goto L_0x012a
            java.io.InputStream r11 = r5.getInputStream()     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            java.io.InputStreamReader r12 = new java.io.InputStreamReader     // Catch:{ SocketTimeoutException -> 0x0126, UnknownHostException -> 0x0122, IOException -> 0x011e, Throwable -> 0x011a, all -> 0x0116 }
            r12.<init>(r11)     // Catch:{ SocketTimeoutException -> 0x0126, UnknownHostException -> 0x0122, IOException -> 0x011e, Throwable -> 0x011a, all -> 0x0116 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ SocketTimeoutException -> 0x0113, UnknownHostException -> 0x0110, IOException -> 0x010d, Throwable -> 0x010a }
            r3.<init>(r12)     // Catch:{ SocketTimeoutException -> 0x0113, UnknownHostException -> 0x0110, IOException -> 0x010d, Throwable -> 0x010a }
        L_0x00c4:
            java.lang.String r2 = r3.readLine()     // Catch:{ SocketTimeoutException -> 0x0106, UnknownHostException -> 0x0102, IOException -> 0x00fe, Throwable -> 0x00fa, all -> 0x00f6 }
            if (r2 == 0) goto L_0x00da
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0106, UnknownHostException -> 0x0102, IOException -> 0x00fe, Throwable -> 0x00fa, all -> 0x00f6 }
            r4.<init>()     // Catch:{ SocketTimeoutException -> 0x0106, UnknownHostException -> 0x0102, IOException -> 0x00fe, Throwable -> 0x00fa, all -> 0x00f6 }
            r4.append(r1)     // Catch:{ SocketTimeoutException -> 0x0106, UnknownHostException -> 0x0102, IOException -> 0x00fe, Throwable -> 0x00fa, all -> 0x00f6 }
            r4.append(r2)     // Catch:{ SocketTimeoutException -> 0x0106, UnknownHostException -> 0x0102, IOException -> 0x00fe, Throwable -> 0x00fa, all -> 0x00f6 }
            java.lang.String r1 = r4.toString()     // Catch:{ SocketTimeoutException -> 0x0106, UnknownHostException -> 0x0102, IOException -> 0x00fe, Throwable -> 0x00fa, all -> 0x00f6 }
            goto L_0x00c4
        L_0x00da:
            r0.f1780a = r6     // Catch:{ SocketTimeoutException -> 0x0106, UnknownHostException -> 0x0102, IOException -> 0x00fe, Throwable -> 0x00fa, all -> 0x00f6 }
            r0.f1781b = r1     // Catch:{ SocketTimeoutException -> 0x0106, UnknownHostException -> 0x0102, IOException -> 0x00fe, Throwable -> 0x00fa, all -> 0x00f6 }
            cn.com.chinatelecom.account.api.c.e r1 = cn.com.chinatelecom.account.api.c.f.a((java.lang.String) r13)     // Catch:{ SocketTimeoutException -> 0x0106, UnknownHostException -> 0x0102, IOException -> 0x00fe, Throwable -> 0x00fa, all -> 0x00f6 }
            r1.a((int) r6)     // Catch:{ SocketTimeoutException -> 0x0106, UnknownHostException -> 0x0102, IOException -> 0x00fe, Throwable -> 0x00fa, all -> 0x00f6 }
            cn.com.chinatelecom.account.api.b.b r10 = cn.com.chinatelecom.account.api.c.a.a((android.content.Context) r10, (java.net.HttpURLConnection) r5, (boolean) r7)     // Catch:{ SocketTimeoutException -> 0x0106, UnknownHostException -> 0x0102, IOException -> 0x00fe, Throwable -> 0x00fa, all -> 0x00f6 }
            if (r10 == 0) goto L_0x00f3
            boolean r1 = r10.f1770b     // Catch:{ SocketTimeoutException -> 0x0106, UnknownHostException -> 0x0102, IOException -> 0x00fe, Throwable -> 0x00fa, all -> 0x00f6 }
            r0.f1782c = r1     // Catch:{ SocketTimeoutException -> 0x0106, UnknownHostException -> 0x0102, IOException -> 0x00fe, Throwable -> 0x00fa, all -> 0x00f6 }
            java.lang.String r10 = r10.f1769a     // Catch:{ SocketTimeoutException -> 0x0106, UnknownHostException -> 0x0102, IOException -> 0x00fe, Throwable -> 0x00fa, all -> 0x00f6 }
            r0.f1783d = r10     // Catch:{ SocketTimeoutException -> 0x0106, UnknownHostException -> 0x0102, IOException -> 0x00fe, Throwable -> 0x00fa, all -> 0x00f6 }
        L_0x00f3:
            r2 = r3
            goto L_0x016c
        L_0x00f6:
            r10 = move-exception
            r2 = r3
            goto L_0x02b7
        L_0x00fa:
            r10 = move-exception
            r2 = r3
            goto L_0x0185
        L_0x00fe:
            r10 = move-exception
            r2 = r3
            goto L_0x01d1
        L_0x0102:
            r10 = move-exception
            r2 = r3
            goto L_0x021e
        L_0x0106:
            r10 = move-exception
            r2 = r3
            goto L_0x026b
        L_0x010a:
            r10 = move-exception
            goto L_0x0185
        L_0x010d:
            r10 = move-exception
            goto L_0x01d1
        L_0x0110:
            r10 = move-exception
            goto L_0x021e
        L_0x0113:
            r10 = move-exception
            goto L_0x026b
        L_0x0116:
            r10 = move-exception
            r12 = r2
            goto L_0x02b7
        L_0x011a:
            r10 = move-exception
            r12 = r2
            goto L_0x0185
        L_0x011e:
            r10 = move-exception
            r12 = r2
            goto L_0x01d1
        L_0x0122:
            r10 = move-exception
            r12 = r2
            goto L_0x021e
        L_0x0126:
            r10 = move-exception
            r12 = r2
            goto L_0x026b
        L_0x012a:
            java.lang.String r10 = f1771a     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            java.lang.String r1 = "redirect 30002 Http response code : "
            r12.<init>(r1)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r12.append(r11)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            java.lang.String r12 = r12.toString()     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            cn.com.chinatelecom.account.api.CtAuth.info(r10, r12)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            cn.com.chinatelecom.account.api.c.e r10 = cn.com.chinatelecom.account.api.c.f.a((java.lang.String) r13)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            java.lang.String r1 = "redirect Http response code ："
            r12.<init>(r1)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r12.append(r11)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            java.lang.String r12 = r12.toString()     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            cn.com.chinatelecom.account.api.c.e r10 = r10.f(r12)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r12 = -8101(0xffffffffffffe05b, float:NaN)
            cn.com.chinatelecom.account.api.c.e r10 = r10.a((int) r12)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            java.lang.String r1 = "响应码错误-response code : "
            r12.<init>(r1)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r12.append(r11)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            java.lang.String r11 = r12.toString()     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r10.e(r11)     // Catch:{ SocketTimeoutException -> 0x0268, UnknownHostException -> 0x021b, IOException -> 0x01ce, Throwable -> 0x0182, all -> 0x017d }
            r11 = r2
            r12 = r11
        L_0x016c:
            if (r2 == 0) goto L_0x0171
            r2.close()     // Catch:{ Exception -> 0x02b5 }
        L_0x0171:
            if (r12 == 0) goto L_0x0176
            r12.close()     // Catch:{ Exception -> 0x02b5 }
        L_0x0176:
            if (r11 == 0) goto L_0x02b5
        L_0x0178:
            r11.close()     // Catch:{ Exception -> 0x02b5 }
            goto L_0x02b5
        L_0x017d:
            r10 = move-exception
            r11 = r2
            r12 = r11
            goto L_0x02b7
        L_0x0182:
            r10 = move-exception
            r11 = r2
            r12 = r11
        L_0x0185:
            java.lang.String r1 = f1771a     // Catch:{ all -> 0x02b6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b6 }
            java.lang.String r4 = "doGet Throwable : "
            r3.<init>(r4)     // Catch:{ all -> 0x02b6 }
            java.lang.String r4 = r10.getMessage()     // Catch:{ all -> 0x02b6 }
            r3.append(r4)     // Catch:{ all -> 0x02b6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02b6 }
            cn.com.chinatelecom.account.api.CtAuth.warn(r1, r3, r10)     // Catch:{ all -> 0x02b6 }
            cn.com.chinatelecom.account.api.c.e r13 = cn.com.chinatelecom.account.api.c.f.a((java.lang.String) r13)     // Catch:{ all -> 0x02b6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b6 }
            java.lang.String r3 = "doGet Throwable -- "
            r1.<init>(r3)     // Catch:{ all -> 0x02b6 }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x02b6 }
            r1.append(r10)     // Catch:{ all -> 0x02b6 }
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x02b6 }
            cn.com.chinatelecom.account.api.c.e r10 = r13.f(r10)     // Catch:{ all -> 0x02b6 }
            r13 = -8001(0xffffffffffffe0bf, float:NaN)
            cn.com.chinatelecom.account.api.c.e r10 = r10.a((int) r13)     // Catch:{ all -> 0x02b6 }
            java.lang.String r13 = "请求网络异常"
            r10.e(r13)     // Catch:{ all -> 0x02b6 }
            if (r2 == 0) goto L_0x01c6
            r2.close()     // Catch:{ Exception -> 0x02b5 }
        L_0x01c6:
            if (r12 == 0) goto L_0x01cb
            r12.close()     // Catch:{ Exception -> 0x02b5 }
        L_0x01cb:
            if (r11 == 0) goto L_0x02b5
            goto L_0x0178
        L_0x01ce:
            r10 = move-exception
            r11 = r2
            r12 = r11
        L_0x01d1:
            java.lang.String r1 = f1771a     // Catch:{ all -> 0x02b6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b6 }
            java.lang.String r4 = "doGet IOException : "
            r3.<init>(r4)     // Catch:{ all -> 0x02b6 }
            java.lang.String r4 = r10.getMessage()     // Catch:{ all -> 0x02b6 }
            r3.append(r4)     // Catch:{ all -> 0x02b6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02b6 }
            cn.com.chinatelecom.account.api.CtAuth.warn(r1, r3, r10)     // Catch:{ all -> 0x02b6 }
            cn.com.chinatelecom.account.api.c.e r13 = cn.com.chinatelecom.account.api.c.f.a((java.lang.String) r13)     // Catch:{ all -> 0x02b6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b6 }
            java.lang.String r3 = "doGet IOException -- "
            r1.<init>(r3)     // Catch:{ all -> 0x02b6 }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x02b6 }
            r1.append(r10)     // Catch:{ all -> 0x02b6 }
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x02b6 }
            cn.com.chinatelecom.account.api.c.e r10 = r13.f(r10)     // Catch:{ all -> 0x02b6 }
            r13 = -8104(0xffffffffffffe058, float:NaN)
            cn.com.chinatelecom.account.api.c.e r10 = r10.a((int) r13)     // Catch:{ all -> 0x02b6 }
            java.lang.String r13 = "IO异常"
            r10.e(r13)     // Catch:{ all -> 0x02b6 }
            if (r2 == 0) goto L_0x0212
            r2.close()     // Catch:{ Exception -> 0x02b5 }
        L_0x0212:
            if (r12 == 0) goto L_0x0217
            r12.close()     // Catch:{ Exception -> 0x02b5 }
        L_0x0217:
            if (r11 == 0) goto L_0x02b5
            goto L_0x0178
        L_0x021b:
            r10 = move-exception
            r11 = r2
            r12 = r11
        L_0x021e:
            java.lang.String r1 = f1771a     // Catch:{ all -> 0x02b6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b6 }
            java.lang.String r4 = "doGet UnknownHostException : "
            r3.<init>(r4)     // Catch:{ all -> 0x02b6 }
            java.lang.String r4 = r10.getMessage()     // Catch:{ all -> 0x02b6 }
            r3.append(r4)     // Catch:{ all -> 0x02b6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02b6 }
            cn.com.chinatelecom.account.api.CtAuth.warn(r1, r3, r10)     // Catch:{ all -> 0x02b6 }
            cn.com.chinatelecom.account.api.c.e r13 = cn.com.chinatelecom.account.api.c.f.a((java.lang.String) r13)     // Catch:{ all -> 0x02b6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b6 }
            java.lang.String r3 = "doGet UnknownHostException -- "
            r1.<init>(r3)     // Catch:{ all -> 0x02b6 }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x02b6 }
            r1.append(r10)     // Catch:{ all -> 0x02b6 }
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x02b6 }
            cn.com.chinatelecom.account.api.c.e r10 = r13.f(r10)     // Catch:{ all -> 0x02b6 }
            r13 = -8103(0xffffffffffffe059, float:NaN)
            cn.com.chinatelecom.account.api.c.e r10 = r10.a((int) r13)     // Catch:{ all -> 0x02b6 }
            java.lang.String r13 = "域名解析异常"
            r10.e(r13)     // Catch:{ all -> 0x02b6 }
            if (r2 == 0) goto L_0x025f
            r2.close()     // Catch:{ Exception -> 0x02b5 }
        L_0x025f:
            if (r12 == 0) goto L_0x0264
            r12.close()     // Catch:{ Exception -> 0x02b5 }
        L_0x0264:
            if (r11 == 0) goto L_0x02b5
            goto L_0x0178
        L_0x0268:
            r10 = move-exception
            r11 = r2
            r12 = r11
        L_0x026b:
            java.lang.String r1 = f1771a     // Catch:{ all -> 0x02b6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b6 }
            java.lang.String r4 = "doGet SocketTimeoutException : "
            r3.<init>(r4)     // Catch:{ all -> 0x02b6 }
            java.lang.String r4 = r10.getMessage()     // Catch:{ all -> 0x02b6 }
            r3.append(r4)     // Catch:{ all -> 0x02b6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02b6 }
            cn.com.chinatelecom.account.api.CtAuth.warn(r1, r3, r10)     // Catch:{ all -> 0x02b6 }
            cn.com.chinatelecom.account.api.c.e r13 = cn.com.chinatelecom.account.api.c.f.a((java.lang.String) r13)     // Catch:{ all -> 0x02b6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b6 }
            java.lang.String r3 = "doGet SocketTimeoutException -- "
            r1.<init>(r3)     // Catch:{ all -> 0x02b6 }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x02b6 }
            r1.append(r10)     // Catch:{ all -> 0x02b6 }
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x02b6 }
            cn.com.chinatelecom.account.api.c.e r10 = r13.f(r10)     // Catch:{ all -> 0x02b6 }
            r13 = -8102(0xffffffffffffe05a, float:NaN)
            cn.com.chinatelecom.account.api.c.e r10 = r10.a((int) r13)     // Catch:{ all -> 0x02b6 }
            java.lang.String r13 = "Socket超时异常"
            r10.e(r13)     // Catch:{ all -> 0x02b6 }
            if (r2 == 0) goto L_0x02ac
            r2.close()     // Catch:{ Exception -> 0x02b5 }
        L_0x02ac:
            if (r12 == 0) goto L_0x02b1
            r12.close()     // Catch:{ Exception -> 0x02b5 }
        L_0x02b1:
            if (r11 == 0) goto L_0x02b5
            goto L_0x0178
        L_0x02b5:
            return r0
        L_0x02b6:
            r10 = move-exception
        L_0x02b7:
            if (r2 == 0) goto L_0x02bc
            r2.close()     // Catch:{ Exception -> 0x02c6 }
        L_0x02bc:
            if (r12 == 0) goto L_0x02c1
            r12.close()     // Catch:{ Exception -> 0x02c6 }
        L_0x02c1:
            if (r11 == 0) goto L_0x02c6
            r11.close()     // Catch:{ Exception -> 0x02c6 }
        L_0x02c6:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.b.c.a(android.content.Context, java.lang.String, android.net.Network, java.lang.String):cn.com.chinatelecom.account.api.b.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0332, code lost:
        if (r2 == null) goto L_0x03ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03a8, code lost:
        if (r2 == null) goto L_0x03ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03b6, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01bf, code lost:
        if (r2 != null) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c1, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01cb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ce, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d2, code lost:
        r1 = r0;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0246, code lost:
        if (r2 == null) goto L_0x03ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02bc, code lost:
        if (r2 == null) goto L_0x03ac;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x032f A[SYNTHETIC, Splitter:B:104:0x032f] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03a5 A[SYNTHETIC, Splitter:B:113:0x03a5] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03b1 A[SYNTHETIC, Splitter:B:121:0x03b1] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03b6 A[Catch:{ IOException -> 0x03b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d1 A[ExcHandler: all (r0v9 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0012] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0243 A[SYNTHETIC, Splitter:B:86:0x0243] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02b9 A[SYNTHETIC, Splitter:B:95:0x02b9] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:101:0x02c5=Splitter:B:101:0x02c5, B:83:0x01db=Splitter:B:83:0x01db, B:110:0x033b=Splitter:B:110:0x033b, B:92:0x024f=Splitter:B:92:0x024f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static cn.com.chinatelecom.account.api.b.e a(android.content.Context r16, java.lang.String r17, java.lang.String r18, cn.com.chinatelecom.account.api.CtSetting r19, android.net.Network r20, boolean r21, int r22, java.lang.String r23, java.lang.String r24) {
        /*
            r1 = r16
            r10 = r18
            r5 = r20
            r2 = r22
            r11 = r23
            cn.com.chinatelecom.account.api.b.e r12 = new cn.com.chinatelecom.account.api.b.e
            r12.<init>()
            r13 = 0
            r14 = -8001(0xffffffffffffe0bf, float:NaN)
            boolean r3 = cn.com.chinatelecom.account.api.c.g.d(r16)     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
            int r4 = cn.com.chinatelecom.account.api.CtSetting.getConnTimeout(r19)     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
            int r6 = cn.com.chinatelecom.account.api.CtSetting.getReadTimeout(r19)     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
            r7 = 21
            if (r2 <= 0) goto L_0x002b
            if (r3 != 0) goto L_0x002b
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
            if (r8 >= r7) goto L_0x002b
            a((android.content.Context) r16, (java.lang.String) r17)     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
        L_0x002b:
            java.net.URL r8 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
            r9 = r17
            r8.<init>(r9)     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
            if (r5 == 0) goto L_0x003f
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
            if (r9 < r7) goto L_0x003f
            java.net.URLConnection r8 = r5.openConnection(r8)     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
        L_0x003c:
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
            goto L_0x0044
        L_0x003f:
            java.net.URLConnection r8 = r8.openConnection()     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
            goto L_0x003c
        L_0x0044:
            java.lang.String r9 = "accept"
            java.lang.String r15 = "*/*"
            r8.setRequestProperty(r9, r15)     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
            java.lang.String r9 = "POST"
            r8.setRequestMethod(r9)     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
            r9 = 1
            r8.setDoOutput(r9)     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
            r8.setDoInput(r9)     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
            r8.setConnectTimeout(r4)     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
            r8.setReadTimeout(r6)     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
            r4 = 0
            r8.setUseCaches(r4)     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
            if (r3 != 0) goto L_0x006a
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
            if (r3 >= r7) goto L_0x006a
            r8.setInstanceFollowRedirects(r4)     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
        L_0x006a:
            java.lang.String r3 = "Accept-Charset"
            java.lang.String r6 = "UTF-8"
            r8.addRequestProperty(r3, r6)     // Catch:{ SocketTimeoutException -> 0x0336, UnknownHostException -> 0x02c0, IOException -> 0x024a, Throwable -> 0x01d6, all -> 0x01d1 }
            java.lang.String r3 = "reqId"
            r15 = r24
            r8.addRequestProperty(r3, r15)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            java.lang.String r3 = "deviceId"
            java.lang.String r6 = cn.com.chinatelecom.account.api.c.d.e(r16)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            r8.addRequestProperty(r3, r6)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            a((java.net.HttpURLConnection) r8, (android.content.Context) r1)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            boolean r3 = android.text.TextUtils.isEmpty(r18)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            if (r3 != 0) goto L_0x00a8
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            java.io.OutputStream r7 = r8.getOutputStream()     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            r6.<init>(r7)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            r3.<init>(r6)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            java.lang.String r6 = "UTF-8"
            byte[] r6 = r10.getBytes(r6)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            r3.write(r6)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            r3.flush()     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            r3.close()     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            goto L_0x00ab
        L_0x00a8:
            r8.connect()     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
        L_0x00ab:
            int r3 = r8.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r3 != r6) goto L_0x0119
            java.io.InputStream r2 = r8.getInputStream()     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0115, UnknownHostException -> 0x0111, IOException -> 0x010d, Throwable -> 0x0109 }
            r3.<init>()     // Catch:{ SocketTimeoutException -> 0x0115, UnknownHostException -> 0x0111, IOException -> 0x010d, Throwable -> 0x0109 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ SocketTimeoutException -> 0x0115, UnknownHostException -> 0x0111, IOException -> 0x010d, Throwable -> 0x0109 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ SocketTimeoutException -> 0x0115, UnknownHostException -> 0x0111, IOException -> 0x010d, Throwable -> 0x0109 }
            r6.<init>(r2)     // Catch:{ SocketTimeoutException -> 0x0115, UnknownHostException -> 0x0111, IOException -> 0x010d, Throwable -> 0x0109 }
            r5.<init>(r6)     // Catch:{ SocketTimeoutException -> 0x0115, UnknownHostException -> 0x0111, IOException -> 0x010d, Throwable -> 0x0109 }
        L_0x00c6:
            java.lang.String r6 = r5.readLine()     // Catch:{ SocketTimeoutException -> 0x0104, UnknownHostException -> 0x00ff, IOException -> 0x00fa, Throwable -> 0x00f5, all -> 0x00f0 }
            if (r6 == 0) goto L_0x00d5
            r3.append(r6)     // Catch:{ SocketTimeoutException -> 0x0104, UnknownHostException -> 0x00ff, IOException -> 0x00fa, Throwable -> 0x00f5, all -> 0x00f0 }
            java.lang.String r6 = "\n"
            r3.append(r6)     // Catch:{ SocketTimeoutException -> 0x0104, UnknownHostException -> 0x00ff, IOException -> 0x00fa, Throwable -> 0x00f5, all -> 0x00f0 }
            goto L_0x00c6
        L_0x00d5:
            r12.f1780a = r4     // Catch:{ SocketTimeoutException -> 0x0104, UnknownHostException -> 0x00ff, IOException -> 0x00fa, Throwable -> 0x00f5, all -> 0x00f0 }
            java.lang.String r3 = r3.toString()     // Catch:{ SocketTimeoutException -> 0x0104, UnknownHostException -> 0x00ff, IOException -> 0x00fa, Throwable -> 0x00f5, all -> 0x00f0 }
            r12.f1781b = r3     // Catch:{ SocketTimeoutException -> 0x0104, UnknownHostException -> 0x00ff, IOException -> 0x00fa, Throwable -> 0x00f5, all -> 0x00f0 }
            r6 = r21
            cn.com.chinatelecom.account.api.b.b r1 = cn.com.chinatelecom.account.api.c.a.a((android.content.Context) r1, (java.net.HttpURLConnection) r8, (boolean) r6)     // Catch:{ SocketTimeoutException -> 0x0104, UnknownHostException -> 0x00ff, IOException -> 0x00fa, Throwable -> 0x00f5, all -> 0x00f0 }
            if (r1 == 0) goto L_0x00ed
            boolean r3 = r1.f1770b     // Catch:{ SocketTimeoutException -> 0x0104, UnknownHostException -> 0x00ff, IOException -> 0x00fa, Throwable -> 0x00f5, all -> 0x00f0 }
            r12.f1782c = r3     // Catch:{ SocketTimeoutException -> 0x0104, UnknownHostException -> 0x00ff, IOException -> 0x00fa, Throwable -> 0x00f5, all -> 0x00f0 }
            java.lang.String r1 = r1.f1769a     // Catch:{ SocketTimeoutException -> 0x0104, UnknownHostException -> 0x00ff, IOException -> 0x00fa, Throwable -> 0x00f5, all -> 0x00f0 }
            r12.f1783d = r1     // Catch:{ SocketTimeoutException -> 0x0104, UnknownHostException -> 0x00ff, IOException -> 0x00fa, Throwable -> 0x00f5, all -> 0x00f0 }
        L_0x00ed:
            r13 = r5
            goto L_0x01ba
        L_0x00f0:
            r0 = move-exception
            r1 = r0
            r13 = r5
            goto L_0x03af
        L_0x00f5:
            r0 = move-exception
            r1 = r0
            r13 = r5
            goto L_0x01db
        L_0x00fa:
            r0 = move-exception
            r1 = r0
            r13 = r5
            goto L_0x024f
        L_0x00ff:
            r0 = move-exception
            r1 = r0
            r13 = r5
            goto L_0x02c5
        L_0x0104:
            r0 = move-exception
            r1 = r0
            r13 = r5
            goto L_0x033b
        L_0x0109:
            r0 = move-exception
            r1 = r0
            goto L_0x01db
        L_0x010d:
            r0 = move-exception
            r1 = r0
            goto L_0x024f
        L_0x0111:
            r0 = move-exception
            r1 = r0
            goto L_0x02c5
        L_0x0115:
            r0 = move-exception
            r1 = r0
            goto L_0x033b
        L_0x0119:
            r6 = r21
            r4 = 302(0x12e, float:4.23E-43)
            if (r3 != r4) goto L_0x0159
            r3 = 10
            if (r2 >= r3) goto L_0x013d
            int r7 = r2 + 1
            java.lang.String r2 = "Location"
            java.lang.String r2 = r8.getHeaderField(r2)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            r3 = 0
            java.lang.String r8 = "redirect"
            r1 = r16
            r4 = r19
            r5 = r20
            r6 = r21
            r9 = r24
            cn.com.chinatelecom.account.api.b.e r1 = a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            return r1
        L_0x013d:
            java.lang.String r1 = "请求网络异常-Redirect more than 10 times"
            java.lang.String r1 = cn.com.chinatelecom.account.api.c.k.a(r14, r1)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            r12.f1781b = r1     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            cn.com.chinatelecom.account.api.c.e r1 = cn.com.chinatelecom.account.api.c.f.a((java.lang.String) r24)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            java.lang.String r2 = "Redirect more than 10 times"
            cn.com.chinatelecom.account.api.c.e r1 = r1.f(r2)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            cn.com.chinatelecom.account.api.c.e r1 = r1.a((int) r14)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            java.lang.String r2 = "请求网络异常-Redirect more than 10 times"
            r1.e(r2)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            goto L_0x01b9
        L_0x0159:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            java.lang.String r2 = "响应码错误-"
            r1.<init>(r2)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            r1.append(r11)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            java.lang.String r2 = "-code : "
            r1.append(r2)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            r1.append(r3)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            java.lang.String r1 = r1.toString()     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            r2 = -8101(0xffffffffffffe05b, float:NaN)
            java.lang.String r1 = cn.com.chinatelecom.account.api.c.k.a(r2, r1)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            r12.f1781b = r1     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            java.lang.String r1 = f1771a     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            java.lang.String r5 = "doPost > Http response code :"
            r4.<init>(r5)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            r4.append(r3)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            java.lang.String r4 = r4.toString()     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            cn.com.chinatelecom.account.api.CtAuth.info(r1, r4)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            cn.com.chinatelecom.account.api.c.e r1 = cn.com.chinatelecom.account.api.c.f.a((java.lang.String) r24)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            java.lang.String r5 = "doPost Http response code ："
            r4.<init>(r5)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            r4.append(r3)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            java.lang.String r4 = r4.toString()     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            cn.com.chinatelecom.account.api.c.e r1 = r1.f(r4)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            cn.com.chinatelecom.account.api.c.e r1 = r1.a((int) r2)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            java.lang.String r4 = "响应码错误-response code : "
            r2.<init>(r4)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            r2.append(r3)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            java.lang.String r2 = r2.toString()     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            cn.com.chinatelecom.account.api.c.e r1 = r1.e(r2)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
            r1.d(r10)     // Catch:{ SocketTimeoutException -> 0x01ce, UnknownHostException -> 0x01cb, IOException -> 0x01c8, Throwable -> 0x01c6, all -> 0x01d1 }
        L_0x01b9:
            r2 = r13
        L_0x01ba:
            if (r13 == 0) goto L_0x01bf
            r13.close()     // Catch:{ IOException -> 0x03ac }
        L_0x01bf:
            if (r2 == 0) goto L_0x03ac
        L_0x01c1:
            r2.close()     // Catch:{ IOException -> 0x03ac }
            goto L_0x03ac
        L_0x01c6:
            r0 = move-exception
            goto L_0x01d9
        L_0x01c8:
            r0 = move-exception
            goto L_0x024d
        L_0x01cb:
            r0 = move-exception
            goto L_0x02c3
        L_0x01ce:
            r0 = move-exception
            goto L_0x0339
        L_0x01d1:
            r0 = move-exception
            r1 = r0
            r2 = r13
            goto L_0x03af
        L_0x01d6:
            r0 = move-exception
            r15 = r24
        L_0x01d9:
            r1 = r0
            r2 = r13
        L_0x01db:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ad }
            java.lang.String r4 = "请求网络异常-"
            r3.<init>(r4)     // Catch:{ all -> 0x03ad }
            r3.append(r11)     // Catch:{ all -> 0x03ad }
            java.lang.String r4 = "-"
            r3.append(r4)     // Catch:{ all -> 0x03ad }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x03ad }
            r3.append(r4)     // Catch:{ all -> 0x03ad }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x03ad }
            java.lang.String r3 = cn.com.chinatelecom.account.api.c.k.a(r14, r3)     // Catch:{ all -> 0x03ad }
            r12.f1781b = r3     // Catch:{ all -> 0x03ad }
            java.lang.String r3 = f1771a     // Catch:{ all -> 0x03ad }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ad }
            java.lang.String r5 = "doPost Throwable-"
            r4.<init>(r5)     // Catch:{ all -> 0x03ad }
            r4.append(r11)     // Catch:{ all -> 0x03ad }
            java.lang.String r5 = "-"
            r4.append(r5)     // Catch:{ all -> 0x03ad }
            java.lang.String r5 = r1.getMessage()     // Catch:{ all -> 0x03ad }
            r4.append(r5)     // Catch:{ all -> 0x03ad }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x03ad }
            cn.com.chinatelecom.account.api.CtAuth.warn(r3, r4, r1)     // Catch:{ all -> 0x03ad }
            cn.com.chinatelecom.account.api.c.e r3 = cn.com.chinatelecom.account.api.c.f.a((java.lang.String) r24)     // Catch:{ all -> 0x03ad }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ad }
            java.lang.String r5 = "doPost Throwable -- "
            r4.<init>(r5)     // Catch:{ all -> 0x03ad }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x03ad }
            r4.append(r1)     // Catch:{ all -> 0x03ad }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x03ad }
            cn.com.chinatelecom.account.api.c.e r1 = r3.f(r1)     // Catch:{ all -> 0x03ad }
            cn.com.chinatelecom.account.api.c.e r1 = r1.a((int) r14)     // Catch:{ all -> 0x03ad }
            java.lang.String r3 = "请求网络异常"
            cn.com.chinatelecom.account.api.c.e r1 = r1.e(r3)     // Catch:{ all -> 0x03ad }
            r1.d(r10)     // Catch:{ all -> 0x03ad }
            if (r13 == 0) goto L_0x0246
            r13.close()     // Catch:{ IOException -> 0x03ac }
        L_0x0246:
            if (r2 == 0) goto L_0x03ac
            goto L_0x01c1
        L_0x024a:
            r0 = move-exception
            r15 = r24
        L_0x024d:
            r1 = r0
            r2 = r13
        L_0x024f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ad }
            java.lang.String r4 = "IO异常-"
            r3.<init>(r4)     // Catch:{ all -> 0x03ad }
            r3.append(r11)     // Catch:{ all -> 0x03ad }
            java.lang.String r4 = "-"
            r3.append(r4)     // Catch:{ all -> 0x03ad }
            java.lang.String r4 = r1.getMessage()     // Catch:{ all -> 0x03ad }
            r3.append(r4)     // Catch:{ all -> 0x03ad }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x03ad }
            r4 = -8104(0xffffffffffffe058, float:NaN)
            java.lang.String r3 = cn.com.chinatelecom.account.api.c.k.a(r4, r3)     // Catch:{ all -> 0x03ad }
            r12.f1781b = r3     // Catch:{ all -> 0x03ad }
            java.lang.String r3 = f1771a     // Catch:{ all -> 0x03ad }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ad }
            java.lang.String r6 = "doPost IOException-"
            r5.<init>(r6)     // Catch:{ all -> 0x03ad }
            r5.append(r11)     // Catch:{ all -> 0x03ad }
            java.lang.String r6 = "-"
            r5.append(r6)     // Catch:{ all -> 0x03ad }
            java.lang.String r6 = r1.getMessage()     // Catch:{ all -> 0x03ad }
            r5.append(r6)     // Catch:{ all -> 0x03ad }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x03ad }
            cn.com.chinatelecom.account.api.CtAuth.warn(r3, r5, r1)     // Catch:{ all -> 0x03ad }
            cn.com.chinatelecom.account.api.c.e r3 = cn.com.chinatelecom.account.api.c.f.a((java.lang.String) r24)     // Catch:{ all -> 0x03ad }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ad }
            java.lang.String r6 = "doPost IOException -- "
            r5.<init>(r6)     // Catch:{ all -> 0x03ad }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x03ad }
            r5.append(r1)     // Catch:{ all -> 0x03ad }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x03ad }
            cn.com.chinatelecom.account.api.c.e r1 = r3.f(r1)     // Catch:{ all -> 0x03ad }
            cn.com.chinatelecom.account.api.c.e r1 = r1.a((int) r4)     // Catch:{ all -> 0x03ad }
            java.lang.String r3 = "IO异常"
            cn.com.chinatelecom.account.api.c.e r1 = r1.e(r3)     // Catch:{ all -> 0x03ad }
            r1.d(r10)     // Catch:{ all -> 0x03ad }
            if (r13 == 0) goto L_0x02bc
            r13.close()     // Catch:{ IOException -> 0x03ac }
        L_0x02bc:
            if (r2 == 0) goto L_0x03ac
            goto L_0x01c1
        L_0x02c0:
            r0 = move-exception
            r15 = r24
        L_0x02c3:
            r1 = r0
            r2 = r13
        L_0x02c5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ad }
            java.lang.String r4 = "域名解析异常-"
            r3.<init>(r4)     // Catch:{ all -> 0x03ad }
            r3.append(r11)     // Catch:{ all -> 0x03ad }
            java.lang.String r4 = "-"
            r3.append(r4)     // Catch:{ all -> 0x03ad }
            java.lang.String r4 = r1.getMessage()     // Catch:{ all -> 0x03ad }
            r3.append(r4)     // Catch:{ all -> 0x03ad }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x03ad }
            r4 = -8103(0xffffffffffffe059, float:NaN)
            java.lang.String r3 = cn.com.chinatelecom.account.api.c.k.a(r4, r3)     // Catch:{ all -> 0x03ad }
            r12.f1781b = r3     // Catch:{ all -> 0x03ad }
            java.lang.String r3 = f1771a     // Catch:{ all -> 0x03ad }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ad }
            java.lang.String r6 = "doPost UnknownHostException-"
            r5.<init>(r6)     // Catch:{ all -> 0x03ad }
            r5.append(r11)     // Catch:{ all -> 0x03ad }
            java.lang.String r6 = "-"
            r5.append(r6)     // Catch:{ all -> 0x03ad }
            java.lang.String r6 = r1.getMessage()     // Catch:{ all -> 0x03ad }
            r5.append(r6)     // Catch:{ all -> 0x03ad }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x03ad }
            cn.com.chinatelecom.account.api.CtAuth.warn(r3, r5, r1)     // Catch:{ all -> 0x03ad }
            cn.com.chinatelecom.account.api.c.e r3 = cn.com.chinatelecom.account.api.c.f.a((java.lang.String) r24)     // Catch:{ all -> 0x03ad }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ad }
            java.lang.String r6 = "doPost UnknownHostException -- "
            r5.<init>(r6)     // Catch:{ all -> 0x03ad }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x03ad }
            r5.append(r1)     // Catch:{ all -> 0x03ad }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x03ad }
            cn.com.chinatelecom.account.api.c.e r1 = r3.f(r1)     // Catch:{ all -> 0x03ad }
            cn.com.chinatelecom.account.api.c.e r1 = r1.a((int) r4)     // Catch:{ all -> 0x03ad }
            java.lang.String r3 = "域名解析异常"
            cn.com.chinatelecom.account.api.c.e r1 = r1.e(r3)     // Catch:{ all -> 0x03ad }
            r1.d(r10)     // Catch:{ all -> 0x03ad }
            if (r13 == 0) goto L_0x0332
            r13.close()     // Catch:{ IOException -> 0x03ac }
        L_0x0332:
            if (r2 == 0) goto L_0x03ac
            goto L_0x01c1
        L_0x0336:
            r0 = move-exception
            r15 = r24
        L_0x0339:
            r1 = r0
            r2 = r13
        L_0x033b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ad }
            java.lang.String r4 = "Socket超时异常-"
            r3.<init>(r4)     // Catch:{ all -> 0x03ad }
            r3.append(r11)     // Catch:{ all -> 0x03ad }
            java.lang.String r4 = "-"
            r3.append(r4)     // Catch:{ all -> 0x03ad }
            java.lang.String r4 = r1.getMessage()     // Catch:{ all -> 0x03ad }
            r3.append(r4)     // Catch:{ all -> 0x03ad }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x03ad }
            r4 = -8102(0xffffffffffffe05a, float:NaN)
            java.lang.String r3 = cn.com.chinatelecom.account.api.c.k.a(r4, r3)     // Catch:{ all -> 0x03ad }
            r12.f1781b = r3     // Catch:{ all -> 0x03ad }
            java.lang.String r3 = f1771a     // Catch:{ all -> 0x03ad }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ad }
            java.lang.String r6 = "doPost SocketTimeoutException-"
            r5.<init>(r6)     // Catch:{ all -> 0x03ad }
            r5.append(r11)     // Catch:{ all -> 0x03ad }
            java.lang.String r6 = "-"
            r5.append(r6)     // Catch:{ all -> 0x03ad }
            java.lang.String r6 = r1.getMessage()     // Catch:{ all -> 0x03ad }
            r5.append(r6)     // Catch:{ all -> 0x03ad }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x03ad }
            cn.com.chinatelecom.account.api.CtAuth.warn(r3, r5, r1)     // Catch:{ all -> 0x03ad }
            cn.com.chinatelecom.account.api.c.e r3 = cn.com.chinatelecom.account.api.c.f.a((java.lang.String) r24)     // Catch:{ all -> 0x03ad }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ad }
            java.lang.String r6 = "doPost SocketTimeoutException -- "
            r5.<init>(r6)     // Catch:{ all -> 0x03ad }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x03ad }
            r5.append(r1)     // Catch:{ all -> 0x03ad }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x03ad }
            cn.com.chinatelecom.account.api.c.e r1 = r3.f(r1)     // Catch:{ all -> 0x03ad }
            cn.com.chinatelecom.account.api.c.e r1 = r1.a((int) r4)     // Catch:{ all -> 0x03ad }
            java.lang.String r3 = "Socket超时异常"
            cn.com.chinatelecom.account.api.c.e r1 = r1.e(r3)     // Catch:{ all -> 0x03ad }
            r1.d(r10)     // Catch:{ all -> 0x03ad }
            if (r13 == 0) goto L_0x03a8
            r13.close()     // Catch:{ IOException -> 0x03ac }
        L_0x03a8:
            if (r2 == 0) goto L_0x03ac
            goto L_0x01c1
        L_0x03ac:
            return r12
        L_0x03ad:
            r0 = move-exception
            r1 = r0
        L_0x03af:
            if (r13 == 0) goto L_0x03b4
            r13.close()     // Catch:{ IOException -> 0x03b9 }
        L_0x03b4:
            if (r2 == 0) goto L_0x03b9
            r2.close()     // Catch:{ IOException -> 0x03b9 }
        L_0x03b9:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.b.c.a(android.content.Context, java.lang.String, java.lang.String, cn.com.chinatelecom.account.api.CtSetting, android.net.Network, boolean, int, java.lang.String, java.lang.String):cn.com.chinatelecom.account.api.b.e");
    }

    public static void a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager.getNetworkInfo(5).getState().compareTo(NetworkInfo.State.CONNECTED) == 0) {
                    int a2 = d.a(d.b(str));
                    ((Boolean) Class.forName("android.net.ConnectivityManager").getMethod("requestRouteToHost", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(connectivityManager, new Object[]{5, Integer.valueOf(a2)})).booleanValue();
                }
            } catch (Throwable th) {
                CtAuth.warn(f1771a, "http doPost > requestUrlToRoute error", th);
            }
        }
    }

    private static void a(HttpURLConnection httpURLConnection, Context context) {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (string == null) {
                string = "";
            }
            httpURLConnection.setRequestProperty("guid", string);
        } catch (Exception unused) {
        }
    }
}
