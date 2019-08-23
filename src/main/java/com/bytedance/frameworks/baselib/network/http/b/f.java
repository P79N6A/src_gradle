package com.bytedance.frameworks.baselib.network.http.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.ss.android.ugc.aweme.q.c;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public static String f19760a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f19761b = "f";

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, String> f19762d = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f19763c;

    /* renamed from: e  reason: collision with root package name */
    private final Map<URI, Set<h>> f19764e = new LinkedHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ad, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r15 = this;
            monitor-enter(r15)
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.b.h>> r0 = r15.f19764e     // Catch:{ all -> 0x01b2 }
            if (r0 == 0) goto L_0x01b0
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.b.h>> r0 = r15.f19764e     // Catch:{ all -> 0x01b2 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01b2 }
            if (r0 == 0) goto L_0x000f
            goto L_0x01b0
        L_0x000f:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x01b2 }
            r0.<init>()     // Catch:{ all -> 0x01b2 }
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.b.h>> r1 = r15.f19764e     // Catch:{ all -> 0x01b2 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x01b2 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x01b2 }
        L_0x001e:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x01b2 }
            if (r2 == 0) goto L_0x0050
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x01b2 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x01b2 }
            if (r2 == 0) goto L_0x001e
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x01b2 }
            java.net.URI r3 = (java.net.URI) r3     // Catch:{ all -> 0x01b2 }
            java.lang.String r4 = r3.getScheme()     // Catch:{ all -> 0x01b2 }
            if (r4 == 0) goto L_0x001e
            java.lang.String r3 = r3.getScheme()     // Catch:{ all -> 0x01b2 }
            java.lang.String r4 = "https"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x01b2 }
            if (r3 == 0) goto L_0x001e
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x01b2 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x01b2 }
            r0.put(r3, r2)     // Catch:{ all -> 0x01b2 }
            goto L_0x001e
        L_0x0050:
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x01b2 }
            if (r1 == 0) goto L_0x0058
            monitor-exit(r15)
            return
        L_0x0058:
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x01b2 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01b2 }
        L_0x0060:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x01b2 }
            if (r1 == 0) goto L_0x0126
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x01b2 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x01b2 }
            if (r1 == 0) goto L_0x0060
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x01b2 }
            java.net.URI r2 = (java.net.URI) r2     // Catch:{ all -> 0x01b2 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x01b2 }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x01b2 }
            java.net.URI r3 = new java.net.URI     // Catch:{ Throwable -> 0x0060 }
            java.lang.String r4 = r2.toString()     // Catch:{ Throwable -> 0x0060 }
            java.lang.String r5 = "https:"
            java.lang.String r6 = "http:"
            java.lang.String r4 = r4.replace(r5, r6)     // Catch:{ Throwable -> 0x0060 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0060 }
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.b.h>> r4 = r15.f19764e     // Catch:{ Throwable -> 0x0060 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ Throwable -> 0x0060 }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ Throwable -> 0x0060 }
            if (r4 == 0) goto L_0x011a
            boolean r5 = r4.isEmpty()     // Catch:{ Throwable -> 0x0060 }
            if (r5 == 0) goto L_0x009d
            goto L_0x011a
        L_0x009d:
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet     // Catch:{ Throwable -> 0x0060 }
            r5.<init>()     // Catch:{ Throwable -> 0x0060 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Throwable -> 0x0060 }
        L_0x00a6:
            boolean r6 = r4.hasNext()     // Catch:{ Throwable -> 0x0060 }
            if (r6 == 0) goto L_0x00f4
            java.lang.Object r6 = r4.next()     // Catch:{ Throwable -> 0x0060 }
            com.bytedance.frameworks.baselib.network.http.b.h r6 = (com.bytedance.frameworks.baselib.network.http.b.h) r6     // Catch:{ Throwable -> 0x0060 }
            r7 = 0
            java.util.Iterator r8 = r1.iterator()     // Catch:{ Throwable -> 0x0060 }
        L_0x00b7:
            boolean r9 = r8.hasNext()     // Catch:{ Throwable -> 0x0060 }
            if (r9 == 0) goto L_0x00ee
            java.lang.Object r9 = r8.next()     // Catch:{ Throwable -> 0x0060 }
            com.bytedance.frameworks.baselib.network.http.b.h r9 = (com.bytedance.frameworks.baselib.network.http.b.h) r9     // Catch:{ Throwable -> 0x0060 }
            if (r6 == 0) goto L_0x00b7
            if (r9 == 0) goto L_0x00b7
            com.bytedance.frameworks.baselib.network.http.b.e r10 = r6.getHttpCookie()     // Catch:{ Throwable -> 0x0060 }
            com.bytedance.frameworks.baselib.network.http.b.e r11 = r9.getHttpCookie()     // Catch:{ Throwable -> 0x0060 }
            boolean r10 = r10.equals(r11)     // Catch:{ Throwable -> 0x0060 }
            if (r10 == 0) goto L_0x00b7
            java.lang.Long r10 = r9.getWhenCreated()     // Catch:{ Throwable -> 0x0060 }
            long r10 = r10.longValue()     // Catch:{ Throwable -> 0x0060 }
            java.lang.Long r12 = r6.getWhenCreated()     // Catch:{ Throwable -> 0x0060 }
            long r12 = r12.longValue()     // Catch:{ Throwable -> 0x0060 }
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x00b7
            r5.add(r9)     // Catch:{ Throwable -> 0x0060 }
            r7 = 1
            goto L_0x00b7
        L_0x00ee:
            if (r7 != 0) goto L_0x00a6
            r5.add(r6)     // Catch:{ Throwable -> 0x0060 }
            goto L_0x00a6
        L_0x00f4:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Throwable -> 0x0060 }
        L_0x00f8:
            boolean r4 = r1.hasNext()     // Catch:{ Throwable -> 0x0060 }
            if (r4 == 0) goto L_0x010e
            java.lang.Object r4 = r1.next()     // Catch:{ Throwable -> 0x0060 }
            com.bytedance.frameworks.baselib.network.http.b.h r4 = (com.bytedance.frameworks.baselib.network.http.b.h) r4     // Catch:{ Throwable -> 0x0060 }
            boolean r6 = r5.contains(r4)     // Catch:{ Throwable -> 0x0060 }
            if (r6 != 0) goto L_0x00f8
            r5.add(r4)     // Catch:{ Throwable -> 0x0060 }
            goto L_0x00f8
        L_0x010e:
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.b.h>> r1 = r15.f19764e     // Catch:{ Throwable -> 0x0060 }
            r1.remove(r2)     // Catch:{ Throwable -> 0x0060 }
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.b.h>> r1 = r15.f19764e     // Catch:{ Throwable -> 0x0060 }
            r1.put(r3, r5)     // Catch:{ Throwable -> 0x0060 }
            goto L_0x0060
        L_0x011a:
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.b.h>> r4 = r15.f19764e     // Catch:{ Throwable -> 0x0060 }
            r4.remove(r2)     // Catch:{ Throwable -> 0x0060 }
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.b.h>> r2 = r15.f19764e     // Catch:{ Throwable -> 0x0060 }
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x0060 }
            goto L_0x0060
        L_0x0126:
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.b.h>> r0 = r15.f19764e     // Catch:{ Throwable -> 0x01ae }
            if (r0 == 0) goto L_0x01ac
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.b.h>> r0 = r15.f19764e     // Catch:{ Throwable -> 0x01ae }
            boolean r0 = r0.isEmpty()     // Catch:{ Throwable -> 0x01ae }
            if (r0 == 0) goto L_0x0134
            goto L_0x01ac
        L_0x0134:
            android.content.SharedPreferences r0 = r15.f19763c     // Catch:{ Throwable -> 0x01ae }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Throwable -> 0x01ae }
            r0.clear()     // Catch:{ Throwable -> 0x01ae }
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.b.h>> r1 = r15.f19764e     // Catch:{ Throwable -> 0x01ae }
            java.util.Set r1 = r1.entrySet()     // Catch:{ Throwable -> 0x01ae }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Throwable -> 0x01ae }
        L_0x0147:
            boolean r2 = r1.hasNext()     // Catch:{ Throwable -> 0x01ae }
            if (r2 == 0) goto L_0x01a7
            java.lang.Object r2 = r1.next()     // Catch:{ Throwable -> 0x01ae }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ Throwable -> 0x01ae }
            java.lang.Object r3 = r2.getKey()     // Catch:{ Throwable -> 0x01ae }
            java.net.URI r3 = (java.net.URI) r3     // Catch:{ Throwable -> 0x01ae }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Throwable -> 0x01ae }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ Throwable -> 0x01ae }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Throwable -> 0x01ae }
        L_0x0163:
            boolean r4 = r2.hasNext()     // Catch:{ Throwable -> 0x01ae }
            if (r4 == 0) goto L_0x0147
            java.lang.Object r4 = r2.next()     // Catch:{ Throwable -> 0x01ae }
            com.bytedance.frameworks.baselib.network.http.b.h r4 = (com.bytedance.frameworks.baselib.network.http.b.h) r4     // Catch:{ Throwable -> 0x01ae }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01ae }
            r5.<init>()     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r6 = r3.toString()     // Catch:{ Throwable -> 0x01ae }
            r5.append(r6)     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r6 = "|"
            r5.append(r6)     // Catch:{ Throwable -> 0x01ae }
            com.bytedance.frameworks.baselib.network.http.b.e r6 = r4.getHttpCookie()     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r6 = r6.f19753f     // Catch:{ Throwable -> 0x01ae }
            r5.append(r6)     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r6 = r4.encode()     // Catch:{ Throwable -> 0x01ae }
            com.bytedance.frameworks.baselib.network.http.b.e r4 = r4.getHttpCookie()     // Catch:{ Throwable -> 0x01ae }
            long r7 = r4.f19752e     // Catch:{ Throwable -> 0x01ae }
            r9 = 0
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x01a1
            r0.putString(r5, r6)     // Catch:{ Throwable -> 0x01ae }
            goto L_0x0163
        L_0x01a1:
            java.util.Map<java.lang.String, java.lang.String> r4 = f19762d     // Catch:{ Throwable -> 0x01ae }
            r4.put(r5, r6)     // Catch:{ Throwable -> 0x01ae }
            goto L_0x0163
        L_0x01a7:
            com.bytedance.common.utility.persistent.SharedPrefsEditorCompat.apply(r0)     // Catch:{ Throwable -> 0x01ae }
            monitor-exit(r15)
            return
        L_0x01ac:
            monitor-exit(r15)
            return
        L_0x01ae:
            monitor-exit(r15)
            return
        L_0x01b0:
            monitor-exit(r15)
            return
        L_0x01b2:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.b.f.a():void");
    }

    public f(Context context) {
        String str;
        int i;
        if (f19760a == null) {
            str = "cookieStore";
        } else {
            str = f19760a;
        }
        if (Build.VERSION.SDK_INT < 11) {
            i = 0;
        } else {
            i = 4;
        }
        this.f19763c = c.a(context, str, i);
        a(this.f19763c.getAll(), true);
        a(f19762d, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0010 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.bytedance.frameworks.baselib.network.http.b.e> a(java.net.URI r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00c1 }
            r0.<init>()     // Catch:{ all -> 0x00c1 }
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.b.h>> r1 = r9.f19764e     // Catch:{ all -> 0x00c1 }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x00c1 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00c1 }
        L_0x0010:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00c1 }
            if (r2 == 0) goto L_0x008a
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00c1 }
            java.net.URI r2 = (java.net.URI) r2     // Catch:{ all -> 0x00c1 }
            java.lang.String r3 = r2.getHost()     // Catch:{ all -> 0x00c1 }
            java.lang.String r4 = r10.getHost()     // Catch:{ all -> 0x00c1 }
            boolean r5 = r4.equals(r3)     // Catch:{ all -> 0x00c1 }
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L_0x0043
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
            java.lang.String r8 = "."
            r5.<init>(r8)     // Catch:{ all -> 0x00c1 }
            r5.append(r3)     // Catch:{ all -> 0x00c1 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00c1 }
            boolean r3 = r4.endsWith(r3)     // Catch:{ all -> 0x00c1 }
            if (r3 == 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r3 = 0
            goto L_0x0044
        L_0x0043:
            r3 = 1
        L_0x0044:
            if (r3 == 0) goto L_0x0010
            java.lang.String r3 = r2.getPath()     // Catch:{ all -> 0x00c1 }
            java.lang.String r4 = r10.getPath()     // Catch:{ all -> 0x00c1 }
            boolean r5 = r4.equals(r3)     // Catch:{ all -> 0x00c1 }
            if (r5 != 0) goto L_0x007b
            boolean r5 = r4.startsWith(r3)     // Catch:{ all -> 0x00c1 }
            r8 = 47
            if (r5 == 0) goto L_0x0067
            int r5 = r3.length()     // Catch:{ all -> 0x00c1 }
            int r5 = r5 - r7
            char r5 = r3.charAt(r5)     // Catch:{ all -> 0x00c1 }
            if (r5 == r8) goto L_0x007b
        L_0x0067:
            boolean r5 = r4.startsWith(r3)     // Catch:{ all -> 0x00c1 }
            if (r5 == 0) goto L_0x007c
            int r3 = r3.length()     // Catch:{ all -> 0x00c1 }
            java.lang.String r3 = r4.substring(r3)     // Catch:{ all -> 0x00c1 }
            char r3 = r3.charAt(r6)     // Catch:{ all -> 0x00c1 }
            if (r3 != r8) goto L_0x007c
        L_0x007b:
            r6 = 1
        L_0x007c:
            if (r6 == 0) goto L_0x0010
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.b.h>> r3 = r9.f19764e     // Catch:{ all -> 0x00c1 }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x00c1 }
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x00c1 }
            r0.addAll(r2)     // Catch:{ all -> 0x00c1 }
            goto L_0x0010
        L_0x008a:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00c1 }
            r1.<init>()     // Catch:{ all -> 0x00c1 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00c1 }
            r2.<init>()     // Catch:{ all -> 0x00c1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00c1 }
        L_0x0098:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x00c1 }
            if (r3 == 0) goto L_0x00b6
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x00c1 }
            com.bytedance.frameworks.baselib.network.http.b.h r3 = (com.bytedance.frameworks.baselib.network.http.b.h) r3     // Catch:{ all -> 0x00c1 }
            boolean r4 = r3.hasExpired()     // Catch:{ all -> 0x00c1 }
            if (r4 == 0) goto L_0x00ae
            r2.add(r3)     // Catch:{ all -> 0x00c1 }
            goto L_0x0098
        L_0x00ae:
            com.bytedance.frameworks.baselib.network.http.b.e r3 = r3.getHttpCookie()     // Catch:{ all -> 0x00c1 }
            r1.add(r3)     // Catch:{ all -> 0x00c1 }
            goto L_0x0098
        L_0x00b6:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x00c1 }
            if (r0 != 0) goto L_0x00bf
            r9.a((java.net.URI) r10, (java.util.List<com.bytedance.frameworks.baselib.network.http.b.h>) r2)     // Catch:{ all -> 0x00c1 }
        L_0x00bf:
            monitor-exit(r9)
            return r1
        L_0x00c1:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.b.f.a(java.net.URI):java.util.List");
    }

    private static URI b(URI uri, e eVar) {
        String str;
        if (eVar.f19751d == null) {
            return uri;
        }
        String str2 = eVar.f19751d;
        if (str2.charAt(0) == '.') {
            str2 = str2.substring(1);
        }
        try {
            if (eVar.g == null) {
                str = "/";
            } else {
                str = eVar.g;
            }
            return new URI("http", str2, str, null);
        } catch (URISyntaxException unused) {
            return uri;
        }
    }

    private void a(URI uri, List<h> list) {
        SharedPreferences.Editor edit = this.f19763c.edit();
        Iterator<h> it2 = list.iterator();
        while (it2.hasNext()) {
            String str = uri.toString() + "|" + it2.next().getHttpCookie().f19753f;
            edit.remove(str);
            f19762d.remove(str);
        }
        edit.apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(java.util.Map<java.lang.String, ?> r5, boolean r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L_0x0068
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x000a
            goto L_0x0068
        L_0x000a:
            java.util.Set r5 = r5.entrySet()     // Catch:{ Throwable -> 0x0063 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Throwable -> 0x0063 }
        L_0x0012:
            boolean r0 = r5.hasNext()     // Catch:{ Throwable -> 0x0063 }
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r5.next()     // Catch:{ Throwable -> 0x0063 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Throwable -> 0x0063 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ Throwable -> 0x0063 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x0063 }
            java.lang.String r2 = "\\|"
            r3 = 2
            java.lang.String[] r1 = r1.split(r2, r3)     // Catch:{ Throwable -> 0x0063 }
            java.net.URI r2 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0012 }
            r3 = 0
            r1 = r1[r3]     // Catch:{ URISyntaxException -> 0x0012 }
            r2.<init>(r1)     // Catch:{ URISyntaxException -> 0x0012 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ URISyntaxException -> 0x0012 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ URISyntaxException -> 0x0012 }
            com.bytedance.frameworks.baselib.network.http.b.h r0 = com.bytedance.frameworks.baselib.network.http.b.h.decode(r0)     // Catch:{ URISyntaxException -> 0x0012 }
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.b.h>> r1 = r4.f19764e     // Catch:{ URISyntaxException -> 0x0012 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ URISyntaxException -> 0x0012 }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ URISyntaxException -> 0x0012 }
            if (r1 != 0) goto L_0x0051
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ URISyntaxException -> 0x0012 }
            r1.<init>()     // Catch:{ URISyntaxException -> 0x0012 }
            java.util.Map<java.net.URI, java.util.Set<com.bytedance.frameworks.baselib.network.http.b.h>> r3 = r4.f19764e     // Catch:{ URISyntaxException -> 0x0012 }
            r3.put(r2, r1)     // Catch:{ URISyntaxException -> 0x0012 }
        L_0x0051:
            if (r0 == 0) goto L_0x0012
            r1.add(r0)     // Catch:{ URISyntaxException -> 0x0012 }
            goto L_0x0012
        L_0x0057:
            if (r6 == 0) goto L_0x0061
            com.bytedance.frameworks.baselib.network.http.b.f$1 r5 = new com.bytedance.frameworks.baselib.network.http.b.f$1     // Catch:{ Throwable -> 0x0063 }
            r5.<init>()     // Catch:{ Throwable -> 0x0063 }
            com.bytedance.common.utility.concurrent.ThreadPlus.submitRunnable(r5)     // Catch:{ Throwable -> 0x0063 }
        L_0x0061:
            monitor-exit(r4)
            return
        L_0x0063:
            monitor-exit(r4)
            return
        L_0x0065:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0068:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.b.f.a(java.util.Map, boolean):void");
    }

    public final synchronized void a(URI uri, e eVar) {
        URI b2 = b(uri, eVar);
        Set set = this.f19764e.get(b2);
        h hVar = new h(eVar);
        if (set == null) {
            set = new HashSet();
            this.f19764e.put(b2, set);
        } else {
            set.remove(hVar);
        }
        set.add(hVar);
        String str = b2.toString() + "|" + hVar.getHttpCookie().f19753f;
        String encode = hVar.encode();
        if (hVar.getHttpCookie().f19752e > 0) {
            SharedPreferences.Editor edit = this.f19763c.edit();
            edit.putString(str, encode);
            edit.apply();
            return;
        }
        f19762d.put(str, encode);
    }
}
