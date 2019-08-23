package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.chatroom.interact.c.ec;
import com.bytedance.android.livesdk.chatroom.interact.c.ep;
import com.bytedance.android.livesdk.chatroom.interact.c.eq;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class by implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11980a;

    /* renamed from: b  reason: collision with root package name */
    private final bw f11981b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11982c;

    by(bw bwVar, long j) {
        this.f11981b = bwVar;
        this.f11982c = j;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11980a, false, 5901, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11980a, false, 5901, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        bw bwVar = this.f11981b;
        long j = this.f11982c;
        dialogInterface.dismiss();
        bwVar.a((int) C0906R.string.d5c);
        ec ecVar = bwVar.f11973b;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, ecVar, ec.f10602a, false, 4859, new Class[]{Long.TYPE}, Void.TYPE)) {
            ec ecVar2 = ecVar;
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, ecVar2, ec.f10602a, false, 4859, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (!ecVar.f10605d) {
            ecVar.o = j;
            ((ab) j.q().d().a().kickOut(ecVar.m.getId(), j).as(ecVar.p())).a(new ep(ecVar), new eq(ecVar));
        }
        aa.a(bwVar.f11975d, "shutdown_connection", "anchor_connection", true);
    }
}
