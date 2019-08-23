package com.ss.android.ugc.aweme.net;

import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.lighten.core.b.e;
import com.bytedance.lighten.core.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.j;
import java.io.IOException;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public final class v extends g {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f57029e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Call f57030f;
    public volatile Request g;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final OkHttpClient f57037a;

        static {
            OkHttpClient.Builder builder;
            OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
            if (PatchProxy.isSupport(new Object[]{builder2}, null, j.f4240a, true, 86902, new Class[]{OkHttpClient.Builder.class}, OkHttpClient.Builder.class)) {
                builder = (OkHttpClient.Builder) PatchProxy.accessDispatch(new Object[]{builder2}, null, j.f4240a, true, 86902, new Class[]{OkHttpClient.Builder.class}, OkHttpClient.Builder.class);
            } else {
                builder = builder2.dispatcher(new Dispatcher(h.c()));
            }
            f57037a = builder.build();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f57029e, false, 60771, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57029e, false, 60771, new Class[0], Void.TYPE);
            return;
        }
        if (this.f57030f != null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f57030f.cancel();
                return;
            }
            this.f56944b.execute(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57035a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f57035a, false, 60776, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57035a, false, 60776, new Class[0], Void.TYPE);
                        return;
                    }
                    v.this.f57030f.cancel();
                }
            });
        }
    }

    public final void a(r rVar) {
        this.f56945c = rVar;
    }

    public final void b(final f fVar, final e eVar) {
        if (PatchProxy.isSupport(new Object[]{fVar, eVar}, this, f57029e, false, 60770, new Class[]{f.class, e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar, eVar}, this, f57029e, false, 60770, new Class[]{f.class, e.class}, Void.TYPE);
            return;
        }
        if (!(this.f57030f == null || fVar == null)) {
            this.f57030f.enqueue(new Callback() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57031a;

                public final void onFailure(Call call, IOException iOException) {
                    if (PatchProxy.isSupport(new Object[]{call, iOException}, this, f57031a, false, 60775, new Class[]{Call.class, IOException.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{call, iOException}, this, f57031a, false, 60775, new Class[]{Call.class, IOException.class}, Void.TYPE);
                        return;
                    }
                    v.this.a(null, fVar, call, iOException, eVar);
                }

                /* JADX INFO: finally extract failed */
                /* JADX WARNING: Removed duplicated region for block: B:16:0x0063 A[Catch:{ Exception -> 0x00f7 }] */
                /* JADX WARNING: Removed duplicated region for block: B:23:0x0091 A[SYNTHETIC, Splitter:B:23:0x0091] */
                /* JADX WARNING: Removed duplicated region for block: B:55:0x0122  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onResponse(okhttp3.Call r21, okhttp3.Response r22) throws java.io.IOException {
                    /*
                        r20 = this;
                        r8 = r20
                        r9 = r22
                        r0 = 2
                        java.lang.Object[] r1 = new java.lang.Object[r0]
                        r10 = 0
                        r1[r10] = r21
                        r11 = 1
                        r1[r11] = r9
                        com.meituan.robust.ChangeQuickRedirect r3 = f57031a
                        java.lang.Class[] r6 = new java.lang.Class[r0]
                        java.lang.Class<okhttp3.Call> r2 = okhttp3.Call.class
                        r6[r10] = r2
                        java.lang.Class<okhttp3.Response> r2 = okhttp3.Response.class
                        r6[r11] = r2
                        java.lang.Class r7 = java.lang.Void.TYPE
                        r4 = 0
                        r5 = 60774(0xed66, float:8.5163E-41)
                        r2 = r20
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                        if (r1 == 0) goto L_0x0045
                        java.lang.Object[] r1 = new java.lang.Object[r0]
                        r1[r10] = r21
                        r1[r11] = r9
                        com.meituan.robust.ChangeQuickRedirect r3 = f57031a
                        r4 = 0
                        r5 = 60774(0xed66, float:8.5163E-41)
                        java.lang.Class[] r6 = new java.lang.Class[r0]
                        java.lang.Class<okhttp3.Call> r0 = okhttp3.Call.class
                        r6[r10] = r0
                        java.lang.Class<okhttp3.Response> r0 = okhttp3.Response.class
                        r6[r11] = r0
                        java.lang.Class r7 = java.lang.Void.TYPE
                        r2 = r20
                        com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                        return
                    L_0x0045:
                        r7 = 0
                        if (r9 == 0) goto L_0x0050
                        java.lang.String r0 = "x-snssdk.remoteaddr"
                        java.lang.String r0 = r9.header(r0)     // Catch:{ Exception -> 0x0050 }
                        r10 = r0
                        goto L_0x0051
                    L_0x0050:
                        r10 = r7
                    L_0x0051:
                        com.bytedance.lighten.core.f r0 = r11
                        long r1 = android.os.SystemClock.elapsedRealtime()
                        r0.f21788b = r1
                        okhttp3.ResponseBody r11 = r22.body()
                        boolean r0 = r22.isSuccessful()     // Catch:{ Exception -> 0x00f7 }
                        if (r0 != 0) goto L_0x0091
                        com.ss.android.ugc.aweme.net.v r1 = com.ss.android.ugc.aweme.net.v.this     // Catch:{ Exception -> 0x00f7 }
                        com.bytedance.lighten.core.f r3 = r11     // Catch:{ Exception -> 0x00f7 }
                        java.io.IOException r5 = new java.io.IOException     // Catch:{ Exception -> 0x00f7 }
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f7 }
                        java.lang.String r2 = "Unexpected HTTP code "
                        r0.<init>(r2)     // Catch:{ Exception -> 0x00f7 }
                        r0.append(r9)     // Catch:{ Exception -> 0x00f7 }
                        java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00f7 }
                        r5.<init>(r0)     // Catch:{ Exception -> 0x00f7 }
                        com.bytedance.lighten.core.b.e r6 = r12     // Catch:{ Exception -> 0x00f7 }
                        r2 = r22
                        r4 = r21
                        r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00f7 }
                        r11.close()     // Catch:{ Exception -> 0x0087 }
                        return
                    L_0x0087:
                        r0 = move-exception
                        r1 = r0
                        java.lang.String r0 = "OkHttpNetworkFetchProducer"
                        java.lang.String r2 = "Exception when closing response body"
                        com.facebook.common.logging.FLog.w((java.lang.String) r0, (java.lang.String) r2, (java.lang.Throwable) r1)
                        return
                    L_0x0091:
                        com.ss.android.ugc.aweme.net.v r0 = com.ss.android.ugc.aweme.net.v.this     // Catch:{ Exception -> 0x00f7 }
                        com.ss.android.ugc.aweme.net.s r0 = r0.f56946d     // Catch:{ Exception -> 0x00f7 }
                        java.io.InputStream r1 = r11.byteStream()     // Catch:{ Exception -> 0x00f7 }
                        okhttp3.Request r2 = r22.request()     // Catch:{ Exception -> 0x00f7 }
                        okhttp3.HttpUrl r2 = r2.url()     // Catch:{ Exception -> 0x00f7 }
                        java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00f7 }
                        long r3 = r11.contentLength()     // Catch:{ Exception -> 0x00f7 }
                        android.util.Pair r0 = r0.a(r1, r2, r3)     // Catch:{ Exception -> 0x00f7 }
                        java.lang.Object r1 = r0.second     // Catch:{ Exception -> 0x00f7 }
                        java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00f7 }
                        long r1 = r1.longValue()     // Catch:{ Exception -> 0x00f7 }
                        r3 = 0
                        int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                        if (r5 < 0) goto L_0x00cb
                        com.bytedance.lighten.core.f r5 = r11     // Catch:{ Exception -> 0x00f7 }
                        long r5 = r5.f21790d     // Catch:{ Exception -> 0x00f7 }
                        int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                        if (r12 <= 0) goto L_0x00cc
                        int r5 = r22.code()     // Catch:{ Exception -> 0x00f7 }
                        r6 = 206(0xce, float:2.89E-43)
                        if (r5 == r6) goto L_0x00cc
                    L_0x00cb:
                        r1 = r3
                    L_0x00cc:
                        com.bytedance.lighten.core.b.e r3 = r12     // Catch:{ Exception -> 0x00f7 }
                        java.lang.Object r0 = r0.first     // Catch:{ Exception -> 0x00f7 }
                        java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ Exception -> 0x00f7 }
                        int r4 = (int) r1     // Catch:{ Exception -> 0x00f7 }
                        r3.a(r0, r4)     // Catch:{ Exception -> 0x00f7 }
                        org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x00f7 }
                        r3.<init>()     // Catch:{ Exception -> 0x00f7 }
                        java.lang.String r0 = "image_size"
                        r3.put(r0, r1)     // Catch:{ Exception -> 0x00f0 }
                        r11.close()     // Catch:{ Exception -> 0x00e4 }
                        goto L_0x00ed
                    L_0x00e4:
                        r0 = move-exception
                        r1 = r0
                        java.lang.String r0 = "OkHttpNetworkFetchProducer"
                        java.lang.String r2 = "Exception when closing response body"
                        com.facebook.common.logging.FLog.w((java.lang.String) r0, (java.lang.String) r2, (java.lang.Throwable) r1)
                    L_0x00ed:
                        r19 = r3
                        goto L_0x0115
                    L_0x00f0:
                        r0 = move-exception
                        r5 = r0
                        r7 = r3
                        goto L_0x00f9
                    L_0x00f4:
                        r0 = move-exception
                        r1 = r0
                        goto L_0x0149
                    L_0x00f7:
                        r0 = move-exception
                        r5 = r0
                    L_0x00f9:
                        com.ss.android.ugc.aweme.net.v r1 = com.ss.android.ugc.aweme.net.v.this     // Catch:{ all -> 0x00f4 }
                        com.bytedance.lighten.core.f r3 = r11     // Catch:{ all -> 0x00f4 }
                        com.bytedance.lighten.core.b.e r6 = r12     // Catch:{ all -> 0x00f4 }
                        r2 = r22
                        r4 = r21
                        r1.a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00f4 }
                        r11.close()     // Catch:{ Exception -> 0x010a }
                        goto L_0x0113
                    L_0x010a:
                        r0 = move-exception
                        r1 = r0
                        java.lang.String r0 = "OkHttpNetworkFetchProducer"
                        java.lang.String r2 = "Exception when closing response body"
                        com.facebook.common.logging.FLog.w((java.lang.String) r0, (java.lang.String) r2, (java.lang.Throwable) r1)
                    L_0x0113:
                        r19 = r7
                    L_0x0115:
                        com.bytedance.ttnet.b.b r0 = new com.bytedance.ttnet.b.b
                        r0.<init>()
                        r0.f19730a = r10
                        com.ss.android.ugc.aweme.net.v r1 = com.ss.android.ugc.aweme.net.v.this
                        com.ss.android.ugc.aweme.net.r r1 = r1.f56945c
                        if (r1 == 0) goto L_0x0148
                        com.ss.android.ugc.aweme.net.v r1 = com.ss.android.ugc.aweme.net.v.this
                        com.ss.android.ugc.aweme.net.r r11 = r1.f56945c
                        com.bytedance.lighten.core.f r1 = r11
                        long r1 = r1.f21789c
                        com.bytedance.lighten.core.f r3 = r11
                        long r3 = r3.f21787a
                        long r12 = r1 - r3
                        com.bytedance.lighten.core.f r1 = r11
                        long r1 = r1.f21787a
                        com.ss.android.ugc.aweme.net.v r3 = com.ss.android.ugc.aweme.net.v.this
                        okhttp3.Request r3 = r3.g
                        okhttp3.HttpUrl r3 = r3.url()
                        java.lang.String r16 = r3.toString()
                        r18 = 0
                        r14 = r1
                        r17 = r0
                        r11.b(r12, r14, r16, r17, r18, r19)
                    L_0x0148:
                        return
                    L_0x0149:
                        r11.close()     // Catch:{ Exception -> 0x014d }
                        goto L_0x0156
                    L_0x014d:
                        r0 = move-exception
                        r2 = r0
                        java.lang.String r0 = "OkHttpNetworkFetchProducer"
                        java.lang.String r3 = "Exception when closing response body"
                        com.facebook.common.logging.FLog.w((java.lang.String) r0, (java.lang.String) r3, (java.lang.Throwable) r2)
                    L_0x0156:
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.v.AnonymousClass1.onResponse(okhttp3.Call, okhttp3.Response):void");
                }
            });
        }
    }

    public final void a(f fVar, e eVar) {
        if (PatchProxy.isSupport(new Object[]{fVar, eVar}, this, f57029e, false, 60769, new Class[]{f.class, e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar, eVar}, this, f57029e, false, 60769, new Class[]{f.class, e.class}, Void.TYPE);
            return;
        }
        fVar.f21787a = SystemClock.elapsedRealtime();
        Uri uri = fVar.f21791e;
        Request.Builder builder = new Request.Builder();
        if (fVar.f21790d > 0) {
            builder.header("Range", "bytes=" + fVar.f21790d + "-");
        }
        String a2 = com.bytedance.frameworks.baselib.network.http.e.a(this.f56946d.a(uri.toString()));
        if (StringUtils.isEmpty(a2)) {
            a2 = uri.toString();
        }
        this.g = builder.cacheControl(new CacheControl.Builder().noStore().build()).url(a2).get().build();
        Request request = this.g;
        if (PatchProxy.isSupport(new Object[]{request}, this, f57029e, false, 60772, new Class[]{Request.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{request}, this, f57029e, false, 60772, new Class[]{Request.class}, Void.TYPE);
            return;
        }
        this.f57030f = a.f57037a.newCall(request);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:14|(15:16|17|18|19|20|21|24|25|(1:27)|28|(1:30)|31|(1:33)|34|(1:36))|22|24|25|(0)|28|(0)|31|(0)|34|(0)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00b0 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6 A[Catch:{ Throwable -> 0x00f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c8 A[Catch:{ Throwable -> 0x00f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d6 A[Catch:{ Throwable -> 0x00f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00eb A[Catch:{ Throwable -> 0x00f6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(okhttp3.Response r20, com.bytedance.lighten.core.f r21, okhttp3.Call r22, java.lang.Exception r23, com.bytedance.lighten.core.b.e r24) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            r15 = r23
            r11 = r24
            r12 = 5
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r13 = 0
            r0[r13] = r8
            r14 = 1
            r0[r14] = r9
            r16 = 2
            r0[r16] = r22
            r17 = 3
            r0[r17] = r15
            r18 = 4
            r0[r18] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f57029e
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<okhttp3.Response> r1 = okhttp3.Response.class
            r5[r13] = r1
            java.lang.Class<com.bytedance.lighten.core.f> r1 = com.bytedance.lighten.core.f.class
            r5[r14] = r1
            java.lang.Class<okhttp3.Call> r1 = okhttp3.Call.class
            r5[r16] = r1
            java.lang.Class<java.lang.Exception> r1 = java.lang.Exception.class
            r5[r17] = r1
            java.lang.Class<com.bytedance.lighten.core.b.e> r1 = com.bytedance.lighten.core.b.e.class
            r5[r18] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 60773(0xed65, float:8.5161E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0075
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r8
            r0[r14] = r9
            r0[r16] = r22
            r0[r17] = r15
            r0[r18] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f57029e
            r3 = 0
            r4 = 60773(0xed65, float:8.5161E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<okhttp3.Response> r1 = okhttp3.Response.class
            r5[r13] = r1
            java.lang.Class<com.bytedance.lighten.core.f> r1 = com.bytedance.lighten.core.f.class
            r5[r14] = r1
            java.lang.Class<okhttp3.Call> r1 = okhttp3.Call.class
            r5[r16] = r1
            java.lang.Class<java.lang.Exception> r1 = java.lang.Exception.class
            r5[r17] = r1
            java.lang.Class<com.bytedance.lighten.core.b.e> r1 = com.bytedance.lighten.core.b.e.class
            r5[r18] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0075:
            if (r15 == 0) goto L_0x0093
            java.lang.String r0 = "Canceled"
            java.lang.String r1 = r23.getMessage()     // Catch:{ Throwable -> 0x00f6 }
            boolean r0 = r0.equals(r1)     // Catch:{ Throwable -> 0x00f6 }
            if (r0 != 0) goto L_0x008f
            java.lang.String r0 = "Socket closed"
            java.lang.String r1 = r23.getMessage()     // Catch:{ Throwable -> 0x00f6 }
            boolean r0 = r0.equals(r1)     // Catch:{ Throwable -> 0x00f6 }
            if (r0 == 0) goto L_0x0093
        L_0x008f:
            r24.a()     // Catch:{ Throwable -> 0x00f6 }
            goto L_0x0096
        L_0x0093:
            r11.a(r15)     // Catch:{ Throwable -> 0x00f6 }
        L_0x0096:
            if (r9 == 0) goto L_0x00f5
            r0 = 0
            if (r8 == 0) goto L_0x00af
            java.lang.String r1 = "x-snssdk.remoteaddr"
            java.lang.String r1 = r8.header(r1)     // Catch:{ Exception -> 0x00af }
            okhttp3.Request r2 = r20.request()     // Catch:{ Exception -> 0x00b0 }
            okhttp3.HttpUrl r2 = r2.url()     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00b0 }
            r0 = r2
            goto L_0x00b0
        L_0x00af:
            r1 = r0
        L_0x00b0:
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x00f6 }
            if (r2 == 0) goto L_0x00ba
            java.lang.String r1 = a((java.lang.Throwable) r23)     // Catch:{ Throwable -> 0x00f6 }
        L_0x00ba:
            long r11 = r9.f21787a     // Catch:{ Throwable -> 0x00f6 }
            long r2 = r9.f21789c     // Catch:{ Throwable -> 0x00f6 }
            long r4 = r9.f21787a     // Catch:{ Throwable -> 0x00f6 }
            r6 = 0
            long r2 = r2 - r4
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x00d0
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Throwable -> 0x00f6 }
            long r4 = r9.f21787a     // Catch:{ Throwable -> 0x00f6 }
            r6 = 0
            long r2 = r2 - r4
        L_0x00d0:
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x00f6 }
            if (r4 == 0) goto L_0x00dc
            android.net.Uri r0 = r9.f21791e     // Catch:{ Throwable -> 0x00f6 }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x00f6 }
        L_0x00dc:
            r13 = r0
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x00f6 }
            com.bytedance.ttnet.b.b r14 = new com.bytedance.ttnet.b.b     // Catch:{ Throwable -> 0x00f6 }
            r14.<init>()     // Catch:{ Throwable -> 0x00f6 }
            r14.f19730a = r1     // Catch:{ Throwable -> 0x00f6 }
            com.ss.android.ugc.aweme.net.r r0 = r7.f56945c     // Catch:{ Throwable -> 0x00f6 }
            if (r0 == 0) goto L_0x00f5
            com.ss.android.ugc.aweme.net.r r8 = r7.f56945c     // Catch:{ Throwable -> 0x00f6 }
            r16 = 0
            r9 = r2
            r15 = r23
            r8.a(r9, r11, r13, r14, r15, r16)     // Catch:{ Throwable -> 0x00f6 }
        L_0x00f5:
            return
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.v.a(okhttp3.Response, com.bytedance.lighten.core.f, okhttp3.Call, java.lang.Exception, com.bytedance.lighten.core.b.e):void");
    }
}
