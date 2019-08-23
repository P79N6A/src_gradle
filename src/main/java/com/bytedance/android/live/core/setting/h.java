package com.bytedance.android.live.core.setting;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;
import io.reactivex.functions.Consumer;
import org.json.JSONObject;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8170a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f8171b = new h();

    private h() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f8170a, false, 915, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f8170a, false, 915, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        if (((Boolean) obj).booleanValue()) {
            try {
                JSONObject jSONObject = new JSONObject(g.f8167b.getString("key_ttlive_sdk_setting", ""));
                if (PatchProxy.isSupport(new Object[]{"key_ttlive_sdk_setting", jSONObject}, null, g.f8166a, true, 898, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{"key_ttlive_sdk_setting", jSONObject}, null, g.f8166a, true, 898, new Class[]{String.class, JSONObject.class}, Void.TYPE);
                } else {
                    g.f8168c.put("key_ttlive_sdk_setting", jSONObject);
                    g.f8169d.clear();
                    if (g.f8169d.get("key_ttlive_sdk_setting") != null) {
                        g.f8169d.get("key_ttlive_sdk_setting").clear();
                    }
                    c.a(g.a(), "ttlive_sdk_shared_pref_cache", 0).edit().putString("key_ttlive_sdk_setting", jSONObject.toString()).apply();
                }
            } catch (Exception unused) {
            }
        }
    }
}
