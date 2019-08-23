package com.ss.android.ugc.aweme.qrcode.v2;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63544a;

    /* renamed from: b  reason: collision with root package name */
    private final ScanQRCodeActivityV2 f63545b;

    g(ScanQRCodeActivityV2 scanQRCodeActivityV2) {
        this.f63545b = scanQRCodeActivityV2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f63544a, false, 70589, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f63544a, false, 70589, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.f63545b;
        if (scanQRCodeActivityV2.A != null) {
            scanQRCodeActivityV2.A.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
