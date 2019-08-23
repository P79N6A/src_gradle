package com.ss.android.ugc.aweme.app.accountsdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.playerkit.videoview.a;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33726a;

    /* renamed from: b  reason: collision with root package name */
    private final d f33727b;

    f(d dVar) {
        this.f33727b = dVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f33726a, false, 22993, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33726a, false, 22993, new Class[0], Void.TYPE);
            return;
        }
        d dVar = this.f33727b;
        if (dVar.f33722d == null || k.a().e() == dVar.f33722d) {
            if (!o.v()) {
                o.b().f();
                return;
            }
            a.a().S();
        }
    }
}
