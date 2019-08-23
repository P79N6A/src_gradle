package com.ss.android.ugc.aweme.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.net.c;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56937a;

    /* renamed from: b  reason: collision with root package name */
    private final c.AnonymousClass1 f56938b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f56939c;

    d(c.AnonymousClass1 r1, Object obj) {
        this.f56938b = r1;
        this.f56939c = obj;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f56937a, false, 60671, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56937a, false, 60671, new Class[0], Void.TYPE);
            return;
        }
        c.AnonymousClass1 r0 = this.f56938b;
        c.this.f56920b.a(c.this.f56921c, this.f56939c);
    }
}
