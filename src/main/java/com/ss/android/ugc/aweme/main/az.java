package com.ss.android.ugc.aweme.main;

import android.animation.ValueAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class az implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54368a;

    /* renamed from: b  reason: collision with root package name */
    private final View f54369b;

    az(View view) {
        this.f54369b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = valueAnimator;
        if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f54368a, false, 57551, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f54368a, false, 57551, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        MainPageFragment.lambda$startAnimationAfterFollow$21$MainPageFragment(this.f54369b, valueAnimator2);
    }
}
