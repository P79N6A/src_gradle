package com.ss.android.ugc.aweme.survey;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74528a;

    /* renamed from: b  reason: collision with root package name */
    private final i f74529b;

    k(i iVar) {
        this.f74529b = iVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f74528a, false, 86717, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f74528a, false, 86717, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        i iVar = this.f74529b;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue <= 0.0f) {
            iVar.f74519d.setAlpha(Math.abs(floatValue));
            return;
        }
        if (iVar.f74519d.getAlpha() > 0.0f) {
            iVar.f74519d.setAlpha(0.0f);
        }
        iVar.f74520e.setAlpha(floatValue);
    }
}
