package com.ss.android.ugc.aweme.profile.ui;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SpaceItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62358a;

    /* renamed from: b  reason: collision with root package name */
    private int f62359b;

    public SpaceItemDecoration(int i) {
        this.f62359b = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f62358a, false, 69051, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            Object[] objArr = {rect2, view2, recyclerView2, state};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f62358a, false, 69051, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        if (recyclerView2.getChildPosition(view2) > 1) {
            rect2.top = this.f62359b;
        }
    }
}
