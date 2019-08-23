package com.bytedance.ies.uikit.switchview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.CompoundButton;
import com.bytedance.ugc.uikit.R$styleable;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.bytex.a.a.a;

public class SwitchBase extends CompoundButton {
    private static final int[] CHECKED_STATE_SET = {16842912};
    private int mMinFlingVelocity;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;
    private int mSwitchWidth;
    private final Rect mTempRect;
    private Drawable mThumbDrawable;
    private float mThumbPosition;
    private int mThumbWidth;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private Drawable mTrackDrawable;
    @SuppressLint({"Recycle"})
    private VelocityTracker mVelocityTracker;

    public Drawable getThumbDrawable() {
        return this.mThumbDrawable;
    }

    public Drawable getTrackDrawable() {
        return this.mTrackDrawable;
    }

    private boolean getTargetCheckedState() {
        if (this.mThumbPosition >= ((float) (getThumbScrollRange() / 2))) {
            return true;
        }
        return false;
    }

    private int getThumbScrollRange() {
        if (this.mTrackDrawable == null) {
            return 0;
        }
        this.mTrackDrawable.getPadding(this.mTempRect);
        return ((this.mSwitchWidth - this.mThumbWidth) - this.mTempRect.left) - this.mTempRect.right;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        if (this.mThumbDrawable != null) {
            this.mThumbDrawable.setState(drawableState);
        }
        if (this.mTrackDrawable != null) {
            this.mTrackDrawable.setState(drawableState);
        }
        invalidate();
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.mSwitchWidth;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.mSwitchPadding;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.mSwitchWidth;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.mSwitchPadding;
        }
        return compoundPaddingRight;
    }

    /* access modifiers changed from: protected */
    public void animateThumbToCheckedState(boolean z) {
        setChecked(z);
    }

    public SwitchBase(Context context) {
        this(context, null);
    }

    public void setSwitchPadding(int i) {
        this.mSwitchPadding = i;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        this.mThumbDrawable = drawable;
        requestLayout();
    }

    public void setTrackDrawable(Drawable drawable) {
        this.mTrackDrawable = drawable;
        requestLayout();
    }

    private void cancelSuperTouch(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private void setThumbPosition(boolean z) {
        float f2;
        if (z) {
            f2 = (float) getThumbScrollRange();
        } else {
            f2 = 0.0f;
        }
        this.mThumbPosition = f2;
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        setThumbPosition(isChecked());
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(a.a(getContext().getResources(), i));
    }

    public void setTrackResource(int i) {
        setTrackDrawable(a.a(getContext().getResources(), i));
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.mThumbDrawable || drawable == this.mTrackDrawable) {
            return true;
        }
        return false;
    }

    private void stopDrag(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        this.mTouchMode = 0;
        if (motionEvent.getAction() != 1 || !isEnabled()) {
            z = false;
        } else {
            z = true;
        }
        cancelSuperTouch(motionEvent);
        if (z) {
            this.mVelocityTracker.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
            float xVelocity = this.mVelocityTracker.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.mMinFlingVelocity)) {
                z2 = getTargetCheckedState();
            } else if (xVelocity > 0.0f) {
                z2 = true;
            }
            animateThumbToCheckedState(z2);
            return;
        }
        animateThumbToCheckedState(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.mSwitchLeft;
        int i2 = this.mSwitchTop;
        int i3 = this.mSwitchRight;
        int i4 = this.mSwitchBottom;
        this.mTrackDrawable.setBounds(i, i2, i3, i4);
        this.mTrackDrawable.draw(canvas);
        canvas.save();
        this.mTrackDrawable.getPadding(this.mTempRect);
        int i5 = i + this.mTempRect.left;
        canvas.clipRect(i5, i2, i3 - this.mTempRect.right, i4);
        this.mThumbDrawable.getPadding(this.mTempRect);
        int i6 = (int) (this.mThumbPosition + 0.5f);
        this.mThumbDrawable.setBounds((i5 - this.mTempRect.left) + i6, i2, i5 + i6 + this.mThumbWidth + this.mTempRect.right, i4);
        this.mThumbDrawable.draw(canvas);
        canvas.restore();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.mVelocityTracker.addMovement(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                getParent().requestDisallowInterceptTouchEvent(true);
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (isEnabled()) {
                    if (hitThumb(x, y)) {
                        this.mTouchMode = 1;
                    } else {
                        this.mTouchMode = 3;
                    }
                    this.mTouchX = x;
                    this.mTouchY = y;
                    break;
                }
                break;
            case 1:
            case 3:
                if (this.mTouchMode != 2) {
                    if (this.mTouchMode != 1 && this.mTouchMode != 3) {
                        this.mTouchMode = 0;
                        this.mVelocityTracker.clear();
                        break;
                    } else {
                        this.mTouchMode = 0;
                        this.mVelocityTracker.clear();
                        toggle();
                        return true;
                    }
                } else {
                    stopDrag(motionEvent);
                    return true;
                }
                break;
            case 2:
                switch (this.mTouchMode) {
                    case 1:
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (Math.abs(x2 - this.mTouchX) > ((float) this.mTouchSlop) || Math.abs(y2 - this.mTouchY) > ((float) this.mTouchSlop)) {
                            this.mTouchMode = 2;
                            this.mTouchX = x2;
                            this.mTouchY = y2;
                            return true;
                        }
                    case 2:
                        float x3 = motionEvent.getX();
                        float max = Math.max(0.0f, Math.min(this.mThumbPosition + (x3 - this.mTouchX), (float) getThumbScrollRange()));
                        if (max != this.mThumbPosition) {
                            this.mThumbPosition = max;
                            this.mTouchX = x3;
                            invalidate();
                        }
                        return true;
                }
                break;
        }
        if (this.mTouchMode != 0) {
            return true;
        }
        return false;
    }

    public SwitchBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        int max = Math.max(this.mSwitchMinWidth, this.mTrackDrawable.getIntrinsicWidth());
        int intrinsicHeight = this.mTrackDrawable.getIntrinsicHeight();
        this.mThumbWidth = this.mThumbDrawable.getIntrinsicWidth();
        this.mSwitchWidth = max;
        this.mSwitchHeight = intrinsicHeight;
        setMeasuredDimension(max, intrinsicHeight);
    }

    private boolean hitThumb(float f2, float f3) {
        this.mThumbDrawable.getPadding(this.mTempRect);
        int i = this.mSwitchTop - this.mTouchSlop;
        int i2 = (this.mSwitchLeft + ((int) (this.mThumbPosition + 0.5f))) - this.mTouchSlop;
        int i3 = this.mThumbWidth + i2 + this.mTempRect.left + this.mTempRect.right + this.mTouchSlop;
        int i4 = this.mSwitchBottom + this.mTouchSlop;
        if (f2 <= ((float) i2) || f2 >= ((float) i3) || f3 <= ((float) i) || f3 >= ((float) i4)) {
            return false;
        }
        return true;
    }

    public SwitchBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mTempRect = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SwitchBase, i, 0);
        this.mThumbDrawable = obtainStyledAttributes.getDrawable(2);
        this.mTrackDrawable = obtainStyledAttributes.getDrawable(3);
        this.mSwitchMinWidth = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.mSwitchPadding = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        setThumbPosition(isChecked());
        int width = getWidth() - getPaddingRight();
        int i7 = width - this.mSwitchWidth;
        int gravity = getGravity() & SearchJediMixFeedAdapter.f42516e;
        if (gravity == 16) {
            i6 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (this.mSwitchHeight / 2);
            i5 = this.mSwitchHeight + i6;
        } else if (gravity != 80) {
            i6 = getPaddingTop();
            i5 = this.mSwitchHeight + i6;
        } else {
            i5 = getHeight() - getPaddingBottom();
            i6 = i5 - this.mSwitchHeight;
        }
        this.mSwitchLeft = i7;
        this.mSwitchTop = i6;
        this.mSwitchBottom = i5;
        this.mSwitchRight = width;
    }
}
