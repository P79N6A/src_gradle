package com.ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.livesdkapi.host.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53483a;

    /* renamed from: b  reason: collision with root package name */
    private final b f53484b;

    u(b bVar) {
        this.f53484b = bVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f53483a, false, 55842, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53483a, false, 55842, new Class[0], Void.TYPE);
            return;
        }
        this.f53484b.a();
    }
}
