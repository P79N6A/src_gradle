package com.bytedance.android.livesdk.rank;

import android.os.Bundle;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16915a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f16916b = com.bytedance.android.live.uikit.a.a.f();

    private static Bundle a(Room room) {
        if (PatchProxy.isSupport(new Object[]{room}, null, f16915a, true, 12922, new Class[]{Room.class}, Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[]{room}, null, f16915a, true, 12922, new Class[]{Room.class}, Bundle.class);
        } else if (room == null) {
            return null;
        } else {
            Bundle a2 = com.bytedance.android.livesdkapi.g.a.a(room);
            if (a2 == null) {
                return null;
            }
            User owner = room.getOwner();
            if (owner != null) {
                a2.putLong("anchor_id", owner.getId());
                a2.putParcelable("pre_room_user_avatar", owner.getAvatarThumb());
            }
            a2.putBoolean("can_go_back", true);
            return a2;
        }
    }

    public static void a(DataCenter dataCenter, Bundle bundle) {
        Bundle bundle2;
        String str;
        DataCenter dataCenter2 = dataCenter;
        if (PatchProxy.isSupport(new Object[]{dataCenter2, bundle}, null, f16915a, true, 12927, new Class[]{DataCenter.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataCenter2, bundle}, null, f16915a, true, 12927, new Class[]{DataCenter.class, Bundle.class}, Void.TYPE);
            return;
        }
        if (f16916b && dataCenter2 != null) {
            Room room = (Room) dataCenter2.get("data_room");
            if (room != null) {
                if (bundle == null) {
                    bundle2 = new Bundle();
                } else {
                    bundle2 = bundle;
                }
                Bundle bundle3 = (Bundle) dataCenter2.get("data_room_back_extra");
                if (Logger.debug()) {
                    StringBuilder sb = new StringBuilder("next:");
                    if (bundle3 != null) {
                        str = bundle3.toString();
                    } else {
                        str = "null";
                    }
                    sb.append(str);
                    Logger.d("BackToRoomDataUtils", sb.toString());
                }
                Bundle a2 = a(room);
                int orientation = room.getOrientation();
                if (a2 != null) {
                    a2.putInt("orientation", orientation);
                    if (bundle3 != null) {
                        a2.putBundle("log_extra", bundle3);
                    }
                    a2.putBundle("live.intent.extra.BACK_PRE_ROOM_EXTRA", (Bundle) dataCenter2.get("data_room_back"));
                    bundle2.putBundle("live.intent.extra.BACK_PRE_ROOM_EXTRA", a2);
                }
            }
        }
    }
}
