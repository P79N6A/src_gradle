package com.bytedance.android.livesdk.player;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16817a;

    /* renamed from: b  reason: collision with root package name */
    private final f f16818b;

    /* renamed from: c  reason: collision with root package name */
    private final float f16819c;

    h(f fVar, float f2) {
        this.f16818b = fVar;
        this.f16819c = f2;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f16817a, false, 12719, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16817a, false, 12719, new Class[0], Void.TYPE);
            return;
        }
        f fVar = this.f16818b;
        float f2 = this.f16819c;
        if (fVar.f16806b && f2 >= 0.0f) {
            fVar.f16807c = f2;
        }
    }
}
