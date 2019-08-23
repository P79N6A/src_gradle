package com.ss.android.ugc.aweme.newfollow.vh;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;

public class FlowFeedViewHolder_ViewBinding implements Unbinder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f57539b;

    /* renamed from: a  reason: collision with root package name */
    private FlowFeedViewHolder f57540a;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57539b, false, 62203, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57539b, false, 62203, new Class[0], Void.TYPE);
            return;
        }
        FlowFeedViewHolder flowFeedViewHolder = this.f57540a;
        if (flowFeedViewHolder != null) {
            this.f57540a = null;
            flowFeedViewHolder.mRefreshLayout = null;
            flowFeedViewHolder.mRecyclerView = null;
            flowFeedViewHolder.mLoadingStatusView = null;
            flowFeedViewHolder.mNoticeGuideView = null;
            flowFeedViewHolder.mTvTopPrompt = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FlowFeedViewHolder_ViewBinding(FlowFeedViewHolder flowFeedViewHolder, View view) {
        this.f57540a = flowFeedViewHolder;
        flowFeedViewHolder.mRefreshLayout = (SwipeRefreshLayout) Utils.findOptionalViewAsType(view, C0906R.id.ccw, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
        flowFeedViewHolder.mRecyclerView = (NestedScrollingRecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.bcz, "field 'mRecyclerView'", NestedScrollingRecyclerView.class);
        flowFeedViewHolder.mLoadingStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cuy, "field 'mLoadingStatusView'", DmtStatusView.class);
        flowFeedViewHolder.mNoticeGuideView = (NoticeView) Utils.findOptionalViewAsType(view, C0906R.id.ah1, "field 'mNoticeGuideView'", NoticeView.class);
        flowFeedViewHolder.mTvTopPrompt = (DmtTextView) Utils.findOptionalViewAsType(view, C0906R.id.ah7, "field 'mTvTopPrompt'", DmtTextView.class);
        flowFeedViewHolder.feedSpaceSize = view.getContext().getResources().getDimensionPixelSize(C0906R.dimen.gf);
    }
}
