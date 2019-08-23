package com.ss.android.ugc.aweme.im.sdk.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.ColorInt;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ItemDivider extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52790a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f52791b;

    /* renamed from: c  reason: collision with root package name */
    private int f52792c;

    /* renamed from: d  reason: collision with root package name */
    private int f52793d;

    /* renamed from: e  reason: collision with root package name */
    private int f52794e;

    /* renamed from: f  reason: collision with root package name */
    private int f52795f;
    @ColorInt
    private int g;
    private Paint h;
    private final Rect i;

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int i2;
        int i3;
        int i4;
        int i5;
        Canvas canvas2 = canvas;
        RecyclerView recyclerView2 = recyclerView;
        int i6 = 0;
        if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2, state}, this, f52790a, false, 54138, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2, state}, this, f52790a, false, 54138, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
        } else if (recyclerView.getLayoutManager() != null) {
            if (this.f52794e == 1) {
                if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2}, this, f52790a, false, 54139, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2}, this, f52790a, false, 54139, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
                } else {
                    canvas.save();
                    if (recyclerView.getClipToPadding()) {
                        int paddingLeft = recyclerView.getPaddingLeft();
                        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                        canvas2.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                        i5 = paddingLeft;
                        i4 = width;
                    } else {
                        i4 = recyclerView.getWidth();
                        i5 = 0;
                    }
                    int childCount = recyclerView.getChildCount();
                    while (i6 < childCount) {
                        View childAt = recyclerView2.getChildAt(i6);
                        recyclerView2.getDecoratedBoundsWithMargins(childAt, this.i);
                        int round = this.i.bottom + Math.round(ViewCompat.getTranslationY(childAt));
                        canvas.drawRect((float) (this.f52795f + i5), (float) (round - this.f52793d), (float) (i4 - this.f52795f), (float) round, this.h);
                        if (i6 == 0 && this.f52791b) {
                            int round2 = this.i.top + Math.round(ViewCompat.getTranslationY(childAt));
                            canvas.drawRect((float) i5, (float) round2, (float) i4, (float) (round2 + this.f52793d), this.h);
                        }
                        i6++;
                    }
                    canvas.restore();
                }
            } else {
                if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2}, this, f52790a, false, 54140, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2}, this, f52790a, false, 54140, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
                    return;
                }
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    int paddingTop = recyclerView.getPaddingTop();
                    int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                    canvas2.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
                    i3 = paddingTop;
                    i2 = height;
                } else {
                    i2 = recyclerView.getHeight();
                    i3 = 0;
                }
                int childCount2 = recyclerView.getChildCount();
                while (i6 < childCount2) {
                    View childAt2 = recyclerView2.getChildAt(i6);
                    recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, this.i);
                    int round3 = this.i.right + Math.round(ViewCompat.getTranslationX(childAt2));
                    canvas.drawRect((float) (round3 - this.f52792c), (float) (this.f52795f + i3), (float) round3, (float) (i2 - this.f52795f), this.h);
                    i6++;
                }
                canvas.restore();
            }
        }
    }

    public ItemDivider(@ColorInt int i2, int i3, int i4, int i5) {
        this(i2, i3, 0, 1, true);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i2;
        Rect rect2 = rect;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView, state}, this, f52790a, false, 54141, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView, state}, this, f52790a, false, 54141, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        if (recyclerView.getLayoutManager().getPosition(view2) != 0) {
            i2 = 0;
        } else if (this.f52794e == 1) {
            i2 = this.f52793d;
        } else {
            i2 = this.f52792c;
        }
        if (this.f52794e == 1) {
            rect2.set(0, i2, 0, this.f52793d);
        } else {
            rect2.set(0, i2, this.f52792c, 0);
        }
    }

    private ItemDivider(@ColorInt int i2, int i3, int i4, int i5, boolean z) {
        this.f52791b = true;
        this.f52795f = 10;
        this.i = new Rect();
        this.g = i2;
        this.h = new Paint(1);
        this.h.setColor(this.g);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i5)}, this, f52790a, false, 54137, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i5)}, this, f52790a, false, 54137, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i5 == 0 || i5 == 1) {
            this.f52794e = i5;
        } else {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        if (i5 == 1) {
            this.f52793d = i3;
        } else if (i5 == 0) {
            this.f52792c = i3;
        }
        this.f52795f = i4;
        this.f52791b = true;
    }
}
