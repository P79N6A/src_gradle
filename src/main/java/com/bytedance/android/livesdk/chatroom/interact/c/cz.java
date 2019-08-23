package com.bytedance.android.livesdk.chatroom.interact.c;

import android.arch.lifecycle.Observer;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.android.livesdk.chatroom.interact.c.cy;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cz implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10540a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10541b;

    cz(cy cyVar) {
        this.f10541b = cyVar;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10540a, false, 4824, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10540a, false, 4824, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10541b;
        KVData kVData = (KVData) obj;
        if (kVData != null && kVData.getData() != null) {
            q qVar = (q) kVData.getData();
            if (PatchProxy.isSupport(new Object[]{qVar}, cyVar, cy.f10530a, false, 4815, new Class[]{q.class}, Void.TYPE)) {
                cy cyVar2 = cyVar;
                PatchProxy.accessDispatch(new Object[]{qVar}, cyVar2, cy.f10530a, false, 4815, new Class[]{q.class}, Void.TYPE);
                return;
            }
            if (cyVar.b() != null) {
                int i = qVar.f10192a;
                if (i == 5) {
                    cyVar.i();
                } else if (i != 9) {
                    switch (i) {
                        case 0:
                            cyVar.l();
                            return;
                        case 1:
                            ((cy.b) cyVar.b()).a(true);
                            cyVar.j();
                            return;
                    }
                } else {
                    if (PatchProxy.isSupport(new Object[0], cyVar, cy.f10530a, false, 4816, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], cyVar, cy.f10530a, false, 4816, new Class[0], Void.TYPE);
                    } else if (!cyVar.f10534e) {
                        cyVar.f10534e = true;
                        ((ab) j.q().d().a().leave(cyVar.p.getId()).as(cyVar.p())).a(new dc(cyVar), new dd(cyVar));
                    }
                }
            }
        }
    }
}
