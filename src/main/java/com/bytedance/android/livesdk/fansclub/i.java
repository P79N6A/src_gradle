package com.bytedance.android.livesdk.fansclub;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13883a;

    /* renamed from: b  reason: collision with root package name */
    private final JoinFansPortraitNotifyView f13884b;

    i(JoinFansPortraitNotifyView joinFansPortraitNotifyView) {
        this.f13884b = joinFansPortraitNotifyView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f13883a, false, 8322, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f13883a, false, 8322, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        JoinFansPortraitNotifyView joinFansPortraitNotifyView = this.f13884b;
        if (!joinFansPortraitNotifyView.r) {
            joinFansPortraitNotifyView.f13854e.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
