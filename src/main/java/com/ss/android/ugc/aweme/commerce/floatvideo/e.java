package com.ss.android.ugc.aweme.commerce.floatvideo;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36916a;

    /* renamed from: b  reason: collision with root package name */
    private final FloatVideoBrowsePresenter f36917b;

    e(FloatVideoBrowsePresenter floatVideoBrowsePresenter) {
        this.f36917b = floatVideoBrowsePresenter;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f36916a, false, 28191, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f36916a, false, 28191, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        FloatVideoBrowsePresenter floatVideoBrowsePresenter = this.f36917b;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(floatValue)}, floatVideoBrowsePresenter, FloatVideoBrowsePresenter.f36898a, false, 28187, new Class[]{Float.TYPE}, Void.TYPE)) {
            FloatVideoBrowsePresenter floatVideoBrowsePresenter2 = floatVideoBrowsePresenter;
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(floatValue)}, floatVideoBrowsePresenter2, FloatVideoBrowsePresenter.f36898a, false, 28187, new Class[]{Float.TYPE}, Void.TYPE);
        } else {
            int i = (int) (((float) (floatVideoBrowsePresenter.f36903f - floatVideoBrowsePresenter.h.f53895a)) * floatValue);
            ViewGroup.LayoutParams layoutParams = floatVideoBrowsePresenter.f36901d.getLayoutParams();
            layoutParams.width = floatVideoBrowsePresenter.h.f53895a + i;
            layoutParams.height = (int) (((float) layoutParams.width) * floatVideoBrowsePresenter.f36902e);
            if (PatchProxy.isSupport(new Object[0], floatVideoBrowsePresenter, FloatVideoBrowsePresenter.f36898a, false, 28186, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], floatVideoBrowsePresenter, FloatVideoBrowsePresenter.f36898a, false, 28186, new Class[0], Void.TYPE);
            } else {
                ViewGroup.LayoutParams layoutParams2 = floatVideoBrowsePresenter.f36900c.getLayoutParams();
                ViewGroup.LayoutParams layoutParams3 = floatVideoBrowsePresenter.f36901d.getLayoutParams();
                if (floatVideoBrowsePresenter.d() >= floatVideoBrowsePresenter.f36902e || floatVideoBrowsePresenter.d() <= 1.0f) {
                    layoutParams2.width = layoutParams3.width;
                    layoutParams2.height = (int) (((float) layoutParams2.width) * floatVideoBrowsePresenter.d());
                } else {
                    layoutParams2.height = layoutParams3.height;
                    layoutParams2.width = (int) (((float) layoutParams2.height) / floatVideoBrowsePresenter.d());
                }
            }
        }
        floatVideoBrowsePresenter.f36901d.requestLayout();
    }
}
