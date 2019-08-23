package com.ss.android.ugc.aweme.effect;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class y implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43788a;

    /* renamed from: b  reason: collision with root package name */
    private final VEEffectHelper f43789b;

    public y(VEEffectHelper vEEffectHelper) {
        this.f43789b = vEEffectHelper;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43788a, false, 38726, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43788a, false, 38726, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        VEEffectHelper vEEffectHelper = this.f43789b;
        Boolean bool = (Boolean) obj;
        if (!(vEEffectHelper.s == null || bool == null)) {
            vEEffectHelper.s.a(bool.booleanValue());
            vEEffectHelper.J = vEEffectHelper.s.a();
        }
    }
}
