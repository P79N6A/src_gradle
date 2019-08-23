package com.bytedance.ies.uikit.imageview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ugc.uikit.R$styleable;
import com.ss.android.ugc.aweme.C0906R;

public class DotIndicator extends ImageView {
    protected Context mContext;
    protected int mCurrentPosition;
    private int mDotRadius;
    protected int mMaxNumber;
    protected int mSelectedColor;
    protected Paint mSelectedPaint;
    private int mSelfHeight;
    private int mSelfWidth;
    private int mSpace;
    protected int mUnSelectedColor;
    protected Paint mUnSelectedPaint;

    /* access modifiers changed from: protected */
    public void init() {
        refreshWidthHeight();
        this.mUnSelectedPaint = new Paint();
        this.mUnSelectedPaint.setAntiAlias(true);
        this.mUnSelectedPaint.setColor(this.mUnSelectedColor);
        this.mSelectedPaint = new Paint();
        this.mSelectedPaint.setAntiAlias(true);
        this.mSelectedPaint.setColor(this.mSelectedColor);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void refreshWidthHeight() {
        int i;
        this.mSelfHeight = this.mDotRadius * 2;
        int i2 = this.mMaxNumber * 2 * this.mDotRadius;
        if (this.mMaxNumber - 1 >= 0) {
            i = this.mMaxNumber - 1;
        } else {
            i = 0;
        }
        this.mSelfWidth = i2 + (i * this.mSpace);
        setMaxHeight(this.mSelfHeight);
        setMinimumHeight(this.mSelfHeight);
        setMinimumWidth(this.mSelfWidth);
    }

    public void setDotRadius(int i) {
        this.mDotRadius = i;
    }

    public void setSpace(int i) {
        this.mSpace = i;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawIndicator(canvas);
    }

    public DotIndicator(Context context) {
        super(context);
        this.mContext = context;
        init();
    }

    public void setCurrentPosition(int i) {
        if (i < this.mMaxNumber) {
            this.mCurrentPosition = i;
            invalidate();
        }
    }

    public void setSelectedColor(int i) {
        this.mSelectedColor = i;
        this.mSelectedPaint.setColor(this.mSelectedColor);
    }

    public void setUnSelectedColor(int i) {
        this.mUnSelectedColor = i;
        this.mUnSelectedPaint.setColor(this.mUnSelectedColor);
    }

    /* access modifiers changed from: protected */
    public void drawIndicator(Canvas canvas) {
        int i;
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
                canvas.drawCircle((float) width, (float) i4, (float) this.mDotRadius, this.mSelectedPaint);
            } else {
                canvas.drawCircle((float) width, (float) i4, (float) this.mDotRadius, this.mUnSelectedPaint);
            }
        }
    }

    public DotIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void refresh(int i, int i2) {
        if (i2 < i) {
            this.mMaxNumber = i;
            this.mCurrentPosition = i2;
            refreshWidthHeight();
            invalidate();
        }
    }

    public DotIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.DotIndicator, i, 0);
        this.mSelectedColor = obtainStyledAttributes.getColor(2, resources.getColor(C0906R.color.k2));
        this.mUnSelectedColor = obtainStyledAttributes.getColor(4, resources.getColor(C0906R.color.k3));
        this.mSpace = obtainStyledAttributes.getDimensionPixelSize(3, (int) UIUtils.dip2Px(this.mContext, 4.0f));
        this.mDotRadius = obtainStyledAttributes.getDimensionPixelSize(1, (int) UIUtils.dip2Px(this.mContext, 4.0f));
        obtainStyledAttributes.recycle();
        init();
    }
}
