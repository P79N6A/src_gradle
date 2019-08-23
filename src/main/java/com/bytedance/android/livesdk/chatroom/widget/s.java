package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class s implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13551a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f13552b;

    s(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f13552b = liveRoomUserInfoWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13551a, false, 7980, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13551a, false, 7980, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f13552b;
        User user = (User) obj;
        if (liveRoomUserInfoWidget.isViewValid()) {
            User from = User.from(user);
            ((Room) liveRoomUserInfoWidget.dataCenter.get("data_room")).getOwner().setFollowInfo(from.getFollowInfo());
            liveRoomUserInfoWidget.dataCenter.lambda$put$1$DataCenter("data_is_followed", Boolean.valueOf(from.isFollowing()));
            if (from.isFollowing()) {
                liveRoomUserInfoWidget.h.setVisibility(8);
                if (liveRoomUserInfoWidget.u) {
                    liveRoomUserInfoWidget.b((int) UIUtils.dip2Px(liveRoomUserInfoWidget.getContext(), 6.0f));
                    liveRoomUserInfoWidget.i.setVisibility(0);
                    if (liveRoomUserInfoWidget.v && from.getFansClub() != null && !((Boolean) b.ab.a()).booleanValue()) {
                        liveRoomUserInfoWidget.contentView.postDelayed(new ag(liveRoomUserInfoWidget), 1000);
                    }
                } else {
                    liveRoomUserInfoWidget.b((int) UIUtils.dip2Px(liveRoomUserInfoWidget.getContext(), 12.0f));
                }
            } else if (liveRoomUserInfoWidget.s) {
                liveRoomUserInfoWidget.b();
            } else {
                liveRoomUserInfoWidget.b((int) UIUtils.dip2Px(liveRoomUserInfoWidget.getContext(), 6.0f));
                liveRoomUserInfoWidget.c(0);
                liveRoomUserInfoWidget.j.setVisibility(8);
                liveRoomUserInfoWidget.k.setVisibility(0);
                liveRoomUserInfoWidget.h.setVisibility(0);
                liveRoomUserInfoWidget.i.setVisibility(8);
            }
        }
    }
}
