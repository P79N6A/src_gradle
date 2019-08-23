package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.bl.c;
import com.bytedance.android.livesdk.message.model.be;
import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class an implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13452a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f13453b;

    an(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f13453b = liveRoomUserInfoWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13452a, false, 7999, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13452a, false, 7999, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f13453b;
        String a2 = ac.a((int) C0906R.string.d2a);
        if (PatchProxy.isSupport(new Object[]{a2}, liveRoomUserInfoWidget, LiveRoomUserInfoWidget.f13402a, false, 7967, new Class[]{String.class}, Void.TYPE)) {
            LiveRoomUserInfoWidget liveRoomUserInfoWidget2 = liveRoomUserInfoWidget;
            PatchProxy.accessDispatch(new Object[]{a2}, liveRoomUserInfoWidget2, LiveRoomUserInfoWidget.f13402a, false, 7967, new Class[]{String.class}, Void.TYPE);
        } else {
            be a3 = c.a(liveRoomUserInfoWidget.f13406e.getId(), null, "", 5, a2, "#FF8533", "9", "");
            a3.f16553b.k = 2130841228;
            ((IMessageManager) liveRoomUserInfoWidget.dataCenter.get("data_message_manager")).insertMessage(a3, true);
        }
        b.aa.a(Boolean.TRUE);
    }
}
