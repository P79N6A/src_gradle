package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bb implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13009a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkCrossRoomWidget f13010b;

    bb(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f13010b = linkCrossRoomWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13009a, false, 7028, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13009a, false, 7028, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f13010b.h();
    }
}
