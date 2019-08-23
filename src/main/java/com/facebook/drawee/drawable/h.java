package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.e.b;
import java.util.Arrays;

public abstract class h extends Drawable implements Rounded, TransformAwareDrawable {
    @VisibleForTesting
    final RectF mBitmapBounds = new RectF();
    protected int mBorderColor = 0;
    protected final Path mBorderPath = new Path();
    @VisibleForTesting
    final float[] mBorderRadii = new float[8];
    protected float mBorderWidth;
    @VisibleForTesting
    final Matrix mBoundsTransform = new Matrix();
    private final float[] mCornerRadii = new float[8];
    private final Drawable mDelegate;
    @VisibleForTesting
    final RectF mDrawableBounds = new RectF();
    @Nullable
    @VisibleForTesting
    RectF mInsideBorderBounds;
    @Nullable
    @VisibleForTesting
    float[] mInsideBorderRadii;
    @Nullable
    @VisibleForTesting
    Matrix mInsideBorderTransform;
    @VisibleForTesting
    final Matrix mInverseParentTransform = new Matrix();
    protected boolean mIsCircle;
    private boolean mIsPathDirty = true;
    protected boolean mIsShaderTransformDirty = true;
    private float mPadding = 0.0f;
    @VisibleForTesting
    final Matrix mParentTransform = new Matrix();
    protected final Path mPath = new Path();
    @VisibleForTesting
    final Matrix mPrevBoundsTransform = new Matrix();
    @Nullable
    @VisibleForTesting
    Matrix mPrevInsideBorderTransform;
    @VisibleForTesting
    final Matrix mPrevParentTransform = new Matrix();
    @VisibleForTesting
    final RectF mPrevRootBounds = new RectF();
    protected boolean mRadiiNonZero;
    @VisibleForTesting
    final RectF mRootBounds = new RectF();
    private boolean mScaleDownInsideBorders = false;
    @VisibleForTesting
    final Matrix mTransform = new Matrix();
    @Nullable
    private TransformCallback mTransformCallback;

    public int getBorderColor() {
        return this.mBorderColor;
    }

    public float getBorderWidth() {
        return this.mBorderWidth;
    }

    public float getPadding() {
        return this.mPadding;
    }

    public float[] getRadii() {
        return this.mCornerRadii;
    }

    public boolean getScaleDownInsideBorders() {
        return this.mScaleDownInsideBorders;
    }

    public boolean isCircle() {
        return this.mIsCircle;
    }

    public void clearColorFilter() {
        this.mDelegate.clearColorFilter();
    }

    @RequiresApi(api = 19)
    public int getAlpha() {
        return this.mDelegate.getAlpha();
    }

    @Nullable
    @RequiresApi(api = 21)
    public ColorFilter getColorFilter() {
        return this.mDelegate.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.mDelegate.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.mDelegate.getIntrinsicWidth();
    }

    public int getOpacity() {
        return this.mDelegate.getOpacity();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public boolean shouldRound() {
        if (this.mIsCircle || this.mRadiiNonZero || this.mBorderWidth > 0.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void updatePath() {
        float f2;
        if (this.mIsPathDirty) {
            this.mBorderPath.reset();
            this.mRootBounds.inset(this.mBorderWidth / 2.0f, this.mBorderWidth / 2.0f);
            if (this.mIsCircle) {
                this.mBorderPath.addCircle(this.mRootBounds.centerX(), this.mRootBounds.centerY(), Math.min(this.mRootBounds.width(), this.mRootBounds.height()) / 2.0f, Path.Direction.CW);
            } else {
                for (int i = 0; i < this.mBorderRadii.length; i++) {
                    this.mBorderRadii[i] = (this.mCornerRadii[i] + this.mPadding) - (this.mBorderWidth / 2.0f);
                }
                this.mBorderPath.addRoundRect(this.mRootBounds, this.mBorderRadii, Path.Direction.CW);
            }
            this.mRootBounds.inset((-this.mBorderWidth) / 2.0f, (-this.mBorderWidth) / 2.0f);
            this.mPath.reset();
            float f3 = this.mPadding;
            if (this.mScaleDownInsideBorders) {
                f2 = this.mBorderWidth;
            } else {
                f2 = 0.0f;
            }
            float f4 = f3 + f2;
            this.mRootBounds.inset(f4, f4);
            if (this.mIsCircle) {
                this.mPath.addCircle(this.mRootBounds.centerX(), this.mRootBounds.centerY(), Math.min(this.mRootBounds.width(), this.mRootBounds.height()) / 2.0f, Path.Direction.CW);
            } else if (this.mScaleDownInsideBorders) {
                if (this.mInsideBorderRadii == null) {
                    this.mInsideBorderRadii = new float[8];
                }
                for (int i2 = 0; i2 < this.mBorderRadii.length; i2++) {
                    this.mInsideBorderRadii[i2] = this.mCornerRadii[i2] - this.mBorderWidth;
                }
                this.mPath.addRoundRect(this.mRootBounds, this.mInsideBorderRadii, Path.Direction.CW);
            } else {
                this.mPath.addRoundRect(this.mRootBounds, this.mCornerRadii, Path.Direction.CW);
            }
            float f5 = -f4;
            this.mRootBounds.inset(f5, f5);
            this.mPath.setFillType(Path.FillType.WINDING);
            this.mIsPathDirty = false;
        }
    }

    /* access modifiers changed from: protected */
    public void updateTransform() {
        if (this.mTransformCallback != null) {
            this.mTransformCallback.getTransform(this.mParentTransform);
            this.mTransformCallback.getRootBounds(this.mRootBounds);
        } else {
            this.mParentTransform.reset();
            this.mRootBounds.set(getBounds());
        }
        this.mBitmapBounds.set(0.0f, 0.0f, (float) getIntrinsicWidth(), (float) getIntrinsicHeight());
        this.mDrawableBounds.set(this.mDelegate.getBounds());
        this.mBoundsTransform.setRectToRect(this.mBitmapBounds, this.mDrawableBounds, Matrix.ScaleToFit.FILL);
        if (this.mScaleDownInsideBorders) {
            if (this.mInsideBorderBounds == null) {
                this.mInsideBorderBounds = new RectF(this.mRootBounds);
            } else {
                this.mInsideBorderBounds.set(this.mRootBounds);
            }
            this.mInsideBorderBounds.inset(this.mBorderWidth, this.mBorderWidth);
            if (this.mInsideBorderTransform == null) {
                this.mInsideBorderTransform = new Matrix();
            }
            this.mInsideBorderTransform.setRectToRect(this.mRootBounds, this.mInsideBorderBounds, Matrix.ScaleToFit.FILL);
        } else if (this.mInsideBorderTransform != null) {
            this.mInsideBorderTransform.reset();
        }
        if (!this.mParentTransform.equals(this.mPrevParentTransform) || !this.mBoundsTransform.equals(this.mPrevBoundsTransform) || (this.mInsideBorderTransform != null && !this.mInsideBorderTransform.equals(this.mPrevInsideBorderTransform))) {
            this.mIsShaderTransformDirty = true;
            this.mParentTransform.invert(this.mInverseParentTransform);
            this.mTransform.set(this.mParentTransform);
            if (this.mScaleDownInsideBorders) {
                this.mTransform.postConcat(this.mInsideBorderTransform);
            }
            this.mTransform.preConcat(this.mBoundsTransform);
            this.mPrevParentTransform.set(this.mParentTransform);
            this.mPrevBoundsTransform.set(this.mBoundsTransform);
            if (this.mScaleDownInsideBorders) {
                if (this.mPrevInsideBorderTransform == null) {
                    this.mPrevInsideBorderTransform = new Matrix(this.mInsideBorderTransform);
                } else {
                    this.mPrevInsideBorderTransform.set(this.mInsideBorderTransform);
                }
            } else if (this.mPrevInsideBorderTransform != null) {
                this.mPrevInsideBorderTransform.reset();
            }
        }
        if (!this.mRootBounds.equals(this.mPrevRootBounds)) {
            this.mIsPathDirty = true;
            this.mPrevRootBounds.set(this.mRootBounds);
        }
    }

    public void setTransformCallback(@Nullable TransformCallback transformCallback) {
        this.mTransformCallback = transformCallback;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.mDelegate.setBounds(rect);
    }

    public void setAlpha(int i) {
        this.mDelegate.setAlpha(i);
    }

    public void setCircle(boolean z) {
        this.mIsCircle = z;
        this.mIsPathDirty = true;
        invalidateSelf();
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.mDelegate.setColorFilter(colorFilter);
    }

    public void setPadding(float f2) {
        if (this.mPadding != f2) {
            this.mPadding = f2;
            this.mIsPathDirty = true;
            invalidateSelf();
        }
    }

    public void setScaleDownInsideBorders(boolean z) {
        if (this.mScaleDownInsideBorders != z) {
            this.mScaleDownInsideBorders = z;
            this.mIsPathDirty = true;
            invalidateSelf();
        }
    }

    public void draw(@NonNull Canvas canvas) {
        if (b.isTracing()) {
            b.beginSection("RoundedDrawable#draw");
        }
        this.mDelegate.draw(canvas);
        if (b.isTracing()) {
            b.endSection();
        }
    }

    public void setRadius(float f2) {
        boolean z;
        boolean z2 = false;
        if (f2 >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        Arrays.fill(this.mCornerRadii, f2);
        if (f2 != 0.0f) {
            z2 = true;
        }
        this.mRadiiNonZero = z2;
        this.mIsPathDirty = true;
        invalidateSelf();
    }

    public void setRadii(float[] fArr) {
        boolean z;
        boolean z2;
        if (fArr == null) {
            Arrays.fill(this.mCornerRadii, 0.0f);
            this.mRadiiNonZero = false;
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.mCornerRadii, 0, 8);
            this.mRadiiNonZero = false;
            for (int i = 0; i < 8; i++) {
                boolean z3 = this.mRadiiNonZero;
                if (fArr[i] > 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.mRadiiNonZero = z3 | z2;
            }
        }
        this.mIsPathDirty = true;
        invalidateSelf();
    }

    h(Drawable drawable) {
        this.mDelegate = drawable;
    }

    public void setColorFilter(int i, @NonNull PorterDuff.Mode mode) {
        this.mDelegate.setColorFilter(i, mode);
    }

    public void setBorder(int i, float f2) {
        if (this.mBorderColor != i || this.mBorderWidth != f2) {
            this.mBorderColor = i;
            this.mBorderWidth = f2;
            this.mIsPathDirty = true;
            invalidateSelf();
        }
    }
}
