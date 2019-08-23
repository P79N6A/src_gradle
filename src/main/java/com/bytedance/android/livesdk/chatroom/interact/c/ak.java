package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ak implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10377a;

    /* renamed from: b  reason: collision with root package name */
    private final af f10378b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f10379c;

    ak(af afVar, Room room) {
        this.f10378b = afVar;
        this.f10379c = room;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10377a, false, 4677, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10377a, false, 4677, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10378b.a(this.f10379c, (Throwable) obj);
    }
}
