package com.ss.android.ugc.aweme.shortvideo;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class en implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67579a;

    /* renamed from: b  reason: collision with root package name */
    private final el f67580b;

    en(el elVar) {
        this.f67580b = elVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f67579a, false, 74473, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f67579a, false, 74473, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        this.f67580b.f67537b.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
