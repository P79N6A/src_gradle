package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class OpacityAnimation extends Animation {
    private final float mDeltaOpacity;
    private final float mStartOpacity;
    private final View mView;

    static class OpacityAnimationListener implements Animation.AnimationListener {
        private boolean mLayerTypeChanged;
        private final View mView;

        public void onAnimationRepeat(Animation animation) {
        }

        public OpacityAnimationListener(View view) {
            this.mView = view;
        }

        public void onAnimationEnd(Animation animation) {
            if (this.mLayerTypeChanged) {
                this.mView.setLayerType(0, null);
            }
        }

        public void onAnimationStart(Animation animation) {
            if (this.mView.hasOverlappingRendering() && this.mView.getLayerType() == 0) {
                this.mLayerTypeChanged = true;
                this.mView.setLayerType(2, null);
            }
        }
    }

    public boolean willChangeBounds() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f2, Transformation transformation) {
        this.mView.setAlpha(this.mStartOpacity + (this.mDeltaOpacity * f2));
    }

    public OpacityAnimation(View view, float f2, float f3) {
        this.mView = view;
        this.mStartOpacity = f2;
        this.mDeltaOpacity = f3 - f2;
        setAnimationListener(new OpacityAnimationListener(view));
    }
}
