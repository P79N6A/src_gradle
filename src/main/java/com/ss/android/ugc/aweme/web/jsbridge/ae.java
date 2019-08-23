package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.sdk.c.b.e;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class ae extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76683a;

    /* renamed from: b  reason: collision with root package name */
    private a f76684b;

    public ae(WeakReference<Context> weakReference, a aVar) {
        super(weakReference);
        this.f76684b = aVar;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject}, this, f76683a, false, 90023, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject}, this, f76683a, false, 90023, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        String string = hVar2.f20623d.getString("type");
        hVar2.f20622c = "open";
        hVar2.f20623d.put("type", "openRecord");
        if (hVar2.f20623d.has("args")) {
            JSONObject jSONObject2 = hVar2.f20623d.getJSONObject("args");
            jSONObject2.put("recordOrigin", "jsBridge");
            if ("challenge".equals(string)) {
                jSONObject2.put("id", jSONObject2.get("challenge_id"));
                jSONObject2.put("recordParam", "challenge");
            } else if ("music".equals(string)) {
                jSONObject2.put("id", jSONObject2.get("music_id"));
                jSONObject2.put("recordParam", "music");
            } else if ("effect".equals(string)) {
                jSONObject2.put("id", jSONObject2.get("effect_id"));
                jSONObject2.put("recordParam", "sticker");
            } else if ("donation".equals(string) && jSONObject2 != null) {
                jSONObject2.put("id", jSONObject2.get("charity_id"));
                jSONObject2.put("recordParam", "donation");
            } else if ("star_atlas".equals(string)) {
                jSONObject2.put("id", jSONObject2.get("star_atlas_id"));
                jSONObject2.put("recordParam", "star_atlas");
            } else if ("is_star_atlas".equals(string)) {
                jSONObject2.put("is_star_atlas", jSONObject2.get("is_star_atlas"));
                jSONObject2.put("recordParam", "is_star_atlas");
            }
            jSONObject2.put("group", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        }
        open(hVar2.f20623d);
    }
}
