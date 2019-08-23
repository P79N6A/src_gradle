package com.ss.android.ugc.aweme.tools.music.c;

import a.g;
import a.i;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.music.f.e;
import com.ss.android.ugc.aweme.utils.be;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74865a;

    /* renamed from: d  reason: collision with root package name */
    private static a f74866d;

    /* renamed from: b  reason: collision with root package name */
    public final int f74867b = 10;

    /* renamed from: c  reason: collision with root package name */
    public final int f74868c = 11;

    /* renamed from: e  reason: collision with root package name */
    private Gson f74869e;

    /* renamed from: f  reason: collision with root package name */
    private be f74870f;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.c.a$a  reason: collision with other inner class name */
    public interface C0780a {
        void a(String str, @Nullable List<com.ss.android.ugc.aweme.shortvideo.lrc.a> list);
    }

    private a() {
        try {
            this.f74870f = be.a(b(), 1, 1, 3145728);
            this.f74869e = e.a();
        } catch (IOException unused) {
        }
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f74865a, true, 87223, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f74865a, true, 87223, new Class[0], a.class);
        }
        if (f74866d == null) {
            synchronized (a.class) {
                if (f74866d == null) {
                    f74866d = new a();
                }
            }
        }
        return f74866d;
    }

    public static File b() {
        if (PatchProxy.isSupport(new Object[0], null, f74865a, true, 87224, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], null, f74865a, true, 87224, new Class[0], File.class);
        }
        if (PatchProxy.isSupport(new Object[]{"lrc"}, null, f74865a, true, 87225, new Class[]{String.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{"lrc"}, null, f74865a, true, 87225, new Class[]{String.class}, File.class);
        }
        File file = new File(b.a(), "lrc");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Nullable
    private List<com.ss.android.ugc.aweme.shortvideo.lrc.a> b(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f74865a, false, 87229, new Class[]{String.class, Integer.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f74865a, false, 87229, new Class[]{String.class, Integer.TYPE}, List.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            if (i != 11) {
                return (List) this.f74869e.fromJson(str, new TypeToken<ArrayList<com.ss.android.ugc.aweme.shortvideo.lrc.a>>() {
                }.getType());
            }
            com.ss.android.ugc.aweme.shortvideo.lrc.a aVar = new com.ss.android.ugc.aweme.shortvideo.lrc.a(0.0f, str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar);
            return arrayList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c A[SYNTHETIC, Splitter:B:21:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073 A[SYNTHETIC, Splitter:B:29:0x0073] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.shortvideo.lrc.a> a(java.lang.String r12, int r13) {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r10 = 1
            r1[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f74865a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r9] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r10] = r2
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r4 = 0
            r5 = 87228(0x154bc, float:1.22232E-40)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x004a
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f74865a
            r4 = 0
            r5 = 87228(0x154bc, float:1.22232E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r9] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r10] = r0
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r2 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x004a:
            r1 = 0
            com.ss.android.ugc.aweme.utils.be r2 = r11.f74870f     // Catch:{ IOException -> 0x0070, all -> 0x0069 }
            com.ss.android.ugc.aweme.utils.be$c r0 = r2.a((java.lang.String) r12)     // Catch:{ IOException -> 0x0070, all -> 0x0069 }
            if (r0 == 0) goto L_0x0068
            java.io.InputStream r2 = r0.a(r9)     // Catch:{ IOException -> 0x0070, all -> 0x0069 }
            java.lang.String r0 = com.ss.android.ugc.aweme.utils.bm.a((java.io.InputStream) r2, (java.lang.String) r1)     // Catch:{ IOException -> 0x0071, all -> 0x0065 }
            java.util.List r0 = r11.b(r0, r13)     // Catch:{ IOException -> 0x0071, all -> 0x0065 }
            if (r2 == 0) goto L_0x0064
            r2.close()     // Catch:{ IOException -> 0x0064 }
        L_0x0064:
            return r0
        L_0x0065:
            r0 = move-exception
            r1 = r2
            goto L_0x006a
        L_0x0068:
            return r1
        L_0x0069:
            r0 = move-exception
        L_0x006a:
            if (r1 == 0) goto L_0x006f
            r1.close()     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            throw r0
        L_0x0070:
            r2 = r1
        L_0x0071:
            if (r2 == 0) goto L_0x0076
            r2.close()     // Catch:{ IOException -> 0x0076 }
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.c.a.a(java.lang.String, int):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0106 A[SYNTHETIC, Splitter:B:34:0x0106] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.shortvideo.lrc.a> a(java.lang.String r21, int r22, java.lang.String r23) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r9 = r23
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r12 = 1
            r0[r12] = r1
            r13 = 2
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f74865a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r3 = 0
            r4 = 87227(0x154bb, float:1.22231E-40)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005f
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0[r12] = r1
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f74865a
            r3 = 0
            r4 = 87227(0x154bb, float:1.22231E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r1 = r20
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x005f:
            r0 = 0
            com.ss.android.ugc.aweme.tools.music.f.c$a r1 = com.ss.android.ugc.aweme.tools.music.f.c.f74889a     // Catch:{ Exception -> 0x0103 }
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0103 }
            r13[r11] = r8     // Catch:{ Exception -> 0x0103 }
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.tools.music.f.c.a.f74890a     // Catch:{ Exception -> 0x0103 }
            r16 = 0
            r17 = 87238(0x154c6, float:1.22246E-40)
            java.lang.Class[] r2 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x0103 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r11] = r3     // Catch:{ Exception -> 0x0103 }
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r14 = r1
            r18 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0103 }
            if (r2 == 0) goto L_0x009b
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0103 }
            r13[r11] = r8     // Catch:{ Exception -> 0x0103 }
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.tools.music.f.c.a.f74890a     // Catch:{ Exception -> 0x0103 }
            r16 = 0
            r17 = 87238(0x154c6, float:1.22246E-40)
            java.lang.Class[] r2 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x0103 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r11] = r3     // Catch:{ Exception -> 0x0103 }
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r14 = r1
            r18 = r2
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0103 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0103 }
            goto L_0x00c6
        L_0x009b:
            java.lang.String r1 = "url"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r1)     // Catch:{ Exception -> 0x0103 }
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ Exception -> 0x0103 }
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVServiceProxy> r2 = com.ss.android.ugc.aweme.services.IAVServiceProxy.class
            java.lang.Object r1 = r1.getService(r2)     // Catch:{ Exception -> 0x0103 }
            java.lang.String r2 = "ServiceManager.get().get…ServiceProxy::class.java)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)     // Catch:{ Exception -> 0x0103 }
            com.ss.android.ugc.aweme.services.IAVServiceProxy r1 = (com.ss.android.ugc.aweme.services.IAVServiceProxy) r1     // Catch:{ Exception -> 0x0103 }
            android.app.Application r1 = r1.getApplication()     // Catch:{ Exception -> 0x0103 }
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ Exception -> 0x0103 }
            boolean r1 = com.ss.android.common.util.NetworkUtils.isNetworkAvailable(r1)     // Catch:{ Exception -> 0x0103 }
            if (r1 == 0) goto L_0x00fb
            java.lang.String r1 = com.ss.android.common.util.NetworkUtils.executeGet(r11, r8)     // Catch:{ Exception -> 0x0103 }
            java.lang.String r2 = "NetworkUtils.executeGet(0, url)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)     // Catch:{ Exception -> 0x0103 }
        L_0x00c6:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0103 }
            if (r2 == 0) goto L_0x00cd
            return r0
        L_0x00cd:
            r2 = r22
            java.util.List r2 = r7.b(r1, r2)     // Catch:{ Exception -> 0x0103 }
            com.ss.android.ugc.aweme.utils.be r3 = r7.f74870f     // Catch:{ Exception -> 0x00f9 }
            com.ss.android.ugc.aweme.utils.be$a r3 = r3.b((java.lang.String) r9)     // Catch:{ Exception -> 0x00f9 }
            if (r3 == 0) goto L_0x00f3
            java.io.OutputStream r4 = r3.a(r11)     // Catch:{ Exception -> 0x00f9 }
            byte[] r0 = r1.getBytes()     // Catch:{ Exception -> 0x00f1 }
            r4.write(r0)     // Catch:{ Exception -> 0x00f1 }
            r4.flush()     // Catch:{ Exception -> 0x00f1 }
            r4.close()     // Catch:{ Exception -> 0x00f1 }
            r3.a()     // Catch:{ Exception -> 0x00f1 }
            r0 = r4
            goto L_0x00f3
        L_0x00f1:
            r0 = r4
            goto L_0x0104
        L_0x00f3:
            com.ss.android.ugc.aweme.utils.be r1 = r7.f74870f     // Catch:{ Exception -> 0x00f9 }
            r1.c()     // Catch:{ Exception -> 0x00f9 }
            goto L_0x0109
        L_0x00f9:
            goto L_0x0104
        L_0x00fb:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x0103 }
            r1.<init>()     // Catch:{ Exception -> 0x0103 }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ Exception -> 0x0103 }
            throw r1     // Catch:{ Exception -> 0x0103 }
        L_0x0103:
            r2 = r0
        L_0x0104:
            if (r0 == 0) goto L_0x0109
            r0.close()     // Catch:{ IOException -> 0x0109 }
        L_0x0109:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.c.a.a(java.lang.String, int, java.lang.String):java.util.List");
    }

    public final void a(final String str, int i, C0780a aVar) {
        String str2 = str;
        C0780a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), aVar2}, this, f74865a, false, 87226, new Class[]{String.class, Integer.TYPE, C0780a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), aVar2}, this, f74865a, false, 87226, new Class[]{String.class, Integer.TYPE, C0780a.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            final SoftReference softReference = new SoftReference(aVar2);
            final int i2 = i;
            i.a((Callable<TResult>) new Callable<List<com.ss.android.ugc.aweme.shortvideo.lrc.a>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f74875a;

                public final /* synthetic */ Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f74875a, false, 87231, new Class[0], List.class)) {
                        return (List) PatchProxy.accessDispatch(new Object[0], this, f74875a, false, 87231, new Class[0], List.class);
                    }
                    String md5Hex = DigestUtils.md5Hex(str);
                    List<com.ss.android.ugc.aweme.shortvideo.lrc.a> a2 = a.this.a(md5Hex, i2);
                    if (!CollectionUtils.isEmpty(a2)) {
                        return a2;
                    }
                    List<com.ss.android.ugc.aweme.shortvideo.lrc.a> a3 = a.this.a(str, i2, md5Hex);
                    if (!CollectionUtils.isEmpty(a3)) {
                        return a3;
                    }
                    return null;
                }
            }).b(new g<List<com.ss.android.ugc.aweme.shortvideo.lrc.a>, i<Void>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f74871a;

                public final /* synthetic */ Object then(i iVar) throws Exception {
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f74871a, false, 87230, new Class[]{i.class}, i.class)) {
                        return (i) PatchProxy.accessDispatch(new Object[]{iVar}, this, f74871a, false, 87230, new Class[]{i.class}, i.class);
                    }
                    if (!(softReference == null || softReference.get() == null)) {
                        ((C0780a) softReference.get()).a(str, (List) iVar.e());
                    }
                    return null;
                }
            }, i.f1052b);
        }
    }
}
