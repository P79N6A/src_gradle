package com.ss.android.ugc.aweme.filter;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SpaceItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47457a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f47458b;

    /* renamed from: c  reason: collision with root package name */
    private int f47459c;

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f47457a, false, 44425, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f47457a, false, 44425, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        if (recyclerView2.getChildAdapterPosition(view2) == state.getItemCount() - 1) {
            if (!this.f47458b) {
                rect2.right = this.f47459c;
                return;
            }
            rect2.left = this.f47459c;
        }
    }
}
