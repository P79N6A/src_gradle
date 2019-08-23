package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.facebook.react.uimanager.IllegalViewOperationException;

public abstract class BaseLayoutAnimation extends AbstractLayoutAnimation {
    /* access modifiers changed from: package-private */
    public abstract boolean isReverse();

    BaseLayoutAnimation() {
    }

    /* access modifiers changed from: package-private */
    public boolean isValid() {
        if (this.mDurationMs <= 0 || this.mAnimatedProperty == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public Animation createAnimationImpl(View view, int i, int i2, int i3, int i4) {
        float f2;
        float f3;
        float f4;
        if (this.mAnimatedProperty != null) {
            float f5 = 0.0f;
            switch (this.mAnimatedProperty) {
                case OPACITY:
                    if (isReverse()) {
                        f2 = view.getAlpha();
                    } else {
                        f2 = 0.0f;
                    }
                    if (!isReverse()) {
                        f5 = view.getAlpha();
                    }
                    return new OpacityAnimation(view, f2, f5);
                case SCALE_XY:
                    if (isReverse()) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    if (isReverse()) {
                        f4 = 0.0f;
                    } else {
                        f4 = 1.0f;
                    }
                    ScaleAnimation scaleAnimation = new ScaleAnimation(f3, f4, f3, f4, 1, 0.5f, 1, 0.5f);
                    return scaleAnimation;
                default:
                    throw new IllegalViewOperationException("Missing animation for property : " + this.mAnimatedProperty);
            }
        } else {
            throw new IllegalViewOperationException("Missing animated property from animation config");
        }
    }
}
