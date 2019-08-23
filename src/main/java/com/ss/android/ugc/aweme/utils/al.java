package com.ss.android.ugc.aweme.utils;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class al implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75507a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewGroup f75508b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f75509c;

    al(ViewGroup viewGroup, boolean z) {
        this.f75508b = viewGroup;
        this.f75509c = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f75507a, false, 88083, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f75507a, false, 88083, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        ViewGroup viewGroup = this.f75508b;
        boolean z = this.f75509c;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        if (z) {
            marginLayoutParams.bottomMargin = intValue;
        } else {
            marginLayoutParams.topMargin = intValue;
        }
        viewGroup.setLayoutParams(marginLayoutParams);
    }
}
