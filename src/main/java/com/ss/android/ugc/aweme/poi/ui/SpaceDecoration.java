package com.ss.android.ugc.aweme.poi.ui;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SpaceDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60512a;

    /* renamed from: b  reason: collision with root package name */
    private int f60513b;

    /* renamed from: c  reason: collision with root package name */
    private int f60514c;

    public SpaceDecoration(int i) {
        this.f60513b = i;
        this.f60514c = this.f60513b / 8;
    }

    public SpaceDecoration(int i, int i2) {
        this.f60513b = i;
        this.f60514c = i2 / 2;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f60512a, false, 66188, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f60512a, false, 66188, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
        if (childAdapterPosition == 0) {
            rect2.left = this.f60513b;
        } else {
            rect2.left = this.f60514c;
        }
        if (childAdapterPosition == recyclerView.getAdapter().getItemCount() - 1) {
            rect2.right = this.f60513b;
        } else {
            rect2.right = this.f60514c;
        }
    }
}
