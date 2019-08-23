package com.toutiao.proxyserver.net;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.retrofit2.client.Header;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.toutiao.proxyserver.Proxy;
import com.toutiao.proxyserver.a.c;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.Connection;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80132a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Long, c> f80133b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final Map<Long, Pair<String, List<InetAddress>>> f80134c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private static OkHttpClient f80135d;

    public static synchronized OkHttpClient a() {
        synchronized (b.class) {
            if (PatchProxy.isSupport(new Object[0], null, f80132a, true, 91808, new Class[0], OkHttpClient.class)) {
                OkHttpClient okHttpClient = (OkHttpClient) PatchProxy.accessDispatch(new Object[0], null, f80132a, true, 91808, new Class[0], OkHttpClient.class);
                return okHttpClient;
            }
            if (f80135d == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                builder.protocols(Collections.singletonList(Protocol.HTTP_1_1));
                builder.connectTimeout(10000, TimeUnit.MILLISECONDS).readTimeout(10000, TimeUnit.MILLISECONDS).writeTimeout(10000, TimeUnit.MILLISECONDS);
                builder.dns(new Dns() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f80136a;

                    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.util.List<java.net.InetAddress> lookup(java.lang.String r18) throws java.net.UnknownHostException {
                        /*
                            r17 = this;
                            r1 = r18
                            r0 = 1
                            java.lang.Object[] r2 = new java.lang.Object[r0]
                            r9 = 0
                            r2[r9] = r1
                            com.meituan.robust.ChangeQuickRedirect r4 = f80136a
                            java.lang.Class[] r7 = new java.lang.Class[r0]
                            java.lang.Class<java.lang.String> r3 = java.lang.String.class
                            r7[r9] = r3
                            java.lang.Class<java.util.List> r8 = java.util.List.class
                            r5 = 0
                            r6 = 91809(0x166a1, float:1.28652E-40)
                            r3 = r17
                            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                            if (r2 == 0) goto L_0x0039
                            java.lang.Object[] r10 = new java.lang.Object[r0]
                            r10[r9] = r1
                            com.meituan.robust.ChangeQuickRedirect r12 = f80136a
                            r13 = 0
                            r14 = 91809(0x166a1, float:1.28652E-40)
                            java.lang.Class[] r15 = new java.lang.Class[r0]
                            java.lang.Class<java.lang.String> r0 = java.lang.String.class
                            r15[r9] = r0
                            java.lang.Class<java.util.List> r16 = java.util.List.class
                            r11 = r17
                            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                            java.util.List r0 = (java.util.List) r0
                            return r0
                        L_0x0039:
                            r2 = 0
                            boolean r0 = com.toutiao.proxyserver.Proxy.t
                            if (r0 == 0) goto L_0x006c
                            java.util.List r3 = com.bytedance.ttnet.TTNetInit.dnsLookup(r18)     // Catch:{ Throwable -> 0x0062 }
                            java.lang.String r0 = "TAG_PROXY_DNS"
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x005f }
                            java.lang.String r4 = "ttnet dns lookup: hostname: "
                            r2.<init>(r4)     // Catch:{ Throwable -> 0x005f }
                            r2.append(r1)     // Catch:{ Throwable -> 0x005f }
                            java.lang.String r4 = ", adds: "
                            r2.append(r4)     // Catch:{ Throwable -> 0x005f }
                            r2.append(r3)     // Catch:{ Throwable -> 0x005f }
                            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x005f }
                            com.toutiao.proxyserver.d.c.b(r0, r2)     // Catch:{ Throwable -> 0x005f }
                            r2 = r3
                            goto L_0x006c
                        L_0x005f:
                            r0 = move-exception
                            r2 = r3
                            goto L_0x0063
                        L_0x0062:
                            r0 = move-exception
                        L_0x0063:
                            java.lang.String r3 = "TAG_PROXY_DNS"
                            java.lang.String r0 = com.toutiao.proxyserver.d.c.a(r0)
                            com.toutiao.proxyserver.d.c.d(r3, r0)
                        L_0x006c:
                            if (r2 != 0) goto L_0x008f
                            okhttp3.Dns r0 = okhttp3.Dns.SYSTEM
                            java.util.List r2 = r0.lookup(r1)
                            java.lang.String r0 = "TAG_PROXY_DNS"
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            java.lang.String r4 = "system dns lookup: hostname: "
                            r3.<init>(r4)
                            r3.append(r1)
                            java.lang.String r4 = ", adds: "
                            r3.append(r4)
                            r3.append(r2)
                            java.lang.String r3 = r3.toString()
                            com.toutiao.proxyserver.d.c.b(r0, r3)
                        L_0x008f:
                            if (r1 == 0) goto L_0x00a4
                            if (r2 == 0) goto L_0x00a4
                            java.util.Map<java.lang.Long, android.util.Pair<java.lang.String, java.util.List<java.net.InetAddress>>> r0 = com.toutiao.proxyserver.net.b.f80134c
                            long r3 = com.toutiao.proxyserver.Proxy.d()
                            java.lang.Long r3 = java.lang.Long.valueOf(r3)
                            android.util.Pair r1 = android.util.Pair.create(r1, r2)
                            r0.put(r3, r1)
                        L_0x00a4:
                            return r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.net.b.AnonymousClass1.lookup(java.lang.String):java.util.List");
                    }
                });
                builder.interceptors().add(new Interceptor() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f80137a;

                    /* JADX WARNING: Can't wrap try/catch for region: R(12:5|6|7|8|9|10|11|(2:12|13)|18|(2:20|(1:22))|23|24) */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x008b */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r11) throws java.io.IOException {
                        /*
                            r10 = this;
                            r8 = 1
                            java.lang.Object[] r1 = new java.lang.Object[r8]
                            r9 = 0
                            r1[r9] = r11
                            com.meituan.robust.ChangeQuickRedirect r3 = f80137a
                            java.lang.Class[] r6 = new java.lang.Class[r8]
                            java.lang.Class<okhttp3.Interceptor$Chain> r2 = okhttp3.Interceptor.Chain.class
                            r6[r9] = r2
                            java.lang.Class<okhttp3.Response> r7 = okhttp3.Response.class
                            r4 = 0
                            r5 = 91810(0x166a2, float:1.28653E-40)
                            r2 = r10
                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                            if (r1 == 0) goto L_0x0035
                            java.lang.Object[] r1 = new java.lang.Object[r8]
                            r1[r9] = r11
                            com.meituan.robust.ChangeQuickRedirect r3 = f80137a
                            r4 = 0
                            r5 = 91810(0x166a2, float:1.28653E-40)
                            java.lang.Class[] r6 = new java.lang.Class[r8]
                            java.lang.Class<okhttp3.Interceptor$Chain> r0 = okhttp3.Interceptor.Chain.class
                            r6[r9] = r0
                            java.lang.Class<okhttp3.Response> r7 = okhttp3.Response.class
                            r2 = r10
                            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                            okhttp3.Response r0 = (okhttp3.Response) r0
                            return r0
                        L_0x0035:
                            okhttp3.Request r1 = r11.request()
                            okhttp3.Request$Builder r2 = r1.newBuilder()
                            long r3 = com.toutiao.proxyserver.Proxy.c()
                            com.toutiao.proxyserver.a.c r5 = new com.toutiao.proxyserver.a.c
                            r5.<init>()
                            java.lang.String r6 = "Vpwp-Raw-Key"
                            java.lang.String r6 = r1.header(r6)
                            r5.f80003b = r6
                            okhttp3.HttpUrl r1 = r1.url()
                            java.lang.String r1 = r1.toString()
                            r5.f80006e = r1
                            java.lang.Long r1 = java.lang.Long.valueOf(r3)
                            r2.tag(r1)
                            java.util.Map<java.lang.Long, com.toutiao.proxyserver.a.c> r1 = com.toutiao.proxyserver.net.b.f80133b
                            java.lang.Long r3 = java.lang.Long.valueOf(r3)
                            r1.put(r3, r5)
                            okhttp3.Request r1 = r2.build()
                            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x00e8 }
                            okhttp3.Response r0 = r11.proceed(r1)     // Catch:{ IOException -> 0x00e8 }
                            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x00e8 }
                            r4 = 0
                            long r6 = r6 - r2
                            r5.j = r6     // Catch:{ IOException -> 0x00e8 }
                            java.lang.String r2 = "Content-Length"
                            java.lang.String r3 = "0"
                            java.lang.String r2 = r0.header(r2, r3)     // Catch:{ Exception -> 0x008b }
                            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x008b }
                            r5.k = r2     // Catch:{ Exception -> 0x008b }
                            goto L_0x008d
                        L_0x008b:
                            r5.k = r9     // Catch:{ IOException -> 0x00e8 }
                        L_0x008d:
                            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x00af }
                            r2.<init>()     // Catch:{ Exception -> 0x00af }
                            r5.l = r2     // Catch:{ Exception -> 0x00af }
                            java.util.Map<java.lang.String, java.lang.String> r2 = r5.l     // Catch:{ Exception -> 0x00af }
                            java.lang.String r3 = "X-Cache"
                            java.lang.String r4 = "X-Cache"
                            java.lang.String r4 = r0.header(r4)     // Catch:{ Exception -> 0x00af }
                            r2.put(r3, r4)     // Catch:{ Exception -> 0x00af }
                            java.util.Map<java.lang.String, java.lang.String> r2 = r5.l     // Catch:{ Exception -> 0x00af }
                            java.lang.String r3 = "X-M-Cache "
                            java.lang.String r4 = "X-M-Cache "
                            java.lang.String r4 = r0.header(r4)     // Catch:{ Exception -> 0x00af }
                            r2.put(r3, r4)     // Catch:{ Exception -> 0x00af }
                            goto L_0x00b2
                        L_0x00af:
                            r2 = 0
                            r5.l = r2     // Catch:{ IOException -> 0x00e8 }
                        L_0x00b2:
                            java.util.Map<java.lang.Long, com.toutiao.proxyserver.a.c> r2 = com.toutiao.proxyserver.net.b.f80133b
                            java.lang.Object r3 = r1.tag()
                            r2.remove(r3)
                            java.util.Map<java.lang.Long, android.util.Pair<java.lang.String, java.util.List<java.net.InetAddress>>> r2 = com.toutiao.proxyserver.net.b.f80134c
                            java.lang.Object r1 = r1.tag()
                            java.lang.Object r1 = r2.remove(r1)
                            android.util.Pair r1 = (android.util.Pair) r1
                            if (r1 == 0) goto L_0x00dd
                            java.lang.Object r2 = r1.first
                            java.lang.String r2 = (java.lang.String) r2
                            r5.f80004c = r2
                            java.lang.Object r2 = r1.second
                            if (r2 == 0) goto L_0x00dd
                            java.lang.Object r1 = r1.second
                            java.util.List r1 = (java.util.List) r1
                            java.lang.String r1 = r1.toString()
                            r5.f80005d = r1
                        L_0x00dd:
                            com.toutiao.proxyserver.net.b$2$1 r1 = new com.toutiao.proxyserver.net.b$2$1
                            r1.<init>(r5)
                            com.toutiao.proxyserver.f.c.b((java.lang.Runnable) r1)
                            return r0
                        L_0x00e6:
                            r0 = move-exception
                            goto L_0x00ea
                        L_0x00e8:
                            r0 = move-exception
                            throw r0     // Catch:{ all -> 0x00e6 }
                        L_0x00ea:
                            java.util.Map<java.lang.Long, com.toutiao.proxyserver.a.c> r2 = com.toutiao.proxyserver.net.b.f80133b
                            java.lang.Object r3 = r1.tag()
                            r2.remove(r3)
                            java.util.Map<java.lang.Long, android.util.Pair<java.lang.String, java.util.List<java.net.InetAddress>>> r2 = com.toutiao.proxyserver.net.b.f80134c
                            java.lang.Object r1 = r1.tag()
                            java.lang.Object r1 = r2.remove(r1)
                            android.util.Pair r1 = (android.util.Pair) r1
                            if (r1 == 0) goto L_0x0115
                            java.lang.Object r2 = r1.first
                            java.lang.String r2 = (java.lang.String) r2
                            r5.f80004c = r2
                            java.lang.Object r2 = r1.second
                            if (r2 == 0) goto L_0x0115
                            java.lang.Object r1 = r1.second
                            java.util.List r1 = (java.util.List) r1
                            java.lang.String r1 = r1.toString()
                            r5.f80005d = r1
                        L_0x0115:
                            com.toutiao.proxyserver.net.b$2$1 r1 = new com.toutiao.proxyserver.net.b$2$1
                            r1.<init>(r5)
                            com.toutiao.proxyserver.f.c.b((java.lang.Runnable) r1)
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.net.b.AnonymousClass2.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
                    }
                });
                builder.networkInterceptors().add(new Interceptor() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f80141a;

                    public final Response intercept(Interceptor.Chain chain) throws IOException {
                        Socket socket;
                        String str;
                        String str2;
                        InetSocketAddress inetSocketAddress;
                        Socket socket2;
                        String str3;
                        String str4;
                        InetSocketAddress inetSocketAddress2;
                        Interceptor.Chain chain2 = chain;
                        if (PatchProxy.isSupport(new Object[]{chain2}, this, f80141a, false, 91812, new Class[]{Interceptor.Chain.class}, Response.class)) {
                            return (Response) PatchProxy.accessDispatch(new Object[]{chain2}, this, f80141a, false, 91812, new Class[]{Interceptor.Chain.class}, Response.class);
                        }
                        Request request = chain.request();
                        String header = request.header("User-Agent");
                        InetAddress inetAddress = null;
                        try {
                            Response proceed = chain2.proceed(request);
                            c cVar = b.f80133b.get(request.tag());
                            if (cVar != null) {
                                Connection connection = chain.connection();
                                if (connection == null) {
                                    socket2 = null;
                                } else {
                                    socket2 = connection.socket();
                                }
                                if (socket2 != null) {
                                    InetAddress localAddress = socket2.getLocalAddress();
                                    if (localAddress == null || localAddress.isAnyLocalAddress()) {
                                        str3 = null;
                                    } else {
                                        str3 = localAddress.getHostAddress();
                                    }
                                    InetAddress inetAddress2 = socket2.getInetAddress();
                                    if (inetAddress2 != null) {
                                        str4 = inetAddress2.getHostAddress();
                                    } else {
                                        str4 = null;
                                    }
                                    if (TextUtils.isEmpty(str3)) {
                                        str3 = Proxy.f79958f;
                                        if (TextUtils.isEmpty(str3)) {
                                            str3 = com.toutiao.proxyserver.f.b.a(Proxy.a());
                                        }
                                    }
                                    if (!TextUtils.isEmpty(str3)) {
                                        Proxy.f79958f = str3;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        Route route = connection.route();
                                        if (route == null) {
                                            inetSocketAddress2 = null;
                                        } else {
                                            inetSocketAddress2 = route.socketAddress();
                                        }
                                        if (inetSocketAddress2 != null) {
                                            inetAddress = inetSocketAddress2.getAddress();
                                        }
                                        if (inetAddress != null) {
                                            str4 = inetAddress.getHostAddress();
                                        }
                                    }
                                    cVar.g = str3;
                                    cVar.h = str4;
                                    cVar.f80007f = request.url().toString();
                                    cVar.i = header;
                                }
                            }
                            return proceed;
                        } catch (IOException e2) {
                            throw e2;
                        } catch (Throwable th) {
                            c cVar2 = b.f80133b.get(request.tag());
                            if (cVar2 != null) {
                                Connection connection2 = chain.connection();
                                if (connection2 == null) {
                                    socket = null;
                                } else {
                                    socket = connection2.socket();
                                }
                                if (socket != null) {
                                    InetAddress localAddress2 = socket.getLocalAddress();
                                    if (localAddress2 == null || localAddress2.isAnyLocalAddress()) {
                                        str = null;
                                    } else {
                                        str = localAddress2.getHostAddress();
                                    }
                                    InetAddress inetAddress3 = socket.getInetAddress();
                                    if (inetAddress3 != null) {
                                        str2 = inetAddress3.getHostAddress();
                                    } else {
                                        str2 = null;
                                    }
                                    if (TextUtils.isEmpty(str)) {
                                        str = Proxy.f79958f;
                                        if (TextUtils.isEmpty(str)) {
                                            str = com.toutiao.proxyserver.f.b.a(Proxy.a());
                                        }
                                    }
                                    if (!TextUtils.isEmpty(str)) {
                                        Proxy.f79958f = str;
                                    }
                                    if (TextUtils.isEmpty(str2)) {
                                        Route route2 = connection2.route();
                                        if (route2 == null) {
                                            inetSocketAddress = null;
                                        } else {
                                            inetSocketAddress = route2.socketAddress();
                                        }
                                        if (inetSocketAddress != null) {
                                            inetAddress = inetSocketAddress.getAddress();
                                        }
                                        if (inetAddress != null) {
                                            str2 = inetAddress.getHostAddress();
                                        }
                                    }
                                    cVar2.g = str;
                                    cVar2.h = str2;
                                    cVar2.f80007f = request.url().toString();
                                    cVar2.i = header;
                                }
                            }
                            throw th;
                        }
                    }
                });
                f80135d = builder.build();
            }
            OkHttpClient okHttpClient2 = f80135d;
            return okHttpClient2;
        }
    }

    public static List<Header> a(List<c> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, f80132a, true, 91806, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, null, f80132a, true, 91806, new Class[]{List.class}, List.class);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (c next : list) {
            arrayList.add(new Header(next.f80143b, next.f80144c));
        }
        return arrayList;
    }

    public static Headers b(List<c> list) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{list}, null, f80132a, true, 91807, new Class[]{List.class}, Headers.class)) {
            return (Headers) PatchProxy.accessDispatch(new Object[]{list}, null, f80132a, true, 91807, new Class[]{List.class}, Headers.class);
        }
        Headers.Builder builder = new Headers.Builder();
        for (c next : list) {
            if (Proxy.n) {
                str = next.f80143b;
                if (PatchProxy.isSupport(new Object[]{str}, null, com.toutiao.proxyserver.f.c.f80072a, true, 91896, new Class[]{String.class}, String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[]{str}, null, com.toutiao.proxyserver.f.c.f80072a, true, 91896, new Class[]{String.class}, String.class);
                } else {
                    int length = str.length();
                    StringBuilder sb = null;
                    for (int i = 0; i < length; i++) {
                        char charAt = str.charAt(i);
                        if (charAt <= ' ' || charAt >= 127) {
                            if (sb == null) {
                                sb = new StringBuilder(str.substring(0, i));
                            }
                        } else if (sb != null) {
                            sb.append(charAt);
                        }
                    }
                    if (sb != null) {
                        str = sb.toString();
                    }
                }
                str2 = com.toutiao.proxyserver.f.c.c(next.f80144c);
            } else {
                str = next.f80143b;
                str2 = next.f80144c;
            }
            builder.add(str, str2);
        }
        return builder.build();
    }
}
