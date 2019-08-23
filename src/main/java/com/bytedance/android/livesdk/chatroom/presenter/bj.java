package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.view.b;
import com.bytedance.android.livesdk.message.model.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public final class bj implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11292a;

    /* renamed from: b  reason: collision with root package name */
    public b f11293b;

    public final void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f11292a, false, 5282, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f11292a, false, 5282, new Class[]{IMessage.class}, Void.TYPE);
            return;
        }
        if (this.f11293b != null) {
            this.f11293b.a((c) iMessage);
        }
    }
}
