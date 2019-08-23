package com.bytedance.android.livesdk.gift.panel;

import android.os.SystemClock;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.gift.model.j;
import com.bytedance.android.livesdk.gift.o;
import com.bytedance.android.livesdk.gift.panel.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ab implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15178a;

    /* renamed from: b  reason: collision with root package name */
    private final g f15179b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15180c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15181d;

    ab(g gVar, long j, long j2) {
        this.f15179b = gVar;
        this.f15180c = j;
        this.f15181d = j2;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15178a, false, 9902, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15178a, false, 9902, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        g gVar = this.f15179b;
        long j = this.f15180c;
        long j2 = this.f15181d;
        d dVar = (d) obj;
        if (gVar.b() != null) {
            ((g.a) gVar.b()).a((j) dVar.f7871b);
        }
        o.c(j, gVar.f15196d.getId(), SystemClock.uptimeMillis() - j2);
    }
}
