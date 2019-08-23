package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9922a;

    /* renamed from: b  reason: collision with root package name */
    private final b f9923b;

    c(b bVar) {
        this.f9923b = bVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9922a, false, 4057, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9922a, false, 4057, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        b bVar = this.f9923b;
        d dVar = (d) obj;
        if (bVar.f9919c) {
            if (dVar == null) {
                bVar.a(0, "invalid room data _ response is null");
                return;
            }
            Room room = (Room) dVar.f7871b;
            if (PatchProxy.isSupport(new Object[]{room}, bVar, b.f9917a, false, 4056, new Class[]{Room.class}, Void.TYPE)) {
                b bVar2 = bVar;
                PatchProxy.accessDispatch(new Object[]{room}, bVar2, b.f9917a, false, 4056, new Class[]{Room.class}, Void.TYPE);
                return;
            }
            bVar.f9920d = room;
            bVar.f9919c = false;
            bVar.f9918b.a(room);
        }
    }
}
