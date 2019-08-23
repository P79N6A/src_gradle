package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bi implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13023a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkCrossRoomWidget f13024b;

    public bi(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f13024b = linkCrossRoomWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13023a, false, 7035, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13023a, false, 7035, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f13024b.f12603d.g();
    }
}
