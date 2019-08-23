package com.ss.android.ugc.aweme.discover.ui;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/discover/ui/SearchFragment$monitorRecycleShownStatus$1", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchFragment$monitorRecycleShownStatus$1 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42992a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchFragment f42993b;

    SearchFragment$monitorRecycleShownStatus$1(SearchFragment searchFragment) {
        this.f42993b = searchFragment;
    }

    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f42992a, false, 37908, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f42992a, false, 37908, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        if (i == 0) {
            this.f42993b.b(recyclerView2);
        }
    }
}
