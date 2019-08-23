package com.bytedance.android.livesdk.widget;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class t implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18558a;

    /* renamed from: b  reason: collision with root package name */
    private final PKProgressBar f18559b;

    t(PKProgressBar pKProgressBar) {
        this.f18559b = pKProgressBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f18558a, false, 14614, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f18558a, false, 14614, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        PKProgressBar pKProgressBar = this.f18559b;
        pKProgressBar.f18311b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pKProgressBar.invalidate();
    }
}
