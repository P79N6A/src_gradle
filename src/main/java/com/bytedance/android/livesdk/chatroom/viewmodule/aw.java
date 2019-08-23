package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class aw implements c.C0083c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12997a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkCrossRoomWidget f12998b;

    aw(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f12998b = linkCrossRoomWidget;
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12997a, false, 7023, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12997a, false, 7023, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ((TextView) view).setOnClickListener(new bb(this.f12998b));
    }
}
