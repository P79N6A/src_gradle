package com.bytedance.android.livesdk.gift.panel;

import android.os.SystemClock;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.gift.model.j;
import com.bytedance.android.livesdk.gift.o;
import com.bytedance.android.livesdk.gift.panel.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class l implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15212a;

    /* renamed from: b  reason: collision with root package name */
    private final g f15213b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15214c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15215d;

    l(g gVar, long j, long j2) {
        this.f15213b = gVar;
        this.f15214c = j;
        this.f15215d = j2;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15212a, false, 9886, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15212a, false, 9886, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        g gVar = this.f15213b;
        long j = this.f15214c;
        long j2 = this.f15215d;
        d dVar = (d) obj;
        if (gVar.b() != null) {
            ((g.a) gVar.b()).a((j) dVar.f7871b);
        }
        o.c(j, gVar.f15196d.getId(), SystemClock.uptimeMillis() - j2);
    }
}
