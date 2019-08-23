package com.bytedance.android.livesdk.feed.services;

import com.bytedance.android.livesdk.feed.services.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements b.C0103b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14389a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f14390b;

    c(Class cls) {
        this.f14390b = cls;
    }

    public final b.C0103b.a a(b.C0103b.a aVar) {
        b.C0103b.a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f14389a, false, 8890, new Class[]{b.C0103b.a.class}, b.C0103b.a.class)) {
            return b.a(this.f14390b, aVar2);
        }
        return (b.C0103b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f14389a, false, 8890, new Class[]{b.C0103b.a.class}, b.C0103b.a.class);
    }
}
