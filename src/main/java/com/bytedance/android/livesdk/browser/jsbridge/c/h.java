package com.bytedance.android.livesdk.browser.jsbridge.c;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.h.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.f.a.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class h implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9468a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Context> f9469b;

    public h(WeakReference<Context> weakReference) {
        this.f9469b = weakReference;
    }

    public final void call(com.bytedance.ies.f.a.h hVar, JSONObject jSONObject) throws Exception {
        Context context;
        Map map;
        com.bytedance.ies.f.a.h hVar2 = hVar;
        JSONObject jSONObject2 = jSONObject;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject2}, this, f9468a, false, 3645, new Class[]{com.bytedance.ies.f.a.h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject2}, this, f9468a, false, 3645, new Class[]{com.bytedance.ies.f.a.h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject3 = hVar2.f20623d;
        if (PatchProxy.isSupport(new Object[]{jSONObject3, jSONObject2}, this, f9468a, false, 3646, new Class[]{JSONObject.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject3, jSONObject2}, this, f9468a, false, 3646, new Class[]{JSONObject.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (jSONObject3 != null) {
            jSONObject3.optString(PushConstants.TITLE);
            jSONObject3.optString("desc");
            jSONObject3.optString("image");
            jSONObject3.optString(PushConstants.WEB_URL);
            String optString = jSONObject3.optString("platform");
            String optString2 = jSONObject3.optString("type");
            if (this.f9469b == null) {
                context = null;
            } else {
                context = (Context) this.f9469b.get();
            }
            Context context2 = context;
            if (!StringUtils.isEmpty(optString) && context2 != null) {
                if ("live_room".equals(optString2)) {
                    JSONObject optJSONObject = jSONObject3.optJSONObject("url_extra");
                    if (PatchProxy.isSupport(new Object[]{optJSONObject}, this, f9468a, false, 3647, new Class[]{JSONObject.class}, Map.class)) {
                        map = (Map) PatchProxy.accessDispatch(new Object[]{optJSONObject}, this, f9468a, false, 3647, new Class[]{JSONObject.class}, Map.class);
                    } else {
                        map = new HashMap();
                        if (optJSONObject != null) {
                            Iterator<String> keys = optJSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                Object obj = optJSONObject.get(next);
                                if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                                    map.put(next, String.valueOf(obj));
                                }
                            }
                        }
                    }
                    Room a2 = TTLiveSDKContext.getLiveService().d().a();
                    if (a2 == null || a2.getShareUrl() == null) {
                        jSONObject3.put("code", 0);
                        return;
                    }
                    Uri.Builder buildUpon = Uri.parse(a2.getShareUrl()).buildUpon();
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    buildUpon.appendQueryParameter("share_ht_uid", String.valueOf(TTLiveSDKContext.getHostService().k().b()));
                    TTLiveSDKContext.getHostService().g().a((Activity) context2, b.a(a2).f(optString).a(map).c(buildUpon.toString()).a());
                    jSONObject2.put("code", 1);
                } else {
                    com.bytedance.android.livesdk.browser.g.b b2 = j.q().h().b().b(context2);
                    if (!(b2 == null || b2.f9404d == null)) {
                        Uri.Builder buildUpon2 = Uri.parse(b2.f9404d).buildUpon();
                        buildUpon2.appendQueryParameter("share_ht_uid", String.valueOf(TTLiveSDKContext.getHostService().k().b()));
                        b.a f2 = b.a().f(optString);
                        f2.p = b2.f9401a;
                        TTLiveSDKContext.getHostService().g().a((Activity) context2, f2.a(b2.f9402b).b(b2.f9403c).c(buildUpon2.toString()).a());
                        i = 1;
                    }
                    jSONObject2.put("code", i);
                }
            }
        }
    }
}
