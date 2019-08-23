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

public class PoiDetailFragment_ViewBinding extends AbsSlidablePoiAwemeFeedFragment_ViewBinding {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f60689c;

    /* renamed from: d  reason: collision with root package name */
    private PoiDetailFragment f60690d;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f60689c, false, 66365, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60689c, false, 66365, new Class[0], Void.TYPE);
            return;
        }
        PoiDetailFragment poiDetailFragment = this.f60690d;
        if (poiDetailFragment != null) {
            this.f60690d = null;
            poiDetailFragment.mAppBarLayout = null;
            poiDetailFragment.mRecyclerView = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiDetailFragment_ViewBinding(PoiDetailFragment poiDetailFragment, View view) {
        super(poiDetailFragment, view);
        this.f60690d = poiDetailFragment;
        poiDetailFragment.mAppBarLayout = (AppBarLayout) Utils.findRequiredViewAsType(view, C0906R.id.fb, "field 'mAppBarLayout'", AppBarLayout.class);
        poiDetailFragment.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.bcz, "field 'mRecyclerView'", RecyclerView.class);
    }
}
