package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.c.c;
import com.bytedance.android.livesdk.chatroom.f.b;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bd implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13013a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkCrossRoomWidget f13014b;

    bd(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f13014b = linkCrossRoomWidget;
    }

    public final void a(View view, Object obj) {
        if (PatchProxy.isSupport(new Object[]{view, obj}, this, f13013a, false, 7030, new Class[]{View.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, obj}, this, f13013a, false, 7030, new Class[]{View.class, Object.class}, Void.TYPE);
            return;
        }
        LinkCrossRoomWidget linkCrossRoomWidget = this.f13014b;
        VHeadView vHeadView = (VHeadView) view;
        b.a((ImageView) vHeadView, ((User) obj).getAvatarThumb(), 2130841141);
        if (linkCrossRoomWidget.f12601b) {
            vHeadView.setVisibility(0);
        }
    }
}
