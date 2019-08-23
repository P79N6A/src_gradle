package com.bytedance.ies.uikit.menu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.menu.SlidingMenu;
import com.ss.android.ugc.aweme.C0906R;

public class CustomViewBehind extends ViewGroup {
    private boolean mChildrenEnabled;
    private View mContent;
    private float mFadeDegree;
    private boolean mFadeEnabled;
    private final Paint mFadePaint;
    private int mMarginThreshold;
    private int mMode;
    private float mScrollScale;
    private View mSecondaryContent;
    private Drawable mSecondaryShadowDrawable;
    private int mSecondaryWidthOffset;
    private View mSelectedView;
    private Bitmap mSelectorDrawable;
    private boolean mSelectorEnabled;
    private Drawable mShadowDrawable;
    private int mShadowWidth;
    private int mTouchMode;
    private SlidingMenu.CanvasTransformer mTransformer;
    private CustomViewAbove mViewAbove;
    private int mWidthOffset;

    public View getContent() {
        return this.mContent;
    }

    public int getMode() {
        return this.mMode;
    }

    public float getScrollScale() {
        return this.mScrollScale;
    }

    public View getSecondaryContent() {
        return this.mSecondaryContent;
    }

    public int getBehindWidth() {
        return this.mContent.getWidth();
    }

    public int getSecondaryBehindWidth() {
        return this.mSecondaryContent.getWidth();
    }

    private int getSelectorTop() {
        return this.mSelectedView.getTop() + ((this.mSelectedView.getHeight() - this.mSelectorDrawable.getHeight()) / 2);
    }

    public void setCanvasTransformer(SlidingMenu.CanvasTransformer canvasTransformer) {
        this.mTransformer = canvasTransformer;
    }

    public void setChildrenEnabled(boolean z) {
        this.mChildrenEnabled = z;
    }

    public void setCustomViewAbove(CustomViewAbove customViewAbove) {
        this.mViewAbove = customViewAbove;
    }

    public void setFadeEnabled(boolean z) {
        this.mFadeEnabled = z;
    }

    public void setScrollScale(float f2) {
        this.mScrollScale = f2;
    }

    public void setSelectorEnabled(boolean z) {
        this.mSelectorEnabled = z;
    }

    public void setTouchMode(int i) {
        this.mTouchMode = i;
    }

    public CustomViewBehind(Context context) {
        this(context, null);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mChildrenEnabled) {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mChildrenEnabled) {
            return true;
        }
        return false;
    }

    public void setSecondaryShadowDrawable(Drawable drawable) {
        this.mSecondaryShadowDrawable = drawable;
        invalidate();
    }

    public void setSecondaryWidthOffset(int i) {
        this.mSecondaryWidthOffset = i;
        requestLayout();
    }

    public void setSelectorBitmap(Bitmap bitmap) {
        this.mSelectorDrawable = bitmap;
        refreshDrawableState();
    }

    public void setShadowDrawable(Drawable drawable) {
        this.mShadowDrawable = drawable;
        invalidate();
    }

    public void setShadowWidth(int i) {
        this.mShadowWidth = i;
        invalidate();
    }

    public void setWidthOffset(int i) {
        this.mWidthOffset = i;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.mTransformer != null) {
            canvas.save();
            this.mTransformer.transformCanvas(canvas, this.mViewAbove.getPercentOpen());
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    public int getAbsLeftBound(View view) {
        if (this.mMode == 0 || this.mMode == 2) {
            return view.getLeft() - getBehindWidth();
        }
        if (this.mMode == 1) {
            return view.getLeft();
        }
        return 0;
    }

    public int getAbsRightBound(View view) {
        if (this.mMode == 0) {
            return view.getLeft();
        }
        if (this.mMode == 1 || this.mMode == 2) {
            return view.getLeft() + getSecondaryBehindWidth();
        }
        return 0;
    }

    public int getMenuPage(int i) {
        if (i > 1) {
            i = 2;
        } else if (i <= 0) {
            i = 0;
        }
        if (this.mMode == 0 && i > 1) {
            return 0;
        }
        if (this.mMode != 1 || i > 0) {
            return i;
        }
        return 2;
    }

    public boolean menuClosedSlideAllowed(float f2) {
        if (this.mMode == 0) {
            if (f2 > 0.0f) {
                return true;
            }
            return false;
        } else if (this.mMode == 1) {
            if (f2 < 0.0f) {
                return true;
            }
            return false;
        } else if (this.mMode == 2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean menuOpenSlideAllowed(float f2) {
        if (this.mMode == 0) {
            if (f2 < 0.0f) {
                return true;
            }
            return false;
        } else if (this.mMode == 1) {
            if (f2 > 0.0f) {
                return true;
            }
            return false;
        } else if (this.mMode == 2) {
            return true;
        } else {
            return false;
        }
    }

    public void setContent(View view) {
        if (this.mContent != null) {
            removeView(this.mContent);
        }
        this.mContent = view;
        addView(this.mContent);
    }

    public void setFadeDegree(float f2) {
        if (f2 > 1.0f || f2 < 0.0f) {
            throw new IllegalStateException("The BehindFadeDegree must be between 0.0f and 1.0f");
        }
        this.mFadeDegree = f2;
    }

    public void setMode(int i) {
        if (i == 0 || i == 1) {
            if (this.mContent != null) {
                this.mContent.setVisibility(0);
            }
            if (this.mSecondaryContent != null) {
                this.mSecondaryContent.setVisibility(4);
            }
        }
        this.mMode = i;
    }

    public void setSecondaryContent(View view) {
        if (this.mSecondaryContent != null) {
            removeView(this.mSecondaryContent);
        }
        this.mSecondaryContent = view;
        addView(this.mSecondaryContent);
    }

    public void setSelectedView(View view) {
        if (this.mSelectedView != null) {
            this.mSelectedView.setTag(C0906R.id.cnk, null);
            this.mSelectedView = null;
        }
        if (view != null && view.getParent() != null) {
            this.mSelectedView = view;
            this.mSelectedView.setTag(C0906R.id.cnk, "CustomViewBehindSelectedView");
            invalidate();
        }
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        if (this.mTransformer != null) {
            invalidate();
        }
    }

    public CustomViewBehind(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFadePaint = new Paint();
        this.mSelectorEnabled = true;
        this.mMarginThreshold = (int) TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics());
    }

    public boolean marginTouchAllowed(View view, int i) {
        int left = view.getLeft();
        int right = view.getRight();
        if (this.mMode == 0) {
            if (i < left || i > this.mMarginThreshold + left) {
                return false;
            }
            return true;
        } else if (this.mMode == 1) {
            if (i > right || i < right - this.mMarginThreshold) {
                return false;
            }
            return true;
        } else if (this.mMode != 2) {
            return false;
        } else {
            if ((i < left || i > this.mMarginThreshold + left) && (i > right || i < right - this.mMarginThreshold)) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(0, i);
        int defaultSize2 = getDefaultSize(0, i2);
        setMeasuredDimension(defaultSize, defaultSize2);
        int childMeasureSpec = getChildMeasureSpec(i, 0, defaultSize - this.mWidthOffset);
        int childMeasureSpec2 = getChildMeasureSpec(i2, 0, defaultSize2);
        this.mContent.measure(childMeasureSpec, childMeasureSpec2);
        if (this.mSecondaryContent != null) {
            this.mSecondaryContent.measure(getChildMeasureSpec(i, 0, defaultSize - this.mSecondaryWidthOffset), childMeasureSpec2);
        }
    }

    public void drawShadow(View view, Canvas canvas) {
        int i;
        if (this.mShadowDrawable != null && this.mShadowWidth > 0) {
            if (this.mMode != 0) {
                if (this.mMode == 1) {
                    i = view.getRight();
                } else if (this.mMode != 2) {
                    i = 0;
                } else if (this.mSecondaryShadowDrawable != null) {
                    int right = view.getRight();
                    this.mSecondaryShadowDrawable.setBounds(right, 0, this.mShadowWidth + right, getHeight());
                    this.mSecondaryShadowDrawable.draw(canvas);
                }
                this.mShadowDrawable.setBounds(i, 0, this.mShadowWidth + i, getHeight());
                this.mShadowDrawable.draw(canvas);
            }
            i = view.getLeft() - this.mShadowWidth;
            this.mShadowDrawable.setBounds(i, 0, this.mShadowWidth + i, getHeight());
            this.mShadowDrawable.draw(canvas);
        }
    }

    public int getMenuLeft(View view, int i) {
        if (this.mMode == 0) {
            if (i == 0) {
                return view.getLeft() - getBehindWidth();
            }
            if (i == 2) {
                return view.getLeft();
            }
        } else if (this.mMode == 1) {
            if (i == 0) {
                return view.getLeft();
            }
            if (i == 2) {
                return view.getLeft() + getSecondaryBehindWidth();
            }
        } else if (this.mMode == 2) {
            if (i == 0) {
                return view.getLeft() - getBehindWidth();
            }
            if (i == 2) {
                return view.getLeft() + getSecondaryBehindWidth();
            }
        }
        return view.getLeft();
    }

    public boolean menuOpenTouchAllowed(View view, int i, float f2) {
        switch (this.mTouchMode) {
            case 0:
                return menuTouchInQuickReturn(view, i, f2);
            case 1:
                return true;
            default:
                return false;
        }
    }

    public boolean menuTouchInQuickReturn(View view, int i, float f2) {
        if (this.mMode == 0 || (this.mMode == 2 && i == 0)) {
            if (f2 >= ((float) view.getLeft())) {
                return true;
            }
            return false;
        } else if ((this.mMode == 1 || (this.mMode == 2 && i == 2)) && f2 <= ((float) view.getRight())) {
            return true;
        } else {
            return false;
        }
    }

    public void drawSelector(View view, Canvas canvas, float f2) {
        if (this.mSelectorEnabled && this.mSelectorDrawable != null && this.mSelectedView != null && ((String) this.mSelectedView.getTag(C0906R.id.cnk)).equals("CustomViewBehindSelectedView")) {
            canvas.save();
            int width = (int) (((float) this.mSelectorDrawable.getWidth()) * f2);
            if (this.mMode == 0) {
                int left = view.getLeft();
                int i = left - width;
                canvas.clipRect(i, 0, left, getHeight());
                canvas.drawBitmap(this.mSelectorDrawable, (float) i, (float) getSelectorTop(), null);
            } else if (this.mMode == 1) {
                int right = view.getRight();
                int i2 = width + right;
                canvas.clipRect(right, 0, i2, getHeight());
                Bitmap bitmap = this.mSelectorDrawable;
                canvas.drawBitmap(bitmap, (float) (i2 - bitmap.getWidth()), (float) getSelectorTop(), null);
            }
            canvas.restore();
        }
    }

    public void drawFade(View view, Canvas canvas, float f2) {
        int i;
        if (this.mFadeEnabled) {
            int i2 = 0;
            this.mFadePaint.setColor(Color.argb((int) (this.mFadeDegree * 255.0f * Math.abs(1.0f - f2)), 0, 0, 0));
            if (this.mMode == 0) {
                i2 = view.getLeft() - getBehindWidth();
                i = view.getLeft();
            } else if (this.mMode == 1) {
                i2 = view.getRight();
                i = view.getRight() + getSecondaryBehindWidth();
            } else if (this.mMode == 2) {
                Canvas canvas2 = canvas;
                canvas2.drawRect((float) (view.getLeft() - getSecondaryBehindWidth()), 0.0f, (float) view.getLeft(), (float) getHeight(), this.mFadePaint);
                i2 = view.getRight();
                i = view.getRight() + getSecondaryBehindWidth();
            } else {
                i = 0;
            }
            canvas.drawRect((float) i2, 0.0f, (float) i, (float) getHeight(), this.mFadePaint);
        }
    }

    public void scrollBehindTo(View view, int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (this.mMode == 0) {
            if (i >= view.getLeft()) {
                i5 = 4;
            }
            scrollTo((int) (((float) (i + getBehindWidth())) * this.mScrollScale), i2);
        } else if (this.mMode == 1) {
            if (i <= view.getLeft()) {
                i5 = 4;
            }
            scrollTo((int) (((float) (getSecondaryBehindWidth() - getWidth())) + (((float) (i - getSecondaryBehindWidth())) * this.mScrollScale)), i2);
        } else if (this.mMode == 2) {
            View view2 = this.mContent;
            if (i >= view.getLeft()) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            view2.setVisibility(i3);
            View view3 = this.mSecondaryContent;
            if (i <= view.getLeft()) {
                i4 = 4;
            } else {
                i4 = 0;
            }
            view3.setVisibility(i4);
            if (i == 0) {
                i5 = 4;
            }
            if (i <= view.getLeft()) {
                scrollTo((int) (((float) (i + getBehindWidth())) * this.mScrollScale), i2);
            } else {
                scrollTo((int) (((float) (getSecondaryBehindWidth() - getWidth())) + (((float) (i - getSecondaryBehindWidth())) * this.mScrollScale)), i2);
            }
        }
        setVisibility(i5);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.mContent.layout(0, 0, i5 - this.mWidthOffset, i6);
        if (this.mSecondaryContent != null) {
            this.mSecondaryContent.layout(0, 0, i5 - this.mSecondaryWidthOffset, i6);
        }
    }
}
