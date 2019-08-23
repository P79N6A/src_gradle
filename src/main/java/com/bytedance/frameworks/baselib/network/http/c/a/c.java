package com.bytedance.frameworks.baselib.network.http.c.a;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.e;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public final class c implements Interceptor {
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a2 A[Catch:{ Throwable -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d5 A[SYNTHETIC, Splitter:B:92:0x01d5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r20) throws java.io.IOException {
        /*
            r19 = this;
            r9 = r19
            okhttp3.Request r1 = r20.request()
            okhttp3.HttpUrl r0 = r1.url()     // Catch:{ Exception -> 0x000f }
            java.net.URI r0 = r0.uri()     // Catch:{ Exception -> 0x000f }
            goto L_0x001b
        L_0x000f:
            okhttp3.HttpUrl r0 = r1.url()
            java.lang.String r0 = r0.toString()
            java.net.URI r0 = com.bytedance.frameworks.baselib.network.http.util.i.b(r0)
        L_0x001b:
            r10 = r0
            okhttp3.Request$Builder r2 = r1.newBuilder()
            if (r10 == 0) goto L_0x0082
            if (r1 == 0) goto L_0x0082
            if (r2 != 0) goto L_0x0027
            goto L_0x0082
        L_0x0027:
            com.bytedance.frameworks.baselib.network.http.e$i r0 = com.bytedance.frameworks.baselib.network.http.e.a()     // Catch:{ Throwable -> 0x0082 }
            if (r0 == 0) goto L_0x0082
            boolean r3 = r0.a((java.net.URI) r10)     // Catch:{ Throwable -> 0x0082 }
            if (r3 == 0) goto L_0x0082
            java.util.Map r3 = r0.a()     // Catch:{ Throwable -> 0x0082 }
            java.lang.String r4 = "token"
            java.lang.Object r4 = r3.get(r4)     // Catch:{ Throwable -> 0x0082 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x0082 }
            boolean r5 = com.bytedance.common.utility.StringUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x0082 }
            if (r5 != 0) goto L_0x004a
            java.lang.String r5 = "tko"
            r2.addHeader(r5, r4)     // Catch:{ Throwable -> 0x0082 }
        L_0x004a:
            java.lang.String r4 = "version"
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Throwable -> 0x0082 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Throwable -> 0x0082 }
            int r3 = r3.intValue()     // Catch:{ Throwable -> 0x0082 }
            if (r3 <= 0) goto L_0x0061
            java.lang.String r4 = "tkv"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x0082 }
            r2.addHeader(r4, r3)     // Catch:{ Throwable -> 0x0082 }
        L_0x0061:
            okhttp3.HttpUrl r3 = r1.url()     // Catch:{ Throwable -> 0x0082 }
            java.lang.String r3 = r3.encodedQuery()     // Catch:{ Throwable -> 0x0082 }
            android.util.Pair r0 = r0.a((java.lang.String) r3)     // Catch:{ Throwable -> 0x0082 }
            if (r0 == 0) goto L_0x0082
            java.lang.Object r3 = r0.first     // Catch:{ Throwable -> 0x0082 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Throwable -> 0x0082 }
            boolean r3 = r3.booleanValue()     // Catch:{ Throwable -> 0x0082 }
            if (r3 == 0) goto L_0x0082
            java.lang.String r3 = "thm"
            java.lang.Object r0 = r0.second     // Catch:{ Throwable -> 0x0082 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x0082 }
            r2.addHeader(r3, r0)     // Catch:{ Throwable -> 0x0082 }
        L_0x0082:
            java.net.CookieHandler r11 = java.net.CookieHandler.getDefault()
            okhttp3.Headers r3 = r1.headers()
            r12 = 5
            r4 = 0
            r5 = 1
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Throwable -> 0x0163 }
            r0.<init>()     // Catch:{ Throwable -> 0x0163 }
            if (r3 == 0) goto L_0x00b8
            java.util.Set r6 = r3.names()     // Catch:{ Throwable -> 0x0163 }
            if (r6 == 0) goto L_0x00b8
            boolean r7 = r6.isEmpty()     // Catch:{ Throwable -> 0x0163 }
            if (r7 != 0) goto L_0x00b8
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Throwable -> 0x0163 }
        L_0x00a4:
            boolean r7 = r6.hasNext()     // Catch:{ Throwable -> 0x0163 }
            if (r7 == 0) goto L_0x00b8
            java.lang.Object r7 = r6.next()     // Catch:{ Throwable -> 0x0163 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x0163 }
            java.util.List r8 = r3.values(r7)     // Catch:{ Throwable -> 0x0163 }
            r0.put(r7, r8)     // Catch:{ Throwable -> 0x0163 }
            goto L_0x00a4
        L_0x00b8:
            r6 = 0
            if (r11 == 0) goto L_0x00dd
            java.util.Map r0 = r11.get(r10, r0)     // Catch:{ IOException -> 0x00c0 }
            goto L_0x00de
        L_0x00c0:
            r0 = move-exception
            r7 = r0
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.get()     // Catch:{ Throwable -> 0x0163 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0163 }
            java.lang.String r13 = "Loading cookies failed for "
            r8.<init>(r13)     // Catch:{ Throwable -> 0x0163 }
            java.lang.String r13 = "/..."
            java.net.URI r13 = r10.resolve(r13)     // Catch:{ Throwable -> 0x0163 }
            r8.append(r13)     // Catch:{ Throwable -> 0x0163 }
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x0163 }
            r0.log(r12, r8, r7)     // Catch:{ Throwable -> 0x0163 }
        L_0x00dd:
            r0 = r6
        L_0x00de:
            if (r0 == 0) goto L_0x0155
            int r6 = r0.size()     // Catch:{ Throwable -> 0x0163 }
            if (r6 <= 0) goto L_0x0155
            java.util.Set r0 = r0.entrySet()     // Catch:{ Throwable -> 0x0163 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Throwable -> 0x0163 }
        L_0x00ee:
            boolean r6 = r0.hasNext()     // Catch:{ Throwable -> 0x0163 }
            if (r6 == 0) goto L_0x0163
            java.lang.Object r6 = r0.next()     // Catch:{ Throwable -> 0x0163 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ Throwable -> 0x0163 }
            java.lang.Object r7 = r6.getKey()     // Catch:{ Throwable -> 0x0163 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x0163 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0163 }
            r8.<init>()     // Catch:{ Throwable -> 0x0163 }
            java.lang.String r13 = "X-SS-Cookie"
            boolean r13 = r13.equalsIgnoreCase(r7)     // Catch:{ Throwable -> 0x0163 }
            if (r13 != 0) goto L_0x011d
            java.lang.String r13 = "Cookie"
            boolean r13 = r13.equalsIgnoreCase(r7)     // Catch:{ Throwable -> 0x0163 }
            if (r13 != 0) goto L_0x011d
            java.lang.String r13 = "Cookie2"
            boolean r13 = r13.equalsIgnoreCase(r7)     // Catch:{ Throwable -> 0x0163 }
            if (r13 == 0) goto L_0x00ee
        L_0x011d:
            java.lang.Object r13 = r6.getValue()     // Catch:{ Throwable -> 0x0163 }
            java.util.List r13 = (java.util.List) r13     // Catch:{ Throwable -> 0x0163 }
            boolean r13 = r13.isEmpty()     // Catch:{ Throwable -> 0x0163 }
            if (r13 != 0) goto L_0x00ee
            java.lang.Object r6 = r6.getValue()     // Catch:{ Throwable -> 0x0163 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ Throwable -> 0x0163 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Throwable -> 0x0163 }
            r13 = 0
        L_0x0134:
            boolean r14 = r6.hasNext()     // Catch:{ Throwable -> 0x0163 }
            if (r14 == 0) goto L_0x014d
            java.lang.Object r14 = r6.next()     // Catch:{ Throwable -> 0x0163 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Throwable -> 0x0163 }
            if (r13 <= 0) goto L_0x0147
            java.lang.String r15 = "; "
            r8.append(r15)     // Catch:{ Throwable -> 0x0163 }
        L_0x0147:
            r8.append(r14)     // Catch:{ Throwable -> 0x0163 }
            int r13 = r13 + 1
            goto L_0x0134
        L_0x014d:
            java.lang.String r6 = r8.toString()     // Catch:{ Throwable -> 0x0163 }
            a((java.net.URI) r10, (java.lang.String) r7, (java.lang.String) r6, (okhttp3.Request.Builder) r2)     // Catch:{ Throwable -> 0x0163 }
            goto L_0x00ee
        L_0x0155:
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Throwable -> 0x0163 }
            java.lang.String r6 = "X-SS-Cookie"
            r0[r4] = r6     // Catch:{ Throwable -> 0x0163 }
            java.lang.String r6 = "Cookie"
            r0[r5] = r6     // Catch:{ Throwable -> 0x0163 }
            r9.a((java.net.URI) r10, (okhttp3.Headers) r3, (java.lang.String[]) r0, (okhttp3.Request.Builder) r2)     // Catch:{ Throwable -> 0x0163 }
        L_0x0163:
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.String r5 = "x-tt-token"
            r0[r4] = r5
            r9.a((java.net.URI) r10, (okhttp3.Headers) r3, (java.lang.String[]) r0, (okhttp3.Request.Builder) r2)
            okhttp3.Request r0 = r2.build()     // Catch:{ Throwable -> 0x0173 }
        L_0x0170:
            r1 = r20
            goto L_0x0175
        L_0x0173:
            r0 = r1
            goto L_0x0170
        L_0x0175:
            okhttp3.Response r13 = r1.proceed(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            okhttp3.Response$Builder r14 = r13.newBuilder()
            okhttp3.Headers r15 = r13.headers()     // Catch:{ Throwable -> 0x01d3 }
            java.lang.String r1 = "tko"
            java.lang.String r16 = r15.get(r1)     // Catch:{ Throwable -> 0x01d3 }
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet     // Catch:{ Throwable -> 0x01d3 }
            r8.<init>()     // Catch:{ Throwable -> 0x01d3 }
            java.lang.String r1 = "X-SS-Set-Cookie"
            r8.add(r1)     // Catch:{ Throwable -> 0x01d3 }
            java.lang.String r1 = "Set-Cookie"
            r8.add(r1)     // Catch:{ Throwable -> 0x01d3 }
            java.lang.String r1 = "x-tt-token"
            r8.add(r1)     // Catch:{ Throwable -> 0x01d3 }
            if (r15 == 0) goto L_0x01d3
            java.util.Set r1 = r15.names()     // Catch:{ Throwable -> 0x01d3 }
            if (r1 == 0) goto L_0x01d3
            boolean r2 = r1.isEmpty()     // Catch:{ Throwable -> 0x01d3 }
            if (r2 != 0) goto L_0x01d3
            java.util.Iterator r17 = r1.iterator()     // Catch:{ Throwable -> 0x01d3 }
        L_0x01b2:
            boolean r1 = r17.hasNext()     // Catch:{ Throwable -> 0x01d3 }
            if (r1 == 0) goto L_0x01d3
            java.lang.Object r1 = r17.next()     // Catch:{ Throwable -> 0x01d3 }
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x01d3 }
            java.util.List r5 = r15.values(r4)     // Catch:{ Throwable -> 0x01d3 }
            r1 = r19
            r2 = r10
            r3 = r16
            r6 = r8
            r7 = r0
            r18 = r8
            r8 = r14
            r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x01d3 }
            r8 = r18
            goto L_0x01b2
        L_0x01d3:
            if (r11 == 0) goto L_0x01f6
            r11.put(r10, r0)     // Catch:{ IOException -> 0x01d9 }
            goto L_0x01f6
        L_0x01d9:
            r0 = move-exception
            r1 = r0
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.get()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Saving cookies failed for "
            r2.<init>(r3)
            java.lang.String r3 = "/..."
            java.net.URI r3 = r10.resolve(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.log(r12, r2, r1)
        L_0x01f6:
            okhttp3.Response r0 = r14.build()     // Catch:{ Throwable -> 0x01fb }
            goto L_0x01fc
        L_0x01fb:
            r0 = r13
        L_0x01fc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.c.a.c.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    private static boolean a(Set<String> set, String str) {
        if (set == null || TextUtils.isEmpty(str)) {
            return false;
        }
        for (String equalsIgnoreCase : set) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }

    private static void a(URI uri, String str, String str2, Request.Builder builder) {
        if (uri != null && !StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2) && builder != null) {
            try {
                e.i a2 = e.a();
                if (a2 != null && a2.a(uri)) {
                    Pair<Boolean, byte[]> a3 = a2.a(str2.getBytes());
                    if (a3 != null && ((Boolean) a3.first).booleanValue()) {
                        str2 = Base64.encodeToString((byte[]) a3.second, 2);
                    }
                }
            } catch (Throwable unused) {
            }
            builder.addHeader(str, str2);
        }
    }

    private void a(URI uri, Headers headers, String[] strArr, Request.Builder builder) {
        if (uri != null && headers != null && strArr.length > 0 && builder != null) {
            try {
                for (String str : strArr) {
                    List<String> values = headers.values(str);
                    if (values != null && values.size() > 0) {
                        builder.removeHeader(str);
                        for (String a2 : values) {
                            a(uri, str, a2, builder);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void a(URI uri, String str, String str2, List<String> list, Set<String> set, Map<String, List<String>> map, Response.Builder builder) {
        if (uri != null && !StringUtils.isEmpty(str2) && list != null && list.size() > 0) {
            try {
                LinkedList linkedList = new LinkedList();
                if (!a(set, str2) || !PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(str)) {
                    for (String add : list) {
                        linkedList.add(add);
                    }
                } else {
                    builder.removeHeader(str2);
                    for (String next : list) {
                        e.i a2 = e.a();
                        if (a2 != null && a2.a(uri)) {
                            Pair<Boolean, byte[]> b2 = a2.b(Base64.decode(next, 2));
                            if (b2 != null && ((Boolean) b2.first).booleanValue()) {
                                String str3 = new String((byte[]) b2.second);
                                linkedList.add(str3);
                                builder.header(str2, str3);
                            }
                        }
                    }
                }
                list = linkedList;
            } catch (Throwable unused) {
            }
            map.put(str2, list);
        }
    }
}
