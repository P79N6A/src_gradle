package com.ss.android.ugc.aweme.notification.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.ColorInt;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class RecyclerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58151a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f58152b = "RecyclerItemDecoration";

    /* renamed from: c  reason: collision with root package name */
    private final int f58153c;

    /* renamed from: d  reason: collision with root package name */
    private final int f58154d;

    /* renamed from: e  reason: collision with root package name */
    private final int f58155e;

    /* renamed from: f  reason: collision with root package name */
    private final Paint f58156f = new Paint();
    private int g;
    private int h;

    public RecyclerItemDecoration(int i, int i2, @ColorInt int i3) {
        this.f58156f.setAntiAlias(true);
        this.f58156f.setColor(0);
        this.f58153c = i;
        this.f58154d = i2;
        this.f58155e = i2;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        RecyclerView recyclerView2 = recyclerView;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{canvas, recyclerView2, state}, this, f58151a, false, 63334, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas, recyclerView2, state}, this, f58151a, false, 63334, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas, recyclerView, state);
        if (this.f58153c != 1) {
            if (!PatchProxy.isSupport(new Object[]{canvas, recyclerView2}, this, f58151a, false, 63336, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
                int childCount = recyclerView.getChildCount();
                int paddingTop = recyclerView.getPaddingTop();
                while (i < childCount) {
                    View childAt = recyclerView2.getChildAt(i);
                    if (childAt == null) {
                        break;
                    }
                    int height = childAt.getHeight() - recyclerView.getPaddingBottom();
                    int right = childAt.getRight() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).rightMargin;
                    canvas.drawRect((float) right, (float) paddingTop, (float) (this.f58155e + right), (float) height, this.f58156f);
                    i++;
                }
            } else {
                PatchProxy.accessDispatch(new Object[]{canvas, recyclerView2}, this, f58151a, false, 63336, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
            }
        } else {
            if (PatchProxy.isSupport(new Object[]{canvas, recyclerView2}, this, f58151a, false, 63335, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas, recyclerView2}, this, f58151a, false, 63335, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
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
                    canvas.drawRect((float) paddingLeft, (float) bottom, (float) width, (float) (this.f58155e + bottom), this.f58156f);
                    i++;
                }
            }
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f58151a, false, 63333, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f58151a, false, 63333, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int itemCount = state.getItemCount();
        int childLayoutPosition = recyclerView2.getChildLayoutPosition(view2);
        if (childLayoutPosition != -1 && (layoutManager instanceof LinearLayoutManager) && !(layoutManager instanceof GridLayoutManager)) {
            if (this.f58153c == 1) {
                if (childLayoutPosition == itemCount) {
                    rect2.set(0, 0, 0, 0);
                } else {
                    rect2.set(0, 0, 0, this.f58154d);
                }
            } else if (childLayoutPosition == itemCount) {
                rect2.set(0, 0, 0, 0);
            } else {
                rect2.set(0, 0, this.f58154d, 0);
            }
        }
    }
}
