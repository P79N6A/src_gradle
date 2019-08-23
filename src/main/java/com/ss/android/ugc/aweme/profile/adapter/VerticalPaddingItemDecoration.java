package com.ss.android.ugc.aweme.profile.adapter;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class VerticalPaddingItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61280a;

    /* renamed from: b  reason: collision with root package name */
    private int f61281b;

    /* renamed from: c  reason: collision with root package name */
    private int f61282c;

    /* renamed from: d  reason: collision with root package name */
    private int f61283d;

    /* renamed from: e  reason: collision with root package name */
    private int f61284e;

    /* renamed from: f  reason: collision with root package name */
    private int f61285f;

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f61280a, false, 67422, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f61280a, false, 67422, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
        if (childAdapterPosition == 0) {
            rect2.set(this.f61281b, this.f61283d, this.f61282c, this.f61285f / 2);
        } else if (childAdapterPosition == recyclerView.getAdapter().getItemCount() - 1) {
            rect2.set(this.f61281b, this.f61285f / 2, this.f61282c, this.f61284e);
        } else {
            rect2.set(this.f61281b, this.f61285f / 2, this.f61282c, this.f61285f / 2);
        }
    }

    public VerticalPaddingItemDecoration(int i, int i2, int i3, int i4, int i5) {
        this.f61281b = i;
        this.f61283d = i2;
        this.f61282c = i3;
        this.f61284e = i4;
        this.f61285f = i5;
    }
}
