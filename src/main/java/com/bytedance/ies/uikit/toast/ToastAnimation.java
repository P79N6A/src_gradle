package com.bytedance.ies.uikit.toast;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

public class ToastAnimation {
    public static AnimatorSet hideAlpha(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f})});
        animatorSet.setDuration(300);
        return animatorSet;
    }

    public static AnimatorSet showAlpha(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f})});
        animatorSet.setDuration(300);
        return animatorSet;
    }
}
