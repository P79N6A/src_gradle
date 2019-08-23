package com.ss.android.ugc.aweme.main.base.tab;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54493a;

    /* renamed from: b  reason: collision with root package name */
    private final a f54494b;

    d(a aVar) {
        this.f54494b = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54493a, false, 57873, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54493a, false, 57873, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        a aVar = this.f54494b;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue <= 0.66f) {
            float f2 = ((floatValue / 0.66f) * 0.04f) + 1.0f;
            aVar.f54464d.setScaleX(f2);
            aVar.f54464d.setScaleY(f2);
        } else {
            float f3 = 1.04f - (((floatValue - 0.66f) / 0.33f) * 0.04f);
            aVar.f54464d.setScaleX(f3);
            aVar.f54464d.setScaleY(f3);
        }
        aVar.f54464d.setAlpha((0.4f * floatValue) + 0.6f);
        aVar.f54465e.setTranslationY(((float) aVar.f54465e.getHeight()) - (floatValue * ((float) aVar.f54465e.getHeight())));
    }
}
