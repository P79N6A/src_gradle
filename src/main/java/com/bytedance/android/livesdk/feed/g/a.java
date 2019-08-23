package com.bytedance.android.livesdk.feed.g;

import com.bytedance.android.live.core.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public class a extends b {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f14167b;

    /* renamed from: c  reason: collision with root package name */
    private static a f14168c;

    private a() {
    }

    public static synchronized a b() {
        synchronized (a.class) {
            if (PatchProxy.isSupport(new Object[0], null, f14167b, true, 8766, new Class[0], a.class)) {
                a aVar = (a) PatchProxy.accessDispatch(new Object[0], null, f14167b, true, 8766, new Class[0], a.class);
                return aVar;
            }
            if (f14168c == null) {
                f14168c = new a();
            }
            a aVar2 = f14168c;
            return aVar2;
        }
    }

    public final JSONObject a() {
        if (PatchProxy.isSupport(new Object[0], this, f14167b, false, 8767, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f14167b, false, 8767, new Class[0], JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user_id", String.valueOf(com.bytedance.android.livesdk.feed.b.b.c().l().c()));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
