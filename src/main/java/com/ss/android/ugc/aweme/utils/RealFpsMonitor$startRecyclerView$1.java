package com.ss.android.ugc.aweme.utils;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/utils/RealFpsMonitor$startRecyclerView$1", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RealFpsMonitor$startRecyclerView$1 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75451a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ dg f75452b;

    RealFpsMonitor$startRecyclerView$1(dg dgVar) {
        this.f75452b = dgVar;
    }

    @SuppressLint({"LogNotTimber"})
    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f75451a, false, 88511, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f75451a, false, 88511, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        if (i != 0) {
            this.f75452b.f75746b.a();
        } else {
            this.f75452b.f75746b.b();
        }
    }
}
