package com.ss.android.ugc.aweme.net;

import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import com.bytedance.lighten.core.b.e;
import com.bytedance.lighten.core.f;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.h;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.b.d;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public final class ad extends g {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f56897e;

    /* renamed from: f  reason: collision with root package name */
    volatile Call<TypedInput> f56898f;
    private final int g = 206;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f56897e, false, 60803, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56897e, false, 60803, new Class[0], Void.TYPE);
            return;
        }
        if (this.f56898f != null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f56898f.cancel();
                return;
            }
            this.f56944b.execute(new ae(this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076 A[Catch:{ Exception -> 0x007b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(com.bytedance.retrofit2.SsResponse<com.bytedance.retrofit2.mime.TypedInput> r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f56897e
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.retrofit2.SsResponse> r3 = com.bytedance.retrofit2.SsResponse.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r5 = 0
            r6 = 60805(0xed85, float:8.5206E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f56897e
            r13 = 0
            r14 = 60805(0xed85, float:8.5206E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.retrofit2.SsResponse> r0 = com.bytedance.retrofit2.SsResponse.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0037:
            java.lang.String r1 = "max-age=\\d+"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r2 = 0
            java.util.List r0 = r18.headers()     // Catch:{ Exception -> 0x007c }
            if (r0 == 0) goto L_0x006b
            int r3 = r0.size()     // Catch:{ Exception -> 0x007c }
            if (r3 <= 0) goto L_0x006b
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x007c }
        L_0x004e:
            boolean r3 = r0.hasNext()     // Catch:{ Exception -> 0x007c }
            if (r3 == 0) goto L_0x006b
            java.lang.Object r3 = r0.next()     // Catch:{ Exception -> 0x007c }
            com.bytedance.retrofit2.client.Header r3 = (com.bytedance.retrofit2.client.Header) r3     // Catch:{ Exception -> 0x007c }
            java.lang.String r4 = "Cache-Control"
            java.lang.String r5 = r3.getName()     // Catch:{ Exception -> 0x007c }
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x007c }
            if (r4 == 0) goto L_0x004e
            java.lang.String r0 = r3.getValue()     // Catch:{ Exception -> 0x007c }
            goto L_0x006c
        L_0x006b:
            r0 = r2
        L_0x006c:
            java.util.regex.Matcher r1 = r1.matcher(r0)     // Catch:{ Exception -> 0x007b }
            boolean r3 = r1.find()     // Catch:{ Exception -> 0x007b }
            if (r3 == 0) goto L_0x007c
            java.lang.String r2 = r1.group()     // Catch:{ Exception -> 0x007b }
            goto L_0x007c
        L_0x007b:
            r2 = r0
        L_0x007c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.ad.a(com.bytedance.retrofit2.SsResponse):java.lang.String");
    }

    public static void a(String[] strArr, List<Header> list) {
        if (PatchProxy.isSupport(new Object[]{strArr, list}, null, f56897e, true, 60806, new Class[]{String[].class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{strArr, list}, null, f56897e, true, 60806, new Class[]{String[].class, List.class}, Void.TYPE);
            return;
        }
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (Header next : list) {
                        if ("x-net-info.remoteaddr".equals(next.getName())) {
                            strArr[0] = next.getValue();
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void b(final f fVar, final e eVar) {
        if (PatchProxy.isSupport(new Object[]{fVar, eVar}, this, f56897e, false, 60802, new Class[]{f.class, e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar, eVar}, this, f56897e, false, 60802, new Class[]{f.class, e.class}, Void.TYPE);
            return;
        }
        if (!(this.f56898f == null || fVar == null)) {
            this.f56898f.enqueue(new h<TypedInput>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56899a;

                public final void a(Call<TypedInput> call, SsResponse<TypedInput> ssResponse) {
                }

                public final void a(Call<TypedInput> call, Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{call, th}, this, f56899a, false, 60809, new Class[]{Call.class, Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{call, th}, this, f56899a, false, 60809, new Class[]{Call.class, Throwable.class}, Void.TYPE);
                        return;
                    }
                    ad.this.a(null, fVar, th, eVar);
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: com.bytedance.ttnet.b.b} */
                /* JADX WARNING: type inference failed for: r0v7, types: [com.bytedance.ttnet.b.b] */
                /* JADX WARNING: type inference failed for: r0v10 */
                /* JADX WARNING: type inference failed for: r0v14, types: [com.bytedance.ttnet.b.b] */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void b(com.bytedance.retrofit2.Call<com.bytedance.retrofit2.mime.TypedInput> r26, com.bytedance.retrofit2.SsResponse<com.bytedance.retrofit2.mime.TypedInput> r27) {
                    /*
                        r25 = this;
                        r8 = r25
                        r0 = r26
                        r9 = r27
                        r10 = 2
                        java.lang.Object[] r1 = new java.lang.Object[r10]
                        r11 = 0
                        r1[r11] = r0
                        r12 = 1
                        r1[r12] = r9
                        com.meituan.robust.ChangeQuickRedirect r3 = f56899a
                        java.lang.Class[] r6 = new java.lang.Class[r10]
                        java.lang.Class<com.bytedance.retrofit2.Call> r2 = com.bytedance.retrofit2.Call.class
                        r6[r11] = r2
                        java.lang.Class<com.bytedance.retrofit2.SsResponse> r2 = com.bytedance.retrofit2.SsResponse.class
                        r6[r12] = r2
                        java.lang.Class r7 = java.lang.Void.TYPE
                        r4 = 0
                        r5 = 60808(0xed88, float:8.521E-41)
                        r2 = r25
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                        if (r1 == 0) goto L_0x0047
                        java.lang.Object[] r1 = new java.lang.Object[r10]
                        r1[r11] = r0
                        r1[r12] = r9
                        com.meituan.robust.ChangeQuickRedirect r3 = f56899a
                        r4 = 0
                        r5 = 60808(0xed88, float:8.521E-41)
                        java.lang.Class[] r6 = new java.lang.Class[r10]
                        java.lang.Class<com.bytedance.retrofit2.Call> r0 = com.bytedance.retrofit2.Call.class
                        r6[r11] = r0
                        java.lang.Class<com.bytedance.retrofit2.SsResponse> r0 = com.bytedance.retrofit2.SsResponse.class
                        r6[r12] = r0
                        java.lang.Class r7 = java.lang.Void.TYPE
                        r2 = r25
                        com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                        return
                    L_0x0047:
                        java.lang.String[] r1 = new java.lang.String[r12]
                        if (r9 != 0) goto L_0x004c
                        return
                    L_0x004c:
                        long r2 = java.lang.System.currentTimeMillis()
                        java.util.List r4 = r27.headers()
                        com.ss.android.ugc.aweme.net.ad.a((java.lang.String[]) r1, (java.util.List<com.bytedance.retrofit2.client.Header>) r4)
                        com.bytedance.lighten.core.f r4 = r11
                        long r5 = android.os.SystemClock.elapsedRealtime()
                        r4.f21788b = r5
                        java.lang.Object r4 = r27.body()
                        com.bytedance.retrofit2.mime.TypedInput r4 = (com.bytedance.retrofit2.mime.TypedInput) r4
                        r5 = 0
                        boolean r6 = r27.isSuccessful()     // Catch:{ Exception -> 0x015b }
                        if (r6 != 0) goto L_0x008c
                        com.ss.android.ugc.aweme.net.ad r0 = com.ss.android.ugc.aweme.net.ad.this     // Catch:{ Exception -> 0x015b }
                        com.bytedance.lighten.core.f r1 = r11     // Catch:{ Exception -> 0x015b }
                        java.io.IOException r2 = new java.io.IOException     // Catch:{ Exception -> 0x015b }
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015b }
                        java.lang.String r4 = "Unexpected HTTP code "
                        r3.<init>(r4)     // Catch:{ Exception -> 0x015b }
                        r3.append(r9)     // Catch:{ Exception -> 0x015b }
                        java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x015b }
                        r2.<init>(r3)     // Catch:{ Exception -> 0x015b }
                        com.bytedance.lighten.core.b.e r3 = r12     // Catch:{ Exception -> 0x015b }
                        r0.a(r9, r1, r2, r3)     // Catch:{ Exception -> 0x015b }
                        com.bytedance.frameworks.baselib.network.http.d.e.a((java.io.Closeable) r5)
                        return
                    L_0x008c:
                        com.ss.android.ugc.aweme.net.ad r6 = com.ss.android.ugc.aweme.net.ad.this     // Catch:{ Exception -> 0x015b }
                        com.ss.android.ugc.aweme.net.s r6 = r6.f56946d     // Catch:{ Exception -> 0x015b }
                        java.io.InputStream r7 = r4.in()     // Catch:{ Exception -> 0x015b }
                        com.bytedance.retrofit2.client.Response r10 = r27.raw()     // Catch:{ Exception -> 0x015b }
                        java.lang.String r10 = r10.getUrl()     // Catch:{ Exception -> 0x015b }
                        long r12 = r4.length()     // Catch:{ Exception -> 0x015b }
                        android.util.Pair r4 = r6.a(r7, r10, r12)     // Catch:{ Exception -> 0x015b }
                        java.lang.Object r6 = r4.first     // Catch:{ Exception -> 0x015b }
                        java.io.InputStream r6 = (java.io.InputStream) r6     // Catch:{ Exception -> 0x015b }
                        java.lang.Object r4 = r4.second     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        long r12 = r4.longValue()     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        r14 = 0
                        int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                        if (r4 < 0) goto L_0x00cb
                        com.bytedance.lighten.core.f r4 = r11     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        r16 = r12
                        long r11 = r4.f21790d     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        int r4 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
                        if (r4 <= 0) goto L_0x00c9
                        int r4 = r27.code()     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        r7 = 206(0xce, float:2.89E-43)
                        if (r4 == r7) goto L_0x00c9
                        goto L_0x00cb
                    L_0x00c9:
                        r14 = r16
                    L_0x00cb:
                        com.bytedance.lighten.core.b.e r4 = r12     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        int r7 = (int) r14     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        r4.a(r6, r7)     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        r4.<init>()     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        com.ss.android.ugc.aweme.net.ad r7 = com.ss.android.ugc.aweme.net.ad.this     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        java.lang.String r7 = r7.a(r9)     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        if (r10 != 0) goto L_0x00e7
                        java.lang.String r10 = "cache_control"
                        r4.put(r10, r7)     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                    L_0x00e7:
                        java.lang.String r7 = "image_size"
                        r4.put(r7, r14)     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        boolean r7 = r0 instanceof com.bytedance.retrofit2.i     // Catch:{ Throwable -> 0x0104 }
                        if (r7 == 0) goto L_0x00f5
                        com.bytedance.retrofit2.i r0 = (com.bytedance.retrofit2.i) r0     // Catch:{ Throwable -> 0x0104 }
                        r0.doCollect()     // Catch:{ Throwable -> 0x0104 }
                    L_0x00f5:
                        com.bytedance.retrofit2.client.Response r0 = r27.raw()     // Catch:{ Throwable -> 0x0104 }
                        java.lang.Object r0 = r0.getExtraInfo()     // Catch:{ Throwable -> 0x0104 }
                        boolean r7 = r0 instanceof com.bytedance.ttnet.b.b     // Catch:{ Throwable -> 0x0104 }
                        if (r7 == 0) goto L_0x0104
                        com.bytedance.ttnet.b.b r0 = (com.bytedance.ttnet.b.b) r0     // Catch:{ Throwable -> 0x0104 }
                        r5 = r0
                    L_0x0104:
                        if (r5 != 0) goto L_0x010c
                        com.bytedance.ttnet.b.b r0 = new com.bytedance.ttnet.b.b     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        r0.<init>()     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        goto L_0x010d
                    L_0x010c:
                        r0 = r5
                    L_0x010d:
                        r0.g = r2     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        r0.h = r2     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        r2 = 0
                        r1 = r1[r2]     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        r0.f19730a = r1     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        com.ss.android.ugc.aweme.net.ad r1 = com.ss.android.ugc.aweme.net.ad.this     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        com.ss.android.ugc.aweme.net.r r1 = r1.f56945c     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        if (r1 == 0) goto L_0x0148
                        com.ss.android.ugc.aweme.net.ad r1 = com.ss.android.ugc.aweme.net.ad.this     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        com.ss.android.ugc.aweme.net.r r1 = r1.f56945c     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        com.bytedance.lighten.core.f r2 = r11     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        long r2 = r2.f21789c     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        com.bytedance.lighten.core.f r5 = r11     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        long r10 = r5.f21787a     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        r5 = 0
                        long r17 = r2 - r10
                        com.bytedance.lighten.core.f r2 = r11     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        long r2 = r2.f21787a     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        com.bytedance.retrofit2.client.Response r5 = r27.raw()     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        java.lang.String r21 = r5.getUrl()     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        r23 = 0
                        r16 = r1
                        r19 = r2
                        r22 = r0
                        r24 = r4
                        r16.b(r17, r19, r21, r22, r23, r24)     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                    L_0x0148:
                        com.ss.android.ugc.traffic.a r0 = com.ss.android.ugc.traffic.a.y     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        int r0 = com.ss.android.ugc.traffic.a.f77812f     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        com.ss.android.ugc.traffic.a.a(r0, r14)     // Catch:{ Exception -> 0x0155, all -> 0x0153 }
                        com.bytedance.frameworks.baselib.network.http.d.e.a((java.io.Closeable) r6)
                        return
                    L_0x0153:
                        r0 = move-exception
                        goto L_0x0169
                    L_0x0155:
                        r0 = move-exception
                        r5 = r6
                        goto L_0x015c
                    L_0x0158:
                        r0 = move-exception
                        r6 = r5
                        goto L_0x0169
                    L_0x015b:
                        r0 = move-exception
                    L_0x015c:
                        com.ss.android.ugc.aweme.net.ad r1 = com.ss.android.ugc.aweme.net.ad.this     // Catch:{ all -> 0x0158 }
                        com.bytedance.lighten.core.f r2 = r11     // Catch:{ all -> 0x0158 }
                        com.bytedance.lighten.core.b.e r3 = r12     // Catch:{ all -> 0x0158 }
                        r1.a(r9, r2, r0, r3)     // Catch:{ all -> 0x0158 }
                        com.bytedance.frameworks.baselib.network.http.d.e.a((java.io.Closeable) r5)
                        return
                    L_0x0169:
                        com.bytedance.frameworks.baselib.network.http.d.e.a((java.io.Closeable) r6)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.ad.AnonymousClass1.b(com.bytedance.retrofit2.Call, com.bytedance.retrofit2.SsResponse):void");
                }
            });
        }
    }

    public final void a(f fVar, e eVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2, eVar}, this, f56897e, false, 60801, new Class[]{f.class, e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2, eVar}, this, f56897e, false, 60801, new Class[]{f.class, e.class}, Void.TYPE);
            return;
        }
        fVar2.f21787a = SystemClock.elapsedRealtime();
        Uri uri = fVar2.f21791e;
        if (uri != null) {
            String a2 = this.f56946d.a(uri.toString());
            if (!StringUtils.isEmpty(a2)) {
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Pair<String, String> parseUrl = UrlUtils.parseUrl(a2, linkedHashMap);
                    if (parseUrl != null) {
                        String str = (String) parseUrl.second;
                        INetworkApi iNetworkApi = (INetworkApi) RetrofitUtils.createSsService((String) parseUrl.first, INetworkApi.class);
                        d dVar = new d();
                        LinkedList linkedList = null;
                        if (fVar2.f21790d > 0) {
                            linkedList = new LinkedList();
                            linkedList.add(new Header("Range", "bytes=" + fVar2.f21790d + "-"));
                        }
                        LinkedList linkedList2 = linkedList;
                        Logger.debug();
                        if (iNetworkApi != null) {
                            this.f56898f = iNetworkApi.downloadFile(false, -1, str, linkedHashMap, linkedList2, dVar);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x007b A[Catch:{ Throwable -> 0x0105 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.retrofit2.SsResponse r18, com.bytedance.lighten.core.f r19, java.lang.Throwable r20, com.bytedance.lighten.core.b.e r21) {
        /*
            r17 = this;
            r7 = r17
            r9 = r19
            r15 = r20
            r10 = r21
            r11 = 4
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r18
            r13 = 1
            r0[r13] = r9
            r14 = 2
            r0[r14] = r15
            r16 = 3
            r0[r16] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f56897e
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.bytedance.retrofit2.SsResponse> r1 = com.bytedance.retrofit2.SsResponse.class
            r5[r12] = r1
            java.lang.Class<com.bytedance.lighten.core.f> r1 = com.bytedance.lighten.core.f.class
            r5[r13] = r1
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r5[r14] = r1
            java.lang.Class<com.bytedance.lighten.core.b.e> r1 = com.bytedance.lighten.core.b.e.class
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 60804(0xed84, float:8.5205E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0064
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r18
            r0[r13] = r9
            r0[r14] = r15
            r0[r16] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f56897e
            r3 = 0
            r4 = 60804(0xed84, float:8.5205E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.bytedance.retrofit2.SsResponse> r1 = com.bytedance.retrofit2.SsResponse.class
            r5[r12] = r1
            java.lang.Class<com.bytedance.lighten.core.f> r1 = com.bytedance.lighten.core.f.class
            r5[r13] = r1
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r5[r14] = r1
            java.lang.Class<com.bytedance.lighten.core.b.e> r1 = com.bytedance.lighten.core.b.e.class
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0064:
            if (r15 == 0) goto L_0x0076
            java.lang.String r0 = "request canceled"
            java.lang.String r1 = r20.getMessage()     // Catch:{ Throwable -> 0x0105 }
            boolean r0 = r0.equals(r1)     // Catch:{ Throwable -> 0x0105 }
            if (r0 == 0) goto L_0x0076
            r21.a()     // Catch:{ Throwable -> 0x0105 }
            goto L_0x0079
        L_0x0076:
            r10.a(r15)     // Catch:{ Throwable -> 0x0105 }
        L_0x0079:
            if (r9 == 0) goto L_0x0104
            java.lang.String[] r0 = new java.lang.String[r13]     // Catch:{ Throwable -> 0x0105 }
            if (r18 == 0) goto L_0x0088
            if (r18 == 0) goto L_0x0088
            java.util.List r1 = r18.headers()     // Catch:{ Throwable -> 0x0105 }
            a((java.lang.String[]) r0, (java.util.List<com.bytedance.retrofit2.client.Header>) r1)     // Catch:{ Throwable -> 0x0105 }
        L_0x0088:
            r1 = r0[r12]     // Catch:{ Throwable -> 0x0105 }
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x0105 }
            if (r1 == 0) goto L_0x0096
            java.lang.String r1 = a((java.lang.Throwable) r20)     // Catch:{ Throwable -> 0x0105 }
            r0[r12] = r1     // Catch:{ Throwable -> 0x0105 }
        L_0x0096:
            long r1 = r9.f21787a     // Catch:{ Throwable -> 0x0105 }
            long r3 = r9.f21789c     // Catch:{ Throwable -> 0x0105 }
            long r5 = r9.f21787a     // Catch:{ Throwable -> 0x0105 }
            r10 = 0
            long r3 = r3 - r5
            r5 = 0
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x00ac
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Throwable -> 0x0105 }
            long r5 = r9.f21787a     // Catch:{ Throwable -> 0x0105 }
            r10 = 0
            long r3 = r3 - r5
        L_0x00ac:
            r5 = 0
            boolean r6 = com.bytedance.common.utility.StringUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x0105 }
            if (r6 == 0) goto L_0x00c4
            if (r18 == 0) goto L_0x00be
            com.bytedance.retrofit2.client.Response r5 = r18.raw()     // Catch:{ Throwable -> 0x0105 }
            java.lang.String r5 = r5.getUrl()     // Catch:{ Throwable -> 0x0105 }
            goto L_0x00c4
        L_0x00be:
            android.net.Uri r5 = r9.f21791e     // Catch:{ Throwable -> 0x0105 }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0105 }
        L_0x00c4:
            r13 = r5
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0105 }
            boolean r5 = r15 instanceof com.bytedance.frameworks.baselib.network.http.cronet.a.a     // Catch:{ Throwable -> 0x0105 }
            if (r5 == 0) goto L_0x00eb
            r5 = r15
            com.bytedance.frameworks.baselib.network.http.cronet.a.a r5 = (com.bytedance.frameworks.baselib.network.http.cronet.a.a) r5     // Catch:{ Throwable -> 0x0105 }
            com.bytedance.frameworks.baselib.network.http.a r5 = r5.getRequestInfo()     // Catch:{ Throwable -> 0x0105 }
            boolean r6 = r5 instanceof com.bytedance.ttnet.b.b     // Catch:{ Throwable -> 0x0105 }
            if (r6 == 0) goto L_0x00da
            com.bytedance.ttnet.b.b r5 = (com.bytedance.ttnet.b.b) r5     // Catch:{ Throwable -> 0x0105 }
            goto L_0x00f0
        L_0x00da:
            com.bytedance.ttnet.b.b r5 = new com.bytedance.ttnet.b.b     // Catch:{ Throwable -> 0x0105 }
            r5.<init>()     // Catch:{ Throwable -> 0x0105 }
            r5.u = r12     // Catch:{ Throwable -> 0x0105 }
            r6 = r15
            com.bytedance.frameworks.baselib.network.http.cronet.a.a r6 = (com.bytedance.frameworks.baselib.network.http.cronet.a.a) r6     // Catch:{ Throwable -> 0x0105 }
            java.lang.String r6 = r6.getRequestLog()     // Catch:{ Throwable -> 0x0105 }
            r5.v = r6     // Catch:{ Throwable -> 0x0105 }
            goto L_0x00f0
        L_0x00eb:
            com.bytedance.ttnet.b.b r5 = new com.bytedance.ttnet.b.b     // Catch:{ Throwable -> 0x0105 }
            r5.<init>()     // Catch:{ Throwable -> 0x0105 }
        L_0x00f0:
            r14 = r5
            r0 = r0[r12]     // Catch:{ Throwable -> 0x0105 }
            r14.f19730a = r0     // Catch:{ Throwable -> 0x0105 }
            com.ss.android.ugc.aweme.net.r r0 = r7.f56945c     // Catch:{ Throwable -> 0x0105 }
            if (r0 == 0) goto L_0x0104
            com.ss.android.ugc.aweme.net.r r8 = r7.f56945c     // Catch:{ Throwable -> 0x0105 }
            r16 = 0
            r9 = r3
            r11 = r1
            r15 = r20
            r8.a(r9, r11, r13, r14, r15, r16)     // Catch:{ Throwable -> 0x0105 }
        L_0x0104:
            return
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.ad.a(com.bytedance.retrofit2.SsResponse, com.bytedance.lighten.core.f, java.lang.Throwable, com.bytedance.lighten.core.b.e):void");
    }
}
