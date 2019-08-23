package com.ss.ttm.player;

import com.meituan.robust.ChangeQuickRedirect;

public final class PlaybackParams {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mAudioFallbackMode = -1;
    private int mDescribeContents = -1;
    private float mPitch = -1.0f;
    private float mSpeed = -1.0f;

    public final PlaybackParams allowDefaults() {
        return this;
    }

    public final int describeContents() {
        return this.mDescribeContents;
    }

    public final int getAudioFallbackMode() {
        return this.mAudioFallbackMode;
    }

    public final float getPitch() {
        return this.mPitch;
    }

    public final float getSpeed() {
        return this.mSpeed;
    }

    public final PlaybackParams setAudioFallbackMode(int i) {
        this.mAudioFallbackMode = i;
        return this;
    }

    public final PlaybackParams setPitch(float f2) {
        this.mPitch = f2;
        return this;
    }

    public final PlaybackParams setSpeed(float f2) {
        this.mSpeed = f2;
        return this;
    }
}
