package com.bytedance.android.livesdk.gift.panel;

import android.os.SystemClock;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.gift.model.i;
import com.bytedance.android.livesdk.gift.panel.a.b;
import com.bytedance.android.livesdk.gift.panel.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class o implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15221a;

    /* renamed from: b  reason: collision with root package name */
    private final g f15222b;

    /* renamed from: c  reason: collision with root package name */
    private final b f15223c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15224d;

    o(g gVar, b bVar, long j) {
        this.f15222b = gVar;
        this.f15223c = bVar;
        this.f15224d = j;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15221a, false, 9889, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15221a, false, 9889, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        g gVar = this.f15222b;
        b bVar = this.f15223c;
        long j = this.f15224d;
        i iVar = (i) ((d) obj).f7871b;
        iVar.i = bVar.f15167a.size();
        ((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).walletCenter().a(iVar.f15131c);
        ((g.a) gVar.b()).a(iVar.i, bVar);
        com.bytedance.android.livesdk.gift.o.a(998, gVar.f15196d.getId(), SystemClock.uptimeMillis() - j);
    }
}
