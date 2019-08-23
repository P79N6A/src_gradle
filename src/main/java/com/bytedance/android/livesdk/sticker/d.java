package com.bytedance.android.livesdk.sticker;

import com.bytedance.android.live.core.d.e;
import com.bytedance.android.livesdk.j.a.a;
import com.bytedance.android.livesdk.j.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public final class d extends g {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f17277b;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f17277b, false, 13341, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17277b, false, 13341, new Class[0], Void.TYPE);
            return;
        }
        e.a("ttlive_load_gesture_magic_list_all", 0, d(), new JSONObject());
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f17277b, false, 13343, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17277b, false, 13343, new Class[0], Void.TYPE);
            return;
        }
        e.a("ttlive_download_gesture_magic_sticker_all", 0, f(), new JSONObject());
    }

    public final void a(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f17277b, false, 13342, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f17277b, false, 13342, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        d();
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, "error_code", (long) i);
        a(jSONObject, "error_msg", str2);
        e.b("ttlive_load_gesture_magic_list_all", 1, jSONObject);
        e.a("ttlive_load_gesture_magic_list_error", 1, jSONObject);
        a.a().a(b.Room.info, "ttlive_load_gesture_magic_list", 1, jSONObject);
    }

    public final void b(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f17277b, false, 13344, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f17277b, false, 13344, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        f();
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, "error_code", (long) i);
        a(jSONObject, "error_msg", str2);
        e.b("ttlive_download_gesture_magic_sticker_all", 1, jSONObject);
        e.a("ttlive_download_gesture_magic_sticker_error", 1, jSONObject);
        a.a().a(b.Room.info, "ttlive_download_gesture_magic_sticker", 1, jSONObject);
    }
}
