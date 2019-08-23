package com.bytedance.ies.uikit.imageview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;

public class NumberDotImageView extends ImageView {
    private Context mContext;
    private int mCurrentPosition;
    private int mDotRadius;
    private int mMaxNumber;
    private Paint mSelectPaint;
    private int mSelfHeight;
    private int mSpace;
    private Paint mUnSelectPaint;
    private int mUnSelectedDotRadius;

    private void refreshWidthHeight() {
        this.mSelfHeight = (this.mDotRadius * 2) + 4;
        setMaxHeight(this.mSelfHeight);
        setMinimumHeight(this.mSelfHeight);
    }

    private void init() {
        this.mSpace = (int) UIUtils.dip2Px(this.mContext, 5.0f);
        this.mDotRadius = (int) UIUtils.dip2Px(this.mContext, 8.0f);
        this.mUnSelectedDotRadius = (int) UIUtils.dip2Px(this.mContext, 3.0f);
        refreshWidthHeight();
        this.mUnSelectPaint = new Paint();
        this.mUnSelectPaint.setAntiAlias(true);
        this.mUnSelectPaint.setColor(getResources().getColor(17170443));
        this.mUnSelectPaint.setAlpha(125);
        this.mSelectPaint = new Paint();
        this.mSelectPaint.reset();
        this.mSelectPaint.setAntiAlias(true);
        this.mSelectPaint.setColor(getResources().getColor(17170444));
        this.mSelectPaint.setAlpha(255);
        invalidate();
    }

    public NumberDotImageView(Context context) {
        super(context);
        this.mContext = context;
        init();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        for (int i2 = 0; i2 < this.mMaxNumber; i2++) {
            int i3 = this.mMaxNumber * 2 * this.mDotRadius;
            if (this.mMaxNumber - 1 >= 0) {
                i = this.mMaxNumber - 1;
            } else {
                i = 0;
            }
            int i4 = i3 + (i * this.mSpace);
            int width = ((getWidth() / 2) - (i4 / 2)) + (((this.mDotRadius * 2) + this.mSpace) * i2) + this.mDotRadius;
            int i5 = this.mDotRadius + 2;
            if (i2 == this.mCurrentPosition) {
                this.mSelectPaint.reset();
                this.mSelectPaint.setColor(-1);
                this.mSelectPaint.setAlpha(255);
                this.mSelectPaint.setAntiAlias(true);
                this.mSelectPaint.setStyle(Paint.Style.STROKE);
                this.mSelectPaint.setStrokeWidth(2.0f);
                canvas.drawCircle((float) width, (float) i5, (float) this.mDotRadius, this.mSelectPaint);
                this.mSelectPaint.reset();
                this.mSelectPaint.setColor(-1);
                this.mSelectPaint.setAlpha(255);
                this.mSelectPaint.setAntiAlias(true);
                this.mSelectPaint.setTextSize((float) (this.mDotRadius * 2));
                this.mSelectPaint.setTypeface(Typeface.create("宋体", 1));
                canvas.drawText((i2 + 1), (float) (width - (this.mDotRadius / 2)), (float) (i5 + ((this.mDotRadius * 2) / 3)), this.mSelectPaint);
            } else {
                this.mUnSelectPaint.reset();
                this.mUnSelectPaint.setColor(-1);
                this.mUnSelectPaint.setAlpha(200);
                this.mSelectPaint.setAntiAlias(true);
                canvas.drawCircle((float) width, (float) i5, (float) this.mUnSelectedDotRadius, this.mUnSelectPaint);
            }
        }
    }

    public void refresh(int i, int i2) {
        if (i2 < i) {
            this.mMaxNumber = i;
            this.mCurrentPosition = i2;
            refreshWidthHeight();
            invalidate();
        }
    }

    public NumberDotImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
        init();
    }

    public NumberDotImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        init();
    }
}
