package com.facebook.react.animation;

import android.view.View;

public class ScaleXAnimationPropertyUpdater extends AbstractSingleFloatProperyUpdater {
    public ScaleXAnimationPropertyUpdater(float f2) {
        super(f2);
    }

    /* access modifiers changed from: protected */
    public float getProperty(View view) {
        return view.getScaleX();
    }

    /* access modifiers changed from: protected */
    public void setProperty(View view, float f2) {
        view.setScaleX(f2);
    }

    public ScaleXAnimationPropertyUpdater(float f2, float f3) {
        super(f2, f3);
    }
}
