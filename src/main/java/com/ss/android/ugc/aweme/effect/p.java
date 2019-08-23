package com.ss.android.ugc.aweme.effect;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43768a;

    /* renamed from: b  reason: collision with root package name */
    private final VEEffectHelper f43769b;

    p(VEEffectHelper vEEffectHelper) {
        this.f43769b = vEEffectHelper;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f43768a, false, 38717, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43768a, false, 38717, new Class[0], Void.TYPE);
            return;
        }
        this.f43769b.mRlEffectHint.setVisibility(8);
    }
}
