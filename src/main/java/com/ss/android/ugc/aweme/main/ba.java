package com.ss.android.ugc.aweme.main;

import android.animation.ValueAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ba implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54370a;

    /* renamed from: b  reason: collision with root package name */
    private final View f54371b;

    ba(View view) {
        this.f54371b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = valueAnimator;
        if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f54370a, false, 57552, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f54370a, false, 57552, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        MainPageFragment.lambda$startAnimationAfterFollow$22$MainPageFragment(this.f54371b, valueAnimator2);
    }
}
