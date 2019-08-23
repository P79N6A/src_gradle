package com.facebook.react.flat;

import android.graphics.Canvas;

public abstract class DrawCommand {
    static final DrawCommand[] EMPTY_ARRAY = new DrawCommand[0];

    /* access modifiers changed from: package-private */
    public abstract void debugDraw(FlatViewGroup flatViewGroup, Canvas canvas);

    /* access modifiers changed from: package-private */
    public abstract void draw(FlatViewGroup flatViewGroup, Canvas canvas);

    /* access modifiers changed from: package-private */
    public abstract float getBottom();

    /* access modifiers changed from: package-private */
    public abstract float getLeft();

    /* access modifiers changed from: package-private */
    public abstract float getRight();

    /* access modifiers changed from: package-private */
    public abstract float getTop();
}
