package com.ss.android.ugc.aweme.following.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;

public class SimpleUserFragment_ViewBinding implements Unbinder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f48065b;

    /* renamed from: a  reason: collision with root package name */
    private SimpleUserFragment f48066a;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f48065b, false, 45066, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48065b, false, 45066, new Class[0], Void.TYPE);
            return;
        }
        SimpleUserFragment simpleUserFragment = this.f48066a;
        if (simpleUserFragment != null) {
            this.f48066a = null;
            simpleUserFragment.mTitleBar = null;
            simpleUserFragment.mListView = null;
            simpleUserFragment.mStatusView = null;
            simpleUserFragment.mRefreshLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public SimpleUserFragment_ViewBinding(SimpleUserFragment simpleUserFragment, View view) {
        this.f48066a = simpleUserFragment;
        simpleUserFragment.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTitleBar'", TextTitleBar.class);
        simpleUserFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.bd0, "field 'mListView'", RecyclerView.class);
        simpleUserFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        simpleUserFragment.mRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, C0906R.id.ccw, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
    }
}
