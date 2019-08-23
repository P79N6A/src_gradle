package com.ss.android.ugc.aweme.im.sdk.chat.input;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50661a;

    /* renamed from: b  reason: collision with root package name */
    private final l f50662b;

    m(l lVar) {
        this.f50662b = lVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f50661a, false, 50632, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f50661a, false, 50632, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        l lVar = this.f50662b;
        lVar.f50653b.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        lVar.f50653b.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
