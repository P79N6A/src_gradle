package com.bytedance.android.livesdk.gift.panel;

import com.bytedance.android.livesdk.gift.o;
import com.bytedance.android.livesdk.gift.panel.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class z implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15396a;

    /* renamed from: b  reason: collision with root package name */
    private final g f15397b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15398c;

    z(g gVar, long j) {
        this.f15397b = gVar;
        this.f15398c = j;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15396a, false, 9900, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15396a, false, 9900, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        g gVar = this.f15397b;
        long j = this.f15398c;
        Throwable th = (Throwable) obj;
        gVar.f15197e = false;
        if (th instanceof Exception) {
            ((g.a) gVar.b()).a((Exception) th);
        }
        o.b(j, gVar.f15196d.getId(), th);
    }
}
