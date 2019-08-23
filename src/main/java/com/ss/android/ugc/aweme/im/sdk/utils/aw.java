package com.ss.android.ugc.aweme.im.sdk.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.okhttp.OkHttpClient;
import com.ss.android.ugc.aweme.im.sdk.utils.av;

public final class aw {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52514a;

    /* renamed from: b  reason: collision with root package name */
    private OkHttpClient f52515b;

    /* renamed from: c  reason: collision with root package name */
    private av.a f52516c;

    /* renamed from: d  reason: collision with root package name */
    private av f52517d;

    /* renamed from: e  reason: collision with root package name */
    private int f52518e;

    public final void a(av.a aVar) {
        this.f52516c = aVar;
        if (this.f52517d != null) {
            this.f52517d.f52512b = aVar;
        }
    }

    private void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f52514a, false, 53721, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f52514a, false, 53721, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f52516c != null) {
            this.f52516c.a((Throwable) new IllegalArgumentException(str));
        }
    }

    public aw(OkHttpClient okHttpClient, int i) {
        this.f52515b = okHttpClient;
        this.f52518e = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.squareup.okhttp.Response a(java.lang.String r15, java.lang.String r16) {
        /*
            r14 = this;
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f52514a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class<com.squareup.okhttp.Response> r6 = com.squareup.okhttp.Response.class
            r3 = 0
            r4 = 53717(0xd1d5, float:7.5274E-41)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0046
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f52514a
            r3 = 0
            r4 = 53717(0xd1d5, float:7.5274E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class<com.squareup.okhttp.Response> r6 = com.squareup.okhttp.Response.class
            r1 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.squareup.okhttp.Response r0 = (com.squareup.okhttp.Response) r0
            return r0
        L_0x0046:
            android.content.Context r0 = com.ss.android.common.applog.GlobalContext.getContext()
            boolean r0 = com.bytedance.common.utility.NetworkUtils.isNetworkAvailable(r0)
            r13 = 0
            if (r0 != 0) goto L_0x0065
            android.content.Context r0 = com.ss.android.common.applog.GlobalContext.getContext()
            r1 = 2131560615(0x7f0d08a7, float:1.8746607E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r1)
            r0.a()
            java.lang.String r0 = "network is unavailable"
            r14.a((java.lang.String) r0)
            return r13
        L_0x0065:
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            if (r0 != 0) goto L_0x0200
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 == 0) goto L_0x0073
            goto L_0x0200
        L_0x0073:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f52514a
            r3 = 0
            r4 = 53720(0xd1d8, float:7.5278E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class<java.io.File> r6 = java.io.File.class
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00a7
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f52514a
            r3 = 0
            r4 = 53720(0xd1d8, float:7.5278E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class<java.io.File> r6 = java.io.File.class
            r1 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.io.File r0 = (java.io.File) r0
        L_0x00a5:
            r8 = r0
            goto L_0x00c2
        L_0x00a7:
            java.io.File r0 = new java.io.File
            r0.<init>(r15)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x00bc
            long r1 = r0.length()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x00a5
        L_0x00bc:
            java.lang.String r0 = "file not exists"
            r14.a((java.lang.String) r0)
            r8 = r13
        L_0x00c2:
            if (r8 != 0) goto L_0x00d2
            com.ss.android.ugc.aweme.im.sdk.utils.aw$1 r0 = new com.ss.android.ugc.aweme.im.sdk.utils.aw$1
            r0.<init>()
            com.ss.android.b.a.a.a.b(r0)
            java.lang.String r0 = "file is null"
            r14.a((java.lang.String) r0)
            return r13
        L_0x00d2:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r9
            r0[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f52514a
            r3 = 0
            r4 = 53718(0xd1d6, float:7.5275E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r5[r12] = r1
            java.lang.Class<com.squareup.okhttp.Request> r6 = com.squareup.okhttp.Request.class
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0112
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r9
            r0[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f52514a
            r3 = 0
            r4 = 53718(0xd1d6, float:7.5275E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r5[r12] = r1
            java.lang.Class<com.squareup.okhttp.Request> r6 = com.squareup.okhttp.Request.class
            r1 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.squareup.okhttp.Request r0 = (com.squareup.okhttp.Request) r0
            goto L_0x01f4
        L_0x0112:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f52514a
            r3 = 0
            r4 = 53719(0xd1d7, float:7.5276E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r5[r11] = r1
            java.lang.Class<com.squareup.okhttp.RequestBody> r6 = com.squareup.okhttp.RequestBody.class
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0145
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f52514a
            r3 = 0
            r4 = 53719(0xd1d7, float:7.5276E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r5[r11] = r1
            java.lang.Class<com.squareup.okhttp.RequestBody> r6 = com.squareup.okhttp.RequestBody.class
            r1 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.squareup.okhttp.RequestBody r0 = (com.squareup.okhttp.RequestBody) r0
            goto L_0x017a
        L_0x0145:
            com.squareup.okhttp.MultipartBuilder r0 = new com.squareup.okhttp.MultipartBuilder
            r0.<init>()
            com.ss.android.ugc.aweme.im.sdk.utils.av r1 = new com.ss.android.ugc.aweme.im.sdk.utils.av
            com.ss.android.ugc.aweme.im.sdk.utils.av$a r2 = r7.f52516c
            r1.<init>(r8, r2)
            r7.f52517d = r1
            java.lang.String r1 = "file"
            java.lang.String r2 = r8.getName()
            com.ss.android.ugc.aweme.im.sdk.utils.av r3 = r7.f52517d
            r0.addFormDataPart(r1, r2, r3)
            java.lang.String r1 = com.bytedance.common.utility.DigestUtils.md5Hex((java.io.File) r8)
            java.lang.String r2 = "md5"
            if (r1 != 0) goto L_0x0168
            java.lang.String r1 = ""
        L_0x0168:
            r0.addFormDataPart(r2, r1)
            int r1 = r7.f52518e
            if (r1 != r12) goto L_0x0176
            java.lang.String r1 = "file_type"
            java.lang.String r2 = "mpeg"
            r0.addFormDataPart(r1, r2)
        L_0x0176:
            com.squareup.okhttp.RequestBody r0 = r0.build()
        L_0x017a:
            com.squareup.okhttp.Request$Builder r1 = new com.squareup.okhttp.Request$Builder
            r1.<init>()
            com.squareup.okhttp.Request$Builder r1 = r1.url((java.lang.String) r9)
            com.squareup.okhttp.Request$Builder r8 = r1.post(r0)
            java.lang.String r10 = "Host"
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f52514a
            r3 = 0
            r4 = 53722(0xd1da, float:7.528E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f52514a
            r3 = 0
            r4 = 53722(0xd1da, float:7.528E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x01c4
        L_0x01bc:
            java.net.URI r0 = java.net.URI.create(r16)
            java.lang.String r0 = r0.getHost()
        L_0x01c4:
            com.squareup.okhttp.Request$Builder r0 = r8.addHeader(r10, r0)
            com.squareup.okhttp.Request r0 = r0.build()
            com.squareup.okhttp.OkHttpClient r1 = r7.f52515b
            if (r1 != 0) goto L_0x01d7
            com.squareup.okhttp.OkHttpClient r1 = new com.squareup.okhttp.OkHttpClient
            r1.<init>()
            r7.f52515b = r1
        L_0x01d7:
            com.squareup.okhttp.OkHttpClient r1 = r7.f52515b
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3 = 60000(0xea60, double:2.9644E-319)
            r1.setConnectTimeout(r3, r2)
            com.squareup.okhttp.OkHttpClient r1 = r7.f52515b
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.setWriteTimeout(r3, r2)
            com.squareup.okhttp.OkHttpClient r1 = r7.f52515b
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.setReadTimeout(r3, r2)
            com.squareup.okhttp.OkHttpClient r1 = r7.f52515b
            r1.setRetryOnConnectionFailure(r12)
        L_0x01f4:
            com.squareup.okhttp.OkHttpClient r1 = r7.f52515b
            com.squareup.okhttp.Call r0 = r1.newCall(r0)
            com.squareup.okhttp.Response r0 = r0.execute()     // Catch:{ IOException -> 0x01ff }
            r13 = r0
        L_0x01ff:
            return r13
        L_0x0200:
            java.lang.String r0 = "file or url invalid"
            r14.a((java.lang.String) r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.utils.aw.a(java.lang.String, java.lang.String):com.squareup.okhttp.Response");
    }
}
