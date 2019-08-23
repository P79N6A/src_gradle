package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdk.message.model.be;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class eh implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13215a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomPushWidget f13216b;

    /* renamed from: c  reason: collision with root package name */
    private final be f13217c;

    /* renamed from: d  reason: collision with root package name */
    private final String f13218d;

    eh(RoomPushWidget roomPushWidget, be beVar, String str) {
        this.f13216b = roomPushWidget;
        this.f13217c = beVar;
        this.f13218d = str;
    }

    public final void onClick(View view) {
        long id;
        if (PatchProxy.isSupport(new Object[]{view}, this, f13215a, false, 7469, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13215a, false, 7469, new Class[]{View.class}, Void.TYPE);
            return;
        }
        RoomPushWidget roomPushWidget = this.f13216b;
        be beVar = this.f13217c;
        String str = this.f13218d;
        if (roomPushWidget.isViewValid()) {
            if (!TextUtils.isEmpty(beVar.f16553b.f16556c)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("trace_id", beVar.f16553b.f16556c);
                    i a2 = TTLiveSDKContext.getHostService().k().a();
                    f a3 = f.a(roomPushWidget.context);
                    if (a2 == null) {
                        id = 0;
                    } else {
                        id = a2.getId();
                    }
                    a3.a("click_roompush", "", id, roomPushWidget.f12796e.getId(), jSONObject);
                } catch (JSONException unused) {
                }
            }
            if (PatchProxy.isSupport(new Object[0], roomPushWidget, RoomPushWidget.f12792a, false, 7462, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], roomPushWidget, RoomPushWidget.f12792a, false, 7462, new Class[0], Void.TYPE);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("anchor_id", String.valueOf(roomPushWidget.f12796e.getOwnerUserId()));
                hashMap.put("room_id", String.valueOf(roomPushWidget.f12796e.getId()));
                a.a().a("livesdk_bottom_message_click", hashMap, new Object[0]);
            }
            roomPushWidget.a(str, beVar.f16553b.f16558e);
        }
    }
}
