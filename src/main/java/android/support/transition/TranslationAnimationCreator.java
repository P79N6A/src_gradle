package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import com.ss.android.ugc.aweme.C0906R;

public class TranslationAnimationCreator {

    static class TransitionPositionListener extends AnimatorListenerAdapter {
        private final View mMovingView;
        private float mPausedX;
        private float mPausedY;
        private final int mStartX;
        private final int mStartY;
        private final float mTerminalX;
        private final float mTerminalY;
        private int[] mTransitionPosition = ((int[]) this.mViewInHierarchy.getTag(C0906R.id.d6j));
        private final View mViewInHierarchy;

        public void onAnimationEnd(Animator animator) {
            this.mMovingView.setTranslationX(this.mTerminalX);
            this.mMovingView.setTranslationY(this.mTerminalY);
        }

        public void onAnimationResume(Animator animator) {
            this.mMovingView.setTranslationX(this.mPausedX);
            this.mMovingView.setTranslationY(this.mPausedY);
        }

        public void onAnimationPause(Animator animator) {
            this.mPausedX = this.mMovingView.getTranslationX();
            this.mPausedY = this.mMovingView.getTranslationY();
            this.mMovingView.setTranslationX(this.mTerminalX);
            this.mMovingView.setTranslationY(this.mTerminalY);
        }

        public void onAnimationCancel(Animator animator) {
            if (this.mTransitionPosition == null) {
                this.mTransitionPosition = new int[2];
            }
            this.mTransitionPosition[0] = Math.round(((float) this.mStartX) + this.mMovingView.getTranslationX());
            this.mTransitionPosition[1] = Math.round(((float) this.mStartY) + this.mMovingView.getTranslationY());
            this.mViewInHierarchy.setTag(C0906R.id.d6j, this.mTransitionPosition);
        }

        TransitionPositionListener(View view, View view2, int i, int i2, float f2, float f3) {
            this.mMovingView = view;
            this.mViewInHierarchy = view2;
            this.mStartX = i - Math.round(this.mMovingView.getTranslationX());
            this.mStartY = i2 - Math.round(this.mMovingView.getTranslationY());
            this.mTerminalX = f2;
            this.mTerminalY = f3;
            if (this.mTransitionPosition != null) {
                this.mViewInHierarchy.setTag(C0906R.id.d6j, null);
            }
        }
    }

    private TranslationAnimationCreator() {
    }

    static Animator createAnimation(View view, TransitionValues transitionValues, int i, int i2, float f2, float f3, float f4, float f5, TimeInterpolator timeInterpolator) {
        float f6;
        float f7;
        View view2 = view;
        TransitionValues transitionValues2 = transitionValues;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues2.view.getTag(C0906R.id.d6j);
        if (iArr != null) {
            f6 = ((float) (iArr[0] - i)) + translationX;
            f7 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f6 = f2;
            f7 = f3;
        }
        int round = i + Math.round(f6 - translationX);
        int round2 = i2 + Math.round(f7 - translationY);
        view2.setTranslationX(f6);
        view2.setTranslationY(f7);
        if (f6 == f4 && f7 == f5) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f6, f4}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f7, f5})});
        TransitionPositionListener transitionPositionListener = new TransitionPositionListener(view, transitionValues2.view, round, round2, translationX, translationY);
        ofPropertyValuesHolder.addListener(transitionPositionListener);
        AnimatorUtils.addPauseListener(ofPropertyValuesHolder, transitionPositionListener);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
