package com.ss.android.ugc.aweme.effectplatform;

import android.support.annotation.NonNull;
import com.google.common.a.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.shortvideo.bi;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.b.g;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class j implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43858a;

    /* renamed from: b  reason: collision with root package name */
    private g f43859b;

    /* renamed from: c  reason: collision with root package name */
    private q f43860c = q.b();

    /* renamed from: d  reason: collision with root package name */
    private String f43861d;

    private static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, f43858a, true, 38998, new Class[]{JSONObject.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, f43858a, true, 38998, new Class[]{JSONObject.class}, JSONObject.class);
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("tag", "ttlive_sdk");
            if (jSONObject2 != null) {
                jSONObject3.put(PushConstants.EXTRA, jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject3;
    }

    public final void a(c cVar) {
        String str;
        int i;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f43858a, false, 39000, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f43858a, false, 39000, new Class[]{c.class}, Void.TYPE);
            return;
        }
        if (cVar == null) {
            i = -2;
            str = "unknow error";
        } else {
            i = cVar.f77315a;
            str = cVar.f77316b;
        }
        n.a("sticker_list_error_rate", 1, new bi().a("errorCode", Integer.valueOf(i)).a("errorDesc", str).a("panel", this.f43861d).b());
        JSONObject b2 = new bi().a("error_code", Integer.valueOf(i)).a("error_msg", str).a("panel_type", this.f43861d).b();
        n.a("ttlive_load_sticker_list_all", 1, null, a(b2));
        n.a("ttlive_load_sticker_list_error", 1, b2);
        if (this.f43859b != null) {
            this.f43859b.a(cVar);
        }
    }

    public final void a(EffectChannelResponse effectChannelResponse) {
        if (PatchProxy.isSupport(new Object[]{effectChannelResponse}, this, f43858a, false, 38999, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effectChannelResponse}, this, f43858a, false, 38999, new Class[]{EffectChannelResponse.class}, Void.TYPE);
            return;
        }
        JSONObject b2 = new bi().a("duration", Long.valueOf(this.f43860c.a(TimeUnit.MILLISECONDS))).a("panel", this.f43861d).b();
        n.a("sticker_list_error_rate", 0, b2);
        n.a("ttlive_load_sticker_list_all", 0, b2, a(new bi().a("panel_type", this.f43861d).b()));
        if (this.f43859b != null) {
            this.f43859b.a(effectChannelResponse);
        }
    }

    private j(String str, g gVar) {
        this.f43859b = gVar;
        this.f43861d = str;
    }

    public static j a(String str, @NonNull g gVar) {
        String str2 = str;
        g gVar2 = gVar;
        if (!PatchProxy.isSupport(new Object[]{str2, gVar2}, null, f43858a, true, 38997, new Class[]{String.class, g.class}, j.class)) {
            return new j(str2, gVar2);
        }
        return (j) PatchProxy.accessDispatch(new Object[]{str2, gVar2}, null, f43858a, true, 38997, new Class[]{String.class, g.class}, j.class);
    }
}
