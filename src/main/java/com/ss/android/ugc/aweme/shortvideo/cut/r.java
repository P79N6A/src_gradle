package com.ss.android.ugc.aweme.shortvideo.cut;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class r implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66509a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66510b;

    /* renamed from: c  reason: collision with root package name */
    private final float f66511c;

    /* renamed from: d  reason: collision with root package name */
    private final float f66512d;

    /* renamed from: e  reason: collision with root package name */
    private final float f66513e;

    r(CutMultiVideoActivity cutMultiVideoActivity, float f2, float f3, float f4) {
        this.f66510b = cutMultiVideoActivity;
        this.f66511c = f2;
        this.f66512d = f3;
        this.f66513e = f4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f66509a, false, 75457, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f66509a, false, 75457, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        CutMultiVideoActivity cutMultiVideoActivity = this.f66510b;
        float f2 = this.f66511c;
        float f3 = this.f66512d;
        float f4 = this.f66513e;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        cutMultiVideoActivity.textureView.setRotation(f2 + (90.0f * animatedFraction));
        float f5 = f3 + (f4 * animatedFraction);
        cutMultiVideoActivity.textureView.setScaleX(f5);
        cutMultiVideoActivity.textureView.setScaleY(f5);
    }
}
