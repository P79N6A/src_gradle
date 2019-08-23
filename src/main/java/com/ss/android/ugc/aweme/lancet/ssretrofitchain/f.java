package com.ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.o;
import com.ss.android.ugc.aweme.lancet.ssretrofitchain.c;
import org.jetbrains.annotations.NotNull;

public final class f extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52992a;

    public f(c cVar) {
        super(cVar);
    }

    /* access modifiers changed from: package-private */
    @NotNull
    public final c.a a(e eVar, Request request, SsResponse ssResponse) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2, request, ssResponse}, this, f52992a, false, 55033, new Class[]{e.class, Request.class, SsResponse.class}, c.a.class)) {
            return (c.a) PatchProxy.accessDispatch(new Object[]{eVar2, request, ssResponse}, this, f52992a, false, 55033, new Class[]{e.class, Request.class, SsResponse.class}, c.a.class);
        }
        if (eVar2.f52988b > 0) {
            long j = eVar2.f52988b;
            if (PatchProxy.isSupport(new Object[]{new Long(j)}, null, o.f33866a, true, 23127, new Class[]{Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j)}, null, o.f33866a, true, 23127, new Class[]{Long.TYPE}, Void.TYPE);
            } else {
                o.f33867b = j;
                o.f33868c = System.currentTimeMillis();
            }
        }
        return b.f52968b;
    }
}
