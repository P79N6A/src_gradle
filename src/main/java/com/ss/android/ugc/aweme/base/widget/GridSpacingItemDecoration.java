package com.ss.android.ugc.aweme.base.widget;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.widget.baseadapter.HeaderAndFooterWrapper;

public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35097a;

    /* renamed from: b  reason: collision with root package name */
    private int f35098b;

    /* renamed from: c  reason: collision with root package name */
    private int f35099c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f35100d = false;

    public GridSpacingItemDecoration(int i, int i2, boolean z) {
        this.f35098b = i;
        this.f35099c = i2;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f35097a, false, 25428, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f35097a, false, 25428, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter instanceof RecyclerHeaderViewAdapter) {
            if (((RecyclerHeaderViewAdapter) adapter).f35105d != null) {
                if (childAdapterPosition != 0) {
                    childAdapterPosition++;
                } else {
                    return;
                }
            }
        } else if (adapter instanceof HeaderAndFooterWrapper) {
            int size = ((HeaderAndFooterWrapper) adapter).f71410b.size();
            if (childAdapterPosition >= size) {
                childAdapterPosition += size;
            } else {
                return;
            }
        }
        int i = childAdapterPosition % this.f35098b;
        if (this.f35100d) {
            int i2 = this.f35099c;
            rect2.left = i2 - ((i * i2) / this.f35098b);
            rect2.right = ((i + 1) * this.f35099c) / this.f35098b;
            if (childAdapterPosition < this.f35098b) {
                rect2.top = this.f35099c;
            }
            rect2.bottom = this.f35099c;
            return;
        }
        rect2.left = (this.f35099c * i) / this.f35098b;
        rect2.right = this.f35099c - (((i + 1) * this.f35099c) / this.f35098b);
        if (childAdapterPosition >= this.f35098b) {
            rect2.top = this.f35099c;
        }
    }
}
