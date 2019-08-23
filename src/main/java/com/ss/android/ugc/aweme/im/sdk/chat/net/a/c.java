package com.ss.android.ugc.aweme.im.sdk.chat.net.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50892a;

    /* renamed from: b  reason: collision with root package name */
    private final b f50893b;

    c(b bVar) {
        this.f50893b = bVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f50892a, false, 51347, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50892a, false, 51347, new Class[0], Void.TYPE);
            return;
        }
        ad.c(this.f50893b.f50885b);
    }
}
