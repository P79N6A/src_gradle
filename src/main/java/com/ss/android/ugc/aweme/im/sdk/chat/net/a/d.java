package com.ss.android.ugc.aweme.im.sdk.chat.net.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50894a;

    /* renamed from: b  reason: collision with root package name */
    private final b f50895b;

    d(b bVar) {
        this.f50895b = bVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f50894a, false, 51348, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50894a, false, 51348, new Class[0], Void.TYPE);
            return;
        }
        b bVar = this.f50895b;
        bVar.f50885b.setMsgStatus(3);
        ad.b(bVar.f50885b);
    }
}
