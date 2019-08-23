package com.ss.android.ugc.aweme.similarvideo.ui;

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
import com.ss.android.ugc.aweme.common.widget.ZeusFrameLayout;

public class SimilarVideoFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71543a;

    /* renamed from: b  reason: collision with root package name */
    private SimilarVideoFragment f71544b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f71543a, false, 81674, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71543a, false, 81674, new Class[0], Void.TYPE);
            return;
        }
        SimilarVideoFragment similarVideoFragment = this.f71544b;
        if (similarVideoFragment != null) {
            this.f71544b = null;
            similarVideoFragment.mRecyclerView = null;
            similarVideoFragment.mLayout = null;
            similarVideoFragment.mStatusView = null;
            similarVideoFragment.mRefreshLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public SimilarVideoFragment_ViewBinding(SimilarVideoFragment similarVideoFragment, View view) {
        this.f71544b = similarVideoFragment;
        similarVideoFragment.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.bcz, "field 'mRecyclerView'", RecyclerView.class);
        similarVideoFragment.mLayout = (ZeusFrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.bcu, "field 'mLayout'", ZeusFrameLayout.class);
        similarVideoFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cuy, "field 'mStatusView'", DmtStatusView.class);
        similarVideoFragment.mRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, C0906R.id.ccw, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
    }
}
