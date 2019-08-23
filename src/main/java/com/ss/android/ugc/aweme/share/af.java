package com.ss.android.ugc.aweme.share;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;

public final /* synthetic */ class af implements AnimatedImageView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64618a;

    /* renamed from: b  reason: collision with root package name */
    private final ae f64619b;

    af(ae aeVar) {
        this.f64619b = aeVar;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f64618a, false, 73030, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64618a, false, 73030, new Class[0], Void.TYPE);
            return;
        }
        this.f64619b.g = System.currentTimeMillis();
    }
}
