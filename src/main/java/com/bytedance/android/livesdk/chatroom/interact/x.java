package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.live.core.d.a;
import com.bytedance.android.live.core.d.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public final class x extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f11014b;

    public static void a(String str, String str2, String str3, String str4, String str5, String str6) {
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, str4, str5, str6}, null, f11014b, true, 4437, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str, str2, str3, str4, str5, str6};
            PatchProxy.accessDispatch(objArr, null, f11014b, true, 4437, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, str, str2, str3, str4, str5, str6);
        e.b("ttlive_interact_connect_status_all", 0, jSONObject);
    }

    private static void a(JSONObject jSONObject, String str, String str2, String str3, String str4, String str5, String str6) {
        JSONObject jSONObject2 = jSONObject;
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, str7, str8, str9, str10, str11, str12}, null, f11014b, true, 4439, new Class[]{JSONObject.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, str7, str8, str9, str10, str11, str12}, null, f11014b, true, 4439, new Class[]{JSONObject.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        a(jSONObject2, "role_type", str7);
        a(jSONObject2, "line_type", str8);
        a(jSONObject2, "vendor", str9);
        a(jSONObject2, "interact_id", str10);
        a(jSONObject2, "channel_id", str11);
        a(jSONObject2, "to_uid", str12);
    }

    public static void a(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str8, str2, str3, str4, str5, str6, str7}, null, f11014b, true, 4438, new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str8, str2, str3, str4, str5, str6, str7}, null, f11014b, true, 4438, new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, "error_code", (long) i);
        a(jSONObject, "error_msg", str8);
        a(jSONObject, str2, str3, str4, str5, str6, str7);
        e.b("ttlive_interact_connect_status_all", 1, jSONObject);
        e.a("ttlive_interact_connect_status_error", 1, jSONObject);
    }
}
