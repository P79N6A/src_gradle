package com.ss.android.ugc.aweme.friends.adapter;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class DividerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48701a;

    /* renamed from: b  reason: collision with root package name */
    int f48702b;

    /* renamed from: c  reason: collision with root package name */
    int f48703c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f48704d;

    /* renamed from: e  reason: collision with root package name */
    private int f48705e;

    /* renamed from: f  reason: collision with root package name */
    private int f48706f;
    private int g;
    private float h;
    private float i;

    public DividerItemDecoration(int i2, int i3, int i4) {
        this(i2, i3, 0, 0.0f, 0.0f);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        RecyclerView recyclerView2 = recyclerView;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{canvas, recyclerView2, state}, this, f48701a, false, 46261, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas, recyclerView2, state}, this, f48701a, false, 46261, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        if (this.g == 1) {
            if (PatchProxy.isSupport(new Object[]{canvas, recyclerView2}, this, f48701a, false, 46263, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas, recyclerView2}, this, f48701a, false, 46263, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
            } else {
                int measuredWidth = recyclerView.getMeasuredWidth();
                int childCount = recyclerView.getChildCount();
                int itemCount = recyclerView.getAdapter().getItemCount();
                while (i2 < childCount) {
                    View childAt = recyclerView2.getChildAt(i2);
                    int childAdapterPosition = recyclerView2.getChildAdapterPosition(childAt);
                    if (childAdapterPosition > 0 && childAdapterPosition < itemCount - 1 && childAdapterPosition != this.f48702b + 1) {
                        int top = childAt.getTop() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).topMargin;
                        float f2 = (float) (top + 1);
                        float f3 = (float) top;
                        canvas.drawRect(0.0f, f3, this.h + 0.0f, f2, this.f48704d);
                        float f4 = (float) measuredWidth;
                        canvas.drawRect(f4 - this.i, f3, f4, f2, this.f48704d);
                    }
                    i2++;
                }
            }
        } else {
            if (PatchProxy.isSupport(new Object[]{canvas, recyclerView2}, this, f48701a, false, 46262, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas, recyclerView2}, this, f48701a, false, 46262, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
                return;
            }
            int measuredHeight = recyclerView.getMeasuredHeight();
            int childCount2 = recyclerView.getChildCount();
            while (i2 < childCount2) {
                View childAt2 = recyclerView2.getChildAt(i2);
                int childAdapterPosition2 = recyclerView2.getChildAdapterPosition(childAt2);
                if (childAdapterPosition2 > 0 && childAdapterPosition2 < childCount2 - 1 && childAdapterPosition2 != this.f48702b + 1) {
                    int left = childAt2.getLeft() + ((RecyclerView.LayoutParams) childAt2.getLayoutParams()).leftMargin;
                    float f5 = (float) (left - this.f48706f);
                    canvas.drawRect(f5, 0.0f, f5, this.h + 0.0f, this.f48704d);
                    float f6 = (float) left;
                    float f7 = (float) measuredHeight;
                    canvas.drawRect(f6, f7 - this.i, f6, f7, this.f48704d);
                }
                i2++;
            }
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i2;
        int i3;
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f48701a, false, 46264, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f48701a, false, 46264, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
        if (this.g == 1) {
            if (childAdapterPosition == this.f48702b) {
                i3 = this.f48703c;
            } else {
                i3 = this.f48706f;
            }
            rect2.set(0, 0, 0, i3);
            return;
        }
        if (childAdapterPosition == this.f48702b) {
            i2 = this.f48703c;
        } else {
            i2 = this.f48706f;
        }
        rect2.set(0, 0, i2, 0);
    }

    private DividerItemDecoration(int i2, int i3, int i4, float f2, float f3) {
        this.f48702b = -1;
        this.f48705e = i2;
        this.f48706f = i3;
        this.g = i4;
        this.f48704d = new Paint(1);
        this.f48704d.setColor(this.f48705e);
        this.f48704d.setStyle(Paint.Style.FILL);
        this.h = 0.0f;
        this.i = 0.0f;
    }
}
