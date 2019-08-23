package com.ss.android.ugc.aweme.commercialize;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.ui.d.a;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi;
import java.util.concurrent.ExecutionException;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39406a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiCouponRedeemActivity f39407b;

    /* renamed from: c  reason: collision with root package name */
    private final View f39408c;

    /* renamed from: d  reason: collision with root package name */
    private final q f39409d;

    p(PoiCouponRedeemActivity poiCouponRedeemActivity, View view, q qVar) {
        this.f39407b = poiCouponRedeemActivity;
        this.f39408c = view;
        this.f39409d = qVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f39406a, false, 30369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39406a, false, 30369, new Class[0], Void.TYPE);
            return;
        }
        PoiCouponRedeemActivity poiCouponRedeemActivity = this.f39407b;
        View view = this.f39408c;
        q qVar = this.f39409d;
        view.setEnabled(true);
        try {
            CouponRedeemApi.c cVar = (CouponRedeemApi.c) qVar.get();
            if (cVar != null && !TextUtils.isEmpty(cVar.statusMsg)) {
                if (cVar.statusCode == 0) {
                    a.a(poiCouponRedeemActivity.getApplicationContext(), cVar.statusMsg).a();
                } else {
                    a.b(poiCouponRedeemActivity.getApplicationContext(), cVar.statusMsg).a();
                }
            }
        } catch (InterruptedException unused) {
        } catch (ExecutionException unused2) {
            a.b(poiCouponRedeemActivity.getApplicationContext(), (int) C0906R.string.bga).a();
        }
        poiCouponRedeemActivity.a();
    }
}
