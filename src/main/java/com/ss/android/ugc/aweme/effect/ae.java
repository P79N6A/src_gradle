package com.ss.android.ugc.aweme.effect;

import android.arch.lifecycle.Observer;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.s;

public final /* synthetic */ class ae implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43684a;

    /* renamed from: b  reason: collision with root package name */
    private final VEEffectHelper f43685b;

    ae(VEEffectHelper vEEffectHelper) {
        this.f43685b = vEEffectHelper;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43684a, false, 38732, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43684a, false, 38732, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        VEEffectHelper vEEffectHelper = this.f43685b;
        if (vEEffectHelper.O) {
            Pair<Long, Long> playBoundary = vEEffectHelper.mVideoEditView.getPlayBoundary();
            vEEffectHelper.f3090f.setValue(s.b((long) ((Long) playBoundary.first).intValue()));
            vEEffectHelper.a((long) ((Long) playBoundary.first).intValue(), (long) ((Long) playBoundary.second).intValue());
        }
    }
}
