package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PoiRecommendViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59636a;

    /* renamed from: b  reason: collision with root package name */
    private PoiRecommendViewHolder f59637b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f59636a, false, 64902, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59636a, false, 64902, new Class[0], Void.TYPE);
            return;
        }
        PoiRecommendViewHolder poiRecommendViewHolder = this.f59637b;
        if (poiRecommendViewHolder != null) {
            this.f59637b = null;
            poiRecommendViewHolder.mRecommendLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiRecommendViewHolder_ViewBinding(PoiRecommendViewHolder poiRecommendViewHolder, View view) {
        this.f59637b = poiRecommendViewHolder;
        poiRecommendViewHolder.mRecommendLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.c0g, "field 'mRecommendLayout'", LinearLayout.class);
    }
}
