package com.ss.android.ugc.aweme.poi.ui.coupon;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.poi.widget.MerchantAvatarImageView;

public class GotCouponDialog_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60630a;

    /* renamed from: b  reason: collision with root package name */
    private GotCouponDialog f60631b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f60630a, false, 66336, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60630a, false, 66336, new Class[0], Void.TYPE);
            return;
        }
        GotCouponDialog gotCouponDialog = this.f60631b;
        if (gotCouponDialog != null) {
            this.f60631b = null;
            gotCouponDialog.headImageIv = null;
            gotCouponDialog.headImageIvBg = null;
            gotCouponDialog.vMask = null;
            gotCouponDialog.avatarImageView = null;
            gotCouponDialog.merchantNameTv = null;
            gotCouponDialog.tvCongrats = null;
            gotCouponDialog.tvISee = null;
            gotCouponDialog.tvTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public GotCouponDialog_ViewBinding(GotCouponDialog gotCouponDialog, View view) {
        this.f60631b = gotCouponDialog;
        gotCouponDialog.headImageIv = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.an2, "field 'headImageIv'", RemoteImageView.class);
        gotCouponDialog.headImageIvBg = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.an3, "field 'headImageIvBg'", ImageView.class);
        gotCouponDialog.vMask = Utils.findRequiredView(view, C0906R.id.dqs, "field 'vMask'");
        gotCouponDialog.avatarImageView = (MerchantAvatarImageView) Utils.findRequiredViewAsType(view, C0906R.id.i4, "field 'avatarImageView'", MerchantAvatarImageView.class);
        gotCouponDialog.merchantNameTv = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.bml, "field 'merchantNameTv'", DmtTextView.class);
        gotCouponDialog.tvCongrats = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.d_w, "field 'tvCongrats'", TextView.class);
        gotCouponDialog.tvISee = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dd3, "field 'tvISee'", TextView.class);
        gotCouponDialog.tvTitle = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.dkk, "field 'tvTitle'", DmtTextView.class);
    }
}
