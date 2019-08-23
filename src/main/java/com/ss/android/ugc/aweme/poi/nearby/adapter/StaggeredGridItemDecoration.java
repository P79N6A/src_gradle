package com.ss.android.ugc.aweme.poi.nearby.adapter;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;

public class StaggeredGridItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f60011c;

    /* renamed from: a  reason: collision with root package name */
    private int f60012a;

    public StaggeredGridItemDecoration(int i) {
        this.f60012a = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView, state}, this, f60011c, false, 65215, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView, state}, this, f60011c, false, 65215, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
        } else if (!(view2 instanceof a)) {
            if (((StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams()).getSpanIndex() % 2 == 0) {
                rect2.left = u.a((double) this.f60012a);
                rect2.right = u.a(2.0d);
                return;
            }
            rect2.left = u.a(2.0d);
            rect2.right = u.a((double) this.f60012a);
        }
    }
}
