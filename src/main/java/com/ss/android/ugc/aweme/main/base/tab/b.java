package com.ss.android.ugc.aweme.main.base.tab;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54489a;

    /* renamed from: b  reason: collision with root package name */
    private final a f54490b;

    b(a aVar) {
        this.f54490b = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54489a, false, 57871, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54489a, false, 57871, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        a aVar = this.f54490b;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        aVar.f54464d.setAlpha(1.0f - (0.4f * floatValue));
        aVar.f54465e.setTranslationY(((float) aVar.f54465e.getHeight()) * floatValue);
    }
}
