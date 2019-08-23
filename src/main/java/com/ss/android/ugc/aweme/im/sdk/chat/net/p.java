package com.ss.android.ugc.aweme.im.sdk.chat.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50971a;

    /* renamed from: b  reason: collision with root package name */
    private final o f50972b;

    p(o oVar) {
        this.f50972b = oVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f50971a, false, 51291, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50971a, false, 51291, new Class[0], Void.TYPE);
            return;
        }
        ad.c(this.f50972b.f50969c);
    }
}
