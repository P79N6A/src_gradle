package com.ss.android.ugc.aweme.themechange.base;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/themechange/base/AVDmtPanelRecyleView$init$1", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "tools.avdmtview_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AVDmtPanelRecyleView$init$1 extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74566a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AVDmtPanelRecyleView f74567b;

    AVDmtPanelRecyleView$init$1(AVDmtPanelRecyleView aVDmtPanelRecyleView) {
        this.f74567b = aVDmtPanelRecyleView;
    }

    public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        RecyclerView.State state2 = state;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state2}, this, f74566a, false, 86800, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state2}, this, f74566a, false, 86800, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(rect2, "outRect");
        Intrinsics.checkParameterIsNotNull(view2, "view");
        Intrinsics.checkParameterIsNotNull(recyclerView2, "parent");
        Intrinsics.checkParameterIsNotNull(state2, "state");
        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
        if (childAdapterPosition != -1) {
            if (childAdapterPosition == 0) {
                rect2.left = this.f74567b.f74564c;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(adapter, "parent.adapter!!");
            if (childAdapterPosition == adapter.getItemCount() - 1) {
                rect2.right = this.f74567b.f74565d;
            } else {
                rect2.right = this.f74567b.f74563b;
            }
        }
    }
}
