package com.facebook.react.flat;

import android.graphics.Rect;

public final class HitSlopNodeRegion extends NodeRegion {
    private final Rect mHitSlop;

    /* access modifiers changed from: package-private */
    public final float getTouchableBottom() {
        return getBottom() + ((float) this.mHitSlop.bottom);
    }

    /* access modifiers changed from: package-private */
    public final float getTouchableLeft() {
        return getLeft() - ((float) this.mHitSlop.left);
    }

    /* access modifiers changed from: package-private */
    public final float getTouchableRight() {
        return getRight() + ((float) this.mHitSlop.right);
    }

    /* access modifiers changed from: package-private */
    public final float getTouchableTop() {
        return getTop() - ((float) this.mHitSlop.top);
    }

    /* access modifiers changed from: package-private */
    public final boolean withinBounds(float f2, float f3) {
        if (getTouchableLeft() > f2 || f2 >= getTouchableRight() || getTouchableTop() > f3 || f3 >= getTouchableBottom()) {
            return false;
        }
        return true;
    }

    HitSlopNodeRegion(Rect rect, float f2, float f3, float f4, float f5, int i, boolean z) {
        super(f2, f3, f4, f5, i, z);
        this.mHitSlop = rect;
    }
}
