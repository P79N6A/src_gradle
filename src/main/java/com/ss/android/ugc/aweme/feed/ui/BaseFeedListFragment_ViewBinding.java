package com.ss.android.ugc.aweme.feed.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;

public class BaseFeedListFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46081a;

    /* renamed from: b  reason: collision with root package name */
    private BaseFeedListFragment f46082b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f46081a, false, 42449, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46081a, false, 42449, new Class[0], Void.TYPE);
            return;
        }
        BaseFeedListFragment baseFeedListFragment = this.f46082b;
        if (baseFeedListFragment != null) {
            this.f46082b = null;
            baseFeedListFragment.mLoadMoreLayout = null;
            baseFeedListFragment.mLayout = null;
            baseFeedListFragment.mRefreshLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public BaseFeedListFragment_ViewBinding(BaseFeedListFragment baseFeedListFragment, View view) {
        this.f46082b = baseFeedListFragment;
        baseFeedListFragment.mLoadMoreLayout = (LoadMoreFrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.bjm, "field 'mLoadMoreLayout'", LoadMoreFrameLayout.class);
        baseFeedListFragment.mLayout = Utils.findRequiredView(view, C0906R.id.acz, "field 'mLayout'");
        baseFeedListFragment.mRefreshLayout = (FeedSwipeRefreshLayout) Utils.findRequiredViewAsType(view, C0906R.id.ccw, "field 'mRefreshLayout'", FeedSwipeRefreshLayout.class);
    }
}
