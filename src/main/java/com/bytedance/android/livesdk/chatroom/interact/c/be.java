package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class be implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10420a;

    /* renamed from: b  reason: collision with root package name */
    private final ay f10421b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f10422c;

    be(ay ayVar, Room room) {
        this.f10421b = ayVar;
        this.f10422c = room;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10420a, false, 4705, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10420a, false, 4705, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10421b.a(this.f10422c, (Throwable) obj);
    }
}
