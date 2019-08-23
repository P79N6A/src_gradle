package com.bytedance.ies.uikit.imageview.imagezoom;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.ies.uikit.imageview.imagezoom.easing.Cubic;
import com.bytedance.ies.uikit.imageview.imagezoom.easing.Easing;
import com.bytedance.ies.uikit.imageview.imagezoom.graphics.FastBitmapDrawable;
import com.bytedance.ies.uikit.imageview.imagezoom.utils.IDisposable;
import com.ss.android.ugc.bytex.a.a.a;

public class ImageViewTouchBase extends ImageView implements IDisposable {
    protected final int DEFAULT_ANIMATION_DURATION = 200;
    protected final float MAX_ZOOM = 2.5f;
    protected Matrix mBaseMatrix = new Matrix();
    protected RectF mBitmapRect = new RectF();
    protected RectF mCenterRect = new RectF();
    protected final Matrix mDisplayMatrix = new Matrix();
    protected Easing mEasing = new Cubic();
    protected boolean mFitToScreen = false;
    protected boolean mFitToWidth = false;
    protected Handler mHandler = new Handler();
    protected boolean mIsAnimationFinished;
    private OnBitmapChangedListener mListener;
    protected final float[] mMatrixValues = new float[9];
    protected float mMaxZoom;
    protected float mMinZoom = -1.0f;
    protected Runnable mOnLayoutRunnable = null;
    protected RectF mScrollRect = new RectF();
    protected Matrix mSuppMatrix = new Matrix();
    protected int mThisHeight = -1;
    protected int mThisWidth = -1;

    public interface OnBitmapChangedListener {
        void onBitmapChanged(Drawable drawable);
    }

    public float getRotation() {
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public float minZoom() {
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public void onZoom(float f2) {
    }

    /* access modifiers changed from: protected */
    public void onZoomAnimationCompleted(float f2) {
    }

    public void dispose() {
        clear();
    }

    public void clear() {
        setImageBitmap(null, true);
    }

    /* access modifiers changed from: protected */
    public RectF getBitmapRect() {
        return getBitmapRect(this.mSuppMatrix);
    }

    public Matrix getDisplayMatrix() {
        return new Matrix(this.mSuppMatrix);
    }

    public Matrix getImageViewMatrix() {
        return getImageViewMatrix(this.mSuppMatrix);
    }

    public float getScale() {
        return getScale(this.mSuppMatrix);
    }

    /* access modifiers changed from: protected */
    public void init() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public float getMinZoom() {
        if (this.mMinZoom < 0.0f) {
            this.mMinZoom = minZoom();
        }
        return this.mMinZoom;
    }

    public float getMaxZoom() {
        if (this.mMaxZoom < 1.0f) {
            this.mMaxZoom = maxZoom();
        }
        return this.mMaxZoom;
    }

    /* access modifiers changed from: protected */
    public float maxZoom() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return 1.0f;
        }
        return Math.max(((float) drawable.getIntrinsicWidth()) / ((float) this.mThisWidth), ((float) drawable.getIntrinsicHeight()) / ((float) this.mThisHeight)) * 4.0f;
    }

    public void setMinZoom(float f2) {
        this.mMinZoom = f2;
    }

    public void setOnBitmapChangedListener(OnBitmapChangedListener onBitmapChangedListener) {
        this.mListener = onBitmapChangedListener;
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageBitmap(bitmap, true);
    }

    public void setImageDrawable(Drawable drawable) {
        setImageDrawable(drawable, true, null, -1.0f);
    }

    public Matrix getImageViewMatrix(Matrix matrix) {
        this.mDisplayMatrix.set(this.mBaseMatrix);
        this.mDisplayMatrix.postConcat(matrix);
        return this.mDisplayMatrix;
    }

    /* access modifiers changed from: protected */
    public float getScale(Matrix matrix) {
        return getValue(matrix, 0);
    }

    /* access modifiers changed from: protected */
    public void onBitmapChanged(Drawable drawable) {
        if (this.mListener != null) {
            this.mListener.onBitmapChanged(drawable);
        }
    }

    public void setFitToScreen(boolean z) {
        if (z != this.mFitToScreen) {
            this.mFitToScreen = z;
            requestLayout();
        }
    }

    public void setFitToWidth(boolean z) {
        if (z != this.mFitToWidth) {
            this.mFitToWidth = z;
            requestLayout();
        }
    }

    public void setImageResource(int i) {
        setImageDrawable(a.a(getContext().getResources(), i));
    }

    /* access modifiers changed from: protected */
    public void zoomTo(float f2) {
        zoomTo(f2, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
    }

    /* access modifiers changed from: protected */
    public RectF getBitmapRect(Matrix matrix) {
        Drawable drawable = getDrawable();
        Matrix imageViewMatrix = getImageViewMatrix(matrix);
        if (drawable != null) {
            this.mBitmapRect.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        } else {
            this.mBitmapRect.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        imageViewMatrix.mapRect(this.mBitmapRect);
        return this.mBitmapRect;
    }

    public ImageViewTouchBase(Context context) {
        super(context);
        init();
    }

    public void scrollBy(float f2, float f3) {
        panBy((double) f2, (double) f3);
    }

    /* access modifiers changed from: protected */
    public float getValue(Matrix matrix, int i) {
        matrix.getValues(this.mMatrixValues);
        return this.mMatrixValues[i];
    }

    /* access modifiers changed from: protected */
    public void postTranslate(float f2, float f3) {
        this.mSuppMatrix.postTranslate(f2, f3);
        setImageMatrix(getImageViewMatrix());
    }

    public void setImageBitmap(Bitmap bitmap, boolean z) {
        setImageBitmap(bitmap, z, null);
    }

    /* access modifiers changed from: protected */
    public void center(boolean z, boolean z2) {
        if (getDrawable() != null) {
            RectF center = getCenter(this.mSuppMatrix, z, z2);
            if (!(center.left == 0.0f && center.top == 0.0f)) {
                postTranslate(center.left, center.top);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void getProperBaseMatrix2(Drawable drawable, Matrix matrix) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        float intrinsicHeight = (float) drawable.getIntrinsicHeight();
        matrix.reset();
        float min = Math.min(Math.min(width / intrinsicWidth, 2.5f), Math.min(height / intrinsicHeight, 2.5f));
        matrix.postScale(min, min);
        matrix.postTranslate((width - (intrinsicWidth * min)) / 2.0f, (height - (intrinsicHeight * min)) / 2.0f);
    }

    /* access modifiers changed from: protected */
    public void panBy(double d2, double d3) {
        RectF bitmapRect = getBitmapRect();
        this.mScrollRect.set((float) d2, (float) d3, 0.0f, 0.0f);
        updateRect(bitmapRect, this.mScrollRect);
        postTranslate(this.mScrollRect.left, this.mScrollRect.top);
        center(true, true);
    }

    public void zoomTo(float f2, float f3) {
        zoomTo(f2, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, f3);
    }

    /* access modifiers changed from: protected */
    public void getProperBaseMatrix(Drawable drawable, Matrix matrix) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        float intrinsicHeight = (float) drawable.getIntrinsicHeight();
        matrix.reset();
        if (intrinsicWidth > width || intrinsicHeight > height) {
            float min = Math.min(Math.min(width / intrinsicWidth, 2.0f), Math.min(height / intrinsicHeight, 2.0f));
            matrix.postScale(min, min);
            matrix.postTranslate((width - (intrinsicWidth * min)) / 2.0f, (height - (intrinsicHeight * min)) / 2.0f);
            return;
        }
        matrix.postTranslate((width - intrinsicWidth) / 2.0f, (height - intrinsicHeight) / 2.0f);
    }

    /* access modifiers changed from: protected */
    public void updateRect(RectF rectF, RectF rectF2) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        if (rectF.top >= 0.0f && rectF.bottom <= height) {
            rectF2.top = 0.0f;
        }
        if (rectF.left >= 0.0f && rectF.right <= width) {
            rectF2.left = 0.0f;
        }
        if (rectF.top + rectF2.top >= 0.0f && rectF.bottom > height) {
            rectF2.top = (float) ((int) (0.0f - rectF.top));
        }
        float f2 = height - 0.0f;
        if (rectF.bottom + rectF2.top <= f2 && rectF.top < 0.0f) {
            rectF2.top = (float) ((int) (f2 - rectF.bottom));
        }
        if (rectF.left + rectF2.left >= 0.0f) {
            rectF2.left = (float) ((int) (0.0f - rectF.left));
        }
        float f3 = width - 0.0f;
        if (rectF.right + rectF2.left <= f3) {
            rectF2.left = (float) ((int) (f3 - rectF.right));
        }
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    /* access modifiers changed from: protected */
    public void postScale(float f2, float f3, float f4) {
        this.mSuppMatrix.postScale(f2, f2, f3, f4);
        setImageMatrix(getImageViewMatrix());
    }

    /* access modifiers changed from: protected */
    public void scrollBy(float f2, float f3, double d2) {
        final double d3 = (double) f2;
        final double d4 = (double) f3;
        final long currentTimeMillis = System.currentTimeMillis();
        Handler handler = this.mHandler;
        final double d5 = d2;
        AnonymousClass2 r0 = new Runnable() {
            double old_x;
            double old_y;

            public void run() {
                double min = Math.min(d5, (double) (System.currentTimeMillis() - currentTimeMillis));
                double d2 = min;
                double easeOut = ImageViewTouchBase.this.mEasing.easeOut(d2, 0.0d, d3, d5);
                double easeOut2 = ImageViewTouchBase.this.mEasing.easeOut(d2, 0.0d, d4, d5);
                ImageViewTouchBase.this.panBy(easeOut - this.old_x, easeOut2 - this.old_y);
                this.old_x = easeOut;
                this.old_y = easeOut2;
                if (min < d5) {
                    ImageViewTouchBase.this.mHandler.post(this);
                    return;
                }
                RectF center = ImageViewTouchBase.this.getCenter(ImageViewTouchBase.this.mSuppMatrix, true, true);
                if (!(center.left == 0.0f && center.top == 0.0f)) {
                    ImageViewTouchBase.this.scrollBy(center.left, center.top);
                }
            }
        };
        handler.post(r0);
    }

    public void setImageBitmap(Bitmap bitmap, boolean z, Matrix matrix) {
        setImageBitmap(bitmap, z, matrix, -1.0f);
    }

    /* access modifiers changed from: protected */
    public void getProperBaseMatrix3(Drawable drawable, Matrix matrix, float[] fArr) {
        float width = (float) getWidth();
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        matrix.reset();
        float min = Math.min(width / intrinsicWidth, 2.5f);
        matrix.postScale(min, min);
        matrix.postTranslate((width - (intrinsicWidth * min)) / 2.0f, 0.0f);
        if (min > 1.0f) {
            fArr[0] = 1.0f / min;
        } else {
            fArr[0] = 1.0f;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.RectF getCenter(android.graphics.Matrix r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.getDrawable()
            r1 = 0
            if (r0 != 0) goto L_0x000d
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r1, r1, r1, r1)
            return r6
        L_0x000d:
            android.graphics.RectF r0 = r5.mCenterRect
            r0.set(r1, r1, r1, r1)
            android.graphics.RectF r6 = r5.getBitmapRect(r6)
            float r0 = r6.height()
            float r2 = r6.width()
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L_0x004a
            int r8 = r5.getHeight()
            float r8 = (float) r8
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0031
            float r8 = r8 - r0
            float r8 = r8 / r3
            float r0 = r6.top
            float r8 = r8 - r0
            goto L_0x004b
        L_0x0031:
            float r0 = r6.top
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
            float r8 = r6.top
            float r8 = -r8
            goto L_0x004b
        L_0x003b:
            float r0 = r6.bottom
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x004a
            int r8 = r5.getHeight()
            float r8 = (float) r8
            float r0 = r6.bottom
            float r8 = r8 - r0
            goto L_0x004b
        L_0x004a:
            r8 = 0
        L_0x004b:
            if (r7 == 0) goto L_0x0072
            int r7 = r5.getWidth()
            float r7 = (float) r7
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x005d
            float r7 = r7 - r2
            float r7 = r7 / r3
            float r6 = r6.left
            float r6 = r7 - r6
            goto L_0x0073
        L_0x005d:
            float r0 = r6.left
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0067
            float r6 = r6.left
            float r6 = -r6
            goto L_0x0073
        L_0x0067:
            float r0 = r6.right
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0072
            float r6 = r6.right
            float r6 = r7 - r6
            goto L_0x0073
        L_0x0072:
            r6 = 0
        L_0x0073:
            android.graphics.RectF r7 = r5.mCenterRect
            r7.set(r6, r8, r1, r1)
            android.graphics.RectF r6 = r5.mCenterRect
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.uikit.imageview.imagezoom.ImageViewTouchBase.getCenter(android.graphics.Matrix, boolean, boolean):android.graphics.RectF");
    }

    /* access modifiers changed from: protected */
    public void zoomTo(float f2, float f3, float f4) {
        if (f2 > this.mMaxZoom) {
            f2 = this.mMaxZoom;
        }
        postScale(f2 / getScale(), f3, f4);
        onZoom(getScale());
        center(true, true);
    }

    public void setImageDrawable(Drawable drawable, boolean z, Matrix matrix, float f2) {
        if (getWidth() <= 0) {
            final Drawable drawable2 = drawable;
            final boolean z2 = z;
            final Matrix matrix2 = matrix;
            final float f3 = f2;
            AnonymousClass1 r1 = new Runnable() {
                public void run() {
                    ImageViewTouchBase.this.setImageDrawable(drawable2, z2, matrix2, f3);
                }
            };
            this.mOnLayoutRunnable = r1;
            return;
        }
        _setImageDrawable(drawable, z, matrix, f2);
    }

    public void setImageBitmap(Bitmap bitmap, boolean z, Matrix matrix, float f2) {
        if (bitmap != null) {
            setImageDrawable(new FastBitmapDrawable(bitmap), z, matrix, f2);
        } else {
            setImageDrawable(null, z, matrix, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void _setImageDrawable(Drawable drawable, boolean z, Matrix matrix, float f2) {
        if (drawable != null) {
            if (this.mFitToWidth) {
                float[] fArr = new float[1];
                getProperBaseMatrix3(drawable, this.mBaseMatrix, fArr);
                setMinZoom(fArr[0]);
            } else if (this.mFitToScreen) {
                getProperBaseMatrix2(drawable, this.mBaseMatrix);
                setMinZoom(getScale(this.mBaseMatrix));
            } else {
                getProperBaseMatrix(drawable, this.mBaseMatrix);
                setMinZoom(getMinZoom());
            }
            super.setImageDrawable(drawable);
        } else {
            this.mBaseMatrix.reset();
            super.setImageDrawable(null);
        }
        if (z) {
            this.mSuppMatrix.reset();
            if (matrix != null) {
                this.mSuppMatrix = new Matrix(matrix);
            }
        }
        setImageMatrix(getImageViewMatrix());
        if (f2 < 1.0f) {
            this.mMaxZoom = maxZoom();
        } else {
            this.mMaxZoom = f2;
        }
        onBitmapChanged(drawable);
    }

    /* access modifiers changed from: protected */
    public void zoomTo(float f2, float f3, float f4, float f5) {
        if (f2 > getMaxZoom()) {
            f2 = getMaxZoom();
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final float scale = getScale();
        final float f6 = f2 - scale;
        Matrix matrix = new Matrix(this.mSuppMatrix);
        matrix.postScale(f2, f2, f3, f4);
        RectF center = getCenter(matrix, true, true);
        final float f7 = f3 + (center.left * f2);
        final float f8 = f4 + (center.top * f2);
        Handler handler = this.mHandler;
        final float f9 = f5;
        AnonymousClass3 r0 = new Runnable() {
            public void run() {
                float min = Math.min(f9, (float) (System.currentTimeMillis() - currentTimeMillis));
                ImageViewTouchBase.this.zoomTo(scale + ((float) ImageViewTouchBase.this.mEasing.easeInOut((double) min, 0.0d, (double) f6, (double) f9)), f7, f8);
                if (min < f9) {
                    ImageViewTouchBase.this.mHandler.post(this);
                } else if (ImageViewTouchBase.this.mIsAnimationFinished) {
                    ImageViewTouchBase.this.mIsAnimationFinished = false;
                } else {
                    ImageViewTouchBase.this.mIsAnimationFinished = true;
                    ImageViewTouchBase.this.onZoomAnimationCompleted(ImageViewTouchBase.this.getScale());
                    ImageViewTouchBase.this.center(true, true);
                }
            }
        };
        handler.post(r0);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.mThisWidth = i3 - i;
        this.mThisHeight = i4 - i2;
        Runnable runnable = this.mOnLayoutRunnable;
        if (runnable != null) {
            this.mOnLayoutRunnable = null;
            runnable.run();
        }
        if (getDrawable() != null) {
            float f2 = 1.0f;
            if (this.mFitToWidth) {
                float[] fArr = new float[1];
                getProperBaseMatrix3(getDrawable(), this.mBaseMatrix, fArr);
                setMinZoom(fArr[0]);
            } else if (this.mFitToScreen) {
                getProperBaseMatrix2(getDrawable(), this.mBaseMatrix);
                setMinZoom(1.0f);
                f2 = getMinZoom();
            } else {
                getProperBaseMatrix(getDrawable(), this.mBaseMatrix);
                setMinZoom(getMinZoom());
                f2 = getMinZoom();
            }
            setImageMatrix(getImageViewMatrix());
            zoomTo(f2);
        }
    }
}
