package com.bytedance.android.livesdk.gift.panel;

import com.bytedance.android.livesdk.gift.o;
import com.bytedance.android.livesdk.gift.panel.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class i implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15204a;

    /* renamed from: b  reason: collision with root package name */
    private final g f15205b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15206c;

    i(g gVar, long j) {
        this.f15205b = gVar;
        this.f15206c = j;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15204a, false, 9883, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15204a, false, 9883, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        g gVar = this.f15205b;
        long j = this.f15206c;
        Throwable th = (Throwable) obj;
        gVar.f15197e = false;
        if (gVar.b() != null) {
            ((g.a) gVar.b()).a((Exception) th);
        }
        o.a(j, gVar.f15196d.getId(), th);
    }
}
