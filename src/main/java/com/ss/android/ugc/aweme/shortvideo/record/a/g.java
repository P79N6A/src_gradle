package com.ss.android.ugc.aweme.shortvideo.record.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69080a;

    /* renamed from: b  reason: collision with root package name */
    private final b f69081b;

    g(b bVar) {
        this.f69081b = bVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f69080a, false, 78427, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69080a, false, 78427, new Class[0], Void.TYPE);
            return;
        }
        this.f69081b.r.a(true);
    }
}
