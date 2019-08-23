package com.ss.android.ugc.aweme.follow.ui;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class FollowTabGridItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47798a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f47799b;

    /* renamed from: c  reason: collision with root package name */
    private int f47800c = 2;

    /* renamed from: d  reason: collision with root package name */
    private int f47801d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f47802e;

    public FollowTabGridItemDecoration(int i, int i2, boolean z) {
        this.f47801d = i2;
        this.f47802e = false;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f47798a, false, 44703, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f47798a, false, 44703, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
        if (!this.f47799b || childAdapterPosition != 0) {
            if (this.f47799b) {
                childAdapterPosition--;
            }
            int i = childAdapterPosition % this.f47800c;
            if (this.f47802e) {
                int i2 = this.f47801d;
                rect2.left = i2 - ((i * i2) / this.f47800c);
                rect2.right = ((i + 1) * this.f47801d) / this.f47800c;
                if (childAdapterPosition < this.f47800c) {
                    rect2.top = this.f47801d;
                }
                rect2.bottom = this.f47801d;
                return;
            }
            rect2.left = (this.f47801d * i) / this.f47800c;
            rect2.right = this.f47801d - (((i + 1) * this.f47801d) / this.f47800c);
            if (childAdapterPosition >= this.f47800c) {
                rect2.top = this.f47801d;
            }
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
    }
}
