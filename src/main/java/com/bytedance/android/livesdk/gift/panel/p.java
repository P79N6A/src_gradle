package com.bytedance.android.livesdk.gift.panel;

import com.bytedance.android.livesdk.gift.o;
import com.bytedance.android.livesdk.gift.panel.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class p implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15225a;

    /* renamed from: b  reason: collision with root package name */
    private final g f15226b;

    p(g gVar) {
        this.f15226b = gVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15225a, false, 9890, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15225a, false, 9890, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        g gVar = this.f15226b;
        Throwable th = (Throwable) obj;
        gVar.f15197e = false;
        if (th instanceof Exception) {
            ((g.a) gVar.b()).b((Exception) th);
            o.a(998, gVar.f15196d.getId(), th);
        }
    }
}
