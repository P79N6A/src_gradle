package com.facebook.react.animation;

import android.view.View;

public class RotationAnimationPropertyUpdater extends AbstractSingleFloatProperyUpdater {
    public RotationAnimationPropertyUpdater(float f2) {
        super(f2);
    }

    /* access modifiers changed from: protected */
    public float getProperty(View view) {
        return view.getRotation();
    }

    /* access modifiers changed from: protected */
    public void setProperty(View view, float f2) {
        view.setRotation((float) Math.toDegrees((double) f2));
    }
}
