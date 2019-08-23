package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ej implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13222a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomPushWidget f13223b;

    ej(RoomPushWidget roomPushWidget) {
        this.f13223b = roomPushWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13222a, false, 7471, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13222a, false, 7471, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f13223b.a((Throwable) obj);
    }
}
