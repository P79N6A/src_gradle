package com.ss.android.ugc.aweme.effect;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.a;
import com.ss.android.ugc.aweme.effect.VEEffectHelper;
import dmt.av.video.p;

public final /* synthetic */ class ah implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43691a;

    /* renamed from: b  reason: collision with root package name */
    private final VEEffectHelper.AnonymousClass8 f43692b;

    /* renamed from: c  reason: collision with root package name */
    private final p f43693c;

    /* renamed from: d  reason: collision with root package name */
    private final long f43694d;

    ah(VEEffectHelper.AnonymousClass8 r1, p pVar, long j) {
        this.f43692b = r1;
        this.f43693c = pVar;
        this.f43694d = j;
    }

    public final void run(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43691a, false, 38744, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43691a, false, 38744, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        VEEffectHelper.AnonymousClass8 r0 = this.f43692b;
        p pVar = this.f43693c;
        VEEffectHelper.this.mEffectSeekLayout.a(pVar.f83051b[0], this.f43694d, pVar.g, VEEffectHelper.this.s.c());
        VEEffectHelper.this.mVideoEditView.a(true, true, (a<Void>) null);
    }
}
