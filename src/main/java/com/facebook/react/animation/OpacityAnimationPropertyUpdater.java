package com.facebook.react.animation;

import android.view.View;

public class OpacityAnimationPropertyUpdater extends AbstractSingleFloatProperyUpdater {
    public OpacityAnimationPropertyUpdater(float f2) {
        super(f2);
    }

    /* access modifiers changed from: protected */
    public float getProperty(View view) {
        return view.getAlpha();
    }

    /* access modifiers changed from: protected */
    public void setProperty(View view, float f2) {
        view.setAlpha(f2);
    }

    public OpacityAnimationPropertyUpdater(float f2, float f3) {
        super(f2, f3);
    }
}
