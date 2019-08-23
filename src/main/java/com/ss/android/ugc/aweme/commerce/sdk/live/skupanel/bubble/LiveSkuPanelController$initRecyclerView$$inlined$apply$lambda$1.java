package com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.bubble;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.a;
import com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.b;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commerce/sdk/live/skupanel/bubble/LiveSkuPanelController$initRecyclerView$1$2", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class LiveSkuPanelController$initRecyclerView$$inlined$apply$lambda$1 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37756a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f37757b;

    public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f37756a, false, 29322, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f37756a, false, 29322, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
    }

    LiveSkuPanelController$initRecyclerView$$inlined$apply$lambda$1(b bVar) {
        this.f37757b = bVar;
    }

    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f37756a, false, 29321, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f37756a, false, 29321, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        if (i == 0) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                int findFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
                if (!(findFirstCompletelyVisibleItemPosition == -1 || findFirstCompletelyVisibleItemPosition == this.f37757b.h)) {
                    b bVar = this.f37757b.j;
                    if (bVar != null) {
                        a.f37755b.a(null, "pop_up_card", bVar.a(), null, this.f37757b.g.get(findFirstCompletelyVisibleItemPosition).f38190d, this.f37757b.g.get(findFirstCompletelyVisibleItemPosition).j, this.f37757b.i, bVar.c(), this.f37757b.g.get(findFirstCompletelyVisibleItemPosition).H, this.f37757b.g.get(findFirstCompletelyVisibleItemPosition).I, this.f37757b.g.get(findFirstCompletelyVisibleItemPosition).J, "click_transform_card");
                    }
                    this.f37757b.h = findFirstCompletelyVisibleItemPosition;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
        }
    }
}
