package com.ss.android.ugc.aweme.shortvideo.filter.func;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.filter.CircleViewPager;

public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67747a;

    /* renamed from: b  reason: collision with root package name */
    private final RecordFilterModuleImpl f67748b;

    h(RecordFilterModuleImpl recordFilterModuleImpl) {
        this.f67748b = recordFilterModuleImpl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f67747a, false, 77303, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f67747a, false, 77303, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        CircleViewPager a2 = this.f67748b.n.a();
        if (!(a2 == null || a2.getAdapter() == null)) {
            a2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
