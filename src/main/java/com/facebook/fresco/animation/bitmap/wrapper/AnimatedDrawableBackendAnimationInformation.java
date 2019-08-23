package com.facebook.fresco.animation.bitmap.wrapper;

import com.facebook.fresco.animation.backend.AnimationInformation;
import com.facebook.imagepipeline.animated.a.a;

public class AnimatedDrawableBackendAnimationInformation implements AnimationInformation {
    private final a mAnimatedDrawableBackend;

    public int getFrameCount() {
        return this.mAnimatedDrawableBackend.getFrameCount();
    }

    public int getLoopCount() {
        return this.mAnimatedDrawableBackend.getLoopCount();
    }

    public AnimatedDrawableBackendAnimationInformation(a aVar) {
        this.mAnimatedDrawableBackend = aVar;
    }

    public int getFrameDurationMs(int i) {
        return this.mAnimatedDrawableBackend.getDurationMsForFrame(i);
    }
}
