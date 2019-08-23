package com.ss.android.ugc.aweme.friends.adapter;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class DividerItemDecorationWithMargin extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f48707a = {16843284};

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f48708d;

    /* renamed from: b  reason: collision with root package name */
    private Drawable f48709b;

    /* renamed from: c  reason: collision with root package name */
    private int f48710c;

    /* renamed from: e  reason: collision with root package name */
    private int f48711e;

    /* renamed from: f  reason: collision with root package name */
    private int f48712f;
    private int g;
    private int h;
    private final Rect i = new Rect();

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int i2;
        int i3;
        int i4;
        int i5;
        Canvas canvas2 = canvas;
        RecyclerView recyclerView2 = recyclerView;
        int i6 = 0;
        if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2, state}, this, f48708d, false, 46267, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2, state}, this, f48708d, false, 46267, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
        } else if (recyclerView.getLayoutManager() != null && this.f48709b != null) {
            if (this.h == 1) {
                if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2}, this, f48708d, false, 46268, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2}, this, f48708d, false, 46268, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
                } else {
                    canvas.save();
                    if (recyclerView.getClipToPadding()) {
                        i5 = recyclerView.getPaddingLeft();
                        i4 = recyclerView.getWidth() - recyclerView.getPaddingRight();
                        canvas2.clipRect(i5, recyclerView.getPaddingTop(), i4, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                    } else {
                        i4 = recyclerView.getWidth();
                        i5 = 0;
                    }
                    int childCount = recyclerView.getChildCount();
                    while (i6 < childCount) {
                        View childAt = recyclerView2.getChildAt(i6);
                        recyclerView2.getDecoratedBoundsWithMargins(childAt, this.i);
                        int round = this.i.bottom + Math.round(childAt.getTranslationY());
                        this.f48709b.setBounds(this.f48710c + i5, round - this.g, i4 - this.f48711e, round);
                        this.f48709b.draw(canvas2);
                        i6++;
                    }
                    canvas.restore();
                }
            } else {
                if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2}, this, f48708d, false, 46269, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2}, this, f48708d, false, 46269, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
                    return;
                }
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i3 = recyclerView.getPaddingTop();
                    i2 = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                    canvas2.clipRect(recyclerView.getPaddingLeft(), i3, recyclerView.getWidth() - recyclerView.getPaddingRight(), i2);
                } else {
                    i2 = recyclerView.getHeight();
                    i3 = 0;
                }
                int childCount2 = recyclerView.getChildCount();
                while (i6 < childCount2) {
                    View childAt2 = recyclerView2.getChildAt(i6);
                    recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, this.i);
                    int round2 = this.i.right + Math.round(childAt2.getTranslationX());
                    this.f48709b.setBounds(round2 - this.f48709b.getIntrinsicWidth(), i3, round2, i2);
                    this.f48709b.draw(canvas2);
                    i6++;
                }
                canvas.restore();
            }
        }
    }

    public DividerItemDecorationWithMargin(int i2, int i3, int i4, int i5) {
        this.f48709b = new ColorDrawable(i2);
        if (PatchProxy.isSupport(new Object[]{1}, this, f48708d, false, 46265, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{1}, this, f48708d, false, 46265, new Class[]{Integer.TYPE}, Void.TYPE);
        } else {
            this.h = 1;
        }
        this.f48710c = i3;
        this.f48711e = i4;
        this.f48712f = i5;
        this.g = i5;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f48708d, false, 46270, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f48708d, false, 46270, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
        } else if (this.f48709b == null) {
            rect2.set(0, 0, 0, 0);
        } else {
            recyclerView2.getChildAdapterPosition(view2);
            if (this.h == 1) {
                rect2.set(0, 0, 0, this.f48712f);
            } else {
                rect2.set(0, 0, this.g, 0);
            }
        }
    }
}
