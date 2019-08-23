package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class be implements c.C0083c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13015a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkCrossRoomWidget f13016b;

    be(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f13016b = linkCrossRoomWidget;
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13015a, false, 7031, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13015a, false, 7031, new Class[]{View.class}, Void.TYPE);
            return;
        }
        HSImageView hSImageView = (HSImageView) view;
        if (!this.f13016b.f12601b) {
            hSImageView.setVisibility(8);
        }
    }
}
