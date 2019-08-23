package com.bytedance.ies.uikit.recyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.ss.android.ugc.bytex.a.a.a;

public class DividerItemDecoration extends RecyclerView.ItemDecoration {
    private static final int[] ATTRS = {16843284};
    protected Drawable mDivider;
    private boolean mDrawFirstChildTopLine;
    private boolean mDrawLastChildBottomLine;
    private int mFirstOffset;
    private int mOrientation;

    public void setFirstOffset(int i) {
        this.mFirstOffset = i;
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            this.mOrientation = i;
            return;
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        if (!this.mDrawLastChildBottomLine) {
            childCount--;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int right = childAt.getRight() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).rightMargin;
            this.mDivider.setBounds(right, paddingTop, this.mDivider.getIntrinsicHeight() + right, height);
            this.mDivider.draw(canvas);
        }
        if (this.mDrawFirstChildTopLine) {
            View childAt2 = recyclerView.getChildAt(0);
            if (recyclerView.getChildPosition(childAt2) == 0) {
                this.mDivider.setBounds(childAt2.getLeft() - ((RecyclerView.LayoutParams) childAt2.getLayoutParams()).leftMargin, paddingTop, this.mDivider.getIntrinsicHeight() + paddingTop, height);
                this.mDivider.draw(canvas);
            }
        }
    }

    public void drawVertical(Canvas canvas, RecyclerView recyclerView) {
        int bottom;
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        if (!this.mDrawLastChildBottomLine) {
            childCount--;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            this.mDivider.setBounds(paddingLeft, bottom, width, (this.mDivider.getIntrinsicHeight() + (childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin)) - 1);
            this.mDivider.draw(canvas);
        }
        if (this.mDrawFirstChildTopLine) {
            View childAt2 = recyclerView.getChildAt(0);
            if (recyclerView.getChildPosition(childAt2) == 0) {
                int top = childAt2.getTop() - ((RecyclerView.LayoutParams) childAt2.getLayoutParams()).topMargin;
                this.mDivider.setBounds(paddingLeft, (top - this.mDivider.getIntrinsicHeight()) + 1, width, top);
                this.mDivider.draw(canvas);
            }
        }
    }

    public DividerItemDecoration(Context context, int i, int i2) {
        this(context, i, i2, false);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            drawVertical(canvas, recyclerView);
        } else {
            drawHorizontal(canvas, recyclerView);
        }
    }

    public DividerItemDecoration(Context context, int i, int i2, boolean z) {
        this(context, i, i2, z, true);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (!this.mDrawFirstChildTopLine || childAdapterPosition != 0) {
            i = 0;
        } else {
            i = this.mDivider.getIntrinsicHeight();
        }
        if (this.mOrientation == 1) {
            if (childAdapterPosition == 0) {
                i += (int) UIUtils.dip2Px(recyclerView.getContext(), (float) this.mFirstOffset);
            }
            rect.set(0, i, 0, this.mDivider.getIntrinsicHeight());
            return;
        }
        rect.set(0, i, this.mDivider.getIntrinsicWidth(), 0);
    }

    public DividerItemDecoration(Context context, int i, int i2, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ATTRS);
        this.mDivider = a.a(context.getResources(), i2);
        obtainStyledAttributes.recycle();
        setOrientation(i);
        this.mDrawFirstChildTopLine = z;
        this.mDrawLastChildBottomLine = z2;
    }
}
