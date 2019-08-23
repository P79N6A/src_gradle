package com.ss.android.ugc.aweme.commercialize;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39369a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiCouponRedeemActivity f39370b;

    m(PoiCouponRedeemActivity poiCouponRedeemActivity) {
        this.f39370b = poiCouponRedeemActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f39369a, false, 30366, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39369a, false, 30366, new Class[0], Void.TYPE);
            return;
        }
        PoiCouponRedeemActivity poiCouponRedeemActivity = this.f39370b;
        poiCouponRedeemActivity.startActivity(new Intent(poiCouponRedeemActivity, QRCodePermissionActivity.class));
    }
}
