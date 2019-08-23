package com.ss.android.ugc.aweme.app.c.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.c.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class b implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34033a;

    /* renamed from: b  reason: collision with root package name */
    private final a f34034b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONArray f34035c;

    b(a aVar, JSONArray jSONArray) {
        this.f34034b = aVar;
        this.f34035c = jSONArray;
    }

    public final void a(JSONArray jSONArray) {
        if (PatchProxy.isSupport(new Object[]{jSONArray}, this, f34033a, false, 23411, new Class[]{JSONArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONArray}, this, f34033a, false, 23411, new Class[]{JSONArray.class}, Void.TYPE);
            return;
        }
        a aVar = this.f34034b;
        JSONArray jSONArray2 = this.f34035c;
        if (aVar.f34023b != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("task_list", jSONArray2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "success");
                jSONObject2.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, "get_install_status");
                jSONObject2.put("data", jSONObject);
                aVar.f34023b.a("app_ad_event", jSONObject2);
            } catch (JSONException unused) {
            }
        }
    }
}
