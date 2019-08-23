package android.support.design.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.RestrictTo;
import android.support.design.R$styleable;
import android.support.v4.view.MarginLayoutParamsCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class FlowLayout extends ViewGroup {
    private int itemSpacing;
    private int lineSpacing;
    private boolean singleLine;

    /* access modifiers changed from: protected */
    public int getItemSpacing() {
        return this.itemSpacing;
    }

    /* access modifiers changed from: protected */
    public int getLineSpacing() {
        return this.lineSpacing;
    }

    /* access modifiers changed from: protected */
    public boolean isSingleLine() {
        return this.singleLine;
    }

    /* access modifiers changed from: protected */
    public void setItemSpacing(int i) {
        this.itemSpacing = i;
    }

    /* access modifiers changed from: protected */
    public void setLineSpacing(int i) {
        this.lineSpacing = i;
    }

    public void setSingleLine(boolean z) {
        this.singleLine = z;
    }

    public FlowLayout(Context context) {
        this(context, null);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void loadFromAttributes(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.FlowLayout, 0, 0);
        this.lineSpacing = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.itemSpacing = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i3 = size;
        } else {
            i3 = Integer.MAX_VALUE;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i3 - getPaddingRight();
        int i6 = paddingLeft;
        int i7 = paddingTop;
        int i8 = i7;
        int i9 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = marginLayoutParams.leftMargin + 0;
                    i4 = marginLayoutParams.rightMargin + 0;
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                int i11 = i6;
                if (i6 + i5 + childAt.getMeasuredWidth() > paddingRight && !isSingleLine()) {
                    int paddingLeft2 = getPaddingLeft();
                    i8 = this.lineSpacing + i7;
                    i11 = paddingLeft2;
                }
                int measuredWidth = i11 + i5 + childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight() + i8;
                if (measuredWidth > i9) {
                    i9 = measuredWidth;
                }
                i7 = measuredHeight;
                i6 = i11 + i5 + i4 + childAt.getMeasuredWidth() + this.itemSpacing;
            } else {
                int i12 = i;
                int i13 = i2;
                int i14 = i6;
            }
        }
        setMeasuredDimension(getMeasuredDimension(size, mode, i9), getMeasuredDimension(size2, mode2, i7));
    }

    private static int getMeasuredDimension(int i, int i2, int i3) {
        if (i2 == Integer.MIN_VALUE) {
            return Math.min(i3, i);
        }
        if (i2 != 1073741824) {
            return i3;
        }
        return i;
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        loadFromAttributes(context, attributeSet);
    }

    @TargetApi(21)
    public FlowLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        loadFromAttributes(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (getChildCount() != 0) {
            boolean z2 = true;
            if (ViewCompat.getLayoutDirection(this) != 1) {
                z2 = false;
            }
            if (z2) {
                i5 = getPaddingRight();
            } else {
                i5 = getPaddingLeft();
            }
            if (z2) {
                i6 = getPaddingLeft();
            } else {
                i6 = getPaddingRight();
            }
            int paddingTop = getPaddingTop();
            int i9 = (i3 - i) - i6;
            int i10 = i5;
            int i11 = paddingTop;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        i7 = MarginLayoutParamsCompat.getMarginStart(marginLayoutParams);
                        i8 = MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams);
                    } else {
                        i8 = 0;
                        i7 = 0;
                    }
                    int measuredWidth = i10 + i7 + childAt.getMeasuredWidth();
                    if (!this.singleLine && measuredWidth > i9) {
                        i11 = paddingTop + this.lineSpacing;
                        i10 = i5;
                    }
                    int i13 = i10 + i7;
                    int measuredWidth2 = childAt.getMeasuredWidth() + i13;
                    int measuredHeight = childAt.getMeasuredHeight() + i11;
                    if (z2) {
                        childAt.layout(i9 - measuredWidth2, i11, (i9 - i10) - i7, measuredHeight);
                    } else {
                        childAt.layout(i13, i11, measuredWidth2, measuredHeight);
                    }
                    i10 += i7 + i8 + childAt.getMeasuredWidth() + this.itemSpacing;
                    paddingTop = measuredHeight;
                }
            }
        }
    }
}
