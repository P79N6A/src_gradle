package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.livesdkapi.depend.d.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements g.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9952a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomPlayer f9953b;

    h(RoomPlayer roomPlayer) {
        this.f9953b = roomPlayer;
    }

    public final void a(g.b bVar, Object obj) {
        g.b bVar2 = bVar;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{bVar2, obj2}, this, f9952a, false, 4114, new Class[]{g.b.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, obj2}, this, f9952a, false, 4114, new Class[]{g.b.class, Object.class}, Void.TYPE);
            return;
        }
        this.f9953b.lambda$doStartPlay$0$RoomPlayer(bVar2, obj2);
    }
}
