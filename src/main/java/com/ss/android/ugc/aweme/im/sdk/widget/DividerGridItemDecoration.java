package com.ss.android.ugc.aweme.im.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class DividerGridItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52726a;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f52727b = {16843284};

    /* renamed from: c  reason: collision with root package name */
    private Drawable f52728c;

    public DividerGridItemDecoration(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f52727b);
        this.f52728c = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        Canvas canvas2 = canvas;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2, state}, this, f52726a, false, 54050, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2, state}, this, f52726a, false, 54050, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2}, this, f52726a, false, 54052, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2}, this, f52726a, false, 54052, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
        } else {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView2.getChildAt(i);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int bottom = childAt.getBottom() + layoutParams.bottomMargin;
                this.f52728c.setBounds(childAt.getLeft() - layoutParams.leftMargin, bottom, childAt.getRight() + layoutParams.rightMargin + this.f52728c.getIntrinsicWidth(), this.f52728c.getIntrinsicHeight() + bottom);
                this.f52728c.draw(canvas);
            }
        }
        if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2}, this, f52726a, false, 54053, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2}, this, f52726a, false, 54053, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
            return;
        }
        int childCount2 = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            View childAt2 = recyclerView2.getChildAt(i2);
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) childAt2.getLayoutParams();
            int top = childAt2.getTop() - layoutParams2.topMargin;
            int bottom2 = childAt2.getBottom() + layoutParams2.bottomMargin;
            int right = childAt2.getRight() + layoutParams2.rightMargin;
            this.f52728c.setBounds(right, top, this.f52728c.getIntrinsicWidth() + right, bottom2);
            this.f52728c.draw(canvas);
        }
    }

    public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
        int i2;
        boolean z;
        Rect rect2 = rect;
        int i3 = i;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{rect2, Integer.valueOf(i), recyclerView}, this, f52726a, false, 54056, new Class[]{Rect.class, Integer.TYPE, RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, Integer.valueOf(i), recyclerView}, this, f52726a, false, 54056, new Class[]{Rect.class, Integer.TYPE, RecyclerView.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f52726a, false, 54051, new Class[]{RecyclerView.class}, Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f52726a, false, 54051, new Class[]{RecyclerView.class}, Integer.TYPE)).intValue();
        } else {
            i2 = -1;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                i2 = ((GridLayoutManager) layoutManager).getSpanCount();
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                i2 = ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
            }
        }
        int i4 = i2;
        int itemCount = recyclerView.getAdapter().getItemCount();
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(itemCount)}, this, f52726a, false, 54055, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(itemCount)}, this, f52726a, false, 54055, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else {
            RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
            if (!(layoutManager2 instanceof GridLayoutManager) ? !(layoutManager2 instanceof StaggeredGridLayoutManager) || (((StaggeredGridLayoutManager) layoutManager2).getOrientation() != 1 ? (i3 + 1) % i4 != 0 : i3 < itemCount - (itemCount % i4)) : i3 < itemCount - (itemCount % i4)) {
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            rect2.set(0, 0, this.f52728c.getIntrinsicWidth(), 0);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(itemCount)}, this, f52726a, false, 54054, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(itemCount)}, this, f52726a, false, 54054, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else {
            RecyclerView.LayoutManager layoutManager3 = recyclerView.getLayoutManager();
            if (!(layoutManager3 instanceof GridLayoutManager) ? !(layoutManager3 instanceof StaggeredGridLayoutManager) || (((StaggeredGridLayoutManager) layoutManager3).getOrientation() != 1 ? i3 < itemCount - (itemCount % i4) : (i3 + 1) % i4 != 0) : (i3 + 1) % i4 != 0) {
                z2 = false;
            }
        }
        if (z2) {
            rect2.set(0, 0, 0, this.f52728c.getIntrinsicHeight());
        } else {
            rect2.set(0, 0, this.f52728c.getIntrinsicWidth(), this.f52728c.getIntrinsicHeight());
        }
    }
}
