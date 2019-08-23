package com.bytedance.android.livesdk.chatroom.ui;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cu implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12040a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveProfileDetailFragment f12041b;

    cu(LiveProfileDetailFragment liveProfileDetailFragment) {
        this.f12041b = liveProfileDetailFragment;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f12040a, false, 6120, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f12040a, false, 6120, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        LiveProfileDetailFragment liveProfileDetailFragment = this.f12041b;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = liveProfileDetailFragment.o.getLayoutParams();
        layoutParams.width = intValue;
        liveProfileDetailFragment.o.setLayoutParams(layoutParams);
    }
}
