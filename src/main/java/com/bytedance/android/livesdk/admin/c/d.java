package com.bytedance.android.livesdk.admin.c;

import com.bytedance.android.live.core.network.response.a;
import com.bytedance.android.livesdk.admin.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8973a;

    /* renamed from: b  reason: collision with root package name */
    private final a f8974b;

    d(a aVar) {
        this.f8974b = aVar;
    }

    public final void accept(Object obj) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f8973a, false, 3087, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f8973a, false, 3087, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f8974b;
        a aVar2 = (a) obj;
        c cVar = new c();
        cVar.f8957a = aVar2.f7867b;
        cVar.f8958b = (aVar2.f7868c == null || ((com.bytedance.android.livesdk.admin.b.a) aVar2.f7868c).f8955a <= 0) ? 10 : ((com.bytedance.android.livesdk.admin.b.a) aVar2.f7868c).f8955a;
        if (aVar2.f7867b != null) {
            i = aVar2.f7867b.size();
        }
        cVar.f8959c = i;
        aVar.f8964b.a(cVar, (Exception) null);
    }
}
