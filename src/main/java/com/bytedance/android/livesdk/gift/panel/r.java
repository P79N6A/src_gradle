package com.bytedance.android.livesdk.gift.panel;

import android.os.SystemClock;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.gift.model.i;
import com.bytedance.android.livesdk.gift.o;
import com.bytedance.android.livesdk.gift.panel.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class r implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15229a;

    /* renamed from: b  reason: collision with root package name */
    private final g f15230b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15231c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15232d;

    r(g gVar, long j, long j2) {
        this.f15230b = gVar;
        this.f15231c = j;
        this.f15232d = j2;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15229a, false, 9892, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15229a, false, 9892, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        g gVar = this.f15230b;
        long j = this.f15231c;
        long j2 = this.f15232d;
        d dVar = (d) obj;
        if (gVar.b() != null) {
            ((g.a) gVar.b()).b((i) dVar.f7871b);
        }
        o.a(j, gVar.f15196d.getId(), SystemClock.uptimeMillis() - j2);
    }
}
