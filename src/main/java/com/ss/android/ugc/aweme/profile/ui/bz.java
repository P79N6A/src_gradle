package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.ac.b;

public final /* synthetic */ class bz implements b.C0400b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62559a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileCoverPreviewActivity f62560b;

    /* renamed from: c  reason: collision with root package name */
    private final String f62561c;

    bz(ProfileCoverPreviewActivity profileCoverPreviewActivity, String str) {
        this.f62560b = profileCoverPreviewActivity;
        this.f62561c = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String[] r19, int[] r20) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            r11 = 1
            r0[r11] = r20
            com.meituan.robust.ChangeQuickRedirect r2 = f62559a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r10] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 68651(0x10c2b, float:9.62E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0045
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            r0[r11] = r20
            com.meituan.robust.ChangeQuickRedirect r2 = f62559a
            r3 = 0
            r4 = 68651(0x10c2b, float:9.62E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r10] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0045:
            com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity r0 = r7.f62560b
            java.lang.String r1 = r7.f62561c
            int r2 = r8.length
            if (r2 <= 0) goto L_0x0096
            r2 = r20[r10]
            if (r2 != 0) goto L_0x0096
            com.ss.android.ugc.aweme.profile.ui.widget.StatedButton r2 = r0.mDownloadBtn
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.ui.widget.StatedButton.f63103a
            r14 = 0
            r15 = 69871(0x110ef, float:9.791E-41)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r2
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x007a
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.ui.widget.StatedButton.f63103a
            r14 = 0
            r15 = 69871(0x110ef, float:9.791E-41)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r2
            r16 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0082
        L_0x007a:
            int r3 = r2.f63105c
            r2.setImageResource(r3)
            r2.a()
        L_0x0082:
            com.ss.android.ugc.aweme.profile.ui.ca r2 = new com.ss.android.ugc.aweme.profile.ui.ca
            r2.<init>(r0, r1)
            a.i r1 = a.i.a((java.util.concurrent.Callable<TResult>) r2)
            com.ss.android.ugc.aweme.profile.ui.cb r2 = new com.ss.android.ugc.aweme.profile.ui.cb
            r2.<init>(r0)
            java.util.concurrent.Executor r0 = a.i.f1052b
            r1.a((a.g<TResult, TContinuationResult>) r2, (java.util.concurrent.Executor) r0)
            return
        L_0x0096:
            com.bytedance.ies.dmt.ui.b.a$a r1 = new com.bytedance.ies.dmt.ui.b.a$a
            r1.<init>(r0)
            r2 = 2131559454(0x7f0d041e, float:1.8744253E38)
            com.ss.android.ugc.aweme.profile.ui.cc r3 = new com.ss.android.ugc.aweme.profile.ui.cc
            r3.<init>(r0)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r1.a((int) r2, (android.content.DialogInterface.OnClickListener) r3)
            r1 = 2131559036(0x7f0d027c, float:1.8743405E38)
            android.content.DialogInterface$OnClickListener r2 = com.ss.android.ugc.aweme.profile.ui.cd.f62572b
            com.bytedance.ies.dmt.ui.b.a$a r0 = r0.b((int) r1, (android.content.DialogInterface.OnClickListener) r2)
            r1 = 2131558675(0x7f0d0113, float:1.8742673E38)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r0.b((int) r1)
            com.bytedance.ies.dmt.ui.b.a r0 = r0.a()
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.bz.a(java.lang.String[], int[]):void");
    }
}
