package com.bytedance.android.livesdk.chatroom.bl;

import com.bytedance.android.livesdk.message.model.x;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9788a;

    /* renamed from: b  reason: collision with root package name */
    private final d f9789b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f9790c;

    /* renamed from: d  reason: collision with root package name */
    private final x f9791d;

    e(d dVar, Room room, x xVar) {
        this.f9789b = dVar;
        this.f9790c = room;
        this.f9791d = xVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f9788a, false, 3975, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9788a, false, 3975, new Class[0], Void.TYPE);
            return;
        }
        this.f9789b.lambda$addFollowGuideMessage$0$PlatformMessageHelper(this.f9790c, this.f9791d);
    }
}
