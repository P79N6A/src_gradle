package com.ss.android.ugc.aweme.poi.ui.detail;

import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.poi.ui.AbsSlidablePoiAwemeFeedFragment_ViewBinding;
import com.ss.android.ugc.aweme.poi.ui.detail.widget.AppBarLayout;

public class PoiDetailWithoutMapFragment_ViewBinding extends AbsSlidablePoiAwemeFeedFragment_ViewBinding {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f60697c;

    /* renamed from: d  reason: collision with root package name */
    private PoiDetailWithoutMapFragment f60698d;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f60697c, false, 66380, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60697c, false, 66380, new Class[0], Void.TYPE);
            return;
        }
        PoiDetailWithoutMapFragment poiDetailWithoutMapFragment = this.f60698d;
        if (poiDetailWithoutMapFragment != null) {
            this.f60698d = null;
            poiDetailWithoutMapFragment.mAppBarLayout = null;
            poiDetailWithoutMapFragment.mRecyclerView = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiDetailWithoutMapFragment_ViewBinding(PoiDetailWithoutMapFragment poiDetailWithoutMapFragment, View view) {
        super(poiDetailWithoutMapFragment, view);
        this.f60698d = poiDetailWithoutMapFragment;
        poiDetailWithoutMapFragment.mAppBarLayout = (AppBarLayout) Utils.findRequiredViewAsType(view, C0906R.id.fb, "field 'mAppBarLayout'", AppBarLayout.class);
        poiDetailWithoutMapFragment.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.bcz, "field 'mRecyclerView'", RecyclerView.class);
    }
}
