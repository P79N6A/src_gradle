package com.ss.android.ugc.aweme.feed.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;

public class FeedTimeLineFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46193a;

    /* renamed from: b  reason: collision with root package name */
    private FeedTimeLineFragment f46194b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f46193a, false, 42754, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46193a, false, 42754, new Class[0], Void.TYPE);
            return;
        }
        FeedTimeLineFragment feedTimeLineFragment = this.f46194b;
        if (feedTimeLineFragment != null) {
            this.f46194b = null;
            feedTimeLineFragment.mFlRootContanier = null;
            feedTimeLineFragment.mStatusView = null;
            feedTimeLineFragment.mVTabBg = null;
            feedTimeLineFragment.mRefreshLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FeedTimeLineFragment_ViewBinding(FeedTimeLineFragment feedTimeLineFragment, View view) {
        this.f46194b = feedTimeLineFragment;
        feedTimeLineFragment.mFlRootContanier = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.ag2, "field 'mFlRootContanier'", ViewGroup.class);
        feedTimeLineFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        feedTimeLineFragment.mVTabBg = Utils.findRequiredView(view, C0906R.id.dqw, "field 'mVTabBg'");
        feedTimeLineFragment.mRefreshLayout = (FeedSwipeRefreshLayout) Utils.findRequiredViewAsType(view, C0906R.id.ccw, "field 'mRefreshLayout'", FeedSwipeRefreshLayout.class);
    }
}
