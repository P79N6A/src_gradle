package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.viewmodule.LiveRoomNotifyWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cx implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13134a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomNotifyWidget.AnonymousClass1.AnonymousClass1 f13135b;

    cx(LiveRoomNotifyWidget.AnonymousClass1.AnonymousClass1 r1) {
        this.f13135b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f13134a, false, 7233, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13134a, false, 7233, new Class[0], Void.TYPE);
            return;
        }
        LiveRoomNotifyWidget.AnonymousClass1.AnonymousClass1 r0 = this.f13135b;
        if (LiveRoomNotifyWidget.this.isViewValid()) {
            LiveRoomNotifyWidget.this.i.start();
        }
    }
}
