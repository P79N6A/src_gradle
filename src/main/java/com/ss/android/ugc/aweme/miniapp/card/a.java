package com.ss.android.ugc.aweme.miniapp.card;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55632a;

    public static void a(View view, long j, float f2, float f3, float f4, float f5) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, 200L, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(0.0f), Float.valueOf(0.0f)}, null, f55632a, true, 59184, new Class[]{View.class, Long.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, 200L, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(0.0f), Float.valueOf(0.0f)}, null, f55632a, true, 59184, new Class[]{View.class, Long.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "translationX", new float[]{f2, f3});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "translationY", new float[]{0.0f, 0.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200);
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }
}
