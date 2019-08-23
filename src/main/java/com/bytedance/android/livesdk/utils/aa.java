package com.bytedance.android.livesdk.utils;

import android.content.Context;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17560a;

    public static void a(Room room) {
        if (PatchProxy.isSupport(new Object[]{room}, null, f17560a, true, 13705, new Class[]{Room.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room}, null, f17560a, true, 13705, new Class[]{Room.class}, Void.TYPE);
            return;
        }
        Context a2 = TTLiveSDKContext.getHostService().a().a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("request_id", room.getRequestId());
            jSONObject.put("log_pb", room.getLog_pb());
            jSONObject.put("source", room.getUserFrom());
        } catch (JSONException unused) {
        }
        f.a(a2).a("permission_popup", "guest_show", room.getOwner().getId(), room.getId(), jSONObject);
    }

    public static void a(Room room, boolean z, String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{room, Byte.valueOf(z ? (byte) 1 : 0), str3}, null, f17560a, true, 13707, new Class[]{Room.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room, Byte.valueOf(z), str3}, null, f17560a, true, 13707, new Class[]{Room.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        Context a2 = TTLiveSDKContext.getHostService().a().a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str3);
            if (z) {
                str2 = "live_type";
            } else {
                str2 = "voice_type";
            }
            jSONObject.put("connection_type", str2);
            jSONObject.put("log_pb", room.getLog_pb());
            jSONObject.put("source", room.getUserFrom());
            jSONObject.put("request_id", room.getRequestId());
        } catch (JSONException unused) {
        }
        f.a(a2).a("click_connection_button", "guest_connection", TTLiveSDKContext.getHostService().k().b(), room.getId(), jSONObject);
    }

    public static void a(Room room, String str, String str2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{room, str, str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f17560a, true, 13704, new Class[]{Room.class, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room, str, str2, Byte.valueOf(z)}, null, f17560a, true, 13704, new Class[]{Room.class, String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Context a2 = TTLiveSDKContext.getHostService().a().a();
        if (z) {
            f.a(a2).a(str, str2, TTLiveSDKContext.getHostService().k().b(), room.getId());
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("request_id", room.getRequestId());
            jSONObject.put("log_pb", room.getLog_pb());
            jSONObject.put("source", room.getUserFrom());
        } catch (JSONException unused) {
        }
        f.a(a2).a(str, str2, TTLiveSDKContext.getHostService().k().b(), room.getId(), jSONObject);
    }
}
