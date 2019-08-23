package com.ss.android.ugc.aweme.account.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class RecyclerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33166a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f33167b = "RecyclerItemDecoration";

    /* renamed from: c  reason: collision with root package name */
    private final int f33168c;

    /* renamed from: d  reason: collision with root package name */
    private final int f33169d;

    /* renamed from: e  reason: collision with root package name */
    private final int f33170e;

    /* renamed from: f  reason: collision with root package name */
    private final Paint f33171f;
    private int g;
    private int h;

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        RecyclerView recyclerView2 = recyclerView;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{canvas, recyclerView2, state}, this, f33166a, false, 21526, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas, recyclerView2, state}, this, f33166a, false, 21526, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas, recyclerView, state);
        if (this.f33168c != 1) {
            if (!PatchProxy.isSupport(new Object[]{canvas, recyclerView2}, this, f33166a, false, 21528, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
                int childCount = recyclerView.getChildCount();
                int paddingTop = recyclerView.getPaddingTop();
                while (i < childCount) {
                    View childAt = recyclerView2.getChildAt(i);
                    if (childAt == null) {
                        break;
                    }
                    int height = childAt.getHeight() - recyclerView.getPaddingBottom();
                    int right = childAt.getRight() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).rightMargin;
                    canvas.drawRect((float) right, (float) paddingTop, (float) (this.f33170e + right), (float) height, this.f33171f);
                    i++;
                }
            } else {
                PatchProxy.accessDispatch(new Object[]{canvas, recyclerView2}, this, f33166a, false, 21528, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
            }
        } else {
            if (PatchProxy.isSupport(new Object[]{canvas, recyclerView2}, this, f33166a, false, 21527, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas, recyclerView2}, this, f33166a, false, 21527, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
            } else {
                int childCount2 = recyclerView.getChildCount();
                int paddingLeft = recyclerView.getPaddingLeft() + this.g;
                int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.h;
                while (i < childCount2) {
                    View childAt2 = recyclerView2.getChildAt(i);
                    if (childAt2 == null) {
                        break;
                    }
                    int bottom = childAt2.getBottom() + ((RecyclerView.LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                    canvas.drawRect((float) paddingLeft, (float) bottom, (float) width, (float) (this.f33170e + bottom), this.f33171f);
                    i++;
                }
            }
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f33166a, false, 21525, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f33166a, false, 21525, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int itemCount = state.getItemCount();
        int childLayoutPosition = recyclerView2.getChildLayoutPosition(view2);
        if (childLayoutPosition != -1 && (layoutManager instanceof LinearLayoutManager) && !(layoutManager instanceof GridLayoutManager)) {
            if (this.f33168c == 1) {
                if (childLayoutPosition == itemCount) {
                    rect2.set(0, 0, 0, 0);
                } else {
                    rect2.set(0, 0, 0, this.f33169d);
                }
            } else if (childLayoutPosition == itemCount) {
                rect2.set(0, 0, 0, 0);
            } else {
                rect2.set(0, 0, this.f33169d, 0);
            }
        }
    }
}
