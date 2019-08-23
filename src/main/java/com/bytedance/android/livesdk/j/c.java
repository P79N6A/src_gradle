package com.bytedance.android.livesdk.j;

import com.bytedance.android.live.core.c.b;
import com.bytedance.android.livesdk.j.b.g;
import com.bytedance.android.livesdk.j.b.n;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends b {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f15668b;

    /* renamed from: c  reason: collision with root package name */
    private static c f15669c;

    private c() {
    }

    public static synchronized c b() {
        synchronized (c.class) {
            if (PatchProxy.isSupport(new Object[0], null, f15668b, true, 10868, new Class[0], c.class)) {
                c cVar = (c) PatchProxy.accessDispatch(new Object[0], null, f15668b, true, 10868, new Class[0], c.class);
                return cVar;
            }
            if (f15669c == null) {
                f15669c = new c();
            }
            c cVar2 = f15669c;
            return cVar2;
        }
    }

    public final JSONObject a() {
        if (PatchProxy.isSupport(new Object[0], this, f15668b, false, 10869, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f15668b, false, 10869, new Class[0], JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        g a2 = a.a().a(Room.class);
        String str = "";
        String str2 = "";
        long j = 0;
        if (a2 instanceof n) {
            n nVar = (n) a2;
            if (nVar.a().containsKey("room_id")) {
                str = (String) nVar.a().get("room_id");
            }
            if (nVar.a().containsKey("anchor_id")) {
                str2 = (String) nVar.a().get("anchor_id");
            }
            j = nVar.f15664f;
        }
        try {
            jSONObject.put("user_id", String.valueOf(j));
            jSONObject.put("room_id", str);
            jSONObject.put("anchor_id", str2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
