package com.ss.android.ugc.aweme.effect;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.s;

public final /* synthetic */ class ad implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43682a;

    /* renamed from: b  reason: collision with root package name */
    private final VEEffectHelper f43683b;

    ad(VEEffectHelper vEEffectHelper) {
        this.f43683b = vEEffectHelper;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43682a, false, 38731, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43682a, false, 38731, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        VEEffectHelper vEEffectHelper = this.f43683b;
        if (vEEffectHelper.O) {
            vEEffectHelper.c();
            vEEffectHelper.f3090f.setValue(s.a((long) ((Long) vEEffectHelper.mVideoEditView.getPlayBoundary().second).intValue()));
        }
    }
}
