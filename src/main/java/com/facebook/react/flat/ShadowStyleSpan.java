package com.facebook.react.flat;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class ShadowStyleSpan extends CharacterStyle {
    static final ShadowStyleSpan INSTANCE;
    private int mColor;
    private float mDx;
    private float mDy;
    private boolean mFrozen;
    private float mRadius;

    /* access modifiers changed from: package-private */
    public final void freeze() {
        this.mFrozen = true;
    }

    public final int getColor() {
        return this.mColor;
    }

    public final float getRadius() {
        return this.mRadius;
    }

    /* access modifiers changed from: package-private */
    public final boolean isFrozen() {
        return this.mFrozen;
    }

    static {
        ShadowStyleSpan shadowStyleSpan = new ShadowStyleSpan(0.0f, 0.0f, 0.0f, 0, true);
        INSTANCE = shadowStyleSpan;
    }

    /* access modifiers changed from: package-private */
    public final ShadowStyleSpan mutableCopy() {
        ShadowStyleSpan shadowStyleSpan = new ShadowStyleSpan(this.mDx, this.mDy, this.mRadius, this.mColor, false);
        return shadowStyleSpan;
    }

    public final void setColor(int i) {
        this.mColor = i;
    }

    public final void setRadius(float f2) {
        this.mRadius = f2;
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.mRadius, this.mDx, this.mDy, this.mColor);
    }

    public final void setOffset(float f2, float f3) {
        this.mDx = f2;
        this.mDy = f3;
    }

    public final boolean offsetMatches(float f2, float f3) {
        if (this.mDx == f2 && this.mDy == f3) {
            return true;
        }
        return false;
    }

    private ShadowStyleSpan(float f2, float f3, float f4, int i, boolean z) {
        this.mDx = f2;
        this.mDy = f3;
        this.mRadius = f4;
        this.mColor = i;
        this.mFrozen = z;
    }
}
