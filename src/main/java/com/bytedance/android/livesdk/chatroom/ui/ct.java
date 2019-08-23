package com.bytedance.android.livesdk.chatroom.ui;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ct implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12038a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveProfileDetailFragment f12039b;

    ct(LiveProfileDetailFragment liveProfileDetailFragment) {
        this.f12039b = liveProfileDetailFragment;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f12038a, false, 6119, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f12038a, false, 6119, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        LiveProfileDetailFragment liveProfileDetailFragment = this.f12039b;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = liveProfileDetailFragment.m.getLayoutParams();
        layoutParams.width = intValue;
        liveProfileDetailFragment.m.setLayoutParams(layoutParams);
    }
}
