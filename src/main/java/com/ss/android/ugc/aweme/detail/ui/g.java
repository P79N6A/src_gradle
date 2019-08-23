package com.ss.android.ugc.aweme.detail.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.detail.b.a;

public final /* synthetic */ class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41374a;

    /* renamed from: b  reason: collision with root package name */
    private final DetailPageFragment f41375b;

    g(DetailPageFragment detailPageFragment) {
        this.f41375b = detailPageFragment;
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f41374a, false, 35160, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f41374a, false, 35160, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f41375b.a(f2);
    }
}
