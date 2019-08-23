package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import java.util.Arrays;

public class FadeDrawable extends a {
    @VisibleForTesting
    int mAlpha;
    @VisibleForTesting
    int[] mAlphas;
    @VisibleForTesting
    int mDurationMs;
    @VisibleForTesting
    boolean[] mIsLayerOn;
    private final Drawable[] mLayers;
    @VisibleForTesting
    int mPreventInvalidateCount;
    @VisibleForTesting
    int[] mStartAlphas;
    @VisibleForTesting
    long mStartTimeMs;
    @VisibleForTesting
    int mTransitionState;

    public int getAlpha() {
        return this.mAlpha;
    }

    public int getTransitionDuration() {
        return this.mDurationMs;
    }

    @VisibleForTesting
    public int getTransitionState() {
        return this.mTransitionState;
    }

    public void beginBatchMode() {
        this.mPreventInvalidateCount++;
    }

    /* access modifiers changed from: protected */
    public long getCurrentTimeMs() {
        return SystemClock.uptimeMillis();
    }

    public void invalidateSelf() {
        if (this.mPreventInvalidateCount == 0) {
            super.invalidateSelf();
        }
    }

    public void reset() {
        resetInternal();
        invalidateSelf();
    }

    public void endBatchMode() {
        this.mPreventInvalidateCount--;
        invalidateSelf();
    }

    public void fadeInAllLayers() {
        this.mTransitionState = 0;
        Arrays.fill(this.mIsLayerOn, true);
        invalidateSelf();
    }

    public void fadeOutAllLayers() {
        this.mTransitionState = 0;
        Arrays.fill(this.mIsLayerOn, false);
        invalidateSelf();
    }

    public void finishTransitionImmediately() {
        int i;
        this.mTransitionState = 2;
        for (int i2 = 0; i2 < this.mLayers.length; i2++) {
            int[] iArr = this.mAlphas;
            if (this.mIsLayerOn[i2]) {
                i = 255;
            } else {
                i = 0;
            }
            iArr[i2] = i;
        }
        invalidateSelf();
    }

    private void resetInternal() {
        this.mTransitionState = 2;
        Arrays.fill(this.mStartAlphas, 0);
        this.mStartAlphas[0] = 255;
        Arrays.fill(this.mAlphas, 0);
        this.mAlphas[0] = 255;
        Arrays.fill(this.mIsLayerOn, false);
        this.mIsLayerOn[0] = true;
    }

    public boolean isLayerOn(int i) {
        return this.mIsLayerOn[i];
    }

    public void fadeInLayer(int i) {
        this.mTransitionState = 0;
        this.mIsLayerOn[i] = true;
        invalidateSelf();
    }

    public void fadeOutLayer(int i) {
        this.mTransitionState = 0;
        this.mIsLayerOn[i] = false;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        if (this.mAlpha != i) {
            this.mAlpha = i;
            invalidateSelf();
        }
    }

    public void setTransitionDuration(int i) {
        this.mDurationMs = i;
        if (this.mTransitionState == 1) {
            this.mTransitionState = 0;
        }
    }

    public void fadeToLayer(int i) {
        this.mTransitionState = 0;
        Arrays.fill(this.mIsLayerOn, false);
        this.mIsLayerOn[i] = true;
        invalidateSelf();
    }

    public void fadeUpToLayer(int i) {
        this.mTransitionState = 0;
        int i2 = i + 1;
        Arrays.fill(this.mIsLayerOn, 0, i2, true);
        Arrays.fill(this.mIsLayerOn, i2, this.mLayers.length, false);
        invalidateSelf();
    }

    public FadeDrawable(Drawable[] drawableArr) {
        super(drawableArr);
        boolean z;
        if (drawableArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "At least one layer required!");
        this.mLayers = drawableArr;
        this.mStartAlphas = new int[drawableArr.length];
        this.mAlphas = new int[drawableArr.length];
        this.mAlpha = 255;
        this.mIsLayerOn = new boolean[drawableArr.length];
        this.mPreventInvalidateCount = 0;
        resetInternal();
    }

    private boolean updateAlphas(float f2) {
        int i;
        boolean z = true;
        for (int i2 = 0; i2 < this.mLayers.length; i2++) {
            if (this.mIsLayerOn[i2]) {
                i = 1;
            } else {
                i = -1;
            }
            this.mAlphas[i2] = (int) (((float) this.mStartAlphas[i2]) + (((float) (i * 255)) * f2));
            if (this.mAlphas[i2] < 0) {
                this.mAlphas[i2] = 0;
            }
            if (this.mAlphas[i2] > 255) {
                this.mAlphas[i2] = 255;
            }
            if (this.mIsLayerOn[i2] && this.mAlphas[i2] < 255) {
                z = false;
            }
            if (!this.mIsLayerOn[i2] && this.mAlphas[i2] > 0) {
                z = false;
            }
        }
        return z;
    }

    public void draw(Canvas canvas) {
        boolean z;
        float f2;
        boolean z2;
        int i = 2;
        switch (this.mTransitionState) {
            case 0:
                System.arraycopy(this.mAlphas, 0, this.mStartAlphas, 0, this.mLayers.length);
                this.mStartTimeMs = getCurrentTimeMs();
                if (this.mDurationMs == 0) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                z = updateAlphas(f2);
                if (!z) {
                    i = 1;
                }
                this.mTransitionState = i;
                break;
            case 1:
                if (this.mDurationMs > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Preconditions.checkState(z2);
                z = updateAlphas(((float) (getCurrentTimeMs() - this.mStartTimeMs)) / ((float) this.mDurationMs));
                if (!z) {
                    i = 1;
                }
                this.mTransitionState = i;
                break;
            default:
                z = true;
                break;
        }
        for (int i2 = 0; i2 < this.mLayers.length; i2++) {
            drawDrawableWithAlpha(canvas, this.mLayers[i2], (this.mAlphas[i2] * this.mAlpha) / 255);
        }
        if (!z) {
            invalidateSelf();
        }
    }

    private void drawDrawableWithAlpha(Canvas canvas, Drawable drawable, int i) {
        if (drawable != null && i > 0) {
            this.mPreventInvalidateCount++;
            drawable.mutate().setAlpha(i);
            this.mPreventInvalidateCount--;
            drawable.draw(canvas);
        }
    }
}
