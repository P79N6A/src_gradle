package com.bytedance.ies.uikit.imageview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ImageView;

public class RotateImageView extends ImageView {
    private int mBitmapHeight;
    private int mBitmapWidth;
    private int mDegree;
    private Bitmap mOriginBitmap;
    private float mScale;
    private int mViewHeight;
    private int mViewWidth;

    public float getScale() {
        float f2;
        int i = this.mBitmapWidth;
        int i2 = this.mBitmapHeight;
        if (this.mDegree == 90 || this.mDegree == 270) {
            i = this.mBitmapHeight;
            i2 = this.mBitmapWidth;
        }
        float f3 = 1.0f;
        if (i > this.mViewWidth) {
            f2 = (((float) this.mViewWidth) * 1.0f) / ((float) i);
        } else {
            f2 = 1.0f;
        }
        if (i2 > this.mViewHeight) {
            f3 = (((float) this.mViewHeight) * 1.0f) / ((float) i2);
        }
        if (f2 > f3) {
            return f3;
        }
        return f2;
    }

    private void onRotateBitmap() {
        if (this.mViewWidth * this.mViewHeight * this.mBitmapHeight * this.mBitmapWidth != 0) {
            Matrix matrix = new Matrix();
            this.mScale = getScale();
            matrix.postScale(this.mScale, this.mScale);
            matrix.postTranslate(((float) (this.mViewWidth - ((int) (((float) this.mBitmapWidth) * this.mScale)))) / 2.0f, ((float) (this.mViewHeight - ((int) (((float) this.mBitmapHeight) * this.mScale)))) / 2.0f);
            matrix.postRotate((float) this.mDegree, (float) (this.mViewWidth / 2), (float) (this.mViewHeight / 2));
            setImageMatrix(matrix);
        }
    }

    public Bitmap getCurrentRotateBitmap() {
        Matrix matrix = new Matrix();
        this.mScale = getScale();
        matrix.postScale(this.mScale, this.mScale);
        matrix.postTranslate(((float) (this.mViewWidth - ((int) (((float) this.mBitmapWidth) * this.mScale)))) / 2.0f, ((float) (this.mViewHeight - ((int) (((float) this.mBitmapHeight) * this.mScale)))) / 2.0f);
        matrix.postRotate((float) this.mDegree, (float) (this.mViewWidth / 2), (float) (this.mViewHeight / 2));
        return Bitmap.createBitmap(this.mOriginBitmap, 0, 0, this.mOriginBitmap.getWidth(), this.mOriginBitmap.getHeight(), matrix, true);
    }

    public Rect getRotateImageRect() {
        Rect rect = new Rect();
        this.mScale = getScale();
        int i = (int) (((float) this.mBitmapWidth) * this.mScale);
        int i2 = (int) (((float) this.mBitmapHeight) * this.mScale);
        if (this.mDegree == 90 || this.mDegree == 270) {
            i = (int) (((float) this.mBitmapHeight) * this.mScale);
            i2 = (int) (((float) this.mBitmapWidth) * this.mScale);
        }
        rect.left = (this.mViewWidth - i) / 2;
        rect.top = (this.mViewHeight - i2) / 2;
        rect.right = (this.mViewWidth + i) / 2;
        rect.bottom = (this.mViewHeight + i2) / 2;
        return rect;
    }

    public void rotateBitmap(int i) {
        this.mDegree = i;
        onRotateBitmap();
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (bitmap != null) {
            this.mBitmapWidth = bitmap.getWidth();
            this.mBitmapHeight = bitmap.getHeight();
        }
        this.mOriginBitmap = bitmap;
    }

    public RotateImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.mViewWidth = i3 - i;
        this.mViewHeight = i4 - i2;
        onRotateBitmap();
    }
}
