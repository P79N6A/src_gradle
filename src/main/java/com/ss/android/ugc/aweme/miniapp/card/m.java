package com.ss.android.ugc.aweme.miniapp.card;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.util.an;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55661a;

    /* renamed from: b  reason: collision with root package name */
    private final j f55662b;

    m(j jVar) {
        this.f55662b = jVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f55661a, false, 59208, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55661a, false, 59208, new Class[0], Void.TYPE);
            return;
        }
        j jVar = this.f55662b;
        jVar.f55652b.setVisibility(8);
        View view = jVar.f55653c;
        if (PatchProxy.isSupport(new Object[]{view}, null, a.f55632a, true, 59183, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, null, a.f55632a, true, 59183, new Class[]{View.class}, Void.TYPE);
            return;
        }
        view.setVisibility(0);
        an.a(view, 0.0f, 1.0f, 150);
    }
}
