package com.ss.android.ugc.aweme.im.sdk.chat.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50936a;

    /* renamed from: b  reason: collision with root package name */
    private final g f50937b;

    h(g gVar) {
        this.f50937b = gVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f50936a, false, 51254, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50936a, false, 51254, new Class[0], Void.TYPE);
            return;
        }
        ad.c(this.f50937b.f50930b);
    }
}
