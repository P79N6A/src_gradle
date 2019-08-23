package com.bytedance.ies.uikit.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ugc.uikit.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;

public class WrapLineFlowLayout extends ViewGroup {
    protected final boolean mAlignCenter;
    protected int mHSpacing;
    final ArrayList<LayoutParams> mTmpRow;
    protected int mVSpacing;

    public static class LayoutParams extends ViewGroup.LayoutParams {
        public int x;
        public int y;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public WrapLineFlowLayout(Context context) {
        this(context, null, 0);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams.width, layoutParams.height);
    }

    public WrapLineFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int i7 = 0;
        if (mode == 0) {
            size = 0;
        }
        int paddingLeft2 = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        this.mTmpRow.clear();
        int i8 = paddingLeft2;
        int i9 = paddingTop;
        int i10 = paddingLeft;
        int i11 = 0;
        int i12 = 0;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (paddingLeft2 <= 0) {
                i4 = paddingLeft;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
                layoutParams.x = i10;
                layoutParams.y = i9;
                i3 = paddingLeft2;
            } else {
                i4 = paddingLeft;
                if (layoutParams.width == -2) {
                    i5 = View.MeasureSpec.makeMeasureSpec(paddingLeft2, Integer.MIN_VALUE);
                } else if (layoutParams.width == -1) {
                    i5 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                } else {
                    i5 = View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                }
                if (layoutParams.height == -2) {
                    i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
                    i3 = paddingLeft2;
                } else {
                    i3 = paddingLeft2;
                    if (layoutParams.height == -1) {
                        i6 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
                    } else {
                        i6 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                    }
                }
                childAt.measure(i5, i6);
                if (childAt.getMeasuredWidth() > i8) {
                    if (i12 > 0) {
                        i9 += i12 + this.mVSpacing;
                    }
                    if (this.mAlignCenter && i8 > 1 && !this.mTmpRow.isEmpty()) {
                        int i13 = i8 / 2;
                        Iterator<LayoutParams> it2 = this.mTmpRow.iterator();
                        while (it2.hasNext()) {
                            it2.next().x += i13;
                        }
                    }
                    this.mTmpRow.clear();
                    i10 = i4;
                    i8 = i3;
                    i12 = 0;
                }
                layoutParams.x = i10;
                layoutParams.y = i9;
                if (this.mAlignCenter) {
                    this.mTmpRow.add(layoutParams);
                }
                int measuredWidth = childAt.getMeasuredWidth() + this.mHSpacing;
                i10 += measuredWidth;
                i8 -= measuredWidth;
                if (childAt.getMeasuredHeight() > i12) {
                    i12 = childAt.getMeasuredHeight();
                }
            }
            i11++;
            paddingLeft = i4;
            paddingLeft2 = i3;
            i7 = 0;
        }
        if (this.mAlignCenter && i8 > 1 && !this.mTmpRow.isEmpty()) {
            int i14 = i8 / 2;
            Iterator<LayoutParams> it3 = this.mTmpRow.iterator();
            while (it3.hasNext()) {
                it3.next().x += i14;
            }
        }
        if (i12 > 0) {
            i9 += i12;
        }
        if (mode2 == 0) {
            size2 = i9 + getPaddingBottom();
        } else if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, i9 + getPaddingBottom());
        }
        setMeasuredDimension(size, size2);
    }

    public WrapLineFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTmpRow = new ArrayList<>();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WrapLineFlowLayout, i, 0);
        this.mHSpacing = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.mVSpacing = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        this.mAlignCenter = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (this.mHSpacing < 0) {
            this.mHSpacing = 0;
        }
        if (this.mVSpacing < 0) {
            this.mVSpacing = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            childAt.layout(layoutParams.x, layoutParams.y, layoutParams.x + childAt.getMeasuredWidth(), layoutParams.y + childAt.getMeasuredHeight());
        }
    }
}
