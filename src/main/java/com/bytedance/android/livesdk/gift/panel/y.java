package com.bytedance.android.livesdk.gift.panel;

import android.os.SystemClock;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.i;
import com.bytedance.android.livesdk.gift.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class y implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15392a;

    /* renamed from: b  reason: collision with root package name */
    private final g f15393b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15394c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15395d;

    y(g gVar, long j, long j2) {
        this.f15393b = gVar;
        this.f15394c = j;
        this.f15395d = j2;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15392a, false, 9899, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15392a, false, 9899, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        g gVar = this.f15393b;
        long j = this.f15394c;
        long j2 = this.f15395d;
        d dVar = (d) obj;
        i iVar = (i) dVar.f7871b;
        long j3 = dVar.f7872c.now;
        long currentTimeMillis = System.currentTimeMillis();
        for (Prop nowTimeDiff : iVar.n) {
            nowTimeDiff.setNowTimeDiff((j3 - currentTimeMillis) / 1000);
        }
        gVar.a(iVar);
        o.b(j, gVar.f15196d.getId(), SystemClock.uptimeMillis() - j2);
    }
}
