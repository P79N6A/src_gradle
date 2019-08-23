package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.poi.widget.PoiLabelsLayout;

public class PoiDetailHeaderInfoPresenter_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59566a;

    /* renamed from: b  reason: collision with root package name */
    private PoiDetailHeaderInfoPresenter f59567b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f59566a, false, 64840, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59566a, false, 64840, new Class[0], Void.TYPE);
            return;
        }
        PoiDetailHeaderInfoPresenter poiDetailHeaderInfoPresenter = this.f59567b;
        if (poiDetailHeaderInfoPresenter != null) {
            this.f59567b = null;
            poiDetailHeaderInfoPresenter.mPoiName = null;
            poiDetailHeaderInfoPresenter.mPoiPrice = null;
            poiDetailHeaderInfoPresenter.mPoiVisitor = null;
            poiDetailHeaderInfoPresenter.mPoiCollectImg = null;
            poiDetailHeaderInfoPresenter.mPoiCollectLayout = null;
            poiDetailHeaderInfoPresenter.mPoiSubType = null;
            poiDetailHeaderInfoPresenter.mPoiDetails = null;
            poiDetailHeaderInfoPresenter.mPoiRatingLayout = null;
            poiDetailHeaderInfoPresenter.mLocalLayout = null;
            poiDetailHeaderInfoPresenter.mPoiNameLayout = null;
            poiDetailHeaderInfoPresenter.mPoiCollectContent = null;
            poiDetailHeaderInfoPresenter.mPoiOpenTimeTxt = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiDetailHeaderInfoPresenter_ViewBinding(PoiDetailHeaderInfoPresenter poiDetailHeaderInfoPresenter, View view) {
        this.f59567b = poiDetailHeaderInfoPresenter;
        poiDetailHeaderInfoPresenter.mPoiName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.c0r, "field 'mPoiName'", TextView.class);
        poiDetailHeaderInfoPresenter.mPoiPrice = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.c0x, "field 'mPoiPrice'", TextView.class);
        poiDetailHeaderInfoPresenter.mPoiVisitor = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.c10, "field 'mPoiVisitor'", TextView.class);
        poiDetailHeaderInfoPresenter.mPoiCollectImg = (CheckableImageView) Utils.findRequiredViewAsType(view, C0906R.id.c0l, "field 'mPoiCollectImg'", CheckableImageView.class);
        poiDetailHeaderInfoPresenter.mPoiCollectLayout = Utils.findRequiredView(view, C0906R.id.c0m, "field 'mPoiCollectLayout'");
        poiDetailHeaderInfoPresenter.mPoiSubType = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.c0z, "field 'mPoiSubType'", TextView.class);
        poiDetailHeaderInfoPresenter.mPoiDetails = (PoiLabelsLayout) Utils.findRequiredViewAsType(view, C0906R.id.c0o, "field 'mPoiDetails'", PoiLabelsLayout.class);
        poiDetailHeaderInfoPresenter.mPoiRatingLayout = Utils.findRequiredView(view, C0906R.id.c0y, "field 'mPoiRatingLayout'");
        poiDetailHeaderInfoPresenter.mLocalLayout = Utils.findRequiredView(view, C0906R.id.c0q, "field 'mLocalLayout'");
        poiDetailHeaderInfoPresenter.mPoiNameLayout = Utils.findRequiredView(view, C0906R.id.c12, "field 'mPoiNameLayout'");
        poiDetailHeaderInfoPresenter.mPoiCollectContent = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.c0n, "field 'mPoiCollectContent'", DmtTextView.class);
        poiDetailHeaderInfoPresenter.mPoiOpenTimeTxt = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.c13, "field 'mPoiOpenTimeTxt'", DmtTextView.class);
    }
}
