package com.ss.android.ugc.aweme.profile.adapter;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class DateStoryDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61240a;

    /* renamed from: b  reason: collision with root package name */
    private int f61241b;

    /* renamed from: c  reason: collision with root package name */
    private int f61242c;

    /* renamed from: d  reason: collision with root package name */
    private int[] f61243d;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f61240a, false, 67379, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f61240a, false, 67379, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
        } else if (this.f61243d != null) {
            int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
            if (childAdapterPosition != -1 && childAdapterPosition < this.f61243d.length) {
                int i = this.f61243d[childAdapterPosition];
                if (i == -1) {
                    rect2.set(0, 0, 0, 0);
                    return;
                }
                rect2.left = (this.f61242c * i) / this.f61241b;
                rect2.right = this.f61242c - (((i + 1) * this.f61242c) / this.f61241b);
                rect2.top = this.f61242c;
            }
        }
    }
}
