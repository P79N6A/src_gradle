package com.ss.android.ugc.aweme.forward.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.ss.android.ugc.aweme.forward.model.d;

public final class e extends b<d, com.ss.android.ugc.aweme.forward.b.d> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48283a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f48283a, false, 45425, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48283a, false, 45425, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        ((com.ss.android.ugc.aweme.forward.b.d) this.f2979f).a((ForwardDetail) ((d) this.f2978e).getData());
    }
}
