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
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;

public class BaseCellFeedFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46077a;

    /* renamed from: b  reason: collision with root package name */
    private BaseCellFeedFragment f46078b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f46077a, false, 42438, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46077a, false, 42438, new Class[0], Void.TYPE);
            return;
        }
        BaseCellFeedFragment baseCellFeedFragment = this.f46078b;
        if (baseCellFeedFragment != null) {
            this.f46078b = null;
            baseCellFeedFragment.mFlRootContanier = null;
            baseCellFeedFragment.mStatusView = null;
            baseCellFeedFragment.mRefreshLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public BaseCellFeedFragment_ViewBinding(BaseCellFeedFragment baseCellFeedFragment, View view) {
        this.f46078b = baseCellFeedFragment;
        baseCellFeedFragment.mFlRootContanier = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.ag2, "field 'mFlRootContanier'", ViewGroup.class);
        baseCellFeedFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        baseCellFeedFragment.mRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, C0906R.id.ccw, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
    }
}
