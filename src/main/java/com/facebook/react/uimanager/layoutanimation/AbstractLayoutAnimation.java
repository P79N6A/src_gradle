package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.IllegalViewOperationException;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class AbstractLayoutAnimation {
    private static final Map<InterpolatorType, Interpolator> INTERPOLATOR = MapBuilder.of(InterpolatorType.LINEAR, new LinearInterpolator(), InterpolatorType.EASE_IN, new AccelerateInterpolator(), InterpolatorType.EASE_OUT, new DecelerateInterpolator(), InterpolatorType.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator(), InterpolatorType.SPRING, new SimpleSpringInterpolator());
    @Nullable
    protected AnimatedPropertyType mAnimatedProperty;
    private int mDelayMs;
    protected int mDurationMs;
    @Nullable
    private Interpolator mInterpolator;

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract Animation createAnimationImpl(View view, int i, int i2, int i3, int i4);

    /* access modifiers changed from: package-private */
    public abstract boolean isValid();

    AbstractLayoutAnimation() {
    }

    public void reset() {
        this.mAnimatedProperty = null;
        this.mDurationMs = 0;
        this.mDelayMs = 0;
        this.mInterpolator = null;
    }

    private static Interpolator getInterpolator(InterpolatorType interpolatorType) {
        Interpolator interpolator = INTERPOLATOR.get(interpolatorType);
        if (interpolator != null) {
            return interpolator;
        }
        throw new IllegalArgumentException("Missing interpolator for type : " + interpolatorType);
    }

    public void initializeFromConfig(ReadableMap readableMap, int i) {
        AnimatedPropertyType animatedPropertyType;
        int i2;
        if (readableMap.hasKey("property")) {
            animatedPropertyType = AnimatedPropertyType.fromString(readableMap.getString("property"));
        } else {
            animatedPropertyType = null;
        }
        this.mAnimatedProperty = animatedPropertyType;
        if (readableMap.hasKey("duration")) {
            i = readableMap.getInt("duration");
        }
        this.mDurationMs = i;
        if (readableMap.hasKey("delay")) {
            i2 = readableMap.getInt("delay");
        } else {
            i2 = 0;
        }
        this.mDelayMs = i2;
        if (readableMap.hasKey("type")) {
            this.mInterpolator = getInterpolator(InterpolatorType.fromString(readableMap.getString("type")));
            if (!isValid()) {
                throw new IllegalViewOperationException("Invalid layout animation : " + readableMap);
            }
            return;
        }
        throw new IllegalArgumentException("Missing interpolation type.");
    }

    @Nullable
    public final Animation createAnimation(View view, int i, int i2, int i3, int i4) {
        if (!isValid()) {
            return null;
        }
        Animation createAnimationImpl = createAnimationImpl(view, i, i2, i3, i4);
        if (createAnimationImpl != null) {
            createAnimationImpl.setDuration((long) (this.mDurationMs * 1));
            createAnimationImpl.setStartOffset((long) (this.mDelayMs * 1));
            createAnimationImpl.setInterpolator(this.mInterpolator);
        }
        return createAnimationImpl;
    }
}
