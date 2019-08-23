package com.bytedance.android.livesdk.feed.adapter;

import android.arch.lifecycle.Observer;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.core.network.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13982a;

    /* renamed from: b  reason: collision with root package name */
    private final c f13983b;

    public l(c cVar) {
        this.f13983b = cVar;
    }

    public final void onChanged(Object obj) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13982a, false, 8503, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13982a, false, 8503, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c cVar = this.f13983b;
        i.a aVar = (i.a) obj;
        if (cVar.i && !cVar.m) {
            cVar.f13955d.a("enter_auto");
        }
        if (aVar == i.a.Login && !cVar.m) {
            d dVar = (d) cVar.f13955d.f7974c.getValue();
            Boolean bool = (Boolean) cVar.f13955d.f7976e.getValue();
            boolean z2 = dVar != null && dVar.b();
            if (bool != null && !bool.booleanValue()) {
                z = false;
            }
            if (z2 && z) {
                cVar.f13955d.a("enter_auto");
            }
        }
    }
}
