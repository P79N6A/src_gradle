package com.bytedance.android.livesdk.chatroom.ui;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SpaceItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11791a;

    /* renamed from: b  reason: collision with root package name */
    private int f11792b;

    /* renamed from: c  reason: collision with root package name */
    private int f11793c = 1;

    public SpaceItemDecoration(int i, int i2) {
        this.f11792b = i2;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f11791a, false, 6443, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f11791a, false, 6443, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        int childPosition = recyclerView2.getChildPosition(view2);
        if (this.f11793c == 0) {
            if (childPosition != 0) {
                rect2.left = this.f11792b;
            }
        } else if (1 == this.f11793c) {
            rect2.top = this.f11792b;
        }
    }
}
