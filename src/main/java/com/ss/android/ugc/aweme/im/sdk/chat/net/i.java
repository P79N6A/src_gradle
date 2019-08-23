package com.ss.android.ugc.aweme.im.sdk.chat.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50938a;

    /* renamed from: b  reason: collision with root package name */
    private final g f50939b;

    i(g gVar) {
        this.f50939b = gVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f50938a, false, 51255, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50938a, false, 51255, new Class[0], Void.TYPE);
            return;
        }
        g gVar = this.f50939b;
        gVar.f50930b.setMsgStatus(3);
        ad.b(gVar.f50930b);
    }
}
