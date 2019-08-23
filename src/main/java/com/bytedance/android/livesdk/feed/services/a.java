package com.bytedance.android.livesdk.feed.services;

import android.support.annotation.NonNull;
import com.bytedance.android.live.core.a.j;
import com.bytedance.android.livesdk.feed.e;
import com.bytedance.android.livesdk.feed.g;
import com.bytedance.android.livesdk.feed.services.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a implements b.C0103b<g> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14381a;

    @NonNull
    public final b.C0103b.a<g> a(b.C0103b.a<g> aVar) {
        b.C0103b.a<g> aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f14381a, false, 8877, new Class[]{b.C0103b.a.class}, b.C0103b.a.class)) {
            return aVar2.a(new e(new j())).a();
        }
        return (b.C0103b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f14381a, false, 8877, new Class[]{b.C0103b.a.class}, b.C0103b.a.class);
    }
}
