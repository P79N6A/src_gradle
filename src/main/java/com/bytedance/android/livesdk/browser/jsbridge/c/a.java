package com.bytedance.android.livesdk.browser.jsbridge.c;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.android.ClipboardCompat;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9445a;

    /* renamed from: b  reason: collision with root package name */
    Context f9446b;

    public a(Context context) {
        this.f9446b = context;
    }

    public void call(h hVar, JSONObject jSONObject) throws Exception {
        String str;
        String str2;
        Map map;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f9445a, false, 3616, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f9445a, false, 3616, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject2 = null;
        if (hVar.f20623d != null) {
            str = hVar.f20623d.optString(PushConstants.CONTENT);
        } else {
            str = null;
        }
        if (hVar.f20623d != null) {
            str2 = hVar.f20623d.optString("type");
        } else {
            str2 = null;
        }
        if ("live_room".equals(str2)) {
            if (hVar.f20623d != null) {
                jSONObject2 = hVar.f20623d.optJSONObject("url_extra");
            }
            JSONObject jSONObject3 = jSONObject2;
            if (PatchProxy.isSupport(new Object[]{jSONObject3}, this, f9445a, false, 3618, new Class[]{JSONObject.class}, Map.class)) {
                map = (Map) PatchProxy.accessDispatch(new Object[]{jSONObject3}, this, f9445a, false, 3618, new Class[]{JSONObject.class}, Map.class);
            } else {
                map = new HashMap();
                if (jSONObject3 != null) {
                    Iterator<String> keys = jSONObject3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object obj = jSONObject3.get(next);
                        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                            map.put(next, String.valueOf(obj));
                        }
                    }
                }
            }
            Room a2 = TTLiveSDKContext.getLiveService().d().a();
            if (!(a2 == null || a2.getShareUrl() == null)) {
                Uri.Builder buildUpon = Uri.parse(a2.getShareUrl()).buildUpon();
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                buildUpon.appendQueryParameter("share_ht_uid", String.valueOf(TTLiveSDKContext.getHostService().k().b()));
                TTLiveSDKContext.getHostService().g().a(buildUpon.toString()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new b(this, str), c.f9453b);
            }
            return;
        }
        Context context = this.f9446b;
        if (context != null) {
            ClipboardCompat.setText(context, "", str);
            i = 1;
        }
        jSONObject.put("code", i);
    }
}
