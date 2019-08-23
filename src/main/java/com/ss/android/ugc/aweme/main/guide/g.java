package com.ss.android.ugc.aweme.main.guide;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.utils.bg;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54829a;

    /* renamed from: b  reason: collision with root package name */
    private final e f54830b;

    public g(e eVar) {
        this.f54830b = eVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f54829a, false, 58087, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54829a, false, 58087, new Class[0], Void.TYPE);
            return;
        }
        e eVar = this.f54830b;
        if (PatchProxy.isSupport(new Object[0], eVar, e.f54821a, false, 58079, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], eVar, e.f54821a, false, 58079, new Class[0], Void.TYPE);
        } else {
            if (eVar.f54826f != null) {
                eVar.f54826f.cancelAnimation();
            }
            v.b(eVar.f54825e, 8);
        }
        bg.a(new d(false));
    }
}
