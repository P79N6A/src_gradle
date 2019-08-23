package com.bytedance.ies.uikit.imageview.imagezoom;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.common.utility.Logger;

public class ImageViewTouch extends ImageViewTouchBase {
    protected float mCurrentScaleFactor;
    protected int mDoubleTapDirection;
    protected boolean mDoubleTapEnabled = true;
    public OnImageViewTouchDoubleTapListener mDoubleTapListener;
    protected GestureDetector mGestureDetector;
    protected GestureDetector.OnGestureListener mGestureListener;
    protected View.OnClickListener mListener;
    protected ScaleGestureDetector mScaleDetector;
    protected boolean mScaleEnabled = true;
    protected float mScaleFactor;
    protected ScaleGestureDetector.OnScaleGestureListener mScaleListener;
    protected boolean mScrollEnabled = true;
    protected boolean mSingleMode = true;
    protected int mTouchSlop;

    public class GestureListener extends GestureDetector.SimpleOnGestureListener {
        public GestureListener() {
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (ImageViewTouch.this.isLongClickable() && !ImageViewTouch.this.mScaleDetector.isInProgress()) {
                ImageViewTouch.this.setPressed(true);
                ImageViewTouch.this.performLongClick();
            }
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (ImageViewTouch.this.mListener == null || !ImageViewTouch.this.mSingleMode) {
                return super.onSingleTapConfirmed(motionEvent);
            }
            ImageViewTouch.this.mListener.onClick(ImageViewTouch.this);
            return true;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (ImageViewTouch.this.mDoubleTapEnabled) {
                float min = Math.min(ImageViewTouch.this.getMaxZoom(), Math.max(ImageViewTouch.this.onDoubleTapPost(ImageViewTouch.this.getScale(), ImageViewTouch.this.getMaxZoom()), ImageViewTouch.this.getMinZoom()));
                ImageViewTouch.this.mCurrentScaleFactor = min;
                ImageViewTouch.this.zoomTo(min, motionEvent.getX(), motionEvent.getY(), 200.0f);
                ImageViewTouch.this.invalidate();
            }
            if (ImageViewTouch.this.mDoubleTapListener != null) {
                ImageViewTouch.this.mDoubleTapListener.onDoubleTap();
            }
            return super.onDoubleTap(motionEvent);
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            return ImageViewTouch.this.onFling(motionEvent, motionEvent2, f2, f3);
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            return ImageViewTouch.this.onScroll(motionEvent, motionEvent2, f2, f3);
        }
    }

    public interface OnImageViewTouchDoubleTapListener {
        void onDoubleTap();
    }

    public class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public ScaleListener() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            scaleGestureDetector.getCurrentSpan();
            scaleGestureDetector.getPreviousSpan();
            float scaleFactor = ImageViewTouch.this.mCurrentScaleFactor * scaleGestureDetector.getScaleFactor();
            if (!ImageViewTouch.this.mScaleEnabled) {
                return false;
            }
            float min = Math.min(ImageViewTouch.this.getMaxZoom(), Math.max(scaleFactor, ImageViewTouch.this.getMinZoom() - 0.1f));
            ImageViewTouch.this.zoomTo(min, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            ImageViewTouch.this.mCurrentScaleFactor = Math.min(ImageViewTouch.this.getMaxZoom(), Math.max(min, ImageViewTouch.this.getMinZoom() - 1.0f));
            ImageViewTouch.this.mDoubleTapDirection = 1;
            ImageViewTouch.this.invalidate();
            return true;
        }
    }

    public boolean getDoubleTapEnabled() {
        return this.mDoubleTapEnabled;
    }

    /* access modifiers changed from: protected */
    public GestureDetector.OnGestureListener getGestureListener() {
        return new GestureListener();
    }

    /* access modifiers changed from: protected */
    public ScaleGestureDetector.OnScaleGestureListener getScaleListener() {
        return new ScaleListener();
    }

    /* access modifiers changed from: protected */
    public void init() {
        super.init();
        this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.mGestureListener = getGestureListener();
        this.mScaleListener = getScaleListener();
        this.mScaleDetector = new ScaleGestureDetector(getContext().getApplicationContext(), this.mScaleListener);
        this.mGestureDetector = new GestureDetector(getContext().getApplicationContext(), this.mGestureListener, null, true);
        this.mCurrentScaleFactor = 1.0f;
        this.mDoubleTapDirection = 1;
    }

    public void setDoubleTapEnabled(boolean z) {
        this.mDoubleTapEnabled = z;
    }

    public void setDoubleTapListener(OnImageViewTouchDoubleTapListener onImageViewTouchDoubleTapListener) {
        this.mDoubleTapListener = onImageViewTouchDoubleTapListener;
    }

    public void setMyOnClickListener(View.OnClickListener onClickListener) {
        this.mListener = onClickListener;
    }

    public void setScaleEnabled(boolean z) {
        this.mScaleEnabled = z;
    }

    public void setScrollEnabled(boolean z) {
        this.mScrollEnabled = z;
    }

    /* access modifiers changed from: protected */
    public void onZoom(float f2) {
        super.onZoom(f2);
        if (!this.mScaleDetector.isInProgress()) {
            this.mCurrentScaleFactor = f2;
        }
    }

    /* access modifiers changed from: protected */
    public void onBitmapChanged(Drawable drawable) {
        super.onBitmapChanged(drawable);
        float[] fArr = new float[9];
        this.mSuppMatrix.getValues(fArr);
        this.mCurrentScaleFactor = fArr[0];
    }

    /* access modifiers changed from: protected */
    public void onZoomAnimationCompleted(float f2) {
        super.onZoomAnimationCompleted(f2);
        if (!this.mScaleDetector.isInProgress()) {
            this.mCurrentScaleFactor = f2;
        }
        if (f2 < getMinZoom()) {
            zoomTo(getMinZoom(), 50.0f);
        }
    }

    public boolean canScroll(int i) {
        if (getDrawable() == null) {
            return false;
        }
        RectF bitmapRect = getBitmapRect();
        if (bitmapRect == null) {
            return false;
        }
        updateRect(bitmapRect, this.mScrollRect);
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        if (bitmapRect.right < ((float) rect.right) || i >= 0) {
            if (((double) Math.abs(bitmapRect.left - this.mScrollRect.left)) > 1.0d) {
                return true;
            }
            return false;
        } else if (Math.abs(bitmapRect.right - ((float) rect.right)) > 1.0f) {
            return true;
        } else {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mSingleMode = true;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.mSingleMode = false;
        }
        this.mScaleDetector.onTouchEvent(motionEvent);
        if (!this.mScaleDetector.isInProgress()) {
            this.mGestureDetector.onTouchEvent(motionEvent);
        }
        switch (action) {
            case 0:
                this.mIsAnimationFinished = false;
                break;
            case 1:
                if (getScale() < getMinZoom()) {
                    zoomTo(getMinZoom(), 50.0f);
                    break;
                }
                break;
        }
        return true;
    }

    public ImageViewTouch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public float onDoubleTapPost(float f2, float f3) {
        if (this.mDoubleTapDirection != 1) {
            this.mDoubleTapDirection = 1;
            return 1.0f;
        } else if ((this.mScaleFactor * 2.0f) + f2 <= f3) {
            return f2 + this.mScaleFactor;
        } else {
            this.mDoubleTapDirection = -1;
            return f3;
        }
    }

    /* access modifiers changed from: protected */
    public void _setImageDrawable(Drawable drawable, boolean z, Matrix matrix, float f2) {
        super._setImageDrawable(drawable, z, matrix, f2);
        this.mScaleFactor = getMaxZoom() / 3.0f;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (!this.mScrollEnabled || motionEvent == null || motionEvent2 == null || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || this.mScaleDetector.isInProgress()) {
            return false;
        }
        float scale = getScale();
        Logger.debug();
        if (scale == 1.0f && !this.mFitToWidth) {
            return false;
        }
        scrollBy(-f2, -f3);
        invalidate();
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (!this.mScrollEnabled) {
            return false;
        }
        Logger.debug();
        if (motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || this.mScaleDetector.isInProgress()) {
            return false;
        }
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        if (Math.abs(f2) <= 800.0f && Math.abs(f3) <= 800.0f) {
            return false;
        }
        scrollBy(x / 2.0f, y / 2.0f, 300.0d);
        invalidate();
        return true;
    }
}
