package com.facebook.react.flat;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import javax.annotation.Nullable;

public final class DrawView extends AbstractDrawCommand {
    public static final DrawView[] EMPTY_ARRAY = new DrawView[0];
    private final RectF TMP_RECT = new RectF();
    private float mClipRadius;
    float mLogicalBottom;
    float mLogicalLeft;
    float mLogicalRight;
    float mLogicalTop;
    @Nullable
    private Path mPath;
    boolean mWasMounted;
    final int reactTag;

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
    }

    private void updateClipPath() {
        this.mPath = new Path();
        this.TMP_RECT.set(getLeft(), getTop(), getRight(), getBottom());
        this.mPath.addRoundRect(this.TMP_RECT, this.mClipRadius, this.mClipRadius, Path.Direction.CW);
    }

    public DrawView(int i) {
        this.reactTag = i;
    }

    /* access modifiers changed from: package-private */
    public final void setClipRadius(float f2) {
        this.mClipRadius = f2;
        if (f2 > 0.5f) {
            updateClipPath();
        } else {
            this.mPath = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void applyClipping(Canvas canvas) {
        if (this.mClipRadius > 0.5f) {
            canvas.clipPath(this.mPath);
        } else {
            super.applyClipping(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDebugDrawHighlight(Canvas canvas) {
        if (this.mPath != null) {
            debugDrawWarningHighlight(canvas, "borderRadius: " + this.mClipRadius);
            return;
        }
        if (!boundsMatch(this.mLogicalLeft, this.mLogicalTop, this.mLogicalRight, this.mLogicalBottom)) {
            StringBuilder sb = new StringBuilder("Overflow: { ");
            String[] strArr = {"left: ", "top: ", "right: ", "bottom: "};
            float[] fArr = {getLeft() - this.mLogicalLeft, getTop() - this.mLogicalTop, this.mLogicalRight - getRight(), this.mLogicalBottom - getBottom()};
            for (int i = 0; i < 4; i++) {
                if (fArr[i] != 0.0f) {
                    sb.append(strArr[i]);
                    sb.append(fArr[i]);
                    sb.append(", ");
                }
            }
            sb.append("}");
            debugDrawCautionHighlight(canvas, sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void onDebugDraw(FlatViewGroup flatViewGroup, Canvas canvas) {
        flatViewGroup.debugDrawNextChild(canvas);
    }

    public final void draw(FlatViewGroup flatViewGroup, Canvas canvas) {
        onPreDraw(flatViewGroup, canvas);
        if (this.mNeedsClipping || this.mClipRadius > 0.5f) {
            canvas.save(2);
            applyClipping(canvas);
            flatViewGroup.drawNextChild(canvas);
            canvas.restore();
            return;
        }
        flatViewGroup.drawNextChild(canvas);
    }

    private void setLogicalBounds(float f2, float f3, float f4, float f5) {
        this.mLogicalLeft = f2;
        this.mLogicalTop = f3;
        this.mLogicalRight = f4;
        this.mLogicalBottom = f5;
    }

    private boolean logicalBoundsMatch(float f2, float f3, float f4, float f5) {
        if (f2 == this.mLogicalLeft && f3 == this.mLogicalTop && f4 == this.mLogicalRight && f5 == this.mLogicalBottom) {
            return true;
        }
        return false;
    }

    public final DrawView collectDrawView(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        boolean z;
        boolean z2;
        float f15 = f6;
        float f16 = f7;
        float f17 = f8;
        float f18 = f9;
        float f19 = f10;
        float f20 = f11;
        float f21 = f12;
        float f22 = f13;
        float f23 = f14;
        if (!isFrozen()) {
            setBounds(f2, f3, f4, f5);
            setClipBounds(f19, f20, f21, f22);
            setClipRadius(f23);
            setLogicalBounds(f15, f16, f17, f18);
            freeze();
            return this;
        }
        boolean boundsMatch = boundsMatch(f2, f3, f4, f5);
        boolean clipBoundsMatch = clipBoundsMatch(f19, f20, f21, f22);
        if (this.mClipRadius == f23) {
            z = true;
        } else {
            z = false;
        }
        boolean logicalBoundsMatch = logicalBoundsMatch(f15, f16, f17, f18);
        if (boundsMatch && clipBoundsMatch && z && logicalBoundsMatch) {
            return this;
        }
        DrawView drawView = (DrawView) mutableCopy();
        if (!boundsMatch) {
            z2 = boundsMatch;
            drawView.setBounds(f2, f3, f4, f5);
        } else {
            z2 = boundsMatch;
        }
        if (!clipBoundsMatch) {
            drawView.setClipBounds(f19, f20, f21, f22);
        }
        if (!logicalBoundsMatch) {
            drawView.setLogicalBounds(f15, f16, f17, f18);
        }
        if (!z || !z2) {
            drawView.setClipRadius(f14);
        }
        drawView.mWasMounted = false;
        drawView.freeze();
        return drawView;
    }
}
