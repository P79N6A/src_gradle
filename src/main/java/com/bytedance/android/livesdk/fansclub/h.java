package com.bytedance.android.livesdk.fansclub;

import android.animation.ValueAnimator;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13881a;

    /* renamed from: b  reason: collision with root package name */
    private final JoinFansPortraitNotifyView f13882b;

    h(JoinFansPortraitNotifyView joinFansPortraitNotifyView) {
        this.f13882b = joinFansPortraitNotifyView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f13881a, false, 8321, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f13881a, false, 8321, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        JoinFansPortraitNotifyView joinFansPortraitNotifyView = this.f13882b;
        if (!joinFansPortraitNotifyView.r) {
            UIUtils.updateLayout(joinFansPortraitNotifyView.f13853d, ((Integer) valueAnimator.getAnimatedValue()).intValue(), -3);
        }
    }
}
