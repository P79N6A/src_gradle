package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.rank.UserRankDialog2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13549a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomOnlineUserWidget f13550b;

    r(LiveRoomOnlineUserWidget liveRoomOnlineUserWidget) {
        this.f13550b = liveRoomOnlineUserWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13549a, false, 7949, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13549a, false, 7949, new Class[]{View.class}, Void.TYPE);
            return;
        }
        LiveRoomOnlineUserWidget liveRoomOnlineUserWidget = this.f13550b;
        if (PatchProxy.isSupport(new Object[0], liveRoomOnlineUserWidget, LiveRoomOnlineUserWidget.f13396a, false, 7941, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], liveRoomOnlineUserWidget, LiveRoomOnlineUserWidget.f13396a, false, 7941, new Class[0], Void.TYPE);
            return;
        }
        if (liveRoomOnlineUserWidget.f13398c != null) {
            liveRoomOnlineUserWidget.f13398c.dismiss();
        }
        liveRoomOnlineUserWidget.f13398c = UserRankDialog2.a(liveRoomOnlineUserWidget.g, liveRoomOnlineUserWidget.f13397b, liveRoomOnlineUserWidget.f13401f, liveRoomOnlineUserWidget.f13399d, liveRoomOnlineUserWidget.f13400e, liveRoomOnlineUserWidget.dataCenter);
        liveRoomOnlineUserWidget.f13398c.f16905e = true;
        liveRoomOnlineUserWidget.f13398c.show(liveRoomOnlineUserWidget.g.getSupportFragmentManager(), "dialog2");
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live");
        hashMap.put("event_type", "click");
        hashMap.put("event_page", "live_detail");
        hashMap.put("event_module", "top_tab");
        a.a().a("audience_list_click", new j().b("live").f("click").a("live_detail").c("top_tab"));
    }
}
