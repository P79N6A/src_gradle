package com.facebook.react.flat;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewParent;
import javax.annotation.Nullable;

public abstract class DrawCommandManager {
    /* access modifiers changed from: package-private */
    @Nullable
    public abstract NodeRegion anyNodeRegionWithinBounds(float f2, float f3);

    /* access modifiers changed from: package-private */
    public abstract void debugDraw(Canvas canvas);

    /* access modifiers changed from: package-private */
    public abstract void draw(Canvas canvas);

    /* access modifiers changed from: package-private */
    public abstract void getClippingRect(Rect rect);

    /* access modifiers changed from: package-private */
    public abstract SparseArray<View> getDetachedViews();

    /* access modifiers changed from: package-private */
    public abstract void mountDrawCommands(DrawCommand[] drawCommandArr, SparseIntArray sparseIntArray, float[] fArr, float[] fArr2, boolean z);

    /* access modifiers changed from: package-private */
    public abstract void mountNodeRegions(NodeRegion[] nodeRegionArr, float[] fArr, float[] fArr2);

    /* access modifiers changed from: package-private */
    public abstract void mountViews(ViewResolver viewResolver, int[] iArr, int[] iArr2);

    /* access modifiers changed from: package-private */
    public abstract void onClippedViewDropped(View view);

    /* access modifiers changed from: package-private */
    public abstract boolean updateClippingRect();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract NodeRegion virtualNodeRegionWithinBounds(float f2, float f3);

    DrawCommandManager() {
    }

    protected static void ensureViewHasNoParent(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            throw new RuntimeException("Cannot add view " + view + " to DrawCommandManager while it has a parent " + parent);
        }
    }

    static DrawCommandManager getVerticalClippingInstance(FlatViewGroup flatViewGroup, DrawCommand[] drawCommandArr) {
        return new VerticalDrawCommandManager(flatViewGroup, drawCommandArr);
    }
}
