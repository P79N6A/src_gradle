package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.bl.c;
import com.bytedance.android.livesdk.chatroom.detail.e;
import com.bytedance.android.livesdk.message.model.j;
import com.bytedance.android.livesdk.utils.ab;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;

public final /* synthetic */ class cl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12020a;

    /* renamed from: b  reason: collision with root package name */
    private final LivePlayFragment f12021b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f12022c;

    cl(LivePlayFragment livePlayFragment, Room room) {
        this.f12021b = livePlayFragment;
        this.f12022c = room;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f12020a, false, 6056, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12020a, false, 6056, new Class[0], Void.TYPE);
            return;
        }
        LivePlayFragment livePlayFragment = this.f12021b;
        Room room = this.f12022c;
        if (livePlayFragment.s != null) {
            e eVar = livePlayFragment.s;
            if (PatchProxy.isSupport(new Object[0], eVar, e.f9926a, false, 4061, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], eVar, e.f9926a, false, 4061, new Class[0], Void.TYPE);
            } else {
                while (!eVar.f9928c.isEmpty() && ab.a() != null) {
                    ab.a().insertMessage((IMessage) eVar.f9928c.poll());
                }
            }
        }
        if (room.getStatus() == 3) {
            j a2 = c.a(livePlayFragment.f11598b, false);
            if (ab.a() != null) {
                ab.a().insertMessage(a2, true);
            }
        }
        if (livePlayFragment.i) {
            User user = new User();
            user.setId(livePlayFragment.f11599c);
            livePlayFragment.o.lambda$put$1$DataCenter("data_gift_panel_type", Boolean.TRUE);
            livePlayFragment.o.lambda$put$1$DataCenter("cmd_send_gift", user);
            livePlayFragment.i = false;
            return;
        }
        if (livePlayFragment.h) {
            User user2 = new User();
            user2.setId(livePlayFragment.f11599c);
            livePlayFragment.o.lambda$put$1$DataCenter("cmd_send_gift", user2);
            livePlayFragment.h = false;
        }
    }
}
