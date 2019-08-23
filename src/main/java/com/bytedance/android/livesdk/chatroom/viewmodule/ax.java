package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ax implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12999a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkCrossRoomWidget f13000b;

    ax(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f13000b = linkCrossRoomWidget;
    }

    public final void a(View view, Object obj) {
        if (PatchProxy.isSupport(new Object[]{view, obj}, this, f12999a, false, 7024, new Class[]{View.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, obj}, this, f12999a, false, 7024, new Class[]{View.class, Object.class}, Void.TYPE);
            return;
        }
        LinkCrossRoomWidget linkCrossRoomWidget = this.f13000b;
        TextView textView = (TextView) view;
        textView.setText(((User) obj).getNickName());
        if (linkCrossRoomWidget.f12601b) {
            textView.setVisibility(0);
        }
    }
}
