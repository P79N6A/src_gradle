package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class PoiDcdProductViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59559a;

    /* renamed from: b  reason: collision with root package name */
    private PoiDcdProductViewHolder f59560b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f59559a, false, 64830, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59559a, false, 64830, new Class[0], Void.TYPE);
            return;
        }
        PoiDcdProductViewHolder poiDcdProductViewHolder = this.f59560b;
        if (poiDcdProductViewHolder != null) {
            this.f59560b = null;
            poiDcdProductViewHolder.mImage = null;
            poiDcdProductViewHolder.mName = null;
            poiDcdProductViewHolder.mPrice = null;
            poiDcdProductViewHolder.mSalesPromotion = null;
            poiDcdProductViewHolder.mSubmitButton = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiDcdProductViewHolder_ViewBinding(PoiDcdProductViewHolder poiDcdProductViewHolder, View view) {
        this.f59560b = poiDcdProductViewHolder;
        poiDcdProductViewHolder.mImage = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.awz, "field 'mImage'", RemoteImageView.class);
        poiDcdProductViewHolder.mName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.ax1, "field 'mName'", TextView.class);
        poiDcdProductViewHolder.mPrice = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.ax2, "field 'mPrice'", TextView.class);
        poiDcdProductViewHolder.mSalesPromotion = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.ax3, "field 'mSalesPromotion'", TextView.class);
        poiDcdProductViewHolder.mSubmitButton = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.ax4, "field 'mSubmitButton'", TextView.class);
    }
}
