package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdk.chatroom.ui.MessageListAdapter;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ef implements MessageListAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12139a;

    /* renamed from: b  reason: collision with root package name */
    private final MessageListAdapter f12140b;

    ef(MessageListAdapter messageListAdapter) {
        this.f12140b = messageListAdapter;
    }

    public final Room a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12139a, false, 6271, new Class[0], Room.class)) {
            return this.f12140b.f11711d;
        }
        return (Room) PatchProxy.accessDispatch(new Object[0], this, f12139a, false, 6271, new Class[0], Room.class);
    }
}
