package com.bytedance.android.live.uikit.recyclerview;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class DividerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8570a;

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f8571d = {16843284};

    /* renamed from: b  reason: collision with root package name */
    protected Drawable f8572b;

    /* renamed from: c  reason: collision with root package name */
    public int f8573c;

    /* renamed from: e  reason: collision with root package name */
    private int f8574e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f8575f;
    private boolean g;

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        Canvas canvas2 = canvas;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2, state}, this, f8570a, false, 2111, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2, state}, this, f8570a, false, 2111, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        if (this.f8574e == 1) {
            if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2}, this, f8570a, false, 2112, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2}, this, f8570a, false, 2112, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
            } else {
                int paddingLeft = recyclerView.getPaddingLeft();
                int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                int childCount = recyclerView.getChildCount();
                if (!this.g) {
                    childCount--;
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView2.getChildAt(i);
                    int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                    this.f8572b.setBounds(paddingLeft, bottom, width, (this.f8572b.getIntrinsicHeight() + bottom) - 1);
                    this.f8572b.draw(canvas);
                }
                if (this.f8575f) {
                    View childAt2 = recyclerView2.getChildAt(0);
                    if (recyclerView2.getChildPosition(childAt2) == 0) {
                        int top = childAt2.getTop() - ((RecyclerView.LayoutParams) childAt2.getLayoutParams()).topMargin;
                        this.f8572b.setBounds(paddingLeft, (top - this.f8572b.getIntrinsicHeight()) + 1, width, top);
                        this.f8572b.draw(canvas);
                    }
                }
            }
        } else {
            if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2}, this, f8570a, false, 2113, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2}, this, f8570a, false, 2113, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
                return;
            }
            int paddingTop = recyclerView.getPaddingTop();
            int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            int childCount2 = recyclerView.getChildCount();
            if (!this.g) {
                childCount2--;
            }
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt3 = recyclerView2.getChildAt(i2);
                int right = childAt3.getRight() + ((RecyclerView.LayoutParams) childAt3.getLayoutParams()).rightMargin;
                this.f8572b.setBounds(right, paddingTop, this.f8572b.getIntrinsicHeight() + right, height);
                this.f8572b.draw(canvas);
            }
            if (this.f8575f) {
                View childAt4 = recyclerView2.getChildAt(0);
                if (recyclerView2.getChildPosition(childAt4) == 0) {
                    this.f8572b.setBounds(childAt4.getLeft() - ((RecyclerView.LayoutParams) childAt4.getLayoutParams()).leftMargin, paddingTop, this.f8572b.getIntrinsicHeight() + paddingTop, height);
                    this.f8572b.draw(canvas);
                }
            }
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f8570a, false, 2114, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f8570a, false, 2114, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
        if (!this.f8575f || childAdapterPosition != 0) {
            i = 0;
        } else {
            i = this.f8572b.getIntrinsicHeight();
        }
        if (this.f8574e == 1) {
            if (childAdapterPosition == 0) {
                i += (int) UIUtils.dip2Px(recyclerView.getContext(), (float) this.f8573c);
            }
            rect2.set(0, i, 0, this.f8572b.getIntrinsicHeight());
            return;
        }
        rect2.set(0, i, this.f8572b.getIntrinsicWidth(), 0);
    }
}
