package com.ss.android.ugc.aweme.commercialize.coupon.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.commercialize.coupon.api.CouponApi;
import com.ss.android.ugc.aweme.commercialize.coupon.model.d;
import java.util.concurrent.Callable;

public final class a extends com.ss.android.ugc.aweme.w.a.a<d> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38539a;

    public final void a(final int i, final String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f38539a, false, 30450, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f38539a, false, 30450, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38540a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f38540a, false, 30451, new Class[0], Object.class)) {
                    return CouponApi.a(i, str);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f38540a, false, 30451, new Class[0], Object.class);
            }
        }, 0);
    }
}
