package com.ss.android.ugc.aweme.follow;

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

public class FollowTabFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47728a;

    /* renamed from: b  reason: collision with root package name */
    private FollowTabFragment f47729b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f47728a, false, 44608, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47728a, false, 44608, new Class[0], Void.TYPE);
            return;
        }
        FollowTabFragment followTabFragment = this.f47729b;
        if (followTabFragment != null) {
            this.f47729b = null;
            followTabFragment.mFlRootContanier = null;
            followTabFragment.mStatusView = null;
            followTabFragment.mRefreshLayout = null;
            followTabFragment.mVTabBg = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FollowTabFragment_ViewBinding(FollowTabFragment followTabFragment, View view) {
        this.f47729b = followTabFragment;
        followTabFragment.mFlRootContanier = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.ag2, "field 'mFlRootContanier'", ViewGroup.class);
        followTabFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        followTabFragment.mRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, C0906R.id.ccw, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
        followTabFragment.mVTabBg = Utils.findRequiredView(view, C0906R.id.dqw, "field 'mVTabBg'");
    }
}
