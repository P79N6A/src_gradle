package com.ss.android.ugc.aweme.effect;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effect.VEEffectHelper;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

public final /* synthetic */ class ag implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43688a;

    /* renamed from: b  reason: collision with root package name */
    private final VEEffectHelper.AnonymousClass2 f43689b;

    /* renamed from: c  reason: collision with root package name */
    private final EffectChannelResponse f43690c;

    ag(VEEffectHelper.AnonymousClass2 r1, EffectChannelResponse effectChannelResponse) {
        this.f43689b = r1;
        this.f43690c = effectChannelResponse;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f43688a, false, 38737, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43688a, false, 38737, new Class[0], Void.TYPE);
            return;
        }
        VEEffectHelper.AnonymousClass2 r1 = this.f43689b;
        EffectChannelResponse effectChannelResponse = this.f43690c;
        if (VEEffectHelper.this.D.f43523b != null && (VEEffectHelper.this.D.f43523b instanceof k)) {
            VEEffectHelper.this.mEffectSeekLayout.setEffectPointModels(((k) VEEffectHelper.this.D.f43523b).c());
            if (e.b(effectChannelResponse.categoryResponseList.get(0).key)) {
                VEEffectHelper.this.a(((k) VEEffectHelper.this.D.f43523b).c(), true);
            }
        }
    }
}
