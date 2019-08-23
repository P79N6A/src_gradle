package com.ss.android.ugc.aweme.main.base.tab;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54499a;

    /* renamed from: b  reason: collision with root package name */
    private final a f54500b;

    g(a aVar) {
        this.f54500b = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54499a, false, 57876, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54499a, false, 57876, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        a aVar = this.f54500b;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue <= 0.6f) {
            float f2 = floatValue / 0.6f;
            float f3 = 1.04f * f2;
            aVar.f54466f.setScaleX(f3);
            aVar.f54466f.setScaleY(f3);
            aVar.f54466f.setAlpha(f2);
            return;
        }
        float f4 = 1.04f - ((floatValue - 1.5f) * 0.04f);
        aVar.f54466f.setScaleX(f4);
        aVar.f54466f.setScaleY(f4);
    }
}
