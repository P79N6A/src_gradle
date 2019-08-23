package com.ss.android.ugc.aweme.effect;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.a;

public final /* synthetic */ class z implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43790a;

    /* renamed from: b  reason: collision with root package name */
    private final VEEffectHelper f43791b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f43792c;

    z(VEEffectHelper vEEffectHelper, boolean z) {
        this.f43791b = vEEffectHelper;
        this.f43792c = z;
    }

    public final void run(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43790a, false, 38727, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43790a, false, 38727, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        VEEffectHelper vEEffectHelper = this.f43791b;
        if (this.f43792c) {
            vEEffectHelper.mTextxSave.setVisibility(0);
            vEEffectHelper.mTextCancel.setVisibility(0);
        }
    }
}
