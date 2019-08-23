package com.bytedance.android.live.core.paging.adapter;

import android.view.View;
import com.bytedance.android.live.core.paging.adapter.PagingAdapter;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7926a;

    /* renamed from: b  reason: collision with root package name */
    private final PagingAdapter.ErrorViewHolder f7927b;

    f(PagingAdapter.ErrorViewHolder errorViewHolder) {
        this.f7927b = errorViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f7926a, false, 511, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f7926a, false, 511, new Class[]{View.class}, Void.TYPE);
            return;
        }
        PagingViewModel pagingViewModel = this.f7927b.f7909b;
        if (PatchProxy.isSupport(new Object[0], pagingViewModel, PagingViewModel.f7972b, false, 598, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], pagingViewModel, PagingViewModel.f7972b, false, 598, new Class[0], Void.TYPE);
            return;
        }
        if (pagingViewModel.i != null) {
            pagingViewModel.i.g();
        }
    }
}
