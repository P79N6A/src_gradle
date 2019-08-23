package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.message.model.am;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ch implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10489a;

    /* renamed from: b  reason: collision with root package name */
    private final bl f10490b;

    /* renamed from: c  reason: collision with root package name */
    private final am f10491c;

    ch(bl blVar, am amVar) {
        this.f10490b = blVar;
        this.f10491c = amVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10489a, false, 4749, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10489a, false, 4749, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        bl blVar = this.f10490b;
        am amVar = this.f10491c;
        blVar.b((Throwable) obj);
        ((ab) j.q().d().a().reply(amVar.g, blVar.f10438d.getId(), 6, amVar.l).as(blVar.p())).a(new cc(amVar), new cd(blVar));
    }
}
