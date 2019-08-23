package com.ss.android.ugc.aweme.effect;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ac implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43680a;

    /* renamed from: b  reason: collision with root package name */
    private final VEEffectHelper f43681b;

    ac(VEEffectHelper vEEffectHelper) {
        this.f43681b = vEEffectHelper;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43680a, false, 38730, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43680a, false, 38730, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        VEEffectHelper vEEffectHelper = this.f43681b;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            vEEffectHelper.h();
        }
    }
}
