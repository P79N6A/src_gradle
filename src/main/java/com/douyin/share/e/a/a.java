package com.douyin.share.e.a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;

public final class a {
    public static void a(final View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", new float[]{0.0f, 360.0f});
        ofFloat.setDuration(600);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
        ofFloat.addListener(new Animator.AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
                view.setScaleX(0.0f);
                view.setScaleY(0.0f);
                view.setAlpha(0.0f);
                view.setRotation(0.0f);
                view.setVisibility(0);
            }
        });
    }
}
