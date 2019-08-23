package com.bytedance.android.livesdk.fansclub;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13877a;

    /* renamed from: b  reason: collision with root package name */
    private final JoinFansPortraitNotifyView f13878b;

    f(JoinFansPortraitNotifyView joinFansPortraitNotifyView) {
        this.f13878b = joinFansPortraitNotifyView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f13877a, false, 8319, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f13877a, false, 8319, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        JoinFansPortraitNotifyView joinFansPortraitNotifyView = this.f13878b;
        if (!joinFansPortraitNotifyView.r) {
            joinFansPortraitNotifyView.f13851b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
