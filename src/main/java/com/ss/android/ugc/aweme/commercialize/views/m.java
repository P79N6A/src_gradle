package com.ss.android.ugc.aweme.commercialize.views;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.utils.ao;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40123a;

    /* renamed from: b  reason: collision with root package name */
    private final l f40124b;

    m(l lVar) {
        this.f40124b = lVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40123a, false, 32816, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40123a, false, 32816, new Class[0], Void.TYPE);
            return;
        }
        l lVar = this.f40124b;
        if (lVar.i.a() && !lVar.b()) {
            ao.a((View) lVar, (Runnable) new o(lVar));
        }
        n.a(lVar.f40117c, 0, c.f69428f, true);
    }
}
