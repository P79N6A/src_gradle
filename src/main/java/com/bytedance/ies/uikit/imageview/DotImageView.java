package com.bytedance.ies.uikit.imageview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.ss.android.ugc.aweme.C0906R;

public class DotImageView extends ImageView {
    private Context mContext;
    private int mCurrentPosition;
    private int mDotRadius;
    private int mMaxNumber;
    private Paint mSelectPaint;
    private int mSelfHeight;
    private int mSpace;
    private Paint mUnSelectPaint;

    private void refreshWidthHeight() {
        this.mSelfHeight = this.mDotRadius * 2;
        setMaxHeight(this.mSelfHeight);
        setMinimumHeight(this.mSelfHeight);
    }

    private void resetSelectPaint() {
        this.mSelectPaint.reset();
        this.mSelectPaint.setAntiAlias(true);
        this.mSelectPaint.setColor(getResources().getColor(C0906R.color.k2));
    }

    private void resetUnSelectPaint() {
        this.mUnSelectPaint.setAntiAlias(true);
        this.mUnSelectPaint.setColor(getResources().getColor(C0906R.color.k3));
    }

    private void init() {
        this.mSpace = (int) UIUtils.dip2Px(this.mContext, 4.0f);
        this.mDotRadius = (int) UIUtils.dip2Px(this.mContext, 4.0f);
        refreshWidthHeight();
        this.mUnSelectPaint = new Paint();
        resetUnSelectPaint();
        this.mSelectPaint = new Paint();
        resetSelectPaint();
        invalidate();
    }

    public DotImageView(Context context) {
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
            int width = ((getWidth() / 2) - ((i3 + (i * this.mSpace)) / 2)) + (((this.mDotRadius * 2) + this.mSpace) * i2) + this.mDotRadius;
            int i4 = this.mDotRadius;
            if (i2 == this.mCurrentPosition) {
                canvas.drawCircle((float) width, (float) i4, (float) this.mDotRadius, this.mSelectPaint);
            } else {
                canvas.drawCircle((float) width, (float) i4, (float) this.mDotRadius, this.mUnSelectPaint);
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

    public DotImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
        init();
    }

    public DotImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        init();
    }
}
