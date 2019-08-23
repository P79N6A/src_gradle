package com.ss.android.ugc.aweme.video.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.video.o;
import com.toutiao.proxyserver.Proxy;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76056a;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f76056a, true, 89326, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f76056a, true, 89326, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return AbTestManager.a().af();
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f76056a, true, 89327, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f76056a, true, 89327, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return AbTestManager.a().ag();
    }

    public static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f76056a, true, 89328, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f76056a, true, 89328, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return AbTestManager.a().ah();
    }

    private static boolean d() {
        if (PatchProxy.isSupport(new Object[0], null, f76056a, true, 89329, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f76056a, true, 89329, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return a.a();
    }

    private static boolean e() {
        if (PatchProxy.isSupport(new Object[0], null, f76056a, true, 89330, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f76056a, true, 89330, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return AbTestManager.a().am();
    }

    public static com.ss.android.ugc.aweme.app.d.c a(com.ss.android.ugc.aweme.app.d.c cVar) {
        com.ss.android.ugc.aweme.app.d.c cVar2;
        if (PatchProxy.isSupport(new Object[]{cVar}, null, f76056a, true, 89324, new Class[]{com.ss.android.ugc.aweme.app.d.c.class}, com.ss.android.ugc.aweme.app.d.c.class)) {
            return (com.ss.android.ugc.aweme.app.d.c) PatchProxy.accessDispatch(new Object[]{cVar}, null, f76056a, true, 89324, new Class[]{com.ss.android.ugc.aweme.app.d.c.class}, com.ss.android.ugc.aweme.app.d.c.class);
        }
        if (cVar == null) {
            cVar2 = com.ss.android.ugc.aweme.app.d.c.a();
        } else {
            cVar2 = cVar;
        }
        cVar2.a("playerType", o.b().m().toString());
        cVar2.a("from", "PlayerCommonParamManager");
        cVar2.a("is_break_resume_check_enabled", Boolean.valueOf(a()));
        cVar2.a("is_force_request_validation", Boolean.valueOf(b()));
        cVar2.a("is_play_link_select_enabled", Boolean.valueOf(c()));
        cVar2.a("is_preload_enabled", Boolean.valueOf(d()));
        cVar2.a("need_pre_load_in_settings", (Boolean) SharePrefCache.inst().getVideoPreload().c());
        cVar2.a("weak_net_pre_load_switch_in_settings", (Integer) SharePrefCache.inst().getWeakNetPreLoadSwitch().c());
        cVar2.a("use_video_cache_http_dns", Boolean.valueOf(e()));
        cVar2.a("video_cache_use_ttnet", Boolean.valueOf(Proxy.k));
        cVar2.a("multi_player", Integer.valueOf(o.f76179d ? 1 : 0));
        return cVar2;
    }

    public static JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{jSONObject}, null, f76056a, true, 89325, new Class[]{JSONObject.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{jSONObject}, null, f76056a, true, 89325, new Class[]{JSONObject.class}, JSONObject.class);
        }
        if (jSONObject == null) {
            jSONObject2 = new JSONObject();
        } else {
            jSONObject2 = jSONObject;
        }
        jSONObject2.put("playerType", o.b().m().toString());
        jSONObject2.put("from", "PlayerCommonParamManager");
        jSONObject2.put("is_break_resume_check_enabled", a());
        jSONObject2.put("is_force_request_validation", b());
        jSONObject2.put("is_play_link_select_enabled", c());
        jSONObject2.put("is_preload_enabled", d());
        jSONObject2.put("need_pre_load_in_settings", SharePrefCache.inst().getVideoPreload().c());
        jSONObject2.put("weak_net_pre_load_switch_in_settings", SharePrefCache.inst().getWeakNetPreLoadSwitch().c());
        if (AbTestManager.a().d().useTTNet != 1) {
            z = false;
        }
        jSONObject2.put("video_cache_use_ttnet", z);
        jSONObject2.put("multi_player", o.f76179d ? 1 : 0);
        return jSONObject2;
    }
}
