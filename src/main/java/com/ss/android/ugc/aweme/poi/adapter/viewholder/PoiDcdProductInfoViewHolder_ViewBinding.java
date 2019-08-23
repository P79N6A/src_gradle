package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PoiDcdProductInfoViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59556a;

    /* renamed from: b  reason: collision with root package name */
    private PoiDcdProductInfoViewHolder f59557b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f59556a, false, 64826, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59556a, false, 64826, new Class[0], Void.TYPE);
            return;
        }
        PoiDcdProductInfoViewHolder poiDcdProductInfoViewHolder = this.f59557b;
        if (poiDcdProductInfoViewHolder != null) {
            this.f59557b = null;
            poiDcdProductInfoViewHolder.mTitle = null;
            poiDcdProductInfoViewHolder.mAllProduct = null;
            poiDcdProductInfoViewHolder.mAllProductContainer = null;
            poiDcdProductInfoViewHolder.mProductList = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiDcdProductInfoViewHolder_ViewBinding(PoiDcdProductInfoViewHolder poiDcdProductInfoViewHolder, View view) {
        this.f59557b = poiDcdProductInfoViewHolder;
        poiDcdProductInfoViewHolder.mTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.ax5, "field 'mTitle'", TextView.class);
        poiDcdProductInfoViewHolder.mAllProduct = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.awx, "field 'mAllProduct'", TextView.class);
        poiDcdProductInfoViewHolder.mAllProductContainer = Utils.findRequiredView(view, C0906R.id.aww, "field 'mAllProductContainer'");
        poiDcdProductInfoViewHolder.mProductList = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.ax0, "field 'mProductList'", RecyclerView.class);
    }
}
