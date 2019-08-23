package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bj implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13025a;

    /* renamed from: b  reason: collision with root package name */
    public static final Consumer f13026b = new bj();

    private bj() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13025a, false, 7036, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13025a, false, 7036, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a("LinkCrossRoomLogs", (Throwable) obj);
    }
}
