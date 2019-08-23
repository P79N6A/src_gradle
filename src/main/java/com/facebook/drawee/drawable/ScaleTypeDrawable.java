package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.drawee.drawable.ScalingUtils;

public class ScaleTypeDrawable extends ForwardingDrawable {
    @VisibleForTesting
    Matrix mDrawMatrix;
    @VisibleForTesting
    PointF mFocusPoint = null;
    @VisibleForTesting
    ScalingUtils.ScaleType mScaleType;
    @VisibleForTesting
    Object mScaleTypeState;
    private Matrix mTempMatrix = new Matrix();
    @VisibleForTesting
    int mUnderlyingHeight = 0;
    @VisibleForTesting
    int mUnderlyingWidth = 0;

    public PointF getFocusPoint() {
        return this.mFocusPoint;
    }

    public ScalingUtils.ScaleType getScaleType() {
        return this.mScaleType;
    }

    private void configureBoundsIfUnderlyingChanged() {
        boolean z;
        boolean z2 = true;
        if (this.mScaleType instanceof ScalingUtils.l) {
            Object a2 = ((ScalingUtils.l) this.mScaleType).a();
            if (a2 == null || !a2.equals(this.mScaleTypeState)) {
                z = true;
            } else {
                z = false;
            }
            this.mScaleTypeState = a2;
        } else {
            z = false;
        }
        if (this.mUnderlyingWidth == getCurrent().getIntrinsicWidth() && this.mUnderlyingHeight == getCurrent().getIntrinsicHeight()) {
            z2 = false;
        }
        if (z2 || z) {
            configureBounds();
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public void configureBounds() {
        float f2;
        float f3;
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.mUnderlyingWidth = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.mUnderlyingHeight = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.mDrawMatrix = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.mDrawMatrix = null;
        } else if (this.mScaleType == ScalingUtils.ScaleType.FIT_XY) {
            current.setBounds(bounds);
            this.mDrawMatrix = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            ScalingUtils.ScaleType scaleType = this.mScaleType;
            Matrix matrix = this.mTempMatrix;
            if (this.mFocusPoint != null) {
                f2 = this.mFocusPoint.x;
            } else {
                f2 = 0.5f;
            }
            if (this.mFocusPoint != null) {
                f3 = this.mFocusPoint.y;
            } else {
                f3 = 0.5f;
            }
            scaleType.getTransform(matrix, bounds, intrinsicWidth, intrinsicHeight, f2, f3);
            this.mDrawMatrix = this.mTempMatrix;
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        configureBounds();
    }

    public Drawable setCurrent(Drawable drawable) {
        Drawable current = super.setCurrent(drawable);
        configureBounds();
        return current;
    }

    public void getTransform(Matrix matrix) {
        getParentTransform(matrix);
        configureBoundsIfUnderlyingChanged();
        if (this.mDrawMatrix != null) {
            matrix.preConcat(this.mDrawMatrix);
        }
    }

    public void setFocusPoint(PointF pointF) {
        if (!Objects.equal(this.mFocusPoint, pointF)) {
            if (this.mFocusPoint == null) {
                this.mFocusPoint = new PointF();
            }
            this.mFocusPoint.set(pointF);
            configureBounds();
            invalidateSelf();
        }
    }

    public void setScaleType(ScalingUtils.ScaleType scaleType) {
        if (!Objects.equal(this.mScaleType, scaleType)) {
            this.mScaleType = scaleType;
            this.mScaleTypeState = null;
            configureBounds();
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        configureBoundsIfUnderlyingChanged();
        if (this.mDrawMatrix != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.mDrawMatrix);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    public ScaleTypeDrawable(Drawable drawable, ScalingUtils.ScaleType scaleType) {
        super((Drawable) Preconditions.checkNotNull(drawable));
        this.mScaleType = scaleType;
    }
}
