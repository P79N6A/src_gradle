package com.bytedance.android.livesdk.gift;

import android.os.SystemClock;
import com.bytedance.android.live.core.d.e;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.h;
import com.bytedance.android.livesdk.gift.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class r implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15404a;

    /* renamed from: b  reason: collision with root package name */
    private final q f15405b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15406c;

    r(q qVar, long j) {
        this.f15405b = qVar;
        this.f15406c = j;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15404a, false, 9313, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15404a, false, 9313, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        q qVar = this.f15405b;
        long j = this.f15406c;
        d dVar = (d) obj;
        qVar.f15401b.clear();
        qVar.f15401b.addAll(((h) dVar.f7871b).f15128a);
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = dVar.f7872c.now;
        for (Prop nowTimeDiff : qVar.f15401b) {
            nowTimeDiff.setNowTimeDiff((j2 - currentTimeMillis) / 1000);
        }
        for (q.a a2 : qVar.f15402c) {
            a2.a(qVar.f15401b);
        }
        long uptimeMillis = SystemClock.uptimeMillis() - j;
        if (PatchProxy.isSupport(new Object[]{new Long(uptimeMillis)}, null, o.f15142a, true, 9288, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(uptimeMillis)}, null, o.f15142a, true, 9288, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        e.a(o.a("ttlive_prop_list_status"), 0, uptimeMillis);
    }
}
