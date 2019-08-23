package com.ss.android.ugc.aweme.shortvideo.cut;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66466a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66467b;

    k(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66467b = cutMultiVideoActivity;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f66466a, false, 75450, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f66466a, false, 75450, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        CutMultiVideoActivity cutMultiVideoActivity = this.f66467b;
        cutMultiVideoActivity.animDot.setX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
