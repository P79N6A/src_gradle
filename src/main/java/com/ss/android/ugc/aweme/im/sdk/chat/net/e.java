package com.ss.android.ugc.aweme.im.sdk.chat.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.okhttp.OkHttpClient;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.net.f;
import com.ss.android.ugc.aweme.im.sdk.utils.d;

public class e extends aa implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50920a;

    /* renamed from: e  reason: collision with root package name */
    private static int f50921e;

    /* renamed from: b  reason: collision with root package name */
    protected UrlModel f50922b;

    /* renamed from: c  reason: collision with root package name */
    public String f50923c;

    /* renamed from: d  reason: collision with root package name */
    protected f.a f50924d;

    /* renamed from: f  reason: collision with root package name */
    private f f50925f;

    public boolean a(String str) {
        return true;
    }

    public String b(String str) {
        return str;
    }

    public String c(String str) {
        return str;
    }

    public String a() {
        if (PatchProxy.isSupport(new Object[0], this, f50920a, false, 51240, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f50920a, false, 51240, new Class[0], String.class);
        }
        return GlobalContext.getContext().getExternalFilesDir(d.b() + "/im/download").getAbsolutePath();
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0147 A[SYNTHETIC, Splitter:B:65:0x0147] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0151 A[SYNTHETIC, Splitter:B:70:0x0151] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x015f A[SYNTHETIC, Splitter:B:80:0x015f] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0169 A[SYNTHETIC, Splitter:B:85:0x0169] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r13 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f50920a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 51234(0xc822, float:7.1794E-41)
            r2 = r13
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f50920a
            r5 = 0
            r6 = 51234(0xc822, float:7.1794E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            java.lang.String r1 = r13.a()
            r13.f50923c = r1
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r13.f50923c
            java.lang.String r2 = r13.b(r2)
            r1.<init>(r2)
            java.lang.String r2 = r1.getAbsolutePath()
            boolean r2 = r13.a((java.lang.String) r2)
            r3 = 0
            if (r2 == 0) goto L_0x0049
            java.lang.String r0 = r1.getAbsolutePath()
            r13.a(r0, r3)
            return
        L_0x0049:
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r13.f50922b
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r6 = f50920a
            r7 = 0
            r8 = 51241(0xc829, float:7.1804E-41)
            java.lang.Class[] r9 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.base.model.UrlModel> r5 = com.ss.android.ugc.aweme.base.model.UrlModel.class
            r9[r0] = r5
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r5 = r13
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0083
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r7 = f50920a
            r8 = 0
            r9 = 51241(0xc829, float:7.1804E-41)
            java.lang.Class[] r10 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.base.model.UrlModel> r1 = com.ss.android.ugc.aweme.base.model.UrlModel.class
            r10[r0] = r1
            java.lang.Class r11 = java.lang.Boolean.TYPE
            r6 = r13
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x00b7
        L_0x0083:
            com.ss.android.ugc.aweme.im.sdk.chat.net.f r4 = r13.f50925f
            if (r4 != 0) goto L_0x0093
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "downloader is null"
            r1.<init>(r2)
            r13.a((java.lang.Throwable) r1)
        L_0x0091:
            r1 = 0
            goto L_0x00b7
        L_0x0093:
            com.ss.android.ugc.aweme.im.sdk.chat.net.f r4 = r13.f50925f
            r4.f50927b = r13
            if (r1 == 0) goto L_0x00ac
            java.util.List r4 = r1.getUrlList()
            if (r4 == 0) goto L_0x00ac
            java.util.List r1 = r1.getUrlList()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            r1 = 1
            goto L_0x00b7
        L_0x00ac:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "downloadUrl is null"
            r1.<init>(r2)
            r13.a((java.lang.Throwable) r1)
            goto L_0x0091
        L_0x00b7:
            if (r1 != 0) goto L_0x00ba
            return
        L_0x00ba:
            com.ss.android.ugc.aweme.im.sdk.chat.net.f r1 = r13.f50925f
            java.lang.String r2 = r13.f50923c
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r13.f50922b
            com.squareup.okhttp.Response r1 = r1.a(r2, r4)
            if (r1 != 0) goto L_0x00d1
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "response is null"
            r0.<init>(r1)
            r13.a((java.lang.Throwable) r0)
            return
        L_0x00d1:
            java.io.File r2 = new java.io.File
            java.lang.String r4 = r13.f50923c
            java.lang.String r5 = "download"
            java.lang.String r5 = r13.c(r5)
            r2.<init>(r4, r5)
            r4 = 2048(0x800, float:2.87E-42)
            byte[] r4 = new byte[r4]
            com.squareup.okhttp.ResponseBody r5 = r1.body()     // Catch:{ Exception -> 0x0140, all -> 0x013c }
            java.io.InputStream r5 = r5.byteStream()     // Catch:{ Exception -> 0x0140, all -> 0x013c }
            com.squareup.okhttp.ResponseBody r1 = r1.body()     // Catch:{ Exception -> 0x0138, all -> 0x0135 }
            long r6 = r1.contentLength()     // Catch:{ Exception -> 0x0138, all -> 0x0135 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0138, all -> 0x0135 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0138, all -> 0x0135 }
            r8 = 0
        L_0x00f9:
            int r10 = r5.read(r4)     // Catch:{ Exception -> 0x0133, all -> 0x0131 }
            r11 = -1
            if (r10 == r11) goto L_0x0114
            r1.write(r4, r0, r10)     // Catch:{ Exception -> 0x0133, all -> 0x0131 }
            long r10 = (long) r10     // Catch:{ Exception -> 0x0133, all -> 0x0131 }
            long r8 = r8 + r10
            float r10 = (float) r8     // Catch:{ Exception -> 0x0133, all -> 0x0131 }
            r11 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10 * r11
            float r12 = (float) r6     // Catch:{ Exception -> 0x0133, all -> 0x0131 }
            float r10 = r10 / r12
            float r10 = r10 * r11
            int r10 = (int) r10     // Catch:{ Exception -> 0x0133, all -> 0x0131 }
            double r10 = (double) r10     // Catch:{ Exception -> 0x0133, all -> 0x0131 }
            r13.a((double) r10)     // Catch:{ Exception -> 0x0133, all -> 0x0131 }
            goto L_0x00f9
        L_0x0114:
            r1.flush()     // Catch:{ Exception -> 0x0133, all -> 0x0131 }
            java.lang.String r0 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x0133, all -> 0x0131 }
            r13.a(r0, r3)     // Catch:{ Exception -> 0x0133, all -> 0x0131 }
            if (r5 == 0) goto L_0x0128
            r5.close()     // Catch:{ IOException -> 0x0124 }
            goto L_0x0128
        L_0x0124:
            r0 = move-exception
            r13.a((java.lang.Throwable) r0)
        L_0x0128:
            r1.close()     // Catch:{ IOException -> 0x012c }
            return
        L_0x012c:
            r0 = move-exception
            r13.a((java.lang.Throwable) r0)
            return
        L_0x0131:
            r0 = move-exception
            goto L_0x015d
        L_0x0133:
            r0 = move-exception
            goto L_0x013a
        L_0x0135:
            r0 = move-exception
            r1 = r3
            goto L_0x015d
        L_0x0138:
            r0 = move-exception
            r1 = r3
        L_0x013a:
            r3 = r5
            goto L_0x0142
        L_0x013c:
            r0 = move-exception
            r1 = r3
            r5 = r1
            goto L_0x015d
        L_0x0140:
            r0 = move-exception
            r1 = r3
        L_0x0142:
            r13.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x015b }
            if (r3 == 0) goto L_0x014f
            r3.close()     // Catch:{ IOException -> 0x014b }
            goto L_0x014f
        L_0x014b:
            r0 = move-exception
            r13.a((java.lang.Throwable) r0)
        L_0x014f:
            if (r1 == 0) goto L_0x015a
            r1.close()     // Catch:{ IOException -> 0x0155 }
            return
        L_0x0155:
            r0 = move-exception
            r13.a((java.lang.Throwable) r0)
            return
        L_0x015a:
            return
        L_0x015b:
            r0 = move-exception
            r5 = r3
        L_0x015d:
            if (r5 == 0) goto L_0x0167
            r5.close()     // Catch:{ IOException -> 0x0163 }
            goto L_0x0167
        L_0x0163:
            r2 = move-exception
            r13.a((java.lang.Throwable) r2)
        L_0x0167:
            if (r1 == 0) goto L_0x0171
            r1.close()     // Catch:{ IOException -> 0x016d }
            goto L_0x0171
        L_0x016d:
            r1 = move-exception
            r13.a((java.lang.Throwable) r1)
        L_0x0171:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.net.e.run():void");
    }

    public final void a(f.a aVar) {
        this.f50924d = aVar;
        if (this.f50925f != null) {
            this.f50925f.f50927b = this;
        }
    }

    public e(OkHttpClient okHttpClient) {
        this.f50925f = new f(okHttpClient);
        f50921e++;
        this.i = String.valueOf(f50921e);
    }

    public void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f50920a, false, 51238, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f50920a, false, 51238, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        if (this.f50924d != null) {
            this.f50924d.a(th);
        }
        b();
    }

    public final void a(double d2) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, this, f50920a, false, 51237, new Class[]{Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, this, f50920a, false, 51237, new Class[]{Double.TYPE}, Void.TYPE);
            return;
        }
        if (this.f50924d != null) {
            this.f50924d.a(d2);
        }
    }

    public void a(String str, UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{str, urlModel}, this, f50920a, false, 51236, new Class[]{String.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, urlModel}, this, f50920a, false, 51236, new Class[]{String.class, UrlModel.class}, Void.TYPE);
            return;
        }
        if (this.f50924d != null) {
            this.f50924d.a(str, urlModel);
        }
        b();
    }
}
