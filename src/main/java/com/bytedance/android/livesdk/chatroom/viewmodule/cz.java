package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.bl.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cz implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13138a;

    /* renamed from: b  reason: collision with root package name */
    private final d f13139b;

    cz(d dVar) {
        this.f13139b = dVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f13138a, false, 7239, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13138a, false, 7239, new Class[0], Void.TYPE);
            return;
        }
        this.f13139b.onMessageFinish();
    }
}
