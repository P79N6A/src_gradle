package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.widget.BannerViewPager;
import com.ss.android.ugc.aweme.discover.widget.IndicatorView;

public class PoiCommonBannerViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59545a;

    /* renamed from: b  reason: collision with root package name */
    private PoiCommonBannerViewHolder f59546b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f59545a, false, 64821, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59545a, false, 64821, new Class[0], Void.TYPE);
            return;
        }
        PoiCommonBannerViewHolder poiCommonBannerViewHolder = this.f59546b;
        if (poiCommonBannerViewHolder != null) {
            this.f59546b = null;
            poiCommonBannerViewHolder.mViewPager = null;
            poiCommonBannerViewHolder.mIndicator = null;
            poiCommonBannerViewHolder.mDividerBottom = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiCommonBannerViewHolder_ViewBinding(PoiCommonBannerViewHolder poiCommonBannerViewHolder, View view) {
        this.f59546b = poiCommonBannerViewHolder;
        poiCommonBannerViewHolder.mViewPager = (BannerViewPager) Utils.findRequiredViewAsType(view, C0906R.id.bz8, "field 'mViewPager'", BannerViewPager.class);
        poiCommonBannerViewHolder.mIndicator = (IndicatorView) Utils.findRequiredViewAsType(view, C0906R.id.bz7, "field 'mIndicator'", IndicatorView.class);
        poiCommonBannerViewHolder.mDividerBottom = Utils.findRequiredView(view, C0906R.id.bz6, "field 'mDividerBottom'");
    }
}
