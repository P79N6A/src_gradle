package com.bytedance.scene.animation.a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.scene.animation.a;
import com.bytedance.scene.animation.d;

public final class b extends d {
    public final boolean a() {
        return true;
    }

    @NonNull
    public final Animator a(a aVar, a aVar2) {
        final View view = aVar2.f21987b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, view.getAlpha()});
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(150);
        return ofFloat;
    }

    @NonNull
    public final Animator b(final a aVar, a aVar2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{aVar.f21987b.getAlpha(), 0.0f});
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                aVar.f21987b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(150);
        return ofFloat;
    }
}
