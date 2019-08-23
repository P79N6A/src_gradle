package com.ss.android.ugc.aweme.setting.ui;

import com.meituan.robust.ChangeQuickRedirect;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64422a;

    /* renamed from: b  reason: collision with root package name */
    private final DouYinSettingNewVersionActivity f64423b;

    e(DouYinSettingNewVersionActivity douYinSettingNewVersionActivity) {
        this.f64423b = douYinSettingNewVersionActivity;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f64422a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 72503(0x11b37, float:1.01598E-40)
            r2 = r13
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f64422a
            r5 = 0
            r6 = 72503(0x11b37, float:1.01598E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.setting.ui.DouYinSettingNewVersionActivity r1 = r13.f64423b
            r2 = 5
            java.io.File[] r2 = new java.io.File[r2]     // Catch:{ Exception -> 0x00ee }
            java.io.File r3 = com.ss.android.f.a.a()     // Catch:{ Exception -> 0x00ee }
            r2[r0] = r3     // Catch:{ Exception -> 0x00ee }
            java.io.File r3 = com.ss.android.ugc.aweme.video.b.c()     // Catch:{ Exception -> 0x00ee }
            r4 = 1
            r2[r4] = r3     // Catch:{ Exception -> 0x00ee }
            r3 = 2
            java.io.File r5 = com.ss.android.ugc.aweme.video.b.d()     // Catch:{ Exception -> 0x00ee }
            r2[r3] = r5     // Catch:{ Exception -> 0x00ee }
            r3 = 3
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x00ee }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ee }
            r6.<init>()     // Catch:{ Exception -> 0x00ee }
            java.io.File r7 = r1.getExternalCacheDir()     // Catch:{ Exception -> 0x00ee }
            r6.append(r7)     // Catch:{ Exception -> 0x00ee }
            java.lang.String r7 = "/share"
            r6.append(r7)     // Catch:{ Exception -> 0x00ee }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00ee }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00ee }
            r2[r3] = r5     // Catch:{ Exception -> 0x00ee }
            r3 = 4
            com.ss.android.ugc.aweme.im.service.IIMService r5 = com.ss.android.ugc.aweme.im.b.a()     // Catch:{ Exception -> 0x00ee }
            java.io.File r5 = r5.getAudioDownloadCachePath()     // Catch:{ Exception -> 0x00ee }
            r2[r3] = r5     // Catch:{ Exception -> 0x00ee }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00ee }
            r6[r0] = r2     // Catch:{ Exception -> 0x00ee }
            r7 = 0
            com.meituan.robust.ChangeQuickRedirect r8 = com.ss.android.ugc.aweme.utils.au.f75543a     // Catch:{ Exception -> 0x00ee }
            r9 = 1
            r10 = 88149(0x15855, float:1.23523E-40)
            java.lang.Class[] r11 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x00ee }
            java.lang.Class<java.io.File[]> r3 = java.io.File[].class
            r11[r0] = r3     // Catch:{ Exception -> 0x00ee }
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00ee }
            if (r3 == 0) goto L_0x0099
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00ee }
            r5[r0] = r2     // Catch:{ Exception -> 0x00ee }
            r6 = 0
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.utils.au.f75543a     // Catch:{ Exception -> 0x00ee }
            r8 = 1
            r9 = 88149(0x15855, float:1.23523E-40)
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x00ee }
            java.lang.Class<java.io.File[]> r2 = java.io.File[].class
            r10[r0] = r2     // Catch:{ Exception -> 0x00ee }
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00ee }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00ee }
            goto L_0x00f0
        L_0x0099:
            long r2 = com.ss.android.ugc.aweme.utils.au.a(r2)     // Catch:{ Exception -> 0x00ee }
            double r2 = (double) r2     // Catch:{ Exception -> 0x00ee }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00ee }
            java.lang.Double r6 = java.lang.Double.valueOf(r2)     // Catch:{ Exception -> 0x00ee }
            r5[r0] = r6     // Catch:{ Exception -> 0x00ee }
            r6 = 0
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.utils.au.f75543a     // Catch:{ Exception -> 0x00ee }
            r8 = 1
            r9 = 88148(0x15854, float:1.23522E-40)
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x00ee }
            java.lang.Class r11 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x00ee }
            r10[r0] = r11     // Catch:{ Exception -> 0x00ee }
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00ee }
            if (r5 == 0) goto L_0x00d9
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00ee }
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ Exception -> 0x00ee }
            r6[r0] = r2     // Catch:{ Exception -> 0x00ee }
            r7 = 0
            com.meituan.robust.ChangeQuickRedirect r8 = com.ss.android.ugc.aweme.utils.au.f75543a     // Catch:{ Exception -> 0x00ee }
            r9 = 1
            r10 = 88148(0x15854, float:1.23522E-40)
            java.lang.Class[] r11 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x00ee }
            java.lang.Class r2 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x00ee }
            r11[r0] = r2     // Catch:{ Exception -> 0x00ee }
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00ee }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00ee }
            goto L_0x00f0
        L_0x00d9:
            r5 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            java.lang.Double.isNaN(r2)
            double r2 = r2 / r5
            java.lang.String r5 = "%.2fMB"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00ee }
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ Exception -> 0x00ee }
            r4[r0] = r2     // Catch:{ Exception -> 0x00ee }
            java.lang.String r0 = java.lang.String.format(r5, r4)     // Catch:{ Exception -> 0x00ee }
            goto L_0x00f0
        L_0x00ee:
            java.lang.String r0 = "0.00M"
        L_0x00f0:
            com.ss.android.ugc.aweme.setting.ui.l r2 = new com.ss.android.ugc.aweme.setting.ui.l
            r2.<init>(r1, r0)
            com.ss.android.b.a.a.a.b(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.ui.e.run():void");
    }
}
