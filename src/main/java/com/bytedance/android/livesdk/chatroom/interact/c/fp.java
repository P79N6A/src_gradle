package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.model.a.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class fp implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10700a;

    /* renamed from: b  reason: collision with root package name */
    private final fl f10701b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10702c;

    fp(fl flVar, boolean z) {
        this.f10701b = flVar;
        this.f10702c = z;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10700a, false, 4956, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10700a, false, 4956, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        fl flVar = this.f10701b;
        boolean z = this.f10702c;
        d dVar = (d) obj;
        if (dVar.f7870a == 0) {
            flVar.f10690d.a((p) dVar.f7871b, flVar.f10688b).lambda$put$1$DataCenter("data_pk_current_room_interact_info", dVar);
            p pVar = (p) dVar.f7871b;
            flVar.a(pVar.f11073d);
            if (pVar.f11074e == null || pVar.f11074e.f11019b == null || !pVar.f11074e.f11019b.g || pVar.f11074e.f11019b.h == 0) {
                LinkCrossRoomDataHolder.d dVar2 = (LinkCrossRoomDataHolder.d) flVar.f10690d.get("data_pk_state");
                if (!z) {
                    flVar.a(dVar.f7872c.now);
                } else if (LinkCrossRoomDataHolder.d.PENAL.compareTo(dVar2) > 0) {
                    flVar.b((long) (flVar.f10690d.q * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
                }
                return;
            }
            flVar.b((long) ((int) (((long) (flVar.f10690d.q * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE)) - (dVar.f7872c.now - pVar.f11074e.f11019b.f11021b))));
        } else if (z) {
            flVar.b((long) (flVar.f10690d.q * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
        } else {
            flVar.a(dVar.f7872c.now);
        }
    }
}
