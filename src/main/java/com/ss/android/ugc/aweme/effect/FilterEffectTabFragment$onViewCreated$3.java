package com.ss.android.ugc.aweme.effect;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/effect/FilterEffectTabFragment$onViewCreated$3", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FilterEffectTabFragment$onViewCreated$3 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43537a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FilterEffectTabFragment f43538b;

    FilterEffectTabFragment$onViewCreated$3(FilterEffectTabFragment filterEffectTabFragment) {
        this.f43538b = filterEffectTabFragment;
    }

    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f43537a, false, 38614, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f43537a, false, 38614, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        FilterEffectTabFragment filterEffectTabFragment = this.f43538b;
        if (i == 0) {
            z = true;
        }
        filterEffectTabFragment.l = z;
        this.f43538b.a(this.f43538b.l);
    }

    public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f43537a, false, 38615, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f43537a, false, 38615, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        this.f43538b.a(this.f43538b.l);
    }
}
