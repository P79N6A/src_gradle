package com.bytedance.android.livesdk.feed.services;

import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.feed.network.c;
import com.bytedance.android.livesdk.feed.network.d;
import com.bytedance.android.livesdk.feed.services.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class f implements b.C0103b<c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14394a;

    @NonNull
    public final b.C0103b.a a(b.C0103b.a aVar) {
        b.C0103b.a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f14394a, false, 8899, new Class[]{b.C0103b.a.class}, b.C0103b.a.class)) {
            return aVar2.a(new d()).a();
        }
        return (b.C0103b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f14394a, false, 8899, new Class[]{b.C0103b.a.class}, b.C0103b.a.class);
    }
}
