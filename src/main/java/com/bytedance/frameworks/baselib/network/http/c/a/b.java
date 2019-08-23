package com.bytedance.frameworks.baselib.network.http.c.a;

import com.bytedance.frameworks.baselib.network.http.e;
import com.ss.android.ugc.aweme.shortvideo.ea;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.ConnectionPool;
import okhttp3.CookieJar;
import okhttp3.Dns;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static int f19774b;

    /* renamed from: a  reason: collision with root package name */
    private OkHttpClient f19775a;

    public final OkHttpClient a() {
        e.h();
        synchronized (e.class) {
            if (this.f19775a != null) {
                OkHttpClient okHttpClient = this.f19775a;
                if (f19774b > 0 && f19774b < 4 && okHttpClient != null) {
                    OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
                    a(newBuilder);
                    newBuilder.build();
                }
                OkHttpClient okHttpClient2 = this.f19775a;
                return okHttpClient2;
            }
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            if (f19774b > 0 && f19774b < 4) {
                a(builder);
            }
            builder.connectionPool(new ConnectionPool(15, 180000, TimeUnit.MILLISECONDS));
            builder.connectTimeout(ea.f66827f, TimeUnit.MILLISECONDS);
            builder.readTimeout(ea.f66827f, TimeUnit.MILLISECONDS);
            builder.writeTimeout(ea.f66827f, TimeUnit.MILLISECONDS);
            builder.addNetworkInterceptor(new Interceptor() {
                /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|(1:4)(1:5)|(1:7)|8|9|10|(4:12|13|14|25)(1:27)|(1:(1:23))) */
                /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
                    r4 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
                    if (r1 != null) goto L_0x003b;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
                    r0 = r4.getMessage();
                    r2 = new java.lang.StringBuilder();
                    r2.append(r1.getAddress().getHostAddress());
                    r2.append("|");
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
                    if (r0 == null) goto L_0x0056;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
                    r0 = "null";
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
                    r2.append(r0);
                    com.bytedance.common.utility.reflect.Reflect.on((java.lang.Object) r4).set("detailMessage", r2.toString());
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001b */
                /* JADX WARNING: Removed duplicated region for block: B:12:0x0021 A[SYNTHETIC, Splitter:B:12:0x0021] */
                /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r4) throws java.io.IOException {
                    /*
                        r3 = this;
                        okhttp3.Request r0 = r4.request()
                        r1 = 0
                        okhttp3.Connection r2 = r4.connection()     // Catch:{ Throwable -> 0x001b }
                        if (r2 == 0) goto L_0x0010
                        okhttp3.Route r2 = r2.route()     // Catch:{ Throwable -> 0x001b }
                        goto L_0x0011
                    L_0x0010:
                        r2 = r1
                    L_0x0011:
                        if (r2 == 0) goto L_0x0018
                        java.net.InetSocketAddress r2 = r2.socketAddress()     // Catch:{ Throwable -> 0x001b }
                        r1 = r2
                    L_0x0018:
                        com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x001b }
                    L_0x001b:
                        okhttp3.Response r4 = r4.proceed(r0)     // Catch:{ IOException -> 0x0038 }
                        if (r1 == 0) goto L_0x0037
                        okhttp3.Response$Builder r0 = r4.newBuilder()     // Catch:{ Throwable -> 0x0037 }
                        java.lang.String r2 = "x-net-info.remoteaddr"
                        java.net.InetAddress r1 = r1.getAddress()     // Catch:{ Throwable -> 0x0037 }
                        java.lang.String r1 = r1.getHostAddress()     // Catch:{ Throwable -> 0x0037 }
                        r0.addHeader(r2, r1)     // Catch:{ Throwable -> 0x0037 }
                        okhttp3.Response r0 = r0.build()     // Catch:{ Throwable -> 0x0037 }
                        r4 = r0
                    L_0x0037:
                        return r4
                    L_0x0038:
                        r4 = move-exception
                        if (r1 == 0) goto L_0x0068
                        java.lang.String r0 = r4.getMessage()     // Catch:{ Throwable -> 0x0068 }
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0068 }
                        r2.<init>()     // Catch:{ Throwable -> 0x0068 }
                        java.net.InetAddress r1 = r1.getAddress()     // Catch:{ Throwable -> 0x0068 }
                        java.lang.String r1 = r1.getHostAddress()     // Catch:{ Throwable -> 0x0068 }
                        r2.append(r1)     // Catch:{ Throwable -> 0x0068 }
                        java.lang.String r1 = "|"
                        r2.append(r1)     // Catch:{ Throwable -> 0x0068 }
                        if (r0 != 0) goto L_0x0058
                        java.lang.String r0 = "null"
                    L_0x0058:
                        r2.append(r0)     // Catch:{ Throwable -> 0x0068 }
                        com.bytedance.common.utility.reflect.Reflect r0 = com.bytedance.common.utility.reflect.Reflect.on((java.lang.Object) r4)     // Catch:{ Throwable -> 0x0068 }
                        java.lang.String r1 = "detailMessage"
                        java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0068 }
                        r0.set(r1, r2)     // Catch:{ Throwable -> 0x0068 }
                    L_0x0068:
                        throw r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.c.a.b.AnonymousClass1.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
                }
            });
            builder.dns(new Dns() {
                public final List<InetAddress> lookup(String str) throws UnknownHostException {
                    boolean z;
                    if (e.h != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return Dns.SYSTEM.lookup(str);
                    }
                    List<InetAddress> list = null;
                    try {
                        e.c cVar = e.i;
                        if (cVar != null) {
                            list = cVar.a(str);
                        }
                    } catch (Exception unused) {
                    }
                    if (list == null || list.isEmpty()) {
                        return Dns.SYSTEM.lookup(str);
                    }
                    return list;
                }
            });
            builder.cookieJar(CookieJar.NO_COOKIES);
            builder.addInterceptor(new c());
            builder.addInterceptor(new d());
            this.f19775a = builder.build();
            return this.f19775a;
        }
    }

    public static void a(int i) {
        if (i > 0 && f19774b == 0) {
            f19774b = i;
        }
    }

    private static void a(OkHttpClient.Builder builder) {
        if (builder != null) {
            ArrayList arrayList = new ArrayList();
            switch (f19774b) {
                case 1:
                    arrayList.add(Protocol.HTTP_2);
                    break;
                case 2:
                    arrayList.add(Protocol.SPDY_3);
                    break;
                case 3:
                    break;
                default:
                    arrayList.add(Protocol.HTTP_2);
                    arrayList.add(Protocol.SPDY_3);
                    break;
            }
            f19774b = 4;
            arrayList.add(Protocol.HTTP_1_1);
            builder.protocols(Collections.unmodifiableList(arrayList));
        }
    }
}
