package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

public final class j implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76792a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Context> f76793b;

    public j(WeakReference<Context> weakReference) {
        this.f76793b = weakReference;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        Context context;
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76792a, false, 89943, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76792a, false, 89943, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        JSONArray jSONArray = new JSONArray();
        if (this.f76793b != null) {
            context = (Context) this.f76793b.get();
        } else {
            context = null;
        }
        if (hVar.f20623d != null) {
            JSONArray optJSONArray = hVar.f20623d.optJSONArray("app_ids");
            if (optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString) && ToolUtils.isInstalledApp(context, optString)) {
                        jSONArray.put(optString);
                    }
                }
            }
        }
        jSONObject.put("code", 0);
        jSONObject.put("response", jSONArray);
    }
}
