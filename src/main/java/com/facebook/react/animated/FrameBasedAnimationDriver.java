package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

public class FrameBasedAnimationDriver extends AnimationDriver {
    private int mCurrentLoop;
    private double[] mFrames;
    private double mFromValue;
    private int mIterations;
    private long mStartFrameTimeNanos;
    private double mToValue;

    FrameBasedAnimationDriver(ReadableMap readableMap) {
        resetConfig(readableMap);
    }

    public void resetConfig(ReadableMap readableMap) {
        int i;
        ReadableArray array = readableMap.getArray("frames");
        int size = array.size();
        if (this.mFrames == null || this.mFrames.length != size) {
            this.mFrames = new double[size];
        }
        for (int i2 = 0; i2 < size; i2++) {
            this.mFrames[i2] = array.getDouble(i2);
        }
        this.mToValue = readableMap.getDouble("toValue");
        boolean z = true;
        if (readableMap.hasKey("iterations")) {
            i = readableMap.getInt("iterations");
        } else {
            i = 1;
        }
        this.mIterations = i;
        this.mCurrentLoop = 1;
        if (this.mIterations != 0) {
            z = false;
        }
        this.mHasFinished = z;
        this.mStartFrameTimeNanos = -1;
    }

    public void runAnimationStep(long j) {
        double d2;
        if (this.mStartFrameTimeNanos < 0) {
            this.mStartFrameTimeNanos = j;
            if (this.mCurrentLoop == 1) {
                this.mFromValue = this.mAnimatedValue.mValue;
            }
        }
        double d3 = (double) ((j - this.mStartFrameTimeNanos) / 1000000);
        Double.isNaN(d3);
        int round = (int) Math.round(d3 / 16.666666666666668d);
        if (round < 0) {
            throw new IllegalStateException("Calculated frame index should never be lower than 0");
        } else if (!this.mHasFinished) {
            if (round >= this.mFrames.length - 1) {
                d2 = this.mToValue;
                if (this.mIterations == -1 || this.mCurrentLoop < this.mIterations) {
                    this.mStartFrameTimeNanos = -1;
                    this.mCurrentLoop++;
                } else {
                    this.mHasFinished = true;
                }
            } else {
                d2 = (this.mFrames[round] * (this.mToValue - this.mFromValue)) + this.mFromValue;
            }
            this.mAnimatedValue.mValue = d2;
        }
    }
}
