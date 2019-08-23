package com.facebook.fresco.animation.frame;

import com.facebook.common.internal.VisibleForTesting;
import com.facebook.fresco.animation.backend.AnimationBackend;

public class SmoothSlidingFrameScheduler implements FrameScheduler {
    private final AnimationBackend mAnimationBackend;
    private int mFrameNumber = -1;
    private long mLastDrawTimeMs = -1;
    private int mLoopCount;
    private long mLoopDurationMs = -1;
    private long mNowAnimationTimeMs = -1;

    public boolean isInfiniteAnimation() {
        if (this.mAnimationBackend.getLoopCount() == 0) {
            return true;
        }
        return false;
    }

    public long getLoopDurationMs() {
        if (this.mLoopDurationMs != -1) {
            return this.mLoopDurationMs;
        }
        this.mLoopDurationMs = 0;
        int frameCount = this.mAnimationBackend.getFrameCount();
        for (int i = 0; i < frameCount; i++) {
            this.mLoopDurationMs += (long) this.mAnimationBackend.getFrameDurationMs(i);
        }
        return this.mLoopDurationMs;
    }

    public SmoothSlidingFrameScheduler(AnimationBackend animationBackend) {
        this.mAnimationBackend = animationBackend;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public int getFrameNumberWithinLoop(long j) {
        int i = 0;
        long j2 = 0;
        do {
            j2 += (long) this.mAnimationBackend.getFrameDurationMs(i);
            i++;
        } while (j >= j2);
        return i - 1;
    }

    public long getTargetRenderTimeMs(int i) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (long) this.mAnimationBackend.getFrameDurationMs(i);
        }
        return j;
    }

    public long getTargetRenderTimeForNextFrameMs(long j) {
        if (getLoopDurationMs() == 0) {
            return -1;
        }
        if (!isInfiniteAnimation() && this.mLoopCount >= this.mAnimationBackend.getLoopCount()) {
            return -1;
        }
        long frameDurationMs = (long) this.mAnimationBackend.getFrameDurationMs(this.mFrameNumber);
        long j2 = this.mNowAnimationTimeMs + frameDurationMs;
        if (j2 >= j) {
            return j2;
        }
        return j + frameDurationMs;
    }

    public int getFrameNumberToRender(long j, long j2) {
        if (!isInfiniteAnimation() && j / getLoopDurationMs() >= ((long) this.mAnimationBackend.getLoopCount())) {
            return -1;
        }
        int frameNumberWithinLoop = getFrameNumberWithinLoop(j % getLoopDurationMs());
        if (this.mFrameNumber == -1 || j2 != this.mLastDrawTimeMs) {
            this.mNowAnimationTimeMs = j;
            this.mLastDrawTimeMs = j;
            this.mFrameNumber = frameNumberWithinLoop;
            return frameNumberWithinLoop;
        }
        this.mLastDrawTimeMs = j;
        if (this.mNowAnimationTimeMs + ((long) this.mAnimationBackend.getFrameDurationMs(this.mFrameNumber)) > j) {
            return this.mFrameNumber;
        }
        this.mNowAnimationTimeMs = j;
        int i = this.mFrameNumber + 1;
        if (i >= this.mAnimationBackend.getFrameCount()) {
            this.mLoopCount++;
            i = 0;
        }
        if (!this.mAnimationBackend.hasCacheFrame(i)) {
            return this.mFrameNumber;
        }
        this.mFrameNumber = i;
        return this.mFrameNumber;
    }
}
