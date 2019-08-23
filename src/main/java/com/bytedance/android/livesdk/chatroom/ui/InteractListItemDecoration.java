package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class InteractListItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11523a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f11524b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static int f11525c = -1;

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f11523a, false, 5802, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            Object[] objArr = {rect2, view2, recyclerView2, state};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f11523a, false, 5802, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        Context context = recyclerView.getContext();
        if (PatchProxy.isSupport(new Object[]{context}, this, f11523a, false, 5803, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f11523a, false, 5803, new Class[]{Context.class}, Void.TYPE);
        } else if (f11524b <= 0) {
            f11524b = (int) UIUtils.dip2Px(context, 30.0f);
            f11525c = (int) UIUtils.dip2Px(context, 8.0f);
        }
        int childLayoutPosition = recyclerView2.getChildLayoutPosition(view2);
        if (childLayoutPosition == 0) {
            rect2.set(f11524b, 0, f11525c, 0);
        } else if (recyclerView.getAdapter().getItemCount() - 1 == childLayoutPosition) {
            rect2.set(f11525c, 0, f11524b, 0);
        } else {
            rect2.set(f11525c, 0, f11525c, 0);
        }
    }
}
