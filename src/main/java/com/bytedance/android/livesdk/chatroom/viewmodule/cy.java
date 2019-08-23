package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.live.core.utils.fresco.h;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.message.model.bc;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cy implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13136a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomNotifyWidget.AnonymousClass3 f13137b;

    cy(LiveRoomNotifyWidget.AnonymousClass3 r1) {
        this.f13137b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f13136a, false, 7237, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13136a, false, 7237, new Class[0], Void.TYPE);
            return;
        }
        LiveRoomNotifyWidget.AnonymousClass3 r0 = this.f13137b;
        LiveRoomNotifyWidget.this.a((bc) h.a((View) LiveRoomNotifyWidget.this.f12644d, "2131165562"));
    }
}
