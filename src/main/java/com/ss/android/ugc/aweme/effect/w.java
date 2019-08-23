package com.ss.android.ugc.aweme.effect;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43782a;

    /* renamed from: b  reason: collision with root package name */
    private final VEEffectHelper f43783b;

    /* renamed from: c  reason: collision with root package name */
    private final int f43784c;

    /* renamed from: d  reason: collision with root package name */
    private final int f43785d;

    w(VEEffectHelper vEEffectHelper, int i, int i2) {
        this.f43783b = vEEffectHelper;
        this.f43784c = i;
        this.f43785d = i2;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f43782a, false, 38724, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43782a, false, 38724, new Class[0], Void.TYPE);
            return;
        }
        VEEffectHelper vEEffectHelper = this.f43783b;
        vEEffectHelper.mVideoEditView.a(this.f43784c, this.f43785d, 0);
    }
}
