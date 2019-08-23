package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.chatroom.interact.c.Cdo;
import com.bytedance.android.livesdk.chatroom.interact.c.cy;
import com.bytedance.android.livesdk.chatroom.interact.c.dn;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class bp implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11949a;

    /* renamed from: b  reason: collision with root package name */
    private final bn f11950b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11951c;

    bp(bn bnVar, long j) {
        this.f11950b = bnVar;
        this.f11951c = j;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11949a, false, 5858, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11949a, false, 5858, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        bn bnVar = this.f11950b;
        long j = this.f11951c;
        dialogInterface.dismiss();
        bnVar.a((int) C0906R.string.d5c);
        cy cyVar = bnVar.f11942b;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, cyVar, cy.f10530a, false, 4820, new Class[]{Long.TYPE}, Void.TYPE)) {
            cy cyVar2 = cyVar;
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, cyVar2, cy.f10530a, false, 4820, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (!cyVar.o) {
            cyVar.o = true;
            cyVar.s = j;
            ((ab) j.q().d().a().kickOut(cyVar.p.getId(), j).as(cyVar.p())).a(new dn(cyVar), new Cdo(cyVar));
        }
        aa.a(bnVar.f11944d, "shutdown_connection", "guest_connection", true);
    }
}
