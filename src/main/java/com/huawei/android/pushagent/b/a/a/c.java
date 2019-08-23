package com.huawei.android.pushagent.b.a.a;

import android.content.Context;
import android.os.Bundle;
import com.huawei.android.pushagent.a.d;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public abstract class c extends Thread {

    /* renamed from: a  reason: collision with root package name */
    protected d f25032a = null;

    /* renamed from: b  reason: collision with root package name */
    protected Context f25033b = null;

    /* renamed from: c  reason: collision with root package name */
    protected a f25034c = null;

    public enum a {
        SocketEvent_CONNECTING,
        SocketEvent_CONNECTED,
        SocketEvent_CLOSE,
        SocketEvent_MSG_RECEIVED
    }

    public c(a aVar) {
        super("SocketRead_" + new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()));
        this.f25034c = aVar;
        this.f25033b = aVar.f25014d;
        this.f25032a = aVar.f25011a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v43, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v45, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v47, resolved type: java.io.IOException} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0243 A[SYNTHETIC, Splitter:B:78:0x0243] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.net.Socket a(java.lang.String r11, int r12, boolean r13) throws java.lang.Exception {
        /*
            r10 = this;
            r0 = 0
            java.net.Socket r1 = new java.net.Socket     // Catch:{ UnsupportedEncodingException -> 0x0228, SocketException -> 0x0218, IOException -> 0x0208, NumberFormatException -> 0x01f8, IllegalArgumentException -> 0x01e8, Exception -> 0x01d8 }
            r1.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0228, SocketException -> 0x0218, IOException -> 0x0208, NumberFormatException -> 0x01f8, IllegalArgumentException -> 0x01e8, Exception -> 0x01d8 }
            r1.getTcpNoDelay()     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            boolean r0 = r10 instanceof com.huawei.android.pushagent.b.a.a.b.c     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r2 = 1
            if (r0 == 0) goto L_0x0023
            boolean r0 = com.huawei.android.pushagent.utils.tools.d.c()     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            if (r0 == 0) goto L_0x001c
            int r0 = com.huawei.android.pushagent.utils.a.a((java.net.Socket) r1)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            com.huawei.android.pushagent.utils.tools.d.a(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            goto L_0x0023
        L_0x001c:
            int r0 = com.huawei.android.pushagent.utils.a.a((java.net.Socket) r1)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            com.huawei.android.pushagent.utils.a.a((int) r2, (int) r0)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
        L_0x0023:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r3 = 11
            if (r0 < r3) goto L_0x003f
            java.lang.String r0 = "http.proxyHost"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r3 = "http.proxyPort"
            java.lang.String r3 = java.lang.System.getProperty(r3)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            if (r3 == 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            java.lang.String r3 = "-1"
        L_0x003a:
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            goto L_0x004b
        L_0x003f:
            android.content.Context r0 = r10.f25033b     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r0 = android.net.Proxy.getHost(r0)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            android.content.Context r3 = r10.f25033b     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            int r3 = android.net.Proxy.getPort(r3)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
        L_0x004b:
            android.content.Context r4 = r10.f25033b     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            int r4 = com.huawei.android.pushagent.utils.a.b.a((android.content.Context) r4)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            com.huawei.android.pushagent.b.a.a.c$a r5 = com.huawei.android.pushagent.b.a.a.c.a.SocketEvent_CONNECTING     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r6.<init>()     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r10.a(r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r5 = "PushLogAC2815"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r7 = "enter createSocket("
            r6.<init>(r7)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r6.append(r11)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r7 = ":"
            r6.append(r7)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r6.append(r12)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r7 = ", proxy:"
            r6.append(r7)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r6.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r7 = "("
            r6.append(r7)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r6.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r7 = ":"
            r6.append(r7)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r6.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r7 = ")"
            r6.append(r7)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r6 = r6.toString()     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            com.huawei.android.pushagent.utils.a.e.a(r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r6 = 0
            if (r5 != 0) goto L_0x00a1
            r5 = -1
            if (r5 == r3) goto L_0x00a1
            if (r2 == r4) goto L_0x00a1
            r4 = 1
            goto L_0x00a2
        L_0x00a1:
            r4 = 0
        L_0x00a2:
            android.content.Context r5 = r10.f25033b     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            com.huawei.android.pushagent.b.b.a r5 = com.huawei.android.pushagent.b.b.a.a((android.content.Context) r5)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            boolean r5 = r5.ac()     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r7 = "PushLogAC2815"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r9 = "useProxy is valid:"
            r8.<init>(r9)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r8.append(r4)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r9 = ", allow proxy:"
            r8.append(r9)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r8.append(r5)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r8 = r8.toString()     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            com.huawei.android.pushagent.utils.a.e.b(r7, r8)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            if (r13 == 0) goto L_0x0198
            if (r4 == 0) goto L_0x0198
            if (r5 == 0) goto L_0x0198
            java.lang.String r13 = "PushLogAC2815"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r5 = "use Proxy "
            r4.<init>(r5)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r4.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r5 = ":"
            r4.append(r5)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r4.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r5 = " to connect to push server."
            r4.append(r5)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r4 = r4.toString()     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            com.huawei.android.pushagent.utils.a.e.b(r13, r4)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.net.InetSocketAddress r13 = new java.net.InetSocketAddress     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r13.<init>(r0, r3)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            android.content.Context r0 = r10.f25033b     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            com.huawei.android.pushagent.b.b.a r0 = com.huawei.android.pushagent.b.b.a.a((android.content.Context) r0)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            long r3 = r0.u()     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            int r0 = (int) r3     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            int r0 = r0 * 1000
            r1.connect(r13, r0)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r0 = "CONNECT "
            r13.<init>(r0)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r13.append(r11)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r11 = ":"
            r13.append(r11)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r13.append(r12)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r11 = r13.toString()     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.io.OutputStream r12 = r1.getOutputStream()     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r13.<init>()     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r13.append(r11)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r0 = " HTTP/1.1\r\nHost: "
            r13.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r13.append(r11)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r11 = "\r\n\r\n"
            r13.append(r11)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r11 = r13.toString()     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r13 = "UTF-8"
            byte[] r11 = r11.getBytes(r13)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r12.write(r11)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.io.InputStream r11 = r1.getInputStream()     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r13 = 100
            r12.<init>(r13)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r13 = 0
        L_0x014a:
            int r0 = r11.read()     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            char r0 = (char) r0     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r12.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            if (r13 == 0) goto L_0x0157
            r3 = 2
            if (r13 != r3) goto L_0x015e
        L_0x0157:
            r3 = 13
            if (r0 != r3) goto L_0x015e
        L_0x015b:
            int r13 = r13 + 1
            goto L_0x0169
        L_0x015e:
            if (r13 == r2) goto L_0x0163
            r3 = 3
            if (r13 != r3) goto L_0x0168
        L_0x0163:
            r3 = 10
            if (r0 != r3) goto L_0x0168
            goto L_0x015b
        L_0x0168:
            r13 = 0
        L_0x0169:
            r0 = 4
            if (r13 != r0) goto L_0x014a
            java.lang.String r11 = r12.toString()     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.io.BufferedReader r12 = new java.io.BufferedReader     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.io.StringReader r13 = new java.io.StringReader     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r13.<init>(r11)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r12.<init>(r13)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r11 = r12.readLine()     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            if (r11 == 0) goto L_0x01b4
            java.lang.String r12 = "PushLogAC2815"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r0 = "read data:"
            r13.<init>(r0)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r11 = com.huawei.android.pushagent.utils.a.a.e.a(r11)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r13.append(r11)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.lang.String r11 = r13.toString()     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            com.huawei.android.pushagent.utils.a.e.a(r12, r11)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            goto L_0x01b4
        L_0x0198:
            java.lang.String r13 = "PushLogAC2815"
            java.lang.String r0 = "create socket without proxy"
            com.huawei.android.pushagent.utils.a.e.b(r13, r0)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            java.net.InetSocketAddress r13 = new java.net.InetSocketAddress     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            r13.<init>(r11, r12)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            android.content.Context r11 = r10.f25033b     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            com.huawei.android.pushagent.b.b.a r11 = com.huawei.android.pushagent.b.b.a.a((android.content.Context) r11)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            long r11 = r11.u()     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            int r11 = (int) r11     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            int r11 = r11 * 1000
            r1.connect(r13, r11)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
        L_0x01b4:
            java.lang.String r11 = "PushLogAC2815"
            java.lang.String r12 = "write the lastcontectsucc_time to the pushConfig.xml file"
            com.huawei.android.pushagent.utils.a.e.a(r11, r12)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            android.content.Context r11 = r10.f25033b     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            com.huawei.android.pushagent.b.b.a r11 = com.huawei.android.pushagent.b.b.a.a((android.content.Context) r11)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            long r11 = r11.u()     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            int r11 = (int) r11     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            int r11 = r11 * 1000
            r1.setSoTimeout(r11)     // Catch:{ UnsupportedEncodingException -> 0x01d6, SocketException -> 0x01d4, IOException -> 0x01d2, NumberFormatException -> 0x01d0, IllegalArgumentException -> 0x01ce, Exception -> 0x01cc }
            return r1
        L_0x01cc:
            r11 = move-exception
            goto L_0x01da
        L_0x01ce:
            r11 = move-exception
            goto L_0x01ea
        L_0x01d0:
            r11 = move-exception
            goto L_0x01fa
        L_0x01d2:
            r11 = move-exception
            goto L_0x020a
        L_0x01d4:
            r11 = move-exception
            goto L_0x021a
        L_0x01d6:
            r11 = move-exception
            goto L_0x022a
        L_0x01d8:
            r11 = move-exception
            r1 = r0
        L_0x01da:
            java.lang.String r12 = "PushLogAC2815"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "call createSocket cause:"
            r13.<init>(r0)
            java.lang.String r0 = r11.toString()
            goto L_0x0237
        L_0x01e8:
            r11 = move-exception
            r1 = r0
        L_0x01ea:
            java.lang.String r12 = "PushLogAC2815"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "call connect cause:"
            r13.<init>(r0)
            java.lang.String r0 = r11.toString()
            goto L_0x0237
        L_0x01f8:
            r11 = move-exception
            r1 = r0
        L_0x01fa:
            java.lang.String r12 = "PushLogAC2815"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "call connect cause:"
            r13.<init>(r0)
            java.lang.String r0 = r11.toString()
            goto L_0x0237
        L_0x0208:
            r11 = move-exception
            r1 = r0
        L_0x020a:
            java.lang.String r12 = "PushLogAC2815"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "call connect cause:"
            r13.<init>(r0)
            java.lang.String r0 = r11.toString()
            goto L_0x0237
        L_0x0218:
            r11 = move-exception
            r1 = r0
        L_0x021a:
            java.lang.String r12 = "PushLogAC2815"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "call setSoTimeout cause:"
            r13.<init>(r0)
            java.lang.String r0 = r11.toString()
            goto L_0x0237
        L_0x0228:
            r11 = move-exception
            r1 = r0
        L_0x022a:
            java.lang.String r12 = "PushLogAC2815"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "call getBytes cause:"
            r13.<init>(r0)
            java.lang.String r0 = r11.toString()
        L_0x0237:
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.huawei.android.pushagent.utils.a.e.c(r12, r13, r11)
            if (r1 == 0) goto L_0x025f
            r1.close()     // Catch:{ IOException -> 0x0247 }
            goto L_0x025f
        L_0x0247:
            r11 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "close socket cause:"
            r12.<init>(r13)
            java.lang.String r13 = r11.toString()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "PushLogAC2815"
            com.huawei.android.pushagent.utils.a.e.a((java.lang.String) r13, (java.lang.String) r12, (java.lang.Throwable) r11)
        L_0x025f:
            com.huawei.android.pushagent.a.c r11 = new com.huawei.android.pushagent.a.c
            com.huawei.android.pushagent.a.c$a r12 = com.huawei.android.pushagent.a.c.a.Err_Connect
            java.lang.String r13 = "create socket failed"
            r11.<init>((java.lang.String) r13, (com.huawei.android.pushagent.a.c.a) r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.b.a.a.c.a(java.lang.String, int, boolean):java.net.Socket");
    }

    /* access modifiers changed from: protected */
    public void a(a aVar, Bundle bundle) {
        this.f25034c.a(aVar, bundle);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01b5 A[SYNTHETIC, Splitter:B:45:0x01b5] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01f4 A[SYNTHETIC, Splitter:B:55:0x01f4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a() throws com.huawei.android.pushagent.a.c {
        /*
            r8 = this;
            r0 = 0
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            java.lang.String r3 = "PushLogAC2815"
            java.lang.String r4 = "start to create socket"
            com.huawei.android.pushagent.utils.a.e.a(r3, r4)     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            com.huawei.android.pushagent.a.d r3 = r8.f25032a     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            r4 = 0
            if (r3 == 0) goto L_0x017f
            com.huawei.android.pushagent.a.d r3 = r8.f25032a     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            java.lang.String r3 = r3.f24993a     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            if (r3 == 0) goto L_0x017f
            com.huawei.android.pushagent.a.d r3 = r8.f25032a     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            java.lang.String r3 = r3.f24993a     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            int r3 = r3.length()     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            if (r3 != 0) goto L_0x0023
            goto L_0x017f
        L_0x0023:
            com.huawei.android.pushagent.a.d r3 = r8.f25032a     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            com.huawei.android.pushagent.b.a.b.b$a r3 = r3.f24995c     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            if (r3 != 0) goto L_0x0046
            java.lang.String r1 = "PushLogAC2815"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            java.lang.String r3 = "config sslconetEntity.channelType cfgErr:"
            r2.<init>(r3)     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            com.huawei.android.pushagent.a.d r3 = r8.f25032a     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            com.huawei.android.pushagent.b.a.b.b$a r3 = r3.f24995c     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            r2.append(r3)     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            java.lang.String r3 = " cannot connect!!"
            r2.append(r3)     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            java.lang.String r2 = r2.toString()     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            com.huawei.android.pushagent.utils.a.e.d(r1, r2)     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            return r4
        L_0x0046:
            com.huawei.android.pushagent.a.d r3 = r8.f25032a     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            java.lang.String r3 = r3.f24993a     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            com.huawei.android.pushagent.a.d r5 = r8.f25032a     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            int r5 = r5.f24994b     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            com.huawei.android.pushagent.a.d r6 = r8.f25032a     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            boolean r6 = r6.f24996d     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            java.net.Socket r3 = r8.a(r3, r5, r6)     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            java.lang.String r0 = "PushLogAC2815"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            java.lang.String r6 = "conetEntity.channelType:"
            r5.<init>(r6)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.a.d r6 = r8.f25032a     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.b.a.b.b$a r6 = r6.f24995c     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r5.append(r6)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            java.lang.String r5 = r5.toString()     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.utils.a.e.a(r0, r5)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            int[] r0 = com.huawei.android.pushagent.b.a.a.c.AnonymousClass1.f25035a     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.a.d r5 = r8.f25032a     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.b.a.b.b$a r5 = r5.f24995c     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            int r5 = r5.ordinal()     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r0 = r0[r5]     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            switch(r0) {
                case 1: goto L_0x0096;
                case 2: goto L_0x008c;
                case 3: goto L_0x008c;
                case 4: goto L_0x0080;
                default: goto L_0x007c;
            }     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
        L_0x007c:
            java.lang.String r0 = "PushLogAC2815"
            goto L_0x015b
        L_0x0080:
            com.huawei.android.pushagent.b.a.a.a r0 = r8.f25034c     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.b.a.b.a r5 = new com.huawei.android.pushagent.b.a.b.a     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            android.content.Context r6 = r8.f25033b     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r5.<init>(r6)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
        L_0x0089:
            r0.f25013c = r5     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            goto L_0x00a0
        L_0x008c:
            com.huawei.android.pushagent.b.a.a.a r0 = r8.f25034c     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.b.a.b.d r5 = new com.huawei.android.pushagent.b.a.b.d     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            android.content.Context r6 = r8.f25033b     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r5.<init>(r6)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            goto L_0x0089
        L_0x0096:
            com.huawei.android.pushagent.b.a.a.a r0 = r8.f25034c     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.b.a.b.c r5 = new com.huawei.android.pushagent.b.a.b.c     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            android.content.Context r6 = r8.f25033b     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r5.<init>(r6)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            goto L_0x0089
        L_0x00a0:
            com.huawei.android.pushagent.b.a.a.a r0 = r8.f25034c     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.b.a.b.b r0 = r0.f25013c     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            boolean r0 = r0.a((java.net.Socket) r3)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            if (r0 == 0) goto L_0x0147
            r3.setSoTimeout(r4)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            java.lang.String r0 = "PushLogAC2815"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            java.lang.String r5 = "connect cost "
            r4.<init>(r5)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r7 = 0
            long r5 = r5 - r1
            r4.append(r5)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            java.lang.String r1 = " ms, result:"
            r4.append(r1)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.b.a.a.a r1 = r8.f25034c     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.b.a.b.b r1 = r1.f25013c     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            boolean r1 = r1.b()     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r4.append(r1)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            java.lang.String r1 = r4.toString()     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.utils.a.e.a(r0, r1)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.b.a.a.a r0 = r8.f25034c     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.b.a.b.b r0 = r0.f25013c     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            boolean r0 = r0.b()     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            if (r0 == 0) goto L_0x0136
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.a.d r1 = r8.f25032a     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            java.lang.String r1 = r1.f24993a     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.a.d r2 = r8.f25032a     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            int r2 = r2.f24994b     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r0.<init>(r1, r2)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r1.<init>()     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            java.lang.String r2 = "server_ip"
            java.net.InetAddress r4 = r0.getAddress()     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            java.lang.String r4 = r4.getHostAddress()     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r1.putString(r2, r4)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            java.lang.String r2 = "server_port"
            int r0 = r0.getPort()     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r1.putInt(r2, r0)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            java.lang.String r0 = "client_ip"
            java.net.InetAddress r2 = r3.getLocalAddress()     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            java.lang.String r2 = r2.getHostAddress()     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r1.putString(r0, r2)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            java.lang.String r0 = "client_port"
            int r2 = r3.getLocalPort()     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r1.putInt(r0, r2)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            java.lang.String r0 = "channelEntity"
            com.huawei.android.pushagent.b.a.a.a r2 = r8.f25034c     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.b.a.a$a r2 = r2.e()     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            int r2 = r2.ordinal()     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r1.putInt(r0, r2)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.b.a.a.a r0 = r8.f25034c     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.b.a.a.c$a r2 = com.huawei.android.pushagent.b.a.a.c.a.SocketEvent_CONNECTED     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r0.a((com.huawei.android.pushagent.b.a.a.c.a) r2, (android.os.Bundle) r1)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r0 = 1
            return r0
        L_0x0136:
            java.lang.String r0 = "PushLogAC2815"
            java.lang.String r1 = "Socket connect failed"
            com.huawei.android.pushagent.utils.a.e.d(r0, r1)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.a.c r0 = new com.huawei.android.pushagent.a.c     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            java.lang.String r1 = "create SSLSocket failed"
            com.huawei.android.pushagent.a.c$a r2 = com.huawei.android.pushagent.a.c.a.Err_Connect     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r0.<init>((java.lang.String) r1, (com.huawei.android.pushagent.a.c.a) r2)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            throw r0     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
        L_0x0147:
            java.lang.String r0 = "PushLogAC2815"
            java.lang.String r1 = "call conetEntity.channel.init failed!!"
            com.huawei.android.pushagent.utils.a.e.d(r0, r1)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r3.close()     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.a.c r0 = new com.huawei.android.pushagent.a.c     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            java.lang.String r1 = "init socket error"
            com.huawei.android.pushagent.a.c$a r2 = com.huawei.android.pushagent.a.c.a.Err_Connect     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r0.<init>((java.lang.String) r1, (com.huawei.android.pushagent.a.c.a) r2)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            throw r0     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
        L_0x015b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            java.lang.String r2 = "conetEntity.channelType is invalid:"
            r1.<init>(r2)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.a.d r2 = r8.f25032a     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.b.a.b.b$a r2 = r2.f24995c     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r1.append(r2)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            java.lang.String r1 = r1.toString()     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.utils.a.e.d(r0, r1)     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            com.huawei.android.pushagent.PushService r0 = com.huawei.android.pushagent.PushService.a()     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r0.stopService()     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            r3.close()     // Catch:{ SocketException -> 0x017d, Exception -> 0x017b }
            return r4
        L_0x017b:
            r1 = move-exception
            goto L_0x019c
        L_0x017d:
            r1 = move-exception
            goto L_0x01db
        L_0x017f:
            java.lang.String r1 = "PushLogAC2815"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            java.lang.String r3 = "the addr is "
            r2.<init>(r3)     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            com.huawei.android.pushagent.a.d r3 = r8.f25032a     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            r2.append(r3)     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            java.lang.String r3 = " is invalid"
            r2.append(r3)     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            java.lang.String r2 = r2.toString()     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            com.huawei.android.pushagent.utils.a.e.d(r1, r2)     // Catch:{ SocketException -> 0x01d9, Exception -> 0x019a }
            return r4
        L_0x019a:
            r1 = move-exception
            r3 = r0
        L_0x019c:
            java.lang.String r0 = "PushLogAC2815"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "call connectSync cause "
            r2.<init>(r4)
            java.lang.String r4 = r1.toString()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.huawei.android.pushagent.utils.a.e.c(r0, r2, r1)
            if (r3 == 0) goto L_0x01d1
            r3.close()     // Catch:{ IOException -> 0x01b9 }
            goto L_0x01d1
        L_0x01b9:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "close socket cause:"
            r2.<init>(r3)
            java.lang.String r3 = r0.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "PushLogAC2815"
            com.huawei.android.pushagent.utils.a.e.a((java.lang.String) r3, (java.lang.String) r2, (java.lang.Throwable) r0)
        L_0x01d1:
            com.huawei.android.pushagent.a.c r0 = new com.huawei.android.pushagent.a.c
            com.huawei.android.pushagent.a.c$a r2 = com.huawei.android.pushagent.a.c.a.Err_Connect
            r0.<init>((java.lang.Throwable) r1, (com.huawei.android.pushagent.a.c.a) r2)
            throw r0
        L_0x01d9:
            r1 = move-exception
            r3 = r0
        L_0x01db:
            java.lang.String r0 = "PushLogAC2815"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "call connectSync cause "
            r2.<init>(r4)
            java.lang.String r4 = r1.toString()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.huawei.android.pushagent.utils.a.e.c(r0, r2, r1)
            if (r3 == 0) goto L_0x0210
            r3.close()     // Catch:{ IOException -> 0x01f8 }
            goto L_0x0210
        L_0x01f8:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "close socket cause:"
            r2.<init>(r3)
            java.lang.String r3 = r0.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "PushLogAC2815"
            com.huawei.android.pushagent.utils.a.e.a((java.lang.String) r3, (java.lang.String) r2, (java.lang.Throwable) r0)
        L_0x0210:
            com.huawei.android.pushagent.a.c r0 = new com.huawei.android.pushagent.a.c
            com.huawei.android.pushagent.a.c$a r2 = com.huawei.android.pushagent.a.c.a.Err_Connect
            r0.<init>((java.lang.Throwable) r1, (com.huawei.android.pushagent.a.c.a) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.b.a.a.c.a():boolean");
    }

    /* access modifiers changed from: protected */
    public abstract void b() throws Exception;

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c9 A[SYNTHETIC, Splitter:B:30:0x00c9] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f2 A[Catch:{ all -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0128 A[SYNTHETIC, Splitter:B:41:0x0128] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015a A[SYNTHETIC, Splitter:B:47:0x015a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
            long r0 = java.lang.System.currentTimeMillis()
            boolean r2 = r9.a()     // Catch:{ c -> 0x00d1, Exception -> 0x007b }
            if (r2 == 0) goto L_0x0024
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ c -> 0x00d1, Exception -> 0x007b }
            r9.b()     // Catch:{ c -> 0x001e, Exception -> 0x0019, all -> 0x0013 }
            r0 = r2
            goto L_0x0024
        L_0x0013:
            r0 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
            goto L_0x0137
        L_0x0019:
            r0 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
            goto L_0x007c
        L_0x001e:
            r0 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
            goto L_0x00d2
        L_0x0024:
            java.lang.String r2 = "PushLogAC2815"
            java.lang.String r3 = "normal to quit."
            com.huawei.android.pushagent.utils.a.e.a(r2, r3)     // Catch:{ c -> 0x00d1, Exception -> 0x007b }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ c -> 0x00d1, Exception -> 0x007b }
            r2.<init>()     // Catch:{ c -> 0x00d1, Exception -> 0x007b }
            java.lang.String r3 = "connect_time"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ c -> 0x00d1, Exception -> 0x007b }
            r6 = 0
            long r4 = r4 - r0
            r2.putLong(r3, r4)     // Catch:{ c -> 0x00d1, Exception -> 0x007b }
            com.huawei.android.pushagent.b.a.a.c$a r3 = com.huawei.android.pushagent.b.a.a.c.a.SocketEvent_CLOSE     // Catch:{ c -> 0x00d1, Exception -> 0x007b }
            r9.a(r3, r2)     // Catch:{ c -> 0x00d1, Exception -> 0x007b }
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            java.lang.String r0 = "PushLogAC2815"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "total connect Time:"
            r1.<init>(r4)
            r1.append(r2)
            java.lang.String r2 = " process quit, so close socket"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.android.pushagent.utils.a.e.b(r0, r1)
            com.huawei.android.pushagent.b.a.a.a r0 = r9.f25034c
            com.huawei.android.pushagent.b.a.b.b r0 = r0.f25013c
            if (r0 == 0) goto L_0x012f
            com.huawei.android.pushagent.b.a.a.a r0 = r9.f25034c     // Catch:{ Exception -> 0x006c }
            com.huawei.android.pushagent.b.a.b.b r0 = r0.f25013c     // Catch:{ Exception -> 0x006c }
            r0.a()     // Catch:{ Exception -> 0x006c }
            goto L_0x012f
        L_0x006c:
            r0 = move-exception
            java.lang.String r1 = "PushLogAC2815"
            java.lang.String r2 = r0.toString()
            com.huawei.android.pushagent.utils.a.e.c(r1, r2, r0)
            goto L_0x012f
        L_0x0078:
            r2 = move-exception
            goto L_0x0137
        L_0x007b:
            r2 = move-exception
        L_0x007c:
            java.lang.String r3 = "PushLogAC2815"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = "connect cause :"
            r4.<init>(r5)     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0078 }
            r4.append(r5)     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0078 }
            com.huawei.android.pushagent.utils.a.e.c(r3, r4, r2)     // Catch:{ all -> 0x0078 }
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0078 }
            r3.<init>()     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = "push_exception"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0078 }
            r3.putString(r4, r2)     // Catch:{ all -> 0x0078 }
            com.huawei.android.pushagent.b.a.a.c$a r2 = com.huawei.android.pushagent.b.a.a.c.a.SocketEvent_CLOSE     // Catch:{ all -> 0x0078 }
            r9.a(r2, r3)     // Catch:{ all -> 0x0078 }
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            java.lang.String r0 = "PushLogAC2815"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "total connect Time:"
            r1.<init>(r4)
            r1.append(r2)
            java.lang.String r2 = " process quit, so close socket"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.android.pushagent.utils.a.e.b(r0, r1)
            com.huawei.android.pushagent.b.a.a.a r0 = r9.f25034c
            com.huawei.android.pushagent.b.a.b.b r0 = r0.f25013c
            if (r0 == 0) goto L_0x012f
            com.huawei.android.pushagent.b.a.a.a r0 = r9.f25034c     // Catch:{ Exception -> 0x006c }
            com.huawei.android.pushagent.b.a.b.b r0 = r0.f25013c     // Catch:{ Exception -> 0x006c }
            r0.a()     // Catch:{ Exception -> 0x006c }
            goto L_0x012f
        L_0x00d1:
            r2 = move-exception
        L_0x00d2:
            java.lang.String r3 = "PushLogAC2815"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = "connect occurs :"
            r4.<init>(r5)     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0078 }
            r4.append(r5)     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0078 }
            com.huawei.android.pushagent.utils.a.e.c(r3, r4, r2)     // Catch:{ all -> 0x0078 }
            com.huawei.android.pushagent.a.c$a r3 = r2.f24987a     // Catch:{ all -> 0x0078 }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ all -> 0x0078 }
            r4.<init>()     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x00f7
            java.lang.String r5 = "errorType"
            r4.putSerializable(r5, r3)     // Catch:{ all -> 0x0078 }
        L_0x00f7:
            java.lang.String r3 = "push_exception"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0078 }
            r4.putString(r3, r2)     // Catch:{ all -> 0x0078 }
            com.huawei.android.pushagent.b.a.a.c$a r2 = com.huawei.android.pushagent.b.a.a.c.a.SocketEvent_CLOSE     // Catch:{ all -> 0x0078 }
            r9.a(r2, r4)     // Catch:{ all -> 0x0078 }
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            java.lang.String r0 = "PushLogAC2815"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "total connect Time:"
            r1.<init>(r4)
            r1.append(r2)
            java.lang.String r2 = " process quit, so close socket"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.android.pushagent.utils.a.e.b(r0, r1)
            com.huawei.android.pushagent.b.a.a.a r0 = r9.f25034c
            com.huawei.android.pushagent.b.a.b.b r0 = r0.f25013c
            if (r0 == 0) goto L_0x012f
            com.huawei.android.pushagent.b.a.a.a r0 = r9.f25034c     // Catch:{ Exception -> 0x006c }
            com.huawei.android.pushagent.b.a.b.b r0 = r0.f25013c     // Catch:{ Exception -> 0x006c }
            r0.a()     // Catch:{ Exception -> 0x006c }
        L_0x012f:
            java.lang.String r0 = "PushLogAC2815"
            java.lang.String r1 = "connect thread exit!"
            com.huawei.android.pushagent.utils.a.e.a(r0, r1)
            return
        L_0x0137:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            java.lang.String r0 = "PushLogAC2815"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "total connect Time:"
            r1.<init>(r5)
            r1.append(r3)
            java.lang.String r3 = " process quit, so close socket"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.huawei.android.pushagent.utils.a.e.b(r0, r1)
            com.huawei.android.pushagent.b.a.a.a r0 = r9.f25034c
            com.huawei.android.pushagent.b.a.b.b r0 = r0.f25013c
            if (r0 == 0) goto L_0x016c
            com.huawei.android.pushagent.b.a.a.a r0 = r9.f25034c     // Catch:{ Exception -> 0x0162 }
            com.huawei.android.pushagent.b.a.b.b r0 = r0.f25013c     // Catch:{ Exception -> 0x0162 }
            r0.a()     // Catch:{ Exception -> 0x0162 }
            goto L_0x016c
        L_0x0162:
            r0 = move-exception
            java.lang.String r1 = r0.toString()
            java.lang.String r3 = "PushLogAC2815"
            com.huawei.android.pushagent.utils.a.e.c(r3, r1, r0)
        L_0x016c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.b.a.a.c.run():void");
    }
}
