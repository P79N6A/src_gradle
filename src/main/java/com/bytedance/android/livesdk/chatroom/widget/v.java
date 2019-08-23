package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class v implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13557a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f13558b;

    v(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f13558b = liveRoomUserInfoWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13557a, false, 7983, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13557a, false, 7983, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f13558b.a((a) obj);
    }
}
