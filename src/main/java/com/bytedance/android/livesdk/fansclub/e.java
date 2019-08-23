package com.bytedance.android.livesdk.fansclub;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13875a;

    /* renamed from: b  reason: collision with root package name */
    private final JoinFansPortraitNotifyView f13876b;

    e(JoinFansPortraitNotifyView joinFansPortraitNotifyView) {
        this.f13876b = joinFansPortraitNotifyView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f13875a, false, 8318, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f13875a, false, 8318, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        JoinFansPortraitNotifyView joinFansPortraitNotifyView = this.f13876b;
        if (!joinFansPortraitNotifyView.r) {
            joinFansPortraitNotifyView.f13851b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
