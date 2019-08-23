package com.ss.android.ugc.aweme.feed.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45093a;

    /* renamed from: b  reason: collision with root package name */
    private final c f45094b;

    public e(c cVar) {
        this.f45094b = cVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f45093a, false, 40964, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45093a, false, 40964, new Class[0], Void.TYPE);
            return;
        }
        this.f45094b.a(0);
    }
}
