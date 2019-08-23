package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ar implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12988a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkControlWidget f12989b;

    ar(LinkControlWidget linkControlWidget) {
        this.f12989b = linkControlWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12988a, false, 6962, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12988a, false, 6962, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        if (this.f12989b.j != 2) {
            LinkCrossRoomDataHolder.a().c();
        }
    }
}
