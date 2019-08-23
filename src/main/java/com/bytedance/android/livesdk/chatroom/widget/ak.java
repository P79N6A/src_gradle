package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.rank.UserRankDialog2;
import com.bytedance.android.livesdk.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;

public final /* synthetic */ class ak implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13446a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f13447b;

    ak(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f13447b = liveRoomUserInfoWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13446a, false, 7996, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13446a, false, 7996, new Class[]{View.class}, Void.TYPE);
            return;
        }
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f13447b;
        if (PatchProxy.isSupport(new Object[0], liveRoomUserInfoWidget, LiveRoomUserInfoWidget.f13402a, false, 7957, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], liveRoomUserInfoWidget, LiveRoomUserInfoWidget.f13402a, false, 7957, new Class[0], Void.TYPE);
        } else if (((Integer) LiveSettingKeys.LIVE_USER_RANK.a()).intValue() == 0) {
            ai.a((Context) liveRoomUserInfoWidget.o, (int) C0906R.string.cyv);
        } else {
            if (liveRoomUserInfoWidget.t != null && liveRoomUserInfoWidget.t.isShowing()) {
                liveRoomUserInfoWidget.t.dismiss();
            }
            liveRoomUserInfoWidget.t = null;
            liveRoomUserInfoWidget.t = UserRankDialog2.a(liveRoomUserInfoWidget.o, liveRoomUserInfoWidget.f13406e, liveRoomUserInfoWidget.f13407f, liveRoomUserInfoWidget.r, liveRoomUserInfoWidget.g, liveRoomUserInfoWidget.dataCenter);
            liveRoomUserInfoWidget.t.show(liveRoomUserInfoWidget.o.getSupportFragmentManager(), "dialog2");
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live");
            hashMap.put("event_type", "click");
            hashMap.put("event_page", "live_detail");
            hashMap.put("event_module", "top_tab");
            a.a().a("audience_list_click", new j().b("live").f("click").a("live_detail").c("top_tab"));
        }
    }
}
