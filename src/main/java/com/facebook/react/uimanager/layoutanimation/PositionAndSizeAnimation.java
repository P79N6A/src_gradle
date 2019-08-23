package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class PositionAndSizeAnimation extends Animation implements HandleLayout {
    private final int mDeltaHeight;
    private final int mDeltaWidth;
    private final float mDeltaX;
    private final float mDeltaY;
    private final int mStartHeight;
    private final int mStartWidth;
    private final float mStartX;
    private final float mStartY;
    private final View mView;

    public boolean willChangeBounds() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f2, Transformation transformation) {
        float f3 = this.mStartX + (this.mDeltaX * f2);
        float f4 = this.mStartY + (this.mDeltaY * f2);
        this.mView.layout(Math.round(f3), Math.round(f4), Math.round(f3 + ((float) this.mStartWidth) + (((float) this.mDeltaWidth) * f2)), Math.round(f4 + ((float) this.mStartHeight) + (((float) this.mDeltaHeight) * f2)));
    }

    public PositionAndSizeAnimation(View view, int i, int i2, int i3, int i4) {
        this.mView = view;
        this.mStartX = view.getX() - view.getTranslationX();
        this.mStartY = view.getY() - view.getTranslationY();
        this.mStartWidth = view.getWidth();
        this.mStartHeight = view.getHeight();
        this.mDeltaX = ((float) i) - this.mStartX;
        this.mDeltaY = ((float) i2) - this.mStartY;
        this.mDeltaWidth = i3 - this.mStartWidth;
        this.mDeltaHeight = i4 - this.mStartHeight;
    }
}
