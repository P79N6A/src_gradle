package com.ss.android.ugc.aweme.discover.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.widget.IndicatorView;

public class DiscoverBannerViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41588a;

    /* renamed from: b  reason: collision with root package name */
    private DiscoverBannerViewHolder f41589b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41588a, false, 35555, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41588a, false, 35555, new Class[0], Void.TYPE);
            return;
        }
        DiscoverBannerViewHolder discoverBannerViewHolder = this.f41589b;
        if (discoverBannerViewHolder != null) {
            this.f41589b = null;
            discoverBannerViewHolder.mTitle = null;
            discoverBannerViewHolder.mViewPager = null;
            discoverBannerViewHolder.mIndicator = null;
            discoverBannerViewHolder.mStatusBar = null;
            discoverBannerViewHolder.mBannerLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public DiscoverBannerViewHolder_ViewBinding(DiscoverBannerViewHolder discoverBannerViewHolder, View view) {
        this.f41589b = discoverBannerViewHolder;
        discoverBannerViewHolder.mTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.db3, "field 'mTitle'", TextView.class);
        discoverBannerViewHolder.mViewPager = (ViewPager) Utils.findRequiredViewAsType(view, C0906R.id.duu, "field 'mViewPager'", ViewPager.class);
        discoverBannerViewHolder.mIndicator = (IndicatorView) Utils.findRequiredViewAsType(view, C0906R.id.a6b, "field 'mIndicator'", IndicatorView.class);
        discoverBannerViewHolder.mStatusBar = Utils.findRequiredView(view, C0906R.id.cv0, "field 'mStatusBar'");
        discoverBannerViewHolder.mBannerLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.jf, "field 'mBannerLayout'", RelativeLayout.class);
    }
}
