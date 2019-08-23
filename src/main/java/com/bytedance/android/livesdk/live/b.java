package com.bytedance.android.livesdk.live;

import com.bytedance.android.live.core.d.a;
import com.bytedance.android.live.core.d.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public final class b extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f15797b;

    public static void a(int i, String str, boolean z) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, Byte.valueOf(z ? (byte) 1 : 0)}, null, f15797b, true, 10242, new Class[]{Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, Byte.valueOf(z)}, null, f15797b, true, 10242, new Class[]{Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, "error_code", (long) i);
        a(jSONObject, "error_msg", str3);
        if (z) {
            str2 = "audio";
        } else {
            str2 = "video";
        }
        a(jSONObject, "media_type", str2);
        e.b("ttlive_create_room_all", 1, jSONObject);
        e.a("ttlive_create_room_error", 1, jSONObject);
        com.bytedance.android.livesdk.j.a.a.a().a(com.bytedance.android.livesdk.j.a.b.Room.info, "ttlive_create_room", 1, jSONObject);
    }
}
