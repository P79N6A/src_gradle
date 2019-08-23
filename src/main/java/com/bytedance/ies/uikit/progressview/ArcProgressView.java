package com.bytedance.ies.uikit.progressview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ugc.uikit.R$styleable;
import com.ss.android.ugc.aweme.C0906R;

public class ArcProgressView extends View {
    private int mBackgroud;
    private RectF mBigOval;
    private Paint mPaint;
    private int mProgress;
    private int mRadius;
    private int mSweepingColor;
    private Paint mSweepingPaint;

    private void init() {
        this.mPaint = new Paint();
        this.mPaint.setColor(this.mBackgroud);
        this.mPaint.setAntiAlias(true);
        this.mSweepingPaint = new Paint();
        this.mSweepingPaint.setColor(this.mSweepingColor);
        this.mPaint.setAntiAlias(true);
        this.mBigOval = new RectF();
    }

    public void setProgress(int i) {
        if (i >= 0 && i <= 100) {
            this.mProgress = i;
            invalidate();
        }
    }

    public ArcProgressView(Context context) {
        super(context);
        this.mRadius = 50;
        Resources resources = context.getResources();
        this.mBackgroud = resources.getColor(C0906R.color.b0);
        this.mSweepingColor = resources.getColor(C0906R.color.b1);
        this.mRadius = resources.getDimensionPixelSize(C0906R.dimen.c7);
        if (this.mRadius < 50) {
            this.mRadius = 50;
        }
        init();
    }

    private int measureHeight(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (this.mRadius * 2) + getPaddingTop() + getPaddingBottom();
        if (mode == Integer.MIN_VALUE) {
            return Math.min(paddingTop, size);
        }
        return paddingTop;
    }

    private int measureWidth(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (this.mRadius * 2) + getPaddingTop() + getPaddingBottom();
        if (mode == Integer.MIN_VALUE) {
            return Math.min(paddingTop, size);
        }
        return paddingTop;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) this.mRadius, this.mPaint);
        double d2 = (double) this.mProgress;
        Double.isNaN(d2);
        int width = (getWidth() - (this.mRadius * 2)) / 2;
        int height = (getHeight() - (this.mRadius * 2)) / 2;
        this.mBigOval.set((float) width, (float) height, (float) (width + (this.mRadius * 2)), (float) (height + (this.mRadius * 2)));
        int i = ((int) ((d2 / 100.0d) * 360.0d)) + 0;
        if (i > 360) {
            i -= 360;
        }
        canvas.drawArc(this.mBigOval, 0.0f, (float) i, true, this.mSweepingPaint);
    }

    public ArcProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(measureWidth(i), measureHeight(i2));
    }

    public ArcProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRadius = 50;
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ArcProgressView, i, 0);
        this.mBackgroud = obtainStyledAttributes.getColor(0, resources.getColor(C0906R.color.b0));
        this.mSweepingColor = obtainStyledAttributes.getColor(2, resources.getColor(C0906R.color.b1));
        this.mRadius = obtainStyledAttributes.getDimensionPixelSize(1, resources.getDimensionPixelSize(C0906R.dimen.c7));
        if (this.mRadius < 50) {
            this.mRadius = 50;
        }
        obtainStyledAttributes.recycle();
        init();
    }
}
