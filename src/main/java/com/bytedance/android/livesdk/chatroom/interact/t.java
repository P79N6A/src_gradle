package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.j.h;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import org.json.JSONException;
import org.json.JSONObject;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10996a;

    public static void a(long j, String str, String str2, int i, String str3) {
        long j2 = j;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str4, str5, Integer.valueOf(i), str6}, null, f10996a, true, 4432, new Class[]{Long.TYPE, String.class, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {new Long(j2), str4, str5, Integer.valueOf(i), str6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f10996a, true, 4432, new Class[]{Long.TYPE, String.class, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("room_id", j2);
            jSONObject.put("channel_id", str4);
            jSONObject.put("vendor", str5);
            jSONObject.put("type", i);
            jSONObject.put("desc", str6);
            a(jSONObject);
        } catch (JSONException unused) {
        }
        new h().a(jSONObject).a(jSONObject).a("hotsoon_live_interact_exception_track");
    }

    public static void a(String str, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2)}, null, f10996a, true, 4433, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2)}, null, f10996a, true, 4433, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        j.q().d().a().reportStartLinkStatus(str.toLowerCase(), i, i2).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).subscribe(u.f10998b, v.f11000b);
    }

    private static void a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, f10996a, true, 4434, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, f10996a, true, 4434, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        jSONObject2.put("interact_id", LinkCrossRoomDataHolder.a().n);
        jSONObject2.put("channel_id", LinkCrossRoomDataHolder.a().f9030d);
        jSONObject2.put("to_uid", LinkCrossRoomDataHolder.a().f9032f);
    }

    public static void a(long j, int i, String str) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), str}, null, f10996a, true, 4429, new Class[]{Long.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), str}, null, f10996a, true, 4429, new Class[]{Long.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", (double) (((float) j2) / 1000.0f));
            a(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("type", i);
                jSONObject2.put("vendor", str.toLowerCase());
                a(jSONObject2);
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            new h().a(jSONObject2).b(jSONObject).a("hotsoon_live_interact_first_frame_delay");
        } catch (JSONException unused2) {
        }
    }

    public static void a(long j, String str, String str2) {
        long j2 = j;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str3, str2}, null, f10996a, true, 4430, new Class[]{Long.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), str3, str2}, null, f10996a, true, 4430, new Class[]{Long.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j2);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("lineType", str3);
                jSONObject2.put("vendor", str2.toLowerCase());
                a(jSONObject2);
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            new h().a(jSONObject2).b(jSONObject).a("hotsoon_live_interact_connection_delay");
        } catch (JSONException unused2) {
        }
    }

    public static void a(int i, int i2, Object obj, String str, String str2, String str3) {
        int i3 = i;
        Object obj2 = obj;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2, str4, str5, str3}, null, f10996a, true, 4428, new Class[]{Integer.TYPE, Integer.TYPE, Object.class, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2, str4, str5, str3}, null, f10996a, true, 4428, new Class[]{Integer.TYPE, Integer.TYPE, Object.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i2);
            jSONObject.put("errorExtra", obj2);
            jSONObject.put("roleType", str4);
            jSONObject.put("lineType", str5);
            jSONObject.put("vendor", str3.toLowerCase());
            a(jSONObject);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        new h().a(jSONObject).a("hotsoon_live_interact_connect_failure_rate", i3);
        LinkCrossRoomDataHolder a2 = LinkCrossRoomDataHolder.a();
        String str6 = a2.n;
        String str7 = a2.f9030d;
        String str8 = a2.f9032f;
        if (i3 == 0) {
            x.a(str, str2, str3, str6, str7, str8);
            return;
        }
        x.a(i2, obj.toString(), str, str2, str3, str6, str7, str8);
    }

    public static void a(int i, int i2, Object obj, String str, String str2, String str3, String str4) {
        Object obj2 = obj;
        String str5 = str;
        String str6 = str2;
        String str7 = str4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2, str5, str6, str3, str7}, null, f10996a, true, 4431, new Class[]{Integer.TYPE, Integer.TYPE, Object.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2, str5, str6, str3, str7}, null, f10996a, true, 4431, new Class[]{Integer.TYPE, Integer.TYPE, Object.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i2);
            jSONObject.put("errorExtra", obj2);
            jSONObject.put("roleType", str5);
            jSONObject.put("lineType", str6);
            jSONObject.put("vendor", str3.toLowerCase());
            jSONObject.put("channelId", str7);
            a(jSONObject);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        new h().a(jSONObject).a("hotsoon_live_interact_leave_channel_failure_rate", i);
    }
}
