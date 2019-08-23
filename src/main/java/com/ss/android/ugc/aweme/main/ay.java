package com.ss.android.ugc.aweme.main;

import android.animation.ValueAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ay implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54364a;

    /* renamed from: b  reason: collision with root package name */
    private final View f54365b;

    /* renamed from: c  reason: collision with root package name */
    private final float f54366c;

    /* renamed from: d  reason: collision with root package name */
    private final float f54367d;

    ay(View view, float f2, float f3) {
        this.f54365b = view;
        this.f54366c = f2;
        this.f54367d = f3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54364a, false, 57550, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54364a, false, 57550, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        MainPageFragment.lambda$startAnimationAfterFollow$20$MainPageFragment(this.f54365b, this.f54366c, this.f54367d, valueAnimator);
    }
}
