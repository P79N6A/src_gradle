package com.facebook.react.animation;

import android.view.View;

public interface AnimationPropertyUpdater {
    void onFinish(View view);

    void onUpdate(View view, float f2);

    void prepare(View view);
}
