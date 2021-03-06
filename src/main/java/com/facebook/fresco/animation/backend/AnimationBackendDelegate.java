package com.facebook.fresco.animation.backend;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.IntRange;
import com.facebook.fresco.animation.backend.AnimationBackend;
import javax.annotation.Nullable;

public class AnimationBackendDelegate<T extends AnimationBackend> implements AnimationBackend {
    @IntRange(from = -1, to = 255)
    private int mAlpha = -1;
    @Nullable
    private T mAnimationBackend;
    @Nullable
    private Rect mBounds;
    @Nullable
    private ColorFilter mColorFilter;

    @Nullable
    public T getAnimationBackend() {
        return this.mAnimationBackend;
    }

    public void clear() {
        if (this.mAnimationBackend != null) {
            this.mAnimationBackend.clear();
        }
    }

    public int getFrameCount() {
        if (this.mAnimationBackend == null) {
            return 0;
        }
        return this.mAnimationBackend.getFrameCount();
    }

    public int getIntrinsicHeight() {
        if (this.mAnimationBackend == null) {
            return -1;
        }
        return this.mAnimationBackend.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        if (this.mAnimationBackend == null) {
            return -1;
        }
        return this.mAnimationBackend.getIntrinsicWidth();
    }

    public int getLoopCount() {
        if (this.mAnimationBackend == null) {
            return 0;
        }
        return this.mAnimationBackend.getLoopCount();
    }

    public int getSizeInBytes() {
        if (this.mAnimationBackend == null) {
            return 0;
        }
        return this.mAnimationBackend.getSizeInBytes();
    }

    public AnimationBackendDelegate(@Nullable T t) {
        this.mAnimationBackend = t;
    }

    public int getFrameDurationMs(int i) {
        if (this.mAnimationBackend == null) {
            return 0;
        }
        return this.mAnimationBackend.getFrameDurationMs(i);
    }

    public boolean hasCacheFrame(int i) {
        if (this.mAnimationBackend != null) {
            return this.mAnimationBackend.hasCacheFrame(i);
        }
        return false;
    }

    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        if (this.mAnimationBackend != null) {
            this.mAnimationBackend.setAlpha(i);
        }
        this.mAlpha = i;
    }

    public void setAnimationBackend(@Nullable T t) {
        this.mAnimationBackend = t;
        if (this.mAnimationBackend != null) {
            applyBackendProperties(this.mAnimationBackend);
        }
    }

    public void setBounds(@Nullable Rect rect) {
        if (this.mAnimationBackend != null) {
            this.mAnimationBackend.setBounds(rect);
        }
        this.mBounds = rect;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.mAnimationBackend != null) {
            this.mAnimationBackend.setColorFilter(colorFilter);
        }
        this.mColorFilter = colorFilter;
    }

    @SuppressLint({"Range"})
    private void applyBackendProperties(AnimationBackend animationBackend) {
        if (this.mBounds != null) {
            animationBackend.setBounds(this.mBounds);
        }
        if (this.mAlpha >= 0 && this.mAlpha <= 255) {
            animationBackend.setAlpha(this.mAlpha);
        }
        if (this.mColorFilter != null) {
            animationBackend.setColorFilter(this.mColorFilter);
        }
    }

    public boolean drawFrame(Drawable drawable, Canvas canvas, int i) {
        if (this.mAnimationBackend == null || !this.mAnimationBackend.drawFrame(drawable, canvas, i)) {
            return false;
        }
        return true;
    }
}
