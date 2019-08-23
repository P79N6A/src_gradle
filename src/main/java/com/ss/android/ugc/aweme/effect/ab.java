package com.ss.android.ugc.aweme.effect;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import dmt.av.video.p;
import dmt.av.video.x;

public final /* synthetic */ class ab implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43678a;

    /* renamed from: b  reason: collision with root package name */
    private final VEEffectHelper f43679b;

    ab(VEEffectHelper vEEffectHelper) {
        this.f43679b = vEEffectHelper;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f43678a, false, 38729, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f43678a, false, 38729, new Class[]{i.class}, Object.class);
        }
        VEEffectHelper vEEffectHelper = this.f43679b;
        if (!iVar.b() || !((Boolean) iVar.e()).booleanValue()) {
            vEEffectHelper.l.setValue(Boolean.FALSE);
        } else {
            vEEffectHelper.l.setValue(Boolean.TRUE);
            if (vEEffectHelper.H != null && vEEffectHelper.H.getKey().equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE) && vEEffectHelper.F) {
                if (PatchProxy.isSupport(new Object[0], vEEffectHelper, VEEffectHelper.f3085a, false, 38688, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], vEEffectHelper, VEEffectHelper.f3085a, false, 38688, new Class[0], Void.TYPE);
                } else {
                    p pVar = (p) vEEffectHelper.f3089e.getValue();
                    if (pVar != null && pVar.f83054e == 0) {
                        p a2 = p.a((long) vEEffectHelper.r.u());
                        a2.f83055f = vEEffectHelper.s.c();
                        vEEffectHelper.f3089e.setValue(a2);
                    }
                    vEEffectHelper.h();
                    x b2 = x.b();
                    vEEffectHelper.mEffectSeekLayout.setOverlayColor(vEEffectHelper.v);
                    vEEffectHelper.h.setValue(b2);
                    vEEffectHelper.g();
                }
            }
        }
        return null;
    }
}
