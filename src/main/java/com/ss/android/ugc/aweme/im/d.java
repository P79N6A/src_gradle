package com.ss.android.ugc.aweme.im;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.ac.b;

public final /* synthetic */ class d implements b.C0400b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50060a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f50061b;

    /* renamed from: c  reason: collision with root package name */
    private final String f50062c;

    /* renamed from: d  reason: collision with root package name */
    private final String f50063d;

    d(Context context, String str, String str2) {
        this.f50061b = context;
        this.f50062c = str;
        this.f50063d = str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String[] r21, int[] r22) {
        /*
            r20 = this;
            r7 = r20
            r9 = r22
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r21
            r12 = 1
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f50060a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r11] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 50084(0xc3a4, float:7.0183E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0045
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r21
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f50060a
            r3 = 0
            r4 = 50084(0xc3a4, float:7.0183E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r11] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0045:
            android.content.Context r0 = r7.f50061b
            java.lang.String r1 = r7.f50062c
            java.lang.String r2 = r7.f50063d
            int r3 = r9.length
            if (r3 <= 0) goto L_0x0105
            r3 = r9[r11]
            if (r3 != 0) goto L_0x0105
            java.lang.String r3 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.io.File r3 = android.os.Environment.getExternalStoragePublicDirectory(r3)
            java.lang.String r3 = r3.getAbsolutePath()
            r4 = 4
            java.lang.Object[] r13 = new java.lang.Object[r4]
            r13[r11] = r0
            r13[r12] = r1
            r13[r10] = r3
            r5 = 3
            r13[r5] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.app.c.e.f34074a
            r16 = 1
            r17 = 23358(0x5b3e, float:3.2732E-41)
            java.lang.Class[] r6 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r6[r11] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r6[r12] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r6[r10] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r6[r5] = r8
            java.lang.Class r19 = java.lang.Void.TYPE
            r18 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r6 == 0) goto L_0x00b6
            java.lang.Object[] r13 = new java.lang.Object[r4]
            r13[r11] = r0
            r13[r12] = r1
            r13[r10] = r3
            r13[r5] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.app.c.e.f34074a
            r16 = 1
            r17 = 23358(0x5b3e, float:3.2732E-41)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r5] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x00b6:
            android.content.res.Resources r4 = r0.getResources()
            r5 = 2131558606(0x7f0d00ce, float:1.8742533E38)
            java.lang.String r4 = r4.getString(r5)
            com.bytedance.ies.dmt.ui.d.a r4 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (java.lang.String) r4)
            r4.a()
            com.ss.android.ugc.aweme.app.c.e$1 r4 = new com.ss.android.ugc.aweme.app.c.e$1
            r4.<init>(r0)
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r5 = new com.ss.android.socialbase.appdownloader.AppTaskBuilder
            r5.<init>(r0, r1)
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r0 = r5.mimeType(r2)
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r0 = r0.showNotification(r12)
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r0 = r0.needWifi(r11)
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r0 = r0.savePath(r3)
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r0 = r0.mimeType(r2)
            r1 = 1000(0x3e8, float:1.401E-42)
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r0 = r0.minProgressTimeMsInterval(r1)
            r1 = 100
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r0 = r0.maxProgressCount(r1)
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r0 = r0.needDefaultHttpServiceBackUp(r12)
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r0 = r0.needReuseFirstConnection(r12)
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r0 = r0.notificationClickCallback(r4)
            com.ss.android.socialbase.appdownloader.AppDownloader r1 = com.ss.android.socialbase.appdownloader.AppDownloader.getInstance()
            r1.addDownloadTask(r0)
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.d.a(java.lang.String[], int[]):void");
    }
}
