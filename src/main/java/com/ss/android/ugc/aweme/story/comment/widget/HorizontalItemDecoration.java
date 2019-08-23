package com.ss.android.ugc.aweme.story.comment.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class HorizontalItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72323a;

    /* renamed from: b  reason: collision with root package name */
    private int f72324b;

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{canvas, recyclerView, state}, this, f72323a, false, 83071, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas, recyclerView, state}, this, f72323a, false, 83071, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas, recyclerView, state);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f72323a, false, 83072, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            Object[] objArr = {rect2, view2, recyclerView2, state};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f72323a, false, 83072, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        if (recyclerView2.getChildAdapterPosition(view2) != ((LinearLayoutManager) recyclerView.getLayoutManager()).getItemCount() - 1) {
            recyclerView2.getChildAdapterPosition(view2);
            rect2.right = (int) UIUtils.dip2Px(view.getContext(), (float) this.f72324b);
        }
    }
}
