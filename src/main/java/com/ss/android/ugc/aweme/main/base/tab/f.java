package com.ss.android.ugc.aweme.main.base.tab;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54497a;

    /* renamed from: b  reason: collision with root package name */
    private final a f54498b;

    f(a aVar) {
        this.f54498b = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54497a, false, 57875, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54497a, false, 57875, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        a aVar = this.f54498b;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue < 0.6f) {
            float f2 = ((floatValue / 0.6f) * 0.04f) + 1.0f;
            aVar.f54464d.setScaleX(f2);
            aVar.f54464d.setScaleY(f2);
            return;
        }
        float f3 = (floatValue - 0.6f) / 0.4f;
        float f4 = 1.04f - (f3 * 1.04f);
        aVar.f54464d.setScaleX(f4);
        aVar.f54464d.setScaleY(f4);
        aVar.f54464d.setAlpha(1.0f - f3);
    }
}
