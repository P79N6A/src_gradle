package com.ss.android.ugc.aweme.im.sdk.chat.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50940a;

    /* renamed from: b  reason: collision with root package name */
    private final g f50941b;

    j(g gVar) {
        this.f50941b = gVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f50940a, false, 51256, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50940a, false, 51256, new Class[0], Void.TYPE);
            return;
        }
        g gVar = this.f50941b;
        gVar.f50930b.setMsgStatus(3);
        ad.b(gVar.f50930b);
    }
}
