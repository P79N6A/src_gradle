package com.bytedance.android.livesdk.chatroom.interact.c;

import android.text.TextUtils;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.chatroom.interact.c.bl;
import com.bytedance.android.livesdk.chatroom.model.a.g;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ci implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10492a;

    /* renamed from: b  reason: collision with root package name */
    private final bl f10493b;

    ci(bl blVar) {
        this.f10493b = blVar;
    }

    public final void accept(Object obj) {
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10492a, false, 4750, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10492a, false, 4750, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        bl blVar = this.f10493b;
        g gVar = (g) ((d) obj).f7871b;
        com.bytedance.android.livesdk.app.dataholder.d a2 = com.bytedance.android.livesdk.app.dataholder.d.a();
        if (TextUtils.isEmpty(gVar.f11039a) || gVar.f11040b <= 0) {
            blVar.f10437c = -1;
            ((bl.a) blVar.b()).b((Throwable) new Exception());
            return;
        }
        a2.f9052f = gVar.f11040b;
        a2.h = gVar.f11040b;
        a2.g = gVar.f11039a;
        a2.i = gVar.f11041c;
        if (blVar.f10438d.isLiveTypeAudio()) {
            i = 8;
        }
        ((ab) j.q().d().a().turnOnV1(blVar.f10438d.getId(), blVar.f10437c, i).as(blVar.p())).a(new ca(blVar), new cb(blVar));
    }
}
