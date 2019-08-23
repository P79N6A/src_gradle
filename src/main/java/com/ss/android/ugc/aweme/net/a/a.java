package com.ss.android.ugc.aweme.net.a;

import com.bytedance.ies.net.cronet.IESCronetClient;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.mime.TypedInput;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.a.b.b;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import java.util.HashMap;

public final class a extends IESCronetClient implements b {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f56817c;

    /* renamed from: d  reason: collision with root package name */
    public static HashMap<String, Call<TypedInput>> f56818d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public static HashMap<String, String> f56819e = new HashMap<>();

    public static boolean a(int i) {
        switch (i) {
            case c.f69428f /*?: ONE_ARG  (wrap: ?
  ?: SGET   com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f int)*/:
            case 301:
            case 302:
            case 303:
            case 307:
            case 308:
                return true;
            default:
                return false;
        }
    }

    public final void a(String str, HashMap<String, String> hashMap, com.ss.android.ugc.a.b.a aVar) {
        final String str2 = str;
        final HashMap<String, String> hashMap2 = hashMap;
        final com.ss.android.ugc.a.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, hashMap2, aVar2}, this, f56817c, false, 60848, new Class[]{String.class, HashMap.class, com.ss.android.ugc.a.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, hashMap2, aVar2}, this, f56817c, false, 60848, new Class[]{String.class, HashMap.class, com.ss.android.ugc.a.b.a.class}, Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56820a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f56820a, false, 60852, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f56820a, false, 60852, new Class[0], Void.TYPE);
                    return;
                }
                a.this.b(str2, hashMap2, aVar2);
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ea, code lost:
        if (r12 != false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ec, code lost:
        com.bytedance.frameworks.baselib.network.a.b.a().d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ff, code lost:
        if (0 == 0) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0102, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.lang.String r22, java.util.HashMap<java.lang.String, java.lang.String> r23, com.ss.android.ugc.a.b.a r24) {
        /*
            r21 = this;
            r8 = r21
            r0 = r22
            r9 = r23
            r10 = r24
            r11 = 3
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r12 = 0
            r1[r12] = r0
            r13 = 1
            r1[r13] = r9
            r14 = 2
            r1[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r3 = f56817c
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r12] = r2
            java.lang.Class<java.util.HashMap> r2 = java.util.HashMap.class
            r6[r13] = r2
            java.lang.Class<com.ss.android.ugc.a.b.a> r2 = com.ss.android.ugc.a.b.a.class
            r6[r14] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 60849(0xedb1, float:8.5268E-41)
            r2 = r21
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0056
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r1[r12] = r0
            r1[r13] = r9
            r1[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r3 = f56817c
            r4 = 0
            r5 = 60849(0xedb1, float:8.5268E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r12] = r0
            java.lang.Class<java.util.HashMap> r0 = java.util.HashMap.class
            r6[r13] = r0
            java.lang.Class<com.ss.android.ugc.a.b.a> r0 = com.ss.android.ugc.a.b.a.class
            r6[r14] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0056:
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r22)
            if (r1 == 0) goto L_0x005d
            return
        L_0x005d:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            r1.<init>()     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            android.util.Pair r2 = com.bytedance.frameworks.baselib.network.http.util.UrlUtils.parseUrl(r0, r1)     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            java.lang.Object r3 = r2.first     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            java.lang.Object r2 = r2.second     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            com.bytedance.ies.net.cronet.IIESNetworkApi r14 = r8.a((java.lang.String) r3)     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            if (r14 == 0) goto L_0x00ea
            com.bytedance.frameworks.baselib.network.http.e$e r2 = com.bytedance.frameworks.baselib.network.http.e.c()     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            if (r2 == 0) goto L_0x008a
            boolean r2 = r2.b(r0)     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            if (r2 == 0) goto L_0x008a
            com.bytedance.frameworks.baselib.network.a.b r2 = com.bytedance.frameworks.baselib.network.a.b.a()     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            r2.c()     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            r12 = 1
        L_0x008a:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            r2.<init>()     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            if (r9 == 0) goto L_0x00c0
            int r3 = r23.size()     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            if (r3 <= 0) goto L_0x00c0
            java.util.Set r3 = r23.entrySet()     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
        L_0x009f:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            if (r4 == 0) goto L_0x00c0
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            com.bytedance.retrofit2.client.Header r5 = new com.bytedance.retrofit2.client.Header     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            java.lang.Object r6 = r4.getKey()     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            r5.<init>(r6, r4)     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            r2.add(r5)     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            goto L_0x009f
        L_0x00c0:
            r15 = 1
            r16 = 104857600(0x6400000, float:3.6111186E-35)
            r20 = 0
            r18 = r1
            r19 = r2
            com.bytedance.retrofit2.Call r1 = r14.downloadFile(r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            java.util.HashMap<java.lang.String, java.lang.String> r2 = f56819e     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            if (r2 == 0) goto L_0x00dd
            java.util.HashMap<java.lang.String, com.bytedance.retrofit2.Call<com.bytedance.retrofit2.mime.TypedInput>> r3 = f56818d     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            r3.put(r2, r1)     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            goto L_0x00e2
        L_0x00dd:
            java.util.HashMap<java.lang.String, com.bytedance.retrofit2.Call<com.bytedance.retrofit2.mime.TypedInput>> r2 = f56818d     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            r2.put(r0, r1)     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
        L_0x00e2:
            com.ss.android.ugc.aweme.net.a.a$2 r2 = new com.ss.android.ugc.aweme.net.a.a$2     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            r2.<init>(r0, r9, r10)     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
            r1.enqueue(r2)     // Catch:{ Exception -> 0x00ff, all -> 0x00f4 }
        L_0x00ea:
            if (r12 == 0) goto L_0x0102
        L_0x00ec:
            com.bytedance.frameworks.baselib.network.a.b r0 = com.bytedance.frameworks.baselib.network.a.b.a()
            r0.d()
            return
        L_0x00f4:
            r0 = move-exception
            if (r12 == 0) goto L_0x00fe
            com.bytedance.frameworks.baselib.network.a.b r1 = com.bytedance.frameworks.baselib.network.a.b.a()
            r1.d()
        L_0x00fe:
            throw r0
        L_0x00ff:
            if (r12 == 0) goto L_0x0102
            goto L_0x00ec
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.a.a.b(java.lang.String, java.util.HashMap, com.ss.android.ugc.a.b.a):void");
    }
}
