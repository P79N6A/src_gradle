package com.ss.android.ugc.aweme.commercialize.views;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40108a;

    /* renamed from: b  reason: collision with root package name */
    private final AdHalfWebPageContainer f40109b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup.LayoutParams f40110c;

    i(AdHalfWebPageContainer adHalfWebPageContainer, ViewGroup.LayoutParams layoutParams) {
        this.f40109b = adHalfWebPageContainer;
        this.f40110c = layoutParams;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f40108a, false, 32767, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f40108a, false, 32767, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        AdHalfWebPageContainer adHalfWebPageContainer = this.f40109b;
        ViewGroup.LayoutParams layoutParams = this.f40110c;
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        adHalfWebPageContainer.setLayoutParams(layoutParams);
    }
}
