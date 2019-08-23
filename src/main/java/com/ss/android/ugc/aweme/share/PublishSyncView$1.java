package com.ss.android.ugc.aweme.share;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class PublishSyncView$1 extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64539a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ bs f64540b;

    PublishSyncView$1(bs bsVar) {
        this.f64540b = bsVar;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        if (PatchProxy.isSupport(new Object[]{rect2, view, recyclerView, state}, this, f64539a, false, 73231, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            Object[] objArr = {rect2, view, recyclerView, state};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f64539a, false, 73231, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        rect2.set(0, 0, (int) UIUtils.dip2Px(this.f64540b.getContext(), 4.0f), 0);
    }
}
