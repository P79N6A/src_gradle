package com.ss.android.ugc.aweme.qrcode.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.k;
import com.ss.android.ugc.aweme.commercialize.PoiCouponRedeemActivity;
import com.ss.android.ugc.aweme.qrcode.d.f;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63438a;

    /* renamed from: b  reason: collision with root package name */
    private final f.AnonymousClass2 f63439b;

    /* renamed from: c  reason: collision with root package name */
    private final f.a f63440c;

    j(f.AnonymousClass2 r1, f.a aVar) {
        this.f63439b = r1;
        this.f63440c = aVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f63438a, false, 70472, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63438a, false, 70472, new Class[0], Void.TYPE);
            return;
        }
        f.AnonymousClass2 r0 = this.f63439b;
        f.a aVar = this.f63440c;
        PoiCouponRedeemActivity.a(f.this.f63408b, k.b(aVar.f63430b, "object_id"), aVar.f63429a, "scan");
    }
}
