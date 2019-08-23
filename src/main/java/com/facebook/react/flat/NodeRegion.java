package com.facebook.react.flat;

public class NodeRegion {
    static final NodeRegion EMPTY;
    static final NodeRegion[] EMPTY_ARRAY = new NodeRegion[0];
    private final float mBottom;
    final boolean mIsVirtual;
    private final float mLeft;
    private final float mRight;
    final int mTag;
    private final float mTop;

    /* access modifiers changed from: package-private */
    public final float getBottom() {
        return this.mBottom;
    }

    /* access modifiers changed from: package-private */
    public final float getLeft() {
        return this.mLeft;
    }

    /* access modifiers changed from: package-private */
    public final float getRight() {
        return this.mRight;
    }

    /* access modifiers changed from: package-private */
    public final float getTop() {
        return this.mTop;
    }

    /* access modifiers changed from: package-private */
    public float getTouchableBottom() {
        return getBottom();
    }

    /* access modifiers changed from: package-private */
    public float getTouchableLeft() {
        return getLeft();
    }

    /* access modifiers changed from: package-private */
    public float getTouchableRight() {
        return getRight();
    }

    /* access modifiers changed from: package-private */
    public float getTouchableTop() {
        return getTop();
    }

    static {
        NodeRegion nodeRegion = new NodeRegion(0.0f, 0.0f, 0.0f, 0.0f, -1, false);
        EMPTY = nodeRegion;
    }

    /* access modifiers changed from: package-private */
    public boolean matchesTag(int i) {
        if (this.mTag == i) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int getReactTag(float f2, float f3) {
        return this.mTag;
    }

    /* access modifiers changed from: package-private */
    public boolean withinBounds(float f2, float f3) {
        if (this.mLeft > f2 || f2 >= this.mRight || this.mTop > f3 || f3 >= this.mBottom) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean matches(float f2, float f3, float f4, float f5, boolean z) {
        if (f2 == this.mLeft && f3 == this.mTop && f4 == this.mRight && f5 == this.mBottom && z == this.mIsVirtual) {
            return true;
        }
        return false;
    }

    NodeRegion(float f2, float f3, float f4, float f5, int i, boolean z) {
        this.mLeft = f2;
        this.mTop = f3;
        this.mRight = f4;
        this.mBottom = f5;
        this.mTag = i;
        this.mIsVirtual = z;
    }
}
