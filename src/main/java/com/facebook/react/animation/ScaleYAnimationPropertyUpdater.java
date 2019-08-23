package com.facebook.react.animation;

import android.view.View;

public class ScaleYAnimationPropertyUpdater extends AbstractSingleFloatProperyUpdater {
    public ScaleYAnimationPropertyUpdater(float f2) {
        super(f2);
    }

    /* access modifiers changed from: protected */
    public float getProperty(View view) {
        return view.getScaleY();
    }

    /* access modifiers changed from: protected */
    public void setProperty(View view, float f2) {
        view.setScaleY(f2);
    }

    public ScaleYAnimationPropertyUpdater(float f2, float f3) {
        super(f2, f3);
    }
}
