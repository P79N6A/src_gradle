package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ba implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13007a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkCrossRoomWidget f13008b;

    ba(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f13008b = linkCrossRoomWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13007a, false, 7027, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13007a, false, 7027, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f13008b.h();
    }
}
