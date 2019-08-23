package com.bytedance.ies.uikit.imageview.imagezoom.graphics;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.io.InputStream;

public class FastBitmapDrawable extends Drawable implements IBitmapDrawable {
    protected Bitmap mBitmap;
    protected Paint mPaint;

    public int getOpacity() {
        return -3;
    }

    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    public int getIntrinsicHeight() {
        return this.mBitmap.getHeight();
    }

    public int getIntrinsicWidth() {
        return this.mBitmap.getWidth();
    }

    public int getMinimumHeight() {
        return this.mBitmap.getHeight();
    }

    public int getMinimumWidth() {
        return this.mBitmap.getWidth();
    }

    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(this.mBitmap, 0.0f, 0.0f, this.mPaint);
    }

    public void setAntiAlias(boolean z) {
        this.mPaint.setAntiAlias(z);
        invalidateSelf();
    }

    public FastBitmapDrawable(Bitmap bitmap) {
        this.mBitmap = bitmap;
        this.mPaint = new Paint();
        this.mPaint.setDither(true);
        this.mPaint.setFilterBitmap(true);
    }

    public FastBitmapDrawable(Resources resources, InputStream inputStream) {
        this(BitmapFactory.decodeStream(inputStream));
    }
}
