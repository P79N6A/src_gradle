package com.bytedance.android.livesdk.widget;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class s implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18556a;

    /* renamed from: b  reason: collision with root package name */
    private final PKProgressBar f18557b;

    s(PKProgressBar pKProgressBar) {
        this.f18557b = pKProgressBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f18556a, false, 14613, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f18556a, false, 14613, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        PKProgressBar pKProgressBar = this.f18557b;
        pKProgressBar.f18313d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pKProgressBar.invalidate();
    }
}
