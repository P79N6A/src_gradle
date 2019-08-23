package com.ss.android.ugc.aweme.effect;

import android.arch.lifecycle.Observer;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class s implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43774a;

    /* renamed from: b  reason: collision with root package name */
    private final VEEffectHelper f43775b;

    s(VEEffectHelper vEEffectHelper) {
        this.f43775b = vEEffectHelper;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43774a, false, 38720, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43774a, false, 38720, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        VEEffectHelper vEEffectHelper = this.f43775b;
        if (vEEffectHelper.O) {
            Pair<Long, Long> playBoundary = vEEffectHelper.mVideoEditView.getPlayBoundary();
            vEEffectHelper.f3090f.setValue(dmt.av.video.s.b((long) ((Long) playBoundary.first).intValue()));
            vEEffectHelper.a((long) ((Long) playBoundary.first).intValue(), (long) ((Long) playBoundary.second).intValue());
        }
    }
}
