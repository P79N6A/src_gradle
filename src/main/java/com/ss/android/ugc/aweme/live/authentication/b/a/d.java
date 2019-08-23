package com.ss.android.ugc.aweme.live.authentication.b.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.live.authentication.b.a;
import com.ss.android.ugc.aweme.live.authentication.model.b;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53307a;

    public final void a(a.C0618a aVar) {
        a.C0618a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f53307a, false, 55650, new Class[]{a.C0618a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f53307a, false, 55650, new Class[]{a.C0618a.class}, Void.TYPE);
        } else if (b.a(aVar.a().f53308a.realname_verify)) {
            aVar2.a(aVar.a());
        } else {
            h a2 = h.a();
            a2.a("aweme://aweme/zhima/live&live_type=" + b.a().f53326c);
        }
    }
}
