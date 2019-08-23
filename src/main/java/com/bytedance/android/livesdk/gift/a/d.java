package com.bytedance.android.livesdk.gift.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.ugc.live.b.a.a;
import com.ss.ugc.live.b.a.a.b;

public final class d implements com.ss.ugc.live.b.a.d.d<String> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14706a;

    /* renamed from: b  reason: collision with root package name */
    public a<String> f14707b;

    /* renamed from: c  reason: collision with root package name */
    private b f14708c;

    public d(b bVar) {
        this.f14708c = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.ugc.live.b.a.c r16, com.ss.ugc.live.b.a.a<java.lang.String> r17) {
        /*
            r15 = this;
            r8 = r15
            r9 = r16
            r0 = r17
            r10 = 2
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r11 = 0
            r1[r11] = r9
            r12 = 1
            r1[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f14706a
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<com.ss.ugc.live.b.a.c> r2 = com.ss.ugc.live.b.a.c.class
            r6[r11] = r2
            java.lang.Class<com.ss.ugc.live.b.a.a> r2 = com.ss.ugc.live.b.a.a.class
            r6[r12] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 9389(0x24ad, float:1.3157E-41)
            r2 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0042
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r11] = r9
            r1[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f14706a
            r4 = 0
            r5 = 9389(0x24ad, float:1.3157E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<com.ss.ugc.live.b.a.c> r0 = com.ss.ugc.live.b.a.c.class
            r6[r11] = r0
            java.lang.Class<com.ss.ugc.live.b.a.a> r0 = com.ss.ugc.live.b.a.a.class
            r6[r12] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0042:
            r8.f14707b = r0
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0160 }
            r1[r11] = r9     // Catch:{ Exception -> 0x0160 }
            com.meituan.robust.ChangeQuickRedirect r3 = f14706a     // Catch:{ Exception -> 0x0160 }
            r4 = 0
            r5 = 9392(0x24b0, float:1.3161E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x0160 }
            java.lang.Class<com.ss.ugc.live.b.a.c> r0 = com.ss.ugc.live.b.a.c.class
            r6[r11] = r0     // Catch:{ Exception -> 0x0160 }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0160 }
            if (r0 == 0) goto L_0x0075
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0160 }
            r1[r11] = r9     // Catch:{ Exception -> 0x0160 }
            com.meituan.robust.ChangeQuickRedirect r3 = f14706a     // Catch:{ Exception -> 0x0160 }
            r4 = 0
            r5 = 9392(0x24b0, float:1.3161E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x0160 }
            java.lang.Class<com.ss.ugc.live.b.a.c> r0 = com.ss.ugc.live.b.a.c.class
            r6[r11] = r0     // Catch:{ Exception -> 0x0160 }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = r15
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0160 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0160 }
            goto L_0x00bc
        L_0x0075:
            com.ss.ugc.live.b.a.a.b r0 = r8.f14708c     // Catch:{ Exception -> 0x0160 }
            java.lang.String r0 = r0.a(r9)     // Catch:{ Exception -> 0x0160 }
            java.lang.String r0 = com.ss.ugc.live.b.a.e.b.a((java.lang.String) r0)     // Catch:{ Exception -> 0x0160 }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0160 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0160 }
            boolean r2 = r1.exists()     // Catch:{ Exception -> 0x0160 }
            if (r2 != 0) goto L_0x00a5
            boolean r2 = r1.mkdirs()     // Catch:{ Exception -> 0x0160 }
            if (r2 == 0) goto L_0x0091
            goto L_0x00a5
        L_0x0091:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0160 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0160 }
            java.lang.String r3 = "mkdirs return false, dir="
            r2.<init>(r3)     // Catch:{ Exception -> 0x0160 }
            r2.append(r1)     // Catch:{ Exception -> 0x0160 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0160 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0160 }
            throw r0     // Catch:{ Exception -> 0x0160 }
        L_0x00a5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0160 }
            r1.<init>()     // Catch:{ Exception -> 0x0160 }
            r1.append(r0)     // Catch:{ Exception -> 0x0160 }
            java.lang.String r0 = r16.a()     // Catch:{ Exception -> 0x0160 }
            java.lang.String r0 = com.ss.ugc.live.b.a.e.a.a((java.lang.String) r0)     // Catch:{ Exception -> 0x0160 }
            r1.append(r0)     // Catch:{ Exception -> 0x0160 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0160 }
        L_0x00bc:
            android.content.Context r1 = com.bytedance.android.live.core.utils.ac.e()
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = com.ss.android.socialbase.downloader.downloader.Downloader.with(r1)
            java.lang.String r2 = r16.b()
            com.ss.android.socialbase.downloader.model.DownloadTask r10 = r1.url(r2)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f14706a
            r4 = 0
            r5 = 9390(0x24ae, float:1.3158E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r11] = r2
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            r13 = 0
            r14 = -1
            if (r1 == 0) goto L_0x00ff
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f14706a
            r4 = 0
            r5 = 9390(0x24ae, float:1.3158E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r11] = r2
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = r15
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x010d
        L_0x00ff:
            java.lang.String r1 = "/"
            int r1 = r0.lastIndexOf(r1)
            if (r1 == r14) goto L_0x010c
            java.lang.String r1 = r0.substring(r1)
            goto L_0x010d
        L_0x010c:
            r1 = r13
        L_0x010d:
            com.ss.android.socialbase.downloader.model.DownloadTask r10 = r10.name(r1)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f14706a
            r4 = 0
            r5 = 9391(0x24af, float:1.316E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r11] = r2
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0143
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f14706a
            r4 = 0
            r5 = 9391(0x24af, float:1.316E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r11] = r2
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = r15
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            r13 = r1
            java.lang.String r13 = (java.lang.String) r13
            goto L_0x014f
        L_0x0143:
            java.lang.String r1 = "/"
            int r1 = r0.lastIndexOf(r1)
            if (r1 == r14) goto L_0x014f
            java.lang.String r13 = r0.substring(r11, r1)
        L_0x014f:
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = r10.savePath(r13)
            com.bytedance.android.livesdk.gift.a.d$1 r2 = new com.bytedance.android.livesdk.gift.a.d$1
            r2.<init>(r9, r0)
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r1.subThreadListener(r2)
            r0.download()
            return
        L_0x0160:
            r0 = move-exception
            com.ss.ugc.live.b.a.c.e r1 = new com.ss.ugc.live.b.a.c.e
            java.lang.String r2 = "write storage failed."
            r1.<init>(r2, r0, r9)
            com.ss.ugc.live.b.a.a<java.lang.String> r0 = r8.f14707b
            r0.a((com.ss.ugc.live.b.a.c) r9, (com.ss.ugc.live.b.a.c.a) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.a.d.a(com.ss.ugc.live.b.a.c, com.ss.ugc.live.b.a.a):void");
    }
}
