package com.ss.android.ugc.aweme.main.base.tab;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54505a;

    /* renamed from: b  reason: collision with root package name */
    private final a f54506b;

    j(a aVar) {
        this.f54506b = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54505a, false, 57879, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54505a, false, 57879, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        a aVar = this.f54506b;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue <= 0.66f) {
            float f2 = ((floatValue / 0.66f) * 0.04f) + 1.0f;
            aVar.f54466f.setScaleX(f2);
            aVar.f54466f.setScaleY(f2);
            return;
        }
        float f3 = 1.04f - (((floatValue - 0.66f) / 0.33f) * 0.04f);
        aVar.f54466f.setScaleX(f3);
        aVar.f54466f.setScaleY(f3);
    }
}
