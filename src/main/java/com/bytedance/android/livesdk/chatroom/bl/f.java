package com.bytedance.android.livesdk.chatroom.bl;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.h.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9792a;

    /* renamed from: b  reason: collision with root package name */
    private final d f9793b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f9794c;

    /* renamed from: d  reason: collision with root package name */
    private final a f9795d;

    f(d dVar, Room room, a aVar) {
        this.f9793b = dVar;
        this.f9794c = room;
        this.f9795d = aVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f9792a, false, 3976, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9792a, false, 3976, new Class[0], Void.TYPE);
            return;
        }
        this.f9793b.lambda$addFollowGuideMessage$1$PlatformMessageHelper(this.f9794c, this.f9795d);
    }
}
