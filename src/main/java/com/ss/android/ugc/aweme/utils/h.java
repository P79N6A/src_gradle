package com.ss.android.ugc.aweme.utils;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75890a;

    public static ValueAnimator a(View view, int i, int i2) {
        final View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f75890a, true, 87881, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, ValueAnimator.class)) {
            return (ValueAnimator) PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f75890a, true, 87881, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, ValueAnimator.class);
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75891a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f75891a, false, 87883, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f75891a, false, 87883, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.height = intValue;
                view2.setLayoutParams(layoutParams);
            }
        });
        ofInt.setDuration(150);
        return ofInt;
    }
}
