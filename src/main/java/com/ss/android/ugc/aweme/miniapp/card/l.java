package com.ss.android.ugc.aweme.miniapp.card;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.util.an;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55659a;

    /* renamed from: b  reason: collision with root package name */
    private final j f55660b;

    l(j jVar) {
        this.f55660b = jVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f55659a, false, 59207, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55659a, false, 59207, new Class[0], Void.TYPE);
            return;
        }
        j jVar = this.f55660b;
        View view = jVar.f55653c;
        if (PatchProxy.isSupport(new Object[]{view}, null, a.f55632a, true, 59182, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, null, a.f55632a, true, 59182, new Class[]{View.class}, Void.TYPE);
        } else {
            an.a(view, 1.0f, 0.0f, 150);
            view.postDelayed(new b(view), 150);
        }
        jVar.f55652b.postDelayed(new n(jVar), 180);
    }
}
