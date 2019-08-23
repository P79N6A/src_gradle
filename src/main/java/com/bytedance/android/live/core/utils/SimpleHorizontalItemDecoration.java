package com.bytedance.android.live.core.utils;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SimpleHorizontalItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8194a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8195b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8196c;

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        if (PatchProxy.isSupport(new Object[]{rect2, view, recyclerView, state}, this, f8194a, false, 1265, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view, recyclerView, state}, this, f8194a, false, 1265, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        int i = this.f8195b / 2;
        int i2 = this.f8195b / 2;
        int viewLayoutPosition = ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
        if (viewLayoutPosition == 0) {
            i = this.f8196c;
        } else if (viewLayoutPosition == recyclerView.getAdapter().getItemCount() - 1) {
            i2 = this.f8196c;
        }
        rect.set(i, 0, i2, 0);
    }
}
