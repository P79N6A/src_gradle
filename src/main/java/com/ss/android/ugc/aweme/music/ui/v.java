package com.ss.android.ugc.aweme.music.ui;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56778a;

    public static JSONObject a(Map<String, String> map) {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{map2}, null, f56778a, true, 60417, new Class[]{Map.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{map2}, null, f56778a, true, 60417, new Class[]{Map.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        if (map2 != null) {
            for (String next : map.keySet()) {
                try {
                    if (TextUtils.equals("log_pb", next)) {
                        jSONObject.put(next, new JSONObject(map2.get(next)));
                    } else {
                        jSONObject.put(next, map2.get(next));
                    }
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }
}
