package com.ss.android.ugc.aweme.im.sdk.widget;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52757a;

    /* renamed from: b  reason: collision with root package name */
    private int f52758b = 3;

    /* renamed from: c  reason: collision with root package name */
    private int f52759c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f52760d;

    public GridSpacingItemDecoration(int i, int i2, boolean z) {
        this.f52759c = i2;
        this.f52760d = true;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f52757a, false, 54090, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f52757a, false, 54090, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
        int i = childAdapterPosition % this.f52758b;
        if (this.f52760d) {
            int i2 = this.f52759c;
            rect2.left = i2 - ((i * i2) / this.f52758b);
            rect2.right = ((i + 1) * this.f52759c) / this.f52758b;
            if (childAdapterPosition < this.f52758b) {
                rect2.top = this.f52759c;
            }
            rect2.bottom = this.f52759c;
            return;
        }
        rect2.left = (this.f52759c * i) / this.f52758b;
        rect2.right = this.f52759c - (((i + 1) * this.f52759c) / this.f52758b);
        if (childAdapterPosition >= this.f52758b) {
            rect2.top = this.f52759c;
        }
    }
}
