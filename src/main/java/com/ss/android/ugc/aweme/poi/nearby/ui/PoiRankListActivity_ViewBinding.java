package com.ss.android.ugc.aweme.poi.nearby.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.SquareImageView;

public class PoiRankListActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60059a;

    /* renamed from: b  reason: collision with root package name */
    private PoiRankListActivity f60060b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f60059a, false, 65303, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60059a, false, 65303, new Class[0], Void.TYPE);
            return;
        }
        PoiRankListActivity poiRankListActivity = this.f60060b;
        if (poiRankListActivity != null) {
            this.f60060b = null;
            poiRankListActivity.mTitleBar = null;
            poiRankListActivity.mScrollLayout = null;
            poiRankListActivity.mHeadImgContainer = null;
            poiRankListActivity.mHeadImg = null;
            poiRankListActivity.mHeadDesc = null;
            poiRankListActivity.mPoiRankBg = null;
            poiRankListActivity.mPoiFilterRecycler = null;
            poiRankListActivity.mPoiTypeDetailRecycler = null;
            poiRankListActivity.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiRankListActivity_ViewBinding(PoiRankListActivity poiRankListActivity, View view) {
        this.f60060b = poiRankListActivity;
        poiRankListActivity.mTitleBar = (NormalTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTitleBar'", NormalTitleBar.class);
        poiRankListActivity.mScrollLayout = (AppBarLayout) Utils.findRequiredViewAsType(view, C0906R.id.ck9, "field 'mScrollLayout'", AppBarLayout.class);
        poiRankListActivity.mHeadImgContainer = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.an5, "field 'mHeadImgContainer'", RelativeLayout.class);
        poiRankListActivity.mHeadImg = (SquareImageView) Utils.findRequiredViewAsType(view, C0906R.id.an4, "field 'mHeadImg'", SquareImageView.class);
        poiRankListActivity.mHeadDesc = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.an0, "field 'mHeadDesc'", DmtTextView.class);
        poiRankListActivity.mPoiRankBg = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.c2k, "field 'mPoiRankBg'", ImageView.class);
        poiRankListActivity.mPoiFilterRecycler = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.c1m, "field 'mPoiFilterRecycler'", RecyclerView.class);
        poiRankListActivity.mPoiTypeDetailRecycler = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.c40, "field 'mPoiTypeDetailRecycler'", RecyclerView.class);
        poiRankListActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
    }
}
