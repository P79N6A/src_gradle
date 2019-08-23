package com.ss.android.ugc.aweme.share;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;

public final /* synthetic */ class bo implements AnimatedImageView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64809a;

    /* renamed from: b  reason: collision with root package name */
    private final bn f64810b;

    bo(bn bnVar) {
        this.f64810b = bnVar;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f64809a, false, 73172, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64809a, false, 73172, new Class[0], Void.TYPE);
            return;
        }
        this.f64810b.i = System.currentTimeMillis();
    }
}
