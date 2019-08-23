package com.bytedance.android.livesdk.widget;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class r implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18554a;

    /* renamed from: b  reason: collision with root package name */
    private final PKProgressBar f18555b;

    r(PKProgressBar pKProgressBar) {
        this.f18555b = pKProgressBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f18554a, false, 14612, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f18554a, false, 14612, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        PKProgressBar pKProgressBar = this.f18555b;
        pKProgressBar.f18312c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pKProgressBar.invalidate();
    }
}
