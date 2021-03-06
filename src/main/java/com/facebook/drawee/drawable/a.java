package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.Preconditions;
import javax.annotation.Nullable;

public class a extends Drawable implements Drawable.Callback, TransformAwareDrawable, TransformCallback {
    private final DrawableParent[] mDrawableParents;
    private final d mDrawableProperties = new d();
    private boolean mIsMutated;
    private boolean mIsStateful;
    private boolean mIsStatefulCalculated;
    private final Drawable[] mLayers;
    private final Rect mTmpRect = new Rect();
    private TransformCallback mTransformCallback;

    public int getNumberOfLayers() {
        return this.mLayers.length;
    }

    public int getIntrinsicHeight() {
        int i = -1;
        for (Drawable drawable : this.mLayers) {
            if (drawable != null) {
                i = Math.max(i, drawable.getIntrinsicHeight());
            }
        }
        if (i > 0) {
            return i;
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        int i = -1;
        for (Drawable drawable : this.mLayers) {
            if (drawable != null) {
                i = Math.max(i, drawable.getIntrinsicWidth());
            }
        }
        if (i > 0) {
            return i;
        }
        return -1;
    }

    public int getOpacity() {
        if (this.mLayers.length == 0) {
            return -2;
        }
        int i = -1;
        for (int i2 = 1; i2 < this.mLayers.length; i2++) {
            Drawable drawable = this.mLayers[i2];
            if (drawable != null) {
                i = Drawable.resolveOpacity(i, drawable.getOpacity());
            }
        }
        return i;
    }

    public Drawable mutate() {
        for (Drawable drawable : this.mLayers) {
            if (drawable != null) {
                drawable.mutate();
            }
        }
        this.mIsMutated = true;
        return this;
    }

    public boolean isStateful() {
        if (!this.mIsStatefulCalculated) {
            this.mIsStateful = false;
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= this.mLayers.length) {
                    break;
                }
                Drawable drawable = this.mLayers[i];
                boolean z2 = this.mIsStateful;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.mIsStateful = z2 | z;
                i++;
            }
            this.mIsStatefulCalculated = true;
        }
        return this.mIsStateful;
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void setTransformCallback(TransformCallback transformCallback) {
        this.mTransformCallback = transformCallback;
    }

    private DrawableParent createDrawableParentForIndex(final int i) {
        return new DrawableParent() {
            public final Drawable getDrawable() {
                return a.this.getDrawable(i);
            }

            public final Drawable setDrawable(Drawable drawable) {
                return a.this.setDrawable(i, drawable);
            }
        };
    }

    public void getTransform(Matrix matrix) {
        if (this.mTransformCallback != null) {
            this.mTransformCallback.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }

    public void draw(Canvas canvas) {
        for (Drawable drawable : this.mLayers) {
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
    }

    @Nullable
    public Drawable getDrawable(int i) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (i < this.mLayers.length) {
            z2 = true;
        }
        Preconditions.checkArgument(z2);
        return this.mLayers[i];
    }

    public void getRootBounds(RectF rectF) {
        if (this.mTransformCallback != null) {
            this.mTransformCallback.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        for (Drawable drawable : this.mLayers) {
            if (drawable != null) {
                drawable.setBounds(rect);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean z = false;
        for (Drawable drawable : this.mLayers) {
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z = false;
        for (Drawable drawable : this.mLayers) {
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
        }
        return z;
    }

    public void setAlpha(int i) {
        this.mDrawableProperties.f23719a = i;
        for (Drawable drawable : this.mLayers) {
            if (drawable != null) {
                drawable.setAlpha(i);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mDrawableProperties.a(colorFilter);
        for (Drawable drawable : this.mLayers) {
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        this.mDrawableProperties.a(z);
        for (Drawable drawable : this.mLayers) {
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setFilterBitmap(boolean z) {
        this.mDrawableProperties.b(z);
        for (Drawable drawable : this.mLayers) {
            if (drawable != null) {
                drawable.setFilterBitmap(z);
            }
        }
    }

    public a(Drawable[] drawableArr) {
        this.mIsStateful = false;
        this.mIsStatefulCalculated = false;
        this.mIsMutated = false;
        Preconditions.checkNotNull(drawableArr);
        this.mLayers = drawableArr;
        for (Drawable callbacks : this.mLayers) {
            DrawableUtils.setCallbacks(callbacks, this, this);
        }
        this.mDrawableParents = new DrawableParent[this.mLayers.length];
    }

    public DrawableParent getDrawableParentForIndex(int i) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (i < this.mDrawableParents.length) {
            z2 = true;
        }
        Preconditions.checkArgument(z2);
        if (this.mDrawableParents[i] == null) {
            this.mDrawableParents[i] = createDrawableParentForIndex(i);
        }
        return this.mDrawableParents[i];
    }

    public boolean getPadding(Rect rect) {
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.mTmpRect;
        for (Drawable drawable : this.mLayers) {
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
        }
        return true;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @TargetApi(21)
    public void setHotspot(float f2, float f3) {
        for (Drawable drawable : this.mLayers) {
            if (drawable != null) {
                drawable.setHotspot(f2, f3);
            }
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        for (Drawable drawable : this.mLayers) {
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
        }
        return visible;
    }

    @Nullable
    public Drawable setDrawable(int i, @Nullable Drawable drawable) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (i >= this.mLayers.length) {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        Drawable drawable2 = this.mLayers[i];
        if (drawable != drawable2) {
            if (drawable != null && this.mIsMutated) {
                drawable.mutate();
            }
            DrawableUtils.setCallbacks(this.mLayers[i], null, null);
            DrawableUtils.setCallbacks(drawable, null, null);
            DrawableUtils.setDrawableProperties(drawable, this.mDrawableProperties);
            DrawableUtils.copyProperties(drawable, this);
            DrawableUtils.setCallbacks(drawable, this, this);
            this.mIsStatefulCalculated = false;
            this.mLayers[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
