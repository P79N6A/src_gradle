package com.ss.android.ugc.aweme.im.sdk.chat.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50975a;

    /* renamed from: b  reason: collision with root package name */
    private final o f50976b;

    r(o oVar) {
        this.f50976b = oVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f50975a, false, 51293, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50975a, false, 51293, new Class[0], Void.TYPE);
            return;
        }
        ad.b(this.f50976b.f50969c);
    }
}
