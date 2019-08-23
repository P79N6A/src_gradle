package com.ss.android.ugc.aweme.discover.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.widget.BannerSwipeRefreshLayout;
import com.ss.android.ugc.aweme.discover.widget.DiscoveryRecyclerView;

public class DiscoverFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42878a;

    /* renamed from: b  reason: collision with root package name */
    private DiscoverFragment f42879b;

    /* renamed from: c  reason: collision with root package name */
    private View f42880c;

    /* renamed from: d  reason: collision with root package name */
    private View f42881d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f42878a, false, 37566, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42878a, false, 37566, new Class[0], Void.TYPE);
            return;
        }
        DiscoverFragment discoverFragment = this.f42879b;
        if (discoverFragment != null) {
            this.f42879b = null;
            discoverFragment.mFlRootContainer = null;
            discoverFragment.mListView = null;
            discoverFragment.mRefreshLayout = null;
            discoverFragment.mStatusBar = null;
            discoverFragment.mStatusView = null;
            this.f42880c.setOnClickListener(null);
            this.f42880c = null;
            this.f42881d.setOnClickListener(null);
            this.f42881d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public DiscoverFragment_ViewBinding(final DiscoverFragment discoverFragment, View view) {
        this.f42879b = discoverFragment;
        discoverFragment.mFlRootContainer = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.ag1, "field 'mFlRootContainer'", RelativeLayout.class);
        discoverFragment.mListView = (DiscoveryRecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.bcz, "field 'mListView'", DiscoveryRecyclerView.class);
        discoverFragment.mRefreshLayout = (BannerSwipeRefreshLayout) Utils.findRequiredViewAsType(view, C0906R.id.ne, "field 'mRefreshLayout'", BannerSwipeRefreshLayout.class);
        discoverFragment.mStatusBar = Utils.findRequiredView(view, C0906R.id.cv0, "field 'mStatusBar'");
        discoverFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ag6, "method 'onClick'");
        this.f42880c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42882a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f42882a, false, 37567, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f42882a, false, 37567, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                discoverFragment.onClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.di0, "method 'onClick'");
        this.f42881d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42885a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f42885a, false, 37568, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f42885a, false, 37568, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                discoverFragment.onClick(view2);
            }
        });
    }
}
