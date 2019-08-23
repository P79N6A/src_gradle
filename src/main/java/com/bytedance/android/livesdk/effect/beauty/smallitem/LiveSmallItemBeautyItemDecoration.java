package com.bytedance.android.livesdk.effect.beauty.smallitem;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.android.live.core.utils.ac;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class LiveSmallItemBeautyItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13759a;

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f13759a, false, 8267, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            Object[] objArr = {rect2, view2, recyclerView2, state};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f13759a, false, 8267, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
        if (childAdapterPosition == 0) {
            rect2.set(ac.a(10.0f), 0, 0, 0);
            return;
        }
        if (childAdapterPosition == recyclerView.getAdapter().getItemCount() - 1) {
            rect2.set(0, 0, ac.a(10.0f), 0);
        }
    }
}
