package com.ss.android.ugc.aweme.poi.ui.publish;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class SpeedRecommendPoiView$1 extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60845a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ n f60846b;

    SpeedRecommendPoiView$1(n nVar) {
        this.f60846b = nVar;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f60845a, false, 66704, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f60845a, false, 66704, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
        if (childAdapterPosition == 0) {
            i = (int) UIUtils.dip2Px(this.f60846b.getContext(), 16.0f);
        } else {
            i = 0;
        }
        if (childAdapterPosition != recyclerView.getAdapter().getItemCount() - 1) {
            i2 = (int) UIUtils.dip2Px(this.f60846b.getContext(), 10.0f);
        } else {
            i2 = (int) UIUtils.dip2Px(this.f60846b.getContext(), 16.0f);
        }
        rect2.set(i, 0, i2, 0);
    }
}
