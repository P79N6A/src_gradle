package com.ss.android.ugc.aweme.discover.jedi.adapter;

import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter;

public class SearchGridSpacingItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42509a;

    /* renamed from: b  reason: collision with root package name */
    private int f42510b = 2;

    /* renamed from: c  reason: collision with root package name */
    private int f42511c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f42512d;

    public SearchGridSpacingItemDecoration(int i, int i2, boolean z) {
        this.f42511c = i2;
        this.f42512d = false;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f42509a, false, 36718, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f42509a, false, 36718, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if ((adapter instanceof RecyclerHeaderViewAdapter) && ((RecyclerHeaderViewAdapter) adapter).f35105d != null) {
            if (childAdapterPosition != 0) {
                childAdapterPosition++;
            } else {
                return;
            }
        }
        int spanIndex = ((GridLayoutManager) recyclerView.getLayoutManager()).getSpanSizeLookup().getSpanIndex(childAdapterPosition, this.f42510b);
        if (this.f42512d) {
            int i = this.f42511c;
            rect2.left = i - ((spanIndex * i) / this.f42510b);
            rect2.right = ((spanIndex + 1) * this.f42511c) / this.f42510b;
            if (childAdapterPosition < this.f42510b) {
                rect2.top = this.f42511c;
            }
            rect2.bottom = this.f42511c;
            return;
        }
        rect2.left = (this.f42511c * spanIndex) / this.f42510b;
        rect2.right = this.f42511c - (((spanIndex + 1) * this.f42511c) / this.f42510b);
        if (childAdapterPosition >= this.f42510b) {
            rect2.top = this.f42511c;
        }
    }
}
