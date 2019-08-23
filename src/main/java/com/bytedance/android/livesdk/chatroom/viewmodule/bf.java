package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.c.c;
import com.bytedance.android.livesdk.chatroom.f.b;
import com.bytedance.android.livesdk.utils.u;
import com.bytedance.common.utility.Lists;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bf implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13017a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkCrossRoomWidget f13018b;

    bf(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f13018b = linkCrossRoomWidget;
    }

    public final void a(View view, Object obj) {
        if (PatchProxy.isSupport(new Object[]{view, obj}, this, f13017a, false, 7032, new Class[]{View.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, obj}, this, f13017a, false, 7032, new Class[]{View.class, Object.class}, Void.TYPE);
            return;
        }
        LinkCrossRoomWidget linkCrossRoomWidget = this.f13018b;
        HSImageView hSImageView = (HSImageView) view;
        User user = (User) obj;
        if (Lists.isEmpty(linkCrossRoomWidget.f12602c.getCover().getUrls())) {
            b.a(hSImageView, user.getAvatarLarge(), (Postprocessor) new u(8));
        } else {
            b.a(hSImageView, linkCrossRoomWidget.f12602c.getCover(), (Postprocessor) new u(8));
        }
    }
}
