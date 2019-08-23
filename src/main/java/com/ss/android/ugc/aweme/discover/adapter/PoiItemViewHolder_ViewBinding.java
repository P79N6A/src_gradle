package com.ss.android.ugc.aweme.discover.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.views.SmartAnimatedImageView;

public class PoiItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41700a;

    /* renamed from: b  reason: collision with root package name */
    private PoiItemViewHolder f41701b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41700a, false, 35706, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41700a, false, 35706, new Class[0], Void.TYPE);
            return;
        }
        PoiItemViewHolder poiItemViewHolder = this.f41701b;
        if (poiItemViewHolder != null) {
            this.f41701b = null;
            poiItemViewHolder.spaceView = null;
            poiItemViewHolder.mPoiImg = null;
            poiItemViewHolder.mPoiImgPlaceHolder = null;
            poiItemViewHolder.mPoiName = null;
            poiItemViewHolder.mPoiPerPrice = null;
            poiItemViewHolder.mPoiRankDesc = null;
            poiItemViewHolder.mPoiTypeLayout = null;
            poiItemViewHolder.mPoiOption = null;
            poiItemViewHolder.mPoiType = null;
            poiItemViewHolder.mPoiDistance = null;
            poiItemViewHolder.mPoiCouponContainer = null;
            poiItemViewHolder.mPoiCouponDesc = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiItemViewHolder_ViewBinding(PoiItemViewHolder poiItemViewHolder, View view) {
        this.f41701b = poiItemViewHolder;
        poiItemViewHolder.spaceView = Utils.findRequiredView(view, C0906R.id.css, "field 'spaceView'");
        poiItemViewHolder.mPoiImg = (SmartAnimatedImageView) Utils.findRequiredViewAsType(view, C0906R.id.c1w, "field 'mPoiImg'", SmartAnimatedImageView.class);
        poiItemViewHolder.mPoiImgPlaceHolder = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.c1y, "field 'mPoiImgPlaceHolder'", ImageView.class);
        poiItemViewHolder.mPoiName = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.c29, "field 'mPoiName'", DmtTextView.class);
        poiItemViewHolder.mPoiPerPrice = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.c2d, "field 'mPoiPerPrice'", DmtTextView.class);
        poiItemViewHolder.mPoiRankDesc = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.c2i, "field 'mPoiRankDesc'", DmtTextView.class);
        poiItemViewHolder.mPoiTypeLayout = Utils.findRequiredView(view, C0906R.id.c41, "field 'mPoiTypeLayout'");
        poiItemViewHolder.mPoiOption = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.c2b, "field 'mPoiOption'", DmtTextView.class);
        poiItemViewHolder.mPoiType = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.c3y, "field 'mPoiType'", DmtTextView.class);
        poiItemViewHolder.mPoiDistance = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.c1g, "field 'mPoiDistance'", DmtTextView.class);
        poiItemViewHolder.mPoiCouponContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.a0v, "field 'mPoiCouponContainer'", ViewGroup.class);
        poiItemViewHolder.mPoiCouponDesc = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.a0x, "field 'mPoiCouponDesc'", DmtTextView.class);
    }
}
