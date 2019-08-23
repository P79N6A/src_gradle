package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.c.c;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bc implements c.C0083c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13011a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkCrossRoomWidget f13012b;

    bc(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f13012b = linkCrossRoomWidget;
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13011a, false, 7029, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13011a, false, 7029, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ((VHeadView) view).setOnClickListener(new ba(this.f13012b));
    }
}
