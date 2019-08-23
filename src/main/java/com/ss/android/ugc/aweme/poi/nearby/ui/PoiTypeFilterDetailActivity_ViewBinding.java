package com.ss.android.ugc.aweme.poi.nearby.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PoiTypeFilterDetailActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60082a;

    /* renamed from: b  reason: collision with root package name */
    private PoiTypeFilterDetailActivity f60083b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f60082a, false, 65357, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60082a, false, 65357, new Class[0], Void.TYPE);
            return;
        }
        PoiTypeFilterDetailActivity poiTypeFilterDetailActivity = this.f60083b;
        if (poiTypeFilterDetailActivity != null) {
            this.f60083b = null;
            poiTypeFilterDetailActivity.mTitleBar = null;
            poiTypeFilterDetailActivity.mPoiFilterRecycler = null;
            poiTypeFilterDetailActivity.mSwipeRefreshLayout = null;
            poiTypeFilterDetailActivity.mPoiTypeDetailRecycler = null;
            poiTypeFilterDetailActivity.mStatusView = null;
            poiTypeFilterDetailActivity.mStatusBarView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiTypeFilterDetailActivity_ViewBinding(PoiTypeFilterDetailActivity poiTypeFilterDetailActivity, View view) {
        this.f60083b = poiTypeFilterDetailActivity;
        poiTypeFilterDetailActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTitleBar'", TextTitleBar.class);
        poiTypeFilterDetailActivity.mPoiFilterRecycler = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.c1m, "field 'mPoiFilterRecycler'", RecyclerView.class);
        poiTypeFilterDetailActivity.mSwipeRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, C0906R.id.cy0, "field 'mSwipeRefreshLayout'", SwipeRefreshLayout.class);
        poiTypeFilterDetailActivity.mPoiTypeDetailRecycler = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.c40, "field 'mPoiTypeDetailRecycler'", RecyclerView.class);
        poiTypeFilterDetailActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        poiTypeFilterDetailActivity.mStatusBarView = Utils.findRequiredView(view, C0906R.id.cv0, "field 'mStatusBarView'");
    }
}
