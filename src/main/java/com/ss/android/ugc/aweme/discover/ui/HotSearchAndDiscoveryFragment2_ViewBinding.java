package com.ss.android.ugc.aweme.discover.ui;

import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout;

public class HotSearchAndDiscoveryFragment2_ViewBinding extends BaseDiscoveryAndSearchFragment_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f42917b;

    /* renamed from: c  reason: collision with root package name */
    private HotSearchAndDiscoveryFragment2 f42918c;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f42917b, false, 37664, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42917b, false, 37664, new Class[0], Void.TYPE);
            return;
        }
        HotSearchAndDiscoveryFragment2 hotSearchAndDiscoveryFragment2 = this.f42918c;
        if (hotSearchAndDiscoveryFragment2 != null) {
            this.f42918c = null;
            hotSearchAndDiscoveryFragment2.loftNestedRefreshLayout = null;
            hotSearchAndDiscoveryFragment2.mTopStatus = null;
            hotSearchAndDiscoveryFragment2.mSearchContainer = null;
            hotSearchAndDiscoveryFragment2.mSearchScanView = null;
            hotSearchAndDiscoveryFragment2.mSearchScanViewRight = null;
            hotSearchAndDiscoveryFragment2.mRightBackBtn = null;
            hotSearchAndDiscoveryFragment2.mHotSearchFlipperView = null;
            hotSearchAndDiscoveryFragment2.mRightSearchView = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public HotSearchAndDiscoveryFragment2_ViewBinding(HotSearchAndDiscoveryFragment2 hotSearchAndDiscoveryFragment2, View view) {
        super(hotSearchAndDiscoveryFragment2, view);
        this.f42918c = hotSearchAndDiscoveryFragment2;
        hotSearchAndDiscoveryFragment2.loftNestedRefreshLayout = (LoftNestedRefreshLayout) Utils.findRequiredViewAsType(view, C0906R.id.bkd, "field 'loftNestedRefreshLayout'", LoftNestedRefreshLayout.class);
        hotSearchAndDiscoveryFragment2.mTopStatus = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.d5v, "field 'mTopStatus'", ViewGroup.class);
        hotSearchAndDiscoveryFragment2.mSearchContainer = Utils.findRequiredView(view, C0906R.id.cfk, "field 'mSearchContainer'");
        hotSearchAndDiscoveryFragment2.mSearchScanView = (SearchScanView) Utils.findRequiredViewAsType(view, C0906R.id.clv, "field 'mSearchScanView'", SearchScanView.class);
        hotSearchAndDiscoveryFragment2.mSearchScanViewRight = (SearchScanView) Utils.findRequiredViewAsType(view, C0906R.id.clw, "field 'mSearchScanViewRight'", SearchScanView.class);
        hotSearchAndDiscoveryFragment2.mRightBackBtn = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.j1, "field 'mRightBackBtn'", ImageView.class);
        hotSearchAndDiscoveryFragment2.mHotSearchFlipperView = (HotSearchWordsFlipperView) Utils.findRequiredViewAsType(view, C0906R.id.apd, "field 'mHotSearchFlipperView'", HotSearchWordsFlipperView.class);
        hotSearchAndDiscoveryFragment2.mRightSearchView = Utils.findRequiredView(view, C0906R.id.cej, "field 'mRightSearchView'");
    }
}
