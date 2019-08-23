package com.bytedance.android.livesdk.gift;

import android.os.SystemClock;
import com.bytedance.android.live.core.d.e;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.gift.model.k;
import com.bytedance.android.livesdk.gift.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class v implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15478a;

    /* renamed from: b  reason: collision with root package name */
    private final u f15479b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15480c;

    public v(u uVar, long j) {
        this.f15479b = uVar;
        this.f15480c = j;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15478a, false, 9320, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15478a, false, 9320, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        u uVar = this.f15479b;
        long j = this.f15480c;
        d dVar = (d) obj;
        if (dVar == null || dVar.f7871b == null) {
            o.d(dVar == null ? "response is null" : "response.data is null");
        } else {
            uVar.f15476c = ((k) dVar.f7871b).f15139a;
            uVar.f15475b = false;
            for (u.a a2 : uVar.f15477d) {
                a2.a(uVar.f15476c);
            }
            long uptimeMillis = SystemClock.uptimeMillis() - j;
            if (PatchProxy.isSupport(new Object[]{new Long(uptimeMillis)}, null, o.f15142a, true, 9290, new Class[]{Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(uptimeMillis)}, null, o.f15142a, true, 9290, new Class[]{Long.TYPE}, Void.TYPE);
            } else {
                e.a(o.a("ttlive_task_gift_list_status"), 0, uptimeMillis);
            }
        }
    }
}
