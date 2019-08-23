package com.bytedance.android.livesdk.fansclub;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13879a;

    /* renamed from: b  reason: collision with root package name */
    private final JoinFansPortraitNotifyView f13880b;

    g(JoinFansPortraitNotifyView joinFansPortraitNotifyView) {
        this.f13880b = joinFansPortraitNotifyView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f13879a, false, 8320, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f13879a, false, 8320, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        JoinFansPortraitNotifyView joinFansPortraitNotifyView = this.f13880b;
        if (!joinFansPortraitNotifyView.r) {
            joinFansPortraitNotifyView.f13851b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
