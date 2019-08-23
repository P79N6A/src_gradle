package com.bytedance.android.livesdk.gift.impl;

import android.os.SystemClock;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.i;
import com.bytedance.android.livesdk.gift.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.Iterator;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15072a;

    /* renamed from: b  reason: collision with root package name */
    private final b f15073b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15074c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15075d;

    /* renamed from: e  reason: collision with root package name */
    private final long f15076e;

    c(b bVar, long j, long j2, long j3) {
        this.f15073b = bVar;
        this.f15074c = j;
        this.f15075d = j2;
        this.f15076e = j3;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15072a, false, 9808, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15072a, false, 9808, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        b bVar = this.f15073b;
        long j = this.f15074c;
        long j2 = this.f15075d;
        long j3 = this.f15076e;
        d dVar = (d) obj;
        i iVar = (i) dVar.f7871b;
        long j4 = dVar.f7872c.now;
        long currentTimeMillis = System.currentTimeMillis();
        Iterator<Prop> it2 = iVar.n.iterator();
        while (it2.hasNext()) {
            it2.next().setNowTimeDiff((j4 - currentTimeMillis) / 1000);
            it2 = it2;
        }
        bVar.a(iVar);
        o.b(j, j2, SystemClock.uptimeMillis() - j3);
    }
}
