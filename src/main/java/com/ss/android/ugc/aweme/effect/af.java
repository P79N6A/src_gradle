package com.ss.android.ugc.aweme.effect;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.s;

public final /* synthetic */ class af implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43686a;

    /* renamed from: b  reason: collision with root package name */
    private final VEEffectHelper f43687b;

    af(VEEffectHelper vEEffectHelper) {
        this.f43687b = vEEffectHelper;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43686a, false, 38733, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43686a, false, 38733, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        VEEffectHelper vEEffectHelper = this.f43687b;
        if (vEEffectHelper.O) {
            vEEffectHelper.c();
            vEEffectHelper.f3090f.setValue(s.a((long) ((Long) vEEffectHelper.mVideoEditView.getPlayBoundary().first).intValue()));
        }
    }
}
