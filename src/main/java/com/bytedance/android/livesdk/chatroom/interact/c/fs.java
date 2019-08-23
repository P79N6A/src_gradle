package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.c.g;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class fs implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10707a;

    /* renamed from: b  reason: collision with root package name */
    private final fl f10708b;

    fs(fl flVar) {
        this.f10708b = flVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10707a, false, 4959, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10707a, false, 4959, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        fl flVar = this.f10708b;
        Long l = (Long) obj;
        if (flVar.b() != null) {
            flVar.f10690d.lambda$put$1$DataCenter("data_pk_time_left", Integer.valueOf(l.intValue()));
            if (l.longValue() <= 0) {
                if (flVar.f10689c) {
                    g gVar = new g();
                    if (flVar.f10688b.getId() == flVar.f10690d.f9030d) {
                        gVar.a(flVar.f10688b.getOwner().getId());
                        gVar.b(flVar.f10690d.f9032f);
                    } else {
                        gVar.a(flVar.f10690d.f9032f);
                        gVar.b(flVar.f10688b.getOwner().getId());
                    }
                    a.a().a("punish_time_out", new j().a("live_detail").b("live").f("other"), gVar, LinkCrossRoomDataHolder.a().b(), Room.class);
                }
                flVar.f10690d.lambda$put$1$DataCenter("data_pk_state", LinkCrossRoomDataHolder.d.FINISHED);
            }
        }
    }
}
