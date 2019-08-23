package com.ss.android.ugc.aweme.common.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40190a;

    /* renamed from: b  reason: collision with root package name */
    private final LoadMoreRecyclerViewAdapter.LoadMoreViewHolder f40191b;

    c(LoadMoreRecyclerViewAdapter.LoadMoreViewHolder loadMoreViewHolder) {
        this.f40191b = loadMoreViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f40190a, false, 33403, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f40190a, false, 33403, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        LoadMoreRecyclerViewAdapter.LoadMoreViewHolder loadMoreViewHolder = this.f40191b;
        if (LoadMoreRecyclerViewAdapter.this.mLoadMoreListener != null) {
            LoadMoreRecyclerViewAdapter.this.mLoadMoreListener.loadMore();
        }
        if (loadMoreViewHolder.f40177b != null) {
            loadMoreViewHolder.f40177b.f40181b = false;
        }
    }
}
