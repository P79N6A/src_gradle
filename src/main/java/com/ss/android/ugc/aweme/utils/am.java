package com.ss.android.ugc.aweme.utils;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class am implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75510a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f75511b;

    am(TextView textView) {
        this.f75511b = textView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f75510a, false, 88084, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f75510a, false, 88084, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        TextView textView = this.f75511b;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.height = intValue;
        textView.setLayoutParams(layoutParams);
    }
}
