package com.ss.android.ugc.aweme.filter.base;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.b;

public class SpaceItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47554a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f47555b;

    /* renamed from: c  reason: collision with root package name */
    private int f47556c;

    public SpaceItemDecoration(Context context, int i) {
        this.f47556c = i;
        this.f47555b = b.a(context);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f47554a, false, 44442, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f47554a, false, 44442, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        if (!this.f47555b) {
            rect2.right = this.f47556c;
        } else {
            rect2.left = this.f47556c;
        }
        if (recyclerView2.getChildAdapterPosition(view2) == 0) {
            if (!this.f47555b) {
                rect2.left = this.f47556c;
                return;
            }
            rect2.right = this.f47556c;
        }
    }
}
