package com.ss.android.ugc.aweme.follow;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;

public class FollowCellFeedFragmentPanel_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47705a;

    /* renamed from: b  reason: collision with root package name */
    private FollowCellFeedFragmentPanel f47706b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f47705a, false, 44546, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47705a, false, 44546, new Class[0], Void.TYPE);
            return;
        }
        FollowCellFeedFragmentPanel followCellFeedFragmentPanel = this.f47706b;
        if (followCellFeedFragmentPanel != null) {
            this.f47706b = null;
            followCellFeedFragmentPanel.mStatusView = null;
            followCellFeedFragmentPanel.mRefreshLayout = null;
            followCellFeedFragmentPanel.mListView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FollowCellFeedFragmentPanel_ViewBinding(FollowCellFeedFragmentPanel followCellFeedFragmentPanel, View view) {
        this.f47706b = followCellFeedFragmentPanel;
        followCellFeedFragmentPanel.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        followCellFeedFragmentPanel.mRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, C0906R.id.ccw, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
        followCellFeedFragmentPanel.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.bcz, "field 'mListView'", RecyclerView.class);
    }
}
