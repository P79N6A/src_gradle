package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import org.json.JSONException;
import org.json.JSONObject;

public final class dm {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75755a;

    static final /* synthetic */ Object a() throws Exception {
        an<String> anVar;
        an<String> anVar2;
        int updateVersionCode = i.a().getUpdateVersionCode();
        String channel = i.a().getChannel();
        String version = i.a().getVersion();
        an<Integer> ae = x.a().ae();
        x a2 = x.a();
        if (PatchProxy.isSupport(new Object[0], a2, x.f2698a, false, 22450, new Class[0], an.class)) {
            anVar = (an) PatchProxy.accessDispatch(new Object[0], a2, x.f2698a, false, 22450, new Class[0], an.class);
        } else {
            if (a2.f2699b == null) {
                a2.f2699b = new an<>("last_app_version_name", "");
            }
            anVar = a2.f2699b;
        }
        x a3 = x.a();
        if (PatchProxy.isSupport(new Object[0], a3, x.f2698a, false, 22458, new Class[0], an.class)) {
            anVar2 = (an) PatchProxy.accessDispatch(new Object[0], a3, x.f2698a, false, 22458, new Class[0], an.class);
        } else {
            if (a3.f2700c == null) {
                a3.f2700c = new an<>("last_channel_name", "");
            }
            anVar2 = a3.f2700c;
        }
        int intValue = ((Integer) ae.c()).intValue();
        if (a.a() && ((Integer) SharePrefCache.inst().getIsNewInstall().c()).intValue() == -1) {
            if (intValue == 0) {
                SharePrefCache.inst().getIsNewInstall().a(1);
            } else {
                SharePrefCache.inst().getIsNewInstall().a(0);
            }
        }
        if (a.a() && ((Integer) SharePrefCache.inst().getIsNewInstall().c()).intValue() == -1) {
            if (intValue == 0) {
                SharePrefCache.inst().getIsNewInstall().a(1);
            } else {
                SharePrefCache.inst().getIsNewInstall().a(0);
            }
        }
        if (intValue == 0) {
            ae.a(Integer.valueOf(updateVersionCode));
            anVar.a(version);
            anVar2.a(channel);
        } else if (updateVersionCode > intValue) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("last_app_version", anVar.c());
                jSONObject.put("last_channel_name", anVar2.c());
            } catch (JSONException unused) {
            }
            r.onEvent(new MobClick().setEventName("update_from").setLabelName("lite_update").setJsonObject(jSONObject));
            ae.a(Integer.valueOf(updateVersionCode));
            anVar.a(version);
            anVar2.a(channel);
        }
        return null;
    }
}
