package com.ss.android.ugc.aweme.main.base.tab;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54503a;

    /* renamed from: b  reason: collision with root package name */
    private final a f54504b;

    i(a aVar) {
        this.f54504b = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54503a, false, 57878, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54503a, false, 57878, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        a aVar = this.f54504b;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        aVar.f54464d.setScaleX(floatValue);
        aVar.f54464d.setScaleY(floatValue);
        if (!aVar.isSelected()) {
            aVar.f54464d.setAlpha(floatValue * 0.6f);
        } else {
            aVar.f54464d.setAlpha(floatValue);
        }
    }
}
