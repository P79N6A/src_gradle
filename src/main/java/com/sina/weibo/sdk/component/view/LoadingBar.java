package com.sina.weibo.sdk.component.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.TextView;

public class LoadingBar extends TextView {
    private Handler mHander;
    private Paint mPaint;
    public int mProgress;
    private int mProgressColor;
    private Runnable mRunnable = new Runnable() {
        public void run() {
            LoadingBar.this.mProgress++;
            LoadingBar.this.drawProgress(LoadingBar.this.mProgress);
        }
    };

    public void initSkin() {
        this.mProgressColor = -11693826;
    }

    private Rect getRect() {
        int left = getLeft();
        int top = getTop();
        return new Rect(0, 0, (getLeft() + (((getRight() - getLeft()) * this.mProgress) / 100)) - left, getBottom() - top);
    }

    public LoadingBar(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        this.mHander = new Handler();
        this.mPaint = new Paint();
        initSkin();
    }

    public void drawProgress(int i) {
        if (i < 7) {
            this.mHander.postDelayed(this.mRunnable, 70);
        } else {
            this.mHander.removeCallbacks(this.mRunnable);
            this.mProgress = i;
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.mPaint.setColor(this.mProgressColor);
        canvas.drawRect(getRect(), this.mPaint);
    }

    public LoadingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public LoadingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
