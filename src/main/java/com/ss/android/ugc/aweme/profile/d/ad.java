package com.ss.android.ugc.aweme.profile.d;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.profile.presenter.a;

public final /* synthetic */ class ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61376a;

    /* renamed from: b  reason: collision with root package name */
    private final int f61377b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f61378c;

    /* renamed from: d  reason: collision with root package name */
    private final a f61379d;

    /* renamed from: e  reason: collision with root package name */
    private final Fragment f61380e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f61381f;

    ad(int i, Activity activity, a aVar, Fragment fragment, boolean z) {
        this.f61377b = i;
        this.f61378c = activity;
        this.f61379d = aVar;
        this.f61380e = fragment;
        this.f61381f = z;
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [com.ss.android.ugc.aweme.profile.ui.UpdateNickNameDialog] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f61376a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 70050(0x111a2, float:9.8161E-41)
            r2 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f61376a
            r5 = 0
            r6 = 70050(0x111a2, float:9.8161E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            int r1 = r15.f61377b
            android.app.Activity r10 = r15.f61378c
            com.ss.android.ugc.aweme.profile.presenter.a r12 = r15.f61379d
            android.support.v4.app.Fragment r13 = r15.f61380e
            boolean r14 = r15.f61381f
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L_0x0040
            r4 = 3
            if (r1 != r4) goto L_0x0037
            goto L_0x0040
        L_0x0037:
            r4 = 2
            if (r1 != r4) goto L_0x0047
            com.ss.android.ugc.aweme.profile.ui.UpdateNickNameDialog r2 = new com.ss.android.ugc.aweme.profile.ui.UpdateNickNameDialog
            r2.<init>(r10, r14)
            goto L_0x0047
        L_0x0040:
            com.ss.android.ugc.aweme.profile.ui.UpdateAvatarDialog r2 = new com.ss.android.ugc.aweme.profile.ui.UpdateAvatarDialog
            r9 = r2
            r11 = r1
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x0047:
            if (r2 == 0) goto L_0x00a0
            r2.show()     // Catch:{ Exception -> 0x00a0 }
            r2.setCanceledOnTouchOutside(r0)     // Catch:{ Exception -> 0x00a0 }
            r2.setCancelable(r0)     // Catch:{ Exception -> 0x00a0 }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00a0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00a0 }
            r4[r0] = r2     // Catch:{ Exception -> 0x00a0 }
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.profile.d.ac.f61374a     // Catch:{ Exception -> 0x00a0 }
            r7 = 1
            r8 = 70048(0x111a0, float:9.8158E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00a0 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00a0 }
            r9[r0] = r2     // Catch:{ Exception -> 0x00a0 }
            java.lang.Class r10 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x00a0 }
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00a0 }
            if (r2 == 0) goto L_0x008a
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00a0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00a0 }
            r4[r0] = r1     // Catch:{ Exception -> 0x00a0 }
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.profile.d.ac.f61374a     // Catch:{ Exception -> 0x00a0 }
            r7 = 1
            r8 = 70048(0x111a0, float:9.8158E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00a0 }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00a0 }
            r9[r0] = r1     // Catch:{ Exception -> 0x00a0 }
            java.lang.Class r10 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x00a0 }
            com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x00a0
        L_0x008a:
            java.lang.String r0 = "profile_update_alert"
            com.ss.android.ugc.aweme.app.d.d r2 = com.ss.android.ugc.aweme.app.d.d.a()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r3 = "type"
            java.lang.String r1 = com.ss.android.ugc.aweme.profile.d.ac.a((int) r1)     // Catch:{ Exception -> 0x00a0 }
            com.ss.android.ugc.aweme.app.d.d r1 = r2.a((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ Exception -> 0x00a0 }
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b     // Catch:{ Exception -> 0x00a0 }
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)     // Catch:{ Exception -> 0x00a0 }
            return
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.d.ad.run():void");
    }
}
