package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.annotation.RestrictTo;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.appcompat.R$styleable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LinearLayoutCompat extends ViewGroup {
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int gravity = -1;
        public float weight;

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.weight = layoutParams.weight;
            this.gravity = layoutParams.gravity;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LinearLayoutCompat_Layout);
            this.weight = obtainStyledAttributes.getFloat(3, 0.0f);
            this.gravity = obtainStyledAttributes.getInt(0, -1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2, float f2) {
            super(i, i2);
            this.weight = f2;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface OrientationMode {
    }

    /* access modifiers changed from: package-private */
    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int getLocationOffset(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int getNextLocationOffset(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int measureNullChild(int i) {
        return 0;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new LayoutParams(-2, -2);
        }
        if (this.mOrientation == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    public int getBaseline() {
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        if (getChildCount() > this.mBaselineAlignedChildIndex) {
            View childAt = getChildAt(this.mBaselineAlignedChildIndex);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i = this.mBaselineChildTop;
                if (this.mOrientation == 1) {
                    int i2 = this.mGravity & SearchJediMixFeedAdapter.f42516e;
                    if (i2 != 48) {
                        if (i2 == 16) {
                            i += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
                        } else if (i2 == 80) {
                            i = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
                        }
                    }
                }
                return i + ((LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    public void setWeightSum(float f2) {
        this.mWeightSum = Math.max(0.0f, f2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.mDivider != null) {
            if (this.mOrientation == 1) {
                drawDividersVertical(canvas);
            } else {
                drawDividersHorizontal(canvas);
            }
        }
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & SearchJediMixFeedAdapter.f42516e) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        if ((8388615 & this.mGravity) != i2) {
            this.mGravity = i2 | (this.mGravity & -8388616);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & SearchJediMixFeedAdapter.f42516e;
        if ((this.mGravity & SearchJediMixFeedAdapter.f42516e) != i2) {
            this.mGravity = i2 | (this.mGravity & -113);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasDividerBeforeChildAt(int i) {
        boolean z = false;
        if (i == 0) {
            if ((this.mShowDividers & 1) != 0) {
                return true;
            }
            return false;
        } else if (i == getChildCount()) {
            if ((this.mShowDividers & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.mShowDividers & 2) == 0) {
            return false;
        } else {
            int i2 = i - 1;
            while (true) {
                if (i2 < 0) {
                    break;
                } else if (getChildAt(i2).getVisibility() != 8) {
                    z = true;
                    break;
                } else {
                    i2--;
                }
            }
            return z;
        }
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.mBaselineAlignedChildIndex = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.mDivider) {
            this.mDivider = drawable;
            boolean z = false;
            if (drawable != null) {
                this.mDividerWidth = drawable.getIntrinsicWidth();
                this.mDividerHeight = drawable.getIntrinsicHeight();
            } else {
                this.mDividerWidth = 0;
                this.mDividerHeight = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void drawDividersHorizontal(Canvas canvas) {
        int i;
        int i2;
        int virtualChildCount = getVirtualChildCount();
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i3))) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (isLayoutRtl) {
                    i2 = virtualChildAt.getRight() + layoutParams.rightMargin;
                } else {
                    i2 = (virtualChildAt.getLeft() - layoutParams.leftMargin) - this.mDividerWidth;
                }
                drawVerticalDivider(canvas, i2);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                if (isLayoutRtl) {
                    i = (virtualChildAt2.getLeft() - layoutParams2.leftMargin) - this.mDividerWidth;
                } else {
                    i = virtualChildAt2.getRight() + layoutParams2.rightMargin;
                }
            } else if (isLayoutRtl) {
                i = getPaddingLeft();
            } else {
                i = (getWidth() - getPaddingRight()) - this.mDividerWidth;
            }
            drawVerticalDivider(canvas, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void drawDividersVertical(Canvas canvas) {
        int i;
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View virtualChildAt = getVirtualChildAt(i2);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i2))) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LayoutParams) virtualChildAt.getLayoutParams()).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                i = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                i = virtualChildAt2.getBottom() + ((LayoutParams) virtualChildAt2.getLayoutParams()).bottomMargin;
            }
            drawHorizontalDivider(canvas, i);
        }
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    private void forceUniformHeight(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i4 = layoutParams.width;
                    layoutParams.width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, 0, makeMeasureSpec, 0);
                    layoutParams.width = i4;
                }
            }
        }
    }

    private void forceUniformWidth(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0334  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void measureVertical(int r41, int r42) {
        /*
            r40 = this;
            r7 = r40
            r8 = r41
            r9 = r42
            r10 = 0
            r7.mTotalLength = r10
            int r11 = r40.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r41)
            int r13 = android.view.View.MeasureSpec.getMode(r42)
            int r14 = r7.mBaselineAlignedChildIndex
            boolean r15 = r7.mUseLargestChild
            r16 = 0
            r17 = 1
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r18 = 0
            r19 = 1
            r20 = 0
        L_0x002a:
            r10 = 8
            r22 = r4
            if (r6 >= r11) goto L_0x01aa
            android.view.View r4 = r7.getVirtualChildAt(r6)
            if (r4 != 0) goto L_0x004d
            int r4 = r7.mTotalLength
            int r10 = r7.measureNullChild(r6)
            int r4 = r4 + r10
            r7.mTotalLength = r4
            r32 = r11
            r31 = r13
            r4 = r22
            r39 = r6
            r6 = r1
            r1 = r2
            r2 = r39
            goto L_0x0198
        L_0x004d:
            r24 = r1
            int r1 = r4.getVisibility()
            if (r1 == r10) goto L_0x0179
            boolean r1 = r7.hasDividerBeforeChildAt(r6)
            if (r1 == 0) goto L_0x0062
            int r1 = r7.mTotalLength
            int r10 = r7.mDividerHeight
            int r1 = r1 + r10
            r7.mTotalLength = r1
        L_0x0062:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r10 = r1
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r10 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r10
            float r1 = r10.weight
            float r25 = r0 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r13 != r1) goto L_0x009e
            int r0 = r10.height
            if (r0 != 0) goto L_0x009e
            float r0 = r10.weight
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x009e
            int r0 = r7.mTotalLength
            int r1 = r10.topMargin
            int r1 = r1 + r0
            r26 = r2
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.mTotalLength = r0
            r0 = r3
            r3 = r4
            r33 = r5
            r32 = r11
            r31 = r13
            r13 = r22
            r8 = r24
            r29 = r26
            r18 = 1
            r11 = r6
            goto L_0x010e
        L_0x009e:
            r26 = r2
            int r0 = r10.height
            if (r0 != 0) goto L_0x00af
            float r0 = r10.weight
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00af
            r0 = -2
            r10.height = r0
            r2 = 0
            goto L_0x00b1
        L_0x00af:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00b1:
            r23 = 0
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00bc
            int r0 = r7.mTotalLength
            r27 = r0
            goto L_0x00be
        L_0x00bc:
            r27 = 0
        L_0x00be:
            r0 = r40
            r8 = r24
            r24 = 1073741824(0x40000000, float:2.0)
            r1 = r4
            r28 = r2
            r29 = r26
            r2 = r6
            r9 = r3
            r3 = r41
            r30 = r4
            r32 = r11
            r31 = r13
            r13 = r22
            r11 = 1073741824(0x40000000, float:2.0)
            r4 = r23
            r33 = r5
            r5 = r42
            r11 = r6
            r6 = r27
            r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6)
            r0 = r28
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x00eb
            r10.height = r0
        L_0x00eb:
            int r0 = r30.getMeasuredHeight()
            int r1 = r7.mTotalLength
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = r30
            int r4 = r7.getNextLocationOffset(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.mTotalLength = r1
            if (r15 == 0) goto L_0x010d
            int r0 = java.lang.Math.max(r0, r9)
            goto L_0x010e
        L_0x010d:
            r0 = r9
        L_0x010e:
            if (r14 < 0) goto L_0x0118
            int r6 = r11 + 1
            if (r14 != r6) goto L_0x0118
            int r1 = r7.mTotalLength
            r7.mBaselineChildTop = r1
        L_0x0118:
            if (r11 >= r14) goto L_0x0129
            float r1 = r10.weight
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 > 0) goto L_0x0121
            goto L_0x0129
        L_0x0121:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0129:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x0136
            int r1 = r10.width
            r2 = -1
            if (r1 != r2) goto L_0x0136
            r1 = 1
            r20 = 1
            goto L_0x0137
        L_0x0136:
            r1 = 0
        L_0x0137:
            int r2 = r10.leftMargin
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 + r2
            r5 = r29
            int r5 = java.lang.Math.max(r5, r4)
            int r6 = r3.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r8, r6)
            if (r19 == 0) goto L_0x0159
            int r8 = r10.width
            r9 = -1
            if (r8 != r9) goto L_0x0159
            r19 = 1
            goto L_0x015b
        L_0x0159:
            r19 = 0
        L_0x015b:
            float r8 = r10.weight
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 <= 0) goto L_0x016d
            if (r1 == 0) goto L_0x0164
            goto L_0x0165
        L_0x0164:
            r2 = r4
        L_0x0165:
            int r4 = java.lang.Math.max(r13, r2)
            r13 = r4
            r1 = r33
            goto L_0x018a
        L_0x016d:
            if (r1 == 0) goto L_0x0172
        L_0x016f:
            r1 = r33
            goto L_0x0174
        L_0x0172:
            r2 = r4
            goto L_0x016f
        L_0x0174:
            int r1 = java.lang.Math.max(r1, r2)
            goto L_0x018a
        L_0x0179:
            r9 = r3
            r3 = r4
            r1 = r5
            r32 = r11
            r31 = r13
            r13 = r22
            r8 = r24
            r5 = r2
            r11 = r6
            r25 = r0
            r6 = r8
            r0 = r9
        L_0x018a:
            int r2 = r7.getChildrenSkipCount(r3, r11)
            int r2 = r2 + r11
            r3 = r0
            r4 = r13
            r0 = r25
            r39 = r5
            r5 = r1
            r1 = r39
        L_0x0198:
            int r2 = r2 + 1
            r13 = r31
            r11 = r32
            r8 = r41
            r9 = r42
            r39 = r2
            r2 = r1
            r1 = r6
            r6 = r39
            goto L_0x002a
        L_0x01aa:
            r8 = r1
            r9 = r3
            r1 = r5
            r32 = r11
            r31 = r13
            r13 = r22
            r5 = r2
            int r2 = r7.mTotalLength
            if (r2 <= 0) goto L_0x01c8
            r2 = r32
            boolean r3 = r7.hasDividerBeforeChildAt(r2)
            if (r3 == 0) goto L_0x01ca
            int r3 = r7.mTotalLength
            int r4 = r7.mDividerHeight
            int r3 = r3 + r4
            r7.mTotalLength = r3
            goto L_0x01ca
        L_0x01c8:
            r2 = r32
        L_0x01ca:
            if (r15 == 0) goto L_0x0219
            r3 = r31
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x01d4
            if (r3 != 0) goto L_0x021b
        L_0x01d4:
            r4 = 0
            r7.mTotalLength = r4
            r4 = 0
        L_0x01d8:
            if (r4 >= r2) goto L_0x021b
            android.view.View r6 = r7.getVirtualChildAt(r4)
            if (r6 != 0) goto L_0x01ea
            int r6 = r7.mTotalLength
            int r11 = r7.measureNullChild(r4)
            int r6 = r6 + r11
            r7.mTotalLength = r6
            goto L_0x0214
        L_0x01ea:
            int r11 = r6.getVisibility()
            if (r11 != r10) goto L_0x01f6
            int r6 = r7.getChildrenSkipCount(r6, r4)
            int r4 = r4 + r6
            goto L_0x0214
        L_0x01f6:
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r11 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r11
            int r14 = r7.mTotalLength
            int r21 = r14 + r9
            int r10 = r11.topMargin
            int r21 = r21 + r10
            int r10 = r11.bottomMargin
            int r21 = r21 + r10
            int r6 = r7.getNextLocationOffset(r6)
            int r6 = r21 + r6
            int r6 = java.lang.Math.max(r14, r6)
            r7.mTotalLength = r6
        L_0x0214:
            int r4 = r4 + 1
            r10 = 8
            goto L_0x01d8
        L_0x0219:
            r3 = r31
        L_0x021b:
            int r4 = r7.mTotalLength
            int r6 = r40.getPaddingTop()
            int r10 = r40.getPaddingBottom()
            int r6 = r6 + r10
            int r4 = r4 + r6
            r7.mTotalLength = r4
            int r4 = r7.mTotalLength
            int r6 = r40.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r6)
            r10 = r9
            r6 = r42
            r9 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r6, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r4
            int r11 = r7.mTotalLength
            int r9 = r9 - r11
            if (r18 != 0) goto L_0x028b
            if (r9 == 0) goto L_0x024b
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x024b
            goto L_0x028b
        L_0x024b:
            int r0 = java.lang.Math.max(r1, r13)
            if (r15 == 0) goto L_0x0286
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 == r1) goto L_0x0286
            r1 = 0
        L_0x0256:
            if (r1 >= r2) goto L_0x0286
            android.view.View r3 = r7.getVirtualChildAt(r1)
            if (r3 == 0) goto L_0x0283
            int r9 = r3.getVisibility()
            r11 = 8
            if (r9 == r11) goto L_0x0283
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r9 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r9
            float r9 = r9.weight
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0283
            int r9 = r3.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            r3.measure(r9, r13)
        L_0x0283:
            int r1 = r1 + 1
            goto L_0x0256
        L_0x0286:
            r1 = r8
            r11 = r41
            goto L_0x0383
        L_0x028b:
            float r10 = r7.mWeightSum
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x0293
            float r0 = r7.mWeightSum
        L_0x0293:
            r10 = 0
            r7.mTotalLength = r10
            r11 = r0
            r0 = 0
            r39 = r8
            r8 = r1
            r1 = r39
        L_0x029d:
            if (r0 >= r2) goto L_0x0372
            android.view.View r13 = r7.getVirtualChildAt(r0)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 == r15) goto L_0x0365
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r14 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r14
            float r10 = r14.weight
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x030b
            float r15 = (float) r9
            float r15 = r15 * r10
            float r15 = r15 / r11
            int r15 = (int) r15
            float r11 = r11 - r10
            int r9 = r9 - r15
            int r10 = r40.getPaddingLeft()
            int r18 = r40.getPaddingRight()
            int r10 = r10 + r18
            r34 = r9
            int r9 = r14.leftMargin
            int r10 = r10 + r9
            int r9 = r14.rightMargin
            int r10 = r10 + r9
            int r9 = r14.width
            r35 = r11
            r11 = r41
            int r9 = getChildMeasureSpec(r11, r10, r9)
            int r10 = r14.height
            if (r10 != 0) goto L_0x02ea
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == r10) goto L_0x02e3
            goto L_0x02ea
        L_0x02e3:
            if (r15 <= 0) goto L_0x02e6
            goto L_0x02f3
        L_0x02e6:
            r10 = 1073741824(0x40000000, float:2.0)
            r15 = 0
            goto L_0x02f5
        L_0x02ea:
            int r10 = r13.getMeasuredHeight()
            int r10 = r10 + r15
            if (r10 >= 0) goto L_0x02f2
            r10 = 0
        L_0x02f2:
            r15 = r10
        L_0x02f3:
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x02f5:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r9, r15)
            int r9 = r13.getMeasuredState()
            r9 = r9 & -256(0xffffffffffffff00, float:NaN)
            int r1 = android.view.View.combineMeasuredStates(r1, r9)
            r9 = r34
            r10 = r35
            goto L_0x030e
        L_0x030b:
            r10 = r11
            r11 = r41
        L_0x030e:
            int r15 = r14.leftMargin
            r36 = r1
            int r1 = r14.rightMargin
            int r15 = r15 + r1
            int r1 = r13.getMeasuredWidth()
            int r1 = r1 + r15
            int r5 = java.lang.Math.max(r5, r1)
            r37 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x032d
            int r1 = r14.width
            r38 = r3
            r3 = -1
            if (r1 != r3) goto L_0x0330
            r1 = 1
            goto L_0x0331
        L_0x032d:
            r38 = r3
            r3 = -1
        L_0x0330:
            r1 = 0
        L_0x0331:
            if (r1 == 0) goto L_0x0334
            goto L_0x0336
        L_0x0334:
            r15 = r37
        L_0x0336:
            int r1 = java.lang.Math.max(r8, r15)
            if (r19 == 0) goto L_0x0342
            int r8 = r14.width
            if (r8 != r3) goto L_0x0342
            r8 = 1
            goto L_0x0343
        L_0x0342:
            r8 = 0
        L_0x0343:
            int r15 = r7.mTotalLength
            int r18 = r13.getMeasuredHeight()
            int r18 = r15 + r18
            int r3 = r14.topMargin
            int r18 = r18 + r3
            int r3 = r14.bottomMargin
            int r18 = r18 + r3
            int r3 = r7.getNextLocationOffset(r13)
            int r3 = r18 + r3
            int r3 = java.lang.Math.max(r15, r3)
            r7.mTotalLength = r3
            r19 = r8
            r8 = r1
            r1 = r36
            goto L_0x036a
        L_0x0365:
            r38 = r3
            r10 = r11
            r11 = r41
        L_0x036a:
            int r0 = r0 + 1
            r11 = r10
            r3 = r38
            r10 = 0
            goto L_0x029d
        L_0x0372:
            r11 = r41
            int r0 = r7.mTotalLength
            int r3 = r40.getPaddingTop()
            int r9 = r40.getPaddingBottom()
            int r3 = r3 + r9
            int r0 = r0 + r3
            r7.mTotalLength = r0
            r0 = r8
        L_0x0383:
            if (r19 != 0) goto L_0x038a
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x038a
            goto L_0x038b
        L_0x038a:
            r0 = r5
        L_0x038b:
            int r3 = r40.getPaddingLeft()
            int r5 = r40.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            int r3 = r40.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r1)
            r7.setMeasuredDimension(r0, r4)
            if (r20 == 0) goto L_0x03a9
            r7.forceUniformWidth(r2, r6)
        L_0x03a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.measureVertical(int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03c5, code lost:
        if (r5 < 0) goto L_0x03be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void measureHorizontal(int r44, int r45) {
        /*
            r43 = this;
            r7 = r43
            r8 = r44
            r9 = r45
            r10 = 0
            r7.mTotalLength = r10
            int r11 = r43.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r44)
            int r13 = android.view.View.MeasureSpec.getMode(r45)
            int[] r0 = r7.mMaxAscent
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.mMaxDescent
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.mMaxAscent = r0
            int[] r0 = new int[r14]
            r7.mMaxDescent = r0
        L_0x0026:
            int[] r15 = r7.mMaxAscent
            int[] r6 = r7.mMaxDescent
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.mBaselineAligned
            boolean r3 = r7.mUseLargestChild
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x004c
            r19 = 1
            goto L_0x004e
        L_0x004c:
            r19 = 0
        L_0x004e:
            r20 = 0
            r0 = 0
            r1 = 0
            r14 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 1
            r27 = 0
        L_0x0061:
            r28 = r6
            r5 = 8
            if (r1 >= r11) goto L_0x0212
            android.view.View r6 = r7.getVirtualChildAt(r1)
            if (r6 != 0) goto L_0x0081
            int r5 = r7.mTotalLength
            int r6 = r7.measureNullChild(r1)
            int r5 = r5 + r6
            r7.mTotalLength = r5
            r30 = r0
            r0 = r1
            r31 = r3
            r35 = r4
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x01ff
        L_0x0081:
            int r10 = r6.getVisibility()
            if (r10 == r5) goto L_0x01e5
            boolean r5 = r7.hasDividerBeforeChildAt(r1)
            if (r5 == 0) goto L_0x0094
            int r5 = r7.mTotalLength
            int r10 = r7.mDividerWidth
            int r5 = r5 + r10
            r7.mTotalLength = r5
        L_0x0094:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r10 = r5
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r10 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r10
            float r5 = r10.weight
            float r30 = r0 + r5
            if (r12 != r2) goto L_0x00ea
            int r0 = r10.width
            if (r0 != 0) goto L_0x00ea
            float r0 = r10.weight
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ea
            if (r19 == 0) goto L_0x00b8
            int r0 = r7.mTotalLength
            int r5 = r10.leftMargin
            int r2 = r10.rightMargin
            int r5 = r5 + r2
            int r0 = r0 + r5
            r7.mTotalLength = r0
            goto L_0x00c6
        L_0x00b8:
            int r0 = r7.mTotalLength
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r5 = r10.rightMargin
            int r2 = r2 + r5
            int r0 = java.lang.Math.max(r0, r2)
            r7.mTotalLength = r0
        L_0x00c6:
            if (r4 == 0) goto L_0x00db
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r2, r2)
            r33 = r1
            r31 = r3
            r35 = r4
            r3 = r6
            r29 = -2
            goto L_0x0165
        L_0x00db:
            r33 = r1
            r31 = r3
            r35 = r4
            r3 = r6
            r1 = 1073741824(0x40000000, float:2.0)
            r22 = 1
            r29 = -2
            goto L_0x0167
        L_0x00ea:
            int r0 = r10.width
            if (r0 != 0) goto L_0x00f9
            float r0 = r10.weight
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f9
            r5 = -2
            r10.width = r5
            r2 = 0
            goto L_0x00fc
        L_0x00f9:
            r5 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00fc:
            int r0 = (r30 > r20 ? 1 : (r30 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x0105
            int r0 = r7.mTotalLength
            r29 = r0
            goto L_0x0107
        L_0x0105:
            r29 = 0
        L_0x0107:
            r32 = 0
            r0 = r43
            r33 = r1
            r1 = r6
            r34 = r2
            r2 = r33
            r31 = r3
            r3 = r44
            r35 = r4
            r4 = r29
            r9 = -1
            r29 = -2
            r5 = r45
            r36 = r6
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r32
            r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6)
            r0 = r34
            if (r0 == r9) goto L_0x012e
            r10.width = r0
        L_0x012e:
            int r0 = r36.getMeasuredWidth()
            if (r19 == 0) goto L_0x0147
            int r1 = r7.mTotalLength
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            r3 = r36
            int r4 = r7.getNextLocationOffset(r3)
            int r2 = r2 + r4
            int r1 = r1 + r2
            r7.mTotalLength = r1
            goto L_0x015e
        L_0x0147:
            r3 = r36
            int r1 = r7.mTotalLength
            int r2 = r1 + r0
            int r4 = r10.leftMargin
            int r2 = r2 + r4
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r7.getNextLocationOffset(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.mTotalLength = r1
        L_0x015e:
            if (r31 == 0) goto L_0x0165
            int r0 = java.lang.Math.max(r0, r14)
            r14 = r0
        L_0x0165:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x0167:
            if (r13 == r1) goto L_0x0172
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x0172
            r0 = 1
            r27 = 1
            goto L_0x0173
        L_0x0172:
            r0 = 0
        L_0x0173:
            int r2 = r10.topMargin
            int r4 = r10.bottomMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r3.getMeasuredState()
            r6 = r25
            int r25 = android.view.View.combineMeasuredStates(r6, r5)
            if (r35 == 0) goto L_0x01b3
            int r5 = r3.getBaseline()
            r6 = -1
            if (r5 == r6) goto L_0x01b3
            int r6 = r10.gravity
            if (r6 >= 0) goto L_0x0197
            int r6 = r7.mGravity
            goto L_0x0199
        L_0x0197:
            int r6 = r10.gravity
        L_0x0199:
            r6 = r6 & 112(0x70, float:1.57E-43)
            r9 = 4
            int r6 = r6 >> r9
            r6 = r6 & -2
            int r6 = r6 >> 1
            r9 = r15[r6]
            int r9 = java.lang.Math.max(r9, r5)
            r15[r6] = r9
            r9 = r28[r6]
            int r5 = r4 - r5
            int r5 = java.lang.Math.max(r9, r5)
            r28[r6] = r5
        L_0x01b3:
            r5 = r21
            int r21 = java.lang.Math.max(r5, r4)
            if (r26 == 0) goto L_0x01c3
            int r5 = r10.height
            r6 = -1
            if (r5 != r6) goto L_0x01c3
            r26 = 1
            goto L_0x01c5
        L_0x01c3:
            r26 = 0
        L_0x01c5:
            float r5 = r10.weight
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x01d7
            if (r0 == 0) goto L_0x01d0
        L_0x01cd:
            r10 = r24
            goto L_0x01d2
        L_0x01d0:
            r2 = r4
            goto L_0x01cd
        L_0x01d2:
            int r24 = java.lang.Math.max(r10, r2)
            goto L_0x01f8
        L_0x01d7:
            r10 = r24
            if (r0 == 0) goto L_0x01dc
            r4 = r2
        L_0x01dc:
            r2 = r23
            int r23 = java.lang.Math.max(r2, r4)
            r24 = r10
            goto L_0x01f8
        L_0x01e5:
            r33 = r1
            r31 = r3
            r35 = r4
            r3 = r6
            r5 = r21
            r2 = r23
            r10 = r24
            r6 = r25
            r1 = 1073741824(0x40000000, float:2.0)
            r30 = r0
        L_0x01f8:
            r10 = r33
            int r0 = r7.getChildrenSkipCount(r3, r10)
            int r0 = r0 + r10
        L_0x01ff:
            int r0 = r0 + 1
            r1 = r0
            r6 = r28
            r0 = r30
            r3 = r31
            r4 = r35
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = -1
            r9 = r45
            r10 = 0
            goto L_0x0061
        L_0x0212:
            r31 = r3
            r35 = r4
            r3 = r21
            r2 = r23
            r10 = r24
            r6 = r25
            r1 = 1073741824(0x40000000, float:2.0)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r29 = -2
            int r4 = r7.mTotalLength
            if (r4 <= 0) goto L_0x0235
            boolean r4 = r7.hasDividerBeforeChildAt(r11)
            if (r4 == 0) goto L_0x0235
            int r4 = r7.mTotalLength
            int r1 = r7.mDividerWidth
            int r4 = r4 + r1
            r7.mTotalLength = r4
        L_0x0235:
            r1 = r15[r18]
            r4 = -1
            if (r1 != r4) goto L_0x024b
            r1 = 0
            r5 = r15[r1]
            if (r5 != r4) goto L_0x024b
            r1 = r15[r17]
            if (r1 != r4) goto L_0x024b
            r1 = r15[r16]
            if (r1 == r4) goto L_0x0248
            goto L_0x024b
        L_0x0248:
            r37 = r6
            goto L_0x027e
        L_0x024b:
            r1 = r15[r16]
            r4 = 0
            r5 = r15[r4]
            r9 = r15[r18]
            r4 = r15[r17]
            int r4 = java.lang.Math.max(r9, r4)
            int r4 = java.lang.Math.max(r5, r4)
            int r1 = java.lang.Math.max(r1, r4)
            r4 = r28[r16]
            r5 = 0
            r9 = r28[r5]
            r5 = r28[r18]
            r37 = r6
            r6 = r28[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = java.lang.Math.max(r9, r5)
            int r4 = java.lang.Math.max(r4, r5)
            int r1 = r1 + r4
            int r21 = java.lang.Math.max(r3, r1)
            r3 = r21
        L_0x027e:
            if (r31 == 0) goto L_0x02df
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r1) goto L_0x0286
            if (r12 != 0) goto L_0x02df
        L_0x0286:
            r1 = 0
            r7.mTotalLength = r1
            r1 = 0
        L_0x028a:
            if (r1 >= r11) goto L_0x02df
            android.view.View r4 = r7.getVirtualChildAt(r1)
            if (r4 != 0) goto L_0x029c
            int r4 = r7.mTotalLength
            int r5 = r7.measureNullChild(r1)
            int r4 = r4 + r5
            r7.mTotalLength = r4
            goto L_0x02a9
        L_0x029c:
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x02ac
            int r4 = r7.getChildrenSkipCount(r4, r1)
            int r1 = r1 + r4
        L_0x02a9:
            r38 = r1
            goto L_0x02dc
        L_0x02ac:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r5 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r5
            if (r19 == 0) goto L_0x02c5
            int r6 = r7.mTotalLength
            int r9 = r5.leftMargin
            int r9 = r9 + r14
            int r5 = r5.rightMargin
            int r9 = r9 + r5
            int r4 = r7.getNextLocationOffset(r4)
            int r9 = r9 + r4
            int r6 = r6 + r9
            r7.mTotalLength = r6
            goto L_0x02a9
        L_0x02c5:
            int r6 = r7.mTotalLength
            int r9 = r6 + r14
            r38 = r1
            int r1 = r5.leftMargin
            int r9 = r9 + r1
            int r1 = r5.rightMargin
            int r9 = r9 + r1
            int r1 = r7.getNextLocationOffset(r4)
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r6, r9)
            r7.mTotalLength = r1
        L_0x02dc:
            int r1 = r38 + 1
            goto L_0x028a
        L_0x02df:
            int r1 = r7.mTotalLength
            int r4 = r43.getPaddingLeft()
            int r5 = r43.getPaddingRight()
            int r4 = r4 + r5
            int r1 = r1 + r4
            r7.mTotalLength = r1
            int r1 = r7.mTotalLength
            int r4 = r43.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r4)
            r4 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r8, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r1
            int r5 = r7.mTotalLength
            int r4 = r4 - r5
            if (r22 != 0) goto L_0x034d
            if (r4 == 0) goto L_0x030c
            int r6 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r6 <= 0) goto L_0x030c
            goto L_0x034d
        L_0x030c:
            int r0 = java.lang.Math.max(r2, r10)
            if (r31 == 0) goto L_0x0347
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x0347
            r2 = 0
        L_0x0317:
            if (r2 >= r11) goto L_0x0347
            android.view.View r4 = r7.getVirtualChildAt(r2)
            if (r4 == 0) goto L_0x0344
            int r6 = r4.getVisibility()
            r9 = 8
            if (r6 == r9) goto L_0x0344
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r6 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r6
            float r6 = r6.weight
            int r6 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r6 <= 0) goto L_0x0344
            r6 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r6)
            int r10 = r4.getMeasuredHeight()
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r6)
            r4.measure(r9, r10)
        L_0x0344:
            int r2 = r2 + 1
            goto L_0x0317
        L_0x0347:
            r41 = r11
            r4 = r45
            goto L_0x04eb
        L_0x034d:
            float r3 = r7.mWeightSum
            int r3 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r3 <= 0) goto L_0x0355
            float r0 = r7.mWeightSum
        L_0x0355:
            r3 = -1
            r15[r16] = r3
            r15[r17] = r3
            r15[r18] = r3
            r6 = 0
            r15[r6] = r3
            r28[r16] = r3
            r28[r17] = r3
            r28[r18] = r3
            r28[r6] = r3
            r7.mTotalLength = r6
            r10 = r2
            r9 = r37
            r6 = -1
            r2 = r0
            r0 = 0
        L_0x036f:
            if (r0 >= r11) goto L_0x0492
            android.view.View r14 = r7.getVirtualChildAt(r0)
            if (r14 == 0) goto L_0x0481
            int r3 = r14.getVisibility()
            r5 = 8
            if (r3 == r5) goto L_0x0481
            android.view.ViewGroup$LayoutParams r3 = r14.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r3 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r3
            float r5 = r3.weight
            int r21 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r21 <= 0) goto L_0x03e1
            float r8 = (float) r4
            float r8 = r8 * r5
            float r8 = r8 / r2
            int r8 = (int) r8
            float r2 = r2 - r5
            int r4 = r4 - r8
            int r5 = r43.getPaddingTop()
            int r21 = r43.getPaddingBottom()
            int r5 = r5 + r21
            r39 = r2
            int r2 = r3.topMargin
            int r5 = r5 + r2
            int r2 = r3.bottomMargin
            int r5 = r5 + r2
            int r2 = r3.height
            r40 = r4
            r41 = r11
            r4 = r45
            r11 = -1
            int r2 = getChildMeasureSpec(r4, r5, r2)
            int r5 = r3.width
            if (r5 != 0) goto L_0x03c0
            r5 = 1073741824(0x40000000, float:2.0)
            if (r12 == r5) goto L_0x03ba
            goto L_0x03c0
        L_0x03ba:
            if (r8 <= 0) goto L_0x03be
            r5 = r8
            goto L_0x03c8
        L_0x03be:
            r5 = 0
            goto L_0x03c8
        L_0x03c0:
            int r5 = r14.getMeasuredWidth()
            int r5 = r5 + r8
            if (r5 >= 0) goto L_0x03c8
            goto L_0x03be
        L_0x03c8:
            r8 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            r14.measure(r5, r2)
            int r2 = r14.getMeasuredState()
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r5
            int r9 = android.view.View.combineMeasuredStates(r9, r2)
            r2 = r39
            r5 = r40
            goto L_0x03e7
        L_0x03e1:
            r5 = r4
            r41 = r11
            r4 = r45
            r11 = -1
        L_0x03e7:
            if (r19 == 0) goto L_0x0406
            int r8 = r7.mTotalLength
            int r21 = r14.getMeasuredWidth()
            int r11 = r3.leftMargin
            int r21 = r21 + r11
            int r11 = r3.rightMargin
            int r21 = r21 + r11
            int r11 = r7.getNextLocationOffset(r14)
            int r21 = r21 + r11
            int r8 = r8 + r21
            r7.mTotalLength = r8
            r42 = r2
        L_0x0403:
            r2 = 1073741824(0x40000000, float:2.0)
            goto L_0x0421
        L_0x0406:
            int r8 = r7.mTotalLength
            int r11 = r14.getMeasuredWidth()
            int r11 = r11 + r8
            r42 = r2
            int r2 = r3.leftMargin
            int r11 = r11 + r2
            int r2 = r3.rightMargin
            int r11 = r11 + r2
            int r2 = r7.getNextLocationOffset(r14)
            int r11 = r11 + r2
            int r2 = java.lang.Math.max(r8, r11)
            r7.mTotalLength = r2
            goto L_0x0403
        L_0x0421:
            if (r13 == r2) goto L_0x042a
            int r2 = r3.height
            r8 = -1
            if (r2 != r8) goto L_0x042a
            r2 = 1
            goto L_0x042b
        L_0x042a:
            r2 = 0
        L_0x042b:
            int r8 = r3.topMargin
            int r11 = r3.bottomMargin
            int r8 = r8 + r11
            int r11 = r14.getMeasuredHeight()
            int r11 = r11 + r8
            int r6 = java.lang.Math.max(r6, r11)
            if (r2 == 0) goto L_0x043c
            goto L_0x043d
        L_0x043c:
            r8 = r11
        L_0x043d:
            int r2 = java.lang.Math.max(r10, r8)
            if (r26 == 0) goto L_0x044a
            int r8 = r3.height
            r10 = -1
            if (r8 != r10) goto L_0x044b
            r8 = 1
            goto L_0x044c
        L_0x044a:
            r10 = -1
        L_0x044b:
            r8 = 0
        L_0x044c:
            if (r35 == 0) goto L_0x0479
            int r14 = r14.getBaseline()
            if (r14 == r10) goto L_0x0479
            int r10 = r3.gravity
            if (r10 >= 0) goto L_0x045b
            int r3 = r7.mGravity
            goto L_0x045d
        L_0x045b:
            int r3 = r3.gravity
        L_0x045d:
            r3 = r3 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r3 = r3 >> 4
            r3 = r3 & -2
            int r3 = r3 >> 1
            r10 = r15[r3]
            int r10 = java.lang.Math.max(r10, r14)
            r15[r3] = r10
            r10 = r28[r3]
            int r11 = r11 - r14
            int r10 = java.lang.Math.max(r10, r11)
            r28[r3] = r10
            goto L_0x047b
        L_0x0479:
            r21 = 4
        L_0x047b:
            r10 = r2
            r26 = r8
            r2 = r42
            goto L_0x0488
        L_0x0481:
            r5 = r4
            r41 = r11
            r4 = r45
            r21 = 4
        L_0x0488:
            int r0 = r0 + 1
            r4 = r5
            r11 = r41
            r3 = -1
            r8 = r44
            goto L_0x036f
        L_0x0492:
            r41 = r11
            r4 = r45
            int r0 = r7.mTotalLength
            int r2 = r43.getPaddingLeft()
            int r3 = r43.getPaddingRight()
            int r2 = r2 + r3
            int r0 = r0 + r2
            r7.mTotalLength = r0
            r0 = r15[r18]
            r2 = -1
            if (r0 != r2) goto L_0x04b9
            r0 = 0
            r3 = r15[r0]
            if (r3 != r2) goto L_0x04b9
            r0 = r15[r17]
            if (r0 != r2) goto L_0x04b9
            r0 = r15[r16]
            if (r0 == r2) goto L_0x04b7
            goto L_0x04b9
        L_0x04b7:
            r3 = r6
            goto L_0x04e8
        L_0x04b9:
            r0 = r15[r16]
            r2 = 0
            r3 = r15[r2]
            r5 = r15[r18]
            r8 = r15[r17]
            int r5 = java.lang.Math.max(r5, r8)
            int r3 = java.lang.Math.max(r3, r5)
            int r0 = java.lang.Math.max(r0, r3)
            r3 = r28[r16]
            r2 = r28[r2]
            r5 = r28[r18]
            r8 = r28[r17]
            int r5 = java.lang.Math.max(r5, r8)
            int r2 = java.lang.Math.max(r2, r5)
            int r2 = java.lang.Math.max(r3, r2)
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r6, r0)
            r3 = r0
        L_0x04e8:
            r37 = r9
            r0 = r10
        L_0x04eb:
            if (r26 != 0) goto L_0x04f2
            r2 = 1073741824(0x40000000, float:2.0)
            if (r13 == r2) goto L_0x04f2
            goto L_0x04f3
        L_0x04f2:
            r0 = r3
        L_0x04f3:
            int r2 = r43.getPaddingTop()
            int r3 = r43.getPaddingBottom()
            int r2 = r2 + r3
            int r0 = r0 + r2
            int r2 = r43.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r37 & r2
            r1 = r1 | r2
            int r2 = r37 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r4, r2)
            r7.setMeasuredDimension(r1, r0)
            if (r27 == 0) goto L_0x051c
            r1 = r41
            r0 = r44
            r7.forceUniformHeight(r1, r0)
        L_0x051c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.measureHorizontal(int, int):void");
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mGravity = 8388659;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R$styleable.LinearLayoutCompat, i, 0);
        int i2 = obtainStyledAttributes.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = obtainStyledAttributes.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = obtainStyledAttributes.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.mWeightSum = obtainStyledAttributes.getFloat(4, -1.0f);
        this.mBaselineAlignedChildIndex = obtainStyledAttributes.getInt(3, -1);
        this.mUseLargestChild = obtainStyledAttributes.getBoolean(7, false);
        setDividerDrawable(obtainStyledAttributes.getDrawable(5));
        this.mShowDividers = obtainStyledAttributes.getInt(8, 0);
        this.mDividerPadding = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    public void layoutVertical(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i8 = this.mGravity & SearchJediMixFeedAdapter.f42516e;
        int i9 = this.mGravity & 8388615;
        if (i8 == 16) {
            i5 = (((i4 - i2) - this.mTotalLength) / 2) + getPaddingTop();
        } else if (i8 != 80) {
            i5 = getPaddingTop();
        } else {
            i5 = ((getPaddingTop() + i4) - i2) - this.mTotalLength;
        }
        int i10 = 0;
        while (i10 < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i10);
            if (virtualChildAt == null) {
                i5 += measureNullChild(i10);
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                int i11 = layoutParams.gravity;
                if (i11 < 0) {
                    i11 = i9;
                }
                int absoluteGravity = GravityCompat.getAbsoluteGravity(i11, ViewCompat.getLayoutDirection(this)) & 7;
                if (absoluteGravity == 1) {
                    i6 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + layoutParams.leftMargin) - layoutParams.rightMargin;
                } else if (absoluteGravity != 5) {
                    i6 = layoutParams.leftMargin + paddingLeft;
                } else {
                    i6 = (paddingRight - measuredWidth) - layoutParams.rightMargin;
                }
                int i12 = i6;
                if (hasDividerBeforeChildAt(i10)) {
                    i5 += this.mDividerHeight;
                }
                int i13 = i5 + layoutParams.topMargin;
                setChildFrame(virtualChildAt, i12, i13 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                i10 += getChildrenSkipCount(virtualChildAt, i10);
                i5 = i13 + measuredHeight + layoutParams.bottomMargin + getNextLocationOffset(virtualChildAt);
            }
            i10++;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void layoutHorizontal(int r28, int r29, int r30, int r31) {
        /*
            r27 = this;
            r6 = r27
            boolean r2 = android.support.v7.widget.ViewUtils.isLayoutRtl(r27)
            int r7 = r27.getPaddingTop()
            int r3 = r31 - r29
            int r4 = r27.getPaddingBottom()
            int r8 = r3 - r4
            int r3 = r3 - r7
            int r4 = r27.getPaddingBottom()
            int r9 = r3 - r4
            int r10 = r27.getVirtualChildCount()
            int r3 = r6.mGravity
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r4
            int r4 = r6.mGravity
            r11 = r4 & 112(0x70, float:1.57E-43)
            boolean r12 = r6.mBaselineAligned
            int[] r13 = r6.mMaxAscent
            int[] r14 = r6.mMaxDescent
            int r4 = android.support.v4.view.ViewCompat.getLayoutDirection(r27)
            int r3 = android.support.v4.view.GravityCompat.getAbsoluteGravity(r3, r4)
            r15 = 2
            r5 = 1
            if (r3 == r5) goto L_0x004e
            r4 = 5
            if (r3 == r4) goto L_0x0041
            int r0 = r27.getPaddingLeft()
            goto L_0x0059
        L_0x0041:
            int r3 = r27.getPaddingLeft()
            int r3 = r3 + r30
            int r3 = r3 - r28
            int r0 = r6.mTotalLength
            int r0 = r3 - r0
            goto L_0x0059
        L_0x004e:
            int r3 = r27.getPaddingLeft()
            int r0 = r30 - r28
            int r1 = r6.mTotalLength
            int r0 = r0 - r1
            int r0 = r0 / r15
            int r0 = r0 + r3
        L_0x0059:
            r1 = 0
            if (r2 == 0) goto L_0x0063
            int r2 = r10 + -1
            r16 = r2
            r17 = -1
            goto L_0x0067
        L_0x0063:
            r16 = 0
            r17 = 1
        L_0x0067:
            r3 = 0
        L_0x0068:
            if (r3 >= r10) goto L_0x014b
            int r1 = r17 * r3
            int r2 = r16 + r1
            android.view.View r1 = r6.getVirtualChildAt(r2)
            if (r1 != 0) goto L_0x0085
            int r1 = r6.measureNullChild(r2)
            int r0 = r0 + r1
        L_0x0079:
            r26 = r7
            r23 = r10
            r24 = r11
            r18 = 1
            r20 = -1
            goto L_0x013f
        L_0x0085:
            int r5 = r1.getVisibility()
            r15 = 8
            if (r5 == r15) goto L_0x013b
            int r15 = r1.getMeasuredWidth()
            int r5 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r20 = r1.getLayoutParams()
            r4 = r20
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r4 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r4
            if (r12 == 0) goto L_0x00ad
            r22 = r3
            int r3 = r4.height
            r23 = r10
            r10 = -1
            if (r3 == r10) goto L_0x00b1
            int r3 = r1.getBaseline()
            goto L_0x00b2
        L_0x00ad:
            r22 = r3
            r23 = r10
        L_0x00b1:
            r3 = -1
        L_0x00b2:
            int r10 = r4.gravity
            if (r10 >= 0) goto L_0x00b7
            r10 = r11
        L_0x00b7:
            r10 = r10 & 112(0x70, float:1.57E-43)
            r24 = r11
            r11 = 16
            if (r10 == r11) goto L_0x00f6
            r11 = 48
            if (r10 == r11) goto L_0x00e3
            r11 = 80
            if (r10 == r11) goto L_0x00cc
            r3 = r7
            r11 = -1
        L_0x00c9:
            r18 = 1
            goto L_0x0104
        L_0x00cc:
            int r10 = r8 - r5
            int r11 = r4.bottomMargin
            int r10 = r10 - r11
            r11 = -1
            if (r3 == r11) goto L_0x00e1
            int r20 = r1.getMeasuredHeight()
            int r20 = r20 - r3
            r3 = 2
            r21 = r14[r3]
            int r21 = r21 - r20
            int r10 = r10 - r21
        L_0x00e1:
            r3 = r10
            goto L_0x00c9
        L_0x00e3:
            r11 = -1
            int r10 = r4.topMargin
            int r10 = r10 + r7
            if (r3 == r11) goto L_0x00f2
            r18 = 1
            r20 = r13[r18]
            int r20 = r20 - r3
            int r10 = r10 + r20
            goto L_0x00f4
        L_0x00f2:
            r18 = 1
        L_0x00f4:
            r3 = r10
            goto L_0x0104
        L_0x00f6:
            r11 = -1
            r18 = 1
            int r3 = r9 - r5
            r10 = 2
            int r3 = r3 / r10
            int r3 = r3 + r7
            int r10 = r4.topMargin
            int r3 = r3 + r10
            int r10 = r4.bottomMargin
            int r3 = r3 - r10
        L_0x0104:
            boolean r10 = r6.hasDividerBeforeChildAt(r2)
            if (r10 == 0) goto L_0x010d
            int r10 = r6.mDividerWidth
            int r0 = r0 + r10
        L_0x010d:
            int r10 = r4.leftMargin
            int r10 = r10 + r0
            int r0 = r6.getLocationOffset(r1)
            int r19 = r10 + r0
            r0 = r27
            r25 = r1
            r11 = r2
            r2 = r19
            r19 = r22
            r26 = r7
            r20 = -1
            r7 = r4
            r4 = r15
            r0.setChildFrame(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r15 = r15 + r0
            r0 = r25
            int r1 = r6.getNextLocationOffset(r0)
            int r15 = r15 + r1
            int r10 = r10 + r15
            int r0 = r6.getChildrenSkipCount(r0, r11)
            int r3 = r19 + r0
            r0 = r10
            goto L_0x013f
        L_0x013b:
            r19 = r3
            goto L_0x0079
        L_0x013f:
            int r3 = r3 + 1
            r10 = r23
            r11 = r24
            r7 = r26
            r5 = 1
            r15 = 2
            goto L_0x0068
        L_0x014b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.layoutHorizontal(int, int, int, int):void");
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }
}
