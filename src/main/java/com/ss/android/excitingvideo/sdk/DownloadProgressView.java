package com.ss.android.excitingvideo.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.TextView;
import com.ss.android.excitingvideo.utils.UIUtils;
import com.ss.android.ugc.bytex.a.a.a;

public class DownloadProgressView extends TextView {
    private float mAnimationProgress;
    int mDownloadingBackground;
    int mDownloadingTextColor;
    int mFinishBackground;
    int mFinishTextColor;
    private Bitmap mFlashBitmap;
    int mIdleBackground;
    int mIdleTextColor;
    private boolean mIsAnimating;
    private volatile float mProgress;
    private int mRadius;
    int mReachedColor;
    private Paint mReachedPaint;
    private Path mReachedPath = new Path();
    private RectF mRectF = new RectF();
    private Path mRoundedRectPath = new Path();
    private volatile Status mStatus = Status.IDLE;
    int mUnreachedColor;
    private Paint mUnreachedPaint;
    private Path mUnreachedPath = new Path();

    public enum Status {
        IDLE,
        DOWNLOADING,
        FINISH
    }

    public float getProgress() {
        return this.mProgress;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    private void recycleBitmap() {
        if (this.mFlashBitmap != null && !this.mFlashBitmap.isRecycled()) {
            this.mFlashBitmap.recycle();
        }
        this.mFlashBitmap = null;
    }

    private void safeInvalidate() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    public void refreshTheme() {
        Drawable drawable;
        this.mReachedPaint.setColor(this.mReachedColor);
        this.mUnreachedPaint.setColor(this.mUnreachedColor);
        switch (this.mStatus) {
            case IDLE:
                setBackgroundDrawable(a.a(getResources(), this.mIdleBackground));
                setTextColor(this.mIdleTextColor);
                break;
            case DOWNLOADING:
                if (this.mDownloadingBackground != 0) {
                    drawable = a.a(getResources(), this.mDownloadingBackground);
                } else {
                    drawable = null;
                }
                setBackgroundDrawable(drawable);
                setTextColor(this.mDownloadingTextColor);
                break;
            case FINISH:
                setBackgroundDrawable(a.a(getResources(), this.mFinishBackground));
                setTextColor(this.mFinishTextColor);
                break;
        }
        invalidate();
    }

    public void setRadius(int i) {
        this.mRadius = i;
        safeInvalidate();
    }

    public void setReachedColor(int i) {
        this.mReachedColor = i;
        this.mReachedPaint.setColor(i);
    }

    public void setUnreachedColor(int i) {
        this.mUnreachedColor = i;
        this.mUnreachedPaint.setColor(i);
    }

    public void setDownloadingTextColor(int i) {
        this.mDownloadingTextColor = i;
        if (this.mStatus == Status.DOWNLOADING) {
            setTextColor(i);
        }
    }

    public void setFinishTextColor(int i) {
        this.mFinishTextColor = i;
        if (this.mStatus == Status.FINISH) {
            setTextColor(i);
        }
    }

    public void setIdleTextColor(int i) {
        this.mIdleTextColor = i;
        if (this.mStatus == Status.IDLE) {
            setTextColor(i);
        }
    }

    public void setProgressFloat(float f2) {
        if (this.mStatus == Status.DOWNLOADING) {
            this.mProgress = f2;
            safeInvalidate();
        }
    }

    public void setProgressInt(int i) {
        if (this.mStatus == Status.DOWNLOADING) {
            this.mProgress = ((float) i) / 100.0f;
            safeInvalidate();
        }
    }

    public void setFinishBackroundRes(int i) {
        this.mFinishBackground = i;
        if (this.mStatus == Status.FINISH) {
            setBackgroundDrawable(a.a(getResources(), i));
        }
    }

    public void setIdleBackroundRes(int i) {
        this.mIdleBackground = i;
        if (this.mStatus == Status.IDLE) {
            setBackgroundDrawable(a.a(getResources(), i));
        }
    }

    public DownloadProgressView(Context context) {
        super(context, null, 16843563);
        init(context);
    }

    private void init(Context context) {
        this.mIdleBackground = 2130838663;
        this.mFinishBackground = 2130838663;
        this.mReachedColor = Color.parseColor("#fe2c55");
        this.mUnreachedColor = Color.parseColor("#26161823");
        this.mIdleTextColor = Color.parseColor("#ffffffff");
        this.mDownloadingTextColor = Color.parseColor("#ffffffff");
        this.mFinishTextColor = Color.parseColor("#ffffffff");
        this.mRadius = (int) UIUtils.dip2Px(context, 4.0f);
        setMaxLines(1);
        setGravity(17);
        setTextColor(this.mIdleTextColor);
        setBackgroundDrawable(a.a(getResources(), this.mIdleBackground));
        this.mReachedPaint = new Paint(5);
        this.mReachedPaint.setColor(this.mReachedColor);
        this.mReachedPaint.setStyle(Paint.Style.FILL);
        this.mUnreachedPaint = new Paint(5);
        this.mUnreachedPaint.setColor(this.mUnreachedColor);
        this.mUnreachedPaint.setStyle(Paint.Style.FILL);
    }

    public void setStatus(Status status) {
        Drawable drawable;
        switch (status) {
            case IDLE:
                setBackgroundDrawable(a.a(getResources(), this.mIdleBackground));
                setTextColor(this.mIdleTextColor);
                this.mProgress = 0.0f;
                break;
            case DOWNLOADING:
                if (this.mDownloadingBackground != 0) {
                    drawable = a.a(getResources(), this.mDownloadingBackground);
                } else {
                    drawable = null;
                }
                setBackgroundDrawable(drawable);
                setTextColor(this.mDownloadingTextColor);
                if (this.mStatus != Status.DOWNLOADING) {
                    this.mProgress = 0.0f;
                    break;
                }
                break;
            case FINISH:
                setBackgroundDrawable(a.a(getResources(), this.mFinishBackground));
                setTextColor(this.mFinishTextColor);
                this.mProgress = 1.0f;
                break;
        }
        this.mStatus = status;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.mStatus == Status.DOWNLOADING) {
            int width = (int) (((float) getWidth()) * this.mProgress);
            this.mUnreachedPath.reset();
            this.mReachedPath.reset();
            if (width >= this.mRadius && width <= getWidth() - this.mRadius) {
                float f2 = (float) width;
                this.mReachedPath.moveTo(f2, (float) getHeight());
                this.mReachedPath.lineTo((float) this.mRadius, (float) getHeight());
                this.mRectF.set(0.0f, (float) (getHeight() - (this.mRadius * 2)), (float) (this.mRadius * 2), (float) getHeight());
                this.mReachedPath.arcTo(this.mRectF, 90.0f, 90.0f, false);
                this.mReachedPath.lineTo(0.0f, (float) this.mRadius);
                this.mRectF.set(0.0f, 0.0f, (float) (this.mRadius * 2), (float) (this.mRadius * 2));
                this.mReachedPath.arcTo(this.mRectF, 180.0f, 90.0f, false);
                this.mReachedPath.lineTo(f2, 0.0f);
                this.mUnreachedPath.moveTo(f2, 0.0f);
                this.mUnreachedPath.lineTo((float) (getWidth() - this.mRadius), 0.0f);
                this.mRectF.set((float) (getWidth() - (this.mRadius * 2)), 0.0f, (float) getWidth(), (float) (this.mRadius * 2));
                this.mUnreachedPath.arcTo(this.mRectF, 270.0f, 90.0f, false);
                this.mUnreachedPath.lineTo((float) getWidth(), (float) (getHeight() - this.mRadius));
                this.mRectF.set((float) (getWidth() - (this.mRadius * 2)), (float) (getHeight() - (this.mRadius * 2)), (float) getWidth(), (float) getHeight());
                this.mUnreachedPath.arcTo(this.mRectF, 0.0f, 90.0f, false);
                this.mUnreachedPath.lineTo(f2, (float) getHeight());
            } else if (width < this.mRadius) {
                float acos = (float) ((Math.acos((double) (((float) (this.mRadius - width)) / ((float) this.mRadius))) * 180.0d) / 3.141592653589793d);
                this.mRectF.set(0.0f, (float) (getHeight() - (this.mRadius * 2)), (float) (this.mRadius * 2), (float) getHeight());
                this.mReachedPath.addArc(this.mRectF, 180.0f - acos, acos);
                this.mReachedPath.lineTo(0.0f, (float) this.mRadius);
                this.mRectF.set(0.0f, 0.0f, (float) (this.mRadius * 2), (float) (this.mRadius * 2));
                this.mReachedPath.arcTo(this.mRectF, 180.0f, acos, false);
                this.mRectF.set(0.0f, 0.0f, (float) (this.mRadius * 2), (float) (this.mRadius * 2));
                float f3 = 180.0f + acos;
                float f4 = 90.0f - acos;
                this.mUnreachedPath.addArc(this.mRectF, f3, f4);
                this.mUnreachedPath.lineTo((float) (getWidth() - this.mRadius), 0.0f);
                this.mRectF.set((float) (getWidth() - (this.mRadius * 2)), 0.0f, (float) getWidth(), (float) (this.mRadius * 2));
                this.mUnreachedPath.arcTo(this.mRectF, 270.0f, 90.0f, false);
                this.mUnreachedPath.lineTo((float) getWidth(), (float) (getHeight() - this.mRadius));
                this.mRectF.set((float) (getWidth() - (this.mRadius * 2)), (float) (getHeight() - (this.mRadius * 2)), (float) getWidth(), (float) getHeight());
                this.mUnreachedPath.arcTo(this.mRectF, 0.0f, 90.0f, false);
                this.mUnreachedPath.lineTo((float) this.mRadius, (float) getHeight());
                this.mRectF.set(0.0f, (float) (getHeight() - (this.mRadius * 2)), (float) (this.mRadius * 2), (float) getHeight());
                this.mUnreachedPath.arcTo(this.mRectF, 90.0f, f4, false);
            } else if (width > getWidth() - this.mRadius) {
                float acos2 = (float) ((Math.acos((double) (((float) ((this.mRadius + width) - getWidth())) / ((float) this.mRadius))) * 180.0d) / 3.141592653589793d);
                this.mRectF.set((float) (getWidth() - (this.mRadius * 2)), (float) (getHeight() - (this.mRadius * 2)), (float) getWidth(), (float) getHeight());
                float f5 = 90.0f - acos2;
                this.mReachedPath.addArc(this.mRectF, acos2, f5);
                this.mReachedPath.lineTo((float) this.mRadius, (float) getHeight());
                this.mRectF.set(0.0f, (float) (getHeight() - (this.mRadius * 2)), (float) (this.mRadius * 2), (float) getHeight());
                this.mReachedPath.arcTo(this.mRectF, 90.0f, 90.0f, false);
                this.mReachedPath.lineTo(0.0f, (float) this.mRadius);
                this.mRectF.set(0.0f, 0.0f, (float) (this.mRadius * 2), (float) (this.mRadius * 2));
                this.mReachedPath.arcTo(this.mRectF, 180.0f, 90.0f, false);
                this.mReachedPath.lineTo((float) (getWidth() - this.mRadius), 0.0f);
                this.mRectF.set((float) (getWidth() - (this.mRadius * 2)), 0.0f, (float) getWidth(), (float) (this.mRadius * 2));
                this.mReachedPath.arcTo(this.mRectF, -90.0f, f5, false);
                this.mRectF.set((float) (getWidth() - (this.mRadius * 2)), 0.0f, (float) getWidth(), (float) (this.mRadius * 2));
                this.mUnreachedPath.addArc(this.mRectF, -acos2, acos2);
                this.mUnreachedPath.lineTo((float) getWidth(), (float) (getHeight() - this.mRadius));
                this.mRectF.set((float) (getWidth() - (this.mRadius * 2)), (float) (getHeight() - (this.mRadius * 2)), (float) getWidth(), (float) getHeight());
                this.mUnreachedPath.arcTo(this.mRectF, 0.0f, acos2, false);
            }
            canvas.drawPath(this.mUnreachedPath, this.mUnreachedPaint);
            canvas.drawPath(this.mReachedPath, this.mReachedPaint);
        }
        super.onDraw(canvas);
        if (this.mFlashBitmap != null) {
            canvas.save();
            canvas.clipPath(this.mRoundedRectPath);
            float height = ((float) getHeight()) / ((float) this.mFlashBitmap.getHeight());
            canvas.scale(height, height);
            canvas.drawBitmap(this.mFlashBitmap, (((float) (-this.mFlashBitmap.getWidth())) + (this.mAnimationProgress * ((float) (getWidth() + this.mFlashBitmap.getWidth())))) / height, 0.0f, null);
            canvas.restore();
        }
    }

    public DownloadProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != 0 && i2 != 0) {
            this.mRoundedRectPath.reset();
            this.mRectF.set(0.0f, 0.0f, (float) i, (float) i2);
            this.mRoundedRectPath.addRoundRect(this.mRectF, (float) this.mRadius, (float) this.mRadius, Path.Direction.CW);
        }
    }
}
