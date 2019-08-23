package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.ar;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bg;

public final /* synthetic */ class fw implements bg {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67815a;

    /* renamed from: b  reason: collision with root package name */
    private final fv f67816b;

    fw(fv fvVar) {
        this.f67816b = fvVar;
    }

    public final void a(Object obj, bc bcVar) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{obj, bcVar}, this, f67815a, false, 74707, new Class[]{Object.class, bc.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, bcVar}, this, f67815a, false, 74707, new Class[]{Object.class, bc.class}, Void.TYPE);
            return;
        }
        fv fvVar = this.f67816b;
        int i = ((ar) bcVar).f74629a;
        if (fvVar.f67814c != null) {
            if (fvVar.f67814c.f4034c.m.size() >= i && i >= 0) {
                z = true;
            }
            if (z) {
                fvVar.f67814c.a(-1);
            }
        }
    }
}
