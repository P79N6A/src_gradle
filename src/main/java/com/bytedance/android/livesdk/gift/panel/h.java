package com.bytedance.android.livesdk.gift.panel;

import android.os.SystemClock;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.gift.model.i;
import com.bytedance.android.livesdk.gift.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15200a;

    /* renamed from: b  reason: collision with root package name */
    private final g f15201b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15202c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15203d;

    h(g gVar, long j, long j2) {
        this.f15201b = gVar;
        this.f15202c = j;
        this.f15203d = j2;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15200a, false, 9882, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15200a, false, 9882, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        g gVar = this.f15201b;
        long j = this.f15202c;
        long j2 = this.f15203d;
        gVar.a((i) ((d) obj).f7871b);
        o.a(j, gVar.f15196d.getId(), SystemClock.uptimeMillis() - j2);
    }
}
