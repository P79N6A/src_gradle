package com.bytedance.android.livesdk.feed.services;

import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.feed.e.a;
import com.bytedance.android.livesdk.feed.services.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class e implements b.C0103b<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14393a;

    @NonNull
    public final b.C0103b.a<a> a(b.C0103b.a<a> aVar) {
        b.C0103b.a<a> aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f14393a, false, 8898, new Class[]{b.C0103b.a.class}, b.C0103b.a.class)) {
            return aVar2.a(new com.bytedance.android.livesdk.feed.k.a()).a();
        }
        return (b.C0103b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f14393a, false, 8898, new Class[]{b.C0103b.a.class}, b.C0103b.a.class);
    }
}
