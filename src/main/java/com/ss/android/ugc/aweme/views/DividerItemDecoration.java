package com.ss.android.ugc.aweme.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class DividerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76313a;

    /* renamed from: b  reason: collision with root package name */
    int f76314b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f76315c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f76316d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f76317e;

    /* renamed from: f  reason: collision with root package name */
    private int f76318f;
    private int g;
    private int h;
    private float i;
    private float j;

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        RecyclerView recyclerView2 = recyclerView;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{canvas, recyclerView2, state}, this, f76313a, false, 89444, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas, recyclerView2, state}, this, f76313a, false, 89444, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        if (this.h == 1) {
            if (PatchProxy.isSupport(new Object[]{canvas, recyclerView2}, this, f76313a, false, 89446, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas, recyclerView2}, this, f76313a, false, 89446, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
            } else {
                int measuredWidth = recyclerView.getMeasuredWidth();
                int childCount = recyclerView.getChildCount();
                while (i2 < childCount) {
                    View childAt = recyclerView2.getChildAt(i2);
                    int top = childAt.getTop() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).topMargin;
                    int i3 = top - this.g;
                    if (this.f76316d) {
                        canvas.drawRect(this.i + 0.0f, (float) i3, ((float) measuredWidth) - this.j, (float) top, this.f76317e);
                    } else {
                        float f2 = (float) top;
                        float f3 = (float) i3;
                        float f4 = f2;
                        canvas.drawRect(0.0f, f3, this.i, f4, this.f76317e);
                        float f5 = (float) measuredWidth;
                        canvas.drawRect(f5 - this.j, f3, f5, f4, this.f76317e);
                    }
                    i2++;
                }
            }
        } else {
            if (PatchProxy.isSupport(new Object[]{canvas, recyclerView2}, this, f76313a, false, 89445, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas, recyclerView2}, this, f76313a, false, 89445, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
                return;
            }
            int measuredHeight = recyclerView.getMeasuredHeight();
            int childCount2 = recyclerView.getChildCount();
            while (i2 < childCount2) {
                View childAt2 = recyclerView2.getChildAt(i2);
                int left = childAt2.getLeft() + ((RecyclerView.LayoutParams) childAt2.getLayoutParams()).leftMargin;
                int i4 = left - this.g;
                if (this.f76316d) {
                    canvas.drawRect((float) i4, this.i + 0.0f, (float) left, ((float) measuredHeight) - this.j, this.f76317e);
                } else {
                    float f6 = (float) left;
                    float f7 = (float) i4;
                    float f8 = f6;
                    canvas.drawRect(f7, this.i + 0.0f, f8, this.i, this.f76317e);
                    float f9 = (float) measuredHeight;
                    canvas.drawRect(f7, f9 - this.j, f8, f9, this.f76317e);
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
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f76313a, false, 89447, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f76313a, false, 89447, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
        if (this.h == 1) {
            if (childAdapterPosition == this.f76314b) {
                i3 = this.f76315c;
            } else {
                i3 = this.g;
            }
            rect2.set(0, 0, 0, i3);
            return;
        }
        if (childAdapterPosition == this.f76314b) {
            i2 = this.f76315c;
        } else {
            i2 = this.g;
        }
        rect2.set(0, 0, i2, 0);
    }

    public DividerItemDecoration(int i2, int i3, int i4, float f2, float f3, boolean z) {
        this.f76318f = i2;
        this.g = i3;
        this.h = i4;
        this.f76317e = new Paint(1);
        this.f76317e.setColor(this.f76318f);
        this.f76317e.setStyle(Paint.Style.FILL);
        this.i = f2;
        this.j = f3;
        this.f76316d = false;
    }
}
