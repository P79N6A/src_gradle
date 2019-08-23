package com.ss.android.ugc.aweme.qrcode.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.bv;

public final /* synthetic */ class i implements bv.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63436a;

    /* renamed from: b  reason: collision with root package name */
    private final f f63437b;

    i(f fVar) {
        this.f63437b = fVar;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63436a, false, 70469, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63436a, false, 70469, new Class[0], Void.TYPE);
            return;
        }
        f fVar = this.f63437b;
        if (fVar.f63409c != null) {
            fVar.f63409c.d();
            fVar.f63409c.i();
        }
    }
}
