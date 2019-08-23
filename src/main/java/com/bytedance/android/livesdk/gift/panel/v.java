package com.bytedance.android.livesdk.gift.panel;

import android.os.SystemClock;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.gift.model.i;
import com.bytedance.android.livesdk.gift.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class v implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15240a;

    /* renamed from: b  reason: collision with root package name */
    private final g f15241b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15242c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15243d;

    v(g gVar, long j, long j2) {
        this.f15241b = gVar;
        this.f15242c = j;
        this.f15243d = j2;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15240a, false, 9896, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15240a, false, 9896, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        g gVar = this.f15241b;
        long j = this.f15242c;
        long j2 = this.f15243d;
        gVar.a((i) ((d) obj).f7871b);
        o.a(j, gVar.f15196d.getId(), SystemClock.uptimeMillis() - j2);
    }
}
