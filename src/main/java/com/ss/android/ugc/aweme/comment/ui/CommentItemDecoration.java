package com.ss.android.ugc.aweme.comment.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.bytex.a.a.a;

public class CommentItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f36491f;

    /* renamed from: a  reason: collision with root package name */
    private final Rect f36492a = new Rect();
    protected Drawable g;
    protected int h;
    protected int i;

    public CommentItemDecoration(Context context, int i2) {
        this.g = a.a(context.getResources(), i2);
        this.h = context.getResources().getDimensionPixelOffset(C0906R.dimen.cr);
        this.i = context.getResources().getDimensionPixelOffset(C0906R.dimen.cs);
    }

    @TargetApi(21)
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int i2;
        int i3;
        Canvas canvas2 = canvas;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2, state}, this, f36491f, false, 27478, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2, state}, this, f36491f, false, 27478, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i3 = recyclerView.getPaddingLeft() + this.h;
            i2 = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.i;
            canvas.clipRect(i3, recyclerView.getPaddingTop(), i2, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i3 = this.h;
            i2 = recyclerView.getWidth() - this.i;
        }
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount - 1; i4++) {
            View childAt = recyclerView2.getChildAt(i4);
            recyclerView2.getDecoratedBoundsWithMargins(childAt, this.f36492a);
            int round = this.f36492a.bottom + Math.round(ViewCompat.getTranslationY(childAt));
            this.g.setBounds(i3, round - this.g.getIntrinsicHeight(), i2, round);
            this.g.draw(canvas);
        }
        canvas.restore();
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        if (PatchProxy.isSupport(new Object[]{rect2, view, recyclerView, state}, this, f36491f, false, 27477, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            Object[] objArr = {rect2, view, recyclerView, state};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f36491f, false, 27477, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        rect2.set(0, 0, 0, this.g.getIntrinsicHeight());
    }
}
