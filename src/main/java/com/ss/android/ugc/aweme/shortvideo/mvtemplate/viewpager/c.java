package com.ss.android.ugc.aweme.shortvideo.mvtemplate.viewpager;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68780a;

    /* renamed from: b  reason: collision with root package name */
    private final MvThemeListViewPager f68781b;

    c(MvThemeListViewPager mvThemeListViewPager) {
        this.f68781b = mvThemeListViewPager;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f68780a, false, 78160, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f68780a, false, 78160, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        this.f68781b.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
