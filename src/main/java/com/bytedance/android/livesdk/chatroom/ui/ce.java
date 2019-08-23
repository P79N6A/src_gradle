package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.chatroom.interact.c.es;
import com.bytedance.android.livesdk.chatroom.interact.c.ew;
import com.bytedance.android.livesdk.chatroom.interact.c.ex;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ce implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12003a;

    /* renamed from: b  reason: collision with root package name */
    private final cc f12004b;

    ce(cc ccVar) {
        this.f12004b = ccVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12003a, false, 5915, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12003a, false, 5915, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        cc ccVar = this.f12004b;
        dialogInterface.dismiss();
        es esVar = ccVar.f11992b;
        if (PatchProxy.isSupport(new Object[0], esVar, es.f10638a, false, 4901, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], esVar, es.f10638a, false, 4901, new Class[0], Void.TYPE);
        } else if (!esVar.f10641d && esVar.b() != null) {
            esVar.f10641d = true;
            ((ab) j.q().d().a().leave(esVar.j.getId()).as(esVar.p())).a(new ew(esVar), new ex(esVar));
        }
        ccVar.d();
        aa.a(ccVar.f11993c, "shutdown_connection", "guest_cancel", false);
    }
}
