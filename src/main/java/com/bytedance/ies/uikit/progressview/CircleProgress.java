package com.bytedance.ies.uikit.progressview;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.bytedance.ugc.uikit.R$styleable;
import com.ss.android.ugc.aweme.C0906R;

public class CircleProgress extends View {
    private int[] COLORS;
    private final double DEGREE = 0.017453292519943295d;
    private ArcPoint[] mArcPoint;
    private Point mCenter = new Point();
    private long mDuration = 3600;
    private TimeInterpolator mInterpolator = new EaseInOutCubicInterpolator();
    private Paint mPaint;
    private long mPlayTime;
    private int mPointRadius;
    private boolean mStartAnim = false;
    private long mStartTime;
    private int mViewSize;

    static class ArcPoint {
        int color;
        float x;
        float y;

        ArcPoint(float f2, float f3, int i) {
            this.x = f2;
            this.y = f3;
            this.color = i;
        }
    }

    static class EaseInOutCubicInterpolator implements TimeInterpolator {
        public float getInterpolation(float f2) {
            float f3 = f2 * 2.0f;
            if (f3 < 1.0f) {
                return 0.5f * f3 * f3 * f3;
            }
            float f4 = f3 - 2.0f;
            return (0.5f * f4 * f4 * f4) + 1.0f;
        }

        EaseInOutCubicInterpolator() {
        }
    }

    public void stopAnim() {
        this.mStartAnim = false;
    }

    public void reset() {
        stopAnim();
        this.mPlayTime = 0;
        postInvalidate();
    }

    private float getFactor() {
        if (this.mStartAnim) {
            this.mPlayTime = AnimationUtils.currentAnimationTimeMillis() - this.mStartTime;
        }
        return (((float) this.mPlayTime) / ((float) this.mDuration)) % 5.0f;
    }

    public void startAnim() {
        this.mPlayTime %= this.mDuration;
        this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
        this.mStartAnim = true;
        postInvalidate();
    }

    public void setDuration(long j) {
        this.mDuration = j;
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
    }

    public void setRadius(float f2) {
        stopAnim();
        calPoints(f2);
        startAnim();
    }

    public CircleProgress(Context context) {
        super(context);
        init(null, 0);
    }

    private void calPoints(float f2) {
        int i = (int) (((float) (this.mViewSize / 3)) * f2);
        this.mPointRadius = i / 6;
        for (int i2 = 0; i2 < 8; i2++) {
            float f3 = (float) i;
            double d2 = (double) i2;
            Double.isNaN(d2);
            double d3 = d2 * 0.7853981633974483d;
            this.mArcPoint[i2] = new ArcPoint((-((float) Math.sin(d3))) * f3, f3 * (-((float) Math.cos(d3))), this.COLORS[i2 % 3]);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate((float) this.mCenter.x, (float) this.mCenter.y);
        float factor = getFactor();
        canvas.rotate(36.0f * factor);
        for (int i = 0; i < 8; i++) {
            this.mPaint.setColor(this.mArcPoint[i].color);
            float itemFactor = getItemFactor(i, factor);
            canvas.drawCircle(this.mArcPoint[i].x - ((this.mArcPoint[i].x * 2.0f) * itemFactor), this.mArcPoint[i].y - ((this.mArcPoint[i].y * 2.0f) * itemFactor), (float) this.mPointRadius, this.mPaint);
        }
        canvas.restore();
        if (this.mStartAnim) {
            postInvalidate();
        }
    }

    private float getItemFactor(int i, float f2) {
        float f3 = (f2 - (((float) i) * 0.0825f)) * 3.0f;
        float f4 = 1.0f;
        if (f3 < 0.0f) {
            f4 = 0.0f;
        } else if (f3 <= 1.0f) {
            f4 = f3;
        }
        return this.mInterpolator.getInterpolation(f4);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0906R.dimen.dc);
        this.mViewSize = Math.min(getDefaultSize(dimensionPixelSize, i), getDefaultSize(dimensionPixelSize, i2));
        setMeasuredDimension(this.mViewSize, this.mViewSize);
        this.mCenter.set(this.mViewSize / 2, this.mViewSize / 2);
        calPoints(1.0f);
    }

    public CircleProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, 0);
    }

    private void init(AttributeSet attributeSet, int i) {
        this.mArcPoint = new ArcPoint[8];
        this.mPaint = new Paint();
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStyle(Paint.Style.FILL);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CircleProgress, i, 0);
        int color = obtainStyledAttributes.getColor(0, -1759188);
        int color2 = obtainStyledAttributes.getColor(1, -14708582);
        int color3 = obtainStyledAttributes.getColor(2, -221678);
        obtainStyledAttributes.recycle();
        this.COLORS = new int[]{color, color2, color3};
    }

    public CircleProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i);
    }
}
