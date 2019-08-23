package com.ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SpacesItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71381a;

    /* renamed from: b  reason: collision with root package name */
    private int f71382b;

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f71381a, false, 81423, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f71381a, false, 81423, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
        } else if (recyclerView2.getChildLayoutPosition(view2) == 0) {
            rect2.left = this.f71382b;
            rect2.right = this.f71382b / 2;
        } else if (recyclerView2.getChildLayoutPosition(view2) == recyclerView.getAdapter().getItemCount() - 1) {
            rect2.left = this.f71382b / 2;
            rect2.right = this.f71382b;
        } else {
            rect2.left = this.f71382b / 2;
            rect2.right = this.f71382b / 2;
        }
    }
}
