package com.ss.android.ugc.aweme.commercialize;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38936a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiCouponInputActivity f38937b;

    /* renamed from: c  reason: collision with root package name */
    private final q f38938c;

    /* renamed from: d  reason: collision with root package name */
    private final String f38939d;

    l(PoiCouponInputActivity poiCouponInputActivity, q qVar, String str) {
        this.f38937b = poiCouponInputActivity;
        this.f38938c = qVar;
        this.f38939d = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        r0.confirm.setImageResource(r0.f38420c);
        r0.confirm.setEnabled(r0.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0050, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        if (r0.f38421d == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        if (r0.f38421d == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        if (r0.f38421d != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
        r0.f38421d.cancel();
        r0.f38421d = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f38936a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 30341(0x7685, float:4.2517E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f38936a
            r5 = 0
            r6 = 30341(0x7685, float:4.2517E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            com.ss.android.ugc.aweme.commercialize.PoiCouponInputActivity r0 = r9.f38937b
            com.google.common.util.concurrent.q r1 = r9.f38938c
            java.lang.String r2 = r9.f38939d
            r3 = 0
            java.lang.Object r1 = r1.get()     // Catch:{ InterruptedException -> 0x007e, ExecutionException -> 0x0053 }
            com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$b r1 = (com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi.b) r1     // Catch:{ InterruptedException -> 0x007e, ExecutionException -> 0x0053 }
            java.lang.String r4 = "input"
            com.ss.android.ugc.aweme.commercialize.PoiCouponRedeemActivity.a(r0, r2, r1, r4)     // Catch:{ InterruptedException -> 0x007e, ExecutionException -> 0x0053 }
            android.animation.ObjectAnimator r1 = r0.f38421d
            if (r1 == 0) goto L_0x0040
        L_0x0039:
            android.animation.ObjectAnimator r1 = r0.f38421d
            r1.cancel()
            r0.f38421d = r3
        L_0x0040:
            android.widget.ImageView r1 = r0.confirm
            int r2 = r0.f38420c
            r1.setImageResource(r2)
            android.widget.ImageView r1 = r0.confirm
            boolean r0 = r0.a()
            r1.setEnabled(r0)
            return
        L_0x0051:
            r1 = move-exception
            goto L_0x0062
        L_0x0053:
            r1 = 2131561425(0x7f0d0bd1, float:1.874825E38)
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r1)     // Catch:{ all -> 0x0051 }
            r1.a()     // Catch:{ all -> 0x0051 }
            android.animation.ObjectAnimator r1 = r0.f38421d
            if (r1 == 0) goto L_0x0040
            goto L_0x0039
        L_0x0062:
            android.animation.ObjectAnimator r2 = r0.f38421d
            if (r2 == 0) goto L_0x006d
            android.animation.ObjectAnimator r2 = r0.f38421d
            r2.cancel()
            r0.f38421d = r3
        L_0x006d:
            android.widget.ImageView r2 = r0.confirm
            int r3 = r0.f38420c
            r2.setImageResource(r3)
            android.widget.ImageView r2 = r0.confirm
            boolean r0 = r0.a()
            r2.setEnabled(r0)
            throw r1
        L_0x007e:
            android.animation.ObjectAnimator r1 = r0.f38421d
            if (r1 == 0) goto L_0x0040
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.l.run():void");
    }
}
