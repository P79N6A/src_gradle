package com.ss.android.ugc.aweme.challenge.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.comment.ui.CommentItemDecoration;

public class ChallengeItemDecoration extends CommentItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35506a;

    /* renamed from: b  reason: collision with root package name */
    int f35507b;

    /* renamed from: c  reason: collision with root package name */
    int f35508c;

    /* renamed from: d  reason: collision with root package name */
    int f35509d;

    /* renamed from: e  reason: collision with root package name */
    int f35510e;

    public ChallengeItemDecoration(Context context, int i) {
        super(context, 2130838327);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        Canvas canvas2 = canvas;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2, state}, this, f35506a, false, 26156, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2, state}, this, f35506a, false, 26156, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View childAt = recyclerView2.getChildAt(i);
            int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            this.g.setBounds(this.f35507b + paddingLeft, bottom, width - this.f35509d, this.g.getIntrinsicHeight() + bottom);
            this.g.draw(canvas2);
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f35506a, false, 26155, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            Object[] objArr = {rect2, view2, recyclerView2, state};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f35506a, false, 26155, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
        int intrinsicHeight = this.g.getIntrinsicHeight();
        if (childAdapterPosition == 0) {
            intrinsicHeight = 0;
        }
        rect2.set(0, intrinsicHeight, 0, 0);
    }
}
