package com.ss.android.ugc.aweme.share;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;

public final /* synthetic */ class bd implements AnimatedImageView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64750a;

    /* renamed from: b  reason: collision with root package name */
    private final bc f64751b;

    bd(bc bcVar) {
        this.f64751b = bcVar;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f64750a, false, 73102, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64750a, false, 73102, new Class[0], Void.TYPE);
            return;
        }
        this.f64751b.h = System.currentTimeMillis();
    }
}
