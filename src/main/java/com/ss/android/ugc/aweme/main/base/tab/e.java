package com.ss.android.ugc.aweme.main.base.tab;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54495a;

    /* renamed from: b  reason: collision with root package name */
    private final a f54496b;

    e(a aVar) {
        this.f54496b = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54495a, false, 57874, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54495a, false, 57874, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        a aVar = this.f54496b;
        aVar.f54465e.setTranslationY(((float) aVar.f54465e.getHeight()) - (((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) aVar.f54465e.getHeight())));
    }
}
