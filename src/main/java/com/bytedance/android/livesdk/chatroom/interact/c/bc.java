package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bc implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10415a;

    /* renamed from: b  reason: collision with root package name */
    private final ay f10416b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f10417c;

    bc(ay ayVar, Room room) {
        this.f10416b = ayVar;
        this.f10417c = room;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10415a, false, 4703, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10415a, false, 4703, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10416b.b(this.f10417c, (Throwable) obj);
    }
}
