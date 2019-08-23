package android.support.design.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.support.design.circularreveal.CircularRevealWidget;
import android.view.View;
import android.view.ViewAnimationUtils;

public final class CircularRevealCompat {
    private CircularRevealCompat() {
    }

    public static Animator.AnimatorListener createCircularRevealListener(final CircularRevealWidget circularRevealWidget) {
        return new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                circularRevealWidget.destroyCircularRevealCache();
            }

            public final void onAnimationStart(Animator animator) {
                circularRevealWidget.buildCircularRevealCache();
            }
        };
    }

    public static Animator createCircularReveal(CircularRevealWidget circularRevealWidget, float f2, float f3, float f4) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(circularRevealWidget, CircularRevealWidget.CircularRevealProperty.CIRCULAR_REVEAL, CircularRevealWidget.CircularRevealEvaluator.CIRCULAR_REVEAL, new CircularRevealWidget.RevealInfo[]{new CircularRevealWidget.RevealInfo(f2, f3, f4)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        CircularRevealWidget.RevealInfo revealInfo = circularRevealWidget.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) circularRevealWidget, (int) f2, (int) f3, revealInfo.radius, f4);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    public static Animator createCircularReveal(CircularRevealWidget circularRevealWidget, float f2, float f3, float f4, float f5) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(circularRevealWidget, CircularRevealWidget.CircularRevealProperty.CIRCULAR_REVEAL, CircularRevealWidget.CircularRevealEvaluator.CIRCULAR_REVEAL, new CircularRevealWidget.RevealInfo[]{new CircularRevealWidget.RevealInfo(f2, f3, f4), new CircularRevealWidget.RevealInfo(f2, f3, f5)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) circularRevealWidget, (int) f2, (int) f3, f4, f5);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
        return animatorSet;
    }
}
