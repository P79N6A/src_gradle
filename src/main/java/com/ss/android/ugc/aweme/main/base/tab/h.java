package com.ss.android.ugc.aweme.main.base.tab;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54501a;

    /* renamed from: b  reason: collision with root package name */
    private final a f54502b;

    h(a aVar) {
        this.f54502b = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54501a, false, 57877, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54501a, false, 57877, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        a aVar = this.f54502b;
        float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
        aVar.f54466f.setScaleX(floatValue);
        aVar.f54466f.setScaleY(floatValue);
        aVar.f54466f.setAlpha(floatValue);
    }
}
