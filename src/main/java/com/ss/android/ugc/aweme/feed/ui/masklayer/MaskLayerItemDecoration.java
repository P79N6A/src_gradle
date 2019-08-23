package com.ss.android.ugc.aweme.feed.ui.masklayer;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer/MaskLayerItemDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "mOrientation", "", "mGap", "(II)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MaskLayerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46681a;

    /* renamed from: b  reason: collision with root package name */
    private final int f46682b;

    /* renamed from: c  reason: collision with root package name */
    private final int f46683c;

    public MaskLayerItemDecoration(int i, int i2) {
        this.f46682b = i;
        this.f46683c = i2;
    }

    public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        RecyclerView.State state2 = state;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state2}, this, f46681a, false, 43380, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state2}, this, f46681a, false, 43380, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(rect2, "outRect");
        Intrinsics.checkParameterIsNotNull(view2, "view");
        Intrinsics.checkParameterIsNotNull(recyclerView2, "parent");
        Intrinsics.checkParameterIsNotNull(state2, "state");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager != null) {
            if (recyclerView2.getChildAdapterPosition(view2) != linearLayoutManager.getItemCount() - 1) {
                i = u.a((double) this.f46683c);
            }
            switch (this.f46682b) {
                case 0:
                    rect2.right = i;
                    break;
                case 1:
                    rect2.bottom = i;
                    return;
            }
        }
    }
}
